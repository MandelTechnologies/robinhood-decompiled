package com.robinhood.android.futures.trade.p147ui;

import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.tooltips.TooltipManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesTradeActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/FuturesTradeActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/futures/trade/ui/FuturesTradeActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "goldUpsellNavigationHelper", "Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesTradeActivity_MembersInjector implements MembersInjector<FuturesTradeActivity> {
    private final Provider<BwWebViewManager> bwWebViewManager;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<FuturesOrderStore> futuresOrderStore;
    private final Provider<GoldUpsellNavigationHelper> goldUpsellNavigationHelper;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TooltipManager> tooltipManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<FuturesTradeActivity> create(Provider<BaseActivitySingletons> provider, Provider<TooltipManager> provider2, Provider<GoldUpsellNavigationHelper> provider3, Provider<FuturesOrderStore> provider4, Provider<BwWebViewManager> provider5, Provider<ExperimentsProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectBwWebViewManager(FuturesTradeActivity futuresTradeActivity, BwWebViewManager bwWebViewManager) {
        INSTANCE.injectBwWebViewManager(futuresTradeActivity, bwWebViewManager);
    }

    @JvmStatic
    public static final void injectExperimentsProvider(FuturesTradeActivity futuresTradeActivity, ExperimentsProvider experimentsProvider) {
        INSTANCE.injectExperimentsProvider(futuresTradeActivity, experimentsProvider);
    }

    @JvmStatic
    public static final void injectFuturesOrderStore(FuturesTradeActivity futuresTradeActivity, FuturesOrderStore futuresOrderStore) {
        INSTANCE.injectFuturesOrderStore(futuresTradeActivity, futuresOrderStore);
    }

    @JvmStatic
    public static final void injectGoldUpsellNavigationHelper(FuturesTradeActivity futuresTradeActivity, GoldUpsellNavigationHelper goldUpsellNavigationHelper) {
        INSTANCE.injectGoldUpsellNavigationHelper(futuresTradeActivity, goldUpsellNavigationHelper);
    }

    @JvmStatic
    public static final void injectTooltipManager(FuturesTradeActivity futuresTradeActivity, TooltipManager tooltipManager) {
        INSTANCE.injectTooltipManager(futuresTradeActivity, tooltipManager);
    }

    public FuturesTradeActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<TooltipManager> tooltipManager, Provider<GoldUpsellNavigationHelper> goldUpsellNavigationHelper, Provider<FuturesOrderStore> futuresOrderStore, Provider<BwWebViewManager> bwWebViewManager, Provider<ExperimentsProvider> experimentsProvider) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
        Intrinsics.checkNotNullParameter(goldUpsellNavigationHelper, "goldUpsellNavigationHelper");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.singletons = singletons;
        this.tooltipManager = tooltipManager;
        this.goldUpsellNavigationHelper = goldUpsellNavigationHelper;
        this.futuresOrderStore = futuresOrderStore;
        this.bwWebViewManager = bwWebViewManager;
        this.experimentsProvider = experimentsProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FuturesTradeActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        TooltipManager tooltipManager = this.tooltipManager.get();
        Intrinsics.checkNotNullExpressionValue(tooltipManager, "get(...)");
        companion2.injectTooltipManager(instance, tooltipManager);
        GoldUpsellNavigationHelper goldUpsellNavigationHelper = this.goldUpsellNavigationHelper.get();
        Intrinsics.checkNotNullExpressionValue(goldUpsellNavigationHelper, "get(...)");
        companion2.injectGoldUpsellNavigationHelper(instance, goldUpsellNavigationHelper);
        FuturesOrderStore futuresOrderStore = this.futuresOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderStore, "get(...)");
        companion2.injectFuturesOrderStore(instance, futuresOrderStore);
        BwWebViewManager bwWebViewManager = this.bwWebViewManager.get();
        Intrinsics.checkNotNullExpressionValue(bwWebViewManager, "get(...)");
        companion2.injectBwWebViewManager(instance, bwWebViewManager);
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        companion2.injectExperimentsProvider(instance, experimentsProvider);
    }

    /* compiled from: FuturesTradeActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/FuturesTradeActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/futures/trade/ui/FuturesTradeActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "goldUpsellNavigationHelper", "Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "injectTooltipManager", "", "instance", "injectGoldUpsellNavigationHelper", "injectFuturesOrderStore", "injectBwWebViewManager", "injectExperimentsProvider", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<FuturesTradeActivity> create(Provider<BaseActivitySingletons> singletons, Provider<TooltipManager> tooltipManager, Provider<GoldUpsellNavigationHelper> goldUpsellNavigationHelper, Provider<FuturesOrderStore> futuresOrderStore, Provider<BwWebViewManager> bwWebViewManager, Provider<ExperimentsProvider> experimentsProvider) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            Intrinsics.checkNotNullParameter(goldUpsellNavigationHelper, "goldUpsellNavigationHelper");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            return new FuturesTradeActivity_MembersInjector(singletons, tooltipManager, goldUpsellNavigationHelper, futuresOrderStore, bwWebViewManager, experimentsProvider);
        }

        @JvmStatic
        public final void injectTooltipManager(FuturesTradeActivity instance, TooltipManager tooltipManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            instance.setTooltipManager(tooltipManager);
        }

        @JvmStatic
        public final void injectGoldUpsellNavigationHelper(FuturesTradeActivity instance, GoldUpsellNavigationHelper goldUpsellNavigationHelper) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldUpsellNavigationHelper, "goldUpsellNavigationHelper");
            instance.setGoldUpsellNavigationHelper(goldUpsellNavigationHelper);
        }

        @JvmStatic
        public final void injectFuturesOrderStore(FuturesTradeActivity instance, FuturesOrderStore futuresOrderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            instance.setFuturesOrderStore(futuresOrderStore);
        }

        @JvmStatic
        public final void injectBwWebViewManager(FuturesTradeActivity instance, BwWebViewManager bwWebViewManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            instance.setBwWebViewManager(bwWebViewManager);
        }

        @JvmStatic
        public final void injectExperimentsProvider(FuturesTradeActivity instance, ExperimentsProvider experimentsProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            instance.setExperimentsProvider(experimentsProvider);
        }
    }
}
