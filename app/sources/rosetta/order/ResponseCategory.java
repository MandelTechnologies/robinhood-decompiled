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
/* compiled from: ResponseCategory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b@\b\u0086\u0081\u0002\u0018\u0000 C2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001CB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bB¨\u0006D"}, m3636d2 = {"Lrosetta/order/ResponseCategory;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RESPONSE_CATEGORY_UNSPECIFIED", "SUCCESS", "INVALID_STOP", "INVALID_LIMIT", "INVALID_SPREAD", "ORDER_TOO_BIG", "CORPORATE_ACTION", "END_OF_DAY", "STALE_GTC", "UNSUPPORTED_SYMBOL", "VENUE_ERROR", "MAINST_ERROR", "NETWORK_ERROR", "FAILED_BEFORE_MAINST", "SLOW_TO_MARKET", "GET_OUT", "RETRY", "BUYING_POWER", "UNKNOWN", "FIRM_ORDER_CANCELLED", "FIRM_ORDER_FAILED", "FIRM_ORDER_REJECTED", "NOT_MARKETABLE", "CANCEL_REQUEST", "CANCEL_ADJUSTMENT", "MAX_SPREAD_EXCEEDED", "NOT_FRACTIONALLY_TRADABLE", "NO_PRICE", "NO_ROUTABLE_VENUE", "FRACTIONAL_TRADING_DISABLED", "DELAYED_EXTENDED_HOURS", "INSUFFICIENT_RESERVED_BUYING_POWER", "MAX_ORDER_NOTIONAL_EXCEEDED", "MAX_ORDER_QUANTITY_EXCEEDED", "NBBO_ADV_THRESHOLD_EXCEEDED", "MANUAL_BULK_ACTION_CANCEL", "VENUE_UNSOLICITED_CANCEL", "EXCEEDED_TRADING_AGGREGATE_MACS", "UNREGISTERED_UPSTREAM_ORDER", "SYMBOL_NOT_ADT_ELIGIBLE", "EXTERNAL_HALT", "STALE_GFD", "MARKET_ORDER_ADV_THRESHOLD_EXCEEDED", "RATE_LIMITED", "INVALID_PRICE", "PRICE_OUTSIDE_BANDS", "INVALID_TIME_WINDOW", "INVALID_QUANTITY", "INVALID_INSTRUMENT", "OLD_ORDER_EXECUTED", "ADV_MAC_VIOLATION_TO_REVIEW", "INVALID_SIDE", "ORDER_TOO_SMALL", "LOCATE_FAILED", "ORDER_TYPE_NOT_SUPPORTED", "FX_PRINCIPAL_TRADING_DISABLED", "FAILED_PRECONDITION", "SERVER_ERROR", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ResponseCategory implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResponseCategory[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ResponseCategory> ADAPTER;
    public static final ResponseCategory ADV_MAC_VIOLATION_TO_REVIEW;
    public static final ResponseCategory BUYING_POWER;
    public static final ResponseCategory CANCEL_ADJUSTMENT;
    public static final ResponseCategory CANCEL_REQUEST;
    public static final ResponseCategory CORPORATE_ACTION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ResponseCategory DELAYED_EXTENDED_HOURS;
    public static final ResponseCategory END_OF_DAY;
    public static final ResponseCategory EXCEEDED_TRADING_AGGREGATE_MACS;
    public static final ResponseCategory EXTERNAL_HALT;
    public static final ResponseCategory FAILED_BEFORE_MAINST;
    public static final ResponseCategory FAILED_PRECONDITION;
    public static final ResponseCategory FIRM_ORDER_CANCELLED;
    public static final ResponseCategory FIRM_ORDER_FAILED;
    public static final ResponseCategory FIRM_ORDER_REJECTED;
    public static final ResponseCategory FRACTIONAL_TRADING_DISABLED;
    public static final ResponseCategory FX_PRINCIPAL_TRADING_DISABLED;
    public static final ResponseCategory GET_OUT;
    public static final ResponseCategory INSUFFICIENT_RESERVED_BUYING_POWER;
    public static final ResponseCategory INVALID_INSTRUMENT;
    public static final ResponseCategory INVALID_LIMIT;
    public static final ResponseCategory INVALID_PRICE;
    public static final ResponseCategory INVALID_QUANTITY;
    public static final ResponseCategory INVALID_SIDE;
    public static final ResponseCategory INVALID_SPREAD;
    public static final ResponseCategory INVALID_STOP;
    public static final ResponseCategory INVALID_TIME_WINDOW;
    public static final ResponseCategory LOCATE_FAILED;
    public static final ResponseCategory MAINST_ERROR;
    public static final ResponseCategory MANUAL_BULK_ACTION_CANCEL;
    public static final ResponseCategory MARKET_ORDER_ADV_THRESHOLD_EXCEEDED;
    public static final ResponseCategory MAX_ORDER_NOTIONAL_EXCEEDED;
    public static final ResponseCategory MAX_ORDER_QUANTITY_EXCEEDED;
    public static final ResponseCategory MAX_SPREAD_EXCEEDED;
    public static final ResponseCategory NBBO_ADV_THRESHOLD_EXCEEDED;
    public static final ResponseCategory NETWORK_ERROR;
    public static final ResponseCategory NOT_FRACTIONALLY_TRADABLE;
    public static final ResponseCategory NOT_MARKETABLE;
    public static final ResponseCategory NO_PRICE;
    public static final ResponseCategory NO_ROUTABLE_VENUE;
    public static final ResponseCategory OLD_ORDER_EXECUTED;
    public static final ResponseCategory ORDER_TOO_BIG;
    public static final ResponseCategory ORDER_TOO_SMALL;
    public static final ResponseCategory ORDER_TYPE_NOT_SUPPORTED;
    public static final ResponseCategory PRICE_OUTSIDE_BANDS;
    public static final ResponseCategory RATE_LIMITED;
    public static final ResponseCategory RESPONSE_CATEGORY_UNSPECIFIED;
    public static final ResponseCategory RETRY;
    public static final ResponseCategory SERVER_ERROR;
    public static final ResponseCategory SLOW_TO_MARKET;
    public static final ResponseCategory STALE_GFD;
    public static final ResponseCategory STALE_GTC;
    public static final ResponseCategory SUCCESS;
    public static final ResponseCategory SYMBOL_NOT_ADT_ELIGIBLE;
    public static final ResponseCategory UNKNOWN;
    public static final ResponseCategory UNREGISTERED_UPSTREAM_ORDER;
    public static final ResponseCategory UNSUPPORTED_SYMBOL;
    public static final ResponseCategory VENUE_ERROR;
    public static final ResponseCategory VENUE_UNSOLICITED_CANCEL;
    private final int value;

    private static final /* synthetic */ ResponseCategory[] $values() {
        return new ResponseCategory[]{RESPONSE_CATEGORY_UNSPECIFIED, SUCCESS, INVALID_STOP, INVALID_LIMIT, INVALID_SPREAD, ORDER_TOO_BIG, CORPORATE_ACTION, END_OF_DAY, STALE_GTC, UNSUPPORTED_SYMBOL, VENUE_ERROR, MAINST_ERROR, NETWORK_ERROR, FAILED_BEFORE_MAINST, SLOW_TO_MARKET, GET_OUT, RETRY, BUYING_POWER, UNKNOWN, FIRM_ORDER_CANCELLED, FIRM_ORDER_FAILED, FIRM_ORDER_REJECTED, NOT_MARKETABLE, CANCEL_REQUEST, CANCEL_ADJUSTMENT, MAX_SPREAD_EXCEEDED, NOT_FRACTIONALLY_TRADABLE, NO_PRICE, NO_ROUTABLE_VENUE, FRACTIONAL_TRADING_DISABLED, DELAYED_EXTENDED_HOURS, INSUFFICIENT_RESERVED_BUYING_POWER, MAX_ORDER_NOTIONAL_EXCEEDED, MAX_ORDER_QUANTITY_EXCEEDED, NBBO_ADV_THRESHOLD_EXCEEDED, MANUAL_BULK_ACTION_CANCEL, VENUE_UNSOLICITED_CANCEL, EXCEEDED_TRADING_AGGREGATE_MACS, UNREGISTERED_UPSTREAM_ORDER, SYMBOL_NOT_ADT_ELIGIBLE, EXTERNAL_HALT, STALE_GFD, MARKET_ORDER_ADV_THRESHOLD_EXCEEDED, RATE_LIMITED, INVALID_PRICE, PRICE_OUTSIDE_BANDS, INVALID_TIME_WINDOW, INVALID_QUANTITY, INVALID_INSTRUMENT, OLD_ORDER_EXECUTED, ADV_MAC_VIOLATION_TO_REVIEW, INVALID_SIDE, ORDER_TOO_SMALL, LOCATE_FAILED, ORDER_TYPE_NOT_SUPPORTED, FX_PRINCIPAL_TRADING_DISABLED, FAILED_PRECONDITION, SERVER_ERROR};
    }

    @JvmStatic
    public static final ResponseCategory fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ResponseCategory> getEntries() {
        return $ENTRIES;
    }

    private ResponseCategory(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ResponseCategory responseCategory = new ResponseCategory("RESPONSE_CATEGORY_UNSPECIFIED", 0, 0);
        RESPONSE_CATEGORY_UNSPECIFIED = responseCategory;
        SUCCESS = new ResponseCategory("SUCCESS", 1, 1);
        INVALID_STOP = new ResponseCategory("INVALID_STOP", 2, 2);
        INVALID_LIMIT = new ResponseCategory("INVALID_LIMIT", 3, 3);
        INVALID_SPREAD = new ResponseCategory("INVALID_SPREAD", 4, 4);
        ORDER_TOO_BIG = new ResponseCategory("ORDER_TOO_BIG", 5, 5);
        CORPORATE_ACTION = new ResponseCategory("CORPORATE_ACTION", 6, 6);
        END_OF_DAY = new ResponseCategory("END_OF_DAY", 7, 7);
        STALE_GTC = new ResponseCategory("STALE_GTC", 8, 8);
        UNSUPPORTED_SYMBOL = new ResponseCategory("UNSUPPORTED_SYMBOL", 9, 9);
        VENUE_ERROR = new ResponseCategory("VENUE_ERROR", 10, 10);
        MAINST_ERROR = new ResponseCategory("MAINST_ERROR", 11, 11);
        NETWORK_ERROR = new ResponseCategory("NETWORK_ERROR", 12, 12);
        FAILED_BEFORE_MAINST = new ResponseCategory("FAILED_BEFORE_MAINST", 13, 13);
        SLOW_TO_MARKET = new ResponseCategory("SLOW_TO_MARKET", 14, 14);
        GET_OUT = new ResponseCategory("GET_OUT", 15, 15);
        RETRY = new ResponseCategory("RETRY", 16, 16);
        BUYING_POWER = new ResponseCategory("BUYING_POWER", 17, 17);
        UNKNOWN = new ResponseCategory("UNKNOWN", 18, 18);
        FIRM_ORDER_CANCELLED = new ResponseCategory("FIRM_ORDER_CANCELLED", 19, 19);
        FIRM_ORDER_FAILED = new ResponseCategory("FIRM_ORDER_FAILED", 20, 20);
        FIRM_ORDER_REJECTED = new ResponseCategory("FIRM_ORDER_REJECTED", 21, 21);
        NOT_MARKETABLE = new ResponseCategory("NOT_MARKETABLE", 22, 22);
        CANCEL_REQUEST = new ResponseCategory("CANCEL_REQUEST", 23, 23);
        CANCEL_ADJUSTMENT = new ResponseCategory("CANCEL_ADJUSTMENT", 24, 24);
        MAX_SPREAD_EXCEEDED = new ResponseCategory("MAX_SPREAD_EXCEEDED", 25, 25);
        NOT_FRACTIONALLY_TRADABLE = new ResponseCategory("NOT_FRACTIONALLY_TRADABLE", 26, 26);
        NO_PRICE = new ResponseCategory("NO_PRICE", 27, 27);
        NO_ROUTABLE_VENUE = new ResponseCategory("NO_ROUTABLE_VENUE", 28, 28);
        FRACTIONAL_TRADING_DISABLED = new ResponseCategory("FRACTIONAL_TRADING_DISABLED", 29, 29);
        DELAYED_EXTENDED_HOURS = new ResponseCategory("DELAYED_EXTENDED_HOURS", 30, 30);
        INSUFFICIENT_RESERVED_BUYING_POWER = new ResponseCategory("INSUFFICIENT_RESERVED_BUYING_POWER", 31, 31);
        MAX_ORDER_NOTIONAL_EXCEEDED = new ResponseCategory("MAX_ORDER_NOTIONAL_EXCEEDED", 32, 32);
        MAX_ORDER_QUANTITY_EXCEEDED = new ResponseCategory("MAX_ORDER_QUANTITY_EXCEEDED", 33, 33);
        NBBO_ADV_THRESHOLD_EXCEEDED = new ResponseCategory("NBBO_ADV_THRESHOLD_EXCEEDED", 34, 34);
        MANUAL_BULK_ACTION_CANCEL = new ResponseCategory("MANUAL_BULK_ACTION_CANCEL", 35, 35);
        VENUE_UNSOLICITED_CANCEL = new ResponseCategory("VENUE_UNSOLICITED_CANCEL", 36, 36);
        EXCEEDED_TRADING_AGGREGATE_MACS = new ResponseCategory("EXCEEDED_TRADING_AGGREGATE_MACS", 37, 37);
        UNREGISTERED_UPSTREAM_ORDER = new ResponseCategory("UNREGISTERED_UPSTREAM_ORDER", 38, 38);
        SYMBOL_NOT_ADT_ELIGIBLE = new ResponseCategory("SYMBOL_NOT_ADT_ELIGIBLE", 39, 39);
        EXTERNAL_HALT = new ResponseCategory("EXTERNAL_HALT", 40, 40);
        STALE_GFD = new ResponseCategory("STALE_GFD", 41, 41);
        MARKET_ORDER_ADV_THRESHOLD_EXCEEDED = new ResponseCategory("MARKET_ORDER_ADV_THRESHOLD_EXCEEDED", 42, 42);
        RATE_LIMITED = new ResponseCategory("RATE_LIMITED", 43, 43);
        INVALID_PRICE = new ResponseCategory("INVALID_PRICE", 44, 44);
        PRICE_OUTSIDE_BANDS = new ResponseCategory("PRICE_OUTSIDE_BANDS", 45, 45);
        INVALID_TIME_WINDOW = new ResponseCategory("INVALID_TIME_WINDOW", 46, 46);
        INVALID_QUANTITY = new ResponseCategory("INVALID_QUANTITY", 47, 47);
        INVALID_INSTRUMENT = new ResponseCategory("INVALID_INSTRUMENT", 48, 48);
        OLD_ORDER_EXECUTED = new ResponseCategory("OLD_ORDER_EXECUTED", 49, 49);
        ADV_MAC_VIOLATION_TO_REVIEW = new ResponseCategory("ADV_MAC_VIOLATION_TO_REVIEW", 50, 50);
        INVALID_SIDE = new ResponseCategory("INVALID_SIDE", 51, 51);
        ORDER_TOO_SMALL = new ResponseCategory("ORDER_TOO_SMALL", 52, 52);
        LOCATE_FAILED = new ResponseCategory("LOCATE_FAILED", 53, 53);
        ORDER_TYPE_NOT_SUPPORTED = new ResponseCategory("ORDER_TYPE_NOT_SUPPORTED", 54, 54);
        FX_PRINCIPAL_TRADING_DISABLED = new ResponseCategory("FX_PRINCIPAL_TRADING_DISABLED", 55, 55);
        FAILED_PRECONDITION = new ResponseCategory("FAILED_PRECONDITION", 56, 56);
        SERVER_ERROR = new ResponseCategory("SERVER_ERROR", 57, 57);
        ResponseCategory[] responseCategoryArr$values = $values();
        $VALUES = responseCategoryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(responseCategoryArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ResponseCategory.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ResponseCategory>(orCreateKotlinClass, syntax, responseCategory) { // from class: rosetta.order.ResponseCategory$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ResponseCategory fromValue(int value) {
                return ResponseCategory.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ResponseCategory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/ResponseCategory$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/ResponseCategory;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ResponseCategory fromValue(int value) {
            switch (value) {
                case 0:
                    return ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED;
                case 1:
                    return ResponseCategory.SUCCESS;
                case 2:
                    return ResponseCategory.INVALID_STOP;
                case 3:
                    return ResponseCategory.INVALID_LIMIT;
                case 4:
                    return ResponseCategory.INVALID_SPREAD;
                case 5:
                    return ResponseCategory.ORDER_TOO_BIG;
                case 6:
                    return ResponseCategory.CORPORATE_ACTION;
                case 7:
                    return ResponseCategory.END_OF_DAY;
                case 8:
                    return ResponseCategory.STALE_GTC;
                case 9:
                    return ResponseCategory.UNSUPPORTED_SYMBOL;
                case 10:
                    return ResponseCategory.VENUE_ERROR;
                case 11:
                    return ResponseCategory.MAINST_ERROR;
                case 12:
                    return ResponseCategory.NETWORK_ERROR;
                case 13:
                    return ResponseCategory.FAILED_BEFORE_MAINST;
                case 14:
                    return ResponseCategory.SLOW_TO_MARKET;
                case 15:
                    return ResponseCategory.GET_OUT;
                case 16:
                    return ResponseCategory.RETRY;
                case 17:
                    return ResponseCategory.BUYING_POWER;
                case 18:
                    return ResponseCategory.UNKNOWN;
                case 19:
                    return ResponseCategory.FIRM_ORDER_CANCELLED;
                case 20:
                    return ResponseCategory.FIRM_ORDER_FAILED;
                case 21:
                    return ResponseCategory.FIRM_ORDER_REJECTED;
                case 22:
                    return ResponseCategory.NOT_MARKETABLE;
                case 23:
                    return ResponseCategory.CANCEL_REQUEST;
                case 24:
                    return ResponseCategory.CANCEL_ADJUSTMENT;
                case 25:
                    return ResponseCategory.MAX_SPREAD_EXCEEDED;
                case 26:
                    return ResponseCategory.NOT_FRACTIONALLY_TRADABLE;
                case 27:
                    return ResponseCategory.NO_PRICE;
                case 28:
                    return ResponseCategory.NO_ROUTABLE_VENUE;
                case 29:
                    return ResponseCategory.FRACTIONAL_TRADING_DISABLED;
                case 30:
                    return ResponseCategory.DELAYED_EXTENDED_HOURS;
                case 31:
                    return ResponseCategory.INSUFFICIENT_RESERVED_BUYING_POWER;
                case 32:
                    return ResponseCategory.MAX_ORDER_NOTIONAL_EXCEEDED;
                case 33:
                    return ResponseCategory.MAX_ORDER_QUANTITY_EXCEEDED;
                case 34:
                    return ResponseCategory.NBBO_ADV_THRESHOLD_EXCEEDED;
                case 35:
                    return ResponseCategory.MANUAL_BULK_ACTION_CANCEL;
                case 36:
                    return ResponseCategory.VENUE_UNSOLICITED_CANCEL;
                case 37:
                    return ResponseCategory.EXCEEDED_TRADING_AGGREGATE_MACS;
                case 38:
                    return ResponseCategory.UNREGISTERED_UPSTREAM_ORDER;
                case 39:
                    return ResponseCategory.SYMBOL_NOT_ADT_ELIGIBLE;
                case 40:
                    return ResponseCategory.EXTERNAL_HALT;
                case 41:
                    return ResponseCategory.STALE_GFD;
                case 42:
                    return ResponseCategory.MARKET_ORDER_ADV_THRESHOLD_EXCEEDED;
                case 43:
                    return ResponseCategory.RATE_LIMITED;
                case 44:
                    return ResponseCategory.INVALID_PRICE;
                case 45:
                    return ResponseCategory.PRICE_OUTSIDE_BANDS;
                case 46:
                    return ResponseCategory.INVALID_TIME_WINDOW;
                case 47:
                    return ResponseCategory.INVALID_QUANTITY;
                case 48:
                    return ResponseCategory.INVALID_INSTRUMENT;
                case 49:
                    return ResponseCategory.OLD_ORDER_EXECUTED;
                case 50:
                    return ResponseCategory.ADV_MAC_VIOLATION_TO_REVIEW;
                case 51:
                    return ResponseCategory.INVALID_SIDE;
                case 52:
                    return ResponseCategory.ORDER_TOO_SMALL;
                case 53:
                    return ResponseCategory.LOCATE_FAILED;
                case 54:
                    return ResponseCategory.ORDER_TYPE_NOT_SUPPORTED;
                case 55:
                    return ResponseCategory.FX_PRINCIPAL_TRADING_DISABLED;
                case 56:
                    return ResponseCategory.FAILED_PRECONDITION;
                case 57:
                    return ResponseCategory.SERVER_ERROR;
                default:
                    return null;
            }
        }
    }

    public static ResponseCategory valueOf(String str) {
        return (ResponseCategory) Enum.valueOf(ResponseCategory.class, str);
    }

    public static ResponseCategory[] values() {
        return (ResponseCategory[]) $VALUES.clone();
    }
}
