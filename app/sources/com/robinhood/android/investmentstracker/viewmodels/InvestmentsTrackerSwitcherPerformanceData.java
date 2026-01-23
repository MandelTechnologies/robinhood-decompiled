package com.robinhood.android.investmentstracker.viewmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerSwitcherViewModel.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherPerformanceData;", "", "percent", "", "deltaAmount", "", "timeText", "timeTextOverride", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPercent", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDeltaAmount", "()Ljava/lang/String;", "getTimeText", "getTimeTextOverride", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherPerformanceData;", "equals", "", "other", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerSwitcherPerformanceData {
    public static final int $stable = 0;
    private final String deltaAmount;
    private final Double percent;
    private final String timeText;
    private final String timeTextOverride;

    public static /* synthetic */ InvestmentsTrackerSwitcherPerformanceData copy$default(InvestmentsTrackerSwitcherPerformanceData investmentsTrackerSwitcherPerformanceData, Double d, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = investmentsTrackerSwitcherPerformanceData.percent;
        }
        if ((i & 2) != 0) {
            str = investmentsTrackerSwitcherPerformanceData.deltaAmount;
        }
        if ((i & 4) != 0) {
            str2 = investmentsTrackerSwitcherPerformanceData.timeText;
        }
        if ((i & 8) != 0) {
            str3 = investmentsTrackerSwitcherPerformanceData.timeTextOverride;
        }
        return investmentsTrackerSwitcherPerformanceData.copy(d, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getPercent() {
        return this.percent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeltaAmount() {
        return this.deltaAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTimeText() {
        return this.timeText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTimeTextOverride() {
        return this.timeTextOverride;
    }

    public final InvestmentsTrackerSwitcherPerformanceData copy(Double percent, String deltaAmount, String timeText, String timeTextOverride) {
        return new InvestmentsTrackerSwitcherPerformanceData(percent, deltaAmount, timeText, timeTextOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerSwitcherPerformanceData)) {
            return false;
        }
        InvestmentsTrackerSwitcherPerformanceData investmentsTrackerSwitcherPerformanceData = (InvestmentsTrackerSwitcherPerformanceData) other;
        return Intrinsics.areEqual((Object) this.percent, (Object) investmentsTrackerSwitcherPerformanceData.percent) && Intrinsics.areEqual(this.deltaAmount, investmentsTrackerSwitcherPerformanceData.deltaAmount) && Intrinsics.areEqual(this.timeText, investmentsTrackerSwitcherPerformanceData.timeText) && Intrinsics.areEqual(this.timeTextOverride, investmentsTrackerSwitcherPerformanceData.timeTextOverride);
    }

    public int hashCode() {
        Double d = this.percent;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.deltaAmount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeTextOverride;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "InvestmentsTrackerSwitcherPerformanceData(percent=" + this.percent + ", deltaAmount=" + this.deltaAmount + ", timeText=" + this.timeText + ", timeTextOverride=" + this.timeTextOverride + ")";
    }

    public InvestmentsTrackerSwitcherPerformanceData(Double d, String str, String str2, String str3) {
        this.percent = d;
        this.deltaAmount = str;
        this.timeText = str2;
        this.timeTextOverride = str3;
    }

    public final Double getPercent() {
        return this.percent;
    }

    public final String getDeltaAmount() {
        return this.deltaAmount;
    }

    public final String getTimeText() {
        return this.timeText;
    }

    public final String getTimeTextOverride() {
        return this.timeTextOverride;
    }
}
