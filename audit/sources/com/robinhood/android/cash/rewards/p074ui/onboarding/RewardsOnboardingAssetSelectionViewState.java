package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingAssetSelectionViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÂ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0002\u0010)J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u0092\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionViewState;", "", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "assetSelectedEvent", "Lcom/robinhood/udf/UiEvent;", "", "cryptoAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "suitabilityVerified", "", "verifySuitabilityEvent", "reviewCryptoAgreementEvent", "suitabilitySuccessEvent", "cryptoAgreementSuccessEvent", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/utils/Optional;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "Ljava/lang/Boolean;", "shouldShowCryptoAgreementEvent", "getShouldShowCryptoAgreementEvent", "()Lcom/robinhood/udf/UiEvent;", "shouldVerifySuitabilityEvent", "getShouldVerifySuitabilityEvent", "showCryptoSuccessEvent", "getShowCryptoSuccessEvent", "showSuitabilitySuccessEvent", "getShowSuitabilitySuccessEvent", "proceedToConfirmationEvent", "getProceedToConfirmationEvent", "hasCryptoAccount", "getHasCryptoAccount", "()Z", "hasSuitabilityVerified", "getHasSuitabilityVerified", "component1", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/utils/Optional;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOnboardingAssetSelectionViewState {
    public static final int $stable = 8;
    private final UiEvent<Unit> assetSelectedEvent;
    private final Optional<CryptoAccount> cryptoAccount;
    private final UiEvent<Unit> cryptoAgreementSuccessEvent;
    private final InvestmentTarget investmentTarget;
    private final UiEvent<Unit> reviewCryptoAgreementEvent;
    private final UiEvent<Unit> suitabilitySuccessEvent;
    private final Boolean suitabilityVerified;
    private final UiEvent<Unit> verifySuitabilityEvent;

    public RewardsOnboardingAssetSelectionViewState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    private final UiEvent<Unit> component2() {
        return this.assetSelectedEvent;
    }

    private final Optional<CryptoAccount> component3() {
        return this.cryptoAccount;
    }

    /* renamed from: component4, reason: from getter */
    private final Boolean getSuitabilityVerified() {
        return this.suitabilityVerified;
    }

    private final UiEvent<Unit> component5() {
        return this.verifySuitabilityEvent;
    }

    private final UiEvent<Unit> component6() {
        return this.reviewCryptoAgreementEvent;
    }

    private final UiEvent<Unit> component7() {
        return this.suitabilitySuccessEvent;
    }

    private final UiEvent<Unit> component8() {
        return this.cryptoAgreementSuccessEvent;
    }

    public static /* synthetic */ RewardsOnboardingAssetSelectionViewState copy$default(RewardsOnboardingAssetSelectionViewState rewardsOnboardingAssetSelectionViewState, InvestmentTarget investmentTarget, UiEvent uiEvent, Optional optional, Boolean bool, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentTarget = rewardsOnboardingAssetSelectionViewState.investmentTarget;
        }
        if ((i & 2) != 0) {
            uiEvent = rewardsOnboardingAssetSelectionViewState.assetSelectedEvent;
        }
        if ((i & 4) != 0) {
            optional = rewardsOnboardingAssetSelectionViewState.cryptoAccount;
        }
        if ((i & 8) != 0) {
            bool = rewardsOnboardingAssetSelectionViewState.suitabilityVerified;
        }
        if ((i & 16) != 0) {
            uiEvent2 = rewardsOnboardingAssetSelectionViewState.verifySuitabilityEvent;
        }
        if ((i & 32) != 0) {
            uiEvent3 = rewardsOnboardingAssetSelectionViewState.reviewCryptoAgreementEvent;
        }
        if ((i & 64) != 0) {
            uiEvent4 = rewardsOnboardingAssetSelectionViewState.suitabilitySuccessEvent;
        }
        if ((i & 128) != 0) {
            uiEvent5 = rewardsOnboardingAssetSelectionViewState.cryptoAgreementSuccessEvent;
        }
        UiEvent uiEvent6 = uiEvent4;
        UiEvent uiEvent7 = uiEvent5;
        UiEvent uiEvent8 = uiEvent2;
        UiEvent uiEvent9 = uiEvent3;
        return rewardsOnboardingAssetSelectionViewState.copy(investmentTarget, uiEvent, optional, bool, uiEvent8, uiEvent9, uiEvent6, uiEvent7);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    public final RewardsOnboardingAssetSelectionViewState copy(InvestmentTarget investmentTarget, UiEvent<Unit> assetSelectedEvent, Optional<CryptoAccount> cryptoAccount, Boolean suitabilityVerified, UiEvent<Unit> verifySuitabilityEvent, UiEvent<Unit> reviewCryptoAgreementEvent, UiEvent<Unit> suitabilitySuccessEvent, UiEvent<Unit> cryptoAgreementSuccessEvent) {
        return new RewardsOnboardingAssetSelectionViewState(investmentTarget, assetSelectedEvent, cryptoAccount, suitabilityVerified, verifySuitabilityEvent, reviewCryptoAgreementEvent, suitabilitySuccessEvent, cryptoAgreementSuccessEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOnboardingAssetSelectionViewState)) {
            return false;
        }
        RewardsOnboardingAssetSelectionViewState rewardsOnboardingAssetSelectionViewState = (RewardsOnboardingAssetSelectionViewState) other;
        return Intrinsics.areEqual(this.investmentTarget, rewardsOnboardingAssetSelectionViewState.investmentTarget) && Intrinsics.areEqual(this.assetSelectedEvent, rewardsOnboardingAssetSelectionViewState.assetSelectedEvent) && Intrinsics.areEqual(this.cryptoAccount, rewardsOnboardingAssetSelectionViewState.cryptoAccount) && Intrinsics.areEqual(this.suitabilityVerified, rewardsOnboardingAssetSelectionViewState.suitabilityVerified) && Intrinsics.areEqual(this.verifySuitabilityEvent, rewardsOnboardingAssetSelectionViewState.verifySuitabilityEvent) && Intrinsics.areEqual(this.reviewCryptoAgreementEvent, rewardsOnboardingAssetSelectionViewState.reviewCryptoAgreementEvent) && Intrinsics.areEqual(this.suitabilitySuccessEvent, rewardsOnboardingAssetSelectionViewState.suitabilitySuccessEvent) && Intrinsics.areEqual(this.cryptoAgreementSuccessEvent, rewardsOnboardingAssetSelectionViewState.cryptoAgreementSuccessEvent);
    }

    public int hashCode() {
        InvestmentTarget investmentTarget = this.investmentTarget;
        int iHashCode = (investmentTarget == null ? 0 : investmentTarget.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.assetSelectedEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        Optional<CryptoAccount> optional = this.cryptoAccount;
        int iHashCode3 = (iHashCode2 + (optional == null ? 0 : optional.hashCode())) * 31;
        Boolean bool = this.suitabilityVerified;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.verifySuitabilityEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.reviewCryptoAgreementEvent;
        int iHashCode6 = (iHashCode5 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.suitabilitySuccessEvent;
        int iHashCode7 = (iHashCode6 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Unit> uiEvent5 = this.cryptoAgreementSuccessEvent;
        return iHashCode7 + (uiEvent5 != null ? uiEvent5.hashCode() : 0);
    }

    public String toString() {
        return "RewardsOnboardingAssetSelectionViewState(investmentTarget=" + this.investmentTarget + ", assetSelectedEvent=" + this.assetSelectedEvent + ", cryptoAccount=" + this.cryptoAccount + ", suitabilityVerified=" + this.suitabilityVerified + ", verifySuitabilityEvent=" + this.verifySuitabilityEvent + ", reviewCryptoAgreementEvent=" + this.reviewCryptoAgreementEvent + ", suitabilitySuccessEvent=" + this.suitabilitySuccessEvent + ", cryptoAgreementSuccessEvent=" + this.cryptoAgreementSuccessEvent + ")";
    }

    public RewardsOnboardingAssetSelectionViewState(InvestmentTarget investmentTarget, UiEvent<Unit> uiEvent, Optional<CryptoAccount> optional, Boolean bool, UiEvent<Unit> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Unit> uiEvent4, UiEvent<Unit> uiEvent5) {
        this.investmentTarget = investmentTarget;
        this.assetSelectedEvent = uiEvent;
        this.cryptoAccount = optional;
        this.suitabilityVerified = bool;
        this.verifySuitabilityEvent = uiEvent2;
        this.reviewCryptoAgreementEvent = uiEvent3;
        this.suitabilitySuccessEvent = uiEvent4;
        this.cryptoAgreementSuccessEvent = uiEvent5;
    }

    public /* synthetic */ RewardsOnboardingAssetSelectionViewState(InvestmentTarget investmentTarget, UiEvent uiEvent, Optional optional, Boolean bool, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investmentTarget, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : optional, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : uiEvent3, (i & 64) != 0 ? null : uiEvent4, (i & 128) != 0 ? null : uiEvent5);
    }

    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    public final UiEvent<Unit> getShouldShowCryptoAgreementEvent() {
        InvestmentTarget investmentTarget = this.investmentTarget;
        if (investmentTarget != null && investmentTarget.isCrypto() && !getHasCryptoAccount()) {
            UiEvent<Unit> uiEvent = this.assetSelectedEvent;
            if ((uiEvent != null ? uiEvent.consume() : null) != null) {
                return new UiEvent<>(Unit.INSTANCE);
            }
        }
        return null;
    }

    public final UiEvent<Unit> getShouldVerifySuitabilityEvent() {
        InvestmentTarget investmentTarget = this.investmentTarget;
        if (investmentTarget != null && !investmentTarget.isCrypto() && !getHasSuitabilityVerified()) {
            UiEvent<Unit> uiEvent = this.assetSelectedEvent;
            if ((uiEvent != null ? uiEvent.consume() : null) != null) {
                return new UiEvent<>(Unit.INSTANCE);
            }
        }
        return null;
    }

    public final UiEvent<InvestmentTarget> getShowCryptoSuccessEvent() {
        if (getHasCryptoAccount() && this.investmentTarget != null) {
            UiEvent<Unit> uiEvent = this.reviewCryptoAgreementEvent;
            if ((uiEvent != null ? uiEvent.consume() : null) != null) {
                return new UiEvent<>(this.investmentTarget);
            }
        }
        return null;
    }

    public final UiEvent<InvestmentTarget> getShowSuitabilitySuccessEvent() {
        if (getHasSuitabilityVerified() && this.investmentTarget != null) {
            UiEvent<Unit> uiEvent = this.verifySuitabilityEvent;
            if ((uiEvent != null ? uiEvent.consume() : null) != null) {
                return new UiEvent<>(this.investmentTarget);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if ((r0 != null ? r0.consume() : null) != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UiEvent<InvestmentTarget> getProceedToConfirmationEvent() {
        InvestmentTarget investmentTarget = this.investmentTarget;
        if (investmentTarget == null) {
            return null;
        }
        if (!investmentTarget.isCrypto() || !getHasCryptoAccount()) {
            if (!this.investmentTarget.isCrypto() && getHasSuitabilityVerified()) {
                UiEvent<Unit> uiEvent = this.assetSelectedEvent;
            }
            UiEvent<Unit> uiEvent2 = this.cryptoAgreementSuccessEvent;
            if ((uiEvent2 != null ? uiEvent2.consume() : null) == null || !getHasCryptoAccount()) {
                UiEvent<Unit> uiEvent3 = this.suitabilitySuccessEvent;
                if ((uiEvent3 != null ? uiEvent3.consume() : null) == null || !getHasSuitabilityVerified()) {
                    return null;
                }
            }
            return new UiEvent<>(this.investmentTarget);
        }
        UiEvent<Unit> uiEvent4 = this.assetSelectedEvent;
        if ((uiEvent4 != null ? uiEvent4.consume() : null) == null) {
        }
        return new UiEvent<>(this.investmentTarget);
    }

    private final boolean getHasCryptoAccount() {
        Optional<CryptoAccount> optional = this.cryptoAccount;
        return (optional != null ? optional.getOrNull() : null) != null;
    }

    private final boolean getHasSuitabilityVerified() {
        return Intrinsics.areEqual(this.suitabilityVerified, Boolean.TRUE);
    }
}
