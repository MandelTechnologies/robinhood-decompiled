package com.robinhood.userleap.survey;

import com.robinhood.enums.RhEnum;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Survey.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\bo\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\br¨\u0006s"}, m3636d2 = {"Lcom/robinhood/userleap/survey/Survey;", "Lcom/robinhood/enums/RhEnum;", "", "", "serverValue", "j$/time/Duration", "delay", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lj$/time/Duration;)V", "Ljava/lang/String;", "getServerValue", "()Ljava/lang/String;", "Lj$/time/Duration;", "getDelay", "()Lj$/time/Duration;", "Companion", "TEST", "FIVE_SEC_CASH_TAB", "FIVE_SEC_HOME_TAB", "FIVE_SEC_PROFILES_TAB", "GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_STOCK", "GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_STOCK", "GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_ETF", "GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_ETF", "GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_PORTFOLIO", "GRAPH_LAYOUT_TIMESPAN_CHANGE_ALL_TIME_PORTFOLIO", "PORTFOLIO_HISTORY_GRAPH_VIEW_THREE_SEC", "DETAILS_STOCK_BACK", "DETAILS_STOCK_THREE_SEC", "DETAILS_STOCK_SCROLL_FIVE_SEC", "DETAILS_STOCK_ETF_BACK", "DETAILS_STOCK_ETF_THREE_SEC", "DETAILS_STOCK_ETF_SCROLL_FIVE_SEC", "CREATE_LIST", "ADD_TO_LIST", "RECURRING_INVESTMENTS_MANAGE", "RECURRING_INVESTMENTS_CREATE", "RECURRING_INVESTMENTS_DELETE", "RECURRING_INVESTMENTS_CHANGE_PAYMENT", "RECURRING_INVESTMENTS_VIEW", "RECURRING_INVESTMENTS_PAUSE", "RECURRING_INVESTMENTS_DROP_FROM_CREATION_EQUITY", "RECURRING_INVESTMENTS_DROP_FROM_CREATION_CRYPTO", "GOLD_UPGRADE", "GOLD_UPGRADE_V2", "GOLD_DOWNGRADE", "GOLD_UPGRADE_DROP_OFF", "SWEEP_ONBOARDING_DROP_OFF", "GOLD_DEFAULT_OPT_IN_SUBSCRIBERS", "GOLD_DEFAULT_OPT_IN_NON_SUBSCRIBERS", "MARGIN_OPT_IN", "MARGIN_TURN_OFF", "DRIP_ONBOARDED", "DIRECT_DEPOSIT_SETUP_CHOICE_DROP_OFF", "DIRECT_DEPOSIT_PREFILLED_INTRO_DROP_OFF", "DIRECT_DEPOSIT_SWITCHER_SEARCH_DROP_OFF", "DIRECT_DEPOSIT_PARTIAL_PAYCHECK_DROP_OFF", "DEPOSIT_FUNDS_V2", "START_EXTRA_CASH_CANCELLATION_SURVEY", "WITHDRAW_FUNDS", "WITHDRAW_FUNDS_DEBIT_CARD", "WITHDRAW_FUNDS_INSTANT_BANK_TRANSFER", "WITHDRAW_FUNDS_V2", "WITHDRAW_FUNDS_WIRES", "WITHDRAW_FUNDS_CHURN_90", "WITHDRAW_FUNDS_CHURN_100", "CX_CALL_STATUS_SCREEN_CANCEL", "CX_CALL_TRIAGE_POPUP_CANCEL", "CX_MISSED_CALL_STATUS_SCREEN_REQUEUE", "CX_MISSED_CALL_TRIAGE_MODAL_REQUEUE", "CX_MISSED_CALL_REQUEUE_DISMISS", "CX_CALL_STATUS_SCREEN_DISMISS", "RECOMMENDATIONS_EXIT_INTRO", "RECOMMENDATIONS_EXIT_FLOW", "RECOMMENDATION_AFTER_SUBMISSION", "REFERRAL_REWARD_OFFER_CLOSED_NO_ACTION", "REFERRAL_CONTACTS_LIST_CLOSED_NO_ACTION", "REFERRAL_INVITE_SENT_CONFIRMATION_ALERT_DISMISSED", "RETIREMENT_EXIT_ONBOARDING", "RETIREMENT_LEARN_AND_EARN_EXIT_FUNDING", "RETIREMENT_LEARN_AND_EARN_ONBOARDING_SUCCESS", "RETIREMENT_LEARN_AND_EARN_UNFUNDED_SUCCESS", "RETIREMENT_EXIT_CONTRIBUTION_CELEBRATION", "FIVE_SEC_RETIREMENT_TAB", "SLIP_ONBOARDING_EXIT", "SLIP_ONBOARDING_SIGNUP", "SLIP_DISABLE_REASON", "CRYPTO_ALERT_CHURN_SETTING", "FIVE_SEC_CRYPTO_ALERT_CDP", "SPLIT_YOUR_PAYCHECK_DROP_OFF", "FIVE_SEC_PAYCHECK_HUB", "FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L2", "FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L3", "ORDER_CONFIRMATION_STRAT_BUILDER_L2", "ORDER_CONFIRMATION_STRAT_BUILDER_L3", "ORDER_CONFIRMATION_NORMAL_CHAIN_L2", "ORDER_CONFIRMATION_NORMAL_CHAIN_L3", "SAVE_CHAIN_CUSTOMIZATION", "ACCOUNT_ACTIVITY_EXPORTER_FIRST", "ACCOUNT_ACTIVITY_EXPORTER_LONG_TERM", "P2P_UPSELL_SHEET_DISMISS", "P2P_CREATE_DROP_OFF", "P2P_REQUEST_DECLINE", "P2P_REQUEST_CREATED", "P2P_TRANSFER_DECLINE", "P2P_TRANSFER_CREATED", "TWENTY_FOUR_HOUR_MARKET_POST_LAUNCH", "UK_ABANDON_QUEUED_DEPOSIT_FLOW", "UK_ABANDON_POST_APPROVAL_DEPOSIT_FLOW", "JOINT_ACCOUNTS_PRIMARY_VALUE_PROPS_EXIT", "JOINT_ACCOUNTS_SECONDARY_VALUE_PROPS_EXIT", "GOLD_NATIVE_FUNDING_UPSELL_YG", "GOLD_NATIVE_FUNDING_UPSELL_NG", "ACATS_IN_COMPLETED_FLOW_2_SECONDS", "ACATS_IN_ABANDONED_FLOW", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Survey implements RhEnum<Survey> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Survey[] $VALUES;
    public static final Survey ACATS_IN_ABANDONED_FLOW;
    public static final Survey ACATS_IN_COMPLETED_FLOW_2_SECONDS;
    public static final Survey ACCOUNT_ACTIVITY_EXPORTER_FIRST;
    public static final Survey ACCOUNT_ACTIVITY_EXPORTER_LONG_TERM;
    public static final Survey ADD_TO_LIST;
    public static final Survey CREATE_LIST;
    public static final Survey CRYPTO_ALERT_CHURN_SETTING;
    public static final Survey CX_CALL_STATUS_SCREEN_CANCEL;
    public static final Survey CX_CALL_STATUS_SCREEN_DISMISS;
    public static final Survey CX_CALL_TRIAGE_POPUP_CANCEL;
    public static final Survey CX_MISSED_CALL_REQUEUE_DISMISS;
    public static final Survey CX_MISSED_CALL_STATUS_SCREEN_REQUEUE;
    public static final Survey CX_MISSED_CALL_TRIAGE_MODAL_REQUEUE;
    public static final Survey DEPOSIT_FUNDS_V2;
    public static final Survey DETAILS_STOCK_BACK;
    public static final Survey DETAILS_STOCK_ETF_BACK;
    public static final Survey DETAILS_STOCK_ETF_SCROLL_FIVE_SEC;
    public static final Survey DETAILS_STOCK_ETF_THREE_SEC;
    public static final Survey DETAILS_STOCK_SCROLL_FIVE_SEC;
    public static final Survey DETAILS_STOCK_THREE_SEC;
    public static final Survey DIRECT_DEPOSIT_PARTIAL_PAYCHECK_DROP_OFF;
    public static final Survey DIRECT_DEPOSIT_PREFILLED_INTRO_DROP_OFF;
    public static final Survey DIRECT_DEPOSIT_SETUP_CHOICE_DROP_OFF;
    public static final Survey DIRECT_DEPOSIT_SWITCHER_SEARCH_DROP_OFF;
    public static final Survey DRIP_ONBOARDED;
    public static final Survey FIVE_SEC_CASH_TAB;
    public static final Survey FIVE_SEC_CRYPTO_ALERT_CDP;
    public static final Survey FIVE_SEC_HOME_TAB;
    public static final Survey FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L2;
    public static final Survey FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L3;
    public static final Survey FIVE_SEC_PAYCHECK_HUB;
    public static final Survey FIVE_SEC_PROFILES_TAB;
    public static final Survey FIVE_SEC_RETIREMENT_TAB;
    public static final Survey GOLD_DEFAULT_OPT_IN_NON_SUBSCRIBERS;
    public static final Survey GOLD_DEFAULT_OPT_IN_SUBSCRIBERS;
    public static final Survey GOLD_DOWNGRADE;
    public static final Survey GOLD_NATIVE_FUNDING_UPSELL_NG;
    public static final Survey GOLD_NATIVE_FUNDING_UPSELL_YG;
    public static final Survey GOLD_UPGRADE;
    public static final Survey GOLD_UPGRADE_DROP_OFF;
    public static final Survey GOLD_UPGRADE_V2;
    public static final Survey GRAPH_LAYOUT_TIMESPAN_CHANGE_ALL_TIME_PORTFOLIO;
    public static final Survey GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_ETF;
    public static final Survey GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_STOCK;
    public static final Survey GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_ETF;
    public static final Survey GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_PORTFOLIO;
    public static final Survey GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_STOCK;
    public static final Survey JOINT_ACCOUNTS_PRIMARY_VALUE_PROPS_EXIT;
    public static final Survey JOINT_ACCOUNTS_SECONDARY_VALUE_PROPS_EXIT;
    public static final Survey MARGIN_OPT_IN;
    public static final Survey MARGIN_TURN_OFF;
    public static final Survey ORDER_CONFIRMATION_NORMAL_CHAIN_L2;
    public static final Survey ORDER_CONFIRMATION_NORMAL_CHAIN_L3;
    public static final Survey ORDER_CONFIRMATION_STRAT_BUILDER_L2;
    public static final Survey ORDER_CONFIRMATION_STRAT_BUILDER_L3;
    public static final Survey P2P_CREATE_DROP_OFF;
    public static final Survey P2P_REQUEST_CREATED;
    public static final Survey P2P_REQUEST_DECLINE;
    public static final Survey P2P_TRANSFER_CREATED;
    public static final Survey P2P_TRANSFER_DECLINE;
    public static final Survey P2P_UPSELL_SHEET_DISMISS;
    public static final Survey PORTFOLIO_HISTORY_GRAPH_VIEW_THREE_SEC;
    public static final Survey RECOMMENDATIONS_EXIT_FLOW;
    public static final Survey RECOMMENDATIONS_EXIT_INTRO;
    public static final Survey RECOMMENDATION_AFTER_SUBMISSION;
    public static final Survey RECURRING_INVESTMENTS_CHANGE_PAYMENT;
    public static final Survey RECURRING_INVESTMENTS_CREATE;
    public static final Survey RECURRING_INVESTMENTS_DELETE;
    public static final Survey RECURRING_INVESTMENTS_DROP_FROM_CREATION_CRYPTO;
    public static final Survey RECURRING_INVESTMENTS_DROP_FROM_CREATION_EQUITY;
    public static final Survey RECURRING_INVESTMENTS_MANAGE;
    public static final Survey RECURRING_INVESTMENTS_PAUSE;
    public static final Survey RECURRING_INVESTMENTS_VIEW;
    public static final Survey REFERRAL_CONTACTS_LIST_CLOSED_NO_ACTION;
    public static final Survey REFERRAL_INVITE_SENT_CONFIRMATION_ALERT_DISMISSED;
    public static final Survey REFERRAL_REWARD_OFFER_CLOSED_NO_ACTION;
    public static final Survey RETIREMENT_EXIT_CONTRIBUTION_CELEBRATION;
    public static final Survey RETIREMENT_EXIT_ONBOARDING;
    public static final Survey RETIREMENT_LEARN_AND_EARN_EXIT_FUNDING;
    public static final Survey RETIREMENT_LEARN_AND_EARN_ONBOARDING_SUCCESS;
    public static final Survey RETIREMENT_LEARN_AND_EARN_UNFUNDED_SUCCESS;
    public static final Survey SAVE_CHAIN_CUSTOMIZATION;
    public static final Survey SLIP_DISABLE_REASON;
    public static final Survey SLIP_ONBOARDING_EXIT;
    public static final Survey SLIP_ONBOARDING_SIGNUP;
    public static final Survey SPLIT_YOUR_PAYCHECK_DROP_OFF;
    public static final Survey START_EXTRA_CASH_CANCELLATION_SURVEY;
    public static final Survey SWEEP_ONBOARDING_DROP_OFF;
    public static final Survey TEST = new Survey("TEST", 0, "android-user-leap-event", null, 2, null);
    public static final Survey TWENTY_FOUR_HOUR_MARKET_POST_LAUNCH;
    public static final Survey UK_ABANDON_POST_APPROVAL_DEPOSIT_FLOW;
    public static final Survey UK_ABANDON_QUEUED_DEPOSIT_FLOW;
    public static final Survey WITHDRAW_FUNDS;
    public static final Survey WITHDRAW_FUNDS_CHURN_100;
    public static final Survey WITHDRAW_FUNDS_CHURN_90;
    public static final Survey WITHDRAW_FUNDS_DEBIT_CARD;
    public static final Survey WITHDRAW_FUNDS_INSTANT_BANK_TRANSFER;
    public static final Survey WITHDRAW_FUNDS_V2;
    public static final Survey WITHDRAW_FUNDS_WIRES;
    private final Duration delay;
    private final String serverValue;

    private static final /* synthetic */ Survey[] $values() {
        return new Survey[]{TEST, FIVE_SEC_CASH_TAB, FIVE_SEC_HOME_TAB, FIVE_SEC_PROFILES_TAB, GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_STOCK, GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_STOCK, GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_ETF, GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_ETF, GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_PORTFOLIO, GRAPH_LAYOUT_TIMESPAN_CHANGE_ALL_TIME_PORTFOLIO, PORTFOLIO_HISTORY_GRAPH_VIEW_THREE_SEC, DETAILS_STOCK_BACK, DETAILS_STOCK_THREE_SEC, DETAILS_STOCK_SCROLL_FIVE_SEC, DETAILS_STOCK_ETF_BACK, DETAILS_STOCK_ETF_THREE_SEC, DETAILS_STOCK_ETF_SCROLL_FIVE_SEC, CREATE_LIST, ADD_TO_LIST, RECURRING_INVESTMENTS_MANAGE, RECURRING_INVESTMENTS_CREATE, RECURRING_INVESTMENTS_DELETE, RECURRING_INVESTMENTS_CHANGE_PAYMENT, RECURRING_INVESTMENTS_VIEW, RECURRING_INVESTMENTS_PAUSE, RECURRING_INVESTMENTS_DROP_FROM_CREATION_EQUITY, RECURRING_INVESTMENTS_DROP_FROM_CREATION_CRYPTO, GOLD_UPGRADE, GOLD_UPGRADE_V2, GOLD_DOWNGRADE, GOLD_UPGRADE_DROP_OFF, SWEEP_ONBOARDING_DROP_OFF, GOLD_DEFAULT_OPT_IN_SUBSCRIBERS, GOLD_DEFAULT_OPT_IN_NON_SUBSCRIBERS, MARGIN_OPT_IN, MARGIN_TURN_OFF, DRIP_ONBOARDED, DIRECT_DEPOSIT_SETUP_CHOICE_DROP_OFF, DIRECT_DEPOSIT_PREFILLED_INTRO_DROP_OFF, DIRECT_DEPOSIT_SWITCHER_SEARCH_DROP_OFF, DIRECT_DEPOSIT_PARTIAL_PAYCHECK_DROP_OFF, DEPOSIT_FUNDS_V2, START_EXTRA_CASH_CANCELLATION_SURVEY, WITHDRAW_FUNDS, WITHDRAW_FUNDS_DEBIT_CARD, WITHDRAW_FUNDS_INSTANT_BANK_TRANSFER, WITHDRAW_FUNDS_V2, WITHDRAW_FUNDS_WIRES, WITHDRAW_FUNDS_CHURN_90, WITHDRAW_FUNDS_CHURN_100, CX_CALL_STATUS_SCREEN_CANCEL, CX_CALL_TRIAGE_POPUP_CANCEL, CX_MISSED_CALL_STATUS_SCREEN_REQUEUE, CX_MISSED_CALL_TRIAGE_MODAL_REQUEUE, CX_MISSED_CALL_REQUEUE_DISMISS, CX_CALL_STATUS_SCREEN_DISMISS, RECOMMENDATIONS_EXIT_INTRO, RECOMMENDATIONS_EXIT_FLOW, RECOMMENDATION_AFTER_SUBMISSION, REFERRAL_REWARD_OFFER_CLOSED_NO_ACTION, REFERRAL_CONTACTS_LIST_CLOSED_NO_ACTION, REFERRAL_INVITE_SENT_CONFIRMATION_ALERT_DISMISSED, RETIREMENT_EXIT_ONBOARDING, RETIREMENT_LEARN_AND_EARN_EXIT_FUNDING, RETIREMENT_LEARN_AND_EARN_ONBOARDING_SUCCESS, RETIREMENT_LEARN_AND_EARN_UNFUNDED_SUCCESS, RETIREMENT_EXIT_CONTRIBUTION_CELEBRATION, FIVE_SEC_RETIREMENT_TAB, SLIP_ONBOARDING_EXIT, SLIP_ONBOARDING_SIGNUP, SLIP_DISABLE_REASON, CRYPTO_ALERT_CHURN_SETTING, FIVE_SEC_CRYPTO_ALERT_CDP, SPLIT_YOUR_PAYCHECK_DROP_OFF, FIVE_SEC_PAYCHECK_HUB, FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L2, FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L3, ORDER_CONFIRMATION_STRAT_BUILDER_L2, ORDER_CONFIRMATION_STRAT_BUILDER_L3, ORDER_CONFIRMATION_NORMAL_CHAIN_L2, ORDER_CONFIRMATION_NORMAL_CHAIN_L3, SAVE_CHAIN_CUSTOMIZATION, ACCOUNT_ACTIVITY_EXPORTER_FIRST, ACCOUNT_ACTIVITY_EXPORTER_LONG_TERM, P2P_UPSELL_SHEET_DISMISS, P2P_CREATE_DROP_OFF, P2P_REQUEST_DECLINE, P2P_REQUEST_CREATED, P2P_TRANSFER_DECLINE, P2P_TRANSFER_CREATED, TWENTY_FOUR_HOUR_MARKET_POST_LAUNCH, UK_ABANDON_QUEUED_DEPOSIT_FLOW, UK_ABANDON_POST_APPROVAL_DEPOSIT_FLOW, JOINT_ACCOUNTS_PRIMARY_VALUE_PROPS_EXIT, JOINT_ACCOUNTS_SECONDARY_VALUE_PROPS_EXIT, GOLD_NATIVE_FUNDING_UPSELL_YG, GOLD_NATIVE_FUNDING_UPSELL_NG, ACATS_IN_COMPLETED_FLOW_2_SECONDS, ACATS_IN_ABANDONED_FLOW};
    }

    public static EnumEntries<Survey> getEntries() {
        return $ENTRIES;
    }

    private Survey(String str, int i, String str2, Duration duration) {
        this.serverValue = str2;
        this.delay = duration;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    /* synthetic */ Survey(String str, int i, String str2, Duration duration, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? Duration.ZERO : duration);
    }

    public final Duration getDelay() {
        return this.delay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Durations durations = Durations.INSTANCE;
        FIVE_SEC_CASH_TAB = new Survey("FIVE_SEC_CASH_TAB", 1, "5s-cash-tab", durations.getFIVE_SECONDS());
        FIVE_SEC_HOME_TAB = new Survey("FIVE_SEC_HOME_TAB", 2, "5s-home-tab", durations.getFIVE_SECONDS());
        FIVE_SEC_PROFILES_TAB = new Survey("FIVE_SEC_PROFILES_TAB", 3, "5s-profiles-tab", durations.getFIVE_SECONDS());
        GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_STOCK = new Survey("GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_STOCK", 4, "sdp-1y", null, 2, null);
        GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_STOCK = new Survey("GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_STOCK", 5, "sdp-5y", null, 2, null);
        GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_ETF = new Survey("GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_ETF", 6, "edp-1y", null, 2, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_ETF = new Survey("GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_ETF", 7, "edp-5y", null, 2, defaultConstructorMarker);
        GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_PORTFOLIO = new Survey("GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_PORTFOLIO", 8, "hp-1y", null, 2, null);
        GRAPH_LAYOUT_TIMESPAN_CHANGE_ALL_TIME_PORTFOLIO = new Survey("GRAPH_LAYOUT_TIMESPAN_CHANGE_ALL_TIME_PORTFOLIO", 9, "hp-all", null, 2, null);
        PORTFOLIO_HISTORY_GRAPH_VIEW_THREE_SEC = new Survey("PORTFOLIO_HISTORY_GRAPH_VIEW_THREE_SEC", 10, "bignumber-2s", durations.getTWO_SECONDS());
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        Duration duration = null;
        DETAILS_STOCK_BACK = new Survey("DETAILS_STOCK_BACK", 11, "sdp-back", duration, i, defaultConstructorMarker2);
        DETAILS_STOCK_THREE_SEC = new Survey("DETAILS_STOCK_THREE_SEC", 12, "sdp-3s", durations.getTHREE_SECONDS());
        DETAILS_STOCK_SCROLL_FIVE_SEC = new Survey("DETAILS_STOCK_SCROLL_FIVE_SEC", 13, "sdp-scroll-5s", durations.getFIVE_SECONDS());
        DETAILS_STOCK_ETF_BACK = new Survey("DETAILS_STOCK_ETF_BACK", 14, "edp-back", duration, i, defaultConstructorMarker2);
        DETAILS_STOCK_ETF_THREE_SEC = new Survey("DETAILS_STOCK_ETF_THREE_SEC", 15, "edp-3s", durations.getTHREE_SECONDS());
        DETAILS_STOCK_ETF_SCROLL_FIVE_SEC = new Survey("DETAILS_STOCK_ETF_SCROLL_FIVE_SEC", 16, "edp-scroll-5s", durations.getFIVE_SECONDS());
        CREATE_LIST = new Survey("CREATE_LIST", 17, "list-create", duration, i, defaultConstructorMarker2);
        ADD_TO_LIST = new Survey("ADD_TO_LIST", 18, "list-add-to", null, 2, 0 == true ? 1 : 0);
        RECURRING_INVESTMENTS_MANAGE = new Survey("RECURRING_INVESTMENTS_MANAGE", 19, "recurring-investments-manage", durations.getFIVE_SECONDS());
        RECURRING_INVESTMENTS_CREATE = new Survey("RECURRING_INVESTMENTS_CREATE", 20, "recurring-investments-create", null, 2, null);
        RECURRING_INVESTMENTS_DELETE = new Survey("RECURRING_INVESTMENTS_DELETE", 21, "recurring-investments-delete", null, 2, 0 == true ? 1 : 0);
        RECURRING_INVESTMENTS_CHANGE_PAYMENT = new Survey("RECURRING_INVESTMENTS_CHANGE_PAYMENT", 22, "recurring-investments-change-payment", null, 2, null);
        RECURRING_INVESTMENTS_VIEW = new Survey("RECURRING_INVESTMENTS_VIEW", 23, "recurring-investments-view", null, 2, defaultConstructorMarker);
        RECURRING_INVESTMENTS_PAUSE = new Survey("RECURRING_INVESTMENTS_PAUSE", 24, "recurring-investments-pause", null, 2, null);
        RECURRING_INVESTMENTS_DROP_FROM_CREATION_EQUITY = new Survey("RECURRING_INVESTMENTS_DROP_FROM_CREATION_EQUITY", 25, "user-intentionally-dropped-from-recurring-creation-flow", null, 2, null);
        RECURRING_INVESTMENTS_DROP_FROM_CREATION_CRYPTO = new Survey("RECURRING_INVESTMENTS_DROP_FROM_CREATION_CRYPTO", 26, "user-intentionally-dropped-from-recurring-creation-flow-crypto", null, 2, null);
        GOLD_UPGRADE = new Survey("GOLD_UPGRADE", 27, "gold-upgraded", null, 2, null);
        GOLD_UPGRADE_V2 = new Survey("GOLD_UPGRADE_V2", 28, "gold-upgraded-v2", durations.getTWO_SECONDS());
        GOLD_DOWNGRADE = new Survey("GOLD_DOWNGRADE", 29, "gold-downgraded", null, 2, null);
        GOLD_UPGRADE_DROP_OFF = new Survey("GOLD_UPGRADE_DROP_OFF", 30, "gold-upgrade-drop-off", null, 2, 0 == true ? 1 : 0);
        SWEEP_ONBOARDING_DROP_OFF = new Survey("SWEEP_ONBOARDING_DROP_OFF", 31, "sweep-onboarding-drop-off", null, 2, null);
        GOLD_DEFAULT_OPT_IN_SUBSCRIBERS = new Survey("GOLD_DEFAULT_OPT_IN_SUBSCRIBERS", 32, "gold-doi-w2-subscribers", null, 2, defaultConstructorMarker);
        GOLD_DEFAULT_OPT_IN_NON_SUBSCRIBERS = new Survey("GOLD_DEFAULT_OPT_IN_NON_SUBSCRIBERS", 33, "gold-doi-w2-non-subscribers", null, 2, null);
        MARGIN_OPT_IN = new Survey("MARGIN_OPT_IN", 34, "margin-turn-on", null, 2, null);
        MARGIN_TURN_OFF = new Survey("MARGIN_TURN_OFF", 35, "margin-turn-off", null, 2, null);
        DRIP_ONBOARDED = new Survey("DRIP_ONBOARDED", 36, "drip-onboarded", null, 2, null);
        DIRECT_DEPOSIT_SETUP_CHOICE_DROP_OFF = new Survey("DIRECT_DEPOSIT_SETUP_CHOICE_DROP_OFF", 37, "dd-rhy-setup-choice-drop-off", null, 2, null);
        DIRECT_DEPOSIT_PREFILLED_INTRO_DROP_OFF = new Survey("DIRECT_DEPOSIT_PREFILLED_INTRO_DROP_OFF", 38, "dd-rhy-prefilled-intro-drop-off", null, 2, 0 == true ? 1 : 0);
        DIRECT_DEPOSIT_SWITCHER_SEARCH_DROP_OFF = new Survey("DIRECT_DEPOSIT_SWITCHER_SEARCH_DROP_OFF", 39, "dd-rhy-switcher-company-search-drop-off", null, 2, null);
        DIRECT_DEPOSIT_PARTIAL_PAYCHECK_DROP_OFF = new Survey("DIRECT_DEPOSIT_PARTIAL_PAYCHECK_DROP_OFF", 40, "dd-rhy-partial-paycheck-drop-off", null, 2, defaultConstructorMarker);
        DEPOSIT_FUNDS_V2 = new Survey("DEPOSIT_FUNDS_V2", 41, "deposit-funds-v2", null, 2, null);
        START_EXTRA_CASH_CANCELLATION_SURVEY = new Survey("START_EXTRA_CASH_CANCELLATION_SURVEY", 42, "start-extra-cash-cancellation-survey", null, 2, null);
        WITHDRAW_FUNDS = new Survey("WITHDRAW_FUNDS", 43, "withdraw-funds", null, 2, null);
        WITHDRAW_FUNDS_DEBIT_CARD = new Survey("WITHDRAW_FUNDS_DEBIT_CARD", 44, "withdraw-funds-debit-card", null, 2, null);
        WITHDRAW_FUNDS_INSTANT_BANK_TRANSFER = new Survey("WITHDRAW_FUNDS_INSTANT_BANK_TRANSFER", 45, "withdraw-funds-instant-bank-transfer", null, 2, null);
        WITHDRAW_FUNDS_V2 = new Survey("WITHDRAW_FUNDS_V2", 46, "withdraw-funds-v2", null, 2, 0 == true ? 1 : 0);
        WITHDRAW_FUNDS_WIRES = new Survey("WITHDRAW_FUNDS_WIRES", 47, "withdraw-funds-wires", null, 2, null);
        WITHDRAW_FUNDS_CHURN_90 = new Survey("WITHDRAW_FUNDS_CHURN_90", 48, "withdraw-funds-churn-90", null, 2, defaultConstructorMarker);
        WITHDRAW_FUNDS_CHURN_100 = new Survey("WITHDRAW_FUNDS_CHURN_100", 49, "withdraw-funds-churn-100", null, 2, null);
        CX_CALL_STATUS_SCREEN_CANCEL = new Survey("CX_CALL_STATUS_SCREEN_CANCEL", 50, "cx-call-status-screen-cancel", null, 2, null);
        CX_CALL_TRIAGE_POPUP_CANCEL = new Survey("CX_CALL_TRIAGE_POPUP_CANCEL", 51, "cx-call-triage-popup-cancel", null, 2, null);
        CX_MISSED_CALL_STATUS_SCREEN_REQUEUE = new Survey("CX_MISSED_CALL_STATUS_SCREEN_REQUEUE", 52, "cx-missed-call-status-screen-requeue", null, 2, null);
        CX_MISSED_CALL_TRIAGE_MODAL_REQUEUE = new Survey("CX_MISSED_CALL_TRIAGE_MODAL_REQUEUE", 53, "cx-missed-call-triage-modal-requeue", null, 2, null);
        CX_MISSED_CALL_REQUEUE_DISMISS = new Survey("CX_MISSED_CALL_REQUEUE_DISMISS", 54, "cx-missed-call-requeue-dismiss", null, 2, 0 == true ? 1 : 0);
        CX_CALL_STATUS_SCREEN_DISMISS = new Survey("CX_CALL_STATUS_SCREEN_DISMISS", 55, "cx-call-status-screen-dismiss", null, 2, null);
        RECOMMENDATIONS_EXIT_INTRO = new Survey("RECOMMENDATIONS_EXIT_INTRO", 56, "recommendations-exit-intro", null, 2, defaultConstructorMarker);
        RECOMMENDATIONS_EXIT_FLOW = new Survey("RECOMMENDATIONS_EXIT_FLOW", 57, "recommendations-exit-flow", null, 2, null);
        RECOMMENDATION_AFTER_SUBMISSION = new Survey("RECOMMENDATION_AFTER_SUBMISSION", 58, "recommendations-after-submission", null, 2, null);
        REFERRAL_REWARD_OFFER_CLOSED_NO_ACTION = new Survey("REFERRAL_REWARD_OFFER_CLOSED_NO_ACTION", 59, "referral-reward-offer-closed-no-action", null, 2, null);
        REFERRAL_CONTACTS_LIST_CLOSED_NO_ACTION = new Survey("REFERRAL_CONTACTS_LIST_CLOSED_NO_ACTION", 60, "referral-contacts-list-closed-no-action", null, 2, null);
        REFERRAL_INVITE_SENT_CONFIRMATION_ALERT_DISMISSED = new Survey("REFERRAL_INVITE_SENT_CONFIRMATION_ALERT_DISMISSED", 61, "referral-invite-sent-confirmation-alert-dismissed", null, 2, null);
        RETIREMENT_EXIT_ONBOARDING = new Survey("RETIREMENT_EXIT_ONBOARDING", 62, "retirement-exit-onboarding", null, 2, 0 == true ? 1 : 0);
        RETIREMENT_LEARN_AND_EARN_EXIT_FUNDING = new Survey("RETIREMENT_LEARN_AND_EARN_EXIT_FUNDING", 63, "ira-learn-and-earn-unfunded-exit-funding", null, 2, null);
        RETIREMENT_LEARN_AND_EARN_ONBOARDING_SUCCESS = new Survey("RETIREMENT_LEARN_AND_EARN_ONBOARDING_SUCCESS", 64, "ira-learn-and-earn-onboarding-success", null, 2, defaultConstructorMarker);
        RETIREMENT_LEARN_AND_EARN_UNFUNDED_SUCCESS = new Survey("RETIREMENT_LEARN_AND_EARN_UNFUNDED_SUCCESS", 65, "ira-learn-and-earn-unfunded-success", null, 2, null);
        RETIREMENT_EXIT_CONTRIBUTION_CELEBRATION = new Survey("RETIREMENT_EXIT_CONTRIBUTION_CELEBRATION", 66, "exit-contribution-celebration", null, 2, null);
        FIVE_SEC_RETIREMENT_TAB = new Survey("FIVE_SEC_RETIREMENT_TAB", 67, "5s-retirement-tab", durations.getFIVE_SECONDS());
        SLIP_ONBOARDING_EXIT = new Survey("SLIP_ONBOARDING_EXIT", 68, "slip-onboarding-exit-reason", null, 2, null);
        SLIP_ONBOARDING_SIGNUP = new Survey("SLIP_ONBOARDING_SIGNUP", 69, "slip-onboarding-signup-reason", null, 2, 0 == true ? 1 : 0);
        SLIP_DISABLE_REASON = new Survey("SLIP_DISABLE_REASON", 70, "slip-disable-reason", null, 2, null);
        CRYPTO_ALERT_CHURN_SETTING = new Survey("CRYPTO_ALERT_CHURN_SETTING", 71, "crypto-alert-churn-setting", null, 2, defaultConstructorMarker);
        FIVE_SEC_CRYPTO_ALERT_CDP = new Survey("FIVE_SEC_CRYPTO_ALERT_CDP", 72, "5s-crypto-alert-cdp", durations.getFIVE_SECONDS());
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        Duration duration2 = null;
        SPLIT_YOUR_PAYCHECK_DROP_OFF = new Survey("SPLIT_YOUR_PAYCHECK_DROP_OFF", 73, "split-your-paycheck-drop-off", duration2, i2, defaultConstructorMarker3);
        FIVE_SEC_PAYCHECK_HUB = new Survey("FIVE_SEC_PAYCHECK_HUB", 74, "5s-paycheck-hub", durations.getFIVE_SECONDS());
        FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L2 = new Survey("FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L2", 75, "5s-on-builder-edu-l2", durations.getFIVE_SECONDS());
        FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L3 = new Survey("FIVE_SEC_OPTIONS_STRATEGY_BUILDER_EDU_L3", 76, "5s-on-builder-edu-l3", durations.getFIVE_SECONDS());
        ORDER_CONFIRMATION_STRAT_BUILDER_L2 = new Survey("ORDER_CONFIRMATION_STRAT_BUILDER_L2", 77, "order-submitted-builder-l2", duration2, i2, defaultConstructorMarker3);
        ORDER_CONFIRMATION_STRAT_BUILDER_L3 = new Survey("ORDER_CONFIRMATION_STRAT_BUILDER_L3", 78, "order-submitted-builder-l3", null, 2, 0 == true ? 1 : 0);
        ORDER_CONFIRMATION_NORMAL_CHAIN_L2 = new Survey("ORDER_CONFIRMATION_NORMAL_CHAIN_L2", 79, "order-submitted-control-l2", null, 2, null);
        ORDER_CONFIRMATION_NORMAL_CHAIN_L3 = new Survey("ORDER_CONFIRMATION_NORMAL_CHAIN_L3", 80, "order-submitted-control-l3", null, 2, defaultConstructorMarker);
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        SAVE_CHAIN_CUSTOMIZATION = new Survey("SAVE_CHAIN_CUSTOMIZATION", 81, "save-chain-customization", durationOfSeconds);
        ACCOUNT_ACTIVITY_EXPORTER_FIRST = new Survey("ACCOUNT_ACTIVITY_EXPORTER_FIRST", 82, "acct-reports-first", durations.getFIVE_SECONDS());
        ACCOUNT_ACTIVITY_EXPORTER_LONG_TERM = new Survey("ACCOUNT_ACTIVITY_EXPORTER_LONG_TERM", 83, "acct-reports-5-plus", null, 2, null);
        P2P_UPSELL_SHEET_DISMISS = new Survey("P2P_UPSELL_SHEET_DISMISS", 84, "p2p_upsell_sheet_dismiss", null, 2, 0 == true ? 1 : 0);
        P2P_CREATE_DROP_OFF = new Survey("P2P_CREATE_DROP_OFF", 85, "p2p_create_drop_off", null, 2, null);
        P2P_REQUEST_DECLINE = new Survey("P2P_REQUEST_DECLINE", 86, "p2p_request_decline", null, 2, defaultConstructorMarker);
        P2P_REQUEST_CREATED = new Survey("P2P_REQUEST_CREATED", 87, "p2p_request_created", null, 2, null);
        P2P_TRANSFER_DECLINE = new Survey("P2P_TRANSFER_DECLINE", 88, "p2p_transfer_decline", null, 2, null);
        P2P_TRANSFER_CREATED = new Survey("P2P_TRANSFER_CREATED", 89, "p2p_transfer_created", null, 2, null);
        TWENTY_FOUR_HOUR_MARKET_POST_LAUNCH = new Survey("TWENTY_FOUR_HOUR_MARKET_POST_LAUNCH", 90, "24hrmarket_postlaunch_survey", durations.getFIVE_SECONDS());
        UK_ABANDON_QUEUED_DEPOSIT_FLOW = new Survey("UK_ABANDON_QUEUED_DEPOSIT_FLOW", 91, "uk-abandon-queued-deposit-flow", 0 == true ? 1 : 0, 2, null);
        UK_ABANDON_POST_APPROVAL_DEPOSIT_FLOW = new Survey("UK_ABANDON_POST_APPROVAL_DEPOSIT_FLOW", 92, "uk-abandon-post-approval-deposit-flow", null, 2, 0 == true ? 1 : 0);
        JOINT_ACCOUNTS_PRIMARY_VALUE_PROPS_EXIT = new Survey("JOINT_ACCOUNTS_PRIMARY_VALUE_PROPS_EXIT", 93, "joint-accounts-primary-value-props-exit", null, 2, null);
        JOINT_ACCOUNTS_SECONDARY_VALUE_PROPS_EXIT = new Survey("JOINT_ACCOUNTS_SECONDARY_VALUE_PROPS_EXIT", 94, "joint-accounts-secondary-value-props-exit", null, 2, defaultConstructorMarker);
        GOLD_NATIVE_FUNDING_UPSELL_YG = new Survey("GOLD_NATIVE_FUNDING_UPSELL_YG", 95, "gold-native-upsell-subscribers", null, 2, null);
        GOLD_NATIVE_FUNDING_UPSELL_NG = new Survey("GOLD_NATIVE_FUNDING_UPSELL_NG", 96, "gold-native-upsell-non-subscribers", null, 2, null);
        ACATS_IN_COMPLETED_FLOW_2_SECONDS = new Survey("ACATS_IN_COMPLETED_FLOW_2_SECONDS", 97, "acats-in-completed-flow-2s", durations.getTWO_SECONDS());
        ACATS_IN_ABANDONED_FLOW = new Survey("ACATS_IN_ABANDONED_FLOW", 98, "acats-in-abandoned", durations.getTWO_SECONDS());
        Survey[] surveyArr$values = $values();
        $VALUES = surveyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(surveyArr$values);
        INSTANCE = new Companion(null);
    }

    public static Survey valueOf(String str) {
        return (Survey) Enum.valueOf(Survey.class, str);
    }

    public static Survey[] values() {
        return (Survey[]) $VALUES.clone();
    }
}
