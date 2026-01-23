package com.squareup.wire;

import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: GrpcResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nJ\u001c\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nJ\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/squareup/wire/GrpcResponse;", "", "response", "Lokhttp3/Response;", "<init>", "(Lokhttp3/Response;)V", CarResultComposable2.BODY, "Lokhttp3/ResponseBody;", "()Lokhttp3/ResponseBody;", "header", "", "name", "defaultValue", "trailers", "Lokhttp3/Headers;", "Lcom/squareup/wire/GrpcHeaders;", "close", "", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class GrpcResponse {
    private final Response response;

    public GrpcResponse(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.response = response;
    }

    @JvmName
    public final ResponseBody body() {
        return this.response.getBody();
    }

    public final String header(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return header(name, null);
    }

    public static /* synthetic */ String header$default(GrpcResponse grpcResponse, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return grpcResponse.header(str, str2);
    }

    public final String header(String name, String defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.response.header(name, defaultValue);
    }

    public final Headers trailers() throws IOException {
        return this.response.trailers();
    }

    public final void close() throws IOException {
        this.response.close();
    }
}
