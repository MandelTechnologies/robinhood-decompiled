package microgram.contracts.mcw_fx_rates.proto.p499v1;

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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: DisplayFxRate.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/contracts/mcw_fx_rates/proto/v1/DisplayFxRate;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "currency_code_display", "currency", "Lcom/robinhood/rosetta/common/Currency;", "symbol", "mark_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getCurrency_code_display", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getSymbol", "getMark_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.mcw_fx_rates.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DisplayFxRate extends Message {

    @JvmField
    public static final ProtoAdapter<DisplayFxRate> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Currency currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyCodeDisplay", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String currency_code_display;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String mark_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    public DisplayFxRate() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ DisplayFxRate(String str, String str2, Currency currency, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29174newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getCurrency_code_display() {
        return this.currency_code_display;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getMark_price() {
        return this.mark_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayFxRate(String label, String currency_code_display, Currency currency, String symbol, String mark_price, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(currency_code_display, "currency_code_display");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.currency_code_display = currency_code_display;
        this.currency = currency;
        this.symbol = symbol;
        this.mark_price = mark_price;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29174newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DisplayFxRate)) {
            return false;
        }
        DisplayFxRate displayFxRate = (DisplayFxRate) other;
        return Intrinsics.areEqual(unknownFields(), displayFxRate.unknownFields()) && Intrinsics.areEqual(this.label, displayFxRate.label) && Intrinsics.areEqual(this.currency_code_display, displayFxRate.currency_code_display) && this.currency == displayFxRate.currency && Intrinsics.areEqual(this.symbol, displayFxRate.symbol) && Intrinsics.areEqual(this.mark_price, displayFxRate.mark_price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37) + this.currency_code_display.hashCode()) * 37) + this.currency.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.mark_price.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("currency_code_display=" + Internal.sanitize(this.currency_code_display));
        arrayList.add("currency=" + this.currency);
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("mark_price=" + Internal.sanitize(this.mark_price));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayFxRate{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DisplayFxRate copy$default(DisplayFxRate displayFxRate, String str, String str2, Currency currency, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayFxRate.label;
        }
        if ((i & 2) != 0) {
            str2 = displayFxRate.currency_code_display;
        }
        if ((i & 4) != 0) {
            currency = displayFxRate.currency;
        }
        if ((i & 8) != 0) {
            str3 = displayFxRate.symbol;
        }
        if ((i & 16) != 0) {
            str4 = displayFxRate.mark_price;
        }
        if ((i & 32) != 0) {
            byteString = displayFxRate.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return displayFxRate.copy(str, str2, currency, str3, str5, byteString2);
    }

    public final DisplayFxRate copy(String label, String currency_code_display, Currency currency, String symbol, String mark_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(currency_code_display, "currency_code_display");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DisplayFxRate(label, currency_code_display, currency, symbol, mark_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisplayFxRate.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DisplayFxRate>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_fx_rates.proto.v1.DisplayFxRate$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DisplayFxRate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                if (!Intrinsics.areEqual(value.getCurrency_code_display(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCurrency_code_display());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(3, value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol());
                }
                return !Intrinsics.areEqual(value.getMark_price(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMark_price()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DisplayFxRate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                if (!Intrinsics.areEqual(value.getCurrency_code_display(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCurrency_code_display());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMark_price());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DisplayFxRate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getCurrency_code_display(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCurrency_code_display());
                }
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisplayFxRate decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    Currency currency = currencyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DisplayFxRate(strDecode, strDecode2, currency, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                currencyDecode = Currency.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisplayFxRate redact(DisplayFxRate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DisplayFxRate.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
