package crypto_perpetuals.order.p438v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.MarginRequired;
import crypto_perpetuals.common.p435v1.MarginRequiredDto;
import crypto_perpetuals.order.p438v1.OrderFeesDto;
import crypto_perpetuals.order.p438v1.OrderPriceDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: OrderQuoteDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0011\u0010\u0010\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderQuoteDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/order/v1/OrderQuote;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/order/v1/OrderQuoteDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/order/v1/OrderQuoteDto$Surrogate;)V", "", "quote_currency_id", "Lcom/robinhood/idl/IdlDecimal;", BidAskDetails3.ASK_PRICE, BidAskDetails3.BID_PRICE, "Lcrypto_perpetuals/order/v1/OrderPriceDto;", "estimated_order_price", "estimated_contract_quantity", "estimated_notional_amount", "Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "estimated_margin_required", "estimated_liquidation_price", "Lcrypto_perpetuals/order/v1/OrderFeesDto;", "estimated_fees", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/OrderPriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MarginRequiredDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/OrderFeesDto;)V", "toProto", "()Lcrypto_perpetuals/order/v1/OrderQuote;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/order/v1/OrderQuoteDto$Surrogate;", "getAsk_price", "()Lcom/robinhood/idl/IdlDecimal;", "getBid_price", "getEstimated_order_price", "()Lcrypto_perpetuals/order/v1/OrderPriceDto;", "getEstimated_contract_quantity", "getEstimated_notional_amount", "getEstimated_margin_required", "()Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "getEstimated_liquidation_price", "getEstimated_fees", "()Lcrypto_perpetuals/order/v1/OrderFeesDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class OrderQuoteDto implements Dto3<OrderQuote>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderQuoteDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderQuoteDto, OrderQuote>> binaryBase64Serializer$delegate;
    private static final OrderQuoteDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderQuoteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderQuoteDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final IdlDecimal getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final OrderPriceDto getEstimated_order_price() {
        return this.surrogate.getEstimated_order_price();
    }

    public final IdlDecimal getEstimated_contract_quantity() {
        return this.surrogate.getEstimated_contract_quantity();
    }

    public final IdlDecimal getEstimated_notional_amount() {
        return this.surrogate.getEstimated_notional_amount();
    }

    public final MarginRequiredDto getEstimated_margin_required() {
        return this.surrogate.getEstimated_margin_required();
    }

    public final IdlDecimal getEstimated_liquidation_price() {
        return this.surrogate.getEstimated_liquidation_price();
    }

    public final OrderFeesDto getEstimated_fees() {
        return this.surrogate.getEstimated_fees();
    }

    public /* synthetic */ OrderQuoteDto(String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderPriceDto orderPriceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, MarginRequiredDto marginRequiredDto, IdlDecimal idlDecimal5, OrderFeesDto orderFeesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 8) != 0 ? null : orderPriceDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 64) != 0 ? null : marginRequiredDto, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal5, (i & 256) != 0 ? null : orderFeesDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderQuoteDto(String quote_currency_id, IdlDecimal ask_price, IdlDecimal bid_price, OrderPriceDto orderPriceDto, IdlDecimal estimated_contract_quantity, IdlDecimal estimated_notional_amount, MarginRequiredDto marginRequiredDto, IdlDecimal estimated_liquidation_price, OrderFeesDto orderFeesDto) {
        this(new Surrogate(quote_currency_id, ask_price, bid_price, orderPriceDto, estimated_contract_quantity, estimated_notional_amount, marginRequiredDto, estimated_liquidation_price, orderFeesDto));
        Intrinsics.checkNotNullParameter(quote_currency_id, "quote_currency_id");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(estimated_contract_quantity, "estimated_contract_quantity");
        Intrinsics.checkNotNullParameter(estimated_notional_amount, "estimated_notional_amount");
        Intrinsics.checkNotNullParameter(estimated_liquidation_price, "estimated_liquidation_price");
    }

    @Override // com.robinhood.idl.Dto
    public OrderQuote toProto() {
        String quote_currency_id = this.surrogate.getQuote_currency_id();
        String stringValue = this.surrogate.getAsk_price().getStringValue();
        String stringValue2 = this.surrogate.getBid_price().getStringValue();
        OrderPriceDto estimated_order_price = this.surrogate.getEstimated_order_price();
        OrderPrice proto = estimated_order_price != null ? estimated_order_price.toProto() : null;
        String stringValue3 = this.surrogate.getEstimated_contract_quantity().getStringValue();
        String stringValue4 = this.surrogate.getEstimated_notional_amount().getStringValue();
        MarginRequiredDto estimated_margin_required = this.surrogate.getEstimated_margin_required();
        MarginRequired proto2 = estimated_margin_required != null ? estimated_margin_required.toProto() : null;
        String stringValue5 = this.surrogate.getEstimated_liquidation_price().getStringValue();
        OrderFeesDto estimated_fees = this.surrogate.getEstimated_fees();
        return new OrderQuote(quote_currency_id, stringValue, stringValue2, proto, stringValue3, stringValue4, proto2, stringValue5, estimated_fees != null ? estimated_fees.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[OrderQuoteDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderQuoteDto) && Intrinsics.areEqual(((OrderQuoteDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OrderQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002HGB²\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bu\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R/\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b4\u0010.\u001a\u0004\b3\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u0010.\u001a\u0004\b6\u00107R/\u0010\f\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010/\u0012\u0004\b:\u0010.\u001a\u0004\b9\u00101R/\u0010\r\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010/\u0012\u0004\b<\u0010.\u001a\u0004\b;\u00101R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R/\u0010\u0010\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010/\u0012\u0004\bB\u0010.\u001a\u0004\bA\u00101R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010C\u0012\u0004\bF\u0010.\u001a\u0004\bD\u0010E¨\u0006I"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderQuoteDto$Surrogate;", "", "", "quote_currency_id", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", BidAskDetails3.ASK_PRICE, BidAskDetails3.BID_PRICE, "Lcrypto_perpetuals/order/v1/OrderPriceDto;", "estimated_order_price", "estimated_contract_quantity", "estimated_notional_amount", "Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "estimated_margin_required", "estimated_liquidation_price", "Lcrypto_perpetuals/order/v1/OrderFeesDto;", "estimated_fees", "<init>", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/OrderPriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MarginRequiredDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/OrderFeesDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/OrderPriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MarginRequiredDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/OrderFeesDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_order_v1_externalRelease", "(Lcrypto_perpetuals/order/v1/OrderQuoteDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuote_currency_id", "getQuote_currency_id$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getAsk_price", "()Lcom/robinhood/idl/IdlDecimal;", "getAsk_price$annotations", "getBid_price", "getBid_price$annotations", "Lcrypto_perpetuals/order/v1/OrderPriceDto;", "getEstimated_order_price", "()Lcrypto_perpetuals/order/v1/OrderPriceDto;", "getEstimated_order_price$annotations", "getEstimated_contract_quantity", "getEstimated_contract_quantity$annotations", "getEstimated_notional_amount", "getEstimated_notional_amount$annotations", "Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "getEstimated_margin_required", "()Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "getEstimated_margin_required$annotations", "getEstimated_liquidation_price", "getEstimated_liquidation_price$annotations", "Lcrypto_perpetuals/order/v1/OrderFeesDto;", "getEstimated_fees", "()Lcrypto_perpetuals/order/v1/OrderFeesDto;", "getEstimated_fees$annotations", "Companion", "$serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal ask_price;
        private final IdlDecimal bid_price;
        private final IdlDecimal estimated_contract_quantity;
        private final OrderFeesDto estimated_fees;
        private final IdlDecimal estimated_liquidation_price;
        private final MarginRequiredDto estimated_margin_required;
        private final IdlDecimal estimated_notional_amount;
        private final OrderPriceDto estimated_order_price;
        private final String quote_currency_id;

        public Surrogate() {
            this((String) null, (IdlDecimal) null, (IdlDecimal) null, (OrderPriceDto) null, (IdlDecimal) null, (IdlDecimal) null, (MarginRequiredDto) null, (IdlDecimal) null, (OrderFeesDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.quote_currency_id, surrogate.quote_currency_id) && Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.estimated_order_price, surrogate.estimated_order_price) && Intrinsics.areEqual(this.estimated_contract_quantity, surrogate.estimated_contract_quantity) && Intrinsics.areEqual(this.estimated_notional_amount, surrogate.estimated_notional_amount) && Intrinsics.areEqual(this.estimated_margin_required, surrogate.estimated_margin_required) && Intrinsics.areEqual(this.estimated_liquidation_price, surrogate.estimated_liquidation_price) && Intrinsics.areEqual(this.estimated_fees, surrogate.estimated_fees);
        }

        public int hashCode() {
            int iHashCode = ((((this.quote_currency_id.hashCode() * 31) + this.ask_price.hashCode()) * 31) + this.bid_price.hashCode()) * 31;
            OrderPriceDto orderPriceDto = this.estimated_order_price;
            int iHashCode2 = (((((iHashCode + (orderPriceDto == null ? 0 : orderPriceDto.hashCode())) * 31) + this.estimated_contract_quantity.hashCode()) * 31) + this.estimated_notional_amount.hashCode()) * 31;
            MarginRequiredDto marginRequiredDto = this.estimated_margin_required;
            int iHashCode3 = (((iHashCode2 + (marginRequiredDto == null ? 0 : marginRequiredDto.hashCode())) * 31) + this.estimated_liquidation_price.hashCode()) * 31;
            OrderFeesDto orderFeesDto = this.estimated_fees;
            return iHashCode3 + (orderFeesDto != null ? orderFeesDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(quote_currency_id=" + this.quote_currency_id + ", ask_price=" + this.ask_price + ", bid_price=" + this.bid_price + ", estimated_order_price=" + this.estimated_order_price + ", estimated_contract_quantity=" + this.estimated_contract_quantity + ", estimated_notional_amount=" + this.estimated_notional_amount + ", estimated_margin_required=" + this.estimated_margin_required + ", estimated_liquidation_price=" + this.estimated_liquidation_price + ", estimated_fees=" + this.estimated_fees + ")";
        }

        /* compiled from: OrderQuoteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderQuoteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/OrderQuoteDto$Surrogate;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderQuoteDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderPriceDto orderPriceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, MarginRequiredDto marginRequiredDto, IdlDecimal idlDecimal5, OrderFeesDto orderFeesDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.quote_currency_id = "";
            } else {
                this.quote_currency_id = str;
            }
            if ((i & 2) == 0) {
                this.ask_price = new IdlDecimal("");
            } else {
                this.ask_price = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.bid_price = new IdlDecimal("");
            } else {
                this.bid_price = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.estimated_order_price = null;
            } else {
                this.estimated_order_price = orderPriceDto;
            }
            if ((i & 16) == 0) {
                this.estimated_contract_quantity = new IdlDecimal("");
            } else {
                this.estimated_contract_quantity = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.estimated_notional_amount = new IdlDecimal("");
            } else {
                this.estimated_notional_amount = idlDecimal4;
            }
            if ((i & 64) == 0) {
                this.estimated_margin_required = null;
            } else {
                this.estimated_margin_required = marginRequiredDto;
            }
            if ((i & 128) == 0) {
                this.estimated_liquidation_price = new IdlDecimal("");
            } else {
                this.estimated_liquidation_price = idlDecimal5;
            }
            if ((i & 256) == 0) {
                this.estimated_fees = null;
            } else {
                this.estimated_fees = orderFeesDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_order_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.quote_currency_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.quote_currency_id);
            }
            if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.ask_price);
            }
            if (!Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.bid_price);
            }
            OrderPriceDto orderPriceDto = self.estimated_order_price;
            if (orderPriceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, OrderPriceDto.Serializer.INSTANCE, orderPriceDto);
            }
            if (!Intrinsics.areEqual(self.estimated_contract_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.estimated_contract_quantity);
            }
            if (!Intrinsics.areEqual(self.estimated_notional_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.estimated_notional_amount);
            }
            MarginRequiredDto marginRequiredDto = self.estimated_margin_required;
            if (marginRequiredDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MarginRequiredDto.Serializer.INSTANCE, marginRequiredDto);
            }
            if (!Intrinsics.areEqual(self.estimated_liquidation_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.estimated_liquidation_price);
            }
            OrderFeesDto orderFeesDto = self.estimated_fees;
            if (orderFeesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, OrderFeesDto.Serializer.INSTANCE, orderFeesDto);
            }
        }

        public Surrogate(String quote_currency_id, IdlDecimal ask_price, IdlDecimal bid_price, OrderPriceDto orderPriceDto, IdlDecimal estimated_contract_quantity, IdlDecimal estimated_notional_amount, MarginRequiredDto marginRequiredDto, IdlDecimal estimated_liquidation_price, OrderFeesDto orderFeesDto) {
            Intrinsics.checkNotNullParameter(quote_currency_id, "quote_currency_id");
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(estimated_contract_quantity, "estimated_contract_quantity");
            Intrinsics.checkNotNullParameter(estimated_notional_amount, "estimated_notional_amount");
            Intrinsics.checkNotNullParameter(estimated_liquidation_price, "estimated_liquidation_price");
            this.quote_currency_id = quote_currency_id;
            this.ask_price = ask_price;
            this.bid_price = bid_price;
            this.estimated_order_price = orderPriceDto;
            this.estimated_contract_quantity = estimated_contract_quantity;
            this.estimated_notional_amount = estimated_notional_amount;
            this.estimated_margin_required = marginRequiredDto;
            this.estimated_liquidation_price = estimated_liquidation_price;
            this.estimated_fees = orderFeesDto;
        }

        public /* synthetic */ Surrogate(String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderPriceDto orderPriceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, MarginRequiredDto marginRequiredDto, IdlDecimal idlDecimal5, OrderFeesDto orderFeesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 8) != 0 ? null : orderPriceDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 64) != 0 ? null : marginRequiredDto, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal5, (i & 256) != 0 ? null : orderFeesDto);
        }

        public final String getQuote_currency_id() {
            return this.quote_currency_id;
        }

        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        public final OrderPriceDto getEstimated_order_price() {
            return this.estimated_order_price;
        }

        public final IdlDecimal getEstimated_contract_quantity() {
            return this.estimated_contract_quantity;
        }

        public final IdlDecimal getEstimated_notional_amount() {
            return this.estimated_notional_amount;
        }

        public final MarginRequiredDto getEstimated_margin_required() {
            return this.estimated_margin_required;
        }

        public final IdlDecimal getEstimated_liquidation_price() {
            return this.estimated_liquidation_price;
        }

        public final OrderFeesDto getEstimated_fees() {
            return this.estimated_fees;
        }
    }

    /* compiled from: OrderQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderQuoteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/order/v1/OrderQuoteDto;", "Lcrypto_perpetuals/order/v1/OrderQuote;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/order/v1/OrderQuoteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderQuoteDto, OrderQuote> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderQuoteDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderQuoteDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderQuoteDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderQuoteDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderQuote> getProtoAdapter() {
            return OrderQuote.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderQuoteDto getZeroValue() {
            return OrderQuoteDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderQuoteDto fromProto(OrderQuote proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String quote_currency_id = proto.getQuote_currency_id();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getAsk_price());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getBid_price());
            OrderPrice estimated_order_price = proto.getEstimated_order_price();
            DefaultConstructorMarker defaultConstructorMarker = null;
            OrderPriceDto orderPriceDtoFromProto = estimated_order_price != null ? OrderPriceDto.INSTANCE.fromProto(estimated_order_price) : null;
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getEstimated_contract_quantity());
            IdlDecimal idlDecimal4 = new IdlDecimal(proto.getEstimated_notional_amount());
            MarginRequired estimated_margin_required = proto.getEstimated_margin_required();
            MarginRequiredDto marginRequiredDtoFromProto = estimated_margin_required != null ? MarginRequiredDto.INSTANCE.fromProto(estimated_margin_required) : null;
            IdlDecimal idlDecimal5 = new IdlDecimal(proto.getEstimated_liquidation_price());
            OrderFees estimated_fees = proto.getEstimated_fees();
            return new OrderQuoteDto(new Surrogate(quote_currency_id, idlDecimal, idlDecimal2, orderPriceDtoFromProto, idlDecimal3, idlDecimal4, marginRequiredDtoFromProto, idlDecimal5, estimated_fees != null ? OrderFeesDto.INSTANCE.fromProto(estimated_fees) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.order.v1.OrderQuoteDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderQuoteDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OrderQuoteDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderQuoteDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderQuoteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/OrderQuoteDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/order/v1/OrderQuoteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<OrderQuoteDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.order.v1.OrderQuote", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderQuoteDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderQuoteDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderQuoteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderQuoteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "crypto_perpetuals.order.v1.OrderQuoteDto";
        }
    }
}
