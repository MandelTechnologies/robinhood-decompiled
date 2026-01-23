package com.robinhood.android.futures.trade.p147ui.ladder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.decimal.DecimalUtility;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.futures.contracts.FuturesLadderFragmentKey;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxManager;
import com.robinhood.android.futures.trade.extensions.Vibrate2;
import com.robinhood.android.futures.trade.p147ui.OrderFormResults;
import com.robinhood.android.futures.trade.p147ui.ladder.LadderEvent;
import com.robinhood.android.lib.futures.trade.FuturesLadderFragmentCallbacks;
import com.robinhood.android.linking.MobileLinkingData;
import com.robinhood.android.linking.MobileLinkingData2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.contracts.experiments.FuturesOrderChecksToGuided;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderPriceType;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesLadderFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u0002002\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\r\u00101\u001a\u00020(H\u0017¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020(2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\u000e\u00107\u001a\u00020(H\u0096@¢\u0006\u0002\u00108J\u000e\u00109\u001a\u00020(H\u0096@¢\u0006\u0002\u00108J\u000e\u0010:\u001a\u00020(H\u0096@¢\u0006\u0002\u00108J\u0016\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020=H\u0096@¢\u0006\u0002\u0010>J\u001e\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020=H\u0096@¢\u0006\u0002\u0010CJ\t\u0010D\u001a\u00020EH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GX\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L²\u0006\n\u0010M\u001a\u00020NX\u008a\u0084\u0002²\u0006\u0012\u0010O\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "ladderFtuxManager", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;", "getLadderFtuxManager", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;", "setLadderFtuxManager", "(Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;)V", "callbacks", "Lcom/robinhood/android/lib/futures/trade/FuturesLadderFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/futures/trade/FuturesLadderFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "mobileLinkingCallbacks", "Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "getMobileLinkingCallbacks", "()Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "mobileLinkingCallbacks$delegate", "duxo", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo;", "getDuxo", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "applyForAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "focusOnQuantityText", "focusOnPriceText", "makeDeposit", "suggestedAmount", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrice", "priceType", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;", "newPrice", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-futures-trade_externalDebug", "state", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState;", "eventState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FuturesLadderFragment extends GenericComposeFragment implements RegionGated, FuturesOrderCheckResolver {
    public static final int LADDER_COMPONENTS_ENTRY_DELAY_IN_MILLIS = 333;
    public ExperimentsStore experimentsStore;
    public LadderFtuxManager ladderFtuxManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FuturesLadderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/futures/trade/FuturesLadderFragmentCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(FuturesLadderFragment.class, "mobileLinkingCallbacks", "getMobileLinkingCallbacks()Lcom/robinhood/android/linking/MobileLinkingCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final CubicBezierEasing LADDER_COMPONENTS_ENTRY_EASING = new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(FuturesTradingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(FuturesLadderFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof FuturesLadderFragmentCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: mobileLinkingCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 mobileLinkingCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(MobileLinkingData2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$special$$inlined$hostActivityCallbacks$2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MobileLinkingData2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FuturesLadderDuxo.class);

    /* compiled from: FuturesLadderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment", m3645f = "FuturesLadderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "makeDeposit")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$makeDeposit$1 */
    static final class C175201 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C175201(Continuation<? super C175201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesLadderFragment.this.makeDeposit(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(FuturesLadderFragment futuresLadderFragment, int i, Composer composer, int i2) {
        futuresLadderFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<LadderEvent> event) {
        EventConsumer<LadderEvent> eventConsumerInvoke;
        EventConsumer<LadderEvent> eventConsumerInvoke2;
        EventConsumer<LadderEvent> eventConsumerInvoke3;
        EventConsumer<LadderEvent> eventConsumerInvoke4;
        EventConsumer<LadderEvent> eventConsumerInvoke5;
        EventConsumer<LadderEvent> eventConsumerInvoke6;
        EventConsumer<LadderEvent> eventConsumerInvoke7;
        if ((event.getData() instanceof LadderEvent.ApiOrNetworkError) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                    m14777invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14777invoke(Object it) throws Throwable {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this.requireBaseActivity(), ((LadderEvent.ApiOrNetworkError) event.getData()).getError(), true, false, 0, null, 56, null);
                }
            });
        }
        if ((event.getData() instanceof LadderEvent.ReviewOrder) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14778invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14778invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().reviewOrder(((LadderEvent.ReviewOrder) event.getData()).getOrder());
                }
            });
        }
        if ((event.getData() instanceof LadderEvent.HapticFeedbacks) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14779invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14779invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ViewCompat.performHapticFeedback(this.requireView(), ((LadderEvent.HapticFeedbacks) event.getData()).getConstant());
                }
            });
        }
        if ((event.getData() instanceof LadderEvent.Vibrate) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14780invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14780invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    LadderEvent.Vibrate vibrate = (LadderEvent.Vibrate) event.getData();
                    Context context = this.getContext();
                    if (context != null) {
                        Vibrate2.vibrate(context, vibrate.getDuration());
                    }
                }
            });
        }
        if ((event.getData() instanceof LadderEvent.LadderKillswitchIsActive) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14781invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14781invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onExitLadder();
                }
            });
        }
        if ((event.getData() instanceof LadderEvent.OpenAccountHistory) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$handleEvent$$inlined$consumeIfType$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14782invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14782invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    LadderEvent.OpenAccountHistory openAccountHistory = (LadderEvent.OpenAccountHistory) event.getData();
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, openAccountHistory.getFragmentKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
                }
            });
        }
        if (!(event.getData() instanceof LadderEvent.PrefetchFtuxLotties) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$handleEvent$$inlined$consumeIfType$7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m14783invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m14783invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getLadderFtuxManager().prefetchLotties(this.getContext(), DayNightChanges.isDay(this.getScarletManager()), true);
            }
        });
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

    public final LadderFtuxManager getLadderFtuxManager() {
        LadderFtuxManager ladderFtuxManager = this.ladderFtuxManager;
        if (ladderFtuxManager != null) {
            return ladderFtuxManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ladderFtuxManager");
        return null;
    }

    public final void setLadderFtuxManager(LadderFtuxManager ladderFtuxManager) {
        Intrinsics.checkNotNullParameter(ladderFtuxManager, "<set-?>");
        this.ladderFtuxManager = ladderFtuxManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesLadderFragmentCallbacks getCallbacks() {
        return (FuturesLadderFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final MobileLinkingData2 getMobileLinkingCallbacks() {
        return (MobileLinkingData2) this.mobileLinkingCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesLadderDuxo getDuxo() {
        return (FuturesLadderDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        String string2 = getDuxo().getStateFlow().getValue().getInitialContractId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(8);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        OrderFormResults.listenToOrderFormResult(parentFragmentManager, this, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesLadderFragment.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(FuturesLadderFragment futuresLadderFragment, boolean z) {
        if (z) {
            futuresLadderFragment.getDuxo().clearSelectedRowIndex();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LadderFtuxManager.prefetchLotties$default(getLadderFtuxManager(), getContext(), DayNightChanges.isDay(getScarletManager()), false, 4, null);
        BaseFragment.collectDuxoState$default(this, null, new C175221(null), 1, null);
    }

    /* compiled from: FuturesLadderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$onViewCreated$1", m3645f = "FuturesLadderFragment.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$onViewCreated$1 */
    static final class C175221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C175221(Continuation<? super C175221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesLadderFragment.this.new C175221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C175221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesLadderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ FuturesLadderFragment $tmp0;

            AnonymousClass1(FuturesLadderFragment futuresLadderFragment) {
                this.$tmp0 = futuresLadderFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, FuturesLadderFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<LadderEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C175221.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<LadderEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(FuturesLadderFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FuturesLadderFragment.this);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(FuturesLadderFragment futuresLadderFragment, Event event, Continuation continuation) {
            futuresLadderFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    private static final FuturesLadderViewState ComposeContent$lambda$1(SnapshotState4<FuturesLadderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<LadderEvent> ComposeContent$lambda$2(SnapshotState4<Event<LadderEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-963994465);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963994465, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment.ComposeContent (FuturesLadderFragment.kt:90)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            FuturesLadderViewState futuresLadderViewStateComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle);
            Event<LadderEvent> eventComposeContent$lambda$2 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle2);
            FuturesLadderDuxo duxo = getDuxo();
            FuturesLadderFragmentCallbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FuturesLadderFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            LinkingGroup mobileLinkingGroup = ((FuturesLadderFragmentKey) INSTANCE.getArgs((Fragment) this)).getMobileLinkingGroup();
            FuturesLadderScreenKt.FuturesLadderScreen(futuresLadderViewStateComposeContent$lambda$1, eventComposeContent$lambda$2, duxo, function0, null, mobileLinkingGroup != null ? new MobileLinkingData(mobileLinkingGroup, getMobileLinkingCallbacks()) : null, composerStartRestartGroup, MobileLinkingData.$stable << 15, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesLadderFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object applyForAccount(Continuation<? super Unit> continuation) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new FuturesOnboardingActivityKey("FUTURES_LADDER_SCREEN", false, null, 6, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object focusOnQuantityText(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object focusOnPriceText(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r6, r7, r2) == r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object makeDeposit(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
        C175201 c175201;
        TransferConfiguration.Standard standard;
        if (continuation instanceof C175201) {
            c175201 = (C175201) continuation;
            int i = c175201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c175201.label = i - Integer.MIN_VALUE;
            } else {
                c175201 = new C175201(continuation);
            }
        }
        Object objFirstOrNull = c175201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c175201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            TransferConfiguration.Standard standard2 = new TransferConfiguration.Standard(DecimalUtility.toJavaBigDecimal(bigDecimal), null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(getDuxo().getStateFlow().getValue().getRhsAccountNumber(), false, ApiTransferAccount.TransferAccountType.RHS, 2, null), null, MAXTransferContext.EntryPoint.FUTURES_ORDER_CHECK, null, false, false, null, null, false, 8102, null);
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(getExperimentsStore(), new Experiment[]{FuturesOrderChecksToGuided.INSTANCE}, false, null, 6, null);
            c175201.L$0 = standard2;
            c175201.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamStateFlow$default, c175201);
            if (objFirstOrNull != coroutine_suspended) {
                standard = standard2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            return Unit.INSTANCE;
        }
        standard = (TransferConfiguration.Standard) c175201.L$0;
        ResultKt.throwOnFailure(objFirstOrNull);
        boolean zAreEqual = Intrinsics.areEqual(objFirstOrNull, boxing.boxBoolean(true));
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        C175212 c175212 = new C175212(zAreEqual, standard, null);
        c175201.L$0 = null;
        c175201.label = 2;
    }

    /* compiled from: FuturesLadderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$makeDeposit$2", m3645f = "FuturesLadderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$makeDeposit$2 */
    static final class C175212 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isInFuturesOrderChecksToGuidedExperiment;
        final /* synthetic */ TransferConfiguration.Standard $transferConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175212(boolean z, TransferConfiguration.Standard standard, Continuation<? super C175212> continuation) {
            super(2, continuation);
            this.$isInFuturesOrderChecksToGuidedExperiment = z;
            this.$transferConfig = standard;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesLadderFragment.this.new C175212(this.$isInFuturesOrderChecksToGuidedExperiment, this.$transferConfig, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C175212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntentKey transfer;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Navigator navigator = FuturesLadderFragment.this.getNavigator();
            Context contextRequireContext = FuturesLadderFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            if (this.$isInFuturesOrderChecksToGuidedExperiment) {
                transfer = new TransferV2(TransferDirectionV2.DEPOSIT, this.$transferConfig, null, 4, null);
            } else {
                transfer = new Transfer(this.$transferConfig);
            }
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, transfer, null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object updatePrice(FuturesOrderPriceType futuresOrderPriceType, BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesLadderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderFragment;", "Lcom/robinhood/android/futures/contracts/FuturesLadderFragmentKey;", "<init>", "()V", "LADDER_COMPONENTS_ENTRY_DELAY_IN_MILLIS", "", "LADDER_COMPONENTS_ENTRY_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "getLADDER_COMPONENTS_ENTRY_EASING", "()Landroidx/compose/animation/core/CubicBezierEasing;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<FuturesLadderFragment, FuturesLadderFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(FuturesLadderFragmentKey futuresLadderFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, futuresLadderFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FuturesLadderFragmentKey getArgs(FuturesLadderFragment futuresLadderFragment) {
            return (FuturesLadderFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, futuresLadderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FuturesLadderFragment newInstance(FuturesLadderFragmentKey futuresLadderFragmentKey) {
            return (FuturesLadderFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, futuresLadderFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FuturesLadderFragment futuresLadderFragment, FuturesLadderFragmentKey futuresLadderFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, futuresLadderFragment, futuresLadderFragmentKey);
        }

        public final CubicBezierEasing getLADDER_COMPONENTS_ENTRY_EASING() {
            return FuturesLadderFragment.LADDER_COMPONENTS_ENTRY_EASING;
        }
    }
}
