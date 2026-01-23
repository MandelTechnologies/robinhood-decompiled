package com.robinhood.networking.interceptor;

import com.robinhood.android.common.util.TransitionReason;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: TimeoutOverrideInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/networking/interceptor/TimeoutOverrideInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TimeoutOverrideInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Integer intOrNull;
        Integer intOrNull2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String strHeader = request.header("X-Read-Timeout-Seconds-Override");
        if (strHeader != null && (intOrNull2 = StringsKt.toIntOrNull(strHeader)) != null) {
            chain = chain.withReadTimeout(intOrNull2.intValue(), TimeUnit.SECONDS);
        }
        String strHeader2 = request.header("X-Write-Timeout-Seconds-Override");
        if (strHeader2 != null && (intOrNull = StringsKt.toIntOrNull(strHeader2)) != null) {
            chain = chain.withWriteTimeout(intOrNull.intValue(), TimeUnit.SECONDS);
        }
        return chain.proceed(request);
    }
}
