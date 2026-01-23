package crypto_perpetuals.common.p435v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.currency.p437v1.Currency;
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

/* compiled from: Money.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J2\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/Money;", "Lcom/squareup/wire/Message;", "", "currency", "Lcrypto_perpetuals/currency/v1/Currency;", "amount", "", "conversion", "Lcrypto_perpetuals/common/v1/Conversion;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/currency/v1/Currency;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Conversion;Lokio/ByteString;)V", "getCurrency", "()Lcrypto_perpetuals/currency/v1/Currency;", "getAmount", "()Ljava/lang/String;", "getConversion", "()Lcrypto_perpetuals/common/v1/Conversion;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Money extends Message {

    @JvmField
    public static final ProtoAdapter<Money> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String amount;

    @WireField(adapter = "crypto_perpetuals.common.v1.Conversion#ADAPTER", schemaIndex = 2, tag = 3)
    private final Conversion conversion;

    @WireField(adapter = "crypto_perpetuals.currency.v1.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Currency currency;

    public Money() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27816newBuilder();
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public /* synthetic */ Money(Currency currency, String str, Conversion conversion, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : currency, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : conversion, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Conversion getConversion() {
        return this.conversion;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Money(Currency currency, String amount, Conversion conversion, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency = currency;
        this.amount = amount;
        this.conversion = conversion;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27816newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Money)) {
            return false;
        }
        Money money = (Money) other;
        return Intrinsics.areEqual(unknownFields(), money.unknownFields()) && Intrinsics.areEqual(this.currency, money.currency) && Intrinsics.areEqual(this.amount, money.amount) && Intrinsics.areEqual(this.conversion, money.conversion);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Currency currency = this.currency;
        int iHashCode2 = (((iHashCode + (currency != null ? currency.hashCode() : 0)) * 37) + this.amount.hashCode()) * 37;
        Conversion conversion = this.conversion;
        int iHashCode3 = iHashCode2 + (conversion != null ? conversion.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Currency currency = this.currency;
        if (currency != null) {
            arrayList.add("currency=" + currency);
        }
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        Conversion conversion = this.conversion;
        if (conversion != null) {
            arrayList.add("conversion=" + conversion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Money{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Money copy$default(Money money, Currency currency, String str, Conversion conversion, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            currency = money.currency;
        }
        if ((i & 2) != 0) {
            str = money.amount;
        }
        if ((i & 4) != 0) {
            conversion = money.conversion;
        }
        if ((i & 8) != 0) {
            byteString = money.unknownFields();
        }
        return money.copy(currency, str, conversion, byteString);
    }

    public final Money copy(Currency currency, String amount, Conversion conversion, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Money(currency, amount, conversion, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Money.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Money>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.common.v1.Money$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Money value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCurrency() != null) {
                    size += Currency.ADAPTER.encodedSizeWithTag(1, value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAmount());
                }
                return size + Conversion.ADAPTER.encodedSizeWithTag(3, value.getConversion());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Money value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCurrency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                Conversion.ADAPTER.encodeWithTag(writer, 3, (int) value.getConversion());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Money value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Conversion.ADAPTER.encodeWithTag(writer, 3, (int) value.getConversion());
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (value.getCurrency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Money redact(Money value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Currency currency = value.getCurrency();
                Currency currencyRedact = currency != null ? Currency.ADAPTER.redact(currency) : null;
                Conversion conversion = value.getConversion();
                return Money.copy$default(value, currencyRedact, null, conversion != null ? Conversion.ADAPTER.redact(conversion) : null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Money decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Currency currencyDecode = null;
                String strDecode = "";
                Conversion conversionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Money(currencyDecode, strDecode, conversionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        currencyDecode = Currency.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        conversionDecode = Conversion.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
