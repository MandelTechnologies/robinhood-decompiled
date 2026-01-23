package com.robinhood.android.futures.trade.p147ui.orderform;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.futures.contracts.FuturesOrderDetailFragmentKey;
import com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey;
import com.robinhood.android.futures.trade.analytics.LoggingUtils6;
import com.robinhood.android.futures.trade.p147ui.OrderFormResults;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormFragment;
import com.robinhood.android.futures.trade.p147ui.orderform.OrderFormEvent;
import com.robinhood.android.futures.trade.p147ui.shared.GenericErrorDialog;
import com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.rosetta.eventlogging.FuturesOrderContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesOrderFormFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016J\b\u00100\u001a\u00020&H\u0016J\r\u00101\u001a\u00020&H\u0017¢\u0006\u0002\u00102J\b\u00103\u001a\u00020\u0018H\u0016J\u0016\u00106\u001a\u00020&2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\t\u0010:\u001a\u00020\u0018H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A²\u0006\n\u0010B\u001a\u00020CX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u0004\u0018\u00010EX\u008a\u008e\u0002²\u0006\u0012\u0010F\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "callbacks", "Lcom/robinhood/android/lib/futures/trade/FuturesOrderFormFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/futures/trade/FuturesOrderFormFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo;", "getDuxo", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "interceptBackPressed", "", "<set-?>", "shouldExitOrderForm", "getShouldExitOrderForm", "()Z", "setShouldExitOrderForm", "(Z)V", "shouldExitOrderForm$delegate", "Lkotlin/properties/ReadWriteProperty;", "futuresOrderContext", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext;", "getFuturesOrderContext", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onResume", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "softOrderCheckDialog", "Landroidx/fragment/app/DialogFragment;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-futures-trade_externalDebug", "viewState", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState;", "genericReviewOrderError", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$GenericReviewOrderError;", "eventState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FuturesOrderFormFragment extends GenericComposeFragment implements RegionGated {
    public ExperimentsStore experimentsStore;
    private boolean interceptBackPressed;
    private DialogFragment softOrderCheckDialog;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FuturesOrderFormFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/futures/trade/FuturesOrderFormFragmentCallbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FuturesOrderFormFragment.class, "shouldExitOrderForm", "getShouldExitOrderForm()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(FuturesTradingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(FuturesOrderFormFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof FuturesOrderFormFragmentCallbacks)) {
                parentFragment = null;
            }
            FuturesOrderFormFragmentCallbacks futuresOrderFormFragmentCallbacks = (FuturesOrderFormFragmentCallbacks) parentFragment;
            if (futuresOrderFormFragmentCallbacks != null) {
                return futuresOrderFormFragmentCallbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof FuturesOrderFormFragmentCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FuturesOrderFormDuxo.class);

    /* renamed from: shouldExitOrderForm$delegate, reason: from kotlin metadata */
    private final Interfaces3 shouldExitOrderForm = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);

    /* compiled from: FuturesOrderFormFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesOrderFormDataState.FocusedText.values().length];
            try {
                iArr[FuturesOrderFormDataState.FocusedText.QUANTITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderFormDataState.FocusedText.LIMIT_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesOrderFormDataState.FocusedText.STOP_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10(FuturesOrderFormFragment futuresOrderFormFragment, int i, Composer composer, int i2) {
        futuresOrderFormFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final void handleEvent(final Event<OrderFormEvent> event) {
        EventConsumer<OrderFormEvent> eventConsumerInvoke;
        EventConsumer<OrderFormEvent> eventConsumerInvoke2;
        EventConsumer<OrderFormEvent> eventConsumerInvoke3;
        EventConsumer<OrderFormEvent> eventConsumerInvoke4;
        EventConsumer<OrderFormEvent> eventConsumerInvoke5;
        EventConsumer<OrderFormEvent> eventConsumerInvoke6;
        if ((event.getData() instanceof OrderFormEvent.ExitOrderForm) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14919invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14919invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    OrderFormEvent.ExitOrderForm exitOrderForm = (OrderFormEvent.ExitOrderForm) event.getData();
                    OrderFormResults.setOrderFormResult(this, exitOrderForm.getOrderSubmittedSuccessfully());
                    this.getCallbacks().exitOrderForm(exitOrderForm.getShouldFadeOut());
                }
            });
        }
        if ((event.getData() instanceof OrderFormEvent.OrderError) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                    m14920invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14920invoke(Object it) throws Throwable {
                    Intrinsics.checkNotNullParameter(it, "it");
                    OrderFormEvent.OrderError orderError = (OrderFormEvent.OrderError) event.getData();
                    DialogFragment dialogFragment = this.softOrderCheckDialog;
                    if (dialogFragment != null) {
                        dialogFragment.dismissAllowingStateLoss();
                    }
                    this.softOrderCheckDialog = null;
                    ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, orderError.getError(), true, false, 0, null, 56, null);
                }
            });
        }
        if ((event.getData() instanceof OrderFormEvent.ShowOrderCheckDialog) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14921invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14921invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    DialogFragment dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(this.getNavigator(), ((OrderFormEvent.ShowOrderCheckDialog) event.getData()).getKey(), null, 2, null);
                    this.softOrderCheckDialog = dialogFragmentCreateDialogFragment$default;
                    dialogFragmentCreateDialogFragment$default.show(this.getChildFragmentManager(), "orderCheckAlert");
                }
            });
        }
        if ((event.getData() instanceof OrderFormEvent.ShowTransferFlow) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14922invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14922invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    OrderFormEvent.ShowTransferFlow showTransferFlow = (OrderFormEvent.ShowTransferFlow) event.getData();
                    BuildersKt__Builders_commonKt.launch$default(this.getLifecycleScope(), null, null, new FuturesOrderFormFragment$handleEvent$4$1(this, new TransferConfiguration.Standard(showTransferFlow.getRecommendedAmount(), null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(showTransferFlow.getAccountNumber(), false, ApiTransferAccount.TransferAccountType.RHS, 2, null), null, MAXTransferContext.EntryPoint.FUTURES_ORDER_CHECK, null, false, false, null, null, false, 8102, null), null), 3, null);
                }
            });
        }
        if ((event.getData() instanceof OrderFormEvent.ShowOnboardingFlow) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14923invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14923invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new FuturesOnboardingActivityKey("FUTURES_ORDER_FORM_SCREEN", false, null, 6, null), null, false, null, null, 60, null);
                }
            });
        }
        if (!(event.getData() instanceof OrderFormEvent.OrderCheckResolveOnLadderEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$handleEvent$$inlined$consumeIfType$6
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m14924invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m14924invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OrderFormEvent.OrderCheckResolveOnLadderEvent orderCheckResolveOnLadderEvent = (OrderFormEvent.OrderCheckResolveOnLadderEvent) event.getData();
                FuturesOrderFormFragmentCallbacks.DefaultImpls.exitOrderForm$default(this.getCallbacks(), false, 1, null);
                BuildersKt__Builders_commonKt.launch$default(this.getLifecycleScope(), null, null, new FuturesOrderFormFragment$handleEvent$6$1(orderCheckResolveOnLadderEvent, this.getCallbacks().getLadderFragmentOrderChecksResolver(), null), 3, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesOrderFormFragmentCallbacks getCallbacks() {
        return (FuturesOrderFormFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesOrderFormDuxo getDuxo() {
        return (FuturesOrderFormDuxo) this.duxo.getValue();
    }

    private final boolean getShouldExitOrderForm() {
        return ((Boolean) this.shouldExitOrderForm.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShouldExitOrderForm(boolean z) {
        this.shouldExitOrderForm.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    private final FuturesOrderContext getFuturesOrderContext() {
        Companion companion = INSTANCE;
        return new FuturesOrderContext(Uuids.safeToString(((FuturesOrderFormFragmentKey) companion.getArgs((Fragment) this)).getFuturesContractId()), Uuids.safeToString(((FuturesOrderFormFragmentKey) companion.getArgs((Fragment) this)).getRefId()), LoggingUtils6.toEventLoggingProto(((FuturesOrderFormFragmentKey) companion.getArgs((Fragment) this)).getSide()), null, null, 24, null);
    }

    /* compiled from: FuturesOrderFormFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$ComposeContent$3 */
    static final class C176253 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<OrderFormEvent.GenericReviewOrderError> $genericReviewOrderError$delegate;
        final /* synthetic */ FocusRequester $limitPriceFocusRequester;
        final /* synthetic */ FocusRequester $quantityFocusRequester;
        final /* synthetic */ FocusRequester $stopPriceFocusRequester;
        final /* synthetic */ SnapshotState4<FuturesOrderFormViewState> $viewState$delegate;

        C176253(FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, SnapshotState4<FuturesOrderFormViewState> snapshotState4, SnapshotState<OrderFormEvent.GenericReviewOrderError> snapshotState) {
            this.$quantityFocusRequester = focusRequester;
            this.$limitPriceFocusRequester = focusRequester2;
            this.$stopPriceFocusRequester = focusRequester3;
            this.$viewState$delegate = snapshotState4;
            this.$genericReviewOrderError$delegate = snapshotState;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0355  */
        /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02d4  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0320  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            FuturesOrderFormViewState futuresOrderFormViewState;
            boolean zChangedInstance;
            Function0 function0;
            OrderFormEvent.GenericReviewOrderError genericReviewOrderErrorComposeContent$lambda$2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-504855877, i, -1, "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment.ComposeContent.<anonymous> (FuturesOrderFormFragment.kt:142)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            final FuturesOrderFormFragment futuresOrderFormFragment = FuturesOrderFormFragment.this;
            FocusRequester focusRequester = this.$quantityFocusRequester;
            FocusRequester focusRequester2 = this.$limitPriceFocusRequester;
            FocusRequester focusRequester3 = this.$stopPriceFocusRequester;
            final SnapshotState4<FuturesOrderFormViewState> snapshotState4 = this.$viewState$delegate;
            final SnapshotState<OrderFormEvent.GenericReviewOrderError> snapshotState = this.$genericReviewOrderError$delegate;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            FuturesOrderFormViewState futuresOrderFormViewStateComposeContent$lambda$0 = FuturesOrderFormFragment.ComposeContent$lambda$0(snapshotState4);
            Object duxo = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(duxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FuturesOrderFormFragment$ComposeContent$3$1$1$1(duxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            Object duxo2 = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(duxo2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new FuturesOrderFormFragment$ComposeContent$3$1$2$1(duxo2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            Object duxo3 = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(duxo3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new FuturesOrderFormFragment$ComposeContent$3$1$3$1(duxo3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue3;
            composer.endReplaceGroup();
            Object duxo4 = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(duxo4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new FuturesOrderFormFragment$ComposeContent$3$1$4$1(duxo4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue4;
            composer.endReplaceGroup();
            Object duxo5 = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(duxo5);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new FuturesOrderFormFragment$ComposeContent$3$1$5$1(duxo5);
                composer.updateRememberedValue(objRememberedValue5);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue5;
            composer.endReplaceGroup();
            Object duxo6 = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composer.changedInstance(duxo6);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new FuturesOrderFormFragment$ComposeContent$3$1$6$1(duxo6);
                composer.updateRememberedValue(objRememberedValue6);
            }
            KFunction kFunction6 = (KFunction) objRememberedValue6;
            composer.endReplaceGroup();
            Object duxo7 = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composer.changedInstance(duxo7);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new FuturesOrderFormFragment$ComposeContent$3$1$7$1(duxo7);
                composer.updateRememberedValue(objRememberedValue7);
            }
            KFunction kFunction7 = (KFunction) objRememberedValue7;
            composer.endReplaceGroup();
            Object duxo8 = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composer.changedInstance(duxo8);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance9 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new FuturesOrderFormFragment$ComposeContent$3$1$8$1(duxo8);
                composer.updateRememberedValue(objRememberedValue8);
            }
            KFunction kFunction8 = (KFunction) objRememberedValue8;
            composer.endReplaceGroup();
            Object duxo9 = futuresOrderFormFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance10 = composer.changedInstance(duxo9);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChangedInstance10 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new FuturesOrderFormFragment$ComposeContent$3$1$9$1(duxo9);
                composer.updateRememberedValue(objRememberedValue9);
            }
            KFunction kFunction9 = (KFunction) objRememberedValue9;
            composer.endReplaceGroup();
            Object callbacks = futuresOrderFormFragment.getCallbacks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance11 = composer.changedInstance(callbacks);
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChangedInstance11 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new FuturesOrderFormFragment$ComposeContent$3$1$10$1(callbacks);
                composer.updateRememberedValue(objRememberedValue10);
            }
            KFunction kFunction10 = (KFunction) objRememberedValue10;
            composer.endReplaceGroup();
            Function1 function1 = (Function1) kFunction;
            Function1 function12 = (Function1) kFunction2;
            Function1 function13 = (Function1) kFunction3;
            Function1 function14 = (Function1) kFunction6;
            Function0 function02 = (Function0) kFunction4;
            Function1 function15 = (Function1) kFunction5;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance12 = composer.changedInstance(futuresOrderFormFragment);
            Object objRememberedValue11 = composer.rememberedValue();
            if (zChangedInstance12 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$ComposeContent$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesOrderFormFragment.C176253.invoke$lambda$19$lambda$11$lambda$10(futuresOrderFormFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue11);
            }
            Function0 function03 = (Function0) objRememberedValue11;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance13 = composer.changedInstance(futuresOrderFormFragment) | composer.changed(snapshotState4);
            Object objRememberedValue12 = composer.rememberedValue();
            if (zChangedInstance13) {
                futuresOrderFormViewState = futuresOrderFormViewStateComposeContent$lambda$0;
            } else {
                futuresOrderFormViewState = futuresOrderFormViewStateComposeContent$lambda$0;
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                }
                Function0 function04 = (Function0) objRememberedValue12;
                composer.endReplaceGroup();
                Function0 function05 = (Function0) kFunction7;
                Function1 function16 = (Function1) kFunction8;
                Function0 function06 = (Function0) kFunction9;
                Function0 function07 = (Function0) kFunction10;
                composer.startReplaceGroup(5004770);
                zChangedInstance = composer.changedInstance(futuresOrderFormFragment);
                Object objRememberedValue13 = composer.rememberedValue();
                if (zChangedInstance) {
                    function0 = function05;
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    }
                    composer.endReplaceGroup();
                    FuturesOrderFormViewState futuresOrderFormViewState2 = futuresOrderFormViewState;
                    OrderFormScreen.OrderFormScreen(futuresOrderFormViewState2, focusRequester, focusRequester2, focusRequester3, function1, function12, function13, function14, function02, function15, function03, function04, function0, function16, function06, function07, (Function1) objRememberedValue13, composer, 3504, 0);
                    genericReviewOrderErrorComposeContent$lambda$2 = FuturesOrderFormFragment.ComposeContent$lambda$2(snapshotState);
                    composer.startReplaceGroup(-892180604);
                    if (genericReviewOrderErrorComposeContent$lambda$2 != null) {
                        int error = genericReviewOrderErrorComposeContent$lambda$2.getError();
                        composer.startReplaceGroup(5004770);
                        Object objRememberedValue14 = composer.rememberedValue();
                        if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue14 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$ComposeContent$3$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FuturesOrderFormFragment.C176253.invoke$lambda$19$lambda$18$lambda$17$lambda$16(snapshotState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue14);
                        }
                        composer.endReplaceGroup();
                        GenericErrorDialog.GenericErrorDialog(error, (Function0) objRememberedValue14, composer, 48);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                function0 = function05;
                objRememberedValue13 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$ComposeContent$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesOrderFormFragment.C176253.invoke$lambda$19$lambda$15$lambda$14(futuresOrderFormFragment, (UUID) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue13);
                composer.endReplaceGroup();
                FuturesOrderFormViewState futuresOrderFormViewState22 = futuresOrderFormViewState;
                OrderFormScreen.OrderFormScreen(futuresOrderFormViewState22, focusRequester, focusRequester2, focusRequester3, function1, function12, function13, function14, function02, function15, function03, function04, function0, function16, function06, function07, (Function1) objRememberedValue13, composer, 3504, 0);
                genericReviewOrderErrorComposeContent$lambda$2 = FuturesOrderFormFragment.ComposeContent$lambda$2(snapshotState);
                composer.startReplaceGroup(-892180604);
                if (genericReviewOrderErrorComposeContent$lambda$2 != null) {
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            objRememberedValue12 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$ComposeContent$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderFormFragment.C176253.invoke$lambda$19$lambda$13$lambda$12(futuresOrderFormFragment, snapshotState4);
                }
            };
            composer.updateRememberedValue(objRememberedValue12);
            Function0 function042 = (Function0) objRememberedValue12;
            composer.endReplaceGroup();
            Function0 function052 = (Function0) kFunction7;
            Function1 function162 = (Function1) kFunction8;
            Function0 function062 = (Function0) kFunction9;
            Function0 function072 = (Function0) kFunction10;
            composer.startReplaceGroup(5004770);
            zChangedInstance = composer.changedInstance(futuresOrderFormFragment);
            Object objRememberedValue132 = composer.rememberedValue();
            if (zChangedInstance) {
            }
            objRememberedValue132 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$ComposeContent$3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesOrderFormFragment.C176253.invoke$lambda$19$lambda$15$lambda$14(futuresOrderFormFragment, (UUID) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue132);
            composer.endReplaceGroup();
            FuturesOrderFormViewState futuresOrderFormViewState222 = futuresOrderFormViewState;
            OrderFormScreen.OrderFormScreen(futuresOrderFormViewState222, focusRequester, focusRequester2, focusRequester3, function1, function12, function13, function14, function02, function15, function03, function042, function0, function162, function062, function072, (Function1) objRememberedValue132, composer, 3504, 0);
            genericReviewOrderErrorComposeContent$lambda$2 = FuturesOrderFormFragment.ComposeContent$lambda$2(snapshotState);
            composer.startReplaceGroup(-892180604);
            if (genericReviewOrderErrorComposeContent$lambda$2 != null) {
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$11$lambda$10(FuturesOrderFormFragment futuresOrderFormFragment) {
            futuresOrderFormFragment.onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$13$lambda$12(FuturesOrderFormFragment futuresOrderFormFragment, SnapshotState4 snapshotState4) {
            futuresOrderFormFragment.getCallbacks().onOrderTypeClicked(FuturesOrderFormFragment.ComposeContent$lambda$0(snapshotState4).getSide());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$15$lambda$14(FuturesOrderFormFragment futuresOrderFormFragment, UUID orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            futuresOrderFormFragment.setShouldExitOrderForm(true);
            Navigator navigator = futuresOrderFormFragment.getNavigator();
            Context contextRequireContext = futuresOrderFormFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new FuturesOrderDetailFragmentKey(orderId), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$16(SnapshotState snapshotState) {
            FuturesOrderFormFragment.ComposeContent$lambda$3(snapshotState, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(8);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C176261(null), 1, null);
    }

    /* compiled from: FuturesOrderFormFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$onViewCreated$1", m3645f = "FuturesOrderFormFragment.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$onViewCreated$1 */
    static final class C176261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C176261(Continuation<? super C176261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOrderFormFragment.this.new C176261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C176261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesOrderFormFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ FuturesOrderFormFragment $tmp0;

            AnonymousClass1(FuturesOrderFormFragment futuresOrderFormFragment) {
                this.$tmp0 = futuresOrderFormFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, FuturesOrderFormFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<OrderFormEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C176261.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<OrderFormEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(FuturesOrderFormFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FuturesOrderFormFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(FuturesOrderFormFragment futuresOrderFormFragment, Event event, Continuation continuation) {
            futuresOrderFormFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesOrderFormViewState ComposeContent$lambda$0(SnapshotState4<FuturesOrderFormViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderFormEvent.GenericReviewOrderError ComposeContent$lambda$2(SnapshotState<OrderFormEvent.GenericReviewOrderError> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Event<OrderFormEvent> ComposeContent$lambda$4(SnapshotState4<Event<OrderFormEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BaseFragments2.setFullScreenWithSystemUiFlags(this);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        BaseFragments2.removeFullScreenWithSystemUiFlags(this);
        super.onStop();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getShouldExitOrderForm()) {
            FuturesOrderFormFragmentCallbacks.DefaultImpls.exitOrderForm$default(getCallbacks(), false, 1, null);
        } else {
            getDuxo().setOrderConfig(getCallbacks().getFuturesOrderConfig());
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<OrderFormEvent> eventConsumerInvoke;
        EventConsumer<OrderFormEvent> eventConsumerInvoke2;
        Composer composerStartRestartGroup = composer.startRestartGroup(93691);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(93691, i2, -1, "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment.ComposeContent (FuturesOrderFormFragment.kt:109)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            this.interceptBackPressed = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInterceptOnBackPressed();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<OrderFormEvent> eventComposeContent$lambda$4 = ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$4 != null) {
                if ((eventComposeContent$lambda$4.getData() instanceof OrderFormEvent.GenericReviewOrderError) && (eventConsumerInvoke2 = eventComposeContent$lambda$4.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventComposeContent$lambda$4, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$ComposeContent$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14917invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14917invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            FuturesOrderFormFragment.ComposeContent$lambda$3(snapshotState, (OrderFormEvent.GenericReviewOrderError) eventComposeContent$lambda$4.getData());
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final FocusRequester focusRequester3 = (FocusRequester) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            final Event<OrderFormEvent> eventComposeContent$lambda$42 = ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$42 != null) {
                if ((eventComposeContent$lambda$42.getData() instanceof OrderFormEvent.FocusOnText) && (eventConsumerInvoke = eventComposeContent$lambda$42.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventComposeContent$lambda$42, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$ComposeContent$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14918invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14918invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            int i3 = FuturesOrderFormFragment.WhenMappings.$EnumSwitchMapping$0[((OrderFormEvent.FocusOnText) eventComposeContent$lambda$42.getData()).getFocusedText().ordinal()];
                            if (i3 == 1) {
                                FocusRequester.m6497requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                            } else if (i3 == 2) {
                                FocusRequester.m6497requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                FocusRequester.m6497requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                            }
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.FUTURES_ORDER_FORM_SCREEN, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, ((FuturesOrderFormFragmentKey) INSTANCE.getArgs((Fragment) this)).getSourceScreen(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getFuturesOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -9, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-504855877, true, new C176253(focusRequester, focusRequester2, focusRequester3, snapshotState4CollectAsStateWithLifecycle, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesOrderFormFragment.ComposeContent$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$3(SnapshotState<OrderFormEvent.GenericReviewOrderError> snapshotState, OrderFormEvent.GenericReviewOrderError genericReviewOrderError) {
        snapshotState.setValue(genericReviewOrderError);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.interceptBackPressed) {
            getDuxo().onBackPressed();
        } else if (!super.onBackPressed()) {
            FuturesOrderFormFragmentCallbacks.DefaultImpls.exitOrderForm$default(getCallbacks(), false, 1, null);
        }
        return true;
    }

    /* compiled from: FuturesOrderFormFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormFragment;", "Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey;", "<init>", "()V", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<FuturesOrderFormFragment, FuturesOrderFormFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(FuturesOrderFormFragmentKey futuresOrderFormFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, futuresOrderFormFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FuturesOrderFormFragmentKey getArgs(FuturesOrderFormFragment futuresOrderFormFragment) {
            return (FuturesOrderFormFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, futuresOrderFormFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FuturesOrderFormFragment newInstance(FuturesOrderFormFragmentKey futuresOrderFormFragmentKey) {
            return (FuturesOrderFormFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, futuresOrderFormFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FuturesOrderFormFragment futuresOrderFormFragment, FuturesOrderFormFragmentKey futuresOrderFormFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, futuresOrderFormFragment, futuresOrderFormFragmentKey);
        }
    }
}
