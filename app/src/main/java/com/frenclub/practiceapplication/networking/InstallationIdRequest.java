package com.frenclub.practiceapplication.networking;

import okhttp3.internal.http2.Header;

/**
 * Created by minhazur on 12/24/16.
 */

public class InstallationIdRequest implements ApiRequest {

    private String requestBody;

    public InstallationIdRequest(int deviceType, String osVersion, String deviceId) {
        requestBody = "{\n" +
                "\t\"devicetype\": " + deviceType + ",\n" +
                "\t\"osversion\": \"" + osVersion + "\",\n" +
                "\t\"deviceid\": \"" + deviceId + "\"\n" +
                "}";
    }

    @Override
    public Header getHeader() {
        Header header = new Header("optcode", "installapp");
        return header;
    }

    @Override
    public String getRequestBody() {
        return requestBody;
    }
}
