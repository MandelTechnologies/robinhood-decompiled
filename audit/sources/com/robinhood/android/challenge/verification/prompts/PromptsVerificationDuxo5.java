package com.robinhood.android.challenge.verification.prompts;

import com.plaid.internal.EnumC7081g;
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
@DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$pollChallenge$3$1", m3645f = "PromptsVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$pollChallenge$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PromptsVerificationDuxo5 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    PromptsVerificationDuxo5(Continuation<? super PromptsVerificationDuxo5> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PromptsVerificationDuxo5 promptsVerificationDuxo5 = new PromptsVerificationDuxo5(continuation);
        promptsVerificationDuxo5.L$0 = obj;
        return promptsVerificationDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
        return ((PromptsVerificationDuxo5) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, DeviceApprovalChallengeDataState.ChallengeStatus.ERROR, false, null, false, false, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }
}
