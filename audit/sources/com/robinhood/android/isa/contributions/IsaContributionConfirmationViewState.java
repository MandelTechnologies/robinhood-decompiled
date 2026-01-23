package com.robinhood.android.isa.contributions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\n\u0010\u0017¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationViewState;", "", "accountNumber", "", "transferred", "contributed", "taxYear", "initialProgress", "", "targetProgress", "isMaxContribution", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)V", "getAccountNumber", "()Ljava/lang/String;", "getTransferred", "getContributed", "getTaxYear", "getInitialProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTargetProgress", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationViewState;", "equals", "other", "hashCode", "", "toString", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaContributionConfirmationViewState {
    public static final int $stable = 0;
    private final String accountNumber;
    private final String contributed;
    private final Float initialProgress;
    private final Boolean isMaxContribution;
    private final Float targetProgress;
    private final String taxYear;
    private final String transferred;

    public static /* synthetic */ IsaContributionConfirmationViewState copy$default(IsaContributionConfirmationViewState isaContributionConfirmationViewState, String str, String str2, String str3, String str4, Float f, Float f2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = isaContributionConfirmationViewState.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = isaContributionConfirmationViewState.transferred;
        }
        if ((i & 4) != 0) {
            str3 = isaContributionConfirmationViewState.contributed;
        }
        if ((i & 8) != 0) {
            str4 = isaContributionConfirmationViewState.taxYear;
        }
        if ((i & 16) != 0) {
            f = isaContributionConfirmationViewState.initialProgress;
        }
        if ((i & 32) != 0) {
            f2 = isaContributionConfirmationViewState.targetProgress;
        }
        if ((i & 64) != 0) {
            bool = isaContributionConfirmationViewState.isMaxContribution;
        }
        Float f3 = f2;
        Boolean bool2 = bool;
        Float f4 = f;
        String str5 = str3;
        return isaContributionConfirmationViewState.copy(str, str2, str5, str4, f4, f3, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransferred() {
        return this.transferred;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContributed() {
        return this.contributed;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTaxYear() {
        return this.taxYear;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getInitialProgress() {
        return this.initialProgress;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getTargetProgress() {
        return this.targetProgress;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsMaxContribution() {
        return this.isMaxContribution;
    }

    public final IsaContributionConfirmationViewState copy(String accountNumber, String transferred, String contributed, String taxYear, Float initialProgress, Float targetProgress, Boolean isMaxContribution) {
        return new IsaContributionConfirmationViewState(accountNumber, transferred, contributed, taxYear, initialProgress, targetProgress, isMaxContribution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaContributionConfirmationViewState)) {
            return false;
        }
        IsaContributionConfirmationViewState isaContributionConfirmationViewState = (IsaContributionConfirmationViewState) other;
        return Intrinsics.areEqual(this.accountNumber, isaContributionConfirmationViewState.accountNumber) && Intrinsics.areEqual(this.transferred, isaContributionConfirmationViewState.transferred) && Intrinsics.areEqual(this.contributed, isaContributionConfirmationViewState.contributed) && Intrinsics.areEqual(this.taxYear, isaContributionConfirmationViewState.taxYear) && Intrinsics.areEqual((Object) this.initialProgress, (Object) isaContributionConfirmationViewState.initialProgress) && Intrinsics.areEqual((Object) this.targetProgress, (Object) isaContributionConfirmationViewState.targetProgress) && Intrinsics.areEqual(this.isMaxContribution, isaContributionConfirmationViewState.isMaxContribution);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transferred;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contributed;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.taxYear;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.initialProgress;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.targetProgress;
        int iHashCode6 = (iHashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool = this.isMaxContribution;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "IsaContributionConfirmationViewState(accountNumber=" + this.accountNumber + ", transferred=" + this.transferred + ", contributed=" + this.contributed + ", taxYear=" + this.taxYear + ", initialProgress=" + this.initialProgress + ", targetProgress=" + this.targetProgress + ", isMaxContribution=" + this.isMaxContribution + ")";
    }

    public IsaContributionConfirmationViewState(String str, String str2, String str3, String str4, Float f, Float f2, Boolean bool) {
        this.accountNumber = str;
        this.transferred = str2;
        this.contributed = str3;
        this.taxYear = str4;
        this.initialProgress = f;
        this.targetProgress = f2;
        this.isMaxContribution = bool;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getTransferred() {
        return this.transferred;
    }

    public final String getContributed() {
        return this.contributed;
    }

    public final String getTaxYear() {
        return this.taxYear;
    }

    public final Float getInitialProgress() {
        return this.initialProgress;
    }

    public final Float getTargetProgress() {
        return this.targetProgress;
    }

    public final Boolean isMaxContribution() {
        return this.isMaxContribution;
    }
}
