package com.salesforce.android.smi.remote.internal.api.rest.interceptors;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.remote.internal.api.FibonacciBackoff;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: RetryInterceptor.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor;", "Lokhttp3/Interceptor;", "maxRetry", "", "retryCeiling", "<init>", "(II)V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "shouldRetry", "", "response", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RetryInterceptor implements Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = RetryInterceptor.class.getName();
    private final Logger logger;
    private final int maxRetry;
    private final int retryCeiling;

    /* JADX WARN: Illegal instructions before constructor call */
    public RetryInterceptor() {
        int i = 0;
        this(i, i, 3, null);
    }

    public RetryInterceptor(int i, int i2) {
        this.maxRetry = i;
        this.retryCeiling = i2;
        this.logger = Logger.getLogger(TAG);
    }

    public /* synthetic */ RetryInterceptor(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? 5 : i2);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        Response responseProceed;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Call call = chain.call();
        Request request = chain.request();
        try {
            responseProceed = chain.proceed(request);
            e = null;
        } catch (IOException e) {
            e = e;
            this.logger.log(Level.WARNING, "Request failed: " + e.getMessage());
            responseProceed = null;
        }
        FibonacciBackoff fibonacciBackoff = new FibonacciBackoff(this.maxRetry, this.retryCeiling);
        while (!call.getCanceled() && shouldRetry(responseProceed) && fibonacciBackoff.shouldRetry()) {
            int iIncrement = fibonacciBackoff.increment();
            long jCurrentBackoff = fibonacciBackoff.currentBackoff();
            this.logger.log(Level.INFO, "Retrying request [" + iIncrement + "] after [" + jCurrentBackoff + "]ms: " + request.getUrl());
            INSTANCE.applyBackoff(jCurrentBackoff);
            if (responseProceed != null) {
                try {
                    responseProceed.close();
                } catch (IOException e2) {
                    e = e2;
                    this.logger.log(Level.WARNING, "Request retry failed: " + e.getMessage());
                    responseProceed = null;
                }
            }
            responseProceed = chain.proceed(request);
            e = null;
        }
        if (responseProceed != null) {
            return responseProceed;
        }
        if (e != null) {
            throw e;
        }
        throw new Exception("Unknown exception");
    }

    private final boolean shouldRetry(Response response) {
        if (response == null) {
            return false;
        }
        int code = response.getCode();
        boolean z = code >= 500;
        this.logger.log(Level.INFO, "Should retry:" + z + ". code:" + code);
        return z;
    }

    /* compiled from: RetryInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0018\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor;", "maxRetry", "", "retryCeiling", "applyBackoff", "", "backoff", "", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ RetryInterceptor create$default(Companion companion, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 5;
            }
            if ((i3 & 2) != 0) {
                i2 = 5;
            }
            return companion.create(i, i2);
        }

        public final RetryInterceptor create(int maxRetry, int retryCeiling) {
            return new RetryInterceptor(maxRetry, retryCeiling);
        }

        public final void applyBackoff(long backoff) throws InterruptedException {
            BuildersKt__BuildersKt.runBlocking$default(null, new RetryInterceptor2(backoff, null), 1, null);
        }
    }
}
