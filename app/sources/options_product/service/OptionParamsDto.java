package options_product.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: OptionParamsDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006*"}, m3636d2 = {"Loptions_product/service/OptionParamsDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/OptionParams;", "Landroid/os/Parcelable;", "Loptions_product/service/OptionParamsDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/OptionParamsDto$Surrogate;)V", "", "strike_price", "spot_price", "tau", "mark_price", "", "is_put", "is_european", "", "option_id", "(DDDDZZLjava/lang/String;)V", "toProto", "()Loptions_product/service/OptionParams;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/OptionParamsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class OptionParamsDto implements Dto3<OptionParams>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionParamsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionParamsDto, OptionParams>> binaryBase64Serializer$delegate;
    private static final OptionParamsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionParamsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionParamsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ OptionParamsDto(double d, double d2, double d3, double d4, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionParamsDto(double d, double d2, double d3, double d4, boolean z, boolean z2, String option_id) {
        this(new Surrogate(d, d2, d3, d4, z, z2, option_id));
        Intrinsics.checkNotNullParameter(option_id, "option_id");
    }

    @Override // com.robinhood.idl.Dto
    public OptionParams toProto() {
        return new OptionParams(this.surrogate.getStrike_price(), this.surrogate.getSpot_price(), this.surrogate.getTau(), this.surrogate.getMark_price(), this.surrogate.getIs_put(), this.surrogate.getIs_european(), this.surrogate.getOption_id(), null, 128, null);
    }

    public String toString() {
        return "[OptionParamsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionParamsDto) && Intrinsics.areEqual(((OptionParamsDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionParamsDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298B\u0089\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BU\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010(R/\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010(R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b3\u0010*\u001a\u0004\b\u000b\u00102R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b4\u0010*\u001a\u0004\b\f\u00102R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b7\u0010*\u001a\u0004\b6\u0010 ¨\u0006:"}, m3636d2 = {"Loptions_product/service/OptionParamsDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "strike_price", "spot_price", "tau", "mark_price", "", "is_put", "is_european", "", "option_id", "<init>", "(DDDDZZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDDDZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_externalRelease", "(Loptions_product/service/OptionParamsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getStrike_price", "()D", "getStrike_price$annotations", "()V", "getSpot_price", "getSpot_price$annotations", "getTau", "getTau$annotations", "getMark_price", "getMark_price$annotations", "Z", "()Z", "is_put$annotations", "is_european$annotations", "Ljava/lang/String;", "getOption_id", "getOption_id$annotations", "Companion", "$serializer", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean is_european;
        private final boolean is_put;
        private final double mark_price;
        private final String option_id;
        private final double spot_price;
        private final double strike_price;
        private final double tau;

        public Surrogate() {
            this(0.0d, 0.0d, 0.0d, 0.0d, false, false, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Double.compare(this.strike_price, surrogate.strike_price) == 0 && Double.compare(this.spot_price, surrogate.spot_price) == 0 && Double.compare(this.tau, surrogate.tau) == 0 && Double.compare(this.mark_price, surrogate.mark_price) == 0 && this.is_put == surrogate.is_put && this.is_european == surrogate.is_european && Intrinsics.areEqual(this.option_id, surrogate.option_id);
        }

        public int hashCode() {
            return (((((((((((Double.hashCode(this.strike_price) * 31) + Double.hashCode(this.spot_price)) * 31) + Double.hashCode(this.tau)) * 31) + Double.hashCode(this.mark_price)) * 31) + Boolean.hashCode(this.is_put)) * 31) + Boolean.hashCode(this.is_european)) * 31) + this.option_id.hashCode();
        }

        public String toString() {
            return "Surrogate(strike_price=" + this.strike_price + ", spot_price=" + this.spot_price + ", tau=" + this.tau + ", mark_price=" + this.mark_price + ", is_put=" + this.is_put + ", is_european=" + this.is_european + ", option_id=" + this.option_id + ")";
        }

        /* compiled from: OptionParamsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/OptionParamsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/OptionParamsDto$Surrogate;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionParamsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, double d, double d2, double d3, double d4, boolean z, boolean z2, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.strike_price = 0.0d;
            } else {
                this.strike_price = d;
            }
            if ((i & 2) == 0) {
                this.spot_price = 0.0d;
            } else {
                this.spot_price = d2;
            }
            if ((i & 4) == 0) {
                this.tau = 0.0d;
            } else {
                this.tau = d3;
            }
            if ((i & 8) == 0) {
                this.mark_price = 0.0d;
            } else {
                this.mark_price = d4;
            }
            if ((i & 16) == 0) {
                this.is_put = false;
            } else {
                this.is_put = z;
            }
            if ((i & 32) == 0) {
                this.is_european = false;
            } else {
                this.is_european = z2;
            }
            if ((i & 64) == 0) {
                this.option_id = "";
            } else {
                this.option_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Double.compare(self.strike_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.strike_price));
            }
            if (Double.compare(self.spot_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.spot_price));
            }
            if (Double.compare(self.tau, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.tau));
            }
            if (Double.compare(self.mark_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.mark_price));
            }
            boolean z = self.is_put;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            boolean z2 = self.is_european;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 5, z2);
            }
            if (Intrinsics.areEqual(self.option_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.option_id);
        }

        public Surrogate(double d, double d2, double d3, double d4, boolean z, boolean z2, String option_id) {
            Intrinsics.checkNotNullParameter(option_id, "option_id");
            this.strike_price = d;
            this.spot_price = d2;
            this.tau = d3;
            this.mark_price = d4;
            this.is_put = z;
            this.is_european = z2;
            this.option_id = option_id;
        }

        public final double getStrike_price() {
            return this.strike_price;
        }

        public final double getSpot_price() {
            return this.spot_price;
        }

        public final double getTau() {
            return this.tau;
        }

        public final double getMark_price() {
            return this.mark_price;
        }

        /* renamed from: is_put, reason: from getter */
        public final boolean getIs_put() {
            return this.is_put;
        }

        /* renamed from: is_european, reason: from getter */
        public final boolean getIs_european() {
            return this.is_european;
        }

        public final String getOption_id() {
            return this.option_id;
        }

        public /* synthetic */ Surrogate(double d, double d2, double d3, double d4, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? "" : str);
        }
    }

    /* compiled from: OptionParamsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/OptionParamsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/OptionParamsDto;", "Loptions_product/service/OptionParams;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/OptionParamsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OptionParamsDto, OptionParams> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionParamsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionParamsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionParamsDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionParamsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionParams> getProtoAdapter() {
            return OptionParams.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionParamsDto getZeroValue() {
            return OptionParamsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionParamsDto fromProto(OptionParams proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OptionParamsDto(new Surrogate(proto.getStrike_price(), proto.getSpot_price(), proto.getTau(), proto.getMark_price(), proto.getIs_put(), proto.getIs_european(), proto.getOption_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.OptionParamsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionParamsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionParamsDto(0.0d, 0.0d, 0.0d, 0.0d, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionParamsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/OptionParamsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/OptionParamsDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/OptionParamsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OptionParamsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.OptionParams", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionParamsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionParamsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionParamsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionParamsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/OptionParamsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "options_product.service.OptionParamsDto";
        }
    }
}
