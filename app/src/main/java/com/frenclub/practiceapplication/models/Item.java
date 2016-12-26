package com.frenclub.practiceapplication.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by minhazur on 12/26/16.
 */

public class Item {
    @SerializedName("image")
    protected String imagePath;
    protected String name;
    @SerializedName("name_image")
    protected String nameImagePath;
    protected int count;
    @SerializedName("type")
    protected String mediaType;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameImagePath() {
        return nameImagePath;
    }

    public void setNameImagePath(String nameImagePath) {
        this.nameImagePath = nameImagePath;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
}
