package com.robinhood.android.referral.rewardoffers.referralOffer.details.model;

import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ReferralOfferDetailsViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;", "", "<init>", "()V", "disclosureText", "Lcom/robinhood/models/serverdriven/db/RichText;", "getDisclosureText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "shareLinkButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "getShareLinkButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "isBottomBarVisible", "", "()Z", "isTopBarVisible", "isRhsg", "isWhatsAppInstalled", "getViewDataList", "", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessDeniedViewState;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessGrantedViewState;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class ReferralOfferDetailsViewState {
    public static final int $stable = 0;

    public /* synthetic */ ReferralOfferDetailsViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract RichText getDisclosureText();

    public abstract GenericButton getShareLinkButton();

    public abstract List<ReferralOfferDetailsViewData> getViewDataList();

    public abstract boolean isBottomBarVisible();

    public abstract boolean isRhsg();

    public abstract boolean isTopBarVisible();

    public abstract boolean isWhatsAppInstalled();

    private ReferralOfferDetailsViewState() {
    }
}
