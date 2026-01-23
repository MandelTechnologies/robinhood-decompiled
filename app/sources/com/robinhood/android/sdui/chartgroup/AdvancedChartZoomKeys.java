package com.robinhood.android.sdui.chartgroup;

import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/AdvancedChartZoomKeys;", "", "displaySpan", "", "hideExtendedHours", "", "interval", "showCandlestick", "technicalIndicators", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V", "getDisplaySpan", "()Ljava/lang/String;", "getHideExtendedHours", "()Z", "getInterval", "getShowCandlestick", "getTechnicalIndicators", "xZoomRangeResetKey", "getXZoomRangeResetKey", "()Ljava/lang/Object;", "xZoomRangeValidationKey", "getXZoomRangeValidationKey", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdvancedChartZoomKeys {
    public static final int $stable = 8;
    private final String displaySpan;
    private final boolean hideExtendedHours;
    private final String interval;
    private final boolean showCandlestick;
    private final String technicalIndicators;
    private final Object xZoomRangeResetKey;
    private final Object xZoomRangeValidationKey;

    public static /* synthetic */ AdvancedChartZoomKeys copy$default(AdvancedChartZoomKeys advancedChartZoomKeys, String str, boolean z, String str2, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advancedChartZoomKeys.displaySpan;
        }
        if ((i & 2) != 0) {
            z = advancedChartZoomKeys.hideExtendedHours;
        }
        if ((i & 4) != 0) {
            str2 = advancedChartZoomKeys.interval;
        }
        if ((i & 8) != 0) {
            z2 = advancedChartZoomKeys.showCandlestick;
        }
        if ((i & 16) != 0) {
            str3 = advancedChartZoomKeys.technicalIndicators;
        }
        String str4 = str3;
        String str5 = str2;
        return advancedChartZoomKeys.copy(str, z, str5, z2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplaySpan() {
        return this.displaySpan;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHideExtendedHours() {
        return this.hideExtendedHours;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInterval() {
        return this.interval;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCandlestick() {
        return this.showCandlestick;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTechnicalIndicators() {
        return this.technicalIndicators;
    }

    public final AdvancedChartZoomKeys copy(String displaySpan, boolean hideExtendedHours, String interval, boolean showCandlestick, String technicalIndicators) {
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(technicalIndicators, "technicalIndicators");
        return new AdvancedChartZoomKeys(displaySpan, hideExtendedHours, interval, showCandlestick, technicalIndicators);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedChartZoomKeys)) {
            return false;
        }
        AdvancedChartZoomKeys advancedChartZoomKeys = (AdvancedChartZoomKeys) other;
        return Intrinsics.areEqual(this.displaySpan, advancedChartZoomKeys.displaySpan) && this.hideExtendedHours == advancedChartZoomKeys.hideExtendedHours && Intrinsics.areEqual(this.interval, advancedChartZoomKeys.interval) && this.showCandlestick == advancedChartZoomKeys.showCandlestick && Intrinsics.areEqual(this.technicalIndicators, advancedChartZoomKeys.technicalIndicators);
    }

    public int hashCode() {
        return (((((((this.displaySpan.hashCode() * 31) + Boolean.hashCode(this.hideExtendedHours)) * 31) + this.interval.hashCode()) * 31) + Boolean.hashCode(this.showCandlestick)) * 31) + this.technicalIndicators.hashCode();
    }

    public String toString() {
        return "AdvancedChartZoomKeys(displaySpan=" + this.displaySpan + ", hideExtendedHours=" + this.hideExtendedHours + ", interval=" + this.interval + ", showCandlestick=" + this.showCandlestick + ", technicalIndicators=" + this.technicalIndicators + ")";
    }

    public AdvancedChartZoomKeys(String displaySpan, boolean z, String interval, boolean z2, String technicalIndicators) {
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(technicalIndicators, "technicalIndicators");
        this.displaySpan = displaySpan;
        this.hideExtendedHours = z;
        this.interval = interval;
        this.showCandlestick = z2;
        this.technicalIndicators = technicalIndicators;
        this.xZoomRangeResetKey = Tuples4.m3642to(displaySpan, Boolean.valueOf(z));
        this.xZoomRangeValidationKey = new Tuples3(interval, Boolean.valueOf(z2), technicalIndicators);
    }

    public final String getDisplaySpan() {
        return this.displaySpan;
    }

    public final boolean getHideExtendedHours() {
        return this.hideExtendedHours;
    }

    public final String getInterval() {
        return this.interval;
    }

    public final boolean getShowCandlestick() {
        return this.showCandlestick;
    }

    public final String getTechnicalIndicators() {
        return this.technicalIndicators;
    }

    public final Object getXZoomRangeResetKey() {
        return this.xZoomRangeResetKey;
    }

    public final Object getXZoomRangeValidationKey() {
        return this.xZoomRangeValidationKey;
    }
}
