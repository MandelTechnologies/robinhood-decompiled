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
import com.squareup.wire.internal.Internal;
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

/* compiled from: GetBeneficiaryFlowIntroViewModelsResponse.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016JV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "info_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "agreement_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "beneficiary_type_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;", "beneficiary_role_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "reuse_existing_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModel;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getInfo_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "getAgreement_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "getBeneficiary_type_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;", "getBeneficiary_role_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "getReuse_existing_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetBeneficiaryFlowIntroViewModelsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetBeneficiaryFlowIntroViewModelsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAgreementViewModel#ADAPTER", jsonName = "agreementViewModel", schemaIndex = 2, tag = 3)
    private final BeneficiaryFlowAgreementViewModel agreement_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleViewModel#ADAPTER", jsonName = "beneficiaryRoleViewModel", schemaIndex = 4, tag = 5)
    private final BeneficiaryFlowBeneficiaryRoleViewModel beneficiary_role_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryTypeViewModel#ADAPTER", jsonName = "beneficiaryTypeViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final BeneficiaryFlowBeneficiaryTypeViewModel beneficiary_type_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoViewModel#ADAPTER", jsonName = "infoViewModel", schemaIndex = 1, tag = 2)
    private final BeneficiaryInfoViewModel info_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowReuseExistingViewModel#ADAPTER", jsonName = "reuseExistingViewModel", schemaIndex = 5, tag = 6)
    private final BeneficiaryFlowReuseExistingViewModel reuse_existing_view_model;

    public GetBeneficiaryFlowIntroViewModelsResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8829newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetBeneficiaryFlowIntroViewModelsResponse(String str, BeneficiaryInfoViewModel beneficiaryInfoViewModel, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : beneficiaryInfoViewModel, (i & 4) != 0 ? null : beneficiaryFlowAgreementViewModel, (i & 8) != 0 ? null : beneficiaryFlowBeneficiaryTypeViewModel, (i & 16) != 0 ? null : beneficiaryFlowBeneficiaryRoleViewModel, (i & 32) != 0 ? null : beneficiaryFlowReuseExistingViewModel, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final BeneficiaryInfoViewModel getInfo_view_model() {
        return this.info_view_model;
    }

    public final BeneficiaryFlowAgreementViewModel getAgreement_view_model() {
        return this.agreement_view_model;
    }

    public final BeneficiaryFlowBeneficiaryTypeViewModel getBeneficiary_type_view_model() {
        return this.beneficiary_type_view_model;
    }

    public final BeneficiaryFlowBeneficiaryRoleViewModel getBeneficiary_role_view_model() {
        return this.beneficiary_role_view_model;
    }

    public final BeneficiaryFlowReuseExistingViewModel getReuse_existing_view_model() {
        return this.reuse_existing_view_model;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBeneficiaryFlowIntroViewModelsResponse(String account_number, BeneficiaryInfoViewModel beneficiaryInfoViewModel, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.info_view_model = beneficiaryInfoViewModel;
        this.agreement_view_model = beneficiaryFlowAgreementViewModel;
        this.beneficiary_type_view_model = beneficiaryFlowBeneficiaryTypeViewModel;
        this.beneficiary_role_view_model = beneficiaryFlowBeneficiaryRoleViewModel;
        this.reuse_existing_view_model = beneficiaryFlowReuseExistingViewModel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8829newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetBeneficiaryFlowIntroViewModelsResponse)) {
            return false;
        }
        GetBeneficiaryFlowIntroViewModelsResponse getBeneficiaryFlowIntroViewModelsResponse = (GetBeneficiaryFlowIntroViewModelsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getBeneficiaryFlowIntroViewModelsResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getBeneficiaryFlowIntroViewModelsResponse.account_number) && Intrinsics.areEqual(this.info_view_model, getBeneficiaryFlowIntroViewModelsResponse.info_view_model) && Intrinsics.areEqual(this.agreement_view_model, getBeneficiaryFlowIntroViewModelsResponse.agreement_view_model) && Intrinsics.areEqual(this.beneficiary_type_view_model, getBeneficiaryFlowIntroViewModelsResponse.beneficiary_type_view_model) && Intrinsics.areEqual(this.beneficiary_role_view_model, getBeneficiaryFlowIntroViewModelsResponse.beneficiary_role_view_model) && Intrinsics.areEqual(this.reuse_existing_view_model, getBeneficiaryFlowIntroViewModelsResponse.reuse_existing_view_model);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        BeneficiaryInfoViewModel beneficiaryInfoViewModel = this.info_view_model;
        int iHashCode2 = (iHashCode + (beneficiaryInfoViewModel != null ? beneficiaryInfoViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.agreement_view_model;
        int iHashCode3 = (iHashCode2 + (beneficiaryFlowAgreementViewModel != null ? beneficiaryFlowAgreementViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel = this.beneficiary_type_view_model;
        int iHashCode4 = (iHashCode3 + (beneficiaryFlowBeneficiaryTypeViewModel != null ? beneficiaryFlowBeneficiaryTypeViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel = this.beneficiary_role_view_model;
        int iHashCode5 = (iHashCode4 + (beneficiaryFlowBeneficiaryRoleViewModel != null ? beneficiaryFlowBeneficiaryRoleViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModel = this.reuse_existing_view_model;
        int iHashCode6 = iHashCode5 + (beneficiaryFlowReuseExistingViewModel != null ? beneficiaryFlowReuseExistingViewModel.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        BeneficiaryInfoViewModel beneficiaryInfoViewModel = this.info_view_model;
        if (beneficiaryInfoViewModel != null) {
            arrayList.add("info_view_model=" + beneficiaryInfoViewModel);
        }
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.agreement_view_model;
        if (beneficiaryFlowAgreementViewModel != null) {
            arrayList.add("agreement_view_model=" + beneficiaryFlowAgreementViewModel);
        }
        BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel = this.beneficiary_type_view_model;
        if (beneficiaryFlowBeneficiaryTypeViewModel != null) {
            arrayList.add("beneficiary_type_view_model=" + beneficiaryFlowBeneficiaryTypeViewModel);
        }
        BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel = this.beneficiary_role_view_model;
        if (beneficiaryFlowBeneficiaryRoleViewModel != null) {
            arrayList.add("beneficiary_role_view_model=" + beneficiaryFlowBeneficiaryRoleViewModel);
        }
        BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModel = this.reuse_existing_view_model;
        if (beneficiaryFlowReuseExistingViewModel != null) {
            arrayList.add("reuse_existing_view_model=" + beneficiaryFlowReuseExistingViewModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBeneficiaryFlowIntroViewModelsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetBeneficiaryFlowIntroViewModelsResponse copy$default(GetBeneficiaryFlowIntroViewModelsResponse getBeneficiaryFlowIntroViewModelsResponse, String str, BeneficiaryInfoViewModel beneficiaryInfoViewModel, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModel, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBeneficiaryFlowIntroViewModelsResponse.account_number;
        }
        if ((i & 2) != 0) {
            beneficiaryInfoViewModel = getBeneficiaryFlowIntroViewModelsResponse.info_view_model;
        }
        if ((i & 4) != 0) {
            beneficiaryFlowAgreementViewModel = getBeneficiaryFlowIntroViewModelsResponse.agreement_view_model;
        }
        if ((i & 8) != 0) {
            beneficiaryFlowBeneficiaryTypeViewModel = getBeneficiaryFlowIntroViewModelsResponse.beneficiary_type_view_model;
        }
        if ((i & 16) != 0) {
            beneficiaryFlowBeneficiaryRoleViewModel = getBeneficiaryFlowIntroViewModelsResponse.beneficiary_role_view_model;
        }
        if ((i & 32) != 0) {
            beneficiaryFlowReuseExistingViewModel = getBeneficiaryFlowIntroViewModelsResponse.reuse_existing_view_model;
        }
        if ((i & 64) != 0) {
            byteString = getBeneficiaryFlowIntroViewModelsResponse.unknownFields();
        }
        BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModel2 = beneficiaryFlowReuseExistingViewModel;
        ByteString byteString2 = byteString;
        BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel2 = beneficiaryFlowBeneficiaryRoleViewModel;
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel2 = beneficiaryFlowAgreementViewModel;
        return getBeneficiaryFlowIntroViewModelsResponse.copy(str, beneficiaryInfoViewModel, beneficiaryFlowAgreementViewModel2, beneficiaryFlowBeneficiaryTypeViewModel, beneficiaryFlowBeneficiaryRoleViewModel2, beneficiaryFlowReuseExistingViewModel2, byteString2);
    }

    public final GetBeneficiaryFlowIntroViewModelsResponse copy(String account_number, BeneficiaryInfoViewModel info_view_model, BeneficiaryFlowAgreementViewModel agreement_view_model, BeneficiaryFlowBeneficiaryTypeViewModel beneficiary_type_view_model, BeneficiaryFlowBeneficiaryRoleViewModel beneficiary_role_view_model, BeneficiaryFlowReuseExistingViewModel reuse_existing_view_model, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetBeneficiaryFlowIntroViewModelsResponse(account_number, info_view_model, agreement_view_model, beneficiary_type_view_model, beneficiary_role_view_model, reuse_existing_view_model, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetBeneficiaryFlowIntroViewModelsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetBeneficiaryFlowIntroViewModelsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.GetBeneficiaryFlowIntroViewModelsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetBeneficiaryFlowIntroViewModelsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                int iEncodedSizeWithTag = size + BeneficiaryInfoViewModel.ADAPTER.encodedSizeWithTag(2, value.getInfo_view_model()) + BeneficiaryFlowAgreementViewModel.ADAPTER.encodedSizeWithTag(3, value.getAgreement_view_model());
                if (value.getBeneficiary_type_view_model() != null) {
                    iEncodedSizeWithTag += BeneficiaryFlowBeneficiaryTypeViewModel.ADAPTER.encodedSizeWithTag(4, value.getBeneficiary_type_view_model());
                }
                return iEncodedSizeWithTag + BeneficiaryFlowBeneficiaryRoleViewModel.ADAPTER.encodedSizeWithTag(5, value.getBeneficiary_role_view_model()) + BeneficiaryFlowReuseExistingViewModel.ADAPTER.encodedSizeWithTag(6, value.getReuse_existing_view_model());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetBeneficiaryFlowIntroViewModelsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                BeneficiaryInfoViewModel.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_view_model());
                BeneficiaryFlowAgreementViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getAgreement_view_model());
                if (value.getBeneficiary_type_view_model() != null) {
                    BeneficiaryFlowBeneficiaryTypeViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getBeneficiary_type_view_model());
                }
                BeneficiaryFlowBeneficiaryRoleViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getBeneficiary_role_view_model());
                BeneficiaryFlowReuseExistingViewModel.ADAPTER.encodeWithTag(writer, 6, (int) value.getReuse_existing_view_model());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetBeneficiaryFlowIntroViewModelsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BeneficiaryFlowReuseExistingViewModel.ADAPTER.encodeWithTag(writer, 6, (int) value.getReuse_existing_view_model());
                BeneficiaryFlowBeneficiaryRoleViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getBeneficiary_role_view_model());
                if (value.getBeneficiary_type_view_model() != null) {
                    BeneficiaryFlowBeneficiaryTypeViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getBeneficiary_type_view_model());
                }
                BeneficiaryFlowAgreementViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getAgreement_view_model());
                BeneficiaryInfoViewModel.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_view_model());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetBeneficiaryFlowIntroViewModelsResponse redact(GetBeneficiaryFlowIntroViewModelsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BeneficiaryInfoViewModel info_view_model = value.getInfo_view_model();
                BeneficiaryInfoViewModel beneficiaryInfoViewModelRedact = info_view_model != null ? BeneficiaryInfoViewModel.ADAPTER.redact(info_view_model) : null;
                BeneficiaryFlowAgreementViewModel agreement_view_model = value.getAgreement_view_model();
                BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModelRedact = agreement_view_model != null ? BeneficiaryFlowAgreementViewModel.ADAPTER.redact(agreement_view_model) : null;
                BeneficiaryFlowBeneficiaryTypeViewModel beneficiary_type_view_model = value.getBeneficiary_type_view_model();
                BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModelRedact = beneficiary_type_view_model != null ? BeneficiaryFlowBeneficiaryTypeViewModel.ADAPTER.redact(beneficiary_type_view_model) : null;
                BeneficiaryFlowBeneficiaryRoleViewModel beneficiary_role_view_model = value.getBeneficiary_role_view_model();
                BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModelRedact = beneficiary_role_view_model != null ? BeneficiaryFlowBeneficiaryRoleViewModel.ADAPTER.redact(beneficiary_role_view_model) : null;
                BeneficiaryFlowReuseExistingViewModel reuse_existing_view_model = value.getReuse_existing_view_model();
                return GetBeneficiaryFlowIntroViewModelsResponse.copy$default(value, null, beneficiaryInfoViewModelRedact, beneficiaryFlowAgreementViewModelRedact, beneficiaryFlowBeneficiaryTypeViewModelRedact, beneficiaryFlowBeneficiaryRoleViewModelRedact, reuse_existing_view_model != null ? BeneficiaryFlowReuseExistingViewModel.ADAPTER.redact(reuse_existing_view_model) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetBeneficiaryFlowIntroViewModelsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                BeneficiaryInfoViewModel beneficiaryInfoViewModelDecode = null;
                BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModelDecode = null;
                BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModelDecode = null;
                BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModelDecode = null;
                BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModelDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                beneficiaryInfoViewModelDecode = BeneficiaryInfoViewModel.ADAPTER.decode(reader);
                                break;
                            case 3:
                                beneficiaryFlowAgreementViewModelDecode = BeneficiaryFlowAgreementViewModel.ADAPTER.decode(reader);
                                break;
                            case 4:
                                beneficiaryFlowBeneficiaryTypeViewModelDecode = BeneficiaryFlowBeneficiaryTypeViewModel.ADAPTER.decode(reader);
                                break;
                            case 5:
                                beneficiaryFlowBeneficiaryRoleViewModelDecode = BeneficiaryFlowBeneficiaryRoleViewModel.ADAPTER.decode(reader);
                                break;
                            case 6:
                                beneficiaryFlowReuseExistingViewModelDecode = BeneficiaryFlowReuseExistingViewModel.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetBeneficiaryFlowIntroViewModelsResponse(strDecode, beneficiaryInfoViewModelDecode, beneficiaryFlowAgreementViewModelDecode, beneficiaryFlowBeneficiaryTypeViewModelDecode, beneficiaryFlowBeneficiaryRoleViewModelDecode, beneficiaryFlowReuseExistingViewModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
