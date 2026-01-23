package contracts.crypto.trade.proto.p431v1;

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
import rh_server_driven_ui.p531v1.Text;

/* compiled from: StreamCryptoDisclosuresResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresResponse;", "Lcom/squareup/wire/Message;", "", "disclosure_title", "", "disclosure_text", "Lrh_server_driven_ui/v1/Text;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/Text;Lokio/ByteString;)V", "getDisclosure_title", "()Ljava/lang/String;", "getDisclosure_text", "()Lrh_server_driven_ui/v1/Text;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamCryptoDisclosuresResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoDisclosuresResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Text#ADAPTER", jsonName = "disclosureText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Text disclosure_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureTitle", schemaIndex = 0, tag = 1)
    private final String disclosure_title;

    public StreamCryptoDisclosuresResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27707newBuilder();
    }

    public final String getDisclosure_title() {
        return this.disclosure_title;
    }

    public final Text getDisclosure_text() {
        return this.disclosure_text;
    }

    public /* synthetic */ StreamCryptoDisclosuresResponse(String str, Text text, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : text, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoDisclosuresResponse(String str, Text text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.disclosure_title = str;
        this.disclosure_text = text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27707newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoDisclosuresResponse)) {
            return false;
        }
        StreamCryptoDisclosuresResponse streamCryptoDisclosuresResponse = (StreamCryptoDisclosuresResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoDisclosuresResponse.unknownFields()) && Intrinsics.areEqual(this.disclosure_title, streamCryptoDisclosuresResponse.disclosure_title) && Intrinsics.areEqual(this.disclosure_text, streamCryptoDisclosuresResponse.disclosure_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.disclosure_title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Text text = this.disclosure_text;
        int iHashCode3 = iHashCode2 + (text != null ? text.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.disclosure_title;
        if (str != null) {
            arrayList.add("disclosure_title=" + Internal.sanitize(str));
        }
        Text text = this.disclosure_text;
        if (text != null) {
            arrayList.add("disclosure_text=" + text);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoDisclosuresResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamCryptoDisclosuresResponse copy$default(StreamCryptoDisclosuresResponse streamCryptoDisclosuresResponse, String str, Text text, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamCryptoDisclosuresResponse.disclosure_title;
        }
        if ((i & 2) != 0) {
            text = streamCryptoDisclosuresResponse.disclosure_text;
        }
        if ((i & 4) != 0) {
            byteString = streamCryptoDisclosuresResponse.unknownFields();
        }
        return streamCryptoDisclosuresResponse.copy(str, text, byteString);
    }

    public final StreamCryptoDisclosuresResponse copy(String disclosure_title, Text disclosure_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoDisclosuresResponse(disclosure_title, disclosure_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoDisclosuresResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoDisclosuresResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoDisclosuresResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDisclosure_title());
                return value.getDisclosure_text() != null ? size + Text.ADAPTER.encodedSizeWithTag(2, value.getDisclosure_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoDisclosuresResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisclosure_title());
                if (value.getDisclosure_text() != null) {
                    Text.ADAPTER.encodeWithTag(writer, 2, (int) value.getDisclosure_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoDisclosuresResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDisclosure_text() != null) {
                    Text.ADAPTER.encodeWithTag(writer, 2, (int) value.getDisclosure_text());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisclosure_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoDisclosuresResponse redact(StreamCryptoDisclosuresResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Text disclosure_text = value.getDisclosure_text();
                return StreamCryptoDisclosuresResponse.copy$default(value, null, disclosure_text != null ? Text.ADAPTER.redact(disclosure_text) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoDisclosuresResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Text textDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCryptoDisclosuresResponse(strDecode, textDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        textDecode = Text.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
