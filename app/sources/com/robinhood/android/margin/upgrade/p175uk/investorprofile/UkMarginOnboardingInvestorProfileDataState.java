package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkMarginOnboardingInvestorProfileState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDataState;", "", "productContext", "", "isQuestionnaireComplete", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getProductContext", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDataState;", "equals", "other", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UkMarginOnboardingInvestorProfileDataState {
    public static final int $stable = 0;
    private final Boolean isQuestionnaireComplete;
    private final String productContext;

    public static /* synthetic */ UkMarginOnboardingInvestorProfileDataState copy$default(UkMarginOnboardingInvestorProfileDataState ukMarginOnboardingInvestorProfileDataState, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ukMarginOnboardingInvestorProfileDataState.productContext;
        }
        if ((i & 2) != 0) {
            bool = ukMarginOnboardingInvestorProfileDataState.isQuestionnaireComplete;
        }
        return ukMarginOnboardingInvestorProfileDataState.copy(str, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductContext() {
        return this.productContext;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsQuestionnaireComplete() {
        return this.isQuestionnaireComplete;
    }

    public final UkMarginOnboardingInvestorProfileDataState copy(String productContext, Boolean isQuestionnaireComplete) {
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        return new UkMarginOnboardingInvestorProfileDataState(productContext, isQuestionnaireComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkMarginOnboardingInvestorProfileDataState)) {
            return false;
        }
        UkMarginOnboardingInvestorProfileDataState ukMarginOnboardingInvestorProfileDataState = (UkMarginOnboardingInvestorProfileDataState) other;
        return Intrinsics.areEqual(this.productContext, ukMarginOnboardingInvestorProfileDataState.productContext) && Intrinsics.areEqual(this.isQuestionnaireComplete, ukMarginOnboardingInvestorProfileDataState.isQuestionnaireComplete);
    }

    public int hashCode() {
        int iHashCode = this.productContext.hashCode() * 31;
        Boolean bool = this.isQuestionnaireComplete;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "UkMarginOnboardingInvestorProfileDataState(productContext=" + this.productContext + ", isQuestionnaireComplete=" + this.isQuestionnaireComplete + ")";
    }

    public UkMarginOnboardingInvestorProfileDataState(String productContext, Boolean bool) {
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        this.productContext = productContext;
        this.isQuestionnaireComplete = bool;
    }

    public /* synthetic */ UkMarginOnboardingInvestorProfileDataState(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bool);
    }

    public final String getProductContext() {
        return this.productContext;
    }

    public final Boolean isQuestionnaireComplete() {
        return this.isQuestionnaireComplete;
    }
}
