package com.frenclub.practiceapplication.networking;

import okhttp3.internal.http2.Header;

/**
 * Created by minhazur on 12/24/16.
 */

public interface ApiRequest {
    Header getHeader();
    String getRequestBody();

}
