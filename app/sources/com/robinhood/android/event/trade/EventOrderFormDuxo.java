package com.robinhood.android.event.trade;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.trade.EventOrderFormDuxo;
import com.robinhood.android.event.trade.EventOrderFormEvent;
import com.robinhood.android.event.trade.EventOrderFormFragment;
import com.robinhood.android.event.trade.OrderSubmissionState;
import com.robinhood.android.event.trade.orderform.EventOrderFormCallbacks;
import com.robinhood.android.event.trade.util.EventContractExperiments;
import com.robinhood.android.event.trade.util.EventContractExperiments2;
import com.robinhood.android.event.trade.util.EventContractExperiments3;
import com.robinhood.android.event.trade.util.KeyEventInputHandler;
import com.robinhood.android.event.trade.util.TextFieldValues;
import com.robinhood.android.eventcontracts.experiments.EcLimitAndNotionalExperiment;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.eventcontracts.sharedeventui.inputs.EventContractCurrencyInputHelper;
import com.robinhood.android.eventcontracts.sharedeventui.inputs.EventContractPriceInputHelper;
import com.robinhood.android.eventcontracts.trade.EventOrderManager;
import com.robinhood.android.eventcontracts.trade.GtdTimeInForceInfo;
import com.robinhood.android.eventcontracts.trade.StreamGtdTimeInForceUseCase;
import com.robinhood.android.eventcontracts.trade.UiEventOrderContext;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.GetFeesForTentativeOrderResponseDto;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.shared.common.lib.formats.currency.CurrencyInputHelper;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.event.OrderDisplayStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.shareprefs.EventOrderFormPreferences;
import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import com.robinhood.store.shareprefs.UserLastUsedEcOrderTypePref2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.Throwables;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: EventOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 A2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0002ABBi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010#\u001a\u00020$H\u0016J\u001c\u0010%\u001a\u00020&*\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\f\u0010+\u001a\u00020&*\u00020(H\u0002J\f\u0010,\u001a\u00020-*\u00020(H\u0002J\u0006\u0010.\u001a\u00020$J\u0012\u0010/\u001a\u00020$2\n\u00100\u001a\u000601j\u0002`2J\u0006\u00103\u001a\u00020$J\u0006\u00104\u001a\u00020$J\u000e\u00105\u001a\u00020$2\u0006\u00106\u001a\u000207J\b\u00108\u001a\u00020$H\u0016J\b\u00109\u001a\u00020$H\u0016J\f\u0010:\u001a\u00020;*\u00020\u0002H\u0002J\u000e\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020-J\u000e\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/event/trade/orderform/EventOrderFormCallbacks;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "eventOrderManager", "Lcom/robinhood/android/eventcontracts/trade/EventOrderManager;", "eventOrderStore", "Lcom/robinhood/store/event/EventOrderStore;", "orderDisplayStore", "Lcom/robinhood/store/event/OrderDisplayStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "preferences", "Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;", "streamComboQuoteUseCase", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "streamGtdTimeInForceUseCase", "Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/event/EventStore;Lcom/robinhood/android/eventcontracts/trade/EventOrderManager;Lcom/robinhood/store/event/EventOrderStore;Lcom/robinhood/store/event/OrderDisplayStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "getDefaultOrderType", "Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "variant", "Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant;", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "toDefaultOrderType", "toDefaultTimeInForce", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "onBackPressed", "onKeyPressed", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onQuantityFieldFocused", "onPriceFieldFocused", "submitOrder", "orderContext", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "onReviewClicked", "onCloseAllClicked", "newOrderSubmissionStateAfterReviewClicked", "Lcom/robinhood/android/event/trade/OrderSubmissionState;", "onTimeInForceChanged", "timeInForce", "regenerateRefId", "throwable", "", "Companion", "FeesArgs", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventOrderFormDuxo extends BaseDuxo3<EventOrderFormDataState, EventOrderFormViewState, EventOrderFormEvent> implements HasSavedState, EventOrderFormCallbacks {
    private final EventContractPositionStore eventContractPositionStore;
    private final EventOrderManager eventOrderManager;
    private final EventOrderStore eventOrderStore;
    private final EventStore eventStore;
    private final ExperimentsProvider experimentsProvider;
    private final FuturesAccountStore futuresAccountStore;
    private final OrderDisplayStore orderDisplayStore;
    private final EventOrderFormPreferences preferences;
    private final SavedStateHandle savedStateHandle;
    private final StreamComboQuoteUseCase streamComboQuoteUseCase;
    private final StreamGtdTimeInForceUseCase streamGtdTimeInForceUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UserLastUsedEcOrderTypePref2.values().length];
            try {
                iArr[UserLastUsedEcOrderTypePref2.QUANTITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserLastUsedEcOrderTypePref2.NOTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserLastUsedEcOrderTypePref2.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EcLimitAndNotionalExperiment.Variant.values().length];
            try {
                iArr2[EcLimitAndNotionalExperiment.Variant.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EcLimitAndNotionalExperiment.Variant.NOTIONAL_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EcLimitAndNotionalExperiment.Variant.SHARE_BASED_GTD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EcLimitAndNotionalExperiment.Variant.SHARE_BASED_IOC.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EventOrderFormDuxo(EventStore eventStore, EventOrderManager eventOrderManager, EventOrderStore eventOrderStore, OrderDisplayStore orderDisplayStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, ExperimentsProvider experimentsProvider, EventOrderFormPreferences preferences, StreamComboQuoteUseCase streamComboQuoteUseCase, StreamGtdTimeInForceUseCase streamGtdTimeInForceUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        BigDecimal defaultNotionalAmount;
        Integer defaultQuantity;
        String string2;
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventOrderManager, "eventOrderManager");
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        Intrinsics.checkNotNullParameter(orderDisplayStore, "orderDisplayStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(streamComboQuoteUseCase, "streamComboQuoteUseCase");
        Intrinsics.checkNotNullParameter(streamGtdTimeInForceUseCase, "streamGtdTimeInForceUseCase");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Companion companion = INSTANCE;
        UUID eventContractId = ((EventOrderFormFragment.Args) companion.getArgs(savedStateHandle)).getEventContractId();
        EventOrderSide side = ((EventOrderFormFragment.Args) companion.getArgs(savedStateHandle)).getSide();
        EventOrderPositionEffect positionEffect = ((EventOrderFormFragment.Args) companion.getArgs(savedStateHandle)).getPositionEffect();
        EventOrderFormFragment.Args.InitialState initialState = ((EventOrderFormFragment.Args) companion.getArgs(savedStateHandle)).getInitialState();
        EventOrderFormFragment.Args.InitialState.QuantityOrder quantityOrder = initialState instanceof EventOrderFormFragment.Args.InitialState.QuantityOrder ? (EventOrderFormFragment.Args.InitialState.QuantityOrder) initialState : null;
        String str = (quantityOrder == null || (defaultQuantity = quantityOrder.getDefaultQuantity()) == null || (string2 = defaultQuantity.toString()) == null) ? "" : string2;
        EventOrderFormFragment.Args.InitialState initialState2 = ((EventOrderFormFragment.Args) companion.getArgs(savedStateHandle)).getInitialState();
        EventOrderFormFragment.Args.InitialState.NotionalOrder notionalOrder = initialState2 instanceof EventOrderFormFragment.Args.InitialState.NotionalOrder ? (EventOrderFormFragment.Args.InitialState.NotionalOrder) initialState2 : null;
        BigDecimal bigDecimal = (notionalOrder == null || (defaultNotionalAmount = notionalOrder.getDefaultNotionalAmount()) == null) ? BigDecimal.ZERO : defaultNotionalAmount;
        Intrinsics.checkNotNull(bigDecimal);
        super(new EventOrderFormDataState(eventContractId, side, positionEffect, uuidRandomUUID, null, null, null, false, false, str, null, null, null, null, bigDecimal, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073724912, null), EventOrderFormStateProvider.INSTANCE, duxoBundle);
        this.eventStore = eventStore;
        this.eventOrderManager = eventOrderManager;
        this.eventOrderStore = eventOrderStore;
        this.orderDisplayStore = orderDisplayStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.experimentsProvider = experimentsProvider;
        this.preferences = preferences;
        this.streamComboQuoteUseCase = streamComboQuoteUseCase;
        this.streamGtdTimeInForceUseCase = streamGtdTimeInForceUseCase;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Flow flowShare = EventOrderFormDuxo3.share(this.eventStore.streamEventContract(((EventOrderFormFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEventContractId()), getLifecycleScope());
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C164511(flowShare, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C164532(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C164543(flowShare, null));
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1 */
    static final class C164511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<EventContract> $contractFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C164511(Flow<EventContract> flow, Continuation<? super C164511> continuation) {
            super(2, continuation);
            this.$contractFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164511 c164511 = EventOrderFormDuxo.this.new C164511(this.$contractFlow, continuation);
            c164511.L$0 = obj;
            return c164511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C164511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
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
                    final StateFlow<EventOrderFormViewState> stateFlow = this.this$0.getStateFlow();
                    final Flow<EventOrderFormViewState> flow = new Flow<EventOrderFormViewState>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super EventOrderFormViewState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C164352(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C164352<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$invokeSuspend$$inlined$filter$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    return C164352.this.emit(null, this);
                                }
                            }

                            public C164352(FlowCollector flowCollector) {
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
                                    if (((EventOrderFormViewState) obj).getOrderFormContentData().getNotionalBasedData() != null) {
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
                    };
                    Flow flowMapLatest = FlowKt.mapLatest(FlowKt.distinctUntilChanged(new Flow<FeesArgs>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super EventOrderFormDuxo.FeesArgs> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C164362(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2 */
                        public static final class C164362<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C164362.this.emit(null, this);
                                }
                            }

                            public C164362(FlowCollector flowCollector) {
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
                                    EventOrderFormViewState eventOrderFormViewState = (EventOrderFormViewState) obj;
                                    FuturesAccount futuresAccount = eventOrderFormViewState.getFuturesAccount();
                                    UUID id = futuresAccount != null ? futuresAccount.getId() : null;
                                    UUID eventContractId = eventOrderFormViewState.getEventContractId();
                                    EventOrderSide orderSide = eventOrderFormViewState.getOrderSide();
                                    BigDecimal ONE = BigDecimal.ONE;
                                    Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                                    EventOrderFormDuxo.FeesArgs feesArgs = new EventOrderFormDuxo.FeesArgs(id, eventContractId, orderSide, ONE);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(feesArgs, anonymousClass1) == coroutine_suspended) {
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
                    }), new AnonymousClass3(this.this$0, null));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowMapLatest, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "it", "Lcom/robinhood/android/event/trade/EventOrderFormDuxo$FeesArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FeesArgs, Continuation<? super GetFeesForTentativeOrderResponseDto>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FeesArgs feesArgs, Continuation<? super GetFeesForTentativeOrderResponseDto> continuation) {
                    return ((AnonymousClass3) create(feesArgs, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) throws Throwable {
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
                    FeesArgs feesArgs = (FeesArgs) this.L$0;
                    EventOrderStore eventOrderStore = this.this$0.eventOrderStore;
                    UUID swapsAccountId = feesArgs.getSwapsAccountId();
                    UUID eventContractId = feesArgs.getEventContractId();
                    EventOrderSide side = feesArgs.getSide();
                    BigDecimal quantity = feesArgs.getQuantity();
                    this.label = 1;
                    Object feesForTentativeOrder = eventOrderStore.getFeesForTentativeOrder(swapsAccountId, eventContractId, side, quantity, this);
                    return feesForTentativeOrder == coroutine_suspended ? coroutine_suspended : feesForTentativeOrder;
                }
            }

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "fees", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$4", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<GetFeesForTentativeOrderResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(getFeesForTentativeOrderResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto = (GetFeesForTentativeOrderResponseDto) this.L$0;
                    if (getFeesForTentativeOrderResponseDto != null) {
                        this.this$0.applyMutation(new C500511(getFeesForTentativeOrderResponseDto, null));
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$4$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$1$4$1, reason: invalid class name and collision with other inner class name */
                static final class C500511 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ GetFeesForTentativeOrderResponseDto $fees;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500511(GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto, Continuation<? super C500511> continuation) {
                        super(2, continuation);
                        this.$fees = getFeesForTentativeOrderResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500511 c500511 = new C500511(this.$fees, continuation);
                        c500511.L$0 = obj;
                        return c500511;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500511) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IdlDecimal amount;
                        IdlDecimal amount2;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
                        MoneyDto total_fee_per_contract = this.$fees.getTotal_fee_per_contract();
                        BigDecimal bigDecimalOrNull = null;
                        BigDecimal bigDecimalOrNull2 = (total_fee_per_contract == null || (amount2 = total_fee_per_contract.getAmount()) == null) ? null : amount2.toBigDecimalOrNull();
                        MoneyDto total_fee = this.$fees.getTotal_fee();
                        if (total_fee != null && (amount = total_fee.getAmount()) != null) {
                            bigDecimalOrNull = amount.toBigDecimalOrNull();
                        }
                        return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, bigDecimalOrNull2, bigDecimalOrNull, null, null, null, null, null, null, null, null, false, false, null, false, 1073545215, null);
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$contractFlow, EventOrderFormDuxo.this, null), 3, null);
                Flow flowShare = EventOrderFormDuxo3.share(FuturesAccountStore.streamEventContractSwapsAccount$default(EventOrderFormDuxo.this.futuresAccountStore, null, 1, null), coroutineScope);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(flowShare, EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(flowShare, EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(this.$contractFlow, EventOrderFormDuxo.this, null), 3, null);
                Flow flowShare2 = EventOrderFormDuxo3.share(FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(EventOrderFormDuxo.this.experimentsProvider, new Experiment[]{GameDetailPageExperiment.INSTANCE}, false, null, 4, null)), coroutineScope);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(flowShare2, EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(EventOrderFormDuxo.this, flowShare2, null), 3, null);
                if (((EventOrderFormFragment.Args) EventOrderFormDuxo.INSTANCE.getArgs((HasSavedState) EventOrderFormDuxo.this)).getPositionEffect() == EventOrderPositionEffect.CLOSE) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(EventOrderFormDuxo.this, null), 3, null);
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(EventOrderFormDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass15(EventOrderFormDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<EventContract> $contractFlow;
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<EventContract> flow, EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$contractFlow = flow;
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$contractFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<EventContract> flow = this.$contractFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$2$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventContract, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventContract eventContract, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(eventContract, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$2$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500561 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ EventContract $contract;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500561(EventContract eventContract, Continuation<? super C500561> continuation) {
                        super(2, continuation);
                        this.$contract = eventContract;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500561 c500561 = new C500561(this.$contract, continuation);
                        c500561.L$0 = obj;
                        return c500561;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500561) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, this.$contract, null, null, null, null, null, null, null, false, false, null, false, 1073479679, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500561((EventContract) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<FuturesAccount> $ecAccountFlow;
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Flow<FuturesAccount> flow, EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$ecAccountFlow = flow;
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$ecAccountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<FuturesAccount> flow = this.$ecAccountFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$3$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesAccount, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesAccount futuresAccount, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresAccount, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$3$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500571 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ FuturesAccount $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500571(FuturesAccount futuresAccount, Continuation<? super C500571> continuation) {
                        super(2, continuation);
                        this.$account = futuresAccount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500571 c500571 = new C500571(this.$account, continuation);
                        c500571.L$0 = obj;
                        return c500571;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500571) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, this.$account, null, null, null, null, null, null, false, false, null, false, 1073217535, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500571((FuturesAccount) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<FuturesAccount> $ecAccountFlow;
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Flow<FuturesAccount> flow, EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$ecAccountFlow = flow;
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$ecAccountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowCombine = FlowKt.combine(this.$ecAccountFlow, this.this$0.eventStore.streamParentEventByContractId(((EventOrderFormFragment.Args) EventOrderFormDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEventContractId()), new AnonymousClass1(null));
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {57}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                            /* JADX WARN: Multi-variable type inference failed */
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
                                    Tuples2 tuples2 = (Tuples2) obj;
                                    FuturesAccount futuresAccount = (FuturesAccount) tuples2.component1();
                                    String attestation = ((Event) tuples2.component2()).getAttestation();
                                    T t = null;
                                    if (attestation != 0) {
                                        boolean zSignedAttestation = FuturesAccount2.signedAttestation(futuresAccount, attestation);
                                        T t2 = attestation;
                                        if (zSignedAttestation) {
                                            t2 = null;
                                        }
                                        t = t2;
                                    }
                                    if (t != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(t, anonymousClass1) == coroutine_suspended) {
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
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "Lcom/robinhood/android/models/event/db/arsenal/Event;", "ecAccount", "event"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<FuturesAccount, Event, Continuation<? super Tuples2<? extends FuturesAccount, ? extends Event>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(FuturesAccount futuresAccount, Event event, Continuation<? super Tuples2<FuturesAccount, Event>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = futuresAccount;
                    anonymousClass1.L$1 = event;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(FuturesAccount futuresAccount, Event event, Continuation<? super Tuples2<? extends FuturesAccount, ? extends Event>> continuation) {
                    return invoke2(futuresAccount, event, (Continuation<? super Tuples2<FuturesAccount, Event>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Tuples4.m3642to((FuturesAccount) this.L$0, (Event) this.L$1);
                }
            }

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "attestation", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new EventOrderFormEvent.RouteToAttestation((String) this.L$0));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$5", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamBuyingPower$default = FuturesAccountStore.streamBuyingPower$default(this.this$0.futuresAccountStore, null, 1, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamBuyingPower$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buyingPower", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$5$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiFuturesBuyingPower, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiFuturesBuyingPower apiFuturesBuyingPower, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(apiFuturesBuyingPower, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$5$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500581 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ ApiFuturesBuyingPower $buyingPower;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500581(ApiFuturesBuyingPower apiFuturesBuyingPower, Continuation<? super C500581> continuation) {
                        super(2, continuation);
                        this.$buyingPower = apiFuturesBuyingPower;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500581 c500581 = new C500581(this.$buyingPower, continuation);
                        c500581.L$0 = obj;
                        return c500581;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500581) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, this.$buyingPower, null, null, null, null, null, false, false, null, false, 1072693247, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500581((ApiFuturesBuyingPower) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$6", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Companion companion = EventOrderFormDuxo.INSTANCE;
                    if (((EventOrderFormFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getPositionEffect() == EventOrderPositionEffect.CLOSE) {
                        Flow<UiEventContractPosition> flowStreamPositionByContract = this.this$0.eventContractPositionStore.streamPositionByContract(((EventOrderFormFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getEventContractId());
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowStreamPositionByContract, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "position", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$6$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiEventContractPosition, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiEventContractPosition uiEventContractPosition, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uiEventContractPosition, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$6$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500591 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ UiEventContractPosition $position;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500591(UiEventContractPosition uiEventContractPosition, Continuation<? super C500591> continuation) {
                        super(2, continuation);
                        this.$position = uiEventContractPosition;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500591 c500591 = new C500591(this.$position, continuation);
                        c500591.L$0 = obj;
                        return c500591;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500591) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$position, null, null, false, false, null, false, 1065353215, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500591((UiEventContractPosition) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<EventOrderFormViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowMapLatest = FlowKt.mapLatest(FlowKt.distinctUntilChanged(new Flow<FeesArgs>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super EventOrderFormDuxo.FeesArgs> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C164422(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$invokeSuspend$$inlined$map$1$2 */
                        public static final class C164422<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$invokeSuspend$$inlined$map$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C164422.this.emit(null, this);
                                }
                            }

                            public C164422(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            /* JADX WARN: Type inference failed for: r5v1, types: [com.robinhood.android.event.trade.EventOrderFormDuxo$FeesArgs] */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                UiEventOrderContext candidateOrder;
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
                                    EventOrderFormViewState eventOrderFormViewState = (EventOrderFormViewState) obj;
                                    FuturesAccount futuresAccount = eventOrderFormViewState.getFuturesAccount();
                                    T feesArgs = null;
                                    if (futuresAccount != null && (candidateOrder = eventOrderFormViewState.getCandidateOrder()) != null) {
                                        UiEventOrderContext.Leg leg = candidateOrder.getOrderRequest().getLegs().get(0);
                                        feesArgs = new EventOrderFormDuxo.FeesArgs(futuresAccount.getId(), leg.getContractId(), leg.getOrderSide(), candidateOrder.getOrderRequest().getQuantity());
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(feesArgs, anonymousClass1) == coroutine_suspended) {
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
                    }), new AnonymousClass2(this.this$0, null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowMapLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "arg", "Lcom/robinhood/android/event/trade/EventOrderFormDuxo$FeesArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FeesArgs, Continuation<? super GetFeesForTentativeOrderResponseDto>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FeesArgs feesArgs, Continuation<? super GetFeesForTentativeOrderResponseDto> continuation) {
                    return ((AnonymousClass2) create(feesArgs, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FeesArgs feesArgs = (FeesArgs) this.L$0;
                        if (feesArgs == null) {
                            return null;
                        }
                        EventOrderStore eventOrderStore = this.this$0.eventOrderStore;
                        UUID swapsAccountId = feesArgs.getSwapsAccountId();
                        UUID eventContractId = feesArgs.getEventContractId();
                        EventOrderSide side = feesArgs.getSide();
                        BigDecimal quantity = feesArgs.getQuantity();
                        this.label = 1;
                        obj = eventOrderStore.getFeesForTentativeOrder(swapsAccountId, eventContractId, side, quantity, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (GetFeesForTentativeOrderResponseDto) obj;
                }
            }

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "fees", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<GetFeesForTentativeOrderResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(getFeesForTentativeOrderResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$3$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$7$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ GetFeesForTentativeOrderResponseDto $fees;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$fees = getFeesForTentativeOrderResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fees, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((AnonymousClass1) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
                        GetFeesForTentativeOrderResponseDto zeroFee = this.$fees;
                        if (zeroFee == null) {
                            zeroFee = EventOrderFormDataState.INSTANCE.getZeroFee();
                        }
                        return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, zeroFee, null, null, null, false, false, null, false, 1069547519, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((GetFeesForTentativeOrderResponseDto) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$8", m3645f = "EventOrderFormDuxo.kt", m3646l = {239}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<GtdTimeInForceInfo> flowInvoke = this.this$0.streamGtdTimeInForceUseCase.invoke();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowInvoke, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$8$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GtdTimeInForceInfo, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GtdTimeInForceInfo gtdTimeInForceInfo, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(gtdTimeInForceInfo, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$8$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500601 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ GtdTimeInForceInfo $info;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500601(GtdTimeInForceInfo gtdTimeInForceInfo, Continuation<? super C500601> continuation) {
                        super(2, continuation);
                        this.$info = gtdTimeInForceInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500601 c500601 = new C500601(this.$info, continuation);
                        c500601.L$0 = obj;
                        return c500601;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500601) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, this.$info, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073733631, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500601((GtdTimeInForceInfo) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<EventContract> $contractFlow;
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OrderFormOrderType.values().length];
                    try {
                        iArr[OrderFormOrderType.NOTIONAL_BASED_ORDER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OrderFormOrderType.QUANTITY_BASED_ORDER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OrderFormOrderType.UNSPECIFIED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(Flow<EventContract> flow, EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.$contractFlow = flow;
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.$contractFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<EventContract> flow = this.$contractFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C164442(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$$inlined$map$1$2 */
                        public static final class C164442<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$$inlined$map$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C164442.this.emit(null, this);
                                }
                            }

                            public C164442(FlowCollector flowCollector) {
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
                                    Boolean boolBoxBoolean = boxing.boxBoolean(((EventContract) obj).isComboContract());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16443xb7d16f3d(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<StreamComboQuoteUseCase3, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(StreamComboQuoteUseCase3 streamComboQuoteUseCase3, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(streamComboQuoteUseCase3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$3$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ StreamComboQuoteUseCase3 $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(StreamComboQuoteUseCase3 streamComboQuoteUseCase3, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = streamComboQuoteUseCase3;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((AnonymousClass1) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, this.$it, null, null, null, null, false, false, null, false, 1071644671, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((StreamComboQuoteUseCase3) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$10", m3645f = "EventOrderFormDuxo.kt", m3646l = {330}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $gdpEnabledShared;
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(Flow<Boolean> flow, EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$gdpEnabledShared = flow;
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$gdpEnabledShared, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$gdpEnabledShared;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$10$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$10$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500521 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ boolean $enabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500521(boolean z, Continuation<? super C500521> continuation) {
                        super(2, continuation);
                        this.$enabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500521 c500521 = new C500521(this.$enabled, continuation);
                        c500521.L$0 = obj;
                        return c500521;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500521) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, this.$enabled, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741567, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500521(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11", m3645f = "EventOrderFormDuxo.kt", m3646l = {348}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $gdpEnabledShared;
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(EventOrderFormDuxo eventOrderFormDuxo, Flow<Boolean> flow, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
                this.$gdpEnabledShared = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.this$0, this.$gdpEnabledShared, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<EventOrderFormViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowConnectWhen = Operators.connectWhen(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<OrderFormOrderType>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OrderFormOrderType> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    OrderFormOrderType orderType = ((EventOrderFormViewState) obj).getOrderType();
                                    if (orderType != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(orderType, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16437xb0f5b206(null, this.this$0)), this.$gdpEnabledShared, FlowKt.flowOf((Object) null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowConnectWhen, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/models/event/db/predictionmarkets/OrderFormDisplayDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<com.robinhood.android.models.event.p186db.predictionmarkets.OrderFormDisplayDetails, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(com.robinhood.android.models.event.p186db.predictionmarkets.OrderFormDisplayDetails orderFormDisplayDetails, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(orderFormDisplayDetails, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    com.robinhood.android.models.event.p186db.predictionmarkets.OrderFormDisplayDetails orderFormDisplayDetails = (com.robinhood.android.models.event.p186db.predictionmarkets.OrderFormDisplayDetails) this.L$0;
                    if (orderFormDisplayDetails == null) {
                        this.this$0.applyMutation(new AnonymousClass1(null));
                    } else {
                        this.this$0.applyMutation(new AnonymousClass2(orderFormDisplayDetails, null));
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$3$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((AnonymousClass1) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Optional2.INSTANCE, false, false, null, false, 1040187391, null);
                    }
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$3$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$11$3$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ com.robinhood.android.models.event.p186db.predictionmarkets.OrderFormDisplayDetails $details;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(com.robinhood.android.models.event.p186db.predictionmarkets.OrderFormDisplayDetails orderFormDisplayDetails, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$details = orderFormDisplayDetails;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$details, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((AnonymousClass2) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Optional.INSTANCE.m2972of(new OrderFormDisplayDetails(this.$details.getOrderTitle(), this.$details.getOrderSubtitle(), this.$details.getOrderReceiptTitle(), this.$details.getYesOrNoWithContractName(), this.$details.getSelectedLegsStrings())), false, false, null, false, 1040187391, null);
                    }
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12", m3645f = "EventOrderFormDuxo.kt", m3646l = {387}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<EventOrderFormViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends UUID, ? extends UUID>>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends UUID, ? extends UUID>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C164402(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12$invokeSuspend$$inlined$map$1$2 */
                        public static final class C164402<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12$invokeSuspend$$inlined$map$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C164402.this.emit(null, this);
                                }
                            }

                            public C164402(FlowCollector flowCollector) {
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
                                    EventOrderFormViewState eventOrderFormViewState = (EventOrderFormViewState) obj;
                                    FuturesAccount futuresAccount = eventOrderFormViewState.getFuturesAccount();
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(futuresAccount != null ? futuresAccount.getId() : null, eventOrderFormViewState.getEventContractId());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16439x813a2e5(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<BigDecimal, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(bigDecimal, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12$3$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$12$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ BigDecimal $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BigDecimal bigDecimal, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = bigDecimal;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((AnonymousClass1) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$it, null, false, false, null, false, 1056964607, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((BigDecimal) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$13", m3645f = "EventOrderFormDuxo.kt", m3646l = {395}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{EventContractExperiments2.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$13$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$13$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$13$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$13$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500531 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500531(boolean z, Continuation<? super C500531> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500531 c500531 = new C500531(this.$it, continuation);
                        c500531.L$0 = obj;
                        return c500531;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500531) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$it, false, null, false, 1006632959, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500531(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$14", m3645f = "EventOrderFormDuxo.kt", m3646l = {402}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{EventContractExperiments3.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$14$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$14$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$14$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$14$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500541 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500541(boolean z, Continuation<? super C500541> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500541 c500541 = new C500541(this.$it, continuation);
                        c500541.L$0 = obj;
                        return c500541;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500541) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, this.$it, null, false, 939524095, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500541(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$15", m3645f = "EventOrderFormDuxo.kt", m3646l = {409}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$15, reason: invalid class name */
        static final class AnonymousClass15 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass15(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{EventContractExperiments.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$15$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$15$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$15$1$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$15$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500551 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500551(boolean z, Continuation<? super C500551> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500551 c500551 = new C500551(this.$it, continuation);
                        c500551.L$0 = obj;
                        return c500551;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500551) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, this.$it, 536870911, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500551(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2 */
    static final class C164532 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164532(Continuation<? super C164532> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164532 c164532 = EventOrderFormDuxo.this.new C164532(continuation);
            c164532.L$0 = obj;
            return c164532;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C164532) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {423}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
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
                    final StateFlow<EventOrderFormViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C164482(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1$invokeSuspend$$inlined$map$1$2 */
                        public static final class C164482<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1$invokeSuspend$$inlined$map$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C164482.this.emit(null, this);
                                }
                            }

                            public C164482(FlowCollector flowCollector) {
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
                                    UUID orderRefId = ((EventOrderFormViewState) obj).getOrderRefId();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(orderRefId, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16447x6471d64(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OrderSubmissionManager.Result<? extends FuturesOrderDto, ? extends UiEventOrderContext>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(OrderSubmissionManager.Result<? extends FuturesOrderDto, ? extends UiEventOrderContext> result, Continuation<? super Unit> continuation) {
                    return invoke2((OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext>) result, continuation);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1$3$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$2$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C500611 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> $result;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ EventOrderFormDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500611(OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result, EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super C500611> continuation) {
                        super(2, continuation);
                        this.$result = result;
                        this.this$0 = eventOrderFormDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500611 c500611 = new C500611(this.$result, this.this$0, continuation);
                        c500611.L$0 = obj;
                        return c500611;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500611) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
                        OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result = this.$result;
                        if (result instanceof OrderSubmissionManager.Result.Failure) {
                            if (eventOrderFormDataState.getOrderSubmissionState() instanceof OrderSubmissionState.Editing) {
                                return eventOrderFormDataState;
                            }
                            this.this$0.submit(new EventOrderFormEvent.OrderError(((OrderSubmissionManager.Result.Failure) this.$result).getThrowable()));
                            return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, OrderSubmissionState.Editing.INSTANCE, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741807, null);
                        }
                        if (result instanceof OrderSubmissionManager.Result.Sending) {
                            return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, new OrderSubmissionState.Submitting(this.$result), null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741807, null);
                        }
                        if (!(result instanceof OrderSubmissionManager.Result.Submitted)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, new OrderSubmissionState.Submitting(this.$result), null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741807, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OrderSubmissionManager.Result result = (OrderSubmissionManager.Result) this.L$0;
                    EventOrderFormDuxo eventOrderFormDuxo = this.this$0;
                    eventOrderFormDuxo.applyMutation(new C500611(result, eventOrderFormDuxo, null));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(EventOrderFormDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3 */
    static final class C164543 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<EventContract> $contractFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C164543(Flow<EventContract> flow, Continuation<? super C164543> continuation) {
            super(2, continuation);
            this.$contractFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164543 c164543 = EventOrderFormDuxo.this.new C164543(this.$contractFlow, continuation);
            c164543.L$0 = obj;
            return c164543;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C164543) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {460}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<EventContract> $contractFlow;
            int label;
            final /* synthetic */ EventOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventOrderFormDuxo eventOrderFormDuxo, Flow<EventContract> flow, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventOrderFormDuxo;
                this.$contractFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$contractFlow, continuation);
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
                    Flow flowTake = FlowKt.take(FlowKt.combine(ExperimentsProvider.DefaultImpls.coStreamVariant$default(this.this$0.experimentsProvider, EcLimitAndNotionalExperiment.INSTANCE, EcLimitAndNotionalExperiment.Variant.CONTROL, false, 4, null), this.$contractFlow, AnonymousClass3.INSTANCE), 1);
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3$1$3, reason: invalid class name */
            /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<EcLimitAndNotionalExperiment.Variant, EventContract, Continuation<? super Tuples2<? extends EcLimitAndNotionalExperiment.Variant, ? extends EventContract>>, Object>, ContinuationImpl6 {
                public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

                AnonymousClass3() {
                    super(3, Tuples2.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(EcLimitAndNotionalExperiment.Variant variant, EventContract eventContract, Continuation<? super Tuples2<? extends EcLimitAndNotionalExperiment.Variant, EventContract>> continuation) {
                    return AnonymousClass1.invokeSuspend$lambda$0(variant, eventContract, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(EcLimitAndNotionalExperiment.Variant variant, EventContract eventContract, Continuation<? super Tuples2<? extends EcLimitAndNotionalExperiment.Variant, ? extends EventContract>> continuation) {
                    return invoke2(variant, eventContract, (Continuation<? super Tuples2<? extends EcLimitAndNotionalExperiment.Variant, EventContract>>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$lambda$0(EcLimitAndNotionalExperiment.Variant variant, EventContract eventContract, Continuation continuation) {
                return new Tuples2(variant, eventContract);
            }

            /* compiled from: EventOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant;", "Lkotlin/ParameterName;", "name", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Lcom/robinhood/android/models/event/db/arsenal/EventContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3$1$4", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Tuples2<? extends EcLimitAndNotionalExperiment.Variant, ? extends EventContract>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends EcLimitAndNotionalExperiment.Variant, ? extends EventContract> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends EcLimitAndNotionalExperiment.Variant, EventContract>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends EcLimitAndNotionalExperiment.Variant, EventContract> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3$1$4$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$3$1$4$1, reason: invalid class name and collision with other inner class name */
                static final class C500621 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
                    final /* synthetic */ EventContract $contract;
                    final /* synthetic */ EcLimitAndNotionalExperiment.Variant $variant;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ EventOrderFormDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500621(EventContract eventContract, EventOrderFormDuxo eventOrderFormDuxo, EcLimitAndNotionalExperiment.Variant variant, Continuation<? super C500621> continuation) {
                        super(2, continuation);
                        this.$contract = eventContract;
                        this.this$0 = eventOrderFormDuxo;
                        this.$variant = variant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500621 c500621 = new C500621(this.$contract, this.this$0, this.$variant, continuation);
                        c500621.L$0 = obj;
                        return c500621;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
                        return ((C500621) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        OrderFormTimeInForce quantityBasedOrderTimeInForce;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
                        if (eventOrderFormDataState.getOrderType() != null) {
                            return eventOrderFormDataState;
                        }
                        if (this.$contract.isComboContract()) {
                            quantityBasedOrderTimeInForce = OrderFormTimeInForce.IOC;
                        } else {
                            quantityBasedOrderTimeInForce = eventOrderFormDataState.getQuantityBasedOrderTimeInForce();
                            if (quantityBasedOrderTimeInForce == null && (quantityBasedOrderTimeInForce = this.this$0.preferences.getLastUsedTimeInForce()) == null) {
                                quantityBasedOrderTimeInForce = this.this$0.toDefaultTimeInForce(this.$variant);
                            }
                        }
                        OrderFormTimeInForce orderFormTimeInForce = quantityBasedOrderTimeInForce;
                        OrderFormOrderType defaultOrderType = this.this$0.getDefaultOrderType(eventOrderFormDataState, this.$variant, this.$contract);
                        return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, null, OrderFormFocusedField2.defaultFocusField(defaultOrderType), defaultOrderType, this.$variant.isInTreatmentExperience() && !this.$contract.isComboContract(), false, null, null, null, orderFormTimeInForce, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, this.$variant, false, 805302047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    EcLimitAndNotionalExperiment.Variant variant = (EcLimitAndNotionalExperiment.Variant) tuples2.component1();
                    EventContract eventContract = (EventContract) tuples2.component2();
                    EventOrderFormDuxo eventOrderFormDuxo = this.this$0;
                    eventOrderFormDuxo.applyMutation(new C500621(eventContract, eventOrderFormDuxo, variant, null));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(EventOrderFormDuxo.this, this.$contractFlow, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderFormOrderType getDefaultOrderType(EventOrderFormDataState eventOrderFormDataState, EcLimitAndNotionalExperiment.Variant variant, EventContract eventContract) {
        Companion companion = INSTANCE;
        if (((EventOrderFormFragment.Args) companion.getArgs((HasSavedState) this)).getPositionEffect() == EventOrderPositionEffect.OPEN) {
            if (eventContract.isComboContract()) {
                return OrderFormOrderType.NOTIONAL_BASED_ORDER;
            }
            OrderFormOrderType orderType = eventOrderFormDataState.getOrderType();
            if (orderType != null) {
                return orderType;
            }
            OrderFormOrderType defaultOrderType = ((EventOrderFormFragment.Args) companion.getArgs((HasSavedState) this)).getDefaultOrderType();
            if (defaultOrderType != null) {
                return defaultOrderType;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[this.preferences.getLastUsedEcOrderType().ordinal()];
            if (i == 1) {
                return OrderFormOrderType.QUANTITY_BASED_ORDER;
            }
            if (i == 2) {
                return OrderFormOrderType.NOTIONAL_BASED_ORDER;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return toDefaultOrderType(variant);
        }
        return OrderFormOrderType.QUANTITY_BASED_ORDER;
    }

    private final OrderFormOrderType toDefaultOrderType(EcLimitAndNotionalExperiment.Variant variant) {
        int i = WhenMappings.$EnumSwitchMapping$1[variant.ordinal()];
        if (i == 1) {
            return OrderFormOrderType.QUANTITY_BASED_ORDER;
        }
        if (i == 2) {
            return OrderFormOrderType.NOTIONAL_BASED_ORDER;
        }
        if (i == 3) {
            return OrderFormOrderType.QUANTITY_BASED_ORDER;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderFormOrderType.QUANTITY_BASED_ORDER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderFormTimeInForce toDefaultTimeInForce(EcLimitAndNotionalExperiment.Variant variant) {
        int i = WhenMappings.$EnumSwitchMapping$1[variant.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return OrderFormTimeInForce.GTD;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return OrderFormTimeInForce.IOC;
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onBackPressed$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onBackPressed$1 */
    static final class C164491 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164491(Continuation<? super C164491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164491 c164491 = EventOrderFormDuxo.this.new C164491(continuation);
            c164491.L$0 = obj;
            return c164491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164491) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
            OrderSubmissionState orderSubmissionState = eventOrderFormDataState.getOrderSubmissionState();
            OrderSubmissionState.Editing editing = OrderSubmissionState.Editing.INSTANCE;
            if (Intrinsics.areEqual(orderSubmissionState, editing)) {
                EventOrderFormDuxo.this.submit(EventOrderFormEvent.ExitOrderFormEvent.INSTANCE);
                return eventOrderFormDataState;
            }
            if (Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE)) {
                return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, editing, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741807, null);
            }
            if (!(orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
                throw new NoWhenBranchMatchedException();
            }
            OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result = ((OrderSubmissionState.Submitting) eventOrderFormDataState.getOrderSubmissionState()).getResult();
            if (result instanceof OrderSubmissionManager.Result.Failure) {
                return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, editing, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741807, null);
            }
            if (!(result instanceof OrderSubmissionManager.Result.Sending)) {
                if (!(result instanceof OrderSubmissionManager.Result.Submitted)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) eventOrderFormDataState.getOrderSubmissionState()).getResult()).getTriggersConfirmation() || ((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) eventOrderFormDataState.getOrderSubmissionState()).getResult()).getHasTriggeredConfirmation()) {
                    EventOrderFormDuxo.this.submit(EventOrderFormEvent.OrderSubmittedEvent.INSTANCE);
                    return eventOrderFormDataState;
                }
            }
            return eventOrderFormDataState;
        }
    }

    public final void onBackPressed() {
        applyMutation(new C164491(null));
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onKeyPressed$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onKeyPressed$1 */
    static final class C164551 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EventOrderFormDuxo this$0;

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onKeyPressed$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderFormFocusedField.values().length];
                try {
                    iArr[OrderFormFocusedField.QUANTITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderFormFocusedField.LIMIT_PRICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderFormFocusedField.NOTIONAL_AMOUNT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C164551(KeyEvent keyEvent, EventOrderFormDuxo eventOrderFormDuxo, Continuation<? super C164551> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
            this.this$0 = eventOrderFormDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164551 c164551 = new C164551(this.$keyEvent, this.this$0, continuation);
            c164551.L$0 = obj;
            return c164551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164551) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CurrencyInputHelper currencyInputHelper;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
            int i = WhenMappings.$EnumSwitchMapping$0[eventOrderFormDataState.getFocusedField().ordinal()];
            if (i == 1) {
                String strM14312processKeyEventM8tDOmk = KeyEventInputHandler.m14312processKeyEventM8tDOmk(eventOrderFormDataState.getQuantityText(), TextFieldValues.getTextSelectionAtEnd(eventOrderFormDataState.getQuantityText()), this.$keyEvent, false);
                if (strM14312processKeyEventM8tDOmk.length() > 9) {
                    strM14312processKeyEventM8tDOmk = eventOrderFormDataState.getQuantityText();
                }
                return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, null, null, null, false, false, strM14312processKeyEventM8tDOmk, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741311, null);
            }
            if (i == 2) {
                if (eventOrderFormDataState.isInAutoInsertDecimalExperiment()) {
                    currencyInputHelper = EventContractPriceInputHelper.INSTANCE;
                } else {
                    currencyInputHelper = EventContractCurrencyInputHelper.INSTANCE;
                }
                Tuples2 tuples2ProcessKeyEvent$default = CurrencyInputHelper.processKeyEvent$default(currencyInputHelper, this.$keyEvent, eventOrderFormDataState.getUserInputLimitPriceText(), false, true, false, true, 20, null);
                String str = (String) tuples2ProcessKeyEvent$default.component1();
                BigDecimal bigDecimal = (BigDecimal) tuples2ProcessKeyEvent$default.component2();
                if (bigDecimal.compareTo(BigDecimal.ONE) > 0) {
                    return eventOrderFormDataState;
                }
                return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, null, null, null, false, false, null, str.length() > 0 ? bigDecimal : null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073738751, null);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Tuples2 tuples2ProcessKeyEvent$default2 = CurrencyInputHelper.processKeyEvent$default(EventContractCurrencyInputHelper.INSTANCE, this.$keyEvent, eventOrderFormDataState.getUserInputNotionalAmountText(), false, true, false, true, 20, null);
            String str2 = (String) tuples2ProcessKeyEvent$default2.component1();
            BigDecimal bigDecimal2 = (BigDecimal) tuples2ProcessKeyEvent$default2.component2();
            if (bigDecimal2.compareTo(new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT)) >= 0) {
                this.this$0.submit(EventOrderFormEvent.NotionalPriceErrorShake.INSTANCE);
                return eventOrderFormDataState;
            }
            String str3 = str2.length() > 0 ? str2 : null;
            if (str3 == null) {
                str3 = "$0";
            }
            return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, null, null, null, false, false, null, null, null, null, null, bigDecimal2, str3, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073692671, null);
        }
    }

    public final void onKeyPressed(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C164551(keyEvent, this, null));
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onQuantityFieldFocused$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onQuantityFieldFocused$1 */
    static final class C164571 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164571(Continuation<? super C164571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164571 c164571 = new C164571(continuation);
            c164571.L$0 = obj;
            return c164571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164571) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, OrderFormFocusedField.QUANTITY, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741791, null);
        }
    }

    public final void onQuantityFieldFocused() {
        applyMutation(new C164571(null));
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onPriceFieldFocused$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onPriceFieldFocused$1 */
    static final class C164561 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164561(Continuation<? super C164561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164561 c164561 = new C164561(continuation);
            c164561.L$0 = obj;
            return c164561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164561) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventOrderFormDataState.copy$default((EventOrderFormDataState) this.L$0, null, null, null, null, null, OrderFormFocusedField.LIMIT_PRICE, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741791, null);
        }
    }

    public final void onPriceFieldFocused() {
        applyMutation(new C164561(null));
    }

    public final void submitOrder(UiEventOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        OrderSubmissionManager.submit$default(this.eventOrderManager, orderContext, null, false, 6, null);
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onReviewClicked$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onReviewClicked$1 */
    static final class C164581 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164581(Continuation<? super C164581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164581 c164581 = EventOrderFormDuxo.this.new C164581(continuation);
            c164581.L$0 = obj;
            return c164581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164581) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
                OrderSubmissionState orderSubmissionStateNewOrderSubmissionStateAfterReviewClicked = EventOrderFormDuxo.this.newOrderSubmissionStateAfterReviewClicked(eventOrderFormDataState);
                OrderFormOrderType orderType = eventOrderFormDataState.getOrderType();
                if (orderType != null) {
                    return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, orderSubmissionStateNewOrderSubmissionStateAfterReviewClicked, OrderFormFocusedField2.defaultFocusField(orderType), null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741775, null);
                }
                throw new IllegalArgumentException("should have order type set when click on review button");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.event.trade.orderform.EventOrderFormCallbacks
    public void onReviewClicked() {
        applyMutation(new C164581(null));
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCloseAllClicked$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCloseAllClicked$1 */
    static final class C164501 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164501(Continuation<? super C164501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164501 c164501 = EventOrderFormDuxo.this.new C164501(continuation);
            c164501.L$0 = obj;
            return c164501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164501) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
            BigDecimal quantityAvailableForClosing$feature_event_trade_externalDebug = eventOrderFormDataState.getQuantityAvailableForClosing$feature_event_trade_externalDebug();
            if (quantityAvailableForClosing$feature_event_trade_externalDebug == null) {
                throw new IllegalStateException("Close all button should only be enabled when we know the quantity available for closing");
            }
            return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, EventOrderFormDuxo.this.newOrderSubmissionStateAfterReviewClicked(eventOrderFormDataState), null, null, false, false, Formats.getIntegerWithoutGroupingFormat$default(null, 1, null).format(quantityAvailableForClosing$feature_event_trade_externalDebug), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741295, null);
        }
    }

    @Override // com.robinhood.android.event.trade.orderform.EventOrderFormCallbacks
    public void onCloseAllClicked() {
        applyMutation(new C164501(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderSubmissionState newOrderSubmissionStateAfterReviewClicked(EventOrderFormDataState eventOrderFormDataState) {
        OrderSubmissionState orderSubmissionState = eventOrderFormDataState.getOrderSubmissionState();
        if (Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Editing.INSTANCE) || Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE)) {
            return OrderSubmissionState.Reviewing.INSTANCE;
        }
        if (!(orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Reviewing from invalid state " + eventOrderFormDataState.getOrderSubmissionState()).toString());
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onTimeInForceChanged$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onTimeInForceChanged$1 */
    static final class C164591 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        final /* synthetic */ OrderFormTimeInForce $timeInForce;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: EventOrderFormDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onTimeInForceChanged$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderFormTimeInForce.values().length];
                try {
                    iArr[OrderFormTimeInForce.IOC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderFormTimeInForce.FOK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderFormTimeInForce.GTD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderFormTimeInForce.UNSPECIFIED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C164591(OrderFormTimeInForce orderFormTimeInForce, Continuation<? super C164591> continuation) {
            super(2, continuation);
            this.$timeInForce = orderFormTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164591 c164591 = EventOrderFormDuxo.this.new C164591(this.$timeInForce, continuation);
            c164591.L$0 = obj;
            return c164591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164591) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OrderFormFocusedField focusedField;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
                EventOrderFormDuxo.this.preferences.setLastUsedTimeInForce(this.$timeInForce);
                int i = WhenMappings.$EnumSwitchMapping$0[this.$timeInForce.ordinal()];
                if (i == 1 || i == 2) {
                    focusedField = OrderFormFocusedField.QUANTITY;
                } else {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    focusedField = eventOrderFormDataState.getFocusedField();
                }
                return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, null, null, focusedField, null, false, false, null, null, null, this.$timeInForce, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073737695, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onTimeInForceChanged(OrderFormTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        applyMutation(new C164591(timeInForce, null));
    }

    public final void regenerateRefId(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Integer httpStatusCode = Throwables.getHttpStatusCode(throwable);
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(400, 499);
        if (httpStatusCode == null || !primitiveRanges2.contains(httpStatusCode.intValue())) {
            return;
        }
        applyMutation(new C164601(null));
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$regenerateRefId$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$regenerateRefId$1 */
    static final class C164601 extends ContinuationImpl7 implements Function2<EventOrderFormDataState, Continuation<? super EventOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164601(Continuation<? super C164601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164601 c164601 = new C164601(continuation);
            c164601.L$0 = obj;
            return c164601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderFormDataState eventOrderFormDataState, Continuation<? super EventOrderFormDataState> continuation) {
            return ((C164601) create(eventOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) this.L$0;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            return EventOrderFormDataState.copy$default(eventOrderFormDataState, null, null, null, uuidRandomUUID, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 1073741815, null);
        }
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/trade/EventOrderFormDuxo;", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args;", "<init>", "()V", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventOrderFormDuxo, EventOrderFormFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventOrderFormFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EventOrderFormFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventOrderFormFragment.Args getArgs(EventOrderFormDuxo eventOrderFormDuxo) {
            return (EventOrderFormFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, eventOrderFormDuxo);
        }
    }

    /* compiled from: EventOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormDuxo$FeesArgs;", "", "swapsAccountId", "Ljava/util/UUID;", "eventContractId", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "quantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/models/event/db/order/EventOrderSide;Ljava/math/BigDecimal;)V", "getSwapsAccountId", "()Ljava/util/UUID;", "getEventContractId", "getSide", "()Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getQuantity", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FeesArgs {
        public static final int $stable = 8;
        private final UUID eventContractId;
        private final BigDecimal quantity;
        private final EventOrderSide side;
        private final UUID swapsAccountId;

        public static /* synthetic */ FeesArgs copy$default(FeesArgs feesArgs, UUID uuid, UUID uuid2, EventOrderSide eventOrderSide, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = feesArgs.swapsAccountId;
            }
            if ((i & 2) != 0) {
                uuid2 = feesArgs.eventContractId;
            }
            if ((i & 4) != 0) {
                eventOrderSide = feesArgs.side;
            }
            if ((i & 8) != 0) {
                bigDecimal = feesArgs.quantity;
            }
            return feesArgs.copy(uuid, uuid2, eventOrderSide, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getSwapsAccountId() {
            return this.swapsAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getEventContractId() {
            return this.eventContractId;
        }

        /* renamed from: component3, reason: from getter */
        public final EventOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final FeesArgs copy(UUID swapsAccountId, UUID eventContractId, EventOrderSide side, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new FeesArgs(swapsAccountId, eventContractId, side, quantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeesArgs)) {
                return false;
            }
            FeesArgs feesArgs = (FeesArgs) other;
            return Intrinsics.areEqual(this.swapsAccountId, feesArgs.swapsAccountId) && Intrinsics.areEqual(this.eventContractId, feesArgs.eventContractId) && this.side == feesArgs.side && Intrinsics.areEqual(this.quantity, feesArgs.quantity);
        }

        public int hashCode() {
            UUID uuid = this.swapsAccountId;
            return ((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.eventContractId.hashCode()) * 31) + this.side.hashCode()) * 31) + this.quantity.hashCode();
        }

        public String toString() {
            return "FeesArgs(swapsAccountId=" + this.swapsAccountId + ", eventContractId=" + this.eventContractId + ", side=" + this.side + ", quantity=" + this.quantity + ")";
        }

        public FeesArgs(UUID uuid, UUID eventContractId, EventOrderSide side, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.swapsAccountId = uuid;
            this.eventContractId = eventContractId;
            this.side = side;
            this.quantity = quantity;
        }

        public final UUID getSwapsAccountId() {
            return this.swapsAccountId;
        }

        public final UUID getEventContractId() {
            return this.eventContractId;
        }

        public final EventOrderSide getSide() {
            return this.side;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }
    }
}
