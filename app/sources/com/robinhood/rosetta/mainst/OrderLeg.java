package com.robinhood.rosetta.mainst;

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
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.PositionEffect;
import rosetta.mainst.Side;

/* compiled from: OrderLeg.kt */
@kotlin.Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010%\u001a\u00020\u0002H\u0017J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020\rH\u0016J\b\u0010+\u001a\u00020\u0006H\u0016Jf\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderLeg;", "Lcom/squareup/wire/Message;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUID;", "id", "", "instrument_id", "position_effect", "Lrosetta/mainst/PositionEffect;", "side", "Lrosetta/mainst/Side;", "ratio_quantity", "", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/Decimal;", "instrument_type", "Lrosetta/mainst/InstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/PositionEffect;Lrosetta/mainst/Side;ILcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/InstrumentType;Lokio/ByteString;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getId", "()Ljava/lang/String;", "getInstrument_id", "getPosition_effect", "()Lrosetta/mainst/PositionEffect;", "getSide", "()Lrosetta/mainst/Side;", "getRatio_quantity", "()I", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getInstrument_type", "()Lrosetta/mainst/InstrumentType;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderLeg extends Message {

    @JvmField
    public static final ProtoAdapter<OrderLeg> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "cancelledQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Decimal cancelled_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final UUID instrument_id;

    @WireField(adapter = "rosetta.mainst.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID order_id;

    @WireField(adapter = "rosetta.mainst.PositionEffect#ADAPTER", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PositionEffect position_effect;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ratioQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int ratio_quantity;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Side side;

    public OrderLeg() {
        this(null, null, null, null, null, 0, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24686newBuilder();
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ OrderLeg(UUID uuid, String str, UUID uuid2, PositionEffect positionEffect, Side side, int i, Decimal decimal, InstrumentType instrumentType, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uuid, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : uuid2, (i2 & 8) != 0 ? PositionEffect.POSITION_EFFECT_UNSPECIFIED : positionEffect, (i2 & 16) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : decimal, (i2 & 128) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    public final PositionEffect getPosition_effect() {
        return this.position_effect;
    }

    public final Side getSide() {
        return this.side;
    }

    public final int getRatio_quantity() {
        return this.ratio_quantity;
    }

    public final Decimal getCancelled_quantity() {
        return this.cancelled_quantity;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderLeg(UUID uuid, String id, UUID uuid2, PositionEffect position_effect, Side side, int i, Decimal decimal, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = uuid;
        this.id = id;
        this.instrument_id = uuid2;
        this.position_effect = position_effect;
        this.side = side;
        this.ratio_quantity = i;
        this.cancelled_quantity = decimal;
        this.instrument_type = instrument_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24686newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), orderLeg.unknownFields()) && Intrinsics.areEqual(this.order_id, orderLeg.order_id) && Intrinsics.areEqual(this.id, orderLeg.id) && Intrinsics.areEqual(this.instrument_id, orderLeg.instrument_id) && this.position_effect == orderLeg.position_effect && this.side == orderLeg.side && this.ratio_quantity == orderLeg.ratio_quantity && Intrinsics.areEqual(this.cancelled_quantity, orderLeg.cancelled_quantity) && this.instrument_type == orderLeg.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.order_id;
        int iHashCode2 = (((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37) + this.id.hashCode()) * 37;
        UUID uuid2 = this.instrument_id;
        int iHashCode3 = (((((((iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37) + this.position_effect.hashCode()) * 37) + this.side.hashCode()) * 37) + Integer.hashCode(this.ratio_quantity)) * 37;
        Decimal decimal = this.cancelled_quantity;
        int iHashCode4 = ((iHashCode3 + (decimal != null ? decimal.hashCode() : 0)) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.order_id;
        if (uuid != null) {
            arrayList.add("order_id=" + uuid);
        }
        arrayList.add("id=" + Internal.sanitize(this.id));
        UUID uuid2 = this.instrument_id;
        if (uuid2 != null) {
            arrayList.add("instrument_id=" + uuid2);
        }
        arrayList.add("position_effect=" + this.position_effect);
        arrayList.add("side=" + this.side);
        arrayList.add("ratio_quantity=" + this.ratio_quantity);
        Decimal decimal = this.cancelled_quantity;
        if (decimal != null) {
            arrayList.add("cancelled_quantity=" + decimal);
        }
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderLeg{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderLeg copy$default(OrderLeg orderLeg, UUID uuid, String str, UUID uuid2, PositionEffect positionEffect, Side side, int i, Decimal decimal, InstrumentType instrumentType, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = orderLeg.order_id;
        }
        if ((i2 & 2) != 0) {
            str = orderLeg.id;
        }
        if ((i2 & 4) != 0) {
            uuid2 = orderLeg.instrument_id;
        }
        if ((i2 & 8) != 0) {
            positionEffect = orderLeg.position_effect;
        }
        if ((i2 & 16) != 0) {
            side = orderLeg.side;
        }
        if ((i2 & 32) != 0) {
            i = orderLeg.ratio_quantity;
        }
        if ((i2 & 64) != 0) {
            decimal = orderLeg.cancelled_quantity;
        }
        if ((i2 & 128) != 0) {
            instrumentType = orderLeg.instrument_type;
        }
        if ((i2 & 256) != 0) {
            byteString = orderLeg.unknownFields();
        }
        InstrumentType instrumentType2 = instrumentType;
        ByteString byteString2 = byteString;
        int i3 = i;
        Decimal decimal2 = decimal;
        Side side2 = side;
        UUID uuid3 = uuid2;
        return orderLeg.copy(uuid, str, uuid3, positionEffect, side2, i3, decimal2, instrumentType2, byteString2);
    }

    public final OrderLeg copy(UUID order_id, String id, UUID instrument_id, PositionEffect position_effect, Side side, int ratio_quantity, Decimal cancelled_quantity, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderLeg(order_id, id, instrument_id, position_effect, side, ratio_quantity, cancelled_quantity, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderLeg.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderLeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.OrderLeg$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getId());
                }
                if (value.getInstrument_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(3, value.getInstrument_id());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    size += PositionEffect.ADAPTER.encodedSizeWithTag(4, value.getPosition_effect());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(5, value.getSide());
                }
                if (value.getRatio_quantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getCancelled_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(7, value.getCancelled_quantity());
                }
                return value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED ? size + InstrumentType.ADAPTER.encodedSizeWithTag(8, value.getInstrument_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getId());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 4, (int) value.getPosition_effect());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 5, (int) value.getSide());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getCancelled_quantity());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 8, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 8, (int) value.getInstrument_type());
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getCancelled_quantity());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 5, (int) value.getSide());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 4, (int) value.getPosition_effect());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getId());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderLeg decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PositionEffect positionEffectDecode = PositionEffect.POSITION_EFFECT_UNSPECIFIED;
                Side side = Side.SIDE_UNSPECIFIED;
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Decimal decimalDecode = null;
                String strDecode = "";
                int iIntValue = 0;
                InstrumentType instrumentTypeDecode = instrumentType;
                UUID uuidDecode = null;
                UUID uuidDecode2 = null;
                Side sideDecode = side;
                while (true) {
                    PositionEffect positionEffect = positionEffectDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    uuidDecode = UUID.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    uuidDecode2 = UUID.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        sideDecode = Side.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 6:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 7:
                                    decimalDecode = Decimal.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    try {
                                        instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new OrderLeg(uuidDecode, strDecode, uuidDecode2, positionEffect, sideDecode, iIntValue, decimalDecode, instrumentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderLeg redact(OrderLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID order_id = value.getOrder_id();
                UUID uuidRedact = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                UUID instrument_id = value.getInstrument_id();
                UUID uuidRedact2 = instrument_id != null ? UUID.ADAPTER.redact(instrument_id) : null;
                Decimal cancelled_quantity = value.getCancelled_quantity();
                return OrderLeg.copy$default(value, uuidRedact, null, uuidRedact2, null, null, 0, cancelled_quantity != null ? Decimal.ADAPTER.redact(cancelled_quantity) : null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, null);
            }
        };
    }
}
