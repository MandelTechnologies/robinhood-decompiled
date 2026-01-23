package equity_order_summary.proto.p459v1;

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

/* compiled from: StreamOrderConfirmationRequest.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lequity_order_summary/proto/v1/StreamOrderConfirmationRequest;", "Lcom/squareup/wire/Message;", "", "order_id", "", "order_to_replace_id", "is_pre_ipo", "", "instrument_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getOrder_to_replace_id", "()Z", "getInstrument_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamOrderConfirmationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<StreamOrderConfirmationRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", schemaIndex = 3, tag = 4)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPreIpo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_pre_ipo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderToReplaceId", schemaIndex = 1, tag = 2)
    private final String order_to_replace_id;

    public StreamOrderConfirmationRequest() {
        this(null, null, false, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28022newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public /* synthetic */ StreamOrderConfirmationRequest(String str, String str2, boolean z, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getOrder_to_replace_id() {
        return this.order_to_replace_id;
    }

    /* renamed from: is_pre_ipo, reason: from getter */
    public final boolean getIs_pre_ipo() {
        return this.is_pre_ipo;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamOrderConfirmationRequest(String order_id, String str, boolean z, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.order_to_replace_id = str;
        this.is_pre_ipo = z;
        this.instrument_id = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28022newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamOrderConfirmationRequest)) {
            return false;
        }
        StreamOrderConfirmationRequest streamOrderConfirmationRequest = (StreamOrderConfirmationRequest) other;
        return Intrinsics.areEqual(unknownFields(), streamOrderConfirmationRequest.unknownFields()) && Intrinsics.areEqual(this.order_id, streamOrderConfirmationRequest.order_id) && Intrinsics.areEqual(this.order_to_replace_id, streamOrderConfirmationRequest.order_to_replace_id) && this.is_pre_ipo == streamOrderConfirmationRequest.is_pre_ipo && Intrinsics.areEqual(this.instrument_id, streamOrderConfirmationRequest.instrument_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37;
        String str = this.order_to_replace_id;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_pre_ipo)) * 37;
        String str2 = this.instrument_id;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        String str = this.order_to_replace_id;
        if (str != null) {
            arrayList.add("order_to_replace_id=" + Internal.sanitize(str));
        }
        arrayList.add("is_pre_ipo=" + this.is_pre_ipo);
        String str2 = this.instrument_id;
        if (str2 != null) {
            arrayList.add("instrument_id=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamOrderConfirmationRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamOrderConfirmationRequest copy$default(StreamOrderConfirmationRequest streamOrderConfirmationRequest, String str, String str2, boolean z, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamOrderConfirmationRequest.order_id;
        }
        if ((i & 2) != 0) {
            str2 = streamOrderConfirmationRequest.order_to_replace_id;
        }
        if ((i & 4) != 0) {
            z = streamOrderConfirmationRequest.is_pre_ipo;
        }
        if ((i & 8) != 0) {
            str3 = streamOrderConfirmationRequest.instrument_id;
        }
        if ((i & 16) != 0) {
            byteString = streamOrderConfirmationRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        return streamOrderConfirmationRequest.copy(str, str2, z2, str3, byteString2);
    }

    public final StreamOrderConfirmationRequest copy(String order_id, String order_to_replace_id, boolean is_pre_ipo, String instrument_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamOrderConfirmationRequest(order_id, order_to_replace_id, is_pre_ipo, instrument_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamOrderConfirmationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamOrderConfirmationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_order_summary.proto.v1.StreamOrderConfirmationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamOrderConfirmationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getOrder_to_replace_id());
                if (value.getIs_pre_ipo()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_pre_ipo()));
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getInstrument_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamOrderConfirmationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getOrder_to_replace_id());
                if (value.getIs_pre_ipo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_pre_ipo()));
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getInstrument_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamOrderConfirmationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getInstrument_id());
                if (value.getIs_pre_ipo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_pre_ipo()));
                }
                protoAdapter.encodeWithTag(writer, 2, (int) value.getOrder_to_replace_id());
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamOrderConfirmationRequest redact(StreamOrderConfirmationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamOrderConfirmationRequest.copy$default(value, null, null, false, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamOrderConfirmationRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                boolean zBooleanValue = false;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamOrderConfirmationRequest(strDecode, strDecode2, zBooleanValue, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
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
