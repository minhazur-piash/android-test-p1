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

public class PopularRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Item> popularItems = new ArrayList<>();

    public void setPopularItems(List<Item> popularItems) {
        this.popularItems = popularItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View inflatedView = layoutInflater.inflate(R.layout.item_popular_recycler_view, null);

        int widht = parent.getMeasuredWidth() / 4;
        inflatedView.setMinimumWidth(widht);

        return new PopularItemViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final Item aPopularItem = popularItems.get(position);

        PopularItemViewHolder popularItemViewHolder = (PopularItemViewHolder) holder;

        popularItemViewHolder.nameTextView.setText(aPopularItem.getName());

        popularItemViewHolder.count1TextView.setText(aPopularItem.getCount() + "");

        popularItemViewHolder.count2TextView.setText(aPopularItem.getCount() + "");
        popularItemViewHolder.count2TitleTextView.setText(aPopularItem.getMediaType());

        ImageUtils.loadImage(aPopularItem.getImagePath(), popularItemViewHolder.popularImageView);
    }

    @Override
    public int getItemCount() {
        return popularItems.size();
    }

    static class PopularItemViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        ImageView popularImageView;
        TextView count1TextView;
        TextView count2TextView;
        TextView count2TitleTextView;

        public PopularItemViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.name_tex_view);
            count1TextView = (TextView) itemView.findViewById(R.id.count_text_view);
            count2TextView = (TextView) itemView.findViewById(R.id.count2_text_view);
            count2TitleTextView = (TextView) itemView.findViewById(R.id.count2_title_text_view);
            popularImageView = (ImageView) itemView.findViewById(R.id.popular_image_view);
        }
    }
}
