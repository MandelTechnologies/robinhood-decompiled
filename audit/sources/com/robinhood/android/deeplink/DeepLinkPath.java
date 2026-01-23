package com.robinhood.android.deeplink;

import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import com.robinhood.shared.settings.contracts.Constants6;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeepLinkPath.kt */
@Metadata(m3635d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0003\b\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 ¤\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002¤\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010 \u0001\u001a\u00030¡\u00012\u0014\u0010¢\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040£\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0013\u0010\u009e\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001¨\u0006¥\u0001"}, m3636d2 = {"Lcom/robinhood/android/deeplink/DeepLinkPath;", "Lcom/robinhood/android/deeplink/BaseDeepLinkPath;", "", "path", "", "isAppLink", "", "isInAppDeeplink", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "getPath", "()Ljava/lang/String;", "()Z", "ROOT", "STOCKS", "PORTFOLIO", "STATEMENTS", "DIVIDENDS", "TAX_CENTER", "TAX_CERTIFICATION", "TAX_DOCUMENTS", "TAX_TIMELINE_INFO", "PREVIOUS_TAX_DOCUMENTS", "VIEW_TAX_DOCUMENT", "UNCONFIRMED_TAX_STATUS_ALERT", "POPULAR_STOCKS", "AVERAGE_COST_UNAVAILABLE", "DEACTIVATE_ACCOUNT", "REACTIVATE_ACCOUNT", "PDT_EDUCATION", "GOLD_NUX", "GOLD_NUX_24KG", "ANALYST_REVIEW", "GOLD_SETTINGS", "GOLD_MONDAY", "GOLD_SIGN_UP_MAY_2025", "EARNINGS", "FB_AD_ATTRIBUTION", "COMPLIANCE_DOCUMENT_REQUEST", "CORPORATE_ACTIONS", "TAGS", "UPLOAD_RESIDENCY_DOCUMENT", "RHS_CONVERSION", "WAITLIST", "EARNINGS_QA_EVENT_UNIVERSAL", "RETIREMENT", "RETIREMENT_RECOMMENDATIONS_INFO", "RETIREMENT_LIMITATIONS_INFO", "IRA_ACCOUNT_COMPARISON", "ANDROID_DEFAULT", "SHORTCUT_SETTINGS", "SHORTCUT_SEARCH", "SHORTCUT_ACCOUNT", "SHORTCUT_HISTORY", "SHORTCUT_DEPOSIT", "SHORTCUT_DEPOSIT_QUEUED", "SHORTCUT_LINK_ACCOUNT", "CHECK_HISTORY", "CASH_MANAGEMENT", "CASH_MANAGEMENT_HISTORY", "CASH_MANAGEMENT_CARD_ACTIONS", "INTEREST", "CASH_MANAGEMENT_ACTIVATE_CARD", "CASH_MANAGEMENT_CHANGE_PIN", "CASH_MANAGEMENT_REPORT_DAMAGED", "CASH_MANAGEMENT_REPORT_LOST", "CASH_MANAGEMENT_REPORT_STOLEN", "CASH_MANAGEMENT_RETURNED_DEBIT_CARD_SUPPORT", "CASH_MANAGEMENT_RHY_UPSELL", "CASH_MANAGEMENT_CREATE_DISPUTE", "SUBSCRIBE_SNACKS", "REFERENCE", "THREADS", "REMOTE_REFERENCE_MANUAL", "US_UK_REFERRALS", "CURATED_LISTS", "PROFILE_VISIBILITY", "EDIT_PROFILE_AND_VISIBILITY", "ONBOARDING_FUND_ACCOUNT", "DIRECT_DEPOSIT", "DIRECT_DEPOSIT_ONBOARDING", "DIRECT_DEPOSIT_MANUAL_SETUP", "DIRECT_DEPOSIT_FORM", "ACCOUNT_BANKING", "LEARNING_SERIES", "SAFETY_LABELS_LESSON", "UPDATE_TRUSTED_CONTACT", "INTEREST_PAYMENTS_HISTORY", "CARD_TRANSACTION_HISTORY", "EARLY_PAY", "VERIFY_TAX_INFORMATION", "TRUSTED_CONTACT_DETAIL", "RHY_MIGRATION", "RHY_WAITLIST_JOIN", "RECOMMENDATIONS_RETIREMENT", "RETIREMENT_RECOMMENDATIONS_REORDER", "CONFIRM_TRANSFER", "NEW_EXTENDED_HOURS", "ROUNDUP_FIRST_TRANSACTION", "ROUNDUP_DETAILS", "ROUNDUP_OVERVIEW", "ROUNDUP_ONBOARDING", "ROUNDUP_SETTINGS", "ROUNDUP_MAX_ONBOARDING_EXIT", "ROUNDUP_SPENDING_ONBOARDING_EXIT", "ROUNDUP_DISCOVER", "PENDING_EQUITY_ORDERS", "EARNINGS_QA_EVENT", "SHAREHOLDER_ASK_QUESTION", "SHAREHOLDER_EVENT_LIST", "REQUEST_SUPPORT_CALL", "RHY_SPENDING_SETTINGS", "RHY_SPENDING_STATEMENTS", "MANAGE_DIRECT_DEPOSIT", "RHY_HISTORY", "PAYCHECK_HUB", "SPENDING_ACCOUNT_LEARN_MORE", "PAYCHECK_DETAIL", "SWEEP_ONBOARDING", "EQUITY_ADVANCED_CHART", "ADVANCED_CHART_ONBOARDING", "ADVANCED_ALERTS", "EQUITY_ADVANCED_ALERTS_ONBOARDING", "RHY_MERCHANT_REWARDS", "RHY_SPENDING_OFFER_ONBOARDING", "MATCHA_TRANSACTION", "MATCHA_PENDING_TRANSACTIONS", "MATCHA_PENDING_TRANSACTIONS_BETWEEN", "MATCHA_TRANSACTION_LIST", "MATCHA_TRANSFER_HISTORY", "MATCHA_PROFILE", "MATCHA", "MATCHA_INCENTIVES_LEARN_MORE", "MATCHA_INSTANT_WITHDRAWAL_INTRO", "RHY_MERCHANT_REWARDS_DETAILS", "SPENDING_REWARD_DETAILS", "RHY_SPENDING_OFFER", "CASH_CUSHION_DETAILS", "RETIREMENT_WAITLIST", "RETIREMENT_LEARN_AND_EARN_REWARD", "RETIREMENT_TAX_BENEFITS", "RHY_NON_DEBIT_CARD_POST_SIGN_UP", "RHY_POST_SIGN_UP", "SYP_INVEST_IRA", "SYP_IRA", "RHY_ONLY_ONBOARDING", "RHY_RECURRING_MARKETING", "SCREENER_DETAIL", "RHY_REFERRER", "RHY_REFEREE", "RHY_REFERRAL_TRACKING", "RHY_CLAIM_REFERRAL", "RHY_REFERRAL_FUND", "RHY_UNLOCK_CASHBACK_INTRO", "RHY_UNLOCK_CASHBACK_DD", "RHY_UNLOCK_CASHBACK_RECURRING", "ALERT_HUB_SETTINGS", "PORTFOLIO_SPLIT_INFO", "uri", "getUri", "buildUri", "Landroid/net/Uri;", "queryParameters", "", "Companion", "lib-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DeepLinkPath implements BaseDeepLinkPath {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeepLinkPath[] $VALUES;
    public static final DeepLinkPath ACCOUNT_BANKING;
    public static final DeepLinkPath ADVANCED_ALERTS;
    public static final DeepLinkPath ADVANCED_CHART_ONBOARDING;
    public static final DeepLinkPath ALERT_HUB_SETTINGS;
    public static final String ALTERNATE_URL_BASE = "www.robinhood.com";
    public static final DeepLinkPath ANALYST_REVIEW;
    public static final DeepLinkPath AVERAGE_COST_UNAVAILABLE;
    public static final DeepLinkPath CARD_TRANSACTION_HISTORY;
    public static final DeepLinkPath CASH_CUSHION_DETAILS;
    public static final DeepLinkPath CASH_MANAGEMENT;
    public static final DeepLinkPath CASH_MANAGEMENT_ACTIVATE_CARD;
    public static final DeepLinkPath CASH_MANAGEMENT_CARD_ACTIONS;
    public static final DeepLinkPath CASH_MANAGEMENT_CHANGE_PIN;
    public static final DeepLinkPath CASH_MANAGEMENT_CREATE_DISPUTE;
    public static final DeepLinkPath CASH_MANAGEMENT_HISTORY;
    public static final DeepLinkPath CASH_MANAGEMENT_REPORT_DAMAGED;
    public static final DeepLinkPath CASH_MANAGEMENT_REPORT_LOST;
    public static final DeepLinkPath CASH_MANAGEMENT_REPORT_STOLEN;
    public static final DeepLinkPath CASH_MANAGEMENT_RETURNED_DEBIT_CARD_SUPPORT;
    public static final DeepLinkPath CASH_MANAGEMENT_RHY_UPSELL;
    public static final String CDN_URL_BASE = "cdn.robinhood.com";
    public static final DeepLinkPath CHECK_HISTORY;
    public static final DeepLinkPath COMPLIANCE_DOCUMENT_REQUEST;
    public static final DeepLinkPath CONFIRM_TRANSFER;
    public static final DeepLinkPath CORPORATE_ACTIONS;
    public static final DeepLinkPath CURATED_LISTS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DeepLinkPath DEACTIVATE_ACCOUNT;
    public static final String DEPOSIT_URL_BASE = "deposit.robinhood.com";
    public static final DeepLinkPath DIRECT_DEPOSIT;
    public static final DeepLinkPath DIRECT_DEPOSIT_FORM;
    public static final DeepLinkPath DIRECT_DEPOSIT_MANUAL_SETUP;
    public static final DeepLinkPath DIRECT_DEPOSIT_ONBOARDING;
    public static final DeepLinkPath DIVIDENDS;
    public static final DeepLinkPath EARLY_PAY;
    public static final DeepLinkPath EARNINGS;
    public static final DeepLinkPath EARNINGS_QA_EVENT;
    public static final DeepLinkPath EARNINGS_QA_EVENT_UNIVERSAL;
    public static final DeepLinkPath EDIT_PROFILE_AND_VISIBILITY;
    public static final DeepLinkPath EQUITY_ADVANCED_ALERTS_ONBOARDING;
    public static final DeepLinkPath EQUITY_ADVANCED_CHART;
    public static final DeepLinkPath FB_AD_ATTRIBUTION;
    public static final String GIFT_URL_BASE = "gift.robinhood.com";
    public static final DeepLinkPath GOLD_MONDAY;
    public static final DeepLinkPath GOLD_NUX;
    public static final DeepLinkPath GOLD_NUX_24KG;
    public static final DeepLinkPath GOLD_SETTINGS;
    public static final DeepLinkPath GOLD_SIGN_UP_MAY_2025;
    public static final DeepLinkPath INTEREST;
    public static final DeepLinkPath INTEREST_PAYMENTS_HISTORY;
    public static final DeepLinkPath IRA_ACCOUNT_COMPARISON;
    public static final String JOINDOT_URL_BASE = "join.robinhood.com";
    public static final DeepLinkPath LEARNING_SERIES;
    public static final DeepLinkPath MANAGE_DIRECT_DEPOSIT;
    public static final DeepLinkPath MATCHA;
    public static final DeepLinkPath MATCHA_INCENTIVES_LEARN_MORE;
    public static final DeepLinkPath MATCHA_INSTANT_WITHDRAWAL_INTRO;
    public static final DeepLinkPath MATCHA_PENDING_TRANSACTIONS;
    public static final DeepLinkPath MATCHA_PENDING_TRANSACTIONS_BETWEEN;
    public static final DeepLinkPath MATCHA_PROFILE;
    public static final DeepLinkPath MATCHA_TRANSACTION;
    public static final DeepLinkPath MATCHA_TRANSACTION_LIST;
    public static final DeepLinkPath MATCHA_TRANSFER_HISTORY;
    public static final DeepLinkPath NEW_EXTENDED_HOURS;
    public static final DeepLinkPath ONBOARDING_FUND_ACCOUNT;
    public static final DeepLinkPath PAYCHECK_DETAIL;
    public static final DeepLinkPath PAYCHECK_HUB;
    public static final DeepLinkPath PDT_EDUCATION;
    public static final DeepLinkPath PENDING_EQUITY_ORDERS;
    public static final DeepLinkPath POPULAR_STOCKS;
    public static final DeepLinkPath PORTFOLIO;
    public static final DeepLinkPath PREVIOUS_TAX_DOCUMENTS;
    public static final DeepLinkPath PROFILE_VISIBILITY;
    public static final DeepLinkPath REACTIVATE_ACCOUNT;
    public static final DeepLinkPath RECOMMENDATIONS_RETIREMENT;
    public static final DeepLinkPath REFERENCE;
    public static final DeepLinkPath REMOTE_REFERENCE_MANUAL;
    public static final DeepLinkPath REQUEST_SUPPORT_CALL;
    public static final DeepLinkPath RETIREMENT;
    public static final DeepLinkPath RETIREMENT_LEARN_AND_EARN_REWARD;
    public static final DeepLinkPath RETIREMENT_LIMITATIONS_INFO;
    public static final DeepLinkPath RETIREMENT_RECOMMENDATIONS_INFO;
    public static final DeepLinkPath RETIREMENT_RECOMMENDATIONS_REORDER;
    public static final DeepLinkPath RETIREMENT_TAX_BENEFITS;
    public static final DeepLinkPath RETIREMENT_WAITLIST;
    public static final DeepLinkPath RHS_CONVERSION;
    public static final DeepLinkPath RHY_CLAIM_REFERRAL;
    public static final DeepLinkPath RHY_HISTORY;
    public static final DeepLinkPath RHY_MERCHANT_REWARDS;
    public static final DeepLinkPath RHY_MERCHANT_REWARDS_DETAILS;
    public static final DeepLinkPath RHY_MIGRATION;
    public static final DeepLinkPath RHY_NON_DEBIT_CARD_POST_SIGN_UP;
    public static final DeepLinkPath RHY_ONLY_ONBOARDING;
    public static final DeepLinkPath RHY_POST_SIGN_UP;
    public static final DeepLinkPath RHY_RECURRING_MARKETING;
    public static final DeepLinkPath RHY_REFEREE;
    public static final DeepLinkPath RHY_REFERRAL_FUND;
    public static final DeepLinkPath RHY_REFERRAL_TRACKING;
    public static final DeepLinkPath RHY_REFERRER;
    public static final DeepLinkPath RHY_SPENDING_OFFER;
    public static final DeepLinkPath RHY_SPENDING_OFFER_ONBOARDING;
    public static final DeepLinkPath RHY_SPENDING_SETTINGS;
    public static final DeepLinkPath RHY_SPENDING_STATEMENTS;
    public static final DeepLinkPath RHY_UNLOCK_CASHBACK_DD;
    public static final DeepLinkPath RHY_UNLOCK_CASHBACK_INTRO;
    public static final DeepLinkPath RHY_UNLOCK_CASHBACK_RECURRING;
    public static final DeepLinkPath RHY_WAITLIST_JOIN;
    public static final DeepLinkPath ROUNDUP_DETAILS;
    public static final DeepLinkPath ROUNDUP_DISCOVER;
    public static final DeepLinkPath ROUNDUP_FIRST_TRANSACTION;
    public static final DeepLinkPath ROUNDUP_MAX_ONBOARDING_EXIT;
    public static final DeepLinkPath ROUNDUP_ONBOARDING;
    public static final DeepLinkPath ROUNDUP_OVERVIEW;
    public static final DeepLinkPath ROUNDUP_SETTINGS;
    public static final DeepLinkPath ROUNDUP_SPENDING_ONBOARDING_EXIT;
    public static final DeepLinkPath SAFETY_LABELS_LESSON;
    private static final Lazy<String> SCHEME_ROBINHOOD$delegate;
    public static final DeepLinkPath SCREENER_DETAIL;
    public static final DeepLinkPath SHAREHOLDER_ASK_QUESTION;
    public static final DeepLinkPath SHAREHOLDER_EVENT_LIST;
    public static final String SHARE_URL_BASE = "share.robinhood.com";
    public static final DeepLinkPath SHORTCUT_DEPOSIT;
    public static final DeepLinkPath SHORTCUT_DEPOSIT_QUEUED;
    public static final DeepLinkPath SHORTCUT_LINK_ACCOUNT;
    public static final DeepLinkPath SPENDING_ACCOUNT_LEARN_MORE;
    public static final DeepLinkPath SPENDING_REWARD_DETAILS;
    public static final DeepLinkPath STATEMENTS;
    public static final DeepLinkPath STOCKS;
    public static final String SUBDOMAIN_URL_BASE = "applink.robinhood.com";
    public static final DeepLinkPath SUBSCRIBE_SNACKS;
    public static final DeepLinkPath SWEEP_ONBOARDING;
    public static final DeepLinkPath SYP_INVEST_IRA;
    public static final DeepLinkPath SYP_IRA;
    public static final DeepLinkPath TAGS;
    public static final DeepLinkPath TAX_CENTER;
    public static final DeepLinkPath TAX_CERTIFICATION;
    public static final DeepLinkPath TAX_DOCUMENTS;
    public static final DeepLinkPath TAX_TIMELINE_INFO;
    public static final DeepLinkPath THREADS;
    public static final DeepLinkPath TRUSTED_CONTACT_DETAIL;
    public static final DeepLinkPath UNCONFIRMED_TAX_STATUS_ALERT;
    public static final DeepLinkPath UPDATE_TRUSTED_CONTACT;
    public static final DeepLinkPath UPLOAD_RESIDENCY_DOCUMENT;
    public static final String URL_BASE = "robinhood.com";
    public static final DeepLinkPath US_UK_REFERRALS;
    public static final DeepLinkPath VERIFY_TAX_INFORMATION;
    public static final DeepLinkPath VIEW_TAX_DOCUMENT;
    public static final DeepLinkPath WAITLIST;
    private final boolean isAppLink;
    private final boolean isInAppDeeplink;
    private final String path;
    public static final DeepLinkPath ROOT = new DeepLinkPath("ROOT", 0, "", false, false, 6, null);
    public static final DeepLinkPath ANDROID_DEFAULT = new DeepLinkPath("ANDROID_DEFAULT", 36, "android-default-do-not-override", false, true, 2, null);
    public static final DeepLinkPath SHORTCUT_SETTINGS = new DeepLinkPath("SHORTCUT_SETTINGS", 37, "android-shortcut-settings", false, true, 2, null);
    public static final DeepLinkPath SHORTCUT_SEARCH = new DeepLinkPath("SHORTCUT_SEARCH", 38, "android-shortcut-search", false, true, 2, null);
    public static final DeepLinkPath SHORTCUT_ACCOUNT = new DeepLinkPath("SHORTCUT_ACCOUNT", 39, "android-shortcut-account", false, true, 2, null);
    public static final DeepLinkPath SHORTCUT_HISTORY = new DeepLinkPath("SHORTCUT_HISTORY", 40, "android-shortcut-history", false, true, 2, null);
    public static final DeepLinkPath PORTFOLIO_SPLIT_INFO = new DeepLinkPath("PORTFOLIO_SPLIT_INFO", 144, "portfolio_split_info", false, false, 6, null);

    private static final /* synthetic */ DeepLinkPath[] $values() {
        return new DeepLinkPath[]{ROOT, STOCKS, PORTFOLIO, STATEMENTS, DIVIDENDS, TAX_CENTER, TAX_CERTIFICATION, TAX_DOCUMENTS, TAX_TIMELINE_INFO, PREVIOUS_TAX_DOCUMENTS, VIEW_TAX_DOCUMENT, UNCONFIRMED_TAX_STATUS_ALERT, POPULAR_STOCKS, AVERAGE_COST_UNAVAILABLE, DEACTIVATE_ACCOUNT, REACTIVATE_ACCOUNT, PDT_EDUCATION, GOLD_NUX, GOLD_NUX_24KG, ANALYST_REVIEW, GOLD_SETTINGS, GOLD_MONDAY, GOLD_SIGN_UP_MAY_2025, EARNINGS, FB_AD_ATTRIBUTION, COMPLIANCE_DOCUMENT_REQUEST, CORPORATE_ACTIONS, TAGS, UPLOAD_RESIDENCY_DOCUMENT, RHS_CONVERSION, WAITLIST, EARNINGS_QA_EVENT_UNIVERSAL, RETIREMENT, RETIREMENT_RECOMMENDATIONS_INFO, RETIREMENT_LIMITATIONS_INFO, IRA_ACCOUNT_COMPARISON, ANDROID_DEFAULT, SHORTCUT_SETTINGS, SHORTCUT_SEARCH, SHORTCUT_ACCOUNT, SHORTCUT_HISTORY, SHORTCUT_DEPOSIT, SHORTCUT_DEPOSIT_QUEUED, SHORTCUT_LINK_ACCOUNT, CHECK_HISTORY, CASH_MANAGEMENT, CASH_MANAGEMENT_HISTORY, CASH_MANAGEMENT_CARD_ACTIONS, INTEREST, CASH_MANAGEMENT_ACTIVATE_CARD, CASH_MANAGEMENT_CHANGE_PIN, CASH_MANAGEMENT_REPORT_DAMAGED, CASH_MANAGEMENT_REPORT_LOST, CASH_MANAGEMENT_REPORT_STOLEN, CASH_MANAGEMENT_RETURNED_DEBIT_CARD_SUPPORT, CASH_MANAGEMENT_RHY_UPSELL, CASH_MANAGEMENT_CREATE_DISPUTE, SUBSCRIBE_SNACKS, REFERENCE, THREADS, REMOTE_REFERENCE_MANUAL, US_UK_REFERRALS, CURATED_LISTS, PROFILE_VISIBILITY, EDIT_PROFILE_AND_VISIBILITY, ONBOARDING_FUND_ACCOUNT, DIRECT_DEPOSIT, DIRECT_DEPOSIT_ONBOARDING, DIRECT_DEPOSIT_MANUAL_SETUP, DIRECT_DEPOSIT_FORM, ACCOUNT_BANKING, LEARNING_SERIES, SAFETY_LABELS_LESSON, UPDATE_TRUSTED_CONTACT, INTEREST_PAYMENTS_HISTORY, CARD_TRANSACTION_HISTORY, EARLY_PAY, VERIFY_TAX_INFORMATION, TRUSTED_CONTACT_DETAIL, RHY_MIGRATION, RHY_WAITLIST_JOIN, RECOMMENDATIONS_RETIREMENT, RETIREMENT_RECOMMENDATIONS_REORDER, CONFIRM_TRANSFER, NEW_EXTENDED_HOURS, ROUNDUP_FIRST_TRANSACTION, ROUNDUP_DETAILS, ROUNDUP_OVERVIEW, ROUNDUP_ONBOARDING, ROUNDUP_SETTINGS, ROUNDUP_MAX_ONBOARDING_EXIT, ROUNDUP_SPENDING_ONBOARDING_EXIT, ROUNDUP_DISCOVER, PENDING_EQUITY_ORDERS, EARNINGS_QA_EVENT, SHAREHOLDER_ASK_QUESTION, SHAREHOLDER_EVENT_LIST, REQUEST_SUPPORT_CALL, RHY_SPENDING_SETTINGS, RHY_SPENDING_STATEMENTS, MANAGE_DIRECT_DEPOSIT, RHY_HISTORY, PAYCHECK_HUB, SPENDING_ACCOUNT_LEARN_MORE, PAYCHECK_DETAIL, SWEEP_ONBOARDING, EQUITY_ADVANCED_CHART, ADVANCED_CHART_ONBOARDING, ADVANCED_ALERTS, EQUITY_ADVANCED_ALERTS_ONBOARDING, RHY_MERCHANT_REWARDS, RHY_SPENDING_OFFER_ONBOARDING, MATCHA_TRANSACTION, MATCHA_PENDING_TRANSACTIONS, MATCHA_PENDING_TRANSACTIONS_BETWEEN, MATCHA_TRANSACTION_LIST, MATCHA_TRANSFER_HISTORY, MATCHA_PROFILE, MATCHA, MATCHA_INCENTIVES_LEARN_MORE, MATCHA_INSTANT_WITHDRAWAL_INTRO, RHY_MERCHANT_REWARDS_DETAILS, SPENDING_REWARD_DETAILS, RHY_SPENDING_OFFER, CASH_CUSHION_DETAILS, RETIREMENT_WAITLIST, RETIREMENT_LEARN_AND_EARN_REWARD, RETIREMENT_TAX_BENEFITS, RHY_NON_DEBIT_CARD_POST_SIGN_UP, RHY_POST_SIGN_UP, SYP_INVEST_IRA, SYP_IRA, RHY_ONLY_ONBOARDING, RHY_RECURRING_MARKETING, SCREENER_DETAIL, RHY_REFERRER, RHY_REFEREE, RHY_REFERRAL_TRACKING, RHY_CLAIM_REFERRAL, RHY_REFERRAL_FUND, RHY_UNLOCK_CASHBACK_INTRO, RHY_UNLOCK_CASHBACK_DD, RHY_UNLOCK_CASHBACK_RECURRING, ALERT_HUB_SETTINGS, PORTFOLIO_SPLIT_INFO};
    }

    public static EnumEntries<DeepLinkPath> getEntries() {
        return $ENTRIES;
    }

    private DeepLinkPath(String str, int i, String str2, boolean z, boolean z2) {
        this.path = str2;
        this.isAppLink = z;
        this.isInAppDeeplink = z2;
    }

    /* synthetic */ DeepLinkPath(String str, int i, String str2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
    }

    @Override // com.robinhood.android.deeplink.BaseDeepLinkPath
    public String getPath() {
        return this.path;
    }

    /* renamed from: isInAppDeeplink, reason: from getter */
    public final boolean getIsInAppDeeplink() {
        return this.isInAppDeeplink;
    }

    static {
        boolean z = false;
        STOCKS = new DeepLinkPath("STOCKS", 1, "stocks/*", true, z, 4, null);
        boolean z2 = false;
        PORTFOLIO = new DeepLinkPath("PORTFOLIO", 2, AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, z, z2, 6, null);
        boolean z3 = false;
        STATEMENTS = new DeepLinkPath("STATEMENTS", 3, "statements", z2, z3, 6, null);
        boolean z4 = false;
        DIVIDENDS = new DeepLinkPath("DIVIDENDS", 4, "dividends", z3, z4, 6, null);
        boolean z5 = false;
        TAX_CENTER = new DeepLinkPath("TAX_CENTER", 5, "tax_center", z4, z5, 6, null);
        boolean z6 = false;
        TAX_CERTIFICATION = new DeepLinkPath("TAX_CERTIFICATION", 6, "tax_certification", z5, z6, 6, null);
        boolean z7 = false;
        TAX_DOCUMENTS = new DeepLinkPath("TAX_DOCUMENTS", 7, "tax_documents", z6, z7, 6, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        TAX_TIMELINE_INFO = new DeepLinkPath("TAX_TIMELINE_INFO", 8, "tax_timeline_info", z7, false, 6, defaultConstructorMarker);
        boolean z8 = false;
        PREVIOUS_TAX_DOCUMENTS = new DeepLinkPath("PREVIOUS_TAX_DOCUMENTS", 9, "previous_tax_documents", false, z8, 6, null);
        boolean z9 = false;
        VIEW_TAX_DOCUMENT = new DeepLinkPath("VIEW_TAX_DOCUMENT", 10, "view_tax_document", z8, z9, 6, null);
        boolean z10 = false;
        UNCONFIRMED_TAX_STATUS_ALERT = new DeepLinkPath("UNCONFIRMED_TAX_STATUS_ALERT", 11, "unconfirmed_tax_status_alert", z9, z10, 6, null);
        boolean z11 = false;
        POPULAR_STOCKS = new DeepLinkPath("POPULAR_STOCKS", 12, "popular_stocks", z10, z11, 6, null);
        boolean z12 = false;
        AVERAGE_COST_UNAVAILABLE = new DeepLinkPath("AVERAGE_COST_UNAVAILABLE", 13, "avg_cost_affected_by_corp_action_details", z11, z12, 6, null);
        boolean z13 = false;
        DEACTIVATE_ACCOUNT = new DeepLinkPath("DEACTIVATE_ACCOUNT", 14, "deactivate_account", z12, z13, 6, null);
        boolean z14 = false;
        REACTIVATE_ACCOUNT = new DeepLinkPath("REACTIVATE_ACCOUNT", 15, "reactivate_account", z13, z14, 6, null);
        boolean z15 = false;
        PDT_EDUCATION = new DeepLinkPath("PDT_EDUCATION", 16, "pdt_education", z14, z15, 6, null);
        GOLD_NUX = new DeepLinkPath("GOLD_NUX", 17, "gold_nux", z15, false, 6, defaultConstructorMarker);
        boolean z16 = false;
        GOLD_NUX_24KG = new DeepLinkPath("GOLD_NUX_24KG", 18, "24k_gold_reference_manual", false, z16, 6, null);
        boolean z17 = false;
        ANALYST_REVIEW = new DeepLinkPath("ANALYST_REVIEW", 19, "morningstar_report", z16, z17, 6, null);
        boolean z18 = false;
        GOLD_SETTINGS = new DeepLinkPath("GOLD_SETTINGS", 20, AnalyticsStrings.BUTTON_ACCOUNT_GOLD_SETTINGS, z17, z18, 6, null);
        boolean z19 = false;
        GOLD_MONDAY = new DeepLinkPath("GOLD_MONDAY", 21, "goldmonday", z18, z19, 6, null);
        boolean z20 = false;
        GOLD_SIGN_UP_MAY_2025 = new DeepLinkPath("GOLD_SIGN_UP_MAY_2025", 22, "gold-signup-may-2025", z19, z20, 6, null);
        boolean z21 = false;
        EARNINGS = new DeepLinkPath("EARNINGS", 23, "upcoming_earnings", z20, z21, 6, null);
        boolean z22 = false;
        FB_AD_ATTRIBUTION = new DeepLinkPath("FB_AD_ATTRIBUTION", 24, "facebook_ad_attribution", z21, z22, 6, null);
        boolean z23 = false;
        COMPLIANCE_DOCUMENT_REQUEST = new DeepLinkPath("COMPLIANCE_DOCUMENT_REQUEST", 25, "compliance_document_request", z22, z23, 6, null);
        CORPORATE_ACTIONS = new DeepLinkPath("CORPORATE_ACTIONS", 26, "corporate_action", z23, false, 6, defaultConstructorMarker);
        boolean z24 = false;
        TAGS = new DeepLinkPath("TAGS", 27, "tags", false, z24, 6, null);
        boolean z25 = false;
        UPLOAD_RESIDENCY_DOCUMENT = new DeepLinkPath("UPLOAD_RESIDENCY_DOCUMENT", 28, "upload_residency_document", z24, z25, 6, null);
        boolean z26 = false;
        RHS_CONVERSION = new DeepLinkPath("RHS_CONVERSION", 29, "clearing_announcement", z25, z26, 6, null);
        WAITLIST = new DeepLinkPath("WAITLIST", 30, "waitlist", z26, false, 6, null);
        boolean z27 = false;
        EARNINGS_QA_EVENT_UNIVERSAL = new DeepLinkPath("EARNINGS_QA_EVENT_UNIVERSAL", 31, "stocks/*/qa/*", true, z27, 4, null);
        boolean z28 = false;
        RETIREMENT = new DeepLinkPath("RETIREMENT", 32, "retirement", z27, z28, 6, null);
        boolean z29 = false;
        RETIREMENT_RECOMMENDATIONS_INFO = new DeepLinkPath("RETIREMENT_RECOMMENDATIONS_INFO", 33, "recommended_portfolios_info", z28, z29, 6, null);
        boolean z30 = false;
        RETIREMENT_LIMITATIONS_INFO = new DeepLinkPath("RETIREMENT_LIMITATIONS_INFO", 34, "retirement_limitations_info", z29, z30, 6, null);
        IRA_ACCOUNT_COMPARISON = new DeepLinkPath("IRA_ACCOUNT_COMPARISON", 35, "ira_account_comparison", z30, false, 6, defaultConstructorMarker);
        boolean z31 = false;
        SHORTCUT_DEPOSIT = new DeepLinkPath("SHORTCUT_DEPOSIT", 41, "android-shortcut-deposit", false, z31, 6, null);
        boolean z32 = false;
        SHORTCUT_DEPOSIT_QUEUED = new DeepLinkPath("SHORTCUT_DEPOSIT_QUEUED", 42, "android-shortcut-deposit-queued", z31, z32, 6, null);
        boolean z33 = false;
        SHORTCUT_LINK_ACCOUNT = new DeepLinkPath("SHORTCUT_LINK_ACCOUNT", 43, "android-shortcut-link-account", z32, z33, 6, null);
        CHECK_HISTORY = new DeepLinkPath("CHECK_HISTORY", 44, "checks", z33, false, 6, defaultConstructorMarker);
        boolean z34 = false;
        CASH_MANAGEMENT = new DeepLinkPath("CASH_MANAGEMENT", 45, Constants6.CASH_MANAGEMENT_SETTINGS_PAGE_ID, false, z34, 6, null);
        boolean z35 = false;
        CASH_MANAGEMENT_HISTORY = new DeepLinkPath("CASH_MANAGEMENT_HISTORY", 46, "cash_management_history", z34, z35, 6, null);
        boolean z36 = false;
        CASH_MANAGEMENT_CARD_ACTIONS = new DeepLinkPath("CASH_MANAGEMENT_CARD_ACTIONS", 47, "cash_management_card_actions", z35, z36, 6, null);
        boolean z37 = false;
        INTEREST = new DeepLinkPath("INTEREST", 48, "interest", z36, z37, 6, null);
        boolean z38 = false;
        CASH_MANAGEMENT_ACTIVATE_CARD = new DeepLinkPath("CASH_MANAGEMENT_ACTIVATE_CARD", 49, "cash_management_activate_card", z37, z38, 6, null);
        boolean z39 = false;
        CASH_MANAGEMENT_CHANGE_PIN = new DeepLinkPath("CASH_MANAGEMENT_CHANGE_PIN", 50, "cash_management_change_pin", z38, z39, 6, null);
        boolean z40 = false;
        CASH_MANAGEMENT_REPORT_DAMAGED = new DeepLinkPath("CASH_MANAGEMENT_REPORT_DAMAGED", 51, "cash_management_report_damaged", z39, z40, 6, null);
        boolean z41 = false;
        CASH_MANAGEMENT_REPORT_LOST = new DeepLinkPath("CASH_MANAGEMENT_REPORT_LOST", 52, "cash_management_report_lost", z40, z41, 6, null);
        CASH_MANAGEMENT_REPORT_STOLEN = new DeepLinkPath("CASH_MANAGEMENT_REPORT_STOLEN", 53, "cash_management_report_stolen", z41, false, 6, defaultConstructorMarker);
        boolean z42 = false;
        CASH_MANAGEMENT_RETURNED_DEBIT_CARD_SUPPORT = new DeepLinkPath("CASH_MANAGEMENT_RETURNED_DEBIT_CARD_SUPPORT", 54, "cash_management_returned_card_contact_support", false, z42, 6, null);
        boolean z43 = false;
        CASH_MANAGEMENT_RHY_UPSELL = new DeepLinkPath("CASH_MANAGEMENT_RHY_UPSELL", 55, "cash_management_rhy_upsell", z42, z43, 6, null);
        boolean z44 = false;
        CASH_MANAGEMENT_CREATE_DISPUTE = new DeepLinkPath("CASH_MANAGEMENT_CREATE_DISPUTE", 56, "create_debit_card_disputes", z43, z44, 6, null);
        boolean z45 = false;
        SUBSCRIBE_SNACKS = new DeepLinkPath("SUBSCRIBE_SNACKS", 57, "subscribe_snacks", z44, z45, 6, null);
        boolean z46 = false;
        REFERENCE = new DeepLinkPath("REFERENCE", 58, "reference", z45, z46, 6, null);
        boolean z47 = false;
        THREADS = new DeepLinkPath("THREADS", 59, "threads", z46, z47, 6, null);
        boolean z48 = false;
        REMOTE_REFERENCE_MANUAL = new DeepLinkPath("REMOTE_REFERENCE_MANUAL", 60, AnalyticsStrings.TAB_GROUP_REFERENCE_MANUAL, z47, z48, 6, null);
        boolean z49 = false;
        US_UK_REFERRALS = new DeepLinkPath("US_UK_REFERRALS", 61, "us_uk_waitlist", z48, z49, 6, null);
        CURATED_LISTS = new DeepLinkPath("CURATED_LISTS", 62, "lists", z49, false, 6, defaultConstructorMarker);
        boolean z50 = false;
        PROFILE_VISIBILITY = new DeepLinkPath("PROFILE_VISIBILITY", 63, "profile_visibility", false, z50, 6, null);
        boolean z51 = false;
        EDIT_PROFILE_AND_VISIBILITY = new DeepLinkPath("EDIT_PROFILE_AND_VISIBILITY", 64, "edit_profile_and_visibility", z50, z51, 6, null);
        boolean z52 = false;
        ONBOARDING_FUND_ACCOUNT = new DeepLinkPath("ONBOARDING_FUND_ACCOUNT", 65, "onboarding_fund_account", z51, z52, 6, null);
        boolean z53 = false;
        DIRECT_DEPOSIT = new DeepLinkPath("DIRECT_DEPOSIT", 66, "direct_deposit_setup", z52, z53, 6, null);
        boolean z54 = false;
        DIRECT_DEPOSIT_ONBOARDING = new DeepLinkPath("DIRECT_DEPOSIT_ONBOARDING", 67, "direct_deposit_onboarding", z53, z54, 6, null);
        boolean z55 = false;
        DIRECT_DEPOSIT_MANUAL_SETUP = new DeepLinkPath("DIRECT_DEPOSIT_MANUAL_SETUP", 68, "direct_deposit_manual_setup", z54, z55, 6, null);
        boolean z56 = false;
        DIRECT_DEPOSIT_FORM = new DeepLinkPath("DIRECT_DEPOSIT_FORM", 69, "direct_deposit_edoc", z55, z56, 6, null);
        boolean z57 = false;
        ACCOUNT_BANKING = new DeepLinkPath("ACCOUNT_BANKING", 70, "account_banking", z56, z57, 6, null);
        LEARNING_SERIES = new DeepLinkPath("LEARNING_SERIES", 71, "micro_learning_lessons", z57, false, 6, defaultConstructorMarker);
        boolean z58 = false;
        SAFETY_LABELS_LESSON = new DeepLinkPath("SAFETY_LABELS_LESSON", 72, "safety_labels_lesson", false, z58, 6, null);
        boolean z59 = false;
        UPDATE_TRUSTED_CONTACT = new DeepLinkPath("UPDATE_TRUSTED_CONTACT", 73, "update_trusted_contact", z58, z59, 6, null);
        boolean z60 = false;
        INTEREST_PAYMENTS_HISTORY = new DeepLinkPath("INTEREST_PAYMENTS_HISTORY", 74, "interest_payments_history", z59, z60, 6, null);
        boolean z61 = false;
        CARD_TRANSACTION_HISTORY = new DeepLinkPath("CARD_TRANSACTION_HISTORY", 75, "card_transaction_history", z60, z61, 6, null);
        boolean z62 = false;
        EARLY_PAY = new DeepLinkPath("EARLY_PAY", 76, "early_pay_learn_more", z61, z62, 6, null);
        boolean z63 = false;
        VERIFY_TAX_INFORMATION = new DeepLinkPath("VERIFY_TAX_INFORMATION", 77, AnalyticsStrings.BUTTON_GROUP_VERIFY_TAX_INFO, z62, z63, 6, null);
        boolean z64 = false;
        TRUSTED_CONTACT_DETAIL = new DeepLinkPath("TRUSTED_CONTACT_DETAIL", 78, "trusted_contact", z63, z64, 6, null);
        boolean z65 = false;
        RHY_MIGRATION = new DeepLinkPath("RHY_MIGRATION", 79, "rhy_migration", z64, z65, 6, null);
        RHY_WAITLIST_JOIN = new DeepLinkPath("RHY_WAITLIST_JOIN", 80, "rhy_waitlist_join", z65, false, 6, defaultConstructorMarker);
        boolean z66 = false;
        RECOMMENDATIONS_RETIREMENT = new DeepLinkPath("RECOMMENDATIONS_RETIREMENT", 81, "recommendations_for_retirement", false, z66, 6, null);
        boolean z67 = false;
        RETIREMENT_RECOMMENDATIONS_REORDER = new DeepLinkPath("RETIREMENT_RECOMMENDATIONS_REORDER", 82, "retirement_recommendations_reorder", z66, z67, 6, null);
        boolean z68 = false;
        CONFIRM_TRANSFER = new DeepLinkPath("CONFIRM_TRANSFER", 83, "confirm_transfer", z67, z68, 6, null);
        boolean z69 = false;
        NEW_EXTENDED_HOURS = new DeepLinkPath("NEW_EXTENDED_HOURS", 84, "new_extended_hours", z68, z69, 6, null);
        boolean z70 = false;
        ROUNDUP_FIRST_TRANSACTION = new DeepLinkPath("ROUNDUP_FIRST_TRANSACTION", 85, "first_roundup", z69, z70, 6, null);
        boolean z71 = false;
        ROUNDUP_DETAILS = new DeepLinkPath("ROUNDUP_DETAILS", 86, "roundup_details", z70, z71, 6, null);
        boolean z72 = false;
        ROUNDUP_OVERVIEW = new DeepLinkPath("ROUNDUP_OVERVIEW", 87, "roundup_overview", z71, z72, 6, null);
        boolean z73 = false;
        ROUNDUP_ONBOARDING = new DeepLinkPath("ROUNDUP_ONBOARDING", 88, "enroll_roundup", z72, z73, 6, null);
        ROUNDUP_SETTINGS = new DeepLinkPath("ROUNDUP_SETTINGS", 89, "roundup_settings", z73, false, 6, defaultConstructorMarker);
        boolean z74 = false;
        ROUNDUP_MAX_ONBOARDING_EXIT = new DeepLinkPath("ROUNDUP_MAX_ONBOARDING_EXIT", 90, "android_roundup_max_onboarding_exit", false, z74, 6, null);
        boolean z75 = false;
        ROUNDUP_SPENDING_ONBOARDING_EXIT = new DeepLinkPath("ROUNDUP_SPENDING_ONBOARDING_EXIT", 91, "android_roundup_spending_onboarding_exit", z74, z75, 6, null);
        boolean z76 = false;
        ROUNDUP_DISCOVER = new DeepLinkPath("ROUNDUP_DISCOVER", 92, "roundup_discover", z75, z76, 6, null);
        boolean z77 = false;
        PENDING_EQUITY_ORDERS = new DeepLinkPath("PENDING_EQUITY_ORDERS", 93, "pending_equity_orders", z76, z77, 6, null);
        boolean z78 = false;
        EARNINGS_QA_EVENT = new DeepLinkPath("EARNINGS_QA_EVENT", 94, "earnings_qa_event", z77, z78, 6, null);
        boolean z79 = false;
        SHAREHOLDER_ASK_QUESTION = new DeepLinkPath("SHAREHOLDER_ASK_QUESTION", 95, "shareholder_ask_question", z78, z79, 6, null);
        boolean z80 = false;
        SHAREHOLDER_EVENT_LIST = new DeepLinkPath("SHAREHOLDER_EVENT_LIST", 96, "shareholder_events_list", z79, z80, 6, null);
        boolean z81 = false;
        REQUEST_SUPPORT_CALL = new DeepLinkPath("REQUEST_SUPPORT_CALL", 97, "request_support_call", z80, z81, 6, null);
        RHY_SPENDING_SETTINGS = new DeepLinkPath("RHY_SPENDING_SETTINGS", 98, "rhy_spending_settings", z81, false, 6, defaultConstructorMarker);
        boolean z82 = false;
        RHY_SPENDING_STATEMENTS = new DeepLinkPath("RHY_SPENDING_STATEMENTS", 99, "rhy_spending_statements", false, z82, 6, null);
        boolean z83 = false;
        MANAGE_DIRECT_DEPOSIT = new DeepLinkPath("MANAGE_DIRECT_DEPOSIT", 100, "manage_direct_deposit", z82, z83, 6, null);
        boolean z84 = false;
        RHY_HISTORY = new DeepLinkPath("RHY_HISTORY", 101, "rhy_history", z83, z84, 6, null);
        boolean z85 = false;
        PAYCHECK_HUB = new DeepLinkPath("PAYCHECK_HUB", 102, "paycheck_hub", z84, z85, 6, null);
        boolean z86 = false;
        SPENDING_ACCOUNT_LEARN_MORE = new DeepLinkPath("SPENDING_ACCOUNT_LEARN_MORE", 103, "spending_account_learn_more", z85, z86, 6, null);
        boolean z87 = false;
        PAYCHECK_DETAIL = new DeepLinkPath("PAYCHECK_DETAIL", 104, "paycheck_detail", z86, z87, 6, null);
        boolean z88 = false;
        SWEEP_ONBOARDING = new DeepLinkPath("SWEEP_ONBOARDING", 105, "sweep_onboarding", z87, z88, 6, null);
        boolean z89 = false;
        EQUITY_ADVANCED_CHART = new DeepLinkPath("EQUITY_ADVANCED_CHART", 106, "equity_advanced_chart", z88, z89, 6, null);
        ADVANCED_CHART_ONBOARDING = new DeepLinkPath("ADVANCED_CHART_ONBOARDING", 107, "advanced_chart_onboarding", z89, false, 6, defaultConstructorMarker);
        boolean z90 = false;
        ADVANCED_ALERTS = new DeepLinkPath("ADVANCED_ALERTS", 108, "advanced_alerts", false, z90, 6, null);
        boolean z91 = false;
        EQUITY_ADVANCED_ALERTS_ONBOARDING = new DeepLinkPath("EQUITY_ADVANCED_ALERTS_ONBOARDING", 109, "equity_advanced_alerts_onboarding", z90, z91, 6, null);
        boolean z92 = false;
        RHY_MERCHANT_REWARDS = new DeepLinkPath("RHY_MERCHANT_REWARDS", 110, "rhy_merchant_reward_onboarding", z91, z92, 6, null);
        boolean z93 = false;
        RHY_SPENDING_OFFER_ONBOARDING = new DeepLinkPath("RHY_SPENDING_OFFER_ONBOARDING", 111, "rhy_spending_offer_onboarding", z92, z93, 6, null);
        boolean z94 = false;
        MATCHA_TRANSACTION = new DeepLinkPath("MATCHA_TRANSACTION", 112, "p2p_transaction", z93, z94, 6, null);
        boolean z95 = false;
        MATCHA_PENDING_TRANSACTIONS = new DeepLinkPath("MATCHA_PENDING_TRANSACTIONS", 113, "p2p_pending_transactions", z94, z95, 6, null);
        boolean z96 = false;
        MATCHA_PENDING_TRANSACTIONS_BETWEEN = new DeepLinkPath("MATCHA_PENDING_TRANSACTIONS_BETWEEN", 114, "p2p_pending_transactions_between", z95, z96, 6, null);
        boolean z97 = false;
        MATCHA_TRANSACTION_LIST = new DeepLinkPath("MATCHA_TRANSACTION_LIST", 115, "p2p_transfers_between", z96, z97, 6, null);
        MATCHA_TRANSFER_HISTORY = new DeepLinkPath("MATCHA_TRANSFER_HISTORY", 116, "p2p_transfer_history", z97, false, 6, defaultConstructorMarker);
        boolean z98 = false;
        MATCHA_PROFILE = new DeepLinkPath("MATCHA_PROFILE", 117, "p2p_profile", false, z98, 6, null);
        boolean z99 = false;
        MATCHA = new DeepLinkPath("MATCHA", 118, "p2p", z98, z99, 6, null);
        boolean z100 = false;
        MATCHA_INCENTIVES_LEARN_MORE = new DeepLinkPath("MATCHA_INCENTIVES_LEARN_MORE", 119, "p2p_incentives_learn_more", z99, z100, 6, null);
        boolean z101 = false;
        MATCHA_INSTANT_WITHDRAWAL_INTRO = new DeepLinkPath("MATCHA_INSTANT_WITHDRAWAL_INTRO", 120, "p2p_instant_withdrawal_intro", z100, z101, 6, null);
        boolean z102 = false;
        RHY_MERCHANT_REWARDS_DETAILS = new DeepLinkPath("RHY_MERCHANT_REWARDS_DETAILS", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, "merchant_reward_details", z101, z102, 6, null);
        boolean z103 = false;
        SPENDING_REWARD_DETAILS = new DeepLinkPath("SPENDING_REWARD_DETAILS", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, "spending_reward_details", z102, z103, 6, null);
        boolean z104 = false;
        RHY_SPENDING_OFFER = new DeepLinkPath("RHY_SPENDING_OFFER", 123, "rhy_spending_offer", z103, z104, 6, null);
        CASH_CUSHION_DETAILS = new DeepLinkPath("CASH_CUSHION_DETAILS", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, "cash_cushion_details", z104, false, 6, null);
        RETIREMENT_WAITLIST = new DeepLinkPath("RETIREMENT_WAITLIST", 125, "retirement_waitlist", true, false, 4, defaultConstructorMarker);
        boolean z105 = false;
        RETIREMENT_LEARN_AND_EARN_REWARD = new DeepLinkPath("RETIREMENT_LEARN_AND_EARN_REWARD", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, "retirement_learn_and_earn_reward", false, z105, 6, null);
        boolean z106 = false;
        RETIREMENT_TAX_BENEFITS = new DeepLinkPath("RETIREMENT_TAX_BENEFITS", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, "retirement_tax_benefits", z105, z106, 6, null);
        boolean z107 = false;
        RHY_NON_DEBIT_CARD_POST_SIGN_UP = new DeepLinkPath("RHY_NON_DEBIT_CARD_POST_SIGN_UP", 128, "rhy_non_debit_card_post_sign_up", z106, z107, 6, null);
        boolean z108 = false;
        RHY_POST_SIGN_UP = new DeepLinkPath("RHY_POST_SIGN_UP", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, "rhy_post_sign_up", z107, z108, 6, null);
        boolean z109 = false;
        SYP_INVEST_IRA = new DeepLinkPath("SYP_INVEST_IRA", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, "invest_syp_ira", z108, z109, 6, null);
        boolean z110 = false;
        SYP_IRA = new DeepLinkPath("SYP_IRA", 131, "syp_ira", z109, z110, 6, null);
        boolean z111 = false;
        RHY_ONLY_ONBOARDING = new DeepLinkPath("RHY_ONLY_ONBOARDING", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, "rhy_only_onboarding", z110, z111, 6, null);
        boolean z112 = false;
        RHY_RECURRING_MARKETING = new DeepLinkPath("RHY_RECURRING_MARKETING", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, "rhy_recurring_marketing", z111, z112, 6, null);
        SCREENER_DETAIL = new DeepLinkPath("SCREENER_DETAIL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, "screener_detail", z112, false, 6, defaultConstructorMarker);
        boolean z113 = false;
        RHY_REFERRER = new DeepLinkPath("RHY_REFERRER", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, "rhy_referrer", false, z113, 6, null);
        boolean z114 = false;
        RHY_REFEREE = new DeepLinkPath("RHY_REFEREE", 136, "rhy_referee", z113, z114, 6, null);
        boolean z115 = false;
        RHY_REFERRAL_TRACKING = new DeepLinkPath("RHY_REFERRAL_TRACKING", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, "rhy_referral_tracking", z114, z115, 6, null);
        boolean z116 = false;
        RHY_CLAIM_REFERRAL = new DeepLinkPath("RHY_CLAIM_REFERRAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, "claim_rhy_referral", z115, z116, 6, null);
        boolean z117 = false;
        RHY_REFERRAL_FUND = new DeepLinkPath("RHY_REFERRAL_FUND", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, "rhy_referral_fund", z116, z117, 6, null);
        boolean z118 = false;
        RHY_UNLOCK_CASHBACK_INTRO = new DeepLinkPath("RHY_UNLOCK_CASHBACK_INTRO", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, "unlock_cash_back_intro", z117, z118, 6, null);
        boolean z119 = false;
        RHY_UNLOCK_CASHBACK_DD = new DeepLinkPath("RHY_UNLOCK_CASHBACK_DD", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, "unlock_cash_back_dd", z118, z119, 6, null);
        boolean z120 = false;
        RHY_UNLOCK_CASHBACK_RECURRING = new DeepLinkPath("RHY_UNLOCK_CASHBACK_RECURRING", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, "unlock_cash_back_recurring", z119, z120, 6, null);
        ALERT_HUB_SETTINGS = new DeepLinkPath("ALERT_HUB_SETTINGS", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, "alert_hub_setting", z120, false, 6, defaultConstructorMarker);
        DeepLinkPath[] deepLinkPathArr$values = $values();
        $VALUES = deepLinkPathArr$values;
        $ENTRIES = EnumEntries2.enumEntries(deepLinkPathArr$values);
        INSTANCE = new Companion(null);
        SCHEME_ROBINHOOD$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.deeplink.DeepLinkPath$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeepLinkPath.SCHEME_ROBINHOOD_delegate$lambda$2();
            }
        });
    }

    public final String getUri() {
        if (this.isAppLink) {
            return "https://robinhood.com/" + StringsKt.replace$default(getPath(), "/*", "", false, 4, (Object) null);
        }
        return INSTANCE.getSCHEME_ROBINHOOD() + "://" + getPath();
    }

    public final Uri buildUri(Map<String, String> queryParameters) {
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        Uri.Builder builderBuildUpon = Uri.parse(getUri()).buildUpon();
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Uri uriBuild = builderBuildUpon.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    /* compiled from: DeepLinkPath.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/deeplink/DeepLinkPath$Companion;", "", "<init>", "()V", "SCHEME_ROBINHOOD", "", "getSCHEME_ROBINHOOD", "()Ljava/lang/String;", "SCHEME_ROBINHOOD$delegate", "Lkotlin/Lazy;", "URL_BASE", "ALTERNATE_URL_BASE", "SUBDOMAIN_URL_BASE", "JOINDOT_URL_BASE", "GIFT_URL_BASE", "DEPOSIT_URL_BASE", "SHARE_URL_BASE", "CDN_URL_BASE", "lib-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getSCHEME_ROBINHOOD() {
            return (String) DeepLinkPath.SCHEME_ROBINHOOD$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SCHEME_ROBINHOOD_delegate$lambda$2() {
        return DeeplinkConfig.INSTANCE.getScheme();
    }

    public static DeepLinkPath valueOf(String str) {
        return (DeepLinkPath) Enum.valueOf(DeepLinkPath.class, str);
    }

    public static DeepLinkPath[] values() {
        return (DeepLinkPath[]) $VALUES.clone();
    }
}
