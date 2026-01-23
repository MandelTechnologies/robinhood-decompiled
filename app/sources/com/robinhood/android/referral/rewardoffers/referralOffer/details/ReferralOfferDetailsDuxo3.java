package com.robinhood.android.referral.rewardoffers.referralOffer.details;

import com.robinhood.android.referral.lib.invite.InviteUserData;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessGrantedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsEvent;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.util.ReferralOfferDetailsViewStates;
import com.robinhood.android.udf.HasSavedState;
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
@DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$inviteNextContact$1$2", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$inviteNextContact$1$2, reason: use source file name */
/* loaded from: classes5.dex */
final class ReferralOfferDetailsDuxo3 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
    final /* synthetic */ ReferralOfferDetailsViewData.ContactInfo $pendingInvite;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReferralOfferDetailsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReferralOfferDetailsDuxo3(ReferralOfferDetailsViewData.ContactInfo contactInfo, ReferralOfferDetailsDuxo referralOfferDetailsDuxo, Continuation<? super ReferralOfferDetailsDuxo3> continuation) {
        super(2, continuation);
        this.$pendingInvite = contactInfo;
        this.this$0 = referralOfferDetailsDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReferralOfferDetailsDuxo3 referralOfferDetailsDuxo3 = new ReferralOfferDetailsDuxo3(this.$pendingInvite, this.this$0, continuation);
        referralOfferDetailsDuxo3.L$0 = obj;
        return referralOfferDetailsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
        return ((ReferralOfferDetailsDuxo3) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ReferralOfferDetailsViewState referralOfferDetailsViewState = (ReferralOfferDetailsViewState) this.L$0;
        if (this.$pendingInvite.getReferralContact().usePhone()) {
            ReferralOfferDetailsDuxo referralOfferDetailsDuxo = this.this$0;
            String str = this.$pendingInvite.getReferralContact().phoneNumber;
            referralOfferDetailsDuxo.submit(new ReferralOfferDetailsEvent.InviteContactViaText(new InviteUserData(str != null ? str : "", ((ReferralOfferDetailsFragment.Args) ReferralOfferDetailsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getDetails().getContactsAccessGranted().getInviteMessageContent())));
            return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted(referralOfferDetailsViewState), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, true, false, null, null, false, false, 8257535, null);
        }
        ReferralOfferDetailsDuxo referralOfferDetailsDuxo2 = this.this$0;
        String str2 = this.$pendingInvite.getReferralContact().email;
        referralOfferDetailsDuxo2.submit(new ReferralOfferDetailsEvent.InviteContactViaEmail(new InviteUserData(str2 != null ? str2 : "", ((ReferralOfferDetailsFragment.Args) ReferralOfferDetailsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getDetails().getContactsAccessGranted().getInviteMessageContent())));
        return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted(referralOfferDetailsViewState), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, true, false, false, null, null, false, false, 8323071, null);
    }
}
