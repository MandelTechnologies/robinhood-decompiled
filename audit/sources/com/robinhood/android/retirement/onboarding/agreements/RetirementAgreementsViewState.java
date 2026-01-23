package com.robinhood.android.retirement.onboarding.agreements;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.retirement.onboarding.C27032R;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSignedAgreements;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementAgreementsViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003JI\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u001dHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsViewState;", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "closingText", "", "accountAgreement", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;", "slipAgreement", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementSlipAgreementsViewModel;", "goldSummarySection", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$GoldSummarySection;", "signedAgreements", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementSlipAgreementsViewModel;Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$GoldSummarySection;Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getClosingText", "()Ljava/lang/String;", "getAccountAgreement", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;", "getSlipAgreement", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementSlipAgreementsViewModel;", "getGoldSummarySection", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$GoldSummarySection;", "getSignedAgreements", "()Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "accountTypeDescription", "", "getAccountTypeDescription", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementAgreementsViewState {
    public static final int $stable = 8;
    private final ApiRetirementSignUpFlow.RetirementAgreementViewModel accountAgreement;
    private final BrokerageAccountType accountType;
    private final String closingText;
    private final ApiRetirementSignUpFlow.GoldSummarySection goldSummarySection;
    private final RetirementSignUpFlowSignedAgreements signedAgreements;
    private final ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel slipAgreement;

    public static /* synthetic */ RetirementAgreementsViewState copy$default(RetirementAgreementsViewState retirementAgreementsViewState, BrokerageAccountType brokerageAccountType, String str, ApiRetirementSignUpFlow.RetirementAgreementViewModel retirementAgreementViewModel, ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel retirementSlipAgreementsViewModel, ApiRetirementSignUpFlow.GoldSummarySection goldSummarySection, RetirementSignUpFlowSignedAgreements retirementSignUpFlowSignedAgreements, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = retirementAgreementsViewState.accountType;
        }
        if ((i & 2) != 0) {
            str = retirementAgreementsViewState.closingText;
        }
        if ((i & 4) != 0) {
            retirementAgreementViewModel = retirementAgreementsViewState.accountAgreement;
        }
        if ((i & 8) != 0) {
            retirementSlipAgreementsViewModel = retirementAgreementsViewState.slipAgreement;
        }
        if ((i & 16) != 0) {
            goldSummarySection = retirementAgreementsViewState.goldSummarySection;
        }
        if ((i & 32) != 0) {
            retirementSignUpFlowSignedAgreements = retirementAgreementsViewState.signedAgreements;
        }
        ApiRetirementSignUpFlow.GoldSummarySection goldSummarySection2 = goldSummarySection;
        RetirementSignUpFlowSignedAgreements retirementSignUpFlowSignedAgreements2 = retirementSignUpFlowSignedAgreements;
        return retirementAgreementsViewState.copy(brokerageAccountType, str, retirementAgreementViewModel, retirementSlipAgreementsViewModel, goldSummarySection2, retirementSignUpFlowSignedAgreements2);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClosingText() {
        return this.closingText;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiRetirementSignUpFlow.RetirementAgreementViewModel getAccountAgreement() {
        return this.accountAgreement;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel getSlipAgreement() {
        return this.slipAgreement;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiRetirementSignUpFlow.GoldSummarySection getGoldSummarySection() {
        return this.goldSummarySection;
    }

    /* renamed from: component6, reason: from getter */
    public final RetirementSignUpFlowSignedAgreements getSignedAgreements() {
        return this.signedAgreements;
    }

    public final RetirementAgreementsViewState copy(BrokerageAccountType accountType, String closingText, ApiRetirementSignUpFlow.RetirementAgreementViewModel accountAgreement, ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel slipAgreement, ApiRetirementSignUpFlow.GoldSummarySection goldSummarySection, RetirementSignUpFlowSignedAgreements signedAgreements) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(closingText, "closingText");
        Intrinsics.checkNotNullParameter(accountAgreement, "accountAgreement");
        Intrinsics.checkNotNullParameter(signedAgreements, "signedAgreements");
        return new RetirementAgreementsViewState(accountType, closingText, accountAgreement, slipAgreement, goldSummarySection, signedAgreements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementAgreementsViewState)) {
            return false;
        }
        RetirementAgreementsViewState retirementAgreementsViewState = (RetirementAgreementsViewState) other;
        return this.accountType == retirementAgreementsViewState.accountType && Intrinsics.areEqual(this.closingText, retirementAgreementsViewState.closingText) && Intrinsics.areEqual(this.accountAgreement, retirementAgreementsViewState.accountAgreement) && Intrinsics.areEqual(this.slipAgreement, retirementAgreementsViewState.slipAgreement) && Intrinsics.areEqual(this.goldSummarySection, retirementAgreementsViewState.goldSummarySection) && Intrinsics.areEqual(this.signedAgreements, retirementAgreementsViewState.signedAgreements);
    }

    public int hashCode() {
        int iHashCode = ((((this.accountType.hashCode() * 31) + this.closingText.hashCode()) * 31) + this.accountAgreement.hashCode()) * 31;
        ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel retirementSlipAgreementsViewModel = this.slipAgreement;
        int iHashCode2 = (iHashCode + (retirementSlipAgreementsViewModel == null ? 0 : retirementSlipAgreementsViewModel.hashCode())) * 31;
        ApiRetirementSignUpFlow.GoldSummarySection goldSummarySection = this.goldSummarySection;
        return ((iHashCode2 + (goldSummarySection != null ? goldSummarySection.hashCode() : 0)) * 31) + this.signedAgreements.hashCode();
    }

    public String toString() {
        return "RetirementAgreementsViewState(accountType=" + this.accountType + ", closingText=" + this.closingText + ", accountAgreement=" + this.accountAgreement + ", slipAgreement=" + this.slipAgreement + ", goldSummarySection=" + this.goldSummarySection + ", signedAgreements=" + this.signedAgreements + ")";
    }

    public RetirementAgreementsViewState(BrokerageAccountType accountType, String closingText, ApiRetirementSignUpFlow.RetirementAgreementViewModel accountAgreement, ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel retirementSlipAgreementsViewModel, ApiRetirementSignUpFlow.GoldSummarySection goldSummarySection, RetirementSignUpFlowSignedAgreements signedAgreements) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(closingText, "closingText");
        Intrinsics.checkNotNullParameter(accountAgreement, "accountAgreement");
        Intrinsics.checkNotNullParameter(signedAgreements, "signedAgreements");
        this.accountType = accountType;
        this.closingText = closingText;
        this.accountAgreement = accountAgreement;
        this.slipAgreement = retirementSlipAgreementsViewModel;
        this.goldSummarySection = goldSummarySection;
        this.signedAgreements = signedAgreements;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final String getClosingText() {
        return this.closingText;
    }

    public final ApiRetirementSignUpFlow.RetirementAgreementViewModel getAccountAgreement() {
        return this.accountAgreement;
    }

    public final ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel getSlipAgreement() {
        return this.slipAgreement;
    }

    public final ApiRetirementSignUpFlow.GoldSummarySection getGoldSummarySection() {
        return this.goldSummarySection;
    }

    public final RetirementSignUpFlowSignedAgreements getSignedAgreements() {
        return this.signedAgreements;
    }

    public final int getAccountTypeDescription() {
        if (this.accountType == BrokerageAccountType.IRA_ROTH) {
            return C27032R.string.retirement_agreement_roth_summary;
        }
        return C27032R.string.retirement_agreement_traditional_summary;
    }
}
