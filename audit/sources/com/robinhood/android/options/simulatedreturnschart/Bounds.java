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

/* compiled from: Bounds.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/Bounds;", "", "minX", "Lkotlinx/datetime/Instant;", "maxX", "minY", "", "maxY", "<init>", "(Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;DD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;DDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMinX", "()Lkotlinx/datetime/Instant;", "getMaxX", "getMinY", "()D", "getMaxY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class Bounds {
    private final Instant maxX;
    private final double maxY;
    private final Instant minX;
    private final double minY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ Bounds copy$default(Bounds bounds, Instant instant, Instant instant2, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = bounds.minX;
        }
        if ((i & 2) != 0) {
            instant2 = bounds.maxX;
        }
        if ((i & 4) != 0) {
            d = bounds.minY;
        }
        if ((i & 8) != 0) {
            d2 = bounds.maxY;
        }
        double d3 = d2;
        return bounds.copy(instant, instant2, d, d3);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getMinX() {
        return this.minX;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getMaxX() {
        return this.maxX;
    }

    /* renamed from: component3, reason: from getter */
    public final double getMinY() {
        return this.minY;
    }

    /* renamed from: component4, reason: from getter */
    public final double getMaxY() {
        return this.maxY;
    }

    public final Bounds copy(Instant minX, Instant maxX, double minY, double maxY) {
        Intrinsics.checkNotNullParameter(minX, "minX");
        Intrinsics.checkNotNullParameter(maxX, "maxX");
        return new Bounds(minX, maxX, minY, maxY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bounds)) {
            return false;
        }
        Bounds bounds = (Bounds) other;
        return Intrinsics.areEqual(this.minX, bounds.minX) && Intrinsics.areEqual(this.maxX, bounds.maxX) && Double.compare(this.minY, bounds.minY) == 0 && Double.compare(this.maxY, bounds.maxY) == 0;
    }

    public int hashCode() {
        return (((((this.minX.hashCode() * 31) + this.maxX.hashCode()) * 31) + Double.hashCode(this.minY)) * 31) + Double.hashCode(this.maxY);
    }

    public String toString() {
        return "Bounds(minX=" + this.minX + ", maxX=" + this.maxX + ", minY=" + this.minY + ", maxY=" + this.maxY + ")";
    }

    /* compiled from: Bounds.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/Bounds$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/Bounds;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Bounds> serializer() {
            return Bounds2.INSTANCE;
        }
    }

    public /* synthetic */ Bounds(int i, Instant instant, Instant instant2, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, Bounds2.INSTANCE.getDescriptor());
        }
        this.minX = instant;
        this.maxX = instant2;
        this.minY = d;
        this.maxY = d2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(Bounds self, Encoding3 output, SerialDescriptor serialDesc) {
        InstantSerializers instantSerializers = InstantSerializers.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, instantSerializers, self.minX);
        output.encodeSerializableElement(serialDesc, 1, instantSerializers, self.maxX);
        output.encodeDoubleElement(serialDesc, 2, self.minY);
        output.encodeDoubleElement(serialDesc, 3, self.maxY);
    }

    public Bounds(Instant minX, Instant maxX, double d, double d2) {
        Intrinsics.checkNotNullParameter(minX, "minX");
        Intrinsics.checkNotNullParameter(maxX, "maxX");
        this.minX = minX;
        this.maxX = maxX;
        this.minY = d;
        this.maxY = d2;
    }

    public final Instant getMinX() {
        return this.minX;
    }

    public final Instant getMaxX() {
        return this.maxX;
    }

    public final double getMinY() {
        return this.minY;
    }

    public final double getMaxY() {
        return this.maxY;
    }
}
