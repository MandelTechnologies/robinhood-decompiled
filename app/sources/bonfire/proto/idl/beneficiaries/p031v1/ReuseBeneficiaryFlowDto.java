package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAccountViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoDto;
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

/* compiled from: ReuseBeneficiaryFlowDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006)"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlow;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Surrogate;)V", "", "beneficiary_account_number", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "beneficiary_info", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "spousal_consent_agreement", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "account_view_model", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlow;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class ReuseBeneficiaryFlowDto implements Dto3<ReuseBeneficiaryFlow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ReuseBeneficiaryFlowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ReuseBeneficiaryFlowDto, ReuseBeneficiaryFlow>> binaryBase64Serializer$delegate;
    private static final ReuseBeneficiaryFlowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ReuseBeneficiaryFlowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ReuseBeneficiaryFlowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ ReuseBeneficiaryFlowDto(String str, BeneficiaryInfoDto beneficiaryInfoDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : beneficiaryInfoDto, (i & 4) != 0 ? null : beneficiaryFlowAgreementViewModelDto, (i & 8) != 0 ? null : beneficiaryFlowAccountViewModelDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReuseBeneficiaryFlowDto(String beneficiary_account_number, BeneficiaryInfoDto beneficiaryInfoDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto) {
        this(new Surrogate(beneficiary_account_number, beneficiaryInfoDto, beneficiaryFlowAgreementViewModelDto, beneficiaryFlowAccountViewModelDto));
        Intrinsics.checkNotNullParameter(beneficiary_account_number, "beneficiary_account_number");
    }

    @Override // com.robinhood.idl.Dto
    public ReuseBeneficiaryFlow toProto() {
        String beneficiary_account_number = this.surrogate.getBeneficiary_account_number();
        BeneficiaryInfoDto beneficiary_info = this.surrogate.getBeneficiary_info();
        BeneficiaryInfo proto = beneficiary_info != null ? beneficiary_info.toProto() : null;
        BeneficiaryFlowAgreementViewModelDto spousal_consent_agreement = this.surrogate.getSpousal_consent_agreement();
        BeneficiaryFlowAgreementViewModel proto2 = spousal_consent_agreement != null ? spousal_consent_agreement.toProto() : null;
        BeneficiaryFlowAccountViewModelDto account_view_model = this.surrogate.getAccount_view_model();
        return new ReuseBeneficiaryFlow(beneficiary_account_number, proto, proto2, account_view_model != null ? account_view_model.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[ReuseBeneficiaryFlowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ReuseBeneficiaryFlowDto) && Intrinsics.areEqual(((ReuseBeneficiaryFlowDto) other).surrogate, this.surrogate);
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
    /* compiled from: ReuseBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Surrogate;", "", "", "beneficiary_account_number", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "beneficiary_info", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "spousal_consent_agreement", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "account_view_model", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBeneficiary_account_number", "getBeneficiary_account_number$annotations", "()V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "getBeneficiary_info", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "getBeneficiary_info$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "getSpousal_consent_agreement", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "getSpousal_consent_agreement$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "getAccount_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "getAccount_view_model$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BeneficiaryFlowAccountViewModelDto account_view_model;
        private final String beneficiary_account_number;
        private final BeneficiaryInfoDto beneficiary_info;
        private final BeneficiaryFlowAgreementViewModelDto spousal_consent_agreement;

        public Surrogate() {
            this((String) null, (BeneficiaryInfoDto) null, (BeneficiaryFlowAgreementViewModelDto) null, (BeneficiaryFlowAccountViewModelDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.beneficiary_account_number, surrogate.beneficiary_account_number) && Intrinsics.areEqual(this.beneficiary_info, surrogate.beneficiary_info) && Intrinsics.areEqual(this.spousal_consent_agreement, surrogate.spousal_consent_agreement) && Intrinsics.areEqual(this.account_view_model, surrogate.account_view_model);
        }

        public int hashCode() {
            int iHashCode = this.beneficiary_account_number.hashCode() * 31;
            BeneficiaryInfoDto beneficiaryInfoDto = this.beneficiary_info;
            int iHashCode2 = (iHashCode + (beneficiaryInfoDto == null ? 0 : beneficiaryInfoDto.hashCode())) * 31;
            BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto = this.spousal_consent_agreement;
            int iHashCode3 = (iHashCode2 + (beneficiaryFlowAgreementViewModelDto == null ? 0 : beneficiaryFlowAgreementViewModelDto.hashCode())) * 31;
            BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto = this.account_view_model;
            return iHashCode3 + (beneficiaryFlowAccountViewModelDto != null ? beneficiaryFlowAccountViewModelDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(beneficiary_account_number=" + this.beneficiary_account_number + ", beneficiary_info=" + this.beneficiary_info + ", spousal_consent_agreement=" + this.spousal_consent_agreement + ", account_view_model=" + this.account_view_model + ")";
        }

        /* compiled from: ReuseBeneficiaryFlowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ReuseBeneficiaryFlowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BeneficiaryInfoDto beneficiaryInfoDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.beneficiary_account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.beneficiary_info = null;
            } else {
                this.beneficiary_info = beneficiaryInfoDto;
            }
            if ((i & 4) == 0) {
                this.spousal_consent_agreement = null;
            } else {
                this.spousal_consent_agreement = beneficiaryFlowAgreementViewModelDto;
            }
            if ((i & 8) == 0) {
                this.account_view_model = null;
            } else {
                this.account_view_model = beneficiaryFlowAccountViewModelDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.beneficiary_account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.beneficiary_account_number);
            }
            BeneficiaryInfoDto beneficiaryInfoDto = self.beneficiary_info;
            if (beneficiaryInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BeneficiaryInfoDto.Serializer.INSTANCE, beneficiaryInfoDto);
            }
            BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto = self.spousal_consent_agreement;
            if (beneficiaryFlowAgreementViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BeneficiaryFlowAgreementViewModelDto.Serializer.INSTANCE, beneficiaryFlowAgreementViewModelDto);
            }
            BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto = self.account_view_model;
            if (beneficiaryFlowAccountViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BeneficiaryFlowAccountViewModelDto.Serializer.INSTANCE, beneficiaryFlowAccountViewModelDto);
            }
        }

        public Surrogate(String beneficiary_account_number, BeneficiaryInfoDto beneficiaryInfoDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto) {
            Intrinsics.checkNotNullParameter(beneficiary_account_number, "beneficiary_account_number");
            this.beneficiary_account_number = beneficiary_account_number;
            this.beneficiary_info = beneficiaryInfoDto;
            this.spousal_consent_agreement = beneficiaryFlowAgreementViewModelDto;
            this.account_view_model = beneficiaryFlowAccountViewModelDto;
        }

        public final String getBeneficiary_account_number() {
            return this.beneficiary_account_number;
        }

        public /* synthetic */ Surrogate(String str, BeneficiaryInfoDto beneficiaryInfoDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : beneficiaryInfoDto, (i & 4) != 0 ? null : beneficiaryFlowAgreementViewModelDto, (i & 8) != 0 ? null : beneficiaryFlowAccountViewModelDto);
        }

        public final BeneficiaryInfoDto getBeneficiary_info() {
            return this.beneficiary_info;
        }

        public final BeneficiaryFlowAgreementViewModelDto getSpousal_consent_agreement() {
            return this.spousal_consent_agreement;
        }

        public final BeneficiaryFlowAccountViewModelDto getAccount_view_model() {
            return this.account_view_model;
        }
    }

    /* compiled from: ReuseBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ReuseBeneficiaryFlowDto, ReuseBeneficiaryFlow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReuseBeneficiaryFlowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReuseBeneficiaryFlowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReuseBeneficiaryFlowDto> getBinaryBase64Serializer() {
            return (KSerializer) ReuseBeneficiaryFlowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ReuseBeneficiaryFlow> getProtoAdapter() {
            return ReuseBeneficiaryFlow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReuseBeneficiaryFlowDto getZeroValue() {
            return ReuseBeneficiaryFlowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReuseBeneficiaryFlowDto fromProto(ReuseBeneficiaryFlow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String beneficiary_account_number = proto.getBeneficiary_account_number();
            BeneficiaryInfo beneficiary_info = proto.getBeneficiary_info();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BeneficiaryInfoDto beneficiaryInfoDtoFromProto = beneficiary_info != null ? BeneficiaryInfoDto.INSTANCE.fromProto(beneficiary_info) : null;
            BeneficiaryFlowAgreementViewModel spousal_consent_agreement = proto.getSpousal_consent_agreement();
            BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDtoFromProto = spousal_consent_agreement != null ? BeneficiaryFlowAgreementViewModelDto.INSTANCE.fromProto(spousal_consent_agreement) : null;
            BeneficiaryFlowAccountViewModel account_view_model = proto.getAccount_view_model();
            return new ReuseBeneficiaryFlowDto(new Surrogate(beneficiary_account_number, beneficiaryInfoDtoFromProto, beneficiaryFlowAgreementViewModelDtoFromProto, account_view_model != null ? BeneficiaryFlowAccountViewModelDto.INSTANCE.fromProto(account_view_model) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.ReuseBeneficiaryFlowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReuseBeneficiaryFlowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ReuseBeneficiaryFlowDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ReuseBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ReuseBeneficiaryFlowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.ReuseBeneficiaryFlow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ReuseBeneficiaryFlowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ReuseBeneficiaryFlowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ReuseBeneficiaryFlowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ReuseBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.ReuseBeneficiaryFlowDto";
        }
    }
}
