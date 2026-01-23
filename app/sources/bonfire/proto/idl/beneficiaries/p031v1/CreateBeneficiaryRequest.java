package bonfire.proto.idl.beneficiaries.p031v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CreateBeneficiaryRequest.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "beneficiary_info", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "agreements_to_sign", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiarySignedAgreement;", "additional_account_numbers", "beneficiary_role", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getBeneficiary_info", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "getBeneficiary_role", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "getAgreements_to_sign", "()Ljava/util/List;", "getAdditional_account_numbers", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CreateBeneficiaryRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateBeneficiaryRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "additionalAccountNumbers", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<String> additional_account_numbers;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiarySignedAgreement#ADAPTER", jsonName = "agreementsToSign", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<BeneficiarySignedAgreement> agreements_to_sign;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfo#ADAPTER", jsonName = "beneficiaryInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BeneficiaryInfo beneficiary_info;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryRole#ADAPTER", jsonName = "beneficiaryRole", schemaIndex = 4, tag = 5)
    private final BeneficiaryRole beneficiary_role;

    public CreateBeneficiaryRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8826newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ CreateBeneficiaryRequest(String str, BeneficiaryInfo beneficiaryInfo, List list, List list2, BeneficiaryRole beneficiaryRole, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : beneficiaryInfo, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : beneficiaryRole, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final BeneficiaryInfo getBeneficiary_info() {
        return this.beneficiary_info;
    }

    public final BeneficiaryRole getBeneficiary_role() {
        return this.beneficiary_role;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBeneficiaryRequest(String account_number, BeneficiaryInfo beneficiaryInfo, List<BeneficiarySignedAgreement> agreements_to_sign, List<String> additional_account_numbers, BeneficiaryRole beneficiaryRole, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(agreements_to_sign, "agreements_to_sign");
        Intrinsics.checkNotNullParameter(additional_account_numbers, "additional_account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.beneficiary_info = beneficiaryInfo;
        this.beneficiary_role = beneficiaryRole;
        this.agreements_to_sign = Internal.immutableCopyOf("agreements_to_sign", agreements_to_sign);
        this.additional_account_numbers = Internal.immutableCopyOf("additional_account_numbers", additional_account_numbers);
    }

    public final List<BeneficiarySignedAgreement> getAgreements_to_sign() {
        return this.agreements_to_sign;
    }

    public final List<String> getAdditional_account_numbers() {
        return this.additional_account_numbers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8826newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateBeneficiaryRequest)) {
            return false;
        }
        CreateBeneficiaryRequest createBeneficiaryRequest = (CreateBeneficiaryRequest) other;
        return Intrinsics.areEqual(unknownFields(), createBeneficiaryRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, createBeneficiaryRequest.account_number) && Intrinsics.areEqual(this.beneficiary_info, createBeneficiaryRequest.beneficiary_info) && Intrinsics.areEqual(this.agreements_to_sign, createBeneficiaryRequest.agreements_to_sign) && Intrinsics.areEqual(this.additional_account_numbers, createBeneficiaryRequest.additional_account_numbers) && this.beneficiary_role == createBeneficiaryRequest.beneficiary_role;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        BeneficiaryInfo beneficiaryInfo = this.beneficiary_info;
        int iHashCode2 = (((((iHashCode + (beneficiaryInfo != null ? beneficiaryInfo.hashCode() : 0)) * 37) + this.agreements_to_sign.hashCode()) * 37) + this.additional_account_numbers.hashCode()) * 37;
        BeneficiaryRole beneficiaryRole = this.beneficiary_role;
        int iHashCode3 = iHashCode2 + (beneficiaryRole != null ? beneficiaryRole.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        BeneficiaryInfo beneficiaryInfo = this.beneficiary_info;
        if (beneficiaryInfo != null) {
            arrayList.add("beneficiary_info=" + beneficiaryInfo);
        }
        if (!this.agreements_to_sign.isEmpty()) {
            arrayList.add("agreements_to_sign=" + this.agreements_to_sign);
        }
        if (!this.additional_account_numbers.isEmpty()) {
            arrayList.add("additional_account_numbers=" + Internal.sanitize(this.additional_account_numbers));
        }
        BeneficiaryRole beneficiaryRole = this.beneficiary_role;
        if (beneficiaryRole != null) {
            arrayList.add("beneficiary_role=" + beneficiaryRole);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateBeneficiaryRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateBeneficiaryRequest copy$default(CreateBeneficiaryRequest createBeneficiaryRequest, String str, BeneficiaryInfo beneficiaryInfo, List list, List list2, BeneficiaryRole beneficiaryRole, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createBeneficiaryRequest.account_number;
        }
        if ((i & 2) != 0) {
            beneficiaryInfo = createBeneficiaryRequest.beneficiary_info;
        }
        if ((i & 4) != 0) {
            list = createBeneficiaryRequest.agreements_to_sign;
        }
        if ((i & 8) != 0) {
            list2 = createBeneficiaryRequest.additional_account_numbers;
        }
        if ((i & 16) != 0) {
            beneficiaryRole = createBeneficiaryRequest.beneficiary_role;
        }
        if ((i & 32) != 0) {
            byteString = createBeneficiaryRequest.unknownFields();
        }
        BeneficiaryRole beneficiaryRole2 = beneficiaryRole;
        ByteString byteString2 = byteString;
        return createBeneficiaryRequest.copy(str, beneficiaryInfo, list, list2, beneficiaryRole2, byteString2);
    }

    public final CreateBeneficiaryRequest copy(String account_number, BeneficiaryInfo beneficiary_info, List<BeneficiarySignedAgreement> agreements_to_sign, List<String> additional_account_numbers, BeneficiaryRole beneficiary_role, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(agreements_to_sign, "agreements_to_sign");
        Intrinsics.checkNotNullParameter(additional_account_numbers, "additional_account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateBeneficiaryRequest(account_number, beneficiary_info, agreements_to_sign, additional_account_numbers, beneficiary_role, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateBeneficiaryRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateBeneficiaryRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.CreateBeneficiaryRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateBeneficiaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getBeneficiary_info() != null) {
                    size += BeneficiaryInfo.ADAPTER.encodedSizeWithTag(2, value.getBeneficiary_info());
                }
                return size + BeneficiarySignedAgreement.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAgreements_to_sign()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, value.getAdditional_account_numbers()) + BeneficiaryRole.ADAPTER.encodedSizeWithTag(5, value.getBeneficiary_role());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateBeneficiaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getBeneficiary_info() != null) {
                    BeneficiaryInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getBeneficiary_info());
                }
                BeneficiarySignedAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAgreements_to_sign());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 4, (int) value.getAdditional_account_numbers());
                BeneficiaryRole.ADAPTER.encodeWithTag(writer, 5, (int) value.getBeneficiary_role());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateBeneficiaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BeneficiaryRole.ADAPTER.encodeWithTag(writer, 5, (int) value.getBeneficiary_role());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getAdditional_account_numbers());
                BeneficiarySignedAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAgreements_to_sign());
                if (value.getBeneficiary_info() != null) {
                    BeneficiaryInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getBeneficiary_info());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateBeneficiaryRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                BeneficiaryInfo beneficiaryInfoDecode = null;
                BeneficiaryRole beneficiaryRoleDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CreateBeneficiaryRequest(str, beneficiaryInfoDecode, arrayList, arrayList2, beneficiaryRoleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                beneficiaryInfoDecode = BeneficiaryInfo.ADAPTER.decode(reader);
                            } else if (iNextTag == 3) {
                                arrayList.add(BeneficiarySignedAgreement.ADAPTER.decode(reader));
                            } else if (iNextTag == 4) {
                                arrayList2.add(ProtoAdapter.STRING.decode(reader));
                            } else if (iNextTag == 5) {
                                try {
                                    beneficiaryRoleDecode = BeneficiaryRole.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateBeneficiaryRequest redact(CreateBeneficiaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BeneficiaryInfo beneficiary_info = value.getBeneficiary_info();
                return CreateBeneficiaryRequest.copy$default(value, null, beneficiary_info != null ? BeneficiaryInfo.ADAPTER.redact(beneficiary_info) : null, Internal.m26823redactElements(value.getAgreements_to_sign(), BeneficiarySignedAgreement.ADAPTER), null, null, ByteString.EMPTY, 25, null);
            }
        };
    }
}
