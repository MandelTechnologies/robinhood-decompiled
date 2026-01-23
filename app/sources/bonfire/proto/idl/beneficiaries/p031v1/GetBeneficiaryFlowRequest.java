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

/* compiled from: GetBeneficiaryFlowRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "beneficiary_id", "beneficiary_type", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "beneficiary_role", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getBeneficiary_id", "getBeneficiary_type", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "getBeneficiary_role", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetBeneficiaryFlowRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetBeneficiaryFlowRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "beneficiaryId", schemaIndex = 1, tag = 2)
    private final String beneficiary_id;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryRole#ADAPTER", jsonName = "beneficiaryRole", schemaIndex = 3, tag = 4)
    private final BeneficiaryRole beneficiary_role;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryType#ADAPTER", jsonName = "beneficiaryType", schemaIndex = 2, tag = 3)
    private final BeneficiaryType beneficiary_type;

    public GetBeneficiaryFlowRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8830newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetBeneficiaryFlowRequest(String str, String str2, BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : beneficiaryType, (i & 8) != 0 ? null : beneficiaryRole, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getBeneficiary_id() {
        return this.beneficiary_id;
    }

    public final BeneficiaryType getBeneficiary_type() {
        return this.beneficiary_type;
    }

    public final BeneficiaryRole getBeneficiary_role() {
        return this.beneficiary_role;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBeneficiaryFlowRequest(String account_number, String str, BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.beneficiary_id = str;
        this.beneficiary_type = beneficiaryType;
        this.beneficiary_role = beneficiaryRole;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8830newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetBeneficiaryFlowRequest)) {
            return false;
        }
        GetBeneficiaryFlowRequest getBeneficiaryFlowRequest = (GetBeneficiaryFlowRequest) other;
        return Intrinsics.areEqual(unknownFields(), getBeneficiaryFlowRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, getBeneficiaryFlowRequest.account_number) && Intrinsics.areEqual(this.beneficiary_id, getBeneficiaryFlowRequest.beneficiary_id) && this.beneficiary_type == getBeneficiaryFlowRequest.beneficiary_type && this.beneficiary_role == getBeneficiaryFlowRequest.beneficiary_role;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        String str = this.beneficiary_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        BeneficiaryType beneficiaryType = this.beneficiary_type;
        int iHashCode3 = (iHashCode2 + (beneficiaryType != null ? beneficiaryType.hashCode() : 0)) * 37;
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
        BeneficiaryType beneficiaryType = this.beneficiary_type;
        if (beneficiaryType != null) {
            arrayList.add("beneficiary_type=" + beneficiaryType);
        }
        BeneficiaryRole beneficiaryRole = this.beneficiary_role;
        if (beneficiaryRole != null) {
            arrayList.add("beneficiary_role=" + beneficiaryRole);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBeneficiaryFlowRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetBeneficiaryFlowRequest copy$default(GetBeneficiaryFlowRequest getBeneficiaryFlowRequest, String str, String str2, BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBeneficiaryFlowRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getBeneficiaryFlowRequest.beneficiary_id;
        }
        if ((i & 4) != 0) {
            beneficiaryType = getBeneficiaryFlowRequest.beneficiary_type;
        }
        if ((i & 8) != 0) {
            beneficiaryRole = getBeneficiaryFlowRequest.beneficiary_role;
        }
        if ((i & 16) != 0) {
            byteString = getBeneficiaryFlowRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        BeneficiaryType beneficiaryType2 = beneficiaryType;
        return getBeneficiaryFlowRequest.copy(str, str2, beneficiaryType2, beneficiaryRole, byteString2);
    }

    public final GetBeneficiaryFlowRequest copy(String account_number, String beneficiary_id, BeneficiaryType beneficiary_type, BeneficiaryRole beneficiary_role, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetBeneficiaryFlowRequest(account_number, beneficiary_id, beneficiary_type, beneficiary_role, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetBeneficiaryFlowRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetBeneficiaryFlowRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.GetBeneficiaryFlowRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetBeneficiaryFlowRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBeneficiary_id()) + BeneficiaryType.ADAPTER.encodedSizeWithTag(3, value.getBeneficiary_type()) + BeneficiaryRole.ADAPTER.encodedSizeWithTag(4, value.getBeneficiary_role());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetBeneficiaryFlowRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBeneficiary_id());
                BeneficiaryType.ADAPTER.encodeWithTag(writer, 3, (int) value.getBeneficiary_type());
                BeneficiaryRole.ADAPTER.encodeWithTag(writer, 4, (int) value.getBeneficiary_role());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetBeneficiaryFlowRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BeneficiaryRole.ADAPTER.encodeWithTag(writer, 4, (int) value.getBeneficiary_role());
                BeneficiaryType.ADAPTER.encodeWithTag(writer, 3, (int) value.getBeneficiary_type());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBeneficiary_id());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetBeneficiaryFlowRequest redact(GetBeneficiaryFlowRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetBeneficiaryFlowRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetBeneficiaryFlowRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                BeneficiaryType beneficiaryTypeDecode = null;
                BeneficiaryRole beneficiaryRoleDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetBeneficiaryFlowRequest(str, strDecode2, beneficiaryTypeDecode, beneficiaryRoleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                try {
                                    beneficiaryTypeDecode = BeneficiaryType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 4) {
                                try {
                                    beneficiaryRoleDecode = BeneficiaryRole.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
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
