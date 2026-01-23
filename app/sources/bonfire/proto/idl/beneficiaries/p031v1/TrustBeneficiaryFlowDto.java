package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAccountViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowEmailViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustDateViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustNameViewModelDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustTaxIdentifierViewModelDto;
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

/* compiled from: TrustBeneficiaryFlowDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Surrogate;)V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModelDto;", "name_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;", "date_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModelDto;", "tax_identifier_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;", "trustee_email_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "account_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "spousal_consent_agreement", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class TrustBeneficiaryFlowDto implements Dto3<TrustBeneficiaryFlow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TrustBeneficiaryFlowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TrustBeneficiaryFlowDto, TrustBeneficiaryFlow>> binaryBase64Serializer$delegate;
    private static final TrustBeneficiaryFlowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TrustBeneficiaryFlowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TrustBeneficiaryFlowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ TrustBeneficiaryFlowDto(BeneficiaryFlowTrustNameViewModelDto beneficiaryFlowTrustNameViewModelDto, BeneficiaryFlowTrustDateViewModelDto beneficiaryFlowTrustDateViewModelDto, BeneficiaryFlowTrustTaxIdentifierViewModelDto beneficiaryFlowTrustTaxIdentifierViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : beneficiaryFlowTrustNameViewModelDto, (i & 2) != 0 ? null : beneficiaryFlowTrustDateViewModelDto, (i & 4) != 0 ? null : beneficiaryFlowTrustTaxIdentifierViewModelDto, (i & 8) != 0 ? null : beneficiaryFlowEmailViewModelDto, (i & 16) != 0 ? null : beneficiaryFlowAccountViewModelDto, (i & 32) != 0 ? null : beneficiaryFlowAgreementViewModelDto);
    }

    public TrustBeneficiaryFlowDto(BeneficiaryFlowTrustNameViewModelDto beneficiaryFlowTrustNameViewModelDto, BeneficiaryFlowTrustDateViewModelDto beneficiaryFlowTrustDateViewModelDto, BeneficiaryFlowTrustTaxIdentifierViewModelDto beneficiaryFlowTrustTaxIdentifierViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto) {
        this(new Surrogate(beneficiaryFlowTrustNameViewModelDto, beneficiaryFlowTrustDateViewModelDto, beneficiaryFlowTrustTaxIdentifierViewModelDto, beneficiaryFlowEmailViewModelDto, beneficiaryFlowAccountViewModelDto, beneficiaryFlowAgreementViewModelDto));
    }

    @Override // com.robinhood.idl.Dto
    public TrustBeneficiaryFlow toProto() {
        BeneficiaryFlowTrustNameViewModelDto name_view_model = this.surrogate.getName_view_model();
        BeneficiaryFlowTrustNameViewModel proto = name_view_model != null ? name_view_model.toProto() : null;
        BeneficiaryFlowTrustDateViewModelDto date_view_model = this.surrogate.getDate_view_model();
        BeneficiaryFlowTrustDateViewModel proto2 = date_view_model != null ? date_view_model.toProto() : null;
        BeneficiaryFlowTrustTaxIdentifierViewModelDto tax_identifier_view_model = this.surrogate.getTax_identifier_view_model();
        BeneficiaryFlowTrustTaxIdentifierViewModel proto3 = tax_identifier_view_model != null ? tax_identifier_view_model.toProto() : null;
        BeneficiaryFlowEmailViewModelDto trustee_email_view_model = this.surrogate.getTrustee_email_view_model();
        BeneficiaryFlowEmailViewModel proto4 = trustee_email_view_model != null ? trustee_email_view_model.toProto() : null;
        BeneficiaryFlowAccountViewModelDto account_view_model = this.surrogate.getAccount_view_model();
        BeneficiaryFlowAccountViewModel proto5 = account_view_model != null ? account_view_model.toProto() : null;
        BeneficiaryFlowAgreementViewModelDto spousal_consent_agreement = this.surrogate.getSpousal_consent_agreement();
        return new TrustBeneficiaryFlow(proto, proto2, proto3, proto4, proto5, spousal_consent_agreement != null ? spousal_consent_agreement.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[TrustBeneficiaryFlowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TrustBeneficiaryFlowDto) && Intrinsics.areEqual(((TrustBeneficiaryFlowDto) other).surrogate, this.surrogate);
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
    /* compiled from: TrustBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b;\u0010+\u001a\u0004\b9\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b?\u0010+\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Surrogate;", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModelDto;", "name_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;", "date_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModelDto;", "tax_identifier_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;", "trustee_email_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "account_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "spousal_consent_agreement", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModelDto;", "getName_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModelDto;", "getName_view_model$annotations", "()V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;", "getDate_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;", "getDate_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModelDto;", "getTax_identifier_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModelDto;", "getTax_identifier_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;", "getTrustee_email_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModelDto;", "getTrustee_email_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "getAccount_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModelDto;", "getAccount_view_model$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "getSpousal_consent_agreement", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModelDto;", "getSpousal_consent_agreement$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BeneficiaryFlowAccountViewModelDto account_view_model;
        private final BeneficiaryFlowTrustDateViewModelDto date_view_model;
        private final BeneficiaryFlowTrustNameViewModelDto name_view_model;
        private final BeneficiaryFlowAgreementViewModelDto spousal_consent_agreement;
        private final BeneficiaryFlowTrustTaxIdentifierViewModelDto tax_identifier_view_model;
        private final BeneficiaryFlowEmailViewModelDto trustee_email_view_model;

        public Surrogate() {
            this((BeneficiaryFlowTrustNameViewModelDto) null, (BeneficiaryFlowTrustDateViewModelDto) null, (BeneficiaryFlowTrustTaxIdentifierViewModelDto) null, (BeneficiaryFlowEmailViewModelDto) null, (BeneficiaryFlowAccountViewModelDto) null, (BeneficiaryFlowAgreementViewModelDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.name_view_model, surrogate.name_view_model) && Intrinsics.areEqual(this.date_view_model, surrogate.date_view_model) && Intrinsics.areEqual(this.tax_identifier_view_model, surrogate.tax_identifier_view_model) && Intrinsics.areEqual(this.trustee_email_view_model, surrogate.trustee_email_view_model) && Intrinsics.areEqual(this.account_view_model, surrogate.account_view_model) && Intrinsics.areEqual(this.spousal_consent_agreement, surrogate.spousal_consent_agreement);
        }

        public int hashCode() {
            BeneficiaryFlowTrustNameViewModelDto beneficiaryFlowTrustNameViewModelDto = this.name_view_model;
            int iHashCode = (beneficiaryFlowTrustNameViewModelDto == null ? 0 : beneficiaryFlowTrustNameViewModelDto.hashCode()) * 31;
            BeneficiaryFlowTrustDateViewModelDto beneficiaryFlowTrustDateViewModelDto = this.date_view_model;
            int iHashCode2 = (iHashCode + (beneficiaryFlowTrustDateViewModelDto == null ? 0 : beneficiaryFlowTrustDateViewModelDto.hashCode())) * 31;
            BeneficiaryFlowTrustTaxIdentifierViewModelDto beneficiaryFlowTrustTaxIdentifierViewModelDto = this.tax_identifier_view_model;
            int iHashCode3 = (iHashCode2 + (beneficiaryFlowTrustTaxIdentifierViewModelDto == null ? 0 : beneficiaryFlowTrustTaxIdentifierViewModelDto.hashCode())) * 31;
            BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto = this.trustee_email_view_model;
            int iHashCode4 = (iHashCode3 + (beneficiaryFlowEmailViewModelDto == null ? 0 : beneficiaryFlowEmailViewModelDto.hashCode())) * 31;
            BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto = this.account_view_model;
            int iHashCode5 = (iHashCode4 + (beneficiaryFlowAccountViewModelDto == null ? 0 : beneficiaryFlowAccountViewModelDto.hashCode())) * 31;
            BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto = this.spousal_consent_agreement;
            return iHashCode5 + (beneficiaryFlowAgreementViewModelDto != null ? beneficiaryFlowAgreementViewModelDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(name_view_model=" + this.name_view_model + ", date_view_model=" + this.date_view_model + ", tax_identifier_view_model=" + this.tax_identifier_view_model + ", trustee_email_view_model=" + this.trustee_email_view_model + ", account_view_model=" + this.account_view_model + ", spousal_consent_agreement=" + this.spousal_consent_agreement + ")";
        }

        /* compiled from: TrustBeneficiaryFlowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TrustBeneficiaryFlowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BeneficiaryFlowTrustNameViewModelDto beneficiaryFlowTrustNameViewModelDto, BeneficiaryFlowTrustDateViewModelDto beneficiaryFlowTrustDateViewModelDto, BeneficiaryFlowTrustTaxIdentifierViewModelDto beneficiaryFlowTrustTaxIdentifierViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.name_view_model = null;
            } else {
                this.name_view_model = beneficiaryFlowTrustNameViewModelDto;
            }
            if ((i & 2) == 0) {
                this.date_view_model = null;
            } else {
                this.date_view_model = beneficiaryFlowTrustDateViewModelDto;
            }
            if ((i & 4) == 0) {
                this.tax_identifier_view_model = null;
            } else {
                this.tax_identifier_view_model = beneficiaryFlowTrustTaxIdentifierViewModelDto;
            }
            if ((i & 8) == 0) {
                this.trustee_email_view_model = null;
            } else {
                this.trustee_email_view_model = beneficiaryFlowEmailViewModelDto;
            }
            if ((i & 16) == 0) {
                this.account_view_model = null;
            } else {
                this.account_view_model = beneficiaryFlowAccountViewModelDto;
            }
            if ((i & 32) == 0) {
                this.spousal_consent_agreement = null;
            } else {
                this.spousal_consent_agreement = beneficiaryFlowAgreementViewModelDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            BeneficiaryFlowTrustNameViewModelDto beneficiaryFlowTrustNameViewModelDto = self.name_view_model;
            if (beneficiaryFlowTrustNameViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BeneficiaryFlowTrustNameViewModelDto.Serializer.INSTANCE, beneficiaryFlowTrustNameViewModelDto);
            }
            BeneficiaryFlowTrustDateViewModelDto beneficiaryFlowTrustDateViewModelDto = self.date_view_model;
            if (beneficiaryFlowTrustDateViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BeneficiaryFlowTrustDateViewModelDto.Serializer.INSTANCE, beneficiaryFlowTrustDateViewModelDto);
            }
            BeneficiaryFlowTrustTaxIdentifierViewModelDto beneficiaryFlowTrustTaxIdentifierViewModelDto = self.tax_identifier_view_model;
            if (beneficiaryFlowTrustTaxIdentifierViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BeneficiaryFlowTrustTaxIdentifierViewModelDto.Serializer.INSTANCE, beneficiaryFlowTrustTaxIdentifierViewModelDto);
            }
            BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto = self.trustee_email_view_model;
            if (beneficiaryFlowEmailViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BeneficiaryFlowEmailViewModelDto.Serializer.INSTANCE, beneficiaryFlowEmailViewModelDto);
            }
            BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto = self.account_view_model;
            if (beneficiaryFlowAccountViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BeneficiaryFlowAccountViewModelDto.Serializer.INSTANCE, beneficiaryFlowAccountViewModelDto);
            }
            BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto = self.spousal_consent_agreement;
            if (beneficiaryFlowAgreementViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BeneficiaryFlowAgreementViewModelDto.Serializer.INSTANCE, beneficiaryFlowAgreementViewModelDto);
            }
        }

        public Surrogate(BeneficiaryFlowTrustNameViewModelDto beneficiaryFlowTrustNameViewModelDto, BeneficiaryFlowTrustDateViewModelDto beneficiaryFlowTrustDateViewModelDto, BeneficiaryFlowTrustTaxIdentifierViewModelDto beneficiaryFlowTrustTaxIdentifierViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto) {
            this.name_view_model = beneficiaryFlowTrustNameViewModelDto;
            this.date_view_model = beneficiaryFlowTrustDateViewModelDto;
            this.tax_identifier_view_model = beneficiaryFlowTrustTaxIdentifierViewModelDto;
            this.trustee_email_view_model = beneficiaryFlowEmailViewModelDto;
            this.account_view_model = beneficiaryFlowAccountViewModelDto;
            this.spousal_consent_agreement = beneficiaryFlowAgreementViewModelDto;
        }

        public /* synthetic */ Surrogate(BeneficiaryFlowTrustNameViewModelDto beneficiaryFlowTrustNameViewModelDto, BeneficiaryFlowTrustDateViewModelDto beneficiaryFlowTrustDateViewModelDto, BeneficiaryFlowTrustTaxIdentifierViewModelDto beneficiaryFlowTrustTaxIdentifierViewModelDto, BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDto, BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDto, BeneficiaryFlowAgreementViewModelDto beneficiaryFlowAgreementViewModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : beneficiaryFlowTrustNameViewModelDto, (i & 2) != 0 ? null : beneficiaryFlowTrustDateViewModelDto, (i & 4) != 0 ? null : beneficiaryFlowTrustTaxIdentifierViewModelDto, (i & 8) != 0 ? null : beneficiaryFlowEmailViewModelDto, (i & 16) != 0 ? null : beneficiaryFlowAccountViewModelDto, (i & 32) != 0 ? null : beneficiaryFlowAgreementViewModelDto);
        }

        public final BeneficiaryFlowTrustNameViewModelDto getName_view_model() {
            return this.name_view_model;
        }

        public final BeneficiaryFlowTrustDateViewModelDto getDate_view_model() {
            return this.date_view_model;
        }

        public final BeneficiaryFlowTrustTaxIdentifierViewModelDto getTax_identifier_view_model() {
            return this.tax_identifier_view_model;
        }

        public final BeneficiaryFlowEmailViewModelDto getTrustee_email_view_model() {
            return this.trustee_email_view_model;
        }

        public final BeneficiaryFlowAccountViewModelDto getAccount_view_model() {
            return this.account_view_model;
        }

        public final BeneficiaryFlowAgreementViewModelDto getSpousal_consent_agreement() {
            return this.spousal_consent_agreement;
        }
    }

    /* compiled from: TrustBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TrustBeneficiaryFlowDto, TrustBeneficiaryFlow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrustBeneficiaryFlowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrustBeneficiaryFlowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrustBeneficiaryFlowDto> getBinaryBase64Serializer() {
            return (KSerializer) TrustBeneficiaryFlowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TrustBeneficiaryFlow> getProtoAdapter() {
            return TrustBeneficiaryFlow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrustBeneficiaryFlowDto getZeroValue() {
            return TrustBeneficiaryFlowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrustBeneficiaryFlowDto fromProto(TrustBeneficiaryFlow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BeneficiaryFlowTrustNameViewModel name_view_model = proto.getName_view_model();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BeneficiaryFlowTrustNameViewModelDto beneficiaryFlowTrustNameViewModelDtoFromProto = name_view_model != null ? BeneficiaryFlowTrustNameViewModelDto.INSTANCE.fromProto(name_view_model) : null;
            BeneficiaryFlowTrustDateViewModel date_view_model = proto.getDate_view_model();
            BeneficiaryFlowTrustDateViewModelDto beneficiaryFlowTrustDateViewModelDtoFromProto = date_view_model != null ? BeneficiaryFlowTrustDateViewModelDto.INSTANCE.fromProto(date_view_model) : null;
            BeneficiaryFlowTrustTaxIdentifierViewModel tax_identifier_view_model = proto.getTax_identifier_view_model();
            BeneficiaryFlowTrustTaxIdentifierViewModelDto beneficiaryFlowTrustTaxIdentifierViewModelDtoFromProto = tax_identifier_view_model != null ? BeneficiaryFlowTrustTaxIdentifierViewModelDto.INSTANCE.fromProto(tax_identifier_view_model) : null;
            BeneficiaryFlowEmailViewModel trustee_email_view_model = proto.getTrustee_email_view_model();
            BeneficiaryFlowEmailViewModelDto beneficiaryFlowEmailViewModelDtoFromProto = trustee_email_view_model != null ? BeneficiaryFlowEmailViewModelDto.INSTANCE.fromProto(trustee_email_view_model) : null;
            BeneficiaryFlowAccountViewModel account_view_model = proto.getAccount_view_model();
            BeneficiaryFlowAccountViewModelDto beneficiaryFlowAccountViewModelDtoFromProto = account_view_model != null ? BeneficiaryFlowAccountViewModelDto.INSTANCE.fromProto(account_view_model) : null;
            BeneficiaryFlowAgreementViewModel spousal_consent_agreement = proto.getSpousal_consent_agreement();
            return new TrustBeneficiaryFlowDto(new Surrogate(beneficiaryFlowTrustNameViewModelDtoFromProto, beneficiaryFlowTrustDateViewModelDtoFromProto, beneficiaryFlowTrustTaxIdentifierViewModelDtoFromProto, beneficiaryFlowEmailViewModelDtoFromProto, beneficiaryFlowAccountViewModelDtoFromProto, spousal_consent_agreement != null ? BeneficiaryFlowAgreementViewModelDto.INSTANCE.fromProto(spousal_consent_agreement) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.TrustBeneficiaryFlowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrustBeneficiaryFlowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TrustBeneficiaryFlowDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TrustBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TrustBeneficiaryFlowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.TrustBeneficiaryFlow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TrustBeneficiaryFlowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TrustBeneficiaryFlowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TrustBeneficiaryFlowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TrustBeneficiaryFlowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.TrustBeneficiaryFlowDto";
        }
    }
}
