package com.robinhood.android.regiongate.p237ui.lifecycle;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RegionGateLifecycleCallbacks_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGateLifecycleCallbacks_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGateLifecycleCallbacks;", "regionGateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RegionGateLifecycleCallbacks_Factory implements Factory<RegionGateLifecycleCallbacks> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EventLogger> eventLogger;
    private final Provider<RegionGateProvider> regionGateProvider;

    @JvmStatic
    public static final RegionGateLifecycleCallbacks_Factory create(Provider<RegionGateProvider> provider, Provider<EventLogger> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final RegionGateLifecycleCallbacks newInstance(RegionGateProvider regionGateProvider, EventLogger eventLogger) {
        return INSTANCE.newInstance(regionGateProvider, eventLogger);
    }

    public RegionGateLifecycleCallbacks_Factory(Provider<RegionGateProvider> regionGateProvider, Provider<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.regionGateProvider = regionGateProvider;
        this.eventLogger = eventLogger;
    }

    @Override // javax.inject.Provider
    public RegionGateLifecycleCallbacks get() {
        Companion companion = INSTANCE;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        return companion.newInstance(regionGateProvider, eventLogger);
    }

    /* compiled from: RegionGateLifecycleCallbacks_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGateLifecycleCallbacks_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGateLifecycleCallbacks_Factory;", "regionGateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "newInstance", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGateLifecycleCallbacks;", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RegionGateLifecycleCallbacks_Factory create(Provider<RegionGateProvider> regionGateProvider, Provider<EventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new RegionGateLifecycleCallbacks_Factory(regionGateProvider, eventLogger);
        }

        @JvmStatic
        public final RegionGateLifecycleCallbacks newInstance(RegionGateProvider regionGateProvider, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new RegionGateLifecycleCallbacks(regionGateProvider, eventLogger);
        }
    }
}
