package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.OrderType;

/* compiled from: TentativeFuturesOrderRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B[\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016JZ\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequest;", "Lcom/squareup/wire/Message;", "", "legs", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequest;", "quantity", "", "order_type", "Lrosetta/mainst/OrderType;", "limit_price", "stop_price", "quote_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lrosetta/mainst/OrderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getQuantity", "()Ljava/lang/String;", "getOrder_type", "()Lrosetta/mainst/OrderType;", "getLimit_price", "getStop_price", "getQuote_id", "getLegs", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class TentativeFuturesOrderRequest extends Message {

    @JvmField
    public static final ProtoAdapter<TentativeFuturesOrderRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesOrderLegRequest#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<FuturesOrderLegRequest> legs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 3, tag = 4)
    private final String limit_price;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", jsonName = "orderType", schemaIndex = 2, tag = 3)
    private final OrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteId", schemaIndex = 5, tag = 6)
    private final String quote_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 4, tag = 5)
    private final String stop_price;

    public TentativeFuturesOrderRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20424newBuilder();
    }

    public /* synthetic */ TentativeFuturesOrderRequest(List list, String str, OrderType orderType, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : orderType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    public final String getLimit_price() {
        return this.limit_price;
    }

    public final String getStop_price() {
        return this.stop_price;
    }

    public final String getQuote_id() {
        return this.quote_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TentativeFuturesOrderRequest(List<FuturesOrderLegRequest> legs, String quantity, OrderType orderType, String str, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.quantity = quantity;
        this.order_type = orderType;
        this.limit_price = str;
        this.stop_price = str2;
        this.quote_id = str3;
        this.legs = Internal.immutableCopyOf("legs", legs);
    }

    public final List<FuturesOrderLegRequest> getLegs() {
        return this.legs;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20424newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TentativeFuturesOrderRequest)) {
            return false;
        }
        TentativeFuturesOrderRequest tentativeFuturesOrderRequest = (TentativeFuturesOrderRequest) other;
        return Intrinsics.areEqual(unknownFields(), tentativeFuturesOrderRequest.unknownFields()) && Intrinsics.areEqual(this.legs, tentativeFuturesOrderRequest.legs) && Intrinsics.areEqual(this.quantity, tentativeFuturesOrderRequest.quantity) && this.order_type == tentativeFuturesOrderRequest.order_type && Intrinsics.areEqual(this.limit_price, tentativeFuturesOrderRequest.limit_price) && Intrinsics.areEqual(this.stop_price, tentativeFuturesOrderRequest.stop_price) && Intrinsics.areEqual(this.quote_id, tentativeFuturesOrderRequest.quote_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.legs.hashCode()) * 37) + this.quantity.hashCode()) * 37;
        OrderType orderType = this.order_type;
        int iHashCode2 = (iHashCode + (orderType != null ? orderType.hashCode() : 0)) * 37;
        String str = this.limit_price;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.stop_price;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.quote_id;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.legs.isEmpty()) {
            arrayList.add("legs=" + this.legs);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        OrderType orderType = this.order_type;
        if (orderType != null) {
            arrayList.add("order_type=" + orderType);
        }
        String str = this.limit_price;
        if (str != null) {
            arrayList.add("limit_price=" + Internal.sanitize(str));
        }
        String str2 = this.stop_price;
        if (str2 != null) {
            arrayList.add("stop_price=" + Internal.sanitize(str2));
        }
        String str3 = this.quote_id;
        if (str3 != null) {
            arrayList.add("quote_id=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TentativeFuturesOrderRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TentativeFuturesOrderRequest copy$default(TentativeFuturesOrderRequest tentativeFuturesOrderRequest, List list, String str, OrderType orderType, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tentativeFuturesOrderRequest.legs;
        }
        if ((i & 2) != 0) {
            str = tentativeFuturesOrderRequest.quantity;
        }
        if ((i & 4) != 0) {
            orderType = tentativeFuturesOrderRequest.order_type;
        }
        if ((i & 8) != 0) {
            str2 = tentativeFuturesOrderRequest.limit_price;
        }
        if ((i & 16) != 0) {
            str3 = tentativeFuturesOrderRequest.stop_price;
        }
        if ((i & 32) != 0) {
            str4 = tentativeFuturesOrderRequest.quote_id;
        }
        if ((i & 64) != 0) {
            byteString = tentativeFuturesOrderRequest.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        OrderType orderType2 = orderType;
        return tentativeFuturesOrderRequest.copy(list, str, orderType2, str2, str6, str5, byteString2);
    }

    public final TentativeFuturesOrderRequest copy(List<FuturesOrderLegRequest> legs, String quantity, OrderType order_type, String limit_price, String stop_price, String quote_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TentativeFuturesOrderRequest(legs, quantity, order_type, limit_price, stop_price, quote_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TentativeFuturesOrderRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TentativeFuturesOrderRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.TentativeFuturesOrderRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TentativeFuturesOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + FuturesOrderLegRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getLegs());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getQuantity());
                }
                int iEncodedSizeWithTag = size + OrderType.ADAPTER.encodedSizeWithTag(3, value.getOrder_type());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getLimit_price()) + protoAdapter.encodedSizeWithTag(5, value.getStop_price()) + protoAdapter.encodedSizeWithTag(6, value.getQuote_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TentativeFuturesOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesOrderLegRequest.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLegs());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuantity());
                }
                OrderType.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_type());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getQuote_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TentativeFuturesOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getQuote_id());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLimit_price());
                OrderType.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_type());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getQuantity());
                }
                FuturesOrderLegRequest.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLegs());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TentativeFuturesOrderRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                OrderType orderTypeDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    arrayList.add(FuturesOrderLegRequest.ADAPTER.decode(reader));
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    try {
                                        orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 4:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new TentativeFuturesOrderRequest(arrayList, str, orderTypeDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TentativeFuturesOrderRequest redact(TentativeFuturesOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TentativeFuturesOrderRequest.copy$default(value, Internal.m26823redactElements(value.getLegs(), FuturesOrderLegRequest.ADAPTER), null, null, null, null, null, ByteString.EMPTY, 62, null);
            }
        };
    }
}
