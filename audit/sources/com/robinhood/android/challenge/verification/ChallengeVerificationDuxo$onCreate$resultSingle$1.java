package com.robinhood.android.challenge.verification;

import com.robinhood.models.api.Challenge;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChallengeVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/ChallengeManager$CreateChallengeResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$onCreate$resultSingle$1", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChallengeVerificationDuxo$onCreate$resultSingle$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ChallengeManager.CreateChallengeResult>, Object> {
    final /* synthetic */ Challenge.LoggedOutCreateChallengeRequest $request;
    int label;
    final /* synthetic */ ChallengeVerificationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeVerificationDuxo$onCreate$resultSingle$1(ChallengeVerificationDuxo challengeVerificationDuxo, Challenge.LoggedOutCreateChallengeRequest loggedOutCreateChallengeRequest, Continuation<? super ChallengeVerificationDuxo$onCreate$resultSingle$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeVerificationDuxo;
        this.$request = loggedOutCreateChallengeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengeVerificationDuxo$onCreate$resultSingle$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChallengeManager.CreateChallengeResult> continuation) {
        return ((ChallengeVerificationDuxo$onCreate$resultSingle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ChallengeManager challengeManager = this.this$0.challengeManager;
        Challenge.LoggedOutCreateChallengeRequest loggedOutCreateChallengeRequest = this.$request;
        this.label = 1;
        Object objCreateLoggedOutChallenge = challengeManager.createLoggedOutChallenge(loggedOutCreateChallengeRequest, this);
        return objCreateLoggedOutChallenge == coroutine_suspended ? coroutine_suspended : objCreateLoggedOutChallenge;
    }
}
