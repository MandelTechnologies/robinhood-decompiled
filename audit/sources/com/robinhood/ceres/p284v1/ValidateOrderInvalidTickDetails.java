package com.robinhood.ceres.p284v1;

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

/* compiled from: ValidateOrderInvalidTickDetails.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetails;", "Lcom/squareup/wire/Message;", "", "symbol", "", "tick_size", "price_type", "Lcom/robinhood/ceres/v1/OrderPriceType;", "given_price", "recommended_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderPriceType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getSymbol", "()Ljava/lang/String;", "getTick_size", "getPrice_type", "()Lcom/robinhood/ceres/v1/OrderPriceType;", "getGiven_price", "getRecommended_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ValidateOrderInvalidTickDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateOrderInvalidTickDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "givenPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String given_price;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderPriceType#ADAPTER", jsonName = "priceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OrderPriceType price_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "recommendedPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final String recommended_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tickSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String tick_size;

    public ValidateOrderInvalidTickDetails() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ ValidateOrderInvalidTickDetails(String str, String str2, OrderPriceType orderPriceType, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OrderPriceType.ORDER_PRICE_TYPE_UNSPECIFIED : orderPriceType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20441newBuilder();
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getTick_size() {
        return this.tick_size;
    }

    public final OrderPriceType getPrice_type() {
        return this.price_type;
    }

    public final String getGiven_price() {
        return this.given_price;
    }

    public final String getRecommended_price() {
        return this.recommended_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateOrderInvalidTickDetails(String symbol, String tick_size, OrderPriceType price_type, String given_price, String recommended_price, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tick_size, "tick_size");
        Intrinsics.checkNotNullParameter(price_type, "price_type");
        Intrinsics.checkNotNullParameter(given_price, "given_price");
        Intrinsics.checkNotNullParameter(recommended_price, "recommended_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.symbol = symbol;
        this.tick_size = tick_size;
        this.price_type = price_type;
        this.given_price = given_price;
        this.recommended_price = recommended_price;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20441newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateOrderInvalidTickDetails)) {
            return false;
        }
        ValidateOrderInvalidTickDetails validateOrderInvalidTickDetails = (ValidateOrderInvalidTickDetails) other;
        return Intrinsics.areEqual(unknownFields(), validateOrderInvalidTickDetails.unknownFields()) && Intrinsics.areEqual(this.symbol, validateOrderInvalidTickDetails.symbol) && Intrinsics.areEqual(this.tick_size, validateOrderInvalidTickDetails.tick_size) && this.price_type == validateOrderInvalidTickDetails.price_type && Intrinsics.areEqual(this.given_price, validateOrderInvalidTickDetails.given_price) && Intrinsics.areEqual(this.recommended_price, validateOrderInvalidTickDetails.recommended_price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.symbol.hashCode()) * 37) + this.tick_size.hashCode()) * 37) + this.price_type.hashCode()) * 37) + this.given_price.hashCode()) * 37) + this.recommended_price.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("tick_size=" + Internal.sanitize(this.tick_size));
        arrayList.add("price_type=" + this.price_type);
        arrayList.add("given_price=" + Internal.sanitize(this.given_price));
        arrayList.add("recommended_price=" + Internal.sanitize(this.recommended_price));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateOrderInvalidTickDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValidateOrderInvalidTickDetails copy$default(ValidateOrderInvalidTickDetails validateOrderInvalidTickDetails, String str, String str2, OrderPriceType orderPriceType, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateOrderInvalidTickDetails.symbol;
        }
        if ((i & 2) != 0) {
            str2 = validateOrderInvalidTickDetails.tick_size;
        }
        if ((i & 4) != 0) {
            orderPriceType = validateOrderInvalidTickDetails.price_type;
        }
        if ((i & 8) != 0) {
            str3 = validateOrderInvalidTickDetails.given_price;
        }
        if ((i & 16) != 0) {
            str4 = validateOrderInvalidTickDetails.recommended_price;
        }
        if ((i & 32) != 0) {
            byteString = validateOrderInvalidTickDetails.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return validateOrderInvalidTickDetails.copy(str, str2, orderPriceType, str3, str5, byteString2);
    }

    public final ValidateOrderInvalidTickDetails copy(String symbol, String tick_size, OrderPriceType price_type, String given_price, String recommended_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tick_size, "tick_size");
        Intrinsics.checkNotNullParameter(price_type, "price_type");
        Intrinsics.checkNotNullParameter(given_price, "given_price");
        Intrinsics.checkNotNullParameter(recommended_price, "recommended_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateOrderInvalidTickDetails(symbol, tick_size, price_type, given_price, recommended_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateOrderInvalidTickDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateOrderInvalidTickDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ValidateOrderInvalidTickDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateOrderInvalidTickDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getTick_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTick_size());
                }
                if (value.getPrice_type() != OrderPriceType.ORDER_PRICE_TYPE_UNSPECIFIED) {
                    size += OrderPriceType.ADAPTER.encodedSizeWithTag(3, value.getPrice_type());
                }
                if (!Intrinsics.areEqual(value.getGiven_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getGiven_price());
                }
                return !Intrinsics.areEqual(value.getRecommended_price(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRecommended_price()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateOrderInvalidTickDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getTick_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTick_size());
                }
                if (value.getPrice_type() != OrderPriceType.ORDER_PRICE_TYPE_UNSPECIFIED) {
                    OrderPriceType.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrice_type());
                }
                if (!Intrinsics.areEqual(value.getGiven_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getGiven_price());
                }
                if (!Intrinsics.areEqual(value.getRecommended_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRecommended_price());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateOrderInvalidTickDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRecommended_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRecommended_price());
                }
                if (!Intrinsics.areEqual(value.getGiven_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getGiven_price());
                }
                if (value.getPrice_type() != OrderPriceType.ORDER_PRICE_TYPE_UNSPECIFIED) {
                    OrderPriceType.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrice_type());
                }
                if (!Intrinsics.areEqual(value.getTick_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTick_size());
                }
                if (Intrinsics.areEqual(value.getSymbol(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderInvalidTickDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderPriceType orderPriceTypeDecode = OrderPriceType.ORDER_PRICE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    OrderPriceType orderPriceType = orderPriceTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValidateOrderInvalidTickDetails(strDecode, strDecode2, orderPriceType, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                orderPriceTypeDecode = OrderPriceType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderInvalidTickDetails redact(ValidateOrderInvalidTickDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ValidateOrderInvalidTickDetails.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
