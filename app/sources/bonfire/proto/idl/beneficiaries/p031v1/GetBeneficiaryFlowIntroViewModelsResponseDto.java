package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryRoleViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryTypeViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowReuseExistingViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModelDto;
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

/* compiled from: GetBeneficiaryFlowIntroViewModelsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006-"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Surrogate;)V", "", "account_number", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;", "info_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "agreement_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModelDto;", "beneficiary_type_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModelDto;", "beneficiary_role_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModelDto;", "reuse_existing_view_model", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModelDto;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetBeneficiaryFlowIntroViewModelsResponseDto implements Dto3<GetBeneficiaryFlowIntroViewModelsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetBeneficiaryFlowIntroViewModelsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetBeneficiaryFlowIntroViewModelsResponseDto, GetBeneficiaryFlowIntroViewModelsResponse>> binaryBase64Serializer$delegate;
    private static final GetBeneficiaryFlowIntroViewModelsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetBeneficiaryFlowIntroViewModelsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetBeneficiaryFlowIntroViewModelsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetBeneficiaryFlowIntroViewModelsResponseDto(java.lang.String r2, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModelDto r3, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModelDto r4, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryTypeViewModelDto r5, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryRoleViewModelDto r6, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowReuseExistingViewModelDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsResponseDto.<init>(java.lang.String, bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoViewModelDto, bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAgreementViewModelDto, bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryTypeViewModelDto, bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleViewModelDto, bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowReuseExistingViewModelDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetBeneficiaryFlowIntroViewModelsResponseDto(String account_number, BeneficiaryInfoViewModelDto beneficiaryInfoViewModelDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, BeneficiaryFlowBeneficiaryTypeViewModelDto beneficiaryFlowBeneficiaryTypeViewModelDto, BeneficiaryFlowBeneficiaryRoleViewModelDto beneficiaryFlowBeneficiaryRoleViewModelDto, BeneficiaryFlowReuseExistingViewModelDto beneficiaryFlowReuseExistingViewModelDto) {
        this(new Surrogate(account_number, beneficiaryInfoViewModelDto, beneficiaryFlowAgreementViewModelDto, beneficiaryFlowBeneficiaryTypeViewModelDto, beneficiaryFlowBeneficiaryRoleViewModelDto, beneficiaryFlowReuseExistingViewModelDto));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
    }

    @Override // com.robinhood.idl.Dto
    public GetBeneficiaryFlowIntroViewModelsResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        BeneficiaryInfoViewModelDto info_view_model = this.surrogate.getInfo_view_model();
        BeneficiaryInfoViewModel proto = info_view_model != null ? info_view_model.toProto() : null;
        BeneficiaryFlowAgreementViewModelDto agreement_view_model = this.surrogate.getAgreement_view_model();
        BeneficiaryFlowAgreementViewModel proto2 = agreement_view_model != null ? agreement_view_model.toProto() : null;
        BeneficiaryFlowBeneficiaryTypeViewModelDto beneficiary_type_view_model = this.surrogate.getBeneficiary_type_view_model();
        BeneficiaryFlowBeneficiaryTypeViewModel proto3 = beneficiary_type_view_model != null ? beneficiary_type_view_model.toProto() : null;
        BeneficiaryFlowBeneficiaryRoleViewModelDto beneficiary_role_view_model = this.surrogate.getBeneficiary_role_view_model();
        BeneficiaryFlowBeneficiaryRoleViewModel proto4 = beneficiary_role_view_model != null ? beneficiary_role_view_model.toProto() : null;
        BeneficiaryFlowReuseExistingViewModelDto reuse_existing_view_model = this.surrogate.getReuse_existing_view_model();
        return new GetBeneficiaryFlowIntroViewModelsResponse(account_number, proto, proto2, proto3, proto4, reuse_existing_view_model != null ? reuse_existing_view_model.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[GetBeneficiaryFlowIntroViewModelsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetBeneficiaryFlowIntroViewModelsResponseDto) && Intrinsics.areEqual(((GetBeneficiaryFlowIntroViewModelsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetBeneficiaryFlowIntroViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002?>BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\b=\u0010)\u001a\u0004\b;\u0010<¨\u0006@"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Surrogate;", "", "", "account_number", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;", "info_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "agreement_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModelDto;", "beneficiary_type_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModelDto;", "beneficiary_role_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModelDto;", "reuse_existing_view_model", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModelDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModelDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;", "getInfo_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;", "getInfo_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "getAgreement_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "getAgreement_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModelDto;", "getBeneficiary_type_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModelDto;", "getBeneficiary_type_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModelDto;", "getBeneficiary_role_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModelDto;", "getBeneficiary_role_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModelDto;", "getReuse_existing_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModelDto;", "getReuse_existing_view_model$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final BeneficiaryFlowAgreementViewModelDto agreement_view_model;
        private final BeneficiaryFlowBeneficiaryRoleViewModelDto beneficiary_role_view_model;
        private final BeneficiaryFlowBeneficiaryTypeViewModelDto beneficiary_type_view_model;
        private final BeneficiaryInfoViewModelDto info_view_model;
        private final BeneficiaryFlowReuseExistingViewModelDto reuse_existing_view_model;

        public Surrogate() {
            this((String) null, (BeneficiaryInfoViewModelDto) null, (BeneficiaryFlowAgreementViewModelDto) null, (BeneficiaryFlowBeneficiaryTypeViewModelDto) null, (BeneficiaryFlowBeneficiaryRoleViewModelDto) null, (BeneficiaryFlowReuseExistingViewModelDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.info_view_model, surrogate.info_view_model) && Intrinsics.areEqual(this.agreement_view_model, surrogate.agreement_view_model) && Intrinsics.areEqual(this.beneficiary_type_view_model, surrogate.beneficiary_type_view_model) && Intrinsics.areEqual(this.beneficiary_role_view_model, surrogate.beneficiary_role_view_model) && Intrinsics.areEqual(this.reuse_existing_view_model, surrogate.reuse_existing_view_model);
        }

        public int hashCode() {
            int iHashCode = this.account_number.hashCode() * 31;
            BeneficiaryInfoViewModelDto beneficiaryInfoViewModelDto = this.info_view_model;
            int iHashCode2 = (iHashCode + (beneficiaryInfoViewModelDto == null ? 0 : beneficiaryInfoViewModelDto.hashCode())) * 31;
            BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto = this.agreement_view_model;
            int iHashCode3 = (iHashCode2 + (beneficiaryFlowAgreementViewModelDto == null ? 0 : beneficiaryFlowAgreementViewModelDto.hashCode())) * 31;
            BeneficiaryFlowBeneficiaryTypeViewModelDto beneficiaryFlowBeneficiaryTypeViewModelDto = this.beneficiary_type_view_model;
            int iHashCode4 = (iHashCode3 + (beneficiaryFlowBeneficiaryTypeViewModelDto == null ? 0 : beneficiaryFlowBeneficiaryTypeViewModelDto.hashCode())) * 31;
            BeneficiaryFlowBeneficiaryRoleViewModelDto beneficiaryFlowBeneficiaryRoleViewModelDto = this.beneficiary_role_view_model;
            int iHashCode5 = (iHashCode4 + (beneficiaryFlowBeneficiaryRoleViewModelDto == null ? 0 : beneficiaryFlowBeneficiaryRoleViewModelDto.hashCode())) * 31;
            BeneficiaryFlowReuseExistingViewModelDto beneficiaryFlowReuseExistingViewModelDto = this.reuse_existing_view_model;
            return iHashCode5 + (beneficiaryFlowReuseExistingViewModelDto != null ? beneficiaryFlowReuseExistingViewModelDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", info_view_model=" + this.info_view_model + ", agreement_view_model=" + this.agreement_view_model + ", beneficiary_type_view_model=" + this.beneficiary_type_view_model + ", beneficiary_role_view_model=" + this.beneficiary_role_view_model + ", reuse_existing_view_model=" + this.reuse_existing_view_model + ")";
        }

        /* compiled from: GetBeneficiaryFlowIntroViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetBeneficiaryFlowIntroViewModelsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BeneficiaryInfoViewModelDto beneficiaryInfoViewModelDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, BeneficiaryFlowBeneficiaryTypeViewModelDto beneficiaryFlowBeneficiaryTypeViewModelDto, BeneficiaryFlowBeneficiaryRoleViewModelDto beneficiaryFlowBeneficiaryRoleViewModelDto, BeneficiaryFlowReuseExistingViewModelDto beneficiaryFlowReuseExistingViewModelDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.info_view_model = null;
            } else {
                this.info_view_model = beneficiaryInfoViewModelDto;
            }
            if ((i & 4) == 0) {
                this.agreement_view_model = null;
            } else {
                this.agreement_view_model = beneficiaryFlowAgreementViewModelDto;
            }
            if ((i & 8) == 0) {
                this.beneficiary_type_view_model = null;
            } else {
                this.beneficiary_type_view_model = beneficiaryFlowBeneficiaryTypeViewModelDto;
            }
            if ((i & 16) == 0) {
                this.beneficiary_role_view_model = null;
            } else {
                this.beneficiary_role_view_model = beneficiaryFlowBeneficiaryRoleViewModelDto;
            }
            if ((i & 32) == 0) {
                this.reuse_existing_view_model = null;
            } else {
                this.reuse_existing_view_model = beneficiaryFlowReuseExistingViewModelDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            BeneficiaryInfoViewModelDto beneficiaryInfoViewModelDto = self.info_view_model;
            if (beneficiaryInfoViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BeneficiaryInfoViewModelDto.Serializer.INSTANCE, beneficiaryInfoViewModelDto);
            }
            BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto = self.agreement_view_model;
            if (beneficiaryFlowAgreementViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BeneficiaryFlowAgreementViewModelDto.Serializer.INSTANCE, beneficiaryFlowAgreementViewModelDto);
            }
            BeneficiaryFlowBeneficiaryTypeViewModelDto beneficiaryFlowBeneficiaryTypeViewModelDto = self.beneficiary_type_view_model;
            if (beneficiaryFlowBeneficiaryTypeViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BeneficiaryFlowBeneficiaryTypeViewModelDto.Serializer.INSTANCE, beneficiaryFlowBeneficiaryTypeViewModelDto);
            }
            BeneficiaryFlowBeneficiaryRoleViewModelDto beneficiaryFlowBeneficiaryRoleViewModelDto = self.beneficiary_role_view_model;
            if (beneficiaryFlowBeneficiaryRoleViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BeneficiaryFlowBeneficiaryRoleViewModelDto.Serializer.INSTANCE, beneficiaryFlowBeneficiaryRoleViewModelDto);
            }
            BeneficiaryFlowReuseExistingViewModelDto beneficiaryFlowReuseExistingViewModelDto = self.reuse_existing_view_model;
            if (beneficiaryFlowReuseExistingViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BeneficiaryFlowReuseExistingViewModelDto.Serializer.INSTANCE, beneficiaryFlowReuseExistingViewModelDto);
            }
        }

        public Surrogate(String account_number, BeneficiaryInfoViewModelDto beneficiaryInfoViewModelDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, BeneficiaryFlowBeneficiaryTypeViewModelDto beneficiaryFlowBeneficiaryTypeViewModelDto, BeneficiaryFlowBeneficiaryRoleViewModelDto beneficiaryFlowBeneficiaryRoleViewModelDto, BeneficiaryFlowReuseExistingViewModelDto beneficiaryFlowReuseExistingViewModelDto) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            this.account_number = account_number;
            this.info_view_model = beneficiaryInfoViewModelDto;
            this.agreement_view_model = beneficiaryFlowAgreementViewModelDto;
            this.beneficiary_type_view_model = beneficiaryFlowBeneficiaryTypeViewModelDto;
            this.beneficiary_role_view_model = beneficiaryFlowBeneficiaryRoleViewModelDto;
            this.reuse_existing_view_model = beneficiaryFlowReuseExistingViewModelDto;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModelDto r3, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModelDto r4, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryTypeViewModelDto r5, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryRoleViewModelDto r6, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowReuseExistingViewModelDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto Lc
                r3 = r0
            Lc:
                r9 = r8 & 4
                if (r9 == 0) goto L11
                r4 = r0
            L11:
                r9 = r8 & 8
                if (r9 == 0) goto L16
                r5 = r0
            L16:
                r9 = r8 & 16
                if (r9 == 0) goto L1b
                r6 = r0
            L1b:
                r8 = r8 & 32
                if (r8 == 0) goto L27
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2e
            L27:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2e:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsResponseDto.Surrogate.<init>(java.lang.String, bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoViewModelDto, bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAgreementViewModelDto, bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryTypeViewModelDto, bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleViewModelDto, bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowReuseExistingViewModelDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final BeneficiaryInfoViewModelDto getInfo_view_model() {
            return this.info_view_model;
        }

        public final BeneficiaryFlowAgreementViewModelDto getAgreement_view_model() {
            return this.agreement_view_model;
        }

        public final BeneficiaryFlowBeneficiaryTypeViewModelDto getBeneficiary_type_view_model() {
            return this.beneficiary_type_view_model;
        }

        public final BeneficiaryFlowBeneficiaryRoleViewModelDto getBeneficiary_role_view_model() {
            return this.beneficiary_role_view_model;
        }

        public final BeneficiaryFlowReuseExistingViewModelDto getReuse_existing_view_model() {
            return this.reuse_existing_view_model;
        }
    }

    /* compiled from: GetBeneficiaryFlowIntroViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetBeneficiaryFlowIntroViewModelsResponseDto, GetBeneficiaryFlowIntroViewModelsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetBeneficiaryFlowIntroViewModelsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetBeneficiaryFlowIntroViewModelsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetBeneficiaryFlowIntroViewModelsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetBeneficiaryFlowIntroViewModelsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetBeneficiaryFlowIntroViewModelsResponse> getProtoAdapter() {
            return GetBeneficiaryFlowIntroViewModelsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetBeneficiaryFlowIntroViewModelsResponseDto getZeroValue() {
            return GetBeneficiaryFlowIntroViewModelsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetBeneficiaryFlowIntroViewModelsResponseDto fromProto(GetBeneficiaryFlowIntroViewModelsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            BeneficiaryInfoViewModel info_view_model = proto.getInfo_view_model();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BeneficiaryInfoViewModelDto beneficiaryInfoViewModelDtoFromProto = info_view_model != null ? BeneficiaryInfoViewModelDto.INSTANCE.fromProto(info_view_model) : null;
            BeneficiaryFlowAgreementViewModel agreement_view_model = proto.getAgreement_view_model();
            BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDtoFromProto = agreement_view_model != null ? BeneficiaryFlowAgreementViewModelDto.INSTANCE.fromProto(agreement_view_model) : null;
            BeneficiaryFlowBeneficiaryTypeViewModel beneficiary_type_view_model = proto.getBeneficiary_type_view_model();
            BeneficiaryFlowBeneficiaryTypeViewModelDto beneficiaryFlowBeneficiaryTypeViewModelDtoFromProto = beneficiary_type_view_model != null ? BeneficiaryFlowBeneficiaryTypeViewModelDto.INSTANCE.fromProto(beneficiary_type_view_model) : null;
            BeneficiaryFlowBeneficiaryRoleViewModel beneficiary_role_view_model = proto.getBeneficiary_role_view_model();
            BeneficiaryFlowBeneficiaryRoleViewModelDto beneficiaryFlowBeneficiaryRoleViewModelDtoFromProto = beneficiary_role_view_model != null ? BeneficiaryFlowBeneficiaryRoleViewModelDto.INSTANCE.fromProto(beneficiary_role_view_model) : null;
            BeneficiaryFlowReuseExistingViewModel reuse_existing_view_model = proto.getReuse_existing_view_model();
            return new GetBeneficiaryFlowIntroViewModelsResponseDto(new Surrogate(account_number, beneficiaryInfoViewModelDtoFromProto, beneficiaryFlowAgreementViewModelDtoFromProto, beneficiaryFlowBeneficiaryTypeViewModelDtoFromProto, beneficiaryFlowBeneficiaryRoleViewModelDtoFromProto, reuse_existing_view_model != null ? BeneficiaryFlowReuseExistingViewModelDto.INSTANCE.fromProto(reuse_existing_view_model) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.GetBeneficiaryFlowIntroViewModelsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetBeneficiaryFlowIntroViewModelsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetBeneficiaryFlowIntroViewModelsResponseDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetBeneficiaryFlowIntroViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetBeneficiaryFlowIntroViewModelsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.GetBeneficiaryFlowIntroViewModelsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetBeneficiaryFlowIntroViewModelsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetBeneficiaryFlowIntroViewModelsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetBeneficiaryFlowIntroViewModelsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetBeneficiaryFlowIntroViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.GetBeneficiaryFlowIntroViewModelsResponseDto";
        }
    }
}
