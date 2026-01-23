package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: MarginCallMarketOrderDataMismatchDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatch;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$Surrogate;)V", "expected_close_positions_count", "", "actual_close_positions_count", "expected_estimated_value", "", "actual_estimated_value", "(IIDD)V", "getExpected_close_positions_count", "()I", "getActual_close_positions_count", "getExpected_estimated_value", "()D", "getActual_estimated_value", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class MarginCallMarketOrderDataMismatchDto implements Dto3<MarginCallMarketOrderDataMismatch>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginCallMarketOrderDataMismatchDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginCallMarketOrderDataMismatchDto, MarginCallMarketOrderDataMismatch>> binaryBase64Serializer$delegate;
    private static final MarginCallMarketOrderDataMismatchDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginCallMarketOrderDataMismatchDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginCallMarketOrderDataMismatchDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getExpected_close_positions_count() {
        return this.surrogate.getExpected_close_positions_count();
    }

    public final int getActual_close_positions_count() {
        return this.surrogate.getActual_close_positions_count();
    }

    public final double getExpected_estimated_value() {
        return this.surrogate.getExpected_estimated_value();
    }

    public final double getActual_estimated_value() {
        return this.surrogate.getActual_estimated_value();
    }

    public /* synthetic */ MarginCallMarketOrderDataMismatchDto(int i, int i2, double d, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) != 0 ? 0.0d : d2);
    }

    public MarginCallMarketOrderDataMismatchDto(int i, int i2, double d, double d2) {
        this(new Surrogate(i, i2, d, d2));
    }

    public static /* synthetic */ MarginCallMarketOrderDataMismatchDto copy$default(MarginCallMarketOrderDataMismatchDto marginCallMarketOrderDataMismatchDto, int i, int i2, double d, double d2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = marginCallMarketOrderDataMismatchDto.surrogate.getExpected_close_positions_count();
        }
        if ((i3 & 2) != 0) {
            i2 = marginCallMarketOrderDataMismatchDto.surrogate.getActual_close_positions_count();
        }
        if ((i3 & 4) != 0) {
            d = marginCallMarketOrderDataMismatchDto.surrogate.getExpected_estimated_value();
        }
        if ((i3 & 8) != 0) {
            d2 = marginCallMarketOrderDataMismatchDto.surrogate.getActual_estimated_value();
        }
        double d3 = d2;
        return marginCallMarketOrderDataMismatchDto.copy(i, i2, d, d3);
    }

    public final MarginCallMarketOrderDataMismatchDto copy(int expected_close_positions_count, int actual_close_positions_count, double expected_estimated_value, double actual_estimated_value) {
        return new MarginCallMarketOrderDataMismatchDto(new Surrogate(expected_close_positions_count, actual_close_positions_count, expected_estimated_value, actual_estimated_value));
    }

    @Override // com.robinhood.idl.Dto
    public MarginCallMarketOrderDataMismatch toProto() {
        return new MarginCallMarketOrderDataMismatch(this.surrogate.getExpected_close_positions_count(), this.surrogate.getActual_close_positions_count(), this.surrogate.getExpected_estimated_value(), this.surrogate.getActual_estimated_value(), null, 16, null);
    }

    public String toString() {
        return "[MarginCallMarketOrderDataMismatchDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginCallMarketOrderDataMismatchDto) && Intrinsics.areEqual(((MarginCallMarketOrderDataMismatchDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MarginCallMarketOrderDataMismatchDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201Bk\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n¢\u0006\u0004\b\f\u0010\rB;\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\u0018\u0010\u001d\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001e\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001f\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010 \u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\nHÆ\u0003Jm\u0010!\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R+\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u000b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001a¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$Surrogate;", "", "expected_close_positions_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "actual_close_positions_count", "expected_estimated_value", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "actual_estimated_value", "<init>", "(IIDD)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getExpected_close_positions_count$annotations", "()V", "getExpected_close_positions_count", "()I", "getActual_close_positions_count$annotations", "getActual_close_positions_count", "getExpected_estimated_value$annotations", "getExpected_estimated_value", "()D", "getActual_estimated_value$annotations", "getActual_estimated_value", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int actual_close_positions_count;
        private final double actual_estimated_value;
        private final int expected_close_positions_count;
        private final double expected_estimated_value;

        public Surrogate() {
            this(0, 0, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, int i2, double d, double d2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = surrogate.expected_close_positions_count;
            }
            if ((i3 & 2) != 0) {
                i2 = surrogate.actual_close_positions_count;
            }
            if ((i3 & 4) != 0) {
                d = surrogate.expected_estimated_value;
            }
            if ((i3 & 8) != 0) {
                d2 = surrogate.actual_estimated_value;
            }
            double d3 = d2;
            return surrogate.copy(i, i2, d, d3);
        }

        @SerialName("actualClosePositionsCount")
        @JsonAnnotations2(names = {"actual_close_positions_count"})
        public static /* synthetic */ void getActual_close_positions_count$annotations() {
        }

        @SerialName("actualEstimatedValue")
        @JsonAnnotations2(names = {"actual_estimated_value"})
        public static /* synthetic */ void getActual_estimated_value$annotations() {
        }

        @SerialName("expectedClosePositionsCount")
        @JsonAnnotations2(names = {"expected_close_positions_count"})
        public static /* synthetic */ void getExpected_close_positions_count$annotations() {
        }

        @SerialName("expectedEstimatedValue")
        @JsonAnnotations2(names = {"expected_estimated_value"})
        public static /* synthetic */ void getExpected_estimated_value$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getExpected_close_positions_count() {
            return this.expected_close_positions_count;
        }

        /* renamed from: component2, reason: from getter */
        public final int getActual_close_positions_count() {
            return this.actual_close_positions_count;
        }

        /* renamed from: component3, reason: from getter */
        public final double getExpected_estimated_value() {
            return this.expected_estimated_value;
        }

        /* renamed from: component4, reason: from getter */
        public final double getActual_estimated_value() {
            return this.actual_estimated_value;
        }

        public final Surrogate copy(int expected_close_positions_count, int actual_close_positions_count, double expected_estimated_value, double actual_estimated_value) {
            return new Surrogate(expected_close_positions_count, actual_close_positions_count, expected_estimated_value, actual_estimated_value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.expected_close_positions_count == surrogate.expected_close_positions_count && this.actual_close_positions_count == surrogate.actual_close_positions_count && Double.compare(this.expected_estimated_value, surrogate.expected_estimated_value) == 0 && Double.compare(this.actual_estimated_value, surrogate.actual_estimated_value) == 0;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.expected_close_positions_count) * 31) + Integer.hashCode(this.actual_close_positions_count)) * 31) + Double.hashCode(this.expected_estimated_value)) * 31) + Double.hashCode(this.actual_estimated_value);
        }

        public String toString() {
            return "Surrogate(expected_close_positions_count=" + this.expected_close_positions_count + ", actual_close_positions_count=" + this.actual_close_positions_count + ", expected_estimated_value=" + this.expected_estimated_value + ", actual_estimated_value=" + this.actual_estimated_value + ")";
        }

        /* compiled from: MarginCallMarketOrderDataMismatchDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginCallMarketOrderDataMismatchDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.expected_close_positions_count = 0;
            } else {
                this.expected_close_positions_count = i2;
            }
            if ((i & 2) == 0) {
                this.actual_close_positions_count = 0;
            } else {
                this.actual_close_positions_count = i3;
            }
            if ((i & 4) == 0) {
                this.expected_estimated_value = 0.0d;
            } else {
                this.expected_estimated_value = d;
            }
            if ((i & 8) == 0) {
                this.actual_estimated_value = 0.0d;
            } else {
                this.actual_estimated_value = d2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.expected_close_positions_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.actual_close_positions_count;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (Double.compare(self.expected_estimated_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.expected_estimated_value));
            }
            if (Double.compare(self.actual_estimated_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.actual_estimated_value));
            }
        }

        public Surrogate(int i, int i2, double d, double d2) {
            this.expected_close_positions_count = i;
            this.actual_close_positions_count = i2;
            this.expected_estimated_value = d;
            this.actual_estimated_value = d2;
        }

        public /* synthetic */ Surrogate(int i, int i2, double d, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) != 0 ? 0.0d : d2);
        }

        public final int getExpected_close_positions_count() {
            return this.expected_close_positions_count;
        }

        public final int getActual_close_positions_count() {
            return this.actual_close_positions_count;
        }

        public final double getExpected_estimated_value() {
            return this.expected_estimated_value;
        }

        public final double getActual_estimated_value() {
            return this.actual_estimated_value;
        }
    }

    /* compiled from: MarginCallMarketOrderDataMismatchDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto;", "Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatch;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MarginCallMarketOrderDataMismatchDto, MarginCallMarketOrderDataMismatch> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginCallMarketOrderDataMismatchDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginCallMarketOrderDataMismatchDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginCallMarketOrderDataMismatchDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginCallMarketOrderDataMismatchDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginCallMarketOrderDataMismatch> getProtoAdapter() {
            return MarginCallMarketOrderDataMismatch.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginCallMarketOrderDataMismatchDto getZeroValue() {
            return MarginCallMarketOrderDataMismatchDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginCallMarketOrderDataMismatchDto fromProto(MarginCallMarketOrderDataMismatch proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MarginCallMarketOrderDataMismatchDto(new Surrogate(proto.getExpected_close_positions_count(), proto.getActual_close_positions_count(), proto.getExpected_estimated_value(), proto.getActual_estimated_value()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MarginCallMarketOrderDataMismatchDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCallMarketOrderDataMismatchDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginCallMarketOrderDataMismatchDto(0, 0, 0.0d, 0.0d, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginCallMarketOrderDataMismatchDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MarginCallMarketOrderDataMismatchDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MarginCallMarketOrderDataMismatch", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginCallMarketOrderDataMismatchDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginCallMarketOrderDataMismatchDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginCallMarketOrderDataMismatchDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginCallMarketOrderDataMismatchDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatchDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MarginCallMarketOrderDataMismatchDto";
        }
    }
}
