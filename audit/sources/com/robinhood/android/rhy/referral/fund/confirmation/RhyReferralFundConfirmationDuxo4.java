package com.robinhood.android.rhy.referral.fund.confirmation;

import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import java.util.List;
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
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$updateGooglePayData$1$1", m3645f = "RhyReferralFundConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$updateGooglePayData$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralFundConfirmationDuxo4 extends ContinuationImpl7 implements Function2<RhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState>, Object> {
    final /* synthetic */ List<GooglePayTokenInfoWrapper> $tokenList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralFundConfirmationDuxo4(List<GooglePayTokenInfoWrapper> list, Continuation<? super RhyReferralFundConfirmationDuxo4> continuation) {
        super(2, continuation);
        this.$tokenList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralFundConfirmationDuxo4 rhyReferralFundConfirmationDuxo4 = new RhyReferralFundConfirmationDuxo4(this.$tokenList, continuation);
        rhyReferralFundConfirmationDuxo4.L$0 = obj;
        return rhyReferralFundConfirmationDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralFundConfirmationDataState rhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState> continuation) {
        return ((RhyReferralFundConfirmationDuxo4) create(rhyReferralFundConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RhyReferralFundConfirmationDataState.copy$default((RhyReferralFundConfirmationDataState) this.L$0, this.$tokenList, false, 2, null);
    }
}
