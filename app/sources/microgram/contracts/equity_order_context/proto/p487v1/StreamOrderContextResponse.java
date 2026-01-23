package microgram.contracts.equity_order_context.proto.p487v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Money;
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

/* compiled from: StreamOrderContextResponse.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010(\u001a\u00020\u0002H\u0017J\u0013\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016Jz\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u00061"}, m3636d2 = {"Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;", "Lcom/squareup/wire/Message;", "", "ref_id", "", "rhs_account_number", "instrument_id", "order_type", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;", "order_side", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderSide;", "order_trigger", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderTrigger;", "trailing_peg", "Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPeg;", "is_preset_percent_limit", "", "limit_price", "Lcom/robinhood/rosetta/common/Money;", "stop_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;Lmicrogram/contracts/equity_order_context/proto/v1/OrderSide;Lmicrogram/contracts/equity_order_context/proto/v1/OrderTrigger;Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPeg;ZLcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getRef_id", "()Ljava/lang/String;", "getRhs_account_number", "getInstrument_id", "getOrder_type", "()Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;", "getOrder_side", "()Lmicrogram/contracts/equity_order_context/proto/v1/OrderSide;", "getOrder_trigger", "()Lmicrogram/contracts/equity_order_context/proto/v1/OrderTrigger;", "getTrailing_peg", "()Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPeg;", "()Z", "getLimit_price", "()Lcom/robinhood/rosetta/common/Money;", "getStop_price", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_order_context.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class StreamOrderContextResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamOrderContextResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPresetPercentLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean is_preset_percent_limit;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "limitPrice", schemaIndex = 8, tag = 9)
    private final Money limit_price;

    @WireField(adapter = "microgram.contracts.equity_order_context.proto.v1.OrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final OrderSide order_side;

    @WireField(adapter = "microgram.contracts.equity_order_context.proto.v1.OrderTrigger#ADAPTER", jsonName = "orderTrigger", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final OrderTrigger order_trigger;

    @WireField(adapter = "microgram.contracts.equity_order_context.proto.v1.OrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final OrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String rhs_account_number;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "stopPrice", schemaIndex = 9, tag = 10)
    private final Money stop_price;

    @WireField(adapter = "microgram.contracts.equity_order_context.proto.v1.TrailingPeg#ADAPTER", jsonName = "trailingPeg", schemaIndex = 6, tag = 7)
    private final TrailingPeg trailing_peg;

    public StreamOrderContextResponse() {
        this(null, null, null, null, null, null, null, false, null, null, null, 2047, null);
    }

    public /* synthetic */ StreamOrderContextResponse(String str, String str2, String str3, OrderType orderType, OrderSide orderSide, OrderTrigger orderTrigger, TrailingPeg trailingPeg, boolean z, Money money, Money money2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? OrderType.ORDER_KIND_UNSPECIFIED : orderType, (i & 16) != 0 ? OrderSide.ORDER_SIDE_UNSPECIFIED : orderSide, (i & 32) != 0 ? OrderTrigger.ORDER_TRIGGER_UNSPECIFIED : orderTrigger, (i & 64) != 0 ? null : trailingPeg, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : money, (i & 512) != 0 ? null : money2, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29070newBuilder();
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    public final OrderSide getOrder_side() {
        return this.order_side;
    }

    public final OrderTrigger getOrder_trigger() {
        return this.order_trigger;
    }

    public final TrailingPeg getTrailing_peg() {
        return this.trailing_peg;
    }

    /* renamed from: is_preset_percent_limit, reason: from getter */
    public final boolean getIs_preset_percent_limit() {
        return this.is_preset_percent_limit;
    }

    public final Money getLimit_price() {
        return this.limit_price;
    }

    public final Money getStop_price() {
        return this.stop_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamOrderContextResponse(String ref_id, String rhs_account_number, String instrument_id, OrderType order_type, OrderSide order_side, OrderTrigger order_trigger, TrailingPeg trailingPeg, boolean z, Money money, Money money2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ref_id = ref_id;
        this.rhs_account_number = rhs_account_number;
        this.instrument_id = instrument_id;
        this.order_type = order_type;
        this.order_side = order_side;
        this.order_trigger = order_trigger;
        this.trailing_peg = trailingPeg;
        this.is_preset_percent_limit = z;
        this.limit_price = money;
        this.stop_price = money2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29070newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamOrderContextResponse)) {
            return false;
        }
        StreamOrderContextResponse streamOrderContextResponse = (StreamOrderContextResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamOrderContextResponse.unknownFields()) && Intrinsics.areEqual(this.ref_id, streamOrderContextResponse.ref_id) && Intrinsics.areEqual(this.rhs_account_number, streamOrderContextResponse.rhs_account_number) && Intrinsics.areEqual(this.instrument_id, streamOrderContextResponse.instrument_id) && this.order_type == streamOrderContextResponse.order_type && this.order_side == streamOrderContextResponse.order_side && this.order_trigger == streamOrderContextResponse.order_trigger && Intrinsics.areEqual(this.trailing_peg, streamOrderContextResponse.trailing_peg) && this.is_preset_percent_limit == streamOrderContextResponse.is_preset_percent_limit && Intrinsics.areEqual(this.limit_price, streamOrderContextResponse.limit_price) && Intrinsics.areEqual(this.stop_price, streamOrderContextResponse.stop_price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.ref_id.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.order_type.hashCode()) * 37) + this.order_side.hashCode()) * 37) + this.order_trigger.hashCode()) * 37;
        TrailingPeg trailingPeg = this.trailing_peg;
        int iHashCode2 = (((iHashCode + (trailingPeg != null ? trailingPeg.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_preset_percent_limit)) * 37;
        Money money = this.limit_price;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.stop_price;
        int iHashCode4 = iHashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("order_type=" + this.order_type);
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("order_trigger=" + this.order_trigger);
        TrailingPeg trailingPeg = this.trailing_peg;
        if (trailingPeg != null) {
            arrayList.add("trailing_peg=" + trailingPeg);
        }
        arrayList.add("is_preset_percent_limit=" + this.is_preset_percent_limit);
        Money money = this.limit_price;
        if (money != null) {
            arrayList.add("limit_price=" + money);
        }
        Money money2 = this.stop_price;
        if (money2 != null) {
            arrayList.add("stop_price=" + money2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamOrderContextResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamOrderContextResponse copy$default(StreamOrderContextResponse streamOrderContextResponse, String str, String str2, String str3, OrderType orderType, OrderSide orderSide, OrderTrigger orderTrigger, TrailingPeg trailingPeg, boolean z, Money money, Money money2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamOrderContextResponse.ref_id;
        }
        if ((i & 2) != 0) {
            str2 = streamOrderContextResponse.rhs_account_number;
        }
        if ((i & 4) != 0) {
            str3 = streamOrderContextResponse.instrument_id;
        }
        if ((i & 8) != 0) {
            orderType = streamOrderContextResponse.order_type;
        }
        if ((i & 16) != 0) {
            orderSide = streamOrderContextResponse.order_side;
        }
        if ((i & 32) != 0) {
            orderTrigger = streamOrderContextResponse.order_trigger;
        }
        if ((i & 64) != 0) {
            trailingPeg = streamOrderContextResponse.trailing_peg;
        }
        if ((i & 128) != 0) {
            z = streamOrderContextResponse.is_preset_percent_limit;
        }
        if ((i & 256) != 0) {
            money = streamOrderContextResponse.limit_price;
        }
        if ((i & 512) != 0) {
            money2 = streamOrderContextResponse.stop_price;
        }
        if ((i & 1024) != 0) {
            byteString = streamOrderContextResponse.unknownFields();
        }
        Money money3 = money2;
        ByteString byteString2 = byteString;
        boolean z2 = z;
        Money money4 = money;
        OrderTrigger orderTrigger2 = orderTrigger;
        TrailingPeg trailingPeg2 = trailingPeg;
        OrderSide orderSide2 = orderSide;
        String str4 = str3;
        return streamOrderContextResponse.copy(str, str2, str4, orderType, orderSide2, orderTrigger2, trailingPeg2, z2, money4, money3, byteString2);
    }

    public final StreamOrderContextResponse copy(String ref_id, String rhs_account_number, String instrument_id, OrderType order_type, OrderSide order_side, OrderTrigger order_trigger, TrailingPeg trailing_peg, boolean is_preset_percent_limit, Money limit_price, Money stop_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamOrderContextResponse(ref_id, rhs_account_number, instrument_id, order_type, order_side, order_trigger, trailing_peg, is_preset_percent_limit, limit_price, stop_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamOrderContextResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamOrderContextResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.equity_order_context.proto.v1.StreamOrderContextResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamOrderContextResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstrument_id());
                }
                if (value.getOrder_type() != OrderType.ORDER_KIND_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(4, value.getOrder_type());
                }
                if (value.getOrder_side() != OrderSide.ORDER_SIDE_UNSPECIFIED) {
                    size += OrderSide.ADAPTER.encodedSizeWithTag(5, value.getOrder_side());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    size += OrderTrigger.ADAPTER.encodedSizeWithTag(6, value.getOrder_trigger());
                }
                int iEncodedSizeWithTag = size + TrailingPeg.ADAPTER.encodedSizeWithTag(7, value.getTrailing_peg());
                if (value.getIs_preset_percent_limit()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_preset_percent_limit()));
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(9, value.getLimit_price()) + protoAdapter.encodedSizeWithTag(10, value.getStop_price());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamOrderContextResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (value.getOrder_type() != OrderType.ORDER_KIND_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_type());
                }
                if (value.getOrder_side() != OrderSide.ORDER_SIDE_UNSPECIFIED) {
                    OrderSide.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_side());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_trigger());
                }
                TrailingPeg.ADAPTER.encodeWithTag(writer, 7, (int) value.getTrailing_peg());
                if (value.getIs_preset_percent_limit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_preset_percent_limit()));
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getStop_price());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamOrderContextResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getLimit_price());
                if (value.getIs_preset_percent_limit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_preset_percent_limit()));
                }
                TrailingPeg.ADAPTER.encodeWithTag(writer, 7, (int) value.getTrailing_peg());
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_trigger());
                }
                if (value.getOrder_side() != OrderSide.ORDER_SIDE_UNSPECIFIED) {
                    OrderSide.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_side());
                }
                if (value.getOrder_type() != OrderType.ORDER_KIND_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                }
                if (Intrinsics.areEqual(value.getRef_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamOrderContextResponse decode(ProtoReader reader) throws IOException {
                OrderType orderType;
                OrderSide orderSide;
                OrderTrigger orderTrigger;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderType orderType2 = OrderType.ORDER_KIND_UNSPECIFIED;
                OrderSide orderSide2 = OrderSide.ORDER_SIDE_UNSPECIFIED;
                OrderTrigger orderTrigger2 = OrderTrigger.ORDER_TRIGGER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                TrailingPeg trailingPegDecode = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                boolean zBooleanValue = false;
                OrderTrigger orderTriggerDecode = orderTrigger2;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                OrderSide orderSideDecode = orderSide2;
                OrderType orderTypeDecode = orderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                orderSide = orderSideDecode;
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                orderSideDecode = orderSide;
                                break;
                            case 3:
                                orderSide = orderSideDecode;
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                orderSideDecode = orderSide;
                                break;
                            case 4:
                                orderType = orderTypeDecode;
                                orderSide = orderSideDecode;
                                orderTrigger = orderTriggerDecode;
                                str = strDecode2;
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                    strDecode2 = str;
                                    orderTriggerDecode = orderTrigger;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                orderSideDecode = orderSide;
                                break;
                            case 5:
                                orderType = orderTypeDecode;
                                orderSide = orderSideDecode;
                                try {
                                    orderSideDecode = OrderSide.ADAPTER.decode(reader);
                                    orderTypeDecode = orderType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    orderTrigger = orderTriggerDecode;
                                    str = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 6:
                                try {
                                    orderTriggerDecode = OrderTrigger.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    orderType = orderTypeDecode;
                                    orderSide = orderSideDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 7:
                                trailingPegDecode = TrailingPeg.ADAPTER.decode(reader);
                                break;
                            case 8:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 9:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 10:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                orderType = orderTypeDecode;
                                orderSide = orderSideDecode;
                                orderTrigger = orderTriggerDecode;
                                str = strDecode2;
                                strDecode2 = str;
                                orderTriggerDecode = orderTrigger;
                                orderTypeDecode = orderType;
                                orderSideDecode = orderSide;
                                break;
                        }
                    } else {
                        return new StreamOrderContextResponse(strDecode2, strDecode3, strDecode, orderTypeDecode, orderSideDecode, orderTriggerDecode, trailingPegDecode, zBooleanValue, moneyDecode, moneyDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamOrderContextResponse redact(StreamOrderContextResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TrailingPeg trailing_peg = value.getTrailing_peg();
                TrailingPeg trailingPegRedact = trailing_peg != null ? TrailingPeg.ADAPTER.redact(trailing_peg) : null;
                Money limit_price = value.getLimit_price();
                Money moneyRedact = limit_price != null ? Money.ADAPTER.redact(limit_price) : null;
                Money stop_price = value.getStop_price();
                return StreamOrderContextResponse.copy$default(value, null, null, null, null, null, null, trailingPegRedact, false, moneyRedact, stop_price != null ? Money.ADAPTER.redact(stop_price) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
            }
        };
    }
}
