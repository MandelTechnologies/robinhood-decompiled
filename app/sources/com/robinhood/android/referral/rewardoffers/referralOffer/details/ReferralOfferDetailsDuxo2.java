package com.robinhood.android.referral.rewardoffers.referralOffer.details;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.librobinhood.data.store.ReferralStore;
import com.robinhood.models.api.ContactData;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: ReferralOfferDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$inviteNextContact$1$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 288}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$inviteNextContact$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class ReferralOfferDetailsDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReferralOfferDetailsViewData.ContactInfo $pendingInvite;
    int label;
    final /* synthetic */ ReferralOfferDetailsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReferralOfferDetailsDuxo2(ReferralOfferDetailsDuxo referralOfferDetailsDuxo, ReferralOfferDetailsViewData.ContactInfo contactInfo, Continuation<? super ReferralOfferDetailsDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = referralOfferDetailsDuxo;
        this.$pendingInvite = contactInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralOfferDetailsDuxo2(this.this$0, this.$pendingInvite, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralOfferDetailsDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7.uploadContactInvitesData(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r7.fetchRecommendedContacts(r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "Unable to upload contact invite: " + this.$pendingInvite, new Object[0]);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReferralStore referralStore = this.this$0.referralStore;
            List<ContactData> listListOf = CollectionsKt.listOf(this.$pendingInvite.getReferralContact().toContactData());
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        ReferralOfferDetailsDuxo referralOfferDetailsDuxo = this.this$0;
        this.label = 2;
    }
}
