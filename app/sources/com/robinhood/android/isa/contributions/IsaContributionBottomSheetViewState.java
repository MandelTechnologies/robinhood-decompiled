package com.robinhood.android.isa.contributions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetViewState;", "", "taxYearLabel", "", "contributed", "remaining", "allowance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaxYearLabel", "()Ljava/lang/String;", "getContributed", "getRemaining", "getAllowance", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaContributionBottomSheetViewState {
    public static final int $stable = 0;
    private final String allowance;
    private final String contributed;
    private final String remaining;
    private final String taxYearLabel;

    public static /* synthetic */ IsaContributionBottomSheetViewState copy$default(IsaContributionBottomSheetViewState isaContributionBottomSheetViewState, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = isaContributionBottomSheetViewState.taxYearLabel;
        }
        if ((i & 2) != 0) {
            str2 = isaContributionBottomSheetViewState.contributed;
        }
        if ((i & 4) != 0) {
            str3 = isaContributionBottomSheetViewState.remaining;
        }
        if ((i & 8) != 0) {
            str4 = isaContributionBottomSheetViewState.allowance;
        }
        return isaContributionBottomSheetViewState.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTaxYearLabel() {
        return this.taxYearLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContributed() {
        return this.contributed;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemaining() {
        return this.remaining;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAllowance() {
        return this.allowance;
    }

    public final IsaContributionBottomSheetViewState copy(String taxYearLabel, String contributed, String remaining, String allowance) {
        Intrinsics.checkNotNullParameter(taxYearLabel, "taxYearLabel");
        Intrinsics.checkNotNullParameter(contributed, "contributed");
        Intrinsics.checkNotNullParameter(remaining, "remaining");
        Intrinsics.checkNotNullParameter(allowance, "allowance");
        return new IsaContributionBottomSheetViewState(taxYearLabel, contributed, remaining, allowance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaContributionBottomSheetViewState)) {
            return false;
        }
        IsaContributionBottomSheetViewState isaContributionBottomSheetViewState = (IsaContributionBottomSheetViewState) other;
        return Intrinsics.areEqual(this.taxYearLabel, isaContributionBottomSheetViewState.taxYearLabel) && Intrinsics.areEqual(this.contributed, isaContributionBottomSheetViewState.contributed) && Intrinsics.areEqual(this.remaining, isaContributionBottomSheetViewState.remaining) && Intrinsics.areEqual(this.allowance, isaContributionBottomSheetViewState.allowance);
    }

    public int hashCode() {
        return (((((this.taxYearLabel.hashCode() * 31) + this.contributed.hashCode()) * 31) + this.remaining.hashCode()) * 31) + this.allowance.hashCode();
    }

    public String toString() {
        return "IsaContributionBottomSheetViewState(taxYearLabel=" + this.taxYearLabel + ", contributed=" + this.contributed + ", remaining=" + this.remaining + ", allowance=" + this.allowance + ")";
    }

    public IsaContributionBottomSheetViewState(String taxYearLabel, String contributed, String remaining, String allowance) {
        Intrinsics.checkNotNullParameter(taxYearLabel, "taxYearLabel");
        Intrinsics.checkNotNullParameter(contributed, "contributed");
        Intrinsics.checkNotNullParameter(remaining, "remaining");
        Intrinsics.checkNotNullParameter(allowance, "allowance");
        this.taxYearLabel = taxYearLabel;
        this.contributed = contributed;
        this.remaining = remaining;
        this.allowance = allowance;
    }

    public final String getTaxYearLabel() {
        return this.taxYearLabel;
    }

    public final String getContributed() {
        return this.contributed;
    }

    public final String getRemaining() {
        return this.remaining;
    }

    public final String getAllowance() {
        return this.allowance;
    }
}
