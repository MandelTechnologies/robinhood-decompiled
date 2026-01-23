package rosetta.order;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EquityOverride.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006\""}, m3636d2 = {"Lrosetta/order/EquityOverride;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EQUITY_ORDER_UNSPECIFIED", "OVERRIDE_DAY_TRADE_CHECKS_SELL", "OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE", "OVERRIDE_SELL_ALL", "OVERRIDE_LARGE_QUANTITY", "OVERRIDE_LIQUIDITY", "OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE", "OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE", "OVERRIDE_ETP_WARNING", "OVERRIDE_IPO_FLIPPING_POLICY", "OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE", "OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE", "OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE", "OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE", "OVERRIDE_UPDATE_FOR_HYPER_EX", "OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION", "OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT", "OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING", "OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE", "OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND", "OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING", "OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP", "OVERRIDE_BORROW_FEE_CHANGED", "OVERRIDE_LOCATE_UNAVAILABLE", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class EquityOverride implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquityOverride[] $VALUES;

    @JvmField
    public static final ProtoAdapter<EquityOverride> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EquityOverride EQUITY_ORDER_UNSPECIFIED;
    public static final EquityOverride OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION;
    public static final EquityOverride OVERRIDE_BORROW_FEE_CHANGED;
    public static final EquityOverride OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING;
    public static final EquityOverride OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE;
    public static final EquityOverride OVERRIDE_DAY_TRADE_CHECKS_SELL;
    public static final EquityOverride OVERRIDE_ETP_WARNING;
    public static final EquityOverride OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE;
    public static final EquityOverride OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE;
    public static final EquityOverride OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE;
    public static final EquityOverride OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE;
    public static final EquityOverride OVERRIDE_IPO_FLIPPING_POLICY;
    public static final EquityOverride OVERRIDE_LARGE_QUANTITY;
    public static final EquityOverride OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND;
    public static final EquityOverride OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE;
    public static final EquityOverride OVERRIDE_LIQUIDITY;
    public static final EquityOverride OVERRIDE_LOCATE_UNAVAILABLE;
    public static final EquityOverride OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP;
    public static final EquityOverride OVERRIDE_SELL_ALL;
    public static final EquityOverride OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING;
    public static final EquityOverride OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT;
    public static final EquityOverride OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE;
    public static final EquityOverride OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE;
    public static final EquityOverride OVERRIDE_UPDATE_FOR_HYPER_EX;
    private final int value;

    private static final /* synthetic */ EquityOverride[] $values() {
        return new EquityOverride[]{EQUITY_ORDER_UNSPECIFIED, OVERRIDE_DAY_TRADE_CHECKS_SELL, OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE, OVERRIDE_SELL_ALL, OVERRIDE_LARGE_QUANTITY, OVERRIDE_LIQUIDITY, OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE, OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE, OVERRIDE_ETP_WARNING, OVERRIDE_IPO_FLIPPING_POLICY, OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE, OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE, OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE, OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE, OVERRIDE_UPDATE_FOR_HYPER_EX, OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION, OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT, OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING, OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE, OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND, OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING, OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP, OVERRIDE_BORROW_FEE_CHANGED, OVERRIDE_LOCATE_UNAVAILABLE};
    }

    @JvmStatic
    public static final EquityOverride fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<EquityOverride> getEntries() {
        return $ENTRIES;
    }

    private EquityOverride(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final EquityOverride equityOverride = new EquityOverride("EQUITY_ORDER_UNSPECIFIED", 0, 0);
        EQUITY_ORDER_UNSPECIFIED = equityOverride;
        OVERRIDE_DAY_TRADE_CHECKS_SELL = new EquityOverride("OVERRIDE_DAY_TRADE_CHECKS_SELL", 1, 1);
        OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE = new EquityOverride("OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE", 2, 2);
        OVERRIDE_SELL_ALL = new EquityOverride("OVERRIDE_SELL_ALL", 3, 3);
        OVERRIDE_LARGE_QUANTITY = new EquityOverride("OVERRIDE_LARGE_QUANTITY", 4, 4);
        OVERRIDE_LIQUIDITY = new EquityOverride("OVERRIDE_LIQUIDITY", 5, 5);
        OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE = new EquityOverride("OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE", 6, 6);
        OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE = new EquityOverride("OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE", 7, 7);
        OVERRIDE_ETP_WARNING = new EquityOverride("OVERRIDE_ETP_WARNING", 8, 8);
        OVERRIDE_IPO_FLIPPING_POLICY = new EquityOverride("OVERRIDE_IPO_FLIPPING_POLICY", 9, 9);
        OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE = new EquityOverride("OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE", 10, 10);
        OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE = new EquityOverride("OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE", 11, 11);
        OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE = new EquityOverride("OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE", 12, 12);
        OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE = new EquityOverride("OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE", 13, 13);
        OVERRIDE_UPDATE_FOR_HYPER_EX = new EquityOverride("OVERRIDE_UPDATE_FOR_HYPER_EX", 14, 14);
        OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION = new EquityOverride("OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION", 15, 15);
        OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT = new EquityOverride("OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT", 16, 16);
        OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING = new EquityOverride("OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING", 17, 17);
        OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE = new EquityOverride("OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE", 18, 18);
        OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND = new EquityOverride("OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND", 19, 19);
        OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING = new EquityOverride("OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING", 20, 20);
        OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP = new EquityOverride("OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP", 21, 21);
        OVERRIDE_BORROW_FEE_CHANGED = new EquityOverride("OVERRIDE_BORROW_FEE_CHANGED", 22, 22);
        OVERRIDE_LOCATE_UNAVAILABLE = new EquityOverride("OVERRIDE_LOCATE_UNAVAILABLE", 23, 23);
        EquityOverride[] equityOverrideArr$values = $values();
        $VALUES = equityOverrideArr$values;
        $ENTRIES = EnumEntries2.enumEntries(equityOverrideArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityOverride.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EquityOverride>(orCreateKotlinClass, syntax, equityOverride) { // from class: rosetta.order.EquityOverride$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public EquityOverride fromValue(int value) {
                return EquityOverride.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: EquityOverride.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/EquityOverride$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/EquityOverride;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityOverride fromValue(int value) {
            switch (value) {
                case 0:
                    return EquityOverride.EQUITY_ORDER_UNSPECIFIED;
                case 1:
                    return EquityOverride.OVERRIDE_DAY_TRADE_CHECKS_SELL;
                case 2:
                    return EquityOverride.OVERRIDE_DAY_TRADES_RESTRICTED_CAN_OVERRIDE;
                case 3:
                    return EquityOverride.OVERRIDE_SELL_ALL;
                case 4:
                    return EquityOverride.OVERRIDE_LARGE_QUANTITY;
                case 5:
                    return EquityOverride.OVERRIDE_LIQUIDITY;
                case 6:
                    return EquityOverride.OVERRIDE_LIMIT_PRICE_OUTSIDE_SOFT_RANGE;
                case 7:
                    return EquityOverride.OVERRIDE_STOP_PRICE_OUTSIDE_SOFT_RANGE;
                case 8:
                    return EquityOverride.OVERRIDE_ETP_WARNING;
                case 9:
                    return EquityOverride.OVERRIDE_IPO_FLIPPING_POLICY;
                case 10:
                    return EquityOverride.OVERRIDE_EXTREMELY_MARKETABLE_LIMIT_PRICE;
                case 11:
                    return EquityOverride.OVERRIDE_EXTREMELY_MARKETABLE_STOP_PRICE;
                case 12:
                    return EquityOverride.OVERRIDE_EXTREMELY_UNMARKETABLE_LIMIT_PRICE;
                case 13:
                    return EquityOverride.OVERRIDE_EXTREMELY_UNMARKETABLE_STOP_PRICE;
                case 14:
                    return EquityOverride.OVERRIDE_UPDATE_FOR_HYPER_EX;
                case 15:
                    return EquityOverride.OVERRIDE_ALL_DAY_TRADING_FRACTIONAL_ORDER_PROMOTION;
                case 16:
                    return EquityOverride.OVERRIDE_SLIPPAGE_RISK_FROM_OPTION_ASSIGNMENT;
                case 17:
                    return EquityOverride.OVERRIDE_CONCENTRATED_MAINTENANCE_CALL_WARNING;
                case 18:
                    return EquityOverride.OVERRIDE_TEXAS_CRYPTO_CANCEL_PENDING_ORDER_DISCLOSURE;
                case 19:
                    return EquityOverride.OVERRIDE_LIMIT_PRICE_OUTSIDE_PRICEBAND;
                case 20:
                    return EquityOverride.OVERRIDE_SELL_ORDER_OUTSTANDING_TAX_LOT_ORDER_WARNING;
                case 21:
                    return EquityOverride.OVERRIDE_OVERNIGHT_MARKET_BUY_FTUX_POPUP;
                case 22:
                    return EquityOverride.OVERRIDE_BORROW_FEE_CHANGED;
                case 23:
                    return EquityOverride.OVERRIDE_LOCATE_UNAVAILABLE;
                default:
                    return null;
            }
        }
    }

    public static EquityOverride valueOf(String str) {
        return (EquityOverride) Enum.valueOf(EquityOverride.class, str);
    }

    public static EquityOverride[] values() {
        return (EquityOverride[]) $VALUES.clone();
    }
}
