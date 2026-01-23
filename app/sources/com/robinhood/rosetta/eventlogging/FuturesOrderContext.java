package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.FuturesOrderContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FuturesOrderContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b\u001e\u001f !\"#$%B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "order_id", "order_side", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "order_request_context", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderRequestContext;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderRequestContext;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getOrder_id", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "getOrder_request_context", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderRequestContext;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OrderSide", "OrderTrigger", "TimeInForce", "ContractType", "OrderType", "OrderLeg", "OrderRequestContext", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class FuturesOrderContext extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesOrderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderRequestContext#ADAPTER", jsonName = "orderRequestContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final OrderRequestContext order_request_context;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OrderSide order_side;

    public FuturesOrderContext() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ FuturesOrderContext(String str, String str2, OrderSide orderSide, OrderRequestContext orderRequestContext, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OrderSide.SIDE_UNSPECIFIED : orderSide, (i & 8) != 0 ? null : orderRequestContext, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24279newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final OrderSide getOrder_side() {
        return this.order_side;
    }

    public final OrderRequestContext getOrder_request_context() {
        return this.order_request_context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderContext(String contract_id, String order_id, OrderSide order_side, OrderRequestContext orderRequestContext, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.order_id = order_id;
        this.order_side = order_side;
        this.order_request_context = orderRequestContext;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24279newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesOrderContext)) {
            return false;
        }
        FuturesOrderContext futuresOrderContext = (FuturesOrderContext) other;
        return Intrinsics.areEqual(unknownFields(), futuresOrderContext.unknownFields()) && Intrinsics.areEqual(this.contract_id, futuresOrderContext.contract_id) && Intrinsics.areEqual(this.order_id, futuresOrderContext.order_id) && this.order_side == futuresOrderContext.order_side && Intrinsics.areEqual(this.order_request_context, futuresOrderContext.order_request_context);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.order_side.hashCode()) * 37;
        OrderRequestContext orderRequestContext = this.order_request_context;
        int iHashCode2 = iHashCode + (orderRequestContext != null ? orderRequestContext.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("order_side=" + this.order_side);
        OrderRequestContext orderRequestContext = this.order_request_context;
        if (orderRequestContext != null) {
            arrayList.add("order_request_context=" + orderRequestContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesOrderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesOrderContext copy$default(FuturesOrderContext futuresOrderContext, String str, String str2, OrderSide orderSide, OrderRequestContext orderRequestContext, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresOrderContext.contract_id;
        }
        if ((i & 2) != 0) {
            str2 = futuresOrderContext.order_id;
        }
        if ((i & 4) != 0) {
            orderSide = futuresOrderContext.order_side;
        }
        if ((i & 8) != 0) {
            orderRequestContext = futuresOrderContext.order_request_context;
        }
        if ((i & 16) != 0) {
            byteString = futuresOrderContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        OrderSide orderSide2 = orderSide;
        return futuresOrderContext.copy(str, str2, orderSide2, orderRequestContext, byteString2);
    }

    public final FuturesOrderContext copy(String contract_id, String order_id, OrderSide order_side, OrderRequestContext order_request_context, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesOrderContext(contract_id, order_id, order_side, order_request_context, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesOrderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesOrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (value.getOrder_side() != FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED) {
                    size += FuturesOrderContext.OrderSide.ADAPTER.encodedSizeWithTag(3, value.getOrder_side());
                }
                return value.getOrder_request_context() != null ? size + FuturesOrderContext.OrderRequestContext.ADAPTER.encodedSizeWithTag(4, value.getOrder_request_context()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (value.getOrder_side() != FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED) {
                    FuturesOrderContext.OrderSide.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_side());
                }
                if (value.getOrder_request_context() != null) {
                    FuturesOrderContext.OrderRequestContext.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_request_context());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_request_context() != null) {
                    FuturesOrderContext.OrderRequestContext.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_request_context());
                }
                if (value.getOrder_side() != FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED) {
                    FuturesOrderContext.OrderSide.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesOrderContext.OrderSide orderSide = FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                FuturesOrderContext.OrderRequestContext orderRequestContextDecode = null;
                FuturesOrderContext.OrderSide orderSideDecode = orderSide;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesOrderContext(strDecode2, strDecode, orderSideDecode, orderRequestContextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            orderSideDecode = FuturesOrderContext.OrderSide.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        orderRequestContextDecode = FuturesOrderContext.OrderRequestContext.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderContext redact(FuturesOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesOrderContext.OrderRequestContext order_request_context = value.getOrder_request_context();
                return FuturesOrderContext.copy$default(value, null, null, null, order_request_context != null ? FuturesOrderContext.OrderRequestContext.ADAPTER.redact(order_request_context) : null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIDE_UNSPECIFIED", "BUY", "SELL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderSide implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderSide[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderSide> ADAPTER;
        public static final OrderSide BUY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderSide SELL;
        public static final OrderSide SIDE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OrderSide[] $values() {
            return new OrderSide[]{SIDE_UNSPECIFIED, BUY, SELL};
        }

        @JvmStatic
        public static final OrderSide fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderSide> getEntries() {
            return $ENTRIES;
        }

        private OrderSide(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderSide orderSide = new OrderSide("SIDE_UNSPECIFIED", 0, 0);
            SIDE_UNSPECIFIED = orderSide;
            BUY = new OrderSide("BUY", 1, 1);
            SELL = new OrderSide("SELL", 2, 2);
            OrderSide[] orderSideArr$values = $values();
            $VALUES = orderSideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderSideArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSide.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderSide>(orCreateKotlinClass, syntax, orderSide) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderSide$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesOrderContext.OrderSide fromValue(int value) {
                    return FuturesOrderContext.OrderSide.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderSide fromValue(int value) {
                if (value == 0) {
                    return OrderSide.SIDE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderSide.BUY;
                }
                if (value != 2) {
                    return null;
                }
                return OrderSide.SELL;
            }
        }

        public static OrderSide valueOf(String str) {
            return (OrderSide) Enum.valueOf(OrderSide.class, str);
        }

        public static OrderSide[] values() {
            return (OrderSide[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRIGGER_UNSPECIFIED", "IMMEDIATE", "STOP", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderTrigger implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderTrigger[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderTrigger> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderTrigger IMMEDIATE;
        public static final OrderTrigger STOP;
        public static final OrderTrigger TRIGGER_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OrderTrigger[] $values() {
            return new OrderTrigger[]{TRIGGER_UNSPECIFIED, IMMEDIATE, STOP};
        }

        @JvmStatic
        public static final OrderTrigger fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderTrigger> getEntries() {
            return $ENTRIES;
        }

        private OrderTrigger(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderTrigger orderTrigger = new OrderTrigger("TRIGGER_UNSPECIFIED", 0, 0);
            TRIGGER_UNSPECIFIED = orderTrigger;
            IMMEDIATE = new OrderTrigger("IMMEDIATE", 1, 1);
            STOP = new OrderTrigger("STOP", 2, 3);
            OrderTrigger[] orderTriggerArr$values = $values();
            $VALUES = orderTriggerArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTriggerArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderTrigger.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderTrigger>(orCreateKotlinClass, syntax, orderTrigger) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderTrigger$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesOrderContext.OrderTrigger fromValue(int value) {
                    return FuturesOrderContext.OrderTrigger.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderTrigger fromValue(int value) {
                if (value == 0) {
                    return OrderTrigger.TRIGGER_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderTrigger.IMMEDIATE;
                }
                if (value != 3) {
                    return null;
                }
                return OrderTrigger.STOP;
            }
        }

        public static OrderTrigger valueOf(String str) {
            return (OrderTrigger) Enum.valueOf(OrderTrigger.class, str);
        }

        public static OrderTrigger[] values() {
            return (OrderTrigger[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TIME_IN_FORCE_UNSPECIFIED", "GFD", "GTC", "IOC", "GTD", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TimeInForce implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TimeInForce[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TimeInForce> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TimeInForce GFD;
        public static final TimeInForce GTC;
        public static final TimeInForce GTD;
        public static final TimeInForce IOC;
        public static final TimeInForce TIME_IN_FORCE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TimeInForce[] $values() {
            return new TimeInForce[]{TIME_IN_FORCE_UNSPECIFIED, GFD, GTC, IOC, GTD};
        }

        @JvmStatic
        public static final TimeInForce fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TimeInForce> getEntries() {
            return $ENTRIES;
        }

        private TimeInForce(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TimeInForce timeInForce = new TimeInForce("TIME_IN_FORCE_UNSPECIFIED", 0, 0);
            TIME_IN_FORCE_UNSPECIFIED = timeInForce;
            GFD = new TimeInForce("GFD", 1, 1);
            GTC = new TimeInForce("GTC", 2, 2);
            IOC = new TimeInForce("IOC", 3, 3);
            GTD = new TimeInForce("GTD", 4, 4);
            TimeInForce[] timeInForceArr$values = $values();
            $VALUES = timeInForceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(timeInForceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimeInForce.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TimeInForce>(orCreateKotlinClass, syntax, timeInForce) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContext$TimeInForce$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesOrderContext.TimeInForce fromValue(int value) {
                    return FuturesOrderContext.TimeInForce.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TimeInForce fromValue(int value) {
                if (value == 0) {
                    return TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                }
                if (value == 1) {
                    return TimeInForce.GFD;
                }
                if (value == 2) {
                    return TimeInForce.GTC;
                }
                if (value == 3) {
                    return TimeInForce.IOC;
                }
                if (value != 4) {
                    return null;
                }
                return TimeInForce.GTD;
            }
        }

        public static TimeInForce valueOf(String str) {
            return (TimeInForce) Enum.valueOf(TimeInForce.class, str);
        }

        public static TimeInForce[] values() {
            return (TimeInForce[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTRACT_TYPE_UNSPECIFIED", "OUTRIGHTS", "OPTIONS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContractType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContractType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ContractType> ADAPTER;
        public static final ContractType CONTRACT_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ContractType OPTIONS;
        public static final ContractType OUTRIGHTS;
        private final int value;

        private static final /* synthetic */ ContractType[] $values() {
            return new ContractType[]{CONTRACT_TYPE_UNSPECIFIED, OUTRIGHTS, OPTIONS};
        }

        @JvmStatic
        public static final ContractType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ContractType> getEntries() {
            return $ENTRIES;
        }

        private ContractType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ContractType contractType = new ContractType("CONTRACT_TYPE_UNSPECIFIED", 0, 0);
            CONTRACT_TYPE_UNSPECIFIED = contractType;
            OUTRIGHTS = new ContractType("OUTRIGHTS", 1, 1);
            OPTIONS = new ContractType("OPTIONS", 2, 2);
            ContractType[] contractTypeArr$values = $values();
            $VALUES = contractTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contractTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ContractType>(orCreateKotlinClass, syntax, contractType) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContext$ContractType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesOrderContext.ContractType fromValue(int value) {
                    return FuturesOrderContext.ContractType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ContractType fromValue(int value) {
                if (value == 0) {
                    return ContractType.CONTRACT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return ContractType.OUTRIGHTS;
                }
                if (value != 2) {
                    return null;
                }
                return ContractType.OPTIONS;
            }
        }

        public static ContractType valueOf(String str) {
            return (ContractType) Enum.valueOf(ContractType.class, str);
        }

        public static ContractType[] values() {
            return (ContractType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_TYPE_UNSPECIFIED", "MARKET", "LIMIT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderType LIMIT;
        public static final OrderType MARKET;
        public static final OrderType ORDER_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OrderType[] $values() {
            return new OrderType[]{ORDER_TYPE_UNSPECIFIED, MARKET, LIMIT};
        }

        @JvmStatic
        public static final OrderType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderType> getEntries() {
            return $ENTRIES;
        }

        private OrderType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderType orderType = new OrderType("ORDER_TYPE_UNSPECIFIED", 0, 0);
            ORDER_TYPE_UNSPECIFIED = orderType;
            MARKET = new OrderType("MARKET", 1, 1);
            LIMIT = new OrderType("LIMIT", 2, 2);
            OrderType[] orderTypeArr$values = $values();
            $VALUES = orderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderType>(orCreateKotlinClass, syntax, orderType) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesOrderContext.OrderType fromValue(int value) {
                    return FuturesOrderContext.OrderType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderType fromValue(int value) {
                if (value == 0) {
                    return OrderType.ORDER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderType.MARKET;
                }
                if (value != 2) {
                    return null;
                }
                return OrderType.LIMIT;
            }
        }

        public static OrderType valueOf(String str) {
            return (OrderType) Enum.valueOf(OrderType.class, str);
        }

        public static OrderType[] values() {
            return (OrderType[]) $VALUES.clone();
        }
    }

    /* compiled from: FuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderLeg;", "Lcom/squareup/wire/Message;", "", "contract_type", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "contract_id", "", "ratio_quantity", "", "order_side", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;Lokio/ByteString;)V", "getContract_type", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "getContract_id", "()Ljava/lang/String;", "getRatio_quantity", "()I", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderLeg extends Message {

        @JvmField
        public static final ProtoAdapter<OrderLeg> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String contract_id;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderContext$ContractType#ADAPTER", jsonName = "contractType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final ContractType contract_type;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final OrderSide order_side;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ratioQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final int ratio_quantity;

        public OrderLeg() {
            this(null, null, 0, null, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24280newBuilder();
        }

        public final ContractType getContract_type() {
            return this.contract_type;
        }

        public /* synthetic */ OrderLeg(ContractType contractType, String str, int i, OrderSide orderSide, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ContractType.CONTRACT_TYPE_UNSPECIFIED : contractType, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? OrderSide.SIDE_UNSPECIFIED : orderSide, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        public final OrderSide getOrder_side() {
            return this.order_side;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderLeg(ContractType contract_type, String contract_id, int i, OrderSide order_side, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.contract_type = contract_type;
            this.contract_id = contract_id;
            this.ratio_quantity = i;
            this.order_side = order_side;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24280newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderLeg)) {
                return false;
            }
            OrderLeg orderLeg = (OrderLeg) other;
            return Intrinsics.areEqual(unknownFields(), orderLeg.unknownFields()) && this.contract_type == orderLeg.contract_type && Intrinsics.areEqual(this.contract_id, orderLeg.contract_id) && this.ratio_quantity == orderLeg.ratio_quantity && this.order_side == orderLeg.order_side;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + this.contract_type.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + Integer.hashCode(this.ratio_quantity)) * 37) + this.order_side.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("contract_type=" + this.contract_type);
            arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
            arrayList.add("ratio_quantity=" + this.ratio_quantity);
            arrayList.add("order_side=" + this.order_side);
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderLeg{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ OrderLeg copy$default(OrderLeg orderLeg, ContractType contractType, String str, int i, OrderSide orderSide, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                contractType = orderLeg.contract_type;
            }
            if ((i2 & 2) != 0) {
                str = orderLeg.contract_id;
            }
            if ((i2 & 4) != 0) {
                i = orderLeg.ratio_quantity;
            }
            if ((i2 & 8) != 0) {
                orderSide = orderLeg.order_side;
            }
            if ((i2 & 16) != 0) {
                byteString = orderLeg.unknownFields();
            }
            ByteString byteString2 = byteString;
            int i3 = i;
            return orderLeg.copy(contractType, str, i3, orderSide, byteString2);
        }

        public final OrderLeg copy(ContractType contract_type, String contract_id, int ratio_quantity, OrderSide order_side, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OrderLeg(contract_type, contract_id, ratio_quantity, order_side, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderLeg.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OrderLeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderLeg$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FuturesOrderContext.OrderLeg value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getContract_type() != FuturesOrderContext.ContractType.CONTRACT_TYPE_UNSPECIFIED) {
                        size += FuturesOrderContext.ContractType.ADAPTER.encodedSizeWithTag(1, value.getContract_type());
                    }
                    if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_id());
                    }
                    if (value.getRatio_quantity() != 0) {
                        size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getRatio_quantity()));
                    }
                    return value.getOrder_side() != FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED ? size + FuturesOrderContext.OrderSide.ADAPTER.encodedSizeWithTag(4, value.getOrder_side()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FuturesOrderContext.OrderLeg value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getContract_type() != FuturesOrderContext.ContractType.CONTRACT_TYPE_UNSPECIFIED) {
                        FuturesOrderContext.ContractType.ADAPTER.encodeWithTag(writer, 1, (int) value.getContract_type());
                    }
                    if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                    }
                    if (value.getRatio_quantity() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getRatio_quantity()));
                    }
                    if (value.getOrder_side() != FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED) {
                        FuturesOrderContext.OrderSide.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_side());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FuturesOrderContext.OrderLeg value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getOrder_side() != FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED) {
                        FuturesOrderContext.OrderSide.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_side());
                    }
                    if (value.getRatio_quantity() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getRatio_quantity()));
                    }
                    if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                    }
                    if (value.getContract_type() != FuturesOrderContext.ContractType.CONTRACT_TYPE_UNSPECIFIED) {
                        FuturesOrderContext.ContractType.ADAPTER.encodeWithTag(writer, 1, (int) value.getContract_type());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public FuturesOrderContext.OrderLeg decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    FuturesOrderContext.ContractType contractTypeDecode = FuturesOrderContext.ContractType.CONTRACT_TYPE_UNSPECIFIED;
                    FuturesOrderContext.OrderSide orderSide = FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    int iIntValue = 0;
                    String strDecode = "";
                    FuturesOrderContext.OrderSide orderSideDecode = orderSide;
                    while (true) {
                        FuturesOrderContext.ContractType contractType = contractTypeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new FuturesOrderContext.OrderLeg(contractType, strDecode, iIntValue, orderSideDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    contractTypeDecode = FuturesOrderContext.ContractType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            } else if (iNextTag == 4) {
                                try {
                                    orderSideDecode = FuturesOrderContext.OrderSide.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FuturesOrderContext.OrderLeg redact(FuturesOrderContext.OrderLeg value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return FuturesOrderContext.OrderLeg.copy$default(value, null, null, 0, null, ByteString.EMPTY, 15, null);
                }
            };
        }
    }

    /* compiled from: FuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0004H\u0016Jz\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010(R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderRequestContext;", "Lcom/squareup/wire/Message;", "", "account_id", "", "order_ref_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "quantity", "", "order_trigger", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "stop_price", "", "limit_price", "legs", "", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderLeg;", "is_auto_send_enabled", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;JLcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;DDLjava/util/List;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getOrder_ref_id", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "getQuantity", "()J", "getOrder_trigger", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "getStop_price", "()D", "getLimit_price", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getLegs", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderRequestContext extends Message {

        @JvmField
        public static final ProtoAdapter<OrderRequestContext> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String account_id;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isAutoSendEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
        private final Boolean is_auto_send_enabled;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderLeg#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
        private final java.util.List<OrderLeg> legs;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final double limit_price;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderRefId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String order_ref_id;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderTrigger#ADAPTER", jsonName = "orderTrigger", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final OrderTrigger order_trigger;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final OrderType order_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final long quantity;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final double stop_price;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderContext$TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final TimeInForce time_in_force;

        public OrderRequestContext() {
            this(null, null, null, 0L, null, null, 0.0d, 0.0d, null, null, null, 2047, null);
        }

        public /* synthetic */ OrderRequestContext(String str, String str2, OrderType orderType, long j, OrderTrigger orderTrigger, TimeInForce timeInForce, double d, double d2, java.util.List list, Boolean r26, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? OrderTrigger.TRIGGER_UNSPECIFIED : orderTrigger, (i & 32) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 64) != 0 ? 0.0d : d, (i & 128) == 0 ? d2 : 0.0d, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r26, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24281newBuilder();
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getOrder_ref_id() {
            return this.order_ref_id;
        }

        public final OrderType getOrder_type() {
            return this.order_type;
        }

        public final long getQuantity() {
            return this.quantity;
        }

        public final OrderTrigger getOrder_trigger() {
            return this.order_trigger;
        }

        public final TimeInForce getTime_in_force() {
            return this.time_in_force;
        }

        public final double getStop_price() {
            return this.stop_price;
        }

        public final double getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: is_auto_send_enabled, reason: from getter */
        public final Boolean getIs_auto_send_enabled() {
            return this.is_auto_send_enabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderRequestContext(String account_id, String order_ref_id, OrderType order_type, long j, OrderTrigger order_trigger, TimeInForce time_in_force, double d, double d2, java.util.List<OrderLeg> legs, Boolean is_auto_send_enabled, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(is_auto_send_enabled, "is_auto_send_enabled");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.account_id = account_id;
            this.order_ref_id = order_ref_id;
            this.order_type = order_type;
            this.quantity = j;
            this.order_trigger = order_trigger;
            this.time_in_force = time_in_force;
            this.stop_price = d;
            this.limit_price = d2;
            this.is_auto_send_enabled = is_auto_send_enabled;
            this.legs = Internal.immutableCopyOf("legs", legs);
        }

        public final java.util.List<OrderLeg> getLegs() {
            return this.legs;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24281newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderRequestContext)) {
                return false;
            }
            OrderRequestContext orderRequestContext = (OrderRequestContext) other;
            return Intrinsics.areEqual(unknownFields(), orderRequestContext.unknownFields()) && Intrinsics.areEqual(this.account_id, orderRequestContext.account_id) && Intrinsics.areEqual(this.order_ref_id, orderRequestContext.order_ref_id) && this.order_type == orderRequestContext.order_type && this.quantity == orderRequestContext.quantity && this.order_trigger == orderRequestContext.order_trigger && this.time_in_force == orderRequestContext.time_in_force && this.stop_price == orderRequestContext.stop_price && this.limit_price == orderRequestContext.limit_price && Intrinsics.areEqual(this.legs, orderRequestContext.legs) && this.is_auto_send_enabled == orderRequestContext.is_auto_send_enabled;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.order_ref_id.hashCode()) * 37) + this.order_type.hashCode()) * 37) + Long.hashCode(this.quantity)) * 37) + this.order_trigger.hashCode()) * 37) + this.time_in_force.hashCode()) * 37) + Double.hashCode(this.stop_price)) * 37) + Double.hashCode(this.limit_price)) * 37) + this.legs.hashCode()) * 37) + this.is_auto_send_enabled.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("account_id=" + Internal.sanitize(this.account_id));
            arrayList.add("order_ref_id=" + Internal.sanitize(this.order_ref_id));
            arrayList.add("order_type=" + this.order_type);
            arrayList.add("quantity=" + this.quantity);
            arrayList.add("order_trigger=" + this.order_trigger);
            arrayList.add("time_in_force=" + this.time_in_force);
            arrayList.add("stop_price=" + this.stop_price);
            arrayList.add("limit_price=" + this.limit_price);
            if (!this.legs.isEmpty()) {
                arrayList.add("legs=" + this.legs);
            }
            arrayList.add("is_auto_send_enabled=" + this.is_auto_send_enabled);
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderRequestContext{", "}", 0, null, null, 56, null);
        }

        public final OrderRequestContext copy(String account_id, String order_ref_id, OrderType order_type, long quantity, OrderTrigger order_trigger, TimeInForce time_in_force, double stop_price, double limit_price, java.util.List<OrderLeg> legs, Boolean is_auto_send_enabled, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(is_auto_send_enabled, "is_auto_send_enabled");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OrderRequestContext(account_id, order_ref_id, order_type, quantity, order_trigger, time_in_force, stop_price, limit_price, legs, is_auto_send_enabled, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderRequestContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OrderRequestContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContext$OrderRequestContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FuturesOrderContext.OrderRequestContext value) {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                    }
                    if (!Intrinsics.areEqual(value.getOrder_ref_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_ref_id());
                    }
                    if (value.getOrder_type() != FuturesOrderContext.OrderType.ORDER_TYPE_UNSPECIFIED) {
                        size += FuturesOrderContext.OrderType.ADAPTER.encodedSizeWithTag(3, value.getOrder_type());
                    }
                    if (value.getQuantity() != 0) {
                        size += ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(value.getQuantity()));
                    }
                    if (value.getOrder_trigger() != FuturesOrderContext.OrderTrigger.TRIGGER_UNSPECIFIED) {
                        size += FuturesOrderContext.OrderTrigger.ADAPTER.encodedSizeWithTag(5, value.getOrder_trigger());
                    }
                    if (value.getTime_in_force() != FuturesOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                        size += FuturesOrderContext.TimeInForce.ADAPTER.encodedSizeWithTag(6, value.getTime_in_force());
                    }
                    if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getStop_price()));
                    }
                    if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getLimit_price()));
                    }
                    int iEncodedSizeWithTag = size + FuturesOrderContext.OrderLeg.ADAPTER.asRepeated().encodedSizeWithTag(9, value.getLegs());
                    return value.getIs_auto_send_enabled() != Boolean.BOOLEAN_UNSPECIFIED ? iEncodedSizeWithTag + Boolean.ADAPTER.encodedSizeWithTag(10, value.getIs_auto_send_enabled()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FuturesOrderContext.OrderRequestContext value) throws IOException {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                    }
                    if (!Intrinsics.areEqual(value.getOrder_ref_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_ref_id());
                    }
                    if (value.getOrder_type() != FuturesOrderContext.OrderType.ORDER_TYPE_UNSPECIFIED) {
                        FuturesOrderContext.OrderType.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_type());
                    }
                    if (value.getQuantity() != 0) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getQuantity()));
                    }
                    if (value.getOrder_trigger() != FuturesOrderContext.OrderTrigger.TRIGGER_UNSPECIFIED) {
                        FuturesOrderContext.OrderTrigger.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_trigger());
                    }
                    if (value.getTime_in_force() != FuturesOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                        FuturesOrderContext.TimeInForce.ADAPTER.encodeWithTag(writer, 6, (int) value.getTime_in_force());
                    }
                    if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getStop_price()));
                    }
                    if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getLimit_price()));
                    }
                    FuturesOrderContext.OrderLeg.ADAPTER.asRepeated().encodeWithTag(writer, 9, (int) value.getLegs());
                    if (value.getIs_auto_send_enabled() != Boolean.BOOLEAN_UNSPECIFIED) {
                        Boolean.ADAPTER.encodeWithTag(writer, 10, (int) value.getIs_auto_send_enabled());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FuturesOrderContext.OrderRequestContext value) throws IOException {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getIs_auto_send_enabled() != Boolean.BOOLEAN_UNSPECIFIED) {
                        Boolean.ADAPTER.encodeWithTag(writer, 10, (int) value.getIs_auto_send_enabled());
                    }
                    FuturesOrderContext.OrderLeg.ADAPTER.asRepeated().encodeWithTag(writer, 9, (int) value.getLegs());
                    if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getLimit_price()));
                    }
                    if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getStop_price()));
                    }
                    if (value.getTime_in_force() != FuturesOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                        FuturesOrderContext.TimeInForce.ADAPTER.encodeWithTag(writer, 6, (int) value.getTime_in_force());
                    }
                    if (value.getOrder_trigger() != FuturesOrderContext.OrderTrigger.TRIGGER_UNSPECIFIED) {
                        FuturesOrderContext.OrderTrigger.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_trigger());
                    }
                    if (value.getQuantity() != 0) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getQuantity()));
                    }
                    if (value.getOrder_type() != FuturesOrderContext.OrderType.ORDER_TYPE_UNSPECIFIED) {
                        FuturesOrderContext.OrderType.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_type());
                    }
                    if (!Intrinsics.areEqual(value.getOrder_ref_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_ref_id());
                    }
                    if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public FuturesOrderContext.OrderRequestContext decode(ProtoReader reader) throws IOException {
                    FuturesOrderContext.OrderTrigger orderTrigger;
                    Boolean r20;
                    String str;
                    FuturesOrderContext.OrderTrigger orderTrigger2;
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    FuturesOrderContext.OrderType orderType = FuturesOrderContext.OrderType.ORDER_TYPE_UNSPECIFIED;
                    FuturesOrderContext.OrderTrigger orderTrigger3 = FuturesOrderContext.OrderTrigger.TRIGGER_UNSPECIFIED;
                    FuturesOrderContext.TimeInForce timeInForce = FuturesOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                    ArrayList arrayList = new ArrayList();
                    Boolean r5 = Boolean.BOOLEAN_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    FuturesOrderContext.OrderType orderTypeDecode = orderType;
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = 0.0d;
                    long jLongValue = 0;
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    Boolean booleanDecode = r5;
                    FuturesOrderContext.TimeInForce timeInForceDecode = timeInForce;
                    FuturesOrderContext.OrderTrigger orderTriggerDecode = orderTrigger3;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FuturesOrderContext.OrderRequestContext(strDecode, strDecode2, orderTypeDecode, jLongValue, orderTriggerDecode, timeInForceDecode, dDoubleValue, dDoubleValue2, arrayList, booleanDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                orderTrigger = orderTriggerDecode;
                                r20 = booleanDecode;
                                str = strDecode;
                                try {
                                    orderTypeDecode = FuturesOrderContext.OrderType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                orderTriggerDecode = orderTrigger;
                                strDecode = str;
                                booleanDecode = r20;
                                break;
                            case 4:
                                orderTrigger2 = orderTriggerDecode;
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                orderTriggerDecode = orderTrigger2;
                                break;
                            case 5:
                                orderTrigger = orderTriggerDecode;
                                r20 = booleanDecode;
                                str = strDecode;
                                try {
                                    orderTriggerDecode = FuturesOrderContext.OrderTrigger.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode = str;
                                booleanDecode = r20;
                                break;
                            case 6:
                                orderTrigger = orderTriggerDecode;
                                r20 = booleanDecode;
                                str = strDecode;
                                try {
                                    timeInForceDecode = FuturesOrderContext.TimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                orderTriggerDecode = orderTrigger;
                                strDecode = str;
                                booleanDecode = r20;
                                break;
                            case 7:
                                orderTrigger2 = orderTriggerDecode;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                orderTriggerDecode = orderTrigger2;
                                break;
                            case 8:
                                orderTrigger2 = orderTriggerDecode;
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                orderTriggerDecode = orderTrigger2;
                                break;
                            case 9:
                                orderTrigger = orderTriggerDecode;
                                r20 = booleanDecode;
                                str = strDecode;
                                arrayList.add(FuturesOrderContext.OrderLeg.ADAPTER.decode(reader));
                                orderTriggerDecode = orderTrigger;
                                strDecode = str;
                                booleanDecode = r20;
                                break;
                            case 10:
                                try {
                                    booleanDecode = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    orderTrigger = orderTriggerDecode;
                                    r20 = booleanDecode;
                                    str = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                orderTrigger = orderTriggerDecode;
                                r20 = booleanDecode;
                                str = strDecode;
                                orderTriggerDecode = orderTrigger;
                                strDecode = str;
                                booleanDecode = r20;
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FuturesOrderContext.OrderRequestContext redact(FuturesOrderContext.OrderRequestContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy((767 & 1) != 0 ? value.account_id : null, (767 & 2) != 0 ? value.order_ref_id : null, (767 & 4) != 0 ? value.order_type : null, (767 & 8) != 0 ? value.quantity : 0L, (767 & 16) != 0 ? value.order_trigger : null, (767 & 32) != 0 ? value.time_in_force : null, (767 & 64) != 0 ? value.stop_price : 0.0d, (767 & 128) != 0 ? value.limit_price : 0.0d, (767 & 256) != 0 ? value.legs : Internal.m26823redactElements(value.getLegs(), FuturesOrderContext.OrderLeg.ADAPTER), (767 & 512) != 0 ? value.is_auto_send_enabled : null, (767 & 1024) != 0 ? value.unknownFields() : ByteString.EMPTY);
                }
            };
        }
    }
}
