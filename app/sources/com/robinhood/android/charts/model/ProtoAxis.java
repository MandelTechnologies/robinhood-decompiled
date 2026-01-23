package com.robinhood.android.charts.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Axis.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/charts/model/ProtoAxis;", "", "labels", "", "Lcom/robinhood/android/charts/model/ProtoAxisLabel;", "range", "Lcom/robinhood/android/charts/model/ProtoAxisRange;", "effectiveRange", "scrubLabels", "Lcom/robinhood/android/charts/model/ProtoAxisScrubLabel;", "type", "Lcom/robinhood/android/charts/model/AxisType;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/charts/model/ProtoAxisRange;Lcom/robinhood/android/charts/model/ProtoAxisRange;Ljava/util/List;Lcom/robinhood/android/charts/model/AxisType;)V", "getLabels", "()Ljava/util/List;", "getRange", "()Lcom/robinhood/android/charts/model/ProtoAxisRange;", "getEffectiveRange", "getScrubLabels", "getType", "()Lcom/robinhood/android/charts/model/AxisType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProtoAxis {
    public static final int $stable = 8;
    private final ProtoAxisRange<?> effectiveRange;
    private final List<ProtoAxisLabel> labels;
    private final ProtoAxisRange<?> range;
    private final List<ProtoAxisScrubLabel> scrubLabels;
    private final AxisType type;

    public static /* synthetic */ ProtoAxis copy$default(ProtoAxis protoAxis, List list, ProtoAxisRange protoAxisRange, ProtoAxisRange protoAxisRange2, List list2, AxisType axisType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = protoAxis.labels;
        }
        if ((i & 2) != 0) {
            protoAxisRange = protoAxis.range;
        }
        if ((i & 4) != 0) {
            protoAxisRange2 = protoAxis.effectiveRange;
        }
        if ((i & 8) != 0) {
            list2 = protoAxis.scrubLabels;
        }
        if ((i & 16) != 0) {
            axisType = protoAxis.type;
        }
        AxisType axisType2 = axisType;
        ProtoAxisRange protoAxisRange3 = protoAxisRange2;
        return protoAxis.copy(list, protoAxisRange, protoAxisRange3, list2, axisType2);
    }

    public final List<ProtoAxisLabel> component1() {
        return this.labels;
    }

    public final ProtoAxisRange<?> component2() {
        return this.range;
    }

    public final ProtoAxisRange<?> component3() {
        return this.effectiveRange;
    }

    public final List<ProtoAxisScrubLabel> component4() {
        return this.scrubLabels;
    }

    /* renamed from: component5, reason: from getter */
    public final AxisType getType() {
        return this.type;
    }

    public final ProtoAxis copy(List<ProtoAxisLabel> labels, ProtoAxisRange<?> range, ProtoAxisRange<?> effectiveRange, List<ProtoAxisScrubLabel> scrubLabels, AxisType type2) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(scrubLabels, "scrubLabels");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new ProtoAxis(labels, range, effectiveRange, scrubLabels, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtoAxis)) {
            return false;
        }
        ProtoAxis protoAxis = (ProtoAxis) other;
        return Intrinsics.areEqual(this.labels, protoAxis.labels) && Intrinsics.areEqual(this.range, protoAxis.range) && Intrinsics.areEqual(this.effectiveRange, protoAxis.effectiveRange) && Intrinsics.areEqual(this.scrubLabels, protoAxis.scrubLabels) && this.type == protoAxis.type;
    }

    public int hashCode() {
        int iHashCode = this.labels.hashCode() * 31;
        ProtoAxisRange<?> protoAxisRange = this.range;
        int iHashCode2 = (iHashCode + (protoAxisRange == null ? 0 : protoAxisRange.hashCode())) * 31;
        ProtoAxisRange<?> protoAxisRange2 = this.effectiveRange;
        return ((((iHashCode2 + (protoAxisRange2 != null ? protoAxisRange2.hashCode() : 0)) * 31) + this.scrubLabels.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ProtoAxis(labels=" + this.labels + ", range=" + this.range + ", effectiveRange=" + this.effectiveRange + ", scrubLabels=" + this.scrubLabels + ", type=" + this.type + ")";
    }

    public ProtoAxis(List<ProtoAxisLabel> labels, ProtoAxisRange<?> protoAxisRange, ProtoAxisRange<?> protoAxisRange2, List<ProtoAxisScrubLabel> scrubLabels, AxisType type2) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(scrubLabels, "scrubLabels");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.labels = labels;
        this.range = protoAxisRange;
        this.effectiveRange = protoAxisRange2;
        this.scrubLabels = scrubLabels;
        this.type = type2;
    }

    public final List<ProtoAxisLabel> getLabels() {
        return this.labels;
    }

    public final ProtoAxisRange<?> getRange() {
        return this.range;
    }

    public final ProtoAxisRange<?> getEffectiveRange() {
        return this.effectiveRange;
    }

    public final List<ProtoAxisScrubLabel> getScrubLabels() {
        return this.scrubLabels;
    }

    public final AxisType getType() {
        return this.type;
    }
}
