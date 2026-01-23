package equity_trading_tax_lots.proto.p460v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: StreamTaxLotsResponse.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bk\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0007H\u0016Jj\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;", "Lcom/squareup/wire/Message;", "", "lots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "order_id", "", "rhs_account_number", "instrument_id", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "sort_direction", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "max_gain_loss", "max_cost_per_share", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotSort;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getRhs_account_number", "getInstrument_id", "getSort", "()Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "getSort_direction", "()Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "getMax_gain_loss", "getMax_cost_per_share", "getLots", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamTaxLotsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamTaxLotsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String instrument_id;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotInformation#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<TaxLotInformation> lots;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxCostPerShare", schemaIndex = 7, tag = 8)
    private final String max_cost_per_share;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxGainLoss", schemaIndex = 6, tag = 7)
    private final String max_gain_loss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rhs_account_number;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotSort#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final TaxLotSort sort;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotSortDirection#ADAPTER", jsonName = "sortDirection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final TaxLotSortDirection sort_direction;

    public StreamTaxLotsResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28063newBuilder();
    }

    public /* synthetic */ StreamTaxLotsResponse(List list, String str, String str2, String str3, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? TaxLotSort.TAX_LOT_SORT_UNSPECIFIED : taxLotSort, (i & 32) != 0 ? TaxLotSortDirection.TAX_LOT_SORT_DIRECTION_UNSPECIFIED : taxLotSortDirection, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final TaxLotSort getSort() {
        return this.sort;
    }

    public final TaxLotSortDirection getSort_direction() {
        return this.sort_direction;
    }

    public final String getMax_gain_loss() {
        return this.max_gain_loss;
    }

    public final String getMax_cost_per_share() {
        return this.max_cost_per_share;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotsResponse(List<TaxLotInformation> lots, String order_id, String rhs_account_number, String instrument_id, TaxLotSort sort, TaxLotSortDirection sort_direction, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lots, "lots");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.rhs_account_number = rhs_account_number;
        this.instrument_id = instrument_id;
        this.sort = sort;
        this.sort_direction = sort_direction;
        this.max_gain_loss = str;
        this.max_cost_per_share = str2;
        this.lots = Internal.immutableCopyOf("lots", lots);
    }

    public final List<TaxLotInformation> getLots() {
        return this.lots;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28063newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamTaxLotsResponse)) {
            return false;
        }
        StreamTaxLotsResponse streamTaxLotsResponse = (StreamTaxLotsResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamTaxLotsResponse.unknownFields()) && Intrinsics.areEqual(this.lots, streamTaxLotsResponse.lots) && Intrinsics.areEqual(this.order_id, streamTaxLotsResponse.order_id) && Intrinsics.areEqual(this.rhs_account_number, streamTaxLotsResponse.rhs_account_number) && Intrinsics.areEqual(this.instrument_id, streamTaxLotsResponse.instrument_id) && this.sort == streamTaxLotsResponse.sort && this.sort_direction == streamTaxLotsResponse.sort_direction && Intrinsics.areEqual(this.max_gain_loss, streamTaxLotsResponse.max_gain_loss) && Intrinsics.areEqual(this.max_cost_per_share, streamTaxLotsResponse.max_cost_per_share);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.lots.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.sort.hashCode()) * 37) + this.sort_direction.hashCode()) * 37;
        String str = this.max_gain_loss;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.max_cost_per_share;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.lots.isEmpty()) {
            arrayList.add("lots=" + this.lots);
        }
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("sort=" + this.sort);
        arrayList.add("sort_direction=" + this.sort_direction);
        String str = this.max_gain_loss;
        if (str != null) {
            arrayList.add("max_gain_loss=" + Internal.sanitize(str));
        }
        String str2 = this.max_cost_per_share;
        if (str2 != null) {
            arrayList.add("max_cost_per_share=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamTaxLotsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamTaxLotsResponse copy$default(StreamTaxLotsResponse streamTaxLotsResponse, List list, String str, String str2, String str3, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = streamTaxLotsResponse.lots;
        }
        if ((i & 2) != 0) {
            str = streamTaxLotsResponse.order_id;
        }
        if ((i & 4) != 0) {
            str2 = streamTaxLotsResponse.rhs_account_number;
        }
        if ((i & 8) != 0) {
            str3 = streamTaxLotsResponse.instrument_id;
        }
        if ((i & 16) != 0) {
            taxLotSort = streamTaxLotsResponse.sort;
        }
        if ((i & 32) != 0) {
            taxLotSortDirection = streamTaxLotsResponse.sort_direction;
        }
        if ((i & 64) != 0) {
            str4 = streamTaxLotsResponse.max_gain_loss;
        }
        if ((i & 128) != 0) {
            str5 = streamTaxLotsResponse.max_cost_per_share;
        }
        if ((i & 256) != 0) {
            byteString = streamTaxLotsResponse.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        TaxLotSortDirection taxLotSortDirection2 = taxLotSortDirection;
        String str7 = str4;
        TaxLotSort taxLotSort2 = taxLotSort;
        String str8 = str2;
        return streamTaxLotsResponse.copy(list, str, str8, str3, taxLotSort2, taxLotSortDirection2, str7, str6, byteString2);
    }

    public final StreamTaxLotsResponse copy(List<TaxLotInformation> lots, String order_id, String rhs_account_number, String instrument_id, TaxLotSort sort, TaxLotSortDirection sort_direction, String max_gain_loss, String max_cost_per_share, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lots, "lots");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamTaxLotsResponse(lots, order_id, rhs_account_number, instrument_id, sort, sort_direction, max_gain_loss, max_cost_per_share, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamTaxLotsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamTaxLotsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamTaxLotsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + TaxLotInformation.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getLots());
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getInstrument_id());
                }
                if (value.getSort() != TaxLotSort.TAX_LOT_SORT_UNSPECIFIED) {
                    size += TaxLotSort.ADAPTER.encodedSizeWithTag(5, value.getSort());
                }
                if (value.getSort_direction() != TaxLotSortDirection.TAX_LOT_SORT_DIRECTION_UNSPECIFIED) {
                    size += TaxLotSortDirection.ADAPTER.encodedSizeWithTag(6, value.getSort_direction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(7, value.getMax_gain_loss()) + protoAdapter.encodedSizeWithTag(8, value.getMax_cost_per_share());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamTaxLotsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                TaxLotInformation.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLots());
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInstrument_id());
                }
                if (value.getSort() != TaxLotSort.TAX_LOT_SORT_UNSPECIFIED) {
                    TaxLotSort.ADAPTER.encodeWithTag(writer, 5, (int) value.getSort());
                }
                if (value.getSort_direction() != TaxLotSortDirection.TAX_LOT_SORT_DIRECTION_UNSPECIFIED) {
                    TaxLotSortDirection.ADAPTER.encodeWithTag(writer, 6, (int) value.getSort_direction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getMax_gain_loss());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getMax_cost_per_share());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamTaxLotsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getMax_cost_per_share());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getMax_gain_loss());
                if (value.getSort_direction() != TaxLotSortDirection.TAX_LOT_SORT_DIRECTION_UNSPECIFIED) {
                    TaxLotSortDirection.ADAPTER.encodeWithTag(writer, 6, (int) value.getSort_direction());
                }
                if (value.getSort() != TaxLotSort.TAX_LOT_SORT_UNSPECIFIED) {
                    TaxLotSort.ADAPTER.encodeWithTag(writer, 5, (int) value.getSort());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                TaxLotInformation.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLots());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                TaxLotSort taxLotSortDecode = TaxLotSort.TAX_LOT_SORT_UNSPECIFIED;
                TaxLotSortDirection taxLotSortDirection = TaxLotSortDirection.TAX_LOT_SORT_DIRECTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                String strDecode4 = null;
                TaxLotSortDirection taxLotSortDirectionDecode = taxLotSortDirection;
                String strDecode5 = strDecode2;
                while (true) {
                    TaxLotSort taxLotSort = taxLotSortDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    arrayList.add(TaxLotInformation.ADAPTER.decode(reader));
                                    break;
                                case 2:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        taxLotSortDecode = TaxLotSort.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        taxLotSortDirectionDecode = TaxLotSortDirection.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 7:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new StreamTaxLotsResponse(arrayList, strDecode5, strDecode, strDecode2, taxLotSort, taxLotSortDirectionDecode, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsResponse redact(StreamTaxLotsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamTaxLotsResponse.copy$default(value, Internal.m26823redactElements(value.getLots(), TaxLotInformation.ADAPTER), null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
            }
        };
    }
}
