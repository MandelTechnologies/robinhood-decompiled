package com.robinhood.android.redesign.accounttab;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountTabType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/AccountTabType;", "", "description", "", "analyticsIdentifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getAnalyticsIdentifier", "INDIVIDUAL", "INDIVIDUAL_SIGN_UP", "INDIVIDUAL_PENDING", "RETIREMENT_IRA", "RETIREMENT_SIGN_UP", "RETIREMENT_ROTH", "MANAGED", "SPENDING", "CREDIT_CARD", "JOINT", "JOINT_PENDING", "JOINT_SIGN_UP", "ADVISORY_SIGN_UP", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountTabType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountTabType[] $VALUES;
    private final String analyticsIdentifier;
    private final String description;
    public static final AccountTabType INDIVIDUAL = new AccountTabType("INDIVIDUAL", 0, "individual", "selector_brokerage_account");
    public static final AccountTabType INDIVIDUAL_SIGN_UP = new AccountTabType("INDIVIDUAL_SIGN_UP", 1, "individual_sign_up", "selector_brokerage_account_upsell");
    public static final AccountTabType INDIVIDUAL_PENDING = new AccountTabType("INDIVIDUAL_PENDING", 2, "individual_pending", "selector_brokerage_application");
    public static final AccountTabType RETIREMENT_IRA = new AccountTabType("RETIREMENT_IRA", 3, "retirement_ira", "selector_retirement_account");
    public static final AccountTabType RETIREMENT_SIGN_UP = new AccountTabType("RETIREMENT_SIGN_UP", 4, "retirement_sign_up", "selector_retirement_upsell");
    public static final AccountTabType RETIREMENT_ROTH = new AccountTabType("RETIREMENT_ROTH", 5, "retirement_roth", "selector_retirement_account");
    public static final AccountTabType MANAGED = new AccountTabType("MANAGED", 6, "managed", "selector_managed_brokerage_account");
    public static final AccountTabType SPENDING = new AccountTabType("SPENDING", 7, "spending", "selector_spending_account");
    public static final AccountTabType CREDIT_CARD = new AccountTabType("CREDIT_CARD", 8, "credit_card_sign_up", "selector_credit_card_upsell");
    public static final AccountTabType JOINT = new AccountTabType("JOINT", 9, "joint", "selector_joint_brokerage_account");
    public static final AccountTabType JOINT_PENDING = new AccountTabType("JOINT_PENDING", 10, "joint_pending", "selector_joint_application");
    public static final AccountTabType JOINT_SIGN_UP = new AccountTabType("JOINT_SIGN_UP", 11, "joint_sign_up", "selector_joint_account_upsell");
    public static final AccountTabType ADVISORY_SIGN_UP = new AccountTabType("ADVISORY_SIGN_UP", 12, "advisory_sign_up", "selector_strategies_upsell");

    private static final /* synthetic */ AccountTabType[] $values() {
        return new AccountTabType[]{INDIVIDUAL, INDIVIDUAL_SIGN_UP, INDIVIDUAL_PENDING, RETIREMENT_IRA, RETIREMENT_SIGN_UP, RETIREMENT_ROTH, MANAGED, SPENDING, CREDIT_CARD, JOINT, JOINT_PENDING, JOINT_SIGN_UP, ADVISORY_SIGN_UP};
    }

    public static EnumEntries<AccountTabType> getEntries() {
        return $ENTRIES;
    }

    private AccountTabType(String str, int i, String str2, String str3) {
        this.description = str2;
        this.analyticsIdentifier = str3;
    }

    public final String getAnalyticsIdentifier() {
        return this.analyticsIdentifier;
    }

    public final String getDescription() {
        return this.description;
    }

    static {
        AccountTabType[] accountTabTypeArr$values = $values();
        $VALUES = accountTabTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountTabTypeArr$values);
    }

    public static AccountTabType valueOf(String str) {
        return (AccountTabType) Enum.valueOf(AccountTabType.class, str);
    }

    public static AccountTabType[] values() {
        return (AccountTabType[]) $VALUES.clone();
    }
}
