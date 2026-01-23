package com.robinhood.analytics;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.rosetta.eventlogging.HttpCallData;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: HttpCallLogger.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/analytics/HttpCallLogger;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ldagger/Lazy;", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ldagger/Lazy;Lcom/robinhood/experiments/ExperimentsProvider;)V", "j$/time/Instant", "timestamp", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", WebsocketGatewayConstants.DATA_KEY, "", "log", "(Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/HttpCallData;)V", "Ldagger/Lazy;", "", "value", "isSingleCallEventLoggingEnabled", "Z", "()Z", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class HttpCallLogger {
    private final Lazy<EventLogger> eventLogger;
    private volatile boolean isSingleCallEventLoggingEnabled;

    public HttpCallLogger(@RootCoroutineScope CoroutineScope coroutineScope, Lazy<EventLogger> eventLogger, ExperimentsProvider experimentsProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.eventLogger = eventLogger;
        ScopedSubscriptionKt.subscribeIn(ExperimentsProvider.DefaultImpls.streamState$default(experimentsProvider, new Experiment[]{Experiment.SINGLE_HTTP_CALL_EVENT_LOGGING.INSTANCE}, false, null, 6, null), coroutineScope, new Function1() { // from class: com.robinhood.analytics.HttpCallLogger$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HttpCallLogger._init_$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* renamed from: isSingleCallEventLoggingEnabled, reason: from getter */
    public final boolean getIsSingleCallEventLoggingEnabled() {
        return this.isSingleCallEventLoggingEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(HttpCallLogger httpCallLogger, boolean z) {
        httpCallLogger.isSingleCallEventLoggingEnabled = z;
        return Unit.INSTANCE;
    }

    public final void log(Instant timestamp, HttpCallData data) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.isSingleCallEventLoggingEnabled) {
            this.eventLogger.get().logHttpCall(timestamp, data);
        }
    }
}
