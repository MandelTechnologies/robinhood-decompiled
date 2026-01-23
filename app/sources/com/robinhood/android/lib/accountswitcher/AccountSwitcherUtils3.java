package com.robinhood.android.lib.accountswitcher;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSwitcherUtils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/SectionType;", "", "<init>", "(Ljava/lang/String;I)V", "INDIVIDUAL_ACCOUNTS", "JOINT_ACCOUNTS", "RETIREMENT_ACCOUNTS", "CUSTODIAL_ACCOUNTS", "ISA_ACCOUNTS", "OTHER", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.accountswitcher.SectionType, reason: use source file name */
/* loaded from: classes8.dex */
final class AccountSwitcherUtils3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountSwitcherUtils3[] $VALUES;
    public static final AccountSwitcherUtils3 INDIVIDUAL_ACCOUNTS = new AccountSwitcherUtils3("INDIVIDUAL_ACCOUNTS", 0);
    public static final AccountSwitcherUtils3 JOINT_ACCOUNTS = new AccountSwitcherUtils3("JOINT_ACCOUNTS", 1);
    public static final AccountSwitcherUtils3 RETIREMENT_ACCOUNTS = new AccountSwitcherUtils3("RETIREMENT_ACCOUNTS", 2);
    public static final AccountSwitcherUtils3 CUSTODIAL_ACCOUNTS = new AccountSwitcherUtils3("CUSTODIAL_ACCOUNTS", 3);
    public static final AccountSwitcherUtils3 ISA_ACCOUNTS = new AccountSwitcherUtils3("ISA_ACCOUNTS", 4);
    public static final AccountSwitcherUtils3 OTHER = new AccountSwitcherUtils3("OTHER", 5);

    private static final /* synthetic */ AccountSwitcherUtils3[] $values() {
        return new AccountSwitcherUtils3[]{INDIVIDUAL_ACCOUNTS, JOINT_ACCOUNTS, RETIREMENT_ACCOUNTS, CUSTODIAL_ACCOUNTS, ISA_ACCOUNTS, OTHER};
    }

    public static EnumEntries<AccountSwitcherUtils3> getEntries() {
        return $ENTRIES;
    }

    private AccountSwitcherUtils3(String str, int i) {
    }

    static {
        AccountSwitcherUtils3[] accountSwitcherUtils3Arr$values = $values();
        $VALUES = accountSwitcherUtils3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountSwitcherUtils3Arr$values);
    }

    public static AccountSwitcherUtils3 valueOf(String str) {
        return (AccountSwitcherUtils3) Enum.valueOf(AccountSwitcherUtils3.class, str);
    }

    public static AccountSwitcherUtils3[] values() {
        return (AccountSwitcherUtils3[]) $VALUES.clone();
    }
}
