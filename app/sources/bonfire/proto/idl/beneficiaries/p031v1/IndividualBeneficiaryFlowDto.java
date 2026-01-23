package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAccountViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowDOBViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowEmailViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowLegalNameViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowRelationshipViewModelDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
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

/* compiled from: IndividualBeneficiaryFlowDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Surrogate;)V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModelDto;", "legal_name_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModelDto;", "relationship_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModelDto;", "dob_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;", "email_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "account_view_model", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class IndividualBeneficiaryFlowDto implements Dto3<IndividualBeneficiaryFlow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IndividualBeneficiaryFlowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IndividualBeneficiaryFlowDto, IndividualBeneficiaryFlow>> binaryBase64Serializer$delegate;
    private static final IndividualBeneficiaryFlowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IndividualBeneficiaryFlowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IndividualBeneficiaryFlowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ IndividualBeneficiaryFlowDto(BeneficiaryFlowLegalNameViewModelDto beneficiaryFlowLegalNameViewModelDto, BeneficiaryFlowRelationshipViewModelDto beneficiaryFlowRelationshipViewModelDto, BeneficiaryFlowDOBViewModelDto beneficiaryFlowDOBViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : beneficiaryFlowLegalNameViewModelDto, (i & 2) != 0 ? null : beneficiaryFlowRelationshipViewModelDto, (i & 4) != 0 ? null : beneficiaryFlowDOBViewModelDto, (i & 8) != 0 ? null : beneficiaryFlowEmailViewModelDto, (i & 16) != 0 ? null : beneficiaryFlowAccountViewModelDto);
    }

    public IndividualBeneficiaryFlowDto(BeneficiaryFlowLegalNameViewModelDto beneficiaryFlowLegalNameViewModelDto, BeneficiaryFlowRelationshipViewModelDto beneficiaryFlowRelationshipViewModelDto, BeneficiaryFlowDOBViewModelDto beneficiaryFlowDOBViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto) {
        this(new Surrogate(beneficiaryFlowLegalNameViewModelDto, beneficiaryFlowRelationshipViewModelDto, beneficiaryFlowDOBViewModelDto, beneficiaryFlowEmailViewModelDto, beneficiaryFlowAccountViewModelDto));
    }

    @Override // com.robinhood.idl.Dto
    public IndividualBeneficiaryFlow toProto() {
        BeneficiaryFlowLegalNameViewModelDto legal_name_view_model = this.surrogate.getLegal_name_view_model();
        BeneficiaryFlowLegalNameViewModel proto = legal_name_view_model != null ? legal_name_view_model.toProto() : null;
        BeneficiaryFlowRelationshipViewModelDto relationship_view_model = this.surrogate.getRelationship_view_model();
        BeneficiaryFlowRelationshipViewModel proto2 = relationship_view_model != null ? relationship_view_model.toProto() : null;
        BeneficiaryFlowDOBViewModelDto dob_view_model = this.surrogate.getDob_view_model();
        BeneficiaryFlowDOBViewModel proto3 = dob_view_model != null ? dob_view_model.toProto() : null;
        BeneficiaryFlowEmailViewModelDto email_view_model = this.surrogate.getEmail_view_model();
        BeneficiaryFlowEmailViewModel proto4 = email_view_model != null ? email_view_model.toProto() : null;
        BeneficiaryFlowAccountViewModelDto account_view_model = this.surrogate.getAccount_view_model();
        return new IndividualBeneficiaryFlow(proto, proto2, proto3, proto4, account_view_model != null ? account_view_model.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[IndividualBeneficiaryFlowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IndividualBeneficiaryFlowDto) && Intrinsics.areEqual(((IndividualBeneficiaryFlowDto) other).surrogate, this.surrogate);
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
    /* compiled from: IndividualBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Surrogate;", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModelDto;", "legal_name_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModelDto;", "relationship_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModelDto;", "dob_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;", "email_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "account_view_model", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModelDto;", "getLegal_name_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModelDto;", "getLegal_name_view_model$annotations", "()V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModelDto;", "getRelationship_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModelDto;", "getRelationship_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModelDto;", "getDob_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModelDto;", "getDob_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;", "getEmail_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;", "getEmail_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "getAccount_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "getAccount_view_model$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BeneficiaryFlowAccountViewModelDto account_view_model;
        private final BeneficiaryFlowDOBViewModelDto dob_view_model;
        private final BeneficiaryFlowEmailViewModelDto email_view_model;
        private final BeneficiaryFlowLegalNameViewModelDto legal_name_view_model;
        private final BeneficiaryFlowRelationshipViewModelDto relationship_view_model;

        public Surrogate() {
            this((BeneficiaryFlowLegalNameViewModelDto) null, (BeneficiaryFlowRelationshipViewModelDto) null, (BeneficiaryFlowDOBViewModelDto) null, (BeneficiaryFlowEmailViewModelDto) null, (BeneficiaryFlowAccountViewModelDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.legal_name_view_model, surrogate.legal_name_view_model) && Intrinsics.areEqual(this.relationship_view_model, surrogate.relationship_view_model) && Intrinsics.areEqual(this.dob_view_model, surrogate.dob_view_model) && Intrinsics.areEqual(this.email_view_model, surrogate.email_view_model) && Intrinsics.areEqual(this.account_view_model, surrogate.account_view_model);
        }

        public int hashCode() {
            BeneficiaryFlowLegalNameViewModelDto beneficiaryFlowLegalNameViewModelDto = this.legal_name_view_model;
            int iHashCode = (beneficiaryFlowLegalNameViewModelDto == null ? 0 : beneficiaryFlowLegalNameViewModelDto.hashCode()) * 31;
            BeneficiaryFlowRelationshipViewModelDto beneficiaryFlowRelationshipViewModelDto = this.relationship_view_model;
            int iHashCode2 = (iHashCode + (beneficiaryFlowRelationshipViewModelDto == null ? 0 : beneficiaryFlowRelationshipViewModelDto.hashCode())) * 31;
            BeneficiaryFlowDOBViewModelDto beneficiaryFlowDOBViewModelDto = this.dob_view_model;
            int iHashCode3 = (iHashCode2 + (beneficiaryFlowDOBViewModelDto == null ? 0 : beneficiaryFlowDOBViewModelDto.hashCode())) * 31;
            BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto = this.email_view_model;
            int iHashCode4 = (iHashCode3 + (beneficiaryFlowEmailViewModelDto == null ? 0 : beneficiaryFlowEmailViewModelDto.hashCode())) * 31;
            BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto = this.account_view_model;
            return iHashCode4 + (beneficiaryFlowAccountViewModelDto != null ? beneficiaryFlowAccountViewModelDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(legal_name_view_model=" + this.legal_name_view_model + ", relationship_view_model=" + this.relationship_view_model + ", dob_view_model=" + this.dob_view_model + ", email_view_model=" + this.email_view_model + ", account_view_model=" + this.account_view_model + ")";
        }

        /* compiled from: IndividualBeneficiaryFlowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IndividualBeneficiaryFlowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BeneficiaryFlowLegalNameViewModelDto beneficiaryFlowLegalNameViewModelDto, BeneficiaryFlowRelationshipViewModelDto beneficiaryFlowRelationshipViewModelDto, BeneficiaryFlowDOBViewModelDto beneficiaryFlowDOBViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.legal_name_view_model = null;
            } else {
                this.legal_name_view_model = beneficiaryFlowLegalNameViewModelDto;
            }
            if ((i & 2) == 0) {
                this.relationship_view_model = null;
            } else {
                this.relationship_view_model = beneficiaryFlowRelationshipViewModelDto;
            }
            if ((i & 4) == 0) {
                this.dob_view_model = null;
            } else {
                this.dob_view_model = beneficiaryFlowDOBViewModelDto;
            }
            if ((i & 8) == 0) {
                this.email_view_model = null;
            } else {
                this.email_view_model = beneficiaryFlowEmailViewModelDto;
            }
            if ((i & 16) == 0) {
                this.account_view_model = null;
            } else {
                this.account_view_model = beneficiaryFlowAccountViewModelDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            BeneficiaryFlowLegalNameViewModelDto beneficiaryFlowLegalNameViewModelDto = self.legal_name_view_model;
            if (beneficiaryFlowLegalNameViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BeneficiaryFlowLegalNameViewModelDto.Serializer.INSTANCE, beneficiaryFlowLegalNameViewModelDto);
            }
            BeneficiaryFlowRelationshipViewModelDto beneficiaryFlowRelationshipViewModelDto = self.relationship_view_model;
            if (beneficiaryFlowRelationshipViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BeneficiaryFlowRelationshipViewModelDto.Serializer.INSTANCE, beneficiaryFlowRelationshipViewModelDto);
            }
            BeneficiaryFlowDOBViewModelDto beneficiaryFlowDOBViewModelDto = self.dob_view_model;
            if (beneficiaryFlowDOBViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BeneficiaryFlowDOBViewModelDto.Serializer.INSTANCE, beneficiaryFlowDOBViewModelDto);
            }
            BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto = self.email_view_model;
            if (beneficiaryFlowEmailViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BeneficiaryFlowEmailViewModelDto.Serializer.INSTANCE, beneficiaryFlowEmailViewModelDto);
            }
            BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto = self.account_view_model;
            if (beneficiaryFlowAccountViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BeneficiaryFlowAccountViewModelDto.Serializer.INSTANCE, beneficiaryFlowAccountViewModelDto);
            }
        }

        public Surrogate(BeneficiaryFlowLegalNameViewModelDto beneficiaryFlowLegalNameViewModelDto, BeneficiaryFlowRelationshipViewModelDto beneficiaryFlowRelationshipViewModelDto, BeneficiaryFlowDOBViewModelDto beneficiaryFlowDOBViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto) {
            this.legal_name_view_model = beneficiaryFlowLegalNameViewModelDto;
            this.relationship_view_model = beneficiaryFlowRelationshipViewModelDto;
            this.dob_view_model = beneficiaryFlowDOBViewModelDto;
            this.email_view_model = beneficiaryFlowEmailViewModelDto;
            this.account_view_model = beneficiaryFlowAccountViewModelDto;
        }

        public /* synthetic */ Surrogate(BeneficiaryFlowLegalNameViewModelDto beneficiaryFlowLegalNameViewModelDto, BeneficiaryFlowRelationshipViewModelDto beneficiaryFlowRelationshipViewModelDto, BeneficiaryFlowDOBViewModelDto beneficiaryFlowDOBViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : beneficiaryFlowLegalNameViewModelDto, (i & 2) != 0 ? null : beneficiaryFlowRelationshipViewModelDto, (i & 4) != 0 ? null : beneficiaryFlowDOBViewModelDto, (i & 8) != 0 ? null : beneficiaryFlowEmailViewModelDto, (i & 16) != 0 ? null : beneficiaryFlowAccountViewModelDto);
        }

        public final BeneficiaryFlowLegalNameViewModelDto getLegal_name_view_model() {
            return this.legal_name_view_model;
        }

        public final BeneficiaryFlowRelationshipViewModelDto getRelationship_view_model() {
            return this.relationship_view_model;
        }

        public final BeneficiaryFlowDOBViewModelDto getDob_view_model() {
            return this.dob_view_model;
        }

        public final BeneficiaryFlowEmailViewModelDto getEmail_view_model() {
            return this.email_view_model;
        }

        public final BeneficiaryFlowAccountViewModelDto getAccount_view_model() {
            return this.account_view_model;
        }
    }

    /* compiled from: IndividualBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IndividualBeneficiaryFlowDto, IndividualBeneficiaryFlow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndividualBeneficiaryFlowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndividualBeneficiaryFlowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndividualBeneficiaryFlowDto> getBinaryBase64Serializer() {
            return (KSerializer) IndividualBeneficiaryFlowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IndividualBeneficiaryFlow> getProtoAdapter() {
            return IndividualBeneficiaryFlow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndividualBeneficiaryFlowDto getZeroValue() {
            return IndividualBeneficiaryFlowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndividualBeneficiaryFlowDto fromProto(IndividualBeneficiaryFlow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BeneficiaryFlowLegalNameViewModel legal_name_view_model = proto.getLegal_name_view_model();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BeneficiaryFlowLegalNameViewModelDto beneficiaryFlowLegalNameViewModelDtoFromProto = legal_name_view_model != null ? BeneficiaryFlowLegalNameViewModelDto.INSTANCE.fromProto(legal_name_view_model) : null;
            BeneficiaryFlowRelationshipViewModel relationship_view_model = proto.getRelationship_view_model();
            BeneficiaryFlowRelationshipViewModelDto beneficiaryFlowRelationshipViewModelDtoFromProto = relationship_view_model != null ? BeneficiaryFlowRelationshipViewModelDto.INSTANCE.fromProto(relationship_view_model) : null;
            BeneficiaryFlowDOBViewModel dob_view_model = proto.getDob_view_model();
            BeneficiaryFlowDOBViewModelDto beneficiaryFlowDOBViewModelDtoFromProto = dob_view_model != null ? BeneficiaryFlowDOBViewModelDto.INSTANCE.fromProto(dob_view_model) : null;
            BeneficiaryFlowEmailViewModel email_view_model = proto.getEmail_view_model();
            BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDtoFromProto = email_view_model != null ? BeneficiaryFlowEmailViewModelDto.INSTANCE.fromProto(email_view_model) : null;
            BeneficiaryFlowAccountViewModel account_view_model = proto.getAccount_view_model();
            return new IndividualBeneficiaryFlowDto(new Surrogate(beneficiaryFlowLegalNameViewModelDtoFromProto, beneficiaryFlowRelationshipViewModelDtoFromProto, beneficiaryFlowDOBViewModelDtoFromProto, beneficiaryFlowEmailViewModelDtoFromProto, account_view_model != null ? BeneficiaryFlowAccountViewModelDto.INSTANCE.fromProto(account_view_model) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryFlowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndividualBeneficiaryFlowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IndividualBeneficiaryFlowDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IndividualBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IndividualBeneficiaryFlowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryFlow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IndividualBeneficiaryFlowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IndividualBeneficiaryFlowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IndividualBeneficiaryFlowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IndividualBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryFlowDto";
        }
    }
}
