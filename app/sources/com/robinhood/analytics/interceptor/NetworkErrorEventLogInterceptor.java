package com.robinhood.analytics.interceptor;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.rosetta.eventlogging.NetworkErrorData;
import dagger.Lazy;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: NetworkErrorEventLogInterceptor.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/analytics/interceptor/NetworkErrorEventLogInterceptor;", "Lokhttp3/Interceptor;", "eventLogger", "Ldagger/Lazy;", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ldagger/Lazy;)V", "getEventLogger", "()Ldagger/Lazy;", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "convertMethod", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "method", "", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class NetworkErrorEventLogInterceptor implements Interceptor {
    private final Lazy<EventLogger> eventLogger;

    public NetworkErrorEventLogInterceptor(Lazy<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public final Lazy<EventLogger> getEventLogger() {
        return this.eventLogger;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (!responseProceed.isSuccessful()) {
            EventLogger.DefaultImpls.logNetworkError$default(this.eventLogger.get(), convertMethod(request.getMethod()), request.getUrl().getUrl(), responseProceed.getCode(), null, 8, null);
        }
        return responseProceed;
    }

    private final NetworkErrorData.Method convertMethod(String method) {
        NetworkErrorData.Method method2;
        NetworkErrorData.Method[] methodArrValues = NetworkErrorData.Method.values();
        int length = methodArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methodArrValues[i];
            if (StringsKt.equals(method2.name(), method, true)) {
                break;
            }
            i++;
        }
        return method2 == null ? NetworkErrorData.Method.METHOD_UNSPECIFIED : method2;
    }
}
