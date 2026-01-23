package com.robinhood.shared.stepupverification.challenge.sms;

import com.robinhood.models.p355ui.identi.UiProfileInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SmsChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$onResume$2$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class SmsChallengeDuxo3 extends ContinuationImpl7 implements Function2<SmsChallengeDataState, Continuation<? super SmsChallengeDataState>, Object> {
    final /* synthetic */ UiProfileInfo $profileInfo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmsChallengeDuxo3(UiProfileInfo uiProfileInfo, Continuation<? super SmsChallengeDuxo3> continuation) {
        super(2, continuation);
        this.$profileInfo = uiProfileInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmsChallengeDuxo3 smsChallengeDuxo3 = new SmsChallengeDuxo3(this.$profileInfo, continuation);
        smsChallengeDuxo3.L$0 = obj;
        return smsChallengeDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SmsChallengeDataState smsChallengeDataState, Continuation<? super SmsChallengeDataState> continuation) {
        return ((SmsChallengeDuxo3) create(smsChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SmsChallengeDataState.copy$default((SmsChallengeDataState) this.L$0, false, null, null, null, this.$profileInfo, 15, null);
    }
}
