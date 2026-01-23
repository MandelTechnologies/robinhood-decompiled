package bff_money_movement.service.p019v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import rosetta.order.OrderType;
import rosetta.order.Side;
import rosetta.order.TimeInForce;

/* compiled from: CryptoRequest.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010$\u001a\u00020\u0002H\u0017J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016Jt\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u0006-"}, m3636d2 = {"Lbff_money_movement/service/v1/CryptoRequest;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "is_quantity_collared", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "crypto_side", "Lrosetta/order/Side;", "crypto_time_in_force", "Lrosetta/order/TimeInForce;", "crypto_order_type", "Lrosetta/order/OrderType;", "nummus_account_id", "entered_amount", "fee_ratio", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lrosetta/order/Side;Lrosetta/order/TimeInForce;Lrosetta/order/OrderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "()Z", "getPrice", "getQuantity", "getCrypto_side", "()Lrosetta/order/Side;", "getCrypto_time_in_force", "()Lrosetta/order/TimeInForce;", "getCrypto_order_type", "()Lrosetta/order/OrderType;", "getNummus_account_id", "getEntered_amount", "getFee_ratio", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CryptoRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoRequest> ADAPTER;

    @WireField(adapter = "rosetta.order.OrderType#ADAPTER", jsonName = "cryptoOrderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final OrderType crypto_order_type;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", jsonName = "cryptoSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Side crypto_side;

    @WireField(adapter = "rosetta.order.TimeInForce#ADAPTER", jsonName = "cryptoTimeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final TimeInForce crypto_time_in_force;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "enteredAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String entered_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String fee_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isQuantityCollared", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_quantity_collared;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nummusAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String nummus_account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String quantity;

    public CryptoRequest() {
        this(null, false, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ CryptoRequest(String str, boolean z, String str2, String str3, Side side, TimeInForce timeInForce, OrderType orderType, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 32) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 64) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8406newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    /* renamed from: is_quantity_collared, reason: from getter */
    public final boolean getIs_quantity_collared() {
        return this.is_quantity_collared;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final Side getCrypto_side() {
        return this.crypto_side;
    }

    public final TimeInForce getCrypto_time_in_force() {
        return this.crypto_time_in_force;
    }

    public final OrderType getCrypto_order_type() {
        return this.crypto_order_type;
    }

    public final String getNummus_account_id() {
        return this.nummus_account_id;
    }

    public final String getEntered_amount() {
        return this.entered_amount;
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoRequest(String currency_pair_id, boolean z, String price, String quantity, Side crypto_side, TimeInForce crypto_time_in_force, OrderType crypto_order_type, String nummus_account_id, String entered_amount, String fee_ratio, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(crypto_side, "crypto_side");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_order_type, "crypto_order_type");
        Intrinsics.checkNotNullParameter(nummus_account_id, "nummus_account_id");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = currency_pair_id;
        this.is_quantity_collared = z;
        this.price = price;
        this.quantity = quantity;
        this.crypto_side = crypto_side;
        this.crypto_time_in_force = crypto_time_in_force;
        this.crypto_order_type = crypto_order_type;
        this.nummus_account_id = nummus_account_id;
        this.entered_amount = entered_amount;
        this.fee_ratio = fee_ratio;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8406newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoRequest)) {
            return false;
        }
        CryptoRequest cryptoRequest = (CryptoRequest) other;
        return Intrinsics.areEqual(unknownFields(), cryptoRequest.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, cryptoRequest.currency_pair_id) && this.is_quantity_collared == cryptoRequest.is_quantity_collared && Intrinsics.areEqual(this.price, cryptoRequest.price) && Intrinsics.areEqual(this.quantity, cryptoRequest.quantity) && this.crypto_side == cryptoRequest.crypto_side && this.crypto_time_in_force == cryptoRequest.crypto_time_in_force && this.crypto_order_type == cryptoRequest.crypto_order_type && Intrinsics.areEqual(this.nummus_account_id, cryptoRequest.nummus_account_id) && Intrinsics.areEqual(this.entered_amount, cryptoRequest.entered_amount) && Intrinsics.areEqual(this.fee_ratio, cryptoRequest.fee_ratio);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37) + Boolean.hashCode(this.is_quantity_collared)) * 37) + this.price.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.crypto_side.hashCode()) * 37) + this.crypto_time_in_force.hashCode()) * 37) + this.crypto_order_type.hashCode()) * 37) + this.nummus_account_id.hashCode()) * 37) + this.entered_amount.hashCode()) * 37) + this.fee_ratio.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        arrayList.add("is_quantity_collared=" + this.is_quantity_collared);
        arrayList.add("price=" + Internal.sanitize(this.price));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("crypto_side=" + this.crypto_side);
        arrayList.add("crypto_time_in_force=" + this.crypto_time_in_force);
        arrayList.add("crypto_order_type=" + this.crypto_order_type);
        arrayList.add("nummus_account_id=" + Internal.sanitize(this.nummus_account_id));
        arrayList.add("entered_amount=" + Internal.sanitize(this.entered_amount));
        arrayList.add("fee_ratio=" + Internal.sanitize(this.fee_ratio));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoRequest copy$default(CryptoRequest cryptoRequest, String str, boolean z, String str2, String str3, Side side, TimeInForce timeInForce, OrderType orderType, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoRequest.currency_pair_id;
        }
        if ((i & 2) != 0) {
            z = cryptoRequest.is_quantity_collared;
        }
        if ((i & 4) != 0) {
            str2 = cryptoRequest.price;
        }
        if ((i & 8) != 0) {
            str3 = cryptoRequest.quantity;
        }
        if ((i & 16) != 0) {
            side = cryptoRequest.crypto_side;
        }
        if ((i & 32) != 0) {
            timeInForce = cryptoRequest.crypto_time_in_force;
        }
        if ((i & 64) != 0) {
            orderType = cryptoRequest.crypto_order_type;
        }
        if ((i & 128) != 0) {
            str4 = cryptoRequest.nummus_account_id;
        }
        if ((i & 256) != 0) {
            str5 = cryptoRequest.entered_amount;
        }
        if ((i & 512) != 0) {
            str6 = cryptoRequest.fee_ratio;
        }
        if ((i & 1024) != 0) {
            byteString = cryptoRequest.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        TimeInForce timeInForce2 = timeInForce;
        OrderType orderType2 = orderType;
        Side side2 = side;
        String str10 = str2;
        return cryptoRequest.copy(str, z, str10, str3, side2, timeInForce2, orderType2, str8, str9, str7, byteString2);
    }

    public final CryptoRequest copy(String currency_pair_id, boolean is_quantity_collared, String price, String quantity, Side crypto_side, TimeInForce crypto_time_in_force, OrderType crypto_order_type, String nummus_account_id, String entered_amount, String fee_ratio, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(crypto_side, "crypto_side");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_order_type, "crypto_order_type");
        Intrinsics.checkNotNullParameter(nummus_account_id, "nummus_account_id");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoRequest(currency_pair_id, is_quantity_collared, price, quantity, crypto_side, crypto_time_in_force, crypto_order_type, nummus_account_id, entered_amount, fee_ratio, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.CryptoRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                }
                if (value.getIs_quantity_collared()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_quantity_collared()));
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getQuantity());
                }
                if (value.getCrypto_side() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(5, value.getCrypto_side());
                }
                if (value.getCrypto_time_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += TimeInForce.ADAPTER.encodedSizeWithTag(6, value.getCrypto_time_in_force());
                }
                if (value.getCrypto_order_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(7, value.getCrypto_order_type());
                }
                if (!Intrinsics.areEqual(value.getNummus_account_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getNummus_account_id());
                }
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getEntered_amount());
                }
                return !Intrinsics.areEqual(value.getFee_ratio(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(10, value.getFee_ratio()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }
                if (value.getIs_quantity_collared()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_quantity_collared()));
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (value.getCrypto_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 5, (int) value.getCrypto_side());
                }
                if (value.getCrypto_time_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 6, (int) value.getCrypto_time_in_force());
                }
                if (value.getCrypto_order_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 7, (int) value.getCrypto_order_type());
                }
                if (!Intrinsics.areEqual(value.getNummus_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getNummus_account_id());
                }
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEntered_amount());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getFee_ratio());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getFee_ratio());
                }
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEntered_amount());
                }
                if (!Intrinsics.areEqual(value.getNummus_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getNummus_account_id());
                }
                if (value.getCrypto_order_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 7, (int) value.getCrypto_order_type());
                }
                if (value.getCrypto_time_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 6, (int) value.getCrypto_time_in_force());
                }
                if (value.getCrypto_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 5, (int) value.getCrypto_side());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrice());
                }
                if (value.getIs_quantity_collared()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_quantity_collared()));
                }
                if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoRequest decode(ProtoReader reader) throws IOException {
                Side side;
                TimeInForce timeInForce;
                OrderType orderType;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side side2 = Side.SIDE_UNSPECIFIED;
                TimeInForce timeInForce2 = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                boolean zBooleanValue = false;
                OrderType orderTypeDecode = orderType2;
                String strDecode6 = strDecode5;
                TimeInForce timeInForceDecode = timeInForce2;
                Side sideDecode = side2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                timeInForce = timeInForceDecode;
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                timeInForceDecode = timeInForce;
                                break;
                            case 3:
                                timeInForce = timeInForceDecode;
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                timeInForceDecode = timeInForce;
                                break;
                            case 4:
                                timeInForce = timeInForceDecode;
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                timeInForceDecode = timeInForce;
                                break;
                            case 5:
                                side = sideDecode;
                                timeInForce = timeInForceDecode;
                                orderType = orderTypeDecode;
                                str = strDecode6;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                    strDecode6 = str;
                                    orderTypeDecode = orderType;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                timeInForceDecode = timeInForce;
                                break;
                            case 6:
                                side = sideDecode;
                                timeInForce = timeInForceDecode;
                                try {
                                    timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                    sideDecode = side;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    orderType = orderTypeDecode;
                                    str = strDecode6;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    side = sideDecode;
                                    timeInForce = timeInForceDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                side = sideDecode;
                                timeInForce = timeInForceDecode;
                                orderType = orderTypeDecode;
                                str = strDecode6;
                                strDecode6 = str;
                                orderTypeDecode = orderType;
                                sideDecode = side;
                                timeInForceDecode = timeInForce;
                                break;
                        }
                    } else {
                        return new CryptoRequest(strDecode6, zBooleanValue, strDecode, strDecode2, sideDecode, timeInForceDecode, orderTypeDecode, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoRequest redact(CryptoRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoRequest.copy$default(value, null, false, null, null, null, null, null, null, null, null, ByteString.EMPTY, 1023, null);
            }
        };
    }
}
