package hippo.service.p470v1;

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

/* compiled from: UnsyncChartDrawingRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lhippo/service/v1/UnsyncChartDrawingRequest;", "Lcom/squareup/wire/Message;", "", "drawing_id", "", "widget_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDrawing_id", "()Ljava/lang/String;", "getWidget_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UnsyncChartDrawingRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UnsyncChartDrawingRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "drawingId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String drawing_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "widgetId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String widget_id;

    public UnsyncChartDrawingRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ UnsyncChartDrawingRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28269newBuilder();
    }

    public final String getDrawing_id() {
        return this.drawing_id;
    }

    public final String getWidget_id() {
        return this.widget_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsyncChartDrawingRequest(String drawing_id, String widget_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(drawing_id, "drawing_id");
        Intrinsics.checkNotNullParameter(widget_id, "widget_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.drawing_id = drawing_id;
        this.widget_id = widget_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28269newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UnsyncChartDrawingRequest)) {
            return false;
        }
        UnsyncChartDrawingRequest unsyncChartDrawingRequest = (UnsyncChartDrawingRequest) other;
        return Intrinsics.areEqual(unknownFields(), unsyncChartDrawingRequest.unknownFields()) && Intrinsics.areEqual(this.drawing_id, unsyncChartDrawingRequest.drawing_id) && Intrinsics.areEqual(this.widget_id, unsyncChartDrawingRequest.widget_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.drawing_id.hashCode()) * 37) + this.widget_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("drawing_id=" + Internal.sanitize(this.drawing_id));
        arrayList.add("widget_id=" + Internal.sanitize(this.widget_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnsyncChartDrawingRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UnsyncChartDrawingRequest copy$default(UnsyncChartDrawingRequest unsyncChartDrawingRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unsyncChartDrawingRequest.drawing_id;
        }
        if ((i & 2) != 0) {
            str2 = unsyncChartDrawingRequest.widget_id;
        }
        if ((i & 4) != 0) {
            byteString = unsyncChartDrawingRequest.unknownFields();
        }
        return unsyncChartDrawingRequest.copy(str, str2, byteString);
    }

    public final UnsyncChartDrawingRequest copy(String drawing_id, String widget_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(drawing_id, "drawing_id");
        Intrinsics.checkNotNullParameter(widget_id, "widget_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UnsyncChartDrawingRequest(drawing_id, widget_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UnsyncChartDrawingRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UnsyncChartDrawingRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.service.v1.UnsyncChartDrawingRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UnsyncChartDrawingRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDrawing_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDrawing_id());
                }
                return !Intrinsics.areEqual(value.getWidget_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getWidget_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UnsyncChartDrawingRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDrawing_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDrawing_id());
                }
                if (!Intrinsics.areEqual(value.getWidget_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getWidget_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UnsyncChartDrawingRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getWidget_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getWidget_id());
                }
                if (Intrinsics.areEqual(value.getDrawing_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDrawing_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UnsyncChartDrawingRequest redact(UnsyncChartDrawingRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UnsyncChartDrawingRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UnsyncChartDrawingRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UnsyncChartDrawingRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
