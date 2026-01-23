package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.IndividualBeneficiaryFlowDto;
import bonfire.proto.idl.beneficiaries.p031v1.ReuseBeneficiaryFlowDto;
import bonfire.proto.idl.beneficiaries.p031v1.TrustBeneficiaryFlowDto;
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

/* compiled from: BeneficiaryFlowTypeDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowType;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Surrogate;)V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto;", "flow_type", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowType;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Surrogate;", "Companion", "Surrogate", "FlowTypeDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class BeneficiaryFlowTypeDto implements Dto3<BeneficiaryFlowType>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BeneficiaryFlowTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BeneficiaryFlowTypeDto, BeneficiaryFlowType>> binaryBase64Serializer$delegate;
    private static final BeneficiaryFlowTypeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BeneficiaryFlowTypeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BeneficiaryFlowTypeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeneficiaryFlowTypeDto(FlowTypeDto flowTypeDto) {
        FlowTypeDto.Individual individual = flowTypeDto instanceof FlowTypeDto.Individual ? (FlowTypeDto.Individual) flowTypeDto : null;
        IndividualBeneficiaryFlowDto value = individual != null ? individual.getValue() : null;
        FlowTypeDto.Trust trust = flowTypeDto instanceof FlowTypeDto.Trust ? (FlowTypeDto.Trust) flowTypeDto : null;
        TrustBeneficiaryFlowDto value2 = trust != null ? trust.getValue() : null;
        FlowTypeDto.Reuse reuse = flowTypeDto instanceof FlowTypeDto.Reuse ? (FlowTypeDto.Reuse) flowTypeDto : null;
        this(new Surrogate(value, value2, reuse != null ? reuse.getValue() : null));
    }

    public /* synthetic */ BeneficiaryFlowTypeDto(FlowTypeDto flowTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : flowTypeDto);
    }

    @Override // com.robinhood.idl.Dto
    public BeneficiaryFlowType toProto() {
        IndividualBeneficiaryFlowDto individual = this.surrogate.getIndividual();
        IndividualBeneficiaryFlow proto = individual != null ? individual.toProto() : null;
        TrustBeneficiaryFlowDto trust = this.surrogate.getTrust();
        TrustBeneficiaryFlow proto2 = trust != null ? trust.toProto() : null;
        ReuseBeneficiaryFlowDto reuse = this.surrogate.getReuse();
        return new BeneficiaryFlowType(proto, proto2, reuse != null ? reuse.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[BeneficiaryFlowTypeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BeneficiaryFlowTypeDto) && Intrinsics.areEqual(((BeneficiaryFlowTypeDto) other).surrogate, this.surrogate);
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
    /* compiled from: BeneficiaryFlowTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Surrogate;", "", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "individual", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "trust", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "reuse", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "getIndividual", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "getIndividual$annotations", "()V", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "getTrust", "()Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "getTrust$annotations", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "getReuse", "()Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "getReuse$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IndividualBeneficiaryFlowDto individual;
        private final ReuseBeneficiaryFlowDto reuse;
        private final TrustBeneficiaryFlowDto trust;

        public Surrogate() {
            this((IndividualBeneficiaryFlowDto) null, (TrustBeneficiaryFlowDto) null, (ReuseBeneficiaryFlowDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.individual, surrogate.individual) && Intrinsics.areEqual(this.trust, surrogate.trust) && Intrinsics.areEqual(this.reuse, surrogate.reuse);
        }

        public int hashCode() {
            IndividualBeneficiaryFlowDto individualBeneficiaryFlowDto = this.individual;
            int iHashCode = (individualBeneficiaryFlowDto == null ? 0 : individualBeneficiaryFlowDto.hashCode()) * 31;
            TrustBeneficiaryFlowDto trustBeneficiaryFlowDto = this.trust;
            int iHashCode2 = (iHashCode + (trustBeneficiaryFlowDto == null ? 0 : trustBeneficiaryFlowDto.hashCode())) * 31;
            ReuseBeneficiaryFlowDto reuseBeneficiaryFlowDto = this.reuse;
            return iHashCode2 + (reuseBeneficiaryFlowDto != null ? reuseBeneficiaryFlowDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(individual=" + this.individual + ", trust=" + this.trust + ", reuse=" + this.reuse + ")";
        }

        /* compiled from: BeneficiaryFlowTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BeneficiaryFlowTypeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IndividualBeneficiaryFlowDto individualBeneficiaryFlowDto, TrustBeneficiaryFlowDto trustBeneficiaryFlowDto, ReuseBeneficiaryFlowDto reuseBeneficiaryFlowDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.individual = null;
            } else {
                this.individual = individualBeneficiaryFlowDto;
            }
            if ((i & 2) == 0) {
                this.trust = null;
            } else {
                this.trust = trustBeneficiaryFlowDto;
            }
            if ((i & 4) == 0) {
                this.reuse = null;
            } else {
                this.reuse = reuseBeneficiaryFlowDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            IndividualBeneficiaryFlowDto individualBeneficiaryFlowDto = self.individual;
            if (individualBeneficiaryFlowDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IndividualBeneficiaryFlowDto.Serializer.INSTANCE, individualBeneficiaryFlowDto);
            }
            TrustBeneficiaryFlowDto trustBeneficiaryFlowDto = self.trust;
            if (trustBeneficiaryFlowDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TrustBeneficiaryFlowDto.Serializer.INSTANCE, trustBeneficiaryFlowDto);
            }
            ReuseBeneficiaryFlowDto reuseBeneficiaryFlowDto = self.reuse;
            if (reuseBeneficiaryFlowDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ReuseBeneficiaryFlowDto.Serializer.INSTANCE, reuseBeneficiaryFlowDto);
            }
        }

        public Surrogate(IndividualBeneficiaryFlowDto individualBeneficiaryFlowDto, TrustBeneficiaryFlowDto trustBeneficiaryFlowDto, ReuseBeneficiaryFlowDto reuseBeneficiaryFlowDto) {
            this.individual = individualBeneficiaryFlowDto;
            this.trust = trustBeneficiaryFlowDto;
            this.reuse = reuseBeneficiaryFlowDto;
        }

        public /* synthetic */ Surrogate(IndividualBeneficiaryFlowDto individualBeneficiaryFlowDto, TrustBeneficiaryFlowDto trustBeneficiaryFlowDto, ReuseBeneficiaryFlowDto reuseBeneficiaryFlowDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : individualBeneficiaryFlowDto, (i & 2) != 0 ? null : trustBeneficiaryFlowDto, (i & 4) != 0 ? null : reuseBeneficiaryFlowDto);
        }

        public final IndividualBeneficiaryFlowDto getIndividual() {
            return this.individual;
        }

        public final TrustBeneficiaryFlowDto getTrust() {
            return this.trust;
        }

        public final ReuseBeneficiaryFlowDto getReuse() {
            return this.reuse;
        }
    }

    /* compiled from: BeneficiaryFlowTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BeneficiaryFlowTypeDto, BeneficiaryFlowType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BeneficiaryFlowTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryFlowTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryFlowTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) BeneficiaryFlowTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BeneficiaryFlowType> getProtoAdapter() {
            return BeneficiaryFlowType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryFlowTypeDto getZeroValue() {
            return BeneficiaryFlowTypeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryFlowTypeDto fromProto(BeneficiaryFlowType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IndividualBeneficiaryFlow individual = proto.getIndividual();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IndividualBeneficiaryFlowDto individualBeneficiaryFlowDtoFromProto = individual != null ? IndividualBeneficiaryFlowDto.INSTANCE.fromProto(individual) : null;
            TrustBeneficiaryFlow trust = proto.getTrust();
            TrustBeneficiaryFlowDto trustBeneficiaryFlowDtoFromProto = trust != null ? TrustBeneficiaryFlowDto.INSTANCE.fromProto(trust) : null;
            ReuseBeneficiaryFlow reuse = proto.getReuse();
            return new BeneficiaryFlowTypeDto(new Surrogate(individualBeneficiaryFlowDtoFromProto, trustBeneficiaryFlowDtoFromProto, reuse != null ? ReuseBeneficiaryFlowDto.INSTANCE.fromProto(reuse) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryFlowTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BeneficiaryFlowTypeDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BeneficiaryFlowTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Individual", "Trust", "Reuse", "Companion", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto$Individual;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto$Reuse;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto$Trust;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class FlowTypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ FlowTypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FlowTypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: BeneficiaryFlowTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto$Individual;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "value", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "getValue", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Individual extends FlowTypeDto {
            private final IndividualBeneficiaryFlowDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Individual) && Intrinsics.areEqual(this.value, ((Individual) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Individual(value=" + this.value + ")";
            }

            public final IndividualBeneficiaryFlowDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Individual(IndividualBeneficiaryFlowDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BeneficiaryFlowTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto$Trust;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto;", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "value", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "getValue", "()Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Trust extends FlowTypeDto {
            private final TrustBeneficiaryFlowDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Trust) && Intrinsics.areEqual(this.value, ((Trust) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Trust(value=" + this.value + ")";
            }

            public final TrustBeneficiaryFlowDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Trust(TrustBeneficiaryFlowDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BeneficiaryFlowTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto$Reuse;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto;", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "value", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "getValue", "()Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Reuse extends FlowTypeDto {
            private final ReuseBeneficiaryFlowDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Reuse) && Intrinsics.areEqual(this.value, ((Reuse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Reuse(value=" + this.value + ")";
            }

            public final ReuseBeneficiaryFlowDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reuse(ReuseBeneficiaryFlowDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BeneficiaryFlowTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$FlowTypeDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowType;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<FlowTypeDto, BeneficiaryFlowType> {
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
            public ProtoAdapter<BeneficiaryFlowType> getProtoAdapter() {
                return BeneficiaryFlowType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FlowTypeDto fromProto(BeneficiaryFlowType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getIndividual() != null) {
                    return new Individual(IndividualBeneficiaryFlowDto.INSTANCE.fromProto(proto.getIndividual()));
                }
                if (proto.getTrust() != null) {
                    return new Trust(TrustBeneficiaryFlowDto.INSTANCE.fromProto(proto.getTrust()));
                }
                if (proto.getReuse() != null) {
                    return new Reuse(ReuseBeneficiaryFlowDto.INSTANCE.fromProto(proto.getReuse()));
                }
                return null;
            }
        }
    }

    /* compiled from: BeneficiaryFlowTypeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BeneficiaryFlowTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowType", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BeneficiaryFlowTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BeneficiaryFlowTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BeneficiaryFlowTypeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BeneficiaryFlowTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTypeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTypeDto";
        }
    }
}
