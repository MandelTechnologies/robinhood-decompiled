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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetBeneficiaryFlowResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "beneficiary_id", "flow_type", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowType;", "beneficiary_role", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowType;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getBeneficiary_id", "getFlow_type", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowType;", "getBeneficiary_role", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetBeneficiaryFlowResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetBeneficiaryFlowResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "beneficiaryId", schemaIndex = 1, tag = 2)
    private final String beneficiary_id;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryRole#ADAPTER", jsonName = "beneficiaryRole", schemaIndex = 3, tag = 4)
    private final BeneficiaryRole beneficiary_role;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowType#ADAPTER", jsonName = "flowType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final BeneficiaryFlowType flow_type;

    public GetBeneficiaryFlowResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8831newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetBeneficiaryFlowResponse(String str, String str2, BeneficiaryFlowType beneficiaryFlowType, BeneficiaryRole beneficiaryRole, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : beneficiaryFlowType, (i & 8) != 0 ? null : beneficiaryRole, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getBeneficiary_id() {
        return this.beneficiary_id;
    }

    public final BeneficiaryFlowType getFlow_type() {
        return this.flow_type;
    }

    public final BeneficiaryRole getBeneficiary_role() {
        return this.beneficiary_role;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBeneficiaryFlowResponse(String account_number, String str, BeneficiaryFlowType beneficiaryFlowType, BeneficiaryRole beneficiaryRole, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.beneficiary_id = str;
        this.flow_type = beneficiaryFlowType;
        this.beneficiary_role = beneficiaryRole;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8831newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetBeneficiaryFlowResponse)) {
            return false;
        }
        GetBeneficiaryFlowResponse getBeneficiaryFlowResponse = (GetBeneficiaryFlowResponse) other;
        return Intrinsics.areEqual(unknownFields(), getBeneficiaryFlowResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getBeneficiaryFlowResponse.account_number) && Intrinsics.areEqual(this.beneficiary_id, getBeneficiaryFlowResponse.beneficiary_id) && Intrinsics.areEqual(this.flow_type, getBeneficiaryFlowResponse.flow_type) && this.beneficiary_role == getBeneficiaryFlowResponse.beneficiary_role;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        String str = this.beneficiary_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        BeneficiaryFlowType beneficiaryFlowType = this.flow_type;
        int iHashCode3 = (iHashCode2 + (beneficiaryFlowType != null ? beneficiaryFlowType.hashCode() : 0)) * 37;
        BeneficiaryRole beneficiaryRole = this.beneficiary_role;
        int iHashCode4 = iHashCode3 + (beneficiaryRole != null ? beneficiaryRole.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        String str = this.beneficiary_id;
        if (str != null) {
            arrayList.add("beneficiary_id=" + Internal.sanitize(str));
        }
        BeneficiaryFlowType beneficiaryFlowType = this.flow_type;
        if (beneficiaryFlowType != null) {
            arrayList.add("flow_type=" + beneficiaryFlowType);
        }
        BeneficiaryRole beneficiaryRole = this.beneficiary_role;
        if (beneficiaryRole != null) {
            arrayList.add("beneficiary_role=" + beneficiaryRole);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBeneficiaryFlowResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetBeneficiaryFlowResponse copy$default(GetBeneficiaryFlowResponse getBeneficiaryFlowResponse, String str, String str2, BeneficiaryFlowType beneficiaryFlowType, BeneficiaryRole beneficiaryRole, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBeneficiaryFlowResponse.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getBeneficiaryFlowResponse.beneficiary_id;
        }
        if ((i & 4) != 0) {
            beneficiaryFlowType = getBeneficiaryFlowResponse.flow_type;
        }
        if ((i & 8) != 0) {
            beneficiaryRole = getBeneficiaryFlowResponse.beneficiary_role;
        }
        if ((i & 16) != 0) {
            byteString = getBeneficiaryFlowResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        BeneficiaryFlowType beneficiaryFlowType2 = beneficiaryFlowType;
        return getBeneficiaryFlowResponse.copy(str, str2, beneficiaryFlowType2, beneficiaryRole, byteString2);
    }

    public final GetBeneficiaryFlowResponse copy(String account_number, String beneficiary_id, BeneficiaryFlowType flow_type, BeneficiaryRole beneficiary_role, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetBeneficiaryFlowResponse(account_number, beneficiary_id, flow_type, beneficiary_role, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetBeneficiaryFlowResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetBeneficiaryFlowResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.GetBeneficiaryFlowResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetBeneficiaryFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBeneficiary_id());
                if (value.getFlow_type() != null) {
                    iEncodedSizeWithTag += BeneficiaryFlowType.ADAPTER.encodedSizeWithTag(3, value.getFlow_type());
                }
                return iEncodedSizeWithTag + BeneficiaryRole.ADAPTER.encodedSizeWithTag(4, value.getBeneficiary_role());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetBeneficiaryFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBeneficiary_id());
                if (value.getFlow_type() != null) {
                    BeneficiaryFlowType.ADAPTER.encodeWithTag(writer, 3, (int) value.getFlow_type());
                }
                BeneficiaryRole.ADAPTER.encodeWithTag(writer, 4, (int) value.getBeneficiary_role());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetBeneficiaryFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BeneficiaryRole.ADAPTER.encodeWithTag(writer, 4, (int) value.getBeneficiary_role());
                if (value.getFlow_type() != null) {
                    BeneficiaryFlowType.ADAPTER.encodeWithTag(writer, 3, (int) value.getFlow_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBeneficiary_id());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetBeneficiaryFlowResponse redact(GetBeneficiaryFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BeneficiaryFlowType flow_type = value.getFlow_type();
                return GetBeneficiaryFlowResponse.copy$default(value, null, null, flow_type != null ? BeneficiaryFlowType.ADAPTER.redact(flow_type) : null, null, ByteString.EMPTY, 11, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetBeneficiaryFlowResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                BeneficiaryFlowType beneficiaryFlowTypeDecode = null;
                BeneficiaryRole beneficiaryRoleDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetBeneficiaryFlowResponse(str, strDecode2, beneficiaryFlowTypeDecode, beneficiaryRoleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                beneficiaryFlowTypeDecode = BeneficiaryFlowType.ADAPTER.decode(reader);
                            } else if (iNextTag == 4) {
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
        };
    }
}
