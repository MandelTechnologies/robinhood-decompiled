package com.robinhood.android.futures.onboarding.p145ui;

import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.store.futures.FuturesLocaleStore2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JV\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingViewState;", "", "rhsAccountNumber", "", "userHasNoBrokerageAccount", "", "eligibilityStatus", "Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;", "showArbitrationAgreementScreen", "locale", "Lcom/robinhood/store/futures/FuturesLocale;", "postOnboardingNavigation", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;Ljava/lang/Boolean;Lcom/robinhood/store/futures/FuturesLocale;Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getUserHasNoBrokerageAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEligibilityStatus", "()Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;", "getShowArbitrationAgreementScreen", "getLocale", "()Lcom/robinhood/store/futures/FuturesLocale;", "getPostOnboardingNavigation", "()Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;Ljava/lang/Boolean;Lcom/robinhood/store/futures/FuturesLocale;Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;)Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingViewState;", "equals", "other", "hashCode", "", "toString", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesOnboardingViewState {
    public static final int $stable = 8;
    private final AccountFuturesEligibilityStatusDto eligibilityStatus;
    private final FuturesLocaleStore2 locale;
    private final FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation;
    private final String rhsAccountNumber;
    private final Boolean showArbitrationAgreementScreen;
    private final Boolean userHasNoBrokerageAccount;

    public static /* synthetic */ FuturesOnboardingViewState copy$default(FuturesOnboardingViewState futuresOnboardingViewState, String str, Boolean bool, AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, Boolean bool2, FuturesLocaleStore2 futuresLocaleStore2, FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresOnboardingViewState.rhsAccountNumber;
        }
        if ((i & 2) != 0) {
            bool = futuresOnboardingViewState.userHasNoBrokerageAccount;
        }
        if ((i & 4) != 0) {
            accountFuturesEligibilityStatusDto = futuresOnboardingViewState.eligibilityStatus;
        }
        if ((i & 8) != 0) {
            bool2 = futuresOnboardingViewState.showArbitrationAgreementScreen;
        }
        if ((i & 16) != 0) {
            futuresLocaleStore2 = futuresOnboardingViewState.locale;
        }
        if ((i & 32) != 0) {
            postOnboardingNavigation = futuresOnboardingViewState.postOnboardingNavigation;
        }
        FuturesLocaleStore2 futuresLocaleStore22 = futuresLocaleStore2;
        FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation2 = postOnboardingNavigation;
        return futuresOnboardingViewState.copy(str, bool, accountFuturesEligibilityStatusDto, bool2, futuresLocaleStore22, postOnboardingNavigation2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getUserHasNoBrokerageAccount() {
        return this.userHasNoBrokerageAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountFuturesEligibilityStatusDto getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getShowArbitrationAgreementScreen() {
        return this.showArbitrationAgreementScreen;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesLocaleStore2 getLocale() {
        return this.locale;
    }

    /* renamed from: component6, reason: from getter */
    public final FuturesOnboardingActivityKey.PostOnboardingNavigation getPostOnboardingNavigation() {
        return this.postOnboardingNavigation;
    }

    public final FuturesOnboardingViewState copy(String rhsAccountNumber, Boolean userHasNoBrokerageAccount, AccountFuturesEligibilityStatusDto eligibilityStatus, Boolean showArbitrationAgreementScreen, FuturesLocaleStore2 locale, FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation) {
        return new FuturesOnboardingViewState(rhsAccountNumber, userHasNoBrokerageAccount, eligibilityStatus, showArbitrationAgreementScreen, locale, postOnboardingNavigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOnboardingViewState)) {
            return false;
        }
        FuturesOnboardingViewState futuresOnboardingViewState = (FuturesOnboardingViewState) other;
        return Intrinsics.areEqual(this.rhsAccountNumber, futuresOnboardingViewState.rhsAccountNumber) && Intrinsics.areEqual(this.userHasNoBrokerageAccount, futuresOnboardingViewState.userHasNoBrokerageAccount) && this.eligibilityStatus == futuresOnboardingViewState.eligibilityStatus && Intrinsics.areEqual(this.showArbitrationAgreementScreen, futuresOnboardingViewState.showArbitrationAgreementScreen) && this.locale == futuresOnboardingViewState.locale && Intrinsics.areEqual(this.postOnboardingNavigation, futuresOnboardingViewState.postOnboardingNavigation);
    }

    public int hashCode() {
        String str = this.rhsAccountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.userHasNoBrokerageAccount;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto = this.eligibilityStatus;
        int iHashCode3 = (iHashCode2 + (accountFuturesEligibilityStatusDto == null ? 0 : accountFuturesEligibilityStatusDto.hashCode())) * 31;
        Boolean bool2 = this.showArbitrationAgreementScreen;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FuturesLocaleStore2 futuresLocaleStore2 = this.locale;
        int iHashCode5 = (iHashCode4 + (futuresLocaleStore2 == null ? 0 : futuresLocaleStore2.hashCode())) * 31;
        FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation = this.postOnboardingNavigation;
        return iHashCode5 + (postOnboardingNavigation != null ? postOnboardingNavigation.hashCode() : 0);
    }

    public String toString() {
        return "FuturesOnboardingViewState(rhsAccountNumber=" + this.rhsAccountNumber + ", userHasNoBrokerageAccount=" + this.userHasNoBrokerageAccount + ", eligibilityStatus=" + this.eligibilityStatus + ", showArbitrationAgreementScreen=" + this.showArbitrationAgreementScreen + ", locale=" + this.locale + ", postOnboardingNavigation=" + this.postOnboardingNavigation + ")";
    }

    public FuturesOnboardingViewState(String str, Boolean bool, AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, Boolean bool2, FuturesLocaleStore2 futuresLocaleStore2, FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation) {
        this.rhsAccountNumber = str;
        this.userHasNoBrokerageAccount = bool;
        this.eligibilityStatus = accountFuturesEligibilityStatusDto;
        this.showArbitrationAgreementScreen = bool2;
        this.locale = futuresLocaleStore2;
        this.postOnboardingNavigation = postOnboardingNavigation;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final Boolean getUserHasNoBrokerageAccount() {
        return this.userHasNoBrokerageAccount;
    }

    public final AccountFuturesEligibilityStatusDto getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    public final Boolean getShowArbitrationAgreementScreen() {
        return this.showArbitrationAgreementScreen;
    }

    public final FuturesLocaleStore2 getLocale() {
        return this.locale;
    }

    public final FuturesOnboardingActivityKey.PostOnboardingNavigation getPostOnboardingNavigation() {
        return this.postOnboardingNavigation;
    }
}
