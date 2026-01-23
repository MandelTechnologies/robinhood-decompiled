package com.salesforce.android.smi.remote.internal.api.rest.interceptors;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.models.p320db.Instrument;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges3;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: CustomHttpLoggingInterceptor.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/CustomHttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor;)V", "setLevel", "level", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "ReadOnlyChain", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CustomHttpLoggingInterceptor implements Interceptor {
    private final HttpLoggingInterceptor httpLoggingInterceptor;

    public CustomHttpLoggingInterceptor(HttpLoggingInterceptor httpLoggingInterceptor) {
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor, "httpLoggingInterceptor");
        this.httpLoggingInterceptor = httpLoggingInterceptor;
    }

    public /* synthetic */ CustomHttpLoggingInterceptor(HttpLoggingInterceptor httpLoggingInterceptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HttpLoggingInterceptor(null, 1, null) : httpLoggingInterceptor);
    }

    public final CustomHttpLoggingInterceptor setLevel(HttpLoggingInterceptor.Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.httpLoggingInterceptor.level(level);
        return this;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        Intrinsics.checkNotNullParameter(chain, "chain");
        ReadOnlyChain readOnlyChain = new ReadOnlyChain(chain);
        this.httpLoggingInterceptor.intercept(readOnlyChain);
        return readOnlyChain.getRealResponse();
    }

    /* compiled from: CustomHttpLoggingInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\b*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\"R\u0017\u0010#\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010&\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/CustomHttpLoggingInterceptor$ReadOnlyChain;", "Lokhttp3/Interceptor$Chain;", "realChain", "<init>", "(Lokhttp3/Interceptor$Chain;)V", "Lokhttp3/RequestBody;", "overrideBody", "(Lokhttp3/RequestBody;)Lokhttp3/RequestBody;", "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;", "", "contentLength", "", "bodyOmittedString", "(J)Ljava/lang/String;", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lokhttp3/Response;", "proceed", "(Lokhttp3/Request;)Lokhttp3/Response;", "Lokhttp3/Call;", "call", "()Lokhttp3/Call;", "Lokhttp3/Connection;", "connection", "()Lokhttp3/Connection;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", Instrument.TYPE_UNIT, "withReadTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "withWriteTimeout", "Lokhttp3/Interceptor$Chain;", "realRequest", "Lokhttp3/Request;", "getRealRequest", "realResponse", "Lokhttp3/Response;", "getRealResponse", "()Lokhttp3/Response;", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ReadOnlyChain implements Interceptor.Chain {
        private final Interceptor.Chain realChain;
        private final Request realRequest;
        private final Response realResponse;

        @Override // okhttp3.Interceptor.Chain
        public Call call() {
            return this.realChain.call();
        }

        @Override // okhttp3.Interceptor.Chain
        public Connection connection() {
            return this.realChain.connection();
        }

        @Override // okhttp3.Interceptor.Chain
        public Interceptor.Chain withReadTimeout(int timeout, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this.realChain.withReadTimeout(timeout, unit);
        }

        @Override // okhttp3.Interceptor.Chain
        public Interceptor.Chain withWriteTimeout(int timeout, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this.realChain.withWriteTimeout(timeout, unit);
        }

        public ReadOnlyChain(Interceptor.Chain realChain) {
            Intrinsics.checkNotNullParameter(realChain, "realChain");
            this.realChain = realChain;
            Request request = realChain.request();
            this.realRequest = request;
            this.realResponse = realChain.proceed(request);
        }

        public final Response getRealResponse() {
            return this.realResponse;
        }

        @Override // okhttp3.Interceptor.Chain
        public Request request() {
            return this.realRequest.newBuilder().method(this.realRequest.getMethod(), overrideBody(this.realRequest.getBody())).build();
        }

        @Override // okhttp3.Interceptor.Chain
        public Response proceed(Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return this.realResponse.newBuilder().body(overrideBody(this.realResponse.getBody())).build();
        }

        private final RequestBody overrideBody(RequestBody requestBody) {
            Long lValueOf = requestBody != null ? Long.valueOf(requestBody.contentLength()) : null;
            return (lValueOf == null || new PrimitiveRanges3(0L, 4000L).contains(lValueOf.longValue())) ? requestBody : RequestBody.Companion.create$default(RequestBody.INSTANCE, bodyOmittedString(requestBody.contentLength()), (MediaType) null, 1, (Object) null);
        }

        private final ResponseBody overrideBody(ResponseBody responseBody) {
            Long lValueOf = responseBody != null ? Long.valueOf(responseBody.getContentLength()) : null;
            if (lValueOf == null) {
                return ResponseBody.Companion.create$default(ResponseBody.INSTANCE, "Empty body", (MediaType) null, 1, (Object) null);
            }
            return new PrimitiveRanges3(0L, 4000L).contains(lValueOf.longValue()) ? responseBody : ResponseBody.Companion.create$default(ResponseBody.INSTANCE, bodyOmittedString(responseBody.getContentLength()), (MediaType) null, 1, (Object) null);
        }

        private final String bodyOmittedString(long contentLength) {
            return "Body omitted due to (Content-Length: " + contentLength + ")";
        }
    }
}
