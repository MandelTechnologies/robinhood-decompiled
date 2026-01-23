package com.robinhood.android.advisory.insights.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryInsightDetailKey;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.store.advisory.AdvisoryInsightsStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$3$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes7.dex */
public final class C8772xe974896b extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends AdvisoryInsight>>, Tuples2<? extends String, ? extends AdvisoryInsight.PageType>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvisoryInsightDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8772xe974896b(Continuation continuation, AdvisoryInsightDetailDuxo advisoryInsightDetailDuxo) {
        super(3, continuation);
        this.this$0 = advisoryInsightDetailDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends AdvisoryInsight>> flowCollector, Tuples2<? extends String, ? extends AdvisoryInsight.PageType> tuples2, Continuation<? super Unit> continuation) {
        C8772xe974896b c8772xe974896b = new C8772xe974896b(continuation, this.this$0);
        c8772xe974896b.L$0 = flowCollector;
        c8772xe974896b.L$1 = tuples2;
        return c8772xe974896b.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r8, r1, r7) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Flow<List<AdvisoryInsight>> flowFlowOf;
        FlowCollector flowCollector2;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            String str2 = (String) tuples2.component1();
            if (((AdvisoryInsight.PageType) tuples2.component2()) == AdvisoryInsight.PageType.MULTI_PAGE_PARENT) {
                AdvisoryInsightsStore advisoryInsightsStore = this.this$0.insightsStore;
                String accountNumber = ((AdvisoryInsightDetailKey) AdvisoryInsightDetailDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                this.L$0 = flowCollector;
                this.L$1 = str2;
                this.label = 1;
                if (advisoryInsightsStore.markInsightAsSeen(accountNumber, str2, this) != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    str = str2;
                }
                return coroutine_suspended;
            }
            flowFlowOf = FlowKt.flowOf(CollectionsKt.emptyList());
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            str = (String) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        flowFlowOf = this.this$0.insightsStore.streamMultiPageInsights(str, ((AdvisoryInsightDetailKey) AdvisoryInsightDetailDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber());
        flowCollector = flowCollector2;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
