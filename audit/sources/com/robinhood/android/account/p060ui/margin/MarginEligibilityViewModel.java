package com.robinhood.android.account.p060ui.margin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginEligibilityViewModel.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "", "isEligibleForMargin", "", "ineligibilityTitle", "", "ineligibilityContentMarkdown", "hideSwitchToMarginCta", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Z", "getIneligibilityTitle", "()Ljava/lang/String;", "getIneligibilityContentMarkdown", "getHideSwitchToMarginCta", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "equals", "other", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class MarginEligibilityViewModel {
    public static final int $stable = 0;
    private final Boolean hideSwitchToMarginCta;
    private final String ineligibilityContentMarkdown;
    private final String ineligibilityTitle;
    private final boolean isEligibleForMargin;

    public static /* synthetic */ MarginEligibilityViewModel copy$default(MarginEligibilityViewModel marginEligibilityViewModel, boolean z, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = marginEligibilityViewModel.isEligibleForMargin;
        }
        if ((i & 2) != 0) {
            str = marginEligibilityViewModel.ineligibilityTitle;
        }
        if ((i & 4) != 0) {
            str2 = marginEligibilityViewModel.ineligibilityContentMarkdown;
        }
        if ((i & 8) != 0) {
            bool = marginEligibilityViewModel.hideSwitchToMarginCta;
        }
        return marginEligibilityViewModel.copy(z, str, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEligibleForMargin() {
        return this.isEligibleForMargin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIneligibilityTitle() {
        return this.ineligibilityTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIneligibilityContentMarkdown() {
        return this.ineligibilityContentMarkdown;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getHideSwitchToMarginCta() {
        return this.hideSwitchToMarginCta;
    }

    public final MarginEligibilityViewModel copy(boolean isEligibleForMargin, String ineligibilityTitle, String ineligibilityContentMarkdown, Boolean hideSwitchToMarginCta) {
        return new MarginEligibilityViewModel(isEligibleForMargin, ineligibilityTitle, ineligibilityContentMarkdown, hideSwitchToMarginCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginEligibilityViewModel)) {
            return false;
        }
        MarginEligibilityViewModel marginEligibilityViewModel = (MarginEligibilityViewModel) other;
        return this.isEligibleForMargin == marginEligibilityViewModel.isEligibleForMargin && Intrinsics.areEqual(this.ineligibilityTitle, marginEligibilityViewModel.ineligibilityTitle) && Intrinsics.areEqual(this.ineligibilityContentMarkdown, marginEligibilityViewModel.ineligibilityContentMarkdown) && Intrinsics.areEqual(this.hideSwitchToMarginCta, marginEligibilityViewModel.hideSwitchToMarginCta);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEligibleForMargin) * 31;
        String str = this.ineligibilityTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ineligibilityContentMarkdown;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hideSwitchToMarginCta;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "MarginEligibilityViewModel(isEligibleForMargin=" + this.isEligibleForMargin + ", ineligibilityTitle=" + this.ineligibilityTitle + ", ineligibilityContentMarkdown=" + this.ineligibilityContentMarkdown + ", hideSwitchToMarginCta=" + this.hideSwitchToMarginCta + ")";
    }

    public MarginEligibilityViewModel(boolean z, String str, String str2, Boolean bool) {
        this.isEligibleForMargin = z;
        this.ineligibilityTitle = str;
        this.ineligibilityContentMarkdown = str2;
        this.hideSwitchToMarginCta = bool;
    }

    public final boolean isEligibleForMargin() {
        return this.isEligibleForMargin;
    }

    public final String getIneligibilityTitle() {
        return this.ineligibilityTitle;
    }

    public final String getIneligibilityContentMarkdown() {
        return this.ineligibilityContentMarkdown;
    }

    public final Boolean getHideSwitchToMarginCta() {
        return this.hideSwitchToMarginCta;
    }
}
