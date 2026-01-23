package com.robinhood.android.rhy.referral.welcome;

import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeRhyDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDataState;", "", "hasAccount", "", "rhyReferralOutAction", "Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "disclosureContent", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "isRhyEligible", "referralCode", "", "<init>", "(ZLcom/robinhood/rhy/referral/RhyReferralOutAction;Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;Ljava/lang/Boolean;Ljava/lang/String;)V", "getHasAccount", "()Z", "getRhyReferralOutAction", "()Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "getDisclosureContent", "()Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReferralCode", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLcom/robinhood/rhy/referral/RhyReferralOutAction;Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDataState;", "equals", "other", "hashCode", "", "toString", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WelcomeRhyDataState {
    public static final int $stable = 8;
    private final DisclosureContent disclosureContent;
    private final boolean hasAccount;
    private final Boolean isRhyEligible;
    private final String referralCode;
    private final RhyReferralOnboardingStore4 rhyReferralOutAction;

    public static /* synthetic */ WelcomeRhyDataState copy$default(WelcomeRhyDataState welcomeRhyDataState, boolean z, RhyReferralOnboardingStore4 rhyReferralOnboardingStore4, DisclosureContent disclosureContent, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = welcomeRhyDataState.hasAccount;
        }
        if ((i & 2) != 0) {
            rhyReferralOnboardingStore4 = welcomeRhyDataState.rhyReferralOutAction;
        }
        if ((i & 4) != 0) {
            disclosureContent = welcomeRhyDataState.disclosureContent;
        }
        if ((i & 8) != 0) {
            bool = welcomeRhyDataState.isRhyEligible;
        }
        if ((i & 16) != 0) {
            str = welcomeRhyDataState.referralCode;
        }
        String str2 = str;
        DisclosureContent disclosureContent2 = disclosureContent;
        return welcomeRhyDataState.copy(z, rhyReferralOnboardingStore4, disclosureContent2, bool, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasAccount() {
        return this.hasAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final RhyReferralOnboardingStore4 getRhyReferralOutAction() {
        return this.rhyReferralOutAction;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclosureContent getDisclosureContent() {
        return this.disclosureContent;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsRhyEligible() {
        return this.isRhyEligible;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    public final WelcomeRhyDataState copy(boolean hasAccount, RhyReferralOnboardingStore4 rhyReferralOutAction, DisclosureContent disclosureContent, Boolean isRhyEligible, String referralCode) {
        return new WelcomeRhyDataState(hasAccount, rhyReferralOutAction, disclosureContent, isRhyEligible, referralCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeRhyDataState)) {
            return false;
        }
        WelcomeRhyDataState welcomeRhyDataState = (WelcomeRhyDataState) other;
        return this.hasAccount == welcomeRhyDataState.hasAccount && Intrinsics.areEqual(this.rhyReferralOutAction, welcomeRhyDataState.rhyReferralOutAction) && Intrinsics.areEqual(this.disclosureContent, welcomeRhyDataState.disclosureContent) && Intrinsics.areEqual(this.isRhyEligible, welcomeRhyDataState.isRhyEligible) && Intrinsics.areEqual(this.referralCode, welcomeRhyDataState.referralCode);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasAccount) * 31;
        RhyReferralOnboardingStore4 rhyReferralOnboardingStore4 = this.rhyReferralOutAction;
        int iHashCode2 = (iHashCode + (rhyReferralOnboardingStore4 == null ? 0 : rhyReferralOnboardingStore4.hashCode())) * 31;
        DisclosureContent disclosureContent = this.disclosureContent;
        int iHashCode3 = (iHashCode2 + (disclosureContent == null ? 0 : disclosureContent.hashCode())) * 31;
        Boolean bool = this.isRhyEligible;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.referralCode;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "WelcomeRhyDataState(hasAccount=" + this.hasAccount + ", rhyReferralOutAction=" + this.rhyReferralOutAction + ", disclosureContent=" + this.disclosureContent + ", isRhyEligible=" + this.isRhyEligible + ", referralCode=" + this.referralCode + ")";
    }

    public WelcomeRhyDataState(boolean z, RhyReferralOnboardingStore4 rhyReferralOnboardingStore4, DisclosureContent disclosureContent, Boolean bool, String str) {
        this.hasAccount = z;
        this.rhyReferralOutAction = rhyReferralOnboardingStore4;
        this.disclosureContent = disclosureContent;
        this.isRhyEligible = bool;
        this.referralCode = str;
    }

    public /* synthetic */ WelcomeRhyDataState(boolean z, RhyReferralOnboardingStore4 rhyReferralOnboardingStore4, DisclosureContent disclosureContent, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : rhyReferralOnboardingStore4, (i & 4) != 0 ? null : disclosureContent, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str);
    }

    public final boolean getHasAccount() {
        return this.hasAccount;
    }

    public final RhyReferralOnboardingStore4 getRhyReferralOutAction() {
        return this.rhyReferralOutAction;
    }

    public final DisclosureContent getDisclosureContent() {
        return this.disclosureContent;
    }

    public final Boolean isRhyEligible() {
        return this.isRhyEligible;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }
}
