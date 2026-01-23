package com.robinhood.android.matcha.p177ui.review;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewTransactionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onStart$3$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaReviewTransactionDuxo3 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
    final /* synthetic */ Boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaReviewTransactionDuxo3(Boolean bool, Continuation<? super MatchaReviewTransactionDuxo3> continuation) {
        super(2, continuation);
        this.$it = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaReviewTransactionDuxo3 matchaReviewTransactionDuxo3 = new MatchaReviewTransactionDuxo3(this.$it, continuation);
        matchaReviewTransactionDuxo3.L$0 = obj;
        return matchaReviewTransactionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
        return ((MatchaReviewTransactionDuxo3) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MatchaReviewTransactionDataState matchaReviewTransactionDataState = (MatchaReviewTransactionDataState) this.L$0;
        Boolean bool = this.$it;
        Intrinsics.checkNotNull(bool);
        return MatchaReviewTransactionDataState.copy$default(matchaReviewTransactionDataState, null, null, null, null, null, false, null, null, null, null, bool.booleanValue(), 1023, null);
    }
}
