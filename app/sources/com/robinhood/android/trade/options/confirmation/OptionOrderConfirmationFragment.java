package com.robinhood.android.trade.options.confirmation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.margin.contracts.MarginAccountUpsellFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment;
import com.robinhood.android.trade.options.util.OptionOrderManager;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAlertOnboardingStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore;
import com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderLeg;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderFee;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OptionOrderPayload;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.disposable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import rosetta.option.OptionOrderFormSource;
import rosetta.order.State;

/* compiled from: OptionOrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0094\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0006\u0092\u0001\u0093\u0001\u0094\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u0002H\u0016J\u001a\u0010r\u001a\u00020p2\u0006\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\b\u0010w\u001a\u00020pH\u0016J\b\u0010x\u001a\u00020pH\u0016J\u0010\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|H\u0016J\u0006\u0010}\u001a\u00020pJ\u001b\u0010~\u001a\u00020p2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002J\u0013\u0010\u0083\u0001\u001a\u00020p2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002J\u0013\u0010\u0086\u0001\u001a\u00020p2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0002J\u0013\u0010\u0089\u0001\u001a\u00020p2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0002J\n\u0010\u008c\u0001\u001a\u00020zH\u0096\u0001R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\u00038\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010N\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u0010Z\u001a\u00020[8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001e\u0010`\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u000e\u0010f\u001a\u00020gX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010h\u001a\u0010\u0012\f\u0012\n j*\u0004\u0018\u00010\u00020\u00020iX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010k\u001a\u00020lX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u001d\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0095\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "Lcom/robinhood/models/db/OptionOrder;", "Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "optionOrderConfirmationLayout", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationLayout;", "getOptionOrderConfirmationLayout", "()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationLayout;", "optionOrderConfirmationLayout$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "orderManager", "getOrderManager", "()Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "setOrderManager", "(Lcom/robinhood/android/trade/options/util/OptionOrderManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "getOptionOrderStore", "()Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "setOptionOrderStore", "(Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "getOptionPositionStore", "()Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "setOptionPositionStore", "(Lcom/robinhood/librobinhood/data/store/OptionPositionStore;)V", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "getOptionQuoteStore", "()Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "setOptionQuoteStore", "(Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;)V", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "getAggregateOptionPositionStore", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "setAggregateOptionPositionStore", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;)V", "dayTradeWarningsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "getDayTradeWarningsStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "setDayTradeWarningsStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;)V", "optionAlertOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionAlertOnboardingStore;", "getOptionAlertOnboardingStore", "()Lcom/robinhood/librobinhood/data/store/OptionAlertOnboardingStore;", "setOptionAlertOnboardingStore", "(Lcom/robinhood/librobinhood/data/store/OptionAlertOnboardingStore;)V", "optionRemoveReplaceOrderConfirmationStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "getOptionRemoveReplaceOrderConfirmationStore", "()Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "setOptionRemoveReplaceOrderConfirmationStore", "(Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/TraderEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/TraderEventLogger;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "orderRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "onOrderReceived", "", Card.Icon.ORDER, "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onConfirmationShown", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "animateConfirmationExit", "replaceOrder", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "replaceOrderBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "goToOptionOnboarding", "accountNumber", "", "goToMarginAccountOnboarding", "fragmentKey", "Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "showPatternDayTradeAlert", "alert", "Lcom/robinhood/models/db/ClientComponentAlert;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderConfirmationFragment extends BaseOrderConfirmationFragment<OptionOrder, OptionOrderManager> implements ClientComponentAlertFragment.Callbacks, RegionGated {
    public AccountProvider accountProvider;
    public AggregateOptionPositionStore aggregateOptionPositionStore;
    public AnalyticsLogger analytics;
    private final int confirmationLayoutId;
    public DayTradeWarningsStore dayTradeWarningsStore;
    public TraderEventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    public OptionAlertOnboardingStore optionAlertOnboardingStore;
    public OptionOrderStore optionOrderStore;
    public OptionPositionStore optionPositionStore;
    public OptionQuoteStore optionQuoteStore;
    public OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore;
    public OptionOrderManager orderManager;
    private final BehaviorRelay<OptionOrder> orderRelay;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationFragment.class, "optionOrderConfirmationLayout", "getOptionOrderConfirmationLayout()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationLayout;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: optionOrderConfirmationLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 optionOrderConfirmationLayout = bindView(C29757R.id.order_confirmation_layout);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionOrderConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionOrderConfirmationDuxo.class);
    private final CompositeDisposable disposable = new CompositeDisposable();

    /* compiled from: OptionOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Callbacks;", "", "onStartPostConfirmationFlow", "", "onConfirmationExitAnimationFinished", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfirmationExitAnimationFinished();

        void onStartPostConfirmationFlow();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionOrderConfirmationFragment() {
        BehaviorRelay<OptionOrder> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.orderRelay = behaviorRelayCreate;
        this.confirmationLayoutId = C29757R.layout.include_option_order_confirmation_layout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOrderConfirmationLayout getOptionOrderConfirmationLayout() {
        return (OptionOrderConfirmationLayout) this.optionOrderConfirmationLayout.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOrderConfirmationDuxo getDuxo() {
        return (OptionOrderConfirmationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
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

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final OptionOrderStore getOptionOrderStore() {
        OptionOrderStore optionOrderStore = this.optionOrderStore;
        if (optionOrderStore != null) {
            return optionOrderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionOrderStore");
        return null;
    }

    public final void setOptionOrderStore(OptionOrderStore optionOrderStore) {
        Intrinsics.checkNotNullParameter(optionOrderStore, "<set-?>");
        this.optionOrderStore = optionOrderStore;
    }

    public final OptionPositionStore getOptionPositionStore() {
        OptionPositionStore optionPositionStore = this.optionPositionStore;
        if (optionPositionStore != null) {
            return optionPositionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionPositionStore");
        return null;
    }

    public final void setOptionPositionStore(OptionPositionStore optionPositionStore) {
        Intrinsics.checkNotNullParameter(optionPositionStore, "<set-?>");
        this.optionPositionStore = optionPositionStore;
    }

    public final OptionQuoteStore getOptionQuoteStore() {
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore;
        if (optionQuoteStore != null) {
            return optionQuoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionQuoteStore");
        return null;
    }

    public final void setOptionQuoteStore(OptionQuoteStore optionQuoteStore) {
        Intrinsics.checkNotNullParameter(optionQuoteStore, "<set-?>");
        this.optionQuoteStore = optionQuoteStore;
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

    public final DayTradeWarningsStore getDayTradeWarningsStore() {
        DayTradeWarningsStore dayTradeWarningsStore = this.dayTradeWarningsStore;
        if (dayTradeWarningsStore != null) {
            return dayTradeWarningsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dayTradeWarningsStore");
        return null;
    }

    public final void setDayTradeWarningsStore(DayTradeWarningsStore dayTradeWarningsStore) {
        Intrinsics.checkNotNullParameter(dayTradeWarningsStore, "<set-?>");
        this.dayTradeWarningsStore = dayTradeWarningsStore;
    }

    public final OptionAlertOnboardingStore getOptionAlertOnboardingStore() {
        OptionAlertOnboardingStore optionAlertOnboardingStore = this.optionAlertOnboardingStore;
        if (optionAlertOnboardingStore != null) {
            return optionAlertOnboardingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionAlertOnboardingStore");
        return null;
    }

    public final void setOptionAlertOnboardingStore(OptionAlertOnboardingStore optionAlertOnboardingStore) {
        Intrinsics.checkNotNullParameter(optionAlertOnboardingStore, "<set-?>");
        this.optionAlertOnboardingStore = optionAlertOnboardingStore;
    }

    public final OptionRemoveReplaceOrderConfirmationStore getOptionRemoveReplaceOrderConfirmationStore() {
        OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore = this.optionRemoveReplaceOrderConfirmationStore;
        if (optionRemoveReplaceOrderConfirmationStore != null) {
            return optionRemoveReplaceOrderConfirmationStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionRemoveReplaceOrderConfirmationStore");
        return null;
    }

    public final void setOptionRemoveReplaceOrderConfirmationStore(OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore) {
        Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "<set-?>");
        this.optionRemoveReplaceOrderConfirmationStore = optionRemoveReplaceOrderConfirmationStore;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
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

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public int getConfirmationLayoutId() {
        return this.confirmationLayoutId;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderReceived(OptionOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.disposable.clear();
        this.orderRelay.accept(order);
        Observable<UiOptionOrder> observableRefCount = getOptionOrderStore().getOptionOrder(order.getId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable<R> map = observableRefCount.map(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.1
            @Override // io.reactivex.functions.Function
            public final State apply(UiOptionOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionOrderConfirmationFragment.INSTANCE.getRosettaState(it.getOptionOrder().getState());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableFilter = ObservablesKt.withPrevious(map).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples2<? extends Optional<? extends State>, ? extends State> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return tuples2.component1().getOrNull() != tuples2.component2();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFilter), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationFragment.onOrderReceived$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        disposable.addTo(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableRefCount), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationFragment.onOrderReceived$lambda$1(this.f$0, (UiOptionOrder) obj);
            }
        }), this.disposable);
        Observable<R> observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(UiOptionOrder uiOptionOrder) {
                Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
                return OptionOrderConfirmationFragment.this.getAccountProvider().streamAccount(uiOptionOrder.getAccountNumber()).take(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        disposable.addTo(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationFragment.onOrderReceived$lambda$2(this.f$0, (Account) obj);
            }
        }), this.disposable);
        Observable observableDistinctUntilChanged = observableRefCount.filter(new Predicate() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.7
            @Override // io.reactivex.functions.Predicate
            public final boolean test(UiOptionOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionOrder().getState().hasExecutions();
            }
        }).switchMapMaybe(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.8

            /* compiled from: OptionOrderConfirmationFragment.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/ClientComponentAlert;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onOrderReceived$8$1", m3645f = "OptionOrderConfirmationFragment.kt", m3646l = {192}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onOrderReceived$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ClientComponentAlert>, Object> {
                final /* synthetic */ UiOptionOrder $uiOptionOrder;
                int label;
                final /* synthetic */ OptionOrderConfirmationFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionOrderConfirmationFragment optionOrderConfirmationFragment, UiOptionOrder uiOptionOrder, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionOrderConfirmationFragment;
                    this.$uiOptionOrder = uiOptionOrder;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$uiOptionOrder, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ClientComponentAlert> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    DayTradeWarningsStore dayTradeWarningsStore = this.this$0.getDayTradeWarningsStore();
                    UUID id = this.$uiOptionOrder.getId();
                    String accountNumber = this.$uiOptionOrder.getAccountNumber();
                    this.label = 1;
                    Object optionsWarning = dayTradeWarningsStore.getOptionsWarning(id, accountNumber, this);
                    return optionsWarning == coroutine_suspended ? coroutine_suspended : optionsWarning;
                }
            }

            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends ClientComponentAlert> apply(UiOptionOrder uiOptionOrder) {
                Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
                OptionOrderConfirmationFragment optionOrderConfirmationFragment = OptionOrderConfirmationFragment.this;
                return RxFactory.DefaultImpls.rxMaybe$default(optionOrderConfirmationFragment, null, new AnonymousClass1(optionOrderConfirmationFragment, uiOptionOrder, null), 1, null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationFragment.onOrderReceived$lambda$3(this.f$0, (ClientComponentAlert) obj);
            }
        });
        Observable<UiOptionOrder> observableDistinctUntilChanged2 = observableRefCount.distinctUntilChanged(new BiPredicate() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.10
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(UiOptionOrder prev, UiOptionOrder cur) {
                Intrinsics.checkNotNullParameter(prev, "prev");
                Intrinsics.checkNotNullParameter(cur, "cur");
                return prev.getOptionOrder().getState() == cur.getOptionOrder().getState();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        disposable.addTo(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationFragment.onOrderReceived$lambda$4(this.f$0, (UiOptionOrder) obj);
            }
        }), this.disposable);
        Observable<R> observableSwitchMap2 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.12
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<UiAggregateOptionPositionFull>> apply(UiOptionOrder uiOptionOrder) {
                Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
                List<UiOptionOrderLeg> legs = uiOptionOrder.getLegs();
                if (!(legs instanceof Collection) || !legs.isEmpty()) {
                    Iterator<T> it = legs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((UiOptionOrderLeg) it.next()).getLeg().getPositionEffect() != OrderPositionEffect.OPEN) {
                            List<UiOptionOrderLeg> legs2 = uiOptionOrder.getLegs();
                            if (!(legs2 instanceof Collection) || !legs2.isEmpty()) {
                                Iterator<T> it2 = legs2.iterator();
                                while (it2.hasNext()) {
                                    if (((UiOptionOrderLeg) it2.next()).getLeg().getPositionEffect() != OrderPositionEffect.CLOSE) {
                                        Observable observableJust = Observable.just(Optional2.INSTANCE);
                                        Intrinsics.checkNotNull(observableJust);
                                        return observableJust;
                                    }
                                }
                            }
                        }
                    }
                }
                return OptionOrderConfirmationFragment.this.getAggregateOptionPositionStore().streamUiAggregateOptionPosition(uiOptionOrder);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        disposable.addTo(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationFragment.onOrderReceived$lambda$5(this.f$0, (Optional) obj);
            }
        }), this.disposable);
        Observable<R> map2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.14
            @Override // io.reactivex.functions.Function
            public final List<UUID> apply(UiOptionOrder uiOptionOrder) {
                Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
                List<UiOptionOrderLeg> legs = uiOptionOrder.getLegs();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                Iterator<T> it = legs.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UiOptionOrderLeg) it.next()).getLeg().getOptionId());
                }
                return arrayList;
            }
        });
        final OptionQuoteStore optionQuoteStore = getOptionQuoteStore();
        Observable observableSwitchMap3 = map2.switchMap(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.15
            @Override // io.reactivex.functions.Function
            public final Observable<?> apply(List<UUID> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionQuoteStore.pollQuotes(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        disposable.addTo(ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap3), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null), this.disposable);
        Observable<R> observableSwitchMap4 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.16
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<ClientAggregateOptionStrategyQuote>> apply(final UiOptionOrder uiOptionOrder) {
                Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
                List<UiOptionOrderLeg> legs = uiOptionOrder.getLegs();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                Iterator<T> it = legs.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UiOptionOrderLeg) it.next()).getLeg().getOptionId());
                }
                return OptionOrderConfirmationFragment.this.getOptionQuoteStore().getAllOptionQuotes(arrayList).map(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onOrderReceived.16.1
                    @Override // io.reactivex.functions.Function
                    public final Optional<ClientAggregateOptionStrategyQuote> apply(Map<UUID, OptionInstrumentQuote> it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        Companion companion = OptionOrderConfirmationFragment.INSTANCE;
                        UiOptionOrder uiOptionOrder2 = uiOptionOrder;
                        Intrinsics.checkNotNull(uiOptionOrder2);
                        return Optional3.asOptional(companion.toAggregateQuote(it2, uiOptionOrder2));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        disposable.addTo(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationFragment.onOrderReceived$lambda$6(this.f$0, (Optional) obj);
            }
        }), this.disposable);
        disposable.addTo(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getOptionAlertOnboardingStore().getShouldShowOptionAlertOnboarding()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C2980318(getOptionOrderConfirmationLayout())), this.disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$0(OptionOrderConfirmationFragment optionOrderConfirmationFragment, Tuples2 tuples2) {
        Optional optional = (Optional) tuples2.component1();
        State state = (State) tuples2.component2();
        Args.PassthroughContext passthroughContext = ((Args) INSTANCE.getArgs((Fragment) optionOrderConfirmationFragment)).getPassthroughContext();
        if (passthroughContext == null) {
            return Unit.INSTANCE;
        }
        TraderEventLogger eventLogger = optionOrderConfirmationFragment.getEventLogger();
        OrderFormStep orderFormStep = OrderFormStep.ORDER_STATE_CHANGE;
        OptionOrderPayload optionOrderPayload = passthroughContext.getOptionOrderPayload();
        BigDecimal bidForLogging = passthroughContext.getBidForLogging();
        String string2 = bidForLogging != null ? bidForLogging.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        BigDecimal askForLogging = passthroughContext.getAskForLogging();
        String string3 = askForLogging != null ? askForLogging.toString() : null;
        String str = string3 != null ? string3 : "";
        int numLegs = passthroughContext.getNumLegs();
        State state2 = (State) optional.getOrNull();
        if (state2 == null) {
            state2 = State.STATE_UNSPECIFIED;
        }
        Intrinsics.checkNotNull(state);
        eventLogger.logOptionOrderEvent(orderFormStep, optionOrderPayload, new OptionOrderMeta(string2, str, null, null, null, null, null, null, numLegs, null, null, null, null, null, state2, state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073692412, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$1(OptionOrderConfirmationFragment optionOrderConfirmationFragment, UiOptionOrder uiOptionOrder) {
        optionOrderConfirmationFragment.getDuxo().bindOptionOrder(uiOptionOrder);
        OptionOrderConfirmationLayout optionOrderConfirmationLayout = optionOrderConfirmationFragment.getOptionOrderConfirmationLayout();
        Intrinsics.checkNotNull(uiOptionOrder);
        Args.PassthroughContext passthroughContext = ((Args) INSTANCE.getArgs((Fragment) optionOrderConfirmationFragment)).getPassthroughContext();
        optionOrderConfirmationLayout.bindOptionOrder(uiOptionOrder, passthroughContext != null ? passthroughContext.getOptionCollateral() : null);
        if (optionOrderConfirmationFragment.getConfirmationContainer().getVisibility() == 0 && uiOptionOrder.getIsPending()) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_ORDER_PENDING, false);
        }
        if (optionOrderConfirmationFragment.getConfirmationContainer().getVisibility() == 0 && uiOptionOrder.getOptionOrder().getState().isFinal()) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_ORDER_FINAL, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$2(OptionOrderConfirmationFragment optionOrderConfirmationFragment, Account account) {
        OptionOrderConfirmationDuxo duxo = optionOrderConfirmationFragment.getDuxo();
        Intrinsics.checkNotNull(account);
        duxo.setAccount(account);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$3(OptionOrderConfirmationFragment optionOrderConfirmationFragment, ClientComponentAlert clientComponentAlert) {
        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindDisableL3EntryPointOverride(true);
        Intrinsics.checkNotNull(clientComponentAlert);
        optionOrderConfirmationFragment.showPatternDayTradeAlert(clientComponentAlert);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$4(OptionOrderConfirmationFragment optionOrderConfirmationFragment, UiOptionOrder uiOptionOrder) {
        if (uiOptionOrder.getOptionOrder().getState() == OrderState.FILLED) {
            UUID id = uiOptionOrder.getOptionChain().getId();
            optionOrderConfirmationFragment.getAccountProvider().refresh(true);
            optionOrderConfirmationFragment.getOptionPositionStore().refreshWithAllAccounts(true, id);
            optionOrderConfirmationFragment.getAggregateOptionPositionStore().refreshWithAllAccounts(true, CollectionsKt.listOf(id));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$5(OptionOrderConfirmationFragment optionOrderConfirmationFragment, Optional optional) {
        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindOptionPosition((UiAggregateOptionPositionFull) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$6(OptionOrderConfirmationFragment optionOrderConfirmationFragment, Optional optional) {
        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindQuoteForBidAskRow((ClientAggregateOptionStrategyQuote) optional.component1());
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onOrderReceived$18 */
    /* synthetic */ class C2980318 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C2980318(Object obj) {
            super(1, obj, OptionOrderConfirmationLayout.class, "bindShouldShowPostTradeOptionAlertHook", "bindShouldShowPostTradeOptionAlertHook(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((OptionOrderConfirmationLayout) this.receiver).bindShouldShowPostTradeOptionAlertHook(z);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        Companion companion = INSTANCE;
        String optionTransitionReason = ((Args) companion.getArgs((Fragment) this)).getOptionTransitionReason();
        if (optionTransitionReason != null) {
            setTransitionReason(optionTransitionReason);
        }
        getOptionOrderConfirmationLayout().bindSource(((Args) companion.getArgs((Fragment) this)).getSource());
        getOptionOrderConfirmationLayout().bindReplaceOrderCallbacks(new C298101(this));
        getOptionOrderConfirmationLayout().bindGoToOptionsOnboardingCallbacks(new C298112(this));
        getOptionOrderConfirmationLayout().bindShowMarginAccountUpsellCallbacks(new C298123(this));
        BaseFragment.collectDuxoState$default(this, null, new C298134(null), 1, null);
    }

    /* compiled from: OptionOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onViewCreated$1 */
    /* synthetic */ class C298101 extends FunctionReferenceImpl implements Function2<UiOptionOrder, RdsButton, Unit> {
        C298101(Object obj) {
            super(2, obj, OptionOrderConfirmationFragment.class, "replaceOrder", "replaceOrder(Lcom/robinhood/models/ui/UiOptionOrder;Lcom/robinhood/android/designsystem/button/RdsButton;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(UiOptionOrder uiOptionOrder, RdsButton rdsButton) {
            invoke2(uiOptionOrder, rdsButton);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(UiOptionOrder p0, RdsButton p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((OptionOrderConfirmationFragment) this.receiver).replaceOrder(p0, p1);
        }
    }

    /* compiled from: OptionOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onViewCreated$2 */
    /* synthetic */ class C298112 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C298112(Object obj) {
            super(1, obj, OptionOrderConfirmationFragment.class, "goToOptionOnboarding", "goToOptionOnboarding(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionOrderConfirmationFragment) this.receiver).goToOptionOnboarding(p0);
        }
    }

    /* compiled from: OptionOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onViewCreated$3 */
    /* synthetic */ class C298123 extends FunctionReferenceImpl implements Function1<MarginAccountUpsellFragmentKey, Unit> {
        C298123(Object obj) {
            super(1, obj, OptionOrderConfirmationFragment.class, "goToMarginAccountOnboarding", "goToMarginAccountOnboarding(Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey) {
            invoke2(marginAccountUpsellFragmentKey);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MarginAccountUpsellFragmentKey p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionOrderConfirmationFragment) this.receiver).goToMarginAccountOnboarding(p0);
        }
    }

    /* compiled from: OptionOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onViewCreated$4", m3645f = "OptionOrderConfirmationFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onViewCreated$4 */
    static final class C298134 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C298134(Continuation<? super C298134> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderConfirmationFragment.this.new C298134(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C298134) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<OptionOrderConfirmationViewState> stateFlow = OptionOrderConfirmationFragment.this.getDuxo().getStateFlow();
                final OptionOrderConfirmationFragment optionOrderConfirmationFragment = OptionOrderConfirmationFragment.this;
                FlowCollector<? super OptionOrderConfirmationViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onViewCreated.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((OptionOrderConfirmationViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(OptionOrderConfirmationViewState optionOrderConfirmationViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindOrderConfirmationTitle(optionOrderConfirmationViewState.getOrderConfirmationTitle());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindOrderStatePromptText(optionOrderConfirmationViewState.getOrderStatePrompt());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindFillPriceRow(optionOrderConfirmationViewState.getFillPriceRowState());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindLimitPriceRow(optionOrderConfirmationViewState.getLimitPriceRowState());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindStopPriceRow(optionOrderConfirmationViewState.getStopPriceRowState());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindTotalCreditOrCostLabel(optionOrderConfirmationViewState.getTotalCreditOrCostLabelText());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindTotalCreditOrCostValue(optionOrderConfirmationViewState.getTotalCreditOrCostValueText());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindFeeFooterState(optionOrderConfirmationViewState.getFeeFooterState());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindReplaceOrderBtnVisible(optionOrderConfirmationViewState.isReplaceOrderBtnVisible());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindAccountInfo(optionOrderConfirmationViewState.getAccountNameTitle(), optionOrderConfirmationViewState.getAccountNameSubtitle());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindIsEligibleToShowL3EntryPoint(optionOrderConfirmationViewState.isEligibleToShowL3EntryPoint());
                        optionOrderConfirmationFragment.getOptionOrderConfirmationLayout().bindMarginAccountUpsell(optionOrderConfirmationViewState.getMarginAccountUpsell());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<R> observableSwitchMap = this.orderRelay.switchMap(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionOrder> apply(OptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return OptionOrderConfirmationFragment.this.getOptionOrderStore().pollWhileNonFinal(order.getId(), Durations.INSTANCE.getFIVE_SECONDS());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        AccountProvider.DefaultImpls.refresh$default(getAccountProvider(), false, 1, null);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getSource() == OptionOrderFormSource.STRATEGY_CHAIN) {
            Observable observableTake = this.orderRelay.switchMap(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.onResume.2
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Account> apply(OptionOrder it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return OptionOrderConfirmationFragment.this.getAccountProvider().streamAccount(it.getAccountNumber());
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            Observable map = observableTake.map(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$onResume$$inlined$mapDistinctNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Survey survey;
                    Intrinsics.checkNotNullParameter(it, "it");
                    String optionLevel = ((Account) it).getOptionLevel();
                    if (Intrinsics.areEqual(optionLevel, OptionLevel.LEVEL_2)) {
                        survey = Survey.ORDER_CONFIRMATION_STRAT_BUILDER_L2;
                    } else {
                        survey = Intrinsics.areEqual(optionLevel, OptionLevel.LEVEL_3) ? Survey.ORDER_CONFIRMATION_STRAT_BUILDER_L3 : null;
                    }
                    return Optional3.asOptional(survey);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C29795x5d5c005a<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderConfirmationFragment.onResume$lambda$8(this.f$0, (Survey) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(OptionOrderConfirmationFragment optionOrderConfirmationFragment, Survey survey) {
        Intrinsics.checkNotNullParameter(survey, "survey");
        optionOrderConfirmationFragment.getUserLeapManager().presentSurveyIfNecessary(optionOrderConfirmationFragment, survey);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onConfirmationShown() {
        getDuxo().logConfirmationShown();
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_PATTERN_DAY_TRADE, button.getLoggingIdentifier(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        return false;
    }

    public final void animateConfirmationExit() {
        final ViewGroup root = getRoot();
        OneShotPreDrawListener.add(root, new Runnable() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$animateConfirmationExit$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                Context context = this.getContext();
                if (context == null || Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.FALSE)) {
                    return;
                }
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.getConfirmationContainer().animate().translationY(-this.getRoot().getHeight());
                final OptionOrderConfirmationFragment optionOrderConfirmationFragment = this;
                viewPropertyAnimatorTranslationY.withEndAction(new Runnable() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$animateConfirmationExit$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        optionOrderConfirmationFragment.getCallbacks().onConfirmationExitAnimationFinished();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceOrder(final UiOptionOrder uiOptionOrder, final RdsButton replaceOrderBtn) {
        getDuxo().logReplaceButtonTap();
        replaceOrderBtn.setLoading(true);
        Observable<Optional<OptionOrderBundle>> observableOnErrorResumeNext = getOptionRemoveReplaceOrderConfirmationStore().maybeCancelAndGetOrderBundle(uiOptionOrder).onErrorResumeNext(getActivityErrorHandler());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        Observable observableDoOnTerminate = ObservablesAndroid.observeOnMainThread(observableOnErrorResumeNext).doOnTerminate(new Action() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment.replaceOrder.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                replaceOrderBtn.setLoading(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnTerminate, "doOnTerminate(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDoOnTerminate, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationFragment.replaceOrder$lambda$10(this.f$0, uiOptionOrder, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replaceOrder$lambda$10(OptionOrderConfirmationFragment optionOrderConfirmationFragment, UiOptionOrder uiOptionOrder, Optional optional) {
        OptionOrderBundle optionOrderBundle = (OptionOrderBundle) optional.component1();
        if (optionOrderBundle != null) {
            optionOrderConfirmationFragment.requireBaseActivity().finish();
            Navigator navigator = optionOrderConfirmationFragment.getNavigator();
            Context contextRequireContext = optionOrderConfirmationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            OptionOrderFormSource source = ((Args) INSTANCE.getArgs((Fragment) optionOrderConfirmationFragment)).getSource();
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new OptionOrderIntentKey.FromOptionOrderBundle(null, uiOptionOrder.getAccountNumber(), optionOrderBundle, uiOptionOrder, null, null, null, false, false, uiOptionOrder.getOptionOrder().getSource() == OptionOrder.FormSource.STRATEGY_ROLL, null, source, null, null, 13809, null), null, false, null, null, 60, null);
        } else {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext2 = optionOrderConfirmationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext2).setMessage(C11048R.string.order_detail_order_cancel_sent_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            Context contextRequireContext3 = optionOrderConfirmationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext(contextRequireContext3).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cancelSent", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToOptionOnboarding(String accountNumber) {
        getDuxo().logGoToOptionOnboarding();
        requireBaseActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new OptionOnboarding(new OptionOnboarding2.AccountNumber(accountNumber), new OptionOnboarding.OptionOnboardingSource.Legacy(OptionOnboarding.OptionOnboardingSource.Legacy.SOURCE_POST_TRADE_UPSELL), null, 4, null), null, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToMarginAccountOnboarding(MarginAccountUpsellFragmentKey fragmentKey) {
        requireBaseActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void showPatternDayTradeAlert(ClientComponentAlert alert) {
        DialogFragment dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(alert, false, false, 6, null), null, 2, null);
        dialogFragmentCreateDialogFragment$default.setCancelable(false);
        dialogFragmentCreateDialogFragment$default.show(getChildFragmentManager(), "pdt-warning-option");
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), "pdt-order-alert-option", "", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    /* compiled from: OptionOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args;", "Landroid/os/Parcelable;", "passthroughContext", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args$PassthroughContext;", "optionTransitionReason", "", "source", "Lrosetta/option/OptionOrderFormSource;", "<init>", "(Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args$PassthroughContext;Ljava/lang/String;Lrosetta/option/OptionOrderFormSource;)V", "getPassthroughContext", "()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args$PassthroughContext;", "getOptionTransitionReason", "()Ljava/lang/String;", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PassthroughContext", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String optionTransitionReason;
        private final PassthroughContext passthroughContext;
        private final OptionOrderFormSource source;

        /* compiled from: OptionOrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() == 0 ? null : PassthroughContext.CREATOR.createFromParcel(parcel), parcel.readString(), OptionOrderFormSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, PassthroughContext passthroughContext, String str, OptionOrderFormSource optionOrderFormSource, int i, Object obj) {
            if ((i & 1) != 0) {
                passthroughContext = args.passthroughContext;
            }
            if ((i & 2) != 0) {
                str = args.optionTransitionReason;
            }
            if ((i & 4) != 0) {
                optionOrderFormSource = args.source;
            }
            return args.copy(passthroughContext, str, optionOrderFormSource);
        }

        /* renamed from: component1, reason: from getter */
        public final PassthroughContext getPassthroughContext() {
            return this.passthroughContext;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOptionTransitionReason() {
            return this.optionTransitionReason;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionOrderFormSource getSource() {
            return this.source;
        }

        public final Args copy(PassthroughContext passthroughContext, String optionTransitionReason, OptionOrderFormSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(passthroughContext, optionTransitionReason, source);
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
            return Intrinsics.areEqual(this.passthroughContext, args.passthroughContext) && Intrinsics.areEqual(this.optionTransitionReason, args.optionTransitionReason) && this.source == args.source;
        }

        public int hashCode() {
            PassthroughContext passthroughContext = this.passthroughContext;
            int iHashCode = (passthroughContext == null ? 0 : passthroughContext.hashCode()) * 31;
            String str = this.optionTransitionReason;
            return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Args(passthroughContext=" + this.passthroughContext + ", optionTransitionReason=" + this.optionTransitionReason + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            PassthroughContext passthroughContext = this.passthroughContext;
            if (passthroughContext == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                passthroughContext.writeToParcel(dest, flags);
            }
            dest.writeString(this.optionTransitionReason);
            dest.writeString(this.source.name());
        }

        public Args(PassthroughContext passthroughContext, String str, OptionOrderFormSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.passthroughContext = passthroughContext;
            this.optionTransitionReason = str;
            this.source = source;
        }

        public final PassthroughContext getPassthroughContext() {
            return this.passthroughContext;
        }

        public final String getOptionTransitionReason() {
            return this.optionTransitionReason;
        }

        public final OptionOrderFormSource getSource() {
            return this.source;
        }

        /* compiled from: OptionOrderConfirmationFragment.kt */
        @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jc\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010+\u001a\u00020\nJ\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\nHÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args$PassthroughContext;", "Landroid/os/Parcelable;", "optionCollateral", "Lcom/robinhood/models/api/ApiCollateral;", "optionOrderPayload", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", "bidForLogging", "Ljava/math/BigDecimal;", "askForLogging", "numLegs", "", "orderIdToReplace", "Ljava/util/UUID;", "singleUiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionOrderFee", "Lcom/robinhood/models/ui/UiOptionOrderFee;", "<init>", "(Lcom/robinhood/models/api/ApiCollateral;Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/util/UUID;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/ui/UiOptionOrderFee;)V", "getOptionCollateral", "()Lcom/robinhood/models/api/ApiCollateral;", "getOptionOrderPayload", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", "getBidForLogging", "()Ljava/math/BigDecimal;", "getAskForLogging", "getNumLegs", "()I", "getOrderIdToReplace", "()Ljava/util/UUID;", "getSingleUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionOrderFee", "()Lcom/robinhood/models/ui/UiOptionOrderFee;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PassthroughContext implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<PassthroughContext> CREATOR = new Creator();
            private final BigDecimal askForLogging;
            private final BigDecimal bidForLogging;
            private final int numLegs;
            private final ApiCollateral optionCollateral;
            private final OptionOrderPayload optionOrderPayload;
            private final UUID orderIdToReplace;
            private final UiOptionChain singleUiOptionChain;
            private final UiOptionOrderFee uiOptionOrderFee;

            /* compiled from: OptionOrderConfirmationFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<PassthroughContext> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PassthroughContext createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PassthroughContext((ApiCollateral) parcel.readParcelable(PassthroughContext.class.getClassLoader()), (OptionOrderPayload) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt(), (UUID) parcel.readSerializable(), (UiOptionChain) parcel.readParcelable(PassthroughContext.class.getClassLoader()), (UiOptionOrderFee) parcel.readParcelable(PassthroughContext.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PassthroughContext[] newArray(int i) {
                    return new PassthroughContext[i];
                }
            }

            public static /* synthetic */ PassthroughContext copy$default(PassthroughContext passthroughContext, ApiCollateral apiCollateral, OptionOrderPayload optionOrderPayload, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, UUID uuid, UiOptionChain uiOptionChain, UiOptionOrderFee uiOptionOrderFee, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    apiCollateral = passthroughContext.optionCollateral;
                }
                if ((i2 & 2) != 0) {
                    optionOrderPayload = passthroughContext.optionOrderPayload;
                }
                if ((i2 & 4) != 0) {
                    bigDecimal = passthroughContext.bidForLogging;
                }
                if ((i2 & 8) != 0) {
                    bigDecimal2 = passthroughContext.askForLogging;
                }
                if ((i2 & 16) != 0) {
                    i = passthroughContext.numLegs;
                }
                if ((i2 & 32) != 0) {
                    uuid = passthroughContext.orderIdToReplace;
                }
                if ((i2 & 64) != 0) {
                    uiOptionChain = passthroughContext.singleUiOptionChain;
                }
                if ((i2 & 128) != 0) {
                    uiOptionOrderFee = passthroughContext.uiOptionOrderFee;
                }
                UiOptionChain uiOptionChain2 = uiOptionChain;
                UiOptionOrderFee uiOptionOrderFee2 = uiOptionOrderFee;
                int i3 = i;
                UUID uuid2 = uuid;
                return passthroughContext.copy(apiCollateral, optionOrderPayload, bigDecimal, bigDecimal2, i3, uuid2, uiOptionChain2, uiOptionOrderFee2);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiCollateral getOptionCollateral() {
                return this.optionCollateral;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionOrderPayload getOptionOrderPayload() {
                return this.optionOrderPayload;
            }

            /* renamed from: component3, reason: from getter */
            public final BigDecimal getBidForLogging() {
                return this.bidForLogging;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getAskForLogging() {
                return this.askForLogging;
            }

            /* renamed from: component5, reason: from getter */
            public final int getNumLegs() {
                return this.numLegs;
            }

            /* renamed from: component6, reason: from getter */
            public final UUID getOrderIdToReplace() {
                return this.orderIdToReplace;
            }

            /* renamed from: component7, reason: from getter */
            public final UiOptionChain getSingleUiOptionChain() {
                return this.singleUiOptionChain;
            }

            /* renamed from: component8, reason: from getter */
            public final UiOptionOrderFee getUiOptionOrderFee() {
                return this.uiOptionOrderFee;
            }

            public final PassthroughContext copy(ApiCollateral optionCollateral, OptionOrderPayload optionOrderPayload, BigDecimal bidForLogging, BigDecimal askForLogging, int numLegs, UUID orderIdToReplace, UiOptionChain singleUiOptionChain, UiOptionOrderFee uiOptionOrderFee) {
                Intrinsics.checkNotNullParameter(optionOrderPayload, "optionOrderPayload");
                Intrinsics.checkNotNullParameter(singleUiOptionChain, "singleUiOptionChain");
                return new PassthroughContext(optionCollateral, optionOrderPayload, bidForLogging, askForLogging, numLegs, orderIdToReplace, singleUiOptionChain, uiOptionOrderFee);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PassthroughContext)) {
                    return false;
                }
                PassthroughContext passthroughContext = (PassthroughContext) other;
                return Intrinsics.areEqual(this.optionCollateral, passthroughContext.optionCollateral) && Intrinsics.areEqual(this.optionOrderPayload, passthroughContext.optionOrderPayload) && Intrinsics.areEqual(this.bidForLogging, passthroughContext.bidForLogging) && Intrinsics.areEqual(this.askForLogging, passthroughContext.askForLogging) && this.numLegs == passthroughContext.numLegs && Intrinsics.areEqual(this.orderIdToReplace, passthroughContext.orderIdToReplace) && Intrinsics.areEqual(this.singleUiOptionChain, passthroughContext.singleUiOptionChain) && Intrinsics.areEqual(this.uiOptionOrderFee, passthroughContext.uiOptionOrderFee);
            }

            public int hashCode() {
                ApiCollateral apiCollateral = this.optionCollateral;
                int iHashCode = (((apiCollateral == null ? 0 : apiCollateral.hashCode()) * 31) + this.optionOrderPayload.hashCode()) * 31;
                BigDecimal bigDecimal = this.bidForLogging;
                int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
                BigDecimal bigDecimal2 = this.askForLogging;
                int iHashCode3 = (((iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Integer.hashCode(this.numLegs)) * 31;
                UUID uuid = this.orderIdToReplace;
                int iHashCode4 = (((iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.singleUiOptionChain.hashCode()) * 31;
                UiOptionOrderFee uiOptionOrderFee = this.uiOptionOrderFee;
                return iHashCode4 + (uiOptionOrderFee != null ? uiOptionOrderFee.hashCode() : 0);
            }

            public String toString() {
                return "PassthroughContext(optionCollateral=" + this.optionCollateral + ", optionOrderPayload=" + this.optionOrderPayload + ", bidForLogging=" + this.bidForLogging + ", askForLogging=" + this.askForLogging + ", numLegs=" + this.numLegs + ", orderIdToReplace=" + this.orderIdToReplace + ", singleUiOptionChain=" + this.singleUiOptionChain + ", uiOptionOrderFee=" + this.uiOptionOrderFee + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.optionCollateral, flags);
                dest.writeSerializable(this.optionOrderPayload);
                dest.writeSerializable(this.bidForLogging);
                dest.writeSerializable(this.askForLogging);
                dest.writeInt(this.numLegs);
                dest.writeSerializable(this.orderIdToReplace);
                dest.writeParcelable(this.singleUiOptionChain, flags);
                dest.writeParcelable(this.uiOptionOrderFee, flags);
            }

            public PassthroughContext(ApiCollateral apiCollateral, OptionOrderPayload optionOrderPayload, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, UUID uuid, UiOptionChain singleUiOptionChain, UiOptionOrderFee uiOptionOrderFee) {
                Intrinsics.checkNotNullParameter(optionOrderPayload, "optionOrderPayload");
                Intrinsics.checkNotNullParameter(singleUiOptionChain, "singleUiOptionChain");
                this.optionCollateral = apiCollateral;
                this.optionOrderPayload = optionOrderPayload;
                this.bidForLogging = bigDecimal;
                this.askForLogging = bigDecimal2;
                this.numLegs = i;
                this.orderIdToReplace = uuid;
                this.singleUiOptionChain = singleUiOptionChain;
                this.uiOptionOrderFee = uiOptionOrderFee;
            }

            public final ApiCollateral getOptionCollateral() {
                return this.optionCollateral;
            }

            public final OptionOrderPayload getOptionOrderPayload() {
                return this.optionOrderPayload;
            }

            public final BigDecimal getBidForLogging() {
                return this.bidForLogging;
            }

            public final BigDecimal getAskForLogging() {
                return this.askForLogging;
            }

            public final int getNumLegs() {
                return this.numLegs;
            }

            public final UUID getOrderIdToReplace() {
                return this.orderIdToReplace;
            }

            public final UiOptionChain getSingleUiOptionChain() {
                return this.singleUiOptionChain;
            }

            public final UiOptionOrderFee getUiOptionOrderFee() {
                return this.uiOptionOrderFee;
            }
        }
    }

    /* compiled from: OptionOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002R\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args;", "<init>", "()V", "toAggregateQuote", "Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "getLegContext", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$LegContext;", "Lcom/robinhood/models/db/OptionOrderLeg;", "legQuotesMap", "rosettaState", "Lrosetta/order/State;", "Lcom/robinhood/shared/models/history/shared/OrderState;", "getRosettaState", "(Lcom/robinhood/shared/models/history/shared/OrderState;)Lrosetta/order/State;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentWithArgsCompanion<OptionOrderConfirmationFragment, Args> {

        /* compiled from: OptionOrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderState.values().length];
                try {
                    iArr[OrderState.QUEUED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderState.NEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderState.UNCONFIRMED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderState.CONFIRMED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderState.PARTIALLY_FILLED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OrderState.PENDING_CANCELLED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OrderState.FILLED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OrderState.REJECTED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[OrderState.CANCELED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[OrderState.FAILED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[OrderState.VOIDED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[OrderState.TRIGGERED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[OrderState.NOT_ACCEPTED.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOrderConfirmationFragment optionOrderConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOrderConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOrderConfirmationFragment newInstance(Args args) {
            return (OptionOrderConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOrderConfirmationFragment optionOrderConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOrderConfirmationFragment, args);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ClientAggregateOptionStrategyQuote toAggregateQuote(Map<UUID, OptionInstrumentQuote> map, UiOptionOrder uiOptionOrder) {
            List<UiOptionOrderLeg> legs = uiOptionOrder.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                OptionQuoteAggregator.LegContext legContext = OptionOrderConfirmationFragment.INSTANCE.getLegContext(((UiOptionOrderLeg) it.next()).getLeg(), map);
                if (legContext == null) {
                    return null;
                }
                arrayList.add(legContext);
            }
            return new ClientAggregateOptionStrategyQuote(arrayList, uiOptionOrder.getDirection());
        }

        private final OptionQuoteAggregator.LegContext getLegContext(OptionOrderLeg optionOrderLeg, Map<UUID, OptionInstrumentQuote> map) {
            OptionInstrumentQuote optionInstrumentQuote = map.get(optionOrderLeg.getOptionId());
            if (optionInstrumentQuote == null) {
                return null;
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(optionOrderLeg.getRatioQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return new OptionQuoteAggregator.LegContext(optionInstrumentQuote, optionOrderLeg.getSide(), bigDecimalValueOf);
        }

        public final State getRosettaState(OrderState orderState) {
            Intrinsics.checkNotNullParameter(orderState, "<this>");
            switch (WhenMappings.$EnumSwitchMapping$0[orderState.ordinal()]) {
                case 1:
                    return State.QUEUED;
                case 2:
                    return State.NEW;
                case 3:
                    return State.UNCONFIRMED;
                case 4:
                    return State.CONFIRMED;
                case 5:
                    return State.PARTIALLY_FILLED;
                case 6:
                    return State.PENDING_CANCELED;
                case 7:
                    return State.PARTIALLY_FILLED_REST_CANCELED;
                case 8:
                    return State.FILLED;
                case 9:
                    return State.REJECTED;
                case 10:
                    return State.CANCELED;
                case 11:
                    return State.FAILED;
                case 12:
                    return State.VOIDED;
                case 13:
                case 14:
                    return State.STATE_UNSPECIFIED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
