package com.robinhood.android.advisory.insights.detail;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryInsightDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$1$1", m3645f = "AdvisoryInsightDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDuxo$onStart$1$2$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryInsightDetailDuxo3 extends ContinuationImpl7 implements Function2<AdvisoryInsightDetailDataState, Continuation<? super AdvisoryInsightDetailDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AdvisoryInsightDetailDuxo3(Continuation<? super AdvisoryInsightDetailDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryInsightDetailDuxo3 advisoryInsightDetailDuxo3 = new AdvisoryInsightDetailDuxo3(continuation);
        advisoryInsightDetailDuxo3.L$0 = obj;
        return advisoryInsightDetailDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvisoryInsightDetailDataState advisoryInsightDetailDataState, Continuation<? super AdvisoryInsightDetailDataState> continuation) {
        return ((AdvisoryInsightDetailDuxo3) create(advisoryInsightDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AdvisoryInsightDetailDataState.copy$default((AdvisoryInsightDetailDataState) this.L$0, null, null, null, null, 0, 0, 0, 125, null);
    }
}
