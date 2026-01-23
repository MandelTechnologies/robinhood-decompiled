package com.robinhood.android.trade.equity.activity;

import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trade.equity.p261ui.configuration.selection.OrderConfigurationContextFactory;
import com.robinhood.tooltips.TooltipManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "orderConfigurationContextFactory", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityOrderActivity_MembersInjector implements MembersInjector<EquityOrderActivity> {
    private final Provider<BwWebViewManager> bwWebViewManager;
    private final Provider<OrderConfigurationContextFactory> orderConfigurationContextFactory;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TooltipManager> tooltipManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EquityOrderActivity> create(Provider<BaseActivitySingletons> provider, Provider<OrderConfigurationContextFactory> provider2, Provider<BwWebViewManager> provider3, Provider<TooltipManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectBwWebViewManager(EquityOrderActivity equityOrderActivity, BwWebViewManager bwWebViewManager) {
        INSTANCE.injectBwWebViewManager(equityOrderActivity, bwWebViewManager);
    }

    @JvmStatic
    public static final void injectOrderConfigurationContextFactory(EquityOrderActivity equityOrderActivity, OrderConfigurationContextFactory orderConfigurationContextFactory) {
        INSTANCE.injectOrderConfigurationContextFactory(equityOrderActivity, orderConfigurationContextFactory);
    }

    @JvmStatic
    public static final void injectTooltipManager(EquityOrderActivity equityOrderActivity, TooltipManager tooltipManager) {
        INSTANCE.injectTooltipManager(equityOrderActivity, tooltipManager);
    }

    public EquityOrderActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<OrderConfigurationContextFactory> orderConfigurationContextFactory, Provider<BwWebViewManager> bwWebViewManager, Provider<TooltipManager> tooltipManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(orderConfigurationContextFactory, "orderConfigurationContextFactory");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
        this.singletons = singletons;
        this.orderConfigurationContextFactory = orderConfigurationContextFactory;
        this.bwWebViewManager = bwWebViewManager;
        this.tooltipManager = tooltipManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EquityOrderActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        OrderConfigurationContextFactory orderConfigurationContextFactory = this.orderConfigurationContextFactory.get();
        Intrinsics.checkNotNullExpressionValue(orderConfigurationContextFactory, "get(...)");
        companion2.injectOrderConfigurationContextFactory(instance, orderConfigurationContextFactory);
        BwWebViewManager bwWebViewManager = this.bwWebViewManager.get();
        Intrinsics.checkNotNullExpressionValue(bwWebViewManager, "get(...)");
        companion2.injectBwWebViewManager(instance, bwWebViewManager);
        TooltipManager tooltipManager = this.tooltipManager.get();
        Intrinsics.checkNotNullExpressionValue(tooltipManager, "get(...)");
        companion2.injectTooltipManager(instance, tooltipManager);
    }

    /* compiled from: EquityOrderActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "orderConfigurationContextFactory", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "injectOrderConfigurationContextFactory", "", "instance", "injectBwWebViewManager", "injectTooltipManager", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EquityOrderActivity> create(Provider<BaseActivitySingletons> singletons, Provider<OrderConfigurationContextFactory> orderConfigurationContextFactory, Provider<BwWebViewManager> bwWebViewManager, Provider<TooltipManager> tooltipManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(orderConfigurationContextFactory, "orderConfigurationContextFactory");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            return new EquityOrderActivity_MembersInjector(singletons, orderConfigurationContextFactory, bwWebViewManager, tooltipManager);
        }

        @JvmStatic
        public final void injectOrderConfigurationContextFactory(EquityOrderActivity instance, OrderConfigurationContextFactory orderConfigurationContextFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderConfigurationContextFactory, "orderConfigurationContextFactory");
            instance.setOrderConfigurationContextFactory(orderConfigurationContextFactory);
        }

        @JvmStatic
        public final void injectBwWebViewManager(EquityOrderActivity instance, BwWebViewManager bwWebViewManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            instance.setBwWebViewManager(bwWebViewManager);
        }

        @JvmStatic
        public final void injectTooltipManager(EquityOrderActivity instance, TooltipManager tooltipManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            instance.setTooltipManager(tooltipManager);
        }
    }
}
