package com.robinhood.android.futures.onboarding.p145ui;

import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.ceres.p284v1.CheckAccountFuturesEligibilityResponseDto;
import com.robinhood.store.futures.FuturesLocaleStore2;
import com.robinhood.store.futures.mib.MiBFuturesState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010#\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010!J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b)J\u0016\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b+J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ji\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b&\u0010%¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;", "", "postOnboardingNavigation", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "eligibilityResponse", "Lkotlin/Result;", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityResponseDto;", "arbAgreement", "Lcom/robinhood/android/agreements/models/ApiPreviousAgreement;", "miBFuturesState", "Lcom/robinhood/store/futures/mib/MiBFuturesState;", "locale", "Lcom/robinhood/store/futures/FuturesLocale;", "existingFuturesAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "existingSwapsAccount", "<init>", "(Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;Lkotlin/Result;Lkotlin/Result;Lcom/robinhood/store/futures/mib/MiBFuturesState;Lcom/robinhood/store/futures/FuturesLocale;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/futures/db/FuturesAccount;)V", "getPostOnboardingNavigation", "()Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "getEligibilityResponse-xLWZpok", "()Lkotlin/Result;", "getArbAgreement-xLWZpok", "getMiBFuturesState", "()Lcom/robinhood/store/futures/mib/MiBFuturesState;", "getLocale", "()Lcom/robinhood/store/futures/FuturesLocale;", "getExistingFuturesAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getExistingSwapsAccount", "userHasNoBrokerageAccount", "", "getUserHasNoBrokerageAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "shouldShowArbitrationAgreement", "isUserEligible", "()Z", "isArbLoaded", "component1", "component2", "component2-xLWZpok", "component3", "component3-xLWZpok", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class FuturesOnboardingDataState {
    public static final int $stable = 8;
    private final Result<ApiPreviousAgreement> arbAgreement;
    private final Result<CheckAccountFuturesEligibilityResponseDto> eligibilityResponse;
    private final FuturesAccount existingFuturesAccount;
    private final FuturesAccount existingSwapsAccount;
    private final FuturesLocaleStore2 locale;
    private final MiBFuturesState miBFuturesState;
    private final FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation;
    private final Boolean userHasNoBrokerageAccount;

    public static /* synthetic */ FuturesOnboardingDataState copy$default(FuturesOnboardingDataState futuresOnboardingDataState, FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation, Result result, Result result2, MiBFuturesState miBFuturesState, FuturesLocaleStore2 futuresLocaleStore2, FuturesAccount futuresAccount, FuturesAccount futuresAccount2, int i, Object obj) {
        if ((i & 1) != 0) {
            postOnboardingNavigation = futuresOnboardingDataState.postOnboardingNavigation;
        }
        if ((i & 2) != 0) {
            result = futuresOnboardingDataState.eligibilityResponse;
        }
        if ((i & 4) != 0) {
            result2 = futuresOnboardingDataState.arbAgreement;
        }
        if ((i & 8) != 0) {
            miBFuturesState = futuresOnboardingDataState.miBFuturesState;
        }
        if ((i & 16) != 0) {
            futuresLocaleStore2 = futuresOnboardingDataState.locale;
        }
        if ((i & 32) != 0) {
            futuresAccount = futuresOnboardingDataState.existingFuturesAccount;
        }
        if ((i & 64) != 0) {
            futuresAccount2 = futuresOnboardingDataState.existingSwapsAccount;
        }
        FuturesAccount futuresAccount3 = futuresAccount;
        FuturesAccount futuresAccount4 = futuresAccount2;
        FuturesLocaleStore2 futuresLocaleStore22 = futuresLocaleStore2;
        Result result3 = result2;
        return futuresOnboardingDataState.copy(postOnboardingNavigation, result, result3, miBFuturesState, futuresLocaleStore22, futuresAccount3, futuresAccount4);
    }

    /* renamed from: component1, reason: from getter */
    public final FuturesOnboardingActivityKey.PostOnboardingNavigation getPostOnboardingNavigation() {
        return this.postOnboardingNavigation;
    }

    /* renamed from: component2-xLWZpok, reason: not valid java name */
    public final Result<CheckAccountFuturesEligibilityResponseDto> m14668component2xLWZpok() {
        return this.eligibilityResponse;
    }

    /* renamed from: component3-xLWZpok, reason: not valid java name */
    public final Result<ApiPreviousAgreement> m14669component3xLWZpok() {
        return this.arbAgreement;
    }

    /* renamed from: component4, reason: from getter */
    public final MiBFuturesState getMiBFuturesState() {
        return this.miBFuturesState;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesLocaleStore2 getLocale() {
        return this.locale;
    }

    /* renamed from: component6, reason: from getter */
    public final FuturesAccount getExistingFuturesAccount() {
        return this.existingFuturesAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final FuturesAccount getExistingSwapsAccount() {
        return this.existingSwapsAccount;
    }

    public final FuturesOnboardingDataState copy(FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation, Result<CheckAccountFuturesEligibilityResponseDto> eligibilityResponse, Result<ApiPreviousAgreement> arbAgreement, MiBFuturesState miBFuturesState, FuturesLocaleStore2 locale, FuturesAccount existingFuturesAccount, FuturesAccount existingSwapsAccount) {
        return new FuturesOnboardingDataState(postOnboardingNavigation, eligibilityResponse, arbAgreement, miBFuturesState, locale, existingFuturesAccount, existingSwapsAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOnboardingDataState)) {
            return false;
        }
        FuturesOnboardingDataState futuresOnboardingDataState = (FuturesOnboardingDataState) other;
        return Intrinsics.areEqual(this.postOnboardingNavigation, futuresOnboardingDataState.postOnboardingNavigation) && Intrinsics.areEqual(this.eligibilityResponse, futuresOnboardingDataState.eligibilityResponse) && Intrinsics.areEqual(this.arbAgreement, futuresOnboardingDataState.arbAgreement) && Intrinsics.areEqual(this.miBFuturesState, futuresOnboardingDataState.miBFuturesState) && this.locale == futuresOnboardingDataState.locale && Intrinsics.areEqual(this.existingFuturesAccount, futuresOnboardingDataState.existingFuturesAccount) && Intrinsics.areEqual(this.existingSwapsAccount, futuresOnboardingDataState.existingSwapsAccount);
    }

    public int hashCode() {
        FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation = this.postOnboardingNavigation;
        int iHashCode = (postOnboardingNavigation == null ? 0 : postOnboardingNavigation.hashCode()) * 31;
        Result<CheckAccountFuturesEligibilityResponseDto> result = this.eligibilityResponse;
        int iM28554hashCodeimpl = (iHashCode + (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue()))) * 31;
        Result<ApiPreviousAgreement> result2 = this.arbAgreement;
        int iM28554hashCodeimpl2 = (iM28554hashCodeimpl + (result2 == null ? 0 : Result.m28554hashCodeimpl(result2.getValue()))) * 31;
        MiBFuturesState miBFuturesState = this.miBFuturesState;
        int iHashCode2 = (iM28554hashCodeimpl2 + (miBFuturesState == null ? 0 : miBFuturesState.hashCode())) * 31;
        FuturesLocaleStore2 futuresLocaleStore2 = this.locale;
        int iHashCode3 = (iHashCode2 + (futuresLocaleStore2 == null ? 0 : futuresLocaleStore2.hashCode())) * 31;
        FuturesAccount futuresAccount = this.existingFuturesAccount;
        int iHashCode4 = (iHashCode3 + (futuresAccount == null ? 0 : futuresAccount.hashCode())) * 31;
        FuturesAccount futuresAccount2 = this.existingSwapsAccount;
        return iHashCode4 + (futuresAccount2 != null ? futuresAccount2.hashCode() : 0);
    }

    public String toString() {
        return "FuturesOnboardingDataState(postOnboardingNavigation=" + this.postOnboardingNavigation + ", eligibilityResponse=" + this.eligibilityResponse + ", arbAgreement=" + this.arbAgreement + ", miBFuturesState=" + this.miBFuturesState + ", locale=" + this.locale + ", existingFuturesAccount=" + this.existingFuturesAccount + ", existingSwapsAccount=" + this.existingSwapsAccount + ")";
    }

    public FuturesOnboardingDataState(FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation, Result<CheckAccountFuturesEligibilityResponseDto> result, Result<ApiPreviousAgreement> result2, MiBFuturesState miBFuturesState, FuturesLocaleStore2 futuresLocaleStore2, FuturesAccount futuresAccount, FuturesAccount futuresAccount2) {
        Boolean boolValueOf;
        this.postOnboardingNavigation = postOnboardingNavigation;
        this.eligibilityResponse = result;
        this.arbAgreement = result2;
        this.miBFuturesState = miBFuturesState;
        this.locale = futuresLocaleStore2;
        this.existingFuturesAccount = futuresAccount;
        this.existingSwapsAccount = futuresAccount2;
        if (miBFuturesState != null) {
            boolValueOf = Boolean.valueOf(miBFuturesState.getFuturesAllowedRhsAccount() == null);
        } else {
            boolValueOf = null;
        }
        this.userHasNoBrokerageAccount = boolValueOf;
    }

    public /* synthetic */ FuturesOnboardingDataState(FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation, Result result, Result result2, MiBFuturesState miBFuturesState, FuturesLocaleStore2 futuresLocaleStore2, FuturesAccount futuresAccount, FuturesAccount futuresAccount2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(postOnboardingNavigation, (i & 2) != 0 ? null : result, (i & 4) != 0 ? null : result2, (i & 8) != 0 ? null : miBFuturesState, (i & 16) != 0 ? null : futuresLocaleStore2, (i & 32) != 0 ? null : futuresAccount, (i & 64) != 0 ? null : futuresAccount2);
    }

    public final FuturesOnboardingActivityKey.PostOnboardingNavigation getPostOnboardingNavigation() {
        return this.postOnboardingNavigation;
    }

    /* renamed from: getEligibilityResponse-xLWZpok, reason: not valid java name */
    public final Result<CheckAccountFuturesEligibilityResponseDto> m14671getEligibilityResponsexLWZpok() {
        return this.eligibilityResponse;
    }

    /* renamed from: getArbAgreement-xLWZpok, reason: not valid java name */
    public final Result<ApiPreviousAgreement> m14670getArbAgreementxLWZpok() {
        return this.arbAgreement;
    }

    public final MiBFuturesState getMiBFuturesState() {
        return this.miBFuturesState;
    }

    public final FuturesLocaleStore2 getLocale() {
        return this.locale;
    }

    public final FuturesAccount getExistingFuturesAccount() {
        return this.existingFuturesAccount;
    }

    public final FuturesAccount getExistingSwapsAccount() {
        return this.existingSwapsAccount;
    }

    public final Boolean getUserHasNoBrokerageAccount() {
        return this.userHasNoBrokerageAccount;
    }

    public final Boolean shouldShowArbitrationAgreement() {
        Result<ApiPreviousAgreement> result = this.arbAgreement;
        if (result == null || Result.m28555isFailureimpl(result.getValue())) {
            return null;
        }
        Object value = this.arbAgreement.getValue();
        ResultKt.throwOnFailure(value);
        return Boolean.valueOf(((ApiPreviousAgreement) value).getSigned_at() == null);
    }

    public final boolean isUserEligible() {
        Result<CheckAccountFuturesEligibilityResponseDto> result = this.eligibilityResponse;
        AccountFuturesEligibilityStatusDto status = null;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CheckAccountFuturesEligibilityResponseDto checkAccountFuturesEligibilityResponseDto = (CheckAccountFuturesEligibilityResponseDto) value;
            if (checkAccountFuturesEligibilityResponseDto != null) {
                status = checkAccountFuturesEligibilityResponseDto.getStatus();
            }
        }
        return status == AccountFuturesEligibilityStatusDto.ELIGIBLE;
    }

    public final boolean isArbLoaded() {
        Result<ApiPreviousAgreement> result = this.arbAgreement;
        return result != null && Result.m28556isSuccessimpl(result.getValue());
    }
}
