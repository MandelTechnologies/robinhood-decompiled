package com.robinhood.android.advisory.insights.detail;

import kotlin.Metadata;

/* compiled from: AdvisoryInsightDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/NavButtonsVisibility;", "", "showPrevNavButton", "", "showNextNavButton", "<init>", "(ZZ)V", "getShowPrevNavButton", "()Z", "getShowNextNavButton", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class NavButtonsVisibility {
    public static final int $stable = 0;
    private final boolean showNextNavButton;
    private final boolean showPrevNavButton;

    public static /* synthetic */ NavButtonsVisibility copy$default(NavButtonsVisibility navButtonsVisibility, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = navButtonsVisibility.showPrevNavButton;
        }
        if ((i & 2) != 0) {
            z2 = navButtonsVisibility.showNextNavButton;
        }
        return navButtonsVisibility.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowPrevNavButton() {
        return this.showPrevNavButton;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowNextNavButton() {
        return this.showNextNavButton;
    }

    public final NavButtonsVisibility copy(boolean showPrevNavButton, boolean showNextNavButton) {
        return new NavButtonsVisibility(showPrevNavButton, showNextNavButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavButtonsVisibility)) {
            return false;
        }
        NavButtonsVisibility navButtonsVisibility = (NavButtonsVisibility) other;
        return this.showPrevNavButton == navButtonsVisibility.showPrevNavButton && this.showNextNavButton == navButtonsVisibility.showNextNavButton;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.showPrevNavButton) * 31) + Boolean.hashCode(this.showNextNavButton);
    }

    public String toString() {
        return "NavButtonsVisibility(showPrevNavButton=" + this.showPrevNavButton + ", showNextNavButton=" + this.showNextNavButton + ")";
    }

    public NavButtonsVisibility(boolean z, boolean z2) {
        this.showPrevNavButton = z;
        this.showNextNavButton = z2;
    }

    public final boolean getShowPrevNavButton() {
        return this.showPrevNavButton;
    }

    public final boolean getShowNextNavButton() {
        return this.showNextNavButton;
    }
}
