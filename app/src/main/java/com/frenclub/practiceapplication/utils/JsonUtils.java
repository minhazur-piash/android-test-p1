package com.frenclub.practiceapplication.utils;


import com.frenclub.practiceapplication.models.DataItem;
import com.frenclub.practiceapplication.models.Item;
import com.frenclub.practiceapplication.models.PopularItem;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by minhazur on 12/23/16.
 */

public class JsonUtils {


    public static List<Item> getPopularItems(String jsonData){
        Gson gson = new GsonBuilder().create();
        PopularItem popularItem = gson.fromJson(jsonData, PopularItem.class);
        return popularItem.getPopularItems();
    }

    public static List<Item> getDataItems(String jsonData){
        Gson gson = new GsonBuilder().create();
        DataItem dataItem = gson.fromJson(jsonData, DataItem.class);
        return dataItem.getDataItems();
    }







    private static String itemJson = "{\n" +
            "  \"popular\": [\n" +
            "    {\n" +
            "      \"image\": \"http://lorempixel.com/400/200/\",\n" +
            "      \"name\": \"Mahfuz Rahman\",\n" +
            "      \"name_image\": \"http://lorempixel.com/300/100/\",\n" +
            "      \"count\": 2,\n" +
            "      \"type\": \"audio\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"image\": \"http://lorempixel.com/400/200/\",\n" +
            "      \"name\": \"Rinku Arnob\",\n" +
            "      \"name_image\": \"http://lorempixel.com/300/100/\",\n" +
            "      \"count\": 4,\n" +
            "      \"type\": \"image\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"image\": \"http://lorempixel.com/400/200/\",\n" +
            "      \"name\": \"Kauser Sarker\",\n" +
            "      \"name_image\": \"http://lorempixel.com/300/100/\",\n" +
            "      \"count\": 6,\n" +
            "      \"type\": \"image\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"image\": \"http://lorempixel.com/400/200/\",\n" +
            "      \"name\": \"Shariful Islam\",\n" +
            "      \"name_image\": \"http://lorempixel.com/300/100/\",\n" +
            "      \"count\": 8,\n" +
            "      \"type\": \"video\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"image\": \"http://lorempixel.com/400/200/\",\n" +
            "      \"name\": \"Kauser Sarker\",\n" +
            "      \"name_image\": \"http://lorempixel.com/300/100/\",\n" +
            "      \"count\": 6,\n" +
            "      \"type\": \"image\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"image\": \"http://lorempixel.com/400/200/\",\n" +
            "      \"name\": \"Shariful Islam\",\n" +
            "      \"name_image\": \"http://lorempixel.com/300/100/\",\n" +
            "      \"count\": 8,\n" +
            "      \"type\": \"video\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"image\": \"http://lorempixel.com/400/200/\",\n" +
            "      \"name\": \"Mahfuz Rahman\",\n" +
            "      \"name_image\": \"http://lorempixel.com/300/100/\",\n" +
            "      \"count\": 2,\n" +
            "      \"type\": \"audio\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"image\": \"http://lorempixel.com/400/200/\",\n" +
            "      \"name\": \"Rinku Arnob\",\n" +
            "      \"name_image\": \"http://lorempixel.com/300/100/\",\n" +
            "      \"count\": 4,\n" +
            "      \"type\": \"image\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"status\": 2000,\n" +
            "  \"paginator\": {\n" +
            "    \"total\": 1,\n" +
            "    \"per_page\": 10,\n" +
            "    \"limit\": 5\n" +
            "  }\n" +
            "}";


    private static String jsonString = "{\n" +
            "\t\"header\": \"SVG Viewer\",\n" +
            "\t\"items\": [{\n" +
            "\t\t\t\"id\": \"Open\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"OpenNew\",\n" +
            "\t\t\t\"label\": \"Open New\"\n" +
            "\t\t},\n" +
            "\t\tnull, {\n" +
            "\t\t\t\"id\": \"ZoomIn\",\n" +
            "\t\t\t\"label\": \"Zoom In\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"ZoomOut\",\n" +
            "\t\t\t\"label\": \"Zoom Out\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"OriginalView\",\n" +
            "\t\t\t\"label\": \"Original View\"\n" +
            "\t\t},\n" +
            "\t\tnull, {\n" +
            "\t\t\t\"id\": \"Quality\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"Pause\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"Mute\"\n" +
            "\t\t},\n" +
            "\t\tnull, {\n" +
            "\t\t\t\"id\": \"Find\",\n" +
            "\t\t\t\"label\": \"Find...\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"FindAgain\",\n" +
            "\t\t\t\"label\": \"Find Again\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"Copy\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"CopyAgain\",\n" +
            "\t\t\t\"label\": \"Copy Again\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"CopySVG\",\n" +
            "\t\t\t\"label\": \"Copy SVG\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"ViewSVG\",\n" +
            "\t\t\t\"label\": \"View SVG\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"ViewSource\",\n" +
            "\t\t\t\"label\": \"View Source\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"SaveAs\",\n" +
            "\t\t\t\"label\": \"Save As\"\n" +
            "\t\t},\n" +
            "\t\tnull, {\n" +
            "\t\t\t\"id\": \"Help\"\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": \"About\",\n" +
            "\t\t\t\"label\": \"About Adobe CVG Viewer...\"\n" +
            "\t\t}\n" +
            "\t]\n" +
            "\n" +
            "}";
}
