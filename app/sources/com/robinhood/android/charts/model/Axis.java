package com.robinhood.android.charts.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Axis.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Axis;", "", "labels", "", "Lcom/robinhood/android/charts/model/AxisLabel;", "range", "Lcom/robinhood/android/charts/model/AxisRange;", "effectiveRange", "scrubLabels", "Lcom/robinhood/android/charts/model/AxisScrubLabel;", "type", "Lcom/robinhood/android/charts/model/AxisType;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/charts/model/AxisRange;Lcom/robinhood/android/charts/model/AxisRange;Ljava/util/List;Lcom/robinhood/android/charts/model/AxisType;)V", "getLabels", "()Ljava/util/List;", "getRange", "()Lcom/robinhood/android/charts/model/AxisRange;", "getEffectiveRange", "getScrubLabels", "getType", "()Lcom/robinhood/android/charts/model/AxisType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Axis {
    public static final int $stable = 8;
    private final AxisRange<?> effectiveRange;
    private final List<AxisLabel> labels;
    private final AxisRange<?> range;
    private final List<AxisScrubLabel> scrubLabels;
    private final AxisType type;

    public static /* synthetic */ Axis copy$default(Axis axis, List list, AxisRange axisRange, AxisRange axisRange2, List list2, AxisType axisType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = axis.labels;
        }
        if ((i & 2) != 0) {
            axisRange = axis.range;
        }
        if ((i & 4) != 0) {
            axisRange2 = axis.effectiveRange;
        }
        if ((i & 8) != 0) {
            list2 = axis.scrubLabels;
        }
        if ((i & 16) != 0) {
            axisType = axis.type;
        }
        AxisType axisType2 = axisType;
        AxisRange axisRange3 = axisRange2;
        return axis.copy(list, axisRange, axisRange3, list2, axisType2);
    }

    public final List<AxisLabel> component1() {
        return this.labels;
    }

    public final AxisRange<?> component2() {
        return this.range;
    }

    public final AxisRange<?> component3() {
        return this.effectiveRange;
    }

    public final List<AxisScrubLabel> component4() {
        return this.scrubLabels;
    }

    /* renamed from: component5, reason: from getter */
    public final AxisType getType() {
        return this.type;
    }

    public final Axis copy(List<AxisLabel> labels, AxisRange<?> range, AxisRange<?> effectiveRange, List<AxisScrubLabel> scrubLabels, AxisType type2) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(scrubLabels, "scrubLabels");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new Axis(labels, range, effectiveRange, scrubLabels, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Axis)) {
            return false;
        }
        Axis axis = (Axis) other;
        return Intrinsics.areEqual(this.labels, axis.labels) && Intrinsics.areEqual(this.range, axis.range) && Intrinsics.areEqual(this.effectiveRange, axis.effectiveRange) && Intrinsics.areEqual(this.scrubLabels, axis.scrubLabels) && this.type == axis.type;
    }

    public int hashCode() {
        int iHashCode = this.labels.hashCode() * 31;
        AxisRange<?> axisRange = this.range;
        int iHashCode2 = (iHashCode + (axisRange == null ? 0 : axisRange.hashCode())) * 31;
        AxisRange<?> axisRange2 = this.effectiveRange;
        return ((((iHashCode2 + (axisRange2 != null ? axisRange2.hashCode() : 0)) * 31) + this.scrubLabels.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Axis(labels=" + this.labels + ", range=" + this.range + ", effectiveRange=" + this.effectiveRange + ", scrubLabels=" + this.scrubLabels + ", type=" + this.type + ")";
    }

    public Axis(List<AxisLabel> labels, AxisRange<?> axisRange, AxisRange<?> axisRange2, List<AxisScrubLabel> scrubLabels, AxisType type2) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(scrubLabels, "scrubLabels");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.labels = labels;
        this.range = axisRange;
        this.effectiveRange = axisRange2;
        this.scrubLabels = scrubLabels;
        this.type = type2;
    }

    public final List<AxisLabel> getLabels() {
        return this.labels;
    }

    public final AxisRange<?> getRange() {
        return this.range;
    }

    public final AxisRange<?> getEffectiveRange() {
        return this.effectiveRange;
    }

    public final List<AxisScrubLabel> getScrubLabels() {
        return this.scrubLabels;
    }

    public final AxisType getType() {
        return this.type;
    }
}
