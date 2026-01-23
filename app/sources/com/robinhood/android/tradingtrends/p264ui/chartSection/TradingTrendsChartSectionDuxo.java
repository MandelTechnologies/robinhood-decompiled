package com.robinhood.android.tradingtrends.p264ui.chartSection;

import androidx.lifecycle.ViewModel2;
import com.robinhood.Logger;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsMicrogramSduiConverters;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.libtradingtrends.contracts.TradingTrendsSection;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: TradingTrendsChartSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDataState;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "sduiConverters", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsMicrogramSduiConverters;", "tradingTrendsService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "stateProvider", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsMicrogramSduiConverters;Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "argsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDuxo$Args;", "onCreate", "", "bind", "instrumentId", "", "isDetailPage", "", "initialSelectedType", "onSegmentSelected", "type", "Args", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TradingTrendsChartSectionDuxo extends BaseDuxo<TradingTrendsChartSectionDataState, TradingTrendsChartSectionState3> {
    public static final int $stable = 8;
    private final StateFlow2<Args> argsFlow;
    private final InstrumentStore instrumentStore;
    private final TradingTrendsMicrogramSduiConverters sduiConverters;
    private final TradingTrendsCachedService tradingTrendsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingTrendsChartSectionDuxo(TradingTrendsMicrogramSduiConverters sduiConverters, TradingTrendsCachedService tradingTrendsService, InstrumentStore instrumentStore, TradingTrendsChartSectionState2 stateProvider, DuxoBundle duxoBundle) {
        super(new TradingTrendsChartSectionDataState(null, false, false, null, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
        Intrinsics.checkNotNullParameter(tradingTrendsService, "tradingTrendsService");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sduiConverters = sduiConverters;
        this.tradingTrendsService = tradingTrendsService;
        this.instrumentStore = instrumentStore;
        this.argsFlow = StateFlow4.MutableStateFlow(null);
    }

    /* compiled from: TradingTrendsChartSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$onCreate$1", m3645f = "TradingTrendsChartSectionDuxo.kt", m3646l = {62}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$onCreate$1 */
    static final class C299791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C299791(Continuation<? super C299791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradingTrendsChartSectionDuxo.this.new C299791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C299791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(TradingTrendsChartSectionDuxo.this.argsFlow, new C29976x3566f7b8(null, TradingTrendsChartSectionDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(TradingTrendsChartSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: TradingTrendsChartSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lkotlin/Result;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$onCreate$1$2", m3645f = "TradingTrendsChartSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Result<? extends TradingTrendsSection>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TradingTrendsChartSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TradingTrendsChartSectionDuxo tradingTrendsChartSectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = tradingTrendsChartSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Result<? extends TradingTrendsSection> result, Continuation<? super Unit> continuation) {
                return invoke2((Result<TradingTrendsSection>) result, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Result<TradingTrendsSection> result, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                ChartGroup<GenericAction> chartGroupConvertChartGroup;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Result result = (Result) this.L$0;
                if (result != null) {
                    Object value = result.getValue();
                    TradingTrendsChartSectionDuxo tradingTrendsChartSectionDuxo = this.this$0;
                    Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                    if (thM28553exceptionOrNullimpl == null) {
                        TradingTrendsSection tradingTrendsSection = (TradingTrendsSection) value;
                        if (tradingTrendsSection != null) {
                            try {
                                chartGroupConvertChartGroup = tradingTrendsChartSectionDuxo.sduiConverters.convertChartGroup(tradingTrendsSection.getChart());
                            } catch (Exception e) {
                                Logger.INSTANCE.mo1682e(e, "Failed to parse chart", new Object[0]);
                            }
                            tradingTrendsChartSectionDuxo.applyMutation(new TradingTrendsChartSectionDuxo2(tradingTrendsSection, chartGroupConvertChartGroup, null));
                        } else {
                            chartGroupConvertChartGroup = null;
                            tradingTrendsChartSectionDuxo.applyMutation(new TradingTrendsChartSectionDuxo2(tradingTrendsSection, chartGroupConvertChartGroup, null));
                        }
                    } else {
                        Logger.INSTANCE.mo1682e(thM28553exceptionOrNullimpl, "Failed to get section", new Object[0]);
                        tradingTrendsChartSectionDuxo.applyMutation(new TradingTrendsChartSectionDuxo3(null));
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C299791(null));
    }

    public static /* synthetic */ void bind$default(TradingTrendsChartSectionDuxo tradingTrendsChartSectionDuxo, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        tradingTrendsChartSectionDuxo.bind(str, z, str2);
    }

    /* compiled from: TradingTrendsChartSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$bind$1", m3645f = "TradingTrendsChartSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$bind$1 */
    static final class C299781 extends ContinuationImpl7 implements Function2<TradingTrendsChartSectionDataState, Continuation<? super TradingTrendsChartSectionDataState>, Object> {
        final /* synthetic */ String $instrumentId;
        final /* synthetic */ boolean $isDetailPage;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C299781(String str, boolean z, Continuation<? super C299781> continuation) {
            super(2, continuation);
            this.$instrumentId = str;
            this.$isDetailPage = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C299781 c299781 = new C299781(this.$instrumentId, this.$isDetailPage, continuation);
            c299781.L$0 = obj;
            return c299781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TradingTrendsChartSectionDataState tradingTrendsChartSectionDataState, Continuation<? super TradingTrendsChartSectionDataState> continuation) {
            return ((C299781) create(tradingTrendsChartSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TradingTrendsChartSectionDataState.copy$default((TradingTrendsChartSectionDataState) this.L$0, this.$instrumentId, this.$isDetailPage, false, null, null, 28, null);
        }
    }

    public final void bind(String instrumentId, boolean isDetailPage, String initialSelectedType) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        applyMutation(new C299781(instrumentId, isDetailPage, null));
        StateFlow2<Args> stateFlow2 = this.argsFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), new Args(instrumentId, isDetailPage, initialSelectedType))) {
        }
    }

    /* compiled from: TradingTrendsChartSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$onSegmentSelected$1", m3645f = "TradingTrendsChartSectionDuxo.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$onSegmentSelected$1 */
    static final class C299801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C299801(String str, Continuation<? super C299801> continuation) {
            super(2, continuation);
            this.$type = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradingTrendsChartSectionDuxo.this.new C299801(this.$type, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C299801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TradingTrendsCachedService tradingTrendsCachedService = TradingTrendsChartSectionDuxo.this.tradingTrendsService;
                String str = this.$type;
                this.label = 1;
                if (tradingTrendsCachedService.selectType(str, this) == coroutine_suspended) {
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

    public final void onSegmentSelected(String type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C299801(type2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TradingTrendsChartSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDuxo$Args;", "", "instrumentId", "", "isDetailPage", "", "initialSelectedType", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getInstrumentId", "()Ljava/lang/String;", "()Z", "getInitialSelectedType", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Args {
        private final String initialSelectedType;
        private final String instrumentId;
        private final boolean isDetailPage;

        public static /* synthetic */ Args copy$default(Args args, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.instrumentId;
            }
            if ((i & 2) != 0) {
                z = args.isDetailPage;
            }
            if ((i & 4) != 0) {
                str2 = args.initialSelectedType;
            }
            return args.copy(str, z, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsDetailPage() {
            return this.isDetailPage;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInitialSelectedType() {
            return this.initialSelectedType;
        }

        public final Args copy(String instrumentId, boolean isDetailPage, String initialSelectedType) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(instrumentId, isDetailPage, initialSelectedType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.isDetailPage == args.isDetailPage && Intrinsics.areEqual(this.initialSelectedType, args.initialSelectedType);
        }

        public int hashCode() {
            int iHashCode = ((this.instrumentId.hashCode() * 31) + Boolean.hashCode(this.isDetailPage)) * 31;
            String str = this.initialSelectedType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ", isDetailPage=" + this.isDetailPage + ", initialSelectedType=" + this.initialSelectedType + ")";
        }

        public Args(String instrumentId, boolean z, String str) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
            this.isDetailPage = z;
            this.initialSelectedType = str;
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final boolean isDetailPage() {
            return this.isDetailPage;
        }

        public final String getInitialSelectedType() {
            return this.initialSelectedType;
        }
    }
}
