package io.bitdrift.capture.network.okhttp;

import com.google.gson.Gson;
import io.bitdrift.capture.ApiError;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpApiClient.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b*\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;", "", "Lokhttp3/HttpUrl;", "apiBaseUrl", "", "apiKey", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lcom/google/gson/Gson;)V", "Ljava/io/IOException;", "Lio/bitdrift/capture/ApiError;", "toNetworkError", "(Ljava/io/IOException;)Lio/bitdrift/capture/ApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "toSerializationError", "(Ljava/lang/Exception;)Lio/bitdrift/capture/ApiError;", "Lokhttp3/HttpUrl;", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "Lokhttp3/MediaType;", "jsonContentType", "Lokhttp3/MediaType;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class OkHttpApiClient {
    private final HttpUrl apiBaseUrl;
    private final String apiKey;
    private final OkHttpClient client;
    private final Gson gson;
    private final MediaType jsonContentType;

    public OkHttpApiClient(HttpUrl apiBaseUrl, String apiKey, Gson gson) {
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.apiBaseUrl = apiBaseUrl;
        this.apiKey = apiKey;
        this.gson = gson;
        this.client = new OkHttpClient();
        this.jsonContentType = MediaType.INSTANCE.get("application/json");
    }

    public /* synthetic */ OkHttpApiClient(HttpUrl httpUrl, String str, Gson gson, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, str, (i & 4) != 0 ? new Gson() : gson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiError toNetworkError(IOException iOException) {
        return new ApiError.NetworkError(iOException.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiError toSerializationError(Exception exc) {
        return new ApiError.SerializationError(exc.toString());
    }
}
