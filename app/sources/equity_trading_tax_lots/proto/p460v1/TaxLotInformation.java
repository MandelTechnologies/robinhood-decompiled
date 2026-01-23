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

/* compiled from: TaxLotInformation.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010Bi\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJo\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b)\u0010\u001eR\"\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b\u000e\u0010.R\"\u0010\u000f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b/\u0010,¨\u00061"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "Lcom/squareup/wire/Message;", "", "", "id", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "term", "Lcom/robinhood/rosetta/common/Money;", "cost_basis", "available_shares", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "purchase_date", "", "is_selectable", "lot_date", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTerm;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;ZLj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTerm;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;ZLj$/time/Instant;Lokio/ByteString;)Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "Ljava/lang/String;", "getId", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "getTerm", "()Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "Lcom/robinhood/rosetta/common/Money;", "getCost_basis", "()Lcom/robinhood/rosetta/common/Money;", "getAvailable_shares", "Lj$/time/Instant;", "getPurchase_date", "()Lj$/time/Instant;", "Z", "()Z", "getLot_date", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TaxLotInformation extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLotInformation> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String available_shares;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "costBasis", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money cost_basis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSelectable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_selectable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lotDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Instant lot_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "purchaseDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant purchase_date;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotTerm#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TaxLotTerm term;

    public TaxLotInformation() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }

    public /* synthetic */ TaxLotInformation(String str, TaxLotTerm taxLotTerm, Money money, String str2, Instant instant, boolean z, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED : taxLotTerm, (i & 4) != 0 ? null : money, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28073newBuilder();
    }

    public final String getId() {
        return this.id;
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

    public final Instant getPurchase_date() {
        return this.purchase_date;
    }

    /* renamed from: is_selectable, reason: from getter */
    public final boolean getIs_selectable() {
        return this.is_selectable;
    }

    public final Instant getLot_date() {
        return this.lot_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotInformation(String id, TaxLotTerm term, Money money, String available_shares, Instant instant, boolean z, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(available_shares, "available_shares");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.term = term;
        this.cost_basis = money;
        this.available_shares = available_shares;
        this.purchase_date = instant;
        this.is_selectable = z;
        this.lot_date = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28073newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLotInformation)) {
            return false;
        }
        TaxLotInformation taxLotInformation = (TaxLotInformation) other;
        return Intrinsics.areEqual(unknownFields(), taxLotInformation.unknownFields()) && Intrinsics.areEqual(this.id, taxLotInformation.id) && this.term == taxLotInformation.term && Intrinsics.areEqual(this.cost_basis, taxLotInformation.cost_basis) && Intrinsics.areEqual(this.available_shares, taxLotInformation.available_shares) && Intrinsics.areEqual(this.purchase_date, taxLotInformation.purchase_date) && this.is_selectable == taxLotInformation.is_selectable && Intrinsics.areEqual(this.lot_date, taxLotInformation.lot_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.term.hashCode()) * 37;
        Money money = this.cost_basis;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.available_shares.hashCode()) * 37;
        Instant instant = this.purchase_date;
        int iHashCode3 = (((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_selectable)) * 37;
        Instant instant2 = this.lot_date;
        int iHashCode4 = iHashCode3 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("term=" + this.term);
        Money money = this.cost_basis;
        if (money != null) {
            arrayList.add("cost_basis=" + money);
        }
        arrayList.add("available_shares=" + Internal.sanitize(this.available_shares));
        Instant instant = this.purchase_date;
        if (instant != null) {
            arrayList.add("purchase_date=" + instant);
        }
        arrayList.add("is_selectable=" + this.is_selectable);
        Instant instant2 = this.lot_date;
        if (instant2 != null) {
            arrayList.add("lot_date=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotInformation{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLotInformation copy$default(TaxLotInformation taxLotInformation, String str, TaxLotTerm taxLotTerm, Money money, String str2, Instant instant, boolean z, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotInformation.id;
        }
        if ((i & 2) != 0) {
            taxLotTerm = taxLotInformation.term;
        }
        if ((i & 4) != 0) {
            money = taxLotInformation.cost_basis;
        }
        if ((i & 8) != 0) {
            str2 = taxLotInformation.available_shares;
        }
        if ((i & 16) != 0) {
            instant = taxLotInformation.purchase_date;
        }
        if ((i & 32) != 0) {
            z = taxLotInformation.is_selectable;
        }
        if ((i & 64) != 0) {
            instant2 = taxLotInformation.lot_date;
        }
        if ((i & 128) != 0) {
            byteString = taxLotInformation.unknownFields();
        }
        Instant instant3 = instant2;
        ByteString byteString2 = byteString;
        Instant instant4 = instant;
        boolean z2 = z;
        return taxLotInformation.copy(str, taxLotTerm, money, str2, instant4, z2, instant3, byteString2);
    }

    public final TaxLotInformation copy(String id, TaxLotTerm term, Money cost_basis, String available_shares, Instant purchase_date, boolean is_selectable, Instant lot_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(available_shares, "available_shares");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLotInformation(id, term, cost_basis, available_shares, purchase_date, is_selectable, lot_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotInformation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLotInformation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.TaxLotInformation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLotInformation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED) {
                    size += TaxLotTerm.ADAPTER.encodedSizeWithTag(2, value.getTerm());
                }
                if (value.getCost_basis() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getCost_basis());
                }
                if (!Intrinsics.areEqual(value.getAvailable_shares(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAvailable_shares());
                }
                if (value.getPurchase_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getPurchase_date());
                }
                if (value.getIs_selectable()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_selectable()));
                }
                return value.getLot_date() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getLot_date()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLotInformation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED) {
                    TaxLotTerm.ADAPTER.encodeWithTag(writer, 2, (int) value.getTerm());
                }
                if (value.getCost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getCost_basis());
                }
                if (!Intrinsics.areEqual(value.getAvailable_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAvailable_shares());
                }
                if (value.getPurchase_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getPurchase_date());
                }
                if (value.getIs_selectable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_selectable()));
                }
                if (value.getLot_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getLot_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLotInformation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLot_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getLot_date());
                }
                if (value.getIs_selectable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_selectable()));
                }
                if (value.getPurchase_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getPurchase_date());
                }
                if (!Intrinsics.areEqual(value.getAvailable_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAvailable_shares());
                }
                if (value.getCost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getCost_basis());
                }
                if (value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED) {
                    TaxLotTerm.ADAPTER.encodeWithTag(writer, 2, (int) value.getTerm());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotInformation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLotTerm taxLotTermDecode = TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                String strDecode2 = strDecode;
                while (true) {
                    TaxLotTerm taxLotTerm = taxLotTermDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        taxLotTermDecode = TaxLotTerm.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    moneyDecode = Money.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 6:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 7:
                                    instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new TaxLotInformation(strDecode, taxLotTerm, moneyDecode, strDecode2, instantDecode, zBooleanValue, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotInformation redact(TaxLotInformation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money cost_basis = value.getCost_basis();
                Money moneyRedact = cost_basis != null ? Money.ADAPTER.redact(cost_basis) : null;
                Instant purchase_date = value.getPurchase_date();
                Instant instantRedact = purchase_date != null ? ProtoAdapter.INSTANT.redact(purchase_date) : null;
                Instant lot_date = value.getLot_date();
                return TaxLotInformation.copy$default(value, null, null, moneyRedact, null, instantRedact, false, lot_date != null ? ProtoAdapter.INSTANT.redact(lot_date) : null, ByteString.EMPTY, 43, null);
            }
        };
    }
}
