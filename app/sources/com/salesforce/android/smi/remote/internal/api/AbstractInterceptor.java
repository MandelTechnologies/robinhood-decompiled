package com.salesforce.android.smi.remote.internal.api;

import com.robinhood.android.common.util.TransitionReason;
import com.salesforce.android.smi.common.api.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.HttpException;

/* compiled from: AbstractInterceptor.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\r\u001a\u00020\u00052\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0004¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/AbstractInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "interceptAllowedEndpoints", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "shouldIntercept", "", "request", "Lokhttp3/Request;", "intercept", "createSynthetic400Response", "result", "Lcom/salesforce/android/smi/common/api/Result;", "originalRequest", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class AbstractInterceptor implements Interceptor {
    public boolean shouldIntercept(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return false;
    }

    public Response interceptAllowedEndpoints(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request());
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        if (!shouldIntercept(request)) {
            return chain.proceed(request);
        }
        return interceptAllowedEndpoints(chain);
    }

    protected final Response createSynthetic400Response(Result<?> result, Request originalRequest) {
        String strMessage;
        Protocol protocol;
        ResponseBody responseBodyCreate$default;
        retrofit2.Response<?> response;
        retrofit2.Response<?> response2;
        Response responseRaw;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Result.Error error = result instanceof Result.Error ? (Result.Error) result : null;
        Exception exception = error != null ? error.getException() : null;
        HttpException httpException = exception instanceof HttpException ? (HttpException) exception : null;
        int iCode = httpException != null ? httpException.code() : 400;
        if (httpException == null || (strMessage = httpException.message()) == null) {
            strMessage = "Unknown error occurred";
        }
        if (httpException == null || (response2 = httpException.response()) == null || (responseRaw = response2.raw()) == null || (protocol = responseRaw.getProtocol()) == null) {
            protocol = Protocol.HTTP_1_1;
        }
        if (httpException == null || (response = httpException.response()) == null || (responseBodyCreate$default = response.errorBody()) == null) {
            responseBodyCreate$default = ResponseBody.Companion.create$default(ResponseBody.INSTANCE, strMessage, (MediaType) null, 1, (Object) null);
        }
        return new Response.Builder().request(originalRequest).code(iCode).message(strMessage).body(responseBodyCreate$default).protocol(protocol).build();
    }
}
