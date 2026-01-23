package rosetta.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
/* compiled from: ResponseCategoryDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b?\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002LMB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020JH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bD¨\u0006N"}, m3636d2 = {"Lrosetta/order/ResponseCategoryDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/ResponseCategory;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "RESPONSE_CATEGORY_UNSPECIFIED", "SUCCESS", "INVALID_STOP", "INVALID_LIMIT", "INVALID_SPREAD", "ORDER_TOO_BIG", "CORPORATE_ACTION", "END_OF_DAY", "STALE_GTC", "UNSUPPORTED_SYMBOL", "VENUE_ERROR", "MAINST_ERROR", "NETWORK_ERROR", "FAILED_BEFORE_MAINST", "SLOW_TO_MARKET", "GET_OUT", "RETRY", "BUYING_POWER", "UNKNOWN", "FIRM_ORDER_CANCELLED", "FIRM_ORDER_FAILED", "FIRM_ORDER_REJECTED", "NOT_MARKETABLE", "CANCEL_REQUEST", "CANCEL_ADJUSTMENT", "MAX_SPREAD_EXCEEDED", "NOT_FRACTIONALLY_TRADABLE", "NO_PRICE", "NO_ROUTABLE_VENUE", "FRACTIONAL_TRADING_DISABLED", "DELAYED_EXTENDED_HOURS", "INSUFFICIENT_RESERVED_BUYING_POWER", "MAX_ORDER_NOTIONAL_EXCEEDED", "MAX_ORDER_QUANTITY_EXCEEDED", "NBBO_ADV_THRESHOLD_EXCEEDED", "MANUAL_BULK_ACTION_CANCEL", "VENUE_UNSOLICITED_CANCEL", "EXCEEDED_TRADING_AGGREGATE_MACS", "UNREGISTERED_UPSTREAM_ORDER", "SYMBOL_NOT_ADT_ELIGIBLE", "EXTERNAL_HALT", "STALE_GFD", "MARKET_ORDER_ADV_THRESHOLD_EXCEEDED", "RATE_LIMITED", "INVALID_PRICE", "PRICE_OUTSIDE_BANDS", "INVALID_TIME_WINDOW", "INVALID_QUANTITY", "INVALID_INSTRUMENT", "OLD_ORDER_EXECUTED", "ADV_MAC_VIOLATION_TO_REVIEW", "INVALID_SIDE", "ORDER_TOO_SMALL", "LOCATE_FAILED", "ORDER_TYPE_NOT_SUPPORTED", "FX_PRINCIPAL_TRADING_DISABLED", "FAILED_PRECONDITION", "SERVER_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class ResponseCategoryDto implements Dto2<ResponseCategory>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResponseCategoryDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ResponseCategoryDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ResponseCategoryDto, ResponseCategory>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final ResponseCategoryDto RESPONSE_CATEGORY_UNSPECIFIED = new ResponseCategoryDto("RESPONSE_CATEGORY_UNSPECIFIED", 0) { // from class: rosetta.order.ResponseCategoryDto.RESPONSE_CATEGORY_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED;
        }
    };
    public static final ResponseCategoryDto SUCCESS = new ResponseCategoryDto("SUCCESS", 1) { // from class: rosetta.order.ResponseCategoryDto.SUCCESS
        {
            String str = "success";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.SUCCESS;
        }
    };
    public static final ResponseCategoryDto INVALID_STOP = new ResponseCategoryDto("INVALID_STOP", 2) { // from class: rosetta.order.ResponseCategoryDto.INVALID_STOP
        {
            String str = "invalid_stop";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INVALID_STOP;
        }
    };
    public static final ResponseCategoryDto INVALID_LIMIT = new ResponseCategoryDto("INVALID_LIMIT", 3) { // from class: rosetta.order.ResponseCategoryDto.INVALID_LIMIT
        {
            String str = "invalid_limit";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INVALID_LIMIT;
        }
    };
    public static final ResponseCategoryDto INVALID_SPREAD = new ResponseCategoryDto("INVALID_SPREAD", 4) { // from class: rosetta.order.ResponseCategoryDto.INVALID_SPREAD
        {
            String str = "invalid_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INVALID_SPREAD;
        }
    };
    public static final ResponseCategoryDto ORDER_TOO_BIG = new ResponseCategoryDto("ORDER_TOO_BIG", 5) { // from class: rosetta.order.ResponseCategoryDto.ORDER_TOO_BIG
        {
            String str = "order_too_big";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.ORDER_TOO_BIG;
        }
    };
    public static final ResponseCategoryDto CORPORATE_ACTION = new ResponseCategoryDto("CORPORATE_ACTION", 6) { // from class: rosetta.order.ResponseCategoryDto.CORPORATE_ACTION
        {
            String str = "corporate_action";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.CORPORATE_ACTION;
        }
    };
    public static final ResponseCategoryDto END_OF_DAY = new ResponseCategoryDto("END_OF_DAY", 7) { // from class: rosetta.order.ResponseCategoryDto.END_OF_DAY
        {
            String str = "end_of_day";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.END_OF_DAY;
        }
    };
    public static final ResponseCategoryDto STALE_GTC = new ResponseCategoryDto("STALE_GTC", 8) { // from class: rosetta.order.ResponseCategoryDto.STALE_GTC
        {
            String str = "stale_gtc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.STALE_GTC;
        }
    };
    public static final ResponseCategoryDto UNSUPPORTED_SYMBOL = new ResponseCategoryDto("UNSUPPORTED_SYMBOL", 9) { // from class: rosetta.order.ResponseCategoryDto.UNSUPPORTED_SYMBOL
        {
            String str = "unsupported_symbol";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.UNSUPPORTED_SYMBOL;
        }
    };
    public static final ResponseCategoryDto VENUE_ERROR = new ResponseCategoryDto("VENUE_ERROR", 10) { // from class: rosetta.order.ResponseCategoryDto.VENUE_ERROR
        {
            String str = "venue_error";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.VENUE_ERROR;
        }
    };
    public static final ResponseCategoryDto MAINST_ERROR = new ResponseCategoryDto("MAINST_ERROR", 11) { // from class: rosetta.order.ResponseCategoryDto.MAINST_ERROR
        {
            String str = "mainst_error";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.MAINST_ERROR;
        }
    };
    public static final ResponseCategoryDto NETWORK_ERROR = new ResponseCategoryDto("NETWORK_ERROR", 12) { // from class: rosetta.order.ResponseCategoryDto.NETWORK_ERROR
        {
            String str = AnalyticsStrings.TAB_CRYPTO_UPGRADE_AGREEMENT_NETWORK_ERROR;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.NETWORK_ERROR;
        }
    };
    public static final ResponseCategoryDto FAILED_BEFORE_MAINST = new ResponseCategoryDto("FAILED_BEFORE_MAINST", 13) { // from class: rosetta.order.ResponseCategoryDto.FAILED_BEFORE_MAINST
        {
            String str = "failed_before_mainst";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.FAILED_BEFORE_MAINST;
        }
    };
    public static final ResponseCategoryDto SLOW_TO_MARKET = new ResponseCategoryDto("SLOW_TO_MARKET", 14) { // from class: rosetta.order.ResponseCategoryDto.SLOW_TO_MARKET
        {
            String str = "slow_to_market";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.SLOW_TO_MARKET;
        }
    };
    public static final ResponseCategoryDto GET_OUT = new ResponseCategoryDto("GET_OUT", 15) { // from class: rosetta.order.ResponseCategoryDto.GET_OUT
        {
            String str = "get_out";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.GET_OUT;
        }
    };
    public static final ResponseCategoryDto RETRY = new ResponseCategoryDto("RETRY", 16) { // from class: rosetta.order.ResponseCategoryDto.RETRY
        {
            String str = AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.RETRY;
        }
    };
    public static final ResponseCategoryDto BUYING_POWER = new ResponseCategoryDto("BUYING_POWER", 17) { // from class: rosetta.order.ResponseCategoryDto.BUYING_POWER
        {
            String str = "insufficient_buying_power";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.BUYING_POWER;
        }
    };
    public static final ResponseCategoryDto UNKNOWN = new ResponseCategoryDto("UNKNOWN", 18) { // from class: rosetta.order.ResponseCategoryDto.UNKNOWN
        {
            String str = "unknown";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.UNKNOWN;
        }
    };
    public static final ResponseCategoryDto FIRM_ORDER_CANCELLED = new ResponseCategoryDto("FIRM_ORDER_CANCELLED", 19) { // from class: rosetta.order.ResponseCategoryDto.FIRM_ORDER_CANCELLED
        {
            String str = "firm_order_cancelled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.FIRM_ORDER_CANCELLED;
        }
    };
    public static final ResponseCategoryDto FIRM_ORDER_FAILED = new ResponseCategoryDto("FIRM_ORDER_FAILED", 20) { // from class: rosetta.order.ResponseCategoryDto.FIRM_ORDER_FAILED
        {
            String str = "firm_order_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.FIRM_ORDER_FAILED;
        }
    };
    public static final ResponseCategoryDto FIRM_ORDER_REJECTED = new ResponseCategoryDto("FIRM_ORDER_REJECTED", 21) { // from class: rosetta.order.ResponseCategoryDto.FIRM_ORDER_REJECTED
        {
            String str = "firm_order_rejected";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.FIRM_ORDER_REJECTED;
        }
    };
    public static final ResponseCategoryDto NOT_MARKETABLE = new ResponseCategoryDto("NOT_MARKETABLE", 22) { // from class: rosetta.order.ResponseCategoryDto.NOT_MARKETABLE
        {
            String str = "not_marketable";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.NOT_MARKETABLE;
        }
    };
    public static final ResponseCategoryDto CANCEL_REQUEST = new ResponseCategoryDto("CANCEL_REQUEST", 23) { // from class: rosetta.order.ResponseCategoryDto.CANCEL_REQUEST
        {
            String str = "cancel_request";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.CANCEL_REQUEST;
        }
    };
    public static final ResponseCategoryDto CANCEL_ADJUSTMENT = new ResponseCategoryDto("CANCEL_ADJUSTMENT", 24) { // from class: rosetta.order.ResponseCategoryDto.CANCEL_ADJUSTMENT
        {
            String str = "cancel_adjustment";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.CANCEL_ADJUSTMENT;
        }
    };
    public static final ResponseCategoryDto MAX_SPREAD_EXCEEDED = new ResponseCategoryDto("MAX_SPREAD_EXCEEDED", 25) { // from class: rosetta.order.ResponseCategoryDto.MAX_SPREAD_EXCEEDED
        {
            String str = "max_spread_exceeded";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.MAX_SPREAD_EXCEEDED;
        }
    };
    public static final ResponseCategoryDto NOT_FRACTIONALLY_TRADABLE = new ResponseCategoryDto("NOT_FRACTIONALLY_TRADABLE", 26) { // from class: rosetta.order.ResponseCategoryDto.NOT_FRACTIONALLY_TRADABLE
        {
            String str = "not_fractionally_tradable";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.NOT_FRACTIONALLY_TRADABLE;
        }
    };
    public static final ResponseCategoryDto NO_PRICE = new ResponseCategoryDto("NO_PRICE", 27) { // from class: rosetta.order.ResponseCategoryDto.NO_PRICE
        {
            String str = "no_price";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.NO_PRICE;
        }
    };
    public static final ResponseCategoryDto NO_ROUTABLE_VENUE = new ResponseCategoryDto("NO_ROUTABLE_VENUE", 28) { // from class: rosetta.order.ResponseCategoryDto.NO_ROUTABLE_VENUE
        {
            String str = "no_routable_venue";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.NO_ROUTABLE_VENUE;
        }
    };
    public static final ResponseCategoryDto FRACTIONAL_TRADING_DISABLED = new ResponseCategoryDto("FRACTIONAL_TRADING_DISABLED", 29) { // from class: rosetta.order.ResponseCategoryDto.FRACTIONAL_TRADING_DISABLED
        {
            String str = "fractional_trading_disabled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.FRACTIONAL_TRADING_DISABLED;
        }
    };
    public static final ResponseCategoryDto DELAYED_EXTENDED_HOURS = new ResponseCategoryDto("DELAYED_EXTENDED_HOURS", 30) { // from class: rosetta.order.ResponseCategoryDto.DELAYED_EXTENDED_HOURS
        {
            String str = "delayed_extended_hours";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.DELAYED_EXTENDED_HOURS;
        }
    };
    public static final ResponseCategoryDto INSUFFICIENT_RESERVED_BUYING_POWER = new ResponseCategoryDto("INSUFFICIENT_RESERVED_BUYING_POWER", 31) { // from class: rosetta.order.ResponseCategoryDto.INSUFFICIENT_RESERVED_BUYING_POWER
        {
            String str = "insufficient_reserved_buying_power";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INSUFFICIENT_RESERVED_BUYING_POWER;
        }
    };
    public static final ResponseCategoryDto MAX_ORDER_NOTIONAL_EXCEEDED = new ResponseCategoryDto("MAX_ORDER_NOTIONAL_EXCEEDED", 32) { // from class: rosetta.order.ResponseCategoryDto.MAX_ORDER_NOTIONAL_EXCEEDED
        {
            String str = "max_order_notional_exceeded";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.MAX_ORDER_NOTIONAL_EXCEEDED;
        }
    };
    public static final ResponseCategoryDto MAX_ORDER_QUANTITY_EXCEEDED = new ResponseCategoryDto("MAX_ORDER_QUANTITY_EXCEEDED", 33) { // from class: rosetta.order.ResponseCategoryDto.MAX_ORDER_QUANTITY_EXCEEDED
        {
            String str = "max_order_quantity_exceeded";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.MAX_ORDER_QUANTITY_EXCEEDED;
        }
    };
    public static final ResponseCategoryDto NBBO_ADV_THRESHOLD_EXCEEDED = new ResponseCategoryDto("NBBO_ADV_THRESHOLD_EXCEEDED", 34) { // from class: rosetta.order.ResponseCategoryDto.NBBO_ADV_THRESHOLD_EXCEEDED
        {
            String str = "nbbo_adv_threshold_exceeded";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.NBBO_ADV_THRESHOLD_EXCEEDED;
        }
    };
    public static final ResponseCategoryDto MANUAL_BULK_ACTION_CANCEL = new ResponseCategoryDto("MANUAL_BULK_ACTION_CANCEL", 35) { // from class: rosetta.order.ResponseCategoryDto.MANUAL_BULK_ACTION_CANCEL
        {
            String str = "manual_bulk_action_cancel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.MANUAL_BULK_ACTION_CANCEL;
        }
    };
    public static final ResponseCategoryDto VENUE_UNSOLICITED_CANCEL = new ResponseCategoryDto("VENUE_UNSOLICITED_CANCEL", 36) { // from class: rosetta.order.ResponseCategoryDto.VENUE_UNSOLICITED_CANCEL
        {
            String str = "venue_unsolicited_cancel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.VENUE_UNSOLICITED_CANCEL;
        }
    };
    public static final ResponseCategoryDto EXCEEDED_TRADING_AGGREGATE_MACS = new ResponseCategoryDto("EXCEEDED_TRADING_AGGREGATE_MACS", 37) { // from class: rosetta.order.ResponseCategoryDto.EXCEEDED_TRADING_AGGREGATE_MACS
        {
            String str = "exceeded_trading_aggregate_macs";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.EXCEEDED_TRADING_AGGREGATE_MACS;
        }
    };
    public static final ResponseCategoryDto UNREGISTERED_UPSTREAM_ORDER = new ResponseCategoryDto("UNREGISTERED_UPSTREAM_ORDER", 38) { // from class: rosetta.order.ResponseCategoryDto.UNREGISTERED_UPSTREAM_ORDER
        {
            String str = "unregistered_upstream_order";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.UNREGISTERED_UPSTREAM_ORDER;
        }
    };
    public static final ResponseCategoryDto SYMBOL_NOT_ADT_ELIGIBLE = new ResponseCategoryDto("SYMBOL_NOT_ADT_ELIGIBLE", 39) { // from class: rosetta.order.ResponseCategoryDto.SYMBOL_NOT_ADT_ELIGIBLE
        {
            String str = "symbol_not_adt_eligible";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.SYMBOL_NOT_ADT_ELIGIBLE;
        }
    };
    public static final ResponseCategoryDto EXTERNAL_HALT = new ResponseCategoryDto("EXTERNAL_HALT", 40) { // from class: rosetta.order.ResponseCategoryDto.EXTERNAL_HALT
        {
            String str = "external_halt";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.EXTERNAL_HALT;
        }
    };
    public static final ResponseCategoryDto STALE_GFD = new ResponseCategoryDto("STALE_GFD", 41) { // from class: rosetta.order.ResponseCategoryDto.STALE_GFD
        {
            String str = "stale_gfd";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.STALE_GFD;
        }
    };
    public static final ResponseCategoryDto MARKET_ORDER_ADV_THRESHOLD_EXCEEDED = new ResponseCategoryDto("MARKET_ORDER_ADV_THRESHOLD_EXCEEDED", 42) { // from class: rosetta.order.ResponseCategoryDto.MARKET_ORDER_ADV_THRESHOLD_EXCEEDED
        {
            String str = "market_order_adv_threshold_exceed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.MARKET_ORDER_ADV_THRESHOLD_EXCEEDED;
        }
    };
    public static final ResponseCategoryDto RATE_LIMITED = new ResponseCategoryDto("RATE_LIMITED", 43) { // from class: rosetta.order.ResponseCategoryDto.RATE_LIMITED
        {
            String str = "rate_limited";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.RATE_LIMITED;
        }
    };
    public static final ResponseCategoryDto INVALID_PRICE = new ResponseCategoryDto("INVALID_PRICE", 44) { // from class: rosetta.order.ResponseCategoryDto.INVALID_PRICE
        {
            String str = "invalid_price";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INVALID_PRICE;
        }
    };
    public static final ResponseCategoryDto PRICE_OUTSIDE_BANDS = new ResponseCategoryDto("PRICE_OUTSIDE_BANDS", 45) { // from class: rosetta.order.ResponseCategoryDto.PRICE_OUTSIDE_BANDS
        {
            String str = "price_outside_bands";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.PRICE_OUTSIDE_BANDS;
        }
    };
    public static final ResponseCategoryDto INVALID_TIME_WINDOW = new ResponseCategoryDto("INVALID_TIME_WINDOW", 46) { // from class: rosetta.order.ResponseCategoryDto.INVALID_TIME_WINDOW
        {
            String str = "invalid_time_window";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INVALID_TIME_WINDOW;
        }
    };
    public static final ResponseCategoryDto INVALID_QUANTITY = new ResponseCategoryDto("INVALID_QUANTITY", 47) { // from class: rosetta.order.ResponseCategoryDto.INVALID_QUANTITY
        {
            String str = "invalid_quantity";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INVALID_QUANTITY;
        }
    };
    public static final ResponseCategoryDto INVALID_INSTRUMENT = new ResponseCategoryDto("INVALID_INSTRUMENT", 48) { // from class: rosetta.order.ResponseCategoryDto.INVALID_INSTRUMENT
        {
            String str = "invalid_instrument";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INVALID_INSTRUMENT;
        }
    };
    public static final ResponseCategoryDto OLD_ORDER_EXECUTED = new ResponseCategoryDto("OLD_ORDER_EXECUTED", 49) { // from class: rosetta.order.ResponseCategoryDto.OLD_ORDER_EXECUTED
        {
            String str = "old_order_executed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.OLD_ORDER_EXECUTED;
        }
    };
    public static final ResponseCategoryDto ADV_MAC_VIOLATION_TO_REVIEW = new ResponseCategoryDto("ADV_MAC_VIOLATION_TO_REVIEW", 50) { // from class: rosetta.order.ResponseCategoryDto.ADV_MAC_VIOLATION_TO_REVIEW
        {
            String str = "adv_mac_violation_to_review";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.ADV_MAC_VIOLATION_TO_REVIEW;
        }
    };
    public static final ResponseCategoryDto INVALID_SIDE = new ResponseCategoryDto("INVALID_SIDE", 51) { // from class: rosetta.order.ResponseCategoryDto.INVALID_SIDE
        {
            String str = "invalid_side";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.INVALID_SIDE;
        }
    };
    public static final ResponseCategoryDto ORDER_TOO_SMALL = new ResponseCategoryDto("ORDER_TOO_SMALL", 52) { // from class: rosetta.order.ResponseCategoryDto.ORDER_TOO_SMALL
        {
            String str = "order_too_small";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.ORDER_TOO_SMALL;
        }
    };
    public static final ResponseCategoryDto LOCATE_FAILED = new ResponseCategoryDto("LOCATE_FAILED", 53) { // from class: rosetta.order.ResponseCategoryDto.LOCATE_FAILED
        {
            String str = "locate_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.LOCATE_FAILED;
        }
    };
    public static final ResponseCategoryDto ORDER_TYPE_NOT_SUPPORTED = new ResponseCategoryDto("ORDER_TYPE_NOT_SUPPORTED", 54) { // from class: rosetta.order.ResponseCategoryDto.ORDER_TYPE_NOT_SUPPORTED
        {
            String str = "order_type_not_supported";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.ORDER_TYPE_NOT_SUPPORTED;
        }
    };
    public static final ResponseCategoryDto FX_PRINCIPAL_TRADING_DISABLED = new ResponseCategoryDto("FX_PRINCIPAL_TRADING_DISABLED", 55) { // from class: rosetta.order.ResponseCategoryDto.FX_PRINCIPAL_TRADING_DISABLED
        {
            String str = "fx_principal_trading_disabled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.FX_PRINCIPAL_TRADING_DISABLED;
        }
    };
    public static final ResponseCategoryDto FAILED_PRECONDITION = new ResponseCategoryDto("FAILED_PRECONDITION", 56) { // from class: rosetta.order.ResponseCategoryDto.FAILED_PRECONDITION
        {
            String str = "failed_precondition";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.FAILED_PRECONDITION;
        }
    };
    public static final ResponseCategoryDto SERVER_ERROR = new ResponseCategoryDto("SERVER_ERROR", 57) { // from class: rosetta.order.ResponseCategoryDto.SERVER_ERROR
        {
            String str = "server_error";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ResponseCategory toProto() {
            return ResponseCategory.SERVER_ERROR;
        }
    };

    private static final /* synthetic */ ResponseCategoryDto[] $values() {
        return new ResponseCategoryDto[]{RESPONSE_CATEGORY_UNSPECIFIED, SUCCESS, INVALID_STOP, INVALID_LIMIT, INVALID_SPREAD, ORDER_TOO_BIG, CORPORATE_ACTION, END_OF_DAY, STALE_GTC, UNSUPPORTED_SYMBOL, VENUE_ERROR, MAINST_ERROR, NETWORK_ERROR, FAILED_BEFORE_MAINST, SLOW_TO_MARKET, GET_OUT, RETRY, BUYING_POWER, UNKNOWN, FIRM_ORDER_CANCELLED, FIRM_ORDER_FAILED, FIRM_ORDER_REJECTED, NOT_MARKETABLE, CANCEL_REQUEST, CANCEL_ADJUSTMENT, MAX_SPREAD_EXCEEDED, NOT_FRACTIONALLY_TRADABLE, NO_PRICE, NO_ROUTABLE_VENUE, FRACTIONAL_TRADING_DISABLED, DELAYED_EXTENDED_HOURS, INSUFFICIENT_RESERVED_BUYING_POWER, MAX_ORDER_NOTIONAL_EXCEEDED, MAX_ORDER_QUANTITY_EXCEEDED, NBBO_ADV_THRESHOLD_EXCEEDED, MANUAL_BULK_ACTION_CANCEL, VENUE_UNSOLICITED_CANCEL, EXCEEDED_TRADING_AGGREGATE_MACS, UNREGISTERED_UPSTREAM_ORDER, SYMBOL_NOT_ADT_ELIGIBLE, EXTERNAL_HALT, STALE_GFD, MARKET_ORDER_ADV_THRESHOLD_EXCEEDED, RATE_LIMITED, INVALID_PRICE, PRICE_OUTSIDE_BANDS, INVALID_TIME_WINDOW, INVALID_QUANTITY, INVALID_INSTRUMENT, OLD_ORDER_EXECUTED, ADV_MAC_VIOLATION_TO_REVIEW, INVALID_SIDE, ORDER_TOO_SMALL, LOCATE_FAILED, ORDER_TYPE_NOT_SUPPORTED, FX_PRINCIPAL_TRADING_DISABLED, FAILED_PRECONDITION, SERVER_ERROR};
    }

    public /* synthetic */ ResponseCategoryDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<ResponseCategoryDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ResponseCategoryDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        ResponseCategoryDto[] responseCategoryDtoArr$values = $values();
        $VALUES = responseCategoryDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(responseCategoryDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.ResponseCategoryDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResponseCategoryDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ResponseCategoryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/ResponseCategoryDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/ResponseCategoryDto;", "Lrosetta/order/ResponseCategory;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/ResponseCategoryDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ResponseCategoryDto, ResponseCategory> {

        /* compiled from: ResponseCategoryDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ResponseCategory.values().length];
                try {
                    iArr[ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ResponseCategory.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ResponseCategory.INVALID_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ResponseCategory.INVALID_LIMIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ResponseCategory.INVALID_SPREAD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ResponseCategory.ORDER_TOO_BIG.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ResponseCategory.CORPORATE_ACTION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ResponseCategory.END_OF_DAY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ResponseCategory.STALE_GTC.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ResponseCategory.UNSUPPORTED_SYMBOL.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ResponseCategory.VENUE_ERROR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ResponseCategory.MAINST_ERROR.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ResponseCategory.NETWORK_ERROR.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ResponseCategory.FAILED_BEFORE_MAINST.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ResponseCategory.SLOW_TO_MARKET.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ResponseCategory.GET_OUT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ResponseCategory.RETRY.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[ResponseCategory.BUYING_POWER.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[ResponseCategory.UNKNOWN.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[ResponseCategory.FIRM_ORDER_CANCELLED.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[ResponseCategory.FIRM_ORDER_FAILED.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[ResponseCategory.FIRM_ORDER_REJECTED.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[ResponseCategory.NOT_MARKETABLE.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[ResponseCategory.CANCEL_REQUEST.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[ResponseCategory.CANCEL_ADJUSTMENT.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[ResponseCategory.MAX_SPREAD_EXCEEDED.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[ResponseCategory.NOT_FRACTIONALLY_TRADABLE.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[ResponseCategory.NO_PRICE.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[ResponseCategory.NO_ROUTABLE_VENUE.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[ResponseCategory.FRACTIONAL_TRADING_DISABLED.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[ResponseCategory.DELAYED_EXTENDED_HOURS.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[ResponseCategory.INSUFFICIENT_RESERVED_BUYING_POWER.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[ResponseCategory.MAX_ORDER_NOTIONAL_EXCEEDED.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[ResponseCategory.MAX_ORDER_QUANTITY_EXCEEDED.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[ResponseCategory.NBBO_ADV_THRESHOLD_EXCEEDED.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[ResponseCategory.MANUAL_BULK_ACTION_CANCEL.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[ResponseCategory.VENUE_UNSOLICITED_CANCEL.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[ResponseCategory.EXCEEDED_TRADING_AGGREGATE_MACS.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[ResponseCategory.UNREGISTERED_UPSTREAM_ORDER.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[ResponseCategory.SYMBOL_NOT_ADT_ELIGIBLE.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[ResponseCategory.EXTERNAL_HALT.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[ResponseCategory.STALE_GFD.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[ResponseCategory.MARKET_ORDER_ADV_THRESHOLD_EXCEEDED.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[ResponseCategory.RATE_LIMITED.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[ResponseCategory.INVALID_PRICE.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[ResponseCategory.PRICE_OUTSIDE_BANDS.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[ResponseCategory.INVALID_TIME_WINDOW.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[ResponseCategory.INVALID_QUANTITY.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[ResponseCategory.INVALID_INSTRUMENT.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[ResponseCategory.OLD_ORDER_EXECUTED.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[ResponseCategory.ADV_MAC_VIOLATION_TO_REVIEW.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[ResponseCategory.INVALID_SIDE.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[ResponseCategory.ORDER_TOO_SMALL.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[ResponseCategory.LOCATE_FAILED.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[ResponseCategory.ORDER_TYPE_NOT_SUPPORTED.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[ResponseCategory.FX_PRINCIPAL_TRADING_DISABLED.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[ResponseCategory.FAILED_PRECONDITION.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[ResponseCategory.SERVER_ERROR.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ResponseCategoryDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ResponseCategoryDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ResponseCategoryDto> getBinaryBase64Serializer() {
            return (KSerializer) ResponseCategoryDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ResponseCategory> getProtoAdapter() {
            return ResponseCategory.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ResponseCategoryDto getZeroValue() {
            return ResponseCategoryDto.RESPONSE_CATEGORY_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ResponseCategoryDto fromProto(ResponseCategory proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ResponseCategoryDto.RESPONSE_CATEGORY_UNSPECIFIED;
                case 2:
                    return ResponseCategoryDto.SUCCESS;
                case 3:
                    return ResponseCategoryDto.INVALID_STOP;
                case 4:
                    return ResponseCategoryDto.INVALID_LIMIT;
                case 5:
                    return ResponseCategoryDto.INVALID_SPREAD;
                case 6:
                    return ResponseCategoryDto.ORDER_TOO_BIG;
                case 7:
                    return ResponseCategoryDto.CORPORATE_ACTION;
                case 8:
                    return ResponseCategoryDto.END_OF_DAY;
                case 9:
                    return ResponseCategoryDto.STALE_GTC;
                case 10:
                    return ResponseCategoryDto.UNSUPPORTED_SYMBOL;
                case 11:
                    return ResponseCategoryDto.VENUE_ERROR;
                case 12:
                    return ResponseCategoryDto.MAINST_ERROR;
                case 13:
                    return ResponseCategoryDto.NETWORK_ERROR;
                case 14:
                    return ResponseCategoryDto.FAILED_BEFORE_MAINST;
                case 15:
                    return ResponseCategoryDto.SLOW_TO_MARKET;
                case 16:
                    return ResponseCategoryDto.GET_OUT;
                case 17:
                    return ResponseCategoryDto.RETRY;
                case 18:
                    return ResponseCategoryDto.BUYING_POWER;
                case 19:
                    return ResponseCategoryDto.UNKNOWN;
                case 20:
                    return ResponseCategoryDto.FIRM_ORDER_CANCELLED;
                case 21:
                    return ResponseCategoryDto.FIRM_ORDER_FAILED;
                case 22:
                    return ResponseCategoryDto.FIRM_ORDER_REJECTED;
                case 23:
                    return ResponseCategoryDto.NOT_MARKETABLE;
                case 24:
                    return ResponseCategoryDto.CANCEL_REQUEST;
                case 25:
                    return ResponseCategoryDto.CANCEL_ADJUSTMENT;
                case 26:
                    return ResponseCategoryDto.MAX_SPREAD_EXCEEDED;
                case 27:
                    return ResponseCategoryDto.NOT_FRACTIONALLY_TRADABLE;
                case 28:
                    return ResponseCategoryDto.NO_PRICE;
                case 29:
                    return ResponseCategoryDto.NO_ROUTABLE_VENUE;
                case 30:
                    return ResponseCategoryDto.FRACTIONAL_TRADING_DISABLED;
                case 31:
                    return ResponseCategoryDto.DELAYED_EXTENDED_HOURS;
                case 32:
                    return ResponseCategoryDto.INSUFFICIENT_RESERVED_BUYING_POWER;
                case 33:
                    return ResponseCategoryDto.MAX_ORDER_NOTIONAL_EXCEEDED;
                case 34:
                    return ResponseCategoryDto.MAX_ORDER_QUANTITY_EXCEEDED;
                case 35:
                    return ResponseCategoryDto.NBBO_ADV_THRESHOLD_EXCEEDED;
                case 36:
                    return ResponseCategoryDto.MANUAL_BULK_ACTION_CANCEL;
                case 37:
                    return ResponseCategoryDto.VENUE_UNSOLICITED_CANCEL;
                case 38:
                    return ResponseCategoryDto.EXCEEDED_TRADING_AGGREGATE_MACS;
                case 39:
                    return ResponseCategoryDto.UNREGISTERED_UPSTREAM_ORDER;
                case 40:
                    return ResponseCategoryDto.SYMBOL_NOT_ADT_ELIGIBLE;
                case 41:
                    return ResponseCategoryDto.EXTERNAL_HALT;
                case 42:
                    return ResponseCategoryDto.STALE_GFD;
                case 43:
                    return ResponseCategoryDto.MARKET_ORDER_ADV_THRESHOLD_EXCEEDED;
                case 44:
                    return ResponseCategoryDto.RATE_LIMITED;
                case 45:
                    return ResponseCategoryDto.INVALID_PRICE;
                case 46:
                    return ResponseCategoryDto.PRICE_OUTSIDE_BANDS;
                case 47:
                    return ResponseCategoryDto.INVALID_TIME_WINDOW;
                case 48:
                    return ResponseCategoryDto.INVALID_QUANTITY;
                case 49:
                    return ResponseCategoryDto.INVALID_INSTRUMENT;
                case 50:
                    return ResponseCategoryDto.OLD_ORDER_EXECUTED;
                case 51:
                    return ResponseCategoryDto.ADV_MAC_VIOLATION_TO_REVIEW;
                case 52:
                    return ResponseCategoryDto.INVALID_SIDE;
                case 53:
                    return ResponseCategoryDto.ORDER_TOO_SMALL;
                case 54:
                    return ResponseCategoryDto.LOCATE_FAILED;
                case 55:
                    return ResponseCategoryDto.ORDER_TYPE_NOT_SUPPORTED;
                case 56:
                    return ResponseCategoryDto.FX_PRINCIPAL_TRADING_DISABLED;
                case 57:
                    return ResponseCategoryDto.FAILED_PRECONDITION;
                case 58:
                    return ResponseCategoryDto.SERVER_ERROR;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ResponseCategoryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/ResponseCategoryDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/ResponseCategoryDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<ResponseCategoryDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ResponseCategoryDto, ResponseCategory> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.ResponseCategory", ResponseCategoryDto.getEntries(), ResponseCategoryDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ResponseCategoryDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ResponseCategoryDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ResponseCategoryDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ResponseCategoryDto valueOf(String str) {
        return (ResponseCategoryDto) Enum.valueOf(ResponseCategoryDto.class, str);
    }

    public static ResponseCategoryDto[] values() {
        return (ResponseCategoryDto[]) $VALUES.clone();
    }
}
