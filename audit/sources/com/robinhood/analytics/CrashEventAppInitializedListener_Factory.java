package com.robinhood.analytics;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.sentry.CrashStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CrashEventAppInitializedListener_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/analytics/CrashEventAppInitializedListener_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/CrashEventAppInitializedListener;", "rootCoroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "crashStore", "Lcom/robinhood/android/sentry/CrashStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class CrashEventAppInitializedListener_Factory implements Factory<CrashEventAppInitializedListener> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CrashStore> crashStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<CoroutineScope> rootCoroutineScope;

    @JvmStatic
    public static final CrashEventAppInitializedListener_Factory create(Provider<CoroutineScope> provider, Provider<EventLogger> provider2, Provider<CrashStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CrashEventAppInitializedListener newInstance(CoroutineScope coroutineScope, EventLogger eventLogger, CrashStore crashStore) {
        return INSTANCE.newInstance(coroutineScope, eventLogger, crashStore);
    }

    public CrashEventAppInitializedListener_Factory(Provider<CoroutineScope> rootCoroutineScope, Provider<EventLogger> eventLogger, Provider<CrashStore> crashStore) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(crashStore, "crashStore");
        this.rootCoroutineScope = rootCoroutineScope;
        this.eventLogger = eventLogger;
        this.crashStore = crashStore;
    }

    @Override // javax.inject.Provider
    public CrashEventAppInitializedListener get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        CrashStore crashStore = this.crashStore.get();
        Intrinsics.checkNotNullExpressionValue(crashStore, "get(...)");
        return companion.newInstance(coroutineScope, eventLogger, crashStore);
    }

    /* compiled from: CrashEventAppInitializedListener_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/analytics/CrashEventAppInitializedListener_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/analytics/CrashEventAppInitializedListener_Factory;", "rootCoroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "crashStore", "Lcom/robinhood/android/sentry/CrashStore;", "newInstance", "Lcom/robinhood/analytics/CrashEventAppInitializedListener;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CrashEventAppInitializedListener_Factory create(Provider<CoroutineScope> rootCoroutineScope, Provider<EventLogger> eventLogger, Provider<CrashStore> crashStore) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(crashStore, "crashStore");
            return new CrashEventAppInitializedListener_Factory(rootCoroutineScope, eventLogger, crashStore);
        }

        @JvmStatic
        public final CrashEventAppInitializedListener newInstance(CoroutineScope rootCoroutineScope, EventLogger eventLogger, CrashStore crashStore) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(crashStore, "crashStore");
            return new CrashEventAppInitializedListener(rootCoroutineScope, eventLogger, crashStore);
        }
    }
}
