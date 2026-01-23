package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.trade.configuration.OrderConfigurationRow;
import com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter;
import com.robinhood.android.trade.configuration.OrderConfigurationUpsellOption;
import com.robinhood.android.trade.configuration.OrderTypeDisabledBottomSheetFragment;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.databinding.FragmentOrderConfigurationSelectionBinding;
import com.robinhood.android.trade.equity.p261ui.configuration.selection.OrderConfigurationContextFactory;
import com.robinhood.android.trading.contracts.OrderConfigurationDisclosureFragmentKey;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OrderConfigurationSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000\u00ad\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001J\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002PQB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u0002002\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00106\u001a\u0002002\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u000200H\u0016J\u0010\u0010@\u001a\u0002002\u0006\u0010:\u001a\u00020AH\u0002J\b\u0010B\u001a\u000200H\u0002J\u0010\u0010C\u001a\u0002002\u0006\u0010:\u001a\u00020DH\u0002J\u0012\u0010E\u001a\u0002002\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\b\u0010H\u001a\u000200H\u0002J\u0018\u0010L\u001a\u0002002\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020&H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0010\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0004\n\u0002\u0010K¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/android/trade/equity/databinding/FragmentOrderConfigurationSelectionBinding;", "getBindings", "()Lcom/robinhood/android/trade/equity/databinding/FragmentOrderConfigurationSelectionBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$Callbacks;", "callbacks$delegate", "bottomSheetAchromatic", "", "screenName", "", "getScreenName", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onOrderConfigurationRowClicked", "row", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "onUpsellClicked", "upsellType", "Lcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;", "onDisclosureClicked", "onDirectOrderClicked", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$EquityDirectOrder;", "showTaxLotDisabled", "onRecurringOrderSelected", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Recurring;", "showRecurringIneligibilityAlert", "reason", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "showShortPositionError", "sduiCallbacks", "com/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$sduiCallbacks$1", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$sduiCallbacks$1;", "onHeaderClicked", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "forAchromatic", "Callbacks", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderConfigurationSelectionFragment extends BaseFragment implements AutoLoggableFragment, OrderConfigurationSelectionAdapter.Callbacks {
    private static final String SCREEN_NAME = "OrderConfigurationFragment";
    private final OrderConfigurationSelectionAdapter adapter;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private boolean bottomSheetAchromatic;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public Markwon markwon;
    private final String screenName;
    private final OrderConfigurationSelectionFragment3 sduiCallbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderConfigurationSelectionFragment.class, "bindings", "getBindings()Lcom/robinhood/android/trade/equity/databinding/FragmentOrderConfigurationSelectionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfigurationSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderConfigurationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$Callbacks;", "", "onOrderConfigurationSelected", "", "directOrder", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "taxLots", "", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "isBuyToClose", "onRecurringOrderConfigurationSelected", "accountNumber", "", "onOptionsUpgradeHookSelected", "onSduiBottomSheetPresented", "sheetListener", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: OrderConfigurationSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onSduiBottomSheetPresented(Callbacks callbacks, RhBottomSheetDialogFragmentHost.SheetListener sheetListener) {
                Intrinsics.checkNotNullParameter(sheetListener, "sheetListener");
            }
        }

        void onOptionsUpgradeHookSelected();

        void onOrderConfigurationSelected(DirectOrder directOrder, boolean taxLots, EquityOrderSide side, boolean isBuyToClose);

        void onRecurringOrderConfigurationSelected(String accountNumber);

        void onSduiBottomSheetPresented(RhBottomSheetDialogFragmentHost.SheetListener sheetListener);
    }

    /* compiled from: OrderConfigurationSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderConfigurationUpsellOption.values().length];
            try {
                iArr[OrderConfigurationUpsellOption.OPTION_HOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderConfigurationUpsellOption.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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

    public OrderConfigurationSelectionFragment() {
        super(C29365R.layout.fragment_order_configuration_selection);
        this.duxo = DuxosKt.duxo(this, OrderConfigurationSelectionDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, OrderConfigurationSelectionFragment2.INSTANCE);
        this.adapter = new OrderConfigurationSelectionAdapter(this);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.screenName = SCREEN_NAME;
        this.sduiCallbacks = new OrderConfigurationSelectionFragment3(this);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderConfigurationSelectionDuxo getDuxo() {
        return (OrderConfigurationSelectionDuxo) this.duxo.getValue();
    }

    private final FragmentOrderConfigurationSelectionBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOrderConfigurationSelectionBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.EQUITY_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        LifecycleHost.DefaultImpls.bind$default(this, baseActivity.getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C294381(getDuxo()));
    }

    /* compiled from: OrderConfigurationSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onStart$1 */
    /* synthetic */ class C294381 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C294381(Object obj) {
            super(1, obj, OrderConfigurationSelectionDuxo.class, "setDayNightOverlay", "setDayNightOverlay(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OrderConfigurationSelectionDuxo) this.receiver).setDayNightOverlay(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getBindings().recyclerView;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.adapter);
        BaseFragment.collectDuxoState$default(this, null, new C294392(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C294403(null), 1, null);
    }

    /* compiled from: OrderConfigurationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2 */
    static final class C294392 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C294392(Continuation<? super C294392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294392 c294392 = OrderConfigurationSelectionFragment.this.new C294392(continuation);
            c294392.L$0 = obj;
            return c294392;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderConfigurationSelectionFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OrderConfigurationSelectionFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderConfigurationSelectionFragment orderConfigurationSelectionFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderConfigurationSelectionFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OrderConfigurationSelectionViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    final Flow<List<? extends OrderConfigurationRow>> flow = new Flow<List<? extends OrderConfigurationRow>>() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends OrderConfigurationRow>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    List<OrderConfigurationRow> orderConfigurationList = ((OrderConfigurationSelectionViewState) obj).getOrderConfigurationList();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(orderConfigurationList, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends OrderConfigurationRow>>() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$invokeSuspend$$inlined$filterNot$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends OrderConfigurationRow>> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$invokeSuspend$$inlined$filterNot$1$2", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (!((List) obj).isEmpty()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0.adapter);
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: OrderConfigurationSelectionFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$2$1$3, reason: invalid class name */
            /* synthetic */ class AnonymousClass3 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ OrderConfigurationSelectionAdapter $tmp0;

                AnonymousClass3(OrderConfigurationSelectionAdapter orderConfigurationSelectionAdapter) {
                    this.$tmp0 = orderConfigurationSelectionAdapter;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, OrderConfigurationSelectionAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((List<? extends OrderConfigurationRow>) obj, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(List<? extends OrderConfigurationRow> list, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$submitList = AnonymousClass1.invokeSuspend$submitList(this.$tmp0, list, continuation);
                    return objInvokeSuspend$submitList == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$submitList : Unit.INSTANCE;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$submitList(OrderConfigurationSelectionAdapter orderConfigurationSelectionAdapter, List list, Continuation continuation) {
                orderConfigurationSelectionAdapter.submitList(list);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(OrderConfigurationSelectionFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderConfigurationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$3", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$3 */
    static final class C294403 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C294403(Continuation<? super C294403> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294403 c294403 = OrderConfigurationSelectionFragment.this.new C294403(continuation);
            c294403.L$0 = obj;
            return c294403;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294403) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderConfigurationSelectionFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$3$1", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OrderConfigurationSelectionFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderConfigurationSelectionFragment orderConfigurationSelectionFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderConfigurationSelectionFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OrderConfigurationSelectionViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(new Flow<Tuples2<? extends Context, ? extends Boolean>>() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends Context, ? extends Boolean>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$onViewCreated$3$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    OrderConfigurationSelectionViewState orderConfigurationSelectionViewState = (OrderConfigurationSelectionViewState) obj;
                                    Tuples2 tuples2 = new Tuples2(orderConfigurationSelectionViewState.getLoggingEquityOrderContext(), boxing.boxBoolean(orderConfigurationSelectionViewState.getTaxLotsSelected()));
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }));
                    final OrderConfigurationSelectionFragment orderConfigurationSelectionFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment.onViewCreated.3.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Tuples2<Context, Boolean>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Tuples2<Context, Boolean> tuples2, Continuation<? super Unit> continuation) {
                            Component.ComponentType componentType;
                            String str;
                            Context contextComponent1 = tuples2.component1();
                            boolean zBooleanValue = tuples2.component2().booleanValue();
                            EventLogger eventLogger = orderConfigurationSelectionFragment.getEventLogger();
                            Screen screen = new Screen(Screen.Name.EQUITY_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null);
                            if (zBooleanValue) {
                                componentType = Component.ComponentType.ROW;
                            } else {
                                componentType = Component.ComponentType.BUTTON;
                            }
                            Component.ComponentType componentType2 = componentType;
                            if (zBooleanValue) {
                                str = "SELL_IN_TAX_LOTS";
                            } else {
                                str = "order_kind_row";
                            }
                            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(componentType2, str, null, 4, null), null, contextComponent1, false, 41, null);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(OrderConfigurationSelectionFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter.Callbacks
    public void onOrderConfigurationRowClicked(OrderConfigurationRow row) {
        Intrinsics.checkNotNullParameter(row, "row");
        getDuxo().setOrderRowSelected(row);
        if (row instanceof OrderConfigurationRow.EquityDirectOrder) {
            onDirectOrderClicked((OrderConfigurationRow.EquityDirectOrder) row);
        } else {
            if (!(row instanceof OrderConfigurationRow.Recurring)) {
                throw new IllegalStateException("Unsupported row type");
            }
            onRecurringOrderSelected((OrderConfigurationRow.Recurring) row);
        }
    }

    @Override // com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter.Callbacks
    public void onUpsellClicked(OrderConfigurationUpsellOption upsellType) {
        Intrinsics.checkNotNullParameter(upsellType, "upsellType");
        int i = WhenMappings.$EnumSwitchMapping$0[upsellType.ordinal()];
        if (i == 1) {
            getCallbacks().onOptionsUpgradeHookSelected();
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter.Callbacks
    public void onDisclosureClicked() {
        getDuxo().logDisclosureTap();
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, OrderConfigurationDisclosureFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
    }

    private final void onDirectOrderClicked(OrderConfigurationRow.EquityDirectOrder row) {
        if (row.getDisabled() && row.isTaxLots()) {
            showTaxLotDisabled();
        } else if (row.getDisabled() && row.getDisabledByShortPosition()) {
            showShortPositionError();
        } else {
            getCallbacks().onOrderConfigurationSelected(row.getOrderConfig(), row.isTaxLots(), row.getSide(), row.isBuyToClose());
        }
    }

    /* compiled from: OrderConfigurationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$showTaxLotDisabled$1", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$showTaxLotDisabled$1 */
    static final class C294411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294411(Continuation<? super C294411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfigurationSelectionFragment.this.new C294411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OrderConfigurationSelectionViewState> stateFlow = OrderConfigurationSelectionFragment.this.getDuxo().getStateFlow();
                Flow<EquityOrderContext> flow = new Flow<EquityOrderContext>() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$showTaxLotDisabled$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$showTaxLotDisabled$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$showTaxLotDisabled$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OrderConfigurationSelectionFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$showTaxLotDisabled$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Context loggingEquityOrderContext = ((OrderConfigurationSelectionViewState) obj).getLoggingEquityOrderContext();
                                EquityOrderContext equity_order_context = loggingEquityOrderContext != null ? loggingEquityOrderContext.getEquity_order_context() : null;
                                if (equity_order_context != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(equity_order_context, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                this.label = 1;
                obj = FlowKt.first(flow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Navigator.DefaultImpls.createDialogFragment$default(OrderConfigurationSelectionFragment.this.getNavigator(), new TaxLotsDisabledKey((EquityOrderContext) obj), null, 2, null).show(OrderConfigurationSelectionFragment.this.getChildFragmentManager(), "tax-lots-disabled-alert");
            return Unit.INSTANCE;
        }
    }

    private final void showTaxLotDisabled() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C294411(null), 3, null);
    }

    private final void onRecurringOrderSelected(OrderConfigurationRow.Recurring row) {
        getDuxo().logRecurringOrderTypeSelected(row.getResourceConfig().getDisabled());
        if (row.getDisabledByShortPosition()) {
            showShortPositionError();
        } else if (row.isRecurringTradable()) {
            getCallbacks().onRecurringOrderConfigurationSelected(((OrderConfigurationContextFactory.OrderConfigurationContext) INSTANCE.getArgs((Fragment) this)).getAccountNumber());
        } else {
            showRecurringIneligibilityAlert(row.getRecurringTradabilityReason());
        }
    }

    private final void showRecurringIneligibilityAlert(InstrumentRecurringTradability.RecurringTradableReason reason) {
        RichText description;
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        SpannableString spannableString$default = null;
        String title = reason != null ? reason.getTitle() : null;
        if (reason != null && (description = reason.getDescription()) != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            spannableString$default = RichTexts.toSpannableString$default(description, contextRequireContext, null, false, null, 14, null);
        }
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, title, null, spannableString$default, null, getResources().getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "recurring-ineligible-bottom-sheet");
    }

    private final void showShortPositionError() {
        OrderTypeDisabledBottomSheetFragment orderTypeDisabledBottomSheetFragmentNewInstance = OrderTypeDisabledBottomSheetFragment.INSTANCE.newInstance(OrderTypeDisabledBottomSheetFragment.OrderTypeDisabledReason.ShortPosition.INSTANCE);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        orderTypeDisabledBottomSheetFragmentNewInstance.show(supportFragmentManager, "shortPositionBottomSheetFragment");
    }

    /* compiled from: OrderConfigurationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", "<init>", "()V", "SCREEN_NAME", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderConfigurationSelectionFragment, OrderConfigurationContextFactory.OrderConfigurationContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OrderConfigurationContextFactory.OrderConfigurationContext getArgs(OrderConfigurationSelectionFragment orderConfigurationSelectionFragment) {
            return (OrderConfigurationContextFactory.OrderConfigurationContext) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderConfigurationSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderConfigurationSelectionFragment newInstance(OrderConfigurationContextFactory.OrderConfigurationContext orderConfigurationContext) {
            return (OrderConfigurationSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, orderConfigurationContext);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderConfigurationSelectionFragment orderConfigurationSelectionFragment, OrderConfigurationContextFactory.OrderConfigurationContext orderConfigurationContext) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderConfigurationSelectionFragment, orderConfigurationContext);
        }
    }

    @Override // com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter.Callbacks
    public void onHeaderClicked(GenericAction action, boolean forAchromatic) {
        Intrinsics.checkNotNullParameter(action, "action");
        OrderConfigurationSelectionAdapter.Callbacks.DefaultImpls.onHeaderClicked(this, action, forAchromatic);
        this.bottomSheetAchromatic = forAchromatic;
        this.sduiCallbacks.handle(action);
    }
}
