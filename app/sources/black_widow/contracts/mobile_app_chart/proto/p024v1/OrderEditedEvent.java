package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: OrderEditedEvent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;", "Lcom/squareup/wire/Message;", "", "original_order_id", "", "new_order_id", "ref_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getOriginal_order_id", "()Ljava/lang/String;", "getNew_order_id", "getRef_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class OrderEditedEvent extends Message {

    @JvmField
    public static final ProtoAdapter<OrderEditedEvent> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String new_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "originalOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String original_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String ref_id;

    public OrderEditedEvent() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ OrderEditedEvent(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8629newBuilder();
    }

    public final String getOriginal_order_id() {
        return this.original_order_id;
    }

    public final String getNew_order_id() {
        return this.new_order_id;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderEditedEvent(String original_order_id, String new_order_id, String ref_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(original_order_id, "original_order_id");
        Intrinsics.checkNotNullParameter(new_order_id, "new_order_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.original_order_id = original_order_id;
        this.new_order_id = new_order_id;
        this.ref_id = ref_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8629newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderEditedEvent)) {
            return false;
        }
        OrderEditedEvent orderEditedEvent = (OrderEditedEvent) other;
        return Intrinsics.areEqual(unknownFields(), orderEditedEvent.unknownFields()) && Intrinsics.areEqual(this.original_order_id, orderEditedEvent.original_order_id) && Intrinsics.areEqual(this.new_order_id, orderEditedEvent.new_order_id) && Intrinsics.areEqual(this.ref_id, orderEditedEvent.ref_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.original_order_id.hashCode()) * 37) + this.new_order_id.hashCode()) * 37) + this.ref_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("original_order_id=" + Internal.sanitize(this.original_order_id));
        arrayList.add("new_order_id=" + Internal.sanitize(this.new_order_id));
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderEditedEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderEditedEvent copy$default(OrderEditedEvent orderEditedEvent, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderEditedEvent.original_order_id;
        }
        if ((i & 2) != 0) {
            str2 = orderEditedEvent.new_order_id;
        }
        if ((i & 4) != 0) {
            str3 = orderEditedEvent.ref_id;
        }
        if ((i & 8) != 0) {
            byteString = orderEditedEvent.unknownFields();
        }
        return orderEditedEvent.copy(str, str2, str3, byteString);
    }

    public final OrderEditedEvent copy(String original_order_id, String new_order_id, String ref_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(original_order_id, "original_order_id");
        Intrinsics.checkNotNullParameter(new_order_id, "new_order_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderEditedEvent(original_order_id, new_order_id, ref_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderEditedEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderEditedEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.OrderEditedEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderEditedEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOriginal_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOriginal_order_id());
                }
                if (!Intrinsics.areEqual(value.getNew_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNew_order_id());
                }
                return !Intrinsics.areEqual(value.getRef_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRef_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderEditedEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOriginal_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOriginal_order_id());
                }
                if (!Intrinsics.areEqual(value.getNew_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNew_order_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRef_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderEditedEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getNew_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNew_order_id());
                }
                if (Intrinsics.areEqual(value.getOriginal_order_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOriginal_order_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderEditedEvent redact(OrderEditedEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OrderEditedEvent.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderEditedEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderEditedEvent(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
