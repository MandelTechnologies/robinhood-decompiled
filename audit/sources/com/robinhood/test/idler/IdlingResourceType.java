package com.robinhood.test.idler;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdlingResourceType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\ba\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\ba¨\u0006b"}, m3636d2 = {"Lcom/robinhood/test/idler/IdlingResourceType;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN_TABS_VISIBLE", "DIMMING_BOTTOM_SHEET_BEHAVIOR", "LIST_ADAPTER_DIFFING", "MIN_TIME_IN_FLIGHT", "RX_DEBOUNCE", "PLAID_SDK_OPEN", "PLAID_SDK_CONNECT", "PLAID_SDK_FETCH_ACCOUNTS", "POST_SIGN_UP_US", "RDS_BUTTON_ISLOADING", "ADDRESS_AUTOCOMPLETE", "VERIFICATION", "CASH_MANAGEMENT_AGREEMENTS", "OPTION_CHAIN_ACCOUNT", "OPTION_CHAIN_ITEMS_LOADED", "LOADING_VIEW", "TOOLBAR_PROGRESS_BAR", "CAPTURE_PHOTO", "SAVE_PHOTO", "ONBOARDING_ADDRESS_TYPING", "ADDRESS_MAP_LOADING_COMPLETE_ADDRESS", "CREATE_USER", "ACCOUNT_NAVIGATION_ACCOUNT_LOADED", "LOGIN", "EQUITY_TRADE_BUTTON_VISIBLE", "EQUITY_SERVER_TRADE_BUTTON_VISIBLE", "EQUITY_IPOA_NAME_YOUR_OWN_PRICE_BTN_VISIBLE", "EQUITY_IPOA_PRICE_CHANGE_BANNER_VISIBLE", "ORDER_DETAIL_EXPLANATION", "ORDER_DETAIL_STATUS", "ORDER_PENDING", "ORDER_FINAL", "ORDER_CANCELLED", "POST_SIGN_UP_ACCOUNT_LOADED", "LOADING_INVESTMENT_SCHEDULES", "DELAYED_TRANSITION", "BASE_AGREEMENT_CONTENTFUL_LOAD", "BASE_AGREEMENT_SCROLL_TO_BOTTOM", "TRANSFERS_TIMELINE", "CREATE_ACH_TRANSFER_DEPOSIT", "ACH_TRANSFER_CONFIRMATION", "ODYSSEY_LOADING", "ODYSSEY_AGREEMENT_SCROLL", "OPTION_CHAIN_VIEW_PAGER", "OPTION_ORDER", "DOC_UPLOAD_LOADING_REQUEST", "OPTION_ORDER_PENDING", "OPTION_ORDER_FINAL", "WATCHLIST_BUYING_POWER", "WATCHLIST_OPTION_POSITIONS", "MAIN_BANNER_VIEW_DELAY", "SUPPORT_CALL_STATUS", "WEB_CHROME_CLIENT_PROGRESS", "RH_WEB", "SUPPORT_CALL_BANNER_PROVIDER", "ORDER_DETAIL_LOADING_ORDER", "RHY_MIGRATION_AGREEMENT_LOADING", "DEPOSIT_SCHEDULES_LOADED", "INBOX_THREAD_RESPONSE", "INBOX_THREAD_FETCH_LATEST_MESSAGES", "CRYPTO_AGREEMENTS", "CRYPTO_ORDER_CONTEXT_FACTORY", "GOLD_UPGRADE_DISCLOSURE_LOADING", "MARGIN_CHECKLIST", "ACCOUNT_OVERVIEW_LOAD_BALANCES", "ACCOUNT_OVERVIEW_LOAD_UNIFIED_ACCOUNT", "ACCOUNT_OVERVIEW_LOAD_SWEEP_SECTION", "GOLD_SETTINGS_LOADING", "LOADING_BUYING_POWER_RECURRING_FUNDS", "BUYING_POWER_DETAILS_LOADING", "GOLD_UPGRADE_MARGIN_ACCOUNT_LOADING", "GOLD_POST_UPGRADE_CELEBRATION_LOADING", "GOLD_HUB_LOADING", "DISABLE_MARGIN_SPENDING_LOADING", "ENABLE_MARGIN_SPENDING_LOADING", "AGGREGATE_OPTION_TRADE_BAR", "WELCOME_LOADED", "RECOMMENDATIONS_CHECKOUT", "RECOMMENDATIONS_CHECKOUT_DISCLOSURE", "RECOMMENDATIONS_CHECKOUT_ORDER_SUBMISSION", "RECOMMENDATIONS_CHECKOUT_CELEBRATION", "PROMPTS_CHALLENGE_PENDING", "SLIP_ONBOARDING_LOADING", "SLIP_ONBOARDING_AGREEMENTS_LOADING", "SLIP_ONBOARDING_ACCEPT_AGREEMENTS", "QUESTIONNAIRE_QUESTIONS_LOADING", "QUESTIONNAIRE_QUESTIONS_SUBMITTING", "RECURRING_ORDER_NUMPAD_ANIMATION", "RECURRING_ORDER_UNIFIED_ACCOUNT_LOADING", "INVESTMENT_PROFILE_LOADING", "INVESTMENT_PROFILE_SETTINGS_LOADING", "CREATE_TRANSFER_BUTTON_LOADING", "WELCOME_REGION_LOADING", "ACCOUNT_TAB_FRAGMENT_EXPERIMENT", "lib-idling-resources_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IdlingResourceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IdlingResourceType[] $VALUES;
    public static final IdlingResourceType MAIN_TABS_VISIBLE = new IdlingResourceType("MAIN_TABS_VISIBLE", 0);
    public static final IdlingResourceType DIMMING_BOTTOM_SHEET_BEHAVIOR = new IdlingResourceType("DIMMING_BOTTOM_SHEET_BEHAVIOR", 1);
    public static final IdlingResourceType LIST_ADAPTER_DIFFING = new IdlingResourceType("LIST_ADAPTER_DIFFING", 2);
    public static final IdlingResourceType MIN_TIME_IN_FLIGHT = new IdlingResourceType("MIN_TIME_IN_FLIGHT", 3);
    public static final IdlingResourceType RX_DEBOUNCE = new IdlingResourceType("RX_DEBOUNCE", 4);
    public static final IdlingResourceType PLAID_SDK_OPEN = new IdlingResourceType("PLAID_SDK_OPEN", 5);
    public static final IdlingResourceType PLAID_SDK_CONNECT = new IdlingResourceType("PLAID_SDK_CONNECT", 6);
    public static final IdlingResourceType PLAID_SDK_FETCH_ACCOUNTS = new IdlingResourceType("PLAID_SDK_FETCH_ACCOUNTS", 7);
    public static final IdlingResourceType POST_SIGN_UP_US = new IdlingResourceType("POST_SIGN_UP_US", 8);
    public static final IdlingResourceType RDS_BUTTON_ISLOADING = new IdlingResourceType("RDS_BUTTON_ISLOADING", 9);
    public static final IdlingResourceType ADDRESS_AUTOCOMPLETE = new IdlingResourceType("ADDRESS_AUTOCOMPLETE", 10);
    public static final IdlingResourceType VERIFICATION = new IdlingResourceType("VERIFICATION", 11);
    public static final IdlingResourceType CASH_MANAGEMENT_AGREEMENTS = new IdlingResourceType("CASH_MANAGEMENT_AGREEMENTS", 12);
    public static final IdlingResourceType OPTION_CHAIN_ACCOUNT = new IdlingResourceType("OPTION_CHAIN_ACCOUNT", 13);
    public static final IdlingResourceType OPTION_CHAIN_ITEMS_LOADED = new IdlingResourceType("OPTION_CHAIN_ITEMS_LOADED", 14);
    public static final IdlingResourceType LOADING_VIEW = new IdlingResourceType("LOADING_VIEW", 15);
    public static final IdlingResourceType TOOLBAR_PROGRESS_BAR = new IdlingResourceType("TOOLBAR_PROGRESS_BAR", 16);
    public static final IdlingResourceType CAPTURE_PHOTO = new IdlingResourceType("CAPTURE_PHOTO", 17);
    public static final IdlingResourceType SAVE_PHOTO = new IdlingResourceType("SAVE_PHOTO", 18);
    public static final IdlingResourceType ONBOARDING_ADDRESS_TYPING = new IdlingResourceType("ONBOARDING_ADDRESS_TYPING", 19);
    public static final IdlingResourceType ADDRESS_MAP_LOADING_COMPLETE_ADDRESS = new IdlingResourceType("ADDRESS_MAP_LOADING_COMPLETE_ADDRESS", 20);
    public static final IdlingResourceType CREATE_USER = new IdlingResourceType("CREATE_USER", 21);
    public static final IdlingResourceType ACCOUNT_NAVIGATION_ACCOUNT_LOADED = new IdlingResourceType("ACCOUNT_NAVIGATION_ACCOUNT_LOADED", 22);
    public static final IdlingResourceType LOGIN = new IdlingResourceType("LOGIN", 23);
    public static final IdlingResourceType EQUITY_TRADE_BUTTON_VISIBLE = new IdlingResourceType("EQUITY_TRADE_BUTTON_VISIBLE", 24);
    public static final IdlingResourceType EQUITY_SERVER_TRADE_BUTTON_VISIBLE = new IdlingResourceType("EQUITY_SERVER_TRADE_BUTTON_VISIBLE", 25);
    public static final IdlingResourceType EQUITY_IPOA_NAME_YOUR_OWN_PRICE_BTN_VISIBLE = new IdlingResourceType("EQUITY_IPOA_NAME_YOUR_OWN_PRICE_BTN_VISIBLE", 26);
    public static final IdlingResourceType EQUITY_IPOA_PRICE_CHANGE_BANNER_VISIBLE = new IdlingResourceType("EQUITY_IPOA_PRICE_CHANGE_BANNER_VISIBLE", 27);
    public static final IdlingResourceType ORDER_DETAIL_EXPLANATION = new IdlingResourceType("ORDER_DETAIL_EXPLANATION", 28);
    public static final IdlingResourceType ORDER_DETAIL_STATUS = new IdlingResourceType("ORDER_DETAIL_STATUS", 29);
    public static final IdlingResourceType ORDER_PENDING = new IdlingResourceType("ORDER_PENDING", 30);
    public static final IdlingResourceType ORDER_FINAL = new IdlingResourceType("ORDER_FINAL", 31);
    public static final IdlingResourceType ORDER_CANCELLED = new IdlingResourceType("ORDER_CANCELLED", 32);
    public static final IdlingResourceType POST_SIGN_UP_ACCOUNT_LOADED = new IdlingResourceType("POST_SIGN_UP_ACCOUNT_LOADED", 33);
    public static final IdlingResourceType LOADING_INVESTMENT_SCHEDULES = new IdlingResourceType("LOADING_INVESTMENT_SCHEDULES", 34);
    public static final IdlingResourceType DELAYED_TRANSITION = new IdlingResourceType("DELAYED_TRANSITION", 35);
    public static final IdlingResourceType BASE_AGREEMENT_CONTENTFUL_LOAD = new IdlingResourceType("BASE_AGREEMENT_CONTENTFUL_LOAD", 36);
    public static final IdlingResourceType BASE_AGREEMENT_SCROLL_TO_BOTTOM = new IdlingResourceType("BASE_AGREEMENT_SCROLL_TO_BOTTOM", 37);
    public static final IdlingResourceType TRANSFERS_TIMELINE = new IdlingResourceType("TRANSFERS_TIMELINE", 38);
    public static final IdlingResourceType CREATE_ACH_TRANSFER_DEPOSIT = new IdlingResourceType("CREATE_ACH_TRANSFER_DEPOSIT", 39);
    public static final IdlingResourceType ACH_TRANSFER_CONFIRMATION = new IdlingResourceType("ACH_TRANSFER_CONFIRMATION", 40);
    public static final IdlingResourceType ODYSSEY_LOADING = new IdlingResourceType("ODYSSEY_LOADING", 41);
    public static final IdlingResourceType ODYSSEY_AGREEMENT_SCROLL = new IdlingResourceType("ODYSSEY_AGREEMENT_SCROLL", 42);
    public static final IdlingResourceType OPTION_CHAIN_VIEW_PAGER = new IdlingResourceType("OPTION_CHAIN_VIEW_PAGER", 43);
    public static final IdlingResourceType OPTION_ORDER = new IdlingResourceType("OPTION_ORDER", 44);
    public static final IdlingResourceType DOC_UPLOAD_LOADING_REQUEST = new IdlingResourceType("DOC_UPLOAD_LOADING_REQUEST", 45);
    public static final IdlingResourceType OPTION_ORDER_PENDING = new IdlingResourceType("OPTION_ORDER_PENDING", 46);
    public static final IdlingResourceType OPTION_ORDER_FINAL = new IdlingResourceType("OPTION_ORDER_FINAL", 47);
    public static final IdlingResourceType WATCHLIST_BUYING_POWER = new IdlingResourceType("WATCHLIST_BUYING_POWER", 48);
    public static final IdlingResourceType WATCHLIST_OPTION_POSITIONS = new IdlingResourceType("WATCHLIST_OPTION_POSITIONS", 49);
    public static final IdlingResourceType MAIN_BANNER_VIEW_DELAY = new IdlingResourceType("MAIN_BANNER_VIEW_DELAY", 50);
    public static final IdlingResourceType SUPPORT_CALL_STATUS = new IdlingResourceType("SUPPORT_CALL_STATUS", 51);
    public static final IdlingResourceType WEB_CHROME_CLIENT_PROGRESS = new IdlingResourceType("WEB_CHROME_CLIENT_PROGRESS", 52);
    public static final IdlingResourceType RH_WEB = new IdlingResourceType("RH_WEB", 53);
    public static final IdlingResourceType SUPPORT_CALL_BANNER_PROVIDER = new IdlingResourceType("SUPPORT_CALL_BANNER_PROVIDER", 54);
    public static final IdlingResourceType ORDER_DETAIL_LOADING_ORDER = new IdlingResourceType("ORDER_DETAIL_LOADING_ORDER", 55);
    public static final IdlingResourceType RHY_MIGRATION_AGREEMENT_LOADING = new IdlingResourceType("RHY_MIGRATION_AGREEMENT_LOADING", 56);
    public static final IdlingResourceType DEPOSIT_SCHEDULES_LOADED = new IdlingResourceType("DEPOSIT_SCHEDULES_LOADED", 57);
    public static final IdlingResourceType INBOX_THREAD_RESPONSE = new IdlingResourceType("INBOX_THREAD_RESPONSE", 58);
    public static final IdlingResourceType INBOX_THREAD_FETCH_LATEST_MESSAGES = new IdlingResourceType("INBOX_THREAD_FETCH_LATEST_MESSAGES", 59);
    public static final IdlingResourceType CRYPTO_AGREEMENTS = new IdlingResourceType("CRYPTO_AGREEMENTS", 60);
    public static final IdlingResourceType CRYPTO_ORDER_CONTEXT_FACTORY = new IdlingResourceType("CRYPTO_ORDER_CONTEXT_FACTORY", 61);
    public static final IdlingResourceType GOLD_UPGRADE_DISCLOSURE_LOADING = new IdlingResourceType("GOLD_UPGRADE_DISCLOSURE_LOADING", 62);
    public static final IdlingResourceType MARGIN_CHECKLIST = new IdlingResourceType("MARGIN_CHECKLIST", 63);
    public static final IdlingResourceType ACCOUNT_OVERVIEW_LOAD_BALANCES = new IdlingResourceType("ACCOUNT_OVERVIEW_LOAD_BALANCES", 64);
    public static final IdlingResourceType ACCOUNT_OVERVIEW_LOAD_UNIFIED_ACCOUNT = new IdlingResourceType("ACCOUNT_OVERVIEW_LOAD_UNIFIED_ACCOUNT", 65);
    public static final IdlingResourceType ACCOUNT_OVERVIEW_LOAD_SWEEP_SECTION = new IdlingResourceType("ACCOUNT_OVERVIEW_LOAD_SWEEP_SECTION", 66);
    public static final IdlingResourceType GOLD_SETTINGS_LOADING = new IdlingResourceType("GOLD_SETTINGS_LOADING", 67);
    public static final IdlingResourceType LOADING_BUYING_POWER_RECURRING_FUNDS = new IdlingResourceType("LOADING_BUYING_POWER_RECURRING_FUNDS", 68);
    public static final IdlingResourceType BUYING_POWER_DETAILS_LOADING = new IdlingResourceType("BUYING_POWER_DETAILS_LOADING", 69);
    public static final IdlingResourceType GOLD_UPGRADE_MARGIN_ACCOUNT_LOADING = new IdlingResourceType("GOLD_UPGRADE_MARGIN_ACCOUNT_LOADING", 70);
    public static final IdlingResourceType GOLD_POST_UPGRADE_CELEBRATION_LOADING = new IdlingResourceType("GOLD_POST_UPGRADE_CELEBRATION_LOADING", 71);
    public static final IdlingResourceType GOLD_HUB_LOADING = new IdlingResourceType("GOLD_HUB_LOADING", 72);
    public static final IdlingResourceType DISABLE_MARGIN_SPENDING_LOADING = new IdlingResourceType("DISABLE_MARGIN_SPENDING_LOADING", 73);
    public static final IdlingResourceType ENABLE_MARGIN_SPENDING_LOADING = new IdlingResourceType("ENABLE_MARGIN_SPENDING_LOADING", 74);
    public static final IdlingResourceType AGGREGATE_OPTION_TRADE_BAR = new IdlingResourceType("AGGREGATE_OPTION_TRADE_BAR", 75);
    public static final IdlingResourceType WELCOME_LOADED = new IdlingResourceType("WELCOME_LOADED", 76);
    public static final IdlingResourceType RECOMMENDATIONS_CHECKOUT = new IdlingResourceType("RECOMMENDATIONS_CHECKOUT", 77);
    public static final IdlingResourceType RECOMMENDATIONS_CHECKOUT_DISCLOSURE = new IdlingResourceType("RECOMMENDATIONS_CHECKOUT_DISCLOSURE", 78);
    public static final IdlingResourceType RECOMMENDATIONS_CHECKOUT_ORDER_SUBMISSION = new IdlingResourceType("RECOMMENDATIONS_CHECKOUT_ORDER_SUBMISSION", 79);
    public static final IdlingResourceType RECOMMENDATIONS_CHECKOUT_CELEBRATION = new IdlingResourceType("RECOMMENDATIONS_CHECKOUT_CELEBRATION", 80);
    public static final IdlingResourceType PROMPTS_CHALLENGE_PENDING = new IdlingResourceType("PROMPTS_CHALLENGE_PENDING", 81);
    public static final IdlingResourceType SLIP_ONBOARDING_LOADING = new IdlingResourceType("SLIP_ONBOARDING_LOADING", 82);
    public static final IdlingResourceType SLIP_ONBOARDING_AGREEMENTS_LOADING = new IdlingResourceType("SLIP_ONBOARDING_AGREEMENTS_LOADING", 83);
    public static final IdlingResourceType SLIP_ONBOARDING_ACCEPT_AGREEMENTS = new IdlingResourceType("SLIP_ONBOARDING_ACCEPT_AGREEMENTS", 84);
    public static final IdlingResourceType QUESTIONNAIRE_QUESTIONS_LOADING = new IdlingResourceType("QUESTIONNAIRE_QUESTIONS_LOADING", 85);
    public static final IdlingResourceType QUESTIONNAIRE_QUESTIONS_SUBMITTING = new IdlingResourceType("QUESTIONNAIRE_QUESTIONS_SUBMITTING", 86);
    public static final IdlingResourceType RECURRING_ORDER_NUMPAD_ANIMATION = new IdlingResourceType("RECURRING_ORDER_NUMPAD_ANIMATION", 87);
    public static final IdlingResourceType RECURRING_ORDER_UNIFIED_ACCOUNT_LOADING = new IdlingResourceType("RECURRING_ORDER_UNIFIED_ACCOUNT_LOADING", 88);
    public static final IdlingResourceType INVESTMENT_PROFILE_LOADING = new IdlingResourceType("INVESTMENT_PROFILE_LOADING", 89);
    public static final IdlingResourceType INVESTMENT_PROFILE_SETTINGS_LOADING = new IdlingResourceType("INVESTMENT_PROFILE_SETTINGS_LOADING", 90);
    public static final IdlingResourceType CREATE_TRANSFER_BUTTON_LOADING = new IdlingResourceType("CREATE_TRANSFER_BUTTON_LOADING", 91);
    public static final IdlingResourceType WELCOME_REGION_LOADING = new IdlingResourceType("WELCOME_REGION_LOADING", 92);
    public static final IdlingResourceType ACCOUNT_TAB_FRAGMENT_EXPERIMENT = new IdlingResourceType("ACCOUNT_TAB_FRAGMENT_EXPERIMENT", 93);

    private static final /* synthetic */ IdlingResourceType[] $values() {
        return new IdlingResourceType[]{MAIN_TABS_VISIBLE, DIMMING_BOTTOM_SHEET_BEHAVIOR, LIST_ADAPTER_DIFFING, MIN_TIME_IN_FLIGHT, RX_DEBOUNCE, PLAID_SDK_OPEN, PLAID_SDK_CONNECT, PLAID_SDK_FETCH_ACCOUNTS, POST_SIGN_UP_US, RDS_BUTTON_ISLOADING, ADDRESS_AUTOCOMPLETE, VERIFICATION, CASH_MANAGEMENT_AGREEMENTS, OPTION_CHAIN_ACCOUNT, OPTION_CHAIN_ITEMS_LOADED, LOADING_VIEW, TOOLBAR_PROGRESS_BAR, CAPTURE_PHOTO, SAVE_PHOTO, ONBOARDING_ADDRESS_TYPING, ADDRESS_MAP_LOADING_COMPLETE_ADDRESS, CREATE_USER, ACCOUNT_NAVIGATION_ACCOUNT_LOADED, LOGIN, EQUITY_TRADE_BUTTON_VISIBLE, EQUITY_SERVER_TRADE_BUTTON_VISIBLE, EQUITY_IPOA_NAME_YOUR_OWN_PRICE_BTN_VISIBLE, EQUITY_IPOA_PRICE_CHANGE_BANNER_VISIBLE, ORDER_DETAIL_EXPLANATION, ORDER_DETAIL_STATUS, ORDER_PENDING, ORDER_FINAL, ORDER_CANCELLED, POST_SIGN_UP_ACCOUNT_LOADED, LOADING_INVESTMENT_SCHEDULES, DELAYED_TRANSITION, BASE_AGREEMENT_CONTENTFUL_LOAD, BASE_AGREEMENT_SCROLL_TO_BOTTOM, TRANSFERS_TIMELINE, CREATE_ACH_TRANSFER_DEPOSIT, ACH_TRANSFER_CONFIRMATION, ODYSSEY_LOADING, ODYSSEY_AGREEMENT_SCROLL, OPTION_CHAIN_VIEW_PAGER, OPTION_ORDER, DOC_UPLOAD_LOADING_REQUEST, OPTION_ORDER_PENDING, OPTION_ORDER_FINAL, WATCHLIST_BUYING_POWER, WATCHLIST_OPTION_POSITIONS, MAIN_BANNER_VIEW_DELAY, SUPPORT_CALL_STATUS, WEB_CHROME_CLIENT_PROGRESS, RH_WEB, SUPPORT_CALL_BANNER_PROVIDER, ORDER_DETAIL_LOADING_ORDER, RHY_MIGRATION_AGREEMENT_LOADING, DEPOSIT_SCHEDULES_LOADED, INBOX_THREAD_RESPONSE, INBOX_THREAD_FETCH_LATEST_MESSAGES, CRYPTO_AGREEMENTS, CRYPTO_ORDER_CONTEXT_FACTORY, GOLD_UPGRADE_DISCLOSURE_LOADING, MARGIN_CHECKLIST, ACCOUNT_OVERVIEW_LOAD_BALANCES, ACCOUNT_OVERVIEW_LOAD_UNIFIED_ACCOUNT, ACCOUNT_OVERVIEW_LOAD_SWEEP_SECTION, GOLD_SETTINGS_LOADING, LOADING_BUYING_POWER_RECURRING_FUNDS, BUYING_POWER_DETAILS_LOADING, GOLD_UPGRADE_MARGIN_ACCOUNT_LOADING, GOLD_POST_UPGRADE_CELEBRATION_LOADING, GOLD_HUB_LOADING, DISABLE_MARGIN_SPENDING_LOADING, ENABLE_MARGIN_SPENDING_LOADING, AGGREGATE_OPTION_TRADE_BAR, WELCOME_LOADED, RECOMMENDATIONS_CHECKOUT, RECOMMENDATIONS_CHECKOUT_DISCLOSURE, RECOMMENDATIONS_CHECKOUT_ORDER_SUBMISSION, RECOMMENDATIONS_CHECKOUT_CELEBRATION, PROMPTS_CHALLENGE_PENDING, SLIP_ONBOARDING_LOADING, SLIP_ONBOARDING_AGREEMENTS_LOADING, SLIP_ONBOARDING_ACCEPT_AGREEMENTS, QUESTIONNAIRE_QUESTIONS_LOADING, QUESTIONNAIRE_QUESTIONS_SUBMITTING, RECURRING_ORDER_NUMPAD_ANIMATION, RECURRING_ORDER_UNIFIED_ACCOUNT_LOADING, INVESTMENT_PROFILE_LOADING, INVESTMENT_PROFILE_SETTINGS_LOADING, CREATE_TRANSFER_BUTTON_LOADING, WELCOME_REGION_LOADING, ACCOUNT_TAB_FRAGMENT_EXPERIMENT};
    }

    public static EnumEntries<IdlingResourceType> getEntries() {
        return $ENTRIES;
    }

    private IdlingResourceType(String str, int i) {
    }

    static {
        IdlingResourceType[] idlingResourceTypeArr$values = $values();
        $VALUES = idlingResourceTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(idlingResourceTypeArr$values);
    }

    public static IdlingResourceType valueOf(String str) {
        return (IdlingResourceType) Enum.valueOf(IdlingResourceType.class, str);
    }

    public static IdlingResourceType[] values() {
        return (IdlingResourceType[]) $VALUES.clone();
    }
}
