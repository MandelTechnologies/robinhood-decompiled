package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
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

/* compiled from: TaxLotsContext.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,-Bo\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016Jn\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "Lcom/squareup/wire/Message;", "", "lots_available", "", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection;", "tax_lot_selections", "targeted_lot", "sort_type", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "estimated_credit", "", "estimated_gain_loss", "total_shares", "tax_lot_selection_method", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotSelection;Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;DDDLcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;Lokio/ByteString;)V", "getTargeted_lot", "()Lcom/robinhood/rosetta/eventlogging/TaxLotSelection;", "getSort_type", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "getEstimated_credit", "()D", "getEstimated_gain_loss", "getTotal_shares", "getTax_lot_selection_method", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "getLots_available", "()Ljava/util/List;", "getTax_lot_selections", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "SelectionStrategy", "SortType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TaxLotsContext extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLotsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "estimatedCredit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double estimated_credit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "estimatedGainLoss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double estimated_gain_loss;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotSelection#ADAPTER", jsonName = "lotsAvailable", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final java.util.List<TaxLotSelection> lots_available;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotsContext$SortType#ADAPTER", jsonName = "sortType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final SortType sort_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotSelection#ADAPTER", jsonName = "targetedLot", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TaxLotSelection targeted_lot;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotsContext$SelectionStrategy#ADAPTER", jsonName = "taxLotSelectionMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final SelectionStrategy tax_lot_selection_method;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotSelection#ADAPTER", jsonName = "taxLotSelections", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final java.util.List<TaxLotSelection> tax_lot_selections;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double total_shares;

    public TaxLotsContext() {
        this(null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24575newBuilder();
    }

    public /* synthetic */ TaxLotsContext(java.util.List list, java.util.List list2, TaxLotSelection taxLotSelection, SortType sortType, double d, double d2, double d3, SelectionStrategy selectionStrategy, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : taxLotSelection, (i & 8) != 0 ? SortType.SORT_TYPE_UNSPECIFIED : sortType, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2, (i & 64) == 0 ? d3 : 0.0d, (i & 128) != 0 ? SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED : selectionStrategy, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TaxLotSelection getTargeted_lot() {
        return this.targeted_lot;
    }

    public final SortType getSort_type() {
        return this.sort_type;
    }

    public final double getEstimated_credit() {
        return this.estimated_credit;
    }

    public final double getEstimated_gain_loss() {
        return this.estimated_gain_loss;
    }

    public final double getTotal_shares() {
        return this.total_shares;
    }

    public final SelectionStrategy getTax_lot_selection_method() {
        return this.tax_lot_selection_method;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotsContext(java.util.List<TaxLotSelection> lots_available, java.util.List<TaxLotSelection> tax_lot_selections, TaxLotSelection taxLotSelection, SortType sort_type, double d, double d2, double d3, SelectionStrategy tax_lot_selection_method, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lots_available, "lots_available");
        Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
        Intrinsics.checkNotNullParameter(sort_type, "sort_type");
        Intrinsics.checkNotNullParameter(tax_lot_selection_method, "tax_lot_selection_method");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.targeted_lot = taxLotSelection;
        this.sort_type = sort_type;
        this.estimated_credit = d;
        this.estimated_gain_loss = d2;
        this.total_shares = d3;
        this.tax_lot_selection_method = tax_lot_selection_method;
        this.lots_available = Internal.immutableCopyOf("lots_available", lots_available);
        this.tax_lot_selections = Internal.immutableCopyOf("tax_lot_selections", tax_lot_selections);
    }

    public final java.util.List<TaxLotSelection> getLots_available() {
        return this.lots_available;
    }

    public final java.util.List<TaxLotSelection> getTax_lot_selections() {
        return this.tax_lot_selections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24575newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLotsContext)) {
            return false;
        }
        TaxLotsContext taxLotsContext = (TaxLotsContext) other;
        return Intrinsics.areEqual(unknownFields(), taxLotsContext.unknownFields()) && Intrinsics.areEqual(this.lots_available, taxLotsContext.lots_available) && Intrinsics.areEqual(this.tax_lot_selections, taxLotsContext.tax_lot_selections) && Intrinsics.areEqual(this.targeted_lot, taxLotsContext.targeted_lot) && this.sort_type == taxLotsContext.sort_type && this.estimated_credit == taxLotsContext.estimated_credit && this.estimated_gain_loss == taxLotsContext.estimated_gain_loss && this.total_shares == taxLotsContext.total_shares && this.tax_lot_selection_method == taxLotsContext.tax_lot_selection_method;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.lots_available.hashCode()) * 37) + this.tax_lot_selections.hashCode()) * 37;
        TaxLotSelection taxLotSelection = this.targeted_lot;
        int iHashCode2 = ((((((((((iHashCode + (taxLotSelection != null ? taxLotSelection.hashCode() : 0)) * 37) + this.sort_type.hashCode()) * 37) + Double.hashCode(this.estimated_credit)) * 37) + Double.hashCode(this.estimated_gain_loss)) * 37) + Double.hashCode(this.total_shares)) * 37) + this.tax_lot_selection_method.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.lots_available.isEmpty()) {
            arrayList.add("lots_available=" + this.lots_available);
        }
        if (!this.tax_lot_selections.isEmpty()) {
            arrayList.add("tax_lot_selections=" + this.tax_lot_selections);
        }
        TaxLotSelection taxLotSelection = this.targeted_lot;
        if (taxLotSelection != null) {
            arrayList.add("targeted_lot=" + taxLotSelection);
        }
        arrayList.add("sort_type=" + this.sort_type);
        arrayList.add("estimated_credit=" + this.estimated_credit);
        arrayList.add("estimated_gain_loss=" + this.estimated_gain_loss);
        arrayList.add("total_shares=" + this.total_shares);
        arrayList.add("tax_lot_selection_method=" + this.tax_lot_selection_method);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotsContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLotsContext copy$default(TaxLotsContext taxLotsContext, java.util.List list, java.util.List list2, TaxLotSelection taxLotSelection, SortType sortType, double d, double d2, double d3, SelectionStrategy selectionStrategy, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taxLotsContext.lots_available;
        }
        if ((i & 2) != 0) {
            list2 = taxLotsContext.tax_lot_selections;
        }
        if ((i & 4) != 0) {
            taxLotSelection = taxLotsContext.targeted_lot;
        }
        if ((i & 8) != 0) {
            sortType = taxLotsContext.sort_type;
        }
        if ((i & 16) != 0) {
            d = taxLotsContext.estimated_credit;
        }
        if ((i & 32) != 0) {
            d2 = taxLotsContext.estimated_gain_loss;
        }
        if ((i & 64) != 0) {
            d3 = taxLotsContext.total_shares;
        }
        if ((i & 128) != 0) {
            selectionStrategy = taxLotsContext.tax_lot_selection_method;
        }
        if ((i & 256) != 0) {
            byteString = taxLotsContext.unknownFields();
        }
        double d4 = d3;
        double d5 = d2;
        double d6 = d;
        TaxLotSelection taxLotSelection2 = taxLotSelection;
        SortType sortType2 = sortType;
        return taxLotsContext.copy(list, list2, taxLotSelection2, sortType2, d6, d5, d4, selectionStrategy, byteString);
    }

    public final TaxLotsContext copy(java.util.List<TaxLotSelection> lots_available, java.util.List<TaxLotSelection> tax_lot_selections, TaxLotSelection targeted_lot, SortType sort_type, double estimated_credit, double estimated_gain_loss, double total_shares, SelectionStrategy tax_lot_selection_method, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lots_available, "lots_available");
        Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
        Intrinsics.checkNotNullParameter(sort_type, "sort_type");
        Intrinsics.checkNotNullParameter(tax_lot_selection_method, "tax_lot_selection_method");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLotsContext(lots_available, tax_lot_selections, targeted_lot, sort_type, estimated_credit, estimated_gain_loss, total_shares, tax_lot_selection_method, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLotsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TaxLotsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLotsContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<TaxLotSelection> protoAdapter = TaxLotSelection.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getLots_available()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getTax_lot_selections());
                if (value.getTargeted_lot() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getTargeted_lot());
                }
                if (value.getSort_type() != TaxLotsContext.SortType.SORT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += TaxLotsContext.SortType.ADAPTER.encodedSizeWithTag(4, value.getSort_type());
                }
                if (!Double.valueOf(value.getEstimated_credit()).equals(dValueOf)) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getEstimated_credit()));
                }
                if (!Double.valueOf(value.getEstimated_gain_loss()).equals(dValueOf)) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getEstimated_gain_loss()));
                }
                if (!Double.valueOf(value.getTotal_shares()).equals(dValueOf)) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getTotal_shares()));
                }
                return value.getTax_lot_selection_method() != TaxLotsContext.SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED ? iEncodedSizeWithTag + TaxLotsContext.SelectionStrategy.ADAPTER.encodedSizeWithTag(8, value.getTax_lot_selection_method()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLotsContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<TaxLotSelection> protoAdapter = TaxLotSelection.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getLots_available());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getTax_lot_selections());
                if (value.getTargeted_lot() != null) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getTargeted_lot());
                }
                if (value.getSort_type() != TaxLotsContext.SortType.SORT_TYPE_UNSPECIFIED) {
                    TaxLotsContext.SortType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSort_type());
                }
                if (!Double.valueOf(value.getEstimated_credit()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getEstimated_credit()));
                }
                if (!Double.valueOf(value.getEstimated_gain_loss()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getEstimated_gain_loss()));
                }
                if (!Double.valueOf(value.getTotal_shares()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getTotal_shares()));
                }
                if (value.getTax_lot_selection_method() != TaxLotsContext.SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    TaxLotsContext.SelectionStrategy.ADAPTER.encodeWithTag(writer, 8, (int) value.getTax_lot_selection_method());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLotsContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTax_lot_selection_method() != TaxLotsContext.SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    TaxLotsContext.SelectionStrategy.ADAPTER.encodeWithTag(writer, 8, (int) value.getTax_lot_selection_method());
                }
                if (!Double.valueOf(value.getTotal_shares()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getTotal_shares()));
                }
                if (!Double.valueOf(value.getEstimated_gain_loss()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getEstimated_gain_loss()));
                }
                if (!Double.valueOf(value.getEstimated_credit()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getEstimated_credit()));
                }
                if (value.getSort_type() != TaxLotsContext.SortType.SORT_TYPE_UNSPECIFIED) {
                    TaxLotsContext.SortType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSort_type());
                }
                if (value.getTargeted_lot() != null) {
                    TaxLotSelection.ADAPTER.encodeWithTag(writer, 3, (int) value.getTargeted_lot());
                }
                ProtoAdapter<TaxLotSelection> protoAdapter = TaxLotSelection.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getTax_lot_selections());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getLots_available());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotsContext decode(ProtoReader reader) throws IOException {
                TaxLotsContext.SortType sortType;
                TaxLotsContext.SelectionStrategy selectionStrategy;
                TaxLotSelection taxLotSelection;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                TaxLotsContext.SortType sortType2 = TaxLotsContext.SortType.SORT_TYPE_UNSPECIFIED;
                TaxLotsContext.SelectionStrategy selectionStrategy2 = TaxLotsContext.SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                TaxLotSelection taxLotSelectionDecode = null;
                double dDoubleValue3 = 0.0d;
                TaxLotsContext.SelectionStrategy selectionStrategyDecode = selectionStrategy2;
                TaxLotsContext.SortType sortTypeDecode = sortType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                sortType = sortTypeDecode;
                                selectionStrategy = selectionStrategyDecode;
                                taxLotSelection = taxLotSelectionDecode;
                                arrayList.add(TaxLotSelection.ADAPTER.decode(reader));
                                sortTypeDecode = sortType;
                                taxLotSelectionDecode = taxLotSelection;
                                selectionStrategyDecode = selectionStrategy;
                                break;
                            case 2:
                                sortType = sortTypeDecode;
                                selectionStrategy = selectionStrategyDecode;
                                taxLotSelection = taxLotSelectionDecode;
                                arrayList2.add(TaxLotSelection.ADAPTER.decode(reader));
                                sortTypeDecode = sortType;
                                taxLotSelectionDecode = taxLotSelection;
                                selectionStrategyDecode = selectionStrategy;
                                break;
                            case 3:
                                taxLotSelectionDecode = TaxLotSelection.ADAPTER.decode(reader);
                                break;
                            case 4:
                                sortType = sortTypeDecode;
                                selectionStrategy = selectionStrategyDecode;
                                taxLotSelection = taxLotSelectionDecode;
                                try {
                                    sortTypeDecode = TaxLotsContext.SortType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                taxLotSelectionDecode = taxLotSelection;
                                selectionStrategyDecode = selectionStrategy;
                                break;
                            case 5:
                                selectionStrategy = selectionStrategyDecode;
                                taxLotSelection = taxLotSelectionDecode;
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                taxLotSelectionDecode = taxLotSelection;
                                selectionStrategyDecode = selectionStrategy;
                                break;
                            case 6:
                                selectionStrategy = selectionStrategyDecode;
                                taxLotSelection = taxLotSelectionDecode;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                taxLotSelectionDecode = taxLotSelection;
                                selectionStrategyDecode = selectionStrategy;
                                break;
                            case 7:
                                selectionStrategy = selectionStrategyDecode;
                                taxLotSelection = taxLotSelectionDecode;
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                taxLotSelectionDecode = taxLotSelection;
                                selectionStrategyDecode = selectionStrategy;
                                break;
                            case 8:
                                try {
                                    selectionStrategyDecode = TaxLotsContext.SelectionStrategy.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    sortType = sortTypeDecode;
                                    selectionStrategy = selectionStrategyDecode;
                                    taxLotSelection = taxLotSelectionDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                sortType = sortTypeDecode;
                                selectionStrategy = selectionStrategyDecode;
                                taxLotSelection = taxLotSelectionDecode;
                                sortTypeDecode = sortType;
                                taxLotSelectionDecode = taxLotSelection;
                                selectionStrategyDecode = selectionStrategy;
                                break;
                        }
                    } else {
                        return new TaxLotsContext(arrayList, arrayList2, taxLotSelectionDecode, sortTypeDecode, dDoubleValue3, dDoubleValue, dDoubleValue2, selectionStrategyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotsContext redact(TaxLotsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                java.util.List<TaxLotSelection> lots_available = value.getLots_available();
                ProtoAdapter<TaxLotSelection> protoAdapter = TaxLotSelection.ADAPTER;
                java.util.List listM26823redactElements = Internal.m26823redactElements(lots_available, protoAdapter);
                java.util.List listM26823redactElements2 = Internal.m26823redactElements(value.getTax_lot_selections(), protoAdapter);
                TaxLotSelection targeted_lot = value.getTargeted_lot();
                return TaxLotsContext.copy$default(value, listM26823redactElements, listM26823redactElements2, targeted_lot != null ? protoAdapter.redact(targeted_lot) : null, null, 0.0d, 0.0d, 0.0d, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SELECTION_STRATEGY_UNSPECIFIED", "FIRST_IN", "LAST_IN", "LOWEST_COST", "HIGHEST_COST", "CUSTOM", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class SelectionStrategy implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SelectionStrategy[] $VALUES;

        @JvmField
        public static final ProtoAdapter<SelectionStrategy> ADAPTER;
        public static final SelectionStrategy CUSTOM;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SelectionStrategy FIRST_IN;
        public static final SelectionStrategy HIGHEST_COST;
        public static final SelectionStrategy LAST_IN;
        public static final SelectionStrategy LOWEST_COST;
        public static final SelectionStrategy SELECTION_STRATEGY_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ SelectionStrategy[] $values() {
            return new SelectionStrategy[]{SELECTION_STRATEGY_UNSPECIFIED, FIRST_IN, LAST_IN, LOWEST_COST, HIGHEST_COST, CUSTOM};
        }

        @JvmStatic
        public static final SelectionStrategy fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<SelectionStrategy> getEntries() {
            return $ENTRIES;
        }

        private SelectionStrategy(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final SelectionStrategy selectionStrategy = new SelectionStrategy("SELECTION_STRATEGY_UNSPECIFIED", 0, 0);
            SELECTION_STRATEGY_UNSPECIFIED = selectionStrategy;
            FIRST_IN = new SelectionStrategy("FIRST_IN", 1, 1);
            LAST_IN = new SelectionStrategy("LAST_IN", 2, 2);
            LOWEST_COST = new SelectionStrategy("LOWEST_COST", 3, 3);
            HIGHEST_COST = new SelectionStrategy("HIGHEST_COST", 4, 4);
            CUSTOM = new SelectionStrategy("CUSTOM", 5, 5);
            SelectionStrategy[] selectionStrategyArr$values = $values();
            $VALUES = selectionStrategyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(selectionStrategyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SelectionStrategy.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<SelectionStrategy>(orCreateKotlinClass, syntax, selectionStrategy) { // from class: com.robinhood.rosetta.eventlogging.TaxLotsContext$SelectionStrategy$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TaxLotsContext.SelectionStrategy fromValue(int value) {
                    return TaxLotsContext.SelectionStrategy.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TaxLotsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final SelectionStrategy fromValue(int value) {
                if (value == 0) {
                    return SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
                }
                if (value == 1) {
                    return SelectionStrategy.FIRST_IN;
                }
                if (value == 2) {
                    return SelectionStrategy.LAST_IN;
                }
                if (value == 3) {
                    return SelectionStrategy.LOWEST_COST;
                }
                if (value == 4) {
                    return SelectionStrategy.HIGHEST_COST;
                }
                if (value != 5) {
                    return null;
                }
                return SelectionStrategy.CUSTOM;
            }
        }

        public static SelectionStrategy valueOf(String str) {
            return (SelectionStrategy) Enum.valueOf(SelectionStrategy.class, str);
        }

        public static SelectionStrategy[] values() {
            return (SelectionStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SORT_TYPE_UNSPECIFIED", "DATE", "COST_SHARE", "GAIN_LOSS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SortType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SortType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<SortType> ADAPTER;
        public static final SortType COST_SHARE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SortType DATE;
        public static final SortType GAIN_LOSS;
        public static final SortType SORT_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ SortType[] $values() {
            return new SortType[]{SORT_TYPE_UNSPECIFIED, DATE, COST_SHARE, GAIN_LOSS};
        }

        @JvmStatic
        public static final SortType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<SortType> getEntries() {
            return $ENTRIES;
        }

        private SortType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final SortType sortType = new SortType("SORT_TYPE_UNSPECIFIED", 0, 0);
            SORT_TYPE_UNSPECIFIED = sortType;
            DATE = new SortType("DATE", 1, 1);
            COST_SHARE = new SortType("COST_SHARE", 2, 2);
            GAIN_LOSS = new SortType("GAIN_LOSS", 3, 3);
            SortType[] sortTypeArr$values = $values();
            $VALUES = sortTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sortTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SortType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<SortType>(orCreateKotlinClass, syntax, sortType) { // from class: com.robinhood.rosetta.eventlogging.TaxLotsContext$SortType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TaxLotsContext.SortType fromValue(int value) {
                    return TaxLotsContext.SortType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TaxLotsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final SortType fromValue(int value) {
                if (value == 0) {
                    return SortType.SORT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return SortType.DATE;
                }
                if (value == 2) {
                    return SortType.COST_SHARE;
                }
                if (value != 3) {
                    return null;
                }
                return SortType.GAIN_LOSS;
            }
        }

        public static SortType valueOf(String str) {
            return (SortType) Enum.valueOf(SortType.class, str);
        }

        public static SortType[] values() {
            return (SortType[]) $VALUES.clone();
        }
    }
}
