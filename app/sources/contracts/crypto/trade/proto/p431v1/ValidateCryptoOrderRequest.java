package contracts.crypto.trade.proto.p431v1;

import bff_money_movement.service.p019v1.BillingAccount;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderRequest;
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
import rosetta.nummus.CurrencyPair;
import rosetta.nummus.MonetizationModel;
import rosetta.order.InitiatorType;

/* compiled from: ValidateCryptoOrderRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest;", "Lcom/squareup/wire/Message;", "", "order_context", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext;", "validation_source", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource;", "acknowledge_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_context", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext;", "getValidation_source", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource;", "getAcknowledge_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OrderContext", "ValidationSource", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ValidateCryptoOrderRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateCryptoOrderRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "acknowledgeId", schemaIndex = 2, tag = 3)
    private final String acknowledge_id;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext#ADAPTER", jsonName = "orderContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OrderContext order_context;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$ValidationSource#ADAPTER", jsonName = "validationSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ValidationSource validation_source;

    public ValidateCryptoOrderRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27725newBuilder();
    }

    public final OrderContext getOrder_context() {
        return this.order_context;
    }

    public final ValidationSource getValidation_source() {
        return this.validation_source;
    }

    public final String getAcknowledge_id() {
        return this.acknowledge_id;
    }

    public /* synthetic */ ValidateCryptoOrderRequest(OrderContext orderContext, ValidationSource validationSource, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderContext, (i & 2) != 0 ? null : validationSource, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateCryptoOrderRequest(OrderContext orderContext, ValidationSource validationSource, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_context = orderContext;
        this.validation_source = validationSource;
        this.acknowledge_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27725newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateCryptoOrderRequest)) {
            return false;
        }
        ValidateCryptoOrderRequest validateCryptoOrderRequest = (ValidateCryptoOrderRequest) other;
        return Intrinsics.areEqual(unknownFields(), validateCryptoOrderRequest.unknownFields()) && Intrinsics.areEqual(this.order_context, validateCryptoOrderRequest.order_context) && Intrinsics.areEqual(this.validation_source, validateCryptoOrderRequest.validation_source) && Intrinsics.areEqual(this.acknowledge_id, validateCryptoOrderRequest.acknowledge_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        OrderContext orderContext = this.order_context;
        int iHashCode2 = (iHashCode + (orderContext != null ? orderContext.hashCode() : 0)) * 37;
        ValidationSource validationSource = this.validation_source;
        int iHashCode3 = (iHashCode2 + (validationSource != null ? validationSource.hashCode() : 0)) * 37;
        String str = this.acknowledge_id;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        OrderContext orderContext = this.order_context;
        if (orderContext != null) {
            arrayList.add("order_context=" + orderContext);
        }
        ValidationSource validationSource = this.validation_source;
        if (validationSource != null) {
            arrayList.add("validation_source=" + validationSource);
        }
        String str = this.acknowledge_id;
        if (str != null) {
            arrayList.add("acknowledge_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateCryptoOrderRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValidateCryptoOrderRequest copy$default(ValidateCryptoOrderRequest validateCryptoOrderRequest, OrderContext orderContext, ValidationSource validationSource, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            orderContext = validateCryptoOrderRequest.order_context;
        }
        if ((i & 2) != 0) {
            validationSource = validateCryptoOrderRequest.validation_source;
        }
        if ((i & 4) != 0) {
            str = validateCryptoOrderRequest.acknowledge_id;
        }
        if ((i & 8) != 0) {
            byteString = validateCryptoOrderRequest.unknownFields();
        }
        return validateCryptoOrderRequest.copy(orderContext, validationSource, str, byteString);
    }

    public final ValidateCryptoOrderRequest copy(OrderContext order_context, ValidationSource validation_source, String acknowledge_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateCryptoOrderRequest(order_context, validation_source, acknowledge_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateCryptoOrderRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateCryptoOrderRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateCryptoOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_context() != null) {
                    size += ValidateCryptoOrderRequest.OrderContext.ADAPTER.encodedSizeWithTag(1, value.getOrder_context());
                }
                if (value.getValidation_source() != null) {
                    size += ValidateCryptoOrderRequest.ValidationSource.ADAPTER.encodedSizeWithTag(2, value.getValidation_source());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAcknowledge_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateCryptoOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_context() != null) {
                    ValidateCryptoOrderRequest.OrderContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_context());
                }
                if (value.getValidation_source() != null) {
                    ValidateCryptoOrderRequest.ValidationSource.ADAPTER.encodeWithTag(writer, 2, (int) value.getValidation_source());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAcknowledge_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAcknowledge_id());
                if (value.getValidation_source() != null) {
                    ValidateCryptoOrderRequest.ValidationSource.ADAPTER.encodeWithTag(writer, 2, (int) value.getValidation_source());
                }
                if (value.getOrder_context() != null) {
                    ValidateCryptoOrderRequest.OrderContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_context());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateCryptoOrderRequest redact(ValidateCryptoOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValidateCryptoOrderRequest.OrderContext order_context = value.getOrder_context();
                ValidateCryptoOrderRequest.OrderContext orderContextRedact = order_context != null ? ValidateCryptoOrderRequest.OrderContext.ADAPTER.redact(order_context) : null;
                ValidateCryptoOrderRequest.ValidationSource validation_source = value.getValidation_source();
                return ValidateCryptoOrderRequest.copy$default(value, orderContextRedact, validation_source != null ? ValidateCryptoOrderRequest.ValidationSource.ADAPTER.redact(validation_source) : null, null, ByteString.EMPTY, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateCryptoOrderRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ValidateCryptoOrderRequest.OrderContext orderContextDecode = null;
                ValidateCryptoOrderRequest.ValidationSource validationSourceDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidateCryptoOrderRequest(orderContextDecode, validationSourceDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        orderContextDecode = ValidateCryptoOrderRequest.OrderContext.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        validationSourceDecode = ValidateCryptoOrderRequest.ValidationSource.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: ValidateCryptoOrderRequest.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006:;<=>?B\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00101\u001a\u00020\u0002H\u0017J\u0013\u00102\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000208H\u0016J\u008e\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006@"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext;", "Lcom/squareup/wire/Message;", "", "order_side", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide;", "has_crypto_account", "", "quote", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$Quote;", "order_prices", "Lcontracts/crypto/trade/proto/v1/OrderPrices;", Content.MarketIndicator.CRYPTO_TYPE, "Lrosetta/nummus/CurrencyPair;", "user_inputs", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs;", "order_info", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderInfo;", "monetization_model", "Lrosetta/nummus/MonetizationModel;", "account_info", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$AccountInfo;", "has_seen_pdt_warning", "initiator_type", "Lrosetta/order/InitiatorType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide;ZLcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$Quote;Lcontracts/crypto/trade/proto/v1/OrderPrices;Lrosetta/nummus/CurrencyPair;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderInfo;Lrosetta/nummus/MonetizationModel;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$AccountInfo;ZLrosetta/order/InitiatorType;Lokio/ByteString;)V", "getOrder_side", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide;", "getHas_crypto_account", "()Z", "getQuote", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$Quote;", "getOrder_prices", "()Lcontracts/crypto/trade/proto/v1/OrderPrices;", "getCurrency_pair", "()Lrosetta/nummus/CurrencyPair;", "getUser_inputs", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs;", "getOrder_info", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderInfo;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "getAccount_info", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$AccountInfo;", "getHas_seen_pdt_warning", "getInitiator_type", "()Lrosetta/order/InitiatorType;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "OrderSide", DxFeedData.TYPE_QUOTE, "UserInputs", "OrderInfo", "AccountInfo", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderContext extends Message {

        @JvmField
        public static final ProtoAdapter<OrderContext> ADAPTER;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$AccountInfo#ADAPTER", jsonName = "accountInfo", schemaIndex = 8, tag = 9)
        private final AccountInfo account_info;

        @WireField(adapter = "rosetta.nummus.CurrencyPair#ADAPTER", jsonName = "currencyPair", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final CurrencyPair currency_pair;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasCryptoAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final boolean has_crypto_account;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSeenPdtWarning", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
        private final boolean has_seen_pdt_warning;

        @WireField(adapter = "rosetta.order.InitiatorType#ADAPTER", jsonName = "initiatorType", schemaIndex = 10, tag = 11)
        private final InitiatorType initiator_type;

        @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final MonetizationModel monetization_model;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$OrderInfo#ADAPTER", jsonName = "orderInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final OrderInfo order_info;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.OrderPrices#ADAPTER", jsonName = "orderPrices", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final OrderPrices order_prices;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$OrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final OrderSide order_side;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$Quote#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Quote quote;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$UserInputs#ADAPTER", jsonName = "userInputs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final UserInputs user_inputs;

        public OrderContext() {
            this(null, false, null, null, null, null, null, null, null, false, null, null, 4095, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27726newBuilder();
        }

        public final OrderSide getOrder_side() {
            return this.order_side;
        }

        public final boolean getHas_crypto_account() {
            return this.has_crypto_account;
        }

        public final Quote getQuote() {
            return this.quote;
        }

        public final OrderPrices getOrder_prices() {
            return this.order_prices;
        }

        public final CurrencyPair getCurrency_pair() {
            return this.currency_pair;
        }

        public final UserInputs getUser_inputs() {
            return this.user_inputs;
        }

        public final OrderInfo getOrder_info() {
            return this.order_info;
        }

        public final MonetizationModel getMonetization_model() {
            return this.monetization_model;
        }

        public /* synthetic */ OrderContext(OrderSide orderSide, boolean z, Quote quote, OrderPrices orderPrices, CurrencyPair currencyPair, UserInputs userInputs, OrderInfo orderInfo, MonetizationModel monetizationModel, AccountInfo accountInfo, boolean z2, InitiatorType initiatorType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : orderSide, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : quote, (i & 8) != 0 ? null : orderPrices, (i & 16) != 0 ? null : currencyPair, (i & 32) != 0 ? null : userInputs, (i & 64) != 0 ? null : orderInfo, (i & 128) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 256) != 0 ? null : accountInfo, (i & 512) == 0 ? z2 : false, (i & 1024) == 0 ? initiatorType : null, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
        }

        public final AccountInfo getAccount_info() {
            return this.account_info;
        }

        public final boolean getHas_seen_pdt_warning() {
            return this.has_seen_pdt_warning;
        }

        public final InitiatorType getInitiator_type() {
            return this.initiator_type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderContext(OrderSide orderSide, boolean z, Quote quote, OrderPrices orderPrices, CurrencyPair currencyPair, UserInputs userInputs, OrderInfo orderInfo, MonetizationModel monetization_model, AccountInfo accountInfo, boolean z2, InitiatorType initiatorType, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.order_side = orderSide;
            this.has_crypto_account = z;
            this.quote = quote;
            this.order_prices = orderPrices;
            this.currency_pair = currencyPair;
            this.user_inputs = userInputs;
            this.order_info = orderInfo;
            this.monetization_model = monetization_model;
            this.account_info = accountInfo;
            this.has_seen_pdt_warning = z2;
            this.initiator_type = initiatorType;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27726newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderContext)) {
                return false;
            }
            OrderContext orderContext = (OrderContext) other;
            return Intrinsics.areEqual(unknownFields(), orderContext.unknownFields()) && Intrinsics.areEqual(this.order_side, orderContext.order_side) && this.has_crypto_account == orderContext.has_crypto_account && Intrinsics.areEqual(this.quote, orderContext.quote) && Intrinsics.areEqual(this.order_prices, orderContext.order_prices) && Intrinsics.areEqual(this.currency_pair, orderContext.currency_pair) && Intrinsics.areEqual(this.user_inputs, orderContext.user_inputs) && Intrinsics.areEqual(this.order_info, orderContext.order_info) && this.monetization_model == orderContext.monetization_model && Intrinsics.areEqual(this.account_info, orderContext.account_info) && this.has_seen_pdt_warning == orderContext.has_seen_pdt_warning && this.initiator_type == orderContext.initiator_type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            OrderSide orderSide = this.order_side;
            int iHashCode2 = (((iHashCode + (orderSide != null ? orderSide.hashCode() : 0)) * 37) + Boolean.hashCode(this.has_crypto_account)) * 37;
            Quote quote = this.quote;
            int iHashCode3 = (iHashCode2 + (quote != null ? quote.hashCode() : 0)) * 37;
            OrderPrices orderPrices = this.order_prices;
            int iHashCode4 = (iHashCode3 + (orderPrices != null ? orderPrices.hashCode() : 0)) * 37;
            CurrencyPair currencyPair = this.currency_pair;
            int iHashCode5 = (iHashCode4 + (currencyPair != null ? currencyPair.hashCode() : 0)) * 37;
            UserInputs userInputs = this.user_inputs;
            int iHashCode6 = (iHashCode5 + (userInputs != null ? userInputs.hashCode() : 0)) * 37;
            OrderInfo orderInfo = this.order_info;
            int iHashCode7 = (((iHashCode6 + (orderInfo != null ? orderInfo.hashCode() : 0)) * 37) + this.monetization_model.hashCode()) * 37;
            AccountInfo accountInfo = this.account_info;
            int iHashCode8 = (((iHashCode7 + (accountInfo != null ? accountInfo.hashCode() : 0)) * 37) + Boolean.hashCode(this.has_seen_pdt_warning)) * 37;
            InitiatorType initiatorType = this.initiator_type;
            int iHashCode9 = iHashCode8 + (initiatorType != null ? initiatorType.hashCode() : 0);
            this.hashCode = iHashCode9;
            return iHashCode9;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            OrderSide orderSide = this.order_side;
            if (orderSide != null) {
                arrayList.add("order_side=" + orderSide);
            }
            arrayList.add("has_crypto_account=" + this.has_crypto_account);
            Quote quote = this.quote;
            if (quote != null) {
                arrayList.add("quote=" + quote);
            }
            OrderPrices orderPrices = this.order_prices;
            if (orderPrices != null) {
                arrayList.add("order_prices=" + orderPrices);
            }
            CurrencyPair currencyPair = this.currency_pair;
            if (currencyPair != null) {
                arrayList.add("currency_pair=" + currencyPair);
            }
            UserInputs userInputs = this.user_inputs;
            if (userInputs != null) {
                arrayList.add("user_inputs=" + userInputs);
            }
            OrderInfo orderInfo = this.order_info;
            if (orderInfo != null) {
                arrayList.add("order_info=" + orderInfo);
            }
            arrayList.add("monetization_model=" + this.monetization_model);
            AccountInfo accountInfo = this.account_info;
            if (accountInfo != null) {
                arrayList.add("account_info=" + accountInfo);
            }
            arrayList.add("has_seen_pdt_warning=" + this.has_seen_pdt_warning);
            InitiatorType initiatorType = this.initiator_type;
            if (initiatorType != null) {
                arrayList.add("initiator_type=" + initiatorType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderContext{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ OrderContext copy$default(OrderContext orderContext, OrderSide orderSide, boolean z, Quote quote, OrderPrices orderPrices, CurrencyPair currencyPair, UserInputs userInputs, OrderInfo orderInfo, MonetizationModel monetizationModel, AccountInfo accountInfo, boolean z2, InitiatorType initiatorType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                orderSide = orderContext.order_side;
            }
            if ((i & 2) != 0) {
                z = orderContext.has_crypto_account;
            }
            if ((i & 4) != 0) {
                quote = orderContext.quote;
            }
            if ((i & 8) != 0) {
                orderPrices = orderContext.order_prices;
            }
            if ((i & 16) != 0) {
                currencyPair = orderContext.currency_pair;
            }
            if ((i & 32) != 0) {
                userInputs = orderContext.user_inputs;
            }
            if ((i & 64) != 0) {
                orderInfo = orderContext.order_info;
            }
            if ((i & 128) != 0) {
                monetizationModel = orderContext.monetization_model;
            }
            if ((i & 256) != 0) {
                accountInfo = orderContext.account_info;
            }
            if ((i & 512) != 0) {
                z2 = orderContext.has_seen_pdt_warning;
            }
            if ((i & 1024) != 0) {
                initiatorType = orderContext.initiator_type;
            }
            if ((i & 2048) != 0) {
                byteString = orderContext.unknownFields();
            }
            InitiatorType initiatorType2 = initiatorType;
            ByteString byteString2 = byteString;
            AccountInfo accountInfo2 = accountInfo;
            boolean z3 = z2;
            OrderInfo orderInfo2 = orderInfo;
            MonetizationModel monetizationModel2 = monetizationModel;
            CurrencyPair currencyPair2 = currencyPair;
            UserInputs userInputs2 = userInputs;
            return orderContext.copy(orderSide, z, quote, orderPrices, currencyPair2, userInputs2, orderInfo2, monetizationModel2, accountInfo2, z3, initiatorType2, byteString2);
        }

        public final OrderContext copy(OrderSide order_side, boolean has_crypto_account, Quote quote, OrderPrices order_prices, CurrencyPair currency_pair, UserInputs user_inputs, OrderInfo order_info, MonetizationModel monetization_model, AccountInfo account_info, boolean has_seen_pdt_warning, InitiatorType initiator_type, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OrderContext(order_side, has_crypto_account, quote, order_prices, currency_pair, user_inputs, order_info, monetization_model, account_info, has_seen_pdt_warning, initiator_type, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ValidateCryptoOrderRequest.OrderContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getOrder_side() != null) {
                        size += ValidateCryptoOrderRequest.OrderContext.OrderSide.ADAPTER.encodedSizeWithTag(1, value.getOrder_side());
                    }
                    if (value.getHas_crypto_account()) {
                        size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getHas_crypto_account()));
                    }
                    if (value.getQuote() != null) {
                        size += ValidateCryptoOrderRequest.OrderContext.Quote.ADAPTER.encodedSizeWithTag(3, value.getQuote());
                    }
                    if (value.getOrder_prices() != null) {
                        size += OrderPrices.ADAPTER.encodedSizeWithTag(4, value.getOrder_prices());
                    }
                    if (value.getCurrency_pair() != null) {
                        size += CurrencyPair.ADAPTER.encodedSizeWithTag(5, value.getCurrency_pair());
                    }
                    if (value.getUser_inputs() != null) {
                        size += ValidateCryptoOrderRequest.OrderContext.UserInputs.ADAPTER.encodedSizeWithTag(6, value.getUser_inputs());
                    }
                    if (value.getOrder_info() != null) {
                        size += ValidateCryptoOrderRequest.OrderContext.OrderInfo.ADAPTER.encodedSizeWithTag(7, value.getOrder_info());
                    }
                    if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                        size += MonetizationModel.ADAPTER.encodedSizeWithTag(8, value.getMonetization_model());
                    }
                    int iEncodedSizeWithTag = size + ValidateCryptoOrderRequest.OrderContext.AccountInfo.ADAPTER.encodedSizeWithTag(9, value.getAccount_info());
                    if (value.getHas_seen_pdt_warning()) {
                        iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getHas_seen_pdt_warning()));
                    }
                    return iEncodedSizeWithTag + InitiatorType.ADAPTER.encodedSizeWithTag(11, value.getInitiator_type());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getOrder_side() != null) {
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_side());
                    }
                    if (value.getHas_crypto_account()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getHas_crypto_account()));
                    }
                    if (value.getQuote() != null) {
                        ValidateCryptoOrderRequest.OrderContext.Quote.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote());
                    }
                    if (value.getOrder_prices() != null) {
                        OrderPrices.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_prices());
                    }
                    if (value.getCurrency_pair() != null) {
                        CurrencyPair.ADAPTER.encodeWithTag(writer, 5, (int) value.getCurrency_pair());
                    }
                    if (value.getUser_inputs() != null) {
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.ADAPTER.encodeWithTag(writer, 6, (int) value.getUser_inputs());
                    }
                    if (value.getOrder_info() != null) {
                        ValidateCryptoOrderRequest.OrderContext.OrderInfo.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_info());
                    }
                    if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                        MonetizationModel.ADAPTER.encodeWithTag(writer, 8, (int) value.getMonetization_model());
                    }
                    ValidateCryptoOrderRequest.OrderContext.AccountInfo.ADAPTER.encodeWithTag(writer, 9, (int) value.getAccount_info());
                    if (value.getHas_seen_pdt_warning()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getHas_seen_pdt_warning()));
                    }
                    InitiatorType.ADAPTER.encodeWithTag(writer, 11, (int) value.getInitiator_type());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    InitiatorType.ADAPTER.encodeWithTag(writer, 11, (int) value.getInitiator_type());
                    if (value.getHas_seen_pdt_warning()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getHas_seen_pdt_warning()));
                    }
                    ValidateCryptoOrderRequest.OrderContext.AccountInfo.ADAPTER.encodeWithTag(writer, 9, (int) value.getAccount_info());
                    if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                        MonetizationModel.ADAPTER.encodeWithTag(writer, 8, (int) value.getMonetization_model());
                    }
                    if (value.getOrder_info() != null) {
                        ValidateCryptoOrderRequest.OrderContext.OrderInfo.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_info());
                    }
                    if (value.getUser_inputs() != null) {
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.ADAPTER.encodeWithTag(writer, 6, (int) value.getUser_inputs());
                    }
                    if (value.getCurrency_pair() != null) {
                        CurrencyPair.ADAPTER.encodeWithTag(writer, 5, (int) value.getCurrency_pair());
                    }
                    if (value.getOrder_prices() != null) {
                        OrderPrices.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_prices());
                    }
                    if (value.getQuote() != null) {
                        ValidateCryptoOrderRequest.OrderContext.Quote.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote());
                    }
                    if (value.getHas_crypto_account()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getHas_crypto_account()));
                    }
                    if (value.getOrder_side() != null) {
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_side());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public ValidateCryptoOrderRequest.OrderContext decode(ProtoReader reader) throws IOException {
                    MonetizationModel monetizationModel;
                    ValidateCryptoOrderRequest.OrderContext.OrderSide orderSide;
                    ValidateCryptoOrderRequest.OrderContext.Quote quote;
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    MonetizationModel monetizationModel2 = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    ValidateCryptoOrderRequest.OrderContext.Quote quoteDecode = null;
                    OrderPrices orderPricesDecode = null;
                    CurrencyPair currencyPairDecode = null;
                    ValidateCryptoOrderRequest.OrderContext.UserInputs userInputsDecode = null;
                    ValidateCryptoOrderRequest.OrderContext.OrderInfo orderInfoDecode = null;
                    ValidateCryptoOrderRequest.OrderContext.AccountInfo accountInfoDecode = null;
                    InitiatorType initiatorTypeDecode = null;
                    boolean zBooleanValue = false;
                    boolean zBooleanValue2 = false;
                    MonetizationModel monetizationModelDecode = monetizationModel2;
                    ValidateCryptoOrderRequest.OrderContext.OrderSide orderSideDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    orderSideDecode = ValidateCryptoOrderRequest.OrderContext.OrderSide.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 3:
                                    quoteDecode = ValidateCryptoOrderRequest.OrderContext.Quote.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    orderPricesDecode = OrderPrices.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    currencyPairDecode = CurrencyPair.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    userInputsDecode = ValidateCryptoOrderRequest.OrderContext.UserInputs.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    orderInfoDecode = ValidateCryptoOrderRequest.OrderContext.OrderInfo.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    monetizationModel = monetizationModelDecode;
                                    orderSide = orderSideDecode;
                                    try {
                                        monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        quote = quoteDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                    orderSideDecode = orderSide;
                                    break;
                                case 9:
                                    accountInfoDecode = ValidateCryptoOrderRequest.OrderContext.AccountInfo.ADAPTER.decode(reader);
                                    break;
                                case 10:
                                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 11:
                                    try {
                                        initiatorTypeDecode = InitiatorType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        monetizationModel = monetizationModelDecode;
                                        orderSide = orderSideDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    monetizationModel = monetizationModelDecode;
                                    orderSide = orderSideDecode;
                                    quote = quoteDecode;
                                    quoteDecode = quote;
                                    monetizationModelDecode = monetizationModel;
                                    orderSideDecode = orderSide;
                                    break;
                            }
                        } else {
                            return new ValidateCryptoOrderRequest.OrderContext(orderSideDecode, zBooleanValue, quoteDecode, orderPricesDecode, currencyPairDecode, userInputsDecode, orderInfoDecode, monetizationModelDecode, accountInfoDecode, zBooleanValue2, initiatorTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateCryptoOrderRequest.OrderContext redact(ValidateCryptoOrderRequest.OrderContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ValidateCryptoOrderRequest.OrderContext.OrderSide order_side = value.getOrder_side();
                    ValidateCryptoOrderRequest.OrderContext.OrderSide orderSideRedact = order_side != null ? ValidateCryptoOrderRequest.OrderContext.OrderSide.ADAPTER.redact(order_side) : null;
                    ValidateCryptoOrderRequest.OrderContext.Quote quote = value.getQuote();
                    ValidateCryptoOrderRequest.OrderContext.Quote quoteRedact = quote != null ? ValidateCryptoOrderRequest.OrderContext.Quote.ADAPTER.redact(quote) : null;
                    OrderPrices order_prices = value.getOrder_prices();
                    OrderPrices orderPricesRedact = order_prices != null ? OrderPrices.ADAPTER.redact(order_prices) : null;
                    CurrencyPair currency_pair = value.getCurrency_pair();
                    CurrencyPair currencyPairRedact = currency_pair != null ? CurrencyPair.ADAPTER.redact(currency_pair) : null;
                    ValidateCryptoOrderRequest.OrderContext.UserInputs user_inputs = value.getUser_inputs();
                    ValidateCryptoOrderRequest.OrderContext.UserInputs userInputsRedact = user_inputs != null ? ValidateCryptoOrderRequest.OrderContext.UserInputs.ADAPTER.redact(user_inputs) : null;
                    ValidateCryptoOrderRequest.OrderContext.OrderInfo order_info = value.getOrder_info();
                    ValidateCryptoOrderRequest.OrderContext.OrderInfo orderInfoRedact = order_info != null ? ValidateCryptoOrderRequest.OrderContext.OrderInfo.ADAPTER.redact(order_info) : null;
                    ValidateCryptoOrderRequest.OrderContext.AccountInfo account_info = value.getAccount_info();
                    return ValidateCryptoOrderRequest.OrderContext.copy$default(value, orderSideRedact, false, quoteRedact, orderPricesRedact, currencyPairRedact, userInputsRedact, orderInfoRedact, null, account_info != null ? ValidateCryptoOrderRequest.OrderContext.AccountInfo.ADAPTER.redact(account_info) : null, false, null, ByteString.EMPTY, 1666, null);
                }
            };
        }

        /* compiled from: ValidateCryptoOrderRequest.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide;", "Lcom/squareup/wire/Message;", "", "buy", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy;", "sell", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell;Lokio/ByteString;)V", "getBuy", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy;", "getSell", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Buy", "Sell", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class OrderSide extends Message {

            @JvmField
            public static final ProtoAdapter<OrderSide> ADAPTER;

            @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
            private final Buy buy;

            @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
            private final Sell sell;

            public OrderSide() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27729newBuilder();
            }

            public final Buy getBuy() {
                return this.buy;
            }

            public final Sell getSell() {
                return this.sell;
            }

            public /* synthetic */ OrderSide(Buy buy, Sell sell, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : buy, (i & 2) != 0 ? null : sell, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderSide(Buy buy, Sell sell, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.buy = buy;
                this.sell = sell;
                if (Internal.countNonNull(buy, sell) > 1) {
                    throw new IllegalArgumentException("At most one of buy, sell may be non-null");
                }
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27729newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof OrderSide)) {
                    return false;
                }
                OrderSide orderSide = (OrderSide) other;
                return Intrinsics.areEqual(unknownFields(), orderSide.unknownFields()) && Intrinsics.areEqual(this.buy, orderSide.buy) && Intrinsics.areEqual(this.sell, orderSide.sell);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Buy buy = this.buy;
                int iHashCode2 = (iHashCode + (buy != null ? buy.hashCode() : 0)) * 37;
                Sell sell = this.sell;
                int iHashCode3 = iHashCode2 + (sell != null ? sell.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Buy buy = this.buy;
                if (buy != null) {
                    arrayList.add("buy=" + buy);
                }
                Sell sell = this.sell;
                if (sell != null) {
                    arrayList.add("sell=" + sell);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSide{", "}", 0, null, null, 56, null);
            }

            public final OrderSide copy(Buy buy, Sell sell, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new OrderSide(buy, sell, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSide.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<OrderSide>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$OrderSide$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.OrderSide decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy buyDecode = null;
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell sellDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new ValidateCryptoOrderRequest.OrderContext.OrderSide(buyDecode, sellDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                buyDecode = ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy.ADAPTER.decode(reader);
                            } else if (iNextTag == 2) {
                                sellDecode = ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderRequest.OrderContext.OrderSide value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy.ADAPTER.encodedSizeWithTag(1, value.getBuy()) + ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell.ADAPTER.encodedSizeWithTag(2, value.getSell());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.OrderSide value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy.ADAPTER.encodeWithTag(writer, 1, (int) value.getBuy());
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell.ADAPTER.encodeWithTag(writer, 2, (int) value.getSell());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.OrderSide value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell.ADAPTER.encodeWithTag(writer, 2, (int) value.getSell());
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy.ADAPTER.encodeWithTag(writer, 1, (int) value.getBuy());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.OrderSide redact(ValidateCryptoOrderRequest.OrderContext.OrderSide value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy buy = value.getBuy();
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy buyRedact = buy != null ? ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy.ADAPTER.redact(buy) : null;
                        ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell sell = value.getSell();
                        return value.copy(buyRedact, sell != null ? ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell.ADAPTER.redact(sell) : null, ByteString.EMPTY);
                    }
                };
            }

            /* compiled from: ValidateCryptoOrderRequest.kt */
            @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy;", "Lcom/squareup/wire/Message;", "", "buying_power", "", "quantity_available", "payment_method", "Lbff_money_movement/service/v1/BillingAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/BillingAccount;Lokio/ByteString;)V", "getBuying_power", "()Ljava/lang/String;", "getQuantity_available", "getPayment_method", "()Lbff_money_movement/service/v1/BillingAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Buy extends Message {

                @JvmField
                public static final ProtoAdapter<Buy> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buyingPower", schemaIndex = 0, tag = 1)
                private final String buying_power;

                @WireField(adapter = "bff_money_movement.service.v1.BillingAccount#ADAPTER", jsonName = "paymentMethod", schemaIndex = 2, tag = 3)
                private final BillingAccount payment_method;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quantityAvailable", schemaIndex = 1, tag = 2)
                private final String quantity_available;

                public Buy() {
                    this(null, null, null, null, 15, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m27730newBuilder();
                }

                public final String getBuying_power() {
                    return this.buying_power;
                }

                public final String getQuantity_available() {
                    return this.quantity_available;
                }

                public final BillingAccount getPayment_method() {
                    return this.payment_method;
                }

                public /* synthetic */ Buy(String str, String str2, BillingAccount billingAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : billingAccount, (i & 8) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Buy(String str, String str2, BillingAccount billingAccount, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.buying_power = str;
                    this.quantity_available = str2;
                    this.payment_method = billingAccount;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m27730newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Buy)) {
                        return false;
                    }
                    Buy buy = (Buy) other;
                    return Intrinsics.areEqual(unknownFields(), buy.unknownFields()) && Intrinsics.areEqual(this.buying_power, buy.buying_power) && Intrinsics.areEqual(this.quantity_available, buy.quantity_available) && Intrinsics.areEqual(this.payment_method, buy.payment_method);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    String str = this.buying_power;
                    int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.quantity_available;
                    int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    BillingAccount billingAccount = this.payment_method;
                    int iHashCode4 = iHashCode3 + (billingAccount != null ? billingAccount.hashCode() : 0);
                    this.hashCode = iHashCode4;
                    return iHashCode4;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.buying_power;
                    if (str != null) {
                        arrayList.add("buying_power=" + Internal.sanitize(str));
                    }
                    String str2 = this.quantity_available;
                    if (str2 != null) {
                        arrayList.add("quantity_available=" + Internal.sanitize(str2));
                    }
                    BillingAccount billingAccount = this.payment_method;
                    if (billingAccount != null) {
                        arrayList.add("payment_method=" + billingAccount);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Buy{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ Buy copy$default(Buy buy, String str, String str2, BillingAccount billingAccount, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = buy.buying_power;
                    }
                    if ((i & 2) != 0) {
                        str2 = buy.quantity_available;
                    }
                    if ((i & 4) != 0) {
                        billingAccount = buy.payment_method;
                    }
                    if ((i & 8) != 0) {
                        byteString = buy.unknownFields();
                    }
                    return buy.copy(str, str2, billingAccount, byteString);
                }

                public final Buy copy(String buying_power, String quantity_available, BillingAccount payment_method, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Buy(buying_power, quantity_available, payment_method, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Buy.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Buy>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = null;
                            String strDecode2 = null;
                            BillingAccount billingAccountDecode = null;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy(strDecode, strDecode2, billingAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 2) {
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 3) {
                                    billingAccountDecode = BillingAccount.ADAPTER.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                            return size + protoAdapter.encodedSizeWithTag(1, value.getBuying_power()) + protoAdapter.encodedSizeWithTag(2, value.getQuantity_available()) + BillingAccount.ADAPTER.encodedSizeWithTag(3, value.getPayment_method());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                            protoAdapter.encodeWithTag(writer, 1, (int) value.getBuying_power());
                            protoAdapter.encodeWithTag(writer, 2, (int) value.getQuantity_available());
                            BillingAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getPayment_method());
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            BillingAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getPayment_method());
                            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                            protoAdapter.encodeWithTag(writer, 2, (int) value.getQuantity_available());
                            protoAdapter.encodeWithTag(writer, 1, (int) value.getBuying_power());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy redact(ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            BillingAccount payment_method = value.getPayment_method();
                            return ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy.copy$default(value, null, null, payment_method != null ? BillingAccount.ADAPTER.redact(payment_method) : null, ByteString.EMPTY, 3, null);
                        }
                    };
                }
            }

            /* compiled from: ValidateCryptoOrderRequest.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell;", "Lcom/squareup/wire/Message;", "", "quantity_available", "", "quantity_held_for_buy", "quantity_held_for_sell", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getQuantity_available", "()Ljava/lang/String;", "getQuantity_held_for_buy", "getQuantity_held_for_sell", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Sell extends Message {

                @JvmField
                public static final ProtoAdapter<Sell> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quantityAvailable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final String quantity_available;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quantityHeldForBuy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
                private final String quantity_held_for_buy;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quantityHeldForSell", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
                private final String quantity_held_for_sell;

                public Sell() {
                    this(null, null, null, null, 15, null);
                }

                public /* synthetic */ Sell(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m27731newBuilder();
                }

                public final String getQuantity_available() {
                    return this.quantity_available;
                }

                public final String getQuantity_held_for_buy() {
                    return this.quantity_held_for_buy;
                }

                public final String getQuantity_held_for_sell() {
                    return this.quantity_held_for_sell;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Sell(String quantity_available, String quantity_held_for_buy, String quantity_held_for_sell, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(quantity_available, "quantity_available");
                    Intrinsics.checkNotNullParameter(quantity_held_for_buy, "quantity_held_for_buy");
                    Intrinsics.checkNotNullParameter(quantity_held_for_sell, "quantity_held_for_sell");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.quantity_available = quantity_available;
                    this.quantity_held_for_buy = quantity_held_for_buy;
                    this.quantity_held_for_sell = quantity_held_for_sell;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m27731newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Sell)) {
                        return false;
                    }
                    Sell sell = (Sell) other;
                    return Intrinsics.areEqual(unknownFields(), sell.unknownFields()) && Intrinsics.areEqual(this.quantity_available, sell.quantity_available) && Intrinsics.areEqual(this.quantity_held_for_buy, sell.quantity_held_for_buy) && Intrinsics.areEqual(this.quantity_held_for_sell, sell.quantity_held_for_sell);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (((((unknownFields().hashCode() * 37) + this.quantity_available.hashCode()) * 37) + this.quantity_held_for_buy.hashCode()) * 37) + this.quantity_held_for_sell.hashCode();
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("quantity_available=" + Internal.sanitize(this.quantity_available));
                    arrayList.add("quantity_held_for_buy=" + Internal.sanitize(this.quantity_held_for_buy));
                    arrayList.add("quantity_held_for_sell=" + Internal.sanitize(this.quantity_held_for_sell));
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Sell{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ Sell copy$default(Sell sell, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = sell.quantity_available;
                    }
                    if ((i & 2) != 0) {
                        str2 = sell.quantity_held_for_buy;
                    }
                    if ((i & 4) != 0) {
                        str3 = sell.quantity_held_for_sell;
                    }
                    if ((i & 8) != 0) {
                        byteString = sell.unknownFields();
                    }
                    return sell.copy(str, str2, str3, byteString);
                }

                public final Sell copy(String quantity_available, String quantity_held_for_buy, String quantity_held_for_sell, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(quantity_available, "quantity_available");
                    Intrinsics.checkNotNullParameter(quantity_held_for_buy, "quantity_held_for_buy");
                    Intrinsics.checkNotNullParameter(quantity_held_for_sell, "quantity_held_for_sell");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Sell(quantity_available, quantity_held_for_buy, quantity_held_for_sell, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Sell.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Sell>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = "";
                            String strDecode2 = "";
                            String strDecode3 = strDecode2;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 2) {
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 3) {
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            if (!Intrinsics.areEqual(value.getQuantity_available(), "")) {
                                size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getQuantity_available());
                            }
                            if (!Intrinsics.areEqual(value.getQuantity_held_for_buy(), "")) {
                                size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getQuantity_held_for_buy());
                            }
                            return !Intrinsics.areEqual(value.getQuantity_held_for_sell(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuantity_held_for_sell()) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!Intrinsics.areEqual(value.getQuantity_available(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuantity_available());
                            }
                            if (!Intrinsics.areEqual(value.getQuantity_held_for_buy(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuantity_held_for_buy());
                            }
                            if (!Intrinsics.areEqual(value.getQuantity_held_for_sell(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuantity_held_for_sell());
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (!Intrinsics.areEqual(value.getQuantity_held_for_sell(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuantity_held_for_sell());
                            }
                            if (!Intrinsics.areEqual(value.getQuantity_held_for_buy(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuantity_held_for_buy());
                            }
                            if (Intrinsics.areEqual(value.getQuantity_available(), "")) {
                                return;
                            }
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuantity_available());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell redact(ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                        }
                    };
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequest.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$Quote;", "Lcom/squareup/wire/Message;", "", BidAskDetails3.ASK_PRICE, "", BidAskDetails3.BID_PRICE, "mid_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsk_price", "()Ljava/lang/String;", "getBid_price", "getMid_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Quote extends Message {

            @JvmField
            public static final ProtoAdapter<Quote> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String ask_price;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String bid_price;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "midPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final String mid_price;

            public Quote() {
                this(null, null, null, null, 15, null);
            }

            public /* synthetic */ Quote(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27732newBuilder();
            }

            public final String getAsk_price() {
                return this.ask_price;
            }

            public final String getBid_price() {
                return this.bid_price;
            }

            public final String getMid_price() {
                return this.mid_price;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Quote(String ask_price, String bid_price, String mid_price, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(ask_price, "ask_price");
                Intrinsics.checkNotNullParameter(bid_price, "bid_price");
                Intrinsics.checkNotNullParameter(mid_price, "mid_price");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.ask_price = ask_price;
                this.bid_price = bid_price;
                this.mid_price = mid_price;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27732newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Quote)) {
                    return false;
                }
                Quote quote = (Quote) other;
                return Intrinsics.areEqual(unknownFields(), quote.unknownFields()) && Intrinsics.areEqual(this.ask_price, quote.ask_price) && Intrinsics.areEqual(this.bid_price, quote.bid_price) && Intrinsics.areEqual(this.mid_price, quote.mid_price);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((unknownFields().hashCode() * 37) + this.ask_price.hashCode()) * 37) + this.bid_price.hashCode()) * 37) + this.mid_price.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
                arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
                arrayList.add("mid_price=" + Internal.sanitize(this.mid_price));
                return CollectionsKt.joinToString$default(arrayList, ", ", "Quote{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Quote copy$default(Quote quote, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = quote.ask_price;
                }
                if ((i & 2) != 0) {
                    str2 = quote.bid_price;
                }
                if ((i & 4) != 0) {
                    str3 = quote.mid_price;
                }
                if ((i & 8) != 0) {
                    byteString = quote.unknownFields();
                }
                return quote.copy(str, str2, str3, byteString);
            }

            public final Quote copy(String ask_price, String bid_price, String mid_price, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(ask_price, "ask_price");
                Intrinsics.checkNotNullParameter(bid_price, "bid_price");
                Intrinsics.checkNotNullParameter(mid_price, "mid_price");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Quote(ask_price, bid_price, mid_price, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Quote.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Quote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$Quote$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.Quote decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = "";
                        String strDecode3 = strDecode2;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new ValidateCryptoOrderRequest.OrderContext.Quote(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderRequest.OrderContext.Quote value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsk_price());
                        }
                        if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBid_price());
                        }
                        return !Intrinsics.areEqual(value.getMid_price(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMid_price()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.Quote value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsk_price());
                        }
                        if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBid_price());
                        }
                        if (!Intrinsics.areEqual(value.getMid_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMid_price());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.Quote value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Intrinsics.areEqual(value.getMid_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMid_price());
                        }
                        if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBid_price());
                        }
                        if (Intrinsics.areEqual(value.getAsk_price(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsk_price());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.Quote redact(ValidateCryptoOrderRequest.OrderContext.Quote value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return ValidateCryptoOrderRequest.OrderContext.Quote.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }

        /* compiled from: ValidateCryptoOrderRequest.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs;", "Lcom/squareup/wire/Message;", "", "quote", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote;", "asset", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset;Lokio/ByteString;)V", "getQuote", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote;", "getAsset", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", DxFeedData.TYPE_QUOTE, "Asset", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class UserInputs extends Message {

            @JvmField
            public static final ProtoAdapter<UserInputs> ADAPTER;

            @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
            private final Asset asset;

            @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
            private final Quote quote;

            public UserInputs() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27733newBuilder();
            }

            public final Quote getQuote() {
                return this.quote;
            }

            public final Asset getAsset() {
                return this.asset;
            }

            public /* synthetic */ UserInputs(Quote quote, Asset asset, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : quote, (i & 2) != 0 ? null : asset, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserInputs(Quote quote, Asset asset, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.quote = quote;
                this.asset = asset;
                if (Internal.countNonNull(quote, asset) > 1) {
                    throw new IllegalArgumentException("At most one of quote, asset may be non-null");
                }
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27733newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof UserInputs)) {
                    return false;
                }
                UserInputs userInputs = (UserInputs) other;
                return Intrinsics.areEqual(unknownFields(), userInputs.unknownFields()) && Intrinsics.areEqual(this.quote, userInputs.quote) && Intrinsics.areEqual(this.asset, userInputs.asset);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Quote quote = this.quote;
                int iHashCode2 = (iHashCode + (quote != null ? quote.hashCode() : 0)) * 37;
                Asset asset = this.asset;
                int iHashCode3 = iHashCode2 + (asset != null ? asset.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Quote quote = this.quote;
                if (quote != null) {
                    arrayList.add("quote=" + quote);
                }
                Asset asset = this.asset;
                if (asset != null) {
                    arrayList.add("asset=" + asset);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "UserInputs{", "}", 0, null, null, 56, null);
            }

            public final UserInputs copy(Quote quote, Asset asset, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new UserInputs(quote, asset, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserInputs.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<UserInputs>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$UserInputs$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.UserInputs decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote quoteDecode = null;
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset assetDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new ValidateCryptoOrderRequest.OrderContext.UserInputs(quoteDecode, assetDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                quoteDecode = ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote.ADAPTER.decode(reader);
                            } else if (iNextTag == 2) {
                                assetDecode = ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderRequest.OrderContext.UserInputs value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote.ADAPTER.encodedSizeWithTag(1, value.getQuote()) + ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset.ADAPTER.encodedSizeWithTag(2, value.getAsset());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.UserInputs value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote.ADAPTER.encodeWithTag(writer, 1, (int) value.getQuote());
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.UserInputs value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset());
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote.ADAPTER.encodeWithTag(writer, 1, (int) value.getQuote());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.UserInputs redact(ValidateCryptoOrderRequest.OrderContext.UserInputs value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote quote = value.getQuote();
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote quoteRedact = quote != null ? ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote.ADAPTER.redact(quote) : null;
                        ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset asset = value.getAsset();
                        return value.copy(quoteRedact, asset != null ? ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset.ADAPTER.redact(asset) : null, ByteString.EMPTY);
                    }
                };
            }

            /* compiled from: ValidateCryptoOrderRequest.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote;", "Lcom/squareup/wire/Message;", "", "amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAmount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Quote extends Message {

                @JvmField
                public static final ProtoAdapter<Quote> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final String amount;

                /* JADX WARN: Multi-variable type inference failed */
                public Quote() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m27735newBuilder();
                }

                public final String getAmount() {
                    return this.amount;
                }

                public /* synthetic */ Quote(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Quote(String amount, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.amount = amount;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m27735newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Quote)) {
                        return false;
                    }
                    Quote quote = (Quote) other;
                    return Intrinsics.areEqual(unknownFields(), quote.unknownFields()) && Intrinsics.areEqual(this.amount, quote.amount);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (unknownFields().hashCode() * 37) + this.amount.hashCode();
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("amount=" + Internal.sanitize(this.amount));
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Quote{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ Quote copy$default(Quote quote, String str, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = quote.amount;
                    }
                    if ((i & 2) != 0) {
                        byteString = quote.unknownFields();
                    }
                    return quote.copy(str, byteString);
                }

                public final Quote copy(String amount, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Quote(amount, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Quote.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Quote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = "";
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            return !Intrinsics.areEqual(value.getAmount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAmount()) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!Intrinsics.areEqual(value.getAmount(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (Intrinsics.areEqual(value.getAmount(), "")) {
                                return;
                            }
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote redact(ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote.copy$default(value, null, ByteString.EMPTY, 1, null);
                        }
                    };
                }
            }

            /* compiled from: ValidateCryptoOrderRequest.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset;", "Lcom/squareup/wire/Message;", "", "amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAmount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Asset extends Message {

                @JvmField
                public static final ProtoAdapter<Asset> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final String amount;

                /* JADX WARN: Multi-variable type inference failed */
                public Asset() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m27734newBuilder();
                }

                public final String getAmount() {
                    return this.amount;
                }

                public /* synthetic */ Asset(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Asset(String amount, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.amount = amount;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m27734newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Asset)) {
                        return false;
                    }
                    Asset asset = (Asset) other;
                    return Intrinsics.areEqual(unknownFields(), asset.unknownFields()) && Intrinsics.areEqual(this.amount, asset.amount);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (unknownFields().hashCode() * 37) + this.amount.hashCode();
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("amount=" + Internal.sanitize(this.amount));
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Asset{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ Asset copy$default(Asset asset, String str, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = asset.amount;
                    }
                    if ((i & 2) != 0) {
                        byteString = asset.unknownFields();
                    }
                    return asset.copy(str, byteString);
                }

                public final Asset copy(String amount, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Asset(amount, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Asset.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Asset>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = "";
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            return !Intrinsics.areEqual(value.getAmount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAmount()) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!Intrinsics.areEqual(value.getAmount(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (Intrinsics.areEqual(value.getAmount(), "")) {
                                return;
                            }
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset redact(ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset.copy$default(value, null, ByteString.EMPTY, 1, null);
                        }
                    };
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequest.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderInfo;", "Lcom/squareup/wire/Message;", "", "order_quantity", "", "uncollared_total_cost", "collared_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_quantity", "()Ljava/lang/String;", "getUncollared_total_cost", "getCollared_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class OrderInfo extends Message {

            @JvmField
            public static final ProtoAdapter<OrderInfo> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "collaredPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final String collared_price;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String order_quantity;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uncollaredTotalCost", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String uncollared_total_cost;

            public OrderInfo() {
                this(null, null, null, null, 15, null);
            }

            public /* synthetic */ OrderInfo(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27728newBuilder();
            }

            public final String getOrder_quantity() {
                return this.order_quantity;
            }

            public final String getUncollared_total_cost() {
                return this.uncollared_total_cost;
            }

            public final String getCollared_price() {
                return this.collared_price;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderInfo(String order_quantity, String uncollared_total_cost, String collared_price, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
                Intrinsics.checkNotNullParameter(uncollared_total_cost, "uncollared_total_cost");
                Intrinsics.checkNotNullParameter(collared_price, "collared_price");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.order_quantity = order_quantity;
                this.uncollared_total_cost = uncollared_total_cost;
                this.collared_price = collared_price;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27728newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof OrderInfo)) {
                    return false;
                }
                OrderInfo orderInfo = (OrderInfo) other;
                return Intrinsics.areEqual(unknownFields(), orderInfo.unknownFields()) && Intrinsics.areEqual(this.order_quantity, orderInfo.order_quantity) && Intrinsics.areEqual(this.uncollared_total_cost, orderInfo.uncollared_total_cost) && Intrinsics.areEqual(this.collared_price, orderInfo.collared_price);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((unknownFields().hashCode() * 37) + this.order_quantity.hashCode()) * 37) + this.uncollared_total_cost.hashCode()) * 37) + this.collared_price.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("order_quantity=" + Internal.sanitize(this.order_quantity));
                arrayList.add("uncollared_total_cost=" + Internal.sanitize(this.uncollared_total_cost));
                arrayList.add("collared_price=" + Internal.sanitize(this.collared_price));
                return CollectionsKt.joinToString$default(arrayList, ", ", "OrderInfo{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ OrderInfo copy$default(OrderInfo orderInfo, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = orderInfo.order_quantity;
                }
                if ((i & 2) != 0) {
                    str2 = orderInfo.uncollared_total_cost;
                }
                if ((i & 4) != 0) {
                    str3 = orderInfo.collared_price;
                }
                if ((i & 8) != 0) {
                    byteString = orderInfo.unknownFields();
                }
                return orderInfo.copy(str, str2, str3, byteString);
            }

            public final OrderInfo copy(String order_quantity, String uncollared_total_cost, String collared_price, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
                Intrinsics.checkNotNullParameter(uncollared_total_cost, "uncollared_total_cost");
                Intrinsics.checkNotNullParameter(collared_price, "collared_price");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new OrderInfo(order_quantity, uncollared_total_cost, collared_price, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderInfo.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<OrderInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$OrderInfo$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.OrderInfo decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = "";
                        String strDecode3 = strDecode2;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new ValidateCryptoOrderRequest.OrderContext.OrderInfo(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderRequest.OrderContext.OrderInfo value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getOrder_quantity(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_quantity());
                        }
                        if (!Intrinsics.areEqual(value.getUncollared_total_cost(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUncollared_total_cost());
                        }
                        return !Intrinsics.areEqual(value.getCollared_price(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCollared_price()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.OrderInfo value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getOrder_quantity(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_quantity());
                        }
                        if (!Intrinsics.areEqual(value.getUncollared_total_cost(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUncollared_total_cost());
                        }
                        if (!Intrinsics.areEqual(value.getCollared_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCollared_price());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.OrderInfo value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Intrinsics.areEqual(value.getCollared_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCollared_price());
                        }
                        if (!Intrinsics.areEqual(value.getUncollared_total_cost(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUncollared_total_cost());
                        }
                        if (Intrinsics.areEqual(value.getOrder_quantity(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_quantity());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.OrderInfo redact(ValidateCryptoOrderRequest.OrderContext.OrderInfo value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return ValidateCryptoOrderRequest.OrderContext.OrderInfo.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }

        /* compiled from: ValidateCryptoOrderRequest.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016JL\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$AccountInfo;", "Lcom/squareup/wire/Message;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "", "is_pattern_day_trader", "", "is_margin", "account_type_display_name", "is_margin_investing_enabled", "is_levered", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;ZZLokio/ByteString;)V", "getEquity", "()Ljava/lang/String;", "()Z", "getAccount_type_display_name", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AccountInfo extends Message {

            @JvmField
            public static final ProtoAdapter<AccountInfo> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountTypeDisplayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
            private final String account_type_display_name;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String equity;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLevered", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
            private final boolean is_levered;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final boolean is_margin;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMarginInvestingEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
            private final boolean is_margin_investing_enabled;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPatternDayTrader", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final boolean is_pattern_day_trader;

            public AccountInfo() {
                this(null, false, false, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            public /* synthetic */ AccountInfo(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27727newBuilder();
            }

            public final String getEquity() {
                return this.equity;
            }

            /* renamed from: is_pattern_day_trader, reason: from getter */
            public final boolean getIs_pattern_day_trader() {
                return this.is_pattern_day_trader;
            }

            /* renamed from: is_margin, reason: from getter */
            public final boolean getIs_margin() {
                return this.is_margin;
            }

            public final String getAccount_type_display_name() {
                return this.account_type_display_name;
            }

            /* renamed from: is_margin_investing_enabled, reason: from getter */
            public final boolean getIs_margin_investing_enabled() {
                return this.is_margin_investing_enabled;
            }

            /* renamed from: is_levered, reason: from getter */
            public final boolean getIs_levered() {
                return this.is_levered;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountInfo(String equity, boolean z, boolean z2, String account_type_display_name, boolean z3, boolean z4, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(equity, "equity");
                Intrinsics.checkNotNullParameter(account_type_display_name, "account_type_display_name");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.equity = equity;
                this.is_pattern_day_trader = z;
                this.is_margin = z2;
                this.account_type_display_name = account_type_display_name;
                this.is_margin_investing_enabled = z3;
                this.is_levered = z4;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27727newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof AccountInfo)) {
                    return false;
                }
                AccountInfo accountInfo = (AccountInfo) other;
                return Intrinsics.areEqual(unknownFields(), accountInfo.unknownFields()) && Intrinsics.areEqual(this.equity, accountInfo.equity) && this.is_pattern_day_trader == accountInfo.is_pattern_day_trader && this.is_margin == accountInfo.is_margin && Intrinsics.areEqual(this.account_type_display_name, accountInfo.account_type_display_name) && this.is_margin_investing_enabled == accountInfo.is_margin_investing_enabled && this.is_levered == accountInfo.is_levered;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.equity.hashCode()) * 37) + Boolean.hashCode(this.is_pattern_day_trader)) * 37) + Boolean.hashCode(this.is_margin)) * 37) + this.account_type_display_name.hashCode()) * 37) + Boolean.hashCode(this.is_margin_investing_enabled)) * 37) + Boolean.hashCode(this.is_levered);
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("equity=" + Internal.sanitize(this.equity));
                arrayList.add("is_pattern_day_trader=" + this.is_pattern_day_trader);
                arrayList.add("is_margin=" + this.is_margin);
                arrayList.add("account_type_display_name=" + Internal.sanitize(this.account_type_display_name));
                arrayList.add("is_margin_investing_enabled=" + this.is_margin_investing_enabled);
                arrayList.add("is_levered=" + this.is_levered);
                return CollectionsKt.joinToString$default(arrayList, ", ", "AccountInfo{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ AccountInfo copy$default(AccountInfo accountInfo, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accountInfo.equity;
                }
                if ((i & 2) != 0) {
                    z = accountInfo.is_pattern_day_trader;
                }
                if ((i & 4) != 0) {
                    z2 = accountInfo.is_margin;
                }
                if ((i & 8) != 0) {
                    str2 = accountInfo.account_type_display_name;
                }
                if ((i & 16) != 0) {
                    z3 = accountInfo.is_margin_investing_enabled;
                }
                if ((i & 32) != 0) {
                    z4 = accountInfo.is_levered;
                }
                if ((i & 64) != 0) {
                    byteString = accountInfo.unknownFields();
                }
                boolean z5 = z4;
                ByteString byteString2 = byteString;
                boolean z6 = z3;
                boolean z7 = z2;
                return accountInfo.copy(str, z, z7, str2, z6, z5, byteString2);
            }

            public final AccountInfo copy(String equity, boolean is_pattern_day_trader, boolean is_margin, String account_type_display_name, boolean is_margin_investing_enabled, boolean is_levered, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(equity, "equity");
                Intrinsics.checkNotNullParameter(account_type_display_name, "account_type_display_name");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new AccountInfo(equity, is_pattern_day_trader, is_margin, account_type_display_name, is_margin_investing_enabled, is_levered, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountInfo.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<AccountInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$OrderContext$AccountInfo$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.AccountInfo decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        boolean zBooleanValue = false;
                        boolean zBooleanValue2 = false;
                        boolean zBooleanValue3 = false;
                        boolean zBooleanValue4 = false;
                        String strDecode2 = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                switch (iNextTag) {
                                    case 1:
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 2:
                                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                        break;
                                    case 3:
                                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                        break;
                                    case 4:
                                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 5:
                                        zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                        break;
                                    case 6:
                                        zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                        break;
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        break;
                                }
                            } else {
                                return new ValidateCryptoOrderRequest.OrderContext.AccountInfo(strDecode, zBooleanValue, zBooleanValue2, strDecode2, zBooleanValue3, zBooleanValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderRequest.OrderContext.AccountInfo value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getEquity(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEquity());
                        }
                        if (value.getIs_pattern_day_trader()) {
                            size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_pattern_day_trader()));
                        }
                        if (value.getIs_margin()) {
                            size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_margin()));
                        }
                        if (!Intrinsics.areEqual(value.getAccount_type_display_name(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_type_display_name());
                        }
                        if (value.getIs_margin_investing_enabled()) {
                            size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_margin_investing_enabled()));
                        }
                        return value.getIs_levered() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_levered())) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.AccountInfo value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEquity(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEquity());
                        }
                        if (value.getIs_pattern_day_trader()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_pattern_day_trader()));
                        }
                        if (value.getIs_margin()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_margin()));
                        }
                        if (!Intrinsics.areEqual(value.getAccount_type_display_name(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_type_display_name());
                        }
                        if (value.getIs_margin_investing_enabled()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_margin_investing_enabled()));
                        }
                        if (value.getIs_levered()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_levered()));
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.OrderContext.AccountInfo value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getIs_levered()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_levered()));
                        }
                        if (value.getIs_margin_investing_enabled()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_margin_investing_enabled()));
                        }
                        if (!Intrinsics.areEqual(value.getAccount_type_display_name(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_type_display_name());
                        }
                        if (value.getIs_margin()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_margin()));
                        }
                        if (value.getIs_pattern_day_trader()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_pattern_day_trader()));
                        }
                        if (Intrinsics.areEqual(value.getEquity(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEquity());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.OrderContext.AccountInfo redact(ValidateCryptoOrderRequest.OrderContext.AccountInfo value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return ValidateCryptoOrderRequest.OrderContext.AccountInfo.copy$default(value, null, false, false, null, false, false, ByteString.EMPTY, 63, null);
                    }
                };
            }
        }
    }

    /* compiled from: ValidateCryptoOrderRequest.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001d\u001e\u001f B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$Default;", "order_price", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$OrderPrice;", "tokenized_stocks", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$Default;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$OrderPrice;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks;Lokio/ByteString;)V", "getDefault", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$Default;", "getOrder_price", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$OrderPrice;", "getTokenized_stocks", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Default", "OrderPrice", "TokenizedStocks", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ValidationSource extends Message {

        @JvmField
        public static final ProtoAdapter<ValidationSource> ADAPTER;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$ValidationSource$Default#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
        private final Default default;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$ValidationSource$OrderPrice#ADAPTER", jsonName = "orderPrice", oneofName = "type", schemaIndex = 1, tag = 2)
        private final OrderPrice order_price;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks#ADAPTER", jsonName = "tokenizedStocks", oneofName = "type", schemaIndex = 2, tag = 3)
        private final TokenizedStocks tokenized_stocks;

        public ValidationSource() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27736newBuilder();
        }

        public final Default getDefault() {
            return this.default;
        }

        public final OrderPrice getOrder_price() {
            return this.order_price;
        }

        public final TokenizedStocks getTokenized_stocks() {
            return this.tokenized_stocks;
        }

        public /* synthetic */ ValidationSource(Default r2, OrderPrice orderPrice, TokenizedStocks tokenizedStocks, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : r2, (i & 2) != 0 ? null : orderPrice, (i & 4) != 0 ? null : tokenizedStocks, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationSource(Default r2, OrderPrice orderPrice, TokenizedStocks tokenizedStocks, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.default = r2;
            this.order_price = orderPrice;
            this.tokenized_stocks = tokenizedStocks;
            if (Internal.countNonNull(r2, orderPrice, tokenizedStocks) > 1) {
                throw new IllegalArgumentException("At most one of default, order_price, tokenized_stocks may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27736newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ValidationSource)) {
                return false;
            }
            ValidationSource validationSource = (ValidationSource) other;
            return Intrinsics.areEqual(unknownFields(), validationSource.unknownFields()) && Intrinsics.areEqual(this.default, validationSource.default) && Intrinsics.areEqual(this.order_price, validationSource.order_price) && Intrinsics.areEqual(this.tokenized_stocks, validationSource.tokenized_stocks);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Default r1 = this.default;
            int iHashCode2 = (iHashCode + (r1 != null ? r1.hashCode() : 0)) * 37;
            OrderPrice orderPrice = this.order_price;
            int iHashCode3 = (iHashCode2 + (orderPrice != null ? orderPrice.hashCode() : 0)) * 37;
            TokenizedStocks tokenizedStocks = this.tokenized_stocks;
            int iHashCode4 = iHashCode3 + (tokenizedStocks != null ? tokenizedStocks.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Default r1 = this.default;
            if (r1 != null) {
                arrayList.add("default=" + r1);
            }
            OrderPrice orderPrice = this.order_price;
            if (orderPrice != null) {
                arrayList.add("order_price=" + orderPrice);
            }
            TokenizedStocks tokenizedStocks = this.tokenized_stocks;
            if (tokenizedStocks != null) {
                arrayList.add("tokenized_stocks=" + tokenizedStocks);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ValidationSource{", "}", 0, null, null, 56, null);
        }

        public final ValidationSource copy(Default r2, OrderPrice order_price, TokenizedStocks tokenized_stocks, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ValidationSource(r2, order_price, tokenized_stocks, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidationSource.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ValidationSource>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$ValidationSource$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public ValidateCryptoOrderRequest.ValidationSource decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    ValidateCryptoOrderRequest.ValidationSource.Default defaultDecode = null;
                    ValidateCryptoOrderRequest.ValidationSource.OrderPrice orderPriceDecode = null;
                    ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks tokenizedStocksDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValidateCryptoOrderRequest.ValidationSource(defaultDecode, orderPriceDecode, tokenizedStocksDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            defaultDecode = ValidateCryptoOrderRequest.ValidationSource.Default.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            orderPriceDecode = ValidateCryptoOrderRequest.ValidationSource.OrderPrice.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            tokenizedStocksDecode = ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ValidateCryptoOrderRequest.ValidationSource value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ValidateCryptoOrderRequest.ValidationSource.Default.ADAPTER.encodedSizeWithTag(1, value.getDefault()) + ValidateCryptoOrderRequest.ValidationSource.OrderPrice.ADAPTER.encodedSizeWithTag(2, value.getOrder_price()) + ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks.ADAPTER.encodedSizeWithTag(3, value.getTokenized_stocks());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.ValidationSource value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ValidateCryptoOrderRequest.ValidationSource.Default.ADAPTER.encodeWithTag(writer, 1, (int) value.getDefault());
                    ValidateCryptoOrderRequest.ValidationSource.OrderPrice.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_price());
                    ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks.ADAPTER.encodeWithTag(writer, 3, (int) value.getTokenized_stocks());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.ValidationSource value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks.ADAPTER.encodeWithTag(writer, 3, (int) value.getTokenized_stocks());
                    ValidateCryptoOrderRequest.ValidationSource.OrderPrice.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_price());
                    ValidateCryptoOrderRequest.ValidationSource.Default.ADAPTER.encodeWithTag(writer, 1, (int) value.getDefault());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateCryptoOrderRequest.ValidationSource redact(ValidateCryptoOrderRequest.ValidationSource value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ValidateCryptoOrderRequest.ValidationSource.Default r0 = value.getDefault();
                    ValidateCryptoOrderRequest.ValidationSource.Default defaultRedact = r0 != null ? ValidateCryptoOrderRequest.ValidationSource.Default.ADAPTER.redact(r0) : null;
                    ValidateCryptoOrderRequest.ValidationSource.OrderPrice order_price = value.getOrder_price();
                    ValidateCryptoOrderRequest.ValidationSource.OrderPrice orderPriceRedact = order_price != null ? ValidateCryptoOrderRequest.ValidationSource.OrderPrice.ADAPTER.redact(order_price) : null;
                    ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks tokenized_stocks = value.getTokenized_stocks();
                    return value.copy(defaultRedact, orderPriceRedact, tokenized_stocks != null ? ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks.ADAPTER.redact(tokenized_stocks) : null, ByteString.EMPTY);
                }
            };
        }

        /* compiled from: ValidateCryptoOrderRequest.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$Default;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Default extends Message {

            @JvmField
            public static final ProtoAdapter<Default> ADAPTER;

            /* JADX WARN: Multi-variable type inference failed */
            public Default() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27737newBuilder();
            }

            public /* synthetic */ Default(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27737newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof Default) && Intrinsics.areEqual(unknownFields(), ((Default) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                return "Default{}";
            }

            public final Default copy(ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Default(unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Default.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Default>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$ValidationSource$Default$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.ValidationSource.Default decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                reader.readUnknownField(iNextTag);
                            } else {
                                return new ValidateCryptoOrderRequest.ValidationSource.Default(reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderRequest.ValidationSource.Default value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.ValidationSource.Default value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.ValidationSource.Default value) {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.ValidationSource.Default redact(ValidateCryptoOrderRequest.ValidationSource.Default value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.copy(ByteString.EMPTY);
                    }
                };
            }
        }

        /* compiled from: ValidateCryptoOrderRequest.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$OrderPrice;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class OrderPrice extends Message {

            @JvmField
            public static final ProtoAdapter<OrderPrice> ADAPTER;

            /* JADX WARN: Multi-variable type inference failed */
            public OrderPrice() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27738newBuilder();
            }

            public /* synthetic */ OrderPrice(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderPrice(ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27738newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof OrderPrice) && Intrinsics.areEqual(unknownFields(), ((OrderPrice) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                return "OrderPrice{}";
            }

            public final OrderPrice copy(ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new OrderPrice(unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderPrice.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<OrderPrice>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$ValidationSource$OrderPrice$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.ValidationSource.OrderPrice decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                reader.readUnknownField(iNextTag);
                            } else {
                                return new ValidateCryptoOrderRequest.ValidationSource.OrderPrice(reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderRequest.ValidationSource.OrderPrice value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.ValidationSource.OrderPrice value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.ValidationSource.OrderPrice value) {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.ValidationSource.OrderPrice redact(ValidateCryptoOrderRequest.ValidationSource.OrderPrice value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.copy(ByteString.EMPTY);
                    }
                };
            }
        }

        /* compiled from: ValidateCryptoOrderRequest.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TokenizedStocks extends Message {

            @JvmField
            public static final ProtoAdapter<TokenizedStocks> ADAPTER;

            /* JADX WARN: Multi-variable type inference failed */
            public TokenizedStocks() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27739newBuilder();
            }

            public /* synthetic */ TokenizedStocks(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizedStocks(ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27739newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof TokenizedStocks) && Intrinsics.areEqual(unknownFields(), ((TokenizedStocks) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                return "TokenizedStocks{}";
            }

            public final TokenizedStocks copy(ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new TokenizedStocks(unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizedStocks.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TokenizedStocks>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                reader.readUnknownField(iNextTag);
                            } else {
                                return new ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks(reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks value) {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks redact(ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.copy(ByteString.EMPTY);
                    }
                };
            }
        }
    }
}
