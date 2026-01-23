package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.equitytrade.OrderSubmitResult;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState2;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState5;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import microgram.contracts.margin.margin_call.proto.p496v1.TradeDto;

/* compiled from: MarginCallMarketOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginCallMarketOrderDuxo6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarginCallMarketOrderDataState2.Loaded $loadedState;
    int label;
    final /* synthetic */ MarginCallMarketOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginCallMarketOrderDuxo6(MarginCallMarketOrderDataState2.Loaded loaded, MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, Continuation<? super MarginCallMarketOrderDuxo6> continuation) {
        super(2, continuation);
        this.$loadedState = loaded;
        this.this$0 = marginCallMarketOrderDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginCallMarketOrderDuxo6(this.$loadedState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginCallMarketOrderDuxo6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<TradeDto> trades = this.$loadedState.getData().getTrades();
            this.this$0.trackSubmittedOrderStatus(trades.size());
            this.this$0.applyMutation(new C167841(null));
            final Flow flowAsFlow = FlowKt.asFlow(trades);
            final MarginCallMarketOrderDuxo marginCallMarketOrderDuxo = this.this$0;
            Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.onEach(new Flow<Tuples2<? extends TradeDto, ? extends OrderSubmitResult>>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends TradeDto, ? extends OrderSubmitResult>> flowCollector, Continuation continuation) {
                    Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector, marginCallMarketOrderDuxo), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ MarginCallMarketOrderDuxo this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {51, 50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, MarginCallMarketOrderDuxo marginCallMarketOrderDuxo) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = marginCallMarketOrderDuxo;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
                    
                        if (r2.emit(r6, r0) == r1) goto L21;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        TradeDto tradeDto;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object objSubmitSingleOrder = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(objSubmitSingleOrder);
                            flowCollector = this.$this_unsafeFlow;
                            tradeDto = (TradeDto) obj;
                            MarginCallMarketOrderDuxo marginCallMarketOrderDuxo = this.this$0;
                            anonymousClass1.L$0 = flowCollector;
                            anonymousClass1.L$1 = tradeDto;
                            anonymousClass1.label = 1;
                            objSubmitSingleOrder = marginCallMarketOrderDuxo.submitSingleOrder(tradeDto, anonymousClass1);
                            if (objSubmitSingleOrder != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(objSubmitSingleOrder);
                            return Unit.INSTANCE;
                        }
                        tradeDto = (TradeDto) anonymousClass1.L$1;
                        flowCollector = (FlowCollector) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(objSubmitSingleOrder);
                        Tuples2 tuples2M3642to = Tuples4.m3642to(tradeDto, objSubmitSingleOrder);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                    }
                }
            }, new C167853(this.this$0, null)), new C167864(this.this$0, null));
            this.label = 1;
            if (FlowKt.collect(flowOnCompletion, this) == coroutine_suspended) {
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
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$1 */
    static final class C167841 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C167841(Continuation<? super C167841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167841 c167841 = new C167841(continuation);
            c167841.L$0 = obj;
            return c167841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
            return ((C167841) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MarginCallMarketOrderDataState.copy$default((MarginCallMarketOrderDataState) this.L$0, null, null, new MarginCallMarketOrderDataState5.Submitting(MapsKt.emptyMap()), null, null, 27, null);
        }
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lkotlin/Pair;", "Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$3", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$3 */
    static final class C167853 extends ContinuationImpl7 implements Function2<Tuples2<? extends TradeDto, ? extends OrderSubmitResult>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MarginCallMarketOrderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167853(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, Continuation<? super C167853> continuation) {
            super(2, continuation);
            this.this$0 = marginCallMarketOrderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167853 c167853 = new C167853(this.this$0, continuation);
            c167853.L$0 = obj;
            return c167853;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends TradeDto, ? extends OrderSubmitResult> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<TradeDto, ? extends OrderSubmitResult>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<TradeDto, ? extends OrderSubmitResult> tuples2, Continuation<? super Unit> continuation) {
            return ((C167853) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            this.this$0.updateTradeSubmissionResult(((TradeDto) tuples2.getFirst()).getRef_id(), (OrderSubmitResult) tuples2.getSecond());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$4", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$submitMarketOrders$1$1$4 */
    static final class C167864 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends TradeDto, ? extends OrderSubmitResult>>, Throwable, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MarginCallMarketOrderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167864(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, Continuation<? super C167864> continuation) {
            super(3, continuation);
            this.this$0 = marginCallMarketOrderDuxo;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends TradeDto, ? extends OrderSubmitResult>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Tuples2<TradeDto, ? extends OrderSubmitResult>>) flowCollector, th, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Tuples2<TradeDto, ? extends OrderSubmitResult>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new C167864(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.completeOrderSubmission();
            return Unit.INSTANCE;
        }
    }
}
