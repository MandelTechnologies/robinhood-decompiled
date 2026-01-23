package com.robinhood.android.assethomes;

import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AssetHomeTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDataState;", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarViewState;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "stateProvider", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lcom/robinhood/android/assethomes/AssetHomeTopAppBarStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "argsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo$Args;", "onCreate", "", "bind", "accountNumber", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "Args", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AssetHomeTopAppBarDuxo extends BaseDuxo<AssetHomeTopAppBarDataState, AssetHomeTopAppBarViewState> {
    public static final int $stable = 8;
    private final StateFlow2<Args> argsFlow;
    private final PerformanceChartStore performanceChartStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetHomeTopAppBarDuxo(PerformanceChartStore performanceChartStore, AssetHomeTopAppBarDuxo3 stateProvider, DuxoBundle duxoBundle) {
        super(new AssetHomeTopAppBarDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.performanceChartStore = performanceChartStore;
        this.argsFlow = StateFlow4.MutableStateFlow(null);
    }

    /* compiled from: AssetHomeTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.assethomes.AssetHomeTopAppBarDuxo$onCreate$1", m3645f = "AssetHomeTopAppBarDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.assethomes.AssetHomeTopAppBarDuxo$onCreate$1 */
    static final class C96011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C96011(Continuation<? super C96011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AssetHomeTopAppBarDuxo.this.new C96011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C96011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(AssetHomeTopAppBarDuxo.this.argsFlow), new C9600xc03ddf72(null, AssetHomeTopAppBarDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(AssetHomeTopAppBarDuxo.this, null);
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

        /* compiled from: AssetHomeTopAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.assethomes.AssetHomeTopAppBarDuxo$onCreate$1$2", m3645f = "AssetHomeTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.assethomes.AssetHomeTopAppBarDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Money, ? extends Direction>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AssetHomeTopAppBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AssetHomeTopAppBarDuxo assetHomeTopAppBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = assetHomeTopAppBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Money, ? extends Direction> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Money, ? extends Direction>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Money, ? extends Direction> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AssetHomeTopAppBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.assethomes.AssetHomeTopAppBarDuxo$onCreate$1$2$1", m3645f = "AssetHomeTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.assethomes.AssetHomeTopAppBarDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AssetHomeTopAppBarDataState, Continuation<? super AssetHomeTopAppBarDataState>, Object> {
                final /* synthetic */ Money $accountValue;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Money money, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$accountValue = money;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountValue, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AssetHomeTopAppBarDataState assetHomeTopAppBarDataState, Continuation<? super AssetHomeTopAppBarDataState> continuation) {
                    return ((AnonymousClass1) create(assetHomeTopAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AssetHomeTopAppBarDataState assetHomeTopAppBarDataState = (AssetHomeTopAppBarDataState) this.L$0;
                    Money money = this.$accountValue;
                    return assetHomeTopAppBarDataState.copy(money != null ? money.getDecimalValue() : null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Money) ((Tuples2) this.L$0).component1(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C96011(null));
    }

    public final void bind(String accountNumber, PerformanceChartType chartType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        StateFlow2<Args> stateFlow2 = this.argsFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), new Args(accountNumber, chartType))) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AssetHomeTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo$Args;", "", "accountNumber", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;)V", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "()Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Args {
        private final String accountNumber;
        private final PerformanceChartType chartType;

        public static /* synthetic */ Args copy$default(Args args, String str, PerformanceChartType performanceChartType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                performanceChartType = args.chartType;
            }
            return args.copy(str, performanceChartType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final PerformanceChartType getChartType() {
            return this.chartType;
        }

        public final Args copy(String accountNumber, PerformanceChartType chartType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            return new Args(accountNumber, chartType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.chartType == args.chartType;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.chartType.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", chartType=" + this.chartType + ")";
        }

        public Args(String accountNumber, PerformanceChartType chartType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            this.accountNumber = accountNumber;
            this.chartType = chartType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PerformanceChartType getChartType() {
            return this.chartType;
        }
    }
}
