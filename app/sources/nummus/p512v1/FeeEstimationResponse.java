package nummus.p512v1;

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
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import rosetta.nummus.FeeStructure;
import rosetta.nummus.FeeType;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.Type;

/* compiled from: FeeEstimationResponse.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J¼\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001c¨\u00069"}, m3636d2 = {"Lnummus/v1/FeeEstimationResponse;", "Lcom/squareup/wire/Message;", "", "fee_ratio", "", "min_fee_amount", "currency_pair_id", "side", "Lrosetta/nummus/order/Side;", "quantity", "order_type", "Lrosetta/nummus/order/Type;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "limit_price", "stop_price", "fee_type", "Lrosetta/nummus/FeeType;", "fee_structure", "Lrosetta/nummus/FeeStructure;", "estimated_fee_amount", "exchange_fee_ratio", "robinhood_fee_ratio", "account_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/order/Side;Ljava/lang/String;Lrosetta/nummus/order/Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/FeeType;Lrosetta/nummus/FeeStructure;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getFee_ratio", "()Ljava/lang/String;", "getMin_fee_amount", "getCurrency_pair_id", "getSide", "()Lrosetta/nummus/order/Side;", "getQuantity", "getOrder_type", "()Lrosetta/nummus/order/Type;", "getPrice", "getLimit_price", "getStop_price", "getFee_type", "()Lrosetta/nummus/FeeType;", "getFee_structure", "()Lrosetta/nummus/FeeStructure;", "getEstimated_fee_amount", "getExchange_fee_ratio", "getRobinhood_fee_ratio", "getAccount_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class FeeEstimationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<FeeEstimationResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 14, tag = 15)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", schemaIndex = 2, tag = 3)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedFeeAmount", schemaIndex = 11, tag = 12)
    private final String estimated_fee_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeFeeRatio", schemaIndex = 12, tag = 13)
    private final String exchange_fee_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String fee_ratio;

    @WireField(adapter = "rosetta.nummus.FeeStructure#ADAPTER", jsonName = "feeStructure", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final FeeStructure fee_structure;

    @WireField(adapter = "rosetta.nummus.FeeType#ADAPTER", jsonName = "feeType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final FeeType fee_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 7, tag = 8)
    private final String limit_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minFeeAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String min_fee_amount;

    @WireField(adapter = "rosetta.nummus.order.Type#ADAPTER", jsonName = "orderType", schemaIndex = 5, tag = 6)
    private final Type order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "robinhoodFeeRatio", schemaIndex = 13, tag = 14)
    private final String robinhood_fee_ratio;

    @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", schemaIndex = 3, tag = 4)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 8, tag = 9)
    private final String stop_price;

    public FeeEstimationResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    public /* synthetic */ FeeEstimationResponse(String str, String str2, String str3, Side side, String str4, Type type2, String str5, String str6, String str7, FeeType feeType, FeeStructure feeStructure, String str8, String str9, String str10, String str11, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : side, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : type2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? FeeType.FEE_TYPE_UNSPECIFIED : feeType, (i & 1024) != 0 ? FeeStructure.FEE_STRUCTURE_UNSPECIFIED : feeStructure, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29416newBuilder();
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    public final String getMin_fee_amount() {
        return this.min_fee_amount;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
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

    public final FeeStructure getFee_structure() {
        return this.fee_structure;
    }

    public final String getEstimated_fee_amount() {
        return this.estimated_fee_amount;
    }

    public final String getExchange_fee_ratio() {
        return this.exchange_fee_ratio;
    }

    public final String getRobinhood_fee_ratio() {
        return this.robinhood_fee_ratio;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeEstimationResponse(String fee_ratio, String min_fee_amount, String str, Side side, String str2, Type type2, String str3, String str4, String str5, FeeType fee_type, FeeStructure fee_structure, String str6, String str7, String str8, String str9, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(min_fee_amount, "min_fee_amount");
        Intrinsics.checkNotNullParameter(fee_type, "fee_type");
        Intrinsics.checkNotNullParameter(fee_structure, "fee_structure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fee_ratio = fee_ratio;
        this.min_fee_amount = min_fee_amount;
        this.currency_pair_id = str;
        this.side = side;
        this.quantity = str2;
        this.order_type = type2;
        this.price = str3;
        this.limit_price = str4;
        this.stop_price = str5;
        this.fee_type = fee_type;
        this.fee_structure = fee_structure;
        this.estimated_fee_amount = str6;
        this.exchange_fee_ratio = str7;
        this.robinhood_fee_ratio = str8;
        this.account_id = str9;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29416newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeEstimationResponse)) {
            return false;
        }
        FeeEstimationResponse feeEstimationResponse = (FeeEstimationResponse) other;
        return Intrinsics.areEqual(unknownFields(), feeEstimationResponse.unknownFields()) && Intrinsics.areEqual(this.fee_ratio, feeEstimationResponse.fee_ratio) && Intrinsics.areEqual(this.min_fee_amount, feeEstimationResponse.min_fee_amount) && Intrinsics.areEqual(this.currency_pair_id, feeEstimationResponse.currency_pair_id) && this.side == feeEstimationResponse.side && Intrinsics.areEqual(this.quantity, feeEstimationResponse.quantity) && this.order_type == feeEstimationResponse.order_type && Intrinsics.areEqual(this.price, feeEstimationResponse.price) && Intrinsics.areEqual(this.limit_price, feeEstimationResponse.limit_price) && Intrinsics.areEqual(this.stop_price, feeEstimationResponse.stop_price) && this.fee_type == feeEstimationResponse.fee_type && this.fee_structure == feeEstimationResponse.fee_structure && Intrinsics.areEqual(this.estimated_fee_amount, feeEstimationResponse.estimated_fee_amount) && Intrinsics.areEqual(this.exchange_fee_ratio, feeEstimationResponse.exchange_fee_ratio) && Intrinsics.areEqual(this.robinhood_fee_ratio, feeEstimationResponse.robinhood_fee_ratio) && Intrinsics.areEqual(this.account_id, feeEstimationResponse.account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.fee_ratio.hashCode()) * 37) + this.min_fee_amount.hashCode()) * 37;
        String str = this.currency_pair_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Side side = this.side;
        int iHashCode3 = (iHashCode2 + (side != null ? side.hashCode() : 0)) * 37;
        String str2 = this.quantity;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Type type2 = this.order_type;
        int iHashCode5 = (iHashCode4 + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str3 = this.price;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.limit_price;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.stop_price;
        int iHashCode8 = (((((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37) + this.fee_type.hashCode()) * 37) + this.fee_structure.hashCode()) * 37;
        String str6 = this.estimated_fee_amount;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.exchange_fee_ratio;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.robinhood_fee_ratio;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.account_id;
        int iHashCode12 = iHashCode11 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("fee_ratio=" + Internal.sanitize(this.fee_ratio));
        arrayList.add("min_fee_amount=" + Internal.sanitize(this.min_fee_amount));
        String str = this.currency_pair_id;
        if (str != null) {
            arrayList.add("currency_pair_id=" + Internal.sanitize(str));
        }
        Side side = this.side;
        if (side != null) {
            arrayList.add("side=" + side);
        }
        String str2 = this.quantity;
        if (str2 != null) {
            arrayList.add("quantity=" + Internal.sanitize(str2));
        }
        Type type2 = this.order_type;
        if (type2 != null) {
            arrayList.add("order_type=" + type2);
        }
        String str3 = this.price;
        if (str3 != null) {
            arrayList.add("price=" + Internal.sanitize(str3));
        }
        String str4 = this.limit_price;
        if (str4 != null) {
            arrayList.add("limit_price=" + Internal.sanitize(str4));
        }
        String str5 = this.stop_price;
        if (str5 != null) {
            arrayList.add("stop_price=" + Internal.sanitize(str5));
        }
        arrayList.add("fee_type=" + this.fee_type);
        arrayList.add("fee_structure=" + this.fee_structure);
        String str6 = this.estimated_fee_amount;
        if (str6 != null) {
            arrayList.add("estimated_fee_amount=" + Internal.sanitize(str6));
        }
        String str7 = this.exchange_fee_ratio;
        if (str7 != null) {
            arrayList.add("exchange_fee_ratio=" + Internal.sanitize(str7));
        }
        String str8 = this.robinhood_fee_ratio;
        if (str8 != null) {
            arrayList.add("robinhood_fee_ratio=" + Internal.sanitize(str8));
        }
        String str9 = this.account_id;
        if (str9 != null) {
            arrayList.add("account_id=" + Internal.sanitize(str9));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeEstimationResponse{", "}", 0, null, null, 56, null);
    }

    public final FeeEstimationResponse copy(String fee_ratio, String min_fee_amount, String currency_pair_id, Side side, String quantity, Type order_type, String price, String limit_price, String stop_price, FeeType fee_type, FeeStructure fee_structure, String estimated_fee_amount, String exchange_fee_ratio, String robinhood_fee_ratio, String account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(min_fee_amount, "min_fee_amount");
        Intrinsics.checkNotNullParameter(fee_type, "fee_type");
        Intrinsics.checkNotNullParameter(fee_structure, "fee_structure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeEstimationResponse(fee_ratio, min_fee_amount, currency_pair_id, side, quantity, order_type, price, limit_price, stop_price, fee_type, fee_structure, estimated_fee_amount, exchange_fee_ratio, robinhood_fee_ratio, account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeEstimationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeEstimationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.FeeEstimationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeEstimationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFee_ratio());
                }
                if (!Intrinsics.areEqual(value.getMin_fee_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMin_fee_amount());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getCurrency_pair_id()) + Side.ADAPTER.encodedSizeWithTag(4, value.getSide()) + protoAdapter.encodedSizeWithTag(5, value.getQuantity()) + Type.ADAPTER.encodedSizeWithTag(6, value.getOrder_type()) + protoAdapter.encodedSizeWithTag(7, value.getPrice()) + protoAdapter.encodedSizeWithTag(8, value.getLimit_price()) + protoAdapter.encodedSizeWithTag(9, value.getStop_price());
                if (value.getFee_type() != FeeType.FEE_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += FeeType.ADAPTER.encodedSizeWithTag(10, value.getFee_type());
                }
                if (value.getFee_structure() != FeeStructure.FEE_STRUCTURE_UNSPECIFIED) {
                    iEncodedSizeWithTag += FeeStructure.ADAPTER.encodedSizeWithTag(11, value.getFee_structure());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(12, value.getEstimated_fee_amount()) + protoAdapter.encodedSizeWithTag(13, value.getExchange_fee_ratio()) + protoAdapter.encodedSizeWithTag(14, value.getRobinhood_fee_ratio()) + protoAdapter.encodedSizeWithTag(15, value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeEstimationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFee_ratio());
                }
                if (!Intrinsics.areEqual(value.getMin_fee_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMin_fee_amount());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                Side.ADAPTER.encodeWithTag(writer, 4, (int) value.getSide());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                Type.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_type());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getPrice());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getStop_price());
                if (value.getFee_type() != FeeType.FEE_TYPE_UNSPECIFIED) {
                    FeeType.ADAPTER.encodeWithTag(writer, 10, (int) value.getFee_type());
                }
                if (value.getFee_structure() != FeeStructure.FEE_STRUCTURE_UNSPECIFIED) {
                    FeeStructure.ADAPTER.encodeWithTag(writer, 11, (int) value.getFee_structure());
                }
                protoAdapter.encodeWithTag(writer, 12, (int) value.getEstimated_fee_amount());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getExchange_fee_ratio());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getRobinhood_fee_ratio());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getAccount_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeEstimationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 15, (int) value.getAccount_id());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getRobinhood_fee_ratio());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getExchange_fee_ratio());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getEstimated_fee_amount());
                if (value.getFee_structure() != FeeStructure.FEE_STRUCTURE_UNSPECIFIED) {
                    FeeStructure.ADAPTER.encodeWithTag(writer, 11, (int) value.getFee_structure());
                }
                if (value.getFee_type() != FeeType.FEE_TYPE_UNSPECIFIED) {
                    FeeType.ADAPTER.encodeWithTag(writer, 10, (int) value.getFee_type());
                }
                protoAdapter.encodeWithTag(writer, 9, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getPrice());
                Type.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_type());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                Side.ADAPTER.encodeWithTag(writer, 4, (int) value.getSide());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                if (!Intrinsics.areEqual(value.getMin_fee_amount(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getMin_fee_amount());
                }
                if (Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getFee_ratio());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeEstimationResponse decode(ProtoReader reader) throws IOException {
                FeeStructure feeStructure;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                FeeType feeType = FeeType.FEE_TYPE_UNSPECIFIED;
                FeeStructure feeStructure2 = FeeStructure.FEE_STRUCTURE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FeeType feeTypeDecode = feeType;
                String strDecode = "";
                String strDecode2 = null;
                Side sideDecode = null;
                String strDecode3 = null;
                Type typeDecode = null;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = null;
                String strDecode9 = null;
                String strDecode10 = null;
                FeeStructure feeStructureDecode = feeStructure2;
                String strDecode11 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                feeStructure = feeStructureDecode;
                                str = strDecode11;
                                str2 = strDecode;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                feeStructure = feeStructureDecode;
                                str = strDecode11;
                                str2 = strDecode;
                                try {
                                    typeDecode = Type.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                feeStructure = feeStructureDecode;
                                str = strDecode11;
                                str2 = strDecode;
                                try {
                                    feeTypeDecode = FeeType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 11:
                                try {
                                    feeStructureDecode = FeeStructure.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    feeStructure = feeStructureDecode;
                                    str = strDecode11;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 12:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                feeStructure = feeStructureDecode;
                                str = strDecode11;
                                str2 = strDecode;
                                break;
                        }
                        feeStructureDecode = feeStructure;
                        strDecode11 = str;
                        strDecode = str2;
                    } else {
                        return new FeeEstimationResponse(strDecode11, strDecode, strDecode2, sideDecode, strDecode3, typeDecode, strDecode4, strDecode5, strDecode6, feeTypeDecode, feeStructureDecode, strDecode7, strDecode8, strDecode9, strDecode10, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeEstimationResponse redact(FeeEstimationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((32767 & 1) != 0 ? value.fee_ratio : null, (32767 & 2) != 0 ? value.min_fee_amount : null, (32767 & 4) != 0 ? value.currency_pair_id : null, (32767 & 8) != 0 ? value.side : null, (32767 & 16) != 0 ? value.quantity : null, (32767 & 32) != 0 ? value.order_type : null, (32767 & 64) != 0 ? value.price : null, (32767 & 128) != 0 ? value.limit_price : null, (32767 & 256) != 0 ? value.stop_price : null, (32767 & 512) != 0 ? value.fee_type : null, (32767 & 1024) != 0 ? value.fee_structure : null, (32767 & 2048) != 0 ? value.estimated_fee_amount : null, (32767 & 4096) != 0 ? value.exchange_fee_ratio : null, (32767 & 8192) != 0 ? value.robinhood_fee_ratio : null, (32767 & 16384) != 0 ? value.account_id : null, (32767 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
