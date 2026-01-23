package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.IndividualBeneficiaryInfoDto;
import bonfire.proto.idl.beneficiaries.p031v1.TrustBeneficiaryInfoDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: BeneficiaryInfoDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Surrogate;)V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto;", "beneficiary_info", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Surrogate;", "Companion", "Surrogate", "BeneficiaryInfoDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class BeneficiaryInfoDto implements Dto3<BeneficiaryInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BeneficiaryInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BeneficiaryInfoDto, BeneficiaryInfo>> binaryBase64Serializer$delegate;
    private static final BeneficiaryInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BeneficiaryInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BeneficiaryInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeneficiaryInfoDto(AbstractC49483BeneficiaryInfoDto abstractC49483BeneficiaryInfoDto) {
        AbstractC49483BeneficiaryInfoDto.IndividualInfo individualInfo = abstractC49483BeneficiaryInfoDto instanceof AbstractC49483BeneficiaryInfoDto.IndividualInfo ? (AbstractC49483BeneficiaryInfoDto.IndividualInfo) abstractC49483BeneficiaryInfoDto : null;
        IndividualBeneficiaryInfoDto value = individualInfo != null ? individualInfo.getValue() : null;
        AbstractC49483BeneficiaryInfoDto.TrustInfo trustInfo = abstractC49483BeneficiaryInfoDto instanceof AbstractC49483BeneficiaryInfoDto.TrustInfo ? (AbstractC49483BeneficiaryInfoDto.TrustInfo) abstractC49483BeneficiaryInfoDto : null;
        this(new Surrogate(value, trustInfo != null ? trustInfo.getValue() : null));
    }

    public /* synthetic */ BeneficiaryInfoDto(AbstractC49483BeneficiaryInfoDto abstractC49483BeneficiaryInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : abstractC49483BeneficiaryInfoDto);
    }

    @Override // com.robinhood.idl.Dto
    public BeneficiaryInfo toProto() {
        IndividualBeneficiaryInfoDto individual_info = this.surrogate.getIndividual_info();
        IndividualBeneficiaryInfo proto = individual_info != null ? individual_info.toProto() : null;
        TrustBeneficiaryInfoDto trust_info = this.surrogate.getTrust_info();
        return new BeneficiaryInfo(proto, trust_info != null ? trust_info.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BeneficiaryInfoDto) && Intrinsics.areEqual(((BeneficiaryInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: BeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Surrogate;", "", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "individual_info", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;", "trust_info", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "getIndividual_info", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "getIndividual_info$annotations", "()V", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;", "getTrust_info", "()Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;", "getTrust_info$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IndividualBeneficiaryInfoDto individual_info;
        private final TrustBeneficiaryInfoDto trust_info;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((IndividualBeneficiaryInfoDto) null, (TrustBeneficiaryInfoDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.individual_info, surrogate.individual_info) && Intrinsics.areEqual(this.trust_info, surrogate.trust_info);
        }

        public int hashCode() {
            IndividualBeneficiaryInfoDto individualBeneficiaryInfoDto = this.individual_info;
            int iHashCode = (individualBeneficiaryInfoDto == null ? 0 : individualBeneficiaryInfoDto.hashCode()) * 31;
            TrustBeneficiaryInfoDto trustBeneficiaryInfoDto = this.trust_info;
            return iHashCode + (trustBeneficiaryInfoDto != null ? trustBeneficiaryInfoDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(individual_info=" + this.individual_info + ", trust_info=" + this.trust_info + ")";
        }

        /* compiled from: BeneficiaryInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BeneficiaryInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IndividualBeneficiaryInfoDto individualBeneficiaryInfoDto, TrustBeneficiaryInfoDto trustBeneficiaryInfoDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.individual_info = null;
            } else {
                this.individual_info = individualBeneficiaryInfoDto;
            }
            if ((i & 2) == 0) {
                this.trust_info = null;
            } else {
                this.trust_info = trustBeneficiaryInfoDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            IndividualBeneficiaryInfoDto individualBeneficiaryInfoDto = self.individual_info;
            if (individualBeneficiaryInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IndividualBeneficiaryInfoDto.Serializer.INSTANCE, individualBeneficiaryInfoDto);
            }
            TrustBeneficiaryInfoDto trustBeneficiaryInfoDto = self.trust_info;
            if (trustBeneficiaryInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TrustBeneficiaryInfoDto.Serializer.INSTANCE, trustBeneficiaryInfoDto);
            }
        }

        public Surrogate(IndividualBeneficiaryInfoDto individualBeneficiaryInfoDto, TrustBeneficiaryInfoDto trustBeneficiaryInfoDto) {
            this.individual_info = individualBeneficiaryInfoDto;
            this.trust_info = trustBeneficiaryInfoDto;
        }

        public /* synthetic */ Surrogate(IndividualBeneficiaryInfoDto individualBeneficiaryInfoDto, TrustBeneficiaryInfoDto trustBeneficiaryInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : individualBeneficiaryInfoDto, (i & 2) != 0 ? null : trustBeneficiaryInfoDto);
        }

        public final IndividualBeneficiaryInfoDto getIndividual_info() {
            return this.individual_info;
        }

        public final TrustBeneficiaryInfoDto getTrust_info() {
            return this.trust_info;
        }
    }

    /* compiled from: BeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BeneficiaryInfoDto, BeneficiaryInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BeneficiaryInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) BeneficiaryInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BeneficiaryInfo> getProtoAdapter() {
            return BeneficiaryInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryInfoDto getZeroValue() {
            return BeneficiaryInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryInfoDto fromProto(BeneficiaryInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IndividualBeneficiaryInfo individual_info = proto.getIndividual_info();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IndividualBeneficiaryInfoDto individualBeneficiaryInfoDtoFromProto = individual_info != null ? IndividualBeneficiaryInfoDto.INSTANCE.fromProto(individual_info) : null;
            TrustBeneficiaryInfo trust_info = proto.getTrust_info();
            return new BeneficiaryInfoDto(new Surrogate(individualBeneficiaryInfoDtoFromProto, trust_info != null ? TrustBeneficiaryInfoDto.INSTANCE.fromProto(trust_info) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BeneficiaryInfoDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "IndividualInfo", "TrustInfo", "Companion", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto$IndividualInfo;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto$TrustInfo;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto$BeneficiaryInfoDto, reason: collision with other inner class name */
    public static abstract class AbstractC49483BeneficiaryInfoDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ AbstractC49483BeneficiaryInfoDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC49483BeneficiaryInfoDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: BeneficiaryInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto$IndividualInfo;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "value", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "getValue", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto$BeneficiaryInfoDto$IndividualInfo, reason: from toString */
        public static final /* data */ class IndividualInfo extends AbstractC49483BeneficiaryInfoDto {
            private final IndividualBeneficiaryInfoDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IndividualInfo) && Intrinsics.areEqual(this.value, ((IndividualInfo) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "IndividualInfo(value=" + this.value + ")";
            }

            public final IndividualBeneficiaryInfoDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IndividualInfo(IndividualBeneficiaryInfoDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BeneficiaryInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto$TrustInfo;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto;", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;", "value", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;", "getValue", "()Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfoDto;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto$BeneficiaryInfoDto$TrustInfo, reason: from toString */
        public static final /* data */ class TrustInfo extends AbstractC49483BeneficiaryInfoDto {
            private final TrustBeneficiaryInfoDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrustInfo) && Intrinsics.areEqual(this.value, ((TrustInfo) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TrustInfo(value=" + this.value + ")";
            }

            public final TrustBeneficiaryInfoDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TrustInfo(TrustBeneficiaryInfoDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BeneficiaryInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$BeneficiaryInfoDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto$BeneficiaryInfoDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto4.Creator<AbstractC49483BeneficiaryInfoDto, BeneficiaryInfo> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BeneficiaryInfo> getProtoAdapter() {
                return BeneficiaryInfo.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AbstractC49483BeneficiaryInfoDto fromProto(BeneficiaryInfo proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getIndividual_info() != null) {
                    return new IndividualInfo(IndividualBeneficiaryInfoDto.INSTANCE.fromProto(proto.getIndividual_info()));
                }
                if (proto.getTrust_info() != null) {
                    return new TrustInfo(TrustBeneficiaryInfoDto.INSTANCE.fromProto(proto.getTrust_info()));
                }
                return null;
            }
        }
    }

    /* compiled from: BeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BeneficiaryInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BeneficiaryInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BeneficiaryInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BeneficiaryInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto";
        }
    }
}
