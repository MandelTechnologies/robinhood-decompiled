package com.robinhood.android.futures.charts.sparkline;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "FuturesSparklineDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C17014x127a8d1b extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[]>, ImmutableSet<? extends Tuples2<? extends UUID, ? extends ChartType>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ FuturesSparklineDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17014x127a8d1b(Continuation continuation, FuturesSparklineDuxo futuresSparklineDuxo) {
        super(3, continuation);
        this.this$0 = futuresSparklineDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[]> flowCollector, ImmutableSet<? extends Tuples2<? extends UUID, ? extends ChartType>> immutableSet, Continuation<? super Unit> continuation) {
        C17014x127a8d1b c17014x127a8d1b = new C17014x127a8d1b(continuation, this.this$0);
        c17014x127a8d1b.L$0 = flowCollector;
        c17014x127a8d1b.L$1 = immutableSet;
        return c17014x127a8d1b.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cf, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r13, r1, r15) == r7) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0092 -> B:17:0x0093). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Iterator it;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            ImmutableSet immutableSet = (ImmutableSet) this.L$1;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableSet, 10));
            flowCollector = flowCollector2;
            it = immutableSet.iterator();
            arrayList = arrayList2;
            if (it.hasNext()) {
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
        Tuples2 tuples2 = (Tuples2) this.L$4;
        Collection collection = (Collection) this.L$3;
        Iterator it2 = (Iterator) this.L$2;
        ?? r3 = (Collection) this.L$1;
        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        final Tuples2 tuples2M3642to = tuples2;
        it = it2;
        arrayList = r3;
        flowCollector = flowCollector3;
        Object objStreamFuturesChartResult = obj;
        final Flow flow = (Flow) objStreamFuturesChartResult;
        collection.add(FlowKt.onStart(new Flow<Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$lambda$2$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Tuples2 $key$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$lambda$2$$inlined$map$1$2", m3645f = "FuturesSparklineDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, Tuples2 tuples2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$key$inlined = tuples2;
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
                        Object value = ((Result) obj).getValue();
                        Tuples2 tuples2 = this.$key$inlined;
                        if (Result.m28555isFailureimpl(value)) {
                            value = null;
                        }
                        Tuples2 tuples2M3642to = Tuples4.m3642to(tuples2, value);
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>> flowCollector4, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector4, tuples2M3642to), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new FuturesSparklineDuxo2(tuples2M3642to, null)));
        if (it.hasNext()) {
            Tuples2 tuples22 = (Tuples2) it.next();
            UUID uuid = (UUID) tuples22.component1();
            ChartType chartType = (ChartType) tuples22.component2();
            tuples2M3642to = Tuples4.m3642to(uuid, chartType);
            FuturesChartsServiceManager futuresChartsServiceManager = this.this$0.futuresChartsServiceManager;
            DisplaySpan displaySpan = DisplaySpan.DAY;
            this.L$0 = flowCollector;
            this.L$1 = arrayList;
            this.L$2 = it;
            this.L$3 = arrayList;
            this.L$4 = tuples2M3642to;
            this.label = 1;
            objStreamFuturesChartResult = futuresChartsServiceManager.streamFuturesChartResult(uuid, displaySpan, chartType, false, true, this);
            if (objStreamFuturesChartResult != coroutine_suspended) {
                collection = arrayList;
                final Flow flow2 = (Flow) objStreamFuturesChartResult;
                collection.add(FlowKt.onStart(new Flow<Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$lambda$2$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$lambda$2$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ Tuples2 $key$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$lambda$2$$inlined$map$1$2", m3645f = "FuturesSparklineDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, Tuples2 tuples2) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$key$inlined = tuples2;
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
                                Object value = ((Result) obj).getValue();
                                Tuples2 tuples2 = this.$key$inlined;
                                if (Result.m28555isFailureimpl(value)) {
                                    value = null;
                                }
                                Tuples2 tuples2M3642to = Tuples4.m3642to(tuples2, value);
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>> flowCollector4, Continuation continuation) {
                        Object objCollect = flow2.collect(new AnonymousClass2(flowCollector4, tuples2M3642to), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new FuturesSparklineDuxo2(tuples2M3642to, null)));
                if (it.hasNext()) {
                    final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
                    Flow<Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[]> flow3 = new Flow<Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[]>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$$inlined$combine$1

                        /* compiled from: Zip.kt */
                        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
                        @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$$inlined$combine$1$3", m3645f = "FuturesSparklineDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$$inlined$combine$1$3, reason: invalid class name */
                        public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[]>, Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[], Continuation<? super Unit>, Object> {
                            private /* synthetic */ Object L$0;
                            /* synthetic */ Object L$1;
                            int label;

                            public AnonymousClass3(Continuation continuation) {
                                super(3, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[]> flowCollector, Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[] tuples2Arr, Continuation<? super Unit> continuation) {
                                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                                anonymousClass3.L$0 = flowCollector;
                                anonymousClass3.L$1 = tuples2Arr;
                                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                                    Tuples2[] tuples2Arr = (Tuples2[]) ((Object[]) this.L$1);
                                    this.label = 1;
                                    if (flowCollector.emit(tuples2Arr, this) == coroutine_suspended) {
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

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[]> flowCollector4, Continuation continuation) {
                            final Flow[] flowArr2 = flowArr;
                            Object objCombineInternal = Combine.combineInternal(flowCollector4, flowArr2, new Function0<Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[]>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$lambda$4$$inlined$combine$1.2
                                @Override // kotlin.jvm.functions.Function0
                                public final Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[] invoke() {
                                    return new Tuples2[flowArr2.length];
                                }
                            }, new AnonymousClass3(null), continuation);
                            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                }
            }
        }
        return coroutine_suspended;
    }
}
