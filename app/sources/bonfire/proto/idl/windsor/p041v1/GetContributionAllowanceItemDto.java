package bonfire.proto.idl.windsor.p041v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetContributionAllowanceItemDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItem;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Surrogate;)V", "", "tax_year", "Lcom/robinhood/rosetta/common/MoneyDto;", "allowance", "contributed", "", "tax_year_label", "(ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItem;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Surrogate;", "getTax_year", "getAllowance", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getContributed", "getTax_year_label", "Companion", "Surrogate", "Serializer", "MultibindingModule", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetContributionAllowanceItemDto implements Dto3<GetContributionAllowanceItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetContributionAllowanceItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetContributionAllowanceItemDto, GetContributionAllowanceItem>> binaryBase64Serializer$delegate;
    private static final GetContributionAllowanceItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetContributionAllowanceItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetContributionAllowanceItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getTax_year() {
        return this.surrogate.getTax_year();
    }

    public final MoneyDto getAllowance() {
        return this.surrogate.getAllowance();
    }

    public final MoneyDto getContributed() {
        return this.surrogate.getContributed();
    }

    public final String getTax_year_label() {
        return this.surrogate.getTax_year_label();
    }

    public /* synthetic */ GetContributionAllowanceItemDto(int i, MoneyDto moneyDto, MoneyDto moneyDto2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : moneyDto, (i2 & 4) != 0 ? null : moneyDto2, (i2 & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetContributionAllowanceItemDto(int i, MoneyDto moneyDto, MoneyDto moneyDto2, String tax_year_label) {
        this(new Surrogate(i, moneyDto, moneyDto2, tax_year_label));
        Intrinsics.checkNotNullParameter(tax_year_label, "tax_year_label");
    }

    @Override // com.robinhood.idl.Dto
    public GetContributionAllowanceItem toProto() {
        int tax_year = this.surrogate.getTax_year();
        MoneyDto allowance = this.surrogate.getAllowance();
        Money proto = allowance != null ? allowance.toProto() : null;
        MoneyDto contributed = this.surrogate.getContributed();
        return new GetContributionAllowanceItem(tax_year, proto, contributed != null ? contributed.toProto() : null, this.surrogate.getTax_year_label(), null, 16, null);
    }

    public String toString() {
        return "[GetContributionAllowanceItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetContributionAllowanceItemDto) && Intrinsics.areEqual(((GetContributionAllowanceItemDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetContributionAllowanceItemDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210BB\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBA\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010)R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010\u001c¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "tax_year", "Lcom/robinhood/rosetta/common/MoneyDto;", "allowance", "contributed", "", "tax_year_label", "<init>", "(ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$windsor_v1_externalRelease", "(Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTax_year", "getTax_year$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAllowance", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAllowance$annotations", "getContributed", "getContributed$annotations", "Ljava/lang/String;", "getTax_year_label", "getTax_year_label$annotations", "Companion", "$serializer", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto allowance;
        private final MoneyDto contributed;
        private final int tax_year;
        private final String tax_year_label;

        public Surrogate() {
            this(0, (MoneyDto) null, (MoneyDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.tax_year == surrogate.tax_year && Intrinsics.areEqual(this.allowance, surrogate.allowance) && Intrinsics.areEqual(this.contributed, surrogate.contributed) && Intrinsics.areEqual(this.tax_year_label, surrogate.tax_year_label);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.tax_year) * 31;
            MoneyDto moneyDto = this.allowance;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.contributed;
            return ((iHashCode2 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.tax_year_label.hashCode();
        }

        public String toString() {
            return "Surrogate(tax_year=" + this.tax_year + ", allowance=" + this.allowance + ", contributed=" + this.contributed + ", tax_year_label=" + this.tax_year_label + ")";
        }

        /* compiled from: GetContributionAllowanceItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Surrogate;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetContributionAllowanceItemDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, MoneyDto moneyDto, MoneyDto moneyDto2, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.tax_year = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.allowance = null;
            } else {
                this.allowance = moneyDto;
            }
            if ((i & 4) == 0) {
                this.contributed = null;
            } else {
                this.contributed = moneyDto2;
            }
            if ((i & 8) == 0) {
                this.tax_year_label = "";
            } else {
                this.tax_year_label = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$windsor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.tax_year;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            MoneyDto moneyDto = self.allowance;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.contributed;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (Intrinsics.areEqual(self.tax_year_label, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.tax_year_label);
        }

        public Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, String tax_year_label) {
            Intrinsics.checkNotNullParameter(tax_year_label, "tax_year_label");
            this.tax_year = i;
            this.allowance = moneyDto;
            this.contributed = moneyDto2;
            this.tax_year_label = tax_year_label;
        }

        public final int getTax_year() {
            return this.tax_year;
        }

        public final MoneyDto getAllowance() {
            return this.allowance;
        }

        public final MoneyDto getContributed() {
            return this.contributed;
        }

        public final String getTax_year_label() {
            return this.tax_year_label;
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : moneyDto, (i2 & 4) != 0 ? null : moneyDto2, (i2 & 8) != 0 ? "" : str);
        }
    }

    /* compiled from: GetContributionAllowanceItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetContributionAllowanceItemDto, GetContributionAllowanceItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetContributionAllowanceItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetContributionAllowanceItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetContributionAllowanceItemDto> getBinaryBase64Serializer() {
            return (KSerializer) GetContributionAllowanceItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetContributionAllowanceItem> getProtoAdapter() {
            return GetContributionAllowanceItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetContributionAllowanceItemDto getZeroValue() {
            return GetContributionAllowanceItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetContributionAllowanceItemDto fromProto(GetContributionAllowanceItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int tax_year = proto.getTax_year();
            Money allowance = proto.getAllowance();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = allowance != null ? MoneyDto.INSTANCE.fromProto(allowance) : null;
            Money contributed = proto.getContributed();
            return new GetContributionAllowanceItemDto(new Surrogate(tax_year, moneyDtoFromProto, contributed != null ? MoneyDto.INSTANCE.fromProto(contributed) : null, proto.getTax_year_label()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.windsor.v1.GetContributionAllowanceItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetContributionAllowanceItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetContributionAllowanceItemDto(0, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetContributionAllowanceItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetContributionAllowanceItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.windsor.v1.GetContributionAllowanceItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetContributionAllowanceItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetContributionAllowanceItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetContributionAllowanceItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetContributionAllowanceItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.windsor.v1.GetContributionAllowanceItemDto";
        }
    }
}
