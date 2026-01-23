package com.robinhood.android.options.simulatedreturnschart;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBY\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\rHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;", "", "line", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;", "xAxis", "", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "yAxis", "maxProfit", "maxLoss", "<init>", "(Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLine", "()Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;", "getXAxis", "()Ljava/util/List;", "getYAxis", "getMaxProfit", "()Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "getMaxLoss", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class SimulatedReturnsChart {

    @JvmField
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private final SimulatedReturnsLine line;
    private final SimulatedReturnsGridLine maxLoss;
    private final SimulatedReturnsGridLine maxProfit;
    private final List<SimulatedReturnsGridLine> xAxis;
    private final List<SimulatedReturnsGridLine> yAxis;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SimulatedReturnsGridLine$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(SimulatedReturnsGridLine$$serializer.INSTANCE);
    }

    public static /* synthetic */ SimulatedReturnsChart copy$default(SimulatedReturnsChart simulatedReturnsChart, SimulatedReturnsLine simulatedReturnsLine, List list, List list2, SimulatedReturnsGridLine simulatedReturnsGridLine, SimulatedReturnsGridLine simulatedReturnsGridLine2, int i, Object obj) {
        if ((i & 1) != 0) {
            simulatedReturnsLine = simulatedReturnsChart.line;
        }
        if ((i & 2) != 0) {
            list = simulatedReturnsChart.xAxis;
        }
        if ((i & 4) != 0) {
            list2 = simulatedReturnsChart.yAxis;
        }
        if ((i & 8) != 0) {
            simulatedReturnsGridLine = simulatedReturnsChart.maxProfit;
        }
        if ((i & 16) != 0) {
            simulatedReturnsGridLine2 = simulatedReturnsChart.maxLoss;
        }
        SimulatedReturnsGridLine simulatedReturnsGridLine3 = simulatedReturnsGridLine2;
        List list3 = list2;
        return simulatedReturnsChart.copy(simulatedReturnsLine, list, list3, simulatedReturnsGridLine, simulatedReturnsGridLine3);
    }

    /* renamed from: component1, reason: from getter */
    public final SimulatedReturnsLine getLine() {
        return this.line;
    }

    public final List<SimulatedReturnsGridLine> component2() {
        return this.xAxis;
    }

    public final List<SimulatedReturnsGridLine> component3() {
        return this.yAxis;
    }

    /* renamed from: component4, reason: from getter */
    public final SimulatedReturnsGridLine getMaxProfit() {
        return this.maxProfit;
    }

    /* renamed from: component5, reason: from getter */
    public final SimulatedReturnsGridLine getMaxLoss() {
        return this.maxLoss;
    }

    public final SimulatedReturnsChart copy(SimulatedReturnsLine line, List<SimulatedReturnsGridLine> xAxis, List<SimulatedReturnsGridLine> yAxis, SimulatedReturnsGridLine maxProfit, SimulatedReturnsGridLine maxLoss) {
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        return new SimulatedReturnsChart(line, xAxis, yAxis, maxProfit, maxLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsChart)) {
            return false;
        }
        SimulatedReturnsChart simulatedReturnsChart = (SimulatedReturnsChart) other;
        return Intrinsics.areEqual(this.line, simulatedReturnsChart.line) && Intrinsics.areEqual(this.xAxis, simulatedReturnsChart.xAxis) && Intrinsics.areEqual(this.yAxis, simulatedReturnsChart.yAxis) && Intrinsics.areEqual(this.maxProfit, simulatedReturnsChart.maxProfit) && Intrinsics.areEqual(this.maxLoss, simulatedReturnsChart.maxLoss);
    }

    public int hashCode() {
        int iHashCode = ((((this.line.hashCode() * 31) + this.xAxis.hashCode()) * 31) + this.yAxis.hashCode()) * 31;
        SimulatedReturnsGridLine simulatedReturnsGridLine = this.maxProfit;
        int iHashCode2 = (iHashCode + (simulatedReturnsGridLine == null ? 0 : simulatedReturnsGridLine.hashCode())) * 31;
        SimulatedReturnsGridLine simulatedReturnsGridLine2 = this.maxLoss;
        return iHashCode2 + (simulatedReturnsGridLine2 != null ? simulatedReturnsGridLine2.hashCode() : 0);
    }

    public String toString() {
        return "SimulatedReturnsChart(line=" + this.line + ", xAxis=" + this.xAxis + ", yAxis=" + this.yAxis + ", maxProfit=" + this.maxProfit + ", maxLoss=" + this.maxLoss + ")";
    }

    /* compiled from: SimulatedReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimulatedReturnsChart> serializer() {
            return SimulatedReturnsChart$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsChart$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SimulatedReturnsChart._childSerializers$_anonymous_();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsChart$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SimulatedReturnsChart._childSerializers$_anonymous_$0();
            }
        }), null, null};
    }

    public /* synthetic */ SimulatedReturnsChart(int i, SimulatedReturnsLine simulatedReturnsLine, List list, List list2, SimulatedReturnsGridLine simulatedReturnsGridLine, SimulatedReturnsGridLine simulatedReturnsGridLine2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, SimulatedReturnsChart$$serializer.INSTANCE.getDescriptor());
        }
        this.line = simulatedReturnsLine;
        this.xAxis = list;
        this.yAxis = list2;
        this.maxProfit = simulatedReturnsGridLine;
        this.maxLoss = simulatedReturnsGridLine2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(SimulatedReturnsChart self, Encoding3 output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SimulatedReturnsLine$$serializer.INSTANCE, self.line);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.xAxis);
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.yAxis);
        SimulatedReturnsGridLine$$serializer simulatedReturnsGridLine$$serializer = SimulatedReturnsGridLine$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, simulatedReturnsGridLine$$serializer, self.maxProfit);
        output.encodeNullableSerializableElement(serialDesc, 4, simulatedReturnsGridLine$$serializer, self.maxLoss);
    }

    public SimulatedReturnsChart(SimulatedReturnsLine line, List<SimulatedReturnsGridLine> xAxis, List<SimulatedReturnsGridLine> yAxis, SimulatedReturnsGridLine simulatedReturnsGridLine, SimulatedReturnsGridLine simulatedReturnsGridLine2) {
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        this.line = line;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.maxProfit = simulatedReturnsGridLine;
        this.maxLoss = simulatedReturnsGridLine2;
    }

    public final SimulatedReturnsLine getLine() {
        return this.line;
    }

    public final List<SimulatedReturnsGridLine> getXAxis() {
        return this.xAxis;
    }

    public final List<SimulatedReturnsGridLine> getYAxis() {
        return this.yAxis;
    }

    public final SimulatedReturnsGridLine getMaxProfit() {
        return this.maxProfit;
    }

    public final SimulatedReturnsGridLine getMaxLoss() {
        return this.maxLoss;
    }
}
