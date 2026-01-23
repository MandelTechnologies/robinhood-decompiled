package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.equities.equitytrade.EquityTradeService;
import com.robinhood.android.equities.equitytrade.OrderStatusEvent;
import com.robinhood.android.equities.equitytrade.OrderSubmitResult;
import com.robinhood.android.equitydetail.p123ui.TradeButtonLogger;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState2;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState3;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState4;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState5;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.deeplink.MarginCallMarketOrderDeeplinkTarget2;
import com.robinhood.android.margin.contracts.MarginCallMarketOrderFragmentKey;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MarginCallMarketOrderDataMismatch;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.utils.datetime.Durations;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallDataRequestDto;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallDataResponseDto;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallSummaryFromDataRequestDto;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallSummaryFromDataResponseDto;
import microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataDto;
import microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataService;
import microgram.contracts.margin.margin_call.proto.p496v1.OrderSideDto;
import microgram.contracts.margin.margin_call.proto.p496v1.TradeDto;
import p479j$.time.Duration;

/* compiled from: MarginCallMarketOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001IBI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020%J\u0006\u0010.\u001a\u00020%J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u00103J\u0018\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020#2\u0006\u00106\u001a\u000200H\u0002J\b\u00107\u001a\u00020%H\u0002J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020 H\u0002J$\u0010:\u001a\u00020;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=2\u0006\u0010@\u001a\u00020 H\u0002J\b\u0010A\u001a\u00020%H\u0002J\u0010\u0010B\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010C\u001a\u00020D*\u0004\u0018\u00010E2\u0006\u00101\u001a\u000202H\u0002J\f\u0010F\u001a\u00020G*\u00020HH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "equityTradeService", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityTradeService;Lcom/robinhood/android/common/buysell/BuySellStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "maintenanceCallDataService", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;", "deeplinkClosePositionsCount", "", "Ljava/lang/Integer;", "deeplinkEstimatedValue", "", "onStart", "", "loadMaintenanceCallData", "handleMaintenanceCallError", "error", "", "verifyDeeplinkData", "maintenanceCallData", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "refreshNbboSummary", "submitMarketOrders", "submitSingleOrder", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", TradeButtonLogger.BUTTON_GROUP_TRADE_TRADE, "Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;", "(Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTradeSubmissionResult", "tradeRefId", "result", "completeOrderSubmission", "trackSubmittedOrderStatus", "ordersCount", "shouldContinuePolling", "", "orderMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Order;", "expectedCount", "getFinalMaintenanceCallState", "updateFinalOrderStatus", "createEquityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "Lcom/robinhood/android/common/buysell/BuySellData;", "toEquityOrderSide", "Lcom/robinhood/models/db/EquityOrderSide;", "Lmicrogram/contracts/margin/margin_call/proto/v1/OrderSideDto;", "Companion", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarginCallMarketOrderDuxo extends BaseDuxo<MarginCallMarketOrderDataState, MarginCallMarketOrderViewState> implements HasSavedState {
    private static final long ORDER_POLLING_TIMEOUT_MS = 60000;
    private final BuySellStore buySellStore;
    private final Integer deeplinkClosePositionsCount;
    private final String deeplinkEstimatedValue;
    private final EquityTradeService equityTradeService;
    private final EventLogger eventLogger;
    private final MaintenanceCallDataService maintenanceCallDataService;
    private final MicrogramComponent microgramComponent;
    private final MicrogramManager2 microgramInstance;
    private final OrderStore orderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Duration SINGLE_ORDER_POLL_INTERVAL = Durations.INSTANCE.getTWO_SECONDS();

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSideDto.values().length];
            try {
                iArr[OrderSideDto.ORDER_SIDE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSideDto.BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderSideDto.SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "submitSingleOrder")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitSingleOrder$1 */
    static final class C167871 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C167871(Continuation<? super C167871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MarginCallMarketOrderDuxo.this.submitSingleOrder(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginCallMarketOrderDuxo(EquityTradeService equityTradeService, BuySellStore buySellStore, OrderStore orderStore, EventLogger eventLogger, MicrogramManager microgramManager, DuxoBundle duxoBundle, MarginCallMarketOrderStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        super(new MarginCallMarketOrderDataState(null, null, null, null, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.equityTradeService = equityTradeService;
        this.buySellStore = buySellStore;
        this.orderStore = orderStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication(MarginCallMarketOrderDeeplinkTarget2.MARGIN_CALL_V2_MICROGRAM_ID, null, 2, null), null, 2, null), null, 4, null);
        this.microgramInstance = microgramManager2M16549getInstancemoChb0s$default;
        MicrogramComponent component = microgramManager2M16549getInstancemoChb0s$default.getComponent();
        this.microgramComponent = component;
        this.maintenanceCallDataService = (MaintenanceCallDataService) component.getServiceLocator().getClient(MaintenanceCallDataService.class);
        Companion companion = INSTANCE;
        this.deeplinkClosePositionsCount = ((MarginCallMarketOrderFragmentKey) companion.getArgs((HasSavedState) this)).getClosePositionsCount();
        this.deeplinkEstimatedValue = ((MarginCallMarketOrderFragmentKey) companion.getArgs((HasSavedState) this)).getEstimatedValue();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        loadMaintenanceCallData();
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$loadMaintenanceCallData$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {103, 106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$loadMaintenanceCallData$1 */
    static final class C167821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C167821(Continuation<? super C167821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167821 c167821 = MarginCallMarketOrderDuxo.this.new C167821(continuation);
            c167821.L$0 = obj;
            return c167821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginCallMarketOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$loadMaintenanceCallData$1$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$loadMaintenanceCallData$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
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
            public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
                return ((AnonymousClass1) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginCallMarketOrderDataState.copy$default((MarginCallMarketOrderDataState) this.L$0, MarginCallMarketOrderDataState2.Loading.INSTANCE, null, null, null, null, 30, null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Throwable thM28553exceptionOrNullimpl;
            MarginCallMarketOrderDuxo marginCallMarketOrderDuxo;
            GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MarginCallMarketOrderDuxo.this.applyMutation(new AnonymousClass1(null));
                marginCallMarketOrderDuxo = MarginCallMarketOrderDuxo.this;
                Result.Companion companion2 = Result.INSTANCE;
                MaintenanceCallDataService maintenanceCallDataService = marginCallMarketOrderDuxo.maintenanceCallDataService;
                GetMaintenanceCallDataRequestDto getMaintenanceCallDataRequestDto = new GetMaintenanceCallDataRequestDto(((MarginCallMarketOrderFragmentKey) MarginCallMarketOrderDuxo.INSTANCE.getArgs((HasSavedState) marginCallMarketOrderDuxo)).getAccountNumber());
                this.L$0 = marginCallMarketOrderDuxo;
                this.label = 1;
                obj = maintenanceCallDataService.GetMaintenanceCallData(getMaintenanceCallDataRequestDto, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getMaintenanceCallDataResponseDto = (GetMaintenanceCallDataResponseDto) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM28550constructorimpl = Result.m28550constructorimpl(Tuples4.m3642to(getMaintenanceCallDataResponseDto, (GetMaintenanceCallSummaryFromDataResponseDto) obj));
                MarginCallMarketOrderDuxo marginCallMarketOrderDuxo2 = MarginCallMarketOrderDuxo.this;
                if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    Tuples2 tuples2 = (Tuples2) objM28550constructorimpl;
                    GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto2 = (GetMaintenanceCallDataResponseDto) tuples2.component1();
                    marginCallMarketOrderDuxo2.applyMutation(new MarginCallMarketOrderDuxo2((GetMaintenanceCallSummaryFromDataResponseDto) tuples2.component2(), getMaintenanceCallDataResponseDto2, null));
                    marginCallMarketOrderDuxo2.verifyDeeplinkData(getMaintenanceCallDataResponseDto2);
                    marginCallMarketOrderDuxo2.refreshNbboSummary();
                }
                MarginCallMarketOrderDuxo marginCallMarketOrderDuxo3 = MarginCallMarketOrderDuxo.this;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    Logger.INSTANCE.mo1681e("Failed to load maintenance call data: " + thM28553exceptionOrNullimpl, new Object[0]);
                    marginCallMarketOrderDuxo3.handleMaintenanceCallError(thM28553exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            marginCallMarketOrderDuxo = (MarginCallMarketOrderDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto3 = (GetMaintenanceCallDataResponseDto) obj;
            MaintenanceCallDataService maintenanceCallDataService2 = marginCallMarketOrderDuxo.maintenanceCallDataService;
            GetMaintenanceCallSummaryFromDataRequestDto getMaintenanceCallSummaryFromDataRequestDto = new GetMaintenanceCallSummaryFromDataRequestDto(getMaintenanceCallDataResponseDto3.getMaintenance_call_data());
            this.L$0 = getMaintenanceCallDataResponseDto3;
            this.label = 2;
            Object objGetMaintenanceCallSummaryFromData = maintenanceCallDataService2.GetMaintenanceCallSummaryFromData(getMaintenanceCallSummaryFromDataRequestDto, this);
            if (objGetMaintenanceCallSummaryFromData != coroutine_suspended) {
                getMaintenanceCallDataResponseDto = getMaintenanceCallDataResponseDto3;
                obj = objGetMaintenanceCallSummaryFromData;
                objM28550constructorimpl = Result.m28550constructorimpl(Tuples4.m3642to(getMaintenanceCallDataResponseDto, (GetMaintenanceCallSummaryFromDataResponseDto) obj));
                MarginCallMarketOrderDuxo marginCallMarketOrderDuxo22 = MarginCallMarketOrderDuxo.this;
                if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                }
                MarginCallMarketOrderDuxo marginCallMarketOrderDuxo32 = MarginCallMarketOrderDuxo.this;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    private final void loadMaintenanceCallData() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C167821(null), 3, null);
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$handleMaintenanceCallError$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$handleMaintenanceCallError$1 */
    static final class C167811 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
        final /* synthetic */ Throwable $error;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167811(Throwable th, Continuation<? super C167811> continuation) {
            super(2, continuation);
            this.$error = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167811 c167811 = new C167811(this.$error, continuation);
            c167811.L$0 = obj;
            return c167811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
            return ((C167811) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MarginCallMarketOrderDataState.copy$default((MarginCallMarketOrderDataState) this.L$0, new MarginCallMarketOrderDataState2.Error(this.$error), new MarginCallMarketOrderDataState3.Error(this.$error), null, null, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMaintenanceCallError(Throwable error) {
        applyMutation(new C167811(error, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void verifyDeeplinkData(GetMaintenanceCallDataResponseDto maintenanceCallData) {
        MoneyDto total_estimated_cash_flow;
        List<TradeDto> sells;
        if (this.deeplinkClosePositionsCount == null || this.deeplinkEstimatedValue == null) {
            return;
        }
        MaintenanceCallDataDto maintenance_call_data = maintenanceCallData.getMaintenance_call_data();
        int size = (maintenance_call_data == null || (sells = maintenance_call_data.getSells()) == null) ? 0 : sells.size();
        MaintenanceCallDataDto maintenance_call_data2 = maintenanceCallData.getMaintenance_call_data();
        IdlDecimal amount = (maintenance_call_data2 == null || (total_estimated_cash_flow = maintenance_call_data2.getTotal_estimated_cash_flow()) == null) ? null : total_estimated_cash_flow.getAmount();
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(this.deeplinkEstimatedValue);
        BigDecimal bigDecimalOrNull2 = amount != null ? amount.toBigDecimalOrNull() : null;
        Integer num = this.deeplinkClosePositionsCount;
        boolean z = true;
        boolean z2 = num == null || num.intValue() != size;
        if (bigDecimalOrNull == null || bigDecimalOrNull2 == null) {
            Logger.INSTANCE.mo1684w("Failed to parse estimated values as BigDecimal - deeplink: " + this.deeplinkEstimatedValue + ", actual: " + amount, new Object[0]);
        } else {
            if (bigDecimalOrNull.compareTo(bigDecimalOrNull2) == 0) {
            }
            if (!z2 || z) {
                Logger.INSTANCE.mo1684w("Deeplink data mismatch - expected: closePositionsCount: " + this.deeplinkClosePositionsCount + ", estimatedValue: " + this.deeplinkEstimatedValue + " - actual closePositionsCount: " + size + ", actual estimatedValue: " + amount, new Object[0]);
                EventLogger.DefaultImpls.logAppear$default(this.eventLogger, UserInteractionEventData.Action.MARGIN_CALL_SUMMARY_TO_ORDER_DATA_MISMATCH, new Screen(Screen.Name.MARGIN_CALL_V2_MARKET_ORDER, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MarginCallMarketOrderDataMismatch(this.deeplinkClosePositionsCount.intValue(), size, bigDecimalOrNull == null ? bigDecimalOrNull.doubleValue() : 0.0d, bigDecimalOrNull2 != null ? bigDecimalOrNull2.doubleValue() : 0.0d, null, 16, null), null, null, null, null, -1, -1, -1, -1, -1, -1, 15871, null), 12, null);
            }
            return;
        }
        z = false;
        if (z2) {
        }
        Logger.INSTANCE.mo1684w("Deeplink data mismatch - expected: closePositionsCount: " + this.deeplinkClosePositionsCount + ", estimatedValue: " + this.deeplinkEstimatedValue + " - actual closePositionsCount: " + size + ", actual estimatedValue: " + amount, new Object[0]);
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, UserInteractionEventData.Action.MARGIN_CALL_SUMMARY_TO_ORDER_DATA_MISMATCH, new Screen(Screen.Name.MARGIN_CALL_V2_MARKET_ORDER, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MarginCallMarketOrderDataMismatch(this.deeplinkClosePositionsCount.intValue(), size, bigDecimalOrNull == null ? bigDecimalOrNull.doubleValue() : 0.0d, bigDecimalOrNull2 != null ? bigDecimalOrNull2.doubleValue() : 0.0d, null, 16, null), null, null, null, null, -1, -1, -1, -1, -1, -1, 15871, null), 12, null);
    }

    public final void refreshNbboSummary() {
        Logger.INSTANCE.mo1679d("Refreshing NBBO summary...", new Object[0]);
        withDataState(new Function1() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCallMarketOrderDuxo.refreshNbboSummary$lambda$0(this.f$0, (MarginCallMarketOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNbboSummary$lambda$0(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, MarginCallMarketOrderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MarginCallMarketOrderDataState2 maintenanceCallDataState = dataState.getMaintenanceCallDataState();
        MarginCallMarketOrderDataState2.Loaded loaded = maintenanceCallDataState instanceof MarginCallMarketOrderDataState2.Loaded ? (MarginCallMarketOrderDataState2.Loaded) maintenanceCallDataState : null;
        if (loaded != null) {
            BuildersKt__Builders_commonKt.launch$default(marginCallMarketOrderDuxo.getLifecycleScope(), null, null, new MarginCallMarketOrderDuxo3(marginCallMarketOrderDuxo, loaded, null), 3, null);
            return Unit.INSTANCE;
        }
        Logger.INSTANCE.mo1681e("Cannot refresh NBBO, maintenance call data not loaded yet.", new Object[0]);
        return Unit.INSTANCE;
    }

    public final void submitMarketOrders() {
        withDataState(new Function1() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCallMarketOrderDuxo.submitMarketOrders$lambda$1(this.f$0, (MarginCallMarketOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitMarketOrders$lambda$1(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, MarginCallMarketOrderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MarginCallMarketOrderDataState2 maintenanceCallDataState = dataState.getMaintenanceCallDataState();
        MarginCallMarketOrderDataState2.Loaded loaded = maintenanceCallDataState instanceof MarginCallMarketOrderDataState2.Loaded ? (MarginCallMarketOrderDataState2.Loaded) maintenanceCallDataState : null;
        if (loaded != null) {
            BuildersKt__Builders_commonKt.launch$default(marginCallMarketOrderDuxo.getLifecycleScope(), null, null, new MarginCallMarketOrderDuxo6(loaded, marginCallMarketOrderDuxo, null), 3, null);
            return Unit.INSTANCE;
        }
        Logger.INSTANCE.mo1681e("Cannot submit equity orders, maintenance call data not loaded yet.", new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitSingleOrder(TradeDto tradeDto, Continuation<? super OrderSubmitResult> continuation) {
        C167871 c167871;
        if (continuation instanceof C167871) {
            c167871 = (C167871) continuation;
            int i = c167871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c167871.label = i - Integer.MIN_VALUE;
            } else {
                c167871 = new C167871(continuation);
            }
        }
        Object objFirst = c167871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c167871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<BuySellData> buySellData = this.buySellStore.getBuySellData(com.robinhood.utils.extensions.StringsKt.toUuid(tradeDto.getInstrument_id()), ((MarginCallMarketOrderFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber());
            c167871.L$0 = tradeDto;
            c167871.label = 1;
            objFirst = FlowKt.first(buySellData, c167871);
            if (objFirst != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
            return objFirst;
        }
        tradeDto = (TradeDto) c167871.L$0;
        ResultKt.throwOnFailure(objFirst);
        EquityOrderIntent equityOrderIntentCreateEquityOrderIntent = createEquityOrderIntent((BuySellData) objFirst, tradeDto);
        EquityTradeService equityTradeService = this.equityTradeService;
        c167871.L$0 = null;
        c167871.label = 2;
        Object objValidateAndSubmit = equityTradeService.validateAndSubmit(equityOrderIntentCreateEquityOrderIntent, c167871);
        return objValidateAndSubmit == coroutine_suspended ? coroutine_suspended : objValidateAndSubmit;
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$updateTradeSubmissionResult$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$updateTradeSubmissionResult$1 */
    static final class C167901 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
        final /* synthetic */ OrderSubmitResult $result;
        final /* synthetic */ String $tradeRefId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167901(String str, OrderSubmitResult orderSubmitResult, Continuation<? super C167901> continuation) {
            super(2, continuation);
            this.$tradeRefId = str;
            this.$result = orderSubmitResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167901 c167901 = new C167901(this.$tradeRefId, this.$result, continuation);
            c167901.L$0 = obj;
            return c167901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
            return ((C167901) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarginCallMarketOrderDataState marginCallMarketOrderDataState = (MarginCallMarketOrderDataState) this.L$0;
            MarginCallMarketOrderDataState5 tradeSubmissionState = marginCallMarketOrderDataState.getTradeSubmissionState();
            MarginCallMarketOrderDataState5.Submitting submitting = tradeSubmissionState instanceof MarginCallMarketOrderDataState5.Submitting ? (MarginCallMarketOrderDataState5.Submitting) tradeSubmissionState : null;
            if (submitting != null) {
                MarginCallMarketOrderDataState marginCallMarketOrderDataStateCopy$default = MarginCallMarketOrderDataState.copy$default(marginCallMarketOrderDataState, null, null, new MarginCallMarketOrderDataState5.Submitting(MapsKt.plus(submitting.getResults(), Tuples4.m3642to(this.$tradeRefId, this.$result))), null, null, 27, null);
                if (marginCallMarketOrderDataStateCopy$default != null) {
                    return marginCallMarketOrderDataStateCopy$default;
                }
            }
            return marginCallMarketOrderDataState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTradeSubmissionResult(String tradeRefId, OrderSubmitResult result) {
        applyMutation(new C167901(tradeRefId, result, null));
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$completeOrderSubmission$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$completeOrderSubmission$1 */
    static final class C167791 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C167791(Continuation<? super C167791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167791 c167791 = new C167791(continuation);
            c167791.L$0 = obj;
            return c167791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
            return ((C167791) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarginCallMarketOrderDataState marginCallMarketOrderDataState = (MarginCallMarketOrderDataState) this.L$0;
            MarginCallMarketOrderDataState5 tradeSubmissionState = marginCallMarketOrderDataState.getTradeSubmissionState();
            MarginCallMarketOrderDataState5.Submitting submitting = tradeSubmissionState instanceof MarginCallMarketOrderDataState5.Submitting ? (MarginCallMarketOrderDataState5.Submitting) tradeSubmissionState : null;
            if (submitting != null) {
                Logger.INSTANCE.mo1679d("All orders submitted", new Object[0]);
                MarginCallMarketOrderDataState marginCallMarketOrderDataStateCopy$default = MarginCallMarketOrderDataState.copy$default(marginCallMarketOrderDataState, null, null, new MarginCallMarketOrderDataState5.Complete(submitting.getResults()), null, null, 27, null);
                if (marginCallMarketOrderDataStateCopy$default != null) {
                    return marginCallMarketOrderDataStateCopy$default;
                }
            }
            return marginCallMarketOrderDataState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeOrderSubmission() {
        applyMutation(new C167791(null));
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {256}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1 */
    static final class C167881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $ordersCount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167881(int i, Continuation<? super C167881> continuation) {
            super(2, continuation);
            this.$ordersCount = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginCallMarketOrderDuxo.this.new C167881(this.$ordersCount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginCallMarketOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $ordersCount;
            int label;
            final /* synthetic */ MarginCallMarketOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, int i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marginCallMarketOrderDuxo;
                this.$ordersCount = i;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$ordersCount, continuation);
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
                    final Flow<OrderStatusEvent> flowStreamSubmittedOrderStatusEvents = this.this$0.equityTradeService.streamSubmittedOrderStatusEvents();
                    Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.transformWhile(FlowKt.scan(FlowKt__MergeKt.flatMapMerge$default(new Flow<UUID>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamSubmittedOrderStatusEvents.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                Order order;
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
                                    OrderStatusEvent orderStatusEvent = (OrderStatusEvent) obj;
                                    UUID id = null;
                                    OrderStatusEvent.Success success = orderStatusEvent instanceof OrderStatusEvent.Success ? (OrderStatusEvent.Success) orderStatusEvent : null;
                                    if (success != null && (order = success.getOrder()) != null) {
                                        id = order.getId();
                                    }
                                    if (id != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
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
                    }, 0, new AnonymousClass2(this.this$0, null), 1, null), MapsKt.emptyMap(), new AnonymousClass3(null)), new AnonymousClass4(this.this$0, this.$ordersCount, null)), new AnonymousClass5(this.this$0, null));
                    AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowOnCompletion, anonymousClass6, this) == coroutine_suspended) {
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

            /* compiled from: MarginCallMarketOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Order;", "orderId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$2", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Flow<? extends Order>>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ MarginCallMarketOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = marginCallMarketOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super Flow<? extends Order>> continuation) {
                    return invoke2(uuid, (Continuation<? super Flow<Order>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(UUID uuid, Continuation<? super Flow<Order>> continuation) {
                    return ((AnonymousClass2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.this$0.orderStore.poll((UUID) this.L$0, MarginCallMarketOrderDuxo.SINGLE_ORDER_POLL_INTERVAL)), Integer.MAX_VALUE, null, 2, null));
                }
            }

            /* compiled from: MarginCallMarketOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Order;", "acc", Card.Icon.ORDER}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$3", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<Map<UUID, ? extends Order>, Order, Continuation<? super Map<UUID, ? extends Order>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends Order> map, Order order, Continuation<? super Map<UUID, ? extends Order>> continuation) {
                    return invoke2((Map<UUID, Order>) map, order, (Continuation<? super Map<UUID, Order>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, Order> map, Order order, Continuation<? super Map<UUID, Order>> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = map;
                    anonymousClass3.L$1 = order;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Map map = (Map) this.L$0;
                    Order order = (Order) this.L$1;
                    return MapsKt.plus(map, Tuples4.m3642to(order.getId(), order));
                }
            }

            /* compiled from: MarginCallMarketOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Order;", "orderMap"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$4", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<UUID, ? extends Order>>, Map<UUID, ? extends Order>, Continuation<? super Boolean>, Object> {
                final /* synthetic */ int $ordersCount;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ MarginCallMarketOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, int i, Continuation<? super AnonymousClass4> continuation) {
                    super(3, continuation);
                    this.this$0 = marginCallMarketOrderDuxo;
                    this.$ordersCount = i;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<UUID, ? extends Order>> flowCollector, Map<UUID, ? extends Order> map, Continuation<? super Boolean> continuation) {
                    return invoke2((FlowCollector<? super Map<UUID, Order>>) flowCollector, (Map<UUID, Order>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(FlowCollector<? super Map<UUID, Order>> flowCollector, Map<UUID, Order> map, Continuation<? super Boolean> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$ordersCount, continuation);
                    anonymousClass4.L$0 = flowCollector;
                    anonymousClass4.L$1 = map;
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Map map;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Map map2 = (Map) this.L$1;
                        this.L$0 = map2;
                        this.label = 1;
                        if (flowCollector.emit(map2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map = map2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map = (Map) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return boxing.boxBoolean(this.this$0.shouldContinuePolling(map, this.$ordersCount));
                }
            }

            /* compiled from: MarginCallMarketOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Order;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$5", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<UUID, ? extends Order>>, Throwable, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ MarginCallMarketOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(3, continuation);
                    this.this$0 = marginCallMarketOrderDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<UUID, ? extends Order>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    return invoke2((FlowCollector<? super Map<UUID, Order>>) flowCollector, th, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(FlowCollector<? super Map<UUID, Order>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    return new AnonymousClass5(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getFinalMaintenanceCallState();
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: MarginCallMarketOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orderMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Order;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$6", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$6, reason: invalid class name */
            static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends Order>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ MarginCallMarketOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass6(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, Continuation<? super AnonymousClass6> continuation) {
                    super(2, continuation);
                    this.this$0 = marginCallMarketOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, continuation);
                    anonymousClass6.L$0 = obj;
                    return anonymousClass6;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends Order> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, Order>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, Order> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass6) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: MarginCallMarketOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$6$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$trackSubmittedOrderStatus$1$1$6$1, reason: invalid class name and collision with other inner class name */
                static final class C500821 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
                    final /* synthetic */ Map<UUID, Order> $orderMap;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500821(Map<UUID, Order> map, Continuation<? super C500821> continuation) {
                        super(2, continuation);
                        this.$orderMap = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500821 c500821 = new C500821(this.$orderMap, continuation);
                        c500821.L$0 = obj;
                        return c500821;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
                        return ((C500821) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return MarginCallMarketOrderDataState.copy$default((MarginCallMarketOrderDataState) this.L$0, null, null, null, new MarginCallMarketOrderDataState4.Polling(this.$orderMap), null, 23, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500821((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginCallMarketOrderDuxo.this, this.$ordersCount, null);
                this.label = 1;
                if (Timeout6.withTimeoutOrNull(MarginCallMarketOrderDuxo.ORDER_POLLING_TIMEOUT_MS, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackSubmittedOrderStatus(int ordersCount) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C167881(ordersCount, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldContinuePolling(Map<UUID, Order> orderMap, int expectedCount) {
        if (orderMap.size() < expectedCount) {
            return true;
        }
        Collection<Order> collectionValues = orderMap.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            if (!((Order) it.next()).getState().isFinal()) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$getFinalMaintenanceCallState$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$getFinalMaintenanceCallState$1 */
    static final class C167801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C167801(Continuation<? super C167801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167801 c167801 = MarginCallMarketOrderDuxo.this.new C167801(continuation);
            c167801.L$0 = obj;
            return c167801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MarginCallMarketOrderDuxo marginCallMarketOrderDuxo = MarginCallMarketOrderDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    MaintenanceCallDataService maintenanceCallDataService = marginCallMarketOrderDuxo.maintenanceCallDataService;
                    GetMaintenanceCallDataRequestDto getMaintenanceCallDataRequestDto = new GetMaintenanceCallDataRequestDto(((MarginCallMarketOrderFragmentKey) MarginCallMarketOrderDuxo.INSTANCE.getArgs((HasSavedState) marginCallMarketOrderDuxo)).getAccountNumber());
                    this.label = 1;
                    obj = maintenanceCallDataService.GetMaintenanceCallData(getMaintenanceCallDataRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((GetMaintenanceCallDataResponseDto) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            MarginCallMarketOrderDuxo marginCallMarketOrderDuxo2 = MarginCallMarketOrderDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                marginCallMarketOrderDuxo2.updateFinalOrderStatus((GetMaintenanceCallDataResponseDto) objM28550constructorimpl);
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                Logger.INSTANCE.mo1681e("Failed to get final maintenance call data: " + thM28553exceptionOrNullimpl, new Object[0]);
                throw new IllegalStateException(thM28553exceptionOrNullimpl.toString());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFinalMaintenanceCallState() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C167801(null), 3, null);
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$updateFinalOrderStatus$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$updateFinalOrderStatus$1 */
    static final class C167891 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
        final /* synthetic */ GetMaintenanceCallDataResponseDto $maintenanceCallData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167891(GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto, Continuation<? super C167891> continuation) {
            super(2, continuation);
            this.$maintenanceCallData = getMaintenanceCallDataResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167891 c167891 = new C167891(this.$maintenanceCallData, continuation);
            c167891.L$0 = obj;
            return c167891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
            return ((C167891) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Map<UUID, Order> orderState;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarginCallMarketOrderDataState marginCallMarketOrderDataState = (MarginCallMarketOrderDataState) this.L$0;
            MarginCallMarketOrderDataState4 orderStatusPollingState = marginCallMarketOrderDataState.getOrderStatusPollingState();
            if (orderStatusPollingState != null && (orderState = orderStatusPollingState.getOrderState()) != null) {
                return MarginCallMarketOrderDataState.copy$default(marginCallMarketOrderDataState, null, null, null, new MarginCallMarketOrderDataState4.Complete(orderState, this.$maintenanceCallData), null, 23, null);
            }
            throw new IllegalStateException("Missing order polling state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFinalOrderStatus(GetMaintenanceCallDataResponseDto maintenanceCallData) {
        applyMutation(new C167891(maintenanceCallData, null));
    }

    private final EquityOrderIntent createEquityOrderIntent(BuySellData buySellData, TradeDto tradeDto) {
        if (buySellData == null) {
            throw new IllegalArgumentException("Buy sell data not found");
        }
        UUID uuid = com.robinhood.utils.extensions.StringsKt.toUuid(tradeDto.getRef_id());
        EquityOrderSide equityOrderSide = toEquityOrderSide(tradeDto.getOrder_side());
        Account account = buySellData.getAccount();
        if (account != null) {
            return new EquityOrderIntent(uuid, equityOrderSide, null, null, account, buySellData.getInstrument(), new Quantity(tradeDto.getNum_shares().toBigDecimalOrThrow()), OrderTimeInForce.GFD, OrderMarketHours.REGULAR_HOURS, null, null, buySellData.getTradingSession(), buySellData.getClock(), CollectionsKt.emptyList(), EquityOrderFlowSource.MAINTENANCE_CALL, true, true, null, null, null, 917504, null);
        }
        throw new IllegalArgumentException("Account not found");
    }

    private final EquityOrderSide toEquityOrderSide(OrderSideDto orderSideDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[orderSideDto.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Order side unspecified");
        }
        if (i == 2) {
            return EquityOrderSide.BUY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return EquityOrderSide.SELL;
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo;", "Lcom/robinhood/android/margin/contracts/MarginCallMarketOrderFragmentKey;", "<init>", "()V", "", "ORDER_POLLING_TIMEOUT_MS", "J", "j$/time/Duration", "SINGLE_ORDER_POLL_INTERVAL", "Lj$/time/Duration;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginCallMarketOrderDuxo, MarginCallMarketOrderFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginCallMarketOrderFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (MarginCallMarketOrderFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginCallMarketOrderFragmentKey getArgs(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo) {
            return (MarginCallMarketOrderFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, marginCallMarketOrderDuxo);
        }
    }
}
