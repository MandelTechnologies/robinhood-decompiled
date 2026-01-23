package com.robinhood.android.lib.trade;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore;
import com.robinhood.store.base.SuitabilityStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseOrderParentFragmentSingletons_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "combinedQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BaseOrderParentFragmentSingletons_Factory implements Factory<BaseOrderParentFragmentSingletons> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CombinedQuestionnaireStore> combinedQuestionnaireStore;
    private final Provider<TraderDayTradeStore> dayTradeStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SuitabilityStore> suitabilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BaseOrderParentFragmentSingletons_Factory create(Provider<AnalyticsLogger> provider, Provider<CombinedQuestionnaireStore> provider2, Provider<TraderDayTradeStore> provider3, Provider<RegionGateProvider> provider4, Provider<SuitabilityStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final BaseOrderParentFragmentSingletons newInstance(AnalyticsLogger analyticsLogger, CombinedQuestionnaireStore combinedQuestionnaireStore, TraderDayTradeStore traderDayTradeStore, RegionGateProvider regionGateProvider, SuitabilityStore suitabilityStore) {
        return INSTANCE.newInstance(analyticsLogger, combinedQuestionnaireStore, traderDayTradeStore, regionGateProvider, suitabilityStore);
    }

    public BaseOrderParentFragmentSingletons_Factory(Provider<AnalyticsLogger> analytics, Provider<CombinedQuestionnaireStore> combinedQuestionnaireStore, Provider<TraderDayTradeStore> dayTradeStore, Provider<RegionGateProvider> regionGateProvider, Provider<SuitabilityStore> suitabilityStore) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(combinedQuestionnaireStore, "combinedQuestionnaireStore");
        Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        this.analytics = analytics;
        this.combinedQuestionnaireStore = combinedQuestionnaireStore;
        this.dayTradeStore = dayTradeStore;
        this.regionGateProvider = regionGateProvider;
        this.suitabilityStore = suitabilityStore;
    }

    @Override // javax.inject.Provider
    public BaseOrderParentFragmentSingletons get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        CombinedQuestionnaireStore combinedQuestionnaireStore = this.combinedQuestionnaireStore.get();
        Intrinsics.checkNotNullExpressionValue(combinedQuestionnaireStore, "get(...)");
        TraderDayTradeStore traderDayTradeStore = this.dayTradeStore.get();
        Intrinsics.checkNotNullExpressionValue(traderDayTradeStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        SuitabilityStore suitabilityStore = this.suitabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(suitabilityStore, "get(...)");
        return companion.newInstance(analyticsLogger, combinedQuestionnaireStore, traderDayTradeStore, regionGateProvider, suitabilityStore);
    }

    /* compiled from: BaseOrderParentFragmentSingletons_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "combinedQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "newInstance", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BaseOrderParentFragmentSingletons_Factory create(Provider<AnalyticsLogger> analytics, Provider<CombinedQuestionnaireStore> combinedQuestionnaireStore, Provider<TraderDayTradeStore> dayTradeStore, Provider<RegionGateProvider> regionGateProvider, Provider<SuitabilityStore> suitabilityStore) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(combinedQuestionnaireStore, "combinedQuestionnaireStore");
            Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            return new BaseOrderParentFragmentSingletons_Factory(analytics, combinedQuestionnaireStore, dayTradeStore, regionGateProvider, suitabilityStore);
        }

        @JvmStatic
        public final BaseOrderParentFragmentSingletons newInstance(AnalyticsLogger analytics, CombinedQuestionnaireStore combinedQuestionnaireStore, TraderDayTradeStore dayTradeStore, RegionGateProvider regionGateProvider, SuitabilityStore suitabilityStore) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(combinedQuestionnaireStore, "combinedQuestionnaireStore");
            Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            return new BaseOrderParentFragmentSingletons(analytics, combinedQuestionnaireStore, dayTradeStore, regionGateProvider, suitabilityStore);
        }
    }
}
