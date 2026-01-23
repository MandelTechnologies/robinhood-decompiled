package com.robinhood.analytics.interceptor;

import com.robinhood.analytics.HttpCallLogger;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.HttpCall;
import com.robinhood.rosetta.eventlogging.HttpCallData;
import com.robinhood.rosetta.eventlogging.HttpCallMeasurements;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: HttpCallEventInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/analytics/interceptor/HttpCallEventInterceptor;", "Lokhttp3/Interceptor;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/HttpCallLogger;", "httpCallLogger", "<init>", "(Lj$/time/Clock;Lcom/robinhood/analytics/HttpCallLogger;)V", "Lokhttp3/Interceptor$Chain;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lj$/time/Clock;", "Lcom/robinhood/analytics/HttpCallLogger;", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class HttpCallEventInterceptor implements Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, HttpCall.Method> methods;
    private final Clock clock;
    private final HttpCallLogger httpCallLogger;

    public HttpCallEventInterceptor(Clock clock, HttpCallLogger httpCallLogger) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(httpCallLogger, "httpCallLogger");
        this.clock = clock;
        this.httpCallLogger = httpCallLogger;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        Exception exc;
        Response responseProceed;
        HttpCall.Outcome outcome;
        Request request;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Instant instant = this.clock.instant();
        Request request2 = chain.request();
        try {
            responseProceed = chain.proceed(request2);
            exc = null;
        } catch (Exception e) {
            exc = e;
            responseProceed = null;
        }
        Instant instant2 = this.clock.instant();
        if (this.httpCallLogger.getIsSingleCallEventLoggingEnabled()) {
            long millis = Duration.between(instant, instant2).toMillis();
            if (responseProceed != null && (request = responseProceed.getRequest()) != null) {
                request2 = request;
            }
            if (responseProceed != null) {
                outcome = HttpCall.Outcome.COMPLETED;
            } else {
                IOException iOException = exc instanceof IOException ? (IOException) exc : null;
                if (Intrinsics.areEqual(iOException != null ? iOException.getMessage() : null, "Canceled")) {
                    outcome = HttpCall.Outcome.CANCELED;
                } else if (exc != null) {
                    outcome = HttpCall.Outcome.FAILED;
                } else {
                    outcome = HttpCall.Outcome.OUTCOME_UNSPECIFIED;
                }
            }
            HttpCallData httpCallData = new HttpCallData(new HttpCall(outcome, INSTANCE.toRosettaRequest(request2), responseProceed != null ? INSTANCE.toRosettaResponse(responseProceed) : null, exc != null ? INSTANCE.toRosettaError(exc) : null, null, 16, null), new HttpCallMeasurements(millis, millis, null, 4, null), null, 4, null);
            HttpCallLogger httpCallLogger = this.httpCallLogger;
            Intrinsics.checkNotNull(instant);
            httpCallLogger.log(instant, httpCallData);
        }
        if (exc != null) {
            throw exc;
        }
        Intrinsics.checkNotNull(responseProceed);
        return responseProceed;
    }

    /* compiled from: HttpCallEventInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002J\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0002J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u0013*\u00060\u0014j\u0002`\u0015H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/analytics/interceptor/HttpCallEventInterceptor$Companion;", "", "<init>", "()V", "methods", "", "", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "toHttpCallMethod", "toRosettaRequest", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Request;", "Lokhttp3/Request;", "toRosettaProtocol", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "Lokhttp3/Protocol;", "toRosettaResponse", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response;", "Lokhttp3/Response;", "toRosettaError", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: HttpCallEventInterceptor.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Protocol.values().length];
                try {
                    iArr[Protocol.HTTP_1_0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Protocol.HTTP_1_1.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Protocol.HTTP_2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Protocol.QUIC.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final HttpCall.Method toHttpCallMethod(String str) {
            HttpCall.Method method = (HttpCall.Method) HttpCallEventInterceptor.methods.get(str);
            return method == null ? HttpCall.Method.METHOD_UNSPECIFIED : method;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HttpCall.Request toRosettaRequest(Request request) {
            return new HttpCall.Request(toHttpCallMethod(request.getMethod()), request.getUrl().getUrl(), null, 4, null);
        }

        private final HttpCall.Protocol toRosettaProtocol(Protocol protocol) {
            int i = WhenMappings.$EnumSwitchMapping$0[protocol.ordinal()];
            if (i == 1) {
                return HttpCall.Protocol.HTTP_1_0;
            }
            if (i == 2) {
                return HttpCall.Protocol.HTTP_1_1;
            }
            if (i == 3) {
                return HttpCall.Protocol.HTTP_2;
            }
            if (i == 4) {
                return HttpCall.Protocol.H2_PRIOR_KNOWLEDGE;
            }
            if (i == 5) {
                return HttpCall.Protocol.QUIC;
            }
            return HttpCall.Protocol.PROTOCOL_UNSPECIFIED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HttpCall.Response toRosettaResponse(Response response) {
            HttpCall.Response.Source source;
            if (response.getNetworkResponse() == null) {
                if (response.getCacheResponse() == null) {
                    source = HttpCall.Response.Source.SOURCE_UNSPECIFIED;
                } else {
                    source = HttpCall.Response.Source.CACHE_ONLY;
                }
            } else if (response.getCacheResponse() == null) {
                source = HttpCall.Response.Source.NETWORK_ONLY;
            } else {
                source = HttpCall.Response.Source.CACHE_AND_NETWORK;
            }
            return new HttpCall.Response(source, toRosettaProtocol(response.getProtocol()), response.getMessage(), response.getCode(), null, 16, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HttpCall.Error toRosettaError(Exception exc) {
            HttpCall.Error.Type type2;
            if (exc instanceof UnknownHostException) {
                type2 = HttpCall.Error.Type.UNKNOWN_HOST;
            } else if (exc instanceof SocketTimeoutException) {
                type2 = HttpCall.Error.Type.GENERAL_TIMEOUT;
            } else if (exc instanceof ConnectException) {
                type2 = HttpCall.Error.Type.CONNECT_FAILURE;
            } else if (exc instanceof NoRouteToHostException) {
                type2 = HttpCall.Error.Type.NO_ROUTE_TO_HOST;
            } else {
                type2 = exc instanceof IOException ? HttpCall.Error.Type.GENERAL_IO : HttpCall.Error.Type.TYPE_UNSPECIFIED;
            }
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            return new HttpCall.Error(type2, message, null, 4, null);
        }
    }

    static {
        HttpCall.Method[] methodArrValues = HttpCall.Method.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(methodArrValues.length), 16));
        for (HttpCall.Method method : methodArrValues) {
            linkedHashMap.put(method.name(), method);
        }
        methods = linkedHashMap;
    }
}
