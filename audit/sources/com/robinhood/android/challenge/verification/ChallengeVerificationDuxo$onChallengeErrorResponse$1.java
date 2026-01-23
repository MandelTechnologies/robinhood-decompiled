package com.robinhood.android.challenge.verification;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.challenge.verification.ChallengeVerificationEvent;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogType;
import com.robinhood.models.api.ChallengeErrorResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ChallengeVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$onChallengeErrorResponse$1", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChallengeVerificationDuxo$onChallengeErrorResponse$1 extends ContinuationImpl7 implements Function2<ChallengeVerificationDataState, Continuation<? super ChallengeVerificationDataState>, Object> {
    final /* synthetic */ ChallengeErrorResponse $errorResponse;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChallengeVerificationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeVerificationDuxo$onChallengeErrorResponse$1(ChallengeVerificationDuxo challengeVerificationDuxo, ChallengeErrorResponse challengeErrorResponse, Continuation<? super ChallengeVerificationDuxo$onChallengeErrorResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeVerificationDuxo;
        this.$errorResponse = challengeErrorResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChallengeVerificationDuxo$onChallengeErrorResponse$1 challengeVerificationDuxo$onChallengeErrorResponse$1 = new ChallengeVerificationDuxo$onChallengeErrorResponse$1(this.this$0, this.$errorResponse, continuation);
        challengeVerificationDuxo$onChallengeErrorResponse$1.L$0 = obj;
        return challengeVerificationDuxo$onChallengeErrorResponse$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChallengeVerificationDataState challengeVerificationDataState, Continuation<? super ChallengeVerificationDataState> continuation) {
        return ((ChallengeVerificationDuxo$onChallengeErrorResponse$1) create(challengeVerificationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChallengeVerificationDataState challengeVerificationDataState = (ChallengeVerificationDataState) this.L$0;
        this.this$0.submit(new ChallengeVerificationEvent.Dialog(challengeVerificationDataState.getChallengeDialogInfo(ChallengeDialogType.SUBMISSION_ERROR)));
        return ChallengeVerificationDataState.copy$default(challengeVerificationDataState, this.$errorResponse.getChallenge(), null, null, null, false, null, null, false, false, false, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, null);
    }
}
