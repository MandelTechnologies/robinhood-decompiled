package com.robinhood.rosetta.mainst;

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
import rosetta.mainst.PutCallCode;
import rosetta.mainst.Side;

/* compiled from: PinnacleLegDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020\rH\u0016J\b\u0010/\u001a\u00020\u0006H\u0016Jn\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleLegDetails;", "Lcom/squareup/wire/Message;", "", "instrument_id", "Lcom/robinhood/rosetta/mainst/UUID;", "leg_id", "", "position_effect", "Lrosetta/mainst/PositionEffect;", "side", "Lrosetta/mainst/Side;", "symbol", "ratio_quantity", "", "put_call_code", "Lrosetta/mainst/PutCallCode;", "trade_value_multiplier", "Lcom/robinhood/rosetta/mainst/Decimal;", "instrument_type", "Lrosetta/mainst/InstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Lrosetta/mainst/PositionEffect;Lrosetta/mainst/Side;Ljava/lang/String;ILrosetta/mainst/PutCallCode;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/InstrumentType;Lokio/ByteString;)V", "getInstrument_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getLeg_id", "()Ljava/lang/String;", "getPosition_effect", "()Lrosetta/mainst/PositionEffect;", "getSide", "()Lrosetta/mainst/Side;", "getSymbol", "getRatio_quantity", "()I", "getPut_call_code", "()Lrosetta/mainst/PutCallCode;", "getTrade_value_multiplier", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getInstrument_type", "()Lrosetta/mainst/InstrumentType;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PinnacleLegDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PinnacleLegDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID instrument_id;

    @WireField(adapter = "rosetta.mainst.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "legId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String leg_id;

    @WireField(adapter = "rosetta.mainst.PositionEffect#ADAPTER", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PositionEffect position_effect;

    @WireField(adapter = "rosetta.mainst.PutCallCode#ADAPTER", jsonName = "putCallCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final PutCallCode put_call_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ratioQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int ratio_quantity;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String symbol;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "tradeValueMultiplier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Decimal trade_value_multiplier;

    public PinnacleLegDetails() {
        this(null, null, null, null, null, 0, null, null, null, null, 1023, null);
    }

    public /* synthetic */ PinnacleLegDetails(UUID uuid, String str, PositionEffect positionEffect, Side side, String str2, int i, PutCallCode putCallCode, Decimal decimal, InstrumentType instrumentType, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uuid, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? PositionEffect.POSITION_EFFECT_UNSPECIFIED : positionEffect, (i2 & 8) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? PutCallCode.PUT_CALL_CODE_UNSPECIFIED : putCallCode, (i2 & 128) != 0 ? null : decimal, (i2 & 256) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i2 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24698newBuilder();
    }

    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    public final String getLeg_id() {
        return this.leg_id;
    }

    public final PositionEffect getPosition_effect() {
        return this.position_effect;
    }

    public final Side getSide() {
        return this.side;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final int getRatio_quantity() {
        return this.ratio_quantity;
    }

    public final PutCallCode getPut_call_code() {
        return this.put_call_code;
    }

    public final Decimal getTrade_value_multiplier() {
        return this.trade_value_multiplier;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnacleLegDetails(UUID uuid, String leg_id, PositionEffect position_effect, Side side, String symbol, int i, PutCallCode put_call_code, Decimal decimal, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = uuid;
        this.leg_id = leg_id;
        this.position_effect = position_effect;
        this.side = side;
        this.symbol = symbol;
        this.ratio_quantity = i;
        this.put_call_code = put_call_code;
        this.trade_value_multiplier = decimal;
        this.instrument_type = instrument_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24698newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PinnacleLegDetails)) {
            return false;
        }
        PinnacleLegDetails pinnacleLegDetails = (PinnacleLegDetails) other;
        return Intrinsics.areEqual(unknownFields(), pinnacleLegDetails.unknownFields()) && Intrinsics.areEqual(this.instrument_id, pinnacleLegDetails.instrument_id) && Intrinsics.areEqual(this.leg_id, pinnacleLegDetails.leg_id) && this.position_effect == pinnacleLegDetails.position_effect && this.side == pinnacleLegDetails.side && Intrinsics.areEqual(this.symbol, pinnacleLegDetails.symbol) && this.ratio_quantity == pinnacleLegDetails.ratio_quantity && this.put_call_code == pinnacleLegDetails.put_call_code && Intrinsics.areEqual(this.trade_value_multiplier, pinnacleLegDetails.trade_value_multiplier) && this.instrument_type == pinnacleLegDetails.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.instrument_id;
        int iHashCode2 = (((((((((((((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37) + this.leg_id.hashCode()) * 37) + this.position_effect.hashCode()) * 37) + this.side.hashCode()) * 37) + this.symbol.hashCode()) * 37) + Integer.hashCode(this.ratio_quantity)) * 37) + this.put_call_code.hashCode()) * 37;
        Decimal decimal = this.trade_value_multiplier;
        int iHashCode3 = ((iHashCode2 + (decimal != null ? decimal.hashCode() : 0)) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.instrument_id;
        if (uuid != null) {
            arrayList.add("instrument_id=" + uuid);
        }
        arrayList.add("leg_id=" + Internal.sanitize(this.leg_id));
        arrayList.add("position_effect=" + this.position_effect);
        arrayList.add("side=" + this.side);
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("ratio_quantity=" + this.ratio_quantity);
        arrayList.add("put_call_code=" + this.put_call_code);
        Decimal decimal = this.trade_value_multiplier;
        if (decimal != null) {
            arrayList.add("trade_value_multiplier=" + decimal);
        }
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PinnacleLegDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PinnacleLegDetails copy$default(PinnacleLegDetails pinnacleLegDetails, UUID uuid, String str, PositionEffect positionEffect, Side side, String str2, int i, PutCallCode putCallCode, Decimal decimal, InstrumentType instrumentType, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = pinnacleLegDetails.instrument_id;
        }
        if ((i2 & 2) != 0) {
            str = pinnacleLegDetails.leg_id;
        }
        if ((i2 & 4) != 0) {
            positionEffect = pinnacleLegDetails.position_effect;
        }
        if ((i2 & 8) != 0) {
            side = pinnacleLegDetails.side;
        }
        if ((i2 & 16) != 0) {
            str2 = pinnacleLegDetails.symbol;
        }
        if ((i2 & 32) != 0) {
            i = pinnacleLegDetails.ratio_quantity;
        }
        if ((i2 & 64) != 0) {
            putCallCode = pinnacleLegDetails.put_call_code;
        }
        if ((i2 & 128) != 0) {
            decimal = pinnacleLegDetails.trade_value_multiplier;
        }
        if ((i2 & 256) != 0) {
            instrumentType = pinnacleLegDetails.instrument_type;
        }
        if ((i2 & 512) != 0) {
            byteString = pinnacleLegDetails.unknownFields();
        }
        InstrumentType instrumentType2 = instrumentType;
        ByteString byteString2 = byteString;
        PutCallCode putCallCode2 = putCallCode;
        Decimal decimal2 = decimal;
        String str3 = str2;
        int i3 = i;
        return pinnacleLegDetails.copy(uuid, str, positionEffect, side, str3, i3, putCallCode2, decimal2, instrumentType2, byteString2);
    }

    public final PinnacleLegDetails copy(UUID instrument_id, String leg_id, PositionEffect position_effect, Side side, String symbol, int ratio_quantity, PutCallCode put_call_code, Decimal trade_value_multiplier, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PinnacleLegDetails(instrument_id, leg_id, position_effect, side, symbol, ratio_quantity, put_call_code, trade_value_multiplier, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PinnacleLegDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PinnacleLegDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.PinnacleLegDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PinnacleLegDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getInstrument_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLeg_id());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    size += PositionEffect.ADAPTER.encodedSizeWithTag(3, value.getPosition_effect());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(4, value.getSide());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSymbol());
                }
                if (value.getRatio_quantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    size += PutCallCode.ADAPTER.encodedSizeWithTag(7, value.getPut_call_code());
                }
                if (value.getTrade_value_multiplier() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(8, value.getTrade_value_multiplier());
                }
                return value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED ? size + InstrumentType.ADAPTER.encodedSizeWithTag(9, value.getInstrument_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PinnacleLegDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLeg_id());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 3, (int) value.getPosition_effect());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 4, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSymbol());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    PutCallCode.ADAPTER.encodeWithTag(writer, 7, (int) value.getPut_call_code());
                }
                if (value.getTrade_value_multiplier() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getTrade_value_multiplier());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 9, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PinnacleLegDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 9, (int) value.getInstrument_type());
                }
                if (value.getTrade_value_multiplier() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getTrade_value_multiplier());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    PutCallCode.ADAPTER.encodeWithTag(writer, 7, (int) value.getPut_call_code());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSymbol());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 4, (int) value.getSide());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 3, (int) value.getPosition_effect());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLeg_id());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleLegDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PositionEffect positionEffectDecode = PositionEffect.POSITION_EFFECT_UNSPECIFIED;
                Side side = Side.SIDE_UNSPECIFIED;
                PutCallCode putCallCode = PutCallCode.PUT_CALL_CODE_UNSPECIFIED;
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                int iIntValue = 0;
                UUID uuidDecode = null;
                Decimal decimalDecode = null;
                InstrumentType instrumentTypeDecode = instrumentType;
                PutCallCode putCallCodeDecode = putCallCode;
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
                                    try {
                                        positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        sideDecode = Side.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 7:
                                    try {
                                        putCallCodeDecode = PutCallCode.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 8:
                                    decimalDecode = Decimal.ADAPTER.decode(reader);
                                    break;
                                case 9:
                                    try {
                                        instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new PinnacleLegDetails(uuidDecode, strDecode, positionEffect, sideDecode, strDecode2, iIntValue, putCallCodeDecode, decimalDecode, instrumentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleLegDetails redact(PinnacleLegDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID instrument_id = value.getInstrument_id();
                UUID uuidRedact = instrument_id != null ? UUID.ADAPTER.redact(instrument_id) : null;
                Decimal trade_value_multiplier = value.getTrade_value_multiplier();
                return PinnacleLegDetails.copy$default(value, uuidRedact, null, null, null, null, 0, null, trade_value_multiplier != null ? Decimal.ADAPTER.redact(trade_value_multiplier) : null, null, ByteString.EMPTY, 382, null);
            }
        };
    }
}
