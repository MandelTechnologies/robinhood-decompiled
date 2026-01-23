package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.robinhood.models.card.p311db.Card;
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

/* compiled from: SubmitOrderEvent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEvent;", "Lcom/squareup/wire/Message;", "", Card.Icon.ORDER, "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayload;", "ref_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayload;Ljava/lang/String;Lokio/ByteString;)V", "getOrder", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayload;", "getRef_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SubmitOrderEvent extends Message {

    @JvmField
    public static final ProtoAdapter<SubmitOrderEvent> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.OrderPayload#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OrderPayload order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ref_id;

    public SubmitOrderEvent() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8674newBuilder();
    }

    public final OrderPayload getOrder() {
        return this.order;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public /* synthetic */ SubmitOrderEvent(OrderPayload orderPayload, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderPayload, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitOrderEvent(OrderPayload orderPayload, String ref_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order = orderPayload;
        this.ref_id = ref_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8674newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubmitOrderEvent)) {
            return false;
        }
        SubmitOrderEvent submitOrderEvent = (SubmitOrderEvent) other;
        return Intrinsics.areEqual(unknownFields(), submitOrderEvent.unknownFields()) && Intrinsics.areEqual(this.order, submitOrderEvent.order) && Intrinsics.areEqual(this.ref_id, submitOrderEvent.ref_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        OrderPayload orderPayload = this.order;
        int iHashCode2 = ((iHashCode + (orderPayload != null ? orderPayload.hashCode() : 0)) * 37) + this.ref_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        OrderPayload orderPayload = this.order;
        if (orderPayload != null) {
            arrayList.add("order=" + orderPayload);
        }
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitOrderEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubmitOrderEvent copy$default(SubmitOrderEvent submitOrderEvent, OrderPayload orderPayload, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            orderPayload = submitOrderEvent.order;
        }
        if ((i & 2) != 0) {
            str = submitOrderEvent.ref_id;
        }
        if ((i & 4) != 0) {
            byteString = submitOrderEvent.unknownFields();
        }
        return submitOrderEvent.copy(orderPayload, str, byteString);
    }

    public final SubmitOrderEvent copy(OrderPayload order, String ref_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubmitOrderEvent(order, ref_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubmitOrderEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubmitOrderEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SubmitOrderEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubmitOrderEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder() != null) {
                    size += OrderPayload.ADAPTER.encodedSizeWithTag(1, value.getOrder());
                }
                return !Intrinsics.areEqual(value.getRef_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRef_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubmitOrderEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder() != null) {
                    OrderPayload.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRef_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubmitOrderEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRef_id());
                }
                if (value.getOrder() != null) {
                    OrderPayload.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubmitOrderEvent redact(SubmitOrderEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OrderPayload order = value.getOrder();
                return SubmitOrderEvent.copy$default(value, order != null ? OrderPayload.ADAPTER.redact(order) : null, null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubmitOrderEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                OrderPayload orderPayloadDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SubmitOrderEvent(orderPayloadDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        orderPayloadDecode = OrderPayload.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
