package com.frenclub.practiceapplication.models;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minhazur on 12/23/16.
 */

public class DataItem {

    @SerializedName("data")
    List<Item> dataItems;

    public DataItem() {
        this.dataItems = new ArrayList<Item>();
    }

    public List<Item> getDataItems() {
        return dataItems;
    }
}
