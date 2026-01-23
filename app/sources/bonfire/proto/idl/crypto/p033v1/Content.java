package bonfire.proto.idl.crypto.p033v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: Content.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/Content;", "Lcom/squareup/wire/Message;", "", "content_type", "", WebsocketGatewayConstants.DATA_KEY, "Lbonfire/proto/idl/crypto/v1/Data;", "id", "reason", "currency_id", "sector", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/Data;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getContent_type", "()Ljava/lang/String;", "getData", "()Lbonfire/proto/idl/crypto/v1/Data;", "getId", "getReason", "getCurrency_id", "getSector", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Content extends Message {

    @JvmField
    public static final ProtoAdapter<Content> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String content_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String currency_id;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.Data#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Data data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String sector;

    public Content() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ Content(String str, Data data, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : data, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8899newBuilder();
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getId() {
        return this.id;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getCurrency_id() {
        return this.currency_id;
    }

    public final String getSector() {
        return this.sector;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Content(String content_type, Data data, String id, String reason, String currency_id, String sector, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content_type = content_type;
        this.data = data;
        this.id = id;
        this.reason = reason;
        this.currency_id = currency_id;
        this.sector = sector;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8899newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Content)) {
            return false;
        }
        Content content = (Content) other;
        return Intrinsics.areEqual(unknownFields(), content.unknownFields()) && Intrinsics.areEqual(this.content_type, content.content_type) && Intrinsics.areEqual(this.data, content.data) && Intrinsics.areEqual(this.id, content.id) && Intrinsics.areEqual(this.reason, content.reason) && Intrinsics.areEqual(this.currency_id, content.currency_id) && Intrinsics.areEqual(this.sector, content.sector);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.content_type.hashCode()) * 37;
        Data data = this.data;
        int iHashCode2 = ((((((((iHashCode + (data != null ? data.hashCode() : 0)) * 37) + this.id.hashCode()) * 37) + this.reason.hashCode()) * 37) + this.currency_id.hashCode()) * 37) + this.sector.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("content_type=" + Internal.sanitize(this.content_type));
        Data data = this.data;
        if (data != null) {
            arrayList.add("data=" + data);
        }
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("reason=" + Internal.sanitize(this.reason));
        arrayList.add("currency_id=" + Internal.sanitize(this.currency_id));
        arrayList.add("sector=" + Internal.sanitize(this.sector));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Content{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Content copy$default(Content content, String str, Data data, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = content.content_type;
        }
        if ((i & 2) != 0) {
            data = content.data;
        }
        if ((i & 4) != 0) {
            str2 = content.id;
        }
        if ((i & 8) != 0) {
            str3 = content.reason;
        }
        if ((i & 16) != 0) {
            str4 = content.currency_id;
        }
        if ((i & 32) != 0) {
            str5 = content.sector;
        }
        if ((i & 64) != 0) {
            byteString = content.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        String str8 = str2;
        return content.copy(str, data, str8, str3, str7, str6, byteString2);
    }

    public final Content copy(String content_type, Data data, String id, String reason, String currency_id, String sector, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Content(content_type, data, id, reason, currency_id, sector, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Content.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Content>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.Content$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Content value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContent_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContent_type());
                }
                if (value.getData() != null) {
                    size += Data.ADAPTER.encodedSizeWithTag(2, value.getData());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getId());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getReason());
                }
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCurrency_id());
                }
                return !Intrinsics.areEqual(value.getSector(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getSector()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Content value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContent_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContent_type());
                }
                if (value.getData() != null) {
                    Data.ADAPTER.encodeWithTag(writer, 2, (int) value.getData());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getReason());
                }
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCurrency_id());
                }
                if (!Intrinsics.areEqual(value.getSector(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSector());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Content value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSector(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSector());
                }
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCurrency_id());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getReason());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (value.getData() != null) {
                    Data.ADAPTER.encodeWithTag(writer, 2, (int) value.getData());
                }
                if (Intrinsics.areEqual(value.getContent_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContent_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Content redact(Content value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Data data = value.getData();
                return Content.copy$default(value, null, data != null ? Data.ADAPTER.redact(data) : null, null, null, null, null, ByteString.EMPTY, 61, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Content decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Data dataDecode = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                dataDecode = Data.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Content(strDecode, dataDecode, strDecode5, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
