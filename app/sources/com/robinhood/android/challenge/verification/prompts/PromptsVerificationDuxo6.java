package com.robinhood.android.challenge.verification.prompts;

import com.robinhood.models.api.Challenge;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PromptsVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$recreateChallenge$2$1", m3645f = "PromptsVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$recreateChallenge$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PromptsVerificationDuxo6 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PromptsVerificationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptsVerificationDuxo6(PromptsVerificationDuxo promptsVerificationDuxo, Continuation<? super PromptsVerificationDuxo6> continuation) {
        super(2, continuation);
        this.this$0 = promptsVerificationDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PromptsVerificationDuxo6 promptsVerificationDuxo6 = new PromptsVerificationDuxo6(this.this$0, continuation);
        promptsVerificationDuxo6.L$0 = obj;
        return promptsVerificationDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
        return ((PromptsVerificationDuxo6) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DeviceApprovalChallengeDataState deviceApprovalChallengeDataState = (DeviceApprovalChallengeDataState) this.L$0;
        Challenge challenge = this.this$0.getChallenge();
        return DeviceApprovalChallengeDataState.copy$default(deviceApprovalChallengeDataState, null, false, null, false, false, null, (challenge != null ? challenge.getAlternate_type() : null) != null, 63, null);
    }
}
