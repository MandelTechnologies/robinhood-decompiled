package com.robinhood.ceres.p284v1;

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

/* compiled from: CancelFuturesOrderEvent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CancelFuturesOrderEvent;", "Lcom/squareup/wire/Message;", "", "order_id", "", "account_id", "cancel_reason", "Lcom/robinhood/ceres/v1/OrderCancelReason;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderCancelReason;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getAccount_id", "getCancel_reason", "()Lcom/robinhood/ceres/v1/OrderCancelReason;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CancelFuturesOrderEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CancelFuturesOrderEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderCancelReason#ADAPTER", jsonName = "cancelReason", schemaIndex = 2, tag = 3)
    private final OrderCancelReason cancel_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    public CancelFuturesOrderEvent() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ CancelFuturesOrderEvent(String str, String str2, OrderCancelReason orderCancelReason, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : orderCancelReason, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20265newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final OrderCancelReason getCancel_reason() {
        return this.cancel_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelFuturesOrderEvent(String order_id, String account_id, OrderCancelReason orderCancelReason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.account_id = account_id;
        this.cancel_reason = orderCancelReason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20265newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CancelFuturesOrderEvent)) {
            return false;
        }
        CancelFuturesOrderEvent cancelFuturesOrderEvent = (CancelFuturesOrderEvent) other;
        return Intrinsics.areEqual(unknownFields(), cancelFuturesOrderEvent.unknownFields()) && Intrinsics.areEqual(this.order_id, cancelFuturesOrderEvent.order_id) && Intrinsics.areEqual(this.account_id, cancelFuturesOrderEvent.account_id) && this.cancel_reason == cancelFuturesOrderEvent.cancel_reason;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + this.account_id.hashCode()) * 37;
        OrderCancelReason orderCancelReason = this.cancel_reason;
        int iHashCode2 = iHashCode + (orderCancelReason != null ? orderCancelReason.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        OrderCancelReason orderCancelReason = this.cancel_reason;
        if (orderCancelReason != null) {
            arrayList.add("cancel_reason=" + orderCancelReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelFuturesOrderEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CancelFuturesOrderEvent copy$default(CancelFuturesOrderEvent cancelFuturesOrderEvent, String str, String str2, OrderCancelReason orderCancelReason, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelFuturesOrderEvent.order_id;
        }
        if ((i & 2) != 0) {
            str2 = cancelFuturesOrderEvent.account_id;
        }
        if ((i & 4) != 0) {
            orderCancelReason = cancelFuturesOrderEvent.cancel_reason;
        }
        if ((i & 8) != 0) {
            byteString = cancelFuturesOrderEvent.unknownFields();
        }
        return cancelFuturesOrderEvent.copy(str, str2, orderCancelReason, byteString);
    }

    public final CancelFuturesOrderEvent copy(String order_id, String account_id, OrderCancelReason cancel_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CancelFuturesOrderEvent(order_id, account_id, cancel_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CancelFuturesOrderEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CancelFuturesOrderEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CancelFuturesOrderEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CancelFuturesOrderEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                return size + OrderCancelReason.ADAPTER.encodedSizeWithTag(3, value.getCancel_reason());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CancelFuturesOrderEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                OrderCancelReason.ADAPTER.encodeWithTag(writer, 3, (int) value.getCancel_reason());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CancelFuturesOrderEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OrderCancelReason.ADAPTER.encodeWithTag(writer, 3, (int) value.getCancel_reason());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CancelFuturesOrderEvent redact(CancelFuturesOrderEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CancelFuturesOrderEvent.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CancelFuturesOrderEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                OrderCancelReason orderCancelReasonDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CancelFuturesOrderEvent(strDecode, strDecode2, orderCancelReasonDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            orderCancelReasonDecode = OrderCancelReason.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
