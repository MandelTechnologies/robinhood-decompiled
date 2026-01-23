package options_product.service;

import com.robinhood.android.odyssey.lib.Constants4;
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

/* compiled from: CreateChatRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JJ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Loptions_product/service/CreateChatRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", Constants4.ENTITY_FIELD_PHONE_NUMBER, "case_description", "email", "mocm_case_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getPhone_number", "getCase_description", "getEmail", "getMocm_case_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CreateChatRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateChatRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "caseDescription", schemaIndex = 2, tag = 3)
    private final String case_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String email;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mocmCaseId", schemaIndex = 4, tag = 5)
    private final String mocm_case_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "phoneNumber", schemaIndex = 1, tag = 2)
    private final String phone_number;

    public CreateChatRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29462newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ CreateChatRequest(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public final String getCase_description() {
        return this.case_description;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMocm_case_id() {
        return this.mocm_case_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateChatRequest(String account_number, String str, String str2, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.phone_number = str;
        this.case_description = str2;
        this.email = str3;
        this.mocm_case_id = str4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29462newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateChatRequest)) {
            return false;
        }
        CreateChatRequest createChatRequest = (CreateChatRequest) other;
        return Intrinsics.areEqual(unknownFields(), createChatRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, createChatRequest.account_number) && Intrinsics.areEqual(this.phone_number, createChatRequest.phone_number) && Intrinsics.areEqual(this.case_description, createChatRequest.case_description) && Intrinsics.areEqual(this.email, createChatRequest.email) && Intrinsics.areEqual(this.mocm_case_id, createChatRequest.mocm_case_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        String str = this.phone_number;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.case_description;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.email;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.mocm_case_id;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        String str = this.phone_number;
        if (str != null) {
            arrayList.add("phone_number=" + Internal.sanitize(str));
        }
        String str2 = this.case_description;
        if (str2 != null) {
            arrayList.add("case_description=" + Internal.sanitize(str2));
        }
        String str3 = this.email;
        if (str3 != null) {
            arrayList.add("email=" + Internal.sanitize(str3));
        }
        String str4 = this.mocm_case_id;
        if (str4 != null) {
            arrayList.add("mocm_case_id=" + Internal.sanitize(str4));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateChatRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateChatRequest copy$default(CreateChatRequest createChatRequest, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createChatRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = createChatRequest.phone_number;
        }
        if ((i & 4) != 0) {
            str3 = createChatRequest.case_description;
        }
        if ((i & 8) != 0) {
            str4 = createChatRequest.email;
        }
        if ((i & 16) != 0) {
            str5 = createChatRequest.mocm_case_id;
        }
        if ((i & 32) != 0) {
            byteString = createChatRequest.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return createChatRequest.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final CreateChatRequest copy(String account_number, String phone_number, String case_description, String email, String mocm_case_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateChatRequest(account_number, phone_number, case_description, email, mocm_case_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateChatRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateChatRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.CreateChatRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateChatRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getPhone_number()) + protoAdapter.encodedSizeWithTag(3, value.getCase_description()) + protoAdapter.encodedSizeWithTag(4, value.getEmail()) + protoAdapter.encodedSizeWithTag(5, value.getMocm_case_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateChatRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getPhone_number());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCase_description());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getEmail());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getMocm_case_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateChatRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getMocm_case_id());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getEmail());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCase_description());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getPhone_number());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateChatRequest redact(CreateChatRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateChatRequest.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateChatRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateChatRequest(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
