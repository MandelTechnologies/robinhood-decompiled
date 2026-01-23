package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisplayCurrencySwitcherLocation.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherLocation;", "", "<init>", "(Ljava/lang/String;I)V", "HOME_TAB", "BUYING_POWER", "ACCOUNT_TAB", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DisplayCurrencySwitcherLocation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplayCurrencySwitcherLocation[] $VALUES;
    public static final DisplayCurrencySwitcherLocation HOME_TAB = new DisplayCurrencySwitcherLocation("HOME_TAB", 0);
    public static final DisplayCurrencySwitcherLocation BUYING_POWER = new DisplayCurrencySwitcherLocation("BUYING_POWER", 1);
    public static final DisplayCurrencySwitcherLocation ACCOUNT_TAB = new DisplayCurrencySwitcherLocation("ACCOUNT_TAB", 2);

    private static final /* synthetic */ DisplayCurrencySwitcherLocation[] $values() {
        return new DisplayCurrencySwitcherLocation[]{HOME_TAB, BUYING_POWER, ACCOUNT_TAB};
    }

    public static EnumEntries<DisplayCurrencySwitcherLocation> getEntries() {
        return $ENTRIES;
    }

    private DisplayCurrencySwitcherLocation(String str, int i) {
    }

    static {
        DisplayCurrencySwitcherLocation[] displayCurrencySwitcherLocationArr$values = $values();
        $VALUES = displayCurrencySwitcherLocationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(displayCurrencySwitcherLocationArr$values);
    }

    public static DisplayCurrencySwitcherLocation valueOf(String str) {
        return (DisplayCurrencySwitcherLocation) Enum.valueOf(DisplayCurrencySwitcherLocation.class, str);
    }

    public static DisplayCurrencySwitcherLocation[] values() {
        return (DisplayCurrencySwitcherLocation[]) $VALUES.clone();
    }
}
