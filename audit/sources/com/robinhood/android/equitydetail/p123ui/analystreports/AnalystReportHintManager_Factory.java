package com.robinhood.android.equitydetail.p123ui.analystreports;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.librobinhood.data.store.AnalystOverviewStore;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalystReportHintManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintManager;", "analystOverviewStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AnalystOverviewStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AnalystReportHintManager_Factory implements Factory<AnalystReportHintManager> {
    private final Provider<AnalystOverviewStore> analystOverviewStore;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AnalystReportHintManager_Factory create(Provider<AnalystOverviewStore> provider, Provider<AnalyticsLogger> provider2, Provider<MarginSubscriptionStore> provider3, Provider<RhProcessLifecycleOwner> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AnalystReportHintManager newInstance(AnalystOverviewStore analystOverviewStore, AnalyticsLogger analyticsLogger, MarginSubscriptionStore marginSubscriptionStore, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        return INSTANCE.newInstance(analystOverviewStore, analyticsLogger, marginSubscriptionStore, rhProcessLifecycleOwner);
    }

    public AnalystReportHintManager_Factory(Provider<AnalystOverviewStore> analystOverviewStore, Provider<AnalyticsLogger> analytics, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(analystOverviewStore, "analystOverviewStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.analystOverviewStore = analystOverviewStore;
        this.analytics = analytics;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    @Override // javax.inject.Provider
    public AnalystReportHintManager get() {
        Companion companion = INSTANCE;
        AnalystOverviewStore analystOverviewStore = this.analystOverviewStore.get();
        Intrinsics.checkNotNullExpressionValue(analystOverviewStore, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner.get();
        Intrinsics.checkNotNullExpressionValue(rhProcessLifecycleOwner, "get(...)");
        return companion.newInstance(analystOverviewStore, analyticsLogger, marginSubscriptionStore, rhProcessLifecycleOwner);
    }

    /* compiled from: AnalystReportHintManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintManager_Factory;", "analystOverviewStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AnalystOverviewStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "newInstance", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintManager;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnalystReportHintManager_Factory create(Provider<AnalystOverviewStore> analystOverviewStore, Provider<AnalyticsLogger> analytics, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(analystOverviewStore, "analystOverviewStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new AnalystReportHintManager_Factory(analystOverviewStore, analytics, marginSubscriptionStore, rhProcessLifecycleOwner);
        }

        @JvmStatic
        public final AnalystReportHintManager newInstance(AnalystOverviewStore analystOverviewStore, AnalyticsLogger analytics, MarginSubscriptionStore marginSubscriptionStore, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(analystOverviewStore, "analystOverviewStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new AnalystReportHintManager(analystOverviewStore, analytics, marginSubscriptionStore, rhProcessLifecycleOwner);
        }
    }
}
