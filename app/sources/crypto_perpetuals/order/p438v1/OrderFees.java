package crypto_perpetuals.order.p438v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.Money;
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

/* compiled from: OrderFees.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderFees;", "Lcom/squareup/wire/Message;", "", "fees", "Lcrypto_perpetuals/common/v1/Money;", "robinhood_fees", "venue_fees", "fx_quote", "Lcrypto_perpetuals/common/v1/FXQuote;", "summary_text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/FXQuote;Ljava/lang/String;Lokio/ByteString;)V", "getFees", "()Lcrypto_perpetuals/common/v1/Money;", "getRobinhood_fees", "getVenue_fees", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuote;", "getSummary_text", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderFees extends Message {

    @JvmField
    public static final ProtoAdapter<OrderFees> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money fees;

    @WireField(adapter = "crypto_perpetuals.common.v1.FXQuote#ADAPTER", jsonName = "fxQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final FXQuote fx_quote;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "robinhoodFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money robinhood_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "summaryText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String summary_text;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "venueFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money venue_fees;

    public OrderFees() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27844newBuilder();
    }

    public final Money getFees() {
        return this.fees;
    }

    public final Money getRobinhood_fees() {
        return this.robinhood_fees;
    }

    public final Money getVenue_fees() {
        return this.venue_fees;
    }

    public final FXQuote getFx_quote() {
        return this.fx_quote;
    }

    public final String getSummary_text() {
        return this.summary_text;
    }

    public /* synthetic */ OrderFees(Money money, Money money2, Money money3, FXQuote fXQuote, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : fXQuote, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFees(Money money, Money money2, Money money3, FXQuote fXQuote, String summary_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(summary_text, "summary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fees = money;
        this.robinhood_fees = money2;
        this.venue_fees = money3;
        this.fx_quote = fXQuote;
        this.summary_text = summary_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27844newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderFees)) {
            return false;
        }
        OrderFees orderFees = (OrderFees) other;
        return Intrinsics.areEqual(unknownFields(), orderFees.unknownFields()) && Intrinsics.areEqual(this.fees, orderFees.fees) && Intrinsics.areEqual(this.robinhood_fees, orderFees.robinhood_fees) && Intrinsics.areEqual(this.venue_fees, orderFees.venue_fees) && Intrinsics.areEqual(this.fx_quote, orderFees.fx_quote) && Intrinsics.areEqual(this.summary_text, orderFees.summary_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.fees;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.robinhood_fees;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.venue_fees;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        FXQuote fXQuote = this.fx_quote;
        int iHashCode5 = ((iHashCode4 + (fXQuote != null ? fXQuote.hashCode() : 0)) * 37) + this.summary_text.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.fees;
        if (money != null) {
            arrayList.add("fees=" + money);
        }
        Money money2 = this.robinhood_fees;
        if (money2 != null) {
            arrayList.add("robinhood_fees=" + money2);
        }
        Money money3 = this.venue_fees;
        if (money3 != null) {
            arrayList.add("venue_fees=" + money3);
        }
        FXQuote fXQuote = this.fx_quote;
        if (fXQuote != null) {
            arrayList.add("fx_quote=" + fXQuote);
        }
        arrayList.add("summary_text=" + Internal.sanitize(this.summary_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderFees{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderFees copy$default(OrderFees orderFees, Money money, Money money2, Money money3, FXQuote fXQuote, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = orderFees.fees;
        }
        if ((i & 2) != 0) {
            money2 = orderFees.robinhood_fees;
        }
        if ((i & 4) != 0) {
            money3 = orderFees.venue_fees;
        }
        if ((i & 8) != 0) {
            fXQuote = orderFees.fx_quote;
        }
        if ((i & 16) != 0) {
            str = orderFees.summary_text;
        }
        if ((i & 32) != 0) {
            byteString = orderFees.unknownFields();
        }
        String str2 = str;
        ByteString byteString2 = byteString;
        return orderFees.copy(money, money2, money3, fXQuote, str2, byteString2);
    }

    public final OrderFees copy(Money fees, Money robinhood_fees, Money venue_fees, FXQuote fx_quote, String summary_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(summary_text, "summary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderFees(fees, robinhood_fees, venue_fees, fx_quote, summary_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderFees.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderFees>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.OrderFees$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderFees value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFees() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getFees());
                }
                if (value.getRobinhood_fees() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getRobinhood_fees());
                }
                if (value.getVenue_fees() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getVenue_fees());
                }
                if (value.getFx_quote() != null) {
                    size += FXQuote.ADAPTER.encodedSizeWithTag(4, value.getFx_quote());
                }
                return !Intrinsics.areEqual(value.getSummary_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSummary_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderFees value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getFees());
                }
                if (value.getRobinhood_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getRobinhood_fees());
                }
                if (value.getVenue_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getVenue_fees());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 4, (int) value.getFx_quote());
                }
                if (!Intrinsics.areEqual(value.getSummary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSummary_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderFees value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSummary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSummary_text());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 4, (int) value.getFx_quote());
                }
                if (value.getVenue_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getVenue_fees());
                }
                if (value.getRobinhood_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getRobinhood_fees());
                }
                if (value.getFees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getFees());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderFees redact(OrderFees value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money fees = value.getFees();
                Money moneyRedact = fees != null ? Money.ADAPTER.redact(fees) : null;
                Money robinhood_fees = value.getRobinhood_fees();
                Money moneyRedact2 = robinhood_fees != null ? Money.ADAPTER.redact(robinhood_fees) : null;
                Money venue_fees = value.getVenue_fees();
                Money moneyRedact3 = venue_fees != null ? Money.ADAPTER.redact(venue_fees) : null;
                FXQuote fx_quote = value.getFx_quote();
                return OrderFees.copy$default(value, moneyRedact, moneyRedact2, moneyRedact3, fx_quote != null ? FXQuote.ADAPTER.redact(fx_quote) : null, null, ByteString.EMPTY, 16, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderFees decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                FXQuote fXQuoteDecode = null;
                String strDecode = "";
                Money moneyDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderFees(moneyDecode, moneyDecode3, moneyDecode2, fXQuoteDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        fXQuoteDecode = FXQuote.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
