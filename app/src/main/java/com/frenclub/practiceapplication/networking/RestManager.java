package com.frenclub.practiceapplication.networking;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by minhazur on 12/24/16.
 */

public class RestManager {
    static String CONNECTION_STAGING = "http://logic-poll-api-test.ggdev.xyz/dummy.php";

    public  static void requestForItems(final DataFetchedListener dataFetchedListener) {
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");

        Request request = new Request.Builder()
                .url(CONNECTION_STAGING)
                .build();

        OkHttpClient client = new OkHttpClient();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                dataFetchedListener.dataFetched("{}");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                dataFetchedListener.dataFetched(response.body().string());
            }
        });
    }

    public static void requestForAppInstallationId(InstallationIdRequest installationIdRequest) {
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");

        Log.d("===>", installationIdRequest.getRequestBody());


        RequestBody requestBody = RequestBody.create(JSON, installationIdRequest.getRequestBody());
        Request request = new Request.Builder()
                .url(CONNECTION_STAGING)
                .header("optcode", "installapp")
                .post(requestBody)
                .build();

        OkHttpClient client = new OkHttpClient();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d("REST", response.body().string());
            }
        });
    }
}
