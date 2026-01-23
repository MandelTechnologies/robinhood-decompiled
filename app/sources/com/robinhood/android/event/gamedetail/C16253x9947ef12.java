package com.robinhood.android.event.gamedetail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.BottomSheetSelection;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.utils.Optional;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C16253x9947ef12 extends ContinuationImpl7 implements Function3<FlowCollector<? super BigDecimal>, BottomSheetSelection.ContractOption, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $optionalSwapAccountFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GameDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16253x9947ef12(Continuation continuation, Flow flow, GameDetailDuxo gameDetailDuxo) {
        super(3, continuation);
        this.$optionalSwapAccountFlow$inlined = flow;
        this.this$0 = gameDetailDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super BigDecimal> flowCollector, BottomSheetSelection.ContractOption contractOption, Continuation<? super Unit> continuation) {
        C16253x9947ef12 c16253x9947ef12 = new C16253x9947ef12(continuation, this.$optionalSwapAccountFlow$inlined, this.this$0);
        c16253x9947ef12.L$0 = flowCollector;
        c16253x9947ef12.L$1 = contractOption;
        return c16253x9947ef12.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final BottomSheetSelection.ContractOption contractOption = (BottomSheetSelection.ContractOption) this.L$1;
            final Flow flow = this.$optionalSwapAccountFlow$inlined;
            final Flow<UUID> flow2 = new Flow<UUID>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$lambda$3$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super UUID> flowCollector2, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$lambda$3$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$lambda$3$$inlined$map$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesAccount futuresAccount = (FuturesAccount) ((Optional) obj).component1();
                            UUID id = futuresAccount != null ? futuresAccount.getId() : null;
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
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
            final GameDetailDuxo gameDetailDuxo = this.this$0;
            Flow<BigDecimal> flow3 = new Flow<BigDecimal>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$lambda$3$$inlined$map$2
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super BigDecimal> flowCollector2, Continuation continuation) {
                    Object objCollect = flow2.collect(new AnonymousClass2(flowCollector2, gameDetailDuxo, contractOption), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$lambda$3$$inlined$map$2$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ BottomSheetSelection.ContractOption $selected$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ GameDetailDuxo this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$lambda$3$$inlined$map$2$2", m3645f = "GameDetailDuxo.kt", m3646l = {51, 50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$lambda$3$$inlined$map$2$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, GameDetailDuxo gameDetailDuxo, BottomSheetSelection.ContractOption contractOption) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = gameDetailDuxo;
                        this.$selected$inlined = contractOption;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
                    
                        if (r11.emit(r12, r6) == r0) goto L23;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        AnonymousClass1 anonymousClass12 = anonymousClass1;
                        Object obj2 = anonymousClass12.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass12.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector2 = this.$this_unsafeFlow;
                            EventOrderStore eventOrderStore = this.this$0.eventOrderStore;
                            UUID contractId = this.$selected$inlined.getData().getSelectedContract().getContractId();
                            EventOrderSide eventOrderSide = EventOrderSide.BUY;
                            BigDecimal ONE = BigDecimal.ONE;
                            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                            anonymousClass12.L$0 = flowCollector2;
                            anonymousClass12.label = 1;
                            Object estimatedFeePerContractAmount = eventOrderStore.getEstimatedFeePerContractAmount((UUID) obj, contractId, eventOrderSide, ONE, anonymousClass12);
                            if (estimatedFeePerContractAmount != coroutine_suspended) {
                                obj2 = estimatedFeePerContractAmount;
                                flowCollector = flowCollector2;
                            }
                            return coroutine_suspended;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        FlowCollector flowCollector3 = (FlowCollector) anonymousClass12.L$0;
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = flowCollector3;
                        anonymousClass12.L$0 = null;
                        anonymousClass12.label = 2;
                    }
                }
            };
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow3, this) == coroutine_suspended) {
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
