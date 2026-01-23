package com.robinhood.android.options.simulatedreturnschart;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: MaxProfitLoss.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/MaxProfitLoss;", "", "maxProfit", "", "maxLoss", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMaxProfit", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxLoss", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/robinhood/android/options/simulatedreturnschart/MaxProfitLoss;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class MaxProfitLoss {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double maxLoss;
    private final Double maxProfit;

    public static /* synthetic */ MaxProfitLoss copy$default(MaxProfitLoss maxProfitLoss, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = maxProfitLoss.maxProfit;
        }
        if ((i & 2) != 0) {
            d2 = maxProfitLoss.maxLoss;
        }
        return maxProfitLoss.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getMaxProfit() {
        return this.maxProfit;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getMaxLoss() {
        return this.maxLoss;
    }

    public final MaxProfitLoss copy(Double maxProfit, Double maxLoss) {
        return new MaxProfitLoss(maxProfit, maxLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxProfitLoss)) {
            return false;
        }
        MaxProfitLoss maxProfitLoss = (MaxProfitLoss) other;
        return Intrinsics.areEqual((Object) this.maxProfit, (Object) maxProfitLoss.maxProfit) && Intrinsics.areEqual((Object) this.maxLoss, (Object) maxProfitLoss.maxLoss);
    }

    public int hashCode() {
        Double d = this.maxProfit;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.maxLoss;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "MaxProfitLoss(maxProfit=" + this.maxProfit + ", maxLoss=" + this.maxLoss + ")";
    }

    /* compiled from: MaxProfitLoss.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/MaxProfitLoss$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/MaxProfitLoss;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MaxProfitLoss> serializer() {
            return MaxProfitLoss2.INSTANCE;
        }
    }

    public /* synthetic */ MaxProfitLoss(int i, Double d, Double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, MaxProfitLoss2.INSTANCE.getDescriptor());
        }
        this.maxProfit = d;
        this.maxLoss = d2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(MaxProfitLoss self, Encoding3 output, SerialDescriptor serialDesc) {
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, doubleSerializer, self.maxProfit);
        output.encodeNullableSerializableElement(serialDesc, 1, doubleSerializer, self.maxLoss);
    }

    public MaxProfitLoss(Double d, Double d2) {
        this.maxProfit = d;
        this.maxLoss = d2;
    }

    public final Double getMaxProfit() {
        return this.maxProfit;
    }

    public final Double getMaxLoss() {
        return this.maxLoss;
    }
}
