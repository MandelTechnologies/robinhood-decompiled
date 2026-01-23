package contracts.crypto.trade.proto.p431v1;

import com.plaid.internal.EnumC7081g;
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
import rosetta.nummus.order.Side;

/* compiled from: TokenizationEstimatedPrice.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPrice;", "Lcom/squareup/wire/Message;", "", "primary_currency_code", "", "secondary_currency_code", "primary_price_formatted", "secondary_price_formatted", "exchange_rate", "order_side", "Lrosetta/nummus/order/Side;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/order/Side;Lokio/ByteString;)V", "getPrimary_currency_code", "()Ljava/lang/String;", "getSecondary_currency_code", "getPrimary_price_formatted", "getSecondary_price_formatted", "getExchange_rate", "getOrder_side", "()Lrosetta/nummus/order/Side;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TokenizationEstimatedPrice extends Message {

    @JvmField
    public static final ProtoAdapter<TokenizationEstimatedPrice> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String exchange_rate;

    @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Side order_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String primary_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryPriceFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_price_formatted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String secondary_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryPriceFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String secondary_price_formatted;

    public TokenizationEstimatedPrice() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ TokenizationEstimatedPrice(String str, String str2, String str3, String str4, String str5, Side side, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? Side.SIDE__UNSPECIFIED : side, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27711newBuilder();
    }

    public final String getPrimary_currency_code() {
        return this.primary_currency_code;
    }

    public final String getSecondary_currency_code() {
        return this.secondary_currency_code;
    }

    public final String getPrimary_price_formatted() {
        return this.primary_price_formatted;
    }

    public final String getSecondary_price_formatted() {
        return this.secondary_price_formatted;
    }

    public final String getExchange_rate() {
        return this.exchange_rate;
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizationEstimatedPrice(String primary_currency_code, String secondary_currency_code, String primary_price_formatted, String secondary_price_formatted, String exchange_rate, Side order_side, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(primary_price_formatted, "primary_price_formatted");
        Intrinsics.checkNotNullParameter(secondary_price_formatted, "secondary_price_formatted");
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.primary_currency_code = primary_currency_code;
        this.secondary_currency_code = secondary_currency_code;
        this.primary_price_formatted = primary_price_formatted;
        this.secondary_price_formatted = secondary_price_formatted;
        this.exchange_rate = exchange_rate;
        this.order_side = order_side;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27711newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TokenizationEstimatedPrice)) {
            return false;
        }
        TokenizationEstimatedPrice tokenizationEstimatedPrice = (TokenizationEstimatedPrice) other;
        return Intrinsics.areEqual(unknownFields(), tokenizationEstimatedPrice.unknownFields()) && Intrinsics.areEqual(this.primary_currency_code, tokenizationEstimatedPrice.primary_currency_code) && Intrinsics.areEqual(this.secondary_currency_code, tokenizationEstimatedPrice.secondary_currency_code) && Intrinsics.areEqual(this.primary_price_formatted, tokenizationEstimatedPrice.primary_price_formatted) && Intrinsics.areEqual(this.secondary_price_formatted, tokenizationEstimatedPrice.secondary_price_formatted) && Intrinsics.areEqual(this.exchange_rate, tokenizationEstimatedPrice.exchange_rate) && this.order_side == tokenizationEstimatedPrice.order_side;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.primary_currency_code.hashCode()) * 37) + this.secondary_currency_code.hashCode()) * 37) + this.primary_price_formatted.hashCode()) * 37) + this.secondary_price_formatted.hashCode()) * 37) + this.exchange_rate.hashCode()) * 37) + this.order_side.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("primary_currency_code=" + Internal.sanitize(this.primary_currency_code));
        arrayList.add("secondary_currency_code=" + Internal.sanitize(this.secondary_currency_code));
        arrayList.add("primary_price_formatted=" + Internal.sanitize(this.primary_price_formatted));
        arrayList.add("secondary_price_formatted=" + Internal.sanitize(this.secondary_price_formatted));
        arrayList.add("exchange_rate=" + Internal.sanitize(this.exchange_rate));
        arrayList.add("order_side=" + this.order_side);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TokenizationEstimatedPrice{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TokenizationEstimatedPrice copy$default(TokenizationEstimatedPrice tokenizationEstimatedPrice, String str, String str2, String str3, String str4, String str5, Side side, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenizationEstimatedPrice.primary_currency_code;
        }
        if ((i & 2) != 0) {
            str2 = tokenizationEstimatedPrice.secondary_currency_code;
        }
        if ((i & 4) != 0) {
            str3 = tokenizationEstimatedPrice.primary_price_formatted;
        }
        if ((i & 8) != 0) {
            str4 = tokenizationEstimatedPrice.secondary_price_formatted;
        }
        if ((i & 16) != 0) {
            str5 = tokenizationEstimatedPrice.exchange_rate;
        }
        if ((i & 32) != 0) {
            side = tokenizationEstimatedPrice.order_side;
        }
        if ((i & 64) != 0) {
            byteString = tokenizationEstimatedPrice.unknownFields();
        }
        Side side2 = side;
        ByteString byteString2 = byteString;
        String str6 = str5;
        String str7 = str3;
        return tokenizationEstimatedPrice.copy(str, str2, str7, str4, str6, side2, byteString2);
    }

    public final TokenizationEstimatedPrice copy(String primary_currency_code, String secondary_currency_code, String primary_price_formatted, String secondary_price_formatted, String exchange_rate, Side order_side, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(primary_price_formatted, "primary_price_formatted");
        Intrinsics.checkNotNullParameter(secondary_price_formatted, "secondary_price_formatted");
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TokenizationEstimatedPrice(primary_currency_code, secondary_currency_code, primary_price_formatted, secondary_price_formatted, exchange_rate, order_side, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizationEstimatedPrice.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TokenizationEstimatedPrice>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.TokenizationEstimatedPrice$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TokenizationEstimatedPrice value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPrimary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSecondary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getPrimary_price_formatted(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_price_formatted());
                }
                if (!Intrinsics.areEqual(value.getSecondary_price_formatted(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSecondary_price_formatted());
                }
                if (!Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getExchange_rate());
                }
                return value.getOrder_side() != Side.SIDE__UNSPECIFIED ? size + Side.ADAPTER.encodedSizeWithTag(6, value.getOrder_side()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TokenizationEstimatedPrice value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrimary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSecondary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getPrimary_price_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_price_formatted());
                }
                if (!Intrinsics.areEqual(value.getSecondary_price_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_price_formatted());
                }
                if (!Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getExchange_rate());
                }
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_side());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TokenizationEstimatedPrice value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getExchange_rate());
                }
                if (!Intrinsics.areEqual(value.getSecondary_price_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_price_formatted());
                }
                if (!Intrinsics.areEqual(value.getPrimary_price_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_price_formatted());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSecondary_currency_code());
                }
                if (Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrimary_currency_code());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TokenizationEstimatedPrice decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side sideDecode = Side.SIDE__UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    Side side = sideDecode;
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
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        sideDecode = Side.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new TokenizationEstimatedPrice(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, side, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TokenizationEstimatedPrice redact(TokenizationEstimatedPrice value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TokenizationEstimatedPrice.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
