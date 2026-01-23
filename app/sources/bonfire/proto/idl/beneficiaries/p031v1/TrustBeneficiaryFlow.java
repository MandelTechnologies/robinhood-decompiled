package bonfire.proto.idl.beneficiaries.p031v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: TrustBeneficiaryFlow.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016JX\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;", "Lcom/squareup/wire/Message;", "", "name_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "date_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "tax_identifier_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "trustee_email_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "account_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "spousal_consent_agreement", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;Lokio/ByteString;)V", "getName_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "getDate_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "getTax_identifier_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "getTrustee_email_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "getAccount_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "getSpousal_consent_agreement", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TrustBeneficiaryFlow extends Message {

    @JvmField
    public static final ProtoAdapter<TrustBeneficiaryFlow> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAccountViewModel#ADAPTER", jsonName = "accountViewModel", schemaIndex = 4, tag = 5)
    private final BeneficiaryFlowAccountViewModel account_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTrustDateViewModel#ADAPTER", jsonName = "dateViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BeneficiaryFlowTrustDateViewModel date_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTrustNameViewModel#ADAPTER", jsonName = "nameViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BeneficiaryFlowTrustNameViewModel name_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAgreementViewModel#ADAPTER", jsonName = "spousalConsentAgreement", schemaIndex = 5, tag = 6)
    private final BeneficiaryFlowAgreementViewModel spousal_consent_agreement;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTrustTaxIdentifierViewModel#ADAPTER", jsonName = "taxIdentifierViewModel", schemaIndex = 2, tag = 3)
    private final BeneficiaryFlowTrustTaxIdentifierViewModel tax_identifier_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowEmailViewModel#ADAPTER", jsonName = "trusteeEmailViewModel", schemaIndex = 3, tag = 4)
    private final BeneficiaryFlowEmailViewModel trustee_email_view_model;

    public TrustBeneficiaryFlow() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8839newBuilder();
    }

    public final BeneficiaryFlowTrustNameViewModel getName_view_model() {
        return this.name_view_model;
    }

    public final BeneficiaryFlowTrustDateViewModel getDate_view_model() {
        return this.date_view_model;
    }

    public final BeneficiaryFlowTrustTaxIdentifierViewModel getTax_identifier_view_model() {
        return this.tax_identifier_view_model;
    }

    public final BeneficiaryFlowEmailViewModel getTrustee_email_view_model() {
        return this.trustee_email_view_model;
    }

    public final BeneficiaryFlowAccountViewModel getAccount_view_model() {
        return this.account_view_model;
    }

    public final BeneficiaryFlowAgreementViewModel getSpousal_consent_agreement() {
        return this.spousal_consent_agreement;
    }

    public /* synthetic */ TrustBeneficiaryFlow(BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel, BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel, BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : beneficiaryFlowTrustNameViewModel, (i & 2) != 0 ? null : beneficiaryFlowTrustDateViewModel, (i & 4) != 0 ? null : beneficiaryFlowTrustTaxIdentifierViewModel, (i & 8) != 0 ? null : beneficiaryFlowEmailViewModel, (i & 16) != 0 ? null : beneficiaryFlowAccountViewModel, (i & 32) != 0 ? null : beneficiaryFlowAgreementViewModel, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustBeneficiaryFlow(BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel, BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel, BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name_view_model = beneficiaryFlowTrustNameViewModel;
        this.date_view_model = beneficiaryFlowTrustDateViewModel;
        this.tax_identifier_view_model = beneficiaryFlowTrustTaxIdentifierViewModel;
        this.trustee_email_view_model = beneficiaryFlowEmailViewModel;
        this.account_view_model = beneficiaryFlowAccountViewModel;
        this.spousal_consent_agreement = beneficiaryFlowAgreementViewModel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8839newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TrustBeneficiaryFlow)) {
            return false;
        }
        TrustBeneficiaryFlow trustBeneficiaryFlow = (TrustBeneficiaryFlow) other;
        return Intrinsics.areEqual(unknownFields(), trustBeneficiaryFlow.unknownFields()) && Intrinsics.areEqual(this.name_view_model, trustBeneficiaryFlow.name_view_model) && Intrinsics.areEqual(this.date_view_model, trustBeneficiaryFlow.date_view_model) && Intrinsics.areEqual(this.tax_identifier_view_model, trustBeneficiaryFlow.tax_identifier_view_model) && Intrinsics.areEqual(this.trustee_email_view_model, trustBeneficiaryFlow.trustee_email_view_model) && Intrinsics.areEqual(this.account_view_model, trustBeneficiaryFlow.account_view_model) && Intrinsics.areEqual(this.spousal_consent_agreement, trustBeneficiaryFlow.spousal_consent_agreement);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel = this.name_view_model;
        int iHashCode2 = (iHashCode + (beneficiaryFlowTrustNameViewModel != null ? beneficiaryFlowTrustNameViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel = this.date_view_model;
        int iHashCode3 = (iHashCode2 + (beneficiaryFlowTrustDateViewModel != null ? beneficiaryFlowTrustDateViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel = this.tax_identifier_view_model;
        int iHashCode4 = (iHashCode3 + (beneficiaryFlowTrustTaxIdentifierViewModel != null ? beneficiaryFlowTrustTaxIdentifierViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel = this.trustee_email_view_model;
        int iHashCode5 = (iHashCode4 + (beneficiaryFlowEmailViewModel != null ? beneficiaryFlowEmailViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel = this.account_view_model;
        int iHashCode6 = (iHashCode5 + (beneficiaryFlowAccountViewModel != null ? beneficiaryFlowAccountViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.spousal_consent_agreement;
        int iHashCode7 = iHashCode6 + (beneficiaryFlowAgreementViewModel != null ? beneficiaryFlowAgreementViewModel.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel = this.name_view_model;
        if (beneficiaryFlowTrustNameViewModel != null) {
            arrayList.add("name_view_model=" + beneficiaryFlowTrustNameViewModel);
        }
        BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel = this.date_view_model;
        if (beneficiaryFlowTrustDateViewModel != null) {
            arrayList.add("date_view_model=" + beneficiaryFlowTrustDateViewModel);
        }
        BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel = this.tax_identifier_view_model;
        if (beneficiaryFlowTrustTaxIdentifierViewModel != null) {
            arrayList.add("tax_identifier_view_model=" + beneficiaryFlowTrustTaxIdentifierViewModel);
        }
        BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel = this.trustee_email_view_model;
        if (beneficiaryFlowEmailViewModel != null) {
            arrayList.add("trustee_email_view_model=" + beneficiaryFlowEmailViewModel);
        }
        BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel = this.account_view_model;
        if (beneficiaryFlowAccountViewModel != null) {
            arrayList.add("account_view_model=" + beneficiaryFlowAccountViewModel);
        }
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.spousal_consent_agreement;
        if (beneficiaryFlowAgreementViewModel != null) {
            arrayList.add("spousal_consent_agreement=" + beneficiaryFlowAgreementViewModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TrustBeneficiaryFlow{", "}", 0, null, null, 56, null);
    }

    public final TrustBeneficiaryFlow copy(BeneficiaryFlowTrustNameViewModel name_view_model, BeneficiaryFlowTrustDateViewModel date_view_model, BeneficiaryFlowTrustTaxIdentifierViewModel tax_identifier_view_model, BeneficiaryFlowEmailViewModel trustee_email_view_model, BeneficiaryFlowAccountViewModel account_view_model, BeneficiaryFlowAgreementViewModel spousal_consent_agreement, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TrustBeneficiaryFlow(name_view_model, date_view_model, tax_identifier_view_model, trustee_email_view_model, account_view_model, spousal_consent_agreement, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TrustBeneficiaryFlow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TrustBeneficiaryFlow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.TrustBeneficiaryFlow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TrustBeneficiaryFlow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getName_view_model() != null) {
                    size += BeneficiaryFlowTrustNameViewModel.ADAPTER.encodedSizeWithTag(1, value.getName_view_model());
                }
                if (value.getDate_view_model() != null) {
                    size += BeneficiaryFlowTrustDateViewModel.ADAPTER.encodedSizeWithTag(2, value.getDate_view_model());
                }
                return size + BeneficiaryFlowTrustTaxIdentifierViewModel.ADAPTER.encodedSizeWithTag(3, value.getTax_identifier_view_model()) + BeneficiaryFlowEmailViewModel.ADAPTER.encodedSizeWithTag(4, value.getTrustee_email_view_model()) + BeneficiaryFlowAccountViewModel.ADAPTER.encodedSizeWithTag(5, value.getAccount_view_model()) + BeneficiaryFlowAgreementViewModel.ADAPTER.encodedSizeWithTag(6, value.getSpousal_consent_agreement());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TrustBeneficiaryFlow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getName_view_model() != null) {
                    BeneficiaryFlowTrustNameViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getName_view_model());
                }
                if (value.getDate_view_model() != null) {
                    BeneficiaryFlowTrustDateViewModel.ADAPTER.encodeWithTag(writer, 2, (int) value.getDate_view_model());
                }
                BeneficiaryFlowTrustTaxIdentifierViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getTax_identifier_view_model());
                BeneficiaryFlowEmailViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrustee_email_view_model());
                BeneficiaryFlowAccountViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getAccount_view_model());
                BeneficiaryFlowAgreementViewModel.ADAPTER.encodeWithTag(writer, 6, (int) value.getSpousal_consent_agreement());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TrustBeneficiaryFlow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BeneficiaryFlowAgreementViewModel.ADAPTER.encodeWithTag(writer, 6, (int) value.getSpousal_consent_agreement());
                BeneficiaryFlowAccountViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getAccount_view_model());
                BeneficiaryFlowEmailViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrustee_email_view_model());
                BeneficiaryFlowTrustTaxIdentifierViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getTax_identifier_view_model());
                if (value.getDate_view_model() != null) {
                    BeneficiaryFlowTrustDateViewModel.ADAPTER.encodeWithTag(writer, 2, (int) value.getDate_view_model());
                }
                if (value.getName_view_model() != null) {
                    BeneficiaryFlowTrustNameViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getName_view_model());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrustBeneficiaryFlow redact(TrustBeneficiaryFlow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BeneficiaryFlowTrustNameViewModel name_view_model = value.getName_view_model();
                BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModelRedact = name_view_model != null ? BeneficiaryFlowTrustNameViewModel.ADAPTER.redact(name_view_model) : null;
                BeneficiaryFlowTrustDateViewModel date_view_model = value.getDate_view_model();
                BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModelRedact = date_view_model != null ? BeneficiaryFlowTrustDateViewModel.ADAPTER.redact(date_view_model) : null;
                BeneficiaryFlowTrustTaxIdentifierViewModel tax_identifier_view_model = value.getTax_identifier_view_model();
                BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModelRedact = tax_identifier_view_model != null ? BeneficiaryFlowTrustTaxIdentifierViewModel.ADAPTER.redact(tax_identifier_view_model) : null;
                BeneficiaryFlowEmailViewModel trustee_email_view_model = value.getTrustee_email_view_model();
                BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModelRedact = trustee_email_view_model != null ? BeneficiaryFlowEmailViewModel.ADAPTER.redact(trustee_email_view_model) : null;
                BeneficiaryFlowAccountViewModel account_view_model = value.getAccount_view_model();
                BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModelRedact = account_view_model != null ? BeneficiaryFlowAccountViewModel.ADAPTER.redact(account_view_model) : null;
                BeneficiaryFlowAgreementViewModel spousal_consent_agreement = value.getSpousal_consent_agreement();
                return value.copy(beneficiaryFlowTrustNameViewModelRedact, beneficiaryFlowTrustDateViewModelRedact, beneficiaryFlowTrustTaxIdentifierViewModelRedact, beneficiaryFlowEmailViewModelRedact, beneficiaryFlowAccountViewModelRedact, spousal_consent_agreement != null ? BeneficiaryFlowAgreementViewModel.ADAPTER.redact(spousal_consent_agreement) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TrustBeneficiaryFlow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModelDecode = null;
                BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModelDecode = null;
                BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModelDecode = null;
                BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModelDecode = null;
                BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModelDecode = null;
                BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModelDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                beneficiaryFlowTrustNameViewModelDecode = BeneficiaryFlowTrustNameViewModel.ADAPTER.decode(reader);
                                break;
                            case 2:
                                beneficiaryFlowTrustDateViewModelDecode = BeneficiaryFlowTrustDateViewModel.ADAPTER.decode(reader);
                                break;
                            case 3:
                                beneficiaryFlowTrustTaxIdentifierViewModelDecode = BeneficiaryFlowTrustTaxIdentifierViewModel.ADAPTER.decode(reader);
                                break;
                            case 4:
                                beneficiaryFlowEmailViewModelDecode = BeneficiaryFlowEmailViewModel.ADAPTER.decode(reader);
                                break;
                            case 5:
                                beneficiaryFlowAccountViewModelDecode = BeneficiaryFlowAccountViewModel.ADAPTER.decode(reader);
                                break;
                            case 6:
                                beneficiaryFlowAgreementViewModelDecode = BeneficiaryFlowAgreementViewModel.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new TrustBeneficiaryFlow(beneficiaryFlowTrustNameViewModelDecode, beneficiaryFlowTrustDateViewModelDecode, beneficiaryFlowTrustTaxIdentifierViewModelDecode, beneficiaryFlowEmailViewModelDecode, beneficiaryFlowAccountViewModelDecode, beneficiaryFlowAgreementViewModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
