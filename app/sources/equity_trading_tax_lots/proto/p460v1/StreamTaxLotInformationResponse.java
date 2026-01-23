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

/* compiled from: StreamTaxLotInformationResponse.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B¯\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$Jµ\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010$R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010$R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b*\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b1\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b3\u0010$R\"\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b7\u0010$R\"\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b8\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b9\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b:\u00100¨\u0006<"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;", "Lcom/squareup/wire/Message;", "", "", "id", "order_id", "rhs_account_number", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "term", "Lcom/robinhood/rosetta/common/Money;", "cost_basis", "available_shares", "gain_loss", "selected_shares", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "purchase_date", "display_value", "lot_date", "gain_loss_ratio", "total_cost", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTerm;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTerm;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;", "Ljava/lang/String;", "getId", "getOrder_id", "getRhs_account_number", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "getTerm", "()Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "Lcom/robinhood/rosetta/common/Money;", "getCost_basis", "()Lcom/robinhood/rosetta/common/Money;", "getAvailable_shares", "getGain_loss", "getSelected_shares", "Lj$/time/Instant;", "getPurchase_date", "()Lj$/time/Instant;", "getDisplay_value", "getLot_date", "getGain_loss_ratio", "getTotal_cost", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamTaxLotInformationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamTaxLotInformationResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String available_shares;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "costBasis", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money cost_basis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayValue", schemaIndex = 9, tag = 10)
    private final String display_value;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "gainLoss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money gain_loss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "gainLossRatio", schemaIndex = 11, tag = 12)
    private final String gain_loss_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lotDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant lot_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "purchaseDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant purchase_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rhs_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedShares", schemaIndex = 7, tag = 8)
    private final String selected_shares;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotTerm#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final TaxLotTerm term;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalCost", schemaIndex = 12, tag = 13)
    private final Money total_cost;

    public StreamTaxLotInformationResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public /* synthetic */ StreamTaxLotInformationResponse(String str, String str2, String str3, TaxLotTerm taxLotTerm, Money money, String str4, Money money2, String str5, Instant instant, String str6, Instant instant2, String str7, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED : taxLotTerm, (i & 16) != 0 ? null : money, (i & 32) == 0 ? str4 : "", (i & 64) != 0 ? null : money2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : str7, (i & 4096) == 0 ? money3 : null, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28060newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final TaxLotTerm getTerm() {
        return this.term;
    }

    public final Money getCost_basis() {
        return this.cost_basis;
    }

    public final String getAvailable_shares() {
        return this.available_shares;
    }

    public final Money getGain_loss() {
        return this.gain_loss;
    }

    public final String getSelected_shares() {
        return this.selected_shares;
    }

    public final Instant getPurchase_date() {
        return this.purchase_date;
    }

    public final String getDisplay_value() {
        return this.display_value;
    }

    public final Instant getLot_date() {
        return this.lot_date;
    }

    public final String getGain_loss_ratio() {
        return this.gain_loss_ratio;
    }

    public final Money getTotal_cost() {
        return this.total_cost;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotInformationResponse(String id, String order_id, String rhs_account_number, TaxLotTerm term, Money money, String available_shares, Money money2, String str, Instant instant, String str2, Instant instant2, String str3, Money money3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(available_shares, "available_shares");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.order_id = order_id;
        this.rhs_account_number = rhs_account_number;
        this.term = term;
        this.cost_basis = money;
        this.available_shares = available_shares;
        this.gain_loss = money2;
        this.selected_shares = str;
        this.purchase_date = instant;
        this.display_value = str2;
        this.lot_date = instant2;
        this.gain_loss_ratio = str3;
        this.total_cost = money3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28060newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamTaxLotInformationResponse)) {
            return false;
        }
        StreamTaxLotInformationResponse streamTaxLotInformationResponse = (StreamTaxLotInformationResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamTaxLotInformationResponse.unknownFields()) && Intrinsics.areEqual(this.id, streamTaxLotInformationResponse.id) && Intrinsics.areEqual(this.order_id, streamTaxLotInformationResponse.order_id) && Intrinsics.areEqual(this.rhs_account_number, streamTaxLotInformationResponse.rhs_account_number) && this.term == streamTaxLotInformationResponse.term && Intrinsics.areEqual(this.cost_basis, streamTaxLotInformationResponse.cost_basis) && Intrinsics.areEqual(this.available_shares, streamTaxLotInformationResponse.available_shares) && Intrinsics.areEqual(this.gain_loss, streamTaxLotInformationResponse.gain_loss) && Intrinsics.areEqual(this.selected_shares, streamTaxLotInformationResponse.selected_shares) && Intrinsics.areEqual(this.purchase_date, streamTaxLotInformationResponse.purchase_date) && Intrinsics.areEqual(this.display_value, streamTaxLotInformationResponse.display_value) && Intrinsics.areEqual(this.lot_date, streamTaxLotInformationResponse.lot_date) && Intrinsics.areEqual(this.gain_loss_ratio, streamTaxLotInformationResponse.gain_loss_ratio) && Intrinsics.areEqual(this.total_cost, streamTaxLotInformationResponse.total_cost);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37) + this.term.hashCode()) * 37;
        Money money = this.cost_basis;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.available_shares.hashCode()) * 37;
        Money money2 = this.gain_loss;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str = this.selected_shares;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Instant instant = this.purchase_date;
        int iHashCode5 = (iHashCode4 + (instant != null ? instant.hashCode() : 0)) * 37;
        String str2 = this.display_value;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Instant instant2 = this.lot_date;
        int iHashCode7 = (iHashCode6 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        String str3 = this.gain_loss_ratio;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money3 = this.total_cost;
        int iHashCode9 = iHashCode8 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("term=" + this.term);
        Money money = this.cost_basis;
        if (money != null) {
            arrayList.add("cost_basis=" + money);
        }
        arrayList.add("available_shares=" + Internal.sanitize(this.available_shares));
        Money money2 = this.gain_loss;
        if (money2 != null) {
            arrayList.add("gain_loss=" + money2);
        }
        String str = this.selected_shares;
        if (str != null) {
            arrayList.add("selected_shares=" + Internal.sanitize(str));
        }
        Instant instant = this.purchase_date;
        if (instant != null) {
            arrayList.add("purchase_date=" + instant);
        }
        String str2 = this.display_value;
        if (str2 != null) {
            arrayList.add("display_value=" + Internal.sanitize(str2));
        }
        Instant instant2 = this.lot_date;
        if (instant2 != null) {
            arrayList.add("lot_date=" + instant2);
        }
        String str3 = this.gain_loss_ratio;
        if (str3 != null) {
            arrayList.add("gain_loss_ratio=" + Internal.sanitize(str3));
        }
        Money money3 = this.total_cost;
        if (money3 != null) {
            arrayList.add("total_cost=" + money3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamTaxLotInformationResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamTaxLotInformationResponse copy(String id, String order_id, String rhs_account_number, TaxLotTerm term, Money cost_basis, String available_shares, Money gain_loss, String selected_shares, Instant purchase_date, String display_value, Instant lot_date, String gain_loss_ratio, Money total_cost, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(available_shares, "available_shares");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamTaxLotInformationResponse(id, order_id, rhs_account_number, term, cost_basis, available_shares, gain_loss, selected_shares, purchase_date, display_value, lot_date, gain_loss_ratio, total_cost, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamTaxLotInformationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamTaxLotInformationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotInformationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamTaxLotInformationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRhs_account_number());
                }
                if (value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED) {
                    size += TaxLotTerm.ADAPTER.encodedSizeWithTag(4, value.getTerm());
                }
                if (value.getCost_basis() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getCost_basis());
                }
                if (!Intrinsics.areEqual(value.getAvailable_shares(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAvailable_shares());
                }
                if (value.getGain_loss() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getGain_loss());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(8, value.getSelected_shares());
                if (value.getPurchase_date() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getPurchase_date());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, value.getDisplay_value());
                if (value.getLot_date() != null) {
                    iEncodedSizeWithTag2 += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getLot_date());
                }
                return iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(12, value.getGain_loss_ratio()) + Money.ADAPTER.encodedSizeWithTag(13, value.getTotal_cost());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamTaxLotInformationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhs_account_number());
                }
                if (value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED) {
                    TaxLotTerm.ADAPTER.encodeWithTag(writer, 4, (int) value.getTerm());
                }
                if (value.getCost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getCost_basis());
                }
                if (!Intrinsics.areEqual(value.getAvailable_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAvailable_shares());
                }
                if (value.getGain_loss() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getGain_loss());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getSelected_shares());
                if (value.getPurchase_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getPurchase_date());
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDisplay_value());
                if (value.getLot_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getLot_date());
                }
                protoAdapter.encodeWithTag(writer, 12, (int) value.getGain_loss_ratio());
                Money.ADAPTER.encodeWithTag(writer, 13, (int) value.getTotal_cost());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamTaxLotInformationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 13, (int) value.getTotal_cost());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getGain_loss_ratio());
                if (value.getLot_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getLot_date());
                }
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getDisplay_value());
                if (value.getPurchase_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getPurchase_date());
                }
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getSelected_shares());
                if (value.getGain_loss() != null) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getGain_loss());
                }
                if (!Intrinsics.areEqual(value.getAvailable_shares(), "")) {
                    protoAdapter2.encodeWithTag(writer, 6, (int) value.getAvailable_shares());
                }
                if (value.getCost_basis() != null) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCost_basis());
                }
                if (value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED) {
                    TaxLotTerm.ADAPTER.encodeWithTag(writer, 4, (int) value.getTerm());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    protoAdapter2.encodeWithTag(writer, 3, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    protoAdapter2.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotInformationResponse decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLotTerm taxLotTerm = TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TaxLotTerm taxLotTermDecode = taxLotTerm;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                String strDecode4 = null;
                Instant instantDecode = null;
                String strDecode5 = null;
                Instant instantDecode2 = null;
                String strDecode6 = null;
                Money moneyDecode3 = null;
                String strDecode7 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                try {
                                    taxLotTermDecode = TaxLotTerm.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode7;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode7;
                                str2 = strDecode;
                                str3 = strDecode2;
                                break;
                        }
                        strDecode7 = str;
                        strDecode = str2;
                        strDecode2 = str3;
                    } else {
                        return new StreamTaxLotInformationResponse(strDecode7, strDecode, strDecode2, taxLotTermDecode, moneyDecode, strDecode3, moneyDecode2, strDecode4, instantDecode, strDecode5, instantDecode2, strDecode6, moneyDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotInformationResponse redact(StreamTaxLotInformationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money cost_basis = value.getCost_basis();
                Money moneyRedact = cost_basis != null ? Money.ADAPTER.redact(cost_basis) : null;
                Money gain_loss = value.getGain_loss();
                Money moneyRedact2 = gain_loss != null ? Money.ADAPTER.redact(gain_loss) : null;
                Instant purchase_date = value.getPurchase_date();
                Instant instantRedact = purchase_date != null ? ProtoAdapter.INSTANT.redact(purchase_date) : null;
                Instant lot_date = value.getLot_date();
                Instant instantRedact2 = lot_date != null ? ProtoAdapter.INSTANT.redact(lot_date) : null;
                Money total_cost = value.getTotal_cost();
                return value.copy((2735 & 1) != 0 ? value.id : null, (2735 & 2) != 0 ? value.order_id : null, (2735 & 4) != 0 ? value.rhs_account_number : null, (2735 & 8) != 0 ? value.term : null, (2735 & 16) != 0 ? value.cost_basis : moneyRedact, (2735 & 32) != 0 ? value.available_shares : null, (2735 & 64) != 0 ? value.gain_loss : moneyRedact2, (2735 & 128) != 0 ? value.selected_shares : null, (2735 & 256) != 0 ? value.purchase_date : instantRedact, (2735 & 512) != 0 ? value.display_value : null, (2735 & 1024) != 0 ? value.lot_date : instantRedact2, (2735 & 2048) != 0 ? value.gain_loss_ratio : null, (2735 & 4096) != 0 ? value.total_cost : total_cost != null ? Money.ADAPTER.redact(total_cost) : null, (2735 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
