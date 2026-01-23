package com.robinhood.android.advisory.projection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryProjectionScreen.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/HeaderContent;", "", "medianValueText", "", "selectedYear", "", "minRangeText", "maxRangeText", "currentPortfolioText", "loadingTextRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getMedianValueText", "()Ljava/lang/String;", "getSelectedYear", "()I", "getMinRangeText", "getMaxRangeText", "getCurrentPortfolioText", "getLoadingTextRes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HeaderContent {
    public static final int $stable = 0;
    private final String currentPortfolioText;
    private final int loadingTextRes;
    private final String maxRangeText;
    private final String medianValueText;
    private final String minRangeText;
    private final int selectedYear;

    public HeaderContent() {
        this(null, 0, null, null, null, 0, 63, null);
    }

    public static /* synthetic */ HeaderContent copy$default(HeaderContent headerContent, String str, int i, String str2, String str3, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = headerContent.medianValueText;
        }
        if ((i3 & 2) != 0) {
            i = headerContent.selectedYear;
        }
        if ((i3 & 4) != 0) {
            str2 = headerContent.minRangeText;
        }
        if ((i3 & 8) != 0) {
            str3 = headerContent.maxRangeText;
        }
        if ((i3 & 16) != 0) {
            str4 = headerContent.currentPortfolioText;
        }
        if ((i3 & 32) != 0) {
            i2 = headerContent.loadingTextRes;
        }
        String str5 = str4;
        int i4 = i2;
        return headerContent.copy(str, i, str2, str3, str5, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMedianValueText() {
        return this.medianValueText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedYear() {
        return this.selectedYear;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMinRangeText() {
        return this.minRangeText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMaxRangeText() {
        return this.maxRangeText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrentPortfolioText() {
        return this.currentPortfolioText;
    }

    /* renamed from: component6, reason: from getter */
    public final int getLoadingTextRes() {
        return this.loadingTextRes;
    }

    public final HeaderContent copy(String medianValueText, int selectedYear, String minRangeText, String maxRangeText, String currentPortfolioText, int loadingTextRes) {
        Intrinsics.checkNotNullParameter(medianValueText, "medianValueText");
        Intrinsics.checkNotNullParameter(minRangeText, "minRangeText");
        Intrinsics.checkNotNullParameter(maxRangeText, "maxRangeText");
        Intrinsics.checkNotNullParameter(currentPortfolioText, "currentPortfolioText");
        return new HeaderContent(medianValueText, selectedYear, minRangeText, maxRangeText, currentPortfolioText, loadingTextRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderContent)) {
            return false;
        }
        HeaderContent headerContent = (HeaderContent) other;
        return Intrinsics.areEqual(this.medianValueText, headerContent.medianValueText) && this.selectedYear == headerContent.selectedYear && Intrinsics.areEqual(this.minRangeText, headerContent.minRangeText) && Intrinsics.areEqual(this.maxRangeText, headerContent.maxRangeText) && Intrinsics.areEqual(this.currentPortfolioText, headerContent.currentPortfolioText) && this.loadingTextRes == headerContent.loadingTextRes;
    }

    public int hashCode() {
        return (((((((((this.medianValueText.hashCode() * 31) + Integer.hashCode(this.selectedYear)) * 31) + this.minRangeText.hashCode()) * 31) + this.maxRangeText.hashCode()) * 31) + this.currentPortfolioText.hashCode()) * 31) + Integer.hashCode(this.loadingTextRes);
    }

    public String toString() {
        return "HeaderContent(medianValueText=" + this.medianValueText + ", selectedYear=" + this.selectedYear + ", minRangeText=" + this.minRangeText + ", maxRangeText=" + this.maxRangeText + ", currentPortfolioText=" + this.currentPortfolioText + ", loadingTextRes=" + this.loadingTextRes + ")";
    }

    public HeaderContent(String medianValueText, int i, String minRangeText, String maxRangeText, String currentPortfolioText, int i2) {
        Intrinsics.checkNotNullParameter(medianValueText, "medianValueText");
        Intrinsics.checkNotNullParameter(minRangeText, "minRangeText");
        Intrinsics.checkNotNullParameter(maxRangeText, "maxRangeText");
        Intrinsics.checkNotNullParameter(currentPortfolioText, "currentPortfolioText");
        this.medianValueText = medianValueText;
        this.selectedYear = i;
        this.minRangeText = minRangeText;
        this.maxRangeText = maxRangeText;
        this.currentPortfolioText = currentPortfolioText;
        this.loadingTextRes = i2;
    }

    public /* synthetic */ HeaderContent(String str, int i, String str2, String str3, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? C9264R.string.projection_screen_empty_text : i2);
    }

    public final String getMedianValueText() {
        return this.medianValueText;
    }

    public final int getSelectedYear() {
        return this.selectedYear;
    }

    public final String getMinRangeText() {
        return this.minRangeText;
    }

    public final String getMaxRangeText() {
        return this.maxRangeText;
    }

    public final String getCurrentPortfolioText() {
        return this.currentPortfolioText;
    }

    public final int getLoadingTextRes() {
        return this.loadingTextRes;
    }
}
