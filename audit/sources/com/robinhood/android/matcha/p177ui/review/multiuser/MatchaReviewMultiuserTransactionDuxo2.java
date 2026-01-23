package com.robinhood.android.matcha.p177ui.review.multiuser;

import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$onStart$2$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaReviewMultiuserTransactionDuxo2 extends ContinuationImpl7 implements Function2<MatchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState>, Object> {
    final /* synthetic */ MatchaIncentivesSummary $incentivesSummary;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaReviewMultiuserTransactionDuxo2(MatchaIncentivesSummary matchaIncentivesSummary, Continuation<? super MatchaReviewMultiuserTransactionDuxo2> continuation) {
        super(2, continuation);
        this.$incentivesSummary = matchaIncentivesSummary;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaReviewMultiuserTransactionDuxo2 matchaReviewMultiuserTransactionDuxo2 = new MatchaReviewMultiuserTransactionDuxo2(this.$incentivesSummary, continuation);
        matchaReviewMultiuserTransactionDuxo2.L$0 = obj;
        return matchaReviewMultiuserTransactionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState> continuation) {
        return ((MatchaReviewMultiuserTransactionDuxo2) create(matchaReviewMultiuserTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MatchaReviewMultiuserTransactionDataState.copy$default((MatchaReviewMultiuserTransactionDataState) this.L$0, null, null, null, null, null, false, null, null, null, this.$incentivesSummary, false, 1535, null);
    }
}
