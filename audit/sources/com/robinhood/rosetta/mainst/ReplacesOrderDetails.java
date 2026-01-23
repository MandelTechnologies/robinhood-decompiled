package com.robinhood.rosetta.mainst;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.OrderState;

/* compiled from: ReplacesOrderDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J<\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ReplacesOrderDetails;", "Lcom/squareup/wire/Message;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUID;", "state", "Lrosetta/mainst/OrderState;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/Decimal;", "version", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/OrderState;Lcom/robinhood/rosetta/mainst/Decimal;ILokio/ByteString;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getState", "()Lrosetta/mainst/OrderState;", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getVersion", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ReplacesOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ReplacesOrderDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "cancelledQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Decimal cancelled_quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID order_id;

    @WireField(adapter = "rosetta.mainst.OrderState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int version;

    public ReplacesOrderDetails() {
        this(null, null, null, 0, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24702newBuilder();
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final OrderState getState() {
        return this.state;
    }

    public /* synthetic */ ReplacesOrderDetails(UUID uuid, OrderState orderState, Decimal decimal, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uuid, (i2 & 2) != 0 ? OrderState.ORDER_STATE_UNSPECIFIED : orderState, (i2 & 4) != 0 ? null : decimal, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Decimal getCancelled_quantity() {
        return this.cancelled_quantity;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplacesOrderDetails(UUID uuid, OrderState state, Decimal decimal, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = uuid;
        this.state = state;
        this.cancelled_quantity = decimal;
        this.version = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24702newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReplacesOrderDetails)) {
            return false;
        }
        ReplacesOrderDetails replacesOrderDetails = (ReplacesOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), replacesOrderDetails.unknownFields()) && Intrinsics.areEqual(this.order_id, replacesOrderDetails.order_id) && this.state == replacesOrderDetails.state && Intrinsics.areEqual(this.cancelled_quantity, replacesOrderDetails.cancelled_quantity) && this.version == replacesOrderDetails.version;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.order_id;
        int iHashCode2 = (((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37) + this.state.hashCode()) * 37;
        Decimal decimal = this.cancelled_quantity;
        int iHashCode3 = ((iHashCode2 + (decimal != null ? decimal.hashCode() : 0)) * 37) + Integer.hashCode(this.version);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.order_id;
        if (uuid != null) {
            arrayList.add("order_id=" + uuid);
        }
        arrayList.add("state=" + this.state);
        Decimal decimal = this.cancelled_quantity;
        if (decimal != null) {
            arrayList.add("cancelled_quantity=" + decimal);
        }
        arrayList.add("version=" + this.version);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReplacesOrderDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReplacesOrderDetails copy$default(ReplacesOrderDetails replacesOrderDetails, UUID uuid, OrderState orderState, Decimal decimal, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = replacesOrderDetails.order_id;
        }
        if ((i2 & 2) != 0) {
            orderState = replacesOrderDetails.state;
        }
        if ((i2 & 4) != 0) {
            decimal = replacesOrderDetails.cancelled_quantity;
        }
        if ((i2 & 8) != 0) {
            i = replacesOrderDetails.version;
        }
        if ((i2 & 16) != 0) {
            byteString = replacesOrderDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        Decimal decimal2 = decimal;
        return replacesOrderDetails.copy(uuid, orderState, decimal2, i, byteString2);
    }

    public final ReplacesOrderDetails copy(UUID order_id, OrderState state, Decimal cancelled_quantity, int version, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReplacesOrderDetails(order_id, state, cancelled_quantity, version, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReplacesOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReplacesOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.ReplacesOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReplacesOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    size += OrderState.ADAPTER.encodedSizeWithTag(2, value.getState());
                }
                if (value.getCancelled_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(3, value.getCancelled_quantity());
                }
                return value.getVersion() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getVersion())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReplacesOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getCancelled_quantity());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getVersion()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReplacesOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getVersion()));
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getCancelled_quantity());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReplacesOrderDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderState orderState = OrderState.ORDER_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Decimal decimalDecode = null;
                int iIntValue = 0;
                OrderState orderStateDecode = orderState;
                UUID uuidDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReplacesOrderDetails(uuidDecode, orderStateDecode, decimalDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uuidDecode = UUID.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            orderStateDecode = OrderState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        decimalDecode = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReplacesOrderDetails redact(ReplacesOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID order_id = value.getOrder_id();
                UUID uuidRedact = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                Decimal cancelled_quantity = value.getCancelled_quantity();
                return ReplacesOrderDetails.copy$default(value, uuidRedact, null, cancelled_quantity != null ? Decimal.ADAPTER.redact(cancelled_quantity) : null, 0, ByteString.EMPTY, 10, null);
            }
        };
    }
}
