package md_server_proxy.service.p483v1;

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

/* compiled from: KeyInfoDocument.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lmd_server_proxy/service/v1/KeyInfoDocument;", "Lcom/squareup/wire/Message;", "", "description", "", "url_text", "url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDescription", "()Ljava/lang/String;", "getUrl_text", "getUrl", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class KeyInfoDocument extends Message {

    @JvmField
    public static final ProtoAdapter<KeyInfoDocument> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "urlText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String url_text;

    public KeyInfoDocument() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ KeyInfoDocument(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28921newBuilder();
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getUrl_text() {
        return this.url_text;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyInfoDocument(String description, String url_text, String url, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(url_text, "url_text");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.description = description;
        this.url_text = url_text;
        this.url = url;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28921newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof KeyInfoDocument)) {
            return false;
        }
        KeyInfoDocument keyInfoDocument = (KeyInfoDocument) other;
        return Intrinsics.areEqual(unknownFields(), keyInfoDocument.unknownFields()) && Intrinsics.areEqual(this.description, keyInfoDocument.description) && Intrinsics.areEqual(this.url_text, keyInfoDocument.url_text) && Intrinsics.areEqual(this.url, keyInfoDocument.url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.description.hashCode()) * 37) + this.url_text.hashCode()) * 37) + this.url.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("url_text=" + Internal.sanitize(this.url_text));
        arrayList.add("url=" + Internal.sanitize(this.url));
        return CollectionsKt.joinToString$default(arrayList, ", ", "KeyInfoDocument{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ KeyInfoDocument copy$default(KeyInfoDocument keyInfoDocument, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyInfoDocument.description;
        }
        if ((i & 2) != 0) {
            str2 = keyInfoDocument.url_text;
        }
        if ((i & 4) != 0) {
            str3 = keyInfoDocument.url;
        }
        if ((i & 8) != 0) {
            byteString = keyInfoDocument.unknownFields();
        }
        return keyInfoDocument.copy(str, str2, str3, byteString);
    }

    public final KeyInfoDocument copy(String description, String url_text, String url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(url_text, "url_text");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new KeyInfoDocument(description, url_text, url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KeyInfoDocument.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<KeyInfoDocument>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.KeyInfoDocument$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(KeyInfoDocument value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getUrl_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUrl_text());
                }
                return !Intrinsics.areEqual(value.getUrl(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUrl()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, KeyInfoDocument value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getUrl_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl_text());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUrl());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, KeyInfoDocument value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getUrl_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl_text());
                }
                if (Intrinsics.areEqual(value.getDescription(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDescription());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public KeyInfoDocument redact(KeyInfoDocument value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return KeyInfoDocument.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public KeyInfoDocument decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new KeyInfoDocument(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
