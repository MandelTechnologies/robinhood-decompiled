package microgram.contracts.mcw_currency_conversion.proto.p498v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Currency;
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

/* compiled from: ConvertCurrencyRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006!"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequest;", "Lcom/squareup/wire/Message;", "", "ref_id", "", "account_number", "symbol_id", "amount_to_convert", "from_currency", "Lcom/robinhood/rosetta/common/Currency;", "to_currency", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Lcom/robinhood/rosetta/common/Currency;Lokio/ByteString;)V", "getRef_id", "()Ljava/lang/String;", "getAccount_number", "getSymbol_id", "getAmount_to_convert", "getFrom_currency", "()Lcom/robinhood/rosetta/common/Currency;", "getTo_currency", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ConvertCurrencyRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ConvertCurrencyRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "amountToConvert", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String amount_to_convert;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "fromCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Currency from_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "symbolId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "toCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Currency to_currency;

    public ConvertCurrencyRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ConvertCurrencyRequest(String str, String str2, String str3, String str4, Currency currency, Currency currency2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 32) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29161newBuilder();
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getSymbol_id() {
        return this.symbol_id;
    }

    public final String getAmount_to_convert() {
        return this.amount_to_convert;
    }

    public final Currency getFrom_currency() {
        return this.from_currency;
    }

    public final Currency getTo_currency() {
        return this.to_currency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertCurrencyRequest(String ref_id, String account_number, String symbol_id, String amount_to_convert, Currency from_currency, Currency to_currency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(symbol_id, "symbol_id");
        Intrinsics.checkNotNullParameter(amount_to_convert, "amount_to_convert");
        Intrinsics.checkNotNullParameter(from_currency, "from_currency");
        Intrinsics.checkNotNullParameter(to_currency, "to_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ref_id = ref_id;
        this.account_number = account_number;
        this.symbol_id = symbol_id;
        this.amount_to_convert = amount_to_convert;
        this.from_currency = from_currency;
        this.to_currency = to_currency;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29161newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ConvertCurrencyRequest)) {
            return false;
        }
        ConvertCurrencyRequest convertCurrencyRequest = (ConvertCurrencyRequest) other;
        return Intrinsics.areEqual(unknownFields(), convertCurrencyRequest.unknownFields()) && Intrinsics.areEqual(this.ref_id, convertCurrencyRequest.ref_id) && Intrinsics.areEqual(this.account_number, convertCurrencyRequest.account_number) && Intrinsics.areEqual(this.symbol_id, convertCurrencyRequest.symbol_id) && Intrinsics.areEqual(this.amount_to_convert, convertCurrencyRequest.amount_to_convert) && this.from_currency == convertCurrencyRequest.from_currency && this.to_currency == convertCurrencyRequest.to_currency;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.ref_id.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.symbol_id.hashCode()) * 37) + this.amount_to_convert.hashCode()) * 37) + this.from_currency.hashCode()) * 37) + this.to_currency.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("symbol_id=" + Internal.sanitize(this.symbol_id));
        arrayList.add("amount_to_convert=" + Internal.sanitize(this.amount_to_convert));
        arrayList.add("from_currency=" + this.from_currency);
        arrayList.add("to_currency=" + this.to_currency);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConvertCurrencyRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ConvertCurrencyRequest copy$default(ConvertCurrencyRequest convertCurrencyRequest, String str, String str2, String str3, String str4, Currency currency, Currency currency2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = convertCurrencyRequest.ref_id;
        }
        if ((i & 2) != 0) {
            str2 = convertCurrencyRequest.account_number;
        }
        if ((i & 4) != 0) {
            str3 = convertCurrencyRequest.symbol_id;
        }
        if ((i & 8) != 0) {
            str4 = convertCurrencyRequest.amount_to_convert;
        }
        if ((i & 16) != 0) {
            currency = convertCurrencyRequest.from_currency;
        }
        if ((i & 32) != 0) {
            currency2 = convertCurrencyRequest.to_currency;
        }
        if ((i & 64) != 0) {
            byteString = convertCurrencyRequest.unknownFields();
        }
        Currency currency3 = currency2;
        ByteString byteString2 = byteString;
        Currency currency4 = currency;
        String str5 = str3;
        return convertCurrencyRequest.copy(str, str2, str5, str4, currency4, currency3, byteString2);
    }

    public final ConvertCurrencyRequest copy(String ref_id, String account_number, String symbol_id, String amount_to_convert, Currency from_currency, Currency to_currency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(symbol_id, "symbol_id");
        Intrinsics.checkNotNullParameter(amount_to_convert, "amount_to_convert");
        Intrinsics.checkNotNullParameter(from_currency, "from_currency");
        Intrinsics.checkNotNullParameter(to_currency, "to_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ConvertCurrencyRequest(ref_id, account_number, symbol_id, amount_to_convert, from_currency, to_currency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConvertCurrencyRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ConvertCurrencyRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_currency_conversion.proto.v1.ConvertCurrencyRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ConvertCurrencyRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getSymbol_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol_id());
                }
                if (!Intrinsics.areEqual(value.getAmount_to_convert(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAmount_to_convert());
                }
                Currency from_currency = value.getFrom_currency();
                Currency currency = Currency.CURRENCY_UNSPECIFIED;
                if (from_currency != currency) {
                    size += Currency.ADAPTER.encodedSizeWithTag(5, value.getFrom_currency());
                }
                return value.getTo_currency() != currency ? size + Currency.ADAPTER.encodedSizeWithTag(6, value.getTo_currency()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ConvertCurrencyRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getSymbol_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol_id());
                }
                if (!Intrinsics.areEqual(value.getAmount_to_convert(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAmount_to_convert());
                }
                Currency from_currency = value.getFrom_currency();
                Currency currency = Currency.CURRENCY_UNSPECIFIED;
                if (from_currency != currency) {
                    Currency.ADAPTER.encodeWithTag(writer, 5, (int) value.getFrom_currency());
                }
                if (value.getTo_currency() != currency) {
                    Currency.ADAPTER.encodeWithTag(writer, 6, (int) value.getTo_currency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ConvertCurrencyRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Currency to_currency = value.getTo_currency();
                Currency currency = Currency.CURRENCY_UNSPECIFIED;
                if (to_currency != currency) {
                    Currency.ADAPTER.encodeWithTag(writer, 6, (int) value.getTo_currency());
                }
                if (value.getFrom_currency() != currency) {
                    Currency.ADAPTER.encodeWithTag(writer, 5, (int) value.getFrom_currency());
                }
                if (!Intrinsics.areEqual(value.getAmount_to_convert(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAmount_to_convert());
                }
                if (!Intrinsics.areEqual(value.getSymbol_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getRef_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConvertCurrencyRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currency = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Currency currencyDecode = currency;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Currency currencyDecode2 = currencyDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                try {
                                    currencyDecode2 = Currency.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                try {
                                    currencyDecode = Currency.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ConvertCurrencyRequest(strDecode, strDecode2, strDecode3, strDecode4, currencyDecode2, currencyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConvertCurrencyRequest redact(ConvertCurrencyRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ConvertCurrencyRequest.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
