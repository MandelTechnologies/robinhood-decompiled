package equity_trading_tax_lots.proto.p460v1;

import com.robinhood.rosetta.common.Money;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: StreamTaxLotsSummaryResponse.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020&H\u0016J^\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "Lcom/squareup/wire/Message;", "", "lot_source_type", "Lequity_trading_tax_lots/proto/v1/LotSourceType;", "lot_count", "", "realized_gain_loss", "Lcom/robinhood/rosetta/common/Money;", "display_value", "is_gk_verified", "", "table_details", "Lequity_trading_tax_lots/proto/v1/TableDetails;", "order_summary_details", "Lequity_trading_tax_lots/proto/v1/OrderSummaryDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lequity_trading_tax_lots/proto/v1/LotSourceType;ILcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;ZLequity_trading_tax_lots/proto/v1/TableDetails;Lequity_trading_tax_lots/proto/v1/OrderSummaryDetails;Lokio/ByteString;)V", "getLot_source_type", "()Lequity_trading_tax_lots/proto/v1/LotSourceType;", "getLot_count", "()I", "getRealized_gain_loss", "()Lcom/robinhood/rosetta/common/Money;", "getDisplay_value", "()Z", "getTable_details", "()Lequity_trading_tax_lots/proto/v1/TableDetails;", "getOrder_summary_details", "()Lequity_trading_tax_lots/proto/v1/OrderSummaryDetails;", "newBuilder", "equals", "other", "", "hashCode", "toString", "", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamTaxLotsSummaryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamTaxLotsSummaryResponse> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "displayValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money display_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isGkVerified", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_gk_verified;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "lotCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int lot_count;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.LotSourceType#ADAPTER", jsonName = "lotSourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final LotSourceType lot_source_type;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.OrderSummaryDetails#ADAPTER", jsonName = "orderSummaryDetails", schemaIndex = 6, tag = 7)
    private final OrderSummaryDetails order_summary_details;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "realizedGainLoss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money realized_gain_loss;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TableDetails#ADAPTER", jsonName = "tableDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final TableDetails table_details;

    public StreamTaxLotsSummaryResponse() {
        this(null, 0, null, null, false, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28071newBuilder();
    }

    public final LotSourceType getLot_source_type() {
        return this.lot_source_type;
    }

    public /* synthetic */ StreamTaxLotsSummaryResponse(LotSourceType lotSourceType, int i, Money money, Money money2, boolean z, TableDetails tableDetails, OrderSummaryDetails orderSummaryDetails, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? LotSourceType.LOT_SOURCE_TYPE_UNSPECIFIED : lotSourceType, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : money, (i2 & 8) != 0 ? null : money2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : tableDetails, (i2 & 64) != 0 ? null : orderSummaryDetails, (i2 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getLot_count() {
        return this.lot_count;
    }

    public final Money getRealized_gain_loss() {
        return this.realized_gain_loss;
    }

    public final Money getDisplay_value() {
        return this.display_value;
    }

    /* renamed from: is_gk_verified, reason: from getter */
    public final boolean getIs_gk_verified() {
        return this.is_gk_verified;
    }

    public final TableDetails getTable_details() {
        return this.table_details;
    }

    public final OrderSummaryDetails getOrder_summary_details() {
        return this.order_summary_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotsSummaryResponse(LotSourceType lot_source_type, int i, Money money, Money money2, boolean z, TableDetails tableDetails, OrderSummaryDetails orderSummaryDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lot_source_type, "lot_source_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.lot_source_type = lot_source_type;
        this.lot_count = i;
        this.realized_gain_loss = money;
        this.display_value = money2;
        this.is_gk_verified = z;
        this.table_details = tableDetails;
        this.order_summary_details = orderSummaryDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28071newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamTaxLotsSummaryResponse)) {
            return false;
        }
        StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse = (StreamTaxLotsSummaryResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamTaxLotsSummaryResponse.unknownFields()) && this.lot_source_type == streamTaxLotsSummaryResponse.lot_source_type && this.lot_count == streamTaxLotsSummaryResponse.lot_count && Intrinsics.areEqual(this.realized_gain_loss, streamTaxLotsSummaryResponse.realized_gain_loss) && Intrinsics.areEqual(this.display_value, streamTaxLotsSummaryResponse.display_value) && this.is_gk_verified == streamTaxLotsSummaryResponse.is_gk_verified && Intrinsics.areEqual(this.table_details, streamTaxLotsSummaryResponse.table_details) && Intrinsics.areEqual(this.order_summary_details, streamTaxLotsSummaryResponse.order_summary_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.lot_source_type.hashCode()) * 37) + Integer.hashCode(this.lot_count)) * 37;
        Money money = this.realized_gain_loss;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.display_value;
        int iHashCode3 = (((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_gk_verified)) * 37;
        TableDetails tableDetails = this.table_details;
        int iHashCode4 = (iHashCode3 + (tableDetails != null ? tableDetails.hashCode() : 0)) * 37;
        OrderSummaryDetails orderSummaryDetails = this.order_summary_details;
        int iHashCode5 = iHashCode4 + (orderSummaryDetails != null ? orderSummaryDetails.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("lot_source_type=" + this.lot_source_type);
        arrayList.add("lot_count=" + this.lot_count);
        Money money = this.realized_gain_loss;
        if (money != null) {
            arrayList.add("realized_gain_loss=" + money);
        }
        Money money2 = this.display_value;
        if (money2 != null) {
            arrayList.add("display_value=" + money2);
        }
        arrayList.add("is_gk_verified=" + this.is_gk_verified);
        TableDetails tableDetails = this.table_details;
        if (tableDetails != null) {
            arrayList.add("table_details=" + tableDetails);
        }
        OrderSummaryDetails orderSummaryDetails = this.order_summary_details;
        if (orderSummaryDetails != null) {
            arrayList.add("order_summary_details=" + orderSummaryDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamTaxLotsSummaryResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamTaxLotsSummaryResponse copy$default(StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, LotSourceType lotSourceType, int i, Money money, Money money2, boolean z, TableDetails tableDetails, OrderSummaryDetails orderSummaryDetails, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lotSourceType = streamTaxLotsSummaryResponse.lot_source_type;
        }
        if ((i2 & 2) != 0) {
            i = streamTaxLotsSummaryResponse.lot_count;
        }
        if ((i2 & 4) != 0) {
            money = streamTaxLotsSummaryResponse.realized_gain_loss;
        }
        if ((i2 & 8) != 0) {
            money2 = streamTaxLotsSummaryResponse.display_value;
        }
        if ((i2 & 16) != 0) {
            z = streamTaxLotsSummaryResponse.is_gk_verified;
        }
        if ((i2 & 32) != 0) {
            tableDetails = streamTaxLotsSummaryResponse.table_details;
        }
        if ((i2 & 64) != 0) {
            orderSummaryDetails = streamTaxLotsSummaryResponse.order_summary_details;
        }
        if ((i2 & 128) != 0) {
            byteString = streamTaxLotsSummaryResponse.unknownFields();
        }
        OrderSummaryDetails orderSummaryDetails2 = orderSummaryDetails;
        ByteString byteString2 = byteString;
        boolean z2 = z;
        TableDetails tableDetails2 = tableDetails;
        return streamTaxLotsSummaryResponse.copy(lotSourceType, i, money, money2, z2, tableDetails2, orderSummaryDetails2, byteString2);
    }

    public final StreamTaxLotsSummaryResponse copy(LotSourceType lot_source_type, int lot_count, Money realized_gain_loss, Money display_value, boolean is_gk_verified, TableDetails table_details, OrderSummaryDetails order_summary_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lot_source_type, "lot_source_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamTaxLotsSummaryResponse(lot_source_type, lot_count, realized_gain_loss, display_value, is_gk_verified, table_details, order_summary_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamTaxLotsSummaryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamTaxLotsSummaryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsSummaryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamTaxLotsSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLot_source_type() != LotSourceType.LOT_SOURCE_TYPE_UNSPECIFIED) {
                    size += LotSourceType.ADAPTER.encodedSizeWithTag(1, value.getLot_source_type());
                }
                if (value.getLot_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getLot_count()));
                }
                if (value.getRealized_gain_loss() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getRealized_gain_loss());
                }
                if (value.getDisplay_value() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getDisplay_value());
                }
                if (value.getIs_gk_verified()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_gk_verified()));
                }
                if (value.getTable_details() != null) {
                    size += TableDetails.ADAPTER.encodedSizeWithTag(6, value.getTable_details());
                }
                return size + OrderSummaryDetails.ADAPTER.encodedSizeWithTag(7, value.getOrder_summary_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamTaxLotsSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLot_source_type() != LotSourceType.LOT_SOURCE_TYPE_UNSPECIFIED) {
                    LotSourceType.ADAPTER.encodeWithTag(writer, 1, (int) value.getLot_source_type());
                }
                if (value.getLot_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLot_count()));
                }
                if (value.getRealized_gain_loss() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getRealized_gain_loss());
                }
                if (value.getDisplay_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getDisplay_value());
                }
                if (value.getIs_gk_verified()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_gk_verified()));
                }
                if (value.getTable_details() != null) {
                    TableDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getTable_details());
                }
                OrderSummaryDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_summary_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamTaxLotsSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OrderSummaryDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_summary_details());
                if (value.getTable_details() != null) {
                    TableDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getTable_details());
                }
                if (value.getIs_gk_verified()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_gk_verified()));
                }
                if (value.getDisplay_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getDisplay_value());
                }
                if (value.getRealized_gain_loss() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getRealized_gain_loss());
                }
                if (value.getLot_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLot_count()));
                }
                if (value.getLot_source_type() != LotSourceType.LOT_SOURCE_TYPE_UNSPECIFIED) {
                    LotSourceType.ADAPTER.encodeWithTag(writer, 1, (int) value.getLot_source_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsSummaryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LotSourceType lotSourceTypeDecode = LotSourceType.LOT_SOURCE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                int iIntValue = 0;
                boolean zBooleanValue = false;
                Money moneyDecode2 = null;
                TableDetails tableDetailsDecode = null;
                OrderSummaryDetails orderSummaryDetailsDecode = null;
                while (true) {
                    LotSourceType lotSourceType = lotSourceTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        lotSourceTypeDecode = LotSourceType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 3:
                                    moneyDecode = Money.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    moneyDecode2 = Money.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 6:
                                    tableDetailsDecode = TableDetails.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    orderSummaryDetailsDecode = OrderSummaryDetails.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new StreamTaxLotsSummaryResponse(lotSourceType, iIntValue, moneyDecode, moneyDecode2, zBooleanValue, tableDetailsDecode, orderSummaryDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsSummaryResponse redact(StreamTaxLotsSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money realized_gain_loss = value.getRealized_gain_loss();
                Money moneyRedact = realized_gain_loss != null ? Money.ADAPTER.redact(realized_gain_loss) : null;
                Money display_value = value.getDisplay_value();
                Money moneyRedact2 = display_value != null ? Money.ADAPTER.redact(display_value) : null;
                TableDetails table_details = value.getTable_details();
                TableDetails tableDetailsRedact = table_details != null ? TableDetails.ADAPTER.redact(table_details) : null;
                OrderSummaryDetails order_summary_details = value.getOrder_summary_details();
                return StreamTaxLotsSummaryResponse.copy$default(value, null, 0, moneyRedact, moneyRedact2, false, tableDetailsRedact, order_summary_details != null ? OrderSummaryDetails.ADAPTER.redact(order_summary_details) : null, ByteString.EMPTY, 19, null);
            }
        };
    }
}
