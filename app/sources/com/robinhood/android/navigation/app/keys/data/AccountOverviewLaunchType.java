package com.robinhood.android.navigation.app.keys.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountOverviewLaunchType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/AccountOverviewLaunchType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "INSTANT_DEPOSIT", "SWEEP", "DAY_TRADE", "OPTIONS", "FUTURES", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class AccountOverviewLaunchType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountOverviewLaunchType[] $VALUES;
    public static final AccountOverviewLaunchType NONE = new AccountOverviewLaunchType("NONE", 0);
    public static final AccountOverviewLaunchType INSTANT_DEPOSIT = new AccountOverviewLaunchType("INSTANT_DEPOSIT", 1);
    public static final AccountOverviewLaunchType SWEEP = new AccountOverviewLaunchType("SWEEP", 2);
    public static final AccountOverviewLaunchType DAY_TRADE = new AccountOverviewLaunchType("DAY_TRADE", 3);
    public static final AccountOverviewLaunchType OPTIONS = new AccountOverviewLaunchType("OPTIONS", 4);
    public static final AccountOverviewLaunchType FUTURES = new AccountOverviewLaunchType("FUTURES", 5);

    private static final /* synthetic */ AccountOverviewLaunchType[] $values() {
        return new AccountOverviewLaunchType[]{NONE, INSTANT_DEPOSIT, SWEEP, DAY_TRADE, OPTIONS, FUTURES};
    }

    public static EnumEntries<AccountOverviewLaunchType> getEntries() {
        return $ENTRIES;
    }

    private AccountOverviewLaunchType(String str, int i) {
    }

    static {
        AccountOverviewLaunchType[] accountOverviewLaunchTypeArr$values = $values();
        $VALUES = accountOverviewLaunchTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountOverviewLaunchTypeArr$values);
    }

    public static AccountOverviewLaunchType valueOf(String str) {
        return (AccountOverviewLaunchType) Enum.valueOf(AccountOverviewLaunchType.class, str);
    }

    public static AccountOverviewLaunchType[] values() {
        return (AccountOverviewLaunchType[]) $VALUES.clone();
    }
}
