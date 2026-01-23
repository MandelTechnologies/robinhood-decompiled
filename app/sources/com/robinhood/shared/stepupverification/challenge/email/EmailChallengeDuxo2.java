package com.robinhood.shared.stepupverification.challenge.email;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EmailChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$submitCode$1$4$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$submitCode$1$4$1, reason: use source file name */
/* loaded from: classes6.dex */
final class EmailChallengeDuxo2 extends ContinuationImpl7 implements Function2<EmailChallengeDataState, Continuation<? super EmailChallengeDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    EmailChallengeDuxo2(Continuation<? super EmailChallengeDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EmailChallengeDuxo2 emailChallengeDuxo2 = new EmailChallengeDuxo2(continuation);
        emailChallengeDuxo2.L$0 = obj;
        return emailChallengeDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EmailChallengeDataState emailChallengeDataState, Continuation<? super EmailChallengeDataState> continuation) {
        return ((EmailChallengeDuxo2) create(emailChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EmailChallengeDataState.copy$default((EmailChallengeDataState) this.L$0, false, "", null, 4, null);
    }
}
