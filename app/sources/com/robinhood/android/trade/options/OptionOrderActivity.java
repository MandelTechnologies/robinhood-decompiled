package com.robinhood.android.trade.options;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.options.order.OptionOrderType2;
import com.robinhood.android.common.options.upsell.alert.OptionPostTradeAlertFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.BaseOrderActivity;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionsProfitLossChartAnalysisFragmentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.options.OptionOrderFragment;
import com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment;
import com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment;
import com.robinhood.android.trade.options.education.OptionOrderEducationFragment;
import com.robinhood.android.trade.options.education.OptionOrderEducationFragmentKey;
import com.robinhood.android.trade.options.extensions.OptionOrderSource;
import com.robinhood.android.trade.options.util.OptionOrderManager;
import com.robinhood.android.util.style.OptionOrderLegacyShimOverlay;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionOrderDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderEducationType;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.p370rx.ObservablesKt;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.OptionOrderFormSource;
import rosetta.order.DefaultPriceSetting;

/* compiled from: OptionOrderActivity.kt */
@Metadata(m3635d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001rB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010>\u001a\u00020\u0003H\u0016J\b\u0010?\u001a\u00020@H\u0016J\u0012\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\u0010\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020EH\u0014J\u001a\u0010L\u001a\u00020E2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\u0018\u0010Q\u001a\u00020E2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020RH\u0002J\u0010\u0010S\u001a\u00020E2\u0006\u0010T\u001a\u00020GH\u0014J\u0010\u0010U\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0014J\u0012\u0010V\u001a\u00020E2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u0010W\u001a\u00020E2\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u00020E2\u0006\u0010[\u001a\u00020RH\u0016J\u0010\u0010\\\u001a\u00020E2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010_\u001a\u00020E2\u0006\u0010`\u001a\u00020aH\u0002J\u0010\u0010b\u001a\u00020E2\u0006\u0010c\u001a\u00020dH\u0016J\u0010\u0010e\u001a\u00020E2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010f\u001a\u00020E2\u0006\u0010g\u001a\u00020hH\u0016J\b\u0010i\u001a\u00020EH\u0014J\b\u0010j\u001a\u00020EH\u0016J\b\u0010k\u001a\u00020EH\u0016J\t\u0010l\u001a\u000202H\u0096\u0001R\u001e\u0010\u000b\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00104\u001a\u0002058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020;X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020,X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010m\u001a\b\u0012\u0004\u0012\u00020o0nX\u0096\u0005¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderActivity;", "Lcom/robinhood/android/lib/trade/BaseOrderActivity;", "Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "Lcom/robinhood/android/trade/options/OptionOrderFragment;", "Lcom/robinhood/android/trade/options/OptionOrderFragment$Callbacks;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Callbacks;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Callbacks;", "Lcom/robinhood/android/trade/options/education/OptionOrderEducationFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "setOrderManager", "(Lcom/robinhood/android/trade/options/util/OptionOrderManager;)V", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "getAggregateOptionPositionStore", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "setAggregateOptionPositionStore", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;)V", "optionsProfitLossChartStore", "Lcom/robinhood/librobinhood/data/store/OptionsProfitLossChartStore;", "getOptionsProfitLossChartStore", "()Lcom/robinhood/librobinhood/data/store/OptionsProfitLossChartStore;", "setOptionsProfitLossChartStore", "(Lcom/robinhood/librobinhood/data/store/OptionsProfitLossChartStore;)V", "optionOrderDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "getOptionOrderDiscoveryStore", "()Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "setOptionOrderDiscoveryStore", "(Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;)V", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/TraderEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/TraderEventLogger;)V", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "accountNumberObs", "Lio/reactivex/Observable;", "", "getAccountNumberObs", "()Lio/reactivex/Observable;", OptionOrderActivity.SAVE_PASSTHROUGH_CONTEXT, "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args$PassthroughContext;", "shouldShowPlCharts", "", "postConfirmation", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "side$delegate", "Lkotlin/Lazy;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Option;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Option;", "createOrderCreateFragment", "createOrderConfirmationFragment", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment;", "analyticsErrorString", "getAnalyticsErrorString", "()Ljava/lang/String;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "sendOrderSuccessAnalytics", Card.Icon.ORDER, "Lcom/robinhood/models/db/OptionOrder;", "passthrough", "", "sendOrderSuccessEventLogger", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "onSaveInstanceState", "outState", "onRestoreInstanceState", "onLoadPassthroughContext", "onProfitLossAnalysisSelected", "key", "Lcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;", "startOptionOrderTypeFlow", "optionOrderContext", "setOptionOrderTypeAndGoBack", "optionOrderType", "Lcom/robinhood/models/db/OptionOrderType;", "openOptionOrderEducation", "optionOrderEducationType", "Lcom/robinhood/models/db/OptionOrderEducationType;", "onOrderConfigurationSelected", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "onOptionOrderEducationDismissed", "onOrderTimeInForceSelected", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "onOrderSendingOrSubmitted", "onStartPostConfirmationFlow", "onConfirmationExitAnimationFinished", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionOrderActivity extends BaseOrderActivity<OptionOrderManager, OptionOrderFragment> implements OptionOrderFragment.Callbacks, OptionOrderConfirmationFragment.Callbacks, OptionConfigurationSelectionFragment.Callbacks, OptionOrderEducationFragment.Callbacks, RegionGated {
    private static final String SAVE_PASSTHROUGH_CONTEXT = "passthroughContext";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AggregateOptionPositionStore aggregateOptionPositionStore;
    private final String analyticsErrorString;
    private final CarSuitabilityType.Option carSuitabilityType;
    public TraderEventLogger eventLogger;
    private OptionOrderBundle optionOrderBundle;
    public OptionOrderDiscoveryStore optionOrderDiscoveryStore;
    public OptionsProfitLossChartStore optionsProfitLossChartStore;
    public OptionOrderManager orderManager;
    private OptionOrderConfirmationFragment.Args.PassthroughContext passthroughContext;
    private boolean postConfirmation;
    private boolean shouldShowPlCharts;

    /* renamed from: side$delegate, reason: from kotlin metadata */
    private final Lazy side;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOrderActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderPositionEffect.values().length];
            try {
                iArr[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionOrderActivity() {
        super(C20649R.layout.activity_order);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.side = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderActivity.side_delegate$lambda$0(this.f$0);
            }
        });
        this.carSuitabilityType = CarSuitabilityType.Option.INSTANCE;
        this.analyticsErrorString = AnalyticsStrings.ERROR_PLACE_OPTIONS_ORDER;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public OptionOrderManager getOrderManager() {
        OptionOrderManager optionOrderManager = this.orderManager;
        if (optionOrderManager != null) {
            return optionOrderManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(OptionOrderManager optionOrderManager) {
        Intrinsics.checkNotNullParameter(optionOrderManager, "<set-?>");
        this.orderManager = optionOrderManager;
    }

    public final AggregateOptionPositionStore getAggregateOptionPositionStore() {
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore;
        if (aggregateOptionPositionStore != null) {
            return aggregateOptionPositionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aggregateOptionPositionStore");
        return null;
    }

    public final void setAggregateOptionPositionStore(AggregateOptionPositionStore aggregateOptionPositionStore) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "<set-?>");
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
    }

    public final OptionsProfitLossChartStore getOptionsProfitLossChartStore() {
        OptionsProfitLossChartStore optionsProfitLossChartStore = this.optionsProfitLossChartStore;
        if (optionsProfitLossChartStore != null) {
            return optionsProfitLossChartStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionsProfitLossChartStore");
        return null;
    }

    public final void setOptionsProfitLossChartStore(OptionsProfitLossChartStore optionsProfitLossChartStore) {
        Intrinsics.checkNotNullParameter(optionsProfitLossChartStore, "<set-?>");
        this.optionsProfitLossChartStore = optionsProfitLossChartStore;
    }

    public final OptionOrderDiscoveryStore getOptionOrderDiscoveryStore() {
        OptionOrderDiscoveryStore optionOrderDiscoveryStore = this.optionOrderDiscoveryStore;
        if (optionOrderDiscoveryStore != null) {
            return optionOrderDiscoveryStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionOrderDiscoveryStore");
        return null;
    }

    public final void setOptionOrderDiscoveryStore(OptionOrderDiscoveryStore optionOrderDiscoveryStore) {
        Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "<set-?>");
        this.optionOrderDiscoveryStore = optionOrderDiscoveryStore;
    }

    public final TraderEventLogger getEventLogger() {
        TraderEventLogger traderEventLogger = this.eventLogger;
        if (traderEventLogger != null) {
            return traderEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(TraderEventLogger traderEventLogger) {
        Intrinsics.checkNotNullParameter(traderEventLogger, "<set-?>");
        this.eventLogger = traderEventLogger;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public Observable<String> getAccountNumberObs() {
        Observable<String> observableJust = Observable.just(((OptionOrderIntentKey) INSTANCE.getExtras((Activity) this)).getInitialAccountNumber());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public OrderSide getSide() {
        return (OrderSide) this.side.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderSide side_delegate$lambda$0(OptionOrderActivity optionOrderActivity) {
        OptionOrderIntentKey optionOrderIntentKey = (OptionOrderIntentKey) INSTANCE.getExtras((Activity) optionOrderActivity);
        if (optionOrderIntentKey instanceof OptionOrderIntentKey.FromOptionOrderBundle) {
            return ((OptionLegBundle) CollectionsKt.first((List) ((OptionOrderIntentKey.FromOptionOrderBundle) optionOrderIntentKey).getOptionOrderBundle().getLegBundles())).getOptionConfigurationBundle().getOptionSide();
        }
        if (!(optionOrderIntentKey instanceof OptionOrderIntentKey.FromAggregatePosition)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[((OptionOrderIntentKey.FromAggregatePosition) optionOrderIntentKey).getPositionEffect().ordinal()];
        if (i == 1) {
            return OrderSide.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderSide.SELL;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public CarSuitabilityType.Option getCarSuitabilityType() {
        return this.carSuitabilityType;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public OptionOrderFragment createOrderCreateFragment() {
        OptionOrderFragment.Args args;
        OptionOrderFragment.Companion companion = OptionOrderFragment.INSTANCE;
        OptionOrderIntentKey optionOrderIntentKey = (OptionOrderIntentKey) INSTANCE.getExtras((Activity) this);
        if (optionOrderIntentKey instanceof OptionOrderIntentKey.FromOptionOrderBundle) {
            OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = (OptionOrderIntentKey.FromOptionOrderBundle) optionOrderIntentKey;
            OptionOrderBundle optionOrderBundle = fromOptionOrderBundle.getOptionOrderBundle();
            UiOptionOrder orderToReplace = fromOptionOrderBundle.getOrderToReplace();
            UUID orderIdToPlaceAgain = fromOptionOrderBundle.getOrderIdToPlaceAgain();
            OptionOrderType prefilledOrderType = fromOptionOrderBundle.getPrefilledOrderType();
            OrderTimeInForce prefilledTimeInForce = fromOptionOrderBundle.getPrefilledTimeInForce();
            boolean shouldSetInitialFocusToLimitPrice = fromOptionOrderBundle.getShouldSetInitialFocusToLimitPrice();
            boolean shouldSetInitialFocusToStopPrice = fromOptionOrderBundle.getShouldSetInitialFocusToStopPrice();
            boolean z = this.shouldShowPlCharts;
            UUID orderUuid = getOrderUuid();
            OptionOrderFormSource source = fromOptionOrderBundle.getSource();
            if (source == null) {
                source = OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
            }
            args = new OptionOrderFragment.Args(optionOrderBundle, orderToReplace, orderIdToPlaceAgain, null, prefilledOrderType, prefilledTimeInForce, shouldSetInitialFocusToLimitPrice, shouldSetInitialFocusToStopPrice, z, orderUuid, source, fromOptionOrderBundle.getStrategyCode(), fromOptionOrderBundle.getDefaultPricingSettingOverride(), fromOptionOrderBundle.getShouldIgnoreDefaultPricing(), fromOptionOrderBundle.getInitialAccountNumber(), fromOptionOrderBundle.getChainDisplayModeForLogging());
        } else {
            if (!(optionOrderIntentKey instanceof OptionOrderIntentKey.FromAggregatePosition)) {
                throw new NoWhenBranchMatchedException();
            }
            OptionOrderBundle optionOrderBundle2 = this.optionOrderBundle;
            BigDecimal quantity = null;
            OptionOrderBundle optionOrderBundle3 = null;
            if (optionOrderBundle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("optionOrderBundle");
                optionOrderBundle2 = null;
            }
            OptionOrderIntentKey.FromAggregatePosition fromAggregatePosition = (OptionOrderIntentKey.FromAggregatePosition) optionOrderIntentKey;
            OrderPositionEffect positionEffect = fromAggregatePosition.getPositionEffect();
            OrderPositionEffect orderPositionEffect = OrderPositionEffect.CLOSE;
            if (positionEffect == orderPositionEffect) {
                OptionOrderBundle optionOrderBundle4 = this.optionOrderBundle;
                if (optionOrderBundle4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("optionOrderBundle");
                } else {
                    optionOrderBundle3 = optionOrderBundle4;
                }
                quantity = optionOrderBundle3.getQuantity();
            }
            boolean z2 = false;
            boolean z3 = fromAggregatePosition.getPositionEffect() == orderPositionEffect;
            if (fromAggregatePosition.getPositionEffect() == OrderPositionEffect.OPEN && Intrinsics.areEqual(fromAggregatePosition.getTransitionReason(), OptionOrderIntentKey.TRANSITION_REASON_SWIPE_TO_TRADE)) {
                z2 = this.shouldShowPlCharts;
            }
            boolean z4 = z2;
            UUID orderUuid2 = getOrderUuid();
            OptionOrderFormSource source2 = fromAggregatePosition.getSource();
            if (source2 == null) {
                source2 = OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
            }
            args = new OptionOrderFragment.Args(optionOrderBundle2, null, null, quantity, null, null, z3, false, z4, orderUuid2, source2, null, null, false, fromAggregatePosition.getInitialAccountNumber(), null);
        }
        return (OptionOrderFragment) companion.newInstance((Parcelable) args);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public OptionOrderConfirmationFragment createOrderConfirmationFragment() {
        OptionOrderConfirmationFragment.Companion companion = OptionOrderConfirmationFragment.INSTANCE;
        OptionOrderConfirmationFragment.Args.PassthroughContext passthroughContext = this.passthroughContext;
        Companion companion2 = INSTANCE;
        String transitionReason = ((OptionOrderIntentKey) companion2.getExtras((Activity) this)).getTransitionReason();
        OptionOrderFormSource source = ((OptionOrderIntentKey) companion2.getExtras((Activity) this)).getSource();
        if (source == null) {
            source = OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
        }
        return (OptionOrderConfirmationFragment) companion.newInstance((Parcelable) new OptionOrderConfirmationFragment.Args(passthroughContext, transitionReason, source));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public String getAnalyticsErrorString() {
        return this.analyticsErrorString;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity, com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(OptionOrderLegacyShimOverlay.INSTANCE, Boolean.FALSE);
        Companion companion = INSTANCE;
        final OptionOrderIntentKey optionOrderIntentKey = (OptionOrderIntentKey) companion.getExtras((Activity) this);
        if (optionOrderIntentKey instanceof OptionOrderIntentKey.FromOptionOrderBundle) {
            this.optionOrderBundle = ((OptionOrderIntentKey.FromOptionOrderBundle) optionOrderIntentKey).getOptionOrderBundle();
            Observable<R> observableSwitchMap = getAccountNumberObs().switchMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderActivity.onCreate.1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Boolean> apply(String accountNumber) {
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    return OptionOrderActivity.this.getOptionsProfitLossChartStore().shouldShowProfitLoss(accountNumber, ((OptionOrderIntentKey.FromOptionOrderBundle) optionOrderIntentKey).getOptionOrderBundle());
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
            Single singleFirstOrError = ObservablesKt.onTimeoutEmit(observableSwitchMap, 200L, TimeUnit.MILLISECONDS, Boolean.TRUE).map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderActivity.onCreate.2
                @Override // io.reactivex.functions.Function
                public final Boolean apply(Boolean it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.booleanValue() && OptionOrderActivity.INSTANCE.getCanShowProfitLoss(optionOrderIntentKey));
                }
            }).firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFirstOrError), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderActivity.onCreate$lambda$1(this.f$0, (Boolean) obj);
                }
            });
        } else if (optionOrderIntentKey instanceof OptionOrderIntentKey.FromAggregatePosition) {
            OptionOrderIntentKey.FromAggregatePosition fromAggregatePosition = (OptionOrderIntentKey.FromAggregatePosition) optionOrderIntentKey;
            getAggregateOptionPositionStore().refresh(false, fromAggregatePosition.getAggregatePositionId(), fromAggregatePosition.getInitialAccountNumber());
            Single singleFirstOrError2 = getAggregateOptionPositionStore().streamUiAggregateOptionPosition(fromAggregatePosition.getAggregatePositionId()).map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderActivity.onCreate.4
                @Override // io.reactivex.functions.Function
                public final OptionOrderBundle apply(UiAggregateOptionPositionFull aggregatePosition) {
                    Intrinsics.checkNotNullParameter(aggregatePosition, "aggregatePosition");
                    return OptionBundles.toOrderBundle(aggregatePosition, ((OptionOrderIntentKey.FromAggregatePosition) optionOrderIntentKey).getPositionEffect());
                }
            }).firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError2, "firstOrError(...)");
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFirstOrError2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderActivity.onCreate$lambda$2(this.f$0, (OptionOrderBundle) obj);
                }
            });
        }
        if (((OptionOrderIntentKey) companion.getExtras((Activity) this)).getTransitionReason() != null) {
            String transitionReason = ((OptionOrderIntentKey) companion.getExtras((Activity) this)).getTransitionReason();
            Intrinsics.checkNotNull(transitionReason);
            setTransitionReason(transitionReason);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(OptionOrderActivity optionOrderActivity, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        optionOrderActivity.shouldShowPlCharts = bool.booleanValue();
        optionOrderActivity.ensureOrderCreateFragment();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(OptionOrderActivity optionOrderActivity, OptionOrderBundle optionOrderBundle) {
        optionOrderActivity.optionOrderBundle = optionOrderBundle;
        optionOrderActivity.ensureOrderCreateFragment();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity, com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, getOrderManager().orderStateChanges(getOrderUuid()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderActivity.onResume$lambda$3(this.f$0, (OrderSubmissionManager.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(OptionOrderActivity optionOrderActivity, OrderSubmissionManager.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!(result instanceof OrderSubmissionManager.Result.Sending)) {
            if (result instanceof OrderSubmissionManager.Result.Submitted) {
                OrderSubmissionManager.Result.Submitted submitted = (OrderSubmissionManager.Result.Submitted) result;
                if (submitted.getTriggersConfirmation()) {
                    optionOrderActivity.sendOrderSuccessAnalytics((OptionOrder) submitted.getData(), submitted.getPassthrough());
                    OptionOrder optionOrder = (OptionOrder) submitted.getData();
                    Object passthrough = submitted.getPassthrough();
                    Intrinsics.checkNotNull(passthrough, "null cannot be cast to non-null type com.robinhood.android.common.options.order.OptionOrderContext");
                    optionOrderActivity.sendOrderSuccessEventLogger(optionOrder, (OptionOrderContext) passthrough);
                }
            } else if (!(result instanceof OrderSubmissionManager.Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    private final void sendOrderSuccessAnalytics(OptionOrder order, Object passthrough) {
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_TRADED_OPTIONS);
        Intrinsics.checkNotNull(passthrough, "null cannot be cast to non-null type com.robinhood.android.common.options.order.OptionOrderContext");
        OptionOrderContext.Prices prices = ((OptionOrderContext) passthrough).getPrices();
        OptionOrderContext.QuoteAggregation quoteAggregation = prices.getQuoteAggregation();
        BigDecimal bidPrice = quoteAggregation != null ? quoteAggregation.getBidPrice() : null;
        OptionOrderContext.QuoteAggregation quoteAggregation2 = prices.getQuoteAggregation();
        BigDecimal askPrice = quoteAggregation2 != null ? quoteAggregation2.getAskPrice() : null;
        boolean z = prices.getUserInputPrices().getAbsoluteLimitPriceForAnalytics() != null;
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), order.getId() + "," + bidPrice + "," + askPrice + "," + z, "place_option_order", null, null, 12, null);
    }

    private final void sendOrderSuccessEventLogger(OptionOrder order, OptionOrderContext passthrough) {
        Companion companion = INSTANCE;
        OptionOrderFormSource source = ((OptionOrderIntentKey) companion.getExtras((Activity) this)).getSource();
        if (source == null) {
            source = OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
        }
        TraderEventLogger eventLogger = getEventLogger();
        OrderFormStep orderFormStep = OrderFormStep.SUBMIT_SUCCESS;
        String account = passthrough.getApiRequest().getAccount();
        String account_number = passthrough.getApiRequest().getAccount_number();
        OptionOrderContext.QuoteAggregation quoteAggregation = passthrough.getPrices().getQuoteAggregation();
        BigDecimal askPriceForLogging = quoteAggregation != null ? quoteAggregation.getAskPriceForLogging() : null;
        OptionOrderContext.QuoteAggregation quoteAggregation2 = passthrough.getPrices().getQuoteAggregation();
        BigDecimal bidPriceForLogging = quoteAggregation2 != null ? quoteAggregation2.getBidPriceForLogging() : null;
        OrderDirection direction = order.getDirection();
        OptionOrder.FormSource formSourceFromOptionOrderFormSource = OptionOrder.FormSource.INSTANCE.fromOptionOrderFormSource(source);
        List<ApiOptionOrderRequest.Leg> legs = passthrough.getApiRequest().getLegs();
        OrderMarketHours market_hours = passthrough.getApiRequest().getMarket_hours();
        boolean override_day_trade_checks = passthrough.getApiRequest().getOverride_day_trade_checks();
        boolean override_dtbp_checks = passthrough.getApiRequest().getOverride_dtbp_checks();
        BigDecimal price = order.getPrice();
        if (price == null) {
            price = passthrough.getApiRequest().getPrice();
        }
        ApiOptionOrderRequest apiOptionOrderRequest = new ApiOptionOrderRequest(account, account_number, askPriceForLogging, bidPriceForLogging, direction, formSourceFromOptionOrderFormSource, legs, market_hours, override_day_trade_checks, override_dtbp_checks, price, order.getQuantity(), passthrough.getApiRequest().getQuantity_to_replace(), passthrough.getApiRequest().getRef_id(), passthrough.getApiRequest().getOrder_to_replace_id(), order.getTimeInForce(), order.getStopPrice(), order.getTrigger(), order.getType());
        OptionOrderMeta.Source metaSource = OptionOrderSource.toMetaSource(source);
        String strategyCode = ((OptionOrderIntentKey) companion.getExtras((Activity) this)).getStrategyCode();
        if (strategyCode == null) {
            strategyCode = "";
        }
        String symbol = passthrough.getRequestContext().getOptionChain().getOptionChain().getSymbol();
        DefaultPriceSetting rosettaValue = OptionSettings.DefaultPricingSetting.INSTANCE.toRosettaValue(passthrough.getPrices().getDefaultPricingType());
        String string2 = order.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        eventLogger.logOptionOrderEvent(orderFormStep, apiOptionOrderRequest, new OptionOrderMeta(null, null, null, metaSource, symbol, string2, null, null, passthrough.getLegContexts().size(), null, null, null, null, null, null, null, rosettaValue, null, null, strategyCode, null, null, null, null, null, null, null, null, null, null, 1073151687, null));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable(SAVE_PASSTHROUGH_CONTEXT, this.passthroughContext);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.passthroughContext = (OptionOrderConfirmationFragment.Args.PassthroughContext) savedInstanceState.getParcelable(SAVE_PASSTHROUGH_CONTEXT);
    }

    @Override // com.robinhood.android.trade.options.OptionOrderFragment.Callbacks
    public void onLoadPassthroughContext(OptionOrderConfirmationFragment.Args.PassthroughContext passthroughContext) {
        this.passthroughContext = passthroughContext;
    }

    @Override // com.robinhood.android.trade.options.OptionOrderFragment.Callbacks
    public void onProfitLossAnalysisSelected(OptionsProfitLossChartAnalysisFragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), key, null, 2, null));
    }

    @Override // com.robinhood.android.trade.options.OptionOrderFragment.Callbacks
    public void startOptionOrderTypeFlow(OptionOrderContext optionOrderContext) {
        OptionOrderContext.LegContext.RequestContext requestContext;
        Intrinsics.checkNotNullParameter(optionOrderContext, "optionOrderContext");
        OptionConfigurationSelectionFragment.Companion companion = OptionConfigurationSelectionFragment.INSTANCE;
        String symbol = optionOrderContext.getRequestContext().getOptionChain().getOptionChain().getSymbol();
        boolean isLateClosing = optionOrderContext.getRequestContext().getOptionChain().getOptionChain().getIsLateClosing();
        boolean zIsMultiLeg = optionOrderContext.getApiRequest().isMultiLeg();
        OptionStrategyType openingStrategyType = optionOrderContext.getStrategyContext().getOpeningStrategyType();
        boolean z = false;
        if (openingStrategyType != null && openingStrategyType == optionOrderContext.getStrategyContext().getClosingStrategyType()) {
            z = true;
        }
        boolean z2 = z;
        OrderDirection netDirection = optionOrderContext.getPrices().getNetDirection();
        if (netDirection == null) {
            netDirection = OrderDirection.DEBIT;
        }
        OrderDirection orderDirection = netDirection;
        OptionOrderContext.LegContext legContext = (OptionOrderContext.LegContext) CollectionsKt.singleOrNull((List) optionOrderContext.getLegContexts());
        replaceFragment(companion.newInstance((Parcelable) new OptionConfigurationSelectionFragment.Args(symbol, isLateClosing, zIsMultiLeg, z2, orderDirection, (legContext == null || (requestContext = legContext.getRequestContext()) == null) ? null : requestContext.getPositionEffect(), optionOrderContext.getApiRequest().getTime_in_force(), optionOrderContext.getPrices().getUserInputPrices().getOptionOrderType())));
    }

    private final void setOptionOrderTypeAndGoBack(OptionOrderType optionOrderType) {
        getOrderCreateFragment().setOptionOrderType(optionOrderType, true);
        popLastFragment();
    }

    private final void openOptionOrderEducation(OptionOrderEducationType optionOrderEducationType) {
        OrderSide optionSide;
        OptionConfigurationBundle optionConfigurationBundle;
        OptionOrderBundle optionOrderBundle = this.optionOrderBundle;
        if (optionOrderBundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionOrderBundle");
            optionOrderBundle = null;
        }
        OptionLegBundle optionLegBundle = (OptionLegBundle) CollectionsKt.singleOrNull((List) optionOrderBundle.getLegBundles());
        if (optionLegBundle == null || (optionConfigurationBundle = optionLegBundle.getOptionConfigurationBundle()) == null || (optionSide = optionConfigurationBundle.getOptionSide()) == null) {
            optionSide = OrderSide.BUY;
        }
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new OptionOrderEducationFragmentKey(optionSide, optionOrderEducationType), null, 2, null));
    }

    @Override // com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment.Callbacks
    public void onOrderConfigurationSelected(Order.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        OptionOrderType optionOrderType = OptionOrderType2.toOptionOrderType(configuration);
        OptionOrderEducationType optionOrderEducationType = OptionOrderType2.toOptionOrderEducationType(optionOrderType);
        if (optionOrderEducationType != null && getOptionOrderDiscoveryStore().shouldShowOptionOrderEducation(optionOrderEducationType)) {
            openOptionOrderEducation(optionOrderEducationType);
        } else {
            setOptionOrderTypeAndGoBack(optionOrderType);
        }
    }

    @Override // com.robinhood.android.trade.options.education.OptionOrderEducationFragment.Callbacks
    public void onOptionOrderEducationDismissed(OptionOrderEducationType optionOrderEducationType) {
        Intrinsics.checkNotNullParameter(optionOrderEducationType, "optionOrderEducationType");
        popLastFragment();
        setOptionOrderTypeAndGoBack(OptionOrderType2.toOptionOrderType(optionOrderEducationType));
    }

    @Override // com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment.Callbacks
    public void onOrderTimeInForceSelected(OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
        getOrderCreateFragment().setTimeInForce(orderTimeInForce, true);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    protected void onOrderSendingOrSubmitted() {
        if (this.postConfirmation) {
            return;
        }
        super.onOrderSendingOrSubmitted();
    }

    @Override // com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.Callbacks
    public void onStartPostConfirmationFlow() {
        this.postConfirmation = true;
        Fragment currentFragment = getCurrentFragment();
        OptionOrderConfirmationFragment optionOrderConfirmationFragment = currentFragment instanceof OptionOrderConfirmationFragment ? (OptionOrderConfirmationFragment) currentFragment : null;
        if (optionOrderConfirmationFragment != null) {
            optionOrderConfirmationFragment.animateConfirmationExit();
        }
    }

    @Override // com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.Callbacks
    public void onConfirmationExitAnimationFinished() {
        new ReplaceFragmentBuilder(OptionPostTradeAlertFragment.INSTANCE.newInstance()).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    /* compiled from: OptionOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u00020\t*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/trade/options/OptionOrderActivity;", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "<init>", "()V", "SAVE_PASSTHROUGH_CONTEXT", "", "canShowProfitLoss", "", "getCanShowProfitLoss", "(Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;)Z", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OptionOrderActivity, OptionOrderIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OptionOrderIntentKey getExtras(OptionOrderActivity optionOrderActivity) {
            return (OptionOrderIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, optionOrderActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, OptionOrderIntentKey optionOrderIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, optionOrderIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, OptionOrderIntentKey optionOrderIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, optionOrderIntentKey);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getCanShowProfitLoss(OptionOrderIntentKey optionOrderIntentKey) {
            return Intrinsics.areEqual(optionOrderIntentKey.getTransitionReason(), TransitionReason.OPTION_TRADE_CHAIN) || Intrinsics.areEqual(optionOrderIntentKey.getTransitionReason(), OptionOrderIntentKey.TRANSITION_REASON_SWIPE_TO_TRADE);
        }
    }
}
