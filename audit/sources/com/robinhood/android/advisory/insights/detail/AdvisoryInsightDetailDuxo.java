package com.robinhood.android.advisory.insights.detail;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryInsightDetailKey;
import com.robinhood.android.advisory.contracts.InsightNavArg;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightAsset;
import com.robinhood.store.advisory.AdvisoryInsightsStore;
import java.util.Iterator;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AdvisoryInsightDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\"#B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0002R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDataState;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "insightsStore", "Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/store/advisory/AdvisoryInsightsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "currentInsightNavFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "currentChildIndexFlow", "", "currentChildrenFlow", "", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "displayedTargetFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget;", "onNavInsight", "", "toNext", "", "onStart", "recomputeNavState", "DisplayTarget", "Companion", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryInsightDetailDuxo extends BaseDuxo<AdvisoryInsightDetailDataState, AdvisoryInsightDetailViewState> implements HasSavedState {
    private final StateFlow2<Integer> currentChildIndexFlow;
    private final StateFlow2<List<AdvisoryInsight>> currentChildrenFlow;
    private final StateFlow2<InsightNavArg> currentInsightNavFlow;
    private final Flow<DisplayTarget> displayedTargetFlow;
    private final AdvisoryInsightsStore insightsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightDetailDuxo(DuxoBundle duxoBundle, AdvisoryInsightDetailDataState3 stateProvider, SavedStateHandle savedStateHandle, AdvisoryInsightsStore insightsStore) {
        super(new AdvisoryInsightDetailDataState(null, null, null, null, 0, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(insightsStore, "insightsStore");
        this.savedStateHandle = savedStateHandle;
        this.insightsStore = insightsStore;
        StateFlow2<InsightNavArg> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(((AdvisoryInsightDetailKey) INSTANCE.getArgs((HasSavedState) this)).getCurrent());
        this.currentInsightNavFlow = stateFlow2MutableStateFlow;
        StateFlow2<Integer> stateFlow2MutableStateFlow2 = StateFlow4.MutableStateFlow(0);
        this.currentChildIndexFlow = stateFlow2MutableStateFlow2;
        StateFlow2<List<AdvisoryInsight>> stateFlow2MutableStateFlow3 = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
        this.currentChildrenFlow = stateFlow2MutableStateFlow3;
        this.displayedTargetFlow = FlowKt.filterNotNull(FlowKt.combine(stateFlow2MutableStateFlow, stateFlow2MutableStateFlow3, stateFlow2MutableStateFlow2, new AdvisoryInsightDetailDuxo2(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdvisoryInsightDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget;", "", "Cached", "Fetch", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget$Cached;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget$Fetch;", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    interface DisplayTarget {

        /* compiled from: AdvisoryInsightDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget$Cached;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget;", "insight", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "<init>", "(Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;)V", "getInsight", "()Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Cached implements DisplayTarget {
            public static final int $stable = 8;
            private final AdvisoryInsight insight;

            public static /* synthetic */ Cached copy$default(Cached cached, AdvisoryInsight advisoryInsight, int i, Object obj) {
                if ((i & 1) != 0) {
                    advisoryInsight = cached.insight;
                }
                return cached.copy(advisoryInsight);
            }

            /* renamed from: component1, reason: from getter */
            public final AdvisoryInsight getInsight() {
                return this.insight;
            }

            public final Cached copy(AdvisoryInsight insight) {
                Intrinsics.checkNotNullParameter(insight, "insight");
                return new Cached(insight);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cached) && Intrinsics.areEqual(this.insight, ((Cached) other).insight);
            }

            public int hashCode() {
                return this.insight.hashCode();
            }

            public String toString() {
                return "Cached(insight=" + this.insight + ")";
            }

            public Cached(AdvisoryInsight insight) {
                Intrinsics.checkNotNullParameter(insight, "insight");
                this.insight = insight;
            }

            public final AdvisoryInsight getInsight() {
                return this.insight;
            }
        }

        /* compiled from: AdvisoryInsightDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget$Fetch;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$DisplayTarget;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Fetch implements DisplayTarget {
            public static final int $stable = 0;
            private final String id;

            public static /* synthetic */ Fetch copy$default(Fetch fetch, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fetch.id;
                }
                return fetch.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Fetch copy(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new Fetch(id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Fetch) && Intrinsics.areEqual(this.id, ((Fetch) other).id);
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "Fetch(id=" + this.id + ")";
            }

            public Fetch(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
            }

            public final String getId() {
                return this.id;
            }
        }
    }

    public final void onNavInsight(boolean toNext) {
        int iIntValue;
        int i = -1;
        int i2 = toNext ? 1 : -1;
        List<InsightNavArg> navigationInsights = ((AdvisoryInsightDetailKey) INSTANCE.getArgs((HasSavedState) this)).getNavigationInsights();
        InsightNavArg value = this.currentInsightNavFlow.getValue();
        if (value.getPageType() == AdvisoryInsight.PageType.MULTI_PAGE_PARENT) {
            List<AdvisoryInsight> value2 = this.currentChildrenFlow.getValue();
            if (!value2.isEmpty() && (iIntValue = this.currentChildIndexFlow.getValue().intValue() + i2) >= 0 && iIntValue <= CollectionsKt.getLastIndex(value2)) {
                this.currentChildIndexFlow.setValue(Integer.valueOf(iIntValue));
                return;
            }
        }
        Iterator<InsightNavArg> it = navigationInsights.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (Intrinsics.areEqual(it.next().getId(), value.getId())) {
                i = i3;
                break;
            }
            i3++;
        }
        InsightNavArg insightNavArg = (InsightNavArg) CollectionsKt.getOrNull(navigationInsights, RangesKt.coerceAtLeast(i, 0) + i2);
        if (insightNavArg == null) {
            return;
        }
        this.currentInsightNavFlow.setValue(insightNavArg);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C87751(((AdvisoryInsightDetailKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber(), null));
    }

    /* compiled from: AdvisoryInsightDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1 */
    static final class C87751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C87751(String str, Continuation<? super C87751> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C87751 c87751 = AdvisoryInsightDetailDuxo.this.new C87751(this.$accountNumber, continuation);
            c87751.L$0 = obj;
            return c87751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C87751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(AdvisoryInsightDetailDuxo.this.displayedTargetFlow, new C8774xbc952fda(null, AdvisoryInsightDetailDuxo.this, this.$accountNumber)));
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flowDistinctUntilChanged, AdvisoryInsightDetailDuxo.this, this.$accountNumber, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(flowDistinctUntilChanged, AdvisoryInsightDetailDuxo.this, this.$accountNumber, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AdvisoryInsightDetailDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: AdvisoryInsightDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ Flow<AdvisoryInsight> $insightStream;
            int label;
            final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<AdvisoryInsight> flow, AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$insightStream = flow;
                this.this$0 = advisoryInsightDetailDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$insightStream, this.this$0, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AdvisoryInsightDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "insight", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$1$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {112}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495681 extends ContinuationImpl7 implements Function2<AdvisoryInsight, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $accountNumber;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495681(AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo, String str, Continuation<? super C495681> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryInsightDetailDuxo;
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495681 c495681 = new C495681(this.this$0, this.$accountNumber, continuation);
                    c495681.L$0 = obj;
                    return c495681;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AdvisoryInsight advisoryInsight, Continuation<? super Unit> continuation) {
                    return ((C495681) create(advisoryInsight, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AdvisoryInsight advisoryInsight = (AdvisoryInsight) this.L$0;
                        if (((InsightNavArg) this.this$0.currentInsightNavFlow.getValue()).getPageType() != AdvisoryInsight.PageType.UNSPECIFIED) {
                            this.this$0.recomputeNavState();
                            this.this$0.applyMutation(new C495691(advisoryInsight, null));
                            AdvisoryInsightsStore advisoryInsightsStore = this.this$0.insightsStore;
                            String str = this.$accountNumber;
                            String id = advisoryInsight.getId();
                            this.label = 1;
                            if (advisoryInsightsStore.markInsightAsSeen(str, id, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            this.this$0.currentInsightNavFlow.setValue(InsightNavArg.copy$default((InsightNavArg) this.this$0.currentInsightNavFlow.getValue(), null, advisoryInsight.getPageType(), 1, null));
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: AdvisoryInsightDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$1$1$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495691 extends ContinuationImpl7 implements Function2<AdvisoryInsightDetailDataState, Continuation<? super AdvisoryInsightDetailDataState>, Object> {
                    final /* synthetic */ AdvisoryInsight $insight;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495691(AdvisoryInsight advisoryInsight, Continuation<? super C495691> continuation) {
                        super(2, continuation);
                        this.$insight = advisoryInsight;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495691 c495691 = new C495691(this.$insight, continuation);
                        c495691.L$0 = obj;
                        return c495691;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisoryInsightDetailDataState advisoryInsightDetailDataState, Continuation<? super AdvisoryInsightDetailDataState> continuation) {
                        return ((C495691) create(advisoryInsightDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisoryInsightDetailDataState.copy$default((AdvisoryInsightDetailDataState) this.L$0, this.$insight, null, null, null, 0, 0, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<AdvisoryInsight> flow = this.$insightStream;
                    C495681 c495681 = new C495681(this.this$0, this.$accountNumber, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c495681, this) == coroutine_suspended) {
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

        /* compiled from: AdvisoryInsightDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ Flow<AdvisoryInsight> $insightStream;
            int label;
            final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<AdvisoryInsight> flow, AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$insightStream = flow;
                this.this$0 = advisoryInsightDetailDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$insightStream, this.this$0, this.$accountNumber, continuation);
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
                    final Flow<AdvisoryInsight> flow = this.$insightStream;
                    final AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo = this.this$0;
                    Flow flowMapLatest = FlowKt.mapLatest(new Flow<String>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector, advisoryInsightDetailDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {55}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector, AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = advisoryInsightDetailDuxo;
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
                                    AdvisoryInsight advisoryInsight = (AdvisoryInsight) obj;
                                    this.this$0.applyMutation(new AdvisoryInsightDetailDuxo3(null));
                                    if (!(advisoryInsight.getContentViewModel().getAsset() instanceof AdvisoryInsightAsset.PerformanceChart)) {
                                        advisoryInsight = null;
                                    }
                                    String id = advisoryInsight != null ? advisoryInsight.getId() : null;
                                    if (id != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
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
                    }, new C495702(this.this$0, this.$accountNumber, null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowMapLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: AdvisoryInsightDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "id", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$2", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C495702 extends ContinuationImpl7 implements Function2<String, Continuation<? super PerformanceChartModel>, Object> {
                final /* synthetic */ String $accountNumber;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495702(AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo, String str, Continuation<? super C495702> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryInsightDetailDuxo;
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495702 c495702 = new C495702(this.this$0, this.$accountNumber, continuation);
                    c495702.L$0 = obj;
                    return c495702;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super PerformanceChartModel> continuation) {
                    return ((C495702) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    AdvisoryInsightsStore advisoryInsightsStore = this.this$0.insightsStore;
                    String str2 = this.$accountNumber;
                    this.label = 1;
                    Object portfolioPerformanceChart = advisoryInsightsStore.getPortfolioPerformanceChart(str2, str, this);
                    return portfolioPerformanceChart == coroutine_suspended ? coroutine_suspended : portfolioPerformanceChart;
                }
            }

            /* compiled from: AdvisoryInsightDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$3", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PerformanceChartModel, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryInsightDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PerformanceChartModel performanceChartModel, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(performanceChartModel, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisoryInsightDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$3$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvisoryInsightDetailDataState, Continuation<? super AdvisoryInsightDetailDataState>, Object> {
                    final /* synthetic */ PerformanceChartModel $chartModel;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PerformanceChartModel performanceChartModel, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$chartModel = performanceChartModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartModel, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisoryInsightDetailDataState advisoryInsightDetailDataState, Continuation<? super AdvisoryInsightDetailDataState> continuation) {
                        return ((AnonymousClass1) create(advisoryInsightDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisoryInsightDetailDataState.copy$default((AdvisoryInsightDetailDataState) this.L$0, null, this.$chartModel, null, null, 0, 0, 0, 125, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((PerformanceChartModel) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AdvisoryInsightDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {155}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = advisoryInsightDetailDuxo;
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
                    final StateFlow2 stateFlow2 = this.this$0.currentInsightNavFlow;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends String, ? extends AdvisoryInsight.PageType>>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends AdvisoryInsight.PageType>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    InsightNavArg insightNavArg = (InsightNavArg) obj;
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(insightNavArg.getId(), insightNavArg.getPageType());
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
                    }), new C8772xe974896b(null, this.this$0)));
                    C495713 c495713 = new C495713(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c495713, this) == coroutine_suspended) {
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

            /* compiled from: AdvisoryInsightDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "children", "", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3$3", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C495713 extends ContinuationImpl7 implements Function2<List<? extends AdvisoryInsight>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495713(AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo, Continuation<? super C495713> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryInsightDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495713 c495713 = new C495713(this.this$0, continuation);
                    c495713.L$0 = obj;
                    return c495713;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends AdvisoryInsight> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<AdvisoryInsight>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<AdvisoryInsight> list, Continuation<? super Unit> continuation) {
                    return ((C495713) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.currentChildrenFlow.setValue((List) this.L$0);
                        this.this$0.currentChildIndexFlow.setValue(boxing.boxInt(0));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recomputeNavState() {
        List<InsightNavArg> navigationInsights = ((AdvisoryInsightDetailKey) INSTANCE.getArgs((HasSavedState) this)).getNavigationInsights();
        InsightNavArg value = this.currentInsightNavFlow.getValue();
        Iterator<InsightNavArg> it = navigationInsights.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), value.getId())) {
                break;
            } else {
                i++;
            }
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        InsightNavArg insightNavArg = (InsightNavArg) CollectionsKt.getOrNull(navigationInsights, iCoerceAtLeast - 1);
        InsightNavArg insightNavArg2 = (InsightNavArg) CollectionsKt.getOrNull(navigationInsights, iCoerceAtLeast + 1);
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        if (value.getPageType() == AdvisoryInsight.PageType.MULTI_PAGE_PARENT) {
            intRef2.element = this.currentChildrenFlow.getValue().size();
            intRef.element = RangesKt.coerceIn(this.currentChildIndexFlow.getValue().intValue(), 0, RangesKt.coerceAtLeast(intRef2.element - 1, 0));
        }
        applyMutation(new C87761(insightNavArg, insightNavArg2, iCoerceAtLeast, intRef, intRef2, null));
    }

    /* compiled from: AdvisoryInsightDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$recomputeNavState$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$recomputeNavState$1 */
    static final class C87761 extends ContinuationImpl7 implements Function2<AdvisoryInsightDetailDataState, Continuation<? super AdvisoryInsightDetailDataState>, Object> {
        final /* synthetic */ Ref.IntRef $childCount;
        final /* synthetic */ Ref.IntRef $childIdx;
        final /* synthetic */ InsightNavArg $nextOuter;
        final /* synthetic */ int $outerIndex;
        final /* synthetic */ InsightNavArg $prevOuter;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C87761(InsightNavArg insightNavArg, InsightNavArg insightNavArg2, int i, Ref.IntRef intRef, Ref.IntRef intRef2, Continuation<? super C87761> continuation) {
            super(2, continuation);
            this.$prevOuter = insightNavArg;
            this.$nextOuter = insightNavArg2;
            this.$outerIndex = i;
            this.$childIdx = intRef;
            this.$childCount = intRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C87761 c87761 = new C87761(this.$prevOuter, this.$nextOuter, this.$outerIndex, this.$childIdx, this.$childCount, continuation);
            c87761.L$0 = obj;
            return c87761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryInsightDetailDataState advisoryInsightDetailDataState, Continuation<? super AdvisoryInsightDetailDataState> continuation) {
            return ((C87761) create(advisoryInsightDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryInsightDetailDataState.copy$default((AdvisoryInsightDetailDataState) this.L$0, null, null, this.$prevOuter, this.$nextOuter, this.$outerIndex, this.$childIdx.element, this.$childCount.element, 3, null);
        }
    }

    /* compiled from: AdvisoryInsightDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryInsightDetailKey;", "<init>", "()V", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisoryInsightDetailDuxo, AdvisoryInsightDetailKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryInsightDetailKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryInsightDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryInsightDetailKey getArgs(AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo) {
            return (AdvisoryInsightDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, advisoryInsightDetailDuxo);
        }
    }
}
