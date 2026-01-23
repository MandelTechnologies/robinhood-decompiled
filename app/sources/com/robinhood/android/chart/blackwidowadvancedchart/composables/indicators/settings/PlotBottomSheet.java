package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import black_widow.contracts.mobile_app_chart.proto.p024v1.LineColorDto;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlotSettings.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet;", "", "Closed", "Color", "LineThickness", "DisplayType", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet$Closed;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet$Color;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet$DisplayType;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet$LineThickness;", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface PlotBottomSheet {

    /* compiled from: PlotSettings.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet$Closed;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Closed implements PlotBottomSheet {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();

        public boolean equals(Object other) {
            return this == other || (other instanceof Closed);
        }

        public int hashCode() {
            return -544076095;
        }

        public String toString() {
            return "Closed";
        }

        private Closed() {
        }
    }

    /* compiled from: PlotSettings.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet$Color;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet;", "line", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;I)V", "getLine", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Color implements PlotBottomSheet {
        public static final int $stable = 8;
        private final int index;
        private final LineColorDto line;

        public static /* synthetic */ Color copy$default(Color color, LineColorDto lineColorDto, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                lineColorDto = color.line;
            }
            if ((i2 & 2) != 0) {
                i = color.index;
            }
            return color.copy(lineColorDto, i);
        }

        /* renamed from: component1, reason: from getter */
        public final LineColorDto getLine() {
            return this.line;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final Color copy(LineColorDto line, int index) {
            Intrinsics.checkNotNullParameter(line, "line");
            return new Color(line, index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Color)) {
                return false;
            }
            Color color = (Color) other;
            return Intrinsics.areEqual(this.line, color.line) && this.index == color.index;
        }

        public int hashCode() {
            return (this.line.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "Color(line=" + this.line + ", index=" + this.index + ")";
        }

        public Color(LineColorDto line, int i) {
            Intrinsics.checkNotNullParameter(line, "line");
            this.line = line;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LineColorDto getLine() {
            return this.line;
        }
    }

    /* compiled from: PlotSettings.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet$LineThickness;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LineThickness implements PlotBottomSheet {
        public static final int $stable = 0;
        public static final LineThickness INSTANCE = new LineThickness();

        public boolean equals(Object other) {
            return this == other || (other instanceof LineThickness);
        }

        public int hashCode() {
            return -59690261;
        }

        public String toString() {
            return "LineThickness";
        }

        private LineThickness() {
        }
    }

    /* compiled from: PlotSettings.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet$DisplayType;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayType implements PlotBottomSheet {
        public static final int $stable = 0;
        public static final DisplayType INSTANCE = new DisplayType();

        public boolean equals(Object other) {
            return this == other || (other instanceof DisplayType);
        }

        public int hashCode() {
            return 2119355111;
        }

        public String toString() {
            return "DisplayType";
        }

        private DisplayType() {
        }
    }
}
