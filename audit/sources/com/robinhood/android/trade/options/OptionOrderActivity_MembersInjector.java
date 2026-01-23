package com.robinhood.android.trade.options;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trade.options.util.OptionOrderManager;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionOrderDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/OptionOrderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "orderManager", "Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "optionsProfitLossChartStore", "Lcom/robinhood/librobinhood/data/store/OptionsProfitLossChartStore;", "optionOrderDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionOrderActivity_MembersInjector implements MembersInjector<OptionOrderActivity> {
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<OptionOrderDiscoveryStore> optionOrderDiscoveryStore;
    private final Provider<OptionsProfitLossChartStore> optionsProfitLossChartStore;
    private final Provider<OptionOrderManager> orderManager;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionOrderActivity> create(Provider<BaseActivitySingletons> provider, Provider<OptionOrderManager> provider2, Provider<AggregateOptionPositionStore> provider3, Provider<OptionsProfitLossChartStore> provider4, Provider<OptionOrderDiscoveryStore> provider5, Provider<TraderEventLogger> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAggregateOptionPositionStore(OptionOrderActivity optionOrderActivity, AggregateOptionPositionStore aggregateOptionPositionStore) {
        INSTANCE.injectAggregateOptionPositionStore(optionOrderActivity, aggregateOptionPositionStore);
    }

    @JvmStatic
    public static final void injectEventLogger(OptionOrderActivity optionOrderActivity, TraderEventLogger traderEventLogger) {
        INSTANCE.injectEventLogger(optionOrderActivity, traderEventLogger);
    }

    @JvmStatic
    public static final void injectOptionOrderDiscoveryStore(OptionOrderActivity optionOrderActivity, OptionOrderDiscoveryStore optionOrderDiscoveryStore) {
        INSTANCE.injectOptionOrderDiscoveryStore(optionOrderActivity, optionOrderDiscoveryStore);
    }

    @JvmStatic
    public static final void injectOptionsProfitLossChartStore(OptionOrderActivity optionOrderActivity, OptionsProfitLossChartStore optionsProfitLossChartStore) {
        INSTANCE.injectOptionsProfitLossChartStore(optionOrderActivity, optionsProfitLossChartStore);
    }

    @JvmStatic
    public static final void injectOrderManager(OptionOrderActivity optionOrderActivity, OptionOrderManager optionOrderManager) {
        INSTANCE.injectOrderManager(optionOrderActivity, optionOrderManager);
    }

    public OptionOrderActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<OptionOrderManager> orderManager, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<OptionsProfitLossChartStore> optionsProfitLossChartStore, Provider<OptionOrderDiscoveryStore> optionOrderDiscoveryStore, Provider<TraderEventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(optionsProfitLossChartStore, "optionsProfitLossChartStore");
        Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.singletons = singletons;
        this.orderManager = orderManager;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.optionsProfitLossChartStore = optionsProfitLossChartStore;
        this.optionOrderDiscoveryStore = optionOrderDiscoveryStore;
        this.eventLogger = eventLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionOrderActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        OptionOrderManager optionOrderManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderManager, "get(...)");
        companion2.injectOrderManager(instance, optionOrderManager);
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        companion2.injectAggregateOptionPositionStore(instance, aggregateOptionPositionStore);
        OptionsProfitLossChartStore optionsProfitLossChartStore = this.optionsProfitLossChartStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossChartStore, "get(...)");
        companion2.injectOptionsProfitLossChartStore(instance, optionsProfitLossChartStore);
        OptionOrderDiscoveryStore optionOrderDiscoveryStore = this.optionOrderDiscoveryStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderDiscoveryStore, "get(...)");
        companion2.injectOptionOrderDiscoveryStore(instance, optionOrderDiscoveryStore);
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        companion2.injectEventLogger(instance, traderEventLogger);
    }

    /* compiled from: OptionOrderActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/OptionOrderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "orderManager", "Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "optionsProfitLossChartStore", "Lcom/robinhood/librobinhood/data/store/OptionsProfitLossChartStore;", "optionOrderDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "injectOrderManager", "", "instance", "injectAggregateOptionPositionStore", "injectOptionsProfitLossChartStore", "injectOptionOrderDiscoveryStore", "injectEventLogger", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionOrderActivity> create(Provider<BaseActivitySingletons> singletons, Provider<OptionOrderManager> orderManager, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<OptionsProfitLossChartStore> optionsProfitLossChartStore, Provider<OptionOrderDiscoveryStore> optionOrderDiscoveryStore, Provider<TraderEventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(optionsProfitLossChartStore, "optionsProfitLossChartStore");
            Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new OptionOrderActivity_MembersInjector(singletons, orderManager, aggregateOptionPositionStore, optionsProfitLossChartStore, optionOrderDiscoveryStore, eventLogger);
        }

        @JvmStatic
        public final void injectOrderManager(OptionOrderActivity instance, OptionOrderManager orderManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            instance.setOrderManager(orderManager);
        }

        @JvmStatic
        public final void injectAggregateOptionPositionStore(OptionOrderActivity instance, AggregateOptionPositionStore aggregateOptionPositionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            instance.setAggregateOptionPositionStore(aggregateOptionPositionStore);
        }

        @JvmStatic
        public final void injectOptionsProfitLossChartStore(OptionOrderActivity instance, OptionsProfitLossChartStore optionsProfitLossChartStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionsProfitLossChartStore, "optionsProfitLossChartStore");
            instance.setOptionsProfitLossChartStore(optionsProfitLossChartStore);
        }

        @JvmStatic
        public final void injectOptionOrderDiscoveryStore(OptionOrderActivity instance, OptionOrderDiscoveryStore optionOrderDiscoveryStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
            instance.setOptionOrderDiscoveryStore(optionOrderDiscoveryStore);
        }

        @JvmStatic
        public final void injectEventLogger(OptionOrderActivity instance, TraderEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }
    }
}
