package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.models.p320db.Security;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingSignUpViewStateV2.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpViewStateV2;", "", "isSubmitting", "", "actionSuccessEvent", "Lcom/robinhood/udf/UiEvent;", "", "actionErrorEvent", "", "selectedInvestmentSymbol", "", "selectedInvestmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "brokerageInterestRate", "Ljava/math/BigDecimal;", "currentInvestment", "Lcom/robinhood/models/db/Security;", "<init>", "(ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;Lcom/robinhood/recurring/models/db/InvestmentTarget;Ljava/math/BigDecimal;Lcom/robinhood/models/db/Security;)V", "()Z", "getActionSuccessEvent", "()Lcom/robinhood/udf/UiEvent;", "getActionErrorEvent", "getSelectedInvestmentSymbol", "()Ljava/lang/String;", "getSelectedInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getBrokerageInterestRate", "()Ljava/math/BigDecimal;", "getCurrentInvestment", "()Lcom/robinhood/models/db/Security;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOnboardingSignUpViewStateV2 {
    public static final int $stable = 8;
    private final UiEvent<Throwable> actionErrorEvent;
    private final UiEvent<Unit> actionSuccessEvent;
    private final BigDecimal brokerageInterestRate;
    private final Security currentInvestment;
    private final boolean isSubmitting;
    private final String selectedInvestmentSymbol;
    private final InvestmentTarget selectedInvestmentTarget;

    public static /* synthetic */ RewardsOnboardingSignUpViewStateV2 copy$default(RewardsOnboardingSignUpViewStateV2 rewardsOnboardingSignUpViewStateV2, boolean z, UiEvent uiEvent, UiEvent uiEvent2, String str, InvestmentTarget investmentTarget, BigDecimal bigDecimal, Security security, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rewardsOnboardingSignUpViewStateV2.isSubmitting;
        }
        if ((i & 2) != 0) {
            uiEvent = rewardsOnboardingSignUpViewStateV2.actionSuccessEvent;
        }
        if ((i & 4) != 0) {
            uiEvent2 = rewardsOnboardingSignUpViewStateV2.actionErrorEvent;
        }
        if ((i & 8) != 0) {
            str = rewardsOnboardingSignUpViewStateV2.selectedInvestmentSymbol;
        }
        if ((i & 16) != 0) {
            investmentTarget = rewardsOnboardingSignUpViewStateV2.selectedInvestmentTarget;
        }
        if ((i & 32) != 0) {
            bigDecimal = rewardsOnboardingSignUpViewStateV2.brokerageInterestRate;
        }
        if ((i & 64) != 0) {
            security = rewardsOnboardingSignUpViewStateV2.currentInvestment;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        Security security2 = security;
        InvestmentTarget investmentTarget2 = investmentTarget;
        UiEvent uiEvent3 = uiEvent2;
        return rewardsOnboardingSignUpViewStateV2.copy(z, uiEvent, uiEvent3, str, investmentTarget2, bigDecimal2, security2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSubmitting() {
        return this.isSubmitting;
    }

    public final UiEvent<Unit> component2() {
        return this.actionSuccessEvent;
    }

    public final UiEvent<Throwable> component3() {
        return this.actionErrorEvent;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectedInvestmentSymbol() {
        return this.selectedInvestmentSymbol;
    }

    /* renamed from: component5, reason: from getter */
    public final InvestmentTarget getSelectedInvestmentTarget() {
        return this.selectedInvestmentTarget;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getBrokerageInterestRate() {
        return this.brokerageInterestRate;
    }

    /* renamed from: component7, reason: from getter */
    public final Security getCurrentInvestment() {
        return this.currentInvestment;
    }

    public final RewardsOnboardingSignUpViewStateV2 copy(boolean isSubmitting, UiEvent<Unit> actionSuccessEvent, UiEvent<Throwable> actionErrorEvent, String selectedInvestmentSymbol, InvestmentTarget selectedInvestmentTarget, BigDecimal brokerageInterestRate, Security currentInvestment) {
        return new RewardsOnboardingSignUpViewStateV2(isSubmitting, actionSuccessEvent, actionErrorEvent, selectedInvestmentSymbol, selectedInvestmentTarget, brokerageInterestRate, currentInvestment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOnboardingSignUpViewStateV2)) {
            return false;
        }
        RewardsOnboardingSignUpViewStateV2 rewardsOnboardingSignUpViewStateV2 = (RewardsOnboardingSignUpViewStateV2) other;
        return this.isSubmitting == rewardsOnboardingSignUpViewStateV2.isSubmitting && Intrinsics.areEqual(this.actionSuccessEvent, rewardsOnboardingSignUpViewStateV2.actionSuccessEvent) && Intrinsics.areEqual(this.actionErrorEvent, rewardsOnboardingSignUpViewStateV2.actionErrorEvent) && Intrinsics.areEqual(this.selectedInvestmentSymbol, rewardsOnboardingSignUpViewStateV2.selectedInvestmentSymbol) && Intrinsics.areEqual(this.selectedInvestmentTarget, rewardsOnboardingSignUpViewStateV2.selectedInvestmentTarget) && Intrinsics.areEqual(this.brokerageInterestRate, rewardsOnboardingSignUpViewStateV2.brokerageInterestRate) && Intrinsics.areEqual(this.currentInvestment, rewardsOnboardingSignUpViewStateV2.currentInvestment);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSubmitting) * 31;
        UiEvent<Unit> uiEvent = this.actionSuccessEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.actionErrorEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        String str = this.selectedInvestmentSymbol;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        InvestmentTarget investmentTarget = this.selectedInvestmentTarget;
        int iHashCode5 = (iHashCode4 + (investmentTarget == null ? 0 : investmentTarget.hashCode())) * 31;
        BigDecimal bigDecimal = this.brokerageInterestRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Security security = this.currentInvestment;
        return iHashCode6 + (security != null ? security.hashCode() : 0);
    }

    public String toString() {
        return "RewardsOnboardingSignUpViewStateV2(isSubmitting=" + this.isSubmitting + ", actionSuccessEvent=" + this.actionSuccessEvent + ", actionErrorEvent=" + this.actionErrorEvent + ", selectedInvestmentSymbol=" + this.selectedInvestmentSymbol + ", selectedInvestmentTarget=" + this.selectedInvestmentTarget + ", brokerageInterestRate=" + this.brokerageInterestRate + ", currentInvestment=" + this.currentInvestment + ")";
    }

    public RewardsOnboardingSignUpViewStateV2(boolean z, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, String str, InvestmentTarget investmentTarget, BigDecimal bigDecimal, Security security) {
        this.isSubmitting = z;
        this.actionSuccessEvent = uiEvent;
        this.actionErrorEvent = uiEvent2;
        this.selectedInvestmentSymbol = str;
        this.selectedInvestmentTarget = investmentTarget;
        this.brokerageInterestRate = bigDecimal;
        this.currentInvestment = security;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RewardsOnboardingSignUpViewStateV2(boolean r2, com.robinhood.udf.UiEvent r3, com.robinhood.udf.UiEvent r4, java.lang.String r5, com.robinhood.recurring.models.p365db.InvestmentTarget r6, java.math.BigDecimal r7, com.robinhood.models.p320db.Security r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lb
            r3 = r0
        Lb:
            r10 = r9 & 4
            if (r10 == 0) goto L10
            r4 = r0
        L10:
            r10 = r9 & 16
            if (r10 == 0) goto L15
            r6 = r0
        L15:
            r10 = r9 & 32
            if (r10 == 0) goto L1a
            r7 = r0
        L1a:
            r9 = r9 & 64
            if (r9 == 0) goto L27
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2f
        L27:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2f:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpViewStateV2.<init>(boolean, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, java.lang.String, com.robinhood.recurring.models.db.InvestmentTarget, java.math.BigDecimal, com.robinhood.models.db.Security, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public final UiEvent<Unit> getActionSuccessEvent() {
        return this.actionSuccessEvent;
    }

    public final UiEvent<Throwable> getActionErrorEvent() {
        return this.actionErrorEvent;
    }

    public final String getSelectedInvestmentSymbol() {
        return this.selectedInvestmentSymbol;
    }

    public final InvestmentTarget getSelectedInvestmentTarget() {
        return this.selectedInvestmentTarget;
    }

    public final BigDecimal getBrokerageInterestRate() {
        return this.brokerageInterestRate;
    }

    public final Security getCurrentInvestment() {
        return this.currentInvestment;
    }
}
