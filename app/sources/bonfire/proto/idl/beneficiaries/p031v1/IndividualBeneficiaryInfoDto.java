package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRelationshipDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
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

/* compiled from: IndividualBeneficiaryInfoDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfo;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Surrogate;)V", "", "first_name", "last_name", GovernmentIdNfcScan.dateOfBirthName, "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationshipDto;", "relationship", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationshipDto;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfo;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class IndividualBeneficiaryInfoDto implements Dto3<IndividualBeneficiaryInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IndividualBeneficiaryInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IndividualBeneficiaryInfoDto, IndividualBeneficiaryInfo>> binaryBase64Serializer$delegate;
    private static final IndividualBeneficiaryInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IndividualBeneficiaryInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IndividualBeneficiaryInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ IndividualBeneficiaryInfoDto(String str, String str2, String str3, BeneficiaryRelationshipDto beneficiaryRelationshipDto, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BeneficiaryRelationshipDto.INSTANCE.getZeroValue() : beneficiaryRelationshipDto, (i & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndividualBeneficiaryInfoDto(String first_name, String last_name, String date_of_birth, BeneficiaryRelationshipDto relationship, String email) {
        this(new Surrogate(first_name, last_name, date_of_birth, relationship, email));
        Intrinsics.checkNotNullParameter(first_name, "first_name");
        Intrinsics.checkNotNullParameter(last_name, "last_name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        Intrinsics.checkNotNullParameter(email, "email");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IndividualBeneficiaryInfo toProto() {
        return new IndividualBeneficiaryInfo(this.surrogate.getFirst_name(), this.surrogate.getLast_name(), this.surrogate.getDate_of_birth(), (BeneficiaryRelationship) this.surrogate.getRelationship().toProto(), this.surrogate.getEmail(), null, 32, null);
    }

    public String toString() {
        return "[IndividualBeneficiaryInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IndividualBeneficiaryInfoDto) && Intrinsics.areEqual(((IndividualBeneficiaryInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: IndividualBeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010!\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Surrogate;", "", "", "first_name", "last_name", GovernmentIdNfcScan.dateOfBirthName, "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationshipDto;", "relationship", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationshipDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationshipDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirst_name", "getFirst_name$annotations", "()V", "getLast_name", "getLast_name$annotations", "getDate_of_birth", "getDate_of_birth$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationshipDto;", "getRelationship", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationshipDto;", "getRelationship$annotations", "getEmail", "getEmail$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String date_of_birth;
        private final String email;
        private final String first_name;
        private final String last_name;
        private final BeneficiaryRelationshipDto relationship;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (BeneficiaryRelationshipDto) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.first_name, surrogate.first_name) && Intrinsics.areEqual(this.last_name, surrogate.last_name) && Intrinsics.areEqual(this.date_of_birth, surrogate.date_of_birth) && this.relationship == surrogate.relationship && Intrinsics.areEqual(this.email, surrogate.email);
        }

        public int hashCode() {
            return (((((((this.first_name.hashCode() * 31) + this.last_name.hashCode()) * 31) + this.date_of_birth.hashCode()) * 31) + this.relationship.hashCode()) * 31) + this.email.hashCode();
        }

        public String toString() {
            return "Surrogate(first_name=" + this.first_name + ", last_name=" + this.last_name + ", date_of_birth=" + this.date_of_birth + ", relationship=" + this.relationship + ", email=" + this.email + ")";
        }

        /* compiled from: IndividualBeneficiaryInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IndividualBeneficiaryInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, BeneficiaryRelationshipDto beneficiaryRelationshipDto, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.first_name = "";
            } else {
                this.first_name = str;
            }
            if ((i & 2) == 0) {
                this.last_name = "";
            } else {
                this.last_name = str2;
            }
            if ((i & 4) == 0) {
                this.date_of_birth = "";
            } else {
                this.date_of_birth = str3;
            }
            if ((i & 8) == 0) {
                this.relationship = BeneficiaryRelationshipDto.INSTANCE.getZeroValue();
            } else {
                this.relationship = beneficiaryRelationshipDto;
            }
            if ((i & 16) == 0) {
                this.email = "";
            } else {
                this.email = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.first_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.first_name);
            }
            if (!Intrinsics.areEqual(self.last_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.last_name);
            }
            if (!Intrinsics.areEqual(self.date_of_birth, "")) {
                output.encodeStringElement(serialDesc, 2, self.date_of_birth);
            }
            if (self.relationship != BeneficiaryRelationshipDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, BeneficiaryRelationshipDto.Serializer.INSTANCE, self.relationship);
            }
            if (Intrinsics.areEqual(self.email, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.email);
        }

        public Surrogate(String first_name, String last_name, String date_of_birth, BeneficiaryRelationshipDto relationship, String email) {
            Intrinsics.checkNotNullParameter(first_name, "first_name");
            Intrinsics.checkNotNullParameter(last_name, "last_name");
            Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
            Intrinsics.checkNotNullParameter(relationship, "relationship");
            Intrinsics.checkNotNullParameter(email, "email");
            this.first_name = first_name;
            this.last_name = last_name;
            this.date_of_birth = date_of_birth;
            this.relationship = relationship;
            this.email = email;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, BeneficiaryRelationshipDto beneficiaryRelationshipDto, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BeneficiaryRelationshipDto.INSTANCE.getZeroValue() : beneficiaryRelationshipDto, (i & 16) != 0 ? "" : str4);
        }

        public final String getFirst_name() {
            return this.first_name;
        }

        public final String getLast_name() {
            return this.last_name;
        }

        public final String getDate_of_birth() {
            return this.date_of_birth;
        }

        public final BeneficiaryRelationshipDto getRelationship() {
            return this.relationship;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: IndividualBeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<IndividualBeneficiaryInfoDto, IndividualBeneficiaryInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndividualBeneficiaryInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndividualBeneficiaryInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IndividualBeneficiaryInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) IndividualBeneficiaryInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IndividualBeneficiaryInfo> getProtoAdapter() {
            return IndividualBeneficiaryInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndividualBeneficiaryInfoDto getZeroValue() {
            return IndividualBeneficiaryInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IndividualBeneficiaryInfoDto fromProto(IndividualBeneficiaryInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new IndividualBeneficiaryInfoDto(new Surrogate(proto.getFirst_name(), proto.getLast_name(), proto.getDate_of_birth(), BeneficiaryRelationshipDto.INSTANCE.fromProto(proto.getRelationship()), proto.getEmail()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndividualBeneficiaryInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IndividualBeneficiaryInfoDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IndividualBeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IndividualBeneficiaryInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IndividualBeneficiaryInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IndividualBeneficiaryInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IndividualBeneficiaryInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IndividualBeneficiaryInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryInfoDto";
        }
    }
}
