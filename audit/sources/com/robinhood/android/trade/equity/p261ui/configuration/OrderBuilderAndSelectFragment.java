package com.robinhood.android.trade.equity.p261ui.configuration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderConfigurationCallbacks;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.options.contracts.OptionOnboarding4;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceScreenType;
import com.robinhood.android.trade.equity.p261ui.configuration.selection.OrderConfigurationContextFactory;
import com.robinhood.android.trade.equity.p261ui.configuration.selection.OrderConfigurationSelectionFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.timeinforce.OrderTimeInForceFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.trailingstop.TrailingStopFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.trailingstop.TrailingStopScreenType;
import com.robinhood.android.trade.equity.p261ui.loadoptionchain.LoadOptionsChainFragment;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.Buildable;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder2;
import com.robinhood.android.trading.contracts.configuration.DirectOrder4;
import com.robinhood.android.trading.contracts.configuration.DirectOrder5;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration3;
import com.robinhood.android.trading.contracts.configuration.ShareStopLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.android.trading.contracts.configuration.ShareTrailingStop;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.shared.education.order.OrderTypeEducationManager;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: OrderBuilderAndSelectFragment.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 w2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002vwB\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0012\u0010B\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0018\u0010E\u001a\u00020<2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0016J(\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u0002082\u0006\u0010-\u001a\u00020.2\u0006\u0010N\u001a\u000208H\u0016J\b\u0010O\u001a\u00020<H\u0016J\u0010\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020<2\u0006\u0010F\u001a\u00020TH\u0016J\u001c\u0010U\u001a\u00020<2\b\b\u0001\u0010V\u001a\u00020>2\b\b\u0001\u0010W\u001a\u00020>H\u0016J\u0018\u0010X\u001a\u00020<2\u0006\u0010F\u001a\u00020L2\u0006\u0010Y\u001a\u00020\fH\u0016J\u0018\u0010Z\u001a\u00020<2\u0006\u0010F\u001a\u00020L2\u0006\u0010Y\u001a\u00020\fH\u0016J\u0018\u0010[\u001a\u00020<2\u0006\u0010F\u001a\u00020L2\u0006\u0010Y\u001a\u00020\fH\u0016J\u0018\u0010\\\u001a\u00020<2\u0006\u0010F\u001a\u00020G2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010]\u001a\u00020<2\u0006\u0010F\u001a\u00020L2\u0006\u0010M\u001a\u000208H\u0016J\u0018\u0010^\u001a\u00020<2\u0006\u0010F\u001a\u00020L2\u0006\u0010M\u001a\u000208H\u0002J\b\u0010_\u001a\u00020<H\u0016J\u0018\u0010`\u001a\u00020a2\u0006\u0010K\u001a\u00020L2\u0006\u0010b\u001a\u000208H\u0002J\u0018\u0010c\u001a\u00020<2\u0006\u0010F\u001a\u00020L2\u0006\u0010b\u001a\u000208H\u0002J\u0018\u0010d\u001a\u00020<2\u0006\u0010K\u001a\u00020L2\u0006\u0010b\u001a\u000208H\u0002J\u0018\u0010e\u001a\u00020f2\u0006\u0010K\u001a\u00020L2\u0006\u0010b\u001a\u000208H\u0002J\u0018\u0010g\u001a\u00020<2\u0006\u0010K\u001a\u00020L2\u0006\u0010b\u001a\u000208H\u0002J \u0010h\u001a\u00020i2\u0006\u0010K\u001a\u00020L2\u0006\u0010-\u001a\u00020.2\u0006\u0010b\u001a\u000208H\u0002J\u0010\u0010j\u001a\u00020a2\u0006\u0010K\u001a\u00020LH\u0002J\u001c\u0010k\u001a\u00020<2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0002J\u0018\u0010l\u001a\u00020<2\u0006\u0010H\u001a\u00020I2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010m\u001a\u00020<2\u0006\u0010H\u001a\u00020I2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0018\u0010n\u001a\u00020<2\u0006\u0010H\u001a\u00020I2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010o\u001a\u00020<2\u0006\u0010p\u001a\u00020qH\u0016J\b\u0010r\u001a\u00020<H\u0002J\u0018\u0010s\u001a\u00020<2\u0006\u0010K\u001a\u00020L2\u0006\u0010b\u001a\u000208H\u0002J\u001a\u0010t\u001a\u00020a2\u0006\u0010F\u001a\u00020G2\b\u0010u\u001a\u0004\u0018\u00010IH\u0002R/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R/\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00107\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006x"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/OrderBuilderAndSelectFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Callbacks;", "Lcom/robinhood/shared/education/order/OrderTypeEducationFragmentCallbacks;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionsChainFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "<init>", "()V", "<set-?>", "Ljava/math/BigDecimal;", "stopPrice", "getStopPrice", "()Ljava/math/BigDecimal;", "setStopPrice", "(Ljava/math/BigDecimal;)V", "stopPrice$delegate", "Lkotlin/properties/ReadWriteProperty;", "limitPrice", "getLimitPrice", "setLimitPrice", "limitPrice$delegate", "Lcom/robinhood/models/db/OrderTrailingPeg;", "trailingPeg", "getTrailingPeg", "()Lcom/robinhood/models/db/OrderTrailingPeg;", "setTrailingPeg", "(Lcom/robinhood/models/db/OrderTrailingPeg;)V", "trailingPeg$delegate", "orderConfigurationContext", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", "getOrderConfigurationContext", "()Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", "callbacks", "Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderConfigurationCallbacks;", "getCallbacks", "()Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderConfigurationCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "getOrderTypeEducationManager", "()Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "setOrderTypeEducationManager", "(Lcom/robinhood/shared/education/order/OrderTypeEducationManager;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onActivityResult", "", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTimeInForceClicked", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "onOrderConfigurationSelected", "directOrder", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "taxLots", "isBuyToClose", "onOptionsUpgradeHookSelected", "onSduiBottomSheetPresented", "sheetListener", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "onOrderTypeEducationFinished", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "onLearnMoreClicked", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "onOrderLimitPriceValidated", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "onOrderStopLossPriceValidated", "onOrderStopLimitPriceValidated", "onOrderTrailAmountValidated", "onOrderTypeEducationAction", "onStreamlinedOrderTypeEducationAction", "onOptionsChainLoadFailed", "getStopLossPriceFragment", "Landroidx/fragment/app/Fragment;", "showEducation", "showStopLossPriceFragment", "showStopLimitPriceFragment", "getStopLimitPriceFragment", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment;", "showTrailingStopAmountFragment", "getTrailingStopAmountFragment", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment;", "getLimitPriceFragment", "onLimitConfigurationComplete", "onStopLossConfigurationComplete", "onStopLimitConfigurationComplete", "onTrailingStopConfigurationComplete", "onRecurringOrderConfigurationSelected", "accountNumber", "", "listenForRecurringOrderCallback", "showOrderFlow", "getOrderTimeInForceFragment", "defaultTimeInForce", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderBuilderAndSelectFragment extends BaseRhBottomSheetDialogHostFragment implements OrderConfigurationSelectionFragment.Callbacks, OrderPriceFragment.Callbacks, TrailingStopFragment.Callbacks, OrderTypeEducationFragmentCallbacks, OrderTimeInForceFragment.Callbacks, LoadOptionsChainFragment.Callbacks, RhBottomSheetDialogFragment.OnClickListener {
    private static final int REQUEST_CODE_INVEST_FLOW = 1001;
    private static final int REQUEST_CODE_OPTIONS_UPGRADE_COMPLETE = 1000;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: limitPrice$delegate, reason: from kotlin metadata */
    private final Interfaces3 limitPrice;
    public OrderTypeEducationManager orderTypeEducationManager;

    /* renamed from: stopPrice$delegate, reason: from kotlin metadata */
    private final Interfaces3 stopPrice;

    /* renamed from: trailingPeg$delegate, reason: from kotlin metadata */
    private final Interfaces3 trailingPeg;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(OrderBuilderAndSelectFragment.class, "stopPrice", "getStopPrice()Ljava/math/BigDecimal;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OrderBuilderAndSelectFragment.class, "limitPrice", "getLimitPrice()Ljava/math/BigDecimal;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OrderBuilderAndSelectFragment.class, "trailingPeg", "getTrailingPeg()Lcom/robinhood/models/db/OrderTrailingPeg;", 0)), Reflection.property1(new PropertyReference1Impl(OrderBuilderAndSelectFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderConfigurationCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderBuilderAndSelectFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public OrderBuilderAndSelectFragment() {
        super(C11048R.layout.parent_fragment_container);
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.stopPrice = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[0]);
        this.limitPrice = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[1]);
        this.trailingPeg = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[2]);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(EquityOrderConfigurationCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.configuration.OrderBuilderAndSelectFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EquityOrderConfigurationCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final BigDecimal getStopPrice() {
        return (BigDecimal) this.stopPrice.getValue(this, $$delegatedProperties[0]);
    }

    private final void setStopPrice(BigDecimal bigDecimal) {
        this.stopPrice.setValue(this, $$delegatedProperties[0], bigDecimal);
    }

    private final BigDecimal getLimitPrice() {
        return (BigDecimal) this.limitPrice.getValue(this, $$delegatedProperties[1]);
    }

    private final void setLimitPrice(BigDecimal bigDecimal) {
        this.limitPrice.setValue(this, $$delegatedProperties[1], bigDecimal);
    }

    private final OrderTrailingPeg getTrailingPeg() {
        return (OrderTrailingPeg) this.trailingPeg.getValue(this, $$delegatedProperties[2]);
    }

    private final void setTrailingPeg(OrderTrailingPeg orderTrailingPeg) {
        this.trailingPeg.setValue(this, $$delegatedProperties[2], orderTrailingPeg);
    }

    private final OrderConfigurationContextFactory.OrderConfigurationContext getOrderConfigurationContext() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getOrderConfigurationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderConfigurationCallbacks getCallbacks() {
        return (EquityOrderConfigurationCallbacks) this.callbacks.getValue(this, $$delegatedProperties[3]);
    }

    private final UUID getInstrumentId() {
        return getOrderConfigurationContext().getInstrumentId();
    }

    private final EquityOrderSide getSide() {
        return getOrderConfigurationContext().getSide();
    }

    public final OrderTypeEducationManager getOrderTypeEducationManager() {
        OrderTypeEducationManager orderTypeEducationManager = this.orderTypeEducationManager;
        if (orderTypeEducationManager != null) {
            return orderTypeEducationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderTypeEducationManager");
        return null;
    }

    public final void setOrderTypeEducationManager(OrderTypeEducationManager orderTypeEducationManager) {
        Intrinsics.checkNotNullParameter(orderTypeEducationManager, "<set-?>");
        this.orderTypeEducationManager = orderTypeEducationManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000) {
            if (resultCode == OptionOnboarding4.Result.Success.INSTANCE.getResultCode()) {
                replaceFragment(LoadOptionsChainFragment.INSTANCE.newInstance((Parcelable) new LoadOptionsChainFragment.Args(getInstrumentId(), getOrderConfigurationContext().getAccountNumber())));
            }
        } else if (requestCode == 1001 && resultCode == 1) {
            requireActivity().finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Fragment trailingStopAmountFragment;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Buildable configuration = ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
            if (configuration != null) {
                int i = C11048R.id.fragment_container;
                if (configuration instanceof ShareStopLoss) {
                    trailingStopAmountFragment = getStopLossPriceFragment(configuration, false);
                } else if (configuration instanceof ShareStopLimit) {
                    trailingStopAmountFragment = getStopLimitPriceFragment(configuration, false);
                } else {
                    if (!(configuration instanceof ShareTrailingStop)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    trailingStopAmountFragment = getTrailingStopAmountFragment(configuration, getSide(), false);
                }
                setFragment(i, trailingStopAmountFragment);
                return;
            }
            setFragment(C11048R.id.fragment_container, OrderConfigurationSelectionFragment.INSTANCE.newInstance((Parcelable) getOrderConfigurationContext()));
        }
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment.Callbacks
    public void onTimeInForceClicked(Order.Configuration configuration, OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        int i = WhenMappings.$EnumSwitchMapping$0[configuration.ordinal()];
        if (i == 1) {
            BigDecimal limitPrice = getLimitPrice();
            if (limitPrice != null) {
                onLimitConfigurationComplete(limitPrice, timeInForce);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (i == 2) {
            BigDecimal stopPrice = getStopPrice();
            if (stopPrice == null) {
                throw new IllegalStateException("Required value was null.");
            }
            onStopLossConfigurationComplete(timeInForce, stopPrice);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                OrderTrailingPeg trailingPeg = getTrailingPeg();
                if (trailingPeg != null) {
                    onTrailingStopConfigurationComplete(timeInForce, trailingPeg);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(configuration);
            throw new ExceptionsH();
        }
        BigDecimal stopPrice2 = getStopPrice();
        if (stopPrice2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BigDecimal limitPrice2 = getLimitPrice();
        if (limitPrice2 != null) {
            onStopLimitConfigurationComplete(timeInForce, stopPrice2, limitPrice2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment.Callbacks
    public void onOrderConfigurationSelected(DirectOrder directOrder, boolean taxLots, EquityOrderSide side, boolean isBuyToClose) {
        Intrinsics.checkNotNullParameter(directOrder, "directOrder");
        Intrinsics.checkNotNullParameter(side, "side");
        if (!taxLots && getOrderTypeEducationManager().shouldShowEducation(directOrder.getOrderConfiguration(), null, side, isBuyToClose)) {
            onStreamlinedOrderTypeEducationAction(directOrder, taxLots);
        } else {
            showOrderFlow(directOrder, false);
        }
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment.Callbacks
    public void onOptionsUpgradeHookSelected() {
        setTransitionReason(TransitionReason.OPTION_UPGRADE_ORDER_TYPES);
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new OptionOnboarding(new OptionOnboarding2.AccountNumber(((Args) INSTANCE.getArgs((Fragment) this)).getOrderConfigurationContext().getAccountNumber()), new OptionOnboarding.OptionOnboardingSource.Legacy("equity_order_config"), null, 4, null), 1000, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment.Callbacks
    public void onSduiBottomSheetPresented(RhBottomSheetDialogFragmentHost.SheetListener sheetListener) {
        Intrinsics.checkNotNullParameter(sheetListener, "sheetListener");
        setSheetListener(sheetListener);
    }

    @Override // com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks
    public void onOrderTypeEducationFinished(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) {
            showOrderFlow(((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) configuration).getDirectOrder(), true);
        } else {
            if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks)) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(configuration);
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks
    public void onLearnMoreClicked(int titleRes, int descriptionRes) {
        replaceFragment(OrderTypeEducationLearnMoreFragment.INSTANCE.newInstance(titleRes, descriptionRes));
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment.Callbacks
    public void onOrderLimitPriceValidated(DirectOrder configuration, BigDecimal price) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(price, "price");
        setLimitPrice(price);
        Order.Configuration orderConfiguration = configuration.getOrderConfiguration();
        Buildable configuration2 = ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
        replaceFragment(getOrderTimeInForceFragment(orderConfiguration, configuration2 != null ? configuration2.getTimeInForce() : null));
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment.Callbacks
    public void onOrderStopLossPriceValidated(DirectOrder configuration, BigDecimal price) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(price, "price");
        setStopPrice(price);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getOrderConfigurationContext().getSide() == EquityOrderSide.SELL_SHORT) {
            onTimeInForceClicked(configuration.getOrderConfiguration(), OrderTimeInForce.GFD);
            return;
        }
        Order.Configuration orderConfiguration = configuration.getOrderConfiguration();
        Buildable configuration2 = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
        replaceFragment(getOrderTimeInForceFragment(orderConfiguration, configuration2 != null ? configuration2.getTimeInForce() : null));
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment.Callbacks
    public void onOrderStopLimitPriceValidated(DirectOrder configuration, BigDecimal price) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(price, "price");
        setStopPrice(price);
        replaceFragment(getLimitPriceFragment(configuration));
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment.Callbacks
    public void onOrderTrailAmountValidated(Order.Configuration configuration, OrderTrailingPeg trailingPeg) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
        setTrailingPeg(trailingPeg);
        Buildable configuration2 = ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
        replaceFragment(getOrderTimeInForceFragment(configuration, configuration2 != null ? configuration2.getTimeInForce() : null));
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment.Callbacks, com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment.Callbacks
    public void onOrderTypeEducationAction(DirectOrder configuration, boolean taxLots) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new OrderTypeEducationFragmentKey(new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder(configuration, getSide(), taxLots, getInstrumentId())), null, 2, null));
    }

    private final void onStreamlinedOrderTypeEducationAction(DirectOrder configuration, boolean taxLots) {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new OrderTypeEducationFragmentKey(new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder(configuration, getSide(), taxLots, getInstrumentId())), null, 2, null));
    }

    @Override // com.robinhood.android.trade.equity.ui.loadoptionchain.LoadOptionsChainFragment.Callbacks
    public void onOptionsChainLoadFailed() {
        BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
    }

    private final Fragment getStopLossPriceFragment(DirectOrder directOrder, boolean showEducation) {
        OrderPriceScreenType orderPriceScreenType;
        int i = WhenMappings.$EnumSwitchMapping$1[getSide().ordinal()];
        if (i == 1) {
            orderPriceScreenType = OrderPriceScreenType.BUY_STOP_LOSS;
        } else if (i == 2) {
            orderPriceScreenType = OrderPriceScreenType.SELL_STOP_LOSS;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            orderPriceScreenType = OrderPriceScreenType.SELL_SHORT_STOP_LOSS;
        }
        OrderPriceScreenType orderPriceScreenType2 = orderPriceScreenType;
        OrderPriceFragment.Companion companion = OrderPriceFragment.INSTANCE;
        UUID instrumentId = getInstrumentId();
        Companion companion2 = INSTANCE;
        return companion.newInstance((Parcelable) new OrderPriceFragment.Args(directOrder, orderPriceScreenType2, instrumentId, showEducation, ((Args) companion2.getArgs((Fragment) this)).getFlowSource(), ((Args) companion2.getArgs((Fragment) this)).getOrderToReplaceId()));
    }

    private final void showStopLossPriceFragment(DirectOrder configuration, boolean showEducation) {
        replaceFragment(getStopLossPriceFragment(configuration, showEducation));
    }

    private final void showStopLimitPriceFragment(DirectOrder directOrder, boolean showEducation) {
        replaceFragment(getStopLimitPriceFragment(directOrder, showEducation));
    }

    private final OrderPriceFragment getStopLimitPriceFragment(DirectOrder directOrder, boolean showEducation) {
        OrderPriceScreenType orderPriceScreenType;
        OrderPriceFragment.Companion companion = OrderPriceFragment.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$1[getSide().ordinal()];
        if (i == 1) {
            orderPriceScreenType = OrderPriceScreenType.BUY_STOP_LIMIT;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("stop limit short orders not supported");
            }
            orderPriceScreenType = OrderPriceScreenType.SELL_STOP_LIMIT;
        }
        OrderPriceScreenType orderPriceScreenType2 = orderPriceScreenType;
        UUID instrumentId = getInstrumentId();
        Companion companion2 = INSTANCE;
        return (OrderPriceFragment) companion.newInstance((Parcelable) new OrderPriceFragment.Args(directOrder, orderPriceScreenType2, instrumentId, showEducation, ((Args) companion2.getArgs((Fragment) this)).getFlowSource(), ((Args) companion2.getArgs((Fragment) this)).getOrderToReplaceId()));
    }

    private final void showTrailingStopAmountFragment(DirectOrder directOrder, boolean showEducation) {
        replaceFragment(getTrailingStopAmountFragment(directOrder, getSide(), showEducation));
    }

    private final TrailingStopFragment getTrailingStopAmountFragment(DirectOrder directOrder, EquityOrderSide side, boolean showEducation) {
        TrailingStopScreenType trailingStopScreenType;
        int i = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
        if (i == 1) {
            trailingStopScreenType = TrailingStopScreenType.BUY_TRAILING_STOP_AMOUNT;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("trailing stop short orders not supported");
            }
            trailingStopScreenType = TrailingStopScreenType.SELL_TRAILING_STOP_AMOUNT;
        }
        return (TrailingStopFragment) TrailingStopFragment.INSTANCE.newInstance((Parcelable) new TrailingStopFragment.Args(directOrder, trailingStopScreenType, getInstrumentId(), showEducation));
    }

    private final Fragment getLimitPriceFragment(DirectOrder directOrder) {
        OrderPriceScreenType orderPriceScreenType;
        int i = WhenMappings.$EnumSwitchMapping$1[getSide().ordinal()];
        if (i == 1) {
            orderPriceScreenType = OrderPriceScreenType.BUY_LIMIT;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("should use advanced order flow for short limit orders");
            }
            orderPriceScreenType = OrderPriceScreenType.SELL_LIMIT;
        }
        OrderPriceScreenType orderPriceScreenType2 = orderPriceScreenType;
        OrderPriceFragment.Companion companion = OrderPriceFragment.INSTANCE;
        UUID instrumentId = getInstrumentId();
        Companion companion2 = INSTANCE;
        return companion.newInstance((Parcelable) new OrderPriceFragment.Args(directOrder, orderPriceScreenType2, instrumentId, false, ((Args) companion2.getArgs((Fragment) this)).getFlowSource(), ((Args) companion2.getArgs((Fragment) this)).getOrderToReplaceId()));
    }

    private final void onLimitConfigurationComplete(BigDecimal limitPrice, OrderTimeInForce timeInForce) {
        EquityOrderConfigurationCallbacks callbacks = getCallbacks();
        String accountNumber = getOrderConfigurationContext().getAccountNumber();
        Companion companion = INSTANCE;
        Buildable configuration = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
        BigDecimal shareQuantity = configuration != null ? configuration.getShareQuantity() : null;
        if (limitPrice == null) {
            Buildable configuration2 = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
            limitPrice = configuration2 != null ? EquityOrderConfiguration3.getLimitPrice(configuration2) : null;
        }
        if (timeInForce == null) {
            Buildable configuration3 = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
            timeInForce = configuration3 != null ? configuration3.getTimeInForce() : null;
        }
        Buildable configuration4 = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
        callbacks.onOrderConfigurationResult(new AdvancedOrder.LimitNew(accountNumber, shareQuantity, limitPrice, timeInForce, configuration4 != null ? EquityOrderConfiguration3.getOverrideMarketHours(configuration4) : null, false));
    }

    private final void onStopLossConfigurationComplete(OrderTimeInForce timeInForce, BigDecimal stopPrice) {
        EquityOrderConfigurationCallbacks callbacks = getCallbacks();
        String accountNumber = getOrderConfigurationContext().getAccountNumber();
        Buildable configuration = ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
        callbacks.onOrderConfigurationResult(new ShareStopLoss.New(accountNumber, configuration != null ? configuration.getShareQuantity() : null, stopPrice, timeInForce, null, 16, null));
    }

    private final void onStopLimitConfigurationComplete(OrderTimeInForce timeInForce, BigDecimal stopPrice, BigDecimal limitPrice) {
        EquityOrderConfigurationCallbacks callbacks = getCallbacks();
        String accountNumber = getOrderConfigurationContext().getAccountNumber();
        Buildable configuration = ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
        callbacks.onOrderConfigurationResult(new ShareStopLimit.New(accountNumber, limitPrice, configuration != null ? configuration.getShareQuantity() : null, stopPrice, timeInForce, null, 32, null));
    }

    private final void onTrailingStopConfigurationComplete(OrderTimeInForce timeInForce, OrderTrailingPeg trailingPeg) {
        EquityOrderConfigurationCallbacks callbacks = getCallbacks();
        String accountNumber = getOrderConfigurationContext().getAccountNumber();
        Buildable configuration = ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
        callbacks.onOrderConfigurationResult(new ShareTrailingStop.New(accountNumber, configuration != null ? configuration.getShareQuantity() : null, trailingPeg, timeInForce, null, 16, null));
    }

    @Override // com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment.Callbacks
    public void onRecurringOrderConfigurationSelected(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        listenForRecurringOrderCallback();
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new InvestFlowIntentKey((InvestFlowStep) InvestFlowStep.Frequency.INSTANCE, true, false, false, CollectionsKt.listOf(getInstrumentId()), accountNumber, (BigDecimal) null, (InvestFlowFrequency) null, false, (AllocationStrategy) null, (InvestFlowLoggingParams) null, 1996, (DefaultConstructorMarker) null), 1001, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    private final void listenForRecurringOrderCallback() {
        getChildFragmentManager().setFragmentResultListener(ReturnedData.EXTRA_RETURNED_DATA, this, new FragmentResultListener() { // from class: com.robinhood.android.trade.equity.ui.configuration.OrderBuilderAndSelectFragment.listenForRecurringOrderCallback.1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                EquityOrderConfigurationCallbacks callbacks = OrderBuilderAndSelectFragment.this.getCallbacks();
                Parcelable parcelable = bundle.getParcelable(ReturnedData.EXTRA_RETURNED_DATA);
                if (parcelable != null) {
                    callbacks.onOrderConfigurationResult(new EquityOrderConfiguration.Recurring((RecurringOrderConfiguration) parcelable));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
    }

    private final void showOrderFlow(DirectOrder directOrder, boolean showEducation) {
        if ((directOrder instanceof DirectOrder4) || (directOrder instanceof DirectOrder5) || (directOrder instanceof DirectOrder2)) {
            getCallbacks().onOrderConfigurationResult(directOrder);
            return;
        }
        if (directOrder instanceof ShareStopLoss) {
            showStopLossPriceFragment(directOrder, showEducation);
        } else if (directOrder instanceof ShareStopLimit) {
            showStopLimitPriceFragment(directOrder, showEducation);
        } else {
            if (!(directOrder instanceof ShareTrailingStop)) {
                throw new NoWhenBranchMatchedException();
            }
            showTrailingStopAmountFragment(directOrder, showEducation);
        }
    }

    private final Fragment getOrderTimeInForceFragment(Order.Configuration configuration, OrderTimeInForce defaultTimeInForce) {
        OrderTimeInForceFragment.Companion companion = OrderTimeInForceFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        return companion.newInstance((Parcelable) new OrderTimeInForceFragment.Args(configuration, defaultTimeInForce, ((Args) companion2.getArgs((Fragment) this)).getFlowSource(), ((Args) companion2.getArgs((Fragment) this)).getOrderToReplaceId() != null));
    }

    /* compiled from: OrderBuilderAndSelectFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/OrderBuilderAndSelectFragment$Args;", "Landroid/os/Parcelable;", "orderConfigurationContext", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "orderToReplaceId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;Lcom/robinhood/android/trading/contracts/configuration/Buildable;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/util/UUID;)V", "getOrderConfigurationContext", "()Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getOrderToReplaceId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Buildable configuration;
        private final EquityOrderFlowSource flowSource;
        private final OrderConfigurationContextFactory.OrderConfigurationContext orderConfigurationContext;
        private final UUID orderToReplaceId;

        /* compiled from: OrderBuilderAndSelectFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(OrderConfigurationContextFactory.OrderConfigurationContext.CREATOR.createFromParcel(parcel), (Buildable) parcel.readParcelable(Args.class.getClassLoader()), EquityOrderFlowSource.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OrderConfigurationContextFactory.OrderConfigurationContext orderConfigurationContext, Buildable buildable, EquityOrderFlowSource equityOrderFlowSource, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                orderConfigurationContext = args.orderConfigurationContext;
            }
            if ((i & 2) != 0) {
                buildable = args.configuration;
            }
            if ((i & 4) != 0) {
                equityOrderFlowSource = args.flowSource;
            }
            if ((i & 8) != 0) {
                uuid = args.orderToReplaceId;
            }
            return args.copy(orderConfigurationContext, buildable, equityOrderFlowSource, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderConfigurationContextFactory.OrderConfigurationContext getOrderConfigurationContext() {
            return this.orderConfigurationContext;
        }

        /* renamed from: component2, reason: from getter */
        public final Buildable getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component3, reason: from getter */
        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getOrderToReplaceId() {
            return this.orderToReplaceId;
        }

        public final Args copy(OrderConfigurationContextFactory.OrderConfigurationContext orderConfigurationContext, Buildable configuration, EquityOrderFlowSource flowSource, UUID orderToReplaceId) {
            Intrinsics.checkNotNullParameter(orderConfigurationContext, "orderConfigurationContext");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            return new Args(orderConfigurationContext, configuration, flowSource, orderToReplaceId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.orderConfigurationContext, args.orderConfigurationContext) && Intrinsics.areEqual(this.configuration, args.configuration) && this.flowSource == args.flowSource && Intrinsics.areEqual(this.orderToReplaceId, args.orderToReplaceId);
        }

        public int hashCode() {
            int iHashCode = this.orderConfigurationContext.hashCode() * 31;
            Buildable buildable = this.configuration;
            int iHashCode2 = (((iHashCode + (buildable == null ? 0 : buildable.hashCode())) * 31) + this.flowSource.hashCode()) * 31;
            UUID uuid = this.orderToReplaceId;
            return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
        }

        public String toString() {
            return "Args(orderConfigurationContext=" + this.orderConfigurationContext + ", configuration=" + this.configuration + ", flowSource=" + this.flowSource + ", orderToReplaceId=" + this.orderToReplaceId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.orderConfigurationContext.writeToParcel(dest, flags);
            dest.writeParcelable(this.configuration, flags);
            dest.writeString(this.flowSource.name());
            dest.writeSerializable(this.orderToReplaceId);
        }

        public Args(OrderConfigurationContextFactory.OrderConfigurationContext orderConfigurationContext, Buildable buildable, EquityOrderFlowSource flowSource, UUID uuid) {
            Intrinsics.checkNotNullParameter(orderConfigurationContext, "orderConfigurationContext");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.orderConfigurationContext = orderConfigurationContext;
            this.configuration = buildable;
            this.flowSource = flowSource;
            this.orderToReplaceId = uuid;
        }

        public final OrderConfigurationContextFactory.OrderConfigurationContext getOrderConfigurationContext() {
            return this.orderConfigurationContext;
        }

        public final Buildable getConfiguration() {
            return this.configuration;
        }

        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        public final UUID getOrderToReplaceId() {
            return this.orderToReplaceId;
        }
    }

    /* compiled from: OrderBuilderAndSelectFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/OrderBuilderAndSelectFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/OrderBuilderAndSelectFragment;", "Lcom/robinhood/android/trade/equity/ui/configuration/OrderBuilderAndSelectFragment$Args;", "<init>", "()V", "REQUEST_CODE_OPTIONS_UPGRADE_COMPLETE", "", "REQUEST_CODE_INVEST_FLOW", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderBuilderAndSelectFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OrderBuilderAndSelectFragment orderBuilderAndSelectFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderBuilderAndSelectFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderBuilderAndSelectFragment newInstance(Args args) {
            return (OrderBuilderAndSelectFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderBuilderAndSelectFragment orderBuilderAndSelectFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderBuilderAndSelectFragment, args);
        }
    }
}
