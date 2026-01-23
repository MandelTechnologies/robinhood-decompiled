package bff_crypto_trading.service.p018v1;

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

/* compiled from: Price.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lbff_crypto_trading/service/v1/Price;", "Lcom/squareup/wire/Message;", "", "currency_code", "", "sell", "buy", "sell_min", "buy_max", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_code", "()Ljava/lang/String;", "getSell", "getBuy", "getSell_min", "getBuy_max", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class Price extends Message {

    @JvmField
    public static final ProtoAdapter<Price> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String buy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buyMax", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String buy_max;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String sell;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sellMin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String sell_min;

    public Price() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ Price(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8390newBuilder();
    }

    public final String getCurrency_code() {
        return this.currency_code;
    }

    public final String getSell() {
        return this.sell;
    }

    public final String getBuy() {
        return this.buy;
    }

    public final String getSell_min() {
        return this.sell_min;
    }

    public final String getBuy_max() {
        return this.buy_max;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Price(String currency_code, String sell, String buy, String sell_min, String buy_max, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(sell, "sell");
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sell_min, "sell_min");
        Intrinsics.checkNotNullParameter(buy_max, "buy_max");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_code = currency_code;
        this.sell = sell;
        this.buy = buy;
        this.sell_min = sell_min;
        this.buy_max = buy_max;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8390newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return Intrinsics.areEqual(unknownFields(), price.unknownFields()) && Intrinsics.areEqual(this.currency_code, price.currency_code) && Intrinsics.areEqual(this.sell, price.sell) && Intrinsics.areEqual(this.buy, price.buy) && Intrinsics.areEqual(this.sell_min, price.sell_min) && Intrinsics.areEqual(this.buy_max, price.buy_max);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.currency_code.hashCode()) * 37) + this.sell.hashCode()) * 37) + this.buy.hashCode()) * 37) + this.sell_min.hashCode()) * 37) + this.buy_max.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_code=" + Internal.sanitize(this.currency_code));
        arrayList.add("sell=" + Internal.sanitize(this.sell));
        arrayList.add("buy=" + Internal.sanitize(this.buy));
        arrayList.add("sell_min=" + Internal.sanitize(this.sell_min));
        arrayList.add("buy_max=" + Internal.sanitize(this.buy_max));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Price{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Price copy$default(Price price, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = price.currency_code;
        }
        if ((i & 2) != 0) {
            str2 = price.sell;
        }
        if ((i & 4) != 0) {
            str3 = price.buy;
        }
        if ((i & 8) != 0) {
            str4 = price.sell_min;
        }
        if ((i & 16) != 0) {
            str5 = price.buy_max;
        }
        if ((i & 32) != 0) {
            byteString = price.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return price.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final Price copy(String currency_code, String sell, String buy, String sell_min, String buy_max, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(sell, "sell");
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sell_min, "sell_min");
        Intrinsics.checkNotNullParameter(buy_max, "buy_max");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Price(currency_code, sell, buy, sell_min, buy_max, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Price.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Price>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_crypto_trading.service.v1.Price$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Price value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getSell(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSell());
                }
                if (!Intrinsics.areEqual(value.getBuy(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBuy());
                }
                if (!Intrinsics.areEqual(value.getSell_min(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSell_min());
                }
                return !Intrinsics.areEqual(value.getBuy_max(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getBuy_max()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Price value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getSell(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSell());
                }
                if (!Intrinsics.areEqual(value.getBuy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBuy());
                }
                if (!Intrinsics.areEqual(value.getSell_min(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSell_min());
                }
                if (!Intrinsics.areEqual(value.getBuy_max(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBuy_max());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Price value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getBuy_max(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBuy_max());
                }
                if (!Intrinsics.areEqual(value.getSell_min(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSell_min());
                }
                if (!Intrinsics.areEqual(value.getBuy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBuy());
                }
                if (!Intrinsics.areEqual(value.getSell(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSell());
                }
                if (Intrinsics.areEqual(value.getCurrency_code(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_code());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Price redact(Price value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Price.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Price decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Price(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
