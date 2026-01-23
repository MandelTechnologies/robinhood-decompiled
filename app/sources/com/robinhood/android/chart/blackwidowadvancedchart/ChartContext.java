package com.robinhood.android.chart.blackwidowadvancedchart;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/ChartContext;", "", "selectedSpan", "", "selectedInterval", "selectedTemplate", "activeIndicators", "", "instrumentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getSelectedSpan", "()Ljava/lang/String;", "getSelectedInterval", "getSelectedTemplate", "getActiveIndicators", "()Ljava/util/List;", "getInstrumentId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChartContext {
    public static final int $stable = 8;
    private final List<String> activeIndicators;
    private final String instrumentId;
    private final String selectedInterval;
    private final String selectedSpan;
    private final String selectedTemplate;

    public static /* synthetic */ ChartContext copy$default(ChartContext chartContext, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartContext.selectedSpan;
        }
        if ((i & 2) != 0) {
            str2 = chartContext.selectedInterval;
        }
        if ((i & 4) != 0) {
            str3 = chartContext.selectedTemplate;
        }
        if ((i & 8) != 0) {
            list = chartContext.activeIndicators;
        }
        if ((i & 16) != 0) {
            str4 = chartContext.instrumentId;
        }
        String str5 = str4;
        String str6 = str3;
        return chartContext.copy(str, str2, str6, list, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSelectedSpan() {
        return this.selectedSpan;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedInterval() {
        return this.selectedInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedTemplate() {
        return this.selectedTemplate;
    }

    public final List<String> component4() {
        return this.activeIndicators;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final ChartContext copy(String selectedSpan, String selectedInterval, String selectedTemplate, List<String> activeIndicators, String instrumentId) {
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        Intrinsics.checkNotNullParameter(selectedInterval, "selectedInterval");
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        Intrinsics.checkNotNullParameter(activeIndicators, "activeIndicators");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new ChartContext(selectedSpan, selectedInterval, selectedTemplate, activeIndicators, instrumentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartContext)) {
            return false;
        }
        ChartContext chartContext = (ChartContext) other;
        return Intrinsics.areEqual(this.selectedSpan, chartContext.selectedSpan) && Intrinsics.areEqual(this.selectedInterval, chartContext.selectedInterval) && Intrinsics.areEqual(this.selectedTemplate, chartContext.selectedTemplate) && Intrinsics.areEqual(this.activeIndicators, chartContext.activeIndicators) && Intrinsics.areEqual(this.instrumentId, chartContext.instrumentId);
    }

    public int hashCode() {
        return (((((((this.selectedSpan.hashCode() * 31) + this.selectedInterval.hashCode()) * 31) + this.selectedTemplate.hashCode()) * 31) + this.activeIndicators.hashCode()) * 31) + this.instrumentId.hashCode();
    }

    public String toString() {
        return "ChartContext(selectedSpan=" + this.selectedSpan + ", selectedInterval=" + this.selectedInterval + ", selectedTemplate=" + this.selectedTemplate + ", activeIndicators=" + this.activeIndicators + ", instrumentId=" + this.instrumentId + ")";
    }

    public ChartContext(String selectedSpan, String selectedInterval, String selectedTemplate, List<String> activeIndicators, String instrumentId) {
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        Intrinsics.checkNotNullParameter(selectedInterval, "selectedInterval");
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        Intrinsics.checkNotNullParameter(activeIndicators, "activeIndicators");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.selectedSpan = selectedSpan;
        this.selectedInterval = selectedInterval;
        this.selectedTemplate = selectedTemplate;
        this.activeIndicators = activeIndicators;
        this.instrumentId = instrumentId;
    }

    public final String getSelectedSpan() {
        return this.selectedSpan;
    }

    public final String getSelectedInterval() {
        return this.selectedInterval;
    }

    public final String getSelectedTemplate() {
        return this.selectedTemplate;
    }

    public final List<String> getActiveIndicators() {
        return this.activeIndicators;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }
}
