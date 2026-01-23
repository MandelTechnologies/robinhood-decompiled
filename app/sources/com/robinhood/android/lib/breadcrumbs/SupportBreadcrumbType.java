package com.robinhood.android.lib.breadcrumbs;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SupportBreadcrumbType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0081\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001+B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CASH_RESTRICTED_CARD", "CASH_REQUEST_CARD", "CASH_DEBIT_STATE", "CASH_DEBIT_REPORT_PROBLEM", "CASH_DEBIT_APPLICATION", "CASH_DEBIT_CARD_REPORT", "CASH_PAY_BY_CHECK", "CLOSED_ISSUE", "ISSUE_ERROR", "CHATBOT_ERROR", "INVESTING_ACTION_EXERCISE", "INVESTING_ACTION_EXERCISE_ERROR", "INVESTING_MARKET_DATA_UNAVAILABLE", "INVESTING_OPTIONS_HOLDING", "INVESTING_OPTIONS_LEG", "INVESTING_OPTIONS_ORDER", "INVESTING_OPTIONS_EARLY_ASSIGNMENT", "INVESTING_OPTIONS_EARLY_EXERCISE_WARNING", "INVESTING_STOCKS_CORP_ACTION_WARNING", "INVESTING_STOCKS_HOLDING", "INVESTING_STOCKS_ORDERS", "LEGACY_TOPIC_ID", "RECOVERY_AUTHENTICATOR_RESET", "RECOVERY_TRUSTED_DEVICE_RESET", "SUPPORT_EXISTING_CASE", "SWITCH_SUPPORT_CHANNEL", "TRANSFERS_RHF_ORIGINATED_DEPOSIT", "TRANSFERS_RHF_ORIGINATED_WITHDRAWAL", "TRANSFERS_RHF_ORIGINATED_REVERSAL", "TRANSFERS_RHF_INTER_ENTITY", "TRANSFERS_RHY_ORIGINATED_DEPOSIT", "TRANSFERS_RHY_ORIGINATED_WITHDRAWAL", "TRANSFERS_RHY_ORIGINATED_REVERSAL", "TRANSFERS_RHY_INTER_ENTITY", "Companion", "lib-breadcrumbs_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class SupportBreadcrumbType implements RhEnum<SupportBreadcrumbType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SupportBreadcrumbType[] $VALUES;
    private final String serverValue;
    public static final SupportBreadcrumbType CASH_RESTRICTED_CARD = new SupportBreadcrumbType("CASH_RESTRICTED_CARD", 0, "cash.debit.restricted-card");
    public static final SupportBreadcrumbType CASH_REQUEST_CARD = new SupportBreadcrumbType("CASH_REQUEST_CARD", 1, "cash.debit.request-card");
    public static final SupportBreadcrumbType CASH_DEBIT_STATE = new SupportBreadcrumbType("CASH_DEBIT_STATE", 2, "cash.state");
    public static final SupportBreadcrumbType CASH_DEBIT_REPORT_PROBLEM = new SupportBreadcrumbType("CASH_DEBIT_REPORT_PROBLEM", 3, "cash.debit.report-problem");
    public static final SupportBreadcrumbType CASH_DEBIT_APPLICATION = new SupportBreadcrumbType("CASH_DEBIT_APPLICATION", 4, "cash.application");
    public static final SupportBreadcrumbType CASH_DEBIT_CARD_REPORT = new SupportBreadcrumbType("CASH_DEBIT_CARD_REPORT", 5, "cash.debit.card.report");
    public static final SupportBreadcrumbType CASH_PAY_BY_CHECK = new SupportBreadcrumbType("CASH_PAY_BY_CHECK", 6, "cash.pay-by-check");
    public static final SupportBreadcrumbType CLOSED_ISSUE = new SupportBreadcrumbType("CLOSED_ISSUE", 7, "support.closed-issue");
    public static final SupportBreadcrumbType ISSUE_ERROR = new SupportBreadcrumbType("ISSUE_ERROR", 8, "support.issue-error");
    public static final SupportBreadcrumbType CHATBOT_ERROR = new SupportBreadcrumbType("CHATBOT_ERROR", 9, "support.chatbot-error");
    public static final SupportBreadcrumbType INVESTING_ACTION_EXERCISE = new SupportBreadcrumbType("INVESTING_ACTION_EXERCISE", 10, "investing.action.exercise");
    public static final SupportBreadcrumbType INVESTING_ACTION_EXERCISE_ERROR = new SupportBreadcrumbType("INVESTING_ACTION_EXERCISE_ERROR", 11, "investing.action.exercise-error");
    public static final SupportBreadcrumbType INVESTING_MARKET_DATA_UNAVAILABLE = new SupportBreadcrumbType("INVESTING_MARKET_DATA_UNAVAILABLE", 12, "investing.market-data-unavailable");
    public static final SupportBreadcrumbType INVESTING_OPTIONS_HOLDING = new SupportBreadcrumbType("INVESTING_OPTIONS_HOLDING", 13, "investing.options.holding");
    public static final SupportBreadcrumbType INVESTING_OPTIONS_LEG = new SupportBreadcrumbType("INVESTING_OPTIONS_LEG", 14, "investing.options.leg");
    public static final SupportBreadcrumbType INVESTING_OPTIONS_ORDER = new SupportBreadcrumbType("INVESTING_OPTIONS_ORDER", 15, "investing.options.order");
    public static final SupportBreadcrumbType INVESTING_OPTIONS_EARLY_ASSIGNMENT = new SupportBreadcrumbType("INVESTING_OPTIONS_EARLY_ASSIGNMENT", 16, "investing.options.early-assignment");
    public static final SupportBreadcrumbType INVESTING_OPTIONS_EARLY_EXERCISE_WARNING = new SupportBreadcrumbType("INVESTING_OPTIONS_EARLY_EXERCISE_WARNING", 17, "investing.option.early-exercise-warning");
    public static final SupportBreadcrumbType INVESTING_STOCKS_CORP_ACTION_WARNING = new SupportBreadcrumbType("INVESTING_STOCKS_CORP_ACTION_WARNING", 18, "investing.stocks.corporate-action-warning");
    public static final SupportBreadcrumbType INVESTING_STOCKS_HOLDING = new SupportBreadcrumbType("INVESTING_STOCKS_HOLDING", 19, "investing.stocks.holding");
    public static final SupportBreadcrumbType INVESTING_STOCKS_ORDERS = new SupportBreadcrumbType("INVESTING_STOCKS_ORDERS", 20, "investing.stocks.orders");
    public static final SupportBreadcrumbType LEGACY_TOPIC_ID = new SupportBreadcrumbType("LEGACY_TOPIC_ID", 21, "legacy_topic_id");
    public static final SupportBreadcrumbType RECOVERY_AUTHENTICATOR_RESET = new SupportBreadcrumbType("RECOVERY_AUTHENTICATOR_RESET", 22, "recovery.authenticator-reset");
    public static final SupportBreadcrumbType RECOVERY_TRUSTED_DEVICE_RESET = new SupportBreadcrumbType("RECOVERY_TRUSTED_DEVICE_RESET", 23, "recovery.trusted-device-reset");
    public static final SupportBreadcrumbType SUPPORT_EXISTING_CASE = new SupportBreadcrumbType("SUPPORT_EXISTING_CASE", 24, "support.existing-case");
    public static final SupportBreadcrumbType SWITCH_SUPPORT_CHANNEL = new SupportBreadcrumbType("SWITCH_SUPPORT_CHANNEL", 25, "support.switch-channel");
    public static final SupportBreadcrumbType TRANSFERS_RHF_ORIGINATED_DEPOSIT = new SupportBreadcrumbType("TRANSFERS_RHF_ORIGINATED_DEPOSIT", 26, "transfers.rhf.originated.deposit");
    public static final SupportBreadcrumbType TRANSFERS_RHF_ORIGINATED_WITHDRAWAL = new SupportBreadcrumbType("TRANSFERS_RHF_ORIGINATED_WITHDRAWAL", 27, "transfers.rhf.originated.withdrawal");
    public static final SupportBreadcrumbType TRANSFERS_RHF_ORIGINATED_REVERSAL = new SupportBreadcrumbType("TRANSFERS_RHF_ORIGINATED_REVERSAL", 28, "transfers.rhf.originated.reversal");
    public static final SupportBreadcrumbType TRANSFERS_RHF_INTER_ENTITY = new SupportBreadcrumbType("TRANSFERS_RHF_INTER_ENTITY", 29, "transfers.rhf.xent");
    public static final SupportBreadcrumbType TRANSFERS_RHY_ORIGINATED_DEPOSIT = new SupportBreadcrumbType("TRANSFERS_RHY_ORIGINATED_DEPOSIT", 30, "transfers.rhy.originated.deposit");
    public static final SupportBreadcrumbType TRANSFERS_RHY_ORIGINATED_WITHDRAWAL = new SupportBreadcrumbType("TRANSFERS_RHY_ORIGINATED_WITHDRAWAL", 31, "transfers.rhy.originated.withdrawal");
    public static final SupportBreadcrumbType TRANSFERS_RHY_ORIGINATED_REVERSAL = new SupportBreadcrumbType("TRANSFERS_RHY_ORIGINATED_REVERSAL", 32, "transfers.rhy.originated.reversal");
    public static final SupportBreadcrumbType TRANSFERS_RHY_INTER_ENTITY = new SupportBreadcrumbType("TRANSFERS_RHY_INTER_ENTITY", 33, "transfers.rhy.xent");

    private static final /* synthetic */ SupportBreadcrumbType[] $values() {
        return new SupportBreadcrumbType[]{CASH_RESTRICTED_CARD, CASH_REQUEST_CARD, CASH_DEBIT_STATE, CASH_DEBIT_REPORT_PROBLEM, CASH_DEBIT_APPLICATION, CASH_DEBIT_CARD_REPORT, CASH_PAY_BY_CHECK, CLOSED_ISSUE, ISSUE_ERROR, CHATBOT_ERROR, INVESTING_ACTION_EXERCISE, INVESTING_ACTION_EXERCISE_ERROR, INVESTING_MARKET_DATA_UNAVAILABLE, INVESTING_OPTIONS_HOLDING, INVESTING_OPTIONS_LEG, INVESTING_OPTIONS_ORDER, INVESTING_OPTIONS_EARLY_ASSIGNMENT, INVESTING_OPTIONS_EARLY_EXERCISE_WARNING, INVESTING_STOCKS_CORP_ACTION_WARNING, INVESTING_STOCKS_HOLDING, INVESTING_STOCKS_ORDERS, LEGACY_TOPIC_ID, RECOVERY_AUTHENTICATOR_RESET, RECOVERY_TRUSTED_DEVICE_RESET, SUPPORT_EXISTING_CASE, SWITCH_SUPPORT_CHANNEL, TRANSFERS_RHF_ORIGINATED_DEPOSIT, TRANSFERS_RHF_ORIGINATED_WITHDRAWAL, TRANSFERS_RHF_ORIGINATED_REVERSAL, TRANSFERS_RHF_INTER_ENTITY, TRANSFERS_RHY_ORIGINATED_DEPOSIT, TRANSFERS_RHY_ORIGINATED_WITHDRAWAL, TRANSFERS_RHY_ORIGINATED_REVERSAL, TRANSFERS_RHY_INTER_ENTITY};
    }

    public static EnumEntries<SupportBreadcrumbType> getEntries() {
        return $ENTRIES;
    }

    private SupportBreadcrumbType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        SupportBreadcrumbType[] supportBreadcrumbTypeArr$values = $values();
        $VALUES = supportBreadcrumbTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(supportBreadcrumbTypeArr$values);
        INSTANCE = new Companion(null);
    }

    public static SupportBreadcrumbType valueOf(String str) {
        return (SupportBreadcrumbType) Enum.valueOf(SupportBreadcrumbType.class, str);
    }

    public static SupportBreadcrumbType[] values() {
        return (SupportBreadcrumbType[]) $VALUES.clone();
    }
}
