package com.frenclub.practiceapplication;

import android.support.test.runner.AndroidJUnit4;

import com.frenclub.practiceapplication.utils.JsonUtils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by minhazur on 12/23/16.
 */

@RunWith(AndroidJUnit4.class)
public class JsonUtilsTest {

    @Test
    public void testJsonDeserialization() {
        Assert.assertNotEquals(JsonUtils.getItems().size(), 0);
    }
}
