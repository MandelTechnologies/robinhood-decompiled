package com.robinhood.android.trade.equity.p261ui.configuration.price;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.databinding.FragmentOrderPriceBinding;
import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceFragmentEvent;
import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceViewState;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceContext;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceFailureResolver;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceStep;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceValidator;
import com.robinhood.android.trade.equity.p261ui.configuration.toolbar.OrderConfigurationToolbar;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.PriceTextWatcher;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OrderPriceFragment.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003UVWB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0016J\u001a\u00102\u001a\u00020,2\u0006\u00103\u001a\u0002042\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0018\u00105\u001a\u00020,2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0014J\u0010\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020,H\u0016J\u001a\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010A\u001a\u00020*2\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020GH\u0002J*\u0010H\u001a\u00020,2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00020J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0MH\u0002J\u0010\u0010N\u001a\u00020,2\u0006\u0010O\u001a\u00020DH\u0002J\u0016\u0010P\u001a\u00020,2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RH\u0002J\b\u0010T\u001a\u00020,H\u0002R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b&\u0010'¨\u0006X"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceFailureResolver;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "duxo", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/android/trade/equity/databinding/FragmentOrderPriceBinding;", "getBindings", "()Lcom/robinhood/android/trade/equity/databinding/FragmentOrderPriceBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Callbacks;", "callbacks$delegate", "boldTypeface", "Landroid/graphics/Typeface;", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface$delegate", "foregroundColor2", "", "getForegroundColor2", "()I", "foregroundColor2$delegate", "onBackPressed", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onResume", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "overridePrice", "newPrice", "Ljava/math/BigDecimal;", "setViewState", "state", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;", "handleAction", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "action", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "onPriceValidated", "validatedPrice", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragmentEvent;", "showMarketDataAlertDialog", "Callbacks", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderPriceFragment extends BaseFragment implements OrderPriceFailureResolver, AutoLoggableFragment {
    private static final String MARKET_DATA_ALERT_TAG = "market-data-alert";

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: foregroundColor2$delegate, reason: from kotlin metadata */
    private final Lazy foregroundColor2;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderPriceFragment.class, "bindings", "getBindings()Lcom/robinhood/android/trade/equity/databinding/FragmentOrderPriceBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OrderPriceFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Callbacks;", "", "onOrderTypeEducationAction", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "taxLots", "", "onOrderLimitPriceValidated", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "onOrderStopLimitPriceValidated", "onOrderStopLossPriceValidated", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderLimitPriceValidated(DirectOrder configuration, BigDecimal price);

        void onOrderStopLimitPriceValidated(DirectOrder configuration, BigDecimal price);

        void onOrderStopLossPriceValidated(DirectOrder configuration, BigDecimal price);

        void onOrderTypeEducationAction(DirectOrder configuration, boolean taxLots);
    }

    /* compiled from: OrderPriceFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderPriceScreenType.values().length];
            try {
                iArr[OrderPriceScreenType.BUY_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPriceScreenType.SELL_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderPriceScreenType.BUY_STOP_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderPriceScreenType.SELL_STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderPriceScreenType.BUY_STOP_LOSS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderPriceScreenType.SELL_STOP_LOSS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderPriceScreenType.SELL_SHORT_STOP_LOSS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<OrderPriceFragmentEvent> event) {
        EventConsumer<OrderPriceFragmentEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof OrderPriceFragmentEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m19278invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19278invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OrderPriceFragmentEvent orderPriceFragmentEvent = (OrderPriceFragmentEvent) event.getData();
                if (orderPriceFragmentEvent instanceof OrderPriceFragmentEvent.InitialPriceEvent) {
                    BigDecimal price = ((OrderPriceFragmentEvent.InitialPriceEvent) orderPriceFragmentEvent).getPrice();
                    if (price != null) {
                        this.overridePrice(price);
                        return;
                    }
                    return;
                }
                if (orderPriceFragmentEvent instanceof OrderPriceFragmentEvent.QuoteFetchError) {
                    this.getBindings().alertComposeView.setContent(OrderPriceFragment2.INSTANCE.getLambda$174039098$feature_trade_equity_externalDebug());
                }
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public OrderPriceFragment() {
        super(C29365R.layout.fragment_order_price);
        this.duxo = DuxosKt.duxo(this, OrderPriceDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, OrderPriceFragment5.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.boldTypeface = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderPriceFragment.boldTypeface_delegate$lambda$0(this.f$0);
            }
        });
        this.foregroundColor2 = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(OrderPriceFragment.foregroundColor2_delegate$lambda$1(this.f$0));
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name;
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getScreenType().getStep() == OrderPriceStep.LIMIT_PRICE) {
            name = Screen.Name.EQUITY_ENTER_LIMIT_PRICE_PAGE;
        } else {
            name = Screen.Name.EQUITY_ENTER_STOP_PRICE_PAGE;
        }
        return new Screen(name, ((Args) companion.getArgs((Fragment) this)).getFlowSource().getLoggingValue(), ((Args) companion.getArgs((Fragment) this)).getDirectOrder().getOrderConfiguration().name(), null, 8, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        Companion companion = INSTANCE;
        return ((Args) companion.getArgs((Fragment) this)).getDirectOrder().getOrderConfiguration().name() + PlaceholderUtils.XXShortPlaceholderText + ((Args) companion.getArgs((Fragment) this)).getScreenType().name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderPriceDuxo getDuxo() {
        return (OrderPriceDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOrderPriceBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOrderPriceBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface boldTypeface_delegate$lambda$0(OrderPriceFragment orderPriceFragment) {
        RhTypeface rhTypeface = RhTypeface.BOLD;
        android.content.Context contextRequireContext = orderPriceFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return rhTypeface.load(contextRequireContext);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    private final int getForegroundColor2() {
        return ((Number) this.foregroundColor2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int foregroundColor2_delegate$lambda$1(OrderPriceFragment orderPriceFragment) {
        android.content.Context contextRequireContext = orderPriceFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground2);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getDuxo().getStateFlow().getValue().getFinishActivityOnBack()) {
            requireActivity().finish();
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(((Args) INSTANCE.getArgs((Fragment) this)).getShowEducation());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        OrderConfigurationToolbar.INSTANCE.configureToolbar(toolbar, new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPriceFragment.configureToolbar$lambda$3(this.f$0, (TextView) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$3(final OrderPriceFragment orderPriceFragment, final TextView titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        LifecycleHost.DefaultImpls.bind$default(orderPriceFragment, ObservablesAndroid.observeOnMainThread(orderPriceFragment.asObservable(orderPriceFragment.getDuxo().getStateFlow())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPriceFragment.configureToolbar$lambda$3$lambda$2(titleText, orderPriceFragment, (OrderPriceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$3$lambda$2(TextView textView, OrderPriceFragment orderPriceFragment, OrderPriceViewState state) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        StringResource toolbarTitle = state.getToolbarTitle();
        if (toolbarTitle != null) {
            Resources resources = orderPriceFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = toolbarTitle.getText(resources);
        } else {
            text = null;
        }
        TextViewsKt.setVisibilityText(textView, text);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ConstraintLayout root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RhTextView rhTextView = getBindings().orderPriceTitleTxt;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getScreenType().getTitleRes());
        getBindings().orderPricePriceLabelTxt.setText(((Args) companion.getArgs((Fragment) this)).getScreenType().getPriceLabelRes());
        getBindings().orderPricePriceEdt.addTextChangedListener(new PriceTextWatcher());
        RdsNumpadContainerView rdsNumpadContainerView = getBindings().orderPriceNumpad;
        rdsNumpadContainerView.useDefaultKeyHandler();
        rdsNumpadContainerView.setOnButtonClick(new OrderPriceFragment9(getDuxo()));
        BaseFragment.collectDuxoState$default(this, null, new C294172(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C294183(null), 1, null);
    }

    /* compiled from: OrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$onViewCreated$2", m3645f = "OrderPriceFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$onViewCreated$2 */
    static final class C294172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294172(Continuation<? super C294172> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderPriceFragment.this.new C294172(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderPriceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ OrderPriceFragment $tmp0;

            AnonymousClass1(OrderPriceFragment orderPriceFragment) {
                this.$tmp0 = orderPriceFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, OrderPriceFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(OrderPriceViewState orderPriceViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setViewState = C294172.invokeSuspend$setViewState(this.$tmp0, orderPriceViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((OrderPriceViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(OrderPriceFragment orderPriceFragment, OrderPriceViewState orderPriceViewState, Continuation continuation) {
            orderPriceFragment.setViewState(orderPriceViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<OrderPriceViewState> stateFlow = OrderPriceFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderPriceFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: OrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$onViewCreated$3", m3645f = "OrderPriceFragment.kt", m3646l = {150}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$onViewCreated$3 */
    static final class C294183 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294183(Continuation<? super C294183> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderPriceFragment.this.new C294183(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294183) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderPriceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ OrderPriceFragment $tmp0;

            AnonymousClass1(OrderPriceFragment orderPriceFragment) {
                this.$tmp0 = orderPriceFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, OrderPriceFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<OrderPriceFragmentEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C294183.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<OrderPriceFragmentEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(OrderPriceFragment orderPriceFragment, Event event, Continuation continuation) {
            orderPriceFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(OrderPriceFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderPriceFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C29365R.menu.menu_order_price, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C29365R.id.action_education) {
            getCallbacks().onOrderTypeEducationAction(((Args) INSTANCE.getArgs((Fragment) this)).getDirectOrder(), false);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RhEditText orderPricePriceEdt = getBindings().orderPricePriceEdt;
        Intrinsics.checkNotNullExpressionValue(orderPricePriceEdt, "orderPricePriceEdt");
        Observable observableCompose = RxTextView.textChanges(orderPricePriceEdt).map(new io.reactivex.functions.Function() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final CharSequence apply(CharSequence text) {
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() > 0) {
                    OrderPriceFragment.this.getBindings().orderPricePriceEdt.setHint("");
                    return text;
                }
                OrderPriceFragment.this.getBindings().orderPricePriceEdt.setHint(OrderPriceFragment.this.requireContext().getString(C11048R.string.general_label_zero));
                return text;
            }
        }).compose(CharSequenceToPriceTransformer.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableCompose, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPriceFragment.onResume$lambda$5(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(OrderPriceFragment orderPriceFragment, Optional optional) {
        orderPriceFragment.getDuxo().setPrice((BigDecimal) optional.component1());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        Validator.Failure<OrderPriceContext, OrderPriceFailureResolver> failure = OrderPriceValidator.INSTANCE.getFailure(passthroughArgs);
        if (failure != null) {
            handleAction(failure, failure.onPositiveResponse(this, passthroughArgs));
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        Validator.Failure<OrderPriceContext, OrderPriceFailureResolver> failure = OrderPriceValidator.INSTANCE.getFailure(passthroughArgs);
        if (failure != null) {
            handleAction(failure, failure.onNegativeResponse(this, passthroughArgs));
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceFailureResolver
    public void overridePrice(BigDecimal newPrice) {
        Intrinsics.checkNotNullParameter(newPrice, "newPrice");
        RhEditText rhEditText = getBindings().orderPricePriceEdt;
        rhEditText.setText(Formats.getNoSymbolCurrencyFormat().format(newPrice));
        Editable text = rhEditText.getText();
        rhEditText.setSelection(text != null ? text.length() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final OrderPriceViewState state) {
        OrderPriceViewState.ValidationResult validationResultConsume;
        UiEvent<OrderPriceViewState.ValidationResult> validationResult = state.getValidationResult();
        if (validationResult != null && (validationResultConsume = validationResult.consume()) != null) {
            if (validationResultConsume instanceof OrderPriceViewState.ValidationResult.Success) {
                onPriceValidated(((OrderPriceViewState.ValidationResult.Success) validationResultConsume).getValidatedPrice());
            } else {
                if (!(validationResultConsume instanceof OrderPriceViewState.ValidationResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((OrderPriceViewState.ValidationResult.Failure) validationResultConsume).showAlert(requireBaseActivity());
            }
        }
        if (state.getInstrumentSymbol() != null) {
            getBindings().orderPricePromptTxt.setText(getResources().getString(((Args) INSTANCE.getArgs((Fragment) this)).getScreenType().getPromptRes(), state.getInstrumentSymbol()));
        }
        RhTextView rhTextView = getBindings().orderPriceCurrentPriceValue;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator<T> it = state.getOrderPriceCurrentPriceLabel().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            Tuples2 tuples2 = (Tuples2) it.next();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getForegroundColor2());
            int length = spannableStringBuilder.length();
            if (i != 0) {
                spannableStringBuilder.append((CharSequence) " · ");
            }
            StringResource stringResource = (StringResource) tuples2.getFirst();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            spannableStringBuilder.append(stringResource.getText(resources));
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(getBoldTypeface());
            int length2 = spannableStringBuilder.length();
            StringResource stringResource2 = (StringResource) tuples2.getSecond();
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            spannableStringBuilder.append(stringResource2.getText(resources2));
            spannableStringBuilder.setSpan(customTypefaceSpan, length2, spannableStringBuilder.length(), 17);
            i = i2;
        }
        rhTextView.setText(new SpannedString(spannableStringBuilder));
        getBindings().orderPriceNumpad.setButtonEnabled(state.getIsContinueButtonEnabled());
        LinearLayout orderPriceCurrentPriceGroup = getBindings().orderPriceCurrentPriceGroup;
        Intrinsics.checkNotNullExpressionValue(orderPriceCurrentPriceGroup, "orderPriceCurrentPriceGroup");
        OnClickListeners.onClick(orderPriceCurrentPriceGroup, new Function0() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderPriceFragment.setViewState$lambda$11(state, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11(OrderPriceViewState orderPriceViewState, OrderPriceFragment orderPriceFragment) {
        MarketDataDisclosureDialog.Args marketDataDisclosureDialogArgs = orderPriceViewState.getMarketDataDisclosureDialogArgs();
        if (marketDataDisclosureDialogArgs != null) {
            MarketDataDisclosureDialog marketDataDisclosureDialog = (MarketDataDisclosureDialog) MarketDataDisclosureDialog.INSTANCE.newInstance((Parcelable) marketDataDisclosureDialogArgs);
            FragmentManager parentFragmentManager = orderPriceFragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            marketDataDisclosureDialog.show(parentFragmentManager, "market-data-disclosures");
        } else {
            orderPriceFragment.showMarketDataAlertDialog();
        }
        return Unit.INSTANCE;
    }

    private final void handleAction(Validator.Failure<? super OrderPriceContext, ? super OrderPriceFailureResolver> failure, Validator.Action<? super OrderPriceContext> action) {
        if (Intrinsics.areEqual(action, Validator.Action.Abort.INSTANCE)) {
            getDuxo().abortValidation();
        } else if (Intrinsics.areEqual(action, Validator.Action.Skip.INSTANCE)) {
            getDuxo().setSkipFailure(failure);
        } else {
            if (!(action instanceof Validator.Action.RetryWhen)) {
                throw new NoWhenBranchMatchedException();
            }
            getDuxo().setRetryWhen((Validator.Action.RetryWhen) action);
        }
    }

    private final void onPriceValidated(BigDecimal validatedPrice) {
        Function2 orderPriceFragment6;
        Companion companion = INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getScreenType().ordinal()]) {
            case 1:
            case 2:
                orderPriceFragment6 = new OrderPriceFragment6(getCallbacks());
                break;
            case 3:
            case 4:
                orderPriceFragment6 = new OrderPriceFragment7(getCallbacks());
                break;
            case 5:
            case 6:
            case 7:
                orderPriceFragment6 = new OrderPriceFragment8(getCallbacks());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        orderPriceFragment6.invoke(((Args) companion.getArgs((Fragment) this)).getDirectOrder(), validatedPrice);
    }

    private final void showMarketDataAlertDialog() {
        getDuxo().logMarketDataDialogAlert();
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C29365R.id.dialog_id_market_data_alert).setTitle(C29365R.string.limit_price_fragment_market_data_not_available_dialog_title, new Object[0]).setMessage(C29365R.string.limit_price_fragment_market_data_not_available_dialog_message, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, MARKET_DATA_ALERT_TAG, false, 4, null);
    }

    /* compiled from: OrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Args;", "Landroid/os/Parcelable;", "directOrder", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "screenType", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceScreenType;", "instrumentId", "Ljava/util/UUID;", "showEducation", "", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "orderToReplaceId", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceScreenType;Ljava/util/UUID;ZLcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/util/UUID;)V", "getDirectOrder", "()Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "getScreenType", "()Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceScreenType;", "getInstrumentId", "()Ljava/util/UUID;", "getShowEducation", "()Z", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getOrderToReplaceId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DirectOrder directOrder;
        private final EquityOrderFlowSource flowSource;
        private final UUID instrumentId;
        private final UUID orderToReplaceId;
        private final OrderPriceScreenType screenType;
        private final boolean showEducation;

        /* compiled from: OrderPriceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DirectOrder) parcel.readParcelable(Args.class.getClassLoader()), OrderPriceScreenType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() != 0, EquityOrderFlowSource.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DirectOrder directOrder, OrderPriceScreenType orderPriceScreenType, UUID uuid, boolean z, EquityOrderFlowSource equityOrderFlowSource, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                directOrder = args.directOrder;
            }
            if ((i & 2) != 0) {
                orderPriceScreenType = args.screenType;
            }
            if ((i & 4) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 8) != 0) {
                z = args.showEducation;
            }
            if ((i & 16) != 0) {
                equityOrderFlowSource = args.flowSource;
            }
            if ((i & 32) != 0) {
                uuid2 = args.orderToReplaceId;
            }
            EquityOrderFlowSource equityOrderFlowSource2 = equityOrderFlowSource;
            UUID uuid3 = uuid2;
            return args.copy(directOrder, orderPriceScreenType, uuid, z, equityOrderFlowSource2, uuid3);
        }

        /* renamed from: component1, reason: from getter */
        public final DirectOrder getDirectOrder() {
            return this.directOrder;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderPriceScreenType getScreenType() {
            return this.screenType;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowEducation() {
            return this.showEducation;
        }

        /* renamed from: component5, reason: from getter */
        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getOrderToReplaceId() {
            return this.orderToReplaceId;
        }

        public final Args copy(DirectOrder directOrder, OrderPriceScreenType screenType, UUID instrumentId, boolean showEducation, EquityOrderFlowSource flowSource, UUID orderToReplaceId) {
            Intrinsics.checkNotNullParameter(directOrder, "directOrder");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            return new Args(directOrder, screenType, instrumentId, showEducation, flowSource, orderToReplaceId);
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
            return Intrinsics.areEqual(this.directOrder, args.directOrder) && this.screenType == args.screenType && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.showEducation == args.showEducation && this.flowSource == args.flowSource && Intrinsics.areEqual(this.orderToReplaceId, args.orderToReplaceId);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.directOrder.hashCode() * 31) + this.screenType.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + Boolean.hashCode(this.showEducation)) * 31) + this.flowSource.hashCode()) * 31;
            UUID uuid = this.orderToReplaceId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Args(directOrder=" + this.directOrder + ", screenType=" + this.screenType + ", instrumentId=" + this.instrumentId + ", showEducation=" + this.showEducation + ", flowSource=" + this.flowSource + ", orderToReplaceId=" + this.orderToReplaceId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.directOrder, flags);
            dest.writeString(this.screenType.name());
            dest.writeSerializable(this.instrumentId);
            dest.writeInt(this.showEducation ? 1 : 0);
            dest.writeString(this.flowSource.name());
            dest.writeSerializable(this.orderToReplaceId);
        }

        public Args(DirectOrder directOrder, OrderPriceScreenType screenType, UUID instrumentId, boolean z, EquityOrderFlowSource flowSource, UUID uuid) {
            Intrinsics.checkNotNullParameter(directOrder, "directOrder");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.directOrder = directOrder;
            this.screenType = screenType;
            this.instrumentId = instrumentId;
            this.showEducation = z;
            this.flowSource = flowSource;
            this.orderToReplaceId = uuid;
        }

        public final DirectOrder getDirectOrder() {
            return this.directOrder;
        }

        public final OrderPriceScreenType getScreenType() {
            return this.screenType;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final boolean getShowEducation() {
            return this.showEducation;
        }

        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        public final UUID getOrderToReplaceId() {
            return this.orderToReplaceId;
        }
    }

    /* compiled from: OrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Args;", "<init>", "()V", "MARKET_DATA_ALERT_TAG", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderPriceFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OrderPriceFragment orderPriceFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderPriceFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderPriceFragment newInstance(Args args) {
            return (OrderPriceFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderPriceFragment orderPriceFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderPriceFragment, args);
        }
    }
}
