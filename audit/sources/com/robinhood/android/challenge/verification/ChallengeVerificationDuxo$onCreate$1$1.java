package com.robinhood.android.challenge.verification;

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
@DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$onCreate$1$1", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChallengeVerificationDuxo$onCreate$1$1 extends ContinuationImpl7 implements Function2<ChallengeVerificationDataState, Continuation<? super ChallengeVerificationDataState>, Object> {
    final /* synthetic */ boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeVerificationDuxo$onCreate$1$1(boolean z, Continuation<? super ChallengeVerificationDuxo$onCreate$1$1> continuation) {
        super(2, continuation);
        this.$it = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChallengeVerificationDuxo$onCreate$1$1 challengeVerificationDuxo$onCreate$1$1 = new ChallengeVerificationDuxo$onCreate$1$1(this.$it, continuation);
        challengeVerificationDuxo$onCreate$1$1.L$0 = obj;
        return challengeVerificationDuxo$onCreate$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChallengeVerificationDataState challengeVerificationDataState, Continuation<? super ChallengeVerificationDataState> continuation) {
        return ((ChallengeVerificationDuxo$onCreate$1$1) create(challengeVerificationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ChallengeVerificationDataState.copy$default((ChallengeVerificationDataState) this.L$0, null, null, null, null, false, null, null, false, this.$it, false, 767, null);
    }
}
