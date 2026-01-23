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
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010Be\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\nHÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001e¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLeg;", "", "strikePrice", "", "expiration", "Lkotlinx/datetime/Instant;", "impliedVolatility", "interestRate", "dividendYield", "ratio", "", "isBuy", "", "isPut", "isEuropean", "<init>", "(DLkotlinx/datetime/Instant;DDDIZZZ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLkotlinx/datetime/Instant;DDDIZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStrikePrice", "()D", "getExpiration", "()Lkotlinx/datetime/Instant;", "getImpliedVolatility", "getInterestRate", "getDividendYield", "getRatio", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class SimulatedReturnsLeg {
    private final double dividendYield;
    private final Instant expiration;
    private final double impliedVolatility;
    private final double interestRate;
    private final boolean isBuy;
    private final boolean isEuropean;
    private final boolean isPut;
    private final int ratio;
    private final double strikePrice;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: component1, reason: from getter */
    public final double getStrikePrice() {
        return this.strikePrice;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getExpiration() {
        return this.expiration;
    }

    /* renamed from: component3, reason: from getter */
    public final double getImpliedVolatility() {
        return this.impliedVolatility;
    }

    /* renamed from: component4, reason: from getter */
    public final double getInterestRate() {
        return this.interestRate;
    }

    /* renamed from: component5, reason: from getter */
    public final double getDividendYield() {
        return this.dividendYield;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRatio() {
        return this.ratio;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsBuy() {
        return this.isBuy;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsPut() {
        return this.isPut;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsEuropean() {
        return this.isEuropean;
    }

    public final SimulatedReturnsLeg copy(double strikePrice, Instant expiration, double impliedVolatility, double interestRate, double dividendYield, int ratio, boolean isBuy, boolean isPut, boolean isEuropean) {
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        return new SimulatedReturnsLeg(strikePrice, expiration, impliedVolatility, interestRate, dividendYield, ratio, isBuy, isPut, isEuropean);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsLeg)) {
            return false;
        }
        SimulatedReturnsLeg simulatedReturnsLeg = (SimulatedReturnsLeg) other;
        return Double.compare(this.strikePrice, simulatedReturnsLeg.strikePrice) == 0 && Intrinsics.areEqual(this.expiration, simulatedReturnsLeg.expiration) && Double.compare(this.impliedVolatility, simulatedReturnsLeg.impliedVolatility) == 0 && Double.compare(this.interestRate, simulatedReturnsLeg.interestRate) == 0 && Double.compare(this.dividendYield, simulatedReturnsLeg.dividendYield) == 0 && this.ratio == simulatedReturnsLeg.ratio && this.isBuy == simulatedReturnsLeg.isBuy && this.isPut == simulatedReturnsLeg.isPut && this.isEuropean == simulatedReturnsLeg.isEuropean;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.strikePrice) * 31) + this.expiration.hashCode()) * 31) + Double.hashCode(this.impliedVolatility)) * 31) + Double.hashCode(this.interestRate)) * 31) + Double.hashCode(this.dividendYield)) * 31) + Integer.hashCode(this.ratio)) * 31) + Boolean.hashCode(this.isBuy)) * 31) + Boolean.hashCode(this.isPut)) * 31) + Boolean.hashCode(this.isEuropean);
    }

    public String toString() {
        return "SimulatedReturnsLeg(strikePrice=" + this.strikePrice + ", expiration=" + this.expiration + ", impliedVolatility=" + this.impliedVolatility + ", interestRate=" + this.interestRate + ", dividendYield=" + this.dividendYield + ", ratio=" + this.ratio + ", isBuy=" + this.isBuy + ", isPut=" + this.isPut + ", isEuropean=" + this.isEuropean + ")";
    }

    /* compiled from: SimulatedReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLeg$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLeg;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimulatedReturnsLeg> serializer() {
            return SimulatedReturnsLeg$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimulatedReturnsLeg(int i, double d, Instant instant, double d2, double d3, double d4, int i2, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            PluginExceptions.throwMissingFieldException(i, 511, SimulatedReturnsLeg$$serializer.INSTANCE.getDescriptor());
        }
        this.strikePrice = d;
        this.expiration = instant;
        this.impliedVolatility = d2;
        this.interestRate = d3;
        this.dividendYield = d4;
        this.ratio = i2;
        this.isBuy = z;
        this.isPut = z2;
        this.isEuropean = z3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(SimulatedReturnsLeg self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.strikePrice);
        output.encodeSerializableElement(serialDesc, 1, InstantSerializers.INSTANCE, self.expiration);
        output.encodeDoubleElement(serialDesc, 2, self.impliedVolatility);
        output.encodeDoubleElement(serialDesc, 3, self.interestRate);
        output.encodeDoubleElement(serialDesc, 4, self.dividendYield);
        output.encodeIntElement(serialDesc, 5, self.ratio);
        output.encodeBooleanElement(serialDesc, 6, self.isBuy);
        output.encodeBooleanElement(serialDesc, 7, self.isPut);
        output.encodeBooleanElement(serialDesc, 8, self.isEuropean);
    }

    public SimulatedReturnsLeg(double d, Instant expiration, double d2, double d3, double d4, int i, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        this.strikePrice = d;
        this.expiration = expiration;
        this.impliedVolatility = d2;
        this.interestRate = d3;
        this.dividendYield = d4;
        this.ratio = i;
        this.isBuy = z;
        this.isPut = z2;
        this.isEuropean = z3;
    }

    public final double getStrikePrice() {
        return this.strikePrice;
    }

    public final Instant getExpiration() {
        return this.expiration;
    }

    public final double getImpliedVolatility() {
        return this.impliedVolatility;
    }

    public final double getInterestRate() {
        return this.interestRate;
    }

    public final double getDividendYield() {
        return this.dividendYield;
    }

    public final int getRatio() {
        return this.ratio;
    }

    public final boolean isBuy() {
        return this.isBuy;
    }

    public final boolean isPut() {
        return this.isPut;
    }

    public final boolean isEuropean() {
        return this.isEuropean;
    }
}
