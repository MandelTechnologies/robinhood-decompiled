package equity_trading_tax_lots.proto.p460v1;

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

/* compiled from: StreamTaxLotsRequest.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010(\u001a\u00020\u0002H\u0017J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016Jz\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00062"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequest;", "Lcom/squareup/wire/Message;", "", "rhs_account_number", "", "order_id", "instrument_id", "selected_terms", "", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "disposal_kind", "Lequity_trading_tax_lots/proto/v1/DisposalKind;", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "sort_direction", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "lot_status", "Lequity_trading_tax_lots/proto/v1/TaxLotStatus;", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lequity_trading_tax_lots/proto/v1/DisposalKind;Lequity_trading_tax_lots/proto/v1/TaxLotSort;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;Lequity_trading_tax_lots/proto/v1/TaxLotStatus;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Lokio/ByteString;)V", "getRhs_account_number", "()Ljava/lang/String;", "getOrder_id", "getInstrument_id", "getDisposal_kind", "()Lequity_trading_tax_lots/proto/v1/DisposalKind;", "getSort", "()Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "getSort_direction", "()Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "getLot_status", "()Lequity_trading_tax_lots/proto/v1/TaxLotStatus;", "getSelection_strategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "getSelected_terms", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamTaxLotsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<StreamTaxLotsRequest> ADAPTER;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.DisposalKind#ADAPTER", jsonName = "disposalKind", schemaIndex = 4, tag = 5)
    private final DisposalKind disposal_kind;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotStatus#ADAPTER", jsonName = "lotStatus", schemaIndex = 7, tag = 8)
    private final TaxLotStatus lot_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rhs_account_number;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotTerm#ADAPTER", jsonName = "selectedTerms", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<TaxLotTerm> selected_terms;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.SelectionStrategy#ADAPTER", jsonName = "selectionStrategy", schemaIndex = 8, tag = 9)
    private final SelectionStrategy selection_strategy;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotSort#ADAPTER", schemaIndex = 5, tag = 6)
    private final TaxLotSort sort;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotSortDirection#ADAPTER", jsonName = "sortDirection", schemaIndex = 6, tag = 7)
    private final TaxLotSortDirection sort_direction;

    public StreamTaxLotsRequest() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ StreamTaxLotsRequest(String str, String str2, String str3, List list, DisposalKind disposalKind, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, TaxLotStatus taxLotStatus, SelectionStrategy selectionStrategy, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : disposalKind, (i & 32) != 0 ? null : taxLotSort, (i & 64) != 0 ? null : taxLotSortDirection, (i & 128) != 0 ? null : taxLotStatus, (i & 256) != 0 ? null : selectionStrategy, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28062newBuilder();
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final DisposalKind getDisposal_kind() {
        return this.disposal_kind;
    }

    public final TaxLotSort getSort() {
        return this.sort;
    }

    public final TaxLotSortDirection getSort_direction() {
        return this.sort_direction;
    }

    public final TaxLotStatus getLot_status() {
        return this.lot_status;
    }

    public final SelectionStrategy getSelection_strategy() {
        return this.selection_strategy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotsRequest(String rhs_account_number, String order_id, String instrument_id, List<? extends TaxLotTerm> selected_terms, DisposalKind disposalKind, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, TaxLotStatus taxLotStatus, SelectionStrategy selectionStrategy, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(selected_terms, "selected_terms");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rhs_account_number = rhs_account_number;
        this.order_id = order_id;
        this.instrument_id = instrument_id;
        this.disposal_kind = disposalKind;
        this.sort = taxLotSort;
        this.sort_direction = taxLotSortDirection;
        this.lot_status = taxLotStatus;
        this.selection_strategy = selectionStrategy;
        this.selected_terms = Internal.immutableCopyOf("selected_terms", selected_terms);
    }

    public final List<TaxLotTerm> getSelected_terms() {
        return this.selected_terms;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28062newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamTaxLotsRequest)) {
            return false;
        }
        StreamTaxLotsRequest streamTaxLotsRequest = (StreamTaxLotsRequest) other;
        return Intrinsics.areEqual(unknownFields(), streamTaxLotsRequest.unknownFields()) && Intrinsics.areEqual(this.rhs_account_number, streamTaxLotsRequest.rhs_account_number) && Intrinsics.areEqual(this.order_id, streamTaxLotsRequest.order_id) && Intrinsics.areEqual(this.instrument_id, streamTaxLotsRequest.instrument_id) && Intrinsics.areEqual(this.selected_terms, streamTaxLotsRequest.selected_terms) && this.disposal_kind == streamTaxLotsRequest.disposal_kind && this.sort == streamTaxLotsRequest.sort && this.sort_direction == streamTaxLotsRequest.sort_direction && this.lot_status == streamTaxLotsRequest.lot_status && this.selection_strategy == streamTaxLotsRequest.selection_strategy;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.rhs_account_number.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.selected_terms.hashCode()) * 37;
        DisposalKind disposalKind = this.disposal_kind;
        int iHashCode2 = (iHashCode + (disposalKind != null ? disposalKind.hashCode() : 0)) * 37;
        TaxLotSort taxLotSort = this.sort;
        int iHashCode3 = (iHashCode2 + (taxLotSort != null ? taxLotSort.hashCode() : 0)) * 37;
        TaxLotSortDirection taxLotSortDirection = this.sort_direction;
        int iHashCode4 = (iHashCode3 + (taxLotSortDirection != null ? taxLotSortDirection.hashCode() : 0)) * 37;
        TaxLotStatus taxLotStatus = this.lot_status;
        int iHashCode5 = (iHashCode4 + (taxLotStatus != null ? taxLotStatus.hashCode() : 0)) * 37;
        SelectionStrategy selectionStrategy = this.selection_strategy;
        int iHashCode6 = iHashCode5 + (selectionStrategy != null ? selectionStrategy.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        if (!this.selected_terms.isEmpty()) {
            arrayList.add("selected_terms=" + this.selected_terms);
        }
        DisposalKind disposalKind = this.disposal_kind;
        if (disposalKind != null) {
            arrayList.add("disposal_kind=" + disposalKind);
        }
        TaxLotSort taxLotSort = this.sort;
        if (taxLotSort != null) {
            arrayList.add("sort=" + taxLotSort);
        }
        TaxLotSortDirection taxLotSortDirection = this.sort_direction;
        if (taxLotSortDirection != null) {
            arrayList.add("sort_direction=" + taxLotSortDirection);
        }
        TaxLotStatus taxLotStatus = this.lot_status;
        if (taxLotStatus != null) {
            arrayList.add("lot_status=" + taxLotStatus);
        }
        SelectionStrategy selectionStrategy = this.selection_strategy;
        if (selectionStrategy != null) {
            arrayList.add("selection_strategy=" + selectionStrategy);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamTaxLotsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamTaxLotsRequest copy$default(StreamTaxLotsRequest streamTaxLotsRequest, String str, String str2, String str3, List list, DisposalKind disposalKind, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, TaxLotStatus taxLotStatus, SelectionStrategy selectionStrategy, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamTaxLotsRequest.rhs_account_number;
        }
        if ((i & 2) != 0) {
            str2 = streamTaxLotsRequest.order_id;
        }
        if ((i & 4) != 0) {
            str3 = streamTaxLotsRequest.instrument_id;
        }
        if ((i & 8) != 0) {
            list = streamTaxLotsRequest.selected_terms;
        }
        if ((i & 16) != 0) {
            disposalKind = streamTaxLotsRequest.disposal_kind;
        }
        if ((i & 32) != 0) {
            taxLotSort = streamTaxLotsRequest.sort;
        }
        if ((i & 64) != 0) {
            taxLotSortDirection = streamTaxLotsRequest.sort_direction;
        }
        if ((i & 128) != 0) {
            taxLotStatus = streamTaxLotsRequest.lot_status;
        }
        if ((i & 256) != 0) {
            selectionStrategy = streamTaxLotsRequest.selection_strategy;
        }
        if ((i & 512) != 0) {
            byteString = streamTaxLotsRequest.unknownFields();
        }
        SelectionStrategy selectionStrategy2 = selectionStrategy;
        ByteString byteString2 = byteString;
        TaxLotSortDirection taxLotSortDirection2 = taxLotSortDirection;
        TaxLotStatus taxLotStatus2 = taxLotStatus;
        DisposalKind disposalKind2 = disposalKind;
        TaxLotSort taxLotSort2 = taxLotSort;
        return streamTaxLotsRequest.copy(str, str2, str3, list, disposalKind2, taxLotSort2, taxLotSortDirection2, taxLotStatus2, selectionStrategy2, byteString2);
    }

    public final StreamTaxLotsRequest copy(String rhs_account_number, String order_id, String instrument_id, List<? extends TaxLotTerm> selected_terms, DisposalKind disposal_kind, TaxLotSort sort, TaxLotSortDirection sort_direction, TaxLotStatus lot_status, SelectionStrategy selection_strategy, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(selected_terms, "selected_terms");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamTaxLotsRequest(rhs_account_number, order_id, instrument_id, selected_terms, disposal_kind, sort, sort_direction, lot_status, selection_strategy, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamTaxLotsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamTaxLotsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamTaxLotsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstrument_id());
                }
                return size + TaxLotTerm.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getSelected_terms()) + DisposalKind.ADAPTER.encodedSizeWithTag(5, value.getDisposal_kind()) + TaxLotSort.ADAPTER.encodedSizeWithTag(6, value.getSort()) + TaxLotSortDirection.ADAPTER.encodedSizeWithTag(7, value.getSort_direction()) + TaxLotStatus.ADAPTER.encodedSizeWithTag(8, value.getLot_status()) + SelectionStrategy.ADAPTER.encodedSizeWithTag(9, value.getSelection_strategy());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamTaxLotsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                TaxLotTerm.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSelected_terms());
                DisposalKind.ADAPTER.encodeWithTag(writer, 5, (int) value.getDisposal_kind());
                TaxLotSort.ADAPTER.encodeWithTag(writer, 6, (int) value.getSort());
                TaxLotSortDirection.ADAPTER.encodeWithTag(writer, 7, (int) value.getSort_direction());
                TaxLotStatus.ADAPTER.encodeWithTag(writer, 8, (int) value.getLot_status());
                SelectionStrategy.ADAPTER.encodeWithTag(writer, 9, (int) value.getSelection_strategy());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamTaxLotsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SelectionStrategy.ADAPTER.encodeWithTag(writer, 9, (int) value.getSelection_strategy());
                TaxLotStatus.ADAPTER.encodeWithTag(writer, 8, (int) value.getLot_status());
                TaxLotSortDirection.ADAPTER.encodeWithTag(writer, 7, (int) value.getSort_direction());
                TaxLotSort.ADAPTER.encodeWithTag(writer, 6, (int) value.getSort());
                DisposalKind.ADAPTER.encodeWithTag(writer, 5, (int) value.getDisposal_kind());
                TaxLotTerm.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSelected_terms());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsRequest decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                DisposalKind disposalKind;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                DisposalKind disposalKindDecode = null;
                TaxLotSort taxLotSortDecode = null;
                TaxLotSortDirection taxLotSortDirectionDecode = null;
                TaxLotStatus taxLotStatusDecode = null;
                SelectionStrategy selectionStrategyDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                str = strDecode;
                                str2 = strDecode2;
                                disposalKind = disposalKindDecode;
                                try {
                                    TaxLotTerm.ADAPTER.tryDecode(reader, arrayList);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                disposalKindDecode = disposalKind;
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                            case 5:
                                str = strDecode;
                                str2 = strDecode2;
                                disposalKind = disposalKindDecode;
                                try {
                                    disposalKindDecode = DisposalKind.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                            case 6:
                                str = strDecode;
                                str2 = strDecode2;
                                disposalKind = disposalKindDecode;
                                try {
                                    taxLotSortDecode = TaxLotSort.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                disposalKindDecode = disposalKind;
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                            case 7:
                                str = strDecode;
                                str2 = strDecode2;
                                disposalKind = disposalKindDecode;
                                try {
                                    taxLotSortDirectionDecode = TaxLotSortDirection.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                }
                                disposalKindDecode = disposalKind;
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                            case 8:
                                str = strDecode;
                                str2 = strDecode2;
                                try {
                                    taxLotStatusDecode = TaxLotStatus.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    disposalKind = disposalKindDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                            case 9:
                                try {
                                    selectionStrategyDecode = SelectionStrategy.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    str = strDecode;
                                    str2 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode;
                                str2 = strDecode2;
                                disposalKind = disposalKindDecode;
                                disposalKindDecode = disposalKind;
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                        }
                    } else {
                        return new StreamTaxLotsRequest(strDecode3, strDecode, strDecode2, arrayList, disposalKindDecode, taxLotSortDecode, taxLotSortDirectionDecode, taxLotStatusDecode, selectionStrategyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsRequest redact(StreamTaxLotsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamTaxLotsRequest.copy$default(value, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }
}
