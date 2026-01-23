package com.robinhood.android.advisory.dashboard.overview;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryChartSwitcher.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption;", "", "Chart", "Value", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption$Chart;", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption$Value;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.AdvisorySwitcherOption, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvisoryChartSwitcher4 {

    /* compiled from: AdvisoryChartSwitcher.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption$Chart;", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption;", "chart", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "showUnreadIndicator", "", "<init>", "(Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;Z)V", "getChart", "()Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "getShowUnreadIndicator", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.AdvisorySwitcherOption$Chart, reason: from toString */
    public static final /* data */ class Chart implements AdvisoryChartSwitcher4 {
        public static final int $stable = 0;
        private final AdvisoryChartSwitcher chart;
        private final boolean showUnreadIndicator;

        public static /* synthetic */ Chart copy$default(Chart chart, AdvisoryChartSwitcher advisoryChartSwitcher, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                advisoryChartSwitcher = chart.chart;
            }
            if ((i & 2) != 0) {
                z = chart.showUnreadIndicator;
            }
            return chart.copy(advisoryChartSwitcher, z);
        }

        /* renamed from: component1, reason: from getter */
        public final AdvisoryChartSwitcher getChart() {
            return this.chart;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowUnreadIndicator() {
            return this.showUnreadIndicator;
        }

        public final Chart copy(AdvisoryChartSwitcher chart, boolean showUnreadIndicator) {
            Intrinsics.checkNotNullParameter(chart, "chart");
            return new Chart(chart, showUnreadIndicator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chart)) {
                return false;
            }
            Chart chart = (Chart) other;
            return this.chart == chart.chart && this.showUnreadIndicator == chart.showUnreadIndicator;
        }

        public int hashCode() {
            return (this.chart.hashCode() * 31) + Boolean.hashCode(this.showUnreadIndicator);
        }

        public String toString() {
            return "Chart(chart=" + this.chart + ", showUnreadIndicator=" + this.showUnreadIndicator + ")";
        }

        public Chart(AdvisoryChartSwitcher chart, boolean z) {
            Intrinsics.checkNotNullParameter(chart, "chart");
            this.chart = chart;
            this.showUnreadIndicator = z;
        }

        public /* synthetic */ Chart(AdvisoryChartSwitcher advisoryChartSwitcher, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(advisoryChartSwitcher, (i & 2) != 0 ? false : z);
        }

        public final AdvisoryChartSwitcher getChart() {
            return this.chart;
        }

        public final boolean getShowUnreadIndicator() {
            return this.showUnreadIndicator;
        }
    }

    /* compiled from: AdvisoryChartSwitcher.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption$Value;", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption;", "text", "", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getContentDescription", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.AdvisorySwitcherOption$Value, reason: from toString */
    public static final /* data */ class Value implements AdvisoryChartSwitcher4 {
        public static final int $stable = 0;
        private final String contentDescription;
        private final String text;

        public static /* synthetic */ Value copy$default(Value value, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = value.text;
            }
            if ((i & 2) != 0) {
                str2 = value.contentDescription;
            }
            return value.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final Value copy(String text, String contentDescription) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            return new Value(text, contentDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return Intrinsics.areEqual(this.text, value.text) && Intrinsics.areEqual(this.contentDescription, value.contentDescription);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.contentDescription.hashCode();
        }

        public String toString() {
            return "Value(text=" + this.text + ", contentDescription=" + this.contentDescription + ")";
        }

        public Value(String text, String contentDescription) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            this.text = text;
            this.contentDescription = contentDescription;
        }

        public /* synthetic */ Value(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? str : str2);
        }

        public final String getText() {
            return this.text;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }
    }
}
