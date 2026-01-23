package com.robinhood.android.rhy.referral.fund.confirmation;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralFundConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$onStart$3$1", m3645f = "RhyReferralFundConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralFundConfirmationDuxo3 extends ContinuationImpl7 implements Function2<RhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    RhyReferralFundConfirmationDuxo3(Continuation<? super RhyReferralFundConfirmationDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralFundConfirmationDuxo3 rhyReferralFundConfirmationDuxo3 = new RhyReferralFundConfirmationDuxo3(continuation);
        rhyReferralFundConfirmationDuxo3.L$0 = obj;
        return rhyReferralFundConfirmationDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralFundConfirmationDataState rhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState> continuation) {
        return ((RhyReferralFundConfirmationDuxo3) create(rhyReferralFundConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RhyReferralFundConfirmationDataState.copy$default((RhyReferralFundConfirmationDataState) this.L$0, null, false, 2, null);
    }
}
