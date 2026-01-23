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
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\nHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsSegment;", "", "points", "", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsPoint;", "isPositive", "", "<init>", "(Ljava/util/List;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPoints", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class SimulatedReturnsSegment {
    private final boolean isPositive;
    private final List<SimulatedReturnsPoint> points;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsSegment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SimulatedReturnsSegment._childSerializers$_anonymous_();
        }
    }), null};

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SimulatedReturnsPoint$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimulatedReturnsSegment copy$default(SimulatedReturnsSegment simulatedReturnsSegment, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = simulatedReturnsSegment.points;
        }
        if ((i & 2) != 0) {
            z = simulatedReturnsSegment.isPositive;
        }
        return simulatedReturnsSegment.copy(list, z);
    }

    public final List<SimulatedReturnsPoint> component1() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPositive() {
        return this.isPositive;
    }

    public final SimulatedReturnsSegment copy(List<SimulatedReturnsPoint> points, boolean isPositive) {
        Intrinsics.checkNotNullParameter(points, "points");
        return new SimulatedReturnsSegment(points, isPositive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsSegment)) {
            return false;
        }
        SimulatedReturnsSegment simulatedReturnsSegment = (SimulatedReturnsSegment) other;
        return Intrinsics.areEqual(this.points, simulatedReturnsSegment.points) && this.isPositive == simulatedReturnsSegment.isPositive;
    }

    public int hashCode() {
        return (this.points.hashCode() * 31) + Boolean.hashCode(this.isPositive);
    }

    public String toString() {
        return "SimulatedReturnsSegment(points=" + this.points + ", isPositive=" + this.isPositive + ")";
    }

    /* compiled from: SimulatedReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsSegment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsSegment;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimulatedReturnsSegment> serializer() {
            return SimulatedReturnsSegment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimulatedReturnsSegment(int i, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SimulatedReturnsSegment$$serializer.INSTANCE.getDescriptor());
        }
        this.points = list;
        this.isPositive = z;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(SimulatedReturnsSegment self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.points);
        output.encodeBooleanElement(serialDesc, 1, self.isPositive);
    }

    public SimulatedReturnsSegment(List<SimulatedReturnsPoint> points, boolean z) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.points = points;
        this.isPositive = z;
    }

    public final List<SimulatedReturnsPoint> getPoints() {
        return this.points;
    }

    public final boolean isPositive() {
        return this.isPositive;
    }
}
