package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.EventContractOrderContext;
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

/* compiled from: EventContractOrderContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004 !\"#B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "order_side", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "event_order_position_effect", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "order_request_context", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderRequestContext;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderRequestContext;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "getEvent_order_position_effect", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "getOrder_request_context", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderRequestContext;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EventOrderPositionEffect", "OrderSide", "OrderRequestContext", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EventContractOrderContext extends Message {

    @JvmField
    public static final ProtoAdapter<EventContractOrderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EventContractOrderContext$EventOrderPositionEffect#ADAPTER", jsonName = "eventOrderPositionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EventOrderPositionEffect event_order_position_effect;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EventContractOrderContext$OrderRequestContext#ADAPTER", jsonName = "orderRequestContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final OrderRequestContext order_request_context;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EventContractOrderContext$OrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderSide order_side;

    public EventContractOrderContext() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24262newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public /* synthetic */ EventContractOrderContext(String str, OrderSide orderSide, EventOrderPositionEffect eventOrderPositionEffect, OrderRequestContext orderRequestContext, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OrderSide.SIDE_UNSPECIFIED : orderSide, (i & 4) != 0 ? EventOrderPositionEffect.POSITION_EFFECT_UNSPECIFIED : eventOrderPositionEffect, (i & 8) != 0 ? null : orderRequestContext, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OrderSide getOrder_side() {
        return this.order_side;
    }

    public final EventOrderPositionEffect getEvent_order_position_effect() {
        return this.event_order_position_effect;
    }

    public final OrderRequestContext getOrder_request_context() {
        return this.order_request_context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventContractOrderContext(String contract_id, OrderSide order_side, EventOrderPositionEffect event_order_position_effect, OrderRequestContext orderRequestContext, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(event_order_position_effect, "event_order_position_effect");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.order_side = order_side;
        this.event_order_position_effect = event_order_position_effect;
        this.order_request_context = orderRequestContext;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24262newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventContractOrderContext)) {
            return false;
        }
        EventContractOrderContext eventContractOrderContext = (EventContractOrderContext) other;
        return Intrinsics.areEqual(unknownFields(), eventContractOrderContext.unknownFields()) && Intrinsics.areEqual(this.contract_id, eventContractOrderContext.contract_id) && this.order_side == eventContractOrderContext.order_side && this.event_order_position_effect == eventContractOrderContext.event_order_position_effect && Intrinsics.areEqual(this.order_request_context, eventContractOrderContext.order_request_context);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.order_side.hashCode()) * 37) + this.event_order_position_effect.hashCode()) * 37;
        OrderRequestContext orderRequestContext = this.order_request_context;
        int iHashCode2 = iHashCode + (orderRequestContext != null ? orderRequestContext.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("event_order_position_effect=" + this.event_order_position_effect);
        OrderRequestContext orderRequestContext = this.order_request_context;
        if (orderRequestContext != null) {
            arrayList.add("order_request_context=" + orderRequestContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventContractOrderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EventContractOrderContext copy$default(EventContractOrderContext eventContractOrderContext, String str, OrderSide orderSide, EventOrderPositionEffect eventOrderPositionEffect, OrderRequestContext orderRequestContext, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventContractOrderContext.contract_id;
        }
        if ((i & 2) != 0) {
            orderSide = eventContractOrderContext.order_side;
        }
        if ((i & 4) != 0) {
            eventOrderPositionEffect = eventContractOrderContext.event_order_position_effect;
        }
        if ((i & 8) != 0) {
            orderRequestContext = eventContractOrderContext.order_request_context;
        }
        if ((i & 16) != 0) {
            byteString = eventContractOrderContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        EventOrderPositionEffect eventOrderPositionEffect2 = eventOrderPositionEffect;
        return eventContractOrderContext.copy(str, orderSide, eventOrderPositionEffect2, orderRequestContext, byteString2);
    }

    public final EventContractOrderContext copy(String contract_id, OrderSide order_side, EventOrderPositionEffect event_order_position_effect, OrderRequestContext order_request_context, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(event_order_position_effect, "event_order_position_effect");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventContractOrderContext(contract_id, order_side, event_order_position_effect, order_request_context, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventContractOrderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventContractOrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EventContractOrderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventContractOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (value.getOrder_side() != EventContractOrderContext.OrderSide.SIDE_UNSPECIFIED) {
                    size += EventContractOrderContext.OrderSide.ADAPTER.encodedSizeWithTag(2, value.getOrder_side());
                }
                if (value.getEvent_order_position_effect() != EventContractOrderContext.EventOrderPositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    size += EventContractOrderContext.EventOrderPositionEffect.ADAPTER.encodedSizeWithTag(3, value.getEvent_order_position_effect());
                }
                return value.getOrder_request_context() != null ? size + EventContractOrderContext.OrderRequestContext.ADAPTER.encodedSizeWithTag(4, value.getOrder_request_context()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventContractOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (value.getOrder_side() != EventContractOrderContext.OrderSide.SIDE_UNSPECIFIED) {
                    EventContractOrderContext.OrderSide.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                }
                if (value.getEvent_order_position_effect() != EventContractOrderContext.EventOrderPositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    EventContractOrderContext.EventOrderPositionEffect.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_order_position_effect());
                }
                if (value.getOrder_request_context() != null) {
                    EventContractOrderContext.OrderRequestContext.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_request_context());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventContractOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_request_context() != null) {
                    EventContractOrderContext.OrderRequestContext.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_request_context());
                }
                if (value.getEvent_order_position_effect() != EventContractOrderContext.EventOrderPositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    EventContractOrderContext.EventOrderPositionEffect.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_order_position_effect());
                }
                if (value.getOrder_side() != EventContractOrderContext.OrderSide.SIDE_UNSPECIFIED) {
                    EventContractOrderContext.OrderSide.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EventContractOrderContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventContractOrderContext.OrderSide orderSideDecode = EventContractOrderContext.OrderSide.SIDE_UNSPECIFIED;
                EventContractOrderContext.EventOrderPositionEffect eventOrderPositionEffect = EventContractOrderContext.EventOrderPositionEffect.POSITION_EFFECT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                EventContractOrderContext.OrderRequestContext orderRequestContextDecode = null;
                String strDecode = "";
                EventContractOrderContext.EventOrderPositionEffect eventOrderPositionEffectDecode = eventOrderPositionEffect;
                while (true) {
                    EventContractOrderContext.OrderSide orderSide = orderSideDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new EventContractOrderContext(strDecode, orderSide, eventOrderPositionEffectDecode, orderRequestContextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                orderSideDecode = EventContractOrderContext.OrderSide.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                eventOrderPositionEffectDecode = EventContractOrderContext.EventOrderPositionEffect.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            orderRequestContextDecode = EventContractOrderContext.OrderRequestContext.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventContractOrderContext redact(EventContractOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EventContractOrderContext.OrderRequestContext order_request_context = value.getOrder_request_context();
                return EventContractOrderContext.copy$default(value, null, null, null, order_request_context != null ? EventContractOrderContext.OrderRequestContext.ADAPTER.redact(order_request_context) : null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventContractOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "POSITION_EFFECT_UNSPECIFIED", "OPEN", "CLOSE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventOrderPositionEffect implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventOrderPositionEffect[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventOrderPositionEffect> ADAPTER;
        public static final EventOrderPositionEffect CLOSE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventOrderPositionEffect OPEN;
        public static final EventOrderPositionEffect POSITION_EFFECT_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ EventOrderPositionEffect[] $values() {
            return new EventOrderPositionEffect[]{POSITION_EFFECT_UNSPECIFIED, OPEN, CLOSE};
        }

        @JvmStatic
        public static final EventOrderPositionEffect fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EventOrderPositionEffect> getEntries() {
            return $ENTRIES;
        }

        private EventOrderPositionEffect(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EventOrderPositionEffect eventOrderPositionEffect = new EventOrderPositionEffect("POSITION_EFFECT_UNSPECIFIED", 0, 0);
            POSITION_EFFECT_UNSPECIFIED = eventOrderPositionEffect;
            OPEN = new EventOrderPositionEffect("OPEN", 1, 1);
            CLOSE = new EventOrderPositionEffect("CLOSE", 2, 2);
            EventOrderPositionEffect[] eventOrderPositionEffectArr$values = $values();
            $VALUES = eventOrderPositionEffectArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventOrderPositionEffectArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventOrderPositionEffect.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventOrderPositionEffect>(orCreateKotlinClass, syntax, eventOrderPositionEffect) { // from class: com.robinhood.rosetta.eventlogging.EventContractOrderContext$EventOrderPositionEffect$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public EventContractOrderContext.EventOrderPositionEffect fromValue(int value) {
                    return EventContractOrderContext.EventOrderPositionEffect.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: EventContractOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EventOrderPositionEffect fromValue(int value) {
                if (value == 0) {
                    return EventOrderPositionEffect.POSITION_EFFECT_UNSPECIFIED;
                }
                if (value == 1) {
                    return EventOrderPositionEffect.OPEN;
                }
                if (value != 2) {
                    return null;
                }
                return EventOrderPositionEffect.CLOSE;
            }
        }

        public static EventOrderPositionEffect valueOf(String str) {
            return (EventOrderPositionEffect) Enum.valueOf(EventOrderPositionEffect.class, str);
        }

        public static EventOrderPositionEffect[] values() {
            return (EventOrderPositionEffect[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventContractOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIDE_UNSPECIFIED", "BUY", "SELL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            ADAPTER = new EnumAdapter<OrderSide>(orCreateKotlinClass, syntax, orderSide) { // from class: com.robinhood.rosetta.eventlogging.EventContractOrderContext$OrderSide$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public EventContractOrderContext.OrderSide fromValue(int value) {
                    return EventContractOrderContext.OrderSide.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: EventContractOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* compiled from: EventContractOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderRequestContext;", "Lcom/squareup/wire/Message;", "", "quantity", "", "order_ref_id", "", "limit_price", "", "unknownFields", "Lokio/ByteString;", "<init>", "(JLjava/lang/String;DLokio/ByteString;)V", "getQuantity", "()J", "getOrder_ref_id", "()Ljava/lang/String;", "getLimit_price", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderRequestContext extends Message {

        @JvmField
        public static final ProtoAdapter<OrderRequestContext> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final double limit_price;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderRefId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String order_ref_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final long quantity;

        public OrderRequestContext() {
            this(0L, null, 0.0d, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24263newBuilder();
        }

        public final long getQuantity() {
            return this.quantity;
        }

        public final String getOrder_ref_id() {
            return this.order_ref_id;
        }

        public /* synthetic */ OrderRequestContext(long j, String str, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final double getLimit_price() {
            return this.limit_price;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderRequestContext(long j, String order_ref_id, double d, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.quantity = j;
            this.order_ref_id = order_ref_id;
            this.limit_price = d;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24263newBuilder() {
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
            return Intrinsics.areEqual(unknownFields(), orderRequestContext.unknownFields()) && this.quantity == orderRequestContext.quantity && Intrinsics.areEqual(this.order_ref_id, orderRequestContext.order_ref_id) && this.limit_price == orderRequestContext.limit_price;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + Long.hashCode(this.quantity)) * 37) + this.order_ref_id.hashCode()) * 37) + Double.hashCode(this.limit_price);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("quantity=" + this.quantity);
            arrayList.add("order_ref_id=" + Internal.sanitize(this.order_ref_id));
            arrayList.add("limit_price=" + this.limit_price);
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderRequestContext{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ OrderRequestContext copy$default(OrderRequestContext orderRequestContext, long j, String str, double d, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                j = orderRequestContext.quantity;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = orderRequestContext.order_ref_id;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                d = orderRequestContext.limit_price;
            }
            double d2 = d;
            if ((i & 8) != 0) {
                byteString = orderRequestContext.unknownFields();
            }
            return orderRequestContext.copy(j2, str2, d2, byteString);
        }

        public final OrderRequestContext copy(long quantity, String order_ref_id, double limit_price, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OrderRequestContext(quantity, order_ref_id, limit_price, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderRequestContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OrderRequestContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EventContractOrderContext$OrderRequestContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(EventContractOrderContext.OrderRequestContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getQuantity() != 0) {
                        size += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getQuantity()));
                    }
                    if (!Intrinsics.areEqual(value.getOrder_ref_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_ref_id());
                    }
                    return !Double.valueOf(value.getLimit_price()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getLimit_price())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, EventContractOrderContext.OrderRequestContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getQuantity() != 0) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getQuantity()));
                    }
                    if (!Intrinsics.areEqual(value.getOrder_ref_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_ref_id());
                    }
                    if (!Double.valueOf(value.getLimit_price()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getLimit_price()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, EventContractOrderContext.OrderRequestContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Double.valueOf(value.getLimit_price()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getLimit_price()));
                    }
                    if (!Intrinsics.areEqual(value.getOrder_ref_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_ref_id());
                    }
                    if (value.getQuantity() != 0) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getQuantity()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public EventContractOrderContext.OrderRequestContext redact(EventContractOrderContext.OrderRequestContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return EventContractOrderContext.OrderRequestContext.copy$default(value, 0L, null, 0.0d, ByteString.EMPTY, 7, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public EventContractOrderContext.OrderRequestContext decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    long jLongValue = 0;
                    double dDoubleValue = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new EventContractOrderContext.OrderRequestContext(jLongValue, strDecode, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
