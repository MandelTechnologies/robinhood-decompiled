package contracts.crypto.trade.proto.p431v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.Source;
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

/* compiled from: Source.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000b9:;<=>?@ABCB\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000207H\u0016J\u0088\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source;", "Lcom/squareup/wire/Message;", "", "spot_editing", "Lcontracts/crypto/trade/proto/v1/Source$SpotEditing;", "spot_review", "Lcontracts/crypto/trade/proto/v1/Source$SpotReview;", "spot_confirmation", "Lcontracts/crypto/trade/proto/v1/Source$SpotConfirmation;", "tax_lot_editing", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotEditing;", "tax_lot_review", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotReview;", "tax_lot_selection", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotSelection;", "tax_lot_confirmation", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotConfirmation;", "tokenized_stock_editing", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockEditing;", "tokenized_stock_review", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockReview;", "tokenized_stock_confirmation", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockConfirmation;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/Source$SpotEditing;Lcontracts/crypto/trade/proto/v1/Source$SpotReview;Lcontracts/crypto/trade/proto/v1/Source$SpotConfirmation;Lcontracts/crypto/trade/proto/v1/Source$TaxLotEditing;Lcontracts/crypto/trade/proto/v1/Source$TaxLotReview;Lcontracts/crypto/trade/proto/v1/Source$TaxLotSelection;Lcontracts/crypto/trade/proto/v1/Source$TaxLotConfirmation;Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockEditing;Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockReview;Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockConfirmation;Lokio/ByteString;)V", "getSpot_editing", "()Lcontracts/crypto/trade/proto/v1/Source$SpotEditing;", "getSpot_review", "()Lcontracts/crypto/trade/proto/v1/Source$SpotReview;", "getSpot_confirmation", "()Lcontracts/crypto/trade/proto/v1/Source$SpotConfirmation;", "getTax_lot_editing", "()Lcontracts/crypto/trade/proto/v1/Source$TaxLotEditing;", "getTax_lot_review", "()Lcontracts/crypto/trade/proto/v1/Source$TaxLotReview;", "getTax_lot_selection", "()Lcontracts/crypto/trade/proto/v1/Source$TaxLotSelection;", "getTax_lot_confirmation", "()Lcontracts/crypto/trade/proto/v1/Source$TaxLotConfirmation;", "getTokenized_stock_editing", "()Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockEditing;", "getTokenized_stock_review", "()Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockReview;", "getTokenized_stock_confirmation", "()Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockConfirmation;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "SpotEditing", "SpotReview", "SpotConfirmation", "TaxLotEditing", "TaxLotReview", "TaxLotSelection", "TaxLotConfirmation", "TokenizedStockEditing", "TokenizedStockReview", "TokenizedStockConfirmation", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class Source extends Message {

    @JvmField
    public static final ProtoAdapter<Source> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$SpotConfirmation#ADAPTER", jsonName = "spotConfirmation", oneofName = "type", schemaIndex = 2, tag = 3)
    private final SpotConfirmation spot_confirmation;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$SpotEditing#ADAPTER", jsonName = "spotEditing", oneofName = "type", schemaIndex = 0, tag = 1)
    private final SpotEditing spot_editing;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$SpotReview#ADAPTER", jsonName = "spotReview", oneofName = "type", schemaIndex = 1, tag = 2)
    private final SpotReview spot_review;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$TaxLotConfirmation#ADAPTER", jsonName = "taxLotConfirmation", oneofName = "type", schemaIndex = 6, tag = 7)
    private final TaxLotConfirmation tax_lot_confirmation;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$TaxLotEditing#ADAPTER", jsonName = "taxLotEditing", oneofName = "type", schemaIndex = 3, tag = 4)
    private final TaxLotEditing tax_lot_editing;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$TaxLotReview#ADAPTER", jsonName = "taxLotReview", oneofName = "type", schemaIndex = 4, tag = 5)
    private final TaxLotReview tax_lot_review;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$TaxLotSelection#ADAPTER", jsonName = "taxLotSelection", oneofName = "type", schemaIndex = 5, tag = 6)
    private final TaxLotSelection tax_lot_selection;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$TokenizedStockConfirmation#ADAPTER", jsonName = "tokenizedStockConfirmation", oneofName = "type", schemaIndex = 9, tag = 10)
    private final TokenizedStockConfirmation tokenized_stock_confirmation;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$TokenizedStockEditing#ADAPTER", jsonName = "tokenizedStockEditing", oneofName = "type", schemaIndex = 7, tag = 8)
    private final TokenizedStockEditing tokenized_stock_editing;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.Source$TokenizedStockReview#ADAPTER", jsonName = "tokenizedStockReview", oneofName = "type", schemaIndex = 8, tag = 9)
    private final TokenizedStockReview tokenized_stock_review;

    public Source() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27680newBuilder();
    }

    public final SpotEditing getSpot_editing() {
        return this.spot_editing;
    }

    public final SpotReview getSpot_review() {
        return this.spot_review;
    }

    public final SpotConfirmation getSpot_confirmation() {
        return this.spot_confirmation;
    }

    public final TaxLotEditing getTax_lot_editing() {
        return this.tax_lot_editing;
    }

    public final TaxLotReview getTax_lot_review() {
        return this.tax_lot_review;
    }

    public final TaxLotSelection getTax_lot_selection() {
        return this.tax_lot_selection;
    }

    public final TaxLotConfirmation getTax_lot_confirmation() {
        return this.tax_lot_confirmation;
    }

    public final TokenizedStockEditing getTokenized_stock_editing() {
        return this.tokenized_stock_editing;
    }

    public final TokenizedStockReview getTokenized_stock_review() {
        return this.tokenized_stock_review;
    }

    public final TokenizedStockConfirmation getTokenized_stock_confirmation() {
        return this.tokenized_stock_confirmation;
    }

    public /* synthetic */ Source(SpotEditing spotEditing, SpotReview spotReview, SpotConfirmation spotConfirmation, TaxLotEditing taxLotEditing, TaxLotReview taxLotReview, TaxLotSelection taxLotSelection, TaxLotConfirmation taxLotConfirmation, TokenizedStockEditing tokenizedStockEditing, TokenizedStockReview tokenizedStockReview, TokenizedStockConfirmation tokenizedStockConfirmation, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : spotEditing, (i & 2) != 0 ? null : spotReview, (i & 4) != 0 ? null : spotConfirmation, (i & 8) != 0 ? null : taxLotEditing, (i & 16) != 0 ? null : taxLotReview, (i & 32) != 0 ? null : taxLotSelection, (i & 64) != 0 ? null : taxLotConfirmation, (i & 128) != 0 ? null : tokenizedStockEditing, (i & 256) != 0 ? null : tokenizedStockReview, (i & 512) != 0 ? null : tokenizedStockConfirmation, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Source(SpotEditing spotEditing, SpotReview spotReview, SpotConfirmation spotConfirmation, TaxLotEditing taxLotEditing, TaxLotReview taxLotReview, TaxLotSelection taxLotSelection, TaxLotConfirmation taxLotConfirmation, TokenizedStockEditing tokenizedStockEditing, TokenizedStockReview tokenizedStockReview, TokenizedStockConfirmation tokenizedStockConfirmation, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.spot_editing = spotEditing;
        this.spot_review = spotReview;
        this.spot_confirmation = spotConfirmation;
        this.tax_lot_editing = taxLotEditing;
        this.tax_lot_review = taxLotReview;
        this.tax_lot_selection = taxLotSelection;
        this.tax_lot_confirmation = taxLotConfirmation;
        this.tokenized_stock_editing = tokenizedStockEditing;
        this.tokenized_stock_review = tokenizedStockReview;
        this.tokenized_stock_confirmation = tokenizedStockConfirmation;
        if (Internal.countNonNull(spotEditing, spotReview, spotConfirmation, taxLotEditing, taxLotReview, taxLotSelection, taxLotConfirmation, tokenizedStockEditing, tokenizedStockReview, tokenizedStockConfirmation) > 1) {
            throw new IllegalArgumentException("At most one of spot_editing, spot_review, spot_confirmation, tax_lot_editing, tax_lot_review, tax_lot_selection, tax_lot_confirmation, tokenized_stock_editing, tokenized_stock_review, tokenized_stock_confirmation may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27680newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Source)) {
            return false;
        }
        Source source = (Source) other;
        return Intrinsics.areEqual(unknownFields(), source.unknownFields()) && Intrinsics.areEqual(this.spot_editing, source.spot_editing) && Intrinsics.areEqual(this.spot_review, source.spot_review) && Intrinsics.areEqual(this.spot_confirmation, source.spot_confirmation) && Intrinsics.areEqual(this.tax_lot_editing, source.tax_lot_editing) && Intrinsics.areEqual(this.tax_lot_review, source.tax_lot_review) && Intrinsics.areEqual(this.tax_lot_selection, source.tax_lot_selection) && Intrinsics.areEqual(this.tax_lot_confirmation, source.tax_lot_confirmation) && Intrinsics.areEqual(this.tokenized_stock_editing, source.tokenized_stock_editing) && Intrinsics.areEqual(this.tokenized_stock_review, source.tokenized_stock_review) && Intrinsics.areEqual(this.tokenized_stock_confirmation, source.tokenized_stock_confirmation);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SpotEditing spotEditing = this.spot_editing;
        int iHashCode2 = (iHashCode + (spotEditing != null ? spotEditing.hashCode() : 0)) * 37;
        SpotReview spotReview = this.spot_review;
        int iHashCode3 = (iHashCode2 + (spotReview != null ? spotReview.hashCode() : 0)) * 37;
        SpotConfirmation spotConfirmation = this.spot_confirmation;
        int iHashCode4 = (iHashCode3 + (spotConfirmation != null ? spotConfirmation.hashCode() : 0)) * 37;
        TaxLotEditing taxLotEditing = this.tax_lot_editing;
        int iHashCode5 = (iHashCode4 + (taxLotEditing != null ? taxLotEditing.hashCode() : 0)) * 37;
        TaxLotReview taxLotReview = this.tax_lot_review;
        int iHashCode6 = (iHashCode5 + (taxLotReview != null ? taxLotReview.hashCode() : 0)) * 37;
        TaxLotSelection taxLotSelection = this.tax_lot_selection;
        int iHashCode7 = (iHashCode6 + (taxLotSelection != null ? taxLotSelection.hashCode() : 0)) * 37;
        TaxLotConfirmation taxLotConfirmation = this.tax_lot_confirmation;
        int iHashCode8 = (iHashCode7 + (taxLotConfirmation != null ? taxLotConfirmation.hashCode() : 0)) * 37;
        TokenizedStockEditing tokenizedStockEditing = this.tokenized_stock_editing;
        int iHashCode9 = (iHashCode8 + (tokenizedStockEditing != null ? tokenizedStockEditing.hashCode() : 0)) * 37;
        TokenizedStockReview tokenizedStockReview = this.tokenized_stock_review;
        int iHashCode10 = (iHashCode9 + (tokenizedStockReview != null ? tokenizedStockReview.hashCode() : 0)) * 37;
        TokenizedStockConfirmation tokenizedStockConfirmation = this.tokenized_stock_confirmation;
        int iHashCode11 = iHashCode10 + (tokenizedStockConfirmation != null ? tokenizedStockConfirmation.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SpotEditing spotEditing = this.spot_editing;
        if (spotEditing != null) {
            arrayList.add("spot_editing=" + spotEditing);
        }
        SpotReview spotReview = this.spot_review;
        if (spotReview != null) {
            arrayList.add("spot_review=" + spotReview);
        }
        SpotConfirmation spotConfirmation = this.spot_confirmation;
        if (spotConfirmation != null) {
            arrayList.add("spot_confirmation=" + spotConfirmation);
        }
        TaxLotEditing taxLotEditing = this.tax_lot_editing;
        if (taxLotEditing != null) {
            arrayList.add("tax_lot_editing=" + taxLotEditing);
        }
        TaxLotReview taxLotReview = this.tax_lot_review;
        if (taxLotReview != null) {
            arrayList.add("tax_lot_review=" + taxLotReview);
        }
        TaxLotSelection taxLotSelection = this.tax_lot_selection;
        if (taxLotSelection != null) {
            arrayList.add("tax_lot_selection=" + taxLotSelection);
        }
        TaxLotConfirmation taxLotConfirmation = this.tax_lot_confirmation;
        if (taxLotConfirmation != null) {
            arrayList.add("tax_lot_confirmation=" + taxLotConfirmation);
        }
        TokenizedStockEditing tokenizedStockEditing = this.tokenized_stock_editing;
        if (tokenizedStockEditing != null) {
            arrayList.add("tokenized_stock_editing=" + tokenizedStockEditing);
        }
        TokenizedStockReview tokenizedStockReview = this.tokenized_stock_review;
        if (tokenizedStockReview != null) {
            arrayList.add("tokenized_stock_review=" + tokenizedStockReview);
        }
        TokenizedStockConfirmation tokenizedStockConfirmation = this.tokenized_stock_confirmation;
        if (tokenizedStockConfirmation != null) {
            arrayList.add("tokenized_stock_confirmation=" + tokenizedStockConfirmation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Source{", "}", 0, null, null, 56, null);
    }

    public final Source copy(SpotEditing spot_editing, SpotReview spot_review, SpotConfirmation spot_confirmation, TaxLotEditing tax_lot_editing, TaxLotReview tax_lot_review, TaxLotSelection tax_lot_selection, TaxLotConfirmation tax_lot_confirmation, TokenizedStockEditing tokenized_stock_editing, TokenizedStockReview tokenized_stock_review, TokenizedStockConfirmation tokenized_stock_confirmation, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Source(spot_editing, spot_review, spot_confirmation, tax_lot_editing, tax_lot_review, tax_lot_selection, tax_lot_confirmation, tokenized_stock_editing, tokenized_stock_review, tokenized_stock_confirmation, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Source>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Source value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Source.SpotEditing.ADAPTER.encodedSizeWithTag(1, value.getSpot_editing()) + Source.SpotReview.ADAPTER.encodedSizeWithTag(2, value.getSpot_review()) + Source.SpotConfirmation.ADAPTER.encodedSizeWithTag(3, value.getSpot_confirmation()) + Source.TaxLotEditing.ADAPTER.encodedSizeWithTag(4, value.getTax_lot_editing()) + Source.TaxLotReview.ADAPTER.encodedSizeWithTag(5, value.getTax_lot_review()) + Source.TaxLotSelection.ADAPTER.encodedSizeWithTag(6, value.getTax_lot_selection()) + Source.TaxLotConfirmation.ADAPTER.encodedSizeWithTag(7, value.getTax_lot_confirmation()) + Source.TokenizedStockEditing.ADAPTER.encodedSizeWithTag(8, value.getTokenized_stock_editing()) + Source.TokenizedStockReview.ADAPTER.encodedSizeWithTag(9, value.getTokenized_stock_review()) + Source.TokenizedStockConfirmation.ADAPTER.encodedSizeWithTag(10, value.getTokenized_stock_confirmation());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Source value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Source.SpotEditing.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpot_editing());
                Source.SpotReview.ADAPTER.encodeWithTag(writer, 2, (int) value.getSpot_review());
                Source.SpotConfirmation.ADAPTER.encodeWithTag(writer, 3, (int) value.getSpot_confirmation());
                Source.TaxLotEditing.ADAPTER.encodeWithTag(writer, 4, (int) value.getTax_lot_editing());
                Source.TaxLotReview.ADAPTER.encodeWithTag(writer, 5, (int) value.getTax_lot_review());
                Source.TaxLotSelection.ADAPTER.encodeWithTag(writer, 6, (int) value.getTax_lot_selection());
                Source.TaxLotConfirmation.ADAPTER.encodeWithTag(writer, 7, (int) value.getTax_lot_confirmation());
                Source.TokenizedStockEditing.ADAPTER.encodeWithTag(writer, 8, (int) value.getTokenized_stock_editing());
                Source.TokenizedStockReview.ADAPTER.encodeWithTag(writer, 9, (int) value.getTokenized_stock_review());
                Source.TokenizedStockConfirmation.ADAPTER.encodeWithTag(writer, 10, (int) value.getTokenized_stock_confirmation());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Source value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Source.TokenizedStockConfirmation.ADAPTER.encodeWithTag(writer, 10, (int) value.getTokenized_stock_confirmation());
                Source.TokenizedStockReview.ADAPTER.encodeWithTag(writer, 9, (int) value.getTokenized_stock_review());
                Source.TokenizedStockEditing.ADAPTER.encodeWithTag(writer, 8, (int) value.getTokenized_stock_editing());
                Source.TaxLotConfirmation.ADAPTER.encodeWithTag(writer, 7, (int) value.getTax_lot_confirmation());
                Source.TaxLotSelection.ADAPTER.encodeWithTag(writer, 6, (int) value.getTax_lot_selection());
                Source.TaxLotReview.ADAPTER.encodeWithTag(writer, 5, (int) value.getTax_lot_review());
                Source.TaxLotEditing.ADAPTER.encodeWithTag(writer, 4, (int) value.getTax_lot_editing());
                Source.SpotConfirmation.ADAPTER.encodeWithTag(writer, 3, (int) value.getSpot_confirmation());
                Source.SpotReview.ADAPTER.encodeWithTag(writer, 2, (int) value.getSpot_review());
                Source.SpotEditing.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpot_editing());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Source redact(Source value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Source.SpotEditing spot_editing = value.getSpot_editing();
                Source.SpotEditing spotEditingRedact = spot_editing != null ? Source.SpotEditing.ADAPTER.redact(spot_editing) : null;
                Source.SpotReview spot_review = value.getSpot_review();
                Source.SpotReview spotReviewRedact = spot_review != null ? Source.SpotReview.ADAPTER.redact(spot_review) : null;
                Source.SpotConfirmation spot_confirmation = value.getSpot_confirmation();
                Source.SpotConfirmation spotConfirmationRedact = spot_confirmation != null ? Source.SpotConfirmation.ADAPTER.redact(spot_confirmation) : null;
                Source.TaxLotEditing tax_lot_editing = value.getTax_lot_editing();
                Source.TaxLotEditing taxLotEditingRedact = tax_lot_editing != null ? Source.TaxLotEditing.ADAPTER.redact(tax_lot_editing) : null;
                Source.TaxLotReview tax_lot_review = value.getTax_lot_review();
                Source.TaxLotReview taxLotReviewRedact = tax_lot_review != null ? Source.TaxLotReview.ADAPTER.redact(tax_lot_review) : null;
                Source.TaxLotSelection tax_lot_selection = value.getTax_lot_selection();
                Source.TaxLotSelection taxLotSelectionRedact = tax_lot_selection != null ? Source.TaxLotSelection.ADAPTER.redact(tax_lot_selection) : null;
                Source.TaxLotConfirmation tax_lot_confirmation = value.getTax_lot_confirmation();
                Source.TaxLotConfirmation taxLotConfirmationRedact = tax_lot_confirmation != null ? Source.TaxLotConfirmation.ADAPTER.redact(tax_lot_confirmation) : null;
                Source.TokenizedStockEditing tokenized_stock_editing = value.getTokenized_stock_editing();
                Source.TokenizedStockEditing tokenizedStockEditingRedact = tokenized_stock_editing != null ? Source.TokenizedStockEditing.ADAPTER.redact(tokenized_stock_editing) : null;
                Source.TokenizedStockReview tokenized_stock_review = value.getTokenized_stock_review();
                Source.TokenizedStockReview tokenizedStockReviewRedact = tokenized_stock_review != null ? Source.TokenizedStockReview.ADAPTER.redact(tokenized_stock_review) : null;
                Source.TokenizedStockConfirmation tokenized_stock_confirmation = value.getTokenized_stock_confirmation();
                return value.copy(spotEditingRedact, spotReviewRedact, spotConfirmationRedact, taxLotEditingRedact, taxLotReviewRedact, taxLotSelectionRedact, taxLotConfirmationRedact, tokenizedStockEditingRedact, tokenizedStockReviewRedact, tokenized_stock_confirmation != null ? Source.TokenizedStockConfirmation.ADAPTER.redact(tokenized_stock_confirmation) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Source decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Source.SpotEditing spotEditingDecode = null;
                Source.SpotReview spotReviewDecode = null;
                Source.SpotConfirmation spotConfirmationDecode = null;
                Source.TaxLotEditing taxLotEditingDecode = null;
                Source.TaxLotReview taxLotReviewDecode = null;
                Source.TaxLotSelection taxLotSelectionDecode = null;
                Source.TaxLotConfirmation taxLotConfirmationDecode = null;
                Source.TokenizedStockEditing tokenizedStockEditingDecode = null;
                Source.TokenizedStockReview tokenizedStockReviewDecode = null;
                Source.TokenizedStockConfirmation tokenizedStockConfirmationDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                spotEditingDecode = Source.SpotEditing.ADAPTER.decode(reader);
                                break;
                            case 2:
                                spotReviewDecode = Source.SpotReview.ADAPTER.decode(reader);
                                break;
                            case 3:
                                spotConfirmationDecode = Source.SpotConfirmation.ADAPTER.decode(reader);
                                break;
                            case 4:
                                taxLotEditingDecode = Source.TaxLotEditing.ADAPTER.decode(reader);
                                break;
                            case 5:
                                taxLotReviewDecode = Source.TaxLotReview.ADAPTER.decode(reader);
                                break;
                            case 6:
                                taxLotSelectionDecode = Source.TaxLotSelection.ADAPTER.decode(reader);
                                break;
                            case 7:
                                taxLotConfirmationDecode = Source.TaxLotConfirmation.ADAPTER.decode(reader);
                                break;
                            case 8:
                                tokenizedStockEditingDecode = Source.TokenizedStockEditing.ADAPTER.decode(reader);
                                break;
                            case 9:
                                tokenizedStockReviewDecode = Source.TokenizedStockReview.ADAPTER.decode(reader);
                                break;
                            case 10:
                                tokenizedStockConfirmationDecode = Source.TokenizedStockConfirmation.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Source(spotEditingDecode, spotReviewDecode, spotConfirmationDecode, taxLotEditingDecode, taxLotReviewDecode, taxLotSelectionDecode, taxLotConfirmationDecode, tokenizedStockEditingDecode, tokenizedStockReviewDecode, tokenizedStockConfirmationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$SpotEditing;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SpotEditing extends Message {

        @JvmField
        public static final ProtoAdapter<SpotEditing> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public SpotEditing() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27682newBuilder();
        }

        public /* synthetic */ SpotEditing(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpotEditing(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27682newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof SpotEditing) && Intrinsics.areEqual(unknownFields(), ((SpotEditing) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "SpotEditing{}";
        }

        public final SpotEditing copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new SpotEditing(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SpotEditing.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<SpotEditing>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$SpotEditing$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.SpotEditing value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.SpotEditing value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.SpotEditing value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.SpotEditing redact(Source.SpotEditing value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.SpotEditing decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.SpotEditing(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$SpotReview;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SpotReview extends Message {

        @JvmField
        public static final ProtoAdapter<SpotReview> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public SpotReview() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27683newBuilder();
        }

        public /* synthetic */ SpotReview(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpotReview(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27683newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof SpotReview) && Intrinsics.areEqual(unknownFields(), ((SpotReview) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "SpotReview{}";
        }

        public final SpotReview copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new SpotReview(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SpotReview.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<SpotReview>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$SpotReview$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.SpotReview value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.SpotReview value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.SpotReview value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.SpotReview redact(Source.SpotReview value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.SpotReview decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.SpotReview(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$SpotConfirmation;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SpotConfirmation extends Message {

        @JvmField
        public static final ProtoAdapter<SpotConfirmation> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public SpotConfirmation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27681newBuilder();
        }

        public /* synthetic */ SpotConfirmation(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpotConfirmation(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27681newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof SpotConfirmation) && Intrinsics.areEqual(unknownFields(), ((SpotConfirmation) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "SpotConfirmation{}";
        }

        public final SpotConfirmation copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new SpotConfirmation(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SpotConfirmation.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<SpotConfirmation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$SpotConfirmation$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.SpotConfirmation value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.SpotConfirmation value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.SpotConfirmation value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.SpotConfirmation decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.SpotConfirmation(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.SpotConfirmation redact(Source.SpotConfirmation value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$TaxLotEditing;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxLotEditing extends Message {

        @JvmField
        public static final ProtoAdapter<TaxLotEditing> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public TaxLotEditing() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27685newBuilder();
        }

        public /* synthetic */ TaxLotEditing(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxLotEditing(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27685newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TaxLotEditing) && Intrinsics.areEqual(unknownFields(), ((TaxLotEditing) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TaxLotEditing{}";
        }

        public final TaxLotEditing copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TaxLotEditing(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotEditing.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TaxLotEditing>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$TaxLotEditing$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.TaxLotEditing decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.TaxLotEditing(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.TaxLotEditing value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.TaxLotEditing value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.TaxLotEditing value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.TaxLotEditing redact(Source.TaxLotEditing value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$TaxLotReview;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxLotReview extends Message {

        @JvmField
        public static final ProtoAdapter<TaxLotReview> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public TaxLotReview() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27686newBuilder();
        }

        public /* synthetic */ TaxLotReview(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxLotReview(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27686newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TaxLotReview) && Intrinsics.areEqual(unknownFields(), ((TaxLotReview) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TaxLotReview{}";
        }

        public final TaxLotReview copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TaxLotReview(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotReview.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TaxLotReview>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$TaxLotReview$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.TaxLotReview decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.TaxLotReview(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.TaxLotReview value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.TaxLotReview value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.TaxLotReview value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.TaxLotReview redact(Source.TaxLotReview value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$TaxLotSelection;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxLotSelection extends Message {

        @JvmField
        public static final ProtoAdapter<TaxLotSelection> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public TaxLotSelection() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27687newBuilder();
        }

        public /* synthetic */ TaxLotSelection(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxLotSelection(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27687newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TaxLotSelection) && Intrinsics.areEqual(unknownFields(), ((TaxLotSelection) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TaxLotSelection{}";
        }

        public final TaxLotSelection copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TaxLotSelection(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotSelection.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TaxLotSelection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$TaxLotSelection$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.TaxLotSelection decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.TaxLotSelection(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.TaxLotSelection value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.TaxLotSelection value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.TaxLotSelection value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.TaxLotSelection redact(Source.TaxLotSelection value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$TaxLotConfirmation;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxLotConfirmation extends Message {

        @JvmField
        public static final ProtoAdapter<TaxLotConfirmation> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public TaxLotConfirmation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27684newBuilder();
        }

        public /* synthetic */ TaxLotConfirmation(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxLotConfirmation(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27684newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TaxLotConfirmation) && Intrinsics.areEqual(unknownFields(), ((TaxLotConfirmation) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TaxLotConfirmation{}";
        }

        public final TaxLotConfirmation copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TaxLotConfirmation(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotConfirmation.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TaxLotConfirmation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$TaxLotConfirmation$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.TaxLotConfirmation decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.TaxLotConfirmation(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.TaxLotConfirmation value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.TaxLotConfirmation value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.TaxLotConfirmation value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.TaxLotConfirmation redact(Source.TaxLotConfirmation value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockEditing;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TokenizedStockEditing extends Message {

        @JvmField
        public static final ProtoAdapter<TokenizedStockEditing> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public TokenizedStockEditing() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27689newBuilder();
        }

        public /* synthetic */ TokenizedStockEditing(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenizedStockEditing(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27689newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TokenizedStockEditing) && Intrinsics.areEqual(unknownFields(), ((TokenizedStockEditing) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TokenizedStockEditing{}";
        }

        public final TokenizedStockEditing copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TokenizedStockEditing(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizedStockEditing.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TokenizedStockEditing>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$TokenizedStockEditing$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.TokenizedStockEditing decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.TokenizedStockEditing(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.TokenizedStockEditing value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.TokenizedStockEditing value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.TokenizedStockEditing value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.TokenizedStockEditing redact(Source.TokenizedStockEditing value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockReview;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TokenizedStockReview extends Message {

        @JvmField
        public static final ProtoAdapter<TokenizedStockReview> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public TokenizedStockReview() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27690newBuilder();
        }

        public /* synthetic */ TokenizedStockReview(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenizedStockReview(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27690newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TokenizedStockReview) && Intrinsics.areEqual(unknownFields(), ((TokenizedStockReview) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TokenizedStockReview{}";
        }

        public final TokenizedStockReview copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TokenizedStockReview(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizedStockReview.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TokenizedStockReview>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$TokenizedStockReview$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.TokenizedStockReview decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.TokenizedStockReview(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.TokenizedStockReview value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.TokenizedStockReview value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.TokenizedStockReview value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.TokenizedStockReview redact(Source.TokenizedStockReview value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockConfirmation;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TokenizedStockConfirmation extends Message {

        @JvmField
        public static final ProtoAdapter<TokenizedStockConfirmation> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public TokenizedStockConfirmation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27688newBuilder();
        }

        public /* synthetic */ TokenizedStockConfirmation(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenizedStockConfirmation(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27688newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TokenizedStockConfirmation) && Intrinsics.areEqual(unknownFields(), ((TokenizedStockConfirmation) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TokenizedStockConfirmation{}";
        }

        public final TokenizedStockConfirmation copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TokenizedStockConfirmation(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizedStockConfirmation.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TokenizedStockConfirmation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.Source$TokenizedStockConfirmation$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Source.TokenizedStockConfirmation decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Source.TokenizedStockConfirmation(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Source.TokenizedStockConfirmation value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Source.TokenizedStockConfirmation value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Source.TokenizedStockConfirmation value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Source.TokenizedStockConfirmation redact(Source.TokenizedStockConfirmation value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }
}
