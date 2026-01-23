package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import java.util.Map;
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
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamDirection$$inlined$flatMapLatest$1", m3645f = "PerformanceChartStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PerformanceChartStore$streamDirection$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super Direction>, Map<String, ? extends PerformanceChartStore.PerformanceChartRequest>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PerformanceChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceChartStore$streamDirection$$inlined$flatMapLatest$1(Continuation continuation, String str, PerformanceChartStore performanceChartStore) {
        super(3, continuation);
        this.$key$inlined = str;
        this.this$0 = performanceChartStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Direction> flowCollector, Map<String, ? extends PerformanceChartStore.PerformanceChartRequest> map, Continuation<? super Unit> continuation) {
        PerformanceChartStore$streamDirection$$inlined$flatMapLatest$1 performanceChartStore$streamDirection$$inlined$flatMapLatest$1 = new PerformanceChartStore$streamDirection$$inlined$flatMapLatest$1(continuation, this.$key$inlined, this.this$0);
        performanceChartStore$streamDirection$$inlined$flatMapLatest$1.L$0 = flowCollector;
        performanceChartStore$streamDirection$$inlined$flatMapLatest$1.L$1 = map;
        return performanceChartStore$streamDirection$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<Direction> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            PerformanceChartStore.PerformanceChartRequest performanceChartRequest = (PerformanceChartStore.PerformanceChartRequest) ((Map) this.L$1).get(this.$key$inlined);
            if (performanceChartRequest == null) {
                Map map = this.this$0.directionMap;
                Object objMutableStateFlow = map.get(this.$key$inlined);
                if (objMutableStateFlow == null) {
                    objMutableStateFlow = StateFlow4.MutableStateFlow(null);
                    map.put(this.$key$inlined, objMutableStateFlow);
                }
                flow = (Flow) objMutableStateFlow;
            } else {
                final Flow flowAsFlow = this.this$0.internalChartQuery.asFlow(performanceChartRequest);
                flow = new Flow<Direction>() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamDirection$lambda$9$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Direction> flowCollector2, Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new C346742(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamDirection$lambda$9$$inlined$map$1$2 */
                    public static final class C346742<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamDirection$lambda$9$$inlined$map$1$2", m3645f = "PerformanceChartStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamDirection$lambda$9$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C346742.this.emit(null, this);
                            }
                        }

                        public C346742(FlowCollector flowCollector) {
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
                                Direction pageDirection = ((PerformanceChartModel) obj).getPageDirection();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(pageDirection, anonymousClass1) == coroutine_suspended) {
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
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
