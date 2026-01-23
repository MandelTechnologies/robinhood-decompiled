package com.robinhood.android.lib.margin.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InterestRateModels.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/MarginInterestRates;", "", "standard", "Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice;", AnalyticsStrings.TAB_NAV_TAB_BAR_GOLD_UPGRADE, "<init>", "(Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice;Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice;)V", "getStandard", "()Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice;", "getGold", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginInterestRates {
    private final MarginInterestRateChoice gold;
    private final MarginInterestRateChoice standard;

    public static /* synthetic */ MarginInterestRates copy$default(MarginInterestRates marginInterestRates, MarginInterestRateChoice marginInterestRateChoice, MarginInterestRateChoice marginInterestRateChoice2, int i, Object obj) {
        if ((i & 1) != 0) {
            marginInterestRateChoice = marginInterestRates.standard;
        }
        if ((i & 2) != 0) {
            marginInterestRateChoice2 = marginInterestRates.gold;
        }
        return marginInterestRates.copy(marginInterestRateChoice, marginInterestRateChoice2);
    }

    /* renamed from: component1, reason: from getter */
    public final MarginInterestRateChoice getStandard() {
        return this.standard;
    }

    /* renamed from: component2, reason: from getter */
    public final MarginInterestRateChoice getGold() {
        return this.gold;
    }

    public final MarginInterestRates copy(MarginInterestRateChoice standard, MarginInterestRateChoice gold2) {
        Intrinsics.checkNotNullParameter(standard, "standard");
        return new MarginInterestRates(standard, gold2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginInterestRates)) {
            return false;
        }
        MarginInterestRates marginInterestRates = (MarginInterestRates) other;
        return Intrinsics.areEqual(this.standard, marginInterestRates.standard) && Intrinsics.areEqual(this.gold, marginInterestRates.gold);
    }

    public int hashCode() {
        int iHashCode = this.standard.hashCode() * 31;
        MarginInterestRateChoice marginInterestRateChoice = this.gold;
        return iHashCode + (marginInterestRateChoice == null ? 0 : marginInterestRateChoice.hashCode());
    }

    public String toString() {
        return "MarginInterestRates(standard=" + this.standard + ", gold=" + this.gold + ")";
    }

    public MarginInterestRates(MarginInterestRateChoice standard, MarginInterestRateChoice marginInterestRateChoice) {
        Intrinsics.checkNotNullParameter(standard, "standard");
        this.standard = standard;
        this.gold = marginInterestRateChoice;
    }

    public final MarginInterestRateChoice getStandard() {
        return this.standard;
    }

    public final MarginInterestRateChoice getGold() {
        return this.gold;
    }
}
