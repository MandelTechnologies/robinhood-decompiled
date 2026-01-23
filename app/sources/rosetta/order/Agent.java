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
/* compiled from: Agent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\bR\b\u0086\u0081\u0002\u0018\u0000 U2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001UB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bT¨\u0006V"}, m3636d2 = {"Lrosetta/order/Agent;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AGENT_UNSPECIFIED", "AGENT_EMPTY", "AGENT_USER", "AGENT_MAINST", "AGENT_EXECUTION_VENUE", "AGENT_TRADEDESK", "AGENT_BROKEBACK", "AGENT_CORPORATE_ACTION", "AGENT_STALE_GTC", "AGENT_CARAVAN", "AGENT_NUMMUS", "AGENT_SICKLE", "AGENT_EXPIRING_OPTION", "AGENT_GET_OUT", "AGENT_RETRY", "AGENT_UPDATEMARGIN", "AGENT_FRAC_MAINST", "AGENT_DRIP", "AGENT_FRAC_MAINST_ADJUSTMENT_ORDER", "AGENT_RECURRING", "AGENT_FRAC_MAINST_NETTED_ORDER", "AGENT_FRAC_MAINST_PASS_THROUGH_ORDER", "AGENT_TRADEDESK_MANUAL", "AGENT_REFERRAL_INVENTORY", "AGENT_MARGIN_CALL", "AGENT_DAY_TRADES", "AGENT_SYNC_INSTRUMENTS", "AGENT_SYNC_QUIVER_INSTRUMENTS", "AGENT_RESTRICTED_ORDER", "AGENT_IPO_ACCESS_INVALID_PRICE", "AGENT_IPO_ACCESS_NO_ALLOCATION", "AGENT_IPO_ACCESS_PRICE_CHANGED", "AGENT_IPO_ACCESS_PRICE_FINALIZED", "AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE", "AGENT_IPO_ACCESS_MATERIAL_UPDATE", "AGENT_IPO_ACCESS_ORDER_EXPIRATION", "AGENT_IPO_ACCESS_IPO_CANCELED", "AGENT_IPO_ACCESS_IPO_DELAYED", "AGENT_INSUFFICIENT_BUYING_POWER", "AGENT_MAINST_HEALER", "AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER", "AGENT_DEBIT_CARD_REWARD", "AGENT_CHECKOUT_FLOW_RECOMMENDATIONS", "AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST", "AGENT_IPO_ACCESS_USER_MOVED_TO_DSP", "AGENT_USER_SOLICITED", "AGENT_INVENTORY_MANAGEMENT", "AGENT_IPO_ACCESS_USER_IS_EMPLOYEE", "Agent_AGENT_DELAYED_EXTENDED_HOURS", "AGENT_PAYCHECK_INVESTMENT", "AGENT_INVEST_FLOW_USER", "AGENT_RECURRING_RETIREMENT", "AGENT_ORDER_BATCHER", "AGENT_INSUFFICIENT_RESERVED_BUYING_POWER", "AGENT_MARGIN_PRELIM", "AGENT_ADT_KILL_SWITCH", "AGENT_ADVISORY", "AGENT_FRACTIONAL_ROUND_UP", "AGENT_TRADING_VIEW", "AGENT_API_USER", "AGENT_ESTATES_WRITTEN_INSTRUCTION", "AGENT_FUTURES_GENERAL_INTRADAY_RISK", "AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC", "AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT", "AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT", "AGENT_DXTRADE", "AGENT_RHS_TRADING", "AGENT_FRACTIONAL_SHARES_LIQUIDATION", "AGENT_CANCEL_ON_EXTERNAL_HALT", "AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION", "AGENT_FX_PRINCIPAL_TRADING_DISABLED", "AGENT_CRYPTO_FLATTEN", "AGENT_EQUITY_FLATTEN", "AGENT_CRYPTO_PERPETUALS", "AGENT_CRYPTO_TOKENIZATION_FX_CHANGE", "AGENT_BUYIN_ALLOCATION", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Agent implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Agent[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Agent> ADAPTER;
    public static final Agent AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION;
    public static final Agent AGENT_ADT_KILL_SWITCH;
    public static final Agent AGENT_ADVISORY;
    public static final Agent AGENT_API_USER;
    public static final Agent AGENT_BROKEBACK;
    public static final Agent AGENT_BUYIN_ALLOCATION;
    public static final Agent AGENT_CANCEL_ON_EXTERNAL_HALT;
    public static final Agent AGENT_CARAVAN;
    public static final Agent AGENT_CHECKOUT_FLOW_RECOMMENDATIONS;
    public static final Agent AGENT_CORPORATE_ACTION;
    public static final Agent AGENT_CRYPTO_FLATTEN;
    public static final Agent AGENT_CRYPTO_PERPETUALS;
    public static final Agent AGENT_CRYPTO_TOKENIZATION_FX_CHANGE;
    public static final Agent AGENT_DAY_TRADES;
    public static final Agent AGENT_DEBIT_CARD_REWARD;
    public static final Agent AGENT_DRIP;
    public static final Agent AGENT_DXTRADE;
    public static final Agent AGENT_EMPTY;
    public static final Agent AGENT_EQUITY_FLATTEN;
    public static final Agent AGENT_ESTATES_WRITTEN_INSTRUCTION;
    public static final Agent AGENT_EXECUTION_VENUE;
    public static final Agent AGENT_EXPIRING_OPTION;
    public static final Agent AGENT_FRACTIONAL_ROUND_UP;
    public static final Agent AGENT_FRACTIONAL_SHARES_LIQUIDATION;
    public static final Agent AGENT_FRAC_MAINST;
    public static final Agent AGENT_FRAC_MAINST_ADJUSTMENT_ORDER;
    public static final Agent AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER;
    public static final Agent AGENT_FRAC_MAINST_NETTED_ORDER;
    public static final Agent AGENT_FRAC_MAINST_PASS_THROUGH_ORDER;
    public static final Agent AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT;
    public static final Agent AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC;
    public static final Agent AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT;
    public static final Agent AGENT_FUTURES_GENERAL_INTRADAY_RISK;
    public static final Agent AGENT_FX_PRINCIPAL_TRADING_DISABLED;
    public static final Agent AGENT_GET_OUT;
    public static final Agent AGENT_INSUFFICIENT_BUYING_POWER;
    public static final Agent AGENT_INSUFFICIENT_RESERVED_BUYING_POWER;
    public static final Agent AGENT_INVENTORY_MANAGEMENT;
    public static final Agent AGENT_INVEST_FLOW_USER;
    public static final Agent AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE;
    public static final Agent AGENT_IPO_ACCESS_INVALID_PRICE;
    public static final Agent AGENT_IPO_ACCESS_IPO_CANCELED;
    public static final Agent AGENT_IPO_ACCESS_IPO_DELAYED;
    public static final Agent AGENT_IPO_ACCESS_MATERIAL_UPDATE;
    public static final Agent AGENT_IPO_ACCESS_NO_ALLOCATION;
    public static final Agent AGENT_IPO_ACCESS_ORDER_EXPIRATION;
    public static final Agent AGENT_IPO_ACCESS_PRICE_CHANGED;
    public static final Agent AGENT_IPO_ACCESS_PRICE_FINALIZED;
    public static final Agent AGENT_IPO_ACCESS_USER_IS_EMPLOYEE;
    public static final Agent AGENT_IPO_ACCESS_USER_MOVED_TO_DSP;
    public static final Agent AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST;
    public static final Agent AGENT_MAINST;
    public static final Agent AGENT_MAINST_HEALER;
    public static final Agent AGENT_MARGIN_CALL;
    public static final Agent AGENT_MARGIN_PRELIM;
    public static final Agent AGENT_NUMMUS;
    public static final Agent AGENT_ORDER_BATCHER;
    public static final Agent AGENT_PAYCHECK_INVESTMENT;
    public static final Agent AGENT_RECURRING;
    public static final Agent AGENT_RECURRING_RETIREMENT;
    public static final Agent AGENT_REFERRAL_INVENTORY;
    public static final Agent AGENT_RESTRICTED_ORDER;
    public static final Agent AGENT_RETRY;
    public static final Agent AGENT_RHS_TRADING;
    public static final Agent AGENT_SICKLE;
    public static final Agent AGENT_STALE_GTC;
    public static final Agent AGENT_SYNC_INSTRUMENTS;
    public static final Agent AGENT_SYNC_QUIVER_INSTRUMENTS;
    public static final Agent AGENT_TRADEDESK;
    public static final Agent AGENT_TRADEDESK_MANUAL;
    public static final Agent AGENT_TRADING_VIEW;
    public static final Agent AGENT_UNSPECIFIED;
    public static final Agent AGENT_UPDATEMARGIN;
    public static final Agent AGENT_USER;
    public static final Agent AGENT_USER_SOLICITED;
    public static final Agent Agent_AGENT_DELAYED_EXTENDED_HOURS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ Agent[] $values() {
        return new Agent[]{AGENT_UNSPECIFIED, AGENT_EMPTY, AGENT_USER, AGENT_MAINST, AGENT_EXECUTION_VENUE, AGENT_TRADEDESK, AGENT_BROKEBACK, AGENT_CORPORATE_ACTION, AGENT_STALE_GTC, AGENT_CARAVAN, AGENT_NUMMUS, AGENT_SICKLE, AGENT_EXPIRING_OPTION, AGENT_GET_OUT, AGENT_RETRY, AGENT_UPDATEMARGIN, AGENT_FRAC_MAINST, AGENT_DRIP, AGENT_FRAC_MAINST_ADJUSTMENT_ORDER, AGENT_RECURRING, AGENT_FRAC_MAINST_NETTED_ORDER, AGENT_FRAC_MAINST_PASS_THROUGH_ORDER, AGENT_TRADEDESK_MANUAL, AGENT_REFERRAL_INVENTORY, AGENT_MARGIN_CALL, AGENT_DAY_TRADES, AGENT_SYNC_INSTRUMENTS, AGENT_SYNC_QUIVER_INSTRUMENTS, AGENT_RESTRICTED_ORDER, AGENT_IPO_ACCESS_INVALID_PRICE, AGENT_IPO_ACCESS_NO_ALLOCATION, AGENT_IPO_ACCESS_PRICE_CHANGED, AGENT_IPO_ACCESS_PRICE_FINALIZED, AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE, AGENT_IPO_ACCESS_MATERIAL_UPDATE, AGENT_IPO_ACCESS_ORDER_EXPIRATION, AGENT_IPO_ACCESS_IPO_CANCELED, AGENT_IPO_ACCESS_IPO_DELAYED, AGENT_INSUFFICIENT_BUYING_POWER, AGENT_MAINST_HEALER, AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER, AGENT_DEBIT_CARD_REWARD, AGENT_CHECKOUT_FLOW_RECOMMENDATIONS, AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST, AGENT_IPO_ACCESS_USER_MOVED_TO_DSP, AGENT_USER_SOLICITED, AGENT_INVENTORY_MANAGEMENT, AGENT_IPO_ACCESS_USER_IS_EMPLOYEE, Agent_AGENT_DELAYED_EXTENDED_HOURS, AGENT_PAYCHECK_INVESTMENT, AGENT_INVEST_FLOW_USER, AGENT_RECURRING_RETIREMENT, AGENT_ORDER_BATCHER, AGENT_INSUFFICIENT_RESERVED_BUYING_POWER, AGENT_MARGIN_PRELIM, AGENT_ADT_KILL_SWITCH, AGENT_ADVISORY, AGENT_FRACTIONAL_ROUND_UP, AGENT_TRADING_VIEW, AGENT_API_USER, AGENT_ESTATES_WRITTEN_INSTRUCTION, AGENT_FUTURES_GENERAL_INTRADAY_RISK, AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC, AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT, AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT, AGENT_DXTRADE, AGENT_RHS_TRADING, AGENT_FRACTIONAL_SHARES_LIQUIDATION, AGENT_CANCEL_ON_EXTERNAL_HALT, AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION, AGENT_FX_PRINCIPAL_TRADING_DISABLED, AGENT_CRYPTO_FLATTEN, AGENT_EQUITY_FLATTEN, AGENT_CRYPTO_PERPETUALS, AGENT_CRYPTO_TOKENIZATION_FX_CHANGE, AGENT_BUYIN_ALLOCATION};
    }

    @JvmStatic
    public static final Agent fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Agent> getEntries() {
        return $ENTRIES;
    }

    private Agent(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Agent agent = new Agent("AGENT_UNSPECIFIED", 0, 0);
        AGENT_UNSPECIFIED = agent;
        AGENT_EMPTY = new Agent("AGENT_EMPTY", 1, 0);
        AGENT_USER = new Agent("AGENT_USER", 2, 1);
        AGENT_MAINST = new Agent("AGENT_MAINST", 3, 2);
        AGENT_EXECUTION_VENUE = new Agent("AGENT_EXECUTION_VENUE", 4, 3);
        AGENT_TRADEDESK = new Agent("AGENT_TRADEDESK", 5, 4);
        AGENT_BROKEBACK = new Agent("AGENT_BROKEBACK", 6, 5);
        AGENT_CORPORATE_ACTION = new Agent("AGENT_CORPORATE_ACTION", 7, 6);
        AGENT_STALE_GTC = new Agent("AGENT_STALE_GTC", 8, 7);
        AGENT_CARAVAN = new Agent("AGENT_CARAVAN", 9, 8);
        AGENT_NUMMUS = new Agent("AGENT_NUMMUS", 10, 9);
        AGENT_SICKLE = new Agent("AGENT_SICKLE", 11, 10);
        AGENT_EXPIRING_OPTION = new Agent("AGENT_EXPIRING_OPTION", 12, 11);
        AGENT_GET_OUT = new Agent("AGENT_GET_OUT", 13, 12);
        AGENT_RETRY = new Agent("AGENT_RETRY", 14, 13);
        AGENT_UPDATEMARGIN = new Agent("AGENT_UPDATEMARGIN", 15, 14);
        AGENT_FRAC_MAINST = new Agent("AGENT_FRAC_MAINST", 16, 15);
        AGENT_DRIP = new Agent("AGENT_DRIP", 17, 16);
        AGENT_FRAC_MAINST_ADJUSTMENT_ORDER = new Agent("AGENT_FRAC_MAINST_ADJUSTMENT_ORDER", 18, 17);
        AGENT_RECURRING = new Agent("AGENT_RECURRING", 19, 18);
        AGENT_FRAC_MAINST_NETTED_ORDER = new Agent("AGENT_FRAC_MAINST_NETTED_ORDER", 20, 19);
        AGENT_FRAC_MAINST_PASS_THROUGH_ORDER = new Agent("AGENT_FRAC_MAINST_PASS_THROUGH_ORDER", 21, 20);
        AGENT_TRADEDESK_MANUAL = new Agent("AGENT_TRADEDESK_MANUAL", 22, 21);
        AGENT_REFERRAL_INVENTORY = new Agent("AGENT_REFERRAL_INVENTORY", 23, 22);
        AGENT_MARGIN_CALL = new Agent("AGENT_MARGIN_CALL", 24, 23);
        AGENT_DAY_TRADES = new Agent("AGENT_DAY_TRADES", 25, 24);
        AGENT_SYNC_INSTRUMENTS = new Agent("AGENT_SYNC_INSTRUMENTS", 26, 25);
        AGENT_SYNC_QUIVER_INSTRUMENTS = new Agent("AGENT_SYNC_QUIVER_INSTRUMENTS", 27, 26);
        AGENT_RESTRICTED_ORDER = new Agent("AGENT_RESTRICTED_ORDER", 28, 27);
        AGENT_IPO_ACCESS_INVALID_PRICE = new Agent("AGENT_IPO_ACCESS_INVALID_PRICE", 29, 28);
        AGENT_IPO_ACCESS_NO_ALLOCATION = new Agent("AGENT_IPO_ACCESS_NO_ALLOCATION", 30, 29);
        AGENT_IPO_ACCESS_PRICE_CHANGED = new Agent("AGENT_IPO_ACCESS_PRICE_CHANGED", 31, 30);
        AGENT_IPO_ACCESS_PRICE_FINALIZED = new Agent("AGENT_IPO_ACCESS_PRICE_FINALIZED", 32, 31);
        AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE = new Agent("AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE", 33, 32);
        AGENT_IPO_ACCESS_MATERIAL_UPDATE = new Agent("AGENT_IPO_ACCESS_MATERIAL_UPDATE", 34, 33);
        AGENT_IPO_ACCESS_ORDER_EXPIRATION = new Agent("AGENT_IPO_ACCESS_ORDER_EXPIRATION", 35, 34);
        AGENT_IPO_ACCESS_IPO_CANCELED = new Agent("AGENT_IPO_ACCESS_IPO_CANCELED", 36, 35);
        AGENT_IPO_ACCESS_IPO_DELAYED = new Agent("AGENT_IPO_ACCESS_IPO_DELAYED", 37, 36);
        AGENT_INSUFFICIENT_BUYING_POWER = new Agent("AGENT_INSUFFICIENT_BUYING_POWER", 38, 37);
        AGENT_MAINST_HEALER = new Agent("AGENT_MAINST_HEALER", 39, 38);
        AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER = new Agent("AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER", 40, 39);
        AGENT_DEBIT_CARD_REWARD = new Agent("AGENT_DEBIT_CARD_REWARD", 41, 40);
        AGENT_CHECKOUT_FLOW_RECOMMENDATIONS = new Agent("AGENT_CHECKOUT_FLOW_RECOMMENDATIONS", 42, 41);
        AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST = new Agent("AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST", 43, 42);
        AGENT_IPO_ACCESS_USER_MOVED_TO_DSP = new Agent("AGENT_IPO_ACCESS_USER_MOVED_TO_DSP", 44, 43);
        AGENT_USER_SOLICITED = new Agent("AGENT_USER_SOLICITED", 45, 44);
        AGENT_INVENTORY_MANAGEMENT = new Agent("AGENT_INVENTORY_MANAGEMENT", 46, 45);
        AGENT_IPO_ACCESS_USER_IS_EMPLOYEE = new Agent("AGENT_IPO_ACCESS_USER_IS_EMPLOYEE", 47, 46);
        Agent_AGENT_DELAYED_EXTENDED_HOURS = new Agent("Agent_AGENT_DELAYED_EXTENDED_HOURS", 48, 47);
        AGENT_PAYCHECK_INVESTMENT = new Agent("AGENT_PAYCHECK_INVESTMENT", 49, 48);
        AGENT_INVEST_FLOW_USER = new Agent("AGENT_INVEST_FLOW_USER", 50, 49);
        AGENT_RECURRING_RETIREMENT = new Agent("AGENT_RECURRING_RETIREMENT", 51, 50);
        AGENT_ORDER_BATCHER = new Agent("AGENT_ORDER_BATCHER", 52, 51);
        AGENT_INSUFFICIENT_RESERVED_BUYING_POWER = new Agent("AGENT_INSUFFICIENT_RESERVED_BUYING_POWER", 53, 52);
        AGENT_MARGIN_PRELIM = new Agent("AGENT_MARGIN_PRELIM", 54, 53);
        AGENT_ADT_KILL_SWITCH = new Agent("AGENT_ADT_KILL_SWITCH", 55, 54);
        AGENT_ADVISORY = new Agent("AGENT_ADVISORY", 56, 55);
        AGENT_FRACTIONAL_ROUND_UP = new Agent("AGENT_FRACTIONAL_ROUND_UP", 57, 56);
        AGENT_TRADING_VIEW = new Agent("AGENT_TRADING_VIEW", 58, 57);
        AGENT_API_USER = new Agent("AGENT_API_USER", 59, 58);
        AGENT_ESTATES_WRITTEN_INSTRUCTION = new Agent("AGENT_ESTATES_WRITTEN_INSTRUCTION", 60, 59);
        AGENT_FUTURES_GENERAL_INTRADAY_RISK = new Agent("AGENT_FUTURES_GENERAL_INTRADAY_RISK", 61, 60);
        AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC = new Agent("AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC", 62, 61);
        AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT = new Agent("AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT", 63, 62);
        AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT = new Agent("AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT", 64, 63);
        AGENT_DXTRADE = new Agent("AGENT_DXTRADE", 65, 64);
        AGENT_RHS_TRADING = new Agent("AGENT_RHS_TRADING", 66, 65);
        AGENT_FRACTIONAL_SHARES_LIQUIDATION = new Agent("AGENT_FRACTIONAL_SHARES_LIQUIDATION", 67, 66);
        AGENT_CANCEL_ON_EXTERNAL_HALT = new Agent("AGENT_CANCEL_ON_EXTERNAL_HALT", 68, 67);
        AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION = new Agent("AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION", 69, 68);
        AGENT_FX_PRINCIPAL_TRADING_DISABLED = new Agent("AGENT_FX_PRINCIPAL_TRADING_DISABLED", 70, 69);
        AGENT_CRYPTO_FLATTEN = new Agent("AGENT_CRYPTO_FLATTEN", 71, 70);
        AGENT_EQUITY_FLATTEN = new Agent("AGENT_EQUITY_FLATTEN", 72, 71);
        AGENT_CRYPTO_PERPETUALS = new Agent("AGENT_CRYPTO_PERPETUALS", 73, 72);
        AGENT_CRYPTO_TOKENIZATION_FX_CHANGE = new Agent("AGENT_CRYPTO_TOKENIZATION_FX_CHANGE", 74, 73);
        AGENT_BUYIN_ALLOCATION = new Agent("AGENT_BUYIN_ALLOCATION", 75, 74);
        Agent[] agentArr$values = $values();
        $VALUES = agentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(agentArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Agent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Agent>(orCreateKotlinClass, syntax, agent) { // from class: rosetta.order.Agent$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Agent fromValue(int value) {
                return Agent.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Agent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/Agent$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/Agent;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Agent fromValue(int value) {
            switch (value) {
                case 0:
                    return Agent.AGENT_UNSPECIFIED;
                case 1:
                    return Agent.AGENT_USER;
                case 2:
                    return Agent.AGENT_MAINST;
                case 3:
                    return Agent.AGENT_EXECUTION_VENUE;
                case 4:
                    return Agent.AGENT_TRADEDESK;
                case 5:
                    return Agent.AGENT_BROKEBACK;
                case 6:
                    return Agent.AGENT_CORPORATE_ACTION;
                case 7:
                    return Agent.AGENT_STALE_GTC;
                case 8:
                    return Agent.AGENT_CARAVAN;
                case 9:
                    return Agent.AGENT_NUMMUS;
                case 10:
                    return Agent.AGENT_SICKLE;
                case 11:
                    return Agent.AGENT_EXPIRING_OPTION;
                case 12:
                    return Agent.AGENT_GET_OUT;
                case 13:
                    return Agent.AGENT_RETRY;
                case 14:
                    return Agent.AGENT_UPDATEMARGIN;
                case 15:
                    return Agent.AGENT_FRAC_MAINST;
                case 16:
                    return Agent.AGENT_DRIP;
                case 17:
                    return Agent.AGENT_FRAC_MAINST_ADJUSTMENT_ORDER;
                case 18:
                    return Agent.AGENT_RECURRING;
                case 19:
                    return Agent.AGENT_FRAC_MAINST_NETTED_ORDER;
                case 20:
                    return Agent.AGENT_FRAC_MAINST_PASS_THROUGH_ORDER;
                case 21:
                    return Agent.AGENT_TRADEDESK_MANUAL;
                case 22:
                    return Agent.AGENT_REFERRAL_INVENTORY;
                case 23:
                    return Agent.AGENT_MARGIN_CALL;
                case 24:
                    return Agent.AGENT_DAY_TRADES;
                case 25:
                    return Agent.AGENT_SYNC_INSTRUMENTS;
                case 26:
                    return Agent.AGENT_SYNC_QUIVER_INSTRUMENTS;
                case 27:
                    return Agent.AGENT_RESTRICTED_ORDER;
                case 28:
                    return Agent.AGENT_IPO_ACCESS_INVALID_PRICE;
                case 29:
                    return Agent.AGENT_IPO_ACCESS_NO_ALLOCATION;
                case 30:
                    return Agent.AGENT_IPO_ACCESS_PRICE_CHANGED;
                case 31:
                    return Agent.AGENT_IPO_ACCESS_PRICE_FINALIZED;
                case 32:
                    return Agent.AGENT_IPO_ACCESS_CREATED_OUT_OF_RANGE;
                case 33:
                    return Agent.AGENT_IPO_ACCESS_MATERIAL_UPDATE;
                case 34:
                    return Agent.AGENT_IPO_ACCESS_ORDER_EXPIRATION;
                case 35:
                    return Agent.AGENT_IPO_ACCESS_IPO_CANCELED;
                case 36:
                    return Agent.AGENT_IPO_ACCESS_IPO_DELAYED;
                case 37:
                    return Agent.AGENT_INSUFFICIENT_BUYING_POWER;
                case 38:
                    return Agent.AGENT_MAINST_HEALER;
                case 39:
                    return Agent.AGENT_FRAC_MAINST_NETTED_ADJUSTMENT_ORDER;
                case 40:
                    return Agent.AGENT_DEBIT_CARD_REWARD;
                case 41:
                    return Agent.AGENT_CHECKOUT_FLOW_RECOMMENDATIONS;
                case 42:
                    return Agent.AGENT_IPO_ACCESS_USER_NOT_IN_DSP_LIST;
                case 43:
                    return Agent.AGENT_IPO_ACCESS_USER_MOVED_TO_DSP;
                case 44:
                    return Agent.AGENT_USER_SOLICITED;
                case 45:
                    return Agent.AGENT_INVENTORY_MANAGEMENT;
                case 46:
                    return Agent.AGENT_IPO_ACCESS_USER_IS_EMPLOYEE;
                case 47:
                    return Agent.Agent_AGENT_DELAYED_EXTENDED_HOURS;
                case 48:
                    return Agent.AGENT_PAYCHECK_INVESTMENT;
                case 49:
                    return Agent.AGENT_INVEST_FLOW_USER;
                case 50:
                    return Agent.AGENT_RECURRING_RETIREMENT;
                case 51:
                    return Agent.AGENT_ORDER_BATCHER;
                case 52:
                    return Agent.AGENT_INSUFFICIENT_RESERVED_BUYING_POWER;
                case 53:
                    return Agent.AGENT_MARGIN_PRELIM;
                case 54:
                    return Agent.AGENT_ADT_KILL_SWITCH;
                case 55:
                    return Agent.AGENT_ADVISORY;
                case 56:
                    return Agent.AGENT_FRACTIONAL_ROUND_UP;
                case 57:
                    return Agent.AGENT_TRADING_VIEW;
                case 58:
                    return Agent.AGENT_API_USER;
                case 59:
                    return Agent.AGENT_ESTATES_WRITTEN_INSTRUCTION;
                case 60:
                    return Agent.AGENT_FUTURES_GENERAL_INTRADAY_RISK;
                case 61:
                    return Agent.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_ATC;
                case 62:
                    return Agent.AGENT_FUTURES_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT;
                case 63:
                    return Agent.AGENT_FUTURES_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT;
                case 64:
                    return Agent.AGENT_DXTRADE;
                case 65:
                    return Agent.AGENT_RHS_TRADING;
                case 66:
                    return Agent.AGENT_FRACTIONAL_SHARES_LIQUIDATION;
                case 67:
                    return Agent.AGENT_CANCEL_ON_EXTERNAL_HALT;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return Agent.AGENT_ACAT_FRACTIONAL_SHARES_LIQUIDATION;
                case 69:
                    return Agent.AGENT_FX_PRINCIPAL_TRADING_DISABLED;
                case 70:
                    return Agent.AGENT_CRYPTO_FLATTEN;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return Agent.AGENT_EQUITY_FLATTEN;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return Agent.AGENT_CRYPTO_PERPETUALS;
                case 73:
                    return Agent.AGENT_CRYPTO_TOKENIZATION_FX_CHANGE;
                case 74:
                    return Agent.AGENT_BUYIN_ALLOCATION;
                default:
                    return null;
            }
        }
    }

    public static Agent valueOf(String str) {
        return (Agent) Enum.valueOf(Agent.class, str);
    }

    public static Agent[] values() {
        return (Agent[]) $VALUES.clone();
    }
}
