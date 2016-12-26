package com.frenclub.practiceapplication.models;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minhazur on 12/23/16.
 */

public class PopularItem {

    @SerializedName("popular")
    List<Item> popularItems;

    public PopularItem() {
        this.popularItems = new ArrayList<Item>();
    }

    public List<Item> getPopularItems() {
        return popularItems;
    }
}
