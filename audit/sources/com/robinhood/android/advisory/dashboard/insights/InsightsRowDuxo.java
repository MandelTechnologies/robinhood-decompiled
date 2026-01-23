package com.robinhood.android.advisory.dashboard.insights;

import com.robinhood.android.advisory.PortfolioDigestExperiment;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.advisory.p304db.ManagedAccountState;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.store.advisory.AdvisoryInsightsStore;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import java.util.List;
import kotlin.Metadata;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: InsightsRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "insightsRowStateProvider", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowStateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "insightsStore", "Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "portfolioStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "digestStore", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "insightsImpressionsPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowStateProvider;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/advisory/AdvisoryInsightsStore;Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/prefs/StringToLongMapPreference;)V", "accountNumberFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onStart", "", "setAccountNumber", "accountNumber", "updateImpressionCount", "insightId", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InsightsRowDuxo extends BaseDuxo<InsightsRowDataState, InsightsRowViewState> {
    public static final int $stable = 8;
    private final StateFlow2<String> accountNumberFlow;
    private final AccountProvider accountProvider;
    private final PortfolioDigestStore digestStore;
    private final ExperimentsStore experimentsStore;
    private final StringToLongMapPreference insightsImpressionsPref;
    private final AdvisoryInsightsStore insightsStore;
    private final AdvisoryPortfolioBreakdownStore portfolioStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsRowDuxo(DuxoBundle duxoBundle, InsightsRowStateProvider insightsRowStateProvider, AccountProvider accountProvider, AdvisoryInsightsStore insightsStore, AdvisoryPortfolioBreakdownStore portfolioStore, PortfolioDigestStore digestStore, ExperimentsStore experimentsStore, @AdvisoryInsightsImpressionsPref StringToLongMapPreference insightsImpressionsPref) {
        super(new InsightsRowDataState(null, 0L, null, null, null, false, 63, null), insightsRowStateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(insightsRowStateProvider, "insightsRowStateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(insightsStore, "insightsStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(digestStore, "digestStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(insightsImpressionsPref, "insightsImpressionsPref");
        this.accountProvider = accountProvider;
        this.insightsStore = insightsStore;
        this.portfolioStore = portfolioStore;
        this.digestStore = digestStore;
        this.experimentsStore = experimentsStore;
        this.insightsImpressionsPref = insightsImpressionsPref;
        this.accountNumberFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C86591(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{PortfolioDigestExperiment.INSTANCE}, false, null, 6, null), null));
    }

    /* compiled from: InsightsRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1 */
    static final class C86591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $portfolioDigestExperimentStream;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C86591(Flow<Boolean> flow, Continuation<? super C86591> continuation) {
            super(2, continuation);
            this.$portfolioDigestExperimentStream = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C86591 c86591 = InsightsRowDuxo.this.new C86591(this.$portfolioDigestExperimentStream, continuation);
            c86591.L$0 = obj;
            return c86591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C86591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InsightsRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$1", m3645f = "InsightsRowDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $portfolioDigestExperimentStream;
            int label;
            final /* synthetic */ InsightsRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InsightsRowDuxo insightsRowDuxo, Flow<Boolean> flow, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = insightsRowDuxo;
                this.$portfolioDigestExperimentStream = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$portfolioDigestExperimentStream, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.flowCombine(FlowKt.filterNotNull(this.this$0.accountNumberFlow), this.$portfolioDigestExperimentStream, new C495451(null)), new C8651x9cb7089e(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
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

            /* compiled from: InsightsRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "accountNumber", "inExperiment"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$1$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495451 extends ContinuationImpl7 implements Function3<String, Boolean, Continuation<? super Tuples2<? extends String, ? extends Boolean>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ boolean Z$0;
                int label;

                C495451(Continuation<? super C495451> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(String str, Boolean bool, Continuation<? super Tuples2<? extends String, ? extends Boolean>> continuation) {
                    return invoke(str, bool.booleanValue(), (Continuation<? super Tuples2<String, Boolean>>) continuation);
                }

                public final Object invoke(String str, boolean z, Continuation<? super Tuples2<String, Boolean>> continuation) {
                    C495451 c495451 = new C495451(continuation);
                    c495451.L$0 = str;
                    c495451.Z$0 = z;
                    return c495451.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Tuples4.m3642to((String) this.L$0, boxing.boxBoolean(this.Z$0));
                }
            }

            /* compiled from: InsightsRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "unseenInsights", "", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$1$3", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends AdvisoryInsight>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InsightsRowDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InsightsRowDuxo insightsRowDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = insightsRowDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends AdvisoryInsight> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<AdvisoryInsight>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<AdvisoryInsight> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.L$0;
                    AdvisoryInsight advisoryInsight = (AdvisoryInsight) CollectionsKt.firstOrNull(list);
                    this.this$0.applyMutation(new C495461(list, advisoryInsight != null ? this.this$0.insightsImpressionsPref.get(advisoryInsight.getId(), 0L) : 0L, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: InsightsRowDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$1$3$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C495461 extends ContinuationImpl7 implements Function2<InsightsRowDataState, Continuation<? super InsightsRowDataState>, Object> {
                    final /* synthetic */ long $impressionCount;
                    final /* synthetic */ List<AdvisoryInsight> $unseenInsights;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495461(List<AdvisoryInsight> list, long j, Continuation<? super C495461> continuation) {
                        super(2, continuation);
                        this.$unseenInsights = list;
                        this.$impressionCount = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495461 c495461 = new C495461(this.$unseenInsights, this.$impressionCount, continuation);
                        c495461.L$0 = obj;
                        return c495461;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InsightsRowDataState insightsRowDataState, Continuation<? super InsightsRowDataState> continuation) {
                        return ((C495461) create(insightsRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InsightsRowDataState.copy$default((InsightsRowDataState) this.L$0, this.$unseenInsights, this.$impressionCount, null, null, null, false, 60, null);
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(InsightsRowDuxo.this, this.$portfolioDigestExperimentStream, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(InsightsRowDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(InsightsRowDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(InsightsRowDuxo.this, this.$portfolioDigestExperimentStream, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.$portfolioDigestExperimentStream, InsightsRowDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: InsightsRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2", m3645f = "InsightsRowDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InsightsRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InsightsRowDuxo insightsRowDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = insightsRowDuxo;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(this.this$0.accountNumberFlow), new C8652xf3d4f97d(null, this.this$0));
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<BrokerageAccountType>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C86532<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "InsightsRowDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C86532.this.emit(null, this);
                                }
                            }

                            public C86532(FlowCollector flowCollector) {
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
                                    BrokerageAccountType brokerageAccountType = ((Account) obj).getBrokerageAccountType();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(brokerageAccountType, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super BrokerageAccountType> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new C86532(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: InsightsRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2$3", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<BrokerageAccountType, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InsightsRowDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InsightsRowDuxo insightsRowDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = insightsRowDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BrokerageAccountType brokerageAccountType, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(brokerageAccountType, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InsightsRowDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2$3$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InsightsRowDataState, Continuation<? super InsightsRowDataState>, Object> {
                    final /* synthetic */ BrokerageAccountType $accountType;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BrokerageAccountType brokerageAccountType, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$accountType = brokerageAccountType;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountType, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InsightsRowDataState insightsRowDataState, Continuation<? super InsightsRowDataState> continuation) {
                        return ((AnonymousClass1) create(insightsRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InsightsRowDataState.copy$default((InsightsRowDataState) this.L$0, null, 0L, this.$accountType, null, null, false, 59, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((BrokerageAccountType) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InsightsRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3", m3645f = "InsightsRowDuxo.kt", m3646l = {106}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InsightsRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(InsightsRowDuxo insightsRowDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = insightsRowDuxo;
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
                    final Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(this.this$0.accountNumberFlow), new C8654x4af2ea5c(null, this.this$0.portfolioStore));
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<ManagedAccountState>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2 */
                        public static final class C86552<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2", m3645f = "InsightsRowDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C86552.this.emit(null, this);
                                }
                            }

                            public C86552(FlowCollector flowCollector) {
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
                                    ManagedAccountState accountState = ((ManagedPortfolioSummary) obj).getAccountState();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountState, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super ManagedAccountState> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new C86552(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    C495473 c495473 = new C495473(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c495473, this) == coroutine_suspended) {
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

            /* compiled from: InsightsRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountState", "Lcom/robinhood/models/advisory/db/ManagedAccountState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3$3", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C495473 extends ContinuationImpl7 implements Function2<ManagedAccountState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InsightsRowDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495473(InsightsRowDuxo insightsRowDuxo, Continuation<? super C495473> continuation) {
                    super(2, continuation);
                    this.this$0 = insightsRowDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495473 c495473 = new C495473(this.this$0, continuation);
                    c495473.L$0 = obj;
                    return c495473;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ManagedAccountState managedAccountState, Continuation<? super Unit> continuation) {
                    return ((C495473) create(managedAccountState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InsightsRowDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3$3$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$3$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InsightsRowDataState, Continuation<? super InsightsRowDataState>, Object> {
                    final /* synthetic */ ManagedAccountState $accountState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ManagedAccountState managedAccountState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$accountState = managedAccountState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountState, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InsightsRowDataState insightsRowDataState, Continuation<? super InsightsRowDataState> continuation) {
                        return ((AnonymousClass1) create(insightsRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InsightsRowDataState.copy$default((InsightsRowDataState) this.L$0, null, 0L, null, this.$accountState, null, false, 55, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ManagedAccountState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InsightsRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4", m3645f = "InsightsRowDuxo.kt", m3646l = {119}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $portfolioDigestExperimentStream;
            int label;
            final /* synthetic */ InsightsRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(InsightsRowDuxo insightsRowDuxo, Flow<Boolean> flow, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = insightsRowDuxo;
                this.$portfolioDigestExperimentStream = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$portfolioDigestExperimentStream, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(FlowKt.filterNotNull(this.this$0.accountNumberFlow), this.$portfolioDigestExperimentStream, null, 2, null), new C8658xa210db3b(null, this.this$0.digestStore));
                    final Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$invokeSuspend$$inlined$filterIsInstance$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "InsightsRowDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                    if (obj instanceof PortfolioDigest.HasOnboarded) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
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
                    Flow<PortfolioDigest.HasOnboarded> flow2 = new Flow<PortfolioDigest.HasOnboarded>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super PortfolioDigest.HasOnboarded> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C86562(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C86562<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$invokeSuspend$$inlined$filter$1$2", m3645f = "InsightsRowDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    return C86562.this.emit(null, this);
                                }
                            }

                            public C86562(FlowCollector flowCollector) {
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
                                    if (!((PortfolioDigest.HasOnboarded) obj).getRead()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
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
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow2, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: InsightsRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$3", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PortfolioDigest.HasOnboarded, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InsightsRowDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InsightsRowDuxo insightsRowDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = insightsRowDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioDigest.HasOnboarded hasOnboarded, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(hasOnboarded, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InsightsRowDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$3$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InsightsRowDataState, Continuation<? super InsightsRowDataState>, Object> {
                    final /* synthetic */ PortfolioDigest.HasOnboarded $digest;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PortfolioDigest.HasOnboarded hasOnboarded, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$digest = hasOnboarded;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$digest, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InsightsRowDataState insightsRowDataState, Continuation<? super InsightsRowDataState> continuation) {
                        return ((AnonymousClass1) create(insightsRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InsightsRowDataState.copy$default((InsightsRowDataState) this.L$0, null, 0L, null, null, this.$digest, false, 47, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((PortfolioDigest.HasOnboarded) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InsightsRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$5", m3645f = "InsightsRowDuxo.kt", m3646l = {128}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $portfolioDigestExperimentStream;
            int label;
            final /* synthetic */ InsightsRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(Flow<Boolean> flow, InsightsRowDuxo insightsRowDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$portfolioDigestExperimentStream = flow;
                this.this$0 = insightsRowDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$portfolioDigestExperimentStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$portfolioDigestExperimentStream;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: InsightsRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inPortfolioDigestExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$5$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InsightsRowDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InsightsRowDuxo insightsRowDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = insightsRowDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InsightsRowDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$5$1$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$onStart$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495481 extends ContinuationImpl7 implements Function2<InsightsRowDataState, Continuation<? super InsightsRowDataState>, Object> {
                    final /* synthetic */ boolean $inPortfolioDigestExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495481(boolean z, Continuation<? super C495481> continuation) {
                        super(2, continuation);
                        this.$inPortfolioDigestExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495481 c495481 = new C495481(this.$inPortfolioDigestExperiment, continuation);
                        c495481.L$0 = obj;
                        return c495481;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InsightsRowDataState insightsRowDataState, Continuation<? super InsightsRowDataState> continuation) {
                        return ((C495481) create(insightsRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InsightsRowDataState.copy$default((InsightsRowDataState) this.L$0, null, 0L, null, null, null, this.$inPortfolioDigestExperiment, 31, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495481(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        StateFlow2<String> stateFlow2 = this.accountNumberFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), accountNumber)) {
        }
    }

    public final void updateImpressionCount(String insightId) {
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        long j = this.insightsImpressionsPref.get(insightId, 0L) + 1;
        this.insightsImpressionsPref.set(insightId, j);
        applyMutation(new C86601(j, null));
    }

    /* compiled from: InsightsRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$updateImpressionCount$1", m3645f = "InsightsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowDuxo$updateImpressionCount$1 */
    static final class C86601 extends ContinuationImpl7 implements Function2<InsightsRowDataState, Continuation<? super InsightsRowDataState>, Object> {
        final /* synthetic */ long $updatedCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C86601(long j, Continuation<? super C86601> continuation) {
            super(2, continuation);
            this.$updatedCount = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C86601 c86601 = new C86601(this.$updatedCount, continuation);
            c86601.L$0 = obj;
            return c86601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InsightsRowDataState insightsRowDataState, Continuation<? super InsightsRowDataState> continuation) {
            return ((C86601) create(insightsRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InsightsRowDataState.copy$default((InsightsRowDataState) this.L$0, null, this.$updatedCount, null, null, null, false, 61, null);
        }
    }
}
