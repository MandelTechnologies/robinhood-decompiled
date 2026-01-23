package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash;

import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDataState;", "", "hasDirectDepositRelationships", "", "sweepsInterest", "Ljava/math/BigDecimal;", "retirementMatchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "disclosureContent", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "<init>", "(ZLjava/math/BigDecimal;Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;)V", "getHasDirectDepositRelationships", "()Z", "getSweepsInterest", "()Ljava/math/BigDecimal;", "getRetirementMatchRate", "()Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "getDisclosureContent", "()Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaycheckRecurringInvestmentsDdOnboardingSplashDataState {
    public static final int $stable = 8;
    private final DisclosureContent disclosureContent;
    private final boolean hasDirectDepositRelationships;
    private final RetirementMatchRate retirementMatchRate;
    private final BigDecimal sweepsInterest;

    public PaycheckRecurringInvestmentsDdOnboardingSplashDataState() {
        this(false, null, null, null, 15, null);
    }

    public static /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingSplashDataState copy$default(PaycheckRecurringInvestmentsDdOnboardingSplashDataState paycheckRecurringInvestmentsDdOnboardingSplashDataState, boolean z, BigDecimal bigDecimal, RetirementMatchRate retirementMatchRate, DisclosureContent disclosureContent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = paycheckRecurringInvestmentsDdOnboardingSplashDataState.hasDirectDepositRelationships;
        }
        if ((i & 2) != 0) {
            bigDecimal = paycheckRecurringInvestmentsDdOnboardingSplashDataState.sweepsInterest;
        }
        if ((i & 4) != 0) {
            retirementMatchRate = paycheckRecurringInvestmentsDdOnboardingSplashDataState.retirementMatchRate;
        }
        if ((i & 8) != 0) {
            disclosureContent = paycheckRecurringInvestmentsDdOnboardingSplashDataState.disclosureContent;
        }
        return paycheckRecurringInvestmentsDdOnboardingSplashDataState.copy(z, bigDecimal, retirementMatchRate, disclosureContent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getSweepsInterest() {
        return this.sweepsInterest;
    }

    /* renamed from: component3, reason: from getter */
    public final RetirementMatchRate getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    /* renamed from: component4, reason: from getter */
    public final DisclosureContent getDisclosureContent() {
        return this.disclosureContent;
    }

    public final PaycheckRecurringInvestmentsDdOnboardingSplashDataState copy(boolean hasDirectDepositRelationships, BigDecimal sweepsInterest, RetirementMatchRate retirementMatchRate, DisclosureContent disclosureContent) {
        return new PaycheckRecurringInvestmentsDdOnboardingSplashDataState(hasDirectDepositRelationships, sweepsInterest, retirementMatchRate, disclosureContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaycheckRecurringInvestmentsDdOnboardingSplashDataState)) {
            return false;
        }
        PaycheckRecurringInvestmentsDdOnboardingSplashDataState paycheckRecurringInvestmentsDdOnboardingSplashDataState = (PaycheckRecurringInvestmentsDdOnboardingSplashDataState) other;
        return this.hasDirectDepositRelationships == paycheckRecurringInvestmentsDdOnboardingSplashDataState.hasDirectDepositRelationships && Intrinsics.areEqual(this.sweepsInterest, paycheckRecurringInvestmentsDdOnboardingSplashDataState.sweepsInterest) && Intrinsics.areEqual(this.retirementMatchRate, paycheckRecurringInvestmentsDdOnboardingSplashDataState.retirementMatchRate) && Intrinsics.areEqual(this.disclosureContent, paycheckRecurringInvestmentsDdOnboardingSplashDataState.disclosureContent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasDirectDepositRelationships) * 31;
        BigDecimal bigDecimal = this.sweepsInterest;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        RetirementMatchRate retirementMatchRate = this.retirementMatchRate;
        int iHashCode3 = (iHashCode2 + (retirementMatchRate == null ? 0 : retirementMatchRate.hashCode())) * 31;
        DisclosureContent disclosureContent = this.disclosureContent;
        return iHashCode3 + (disclosureContent != null ? disclosureContent.hashCode() : 0);
    }

    public String toString() {
        return "PaycheckRecurringInvestmentsDdOnboardingSplashDataState(hasDirectDepositRelationships=" + this.hasDirectDepositRelationships + ", sweepsInterest=" + this.sweepsInterest + ", retirementMatchRate=" + this.retirementMatchRate + ", disclosureContent=" + this.disclosureContent + ")";
    }

    public PaycheckRecurringInvestmentsDdOnboardingSplashDataState(boolean z, BigDecimal bigDecimal, RetirementMatchRate retirementMatchRate, DisclosureContent disclosureContent) {
        this.hasDirectDepositRelationships = z;
        this.sweepsInterest = bigDecimal;
        this.retirementMatchRate = retirementMatchRate;
        this.disclosureContent = disclosureContent;
    }

    public /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingSplashDataState(boolean z, BigDecimal bigDecimal, RetirementMatchRate retirementMatchRate, DisclosureContent disclosureContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : retirementMatchRate, (i & 8) != 0 ? null : disclosureContent);
    }

    public final boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    public final BigDecimal getSweepsInterest() {
        return this.sweepsInterest;
    }

    public final RetirementMatchRate getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    public final DisclosureContent getDisclosureContent() {
        return this.disclosureContent;
    }
}
