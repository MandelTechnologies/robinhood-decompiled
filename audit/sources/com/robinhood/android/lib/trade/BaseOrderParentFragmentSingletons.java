package com.robinhood.android.lib.trade;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore;
import com.robinhood.store.base.SuitabilityStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseOrderParentFragmentSingletons.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "combinedQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/store/base/SuitabilityStore;)V", "getAnalytics$feature_lib_trade_externalDebug", "()Lcom/robinhood/analytics/AnalyticsLogger;", "getCombinedQuestionnaireStore$feature_lib_trade_externalDebug", "()Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "getDayTradeStore$feature_lib_trade_externalDebug", "()Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "getRegionGateProvider$feature_lib_trade_externalDebug", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "getSuitabilityStore$feature_lib_trade_externalDebug", "()Lcom/robinhood/store/base/SuitabilityStore;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BaseOrderParentFragmentSingletons {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final CombinedQuestionnaireStore combinedQuestionnaireStore;
    private final TraderDayTradeStore dayTradeStore;
    private final RegionGateProvider regionGateProvider;
    private final SuitabilityStore suitabilityStore;

    public BaseOrderParentFragmentSingletons(AnalyticsLogger analytics, CombinedQuestionnaireStore combinedQuestionnaireStore, TraderDayTradeStore dayTradeStore, RegionGateProvider regionGateProvider, SuitabilityStore suitabilityStore) {
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

    /* renamed from: getAnalytics$feature_lib_trade_externalDebug, reason: from getter */
    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }

    /* renamed from: getCombinedQuestionnaireStore$feature_lib_trade_externalDebug, reason: from getter */
    public final CombinedQuestionnaireStore getCombinedQuestionnaireStore() {
        return this.combinedQuestionnaireStore;
    }

    /* renamed from: getDayTradeStore$feature_lib_trade_externalDebug, reason: from getter */
    public final TraderDayTradeStore getDayTradeStore() {
        return this.dayTradeStore;
    }

    /* renamed from: getRegionGateProvider$feature_lib_trade_externalDebug, reason: from getter */
    public final RegionGateProvider getRegionGateProvider() {
        return this.regionGateProvider;
    }

    /* renamed from: getSuitabilityStore$feature_lib_trade_externalDebug, reason: from getter */
    public final SuitabilityStore getSuitabilityStore() {
        return this.suitabilityStore;
    }
}
