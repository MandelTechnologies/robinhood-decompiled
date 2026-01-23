package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedTotalCost;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedTotalCostDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import rosetta.nummus.order.Side;
import rosetta.nummus.order.SideDto;

/* compiled from: TokenizationEstimatedTotalCostDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00050/123B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0097\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.¨\u00064"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Surrogate;)V", "", "primary_currency_code", "secondary_currency_code", "primary_price_per_token_formatted", "asset_currency_code", "Lcom/robinhood/idl/IdlDecimal;", "entered_quantity", "exchange_fee_percentage", "estimated_total_cost_formatted", "estimated_fee_cost_formatted", "maximum_total_cost_formatted", "maximum_fee_cost_formatted", "Lrosetta/nummus/order/SideDto;", "order_side", "trade_collar_percentage", "exchange_collar_percentage", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "order_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Surrogate;", "Companion", "Surrogate", "OrderTypeDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class TokenizationEstimatedTotalCostDto implements Dto3<TokenizationEstimatedTotalCost>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TokenizationEstimatedTotalCostDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TokenizationEstimatedTotalCostDto, TokenizationEstimatedTotalCost>> binaryBase64Serializer$delegate;
    private static final TokenizationEstimatedTotalCostDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TokenizationEstimatedTotalCostDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TokenizationEstimatedTotalCostDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ TokenizationEstimatedTotalCostDto(String str, String str2, String str3, String str4, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str5, String str6, String str7, String str8, SideDto sideDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, OrderTypeDto orderTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 2048) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 8192) != 0 ? null : orderTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenizationEstimatedTotalCostDto(String primary_currency_code, String secondary_currency_code, String primary_price_per_token_formatted, String asset_currency_code, IdlDecimal entered_quantity, IdlDecimal exchange_fee_percentage, String estimated_total_cost_formatted, String estimated_fee_cost_formatted, String maximum_total_cost_formatted, String maximum_fee_cost_formatted, SideDto order_side, IdlDecimal trade_collar_percentage, IdlDecimal exchange_collar_percentage, OrderTypeDto orderTypeDto) {
        this(new Surrogate(primary_currency_code, secondary_currency_code, primary_price_per_token_formatted, asset_currency_code, entered_quantity, exchange_fee_percentage, estimated_total_cost_formatted, estimated_fee_cost_formatted, maximum_total_cost_formatted, maximum_fee_cost_formatted, order_side, trade_collar_percentage, exchange_collar_percentage, orderTypeDto));
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(primary_price_per_token_formatted, "primary_price_per_token_formatted");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(entered_quantity, "entered_quantity");
        Intrinsics.checkNotNullParameter(exchange_fee_percentage, "exchange_fee_percentage");
        Intrinsics.checkNotNullParameter(estimated_total_cost_formatted, "estimated_total_cost_formatted");
        Intrinsics.checkNotNullParameter(estimated_fee_cost_formatted, "estimated_fee_cost_formatted");
        Intrinsics.checkNotNullParameter(maximum_total_cost_formatted, "maximum_total_cost_formatted");
        Intrinsics.checkNotNullParameter(maximum_fee_cost_formatted, "maximum_fee_cost_formatted");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(trade_collar_percentage, "trade_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_collar_percentage, "exchange_collar_percentage");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TokenizationEstimatedTotalCost toProto() {
        String primary_currency_code = this.surrogate.getPrimary_currency_code();
        String secondary_currency_code = this.surrogate.getSecondary_currency_code();
        String primary_price_per_token_formatted = this.surrogate.getPrimary_price_per_token_formatted();
        String asset_currency_code = this.surrogate.getAsset_currency_code();
        String stringValue = this.surrogate.getEntered_quantity().getStringValue();
        String stringValue2 = this.surrogate.getExchange_fee_percentage().getStringValue();
        String estimated_total_cost_formatted = this.surrogate.getEstimated_total_cost_formatted();
        String estimated_fee_cost_formatted = this.surrogate.getEstimated_fee_cost_formatted();
        String maximum_total_cost_formatted = this.surrogate.getMaximum_total_cost_formatted();
        String maximum_fee_cost_formatted = this.surrogate.getMaximum_fee_cost_formatted();
        Side side = (Side) this.surrogate.getOrder_side().toProto();
        String stringValue3 = this.surrogate.getTrade_collar_percentage().getStringValue();
        String stringValue4 = this.surrogate.getExchange_collar_percentage().getStringValue();
        OrderTypeDto order_type = this.surrogate.getOrder_type();
        return new TokenizationEstimatedTotalCost(primary_currency_code, secondary_currency_code, primary_price_per_token_formatted, asset_currency_code, stringValue, stringValue2, estimated_total_cost_formatted, estimated_fee_cost_formatted, maximum_total_cost_formatted, maximum_fee_cost_formatted, side, stringValue3, stringValue4, order_type != null ? (TokenizationEstimatedTotalCost.OrderType) order_type.toProto() : null, null, 16384, null);
    }

    public String toString() {
        return "[TokenizationEstimatedTotalCostDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TokenizationEstimatedTotalCostDto) && Intrinsics.areEqual(((TokenizationEstimatedTotalCostDto) other).surrogate, this.surrogate);
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
    /* compiled from: TokenizationEstimatedTotalCostDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b)\b\u0083\b\u0018\u0000 S2\u00020\u0001:\u0002TSBÑ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B§\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010(R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010(R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010(R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b<\u00102\u001a\u0004\b:\u0010;R/\u0010\f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010;R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010/\u0012\u0004\b@\u00102\u001a\u0004\b?\u0010(R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010/\u0012\u0004\bB\u00102\u001a\u0004\bA\u0010(R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010/\u0012\u0004\bD\u00102\u001a\u0004\bC\u0010(R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010/\u0012\u0004\bF\u00102\u001a\u0004\bE\u0010(R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010G\u0012\u0004\bJ\u00102\u001a\u0004\bH\u0010IR/\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00109\u0012\u0004\bL\u00102\u001a\u0004\bK\u0010;R/\u0010\u0014\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00109\u0012\u0004\bN\u00102\u001a\u0004\bM\u0010;R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010O\u0012\u0004\bR\u00102\u001a\u0004\bP\u0010Q¨\u0006U"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Surrogate;", "", "", "primary_currency_code", "secondary_currency_code", "primary_price_per_token_formatted", "asset_currency_code", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "entered_quantity", "exchange_fee_percentage", "estimated_total_cost_formatted", "estimated_fee_cost_formatted", "maximum_total_cost_formatted", "maximum_fee_cost_formatted", "Lrosetta/nummus/order/SideDto;", "order_side", "trade_collar_percentage", "exchange_collar_percentage", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "order_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrimary_currency_code", "getPrimary_currency_code$annotations", "()V", "getSecondary_currency_code", "getSecondary_currency_code$annotations", "getPrimary_price_per_token_formatted", "getPrimary_price_per_token_formatted$annotations", "getAsset_currency_code", "getAsset_currency_code$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getEntered_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getEntered_quantity$annotations", "getExchange_fee_percentage", "getExchange_fee_percentage$annotations", "getEstimated_total_cost_formatted", "getEstimated_total_cost_formatted$annotations", "getEstimated_fee_cost_formatted", "getEstimated_fee_cost_formatted$annotations", "getMaximum_total_cost_formatted", "getMaximum_total_cost_formatted$annotations", "getMaximum_fee_cost_formatted", "getMaximum_fee_cost_formatted$annotations", "Lrosetta/nummus/order/SideDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getOrder_side$annotations", "getTrade_collar_percentage", "getTrade_collar_percentage$annotations", "getExchange_collar_percentage", "getExchange_collar_percentage$annotations", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "getOrder_type", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "getOrder_type$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asset_currency_code;
        private final IdlDecimal entered_quantity;
        private final String estimated_fee_cost_formatted;
        private final String estimated_total_cost_formatted;
        private final IdlDecimal exchange_collar_percentage;
        private final IdlDecimal exchange_fee_percentage;
        private final String maximum_fee_cost_formatted;
        private final String maximum_total_cost_formatted;
        private final SideDto order_side;
        private final OrderTypeDto order_type;
        private final String primary_currency_code;
        private final String primary_price_per_token_formatted;
        private final String secondary_currency_code;
        private final IdlDecimal trade_collar_percentage;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (String) null, (String) null, (String) null, (SideDto) null, (IdlDecimal) null, (IdlDecimal) null, (OrderTypeDto) null, 16383, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.primary_currency_code, surrogate.primary_currency_code) && Intrinsics.areEqual(this.secondary_currency_code, surrogate.secondary_currency_code) && Intrinsics.areEqual(this.primary_price_per_token_formatted, surrogate.primary_price_per_token_formatted) && Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code) && Intrinsics.areEqual(this.entered_quantity, surrogate.entered_quantity) && Intrinsics.areEqual(this.exchange_fee_percentage, surrogate.exchange_fee_percentage) && Intrinsics.areEqual(this.estimated_total_cost_formatted, surrogate.estimated_total_cost_formatted) && Intrinsics.areEqual(this.estimated_fee_cost_formatted, surrogate.estimated_fee_cost_formatted) && Intrinsics.areEqual(this.maximum_total_cost_formatted, surrogate.maximum_total_cost_formatted) && Intrinsics.areEqual(this.maximum_fee_cost_formatted, surrogate.maximum_fee_cost_formatted) && this.order_side == surrogate.order_side && Intrinsics.areEqual(this.trade_collar_percentage, surrogate.trade_collar_percentage) && Intrinsics.areEqual(this.exchange_collar_percentage, surrogate.exchange_collar_percentage) && this.order_type == surrogate.order_type;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((((this.primary_currency_code.hashCode() * 31) + this.secondary_currency_code.hashCode()) * 31) + this.primary_price_per_token_formatted.hashCode()) * 31) + this.asset_currency_code.hashCode()) * 31) + this.entered_quantity.hashCode()) * 31) + this.exchange_fee_percentage.hashCode()) * 31) + this.estimated_total_cost_formatted.hashCode()) * 31) + this.estimated_fee_cost_formatted.hashCode()) * 31) + this.maximum_total_cost_formatted.hashCode()) * 31) + this.maximum_fee_cost_formatted.hashCode()) * 31) + this.order_side.hashCode()) * 31) + this.trade_collar_percentage.hashCode()) * 31) + this.exchange_collar_percentage.hashCode()) * 31;
            OrderTypeDto orderTypeDto = this.order_type;
            return iHashCode + (orderTypeDto == null ? 0 : orderTypeDto.hashCode());
        }

        public String toString() {
            return "Surrogate(primary_currency_code=" + this.primary_currency_code + ", secondary_currency_code=" + this.secondary_currency_code + ", primary_price_per_token_formatted=" + this.primary_price_per_token_formatted + ", asset_currency_code=" + this.asset_currency_code + ", entered_quantity=" + this.entered_quantity + ", exchange_fee_percentage=" + this.exchange_fee_percentage + ", estimated_total_cost_formatted=" + this.estimated_total_cost_formatted + ", estimated_fee_cost_formatted=" + this.estimated_fee_cost_formatted + ", maximum_total_cost_formatted=" + this.maximum_total_cost_formatted + ", maximum_fee_cost_formatted=" + this.maximum_fee_cost_formatted + ", order_side=" + this.order_side + ", trade_collar_percentage=" + this.trade_collar_percentage + ", exchange_collar_percentage=" + this.exchange_collar_percentage + ", order_type=" + this.order_type + ")";
        }

        /* compiled from: TokenizationEstimatedTotalCostDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TokenizationEstimatedTotalCostDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str5, String str6, String str7, String str8, SideDto sideDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, OrderTypeDto orderTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.primary_currency_code = "";
            } else {
                this.primary_currency_code = str;
            }
            if ((i & 2) == 0) {
                this.secondary_currency_code = "";
            } else {
                this.secondary_currency_code = str2;
            }
            if ((i & 4) == 0) {
                this.primary_price_per_token_formatted = "";
            } else {
                this.primary_price_per_token_formatted = str3;
            }
            if ((i & 8) == 0) {
                this.asset_currency_code = "";
            } else {
                this.asset_currency_code = str4;
            }
            if ((i & 16) == 0) {
                this.entered_quantity = new IdlDecimal("");
            } else {
                this.entered_quantity = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.exchange_fee_percentage = new IdlDecimal("");
            } else {
                this.exchange_fee_percentage = idlDecimal2;
            }
            if ((i & 64) == 0) {
                this.estimated_total_cost_formatted = "";
            } else {
                this.estimated_total_cost_formatted = str5;
            }
            if ((i & 128) == 0) {
                this.estimated_fee_cost_formatted = "";
            } else {
                this.estimated_fee_cost_formatted = str6;
            }
            if ((i & 256) == 0) {
                this.maximum_total_cost_formatted = "";
            } else {
                this.maximum_total_cost_formatted = str7;
            }
            if ((i & 512) == 0) {
                this.maximum_fee_cost_formatted = "";
            } else {
                this.maximum_fee_cost_formatted = str8;
            }
            if ((i & 1024) == 0) {
                this.order_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = sideDto;
            }
            if ((i & 2048) == 0) {
                this.trade_collar_percentage = new IdlDecimal("");
            } else {
                this.trade_collar_percentage = idlDecimal3;
            }
            this.exchange_collar_percentage = (i & 4096) == 0 ? new IdlDecimal("") : idlDecimal4;
            this.order_type = (i & 8192) == 0 ? null : orderTypeDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.primary_currency_code, "")) {
                output.encodeStringElement(serialDesc, 0, self.primary_currency_code);
            }
            if (!Intrinsics.areEqual(self.secondary_currency_code, "")) {
                output.encodeStringElement(serialDesc, 1, self.secondary_currency_code);
            }
            if (!Intrinsics.areEqual(self.primary_price_per_token_formatted, "")) {
                output.encodeStringElement(serialDesc, 2, self.primary_price_per_token_formatted);
            }
            if (!Intrinsics.areEqual(self.asset_currency_code, "")) {
                output.encodeStringElement(serialDesc, 3, self.asset_currency_code);
            }
            if (!Intrinsics.areEqual(self.entered_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.entered_quantity);
            }
            if (!Intrinsics.areEqual(self.exchange_fee_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.exchange_fee_percentage);
            }
            if (!Intrinsics.areEqual(self.estimated_total_cost_formatted, "")) {
                output.encodeStringElement(serialDesc, 6, self.estimated_total_cost_formatted);
            }
            if (!Intrinsics.areEqual(self.estimated_fee_cost_formatted, "")) {
                output.encodeStringElement(serialDesc, 7, self.estimated_fee_cost_formatted);
            }
            if (!Intrinsics.areEqual(self.maximum_total_cost_formatted, "")) {
                output.encodeStringElement(serialDesc, 8, self.maximum_total_cost_formatted);
            }
            if (!Intrinsics.areEqual(self.maximum_fee_cost_formatted, "")) {
                output.encodeStringElement(serialDesc, 9, self.maximum_fee_cost_formatted);
            }
            if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, SideDto.Serializer.INSTANCE, self.order_side);
            }
            if (!Intrinsics.areEqual(self.trade_collar_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, self.trade_collar_percentage);
            }
            if (!Intrinsics.areEqual(self.exchange_collar_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, self.exchange_collar_percentage);
            }
            OrderTypeDto orderTypeDto = self.order_type;
            if (orderTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, OrderTypeDto.Serializer.INSTANCE, orderTypeDto);
            }
        }

        public Surrogate(String primary_currency_code, String secondary_currency_code, String primary_price_per_token_formatted, String asset_currency_code, IdlDecimal entered_quantity, IdlDecimal exchange_fee_percentage, String estimated_total_cost_formatted, String estimated_fee_cost_formatted, String maximum_total_cost_formatted, String maximum_fee_cost_formatted, SideDto order_side, IdlDecimal trade_collar_percentage, IdlDecimal exchange_collar_percentage, OrderTypeDto orderTypeDto) {
            Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
            Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
            Intrinsics.checkNotNullParameter(primary_price_per_token_formatted, "primary_price_per_token_formatted");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(entered_quantity, "entered_quantity");
            Intrinsics.checkNotNullParameter(exchange_fee_percentage, "exchange_fee_percentage");
            Intrinsics.checkNotNullParameter(estimated_total_cost_formatted, "estimated_total_cost_formatted");
            Intrinsics.checkNotNullParameter(estimated_fee_cost_formatted, "estimated_fee_cost_formatted");
            Intrinsics.checkNotNullParameter(maximum_total_cost_formatted, "maximum_total_cost_formatted");
            Intrinsics.checkNotNullParameter(maximum_fee_cost_formatted, "maximum_fee_cost_formatted");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(trade_collar_percentage, "trade_collar_percentage");
            Intrinsics.checkNotNullParameter(exchange_collar_percentage, "exchange_collar_percentage");
            this.primary_currency_code = primary_currency_code;
            this.secondary_currency_code = secondary_currency_code;
            this.primary_price_per_token_formatted = primary_price_per_token_formatted;
            this.asset_currency_code = asset_currency_code;
            this.entered_quantity = entered_quantity;
            this.exchange_fee_percentage = exchange_fee_percentage;
            this.estimated_total_cost_formatted = estimated_total_cost_formatted;
            this.estimated_fee_cost_formatted = estimated_fee_cost_formatted;
            this.maximum_total_cost_formatted = maximum_total_cost_formatted;
            this.maximum_fee_cost_formatted = maximum_fee_cost_formatted;
            this.order_side = order_side;
            this.trade_collar_percentage = trade_collar_percentage;
            this.exchange_collar_percentage = exchange_collar_percentage;
            this.order_type = orderTypeDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str5, String str6, String str7, String str8, SideDto sideDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, OrderTypeDto orderTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 2048) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 8192) != 0 ? null : orderTypeDto);
        }

        public final String getPrimary_currency_code() {
            return this.primary_currency_code;
        }

        public final String getSecondary_currency_code() {
            return this.secondary_currency_code;
        }

        public final String getPrimary_price_per_token_formatted() {
            return this.primary_price_per_token_formatted;
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        public final IdlDecimal getEntered_quantity() {
            return this.entered_quantity;
        }

        public final IdlDecimal getExchange_fee_percentage() {
            return this.exchange_fee_percentage;
        }

        public final String getEstimated_total_cost_formatted() {
            return this.estimated_total_cost_formatted;
        }

        public final String getEstimated_fee_cost_formatted() {
            return this.estimated_fee_cost_formatted;
        }

        public final String getMaximum_total_cost_formatted() {
            return this.maximum_total_cost_formatted;
        }

        public final String getMaximum_fee_cost_formatted() {
            return this.maximum_fee_cost_formatted;
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }

        public final IdlDecimal getTrade_collar_percentage() {
            return this.trade_collar_percentage;
        }

        public final IdlDecimal getExchange_collar_percentage() {
            return this.exchange_collar_percentage;
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }
    }

    /* compiled from: TokenizationEstimatedTotalCostDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TokenizationEstimatedTotalCostDto, TokenizationEstimatedTotalCost> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TokenizationEstimatedTotalCostDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TokenizationEstimatedTotalCostDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TokenizationEstimatedTotalCostDto> getBinaryBase64Serializer() {
            return (KSerializer) TokenizationEstimatedTotalCostDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TokenizationEstimatedTotalCost> getProtoAdapter() {
            return TokenizationEstimatedTotalCost.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TokenizationEstimatedTotalCostDto getZeroValue() {
            return TokenizationEstimatedTotalCostDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TokenizationEstimatedTotalCostDto fromProto(TokenizationEstimatedTotalCost proto) {
            DefaultConstructorMarker defaultConstructorMarker;
            OrderTypeDto orderTypeDtoFromProto;
            Intrinsics.checkNotNullParameter(proto, "proto");
            String primary_currency_code = proto.getPrimary_currency_code();
            String secondary_currency_code = proto.getSecondary_currency_code();
            String primary_price_per_token_formatted = proto.getPrimary_price_per_token_formatted();
            String asset_currency_code = proto.getAsset_currency_code();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getEntered_quantity());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getExchange_fee_percentage());
            String estimated_total_cost_formatted = proto.getEstimated_total_cost_formatted();
            String estimated_fee_cost_formatted = proto.getEstimated_fee_cost_formatted();
            String maximum_total_cost_formatted = proto.getMaximum_total_cost_formatted();
            String maximum_fee_cost_formatted = proto.getMaximum_fee_cost_formatted();
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getOrder_side());
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getTrade_collar_percentage());
            IdlDecimal idlDecimal4 = new IdlDecimal(proto.getExchange_collar_percentage());
            TokenizationEstimatedTotalCost.OrderType order_type = proto.getOrder_type();
            if (order_type != null) {
                orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(order_type);
                defaultConstructorMarker = null;
            } else {
                defaultConstructorMarker = null;
                orderTypeDtoFromProto = null;
            }
            return new TokenizationEstimatedTotalCostDto(new Surrogate(primary_currency_code, secondary_currency_code, primary_price_per_token_formatted, asset_currency_code, idlDecimal, idlDecimal2, estimated_total_cost_formatted, estimated_fee_cost_formatted, maximum_total_cost_formatted, maximum_fee_cost_formatted, sideDtoFromProto, idlDecimal3, idlDecimal4, orderTypeDtoFromProto), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCostDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenizationEstimatedTotalCostDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TokenizationEstimatedTotalCostDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TokenizationEstimatedTotalCostDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_TYPE_UNSPECIFIED", "MARKET", "LIMIT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderTypeDto implements Dto2<TokenizationEstimatedTotalCost.OrderType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderTypeDto, TokenizationEstimatedTotalCost.OrderType>> binaryBase64Serializer$delegate;
        public static final OrderTypeDto ORDER_TYPE_UNSPECIFIED = new ORDER_TYPE_UNSPECIFIED("ORDER_TYPE_UNSPECIFIED", 0);
        public static final OrderTypeDto MARKET = new MARKET("MARKET", 1);
        public static final OrderTypeDto LIMIT = new LIMIT("LIMIT", 2);

        private static final /* synthetic */ OrderTypeDto[] $values() {
            return new OrderTypeDto[]{ORDER_TYPE_UNSPECIFIED, MARKET, LIMIT};
        }

        public /* synthetic */ OrderTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TokenizationEstimatedTotalCostDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto.OrderTypeDto.ORDER_TYPE_UNSPECIFIED", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_TYPE_UNSPECIFIED extends OrderTypeDto {
            ORDER_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TokenizationEstimatedTotalCost.OrderType toProto() {
                return TokenizationEstimatedTotalCost.OrderType.ORDER_TYPE_UNSPECIFIED;
            }
        }

        private OrderTypeDto(String str, int i) {
        }

        static {
            OrderTypeDto[] orderTypeDtoArr$values = $values();
            $VALUES = orderTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCostDto$OrderTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TokenizationEstimatedTotalCostDto.OrderTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TokenizationEstimatedTotalCostDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto.OrderTypeDto.MARKET", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET extends OrderTypeDto {
            MARKET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TokenizationEstimatedTotalCost.OrderType toProto() {
                return TokenizationEstimatedTotalCost.OrderType.MARKET;
            }
        }

        /* compiled from: TokenizationEstimatedTotalCostDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto.OrderTypeDto.LIMIT", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIMIT extends OrderTypeDto {
            LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TokenizationEstimatedTotalCost.OrderType toProto() {
                return TokenizationEstimatedTotalCost.OrderType.LIMIT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TokenizationEstimatedTotalCostDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderTypeDto, TokenizationEstimatedTotalCost.OrderType> {

            /* compiled from: TokenizationEstimatedTotalCostDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TokenizationEstimatedTotalCost.OrderType.values().length];
                    try {
                        iArr[TokenizationEstimatedTotalCost.OrderType.ORDER_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TokenizationEstimatedTotalCost.OrderType.MARKET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TokenizationEstimatedTotalCost.OrderType.LIMIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TokenizationEstimatedTotalCost.OrderType> getProtoAdapter() {
                return TokenizationEstimatedTotalCost.OrderType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderTypeDto getZeroValue() {
                return OrderTypeDto.ORDER_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderTypeDto fromProto(TokenizationEstimatedTotalCost.OrderType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OrderTypeDto.ORDER_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return OrderTypeDto.MARKET;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderTypeDto.LIMIT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TokenizationEstimatedTotalCostDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$OrderTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<OrderTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderTypeDto, TokenizationEstimatedTotalCost.OrderType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCost.OrderType", OrderTypeDto.getEntries(), OrderTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderTypeDto valueOf(String str) {
            return (OrderTypeDto) Enum.valueOf(OrderTypeDto.class, str);
        }

        public static OrderTypeDto[] values() {
            return (OrderTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TokenizationEstimatedTotalCostDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TokenizationEstimatedTotalCostDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCost", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TokenizationEstimatedTotalCostDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TokenizationEstimatedTotalCostDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TokenizationEstimatedTotalCostDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TokenizationEstimatedTotalCostDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCostDto";
        }
    }
}
