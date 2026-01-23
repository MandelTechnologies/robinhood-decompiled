package com.robinhood.android.equity;

import com.robinhood.android.equity.FeeEstimation2;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiEstimatedFeesRequest;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FeeEstimation.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\\\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0010"}, m3636d2 = {"estimateFees", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiEstimatedFees;", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "contextFlow", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentFlow", "Lcom/robinhood/models/db/Instrument;", "sideFlow", "Lcom/robinhood/models/db/EquityOrderSide;", "quantityFlow", "Ljava/math/BigDecimal;", "estimatedCostFlow", "lib-equity-validation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equity.FeeEstimationKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FeeEstimation2 {
    public static final Flow<Result<ApiEstimatedFees>> estimateFees(OrderStore orderStore, Flow<EquityOrderContext> contextFlow, RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(orderStore, "<this>");
        Intrinsics.checkNotNullParameter(contextFlow, "contextFlow");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        final Flow flowFilterNotNull = FlowKt.filterNotNull(contextFlow);
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Instrument>() { // from class: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$1$2 */
            public static final class C150882<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$1$2", m3645f = "FeeEstimation.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C150882.this.emit(null, this);
                    }
                }

                public C150882(FlowCollector flowCollector) {
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
                        Instrument instrument = ((EquityOrderContext) obj).getInstrument();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(instrument, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Instrument> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C150882(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        final Flow flowFilterNotNull2 = FlowKt.filterNotNull(contextFlow);
        Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new Flow<EquityOrderSide>() { // from class: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$2$2 */
            public static final class C150892<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$2$2", m3645f = "FeeEstimation.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C150892.this.emit(null, this);
                    }
                }

                public C150892(FlowCollector flowCollector) {
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
                        EquityOrderSide side = ((EquityOrderContext) obj).getSide();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(side, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super EquityOrderSide> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull2.collect(new C150892(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        final Flow flowFilterNotNull3 = FlowKt.filterNotNull(contextFlow);
        Flow flowDistinctUntilChanged3 = FlowKt.distinctUntilChanged(new Flow<BigDecimal>() { // from class: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$3

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$3$2 */
            public static final class C150902<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$3$2", m3645f = "FeeEstimation.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$3$2$1, reason: invalid class name */
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
                        return C150902.this.emit(null, this);
                    }
                }

                public C150902(FlowCollector flowCollector) {
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
                        BigDecimal quantity = ((EquityOrderContext) obj).getQuantity();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(quantity, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super BigDecimal> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull3.collect(new C150902(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        final Flow flowFilterNotNull4 = FlowKt.filterNotNull(contextFlow);
        return estimateFees(orderStore, flowDistinctUntilChanged, flowDistinctUntilChanged2, flowDistinctUntilChanged3, FlowKt.distinctUntilChanged(new Flow<BigDecimal>() { // from class: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$4

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$4$2 */
            public static final class C150912<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$4$2", m3645f = "FeeEstimation.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$$inlined$map$4$2$1, reason: invalid class name */
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
                        return C150912.this.emit(null, this);
                    }
                }

                public C150912(FlowCollector flowCollector) {
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
                        BigDecimal estimatedCost = ((EquityOrderContext) obj).getEstimatedCost();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(estimatedCost, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super BigDecimal> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull4.collect(new C150912(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), regionGateProvider);
    }

    private static final Flow<Result<ApiEstimatedFees>> estimateFees(OrderStore orderStore, Flow<Instrument> flow, Flow<? extends EquityOrderSide> flow2, Flow<? extends BigDecimal> flow3, Flow<? extends BigDecimal> flow4, RegionGateProvider regionGateProvider) {
        return FlowKt.channelFlow(new C150921(flow, flow2, flow3, flow4, new Ref.ObjectRef(), regionGateProvider, new Ref.ObjectRef(), orderStore, null));
    }

    /* compiled from: FeeEstimation.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiEstimatedFees;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$1", m3645f = "FeeEstimation.kt", m3646l = {70, 86, 125}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$1 */
    static final class C150921 extends ContinuationImpl7 implements Function2<Produce4<? super Result<? extends ApiEstimatedFees>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<BigDecimal> $estimatedCostFlow;
        final /* synthetic */ Flow<Instrument> $instrumentFlow;
        final /* synthetic */ Ref.ObjectRef<Job> $lastFeeRequest;
        final /* synthetic */ Ref.ObjectRef<Job> $lastStaleJob;
        final /* synthetic */ Flow<BigDecimal> $quantityFlow;
        final /* synthetic */ RegionGateProvider $regionGateProvider;
        final /* synthetic */ Flow<EquityOrderSide> $sideFlow;
        final /* synthetic */ OrderStore $this_estimateFees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C150921(Flow<Instrument> flow, Flow<? extends EquityOrderSide> flow2, Flow<? extends BigDecimal> flow3, Flow<? extends BigDecimal> flow4, Ref.ObjectRef<Job> objectRef, RegionGateProvider regionGateProvider, Ref.ObjectRef<Job> objectRef2, OrderStore orderStore, Continuation<? super C150921> continuation) {
            super(2, continuation);
            this.$instrumentFlow = flow;
            this.$sideFlow = flow2;
            this.$quantityFlow = flow3;
            this.$estimatedCostFlow = flow4;
            this.$lastFeeRequest = objectRef;
            this.$regionGateProvider = regionGateProvider;
            this.$lastStaleJob = objectRef2;
            this.$this_estimateFees = orderStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C150921 c150921 = new C150921(this.$instrumentFlow, this.$sideFlow, this.$quantityFlow, this.$estimatedCostFlow, this.$lastFeeRequest, this.$regionGateProvider, this.$lastStaleJob, this.$this_estimateFees, continuation);
            c150921.L$0 = obj;
            return c150921;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Produce4<? super Result<? extends ApiEstimatedFees>> produce4, Continuation<? super Unit> continuation) {
            return invoke2((Produce4<? super Result<ApiEstimatedFees>>) produce4, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Produce4<? super Result<ApiEstimatedFees>> produce4, Continuation<? super Unit> continuation) {
            return ((C150921) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        
            if (kotlinx.coroutines.channels.Produce.awaitClose(r1, r4, r13) != r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Produce4 produce42;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                this.L$0 = produce4;
                this.label = 1;
                if (produce4.send(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                produce4 = (Produce4) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                produce42 = (Produce4) this.L$0;
                ResultKt.throwOnFailure(obj);
                final Ref.ObjectRef<Job> objectRef = this.$lastStaleJob;
                final Ref.ObjectRef<Job> objectRef2 = this.$lastFeeRequest;
                Function0 function0 = new Function0() { // from class: com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FeeEstimation2.C150921.invokeSuspend$lambda$0(objectRef, objectRef2);
                    }
                };
                this.L$0 = null;
                this.label = 3;
            }
            Produce4 produce43 = produce4;
            Flow flowCombine = FlowKt.combine(this.$instrumentFlow, this.$sideFlow, this.$quantityFlow, this.$estimatedCostFlow, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$lastFeeRequest, this.$regionGateProvider, this.$lastStaleJob, produce43, this.$this_estimateFees, null);
            this.L$0 = produce43;
            this.label = 2;
            if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) != coroutine_suspended) {
                produce42 = produce43;
                final Ref.ObjectRef objectRef3 = this.$lastStaleJob;
                final Ref.ObjectRef objectRef22 = this.$lastFeeRequest;
                Function0 function02 = new Function0() { // from class: com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FeeEstimation2.C150921.invokeSuspend$lambda$0(objectRef3, objectRef22);
                    }
                };
                this.L$0 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }

        /* compiled from: FeeEstimation.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiEstimatedFeesRequest;", "instrument", "Lcom/robinhood/models/db/Instrument;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "shareQuantity", "Ljava/math/BigDecimal;", "estimatedCost"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$1", m3645f = "FeeEstimation.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function5<Instrument, EquityOrderSide, BigDecimal, BigDecimal, Continuation<? super ApiEstimatedFeesRequest>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            /* synthetic */ Object L$3;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(5, continuation);
            }

            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Instrument instrument, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation<? super ApiEstimatedFeesRequest> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = instrument;
                anonymousClass1.L$1 = equityOrderSide;
                anonymousClass1.L$2 = bigDecimal;
                anonymousClass1.L$3 = bigDecimal2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Instrument instrument = (Instrument) this.L$0;
                EquityOrderSide equityOrderSide = (EquityOrderSide) this.L$1;
                BigDecimal bigDecimal = (BigDecimal) this.L$2;
                BigDecimal bigDecimal2 = (BigDecimal) this.L$3;
                String string2 = instrument.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return new ApiEstimatedFeesRequest(string2, instrument.isOtc(), BigDecimals7.orZero(bigDecimal), equityOrderSide, bigDecimal2);
            }
        }

        /* compiled from: FeeEstimation.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/models/api/ApiEstimatedFeesRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$2", m3645f = "FeeEstimation.kt", m3646l = {87, 92, 96, 97}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ApiEstimatedFeesRequest, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<Result<ApiEstimatedFees>> $$this$channelFlow;
            final /* synthetic */ Ref.ObjectRef<Job> $lastFeeRequest;
            final /* synthetic */ Ref.ObjectRef<Job> $lastStaleJob;
            final /* synthetic */ RegionGateProvider $regionGateProvider;
            final /* synthetic */ OrderStore $this_estimateFees;
            /* synthetic */ Object L$0;
            int label;

            /* compiled from: FeeEstimation.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EquityOrderSide.values().length];
                    try {
                        iArr[EquityOrderSide.BUY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EquityOrderSide.SELL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Ref.ObjectRef<Job> objectRef, RegionGateProvider regionGateProvider, Ref.ObjectRef<Job> objectRef2, Produce4<? super Result<ApiEstimatedFees>> produce4, OrderStore orderStore, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$lastFeeRequest = objectRef;
                this.$regionGateProvider = regionGateProvider;
                this.$lastStaleJob = objectRef2;
                this.$$this$channelFlow = produce4;
                this.$this_estimateFees = orderStore;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$lastFeeRequest, this.$regionGateProvider, this.$lastStaleJob, this.$$this$channelFlow, this.$this_estimateFees, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiEstimatedFeesRequest apiEstimatedFeesRequest, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(apiEstimatedFeesRequest, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
            
                if (r0 == r6) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
            
                if (r0.send(r1, r20) != r6) goto L49;
             */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
            /* JADX WARN: Type inference failed for: r15v1, types: [T, kotlinx.coroutines.Job] */
            /* JADX WARN: Type inference failed for: r1v2, types: [T, kotlinx.coroutines.Job] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ApiEstimatedFeesRequest apiEstimatedFeesRequest;
                ApiEstimatedFeesRequest apiEstimatedFeesRequest2;
                Object regionGateState$default;
                Job job;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                boolean z = false;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    apiEstimatedFeesRequest = (ApiEstimatedFeesRequest) this.L$0;
                    Job job2 = this.$lastFeeRequest.element;
                    if (job2 != null) {
                        this.L$0 = apiEstimatedFeesRequest;
                        this.label = 1;
                        if (JobKt.cancelAndJoin(job2, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    apiEstimatedFeesRequest = (ApiEstimatedFeesRequest) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ApiEstimatedFeesRequest apiEstimatedFeesRequest3 = (ApiEstimatedFeesRequest) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    apiEstimatedFeesRequest2 = apiEstimatedFeesRequest3;
                    regionGateState$default = obj;
                    if (!((Boolean) regionGateState$default).booleanValue()) {
                        z = true;
                    }
                    ApiEstimatedFeesRequest apiEstimatedFeesRequest4 = apiEstimatedFeesRequest2;
                    if (!z) {
                        Produce4<Result<ApiEstimatedFees>> produce4 = this.$$this$channelFlow;
                        ?? Launch$default = BuildersKt__Builders_commonKt.launch$default(produce4, null, null, new FeeEstimation3(produce4, null), 3, null);
                        this.$lastStaleJob.element = Launch$default;
                        Ref.ObjectRef<Job> objectRef = this.$lastFeeRequest;
                        Produce4<Result<ApiEstimatedFees>> produce42 = this.$$this$channelFlow;
                        objectRef.element = BuildersKt__Builders_commonKt.launch$default(produce42, null, null, new AnonymousClass1(this.$this_estimateFees, apiEstimatedFeesRequest4, produce42, Launch$default, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    job = this.$lastStaleJob.element;
                    if (job != null) {
                        this.L$0 = null;
                        this.label = 3;
                        if (JobKt.cancelAndJoin(job, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    Produce4<Result<ApiEstimatedFees>> produce43 = this.$$this$channelFlow;
                    Result.Companion companion = Result.INSTANCE;
                    BigDecimal ZERO = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    Result<ApiEstimatedFees> resultM28549boximpl = Result.m28549boximpl(Result.m28550constructorimpl(new ApiEstimatedFees(ZERO, CollectionsKt.emptyList(), CollectionsKt.emptyList())));
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    Produce4<Result<ApiEstimatedFees>> produce432 = this.$$this$channelFlow;
                    Result.Companion companion2 = Result.INSTANCE;
                    BigDecimal ZERO2 = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                    Result<ApiEstimatedFees> resultM28549boximpl2 = Result.m28549boximpl(Result.m28550constructorimpl(new ApiEstimatedFees(ZERO2, CollectionsKt.emptyList(), CollectionsKt.emptyList())));
                    this.L$0 = null;
                    this.label = 4;
                }
                apiEstimatedFeesRequest2 = apiEstimatedFeesRequest;
                if (!BigDecimals7.isZero(apiEstimatedFeesRequest2.getQuantity()) && !BigDecimals7.isZero(apiEstimatedFeesRequest2.getPrice())) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[apiEstimatedFeesRequest2.getSide().ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = true;
                        } else {
                            RegionGateProvider regionGateProvider = this.$regionGateProvider;
                            FeeEstimation feeEstimation = FeeEstimation.INSTANCE;
                            this.L$0 = apiEstimatedFeesRequest2;
                            this.label = 2;
                            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, feeEstimation, false, this, 2, null);
                        }
                    }
                    ApiEstimatedFeesRequest apiEstimatedFeesRequest42 = apiEstimatedFeesRequest2;
                    if (!z) {
                    }
                    job = this.$lastStaleJob.element;
                    if (job != null) {
                    }
                    Produce4<Result<ApiEstimatedFees>> produce4322 = this.$$this$channelFlow;
                    Result.Companion companion22 = Result.INSTANCE;
                    BigDecimal ZERO22 = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO22, "ZERO");
                    Result<ApiEstimatedFees> resultM28549boximpl22 = Result.m28549boximpl(Result.m28550constructorimpl(new ApiEstimatedFees(ZERO22, CollectionsKt.emptyList(), CollectionsKt.emptyList())));
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    job = this.$lastStaleJob.element;
                    if (job != null) {
                    }
                    Produce4<Result<ApiEstimatedFees>> produce43222 = this.$$this$channelFlow;
                    Result.Companion companion222 = Result.INSTANCE;
                    BigDecimal ZERO222 = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO222, "ZERO");
                    Result<ApiEstimatedFees> resultM28549boximpl222 = Result.m28549boximpl(Result.m28550constructorimpl(new ApiEstimatedFees(ZERO222, CollectionsKt.emptyList(), CollectionsKt.emptyList())));
                    this.L$0 = null;
                    this.label = 4;
                }
                return coroutine_suspended;
            }

            /* compiled from: FeeEstimation.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$2$1", m3645f = "FeeEstimation.kt", m3646l = {117, 119}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Produce4<Result<ApiEstimatedFees>> $$this$channelFlow;
                final /* synthetic */ ApiEstimatedFeesRequest $request;
                final /* synthetic */ Job $staleJob;
                final /* synthetic */ OrderStore $this_estimateFees;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(OrderStore orderStore, ApiEstimatedFeesRequest apiEstimatedFeesRequest, Produce4<? super Result<ApiEstimatedFees>> produce4, Job job, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$this_estimateFees = orderStore;
                    this.$request = apiEstimatedFeesRequest;
                    this.$$this$channelFlow = produce4;
                    this.$staleJob = job;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_estimateFees, this.$request, this.$$this$channelFlow, this.$staleJob, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
                
                    if (r1.send(r7, r6) == r0) goto L17;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    CoroutineScope coroutineScope;
                    Object objM22705estimateFeesgIAlus;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) this.L$0;
                        OrderStore orderStore = this.$this_estimateFees;
                        ApiEstimatedFeesRequest apiEstimatedFeesRequest = this.$request;
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        objM22705estimateFeesgIAlus = orderStore.m22705estimateFeesgIAlus(apiEstimatedFeesRequest, this);
                        if (objM22705estimateFeesgIAlus != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Job.DefaultImpls.cancel$default(this.$staleJob, null, 1, null);
                        return Unit.INSTANCE;
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objM22705estimateFeesgIAlus = ((Result) obj).getValue();
                    if (CoroutineScope2.isActive(coroutineScope)) {
                        Produce4<Result<ApiEstimatedFees>> produce4 = this.$$this$channelFlow;
                        Result<ApiEstimatedFees> resultM28549boximpl = Result.m28549boximpl(objM22705estimateFeesgIAlus);
                        this.L$0 = null;
                        this.label = 2;
                    }
                    Job.DefaultImpls.cancel$default(this.$staleJob, null, 1, null);
                    return Unit.INSTANCE;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            Job job = (Job) objectRef.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            Job job2 = (Job) objectRef2.element;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }
}
