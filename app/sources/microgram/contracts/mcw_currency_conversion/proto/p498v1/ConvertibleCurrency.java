package microgram.contracts.mcw_currency_conversion.proto.p498v1;

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

/* compiled from: ConvertibleCurrency.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertibleCurrency;", "Lcom/squareup/wire/Message;", "", "currency", "Lcom/robinhood/rosetta/common/Currency;", "balance", "", "transaction_min", "transaction_max", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getBalance", "()Ljava/lang/String;", "getTransaction_min", "getTransaction_max", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ConvertibleCurrency extends Message {

    @JvmField
    public static final ProtoAdapter<ConvertibleCurrency> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String balance;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Currency currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transactionMax", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String transaction_max;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transactionMin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String transaction_min;

    public ConvertibleCurrency() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29164newBuilder();
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public /* synthetic */ ConvertibleCurrency(Currency currency, String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getBalance() {
        return this.balance;
    }

    public final String getTransaction_min() {
        return this.transaction_min;
    }

    public final String getTransaction_max() {
        return this.transaction_max;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertibleCurrency(Currency currency, String balance, String transaction_min, String transaction_max, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(transaction_min, "transaction_min");
        Intrinsics.checkNotNullParameter(transaction_max, "transaction_max");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency = currency;
        this.balance = balance;
        this.transaction_min = transaction_min;
        this.transaction_max = transaction_max;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29164newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ConvertibleCurrency)) {
            return false;
        }
        ConvertibleCurrency convertibleCurrency = (ConvertibleCurrency) other;
        return Intrinsics.areEqual(unknownFields(), convertibleCurrency.unknownFields()) && this.currency == convertibleCurrency.currency && Intrinsics.areEqual(this.balance, convertibleCurrency.balance) && Intrinsics.areEqual(this.transaction_min, convertibleCurrency.transaction_min) && Intrinsics.areEqual(this.transaction_max, convertibleCurrency.transaction_max);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.currency.hashCode()) * 37) + this.balance.hashCode()) * 37) + this.transaction_min.hashCode()) * 37) + this.transaction_max.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency=" + this.currency);
        arrayList.add("balance=" + Internal.sanitize(this.balance));
        arrayList.add("transaction_min=" + Internal.sanitize(this.transaction_min));
        arrayList.add("transaction_max=" + Internal.sanitize(this.transaction_max));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConvertibleCurrency{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ConvertibleCurrency copy$default(ConvertibleCurrency convertibleCurrency, Currency currency, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            currency = convertibleCurrency.currency;
        }
        if ((i & 2) != 0) {
            str = convertibleCurrency.balance;
        }
        if ((i & 4) != 0) {
            str2 = convertibleCurrency.transaction_min;
        }
        if ((i & 8) != 0) {
            str3 = convertibleCurrency.transaction_max;
        }
        if ((i & 16) != 0) {
            byteString = convertibleCurrency.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return convertibleCurrency.copy(currency, str, str4, str3, byteString2);
    }

    public final ConvertibleCurrency copy(Currency currency, String balance, String transaction_min, String transaction_max, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(transaction_min, "transaction_min");
        Intrinsics.checkNotNullParameter(transaction_max, "transaction_max");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ConvertibleCurrency(currency, balance, transaction_min, transaction_max, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConvertibleCurrency.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ConvertibleCurrency>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_currency_conversion.proto.v1.ConvertibleCurrency$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ConvertibleCurrency value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(1, value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getBalance(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBalance());
                }
                if (!Intrinsics.areEqual(value.getTransaction_min(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTransaction_min());
                }
                return !Intrinsics.areEqual(value.getTransaction_max(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTransaction_max()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ConvertibleCurrency value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getBalance(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBalance());
                }
                if (!Intrinsics.areEqual(value.getTransaction_min(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTransaction_min());
                }
                if (!Intrinsics.areEqual(value.getTransaction_max(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTransaction_max());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ConvertibleCurrency value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTransaction_max(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTransaction_max());
                }
                if (!Intrinsics.areEqual(value.getTransaction_min(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTransaction_min());
                }
                if (!Intrinsics.areEqual(value.getBalance(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBalance());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConvertibleCurrency decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    Currency currency = currencyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ConvertibleCurrency(currency, strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                currencyDecode = Currency.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConvertibleCurrency redact(ConvertibleCurrency value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ConvertibleCurrency.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
