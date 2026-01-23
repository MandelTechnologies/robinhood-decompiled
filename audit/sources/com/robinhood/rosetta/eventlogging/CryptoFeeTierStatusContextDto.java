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

/* compiled from: CryptoFeeTierStatusContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$Surrogate;)V", "current_fee_tier", "", "next_fee_tier", "required_volume", "current_volume", "(DDDD)V", "getCurrent_fee_tier", "()D", "getNext_fee_tier", "getRequired_volume", "getCurrent_volume", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class CryptoFeeTierStatusContextDto implements Dto3<CryptoFeeTierStatusContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoFeeTierStatusContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoFeeTierStatusContextDto, CryptoFeeTierStatusContext>> binaryBase64Serializer$delegate;
    private static final CryptoFeeTierStatusContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoFeeTierStatusContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoFeeTierStatusContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final double getCurrent_fee_tier() {
        return this.surrogate.getCurrent_fee_tier();
    }

    public final double getNext_fee_tier() {
        return this.surrogate.getNext_fee_tier();
    }

    public final double getRequired_volume() {
        return this.surrogate.getRequired_volume();
    }

    public final double getCurrent_volume() {
        return this.surrogate.getCurrent_volume();
    }

    public /* synthetic */ CryptoFeeTierStatusContextDto(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4);
    }

    public CryptoFeeTierStatusContextDto(double d, double d2, double d3, double d4) {
        this(new Surrogate(d, d2, d3, d4));
    }

    public static /* synthetic */ CryptoFeeTierStatusContextDto copy$default(CryptoFeeTierStatusContextDto cryptoFeeTierStatusContextDto, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = cryptoFeeTierStatusContextDto.surrogate.getCurrent_fee_tier();
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = cryptoFeeTierStatusContextDto.surrogate.getNext_fee_tier();
        }
        double d6 = d2;
        if ((i & 4) != 0) {
            d3 = cryptoFeeTierStatusContextDto.surrogate.getRequired_volume();
        }
        return cryptoFeeTierStatusContextDto.copy(d5, d6, d3, (i & 8) != 0 ? cryptoFeeTierStatusContextDto.surrogate.getCurrent_volume() : d4);
    }

    public final CryptoFeeTierStatusContextDto copy(double current_fee_tier, double next_fee_tier, double required_volume, double current_volume) {
        return new CryptoFeeTierStatusContextDto(new Surrogate(current_fee_tier, next_fee_tier, required_volume, current_volume));
    }

    @Override // com.robinhood.idl.Dto
    public CryptoFeeTierStatusContext toProto() {
        return new CryptoFeeTierStatusContext(this.surrogate.getCurrent_fee_tier(), this.surrogate.getNext_fee_tier(), this.surrogate.getRequired_volume(), this.surrogate.getCurrent_volume(), null, 16, null);
    }

    public String toString() {
        return "[CryptoFeeTierStatusContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoFeeTierStatusContextDto) && Intrinsics.areEqual(((CryptoFeeTierStatusContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoFeeTierStatusContextDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./Bk\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\n\u0010\u000bB;\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0018\u0010\u001b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001c\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001d\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001e\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003Jm\u0010\u001f\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\rHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R+\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$Surrogate;", "", "current_fee_tier", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "next_fee_tier", "required_volume", "current_volume", "<init>", "(DDDD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCurrent_fee_tier$annotations", "()V", "getCurrent_fee_tier", "()D", "getNext_fee_tier$annotations", "getNext_fee_tier", "getRequired_volume$annotations", "getRequired_volume", "getCurrent_volume$annotations", "getCurrent_volume", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double current_fee_tier;
        private final double current_volume;
        private final double next_fee_tier;
        private final double required_volume;

        public Surrogate() {
            this(0.0d, 0.0d, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, double d2, double d3, double d4, int i, Object obj) {
            if ((i & 1) != 0) {
                d = surrogate.current_fee_tier;
            }
            double d5 = d;
            if ((i & 2) != 0) {
                d2 = surrogate.next_fee_tier;
            }
            double d6 = d2;
            if ((i & 4) != 0) {
                d3 = surrogate.required_volume;
            }
            return surrogate.copy(d5, d6, d3, (i & 8) != 0 ? surrogate.current_volume : d4);
        }

        @SerialName("currentFeeTier")
        @JsonAnnotations2(names = {"current_fee_tier"})
        public static /* synthetic */ void getCurrent_fee_tier$annotations() {
        }

        @SerialName("currentVolume")
        @JsonAnnotations2(names = {"current_volume"})
        public static /* synthetic */ void getCurrent_volume$annotations() {
        }

        @SerialName("nextFeeTier")
        @JsonAnnotations2(names = {"next_fee_tier"})
        public static /* synthetic */ void getNext_fee_tier$annotations() {
        }

        @SerialName("requiredVolume")
        @JsonAnnotations2(names = {"required_volume"})
        public static /* synthetic */ void getRequired_volume$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final double getCurrent_fee_tier() {
            return this.current_fee_tier;
        }

        /* renamed from: component2, reason: from getter */
        public final double getNext_fee_tier() {
            return this.next_fee_tier;
        }

        /* renamed from: component3, reason: from getter */
        public final double getRequired_volume() {
            return this.required_volume;
        }

        /* renamed from: component4, reason: from getter */
        public final double getCurrent_volume() {
            return this.current_volume;
        }

        public final Surrogate copy(double current_fee_tier, double next_fee_tier, double required_volume, double current_volume) {
            return new Surrogate(current_fee_tier, next_fee_tier, required_volume, current_volume);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Double.compare(this.current_fee_tier, surrogate.current_fee_tier) == 0 && Double.compare(this.next_fee_tier, surrogate.next_fee_tier) == 0 && Double.compare(this.required_volume, surrogate.required_volume) == 0 && Double.compare(this.current_volume, surrogate.current_volume) == 0;
        }

        public int hashCode() {
            return (((((Double.hashCode(this.current_fee_tier) * 31) + Double.hashCode(this.next_fee_tier)) * 31) + Double.hashCode(this.required_volume)) * 31) + Double.hashCode(this.current_volume);
        }

        public String toString() {
            return "Surrogate(current_fee_tier=" + this.current_fee_tier + ", next_fee_tier=" + this.next_fee_tier + ", required_volume=" + this.required_volume + ", current_volume=" + this.current_volume + ")";
        }

        /* compiled from: CryptoFeeTierStatusContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoFeeTierStatusContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, double d, double d2, double d3, double d4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.current_fee_tier = 0.0d;
            } else {
                this.current_fee_tier = d;
            }
            if ((i & 2) == 0) {
                this.next_fee_tier = 0.0d;
            } else {
                this.next_fee_tier = d2;
            }
            if ((i & 4) == 0) {
                this.required_volume = 0.0d;
            } else {
                this.required_volume = d3;
            }
            if ((i & 8) == 0) {
                this.current_volume = 0.0d;
            } else {
                this.current_volume = d4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Double.compare(self.current_fee_tier, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.current_fee_tier));
            }
            if (Double.compare(self.next_fee_tier, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.next_fee_tier));
            }
            if (Double.compare(self.required_volume, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.required_volume));
            }
            if (Double.compare(self.current_volume, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.current_volume));
            }
        }

        public Surrogate(double d, double d2, double d3, double d4) {
            this.current_fee_tier = d;
            this.next_fee_tier = d2;
            this.required_volume = d3;
            this.current_volume = d4;
        }

        public /* synthetic */ Surrogate(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4);
        }

        public final double getCurrent_fee_tier() {
            return this.current_fee_tier;
        }

        public final double getNext_fee_tier() {
            return this.next_fee_tier;
        }

        public final double getRequired_volume() {
            return this.required_volume;
        }

        public final double getCurrent_volume() {
            return this.current_volume;
        }
    }

    /* compiled from: CryptoFeeTierStatusContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CryptoFeeTierStatusContextDto, CryptoFeeTierStatusContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoFeeTierStatusContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoFeeTierStatusContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoFeeTierStatusContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoFeeTierStatusContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoFeeTierStatusContext> getProtoAdapter() {
            return CryptoFeeTierStatusContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoFeeTierStatusContextDto getZeroValue() {
            return CryptoFeeTierStatusContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoFeeTierStatusContextDto fromProto(CryptoFeeTierStatusContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CryptoFeeTierStatusContextDto(new Surrogate(proto.getCurrent_fee_tier(), proto.getNext_fee_tier(), proto.getRequired_volume(), proto.getCurrent_volume()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoFeeTierStatusContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoFeeTierStatusContextDto(0.0d, 0.0d, 0.0d, 0.0d, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoFeeTierStatusContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CryptoFeeTierStatusContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoFeeTierStatusContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoFeeTierStatusContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoFeeTierStatusContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoFeeTierStatusContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoFeeTierStatusContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContextDto";
        }
    }
}
