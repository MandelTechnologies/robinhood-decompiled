package com.robinhood.android.futures.trade.order;

import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.ceres.p284v1.CreateFuturesOrderRequestDto;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.store.futures.PostTradeLadderFtuxState;
import com.robinhood.store.futures.p404di.FuturesFtuxPref;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import rosetta.mainst.TimeInForceDto;

/* compiled from: FuturesOrderManager.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/store/futures/FuturesOrderStore;Lcom/robinhood/store/futures/FuturesPositionStore;Lcom/robinhood/prefs/EnumPreference;)V", "getUuid", "Ljava/util/UUID;", "request", "getId", WebsocketGatewayConstants.DATA_KEY, "getSubmissionObservable", "Lio/reactivex/Single;", "getPollingObservable", "Lio/reactivex/Observable;", "isFinal", "", Card.Icon.ORDER, "fetchOrder", "orderId", "onUpdate", "", "passthrough", "", "getShouldTriggerConfirmationInstantly", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class FuturesOrderManager extends OrderSubmissionManager<UiFuturesOrder, UiFuturesOrderContext> {
    public static final int $stable = 8;
    private final FuturesOrderStore futuresOrderStore;
    private final FuturesPositionStore futuresPositionStore;
    private final EnumPreference<PostTradeLadderFtuxState> postTradeLadderFtuxStatePref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderManager(@RootCoroutineScope CoroutineScope coroutineScope, FuturesOrderStore futuresOrderStore, FuturesPositionStore futuresPositionStore, @FuturesFtuxPref EnumPreference<PostTradeLadderFtuxState> postTradeLadderFtuxStatePref) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
        Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
        this.futuresOrderStore = futuresOrderStore;
        this.futuresPositionStore = futuresPositionStore;
        this.postTradeLadderFtuxStatePref = postTradeLadderFtuxStatePref;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C174671(null), 3, null);
    }

    /* compiled from: FuturesOrderManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.order.FuturesOrderManager$1", m3645f = "FuturesOrderManager.kt", m3646l = {39, 44}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.order.FuturesOrderManager$1 */
    static final class C174671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C174671(Continuation<? super C174671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOrderManager.this.new C174671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C174671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r3, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EnumPreference enumPreference = FuturesOrderManager.this.postTradeLadderFtuxStatePref;
                this.label = 1;
                obj = enumPreference.coGet(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (obj == PostTradeLadderFtuxState.NOT_SEEN) {
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OrderSubmissionManager.orderStateChanges$default(FuturesOrderManager.this, null, 1, null)), Integer.MAX_VALUE, null, 2, null);
                Flow flowTake = FlowKt.take(new Flow<OrderSubmissionManager.Result<? extends UiFuturesOrder, ? extends UiFuturesOrderContext>>() { // from class: com.robinhood.android.futures.trade.order.FuturesOrderManager$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.futures.trade.order.FuturesOrderManager$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C174662<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.order.FuturesOrderManager$1$invokeSuspend$$inlined$filter$1$2", m3645f = "FuturesOrderManager.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.futures.trade.order.FuturesOrderManager$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                return C174662.this.emit(null, this);
                            }
                        }

                        public C174662(FlowCollector flowCollector) {
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
                                if (((OrderSubmissionManager.Result) obj) instanceof OrderSubmissionManager.Result.Submitted) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OrderSubmissionManager.Result<? extends UiFuturesOrder, ? extends UiFuturesOrderContext>> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C174662(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(FuturesOrderManager.this, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: FuturesOrderManager.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.order.FuturesOrderManager$1$2", m3645f = "FuturesOrderManager.kt", m3646l = {45}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.order.FuturesOrderManager$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OrderSubmissionManager.Result<? extends UiFuturesOrder, ? extends UiFuturesOrderContext>, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FuturesOrderManager futuresOrderManager, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(OrderSubmissionManager.Result<? extends UiFuturesOrder, ? extends UiFuturesOrderContext> result, Continuation<? super Unit> continuation) {
                return invoke2((OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext>) result, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EnumPreference enumPreference = this.this$0.postTradeLadderFtuxStatePref;
                    PostTradeLadderFtuxState postTradeLadderFtuxState = PostTradeLadderFtuxState.SHOW_FLATTEN_ORDERS_TOOLTIP;
                    this.label = 1;
                    if (enumPreference.coSet(postTradeLadderFtuxState, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(UiFuturesOrderContext request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getOrderRequest().getRefId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(UiFuturesOrder data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getOrder().getOrderId();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<UiFuturesOrder> getSubmissionObservable(UiFuturesOrderContext request) {
        CreateFuturesOrderRequestDto idlRequestDto;
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.getOrderRequest().getOrderType() == FuturesOrderType.MARKET && request.getOrderRequest().getOrderTrigger() == FuturesOrderTrigger.IMMEDIATE) {
            CreateFuturesOrderRequestDto idlRequestDto2 = request.getIdlRequestDto();
            idlRequestDto = idlRequestDto2.copy((65471 & 1) != 0 ? idlRequestDto2.surrogate.getAccount_id() : null, (65471 & 2) != 0 ? idlRequestDto2.surrogate.getLegs() : null, (65471 & 4) != 0 ? idlRequestDto2.surrogate.getQuantity() : null, (65471 & 8) != 0 ? idlRequestDto2.surrogate.getMax_show() : null, (65471 & 16) != 0 ? idlRequestDto2.surrogate.getOrder_type() : null, (65471 & 32) != 0 ? idlRequestDto2.surrogate.getOrder_trigger() : null, (65471 & 64) != 0 ? idlRequestDto2.surrogate.getTime_in_force() : TimeInForceDto.GFD, (65471 & 128) != 0 ? idlRequestDto2.surrogate.getLimit_price() : null, (65471 & 256) != 0 ? idlRequestDto2.surrogate.getStop_price() : null, (65471 & 512) != 0 ? idlRequestDto2.surrogate.getRef_id() : null, (65471 & 1024) != 0 ? idlRequestDto2.surrogate.getClient_marketdata() : null, (65471 & 2048) != 0 ? idlRequestDto2.surrogate.is_auto_send_enabled() : null, (65471 & 4096) != 0 ? idlRequestDto2.surrogate.getEntered_notional_amount() : null, (65471 & 8192) != 0 ? idlRequestDto2.surrogate.getGtd_expiration_time() : null, (65471 & 16384) != 0 ? idlRequestDto2.surrogate.getQuote_id() : null, (65471 & 32768) != 0 ? idlRequestDto2.surrogate.getOrder_entry_metadata() : null);
        } else {
            idlRequestDto = request.getIdlRequestDto();
        }
        return this.futuresOrderStore.submitOrder(idlRequestDto);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Observable<UiFuturesOrder> getPollingObservable(UiFuturesOrder data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return super.getPollingObservable((FuturesOrderManager) data);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(UiFuturesOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return order.getOrder().getOrderState().toCommonState().isFinal();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<UiFuturesOrder> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.futuresOrderStore.fetchOrder(orderId);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public void onUpdate(UiFuturesOrder data, Object passthrough) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.futuresPositionStore.refresh(true);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(UiFuturesOrderContext request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (request.getOrderRequest().getOrderType().toCommonOrderType() == OrderType.MARKET && request.getOrderRequest().getOrderTrigger().toCommonOrderTrigger() == OrderTrigger.IMMEDIATE) ? false : true;
    }
}
