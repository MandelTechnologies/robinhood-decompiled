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

/* compiled from: UpdateBeneficiaryRequest.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "beneficiary_id", "beneficiary_info", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "agreements_to_sign", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiarySignedAgreement;", "additional_account_numbers", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getBeneficiary_id", "getBeneficiary_info", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "getAgreements_to_sign", "()Ljava/util/List;", "getAdditional_account_numbers", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class UpdateBeneficiaryRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateBeneficiaryRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "additionalAccountNumbers", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<String> additional_account_numbers;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiarySignedAgreement#ADAPTER", jsonName = "agreementsToSign", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<BeneficiarySignedAgreement> agreements_to_sign;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "beneficiaryId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String beneficiary_id;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfo#ADAPTER", jsonName = "beneficiaryInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final BeneficiaryInfo beneficiary_info;

    public UpdateBeneficiaryRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ UpdateBeneficiaryRequest(String str, String str2, BeneficiaryInfo beneficiaryInfo, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : beneficiaryInfo, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8842newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getBeneficiary_id() {
        return this.beneficiary_id;
    }

    public final BeneficiaryInfo getBeneficiary_info() {
        return this.beneficiary_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateBeneficiaryRequest(String account_number, String beneficiary_id, BeneficiaryInfo beneficiaryInfo, List<BeneficiarySignedAgreement> agreements_to_sign, List<String> additional_account_numbers, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(beneficiary_id, "beneficiary_id");
        Intrinsics.checkNotNullParameter(agreements_to_sign, "agreements_to_sign");
        Intrinsics.checkNotNullParameter(additional_account_numbers, "additional_account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.beneficiary_id = beneficiary_id;
        this.beneficiary_info = beneficiaryInfo;
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
    public /* synthetic */ Void m8842newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateBeneficiaryRequest)) {
            return false;
        }
        UpdateBeneficiaryRequest updateBeneficiaryRequest = (UpdateBeneficiaryRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateBeneficiaryRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, updateBeneficiaryRequest.account_number) && Intrinsics.areEqual(this.beneficiary_id, updateBeneficiaryRequest.beneficiary_id) && Intrinsics.areEqual(this.beneficiary_info, updateBeneficiaryRequest.beneficiary_info) && Intrinsics.areEqual(this.agreements_to_sign, updateBeneficiaryRequest.agreements_to_sign) && Intrinsics.areEqual(this.additional_account_numbers, updateBeneficiaryRequest.additional_account_numbers);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.beneficiary_id.hashCode()) * 37;
        BeneficiaryInfo beneficiaryInfo = this.beneficiary_info;
        int iHashCode2 = ((((iHashCode + (beneficiaryInfo != null ? beneficiaryInfo.hashCode() : 0)) * 37) + this.agreements_to_sign.hashCode()) * 37) + this.additional_account_numbers.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("beneficiary_id=" + Internal.sanitize(this.beneficiary_id));
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateBeneficiaryRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateBeneficiaryRequest copy$default(UpdateBeneficiaryRequest updateBeneficiaryRequest, String str, String str2, BeneficiaryInfo beneficiaryInfo, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateBeneficiaryRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = updateBeneficiaryRequest.beneficiary_id;
        }
        if ((i & 4) != 0) {
            beneficiaryInfo = updateBeneficiaryRequest.beneficiary_info;
        }
        if ((i & 8) != 0) {
            list = updateBeneficiaryRequest.agreements_to_sign;
        }
        if ((i & 16) != 0) {
            list2 = updateBeneficiaryRequest.additional_account_numbers;
        }
        if ((i & 32) != 0) {
            byteString = updateBeneficiaryRequest.unknownFields();
        }
        List list3 = list2;
        ByteString byteString2 = byteString;
        return updateBeneficiaryRequest.copy(str, str2, beneficiaryInfo, list, list3, byteString2);
    }

    public final UpdateBeneficiaryRequest copy(String account_number, String beneficiary_id, BeneficiaryInfo beneficiary_info, List<BeneficiarySignedAgreement> agreements_to_sign, List<String> additional_account_numbers, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(beneficiary_id, "beneficiary_id");
        Intrinsics.checkNotNullParameter(agreements_to_sign, "agreements_to_sign");
        Intrinsics.checkNotNullParameter(additional_account_numbers, "additional_account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateBeneficiaryRequest(account_number, beneficiary_id, beneficiary_info, agreements_to_sign, additional_account_numbers, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateBeneficiaryRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateBeneficiaryRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.UpdateBeneficiaryRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateBeneficiaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getBeneficiary_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBeneficiary_id());
                }
                if (value.getBeneficiary_info() != null) {
                    size += BeneficiaryInfo.ADAPTER.encodedSizeWithTag(3, value.getBeneficiary_info());
                }
                return size + BeneficiarySignedAgreement.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getAgreements_to_sign()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, value.getAdditional_account_numbers());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateBeneficiaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getBeneficiary_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBeneficiary_id());
                }
                if (value.getBeneficiary_info() != null) {
                    BeneficiaryInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getBeneficiary_info());
                }
                BeneficiarySignedAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAgreements_to_sign());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, (int) value.getAdditional_account_numbers());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateBeneficiaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getAdditional_account_numbers());
                BeneficiarySignedAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAgreements_to_sign());
                if (value.getBeneficiary_info() != null) {
                    BeneficiaryInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getBeneficiary_info());
                }
                if (!Intrinsics.areEqual(value.getBeneficiary_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getBeneficiary_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateBeneficiaryRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                BeneficiaryInfo beneficiaryInfoDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateBeneficiaryRequest(strDecode, strDecode2, beneficiaryInfoDecode, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        beneficiaryInfoDecode = BeneficiaryInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(BeneficiarySignedAgreement.ADAPTER.decode(reader));
                    } else if (iNextTag == 5) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateBeneficiaryRequest redact(UpdateBeneficiaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BeneficiaryInfo beneficiary_info = value.getBeneficiary_info();
                return UpdateBeneficiaryRequest.copy$default(value, null, null, beneficiary_info != null ? BeneficiaryInfo.ADAPTER.redact(beneficiary_info) : null, Internal.m26823redactElements(value.getAgreements_to_sign(), BeneficiarySignedAgreement.ADAPTER), null, ByteString.EMPTY, 19, null);
            }
        };
    }
}
