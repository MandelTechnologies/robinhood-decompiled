package rosetta.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EquityOverrideDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002*+B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006,"}, m3636d2 = {"Lrosetta/order/EquityOverrideDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/EquityOverride;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "EQUITY_ORDER_UNSPECIFIED", "OVERRIDE_DAY_TRADE_CHECKS_SELL", "OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE", "OVERRIDE_SELL_ALL", "OVERRIDE_LARGE_QUANTITY", "OVERRIDE_LIQUIDITY", "OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE", "OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE", "OVERRIDE_ETP_WARNING", "OVERRIDE_IPO_FLIPPING_POLICY", "OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE", "OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE", "OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE", "OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE", "OVERRIDE_UPDATE_FOR_HYPER_EX", "OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION", "OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT", "OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING", "OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE", "OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND", "OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING", "OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP", "OVERRIDE_BORROW_FEE_CHANGED", "OVERRIDE_LOCATE_UNAVAILABLE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class EquityOverrideDto implements Dto2<EquityOverride>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquityOverrideDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<EquityOverrideDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquityOverrideDto, EquityOverride>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final EquityOverrideDto EQUITY_ORDER_UNSPECIFIED = new EquityOverrideDto("EQUITY_ORDER_UNSPECIFIED", 0) { // from class: rosetta.order.EquityOverrideDto.EQUITY_ORDER_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.EQUITY_ORDER_UNSPECIFIED;
        }
    };
    public static final EquityOverrideDto OVERRIDE_DAY_TRADE_CHECKS_SELL = new EquityOverrideDto("OVERRIDE_DAY_TRADE_CHECKS_SELL", 1) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_DAY_TRADE_CHECKS_SELL
        {
            String str = "override_day_trade_checks_sell";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_DAY_TRADE_CHECKS_SELL;
        }
    };
    public static final EquityOverrideDto OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE = new EquityOverrideDto("OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE", 2) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE
        {
            String str = "override_day_trades_restricted_can_override";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE;
        }
    };
    public static final EquityOverrideDto OVERRIDE_SELL_ALL = new EquityOverrideDto("OVERRIDE_SELL_ALL", 3) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_SELL_ALL
        {
            String str = "override_sell_all";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_SELL_ALL;
        }
    };
    public static final EquityOverrideDto OVERRIDE_LARGE_QUANTITY = new EquityOverrideDto("OVERRIDE_LARGE_QUANTITY", 4) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_LARGE_QUANTITY
        {
            String str = "override_large_quantity";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_LARGE_QUANTITY;
        }
    };
    public static final EquityOverrideDto OVERRIDE_LIQUIDITY = new EquityOverrideDto("OVERRIDE_LIQUIDITY", 5) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_LIQUIDITY
        {
            String str = "override_liquidity";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_LIQUIDITY;
        }
    };
    public static final EquityOverrideDto OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE = new EquityOverrideDto("OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE", 6) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE
        {
            String str = "override_limit_price_outside_soft_range";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE;
        }
    };
    public static final EquityOverrideDto OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE = new EquityOverrideDto("OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE", 7) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE
        {
            String str = "override_stop_price_outside_soft_range";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE;
        }
    };
    public static final EquityOverrideDto OVERRIDE_ETP_WARNING = new EquityOverrideDto("OVERRIDE_ETP_WARNING", 8) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_ETP_WARNING
        {
            String str = "override_etp_warning";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_ETP_WARNING;
        }
    };
    public static final EquityOverrideDto OVERRIDE_IPO_FLIPPING_POLICY = new EquityOverrideDto("OVERRIDE_IPO_FLIPPING_POLICY", 9) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_IPO_FLIPPING_POLICY
        {
            String str = "override_ipo_flipping_policy";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_IPO_FLIPPING_POLICY;
        }
    };
    public static final EquityOverrideDto OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE = new EquityOverrideDto("OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE", 10) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE
        {
            String str = "override_extremely_marketable_limit_price";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE;
        }
    };
    public static final EquityOverrideDto OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE = new EquityOverrideDto("OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE", 11) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE
        {
            String str = "override_extremely_marketable_stop_price";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE;
        }
    };
    public static final EquityOverrideDto OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE = new EquityOverrideDto("OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE", 12) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE
        {
            String str = "override_extremely_unmarketable_limit_price";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE;
        }
    };
    public static final EquityOverrideDto OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE = new EquityOverrideDto("OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE", 13) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE
        {
            String str = "override_extremely_unmarketable_stop_price";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE;
        }
    };
    public static final EquityOverrideDto OVERRIDE_UPDATE_FOR_HYPER_EX = new EquityOverrideDto("OVERRIDE_UPDATE_FOR_HYPER_EX", 14) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_UPDATE_FOR_HYPER_EX
        {
            String str = "override_update_for_hyper_ex";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_UPDATE_FOR_HYPER_EX;
        }
    };
    public static final EquityOverrideDto OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION = new EquityOverrideDto("OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION", 15) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION
        {
            String str = "override_all_day_trading_fractional_order_promotion";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION;
        }
    };
    public static final EquityOverrideDto OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT = new EquityOverrideDto("OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT", 16) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT
        {
            String str = "override_slippage_risk_from_option_assignment";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT;
        }
    };
    public static final EquityOverrideDto OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING = new EquityOverrideDto("OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING", 17) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING
        {
            String str = "override_concentrated_maintenance_call_warning";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING;
        }
    };
    public static final EquityOverrideDto OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE = new EquityOverrideDto("OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE", 18) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE
        {
            String str = "override_texas_crypto_cancel_pending_order_disclosure";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE;
        }
    };
    public static final EquityOverrideDto OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND = new EquityOverrideDto("OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND", 19) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND
        {
            String str = "override_limit_price_outside_priceband";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND;
        }
    };
    public static final EquityOverrideDto OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING = new EquityOverrideDto("OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING", 20) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING
        {
            String str = "override_sell_order_outstanding_tax_lot_order_warning";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING;
        }
    };
    public static final EquityOverrideDto OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP = new EquityOverrideDto("OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP", 21) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP
        {
            String str = "override_overnight_market_buy_ftux_popup";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP;
        }
    };
    public static final EquityOverrideDto OVERRIDE_BORROW_FEE_CHANGED = new EquityOverrideDto("OVERRIDE_BORROW_FEE_CHANGED", 22) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_BORROW_FEE_CHANGED
        {
            String str = "override_borrow_fee_changed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_BORROW_FEE_CHANGED;
        }
    };
    public static final EquityOverrideDto OVERRIDE_LOCATE_UNAVAILABLE = new EquityOverrideDto("OVERRIDE_LOCATE_UNAVAILABLE", 23) { // from class: rosetta.order.EquityOverrideDto.OVERRIDE_LOCATE_UNAVAILABLE
        {
            String str = "override_locate_unavailable";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EquityOverride toProto() {
            return EquityOverride.OVERRIDE_LOCATE_UNAVAILABLE;
        }
    };

    private static final /* synthetic */ EquityOverrideDto[] $values() {
        return new EquityOverrideDto[]{EQUITY_ORDER_UNSPECIFIED, OVERRIDE_DAY_TRADE_CHECKS_SELL, OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE, OVERRIDE_SELL_ALL, OVERRIDE_LARGE_QUANTITY, OVERRIDE_LIQUIDITY, OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE, OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE, OVERRIDE_ETP_WARNING, OVERRIDE_IPO_FLIPPING_POLICY, OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE, OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE, OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE, OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE, OVERRIDE_UPDATE_FOR_HYPER_EX, OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION, OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT, OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING, OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE, OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND, OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING, OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP, OVERRIDE_BORROW_FEE_CHANGED, OVERRIDE_LOCATE_UNAVAILABLE};
    }

    public /* synthetic */ EquityOverrideDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<EquityOverrideDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquityOverrideDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        EquityOverrideDto[] equityOverrideDtoArr$values = $values();
        $VALUES = equityOverrideDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(equityOverrideDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.EquityOverrideDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityOverrideDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: EquityOverrideDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/EquityOverrideDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/EquityOverrideDto;", "Lrosetta/order/EquityOverride;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/EquityOverrideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<EquityOverrideDto, EquityOverride> {

        /* compiled from: EquityOverrideDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOverride.values().length];
                try {
                    iArr[EquityOverride.EQUITY_ORDER_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_DAY_TRADE_CHECKS_SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_SELL_ALL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_LARGE_QUANTITY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_LIQUIDITY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_ETP_WARNING.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_IPO_FLIPPING_POLICY.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_UPDATE_FOR_HYPER_EX.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_BORROW_FEE_CHANGED.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[EquityOverride.OVERRIDE_LOCATE_UNAVAILABLE.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquityOverrideDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOverrideDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOverrideDto> getBinaryBase64Serializer() {
            return (KSerializer) EquityOverrideDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquityOverride> getProtoAdapter() {
            return EquityOverride.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOverrideDto getZeroValue() {
            return EquityOverrideDto.EQUITY_ORDER_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOverrideDto fromProto(EquityOverride proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return EquityOverrideDto.EQUITY_ORDER_UNSPECIFIED;
                case 2:
                    return EquityOverrideDto.OVERRIDE_DAY_TRADE_CHECKS_SELL;
                case 3:
                    return EquityOverrideDto.OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE;
                case 4:
                    return EquityOverrideDto.OVERRIDE_SELL_ALL;
                case 5:
                    return EquityOverrideDto.OVERRIDE_LARGE_QUANTITY;
                case 6:
                    return EquityOverrideDto.OVERRIDE_LIQUIDITY;
                case 7:
                    return EquityOverrideDto.OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE;
                case 8:
                    return EquityOverrideDto.OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE;
                case 9:
                    return EquityOverrideDto.OVERRIDE_ETP_WARNING;
                case 10:
                    return EquityOverrideDto.OVERRIDE_IPO_FLIPPING_POLICY;
                case 11:
                    return EquityOverrideDto.OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE;
                case 12:
                    return EquityOverrideDto.OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE;
                case 13:
                    return EquityOverrideDto.OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE;
                case 14:
                    return EquityOverrideDto.OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE;
                case 15:
                    return EquityOverrideDto.OVERRIDE_UPDATE_FOR_HYPER_EX;
                case 16:
                    return EquityOverrideDto.OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION;
                case 17:
                    return EquityOverrideDto.OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT;
                case 18:
                    return EquityOverrideDto.OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING;
                case 19:
                    return EquityOverrideDto.OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE;
                case 20:
                    return EquityOverrideDto.OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND;
                case 21:
                    return EquityOverrideDto.OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING;
                case 22:
                    return EquityOverrideDto.OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP;
                case 23:
                    return EquityOverrideDto.OVERRIDE_BORROW_FEE_CHANGED;
                case 24:
                    return EquityOverrideDto.OVERRIDE_LOCATE_UNAVAILABLE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EquityOverrideDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/EquityOverrideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/EquityOverrideDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EquityOverrideDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<EquityOverrideDto, EquityOverride> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.EquityOverride", EquityOverrideDto.getEntries(), EquityOverrideDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public EquityOverrideDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (EquityOverrideDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquityOverrideDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static EquityOverrideDto valueOf(String str) {
        return (EquityOverrideDto) Enum.valueOf(EquityOverrideDto.class, str);
    }

    public static EquityOverrideDto[] values() {
        return (EquityOverrideDto[]) $VALUES.clone();
    }
}
