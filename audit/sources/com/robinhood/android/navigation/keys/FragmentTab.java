package com.robinhood.android.navigation.keys;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FragmentTab.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/FragmentTab;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "SEARCH", "CRYPTO", "GOLD", "SPENDING", "RETIREMENT", "BROWSE", "INBOX", "ACCOUNT", "PERPETUALS", "CURRENT_TAB", "SHOULD_NOT_BE_IN_TAB", "INVESTING_MONITOR", "ACCOUNT_SELECTOR", "WATCHLIST_REDESIGN", "ISA", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class FragmentTab {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FragmentTab[] $VALUES;
    public static final FragmentTab HOME = new FragmentTab("HOME", 0);
    public static final FragmentTab SEARCH = new FragmentTab("SEARCH", 1);
    public static final FragmentTab CRYPTO = new FragmentTab("CRYPTO", 2);
    public static final FragmentTab GOLD = new FragmentTab("GOLD", 3);
    public static final FragmentTab SPENDING = new FragmentTab("SPENDING", 4);
    public static final FragmentTab RETIREMENT = new FragmentTab("RETIREMENT", 5);
    public static final FragmentTab BROWSE = new FragmentTab("BROWSE", 6);
    public static final FragmentTab INBOX = new FragmentTab("INBOX", 7);
    public static final FragmentTab ACCOUNT = new FragmentTab("ACCOUNT", 8);
    public static final FragmentTab PERPETUALS = new FragmentTab("PERPETUALS", 9);
    public static final FragmentTab CURRENT_TAB = new FragmentTab("CURRENT_TAB", 10);
    public static final FragmentTab SHOULD_NOT_BE_IN_TAB = new FragmentTab("SHOULD_NOT_BE_IN_TAB", 11);
    public static final FragmentTab INVESTING_MONITOR = new FragmentTab("INVESTING_MONITOR", 12);
    public static final FragmentTab ACCOUNT_SELECTOR = new FragmentTab("ACCOUNT_SELECTOR", 13);
    public static final FragmentTab WATCHLIST_REDESIGN = new FragmentTab("WATCHLIST_REDESIGN", 14);
    public static final FragmentTab ISA = new FragmentTab("ISA", 15);

    private static final /* synthetic */ FragmentTab[] $values() {
        return new FragmentTab[]{HOME, SEARCH, CRYPTO, GOLD, SPENDING, RETIREMENT, BROWSE, INBOX, ACCOUNT, PERPETUALS, CURRENT_TAB, SHOULD_NOT_BE_IN_TAB, INVESTING_MONITOR, ACCOUNT_SELECTOR, WATCHLIST_REDESIGN, ISA};
    }

    public static EnumEntries<FragmentTab> getEntries() {
        return $ENTRIES;
    }

    private FragmentTab(String str, int i) {
    }

    static {
        FragmentTab[] fragmentTabArr$values = $values();
        $VALUES = fragmentTabArr$values;
        $ENTRIES = EnumEntries2.enumEntries(fragmentTabArr$values);
    }

    public static FragmentTab valueOf(String str) {
        return (FragmentTab) Enum.valueOf(FragmentTab.class, str);
    }

    public static FragmentTab[] values() {
        return (FragmentTab[]) $VALUES.clone();
    }
}
