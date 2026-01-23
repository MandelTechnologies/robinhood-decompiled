package com.robinhood.android.options.simulatedreturnschart;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "", "position", "", AnnotatedPrivateKey.LABEL, "", "isBold", "", "opacity", "<init>", "(DLjava/lang/String;ZD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLjava/lang/String;ZDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPosition", "()D", "getLabel", "()Ljava/lang/String;", "()Z", "getOpacity", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class SimulatedReturnsGridLine {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isBold;
    private final String label;
    private final double opacity;
    private final double position;

    public static /* synthetic */ SimulatedReturnsGridLine copy$default(SimulatedReturnsGridLine simulatedReturnsGridLine, double d, String str, boolean z, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = simulatedReturnsGridLine.position;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            str = simulatedReturnsGridLine.label;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = simulatedReturnsGridLine.isBold;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            d2 = simulatedReturnsGridLine.opacity;
        }
        return simulatedReturnsGridLine.copy(d3, str2, z2, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsBold() {
        return this.isBold;
    }

    /* renamed from: component4, reason: from getter */
    public final double getOpacity() {
        return this.opacity;
    }

    public final SimulatedReturnsGridLine copy(double position, String label, boolean isBold, double opacity) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new SimulatedReturnsGridLine(position, label, isBold, opacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsGridLine)) {
            return false;
        }
        SimulatedReturnsGridLine simulatedReturnsGridLine = (SimulatedReturnsGridLine) other;
        return Double.compare(this.position, simulatedReturnsGridLine.position) == 0 && Intrinsics.areEqual(this.label, simulatedReturnsGridLine.label) && this.isBold == simulatedReturnsGridLine.isBold && Double.compare(this.opacity, simulatedReturnsGridLine.opacity) == 0;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.position) * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.isBold)) * 31) + Double.hashCode(this.opacity);
    }

    public String toString() {
        return "SimulatedReturnsGridLine(position=" + this.position + ", label=" + this.label + ", isBold=" + this.isBold + ", opacity=" + this.opacity + ")";
    }

    /* compiled from: SimulatedReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimulatedReturnsGridLine> serializer() {
            return SimulatedReturnsGridLine$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimulatedReturnsGridLine(int i, double d, String str, boolean z, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, SimulatedReturnsGridLine$$serializer.INSTANCE.getDescriptor());
        }
        this.position = d;
        this.label = str;
        this.isBold = z;
        if ((i & 8) == 0) {
            this.opacity = 1.0d;
        } else {
            this.opacity = d2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(SimulatedReturnsGridLine self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.position);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeBooleanElement(serialDesc, 2, self.isBold);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && Double.compare(self.opacity, 1.0d) == 0) {
            return;
        }
        output.encodeDoubleElement(serialDesc, 3, self.opacity);
    }

    public SimulatedReturnsGridLine(double d, String label, boolean z, double d2) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.position = d;
        this.label = label;
        this.isBold = z;
        this.opacity = d2;
    }

    public /* synthetic */ SimulatedReturnsGridLine(double d, String str, boolean z, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, z, (i & 8) != 0 ? 1.0d : d2);
    }

    public final double getPosition() {
        return this.position;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public final double getOpacity() {
        return this.opacity;
    }
}
