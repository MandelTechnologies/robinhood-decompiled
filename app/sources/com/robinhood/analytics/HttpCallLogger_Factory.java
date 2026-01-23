package com.robinhood.analytics;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.experiments.ExperimentsProvider;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HttpCallLogger_Factory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/analytics/HttpCallLogger_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/HttpCallLogger;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "Lkotlin/jvm/JvmSuppressWildcards;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class HttpCallLogger_Factory implements Factory<HttpCallLogger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsProvider> experimentsProvider;

    @JvmStatic
    public static final HttpCallLogger_Factory create(Provider<CoroutineScope> provider, Provider<EventLogger> provider2, Provider<ExperimentsProvider> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final HttpCallLogger newInstance(CoroutineScope coroutineScope, Lazy<EventLogger> lazy, ExperimentsProvider experimentsProvider) {
        return INSTANCE.newInstance(coroutineScope, lazy, experimentsProvider);
    }

    public HttpCallLogger_Factory(Provider<CoroutineScope> coroutineScope, Provider<EventLogger> eventLogger, Provider<ExperimentsProvider> experimentsProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.coroutineScope = coroutineScope;
        this.eventLogger = eventLogger;
        this.experimentsProvider = experimentsProvider;
    }

    @Override // javax.inject.Provider
    public HttpCallLogger get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        Lazy<EventLogger> lazy = DoubleCheck.lazy(this.eventLogger);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        return companion.newInstance(coroutineScope, lazy, experimentsProvider);
    }

    /* compiled from: HttpCallLogger_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0007J+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00102\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/analytics/HttpCallLogger_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/analytics/HttpCallLogger_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "Lkotlin/jvm/JvmSuppressWildcards;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "newInstance", "Lcom/robinhood/analytics/HttpCallLogger;", "Ldagger/Lazy;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HttpCallLogger_Factory create(Provider<CoroutineScope> coroutineScope, Provider<EventLogger> eventLogger, Provider<ExperimentsProvider> experimentsProvider) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            return new HttpCallLogger_Factory(coroutineScope, eventLogger, experimentsProvider);
        }

        @JvmStatic
        public final HttpCallLogger newInstance(CoroutineScope coroutineScope, Lazy<EventLogger> eventLogger, ExperimentsProvider experimentsProvider) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            return new HttpCallLogger(coroutineScope, eventLogger, experimentsProvider);
        }
    }
}
