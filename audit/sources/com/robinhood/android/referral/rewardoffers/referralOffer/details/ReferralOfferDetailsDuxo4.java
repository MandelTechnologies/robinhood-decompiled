package com.robinhood.android.referral.rewardoffers.referralOffer.details;

import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessGrantedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.util.ReferralOfferDetailsViewStates;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ReferralOfferDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onResume$1$2", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onResume$1$2, reason: use source file name */
/* loaded from: classes5.dex */
final class ReferralOfferDetailsDuxo4 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ReferralOfferDetailsDuxo4(Continuation<? super ReferralOfferDetailsDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReferralOfferDetailsDuxo4 referralOfferDetailsDuxo4 = new ReferralOfferDetailsDuxo4(continuation);
        referralOfferDetailsDuxo4.L$0 = obj;
        return referralOfferDetailsDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
        return ((ReferralOfferDetailsDuxo4) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted((ReferralOfferDetailsViewState) this.L$0), null, null, null, null, null, null, null, null, null, null, new LinkedHashSet(), null, null, null, false, null, false, false, false, null, null, false, false, 8190975, null);
    }
}
