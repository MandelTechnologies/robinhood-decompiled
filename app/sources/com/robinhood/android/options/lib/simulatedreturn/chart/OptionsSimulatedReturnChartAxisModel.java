package com.robinhood.android.options.lib.simulatedreturn.chart;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnChartAxis.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;", "", "axisType", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisAxisType;", "labels", "", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisLabel;", "<init>", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisAxisType;Ljava/util/List;)V", "getAxisType", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisAxisType;", "getLabels", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnChartAxisModel {
    public static final int $stable = 8;
    private final OptionsSimulatedReturnChartAxis axisType;
    private final List<OptionsSimulatedReturnChartAxisLabel> labels;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsSimulatedReturnChartAxisModel copy$default(OptionsSimulatedReturnChartAxisModel optionsSimulatedReturnChartAxisModel, OptionsSimulatedReturnChartAxis optionsSimulatedReturnChartAxis, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsSimulatedReturnChartAxis = optionsSimulatedReturnChartAxisModel.axisType;
        }
        if ((i & 2) != 0) {
            list = optionsSimulatedReturnChartAxisModel.labels;
        }
        return optionsSimulatedReturnChartAxisModel.copy(optionsSimulatedReturnChartAxis, list);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsSimulatedReturnChartAxis getAxisType() {
        return this.axisType;
    }

    public final List<OptionsSimulatedReturnChartAxisLabel> component2() {
        return this.labels;
    }

    public final OptionsSimulatedReturnChartAxisModel copy(OptionsSimulatedReturnChartAxis axisType, List<OptionsSimulatedReturnChartAxisLabel> labels) {
        Intrinsics.checkNotNullParameter(axisType, "axisType");
        Intrinsics.checkNotNullParameter(labels, "labels");
        return new OptionsSimulatedReturnChartAxisModel(axisType, labels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnChartAxisModel)) {
            return false;
        }
        OptionsSimulatedReturnChartAxisModel optionsSimulatedReturnChartAxisModel = (OptionsSimulatedReturnChartAxisModel) other;
        return this.axisType == optionsSimulatedReturnChartAxisModel.axisType && Intrinsics.areEqual(this.labels, optionsSimulatedReturnChartAxisModel.labels);
    }

    public int hashCode() {
        return (this.axisType.hashCode() * 31) + this.labels.hashCode();
    }

    public String toString() {
        return "OptionsSimulatedReturnChartAxisModel(axisType=" + this.axisType + ", labels=" + this.labels + ")";
    }

    public OptionsSimulatedReturnChartAxisModel(OptionsSimulatedReturnChartAxis axisType, List<OptionsSimulatedReturnChartAxisLabel> labels) {
        Intrinsics.checkNotNullParameter(axisType, "axisType");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.axisType = axisType;
        this.labels = labels;
    }

    public final OptionsSimulatedReturnChartAxis getAxisType() {
        return this.axisType;
    }

    public final List<OptionsSimulatedReturnChartAxisLabel> getLabels() {
        return this.labels;
    }
}
