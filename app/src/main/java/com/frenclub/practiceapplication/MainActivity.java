package com.frenclub.practiceapplication;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.frenclub.practiceapplication.adapters.DataRecyclerViewAdapter;
import com.frenclub.practiceapplication.adapters.PopularRecyclerViewAdapter;
import com.frenclub.practiceapplication.networking.DataFetchedListener;
import com.frenclub.practiceapplication.networking.RestManager;
import com.frenclub.practiceapplication.utils.JsonUtils;

public class MainActivity extends AppCompatActivity implements DataFetchedListener {

    private static String TAG = MainActivity.class.getName();
    DataRecyclerViewAdapter dataRecyclerViewAdapter;
    PopularRecyclerViewAdapter popularRecyclerViewAdapter;

    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchBackgroundData();

        customizeActionbarTitle();

        populatePopularRecyclerView();

        populateDataRecyclerView();
    }

    private void fetchBackgroundData() {
        showProgress();
        RestManager.requestForItems(this);
    }

    private void showProgress() {
        progress= new ProgressDialog(this);
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setMessage("Loading. Please wait...");
        progress.setIndeterminate(true);
        progress.setCanceledOnTouchOutside(false);
        progress.show();
    }

    private void populateDataRecyclerView() {
        dataRecyclerViewAdapter = new DataRecyclerViewAdapter();

        RecyclerView informationRecyclerView = (RecyclerView) findViewById(R.id.information_recycler_view);
        informationRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        informationRecyclerView.setHasFixedSize(true);
        informationRecyclerView.addItemDecoration(new EqualSpaceItemDecoration(10));
        informationRecyclerView.setAdapter(dataRecyclerViewAdapter);
    }

    private void populatePopularRecyclerView() {
        popularRecyclerViewAdapter = new PopularRecyclerViewAdapter();

        RecyclerView popularRecyclerView = (RecyclerView) findViewById(R.id.popular_item_recycler_view);
        popularRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        popularRecyclerView.setHasFixedSize(true);
        popularRecyclerView.addItemDecoration(new EqualSpaceItemDecoration(12));
        popularRecyclerView.setAdapter(popularRecyclerViewAdapter);
    }

    private void customizeActionbarTitle() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.app_bar);
    }



    @Override
    public void dataFetched(String data) {
        hideProgress();

        popularRecyclerViewAdapter.setPopularItems(JsonUtils.getPopularItems(data));
        popularRecyclerViewAdapter.notifyDataSetChanged();

        dataRecyclerViewAdapter.setDataItems(JsonUtils.getDataItems(data));
        dataRecyclerViewAdapter.notifyDataSetChanged();
    }

    private void hideProgress() {
        progress.dismiss();
    }


}
