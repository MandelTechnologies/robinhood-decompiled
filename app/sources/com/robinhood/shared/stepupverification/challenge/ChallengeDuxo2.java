package com.robinhood.shared.stepupverification.challenge;

import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.shared.stepupverification.challenge.ChallengeDataState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$2$1$1", m3645f = "ChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$2$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ChallengeDuxo2 extends ContinuationImpl7 implements Function2<ChallengeDataState, Continuation<? super ChallengeDataState>, Object> {
    final /* synthetic */ UserViewInput $userViewInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeDuxo2(UserViewInput userViewInput, Continuation<? super ChallengeDuxo2> continuation) {
        super(2, continuation);
        this.$userViewInput = userViewInput;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChallengeDuxo2 challengeDuxo2 = new ChallengeDuxo2(this.$userViewInput, continuation);
        challengeDuxo2.L$0 = obj;
        return challengeDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChallengeDataState challengeDataState, Continuation<? super ChallengeDataState> continuation) {
        return ((ChallengeDuxo2) create(challengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((ChallengeDataState) this.L$0).copy(new ChallengeDataState2.Error(this.$userViewInput));
    }
}
