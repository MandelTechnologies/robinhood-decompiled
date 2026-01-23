package com.robinhood.android.equities.store.swipetotrade;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1", m3645f = "EquitySwipeNuxStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super StringResource>, Boolean, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EquitySwipeNuxStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1(Continuation continuation, EquitySwipeNuxStore equitySwipeNuxStore) {
        super(3, continuation);
        this.this$0 = equitySwipeNuxStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super StringResource> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        EquitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1 equitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1 = new EquitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1(continuation, this.this$0);
        equitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1.L$0 = flowCollector;
        equitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1.L$1 = bool;
        return equitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<StringResource> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                final Flow flowShowTooltip = this.this$0.showTooltip();
                final EquitySwipeNuxStore equitySwipeNuxStore = this.this$0;
                flowFlowOf = new Flow<StringResource>() { // from class: com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$tooltip$lambda$6$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$tooltip$lambda$6$$inlined$map$1$2 */
                    public static final class C148032<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ EquitySwipeNuxStore this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$tooltip$lambda$6$$inlined$map$1$2", m3645f = "EquitySwipeNuxStore.kt", m3646l = {52, 50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$tooltip$lambda$6$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C148032.this.emit(null, this);
                            }
                        }

                        public C148032(FlowCollector flowCollector, EquitySwipeNuxStore equitySwipeNuxStore) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = equitySwipeNuxStore;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
                        
                            if (r12.emit(r11, r4) != r0) goto L32;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                        /* JADX WARN: Type inference failed for: r12v13, types: [com.robinhood.utils.resource.StringResource] */
                        /* JADX WARN: Type inference failed for: r12v9, types: [com.robinhood.utils.resource.StringResource] */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            FlowCollector flowCollector;
                            T t;
                            FlowCollector flowCollector2;
                            T tInvoke;
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
                                flowCollector = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    RegionGateProvider regionGateProvider = this.this$0.regionGateProvider;
                                    EtfRegionGate etfRegionGate = EtfRegionGate.INSTANCE;
                                    anonymousClass12.L$0 = flowCollector;
                                    anonymousClass12.label = 1;
                                    Object regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, etfRegionGate, false, anonymousClass12, 2, null);
                                    if (regionGateState$default != coroutine_suspended) {
                                        obj2 = regionGateState$default;
                                        flowCollector2 = flowCollector;
                                    }
                                    return coroutine_suspended;
                                }
                                t = null;
                                anonymousClass12.L$0 = null;
                                anonymousClass12.label = 2;
                            } else {
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                flowCollector2 = (FlowCollector) anonymousClass12.L$0;
                                ResultKt.throwOnFailure(obj2);
                            }
                            if (((Boolean) obj2).booleanValue()) {
                                tInvoke = StringResource.INSTANCE.invoke(C14805R.string.gated_etf_equity_swipe_nux_tooltip, new Object[0]);
                            } else {
                                tInvoke = StringResource.INSTANCE.invoke(C14805R.string.equity_swipe_nux_tooltip, new Object[0]);
                            }
                            T t2 = tInvoke;
                            flowCollector = flowCollector2;
                            t = t2;
                            anonymousClass12.L$0 = null;
                            anonymousClass12.label = 2;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StringResource> flowCollector2, Continuation continuation) {
                        Object objCollect = flowShowTooltip.collect(new C148032(flowCollector2, equitySwipeNuxStore), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            } else {
                flowFlowOf = FlowKt.flowOf((Object) null);
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
