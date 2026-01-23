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

/* compiled from: CimMetadata.kt */
@kotlin.Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016Jb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CimMetadata;", "Lcom/squareup/wire/Message;", "", "im_inventory_sent_at", "Lcom/robinhood/rosetta/mainst/Time;", "im_open_sell_sent_at", "aggregate_position_lower_bound", "Lcom/robinhood/rosetta/mainst/Decimal;", "is_notional_overdelivery", "", "original_leftover_quantity", "inventory_position", "open_sell_position", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Decimal;ZLcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lokio/ByteString;)V", "getIm_inventory_sent_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getIm_open_sell_sent_at", "getAggregate_position_lower_bound", "()Lcom/robinhood/rosetta/mainst/Decimal;", "()Z", "getOriginal_leftover_quantity", "getInventory_position", "getOpen_sell_position", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CimMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<CimMetadata> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "aggregatePositionLowerBound", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 5)
    private final Decimal aggregate_position_lower_bound;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "imInventorySentAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Time im_inventory_sent_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "imOpenSellSentAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Time im_open_sell_sent_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "inventoryPosition", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 8)
    private final Decimal inventory_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isNotionalOverdelivery", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 6)
    private final boolean is_notional_overdelivery;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "openSellPosition", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 9)
    private final Decimal open_sell_position;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "originalLeftoverQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 7)
    private final Decimal original_leftover_quantity;

    public CimMetadata() {
        this(null, null, null, false, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24643newBuilder();
    }

    public final Time getIm_inventory_sent_at() {
        return this.im_inventory_sent_at;
    }

    public final Time getIm_open_sell_sent_at() {
        return this.im_open_sell_sent_at;
    }

    public final Decimal getAggregate_position_lower_bound() {
        return this.aggregate_position_lower_bound;
    }

    /* renamed from: is_notional_overdelivery, reason: from getter */
    public final boolean getIs_notional_overdelivery() {
        return this.is_notional_overdelivery;
    }

    public final Decimal getOriginal_leftover_quantity() {
        return this.original_leftover_quantity;
    }

    public final Decimal getInventory_position() {
        return this.inventory_position;
    }

    public final Decimal getOpen_sell_position() {
        return this.open_sell_position;
    }

    public /* synthetic */ CimMetadata(Time time, Time time2, Decimal decimal, boolean z, Decimal decimal2, Decimal decimal3, Decimal decimal4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : time, (i & 2) != 0 ? null : time2, (i & 4) != 0 ? null : decimal, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : decimal2, (i & 32) != 0 ? null : decimal3, (i & 64) != 0 ? null : decimal4, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CimMetadata(Time time, Time time2, Decimal decimal, boolean z, Decimal decimal2, Decimal decimal3, Decimal decimal4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.im_inventory_sent_at = time;
        this.im_open_sell_sent_at = time2;
        this.aggregate_position_lower_bound = decimal;
        this.is_notional_overdelivery = z;
        this.original_leftover_quantity = decimal2;
        this.inventory_position = decimal3;
        this.open_sell_position = decimal4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24643newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CimMetadata)) {
            return false;
        }
        CimMetadata cimMetadata = (CimMetadata) other;
        return Intrinsics.areEqual(unknownFields(), cimMetadata.unknownFields()) && Intrinsics.areEqual(this.im_inventory_sent_at, cimMetadata.im_inventory_sent_at) && Intrinsics.areEqual(this.im_open_sell_sent_at, cimMetadata.im_open_sell_sent_at) && Intrinsics.areEqual(this.aggregate_position_lower_bound, cimMetadata.aggregate_position_lower_bound) && this.is_notional_overdelivery == cimMetadata.is_notional_overdelivery && Intrinsics.areEqual(this.original_leftover_quantity, cimMetadata.original_leftover_quantity) && Intrinsics.areEqual(this.inventory_position, cimMetadata.inventory_position) && Intrinsics.areEqual(this.open_sell_position, cimMetadata.open_sell_position);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Time time = this.im_inventory_sent_at;
        int iHashCode2 = (iHashCode + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.im_open_sell_sent_at;
        int iHashCode3 = (iHashCode2 + (time2 != null ? time2.hashCode() : 0)) * 37;
        Decimal decimal = this.aggregate_position_lower_bound;
        int iHashCode4 = (((iHashCode3 + (decimal != null ? decimal.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_notional_overdelivery)) * 37;
        Decimal decimal2 = this.original_leftover_quantity;
        int iHashCode5 = (iHashCode4 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.inventory_position;
        int iHashCode6 = (iHashCode5 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        Decimal decimal4 = this.open_sell_position;
        int iHashCode7 = iHashCode6 + (decimal4 != null ? decimal4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Time time = this.im_inventory_sent_at;
        if (time != null) {
            arrayList.add("im_inventory_sent_at=" + time);
        }
        Time time2 = this.im_open_sell_sent_at;
        if (time2 != null) {
            arrayList.add("im_open_sell_sent_at=" + time2);
        }
        Decimal decimal = this.aggregate_position_lower_bound;
        if (decimal != null) {
            arrayList.add("aggregate_position_lower_bound=" + decimal);
        }
        arrayList.add("is_notional_overdelivery=" + this.is_notional_overdelivery);
        Decimal decimal2 = this.original_leftover_quantity;
        if (decimal2 != null) {
            arrayList.add("original_leftover_quantity=" + decimal2);
        }
        Decimal decimal3 = this.inventory_position;
        if (decimal3 != null) {
            arrayList.add("inventory_position=" + decimal3);
        }
        Decimal decimal4 = this.open_sell_position;
        if (decimal4 != null) {
            arrayList.add("open_sell_position=" + decimal4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CimMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CimMetadata copy$default(CimMetadata cimMetadata, Time time, Time time2, Decimal decimal, boolean z, Decimal decimal2, Decimal decimal3, Decimal decimal4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            time = cimMetadata.im_inventory_sent_at;
        }
        if ((i & 2) != 0) {
            time2 = cimMetadata.im_open_sell_sent_at;
        }
        if ((i & 4) != 0) {
            decimal = cimMetadata.aggregate_position_lower_bound;
        }
        if ((i & 8) != 0) {
            z = cimMetadata.is_notional_overdelivery;
        }
        if ((i & 16) != 0) {
            decimal2 = cimMetadata.original_leftover_quantity;
        }
        if ((i & 32) != 0) {
            decimal3 = cimMetadata.inventory_position;
        }
        if ((i & 64) != 0) {
            decimal4 = cimMetadata.open_sell_position;
        }
        if ((i & 128) != 0) {
            byteString = cimMetadata.unknownFields();
        }
        Decimal decimal5 = decimal4;
        ByteString byteString2 = byteString;
        Decimal decimal6 = decimal2;
        Decimal decimal7 = decimal3;
        return cimMetadata.copy(time, time2, decimal, z, decimal6, decimal7, decimal5, byteString2);
    }

    public final CimMetadata copy(Time im_inventory_sent_at, Time im_open_sell_sent_at, Decimal aggregate_position_lower_bound, boolean is_notional_overdelivery, Decimal original_leftover_quantity, Decimal inventory_position, Decimal open_sell_position, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CimMetadata(im_inventory_sent_at, im_open_sell_sent_at, aggregate_position_lower_bound, is_notional_overdelivery, original_leftover_quantity, inventory_position, open_sell_position, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CimMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CimMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.CimMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CimMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIm_inventory_sent_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(1, value.getIm_inventory_sent_at());
                }
                if (value.getIm_open_sell_sent_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(2, value.getIm_open_sell_sent_at());
                }
                if (value.getAggregate_position_lower_bound() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(5, value.getAggregate_position_lower_bound());
                }
                if (value.getIs_notional_overdelivery()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_notional_overdelivery()));
                }
                if (value.getOriginal_leftover_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(7, value.getOriginal_leftover_quantity());
                }
                if (value.getInventory_position() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(8, value.getInventory_position());
                }
                return value.getOpen_sell_position() != null ? size + Decimal.ADAPTER.encodedSizeWithTag(9, value.getOpen_sell_position()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CimMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIm_inventory_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 1, (int) value.getIm_inventory_sent_at());
                }
                if (value.getIm_open_sell_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getIm_open_sell_sent_at());
                }
                if (value.getAggregate_position_lower_bound() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getAggregate_position_lower_bound());
                }
                if (value.getIs_notional_overdelivery()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_notional_overdelivery()));
                }
                if (value.getOriginal_leftover_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getOriginal_leftover_quantity());
                }
                if (value.getInventory_position() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getInventory_position());
                }
                if (value.getOpen_sell_position() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getOpen_sell_position());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CimMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOpen_sell_position() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getOpen_sell_position());
                }
                if (value.getInventory_position() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getInventory_position());
                }
                if (value.getOriginal_leftover_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getOriginal_leftover_quantity());
                }
                if (value.getIs_notional_overdelivery()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_notional_overdelivery()));
                }
                if (value.getAggregate_position_lower_bound() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getAggregate_position_lower_bound());
                }
                if (value.getIm_open_sell_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getIm_open_sell_sent_at());
                }
                if (value.getIm_inventory_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 1, (int) value.getIm_inventory_sent_at());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CimMetadata redact(CimMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Time im_inventory_sent_at = value.getIm_inventory_sent_at();
                Time timeRedact = im_inventory_sent_at != null ? Time.ADAPTER.redact(im_inventory_sent_at) : null;
                Time im_open_sell_sent_at = value.getIm_open_sell_sent_at();
                Time timeRedact2 = im_open_sell_sent_at != null ? Time.ADAPTER.redact(im_open_sell_sent_at) : null;
                Decimal aggregate_position_lower_bound = value.getAggregate_position_lower_bound();
                Decimal decimalRedact = aggregate_position_lower_bound != null ? Decimal.ADAPTER.redact(aggregate_position_lower_bound) : null;
                Decimal original_leftover_quantity = value.getOriginal_leftover_quantity();
                Decimal decimalRedact2 = original_leftover_quantity != null ? Decimal.ADAPTER.redact(original_leftover_quantity) : null;
                Decimal inventory_position = value.getInventory_position();
                Decimal decimalRedact3 = inventory_position != null ? Decimal.ADAPTER.redact(inventory_position) : null;
                Decimal open_sell_position = value.getOpen_sell_position();
                return CimMetadata.copy$default(value, timeRedact, timeRedact2, decimalRedact, false, decimalRedact2, decimalRedact3, open_sell_position != null ? Decimal.ADAPTER.redact(open_sell_position) : null, ByteString.EMPTY, 8, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CimMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Time timeDecode = null;
                Decimal decimalDecode = null;
                Decimal decimalDecode2 = null;
                Decimal decimalDecode3 = null;
                Decimal decimalDecode4 = null;
                boolean zBooleanValue = false;
                Time timeDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CimMetadata(timeDecode, timeDecode2, decimalDecode, zBooleanValue, decimalDecode2, decimalDecode3, decimalDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        timeDecode = Time.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        timeDecode2 = Time.ADAPTER.decode(reader);
                    } else {
                        switch (iNextTag) {
                            case 5:
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                decimalDecode2 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 8:
                                decimalDecode3 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 9:
                                decimalDecode4 = Decimal.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    }
                }
            }
        };
    }
}
