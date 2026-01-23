package com.robinhood.android.advisory.portfolio.holdings;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.HoldingsDrillDownFragmentKey;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.feature.lib.sweep.interest.SweepInterestContextFactory;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: HoldingsDrillDownDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDataState;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownStateProvider;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "portfolioBreakdownStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "sweepInterestContextFactory", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownStateProvider;Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class HoldingsDrillDownDuxo extends BaseDuxo<HoldingsDrillDownDataState, HoldingsDrillDownViewState> implements HasSavedState {
    private final BrokerageResourceManager brokerageResourceManager;
    private final AdvisoryPortfolioBreakdownStore portfolioBreakdownStore;
    private final SavedStateHandle savedStateHandle;
    private final SweepInterestContextFactory sweepInterestContextFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HoldingsDrillDownDuxo(DuxoBundle duxoBundle, HoldingsDrillDownStateProvider stateProvider, BrokerageResourceManager brokerageResourceManager, AdvisoryPortfolioBreakdownStore portfolioBreakdownStore, SweepInterestContextFactory sweepInterestContextFactory, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(portfolioBreakdownStore, "portfolioBreakdownStore");
        Intrinsics.checkNotNullParameter(sweepInterestContextFactory, "sweepInterestContextFactory");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new HoldingsDrillDownDataState(((HoldingsDrillDownFragmentKey) companion.getArgs(savedStateHandle)).getAssetClassRegion(), ((HoldingsDrillDownFragmentKey) companion.getArgs(savedStateHandle)).getAccountNumber(), null, null, null, 28, null), stateProvider, duxoBundle);
        this.brokerageResourceManager = brokerageResourceManager;
        this.portfolioBreakdownStore = portfolioBreakdownStore;
        this.sweepInterestContextFactory = sweepInterestContextFactory;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C91541(null));
    }

    /* compiled from: HoldingsDrillDownDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1 */
    static final class C91541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C91541(Continuation<? super C91541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C91541 c91541 = HoldingsDrillDownDuxo.this.new C91541(continuation);
            c91541.L$0 = obj;
            return c91541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C91541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HoldingsDrillDownDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$1", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HoldingsDrillDownDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HoldingsDrillDownDuxo holdingsDrillDownDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = holdingsDrillDownDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<ManagedPortfolioSummary> flowStreamManagedPortfolio = this.this$0.portfolioBreakdownStore.streamManagedPortfolio(((HoldingsDrillDownFragmentKey) HoldingsDrillDownDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber());
                    C495911 c495911 = new C495911(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamManagedPortfolio, c495911, this) == coroutine_suspended) {
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

            /* compiled from: HoldingsDrillDownDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "managedPortfolioSummary", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$1$1", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495911 extends ContinuationImpl7 implements Function2<ManagedPortfolioSummary, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HoldingsDrillDownDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495911(HoldingsDrillDownDuxo holdingsDrillDownDuxo, Continuation<? super C495911> continuation) {
                    super(2, continuation);
                    this.this$0 = holdingsDrillDownDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495911 c495911 = new C495911(this.this$0, continuation);
                    c495911.L$0 = obj;
                    return c495911;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ManagedPortfolioSummary managedPortfolioSummary, Continuation<? super Unit> continuation) {
                    return ((C495911) create(managedPortfolioSummary, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HoldingsDrillDownDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$1$1$1", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495921 extends ContinuationImpl7 implements Function2<HoldingsDrillDownDataState, Continuation<? super HoldingsDrillDownDataState>, Object> {
                    final /* synthetic */ ManagedPortfolioSummary $managedPortfolioSummary;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495921(ManagedPortfolioSummary managedPortfolioSummary, Continuation<? super C495921> continuation) {
                        super(2, continuation);
                        this.$managedPortfolioSummary = managedPortfolioSummary;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495921 c495921 = new C495921(this.$managedPortfolioSummary, continuation);
                        c495921.L$0 = obj;
                        return c495921;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HoldingsDrillDownDataState holdingsDrillDownDataState, Continuation<? super HoldingsDrillDownDataState> continuation) {
                        return ((C495921) create(holdingsDrillDownDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HoldingsDrillDownDataState.copy$default((HoldingsDrillDownDataState) this.L$0, null, null, this.$managedPortfolioSummary, null, null, 27, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495921((ManagedPortfolioSummary) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(HoldingsDrillDownDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(HoldingsDrillDownDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(HoldingsDrillDownDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: HoldingsDrillDownDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$2", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HoldingsDrillDownDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HoldingsDrillDownDuxo holdingsDrillDownDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = holdingsDrillDownDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HoldingsDrillDownDuxo holdingsDrillDownDuxo = this.this$0;
                ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(holdingsDrillDownDuxo, holdingsDrillDownDuxo.brokerageResourceManager.loadResource(BrokerageDisclosure.ADVISORY_CASH), (LifecycleEvent) null, 1, (Object) null);
                final HoldingsDrillDownDuxo holdingsDrillDownDuxo2 = this.this$0;
                scopedSingleBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HoldingsDrillDownDuxo.C91541.AnonymousClass2.invokeSuspend$lambda$0(holdingsDrillDownDuxo2, (Disclosure) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(HoldingsDrillDownDuxo holdingsDrillDownDuxo, Disclosure disclosure) {
                holdingsDrillDownDuxo.applyMutation(new HoldingsDrillDownDuxo2(disclosure, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: HoldingsDrillDownDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$3", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HoldingsDrillDownDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HoldingsDrillDownDuxo holdingsDrillDownDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = holdingsDrillDownDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.sweepInterestContextFactory.getSweepEnrollmentData(((HoldingsDrillDownFragmentKey) HoldingsDrillDownDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: HoldingsDrillDownDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$3$1", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends SweepEnrollmentData>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HoldingsDrillDownDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HoldingsDrillDownDuxo holdingsDrillDownDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = holdingsDrillDownDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<SweepEnrollmentData> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends SweepEnrollmentData> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<SweepEnrollmentData>) optional, continuation);
                }

                /* compiled from: HoldingsDrillDownDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$3$1$1", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495931 extends ContinuationImpl7 implements Function2<HoldingsDrillDownDataState, Continuation<? super HoldingsDrillDownDataState>, Object> {
                    final /* synthetic */ SweepEnrollmentData $data;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495931(SweepEnrollmentData sweepEnrollmentData, Continuation<? super C495931> continuation) {
                        super(2, continuation);
                        this.$data = sweepEnrollmentData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495931 c495931 = new C495931(this.$data, continuation);
                        c495931.L$0 = obj;
                        return c495931;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HoldingsDrillDownDataState holdingsDrillDownDataState, Continuation<? super HoldingsDrillDownDataState> continuation) {
                        return ((C495931) create(holdingsDrillDownDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HoldingsDrillDownDataState.copy$default((HoldingsDrillDownDataState) this.L$0, null, null, null, null, this.$data, 15, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495931((SweepEnrollmentData) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: HoldingsDrillDownDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDuxo;", "Lcom/robinhood/android/advisory/contracts/HoldingsDrillDownFragmentKey;", "<init>", "()V", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<HoldingsDrillDownDuxo, HoldingsDrillDownFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public HoldingsDrillDownFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (HoldingsDrillDownFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public HoldingsDrillDownFragmentKey getArgs(HoldingsDrillDownDuxo holdingsDrillDownDuxo) {
            return (HoldingsDrillDownFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, holdingsDrillDownDuxo);
        }
    }
}
