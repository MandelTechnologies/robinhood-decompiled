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

/* compiled from: Conversion.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J0\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/Conversion;", "Lcom/squareup/wire/Message;", "", "currency", "Lcrypto_perpetuals/currency/v1/Currency;", "amount", "", "conversion_rate", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/currency/v1/Currency;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency", "()Lcrypto_perpetuals/currency/v1/Currency;", "getAmount", "()Ljava/lang/String;", "getConversion_rate", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class Conversion extends Message {

    @JvmField
    public static final ProtoAdapter<Conversion> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "conversionRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String conversion_rate;

    @WireField(adapter = "crypto_perpetuals.currency.v1.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Currency currency;

    public Conversion() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ Conversion(Currency currency, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : currency, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27810newBuilder();
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getConversion_rate() {
        return this.conversion_rate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Conversion(Currency currency, String amount, String conversion_rate, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(conversion_rate, "conversion_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency = currency;
        this.amount = amount;
        this.conversion_rate = conversion_rate;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27810newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Conversion)) {
            return false;
        }
        Conversion conversion = (Conversion) other;
        return Intrinsics.areEqual(unknownFields(), conversion.unknownFields()) && Intrinsics.areEqual(this.currency, conversion.currency) && Intrinsics.areEqual(this.amount, conversion.amount) && Intrinsics.areEqual(this.conversion_rate, conversion.conversion_rate);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Currency currency = this.currency;
        int iHashCode2 = ((((iHashCode + (currency != null ? currency.hashCode() : 0)) * 37) + this.amount.hashCode()) * 37) + this.conversion_rate.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Currency currency = this.currency;
        if (currency != null) {
            arrayList.add("currency=" + currency);
        }
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        arrayList.add("conversion_rate=" + Internal.sanitize(this.conversion_rate));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Conversion{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Conversion copy$default(Conversion conversion, Currency currency, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            currency = conversion.currency;
        }
        if ((i & 2) != 0) {
            str = conversion.amount;
        }
        if ((i & 4) != 0) {
            str2 = conversion.conversion_rate;
        }
        if ((i & 8) != 0) {
            byteString = conversion.unknownFields();
        }
        return conversion.copy(currency, str, str2, byteString);
    }

    public final Conversion copy(Currency currency, String amount, String conversion_rate, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(conversion_rate, "conversion_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Conversion(currency, amount, conversion_rate, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Conversion.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Conversion>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.common.v1.Conversion$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Conversion value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCurrency() != null) {
                    size += Currency.ADAPTER.encodedSizeWithTag(1, value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAmount());
                }
                return !Intrinsics.areEqual(value.getConversion_rate(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getConversion_rate()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Conversion value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCurrency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getConversion_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getConversion_rate());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Conversion value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getConversion_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getConversion_rate());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (value.getCurrency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Conversion redact(Conversion value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Currency currency = value.getCurrency();
                return Conversion.copy$default(value, currency != null ? Currency.ADAPTER.redact(currency) : null, null, null, ByteString.EMPTY, 6, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Conversion decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Currency currencyDecode = null;
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Conversion(currencyDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        currencyDecode = Currency.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
