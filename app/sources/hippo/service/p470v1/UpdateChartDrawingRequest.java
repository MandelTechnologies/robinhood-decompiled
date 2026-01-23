package hippo.service.p470v1;

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
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: UpdateChartDrawingRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lhippo/service/v1/UpdateChartDrawingRequest;", "Lcom/squareup/wire/Message;", "", "id", "", WebsocketGatewayConstants.DATA_KEY, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UpdateChartDrawingRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateChartDrawingRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 4)
    private final Map<String, ?> data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    public UpdateChartDrawingRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28270newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ UpdateChartDrawingRequest(String str, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateChartDrawingRequest(String id, Map<String, ?> map, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.data = (Map) Internal.immutableCopyOfStruct(WebsocketGatewayConstants.DATA_KEY, map);
    }

    public final Map<String, ?> getData() {
        return this.data;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28270newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateChartDrawingRequest)) {
            return false;
        }
        UpdateChartDrawingRequest updateChartDrawingRequest = (UpdateChartDrawingRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateChartDrawingRequest.unknownFields()) && Intrinsics.areEqual(this.id, updateChartDrawingRequest.id) && Intrinsics.areEqual(this.data, updateChartDrawingRequest.data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Map<String, ?> map = this.data;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Map<String, ?> map = this.data;
        if (map != null) {
            arrayList.add("data=" + map);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateChartDrawingRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateChartDrawingRequest copy$default(UpdateChartDrawingRequest updateChartDrawingRequest, String str, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateChartDrawingRequest.id;
        }
        if ((i & 2) != 0) {
            map = updateChartDrawingRequest.data;
        }
        if ((i & 4) != 0) {
            byteString = updateChartDrawingRequest.unknownFields();
        }
        return updateChartDrawingRequest.copy(str, map, byteString);
    }

    public final UpdateChartDrawingRequest copy(String id, Map<String, ?> data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateChartDrawingRequest(id, data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateChartDrawingRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateChartDrawingRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.service.v1.UpdateChartDrawingRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateChartDrawingRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                return value.getData() != null ? size + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(4, value.getData()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateChartDrawingRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getData() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 4, (int) value.getData());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateChartDrawingRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getData() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 4, (int) value.getData());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateChartDrawingRequest redact(UpdateChartDrawingRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Map<String, ?> data = value.getData();
                return UpdateChartDrawingRequest.copy$default(value, null, data != null ? ProtoAdapter.STRUCT_MAP.redact(data) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateChartDrawingRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Map<String, ?> mapDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateChartDrawingRequest(strDecode, mapDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
