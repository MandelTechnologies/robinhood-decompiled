package nummus.p512v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: CorpActionCashDividends.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*Bg\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJm\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\"\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\"\u0010\u000b\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b)\u0010\u001c¨\u0006+"}, m3636d2 = {"Lnummus/v1/CorpActionCashDividends;", "Lcom/squareup/wire/Message;", "", "", "currency_id", "Lcom/robinhood/rosetta/common/Money;", "per_share_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "payable_date", "record_date", "ex_dividend_date", "currency_pair_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lnummus/v1/CorpActionCashDividends;", "Ljava/lang/String;", "getCurrency_id", "Lcom/robinhood/rosetta/common/Money;", "getPer_share_amount", "()Lcom/robinhood/rosetta/common/Money;", "Lj$/time/Instant;", "getPayable_date", "()Lj$/time/Instant;", "getRecord_date", "getEx_dividend_date", "getCurrency_pair_id", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CorpActionCashDividends extends Message {

    @JvmField
    public static final ProtoAdapter<CorpActionCashDividends> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "exDividendDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant ex_dividend_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "payableDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant payable_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "perShareAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money per_share_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "recordDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant record_date;

    public CorpActionCashDividends() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CorpActionCashDividends(String str, Money money, Instant instant, Instant instant2, Instant instant3, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : instant3, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29395newBuilder();
    }

    public final String getCurrency_id() {
        return this.currency_id;
    }

    public final Money getPer_share_amount() {
        return this.per_share_amount;
    }

    public final Instant getPayable_date() {
        return this.payable_date;
    }

    public final Instant getRecord_date() {
        return this.record_date;
    }

    public final Instant getEx_dividend_date() {
        return this.ex_dividend_date;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpActionCashDividends(String currency_id, Money money, Instant instant, Instant instant2, Instant instant3, String currency_pair_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_id = currency_id;
        this.per_share_amount = money;
        this.payable_date = instant;
        this.record_date = instant2;
        this.ex_dividend_date = instant3;
        this.currency_pair_id = currency_pair_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29395newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CorpActionCashDividends)) {
            return false;
        }
        CorpActionCashDividends corpActionCashDividends = (CorpActionCashDividends) other;
        return Intrinsics.areEqual(unknownFields(), corpActionCashDividends.unknownFields()) && Intrinsics.areEqual(this.currency_id, corpActionCashDividends.currency_id) && Intrinsics.areEqual(this.per_share_amount, corpActionCashDividends.per_share_amount) && Intrinsics.areEqual(this.payable_date, corpActionCashDividends.payable_date) && Intrinsics.areEqual(this.record_date, corpActionCashDividends.record_date) && Intrinsics.areEqual(this.ex_dividend_date, corpActionCashDividends.ex_dividend_date) && Intrinsics.areEqual(this.currency_pair_id, corpActionCashDividends.currency_pair_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.currency_id.hashCode()) * 37;
        Money money = this.per_share_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Instant instant = this.payable_date;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.record_date;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.ex_dividend_date;
        int iHashCode5 = ((iHashCode4 + (instant3 != null ? instant3.hashCode() : 0)) * 37) + this.currency_pair_id.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_id=" + Internal.sanitize(this.currency_id));
        Money money = this.per_share_amount;
        if (money != null) {
            arrayList.add("per_share_amount=" + money);
        }
        Instant instant = this.payable_date;
        if (instant != null) {
            arrayList.add("payable_date=" + instant);
        }
        Instant instant2 = this.record_date;
        if (instant2 != null) {
            arrayList.add("record_date=" + instant2);
        }
        Instant instant3 = this.ex_dividend_date;
        if (instant3 != null) {
            arrayList.add("ex_dividend_date=" + instant3);
        }
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CorpActionCashDividends{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CorpActionCashDividends copy$default(CorpActionCashDividends corpActionCashDividends, String str, Money money, Instant instant, Instant instant2, Instant instant3, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = corpActionCashDividends.currency_id;
        }
        if ((i & 2) != 0) {
            money = corpActionCashDividends.per_share_amount;
        }
        if ((i & 4) != 0) {
            instant = corpActionCashDividends.payable_date;
        }
        if ((i & 8) != 0) {
            instant2 = corpActionCashDividends.record_date;
        }
        if ((i & 16) != 0) {
            instant3 = corpActionCashDividends.ex_dividend_date;
        }
        if ((i & 32) != 0) {
            str2 = corpActionCashDividends.currency_pair_id;
        }
        if ((i & 64) != 0) {
            byteString = corpActionCashDividends.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        Instant instant4 = instant3;
        Instant instant5 = instant;
        return corpActionCashDividends.copy(str, money, instant5, instant2, instant4, str3, byteString2);
    }

    public final CorpActionCashDividends copy(String currency_id, Money per_share_amount, Instant payable_date, Instant record_date, Instant ex_dividend_date, String currency_pair_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CorpActionCashDividends(currency_id, per_share_amount, payable_date, record_date, ex_dividend_date, currency_pair_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CorpActionCashDividends.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CorpActionCashDividends>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CorpActionCashDividends$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CorpActionCashDividends value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_id());
                }
                if (value.getPer_share_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getPer_share_amount());
                }
                if (value.getPayable_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getPayable_date());
                }
                if (value.getRecord_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getRecord_date());
                }
                if (value.getEx_dividend_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getEx_dividend_date());
                }
                return !Intrinsics.areEqual(value.getCurrency_pair_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getCurrency_pair_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CorpActionCashDividends value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_id());
                }
                if (value.getPer_share_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getPer_share_amount());
                }
                if (value.getPayable_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getPayable_date());
                }
                if (value.getRecord_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getRecord_date());
                }
                if (value.getEx_dividend_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getEx_dividend_date());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCurrency_pair_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CorpActionCashDividends value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCurrency_pair_id());
                }
                if (value.getEx_dividend_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getEx_dividend_date());
                }
                if (value.getRecord_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getRecord_date());
                }
                if (value.getPayable_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getPayable_date());
                }
                if (value.getPer_share_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getPer_share_amount());
                }
                if (Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionCashDividends redact(CorpActionCashDividends value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money per_share_amount = value.getPer_share_amount();
                Money moneyRedact = per_share_amount != null ? Money.ADAPTER.redact(per_share_amount) : null;
                Instant payable_date = value.getPayable_date();
                Instant instantRedact = payable_date != null ? ProtoAdapter.INSTANT.redact(payable_date) : null;
                Instant record_date = value.getRecord_date();
                Instant instantRedact2 = record_date != null ? ProtoAdapter.INSTANT.redact(record_date) : null;
                Instant ex_dividend_date = value.getEx_dividend_date();
                return CorpActionCashDividends.copy$default(value, null, moneyRedact, instantRedact, instantRedact2, ex_dividend_date != null ? ProtoAdapter.INSTANT.redact(ex_dividend_date) : null, null, ByteString.EMPTY, 33, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionCashDividends decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CorpActionCashDividends(strDecode, moneyDecode, instantDecode, instantDecode2, instantDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
