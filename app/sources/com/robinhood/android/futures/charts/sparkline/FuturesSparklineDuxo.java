package com.robinhood.android.futures.charts.sparkline;

import android.os.Parcelable;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.store.futures.ChartType;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FuturesSparklineDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;)V", "onCreate", "", "bind", "contractId", "Ljava/util/UUID;", "oldContractId", "chartType", "Lcom/robinhood/store/futures/ChartType;", "oldChartType", "unbind", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesSparklineDuxo extends BaseDuxo4<FuturesSparklineViewState> {
    public static final int $stable = BaseDuxo4.$stable;
    private final FuturesChartsServiceManager futuresChartsServiceManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FuturesSparklineDuxo(DuxoBundle duxoBundle, FuturesChartsServiceManager futuresChartsServiceManager) {
        super(new FuturesSparklineViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        this.futuresChartsServiceManager = futuresChartsServiceManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C170191(null));
    }

    /* compiled from: FuturesSparklineDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1", m3645f = "FuturesSparklineDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1 */
    static final class C170191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C170191(Continuation<? super C170191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesSparklineDuxo.this.new C170191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C170191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<FuturesSparklineViewState> stateFlow = FuturesSparklineDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<ImmutableSet<? extends Tuples2<? extends UUID, ? extends ChartType>>>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C170152<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "FuturesSparklineDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C170152.this.emit(null, this);
                            }
                        }

                        public C170152(FlowCollector flowCollector) {
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
                                ImmutableSet<Tuples2<UUID, ChartType>> boundContracts = ((FuturesSparklineViewState) obj).getBoundContracts();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boundContracts, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super ImmutableSet<? extends Tuples2<? extends UUID, ? extends ChartType>>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C170152(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), new C17014x127a8d1b(null, FuturesSparklineDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(FuturesSparklineDuxo.this, null);
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

        /* compiled from: FuturesSparklineDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u001e\u0012\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "responses", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/ChartType;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$3", m3645f = "FuturesSparklineDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[], Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesSparklineDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(FuturesSparklineDuxo futuresSparklineDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = futuresSparklineDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>[] tuples2Arr, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Tuples2<UUID, ChartType>, FuturesChartResult>[]) tuples2Arr, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Tuples2<UUID, ChartType>, FuturesChartResult>[] tuples2Arr, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(tuples2Arr, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesSparklineDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$3$1", m3645f = "FuturesSparklineDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesSparklineViewState, Continuation<? super FuturesSparklineViewState>, Object> {
                final /* synthetic */ Tuples2<Tuples2<UUID, ChartType>, FuturesChartResult>[] $responses;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Tuples2<Tuples2<UUID, ChartType>, FuturesChartResult>[] tuples2Arr, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$responses = tuples2Arr;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$responses, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesSparklineViewState futuresSparklineViewState, Continuation<? super FuturesSparklineViewState> continuation) {
                    return ((AnonymousClass1) create(futuresSparklineViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    FuturesSparklineViewState futuresSparklineViewState = (FuturesSparklineViewState) this.L$0;
                    Tuples2<Tuples2<UUID, ChartType>, FuturesChartResult>[] tuples2Arr = this.$responses;
                    ArrayList<Tuples2> arrayList = new ArrayList(tuples2Arr.length);
                    int length = tuples2Arr.length;
                    int i = 0;
                    while (true) {
                        Chart<Parcelable> chart = null;
                        if (i >= length) {
                            break;
                        }
                        Tuples2<Tuples2<UUID, ChartType>, FuturesChartResult> tuples2 = tuples2Arr[i];
                        Tuples2<UUID, ChartType> tuples2Component1 = tuples2.component1();
                        FuturesChartResult futuresChartResultComponent2 = tuples2.component2();
                        if (futuresChartResultComponent2 != null) {
                            chart = futuresChartResultComponent2.getChart();
                        }
                        arrayList.add(Tuples4.m3642to(tuples2Component1, chart));
                        i++;
                    }
                    Map mutableMap = MapsKt.toMutableMap(futuresSparklineViewState.getChartData());
                    for (Tuples2 tuples22 : arrayList) {
                        Tuples2 tuples23 = (Tuples2) tuples22.component1();
                        Chart chart2 = (Chart) tuples22.component2();
                        if (chart2 != null) {
                            mutableMap.put(tuples23, chart2);
                        }
                    }
                    return FuturesSparklineViewState.copy$default(futuresSparklineViewState, null, extensions2.toPersistentMap(mutableMap), 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Tuples2[]) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: FuturesSparklineDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$bind$1", m3645f = "FuturesSparklineDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$bind$1 */
    static final class C170181 extends ContinuationImpl7 implements Function2<FuturesSparklineViewState, Continuation<? super FuturesSparklineViewState>, Object> {
        final /* synthetic */ ChartType $chartType;
        final /* synthetic */ UUID $contractId;
        final /* synthetic */ ChartType $oldChartType;
        final /* synthetic */ UUID $oldContractId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170181(UUID uuid, ChartType chartType, UUID uuid2, ChartType chartType2, Continuation<? super C170181> continuation) {
            super(2, continuation);
            this.$oldContractId = uuid;
            this.$oldChartType = chartType;
            this.$contractId = uuid2;
            this.$chartType = chartType2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C170181 c170181 = new C170181(this.$oldContractId, this.$oldChartType, this.$contractId, this.$chartType, continuation);
            c170181.L$0 = obj;
            return c170181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesSparklineViewState futuresSparklineViewState, Continuation<? super FuturesSparklineViewState> continuation) {
            return ((C170181) create(futuresSparklineViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesSparklineViewState futuresSparklineViewState = (FuturesSparklineViewState) this.L$0;
            Set mutableSet = CollectionsKt.toMutableSet(futuresSparklineViewState.getBoundContracts());
            UUID uuid = this.$oldContractId;
            ChartType chartType = this.$oldChartType;
            UUID uuid2 = this.$contractId;
            ChartType chartType2 = this.$chartType;
            if (uuid != null && chartType != null) {
                mutableSet.remove(Tuples4.m3642to(uuid, chartType));
            }
            mutableSet.add(Tuples4.m3642to(uuid2, chartType2));
            return FuturesSparklineViewState.copy$default(futuresSparklineViewState, extensions2.toPersistentSet(mutableSet), null, 2, null);
        }
    }

    public final void bind(UUID contractId, UUID oldContractId, ChartType chartType, ChartType oldChartType) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        applyMutation(new C170181(oldContractId, oldChartType, contractId, chartType, null));
    }

    /* compiled from: FuturesSparklineDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$unbind$1", m3645f = "FuturesSparklineDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$unbind$1 */
    static final class C170201 extends ContinuationImpl7 implements Function2<FuturesSparklineViewState, Continuation<? super FuturesSparklineViewState>, Object> {
        final /* synthetic */ ChartType $chartType;
        final /* synthetic */ UUID $contractId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170201(UUID uuid, ChartType chartType, Continuation<? super C170201> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
            this.$chartType = chartType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C170201 c170201 = new C170201(this.$contractId, this.$chartType, continuation);
            c170201.L$0 = obj;
            return c170201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesSparklineViewState futuresSparklineViewState, Continuation<? super FuturesSparklineViewState> continuation) {
            return ((C170201) create(futuresSparklineViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesSparklineViewState futuresSparklineViewState = (FuturesSparklineViewState) this.L$0;
            return FuturesSparklineViewState.copy$default(futuresSparklineViewState, extensions2.toPersistentSet(SetsKt.minus(futuresSparklineViewState.getBoundContracts(), Tuples4.m3642to(this.$contractId, this.$chartType))), null, 2, null);
        }
    }

    public final void unbind(UUID contractId, ChartType chartType) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        applyMutation(new C170201(contractId, chartType, null));
    }
}
