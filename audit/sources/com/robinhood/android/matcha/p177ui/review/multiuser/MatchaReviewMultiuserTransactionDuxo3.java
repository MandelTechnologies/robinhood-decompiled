package com.robinhood.android.matcha.p177ui.review.multiuser;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$onStart$3$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaReviewMultiuserTransactionDuxo3 extends ContinuationImpl7 implements Function2<MatchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState>, Object> {
    final /* synthetic */ Boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaReviewMultiuserTransactionDuxo3(Boolean bool, Continuation<? super MatchaReviewMultiuserTransactionDuxo3> continuation) {
        super(2, continuation);
        this.$it = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaReviewMultiuserTransactionDuxo3 matchaReviewMultiuserTransactionDuxo3 = new MatchaReviewMultiuserTransactionDuxo3(this.$it, continuation);
        matchaReviewMultiuserTransactionDuxo3.L$0 = obj;
        return matchaReviewMultiuserTransactionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState> continuation) {
        return ((MatchaReviewMultiuserTransactionDuxo3) create(matchaReviewMultiuserTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState = (MatchaReviewMultiuserTransactionDataState) this.L$0;
        Boolean bool = this.$it;
        Intrinsics.checkNotNull(bool);
        return MatchaReviewMultiuserTransactionDataState.copy$default(matchaReviewMultiuserTransactionDataState, null, null, null, null, null, false, null, null, null, null, bool.booleanValue(), 1023, null);
    }
}
