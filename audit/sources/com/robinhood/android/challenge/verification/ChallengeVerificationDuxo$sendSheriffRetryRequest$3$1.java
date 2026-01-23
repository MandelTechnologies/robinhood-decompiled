package com.robinhood.android.challenge.verification;

import com.robinhood.android.challenge.verification.ChallengeVerificationEvent;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogType;
import com.robinhood.models.api.Challenge;
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
@DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$sendSheriffRetryRequest$3$1", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChallengeVerificationDuxo$sendSheriffRetryRequest$3$1 extends ContinuationImpl7 implements Function2<ChallengeVerificationDataState, Continuation<? super ChallengeVerificationDataState>, Object> {
    final /* synthetic */ Challenge $challenge;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChallengeVerificationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeVerificationDuxo$sendSheriffRetryRequest$3$1(ChallengeVerificationDuxo challengeVerificationDuxo, Challenge challenge, Continuation<? super ChallengeVerificationDuxo$sendSheriffRetryRequest$3$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeVerificationDuxo;
        this.$challenge = challenge;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChallengeVerificationDuxo$sendSheriffRetryRequest$3$1 challengeVerificationDuxo$sendSheriffRetryRequest$3$1 = new ChallengeVerificationDuxo$sendSheriffRetryRequest$3$1(this.this$0, this.$challenge, continuation);
        challengeVerificationDuxo$sendSheriffRetryRequest$3$1.L$0 = obj;
        return challengeVerificationDuxo$sendSheriffRetryRequest$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChallengeVerificationDataState challengeVerificationDataState, Continuation<? super ChallengeVerificationDataState> continuation) {
        return ((ChallengeVerificationDuxo$sendSheriffRetryRequest$3$1) create(challengeVerificationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChallengeVerificationDataState challengeVerificationDataState = (ChallengeVerificationDataState) this.L$0;
        this.this$0.submit(new ChallengeVerificationEvent.Dialog(challengeVerificationDataState.getChallengeDialogInfo(ChallengeDialogType.RESEND_CODE)));
        return ChallengeVerificationDataState.copy$default(challengeVerificationDataState, this.$challenge, null, null, null, false, null, null, false, false, false, 1022, null);
    }
}
