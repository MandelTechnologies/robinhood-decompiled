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
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002IJBw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u0091\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0005HÆ\u0001J\u0013\u0010<\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0010HÖ\u0001J\t\u0010?\u001a\u00020@HÖ\u0001J%\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0001¢\u0006\u0002\bHR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010!R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001f¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "", "now", "Lkotlinx/datetime/Instant;", "spotPrice", "", "averageOpeningPrice", "isOrderCredit", "", "legs", "", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLeg;", "usePercentageReturns", "insets", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChartInsets;", "quantity", "", "returnSingleCursorDataPoint", "returnRoundedDataPoints", "maxVerticalGridlines", "maxHorizontalGridlines", "tradeValueMultiplier", "<init>", "(Lkotlinx/datetime/Instant;DDZLjava/util/List;ZLcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChartInsets;IZZIID)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/datetime/Instant;DDZLjava/util/List;ZLcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChartInsets;IZZIIDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNow", "()Lkotlinx/datetime/Instant;", "getSpotPrice", "()D", "getAverageOpeningPrice", "()Z", "getLegs", "()Ljava/util/List;", "getUsePercentageReturns", "getInsets", "()Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChartInsets;", "getQuantity", "()I", "getReturnSingleCursorDataPoint", "getReturnRoundedDataPoints", "getMaxVerticalGridlines", "getMaxHorizontalGridlines", "getTradeValueMultiplier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class SimulatedReturnsParams {
    private final double averageOpeningPrice;
    private final SimulatedReturnsChartInsets insets;
    private final boolean isOrderCredit;
    private final List<SimulatedReturnsLeg> legs;
    private final int maxHorizontalGridlines;
    private final int maxVerticalGridlines;
    private final Instant now;
    private final int quantity;
    private final boolean returnRoundedDataPoints;
    private final boolean returnSingleCursorDataPoint;
    private final double spotPrice;
    private final double tradeValueMultiplier;
    private final boolean usePercentageReturns;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsParams$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SimulatedReturnsParams._childSerializers$_anonymous_();
        }
    }), null, null, null, null, null, null, null, null};

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SimulatedReturnsLeg$$serializer.INSTANCE);
    }

    public static /* synthetic */ SimulatedReturnsParams copy$default(SimulatedReturnsParams simulatedReturnsParams, Instant instant, double d, double d2, boolean z, List list, boolean z2, SimulatedReturnsChartInsets simulatedReturnsChartInsets, int i, boolean z3, boolean z4, int i2, int i3, double d3, int i4, Object obj) {
        double d4;
        Instant instant2;
        Instant instant3 = (i4 & 1) != 0 ? simulatedReturnsParams.now : instant;
        double d5 = (i4 & 2) != 0 ? simulatedReturnsParams.spotPrice : d;
        double d6 = (i4 & 4) != 0 ? simulatedReturnsParams.averageOpeningPrice : d2;
        boolean z5 = (i4 & 8) != 0 ? simulatedReturnsParams.isOrderCredit : z;
        List list2 = (i4 & 16) != 0 ? simulatedReturnsParams.legs : list;
        boolean z6 = (i4 & 32) != 0 ? simulatedReturnsParams.usePercentageReturns : z2;
        SimulatedReturnsChartInsets simulatedReturnsChartInsets2 = (i4 & 64) != 0 ? simulatedReturnsParams.insets : simulatedReturnsChartInsets;
        int i5 = (i4 & 128) != 0 ? simulatedReturnsParams.quantity : i;
        boolean z7 = (i4 & 256) != 0 ? simulatedReturnsParams.returnSingleCursorDataPoint : z3;
        boolean z8 = (i4 & 512) != 0 ? simulatedReturnsParams.returnRoundedDataPoints : z4;
        int i6 = (i4 & 1024) != 0 ? simulatedReturnsParams.maxVerticalGridlines : i2;
        int i7 = (i4 & 2048) != 0 ? simulatedReturnsParams.maxHorizontalGridlines : i3;
        if ((i4 & 4096) != 0) {
            instant2 = instant3;
            d4 = simulatedReturnsParams.tradeValueMultiplier;
        } else {
            d4 = d3;
            instant2 = instant3;
        }
        return simulatedReturnsParams.copy(instant2, d5, d6, z5, list2, z6, simulatedReturnsChartInsets2, i5, z7, z8, i6, i7, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getNow() {
        return this.now;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getReturnRoundedDataPoints() {
        return this.returnRoundedDataPoints;
    }

    /* renamed from: component11, reason: from getter */
    public final int getMaxVerticalGridlines() {
        return this.maxVerticalGridlines;
    }

    /* renamed from: component12, reason: from getter */
    public final int getMaxHorizontalGridlines() {
        return this.maxHorizontalGridlines;
    }

    /* renamed from: component13, reason: from getter */
    public final double getTradeValueMultiplier() {
        return this.tradeValueMultiplier;
    }

    /* renamed from: component2, reason: from getter */
    public final double getSpotPrice() {
        return this.spotPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final double getAverageOpeningPrice() {
        return this.averageOpeningPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsOrderCredit() {
        return this.isOrderCredit;
    }

    public final List<SimulatedReturnsLeg> component5() {
        return this.legs;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUsePercentageReturns() {
        return this.usePercentageReturns;
    }

    /* renamed from: component7, reason: from getter */
    public final SimulatedReturnsChartInsets getInsets() {
        return this.insets;
    }

    /* renamed from: component8, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getReturnSingleCursorDataPoint() {
        return this.returnSingleCursorDataPoint;
    }

    public final SimulatedReturnsParams copy(Instant now, double spotPrice, double averageOpeningPrice, boolean isOrderCredit, List<SimulatedReturnsLeg> legs, boolean usePercentageReturns, SimulatedReturnsChartInsets insets, int quantity, boolean returnSingleCursorDataPoint, boolean returnRoundedDataPoints, int maxVerticalGridlines, int maxHorizontalGridlines, double tradeValueMultiplier) {
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new SimulatedReturnsParams(now, spotPrice, averageOpeningPrice, isOrderCredit, legs, usePercentageReturns, insets, quantity, returnSingleCursorDataPoint, returnRoundedDataPoints, maxVerticalGridlines, maxHorizontalGridlines, tradeValueMultiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsParams)) {
            return false;
        }
        SimulatedReturnsParams simulatedReturnsParams = (SimulatedReturnsParams) other;
        return Intrinsics.areEqual(this.now, simulatedReturnsParams.now) && Double.compare(this.spotPrice, simulatedReturnsParams.spotPrice) == 0 && Double.compare(this.averageOpeningPrice, simulatedReturnsParams.averageOpeningPrice) == 0 && this.isOrderCredit == simulatedReturnsParams.isOrderCredit && Intrinsics.areEqual(this.legs, simulatedReturnsParams.legs) && this.usePercentageReturns == simulatedReturnsParams.usePercentageReturns && Intrinsics.areEqual(this.insets, simulatedReturnsParams.insets) && this.quantity == simulatedReturnsParams.quantity && this.returnSingleCursorDataPoint == simulatedReturnsParams.returnSingleCursorDataPoint && this.returnRoundedDataPoints == simulatedReturnsParams.returnRoundedDataPoints && this.maxVerticalGridlines == simulatedReturnsParams.maxVerticalGridlines && this.maxHorizontalGridlines == simulatedReturnsParams.maxHorizontalGridlines && Double.compare(this.tradeValueMultiplier, simulatedReturnsParams.tradeValueMultiplier) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.now.hashCode() * 31) + Double.hashCode(this.spotPrice)) * 31) + Double.hashCode(this.averageOpeningPrice)) * 31) + Boolean.hashCode(this.isOrderCredit)) * 31) + this.legs.hashCode()) * 31) + Boolean.hashCode(this.usePercentageReturns)) * 31) + this.insets.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.returnSingleCursorDataPoint)) * 31) + Boolean.hashCode(this.returnRoundedDataPoints)) * 31) + Integer.hashCode(this.maxVerticalGridlines)) * 31) + Integer.hashCode(this.maxHorizontalGridlines)) * 31) + Double.hashCode(this.tradeValueMultiplier);
    }

    public String toString() {
        return "SimulatedReturnsParams(now=" + this.now + ", spotPrice=" + this.spotPrice + ", averageOpeningPrice=" + this.averageOpeningPrice + ", isOrderCredit=" + this.isOrderCredit + ", legs=" + this.legs + ", usePercentageReturns=" + this.usePercentageReturns + ", insets=" + this.insets + ", quantity=" + this.quantity + ", returnSingleCursorDataPoint=" + this.returnSingleCursorDataPoint + ", returnRoundedDataPoints=" + this.returnRoundedDataPoints + ", maxVerticalGridlines=" + this.maxVerticalGridlines + ", maxHorizontalGridlines=" + this.maxHorizontalGridlines + ", tradeValueMultiplier=" + this.tradeValueMultiplier + ")";
    }

    /* compiled from: SimulatedReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimulatedReturnsParams> serializer() {
            return SimulatedReturnsParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimulatedReturnsParams(int i, Instant instant, double d, double d2, boolean z, List list, boolean z2, SimulatedReturnsChartInsets simulatedReturnsChartInsets, int i2, boolean z3, boolean z4, int i3, int i4, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7679 != (i & 7679)) {
            PluginExceptions.throwMissingFieldException(i, 7679, SimulatedReturnsParams$$serializer.INSTANCE.getDescriptor());
        }
        this.now = instant;
        this.spotPrice = d;
        this.averageOpeningPrice = d2;
        this.isOrderCredit = z;
        this.legs = list;
        this.usePercentageReturns = z2;
        this.insets = simulatedReturnsChartInsets;
        this.quantity = i2;
        this.returnSingleCursorDataPoint = z3;
        if ((i & 512) == 0) {
            this.returnRoundedDataPoints = true;
        } else {
            this.returnRoundedDataPoints = z4;
        }
        this.maxVerticalGridlines = i3;
        this.maxHorizontalGridlines = i4;
        this.tradeValueMultiplier = d3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(SimulatedReturnsParams self, Encoding3 output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, InstantSerializers.INSTANCE, self.now);
        output.encodeDoubleElement(serialDesc, 1, self.spotPrice);
        output.encodeDoubleElement(serialDesc, 2, self.averageOpeningPrice);
        output.encodeBooleanElement(serialDesc, 3, self.isOrderCredit);
        output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.legs);
        output.encodeBooleanElement(serialDesc, 5, self.usePercentageReturns);
        output.encodeSerializableElement(serialDesc, 6, SimulatedReturnsChartInsets$$serializer.INSTANCE, self.insets);
        output.encodeIntElement(serialDesc, 7, self.quantity);
        output.encodeBooleanElement(serialDesc, 8, self.returnSingleCursorDataPoint);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !self.returnRoundedDataPoints) {
            output.encodeBooleanElement(serialDesc, 9, self.returnRoundedDataPoints);
        }
        output.encodeIntElement(serialDesc, 10, self.maxVerticalGridlines);
        output.encodeIntElement(serialDesc, 11, self.maxHorizontalGridlines);
        output.encodeDoubleElement(serialDesc, 12, self.tradeValueMultiplier);
    }

    public SimulatedReturnsParams(Instant now, double d, double d2, boolean z, List<SimulatedReturnsLeg> legs, boolean z2, SimulatedReturnsChartInsets insets, int i, boolean z3, boolean z4, int i2, int i3, double d3) {
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.now = now;
        this.spotPrice = d;
        this.averageOpeningPrice = d2;
        this.isOrderCredit = z;
        this.legs = legs;
        this.usePercentageReturns = z2;
        this.insets = insets;
        this.quantity = i;
        this.returnSingleCursorDataPoint = z3;
        this.returnRoundedDataPoints = z4;
        this.maxVerticalGridlines = i2;
        this.maxHorizontalGridlines = i3;
        this.tradeValueMultiplier = d3;
    }

    public /* synthetic */ SimulatedReturnsParams(Instant instant, double d, double d2, boolean z, List list, boolean z2, SimulatedReturnsChartInsets simulatedReturnsChartInsets, int i, boolean z3, boolean z4, int i2, int i3, double d3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, d, d2, z, list, z2, simulatedReturnsChartInsets, i, z3, (i4 & 512) != 0 ? true : z4, i2, i3, d3);
    }

    public final Instant getNow() {
        return this.now;
    }

    public final double getSpotPrice() {
        return this.spotPrice;
    }

    public final double getAverageOpeningPrice() {
        return this.averageOpeningPrice;
    }

    public final boolean isOrderCredit() {
        return this.isOrderCredit;
    }

    public final List<SimulatedReturnsLeg> getLegs() {
        return this.legs;
    }

    public final boolean getUsePercentageReturns() {
        return this.usePercentageReturns;
    }

    public final SimulatedReturnsChartInsets getInsets() {
        return this.insets;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final boolean getReturnSingleCursorDataPoint() {
        return this.returnSingleCursorDataPoint;
    }

    public final boolean getReturnRoundedDataPoints() {
        return this.returnRoundedDataPoints;
    }

    public final int getMaxVerticalGridlines() {
        return this.maxVerticalGridlines;
    }

    public final int getMaxHorizontalGridlines() {
        return this.maxHorizontalGridlines;
    }

    public final double getTradeValueMultiplier() {
        return this.tradeValueMultiplier;
    }
}
