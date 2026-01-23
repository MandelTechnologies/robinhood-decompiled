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

/* compiled from: RawPoint.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000278BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0011HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001f¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;", "", "timestamp", "Lkotlinx/datetime/Instant;", "theoreticalPrice", "", "theoreticalPriceRounded", "theoreticalReturn", "theoreticalReturnRounded", "theoreticalReturnPercent", "primaryPoint", "secondaryPoint", "isBreakevenPoint", "", "<init>", "(Lkotlinx/datetime/Instant;DDDDDDDZ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/datetime/Instant;DDDDDDDZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTimestamp", "()Lkotlinx/datetime/Instant;", "getTheoreticalPrice", "()D", "getTheoreticalPriceRounded", "getTheoreticalReturn", "getTheoreticalReturnRounded", "getTheoreticalReturnPercent", "getPrimaryPoint", "getSecondaryPoint", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class RawPoint {
    private final boolean isBreakevenPoint;
    private final double primaryPoint;
    private final double secondaryPoint;
    private final double theoreticalPrice;
    private final double theoreticalPriceRounded;
    private final double theoreticalReturn;
    private final double theoreticalReturnPercent;
    private final double theoreticalReturnRounded;
    private final Instant timestamp;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ RawPoint copy$default(RawPoint rawPoint, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, int i, Object obj) {
        double d8;
        double d9;
        Instant instant2 = (i & 1) != 0 ? rawPoint.timestamp : instant;
        double d10 = (i & 2) != 0 ? rawPoint.theoreticalPrice : d;
        double d11 = (i & 4) != 0 ? rawPoint.theoreticalPriceRounded : d2;
        double d12 = (i & 8) != 0 ? rawPoint.theoreticalReturn : d3;
        double d13 = (i & 16) != 0 ? rawPoint.theoreticalReturnRounded : d4;
        double d14 = (i & 32) != 0 ? rawPoint.theoreticalReturnPercent : d5;
        double d15 = (i & 64) != 0 ? rawPoint.primaryPoint : d6;
        Instant instant3 = instant2;
        if ((i & 128) != 0) {
            d8 = d10;
            d9 = rawPoint.secondaryPoint;
        } else {
            d8 = d10;
            d9 = d7;
        }
        return rawPoint.copy(instant3, d8, d11, d12, d13, d14, d15, d9, (i & 256) != 0 ? rawPoint.isBreakevenPoint : z);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTheoreticalPrice() {
        return this.theoreticalPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTheoreticalPriceRounded() {
        return this.theoreticalPriceRounded;
    }

    /* renamed from: component4, reason: from getter */
    public final double getTheoreticalReturn() {
        return this.theoreticalReturn;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTheoreticalReturnRounded() {
        return this.theoreticalReturnRounded;
    }

    /* renamed from: component6, reason: from getter */
    public final double getTheoreticalReturnPercent() {
        return this.theoreticalReturnPercent;
    }

    /* renamed from: component7, reason: from getter */
    public final double getPrimaryPoint() {
        return this.primaryPoint;
    }

    /* renamed from: component8, reason: from getter */
    public final double getSecondaryPoint() {
        return this.secondaryPoint;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsBreakevenPoint() {
        return this.isBreakevenPoint;
    }

    public final RawPoint copy(Instant timestamp, double theoreticalPrice, double theoreticalPriceRounded, double theoreticalReturn, double theoreticalReturnRounded, double theoreticalReturnPercent, double primaryPoint, double secondaryPoint, boolean isBreakevenPoint) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new RawPoint(timestamp, theoreticalPrice, theoreticalPriceRounded, theoreticalReturn, theoreticalReturnRounded, theoreticalReturnPercent, primaryPoint, secondaryPoint, isBreakevenPoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawPoint)) {
            return false;
        }
        RawPoint rawPoint = (RawPoint) other;
        return Intrinsics.areEqual(this.timestamp, rawPoint.timestamp) && Double.compare(this.theoreticalPrice, rawPoint.theoreticalPrice) == 0 && Double.compare(this.theoreticalPriceRounded, rawPoint.theoreticalPriceRounded) == 0 && Double.compare(this.theoreticalReturn, rawPoint.theoreticalReturn) == 0 && Double.compare(this.theoreticalReturnRounded, rawPoint.theoreticalReturnRounded) == 0 && Double.compare(this.theoreticalReturnPercent, rawPoint.theoreticalReturnPercent) == 0 && Double.compare(this.primaryPoint, rawPoint.primaryPoint) == 0 && Double.compare(this.secondaryPoint, rawPoint.secondaryPoint) == 0 && this.isBreakevenPoint == rawPoint.isBreakevenPoint;
    }

    public int hashCode() {
        return (((((((((((((((this.timestamp.hashCode() * 31) + Double.hashCode(this.theoreticalPrice)) * 31) + Double.hashCode(this.theoreticalPriceRounded)) * 31) + Double.hashCode(this.theoreticalReturn)) * 31) + Double.hashCode(this.theoreticalReturnRounded)) * 31) + Double.hashCode(this.theoreticalReturnPercent)) * 31) + Double.hashCode(this.primaryPoint)) * 31) + Double.hashCode(this.secondaryPoint)) * 31) + Boolean.hashCode(this.isBreakevenPoint);
    }

    public String toString() {
        return "RawPoint(timestamp=" + this.timestamp + ", theoreticalPrice=" + this.theoreticalPrice + ", theoreticalPriceRounded=" + this.theoreticalPriceRounded + ", theoreticalReturn=" + this.theoreticalReturn + ", theoreticalReturnRounded=" + this.theoreticalReturnRounded + ", theoreticalReturnPercent=" + this.theoreticalReturnPercent + ", primaryPoint=" + this.primaryPoint + ", secondaryPoint=" + this.secondaryPoint + ", isBreakevenPoint=" + this.isBreakevenPoint + ")";
    }

    /* compiled from: RawPoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/RawPoint$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RawPoint> serializer() {
            return RawPoint2.INSTANCE;
        }
    }

    public /* synthetic */ RawPoint(int i, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptions.throwMissingFieldException(i, 255, RawPoint2.INSTANCE.getDescriptor());
        }
        this.timestamp = instant;
        this.theoreticalPrice = d;
        this.theoreticalPriceRounded = d2;
        this.theoreticalReturn = d3;
        this.theoreticalReturnRounded = d4;
        this.theoreticalReturnPercent = d5;
        this.primaryPoint = d6;
        this.secondaryPoint = d7;
        this.isBreakevenPoint = (i & 256) == 0 ? false : z;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(RawPoint self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, InstantSerializers.INSTANCE, self.timestamp);
        output.encodeDoubleElement(serialDesc, 1, self.theoreticalPrice);
        output.encodeDoubleElement(serialDesc, 2, self.theoreticalPriceRounded);
        output.encodeDoubleElement(serialDesc, 3, self.theoreticalReturn);
        output.encodeDoubleElement(serialDesc, 4, self.theoreticalReturnRounded);
        output.encodeDoubleElement(serialDesc, 5, self.theoreticalReturnPercent);
        output.encodeDoubleElement(serialDesc, 6, self.primaryPoint);
        output.encodeDoubleElement(serialDesc, 7, self.secondaryPoint);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isBreakevenPoint) {
            output.encodeBooleanElement(serialDesc, 8, self.isBreakevenPoint);
        }
    }

    public RawPoint(Instant timestamp, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.timestamp = timestamp;
        this.theoreticalPrice = d;
        this.theoreticalPriceRounded = d2;
        this.theoreticalReturn = d3;
        this.theoreticalReturnRounded = d4;
        this.theoreticalReturnPercent = d5;
        this.primaryPoint = d6;
        this.secondaryPoint = d7;
        this.isBreakevenPoint = z;
    }

    public /* synthetic */ RawPoint(Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, d, d2, d3, d4, d5, d6, d7, (i & 256) != 0 ? false : z);
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

    public final double getPrimaryPoint() {
        return this.primaryPoint;
    }

    public final double getSecondaryPoint() {
        return this.secondaryPoint;
    }

    public final boolean isBreakevenPoint() {
        return this.isBreakevenPoint;
    }
}
