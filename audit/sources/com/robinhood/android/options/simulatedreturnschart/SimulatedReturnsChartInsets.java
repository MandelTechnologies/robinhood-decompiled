package com.robinhood.android.options.simulatedreturnschart;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChartInsets;", "", "leftPercentageInset", "", "rightPercentageInset", "topPercentageInset", "bottomPercentageInset", "<init>", "(DDDD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLeftPercentageInset", "()D", "getRightPercentageInset", "getTopPercentageInset", "getBottomPercentageInset", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class SimulatedReturnsChartInsets {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double bottomPercentageInset;
    private final double leftPercentageInset;
    private final double rightPercentageInset;
    private final double topPercentageInset;

    public static /* synthetic */ SimulatedReturnsChartInsets copy$default(SimulatedReturnsChartInsets simulatedReturnsChartInsets, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = simulatedReturnsChartInsets.leftPercentageInset;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = simulatedReturnsChartInsets.rightPercentageInset;
        }
        double d6 = d2;
        if ((i & 4) != 0) {
            d3 = simulatedReturnsChartInsets.topPercentageInset;
        }
        return simulatedReturnsChartInsets.copy(d5, d6, d3, (i & 8) != 0 ? simulatedReturnsChartInsets.bottomPercentageInset : d4);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLeftPercentageInset() {
        return this.leftPercentageInset;
    }

    /* renamed from: component2, reason: from getter */
    public final double getRightPercentageInset() {
        return this.rightPercentageInset;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTopPercentageInset() {
        return this.topPercentageInset;
    }

    /* renamed from: component4, reason: from getter */
    public final double getBottomPercentageInset() {
        return this.bottomPercentageInset;
    }

    public final SimulatedReturnsChartInsets copy(double leftPercentageInset, double rightPercentageInset, double topPercentageInset, double bottomPercentageInset) {
        return new SimulatedReturnsChartInsets(leftPercentageInset, rightPercentageInset, topPercentageInset, bottomPercentageInset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsChartInsets)) {
            return false;
        }
        SimulatedReturnsChartInsets simulatedReturnsChartInsets = (SimulatedReturnsChartInsets) other;
        return Double.compare(this.leftPercentageInset, simulatedReturnsChartInsets.leftPercentageInset) == 0 && Double.compare(this.rightPercentageInset, simulatedReturnsChartInsets.rightPercentageInset) == 0 && Double.compare(this.topPercentageInset, simulatedReturnsChartInsets.topPercentageInset) == 0 && Double.compare(this.bottomPercentageInset, simulatedReturnsChartInsets.bottomPercentageInset) == 0;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.leftPercentageInset) * 31) + Double.hashCode(this.rightPercentageInset)) * 31) + Double.hashCode(this.topPercentageInset)) * 31) + Double.hashCode(this.bottomPercentageInset);
    }

    public String toString() {
        return "SimulatedReturnsChartInsets(leftPercentageInset=" + this.leftPercentageInset + ", rightPercentageInset=" + this.rightPercentageInset + ", topPercentageInset=" + this.topPercentageInset + ", bottomPercentageInset=" + this.bottomPercentageInset + ")";
    }

    /* compiled from: SimulatedReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChartInsets$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChartInsets;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimulatedReturnsChartInsets> serializer() {
            return SimulatedReturnsChartInsets$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimulatedReturnsChartInsets(int i, double d, double d2, double d3, double d4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, SimulatedReturnsChartInsets$$serializer.INSTANCE.getDescriptor());
        }
        this.leftPercentageInset = d;
        this.rightPercentageInset = d2;
        this.topPercentageInset = d3;
        this.bottomPercentageInset = d4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(SimulatedReturnsChartInsets self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.leftPercentageInset);
        output.encodeDoubleElement(serialDesc, 1, self.rightPercentageInset);
        output.encodeDoubleElement(serialDesc, 2, self.topPercentageInset);
        output.encodeDoubleElement(serialDesc, 3, self.bottomPercentageInset);
    }

    public SimulatedReturnsChartInsets(double d, double d2, double d3, double d4) {
        this.leftPercentageInset = d;
        this.rightPercentageInset = d2;
        this.topPercentageInset = d3;
        this.bottomPercentageInset = d4;
    }

    public final double getLeftPercentageInset() {
        return this.leftPercentageInset;
    }

    public final double getRightPercentageInset() {
        return this.rightPercentageInset;
    }

    public final double getTopPercentageInset() {
        return this.topPercentageInset;
    }

    public final double getBottomPercentageInset() {
        return this.bottomPercentageInset;
    }
}
