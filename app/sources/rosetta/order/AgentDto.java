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
/* compiled from: AgentDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bQ\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002^_B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\H\u0016J\b\u0010]\u001a\u00020\\H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bV¨\u0006`"}, m3636d2 = {"Lrosetta/order/AgentDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/Agent;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "AGENT_UNSPECIFIED", "AGENT_EMPTY", "AGENT_USER", "AGENT_MAINST", "AGENT_EXECUTION_VENUE", "AGENT_TRADEDESK", "AGENT_BROKEBACK", "AGENT_CORPORATE_ACTION", "AGENT_STALE_GTC", "AGENT_CARAVAN", "AGENT_NUMMUS", "AGENT_SICKLE", "AGENT_EXPIRING_OPTION", "AGENT_GET_OUT", "AGENT_RETRY", "AGENT_UPDATEMARGIN", "AGENT_FRAC_MAINST", "AGENT_DRIP", "AGENT_FRAC_MAINST_ADJUSTMENT_ORDER", "AGENT_RECURRING", "AGENT_FRAC_MAINST_NETTED_ORDER", "AGENT_FRAC_MAINST_PASS_THROUGH_ORDER", "AGENT_TRADEDESK_MANUAL", "AGENT_REFERRAL_INVENTORY", "AGENT_MARGIN_CALL", "AGENT_DAY_TRADES", "AGENT_SYNC_INSTRUMENTS", "AGENT_SYNC_QUIVER_INSTRUMENTS", "AGENT_RESTRICTED_ORDER", "AGENT_IPO_ACCESS_INVALID_PRICE", "AGENT_IPO_ACCESS_NO_ALLOCATION", "AGENT_IPO_ACCESS_PRICE_CHANGED", "AGENT_IPO_ACCESS_PRICE_FINALIZED", "AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE", "AGENT_IPO_ACCESS_MATERIAL_UPDATE", "AGENT_IPO_ACCESS_ORDER_EXPIRATION", "AGENT_IPO_ACCESS_IPO_CANCELED", "AGENT_IPO_ACCESS_IPO_DELAYED", "AGENT_INSUFFICIENT_BUYING_POWER", "AGENT_MAINST_HEALER", "AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER", "AGENT_DEBIT_CARD_REWARD", "AGENT_CHECKOUT_FLOW_RECOMMENDATIONS", "AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST", "AGENT_IPO_ACCESS_USER_MOVED_TO_DSP", "AGENT_USER_SOLICITED", "AGENT_INVENTORY_MANAGEMENT", "AGENT_IPO_ACCESS_USER_IS_EMPLOYEE", "Agent_AGENT_DELAYED_EXTENDED_HOURS", "AGENT_PAYCHECK_INVESTMENT", "AGENT_INVEST_FLOW_USER", "AGENT_RECURRING_RETIREMENT", "AGENT_ORDER_BATCHER", "AGENT_INSUFFICIENT_RESERVED_BUYING_POWER", "AGENT_MARGIN_PRELIM", "AGENT_ADT_KILL_SWITCH", "AGENT_ADVISORY", "AGENT_FRACTIONAL_ROUND_UP", "AGENT_TRADING_VIEW", "AGENT_API_USER", "AGENT_ESTATES_WRITTEN_INSTRUCTION", "AGENT_FUTURES_GENERAL_INTRADAY_RISK", "AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC", "AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT", "AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT", "AGENT_DXTRADE", "AGENT_RHS_TRADING", "AGENT_FRACTIONAL_SHARES_LIQUIDATION", "AGENT_CANCEL_ON_EXTERNAL_HALT", "AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION", "AGENT_FX_PRINCIPAL_TRADING_DISABLED", "AGENT_CRYPTO_FLATTEN", "AGENT_EQUITY_FLATTEN", "AGENT_CRYPTO_PERPETUALS", "AGENT_CRYPTO_TOKENIZATION_FX_CHANGE", "AGENT_BUYIN_ALLOCATION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class AgentDto implements Dto2<Agent>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AgentDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AgentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AgentDto, Agent>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final AgentDto AGENT_UNSPECIFIED = new AgentDto("AGENT_UNSPECIFIED", 0) { // from class: rosetta.order.AgentDto.AGENT_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_UNSPECIFIED;
        }
    };
    public static final AgentDto AGENT_EMPTY = new AgentDto("AGENT_EMPTY", 1) { // from class: rosetta.order.AgentDto.AGENT_EMPTY
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_EMPTY;
        }
    };
    public static final AgentDto AGENT_USER = new AgentDto("AGENT_USER", 2) { // from class: rosetta.order.AgentDto.AGENT_USER
        {
            String str = "user";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_USER;
        }
    };
    public static final AgentDto AGENT_MAINST = new AgentDto("AGENT_MAINST", 3) { // from class: rosetta.order.AgentDto.AGENT_MAINST
        {
            String str = "mainst";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_MAINST;
        }
    };
    public static final AgentDto AGENT_EXECUTION_VENUE = new AgentDto("AGENT_EXECUTION_VENUE", 4) { // from class: rosetta.order.AgentDto.AGENT_EXECUTION_VENUE
        {
            String str = "execution_venue";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_EXECUTION_VENUE;
        }
    };
    public static final AgentDto AGENT_TRADEDESK = new AgentDto("AGENT_TRADEDESK", 5) { // from class: rosetta.order.AgentDto.AGENT_TRADEDESK
        {
            String str = "tradedesk";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_TRADEDESK;
        }
    };
    public static final AgentDto AGENT_BROKEBACK = new AgentDto("AGENT_BROKEBACK", 6) { // from class: rosetta.order.AgentDto.AGENT_BROKEBACK
        {
            String str = "brokeback";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_BROKEBACK;
        }
    };
    public static final AgentDto AGENT_CORPORATE_ACTION = new AgentDto("AGENT_CORPORATE_ACTION", 7) { // from class: rosetta.order.AgentDto.AGENT_CORPORATE_ACTION
        {
            String str = "corporate_action";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_CORPORATE_ACTION;
        }
    };
    public static final AgentDto AGENT_STALE_GTC = new AgentDto("AGENT_STALE_GTC", 8) { // from class: rosetta.order.AgentDto.AGENT_STALE_GTC
        {
            String str = "stale_gtc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_STALE_GTC;
        }
    };
    public static final AgentDto AGENT_CARAVAN = new AgentDto("AGENT_CARAVAN", 9) { // from class: rosetta.order.AgentDto.AGENT_CARAVAN
        {
            String str = "caravan";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_CARAVAN;
        }
    };
    public static final AgentDto AGENT_NUMMUS = new AgentDto("AGENT_NUMMUS", 10) { // from class: rosetta.order.AgentDto.AGENT_NUMMUS
        {
            String str = "nummus";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_NUMMUS;
        }
    };
    public static final AgentDto AGENT_SICKLE = new AgentDto("AGENT_SICKLE", 11) { // from class: rosetta.order.AgentDto.AGENT_SICKLE
        {
            String str = "sickle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_SICKLE;
        }
    };
    public static final AgentDto AGENT_EXPIRING_OPTION = new AgentDto("AGENT_EXPIRING_OPTION", 12) { // from class: rosetta.order.AgentDto.AGENT_EXPIRING_OPTION
        {
            String str = "expiring_option";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_EXPIRING_OPTION;
        }
    };
    public static final AgentDto AGENT_GET_OUT = new AgentDto("AGENT_GET_OUT", 13) { // from class: rosetta.order.AgentDto.AGENT_GET_OUT
        {
            String str = "get_out";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_GET_OUT;
        }
    };
    public static final AgentDto AGENT_RETRY = new AgentDto("AGENT_RETRY", 14) { // from class: rosetta.order.AgentDto.AGENT_RETRY
        {
            String str = AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_RETRY;
        }
    };
    public static final AgentDto AGENT_UPDATEMARGIN = new AgentDto("AGENT_UPDATEMARGIN", 15) { // from class: rosetta.order.AgentDto.AGENT_UPDATEMARGIN
        {
            String str = "updatemargin";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_UPDATEMARGIN;
        }
    };
    public static final AgentDto AGENT_FRAC_MAINST = new AgentDto("AGENT_FRAC_MAINST", 16) { // from class: rosetta.order.AgentDto.AGENT_FRAC_MAINST
        {
            String str = "frac_mainst";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FRAC_MAINST;
        }
    };
    public static final AgentDto AGENT_DRIP = new AgentDto("AGENT_DRIP", 17) { // from class: rosetta.order.AgentDto.AGENT_DRIP
        {
            String str = "drip";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_DRIP;
        }
    };
    public static final AgentDto AGENT_FRAC_MAINST_ADJUSTMENT_ORDER = new AgentDto("AGENT_FRAC_MAINST_ADJUSTMENT_ORDER", 18) { // from class: rosetta.order.AgentDto.AGENT_FRAC_MAINST_ADJUSTMENT_ORDER
        {
            String str = "frac_mainst_adjustment_order";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FRAC_MAINST_ADJUSTMENT_ORDER;
        }
    };
    public static final AgentDto AGENT_RECURRING = new AgentDto("AGENT_RECURRING", 19) { // from class: rosetta.order.AgentDto.AGENT_RECURRING
        {
            String str = "recurring";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_RECURRING;
        }
    };
    public static final AgentDto AGENT_FRAC_MAINST_NETTED_ORDER = new AgentDto("AGENT_FRAC_MAINST_NETTED_ORDER", 20) { // from class: rosetta.order.AgentDto.AGENT_FRAC_MAINST_NETTED_ORDER
        {
            String str = "frac_mainst_netted_order";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FRAC_MAINST_NETTED_ORDER;
        }
    };
    public static final AgentDto AGENT_FRAC_MAINST_PASS_THROUGH_ORDER = new AgentDto("AGENT_FRAC_MAINST_PASS_THROUGH_ORDER", 21) { // from class: rosetta.order.AgentDto.AGENT_FRAC_MAINST_PASS_THROUGH_ORDER
        {
            String str = "frac_mainst_pass_through_order";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FRAC_MAINST_PASS_THROUGH_ORDER;
        }
    };
    public static final AgentDto AGENT_TRADEDESK_MANUAL = new AgentDto("AGENT_TRADEDESK_MANUAL", 22) { // from class: rosetta.order.AgentDto.AGENT_TRADEDESK_MANUAL
        {
            String str = "tradedesk_manual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_TRADEDESK_MANUAL;
        }
    };
    public static final AgentDto AGENT_REFERRAL_INVENTORY = new AgentDto("AGENT_REFERRAL_INVENTORY", 23) { // from class: rosetta.order.AgentDto.AGENT_REFERRAL_INVENTORY
        {
            String str = "referral_inventory";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_REFERRAL_INVENTORY;
        }
    };
    public static final AgentDto AGENT_MARGIN_CALL = new AgentDto("AGENT_MARGIN_CALL", 24) { // from class: rosetta.order.AgentDto.AGENT_MARGIN_CALL
        {
            String str = "margin_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_MARGIN_CALL;
        }
    };
    public static final AgentDto AGENT_DAY_TRADES = new AgentDto("AGENT_DAY_TRADES", 25) { // from class: rosetta.order.AgentDto.AGENT_DAY_TRADES
        {
            String str = "day_trades";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_DAY_TRADES;
        }
    };
    public static final AgentDto AGENT_SYNC_INSTRUMENTS = new AgentDto("AGENT_SYNC_INSTRUMENTS", 26) { // from class: rosetta.order.AgentDto.AGENT_SYNC_INSTRUMENTS
        {
            String str = "sync_instruments";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_SYNC_INSTRUMENTS;
        }
    };
    public static final AgentDto AGENT_SYNC_QUIVER_INSTRUMENTS = new AgentDto("AGENT_SYNC_QUIVER_INSTRUMENTS", 27) { // from class: rosetta.order.AgentDto.AGENT_SYNC_QUIVER_INSTRUMENTS
        {
            String str = "sync_quiver_instruments";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_SYNC_QUIVER_INSTRUMENTS;
        }
    };
    public static final AgentDto AGENT_RESTRICTED_ORDER = new AgentDto("AGENT_RESTRICTED_ORDER", 28) { // from class: rosetta.order.AgentDto.AGENT_RESTRICTED_ORDER
        {
            String str = "restricted_order";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_RESTRICTED_ORDER;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_INVALID_PRICE = new AgentDto("AGENT_IPO_ACCESS_INVALID_PRICE", 29) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_INVALID_PRICE
        {
            String str = "ipo_access_invalid_price";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_INVALID_PRICE;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_NO_ALLOCATION = new AgentDto("AGENT_IPO_ACCESS_NO_ALLOCATION", 30) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_NO_ALLOCATION
        {
            String str = "ipo_access_no_allocation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_NO_ALLOCATION;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_PRICE_CHANGED = new AgentDto("AGENT_IPO_ACCESS_PRICE_CHANGED", 31) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_PRICE_CHANGED
        {
            String str = "ipo_access_price_changed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_PRICE_CHANGED;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_PRICE_FINALIZED = new AgentDto("AGENT_IPO_ACCESS_PRICE_FINALIZED", 32) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_PRICE_FINALIZED
        {
            String str = "ipo_access_price_finalized";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_PRICE_FINALIZED;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE = new AgentDto("AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE", 33) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE
        {
            String str = "ipo_access_created_out_of_range";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_MATERIAL_UPDATE = new AgentDto("AGENT_IPO_ACCESS_MATERIAL_UPDATE", 34) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_MATERIAL_UPDATE
        {
            String str = "ipo_access_material_update";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_MATERIAL_UPDATE;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_ORDER_EXPIRATION = new AgentDto("AGENT_IPO_ACCESS_ORDER_EXPIRATION", 35) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_ORDER_EXPIRATION
        {
            String str = "ipo_access_order_expiration";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_ORDER_EXPIRATION;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_IPO_CANCELED = new AgentDto("AGENT_IPO_ACCESS_IPO_CANCELED", 36) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_IPO_CANCELED
        {
            String str = "ipo_access_ipo_canceled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_IPO_CANCELED;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_IPO_DELAYED = new AgentDto("AGENT_IPO_ACCESS_IPO_DELAYED", 37) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_IPO_DELAYED
        {
            String str = "ipo_access_ipo_delayed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_IPO_DELAYED;
        }
    };
    public static final AgentDto AGENT_INSUFFICIENT_BUYING_POWER = new AgentDto("AGENT_INSUFFICIENT_BUYING_POWER", 38) { // from class: rosetta.order.AgentDto.AGENT_INSUFFICIENT_BUYING_POWER
        {
            String str = "insufficient_buying_power";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_INSUFFICIENT_BUYING_POWER;
        }
    };
    public static final AgentDto AGENT_MAINST_HEALER = new AgentDto("AGENT_MAINST_HEALER", 39) { // from class: rosetta.order.AgentDto.AGENT_MAINST_HEALER
        {
            String str = "mainst_healer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_MAINST_HEALER;
        }
    };
    public static final AgentDto AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER = new AgentDto("AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER", 40) { // from class: rosetta.order.AgentDto.AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER
        {
            String str = "frac_mainst_netted_adjustment_order";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER;
        }
    };
    public static final AgentDto AGENT_DEBIT_CARD_REWARD = new AgentDto("AGENT_DEBIT_CARD_REWARD", 41) { // from class: rosetta.order.AgentDto.AGENT_DEBIT_CARD_REWARD
        {
            String str = "debit_card_reward";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_DEBIT_CARD_REWARD;
        }
    };
    public static final AgentDto AGENT_CHECKOUT_FLOW_RECOMMENDATIONS = new AgentDto("AGENT_CHECKOUT_FLOW_RECOMMENDATIONS", 42) { // from class: rosetta.order.AgentDto.AGENT_CHECKOUT_FLOW_RECOMMENDATIONS
        {
            String str = "checkout_flow_recommendations";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_CHECKOUT_FLOW_RECOMMENDATIONS;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST = new AgentDto("AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST", 43) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST
        {
            String str = "ipo_access_user_not_in_dsp_list";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_USER_MOVED_TO_DSP = new AgentDto("AGENT_IPO_ACCESS_USER_MOVED_TO_DSP", 44) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_USER_MOVED_TO_DSP
        {
            String str = "ipo_access_user_moved_to_dsp";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_USER_MOVED_TO_DSP;
        }
    };
    public static final AgentDto AGENT_USER_SOLICITED = new AgentDto("AGENT_USER_SOLICITED", 45) { // from class: rosetta.order.AgentDto.AGENT_USER_SOLICITED
        {
            String str = "user_solicited";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_USER_SOLICITED;
        }
    };
    public static final AgentDto AGENT_INVENTORY_MANAGEMENT = new AgentDto("AGENT_INVENTORY_MANAGEMENT", 46) { // from class: rosetta.order.AgentDto.AGENT_INVENTORY_MANAGEMENT
        {
            String str = "inventory_management";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_INVENTORY_MANAGEMENT;
        }
    };
    public static final AgentDto AGENT_IPO_ACCESS_USER_IS_EMPLOYEE = new AgentDto("AGENT_IPO_ACCESS_USER_IS_EMPLOYEE", 47) { // from class: rosetta.order.AgentDto.AGENT_IPO_ACCESS_USER_IS_EMPLOYEE
        {
            String str = "ipo_access_user_is_employee";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_IPO_ACCESS_USER_IS_EMPLOYEE;
        }
    };
    public static final AgentDto Agent_AGENT_DELAYED_EXTENDED_HOURS = new AgentDto("Agent_AGENT_DELAYED_EXTENDED_HOURS", 48) { // from class: rosetta.order.AgentDto.Agent_AGENT_DELAYED_EXTENDED_HOURS
        {
            String str = "delayed_extended_hours";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.Agent_AGENT_DELAYED_EXTENDED_HOURS;
        }
    };
    public static final AgentDto AGENT_PAYCHECK_INVESTMENT = new AgentDto("AGENT_PAYCHECK_INVESTMENT", 49) { // from class: rosetta.order.AgentDto.AGENT_PAYCHECK_INVESTMENT
        {
            String str = "paycheck_investment";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_PAYCHECK_INVESTMENT;
        }
    };
    public static final AgentDto AGENT_INVEST_FLOW_USER = new AgentDto("AGENT_INVEST_FLOW_USER", 50) { // from class: rosetta.order.AgentDto.AGENT_INVEST_FLOW_USER
        {
            String str = "invest_flow";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_INVEST_FLOW_USER;
        }
    };
    public static final AgentDto AGENT_RECURRING_RETIREMENT = new AgentDto("AGENT_RECURRING_RETIREMENT", 51) { // from class: rosetta.order.AgentDto.AGENT_RECURRING_RETIREMENT
        {
            String str = "recurring_retirement";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_RECURRING_RETIREMENT;
        }
    };
    public static final AgentDto AGENT_ORDER_BATCHER = new AgentDto("AGENT_ORDER_BATCHER", 52) { // from class: rosetta.order.AgentDto.AGENT_ORDER_BATCHER
        {
            String str = "order_batcher";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_ORDER_BATCHER;
        }
    };
    public static final AgentDto AGENT_INSUFFICIENT_RESERVED_BUYING_POWER = new AgentDto("AGENT_INSUFFICIENT_RESERVED_BUYING_POWER", 53) { // from class: rosetta.order.AgentDto.AGENT_INSUFFICIENT_RESERVED_BUYING_POWER
        {
            String str = "insufficient_reserved_buying_power";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_INSUFFICIENT_RESERVED_BUYING_POWER;
        }
    };
    public static final AgentDto AGENT_MARGIN_PRELIM = new AgentDto("AGENT_MARGIN_PRELIM", 54) { // from class: rosetta.order.AgentDto.AGENT_MARGIN_PRELIM
        {
            String str = "margin_prelim";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_MARGIN_PRELIM;
        }
    };
    public static final AgentDto AGENT_ADT_KILL_SWITCH = new AgentDto("AGENT_ADT_KILL_SWITCH", 55) { // from class: rosetta.order.AgentDto.AGENT_ADT_KILL_SWITCH
        {
            String str = "adt_kill_switch";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_ADT_KILL_SWITCH;
        }
    };
    public static final AgentDto AGENT_ADVISORY = new AgentDto("AGENT_ADVISORY", 56) { // from class: rosetta.order.AgentDto.AGENT_ADVISORY
        {
            String str = "advisory";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_ADVISORY;
        }
    };
    public static final AgentDto AGENT_FRACTIONAL_ROUND_UP = new AgentDto("AGENT_FRACTIONAL_ROUND_UP", 57) { // from class: rosetta.order.AgentDto.AGENT_FRACTIONAL_ROUND_UP
        {
            String str = "fractional_round_up";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FRACTIONAL_ROUND_UP;
        }
    };
    public static final AgentDto AGENT_TRADING_VIEW = new AgentDto("AGENT_TRADING_VIEW", 58) { // from class: rosetta.order.AgentDto.AGENT_TRADING_VIEW
        {
            String str = "trading_view";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_TRADING_VIEW;
        }
    };
    public static final AgentDto AGENT_API_USER = new AgentDto("AGENT_API_USER", 59) { // from class: rosetta.order.AgentDto.AGENT_API_USER
        {
            String str = "api_user";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_API_USER;
        }
    };
    public static final AgentDto AGENT_ESTATES_WRITTEN_INSTRUCTION = new AgentDto("AGENT_ESTATES_WRITTEN_INSTRUCTION", 60) { // from class: rosetta.order.AgentDto.AGENT_ESTATES_WRITTEN_INSTRUCTION
        {
            String str = "estates_written_instruction";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_ESTATES_WRITTEN_INSTRUCTION;
        }
    };
    public static final AgentDto AGENT_FUTURES_GENERAL_INTRADAY_RISK = new AgentDto("AGENT_FUTURES_GENERAL_INTRADAY_RISK", 61) { // from class: rosetta.order.AgentDto.AGENT_FUTURES_GENERAL_INTRADAY_RISK
        {
            String str = "futures_general_intraday_risk";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FUTURES_GENERAL_INTRADAY_RISK;
        }
    };
    public static final AgentDto AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC = new AgentDto("AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC", 62) { // from class: rosetta.order.AgentDto.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC
        {
            String str = "futures_expiration_physical_settlement_atc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC;
        }
    };
    public static final AgentDto AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT = new AgentDto("AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT", 63) { // from class: rosetta.order.AgentDto.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT
        {
            String str = "futures_expiration_physical_settlement_ldtt";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT;
        }
    };
    public static final AgentDto AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT = new AgentDto("AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT", 64) { // from class: rosetta.order.AgentDto.AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT
        {
            String str = "futures_expiration_financial_settlement_ldtt";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT;
        }
    };
    public static final AgentDto AGENT_DXTRADE = new AgentDto("AGENT_DXTRADE", 65) { // from class: rosetta.order.AgentDto.AGENT_DXTRADE
        {
            String str = "dxtrade";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_DXTRADE;
        }
    };
    public static final AgentDto AGENT_RHS_TRADING = new AgentDto("AGENT_RHS_TRADING", 66) { // from class: rosetta.order.AgentDto.AGENT_RHS_TRADING
        {
            String str = "rhs_trading";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_RHS_TRADING;
        }
    };
    public static final AgentDto AGENT_FRACTIONAL_SHARES_LIQUIDATION = new AgentDto("AGENT_FRACTIONAL_SHARES_LIQUIDATION", 67) { // from class: rosetta.order.AgentDto.AGENT_FRACTIONAL_SHARES_LIQUIDATION
        {
            String str = "fractional_shares_liquidation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FRACTIONAL_SHARES_LIQUIDATION;
        }
    };
    public static final AgentDto AGENT_CANCEL_ON_EXTERNAL_HALT = new AgentDto("AGENT_CANCEL_ON_EXTERNAL_HALT", 68) { // from class: rosetta.order.AgentDto.AGENT_CANCEL_ON_EXTERNAL_HALT
        {
            String str = "cancel_on_external_halt";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_CANCEL_ON_EXTERNAL_HALT;
        }
    };
    public static final AgentDto AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION = new AgentDto("AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION", 69) { // from class: rosetta.order.AgentDto.AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION
        {
            String str = "acat_fractional_shares_liquidation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION;
        }
    };
    public static final AgentDto AGENT_FX_PRINCIPAL_TRADING_DISABLED = new AgentDto("AGENT_FX_PRINCIPAL_TRADING_DISABLED", 70) { // from class: rosetta.order.AgentDto.AGENT_FX_PRINCIPAL_TRADING_DISABLED
        {
            String str = "fx_principal_trading_disabled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_FX_PRINCIPAL_TRADING_DISABLED;
        }
    };
    public static final AgentDto AGENT_CRYPTO_FLATTEN = new AgentDto("AGENT_CRYPTO_FLATTEN", 71) { // from class: rosetta.order.AgentDto.AGENT_CRYPTO_FLATTEN
        {
            String str = "crypto_flatten";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_CRYPTO_FLATTEN;
        }
    };
    public static final AgentDto AGENT_EQUITY_FLATTEN = new AgentDto("AGENT_EQUITY_FLATTEN", 72) { // from class: rosetta.order.AgentDto.AGENT_EQUITY_FLATTEN
        {
            String str = "equity_flatten";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_EQUITY_FLATTEN;
        }
    };
    public static final AgentDto AGENT_CRYPTO_PERPETUALS = new AgentDto("AGENT_CRYPTO_PERPETUALS", 73) { // from class: rosetta.order.AgentDto.AGENT_CRYPTO_PERPETUALS
        {
            String str = "crypto_perpetuals";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_CRYPTO_PERPETUALS;
        }
    };
    public static final AgentDto AGENT_CRYPTO_TOKENIZATION_FX_CHANGE = new AgentDto("AGENT_CRYPTO_TOKENIZATION_FX_CHANGE", 74) { // from class: rosetta.order.AgentDto.AGENT_CRYPTO_TOKENIZATION_FX_CHANGE
        {
            String str = "crypto_tokenization_fx_change";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_CRYPTO_TOKENIZATION_FX_CHANGE;
        }
    };
    public static final AgentDto AGENT_BUYIN_ALLOCATION = new AgentDto("AGENT_BUYIN_ALLOCATION", 75) { // from class: rosetta.order.AgentDto.AGENT_BUYIN_ALLOCATION
        {
            String str = "buyin_allocation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Agent toProto() {
            return Agent.AGENT_BUYIN_ALLOCATION;
        }
    };

    private static final /* synthetic */ AgentDto[] $values() {
        return new AgentDto[]{AGENT_UNSPECIFIED, AGENT_EMPTY, AGENT_USER, AGENT_MAINST, AGENT_EXECUTION_VENUE, AGENT_TRADEDESK, AGENT_BROKEBACK, AGENT_CORPORATE_ACTION, AGENT_STALE_GTC, AGENT_CARAVAN, AGENT_NUMMUS, AGENT_SICKLE, AGENT_EXPIRING_OPTION, AGENT_GET_OUT, AGENT_RETRY, AGENT_UPDATEMARGIN, AGENT_FRAC_MAINST, AGENT_DRIP, AGENT_FRAC_MAINST_ADJUSTMENT_ORDER, AGENT_RECURRING, AGENT_FRAC_MAINST_NETTED_ORDER, AGENT_FRAC_MAINST_PASS_THROUGH_ORDER, AGENT_TRADEDESK_MANUAL, AGENT_REFERRAL_INVENTORY, AGENT_MARGIN_CALL, AGENT_DAY_TRADES, AGENT_SYNC_INSTRUMENTS, AGENT_SYNC_QUIVER_INSTRUMENTS, AGENT_RESTRICTED_ORDER, AGENT_IPO_ACCESS_INVALID_PRICE, AGENT_IPO_ACCESS_NO_ALLOCATION, AGENT_IPO_ACCESS_PRICE_CHANGED, AGENT_IPO_ACCESS_PRICE_FINALIZED, AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE, AGENT_IPO_ACCESS_MATERIAL_UPDATE, AGENT_IPO_ACCESS_ORDER_EXPIRATION, AGENT_IPO_ACCESS_IPO_CANCELED, AGENT_IPO_ACCESS_IPO_DELAYED, AGENT_INSUFFICIENT_BUYING_POWER, AGENT_MAINST_HEALER, AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER, AGENT_DEBIT_CARD_REWARD, AGENT_CHECKOUT_FLOW_RECOMMENDATIONS, AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST, AGENT_IPO_ACCESS_USER_MOVED_TO_DSP, AGENT_USER_SOLICITED, AGENT_INVENTORY_MANAGEMENT, AGENT_IPO_ACCESS_USER_IS_EMPLOYEE, Agent_AGENT_DELAYED_EXTENDED_HOURS, AGENT_PAYCHECK_INVESTMENT, AGENT_INVEST_FLOW_USER, AGENT_RECURRING_RETIREMENT, AGENT_ORDER_BATCHER, AGENT_INSUFFICIENT_RESERVED_BUYING_POWER, AGENT_MARGIN_PRELIM, AGENT_ADT_KILL_SWITCH, AGENT_ADVISORY, AGENT_FRACTIONAL_ROUND_UP, AGENT_TRADING_VIEW, AGENT_API_USER, AGENT_ESTATES_WRITTEN_INSTRUCTION, AGENT_FUTURES_GENERAL_INTRADAY_RISK, AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC, AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT, AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT, AGENT_DXTRADE, AGENT_RHS_TRADING, AGENT_FRACTIONAL_SHARES_LIQUIDATION, AGENT_CANCEL_ON_EXTERNAL_HALT, AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION, AGENT_FX_PRINCIPAL_TRADING_DISABLED, AGENT_CRYPTO_FLATTEN, AGENT_EQUITY_FLATTEN, AGENT_CRYPTO_PERPETUALS, AGENT_CRYPTO_TOKENIZATION_FX_CHANGE, AGENT_BUYIN_ALLOCATION};
    }

    public /* synthetic */ AgentDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<AgentDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AgentDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        AgentDto[] agentDtoArr$values = $values();
        $VALUES = agentDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(agentDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.AgentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AgentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/AgentDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/AgentDto;", "Lrosetta/order/Agent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/AgentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AgentDto, Agent> {

        /* compiled from: AgentDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Agent.values().length];
                try {
                    iArr[Agent.AGENT_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Agent.AGENT_EMPTY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Agent.AGENT_USER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Agent.AGENT_MAINST.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Agent.AGENT_EXECUTION_VENUE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Agent.AGENT_TRADEDESK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Agent.AGENT_BROKEBACK.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Agent.AGENT_CORPORATE_ACTION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Agent.AGENT_STALE_GTC.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Agent.AGENT_CARAVAN.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Agent.AGENT_NUMMUS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Agent.AGENT_SICKLE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Agent.AGENT_EXPIRING_OPTION.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Agent.AGENT_GET_OUT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Agent.AGENT_RETRY.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Agent.AGENT_UPDATEMARGIN.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Agent.AGENT_FRAC_MAINST.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Agent.AGENT_DRIP.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Agent.AGENT_FRAC_MAINST_ADJUSTMENT_ORDER.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Agent.AGENT_RECURRING.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Agent.AGENT_FRAC_MAINST_NETTED_ORDER.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Agent.AGENT_FRAC_MAINST_PASS_THROUGH_ORDER.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Agent.AGENT_TRADEDESK_MANUAL.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Agent.AGENT_REFERRAL_INVENTORY.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Agent.AGENT_MARGIN_CALL.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Agent.AGENT_DAY_TRADES.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Agent.AGENT_SYNC_INSTRUMENTS.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Agent.AGENT_SYNC_QUIVER_INSTRUMENTS.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Agent.AGENT_RESTRICTED_ORDER.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_INVALID_PRICE.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_NO_ALLOCATION.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_PRICE_CHANGED.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_PRICE_FINALIZED.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_MATERIAL_UPDATE.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_ORDER_EXPIRATION.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_IPO_CANCELED.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_IPO_DELAYED.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Agent.AGENT_INSUFFICIENT_BUYING_POWER.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Agent.AGENT_MAINST_HEALER.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Agent.AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[Agent.AGENT_DEBIT_CARD_REWARD.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[Agent.AGENT_CHECKOUT_FLOW_RECOMMENDATIONS.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_USER_MOVED_TO_DSP.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[Agent.AGENT_USER_SOLICITED.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[Agent.AGENT_INVENTORY_MANAGEMENT.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[Agent.AGENT_IPO_ACCESS_USER_IS_EMPLOYEE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[Agent.Agent_AGENT_DELAYED_EXTENDED_HOURS.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[Agent.AGENT_PAYCHECK_INVESTMENT.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[Agent.AGENT_INVEST_FLOW_USER.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[Agent.AGENT_RECURRING_RETIREMENT.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[Agent.AGENT_ORDER_BATCHER.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[Agent.AGENT_INSUFFICIENT_RESERVED_BUYING_POWER.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[Agent.AGENT_MARGIN_PRELIM.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[Agent.AGENT_ADT_KILL_SWITCH.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[Agent.AGENT_ADVISORY.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[Agent.AGENT_FRACTIONAL_ROUND_UP.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[Agent.AGENT_TRADING_VIEW.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[Agent.AGENT_API_USER.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[Agent.AGENT_ESTATES_WRITTEN_INSTRUCTION.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[Agent.AGENT_FUTURES_GENERAL_INTRADAY_RISK.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[Agent.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[Agent.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[Agent.AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[Agent.AGENT_DXTRADE.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[Agent.AGENT_RHS_TRADING.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[Agent.AGENT_FRACTIONAL_SHARES_LIQUIDATION.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[Agent.AGENT_CANCEL_ON_EXTERNAL_HALT.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[Agent.AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[Agent.AGENT_FX_PRINCIPAL_TRADING_DISABLED.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[Agent.AGENT_CRYPTO_FLATTEN.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[Agent.AGENT_EQUITY_FLATTEN.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[Agent.AGENT_CRYPTO_PERPETUALS.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[Agent.AGENT_CRYPTO_TOKENIZATION_FX_CHANGE.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[Agent.AGENT_BUYIN_ALLOCATION.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AgentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AgentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AgentDto> getBinaryBase64Serializer() {
            return (KSerializer) AgentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Agent> getProtoAdapter() {
            return Agent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AgentDto getZeroValue() {
            return AgentDto.AGENT_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AgentDto fromProto(Agent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AgentDto.AGENT_UNSPECIFIED;
                case 2:
                    return AgentDto.AGENT_EMPTY;
                case 3:
                    return AgentDto.AGENT_USER;
                case 4:
                    return AgentDto.AGENT_MAINST;
                case 5:
                    return AgentDto.AGENT_EXECUTION_VENUE;
                case 6:
                    return AgentDto.AGENT_TRADEDESK;
                case 7:
                    return AgentDto.AGENT_BROKEBACK;
                case 8:
                    return AgentDto.AGENT_CORPORATE_ACTION;
                case 9:
                    return AgentDto.AGENT_STALE_GTC;
                case 10:
                    return AgentDto.AGENT_CARAVAN;
                case 11:
                    return AgentDto.AGENT_NUMMUS;
                case 12:
                    return AgentDto.AGENT_SICKLE;
                case 13:
                    return AgentDto.AGENT_EXPIRING_OPTION;
                case 14:
                    return AgentDto.AGENT_GET_OUT;
                case 15:
                    return AgentDto.AGENT_RETRY;
                case 16:
                    return AgentDto.AGENT_UPDATEMARGIN;
                case 17:
                    return AgentDto.AGENT_FRAC_MAINST;
                case 18:
                    return AgentDto.AGENT_DRIP;
                case 19:
                    return AgentDto.AGENT_FRAC_MAINST_ADJUSTMENT_ORDER;
                case 20:
                    return AgentDto.AGENT_RECURRING;
                case 21:
                    return AgentDto.AGENT_FRAC_MAINST_NETTED_ORDER;
                case 22:
                    return AgentDto.AGENT_FRAC_MAINST_PASS_THROUGH_ORDER;
                case 23:
                    return AgentDto.AGENT_TRADEDESK_MANUAL;
                case 24:
                    return AgentDto.AGENT_REFERRAL_INVENTORY;
                case 25:
                    return AgentDto.AGENT_MARGIN_CALL;
                case 26:
                    return AgentDto.AGENT_DAY_TRADES;
                case 27:
                    return AgentDto.AGENT_SYNC_INSTRUMENTS;
                case 28:
                    return AgentDto.AGENT_SYNC_QUIVER_INSTRUMENTS;
                case 29:
                    return AgentDto.AGENT_RESTRICTED_ORDER;
                case 30:
                    return AgentDto.AGENT_IPO_ACCESS_INVALID_PRICE;
                case 31:
                    return AgentDto.AGENT_IPO_ACCESS_NO_ALLOCATION;
                case 32:
                    return AgentDto.AGENT_IPO_ACCESS_PRICE_CHANGED;
                case 33:
                    return AgentDto.AGENT_IPO_ACCESS_PRICE_FINALIZED;
                case 34:
                    return AgentDto.AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE;
                case 35:
                    return AgentDto.AGENT_IPO_ACCESS_MATERIAL_UPDATE;
                case 36:
                    return AgentDto.AGENT_IPO_ACCESS_ORDER_EXPIRATION;
                case 37:
                    return AgentDto.AGENT_IPO_ACCESS_IPO_CANCELED;
                case 38:
                    return AgentDto.AGENT_IPO_ACCESS_IPO_DELAYED;
                case 39:
                    return AgentDto.AGENT_INSUFFICIENT_BUYING_POWER;
                case 40:
                    return AgentDto.AGENT_MAINST_HEALER;
                case 41:
                    return AgentDto.AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER;
                case 42:
                    return AgentDto.AGENT_DEBIT_CARD_REWARD;
                case 43:
                    return AgentDto.AGENT_CHECKOUT_FLOW_RECOMMENDATIONS;
                case 44:
                    return AgentDto.AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST;
                case 45:
                    return AgentDto.AGENT_IPO_ACCESS_USER_MOVED_TO_DSP;
                case 46:
                    return AgentDto.AGENT_USER_SOLICITED;
                case 47:
                    return AgentDto.AGENT_INVENTORY_MANAGEMENT;
                case 48:
                    return AgentDto.AGENT_IPO_ACCESS_USER_IS_EMPLOYEE;
                case 49:
                    return AgentDto.Agent_AGENT_DELAYED_EXTENDED_HOURS;
                case 50:
                    return AgentDto.AGENT_PAYCHECK_INVESTMENT;
                case 51:
                    return AgentDto.AGENT_INVEST_FLOW_USER;
                case 52:
                    return AgentDto.AGENT_RECURRING_RETIREMENT;
                case 53:
                    return AgentDto.AGENT_ORDER_BATCHER;
                case 54:
                    return AgentDto.AGENT_INSUFFICIENT_RESERVED_BUYING_POWER;
                case 55:
                    return AgentDto.AGENT_MARGIN_PRELIM;
                case 56:
                    return AgentDto.AGENT_ADT_KILL_SWITCH;
                case 57:
                    return AgentDto.AGENT_ADVISORY;
                case 58:
                    return AgentDto.AGENT_FRACTIONAL_ROUND_UP;
                case 59:
                    return AgentDto.AGENT_TRADING_VIEW;
                case 60:
                    return AgentDto.AGENT_API_USER;
                case 61:
                    return AgentDto.AGENT_ESTATES_WRITTEN_INSTRUCTION;
                case 62:
                    return AgentDto.AGENT_FUTURES_GENERAL_INTRADAY_RISK;
                case 63:
                    return AgentDto.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC;
                case 64:
                    return AgentDto.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT;
                case 65:
                    return AgentDto.AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT;
                case 66:
                    return AgentDto.AGENT_DXTRADE;
                case 67:
                    return AgentDto.AGENT_RHS_TRADING;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return AgentDto.AGENT_FRACTIONAL_SHARES_LIQUIDATION;
                case 69:
                    return AgentDto.AGENT_CANCEL_ON_EXTERNAL_HALT;
                case 70:
                    return AgentDto.AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return AgentDto.AGENT_FX_PRINCIPAL_TRADING_DISABLED;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return AgentDto.AGENT_CRYPTO_FLATTEN;
                case 73:
                    return AgentDto.AGENT_EQUITY_FLATTEN;
                case 74:
                    return AgentDto.AGENT_CRYPTO_PERPETUALS;
                case 75:
                    return AgentDto.AGENT_CRYPTO_TOKENIZATION_FX_CHANGE;
                case 76:
                    return AgentDto.AGENT_BUYIN_ALLOCATION;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AgentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/AgentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/AgentDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AgentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AgentDto, Agent> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.Agent", AgentDto.getEntries(), AgentDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AgentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AgentDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AgentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AgentDto valueOf(String str) {
        return (AgentDto) Enum.valueOf(AgentDto.class, str);
    }

    public static AgentDto[] values() {
        return (AgentDto[]) $VALUES.clone();
    }
}
