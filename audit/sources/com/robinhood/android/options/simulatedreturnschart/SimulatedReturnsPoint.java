package com.robinhood.android.options.simulatedreturnschart;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012Bw\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0014HÖ\u0001J\t\u00105\u001a\u00020\rHÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001c¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsPoint;", "", "isBreakevenPoint", "", "timestamp", "Lkotlinx/datetime/Instant;", "theoreticalPrice", "", "theoreticalPriceRounded", "theoreticalReturn", "theoreticalReturnRounded", "theoreticalReturnPercent", "timestampLabel", "", "usingPercentageReturns", "x", "y", "<init>", "(ZLkotlinx/datetime/Instant;DDDDDLjava/lang/String;ZDD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/datetime/Instant;DDDDDLjava/lang/String;ZDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()Z", "getTimestamp", "()Lkotlinx/datetime/Instant;", "getTheoreticalPrice", "()D", "getTheoreticalPriceRounded", "getTheoreticalReturn", "getTheoreticalReturnRounded", "getTheoreticalReturnPercent", "getTimestampLabel", "()Ljava/lang/String;", "getUsingPercentageReturns", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class SimulatedReturnsPoint {
    private final boolean isBreakevenPoint;
    private final double theoreticalPrice;
    private final double theoreticalPriceRounded;
    private final double theoreticalReturn;
    private final double theoreticalReturnPercent;
    private final double theoreticalReturnRounded;
    private final Instant timestamp;
    private final String timestampLabel;
    private final boolean usingPercentageReturns;
    private final double x;
    private final double y;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ SimulatedReturnsPoint copy$default(SimulatedReturnsPoint simulatedReturnsPoint, boolean z, Instant instant, double d, double d2, double d3, double d4, double d5, String str, boolean z2, double d6, double d7, int i, Object obj) {
        double d8;
        double d9;
        Instant instant2;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        String str2;
        boolean z3;
        boolean z4 = (i & 1) != 0 ? simulatedReturnsPoint.isBreakevenPoint : z;
        Instant instant3 = (i & 2) != 0 ? simulatedReturnsPoint.timestamp : instant;
        double d15 = (i & 4) != 0 ? simulatedReturnsPoint.theoreticalPrice : d;
        double d16 = (i & 8) != 0 ? simulatedReturnsPoint.theoreticalPriceRounded : d2;
        double d17 = (i & 16) != 0 ? simulatedReturnsPoint.theoreticalReturn : d3;
        double d18 = (i & 32) != 0 ? simulatedReturnsPoint.theoreticalReturnRounded : d4;
        double d19 = (i & 64) != 0 ? simulatedReturnsPoint.theoreticalReturnPercent : d5;
        String str3 = (i & 128) != 0 ? simulatedReturnsPoint.timestampLabel : str;
        boolean z5 = (i & 256) != 0 ? simulatedReturnsPoint.usingPercentageReturns : z2;
        boolean z6 = z4;
        Instant instant4 = instant3;
        double d20 = (i & 512) != 0 ? simulatedReturnsPoint.x : d6;
        if ((i & 1024) != 0) {
            d9 = d20;
            d8 = simulatedReturnsPoint.y;
            d10 = d15;
            d11 = d16;
            d12 = d17;
            d13 = d18;
            d14 = d19;
            str2 = str3;
            z3 = z5;
            instant2 = instant4;
        } else {
            d8 = d7;
            d9 = d20;
            instant2 = instant4;
            d10 = d15;
            d11 = d16;
            d12 = d17;
            d13 = d18;
            d14 = d19;
            str2 = str3;
            z3 = z5;
        }
        return simulatedReturnsPoint.copy(z6, instant2, d10, d11, d12, d13, d14, str2, z3, d9, d8);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBreakevenPoint() {
        return this.isBreakevenPoint;
    }

    /* renamed from: component10, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component11, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTheoreticalPrice() {
        return this.theoreticalPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final double getTheoreticalPriceRounded() {
        return this.theoreticalPriceRounded;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTheoreticalReturn() {
        return this.theoreticalReturn;
    }

    /* renamed from: component6, reason: from getter */
    public final double getTheoreticalReturnRounded() {
        return this.theoreticalReturnRounded;
    }

    /* renamed from: component7, reason: from getter */
    public final double getTheoreticalReturnPercent() {
        return this.theoreticalReturnPercent;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTimestampLabel() {
        return this.timestampLabel;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getUsingPercentageReturns() {
        return this.usingPercentageReturns;
    }

    public final SimulatedReturnsPoint copy(boolean isBreakevenPoint, Instant timestamp, double theoreticalPrice, double theoreticalPriceRounded, double theoreticalReturn, double theoreticalReturnRounded, double theoreticalReturnPercent, String timestampLabel, boolean usingPercentageReturns, double x, double y) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(timestampLabel, "timestampLabel");
        return new SimulatedReturnsPoint(isBreakevenPoint, timestamp, theoreticalPrice, theoreticalPriceRounded, theoreticalReturn, theoreticalReturnRounded, theoreticalReturnPercent, timestampLabel, usingPercentageReturns, x, y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsPoint)) {
            return false;
        }
        SimulatedReturnsPoint simulatedReturnsPoint = (SimulatedReturnsPoint) other;
        return this.isBreakevenPoint == simulatedReturnsPoint.isBreakevenPoint && Intrinsics.areEqual(this.timestamp, simulatedReturnsPoint.timestamp) && Double.compare(this.theoreticalPrice, simulatedReturnsPoint.theoreticalPrice) == 0 && Double.compare(this.theoreticalPriceRounded, simulatedReturnsPoint.theoreticalPriceRounded) == 0 && Double.compare(this.theoreticalReturn, simulatedReturnsPoint.theoreticalReturn) == 0 && Double.compare(this.theoreticalReturnRounded, simulatedReturnsPoint.theoreticalReturnRounded) == 0 && Double.compare(this.theoreticalReturnPercent, simulatedReturnsPoint.theoreticalReturnPercent) == 0 && Intrinsics.areEqual(this.timestampLabel, simulatedReturnsPoint.timestampLabel) && this.usingPercentageReturns == simulatedReturnsPoint.usingPercentageReturns && Double.compare(this.x, simulatedReturnsPoint.x) == 0 && Double.compare(this.y, simulatedReturnsPoint.y) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((Boolean.hashCode(this.isBreakevenPoint) * 31) + this.timestamp.hashCode()) * 31) + Double.hashCode(this.theoreticalPrice)) * 31) + Double.hashCode(this.theoreticalPriceRounded)) * 31) + Double.hashCode(this.theoreticalReturn)) * 31) + Double.hashCode(this.theoreticalReturnRounded)) * 31) + Double.hashCode(this.theoreticalReturnPercent)) * 31) + this.timestampLabel.hashCode()) * 31) + Boolean.hashCode(this.usingPercentageReturns)) * 31) + Double.hashCode(this.x)) * 31) + Double.hashCode(this.y);
    }

    public String toString() {
        return "SimulatedReturnsPoint(isBreakevenPoint=" + this.isBreakevenPoint + ", timestamp=" + this.timestamp + ", theoreticalPrice=" + this.theoreticalPrice + ", theoreticalPriceRounded=" + this.theoreticalPriceRounded + ", theoreticalReturn=" + this.theoreticalReturn + ", theoreticalReturnRounded=" + this.theoreticalReturnRounded + ", theoreticalReturnPercent=" + this.theoreticalReturnPercent + ", timestampLabel=" + this.timestampLabel + ", usingPercentageReturns=" + this.usingPercentageReturns + ", x=" + this.x + ", y=" + this.y + ")";
    }

    /* compiled from: SimulatedReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsPoint$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsPoint;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimulatedReturnsPoint> serializer() {
            return SimulatedReturnsPoint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimulatedReturnsPoint(int i, boolean z, Instant instant, double d, double d2, double d3, double d4, double d5, String str, boolean z2, double d6, double d7, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptions.throwMissingFieldException(i, 2047, SimulatedReturnsPoint$$serializer.INSTANCE.getDescriptor());
        }
        this.isBreakevenPoint = z;
        this.timestamp = instant;
        this.theoreticalPrice = d;
        this.theoreticalPriceRounded = d2;
        this.theoreticalReturn = d3;
        this.theoreticalReturnRounded = d4;
        this.theoreticalReturnPercent = d5;
        this.timestampLabel = str;
        this.usingPercentageReturns = z2;
        this.x = d6;
        this.y = d7;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(SimulatedReturnsPoint self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isBreakevenPoint);
        output.encodeSerializableElement(serialDesc, 1, InstantSerializers.INSTANCE, self.timestamp);
        output.encodeDoubleElement(serialDesc, 2, self.theoreticalPrice);
        output.encodeDoubleElement(serialDesc, 3, self.theoreticalPriceRounded);
        output.encodeDoubleElement(serialDesc, 4, self.theoreticalReturn);
        output.encodeDoubleElement(serialDesc, 5, self.theoreticalReturnRounded);
        output.encodeDoubleElement(serialDesc, 6, self.theoreticalReturnPercent);
        output.encodeStringElement(serialDesc, 7, self.timestampLabel);
        output.encodeBooleanElement(serialDesc, 8, self.usingPercentageReturns);
        output.encodeDoubleElement(serialDesc, 9, self.x);
        output.encodeDoubleElement(serialDesc, 10, self.y);
    }

    public SimulatedReturnsPoint(boolean z, Instant timestamp, double d, double d2, double d3, double d4, double d5, String timestampLabel, boolean z2, double d6, double d7) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(timestampLabel, "timestampLabel");
        this.isBreakevenPoint = z;
        this.timestamp = timestamp;
        this.theoreticalPrice = d;
        this.theoreticalPriceRounded = d2;
        this.theoreticalReturn = d3;
        this.theoreticalReturnRounded = d4;
        this.theoreticalReturnPercent = d5;
        this.timestampLabel = timestampLabel;
        this.usingPercentageReturns = z2;
        this.x = d6;
        this.y = d7;
    }

    public final boolean isBreakevenPoint() {
        return this.isBreakevenPoint;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final double getTheoreticalPrice() {
        return this.theoreticalPrice;
    }

    public final double getTheoreticalPriceRounded() {
        return this.theoreticalPriceRounded;
    }

    public final double getTheoreticalReturn() {
        return this.theoreticalReturn;
    }

    public final double getTheoreticalReturnRounded() {
        return this.theoreticalReturnRounded;
    }

    public final double getTheoreticalReturnPercent() {
        return this.theoreticalReturnPercent;
    }

    public final String getTimestampLabel() {
        return this.timestampLabel;
    }

    public final boolean getUsingPercentageReturns() {
        return this.usingPercentageReturns;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }
}
