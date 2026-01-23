package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes16.dex */
public class BasicNetwork implements Network {
    private final BaseHttpStack mBaseHttpStack;

    @Deprecated
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    public BasicNetwork(BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new ByteArrayPool(4096));
    }

    public BasicNetwork(BaseHttpStack baseHttpStack, ByteArrayPool byteArrayPool) {
        this.mBaseHttpStack = baseHttpStack;
        this.mHttpStack = baseHttpStack;
        this.mPool = byteArrayPool;
    }

    @Override // com.android.volley.Network
    public NetworkResponse performRequest(Request<?> request) throws Throwable {
        IOException iOException;
        HttpResponse httpResponse;
        byte[] bArr;
        Request<?> request2;
        byte[] bArrInputStreamToBytes;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                HttpResponse httpResponseExecuteRequest = this.mBaseHttpStack.executeRequest(request, HttpHeaderParser.getCacheHeaders(request.getCacheEntry()));
                try {
                    int statusCode = httpResponseExecuteRequest.getStatusCode();
                    List<Header> headers = httpResponseExecuteRequest.getHeaders();
                    if (statusCode == 304) {
                        return NetworkUtility.getNotModifiedNetworkResponse(request, SystemClock.elapsedRealtime() - jElapsedRealtime, headers);
                    }
                    InputStream content = httpResponseExecuteRequest.getContent();
                    if (content != null) {
                        bArrInputStreamToBytes = NetworkUtility.inputStreamToBytes(content, httpResponseExecuteRequest.getContentLength(), this.mPool);
                    } else {
                        bArrInputStreamToBytes = new byte[0];
                    }
                    byte[] bArr2 = bArrInputStreamToBytes;
                    try {
                        NetworkUtility.logSlowRequests(SystemClock.elapsedRealtime() - jElapsedRealtime, request, bArr2, statusCode);
                        if (statusCode < 200 || statusCode > 299) {
                            throw new IOException();
                        }
                        return new NetworkResponse(statusCode, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, headers);
                    } catch (IOException e) {
                        e = e;
                        request2 = request;
                        httpResponse = httpResponseExecuteRequest;
                        bArr = bArr2;
                        iOException = e;
                        NetworkUtility.attemptRetryOnException(request2, NetworkUtility.shouldRetryException(request2, iOException, jElapsedRealtime, httpResponse, bArr));
                        request = request2;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                    httpResponse = httpResponseExecuteRequest;
                    request2 = request;
                }
            } catch (IOException e3) {
                iOException = e3;
                httpResponse = null;
                bArr = null;
                request2 = request;
            }
            NetworkUtility.attemptRetryOnException(request2, NetworkUtility.shouldRetryException(request2, iOException, jElapsedRealtime, httpResponse, bArr));
            request = request2;
        }
    }
}
