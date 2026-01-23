package com.robinhood.rosetta.nummus;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import p479j$.time.Instant;
import rosetta.order.Side;

/* compiled from: Execution.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJe\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b(\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b)\u0010\u001dR\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b-\u0010\u001d¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/Execution;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "id", "Lrosetta/order/Side;", "side", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "settlement_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "fee_amount", "unknownFields", "<init>", "(Lokio/ByteString;Lrosetta/order/Side;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lrosetta/order/Side;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/nummus/Execution;", "Lokio/ByteString;", "getId", "()Lokio/ByteString;", "Lrosetta/order/Side;", "getSide", "()Lrosetta/order/Side;", "Ljava/lang/String;", "getPrice", "getQuantity", "getSettlement_amount", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getFee_amount", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Execution extends Message {

    @JvmField
    public static final ProtoAdapter<Execution> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String fee_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "settlementAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String settlement_amount;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant timestamp;

    public Execution() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24734newBuilder();
    }

    public final ByteString getId() {
        return this.id;
    }

    public /* synthetic */ Execution(ByteString byteString, Side side, String str, String str2, String str3, Instant instant, String str4, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? ByteString.EMPTY : byteString2);
    }

    public final Side getSide() {
        return this.side;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getSettlement_amount() {
        return this.settlement_amount;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getFee_amount() {
        return this.fee_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Execution(ByteString id, Side side, String price, String quantity, String settlement_amount, Instant instant, String fee_amount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(settlement_amount, "settlement_amount");
        Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.side = side;
        this.price = price;
        this.quantity = quantity;
        this.settlement_amount = settlement_amount;
        this.timestamp = instant;
        this.fee_amount = fee_amount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24734newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Execution)) {
            return false;
        }
        Execution execution = (Execution) other;
        return Intrinsics.areEqual(unknownFields(), execution.unknownFields()) && Intrinsics.areEqual(this.id, execution.id) && this.side == execution.side && Intrinsics.areEqual(this.price, execution.price) && Intrinsics.areEqual(this.quantity, execution.quantity) && Intrinsics.areEqual(this.settlement_amount, execution.settlement_amount) && Intrinsics.areEqual(this.timestamp, execution.timestamp) && Intrinsics.areEqual(this.fee_amount, execution.fee_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.side.hashCode()) * 37) + this.price.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.settlement_amount.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.fee_amount.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("side=" + this.side);
        arrayList.add("price=" + Internal.sanitize(this.price));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("settlement_amount=" + Internal.sanitize(this.settlement_amount));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("fee_amount=" + Internal.sanitize(this.fee_amount));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Execution{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Execution copy$default(Execution execution, ByteString byteString, Side side, String str, String str2, String str3, Instant instant, String str4, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = execution.id;
        }
        if ((i & 2) != 0) {
            side = execution.side;
        }
        if ((i & 4) != 0) {
            str = execution.price;
        }
        if ((i & 8) != 0) {
            str2 = execution.quantity;
        }
        if ((i & 16) != 0) {
            str3 = execution.settlement_amount;
        }
        if ((i & 32) != 0) {
            instant = execution.timestamp;
        }
        if ((i & 64) != 0) {
            str4 = execution.fee_amount;
        }
        if ((i & 128) != 0) {
            byteString2 = execution.unknownFields();
        }
        String str5 = str4;
        ByteString byteString3 = byteString2;
        String str6 = str3;
        Instant instant2 = instant;
        return execution.copy(byteString, side, str, str2, str6, instant2, str5, byteString3);
    }

    public final Execution copy(ByteString id, Side side, String price, String quantity, String settlement_amount, Instant timestamp, String fee_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(settlement_amount, "settlement_amount");
        Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Execution(id, side, price, quantity, settlement_amount, timestamp, fee_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Execution.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Execution>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.Execution$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Execution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getId());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(2, value.getSide());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getSettlement_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSettlement_amount());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getTimestamp());
                }
                return !Intrinsics.areEqual(value.getFee_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getFee_amount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Execution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getSettlement_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSettlement_amount());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getFee_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getFee_amount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Execution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFee_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getFee_amount());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getSettlement_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSettlement_amount());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrice());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getSide());
                }
                if (Intrinsics.areEqual(value.getId(), ByteString.EMPTY)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Execution decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                Side side = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Instant instantDecode = null;
                Side sideDecode = side;
                String strDecode4 = strDecode3;
                while (true) {
                    ByteString byteString = byteStringDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    break;
                                case 2:
                                    try {
                                        sideDecode = Side.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 7:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new Execution(byteString, sideDecode, strDecode4, strDecode, strDecode2, instantDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                    byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Execution redact(Execution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return Execution.copy$default(value, null, null, null, null, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, ByteString.EMPTY, 95, null);
            }
        };
    }
}
