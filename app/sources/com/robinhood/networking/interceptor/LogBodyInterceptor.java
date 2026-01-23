package com.robinhood.networking.interceptor;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.utils.http.Headers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import timber.log.Timber;

/* compiled from: LogBodyInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/networking/interceptor/LogBodyInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "delegate", "Lokhttp3/logging/HttpLoggingInterceptor;", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LogBodyInterceptor implements Interceptor {
    private final HttpLoggingInterceptor delegate;

    public LogBodyInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: com.robinhood.networking.interceptor.LogBodyInterceptor$delegate$1
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                Timber.INSTANCE.mo3356i(message, new Object[0]);
            }
        });
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        httpLoggingInterceptor.redactHeader("Authorization");
        httpLoggingInterceptor.redactHeader(Headers.USER_AGENT);
        this.delegate = httpLoggingInterceptor;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.request().header(Headers.LOG_FULL_REQUEST) != null ? this.delegate.intercept(chain) : chain.proceed(chain.request());
    }
}
