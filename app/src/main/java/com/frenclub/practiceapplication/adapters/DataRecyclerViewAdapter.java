package com.frenclub.practiceapplication.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.frenclub.practiceapplication.R;
import com.frenclub.practiceapplication.models.Item;
import com.frenclub.practiceapplication.utils.ImageUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minhazur on 12/26/16.
 */

public class DataRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Item> dataItems = new ArrayList<>();

    public void setDataItems(List<Item> dataItems) {
        this.dataItems = dataItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View inflatedView = layoutInflater.inflate(R.layout.item_data_recycler_view, null);
        inflatedView.setPadding(5, 5, 5, 5);

        return new DataItemViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final Item aDataItem = dataItems.get(position);

        DataItemViewHolder popularItemViewHolder = (DataItemViewHolder) holder;

        popularItemViewHolder.titleTextView.setText(aDataItem.getName());
        popularItemViewHolder.nameTextView.setText(aDataItem.getName());

        ImageUtils.loadImage(aDataItem.getNameImagePath(), popularItemViewHolder.userImageView);
        ImageUtils.loadImage(aDataItem.getImagePath(), popularItemViewHolder.dataImageView);
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }

    static class DataItemViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        ImageView dataImageView;
        ImageView userImageView;
        TextView titleTextView;

        public DataItemViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.name_tex_view);
            titleTextView = (TextView) itemView.findViewById(R.id.title_text_view);
            dataImageView = (ImageView) itemView.findViewById(R.id.data_image_view);
            userImageView = (ImageView) itemView.findViewById(R.id.name_image_view);
        }
    }
}
