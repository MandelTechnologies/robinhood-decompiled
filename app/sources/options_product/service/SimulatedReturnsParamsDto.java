package options_product.service;

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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SimulatedReturnsParamsDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bw\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010/R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010+R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010+R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010+R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010+R\u0011\u0010\u0014\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010/R\u0011\u0010\u0015\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010/¨\u00068"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsParamsDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/SimulatedReturnsParams;", "Landroid/os/Parcelable;", "Loptions_product/service/SimulatedReturnsParamsDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/SimulatedReturnsParamsDto$Surrogate;)V", "", "implied_volatility", "yield_input", "interest_rate", "", "option_id", "", "is_valid_iv", "strike_price", "spot_price", "tau", "mark_price", "is_put", "is_european", "(DDDLjava/lang/String;ZDDDDZZ)V", "toProto", "()Loptions_product/service/SimulatedReturnsParams;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/SimulatedReturnsParamsDto$Surrogate;", "getImplied_volatility", "()D", "getYield_input", "getInterest_rate", "getOption_id", "()Z", "getStrike_price", "getSpot_price", "getTau", "getMark_price", "Companion", "Surrogate", "Serializer", "MultibindingModule", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class SimulatedReturnsParamsDto implements Dto3<SimulatedReturnsParams>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SimulatedReturnsParamsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SimulatedReturnsParamsDto, SimulatedReturnsParams>> binaryBase64Serializer$delegate;
    private static final SimulatedReturnsParamsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SimulatedReturnsParamsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SimulatedReturnsParamsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final double getImplied_volatility() {
        return this.surrogate.getImplied_volatility();
    }

    public final double getYield_input() {
        return this.surrogate.getYield_input();
    }

    public final double getInterest_rate() {
        return this.surrogate.getInterest_rate();
    }

    public final String getOption_id() {
        return this.surrogate.getOption_id();
    }

    public final boolean is_valid_iv() {
        return this.surrogate.getIs_valid_iv();
    }

    public final double getStrike_price() {
        return this.surrogate.getStrike_price();
    }

    public final double getSpot_price() {
        return this.surrogate.getSpot_price();
    }

    public final double getTau() {
        return this.surrogate.getTau();
    }

    public final double getMark_price() {
        return this.surrogate.getMark_price();
    }

    public final boolean is_put() {
        return this.surrogate.getIs_put();
    }

    public final boolean is_european() {
        return this.surrogate.getIs_european();
    }

    public /* synthetic */ SimulatedReturnsParamsDto(double d, double d2, double d3, String str, boolean z, double d4, double d5, double d6, double d7, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) != 0 ? 0.0d : d6, (i & 256) != 0 ? 0.0d : d7, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimulatedReturnsParamsDto(double d, double d2, double d3, String option_id, boolean z, double d4, double d5, double d6, double d7, boolean z2, boolean z3) {
        this(new Surrogate(d, d2, d3, option_id, z, d4, d5, d6, d7, z2, z3));
        Intrinsics.checkNotNullParameter(option_id, "option_id");
    }

    @Override // com.robinhood.idl.Dto
    public SimulatedReturnsParams toProto() {
        return new SimulatedReturnsParams(this.surrogate.getImplied_volatility(), this.surrogate.getYield_input(), this.surrogate.getInterest_rate(), this.surrogate.getOption_id(), this.surrogate.getIs_valid_iv(), this.surrogate.getStrike_price(), this.surrogate.getSpot_price(), this.surrogate.getTau(), this.surrogate.getMark_price(), this.surrogate.getIs_put(), this.surrogate.getIs_european(), null, 2048, null);
    }

    public String toString() {
        return "[SimulatedReturnsParamsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SimulatedReturnsParamsDto) && Intrinsics.areEqual(((SimulatedReturnsParamsDto) other).surrogate, this.surrogate);
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
    /* compiled from: SimulatedReturnsParamsDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCBÞ\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014Bu\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010,R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010,R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010$R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b\f\u00107R/\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010*\u0012\u0004\b:\u0010.\u001a\u0004\b9\u0010,R/\u0010\u000e\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010*\u0012\u0004\b<\u0010.\u001a\u0004\b;\u0010,R/\u0010\u000f\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010*\u0012\u0004\b>\u0010.\u001a\u0004\b=\u0010,R/\u0010\u0010\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010*\u0012\u0004\b@\u0010.\u001a\u0004\b?\u0010,R \u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00106\u0012\u0004\bA\u0010.\u001a\u0004\b\u0011\u00107R \u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00106\u0012\u0004\bB\u0010.\u001a\u0004\b\u0012\u00107¨\u0006E"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsParamsDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "implied_volatility", "yield_input", "interest_rate", "", "option_id", "", "is_valid_iv", "strike_price", "spot_price", "tau", "mark_price", "is_put", "is_european", "<init>", "(DDDLjava/lang/String;ZDDDDZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDDLjava/lang/String;ZDDDDZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_externalRelease", "(Loptions_product/service/SimulatedReturnsParamsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getImplied_volatility", "()D", "getImplied_volatility$annotations", "()V", "getYield_input", "getYield_input$annotations", "getInterest_rate", "getInterest_rate$annotations", "Ljava/lang/String;", "getOption_id", "getOption_id$annotations", "Z", "()Z", "is_valid_iv$annotations", "getStrike_price", "getStrike_price$annotations", "getSpot_price", "getSpot_price$annotations", "getTau", "getTau$annotations", "getMark_price", "getMark_price$annotations", "is_put$annotations", "is_european$annotations", "Companion", "$serializer", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double implied_volatility;
        private final double interest_rate;
        private final boolean is_european;
        private final boolean is_put;
        private final boolean is_valid_iv;
        private final double mark_price;
        private final String option_id;
        private final double spot_price;
        private final double strike_price;
        private final double tau;
        private final double yield_input;

        public Surrogate() {
            this(0.0d, 0.0d, 0.0d, (String) null, false, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Double.compare(this.implied_volatility, surrogate.implied_volatility) == 0 && Double.compare(this.yield_input, surrogate.yield_input) == 0 && Double.compare(this.interest_rate, surrogate.interest_rate) == 0 && Intrinsics.areEqual(this.option_id, surrogate.option_id) && this.is_valid_iv == surrogate.is_valid_iv && Double.compare(this.strike_price, surrogate.strike_price) == 0 && Double.compare(this.spot_price, surrogate.spot_price) == 0 && Double.compare(this.tau, surrogate.tau) == 0 && Double.compare(this.mark_price, surrogate.mark_price) == 0 && this.is_put == surrogate.is_put && this.is_european == surrogate.is_european;
        }

        public int hashCode() {
            return (((((((((((((((((((Double.hashCode(this.implied_volatility) * 31) + Double.hashCode(this.yield_input)) * 31) + Double.hashCode(this.interest_rate)) * 31) + this.option_id.hashCode()) * 31) + Boolean.hashCode(this.is_valid_iv)) * 31) + Double.hashCode(this.strike_price)) * 31) + Double.hashCode(this.spot_price)) * 31) + Double.hashCode(this.tau)) * 31) + Double.hashCode(this.mark_price)) * 31) + Boolean.hashCode(this.is_put)) * 31) + Boolean.hashCode(this.is_european);
        }

        public String toString() {
            return "Surrogate(implied_volatility=" + this.implied_volatility + ", yield_input=" + this.yield_input + ", interest_rate=" + this.interest_rate + ", option_id=" + this.option_id + ", is_valid_iv=" + this.is_valid_iv + ", strike_price=" + this.strike_price + ", spot_price=" + this.spot_price + ", tau=" + this.tau + ", mark_price=" + this.mark_price + ", is_put=" + this.is_put + ", is_european=" + this.is_european + ")";
        }

        /* compiled from: SimulatedReturnsParamsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsParamsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/SimulatedReturnsParamsDto$Surrogate;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SimulatedReturnsParamsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, double d, double d2, double d3, String str, boolean z, double d4, double d5, double d6, double d7, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.implied_volatility = 0.0d;
            } else {
                this.implied_volatility = d;
            }
            if ((i & 2) == 0) {
                this.yield_input = 0.0d;
            } else {
                this.yield_input = d2;
            }
            if ((i & 4) == 0) {
                this.interest_rate = 0.0d;
            } else {
                this.interest_rate = d3;
            }
            if ((i & 8) == 0) {
                this.option_id = "";
            } else {
                this.option_id = str;
            }
            if ((i & 16) == 0) {
                this.is_valid_iv = false;
            } else {
                this.is_valid_iv = z;
            }
            if ((i & 32) == 0) {
                this.strike_price = 0.0d;
            } else {
                this.strike_price = d4;
            }
            if ((i & 64) == 0) {
                this.spot_price = 0.0d;
            } else {
                this.spot_price = d5;
            }
            if ((i & 128) == 0) {
                this.tau = 0.0d;
            } else {
                this.tau = d6;
            }
            if ((i & 256) == 0) {
                this.mark_price = 0.0d;
            } else {
                this.mark_price = d7;
            }
            if ((i & 512) == 0) {
                this.is_put = false;
            } else {
                this.is_put = z2;
            }
            if ((i & 1024) == 0) {
                this.is_european = false;
            } else {
                this.is_european = z3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Double.compare(self.implied_volatility, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.implied_volatility));
            }
            if (Double.compare(self.yield_input, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.yield_input));
            }
            if (Double.compare(self.interest_rate, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.interest_rate));
            }
            if (!Intrinsics.areEqual(self.option_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.option_id);
            }
            boolean z = self.is_valid_iv;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            if (Double.compare(self.strike_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.strike_price));
            }
            if (Double.compare(self.spot_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.spot_price));
            }
            if (Double.compare(self.tau, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.tau));
            }
            if (Double.compare(self.mark_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 8, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.mark_price));
            }
            boolean z2 = self.is_put;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 9, z2);
            }
            boolean z3 = self.is_european;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 10, z3);
            }
        }

        public Surrogate(double d, double d2, double d3, String option_id, boolean z, double d4, double d5, double d6, double d7, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(option_id, "option_id");
            this.implied_volatility = d;
            this.yield_input = d2;
            this.interest_rate = d3;
            this.option_id = option_id;
            this.is_valid_iv = z;
            this.strike_price = d4;
            this.spot_price = d5;
            this.tau = d6;
            this.mark_price = d7;
            this.is_put = z2;
            this.is_european = z3;
        }

        public final double getImplied_volatility() {
            return this.implied_volatility;
        }

        public final double getYield_input() {
            return this.yield_input;
        }

        public final double getInterest_rate() {
            return this.interest_rate;
        }

        public final String getOption_id() {
            return this.option_id;
        }

        public /* synthetic */ Surrogate(double d, double d2, double d3, String str, boolean z, double d4, double d5, double d6, double d7, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) != 0 ? 0.0d : d6, (i & 256) != 0 ? 0.0d : d7, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3);
        }

        /* renamed from: is_valid_iv, reason: from getter */
        public final boolean getIs_valid_iv() {
            return this.is_valid_iv;
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
    }

    /* compiled from: SimulatedReturnsParamsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsParamsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/SimulatedReturnsParamsDto;", "Loptions_product/service/SimulatedReturnsParams;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/SimulatedReturnsParamsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SimulatedReturnsParamsDto, SimulatedReturnsParams> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SimulatedReturnsParamsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SimulatedReturnsParamsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SimulatedReturnsParamsDto> getBinaryBase64Serializer() {
            return (KSerializer) SimulatedReturnsParamsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SimulatedReturnsParams> getProtoAdapter() {
            return SimulatedReturnsParams.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SimulatedReturnsParamsDto getZeroValue() {
            return SimulatedReturnsParamsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SimulatedReturnsParamsDto fromProto(SimulatedReturnsParams proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SimulatedReturnsParamsDto(new Surrogate(proto.getImplied_volatility(), proto.getYield_input(), proto.getInterest_rate(), proto.getOption_id(), proto.getIs_valid_iv(), proto.getStrike_price(), proto.getSpot_price(), proto.getTau(), proto.getMark_price(), proto.getIs_put(), proto.getIs_european()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.SimulatedReturnsParamsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SimulatedReturnsParamsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SimulatedReturnsParamsDto(0.0d, 0.0d, 0.0d, null, false, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SimulatedReturnsParamsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsParamsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/SimulatedReturnsParamsDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/SimulatedReturnsParamsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SimulatedReturnsParamsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.SimulatedReturnsParams", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SimulatedReturnsParamsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SimulatedReturnsParamsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SimulatedReturnsParamsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SimulatedReturnsParamsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsParamsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "options_product.service.SimulatedReturnsParamsDto";
        }
    }
}
