package com.robinhood.android.trade.options.configuration;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.order.OptionOrderType2;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.configuration.OrderConfigurationRadioGroupResource;
import com.robinhood.android.trade.configuration.OrderConfigurationRow;
import com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter;
import com.robinhood.android.trade.configuration.OrderConfigurationUpsellOption;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment;
import com.robinhood.android.trade.options.databinding.FragmentOptionConfigurationSelectionBinding;
import com.robinhood.android.trading.contracts.OrderConfigurationDisclosureFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionConfigurationSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003CDEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020/H\u0002J\u001c\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u00104\u001a\u000205H\u0002J\u001a\u00107\u001a\u0002012\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010;\u001a\u0002012\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010#H\u0016J\b\u0010<\u001a\u000201H\u0016J\t\u0010=\u001a\u000201H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/android/trade/options/databinding/FragmentOptionConfigurationSelectionBinding;", "getBindings", "()Lcom/robinhood/android/trade/options/databinding/FragmentOptionConfigurationSelectionBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter;", "callbacks", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Callbacks;", "callbacks$delegate", "screenName", "", "getScreenName", "()Ljava/lang/String;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onUpsellClicked", "upsellType", "Lcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;", "onOrderConfigurationRowClicked", "row", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "onDisclosureClicked", "onOptionBasedTradingClicked", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Option;", "showErrorIfInvalidMarketOrder", "", "orderConfig", "Lcom/robinhood/models/db/Order$Configuration;", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "onOrderTimeInForceClicked", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionConfigurationSelectionFragment extends BaseFragment implements OrderConfigurationSelectionAdapter.Callbacks, RegionGated {
    private static final String MARKET_ERROR_TAG = "market_error_tag";
    private static final String SCREEN_NAME = "OptionConfigurationFragment";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final OrderConfigurationSelectionAdapter adapter;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final String screenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionConfigurationSelectionFragment.class, "bindings", "getBindings()Lcom/robinhood/android/trade/options/databinding/FragmentOptionConfigurationSelectionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OptionConfigurationSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionConfigurationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Callbacks;", "", "onOrderConfigurationSelected", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "onOrderTimeInForceSelected", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderConfigurationSelected(Order.Configuration configuration);

        void onOrderTimeInForceSelected(OrderTimeInForce orderTimeInForce);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter.Callbacks
    public void onUpsellClicked(OrderConfigurationUpsellOption upsellType) {
        Intrinsics.checkNotNullParameter(upsellType, "upsellType");
    }

    @Override // com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter.Callbacks
    public void onHeaderClicked(GenericAction genericAction, boolean z) {
        OrderConfigurationSelectionAdapter.Callbacks.DefaultImpls.onHeaderClicked(this, genericAction, z);
    }

    public OptionConfigurationSelectionFragment() {
        super(C29757R.layout.fragment_option_configuration_selection);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionConfigurationSelectionDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, OptionConfigurationSelectionFragment2.INSTANCE);
        this.adapter = new OrderConfigurationSelectionAdapter(this);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof OptionConfigurationSelectionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.screenName = SCREEN_NAME;
    }

    private final OptionConfigurationSelectionDuxo getDuxo() {
        return (OptionConfigurationSelectionDuxo) this.duxo.getValue();
    }

    private final FragmentOptionConfigurationSelectionBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionConfigurationSelectionBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        LifecycleHost.DefaultImpls.bind$default(this, baseActivity.getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C297711(getDuxo()));
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final List<OrderConfigurationRow> apply(OptionConfigurationSelectionViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionConfigurationList();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C297733(this.adapter));
    }

    /* compiled from: OptionConfigurationSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment$onStart$1 */
    /* synthetic */ class C297711 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C297711(Object obj) {
            super(1, obj, OptionConfigurationSelectionDuxo.class, "setDayNightOverlay", "setDayNightOverlay(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionConfigurationSelectionDuxo) this.receiver).setDayNightOverlay(p0);
        }
    }

    /* compiled from: OptionConfigurationSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment$onStart$3 */
    /* synthetic */ class C297733 extends FunctionReferenceImpl implements Function1<List<? extends OrderConfigurationRow>, Unit> {
        C297733(Object obj) {
            super(1, obj, OrderConfigurationSelectionAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OrderConfigurationRow> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends OrderConfigurationRow> list) {
            ((OrderConfigurationSelectionAdapter) this.receiver).submitList(list);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getDuxo().logScreenAppear();
        RecyclerView recyclerView = getBindings().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        Intrinsics.checkNotNull(recyclerView);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(recyclerView, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        bindAdapter(recyclerView, this.adapter);
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
        if (row instanceof OrderConfigurationRow.Option) {
            onOptionBasedTradingClicked((OrderConfigurationRow.Option) row);
            return;
        }
        if (row instanceof OrderConfigurationRow.RadioGroupBased) {
            OrderConfigurationRow.RadioGroupBased radioGroupBased = (OrderConfigurationRow.RadioGroupBased) row;
            if (radioGroupBased.getRadioGroupConfig() instanceof OrderConfigurationRadioGroupResource.TimeInForce) {
                Object identifier = radioGroupBased.getRadioGroupConfig().getRadioButtonResources().get(radioGroupBased.getRadioGroupConfig().getSelectedRadioButtonIndex()).getIdentifier();
                Intrinsics.checkNotNull(identifier, "null cannot be cast to non-null type com.robinhood.models.db.OrderTimeInForce");
                onOrderTimeInForceClicked((OrderTimeInForce) identifier);
                return;
            }
        }
        throw new IllegalStateException("Unsupported row type");
    }

    @Override // com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter.Callbacks
    public void onDisclosureClicked() {
        getDuxo().logDisclosureTap();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, OrderConfigurationDisclosureFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
    }

    private final void onOptionBasedTradingClicked(OrderConfigurationRow.Option row) {
        if (row.getResourceConfig().getDisabled()) {
            return;
        }
        getDuxo().logOptionConfigurationTap(Component.ComponentType.OPTION_ORDER_CONFIGURATION_ROW, row.getOrderConfig().toString(), OptionConfigurationSelectionDuxo.INSTANCE.toOptionsContext$feature_trade_options_externalDebug(OptionOrderType2.toOptionOrderType(row.getOrderConfig())));
        if (showErrorIfInvalidMarketOrder$default(this, row.getOrderConfig(), null, 2, null)) {
            return;
        }
        getCallbacks().onOrderConfigurationSelected(row.getOrderConfig());
    }

    static /* synthetic */ boolean showErrorIfInvalidMarketOrder$default(OptionConfigurationSelectionFragment optionConfigurationSelectionFragment, Order.Configuration configuration, OrderTimeInForce orderTimeInForce, int i, Object obj) {
        if ((i & 1) != 0) {
            configuration = OptionOrderType2.toOrderConfiguration(((Args) INSTANCE.getArgs((Fragment) optionConfigurationSelectionFragment)).getSelectedOrderType());
        }
        if ((i & 2) != 0) {
            orderTimeInForce = optionConfigurationSelectionFragment.getDuxo().getStatesFlow().getValue().getSelectedTimeInForce();
        }
        return optionConfigurationSelectionFragment.showErrorIfInvalidMarketOrder(configuration, orderTimeInForce);
    }

    private final boolean showErrorIfInvalidMarketOrder(Order.Configuration orderConfig, OrderTimeInForce orderTimeInForce) {
        if (orderConfig != Order.Configuration.MARKET || orderTimeInForce != OrderTimeInForce.GTC) {
            return false;
        }
        String string2 = getString(C29757R.string.option_order_configuration_error_gtc_market_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(C29757R.string.option_order_configuration_error_gtc_market_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        getDuxo().logGtcAlertModalAppear(string2, string3);
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setTitle(string2).setMessage(string3).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]).setId(C29757R.id.dialog_id_market_gtc_error).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, MARKET_ERROR_TAG, false, 4, null);
        return true;
    }

    private final void onOrderTimeInForceClicked(OrderTimeInForce orderTimeInForce) {
        OptionConfigurationSelectionDuxo.logOptionConfigurationTap$default(getDuxo(), Component.ComponentType.RADIO_BUTTON, orderTimeInForce.toString(), null, 4, null);
        getDuxo().setTimeInForce(orderTimeInForce);
        getCallbacks().onOrderTimeInForceSelected(orderTimeInForce);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) throws Resources.NotFoundException {
        if (id == C29757R.id.dialog_id_market_gtc_error) {
            OptionConfigurationSelectionDuxo duxo = getDuxo();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            duxo.logGtcAlertModalContinue(resources);
            OptionConfigurationSelectionDuxo duxo2 = getDuxo();
            OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
            duxo2.setTimeInForce(orderTimeInForce);
            getCallbacks().onOrderTimeInForceSelected(orderTimeInForce);
            getCallbacks().onOrderConfigurationSelected(Order.Configuration.MARKET);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) throws Resources.NotFoundException {
        if (id == C29757R.id.dialog_id_market_gtc_error) {
            OptionConfigurationSelectionDuxo duxo = getDuxo();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            duxo.logGtcAlertModalDismiss(resources);
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().logCloseButtonTap();
        if (showErrorIfInvalidMarketOrder$default(this, null, null, 3, null)) {
            return true;
        }
        return super.onBackPressed();
    }

    /* compiled from: OptionConfigurationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Args;", "Landroid/os/Parcelable;", "symbol", "", "isLateClosing", "", "isMultiLeg", "isRolling", "direction", "Lcom/robinhood/models/db/OrderDirection;", "singleLegPositionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "selectedOrderType", "Lcom/robinhood/models/db/OptionOrderType;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/db/OrderPositionEffect;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OptionOrderType;)V", "getSymbol", "()Ljava/lang/String;", "()Z", "getDirection", "()Lcom/robinhood/models/db/OrderDirection;", "getSingleLegPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "getOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getSelectedOrderType", "()Lcom/robinhood/models/db/OptionOrderType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OrderDirection direction;
        private final boolean isLateClosing;
        private final boolean isMultiLeg;
        private final boolean isRolling;
        private final OrderTimeInForce orderTimeInForce;
        private final OptionOrderType selectedOrderType;
        private final OrderPositionEffect singleLegPositionEffect;
        private final String symbol;

        /* compiled from: OptionConfigurationSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Args(string2, z3, z4, z2, OrderDirection.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : OrderPositionEffect.valueOf(parcel.readString()), (OrderTimeInForce) parcel.readParcelable(Args.class.getClassLoader()), OptionOrderType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, boolean z, boolean z2, boolean z3, OrderDirection orderDirection, OrderPositionEffect orderPositionEffect, OrderTimeInForce orderTimeInForce, OptionOrderType optionOrderType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.symbol;
            }
            if ((i & 2) != 0) {
                z = args.isLateClosing;
            }
            if ((i & 4) != 0) {
                z2 = args.isMultiLeg;
            }
            if ((i & 8) != 0) {
                z3 = args.isRolling;
            }
            if ((i & 16) != 0) {
                orderDirection = args.direction;
            }
            if ((i & 32) != 0) {
                orderPositionEffect = args.singleLegPositionEffect;
            }
            if ((i & 64) != 0) {
                orderTimeInForce = args.orderTimeInForce;
            }
            if ((i & 128) != 0) {
                optionOrderType = args.selectedOrderType;
            }
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            OptionOrderType optionOrderType2 = optionOrderType;
            OrderDirection orderDirection2 = orderDirection;
            OrderPositionEffect orderPositionEffect2 = orderPositionEffect;
            return args.copy(str, z, z2, z3, orderDirection2, orderPositionEffect2, orderTimeInForce2, optionOrderType2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLateClosing() {
            return this.isLateClosing;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsMultiLeg() {
            return this.isMultiLeg;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsRolling() {
            return this.isRolling;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component6, reason: from getter */
        public final OrderPositionEffect getSingleLegPositionEffect() {
            return this.singleLegPositionEffect;
        }

        /* renamed from: component7, reason: from getter */
        public final OrderTimeInForce getOrderTimeInForce() {
            return this.orderTimeInForce;
        }

        /* renamed from: component8, reason: from getter */
        public final OptionOrderType getSelectedOrderType() {
            return this.selectedOrderType;
        }

        public final Args copy(String symbol, boolean isLateClosing, boolean isMultiLeg, boolean isRolling, OrderDirection direction, OrderPositionEffect singleLegPositionEffect, OrderTimeInForce orderTimeInForce, OptionOrderType selectedOrderType) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
            Intrinsics.checkNotNullParameter(selectedOrderType, "selectedOrderType");
            return new Args(symbol, isLateClosing, isMultiLeg, isRolling, direction, singleLegPositionEffect, orderTimeInForce, selectedOrderType);
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
            return Intrinsics.areEqual(this.symbol, args.symbol) && this.isLateClosing == args.isLateClosing && this.isMultiLeg == args.isMultiLeg && this.isRolling == args.isRolling && this.direction == args.direction && this.singleLegPositionEffect == args.singleLegPositionEffect && this.orderTimeInForce == args.orderTimeInForce && this.selectedOrderType == args.selectedOrderType;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.symbol.hashCode() * 31) + Boolean.hashCode(this.isLateClosing)) * 31) + Boolean.hashCode(this.isMultiLeg)) * 31) + Boolean.hashCode(this.isRolling)) * 31) + this.direction.hashCode()) * 31;
            OrderPositionEffect orderPositionEffect = this.singleLegPositionEffect;
            return ((((iHashCode + (orderPositionEffect == null ? 0 : orderPositionEffect.hashCode())) * 31) + this.orderTimeInForce.hashCode()) * 31) + this.selectedOrderType.hashCode();
        }

        public String toString() {
            return "Args(symbol=" + this.symbol + ", isLateClosing=" + this.isLateClosing + ", isMultiLeg=" + this.isMultiLeg + ", isRolling=" + this.isRolling + ", direction=" + this.direction + ", singleLegPositionEffect=" + this.singleLegPositionEffect + ", orderTimeInForce=" + this.orderTimeInForce + ", selectedOrderType=" + this.selectedOrderType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
            dest.writeInt(this.isLateClosing ? 1 : 0);
            dest.writeInt(this.isMultiLeg ? 1 : 0);
            dest.writeInt(this.isRolling ? 1 : 0);
            dest.writeString(this.direction.name());
            OrderPositionEffect orderPositionEffect = this.singleLegPositionEffect;
            if (orderPositionEffect == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(orderPositionEffect.name());
            }
            dest.writeParcelable(this.orderTimeInForce, flags);
            dest.writeString(this.selectedOrderType.name());
        }

        public Args(String symbol, boolean z, boolean z2, boolean z3, OrderDirection direction, OrderPositionEffect orderPositionEffect, OrderTimeInForce orderTimeInForce, OptionOrderType selectedOrderType) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
            Intrinsics.checkNotNullParameter(selectedOrderType, "selectedOrderType");
            this.symbol = symbol;
            this.isLateClosing = z;
            this.isMultiLeg = z2;
            this.isRolling = z3;
            this.direction = direction;
            this.singleLegPositionEffect = orderPositionEffect;
            this.orderTimeInForce = orderTimeInForce;
            this.selectedOrderType = selectedOrderType;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean isLateClosing() {
            return this.isLateClosing;
        }

        public final boolean isMultiLeg() {
            return this.isMultiLeg;
        }

        public final boolean isRolling() {
            return this.isRolling;
        }

        public final OrderDirection getDirection() {
            return this.direction;
        }

        public final OrderPositionEffect getSingleLegPositionEffect() {
            return this.singleLegPositionEffect;
        }

        public final OrderTimeInForce getOrderTimeInForce() {
            return this.orderTimeInForce;
        }

        public final OptionOrderType getSelectedOrderType() {
            return this.selectedOrderType;
        }
    }

    /* compiled from: OptionConfigurationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Args;", "<init>", "()V", "SCREEN_NAME", "", "MARKET_ERROR_TAG", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionConfigurationSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionConfigurationSelectionFragment optionConfigurationSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionConfigurationSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionConfigurationSelectionFragment newInstance(Args args) {
            return (OptionConfigurationSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionConfigurationSelectionFragment optionConfigurationSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionConfigurationSelectionFragment, args);
        }
    }
}
