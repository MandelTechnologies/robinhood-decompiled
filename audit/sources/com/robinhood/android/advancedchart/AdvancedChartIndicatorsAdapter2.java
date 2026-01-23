package com.robinhood.android.advancedchart;

import com.robinhood.android.advanced.chart.IndicatorState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartIndicatorsAdapter.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/ChartIndicatorListItem;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "ControlButtonHeader", "EmptyStateAddDataHeader", "IndicatorStateItem", "Lcom/robinhood/android/advancedchart/ChartIndicatorListItem$ControlButtonHeader;", "Lcom/robinhood/android/advancedchart/ChartIndicatorListItem$EmptyStateAddDataHeader;", "Lcom/robinhood/android/advancedchart/ChartIndicatorListItem$IndicatorStateItem;", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.ChartIndicatorListItem, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AdvancedChartIndicatorsAdapter2 {
    public static final int $stable = 0;
    private final String id;

    public /* synthetic */ AdvancedChartIndicatorsAdapter2(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AdvancedChartIndicatorsAdapter2(String str) {
        this.id = str;
    }

    public String getId() {
        return this.id;
    }

    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/ChartIndicatorListItem$ControlButtonHeader;", "Lcom/robinhood/android/advancedchart/ChartIndicatorListItem;", "isEditSurfaceIconEnabled", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advancedchart.ChartIndicatorListItem$ControlButtonHeader, reason: from toString */
    public static final /* data */ class ControlButtonHeader extends AdvancedChartIndicatorsAdapter2 {
        public static final int $stable = 0;
        private final boolean isEditSurfaceIconEnabled;

        public static /* synthetic */ ControlButtonHeader copy$default(ControlButtonHeader controlButtonHeader, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = controlButtonHeader.isEditSurfaceIconEnabled;
            }
            return controlButtonHeader.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEditSurfaceIconEnabled() {
            return this.isEditSurfaceIconEnabled;
        }

        public final ControlButtonHeader copy(boolean isEditSurfaceIconEnabled) {
            return new ControlButtonHeader(isEditSurfaceIconEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ControlButtonHeader) && this.isEditSurfaceIconEnabled == ((ControlButtonHeader) other).isEditSurfaceIconEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEditSurfaceIconEnabled);
        }

        public String toString() {
            return "ControlButtonHeader(isEditSurfaceIconEnabled=" + this.isEditSurfaceIconEnabled + ")";
        }

        public final boolean isEditSurfaceIconEnabled() {
            return this.isEditSurfaceIconEnabled;
        }

        public ControlButtonHeader(boolean z) {
            super("controlButtonHeader", null);
            this.isEditSurfaceIconEnabled = z;
        }
    }

    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/ChartIndicatorListItem$EmptyStateAddDataHeader;", "Lcom/robinhood/android/advancedchart/ChartIndicatorListItem;", "<init>", "()V", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advancedchart.ChartIndicatorListItem$EmptyStateAddDataHeader */
    public static final class EmptyStateAddDataHeader extends AdvancedChartIndicatorsAdapter2 {
        public static final int $stable = 0;
        public static final EmptyStateAddDataHeader INSTANCE = new EmptyStateAddDataHeader();

        private EmptyStateAddDataHeader() {
            super("emptyStateAddDataHeader", null);
        }
    }

    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/ChartIndicatorListItem$IndicatorStateItem;", "Lcom/robinhood/android/advancedchart/ChartIndicatorListItem;", "state", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "isTapScrollEnabled", "", "<init>", "(Lcom/robinhood/android/advanced/chart/IndicatorState;Z)V", "getState", "()Lcom/robinhood/android/advanced/chart/IndicatorState;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advancedchart.ChartIndicatorListItem$IndicatorStateItem, reason: from toString */
    public static final /* data */ class IndicatorStateItem extends AdvancedChartIndicatorsAdapter2 {
        public static final int $stable = 8;
        private final boolean isTapScrollEnabled;
        private final IndicatorState state;

        public static /* synthetic */ IndicatorStateItem copy$default(IndicatorStateItem indicatorStateItem, IndicatorState indicatorState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                indicatorState = indicatorStateItem.state;
            }
            if ((i & 2) != 0) {
                z = indicatorStateItem.isTapScrollEnabled;
            }
            return indicatorStateItem.copy(indicatorState, z);
        }

        /* renamed from: component1, reason: from getter */
        public final IndicatorState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsTapScrollEnabled() {
            return this.isTapScrollEnabled;
        }

        public final IndicatorStateItem copy(IndicatorState state, boolean isTapScrollEnabled) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new IndicatorStateItem(state, isTapScrollEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndicatorStateItem)) {
                return false;
            }
            IndicatorStateItem indicatorStateItem = (IndicatorStateItem) other;
            return Intrinsics.areEqual(this.state, indicatorStateItem.state) && this.isTapScrollEnabled == indicatorStateItem.isTapScrollEnabled;
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + Boolean.hashCode(this.isTapScrollEnabled);
        }

        public String toString() {
            return "IndicatorStateItem(state=" + this.state + ", isTapScrollEnabled=" + this.isTapScrollEnabled + ")";
        }

        public final IndicatorState getState() {
            return this.state;
        }

        public final boolean isTapScrollEnabled() {
            return this.isTapScrollEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IndicatorStateItem(IndicatorState state, boolean z) {
            super(state.getId(), null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.isTapScrollEnabled = z;
        }
    }
}
