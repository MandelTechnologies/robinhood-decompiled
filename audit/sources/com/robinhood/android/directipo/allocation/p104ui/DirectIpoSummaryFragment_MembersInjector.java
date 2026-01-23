package com.robinhood.android.directipo.allocation.p104ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.librobinhood.data.store.QuoteHistoricalStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoSummaryFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "quoteHistoricalStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DirectIpoSummaryFragment_MembersInjector implements MembersInjector<DirectIpoSummaryFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<QuoteHistoricalStore> quoteHistoricalStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DirectIpoSummaryFragment> create(Provider<BaseFragmentSingletons> provider, Provider<QuoteHistoricalStore> provider2, Provider<TraderMarketHoursManager> provider3, Provider<AnalyticsLogger> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAnalytics(DirectIpoSummaryFragment directIpoSummaryFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(directIpoSummaryFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectMarketHoursManager(DirectIpoSummaryFragment directIpoSummaryFragment, TraderMarketHoursManager traderMarketHoursManager) {
        INSTANCE.injectMarketHoursManager(directIpoSummaryFragment, traderMarketHoursManager);
    }

    @JvmStatic
    public static final void injectQuoteHistoricalStore(DirectIpoSummaryFragment directIpoSummaryFragment, QuoteHistoricalStore quoteHistoricalStore) {
        INSTANCE.injectQuoteHistoricalStore(directIpoSummaryFragment, quoteHistoricalStore);
    }

    public DirectIpoSummaryFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<QuoteHistoricalStore> quoteHistoricalStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<AnalyticsLogger> analytics) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.singletons = singletons;
        this.quoteHistoricalStore = quoteHistoricalStore;
        this.marketHoursManager = marketHoursManager;
        this.analytics = analytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoSummaryFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        QuoteHistoricalStore quoteHistoricalStore = this.quoteHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteHistoricalStore, "get(...)");
        companion2.injectQuoteHistoricalStore(instance, quoteHistoricalStore);
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        companion2.injectMarketHoursManager(instance, traderMarketHoursManager);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
    }

    /* compiled from: DirectIpoSummaryFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "quoteHistoricalStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "injectQuoteHistoricalStore", "", "instance", "injectMarketHoursManager", "injectAnalytics", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DirectIpoSummaryFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<QuoteHistoricalStore> quoteHistoricalStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<AnalyticsLogger> analytics) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new DirectIpoSummaryFragment_MembersInjector(singletons, quoteHistoricalStore, marketHoursManager, analytics);
        }

        @JvmStatic
        public final void injectQuoteHistoricalStore(DirectIpoSummaryFragment instance, QuoteHistoricalStore quoteHistoricalStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
            instance.setQuoteHistoricalStore(quoteHistoricalStore);
        }

        @JvmStatic
        public final void injectMarketHoursManager(DirectIpoSummaryFragment instance, TraderMarketHoursManager marketHoursManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            instance.setMarketHoursManager(marketHoursManager);
        }

        @JvmStatic
        public final void injectAnalytics(DirectIpoSummaryFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }
    }
}
