package deeplinks.custodial.p447v1;

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

/* compiled from: CustodialPostAccountCreationDeeplink.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Ldeeplinks/custodial/v1/CustodialPostAccountCreationDeeplink;", "Lcom/squareup/wire/Message;", "", "account_number", "", "edit_nickname", "", "source", "microgram_app", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getEdit_nickname", "()Z", "getSource", "getMicrogram_app", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "deeplinks.custodial_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CustodialPostAccountCreationDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<CustodialPostAccountCreationDeeplink> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "editNickname", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean edit_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "microgramApp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String microgram_app;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String source;

    public CustodialPostAccountCreationDeeplink() {
        this(null, false, null, null, null, 31, null);
    }

    public /* synthetic */ CustodialPostAccountCreationDeeplink(String str, boolean z, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27938newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final boolean getEdit_nickname() {
        return this.edit_nickname;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getMicrogram_app() {
        return this.microgram_app;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustodialPostAccountCreationDeeplink(String account_number, boolean z, String str, String microgram_app, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(microgram_app, "microgram_app");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.edit_nickname = z;
        this.source = str;
        this.microgram_app = microgram_app;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27938newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CustodialPostAccountCreationDeeplink)) {
            return false;
        }
        CustodialPostAccountCreationDeeplink custodialPostAccountCreationDeeplink = (CustodialPostAccountCreationDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), custodialPostAccountCreationDeeplink.unknownFields()) && Intrinsics.areEqual(this.account_number, custodialPostAccountCreationDeeplink.account_number) && this.edit_nickname == custodialPostAccountCreationDeeplink.edit_nickname && Intrinsics.areEqual(this.source, custodialPostAccountCreationDeeplink.source) && Intrinsics.areEqual(this.microgram_app, custodialPostAccountCreationDeeplink.microgram_app);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + Boolean.hashCode(this.edit_nickname)) * 37;
        String str = this.source;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.microgram_app.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("edit_nickname=" + this.edit_nickname);
        String str = this.source;
        if (str != null) {
            arrayList.add("source=" + Internal.sanitize(str));
        }
        arrayList.add("microgram_app=" + Internal.sanitize(this.microgram_app));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustodialPostAccountCreationDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CustodialPostAccountCreationDeeplink copy$default(CustodialPostAccountCreationDeeplink custodialPostAccountCreationDeeplink, String str, boolean z, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = custodialPostAccountCreationDeeplink.account_number;
        }
        if ((i & 2) != 0) {
            z = custodialPostAccountCreationDeeplink.edit_nickname;
        }
        if ((i & 4) != 0) {
            str2 = custodialPostAccountCreationDeeplink.source;
        }
        if ((i & 8) != 0) {
            str3 = custodialPostAccountCreationDeeplink.microgram_app;
        }
        if ((i & 16) != 0) {
            byteString = custodialPostAccountCreationDeeplink.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return custodialPostAccountCreationDeeplink.copy(str, z, str4, str3, byteString2);
    }

    public final CustodialPostAccountCreationDeeplink copy(String account_number, boolean edit_nickname, String source, String microgram_app, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(microgram_app, "microgram_app");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CustodialPostAccountCreationDeeplink(account_number, edit_nickname, source, microgram_app, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustodialPostAccountCreationDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CustodialPostAccountCreationDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.custodial.v1.CustodialPostAccountCreationDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CustodialPostAccountCreationDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getEdit_nickname()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getEdit_nickname()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getSource());
                return !Intrinsics.areEqual(value.getMicrogram_app(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getMicrogram_app()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CustodialPostAccountCreationDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getEdit_nickname()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getEdit_nickname()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSource());
                if (!Intrinsics.areEqual(value.getMicrogram_app(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getMicrogram_app());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CustodialPostAccountCreationDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMicrogram_app(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMicrogram_app());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSource());
                if (value.getEdit_nickname()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getEdit_nickname()));
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CustodialPostAccountCreationDeeplink redact(CustodialPostAccountCreationDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CustodialPostAccountCreationDeeplink.copy$default(value, null, false, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CustodialPostAccountCreationDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                boolean zBooleanValue = false;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CustodialPostAccountCreationDeeplink(strDecode, zBooleanValue, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
