package com.frenclub.practiceapplication.utils;

import android.widget.ImageView;

import com.frenclub.practiceapplication.R;
import com.squareup.picasso.Picasso;

/**
 * Created by minhazur on 12/26/16.
 */

public class ImageUtils {

    public static void loadImage(String imagePath, ImageView imageView) {
        Picasso.with(imageView.getContext())
                .load(imagePath)
                .placeholder(R.drawable.shadow_overlay)
                .into(imageView);
    }
}
