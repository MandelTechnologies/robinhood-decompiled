package nummus.p512v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
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
import rosetta.nummus.FeeType;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.Type;

/* compiled from: FeeEstimationRequest.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010%\u001a\u00020\u0002H\u0017J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0086\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006/"}, m3636d2 = {"Lnummus/v1/FeeEstimationRequest;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "side", "Lrosetta/nummus/order/Side;", "quantity", "order_type", "Lrosetta/nummus/order/Type;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "limit_price", "stop_price", "fee_type", "Lrosetta/nummus/FeeType;", "account_id", "currency_type", "Lnummus/v1/CurrencyType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrosetta/nummus/order/Side;Ljava/lang/String;Lrosetta/nummus/order/Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/FeeType;Ljava/lang/String;Lnummus/v1/CurrencyType;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getSide", "()Lrosetta/nummus/order/Side;", "getQuantity", "getOrder_type", "()Lrosetta/nummus/order/Type;", "getPrice", "getLimit_price", "getStop_price", "getFee_type", "()Lrosetta/nummus/FeeType;", "getAccount_id", "getCurrency_type", "()Lnummus/v1/CurrencyType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class FeeEstimationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<FeeEstimationRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 8, tag = 9)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    @WireField(adapter = "nummus.v1.CurrencyType#ADAPTER", jsonName = "currencyType", schemaIndex = 9, tag = 10)
    private final CurrencyType currency_type;

    @WireField(adapter = "rosetta.nummus.FeeType#ADAPTER", jsonName = "feeType", schemaIndex = 7, tag = 8)
    private final FeeType fee_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 5, tag = 6)
    private final String limit_price;

    @WireField(adapter = "rosetta.nummus.order.Type#ADAPTER", jsonName = "orderType", schemaIndex = 3, tag = 4)
    private final Type order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String quantity;

    @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", schemaIndex = 1, tag = 2)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 6, tag = 7)
    private final String stop_price;

    public FeeEstimationRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29415newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public /* synthetic */ FeeEstimationRequest(String str, Side side, String str2, Type type2, String str3, String str4, String str5, FeeType feeType, String str6, CurrencyType currencyType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : side, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : type2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : feeType, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : currencyType, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Side getSide() {
        return this.side;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final Type getOrder_type() {
        return this.order_type;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getLimit_price() {
        return this.limit_price;
    }

    public final String getStop_price() {
        return this.stop_price;
    }

    public final FeeType getFee_type() {
        return this.fee_type;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final CurrencyType getCurrency_type() {
        return this.currency_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeEstimationRequest(String currency_pair_id, Side side, String str, Type type2, String str2, String str3, String str4, FeeType feeType, String str5, CurrencyType currencyType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = currency_pair_id;
        this.side = side;
        this.quantity = str;
        this.order_type = type2;
        this.price = str2;
        this.limit_price = str3;
        this.stop_price = str4;
        this.fee_type = feeType;
        this.account_id = str5;
        this.currency_type = currencyType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29415newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeEstimationRequest)) {
            return false;
        }
        FeeEstimationRequest feeEstimationRequest = (FeeEstimationRequest) other;
        return Intrinsics.areEqual(unknownFields(), feeEstimationRequest.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, feeEstimationRequest.currency_pair_id) && this.side == feeEstimationRequest.side && Intrinsics.areEqual(this.quantity, feeEstimationRequest.quantity) && this.order_type == feeEstimationRequest.order_type && Intrinsics.areEqual(this.price, feeEstimationRequest.price) && Intrinsics.areEqual(this.limit_price, feeEstimationRequest.limit_price) && Intrinsics.areEqual(this.stop_price, feeEstimationRequest.stop_price) && this.fee_type == feeEstimationRequest.fee_type && Intrinsics.areEqual(this.account_id, feeEstimationRequest.account_id) && this.currency_type == feeEstimationRequest.currency_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37;
        Side side = this.side;
        int iHashCode2 = (iHashCode + (side != null ? side.hashCode() : 0)) * 37;
        String str = this.quantity;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Type type2 = this.order_type;
        int iHashCode4 = (iHashCode3 + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str2 = this.price;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.limit_price;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.stop_price;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        FeeType feeType = this.fee_type;
        int iHashCode8 = (iHashCode7 + (feeType != null ? feeType.hashCode() : 0)) * 37;
        String str5 = this.account_id;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        CurrencyType currencyType = this.currency_type;
        int iHashCode10 = iHashCode9 + (currencyType != null ? currencyType.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        Side side = this.side;
        if (side != null) {
            arrayList.add("side=" + side);
        }
        String str = this.quantity;
        if (str != null) {
            arrayList.add("quantity=" + Internal.sanitize(str));
        }
        Type type2 = this.order_type;
        if (type2 != null) {
            arrayList.add("order_type=" + type2);
        }
        String str2 = this.price;
        if (str2 != null) {
            arrayList.add("price=" + Internal.sanitize(str2));
        }
        String str3 = this.limit_price;
        if (str3 != null) {
            arrayList.add("limit_price=" + Internal.sanitize(str3));
        }
        String str4 = this.stop_price;
        if (str4 != null) {
            arrayList.add("stop_price=" + Internal.sanitize(str4));
        }
        FeeType feeType = this.fee_type;
        if (feeType != null) {
            arrayList.add("fee_type=" + feeType);
        }
        String str5 = this.account_id;
        if (str5 != null) {
            arrayList.add("account_id=" + Internal.sanitize(str5));
        }
        CurrencyType currencyType = this.currency_type;
        if (currencyType != null) {
            arrayList.add("currency_type=" + currencyType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeEstimationRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeEstimationRequest copy$default(FeeEstimationRequest feeEstimationRequest, String str, Side side, String str2, Type type2, String str3, String str4, String str5, FeeType feeType, String str6, CurrencyType currencyType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeEstimationRequest.currency_pair_id;
        }
        if ((i & 2) != 0) {
            side = feeEstimationRequest.side;
        }
        if ((i & 4) != 0) {
            str2 = feeEstimationRequest.quantity;
        }
        if ((i & 8) != 0) {
            type2 = feeEstimationRequest.order_type;
        }
        if ((i & 16) != 0) {
            str3 = feeEstimationRequest.price;
        }
        if ((i & 32) != 0) {
            str4 = feeEstimationRequest.limit_price;
        }
        if ((i & 64) != 0) {
            str5 = feeEstimationRequest.stop_price;
        }
        if ((i & 128) != 0) {
            feeType = feeEstimationRequest.fee_type;
        }
        if ((i & 256) != 0) {
            str6 = feeEstimationRequest.account_id;
        }
        if ((i & 512) != 0) {
            currencyType = feeEstimationRequest.currency_type;
        }
        if ((i & 1024) != 0) {
            byteString = feeEstimationRequest.unknownFields();
        }
        CurrencyType currencyType2 = currencyType;
        ByteString byteString2 = byteString;
        FeeType feeType2 = feeType;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        String str11 = str2;
        return feeEstimationRequest.copy(str, side, str11, type2, str10, str8, str9, feeType2, str7, currencyType2, byteString2);
    }

    public final FeeEstimationRequest copy(String currency_pair_id, Side side, String quantity, Type order_type, String price, String limit_price, String stop_price, FeeType fee_type, String account_id, CurrencyType currency_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeEstimationRequest(currency_pair_id, side, quantity, order_type, price, limit_price, stop_price, fee_type, account_id, currency_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeEstimationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeEstimationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.FeeEstimationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeEstimationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                }
                int iEncodedSizeWithTag = size + Side.ADAPTER.encodedSizeWithTag(2, value.getSide());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getQuantity()) + Type.ADAPTER.encodedSizeWithTag(4, value.getOrder_type()) + protoAdapter.encodedSizeWithTag(5, value.getPrice()) + protoAdapter.encodedSizeWithTag(6, value.getLimit_price()) + protoAdapter.encodedSizeWithTag(7, value.getStop_price()) + FeeType.ADAPTER.encodedSizeWithTag(8, value.getFee_type()) + protoAdapter.encodedSizeWithTag(9, value.getAccount_id()) + CurrencyType.ADAPTER.encodedSizeWithTag(10, value.getCurrency_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeEstimationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }
                Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getSide());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getQuantity());
                Type.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_type());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getPrice());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getStop_price());
                FeeType.ADAPTER.encodeWithTag(writer, 8, (int) value.getFee_type());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getAccount_id());
                CurrencyType.ADAPTER.encodeWithTag(writer, 10, (int) value.getCurrency_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeEstimationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CurrencyType.ADAPTER.encodeWithTag(writer, 10, (int) value.getCurrency_type());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getAccount_id());
                FeeType.ADAPTER.encodeWithTag(writer, 8, (int) value.getFee_type());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getPrice());
                Type.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_type());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getQuantity());
                Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getSide());
                if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeEstimationRequest redact(FeeEstimationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FeeEstimationRequest.copy$default(value, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 1023, null);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public nummus.p512v1.FeeEstimationRequest decode(com.squareup.wire.ProtoReader r27) {
                /*
                    Method dump skipped, instructions count: 316
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: nummus.p512v1.FeeEstimationRequest2.decode(com.squareup.wire.ProtoReader):nummus.v1.FeeEstimationRequest");
            }
        };
    }
}
