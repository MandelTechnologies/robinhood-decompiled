package com.robinhood.android.matcha.p177ui.review;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaReviewTransactionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onVerificationResult$1$3$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onVerificationResult$1$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaReviewTransactionDuxo4 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    MatchaReviewTransactionDuxo4(Continuation<? super MatchaReviewTransactionDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaReviewTransactionDuxo4 matchaReviewTransactionDuxo4 = new MatchaReviewTransactionDuxo4(continuation);
        matchaReviewTransactionDuxo4.L$0 = obj;
        return matchaReviewTransactionDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
        return ((MatchaReviewTransactionDuxo4) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MatchaReviewTransactionDataState.copy$default((MatchaReviewTransactionDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, false, 2015, null);
    }
}
