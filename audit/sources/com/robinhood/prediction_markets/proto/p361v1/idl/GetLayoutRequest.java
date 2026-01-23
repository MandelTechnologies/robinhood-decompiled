package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: GetLayoutRequest.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequest;", "Lcom/squareup/wire/Message;", "", "node_id", "", "cursor", "page_size", "", "preview_size", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILokio/ByteString;)V", "getNode_id", "()Ljava/lang/String;", "getCursor", "getPage_size", "()I", "getPreview_size", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetLayoutRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetLayoutRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nodeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String node_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int page_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "previewSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int preview_size;

    public GetLayoutRequest() {
        this(null, null, 0, 0, null, 31, null);
    }

    public /* synthetic */ GetLayoutRequest(String str, String str2, int i, int i2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23810newBuilder();
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final int getPage_size() {
        return this.page_size;
    }

    public final int getPreview_size() {
        return this.preview_size;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLayoutRequest(String node_id, String cursor, int i, int i2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.node_id = node_id;
        this.cursor = cursor;
        this.page_size = i;
        this.preview_size = i2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23810newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLayoutRequest)) {
            return false;
        }
        GetLayoutRequest getLayoutRequest = (GetLayoutRequest) other;
        return Intrinsics.areEqual(unknownFields(), getLayoutRequest.unknownFields()) && Intrinsics.areEqual(this.node_id, getLayoutRequest.node_id) && Intrinsics.areEqual(this.cursor, getLayoutRequest.cursor) && this.page_size == getLayoutRequest.page_size && this.preview_size == getLayoutRequest.preview_size;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.node_id.hashCode()) * 37) + this.cursor.hashCode()) * 37) + Integer.hashCode(this.page_size)) * 37) + Integer.hashCode(this.preview_size);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("node_id=" + Internal.sanitize(this.node_id));
        arrayList.add("cursor=" + Internal.sanitize(this.cursor));
        arrayList.add("page_size=" + this.page_size);
        arrayList.add("preview_size=" + this.preview_size);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLayoutRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLayoutRequest copy$default(GetLayoutRequest getLayoutRequest, String str, String str2, int i, int i2, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getLayoutRequest.node_id;
        }
        if ((i3 & 2) != 0) {
            str2 = getLayoutRequest.cursor;
        }
        if ((i3 & 4) != 0) {
            i = getLayoutRequest.page_size;
        }
        if ((i3 & 8) != 0) {
            i2 = getLayoutRequest.preview_size;
        }
        if ((i3 & 16) != 0) {
            byteString = getLayoutRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i4 = i;
        return getLayoutRequest.copy(str, str2, i4, i2, byteString2);
    }

    public final GetLayoutRequest copy(String node_id, String cursor, int page_size, int preview_size, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLayoutRequest(node_id, cursor, page_size, preview_size, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLayoutRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLayoutRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetLayoutRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLayoutRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNode_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNode_id());
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCursor());
                }
                if (value.getPage_size() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getPage_size()));
                }
                return value.getPreview_size() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getPreview_size())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLayoutRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNode_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNode_id());
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCursor());
                }
                if (value.getPage_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getPage_size()));
                }
                if (value.getPreview_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getPreview_size()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLayoutRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPreview_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getPreview_size()));
                }
                if (value.getPage_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getPage_size()));
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCursor());
                }
                if (Intrinsics.areEqual(value.getNode_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNode_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLayoutRequest redact(GetLayoutRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetLayoutRequest.copy$default(value, null, null, 0, 0, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLayoutRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetLayoutRequest(strDecode, strDecode2, iIntValue, iIntValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 4) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
