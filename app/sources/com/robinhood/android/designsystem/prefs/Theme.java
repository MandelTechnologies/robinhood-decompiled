package com.robinhood.android.designsystem.prefs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Theme.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/prefs/Theme;", "", "<init>", "(Ljava/lang/String;I)V", "MARKET", "SYSTEM", "DAY", "NIGHT", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class Theme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Theme[] $VALUES;
    public static final Theme MARKET = new Theme("MARKET", 0);
    public static final Theme SYSTEM = new Theme("SYSTEM", 1);
    public static final Theme DAY = new Theme("DAY", 2);
    public static final Theme NIGHT = new Theme("NIGHT", 3);

    private static final /* synthetic */ Theme[] $values() {
        return new Theme[]{MARKET, SYSTEM, DAY, NIGHT};
    }

    public static EnumEntries<Theme> getEntries() {
        return $ENTRIES;
    }

    private Theme(String str, int i) {
    }

    static {
        Theme[] themeArr$values = $values();
        $VALUES = themeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(themeArr$values);
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }
}
