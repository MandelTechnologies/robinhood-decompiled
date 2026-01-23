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

/* compiled from: RawYAxisLabel.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/RawYAxisLabel;", "", "value", "", AnnotatedPrivateKey.LABEL, "", "opacity", "<init>", "(DLjava/lang/String;D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLjava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getValue", "()D", "getLabel", "()Ljava/lang/String;", "getOpacity", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_options_simulated_returns_chart_externalDebug", "$serializer", "Companion", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class RawYAxisLabel {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String label;
    private final double opacity;
    private final double value;

    public static /* synthetic */ RawYAxisLabel copy$default(RawYAxisLabel rawYAxisLabel, double d, String str, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = rawYAxisLabel.value;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            str = rawYAxisLabel.label;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            d2 = rawYAxisLabel.opacity;
        }
        return rawYAxisLabel.copy(d3, str2, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final double getOpacity() {
        return this.opacity;
    }

    public final RawYAxisLabel copy(double value, String label, double opacity) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new RawYAxisLabel(value, label, opacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawYAxisLabel)) {
            return false;
        }
        RawYAxisLabel rawYAxisLabel = (RawYAxisLabel) other;
        return Double.compare(this.value, rawYAxisLabel.value) == 0 && Intrinsics.areEqual(this.label, rawYAxisLabel.label) && Double.compare(this.opacity, rawYAxisLabel.opacity) == 0;
    }

    public int hashCode() {
        return (((Double.hashCode(this.value) * 31) + this.label.hashCode()) * 31) + Double.hashCode(this.opacity);
    }

    public String toString() {
        return "RawYAxisLabel(value=" + this.value + ", label=" + this.label + ", opacity=" + this.opacity + ")";
    }

    /* compiled from: RawYAxisLabel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/RawYAxisLabel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/RawYAxisLabel;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RawYAxisLabel> serializer() {
            return RawYAxisLabel2.INSTANCE;
        }
    }

    public /* synthetic */ RawYAxisLabel(int i, double d, String str, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, RawYAxisLabel2.INSTANCE.getDescriptor());
        }
        this.value = d;
        this.label = str;
        this.opacity = d2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_options_simulated_returns_chart_externalDebug(RawYAxisLabel self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.value);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeDoubleElement(serialDesc, 2, self.opacity);
    }

    public RawYAxisLabel(double d, String label, double d2) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.value = d;
        this.label = label;
        this.opacity = d2;
    }

    public final double getValue() {
        return this.value;
    }

    public final String getLabel() {
        return this.label;
    }

    public final double getOpacity() {
        return this.opacity;
    }
}
