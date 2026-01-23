package crypto_perpetuals.service.p440v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.Quote;
import crypto_perpetuals.common.p435v1.Side;
import crypto_perpetuals.order.p438v1.ValidatePrice;
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

/* compiled from: ValidateOrderPriceRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequest;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "side", "Lcrypto_perpetuals/common/v1/Side;", "quote", "Lcrypto_perpetuals/common/v1/Quote;", "validate_price", "Lcrypto_perpetuals/order/v1/ValidatePrice;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcrypto_perpetuals/common/v1/Side;Lcrypto_perpetuals/common/v1/Quote;Lcrypto_perpetuals/order/v1/ValidatePrice;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getSide", "()Lcrypto_perpetuals/common/v1/Side;", "getQuote", "()Lcrypto_perpetuals/common/v1/Quote;", "getValidate_price", "()Lcrypto_perpetuals/order/v1/ValidatePrice;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ValidateOrderPriceRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateOrderPriceRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "crypto_perpetuals.common.v1.Quote#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Quote quote;

    @WireField(adapter = "crypto_perpetuals.common.v1.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Side side;

    @WireField(adapter = "crypto_perpetuals.order.v1.ValidatePrice#ADAPTER", jsonName = "validatePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ValidatePrice validate_price;

    public ValidateOrderPriceRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27890newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public /* synthetic */ ValidateOrderPriceRequest(String str, Side side, Quote quote, ValidatePrice validatePrice, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 4) != 0 ? null : quote, (i & 8) != 0 ? null : validatePrice, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Side getSide() {
        return this.side;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final ValidatePrice getValidate_price() {
        return this.validate_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateOrderPriceRequest(String contract_id, Side side, Quote quote, ValidatePrice validatePrice, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.side = side;
        this.quote = quote;
        this.validate_price = validatePrice;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27890newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateOrderPriceRequest)) {
            return false;
        }
        ValidateOrderPriceRequest validateOrderPriceRequest = (ValidateOrderPriceRequest) other;
        return Intrinsics.areEqual(unknownFields(), validateOrderPriceRequest.unknownFields()) && Intrinsics.areEqual(this.contract_id, validateOrderPriceRequest.contract_id) && this.side == validateOrderPriceRequest.side && Intrinsics.areEqual(this.quote, validateOrderPriceRequest.quote) && Intrinsics.areEqual(this.validate_price, validateOrderPriceRequest.validate_price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.side.hashCode()) * 37;
        Quote quote = this.quote;
        int iHashCode2 = (iHashCode + (quote != null ? quote.hashCode() : 0)) * 37;
        ValidatePrice validatePrice = this.validate_price;
        int iHashCode3 = iHashCode2 + (validatePrice != null ? validatePrice.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("side=" + this.side);
        Quote quote = this.quote;
        if (quote != null) {
            arrayList.add("quote=" + quote);
        }
        ValidatePrice validatePrice = this.validate_price;
        if (validatePrice != null) {
            arrayList.add("validate_price=" + validatePrice);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateOrderPriceRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValidateOrderPriceRequest copy$default(ValidateOrderPriceRequest validateOrderPriceRequest, String str, Side side, Quote quote, ValidatePrice validatePrice, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateOrderPriceRequest.contract_id;
        }
        if ((i & 2) != 0) {
            side = validateOrderPriceRequest.side;
        }
        if ((i & 4) != 0) {
            quote = validateOrderPriceRequest.quote;
        }
        if ((i & 8) != 0) {
            validatePrice = validateOrderPriceRequest.validate_price;
        }
        if ((i & 16) != 0) {
            byteString = validateOrderPriceRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Quote quote2 = quote;
        return validateOrderPriceRequest.copy(str, side, quote2, validatePrice, byteString2);
    }

    public final ValidateOrderPriceRequest copy(String contract_id, Side side, Quote quote, ValidatePrice validate_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateOrderPriceRequest(contract_id, side, quote, validate_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateOrderPriceRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateOrderPriceRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.ValidateOrderPriceRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateOrderPriceRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(2, value.getSide());
                }
                if (value.getQuote() != null) {
                    size += Quote.ADAPTER.encodedSizeWithTag(3, value.getQuote());
                }
                return value.getValidate_price() != null ? size + ValidatePrice.ADAPTER.encodedSizeWithTag(4, value.getValidate_price()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateOrderPriceRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getSide());
                }
                if (value.getQuote() != null) {
                    Quote.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote());
                }
                if (value.getValidate_price() != null) {
                    ValidatePrice.ADAPTER.encodeWithTag(writer, 4, (int) value.getValidate_price());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateOrderPriceRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getValidate_price() != null) {
                    ValidatePrice.ADAPTER.encodeWithTag(writer, 4, (int) value.getValidate_price());
                }
                if (value.getQuote() != null) {
                    Quote.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getSide());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderPriceRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side sideDecode = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Quote quoteDecode = null;
                ValidatePrice validatePriceDecode = null;
                String strDecode = "";
                while (true) {
                    Side side = sideDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValidateOrderPriceRequest(strDecode, side, quoteDecode, validatePriceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            quoteDecode = Quote.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            validatePriceDecode = ValidatePrice.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderPriceRequest redact(ValidateOrderPriceRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Quote quote = value.getQuote();
                Quote quoteRedact = quote != null ? Quote.ADAPTER.redact(quote) : null;
                ValidatePrice validate_price = value.getValidate_price();
                return ValidateOrderPriceRequest.copy$default(value, null, null, quoteRedact, validate_price != null ? ValidatePrice.ADAPTER.redact(validate_price) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
