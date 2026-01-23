package com.robinhood.android.navigation.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavTransition.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/NavTransition;", "", "<init>", "(Ljava/lang/String;I)V", "CROSS_FADE", "ENTER_NONE_POP_SLIDE_HORIZONTAL", "SLIDE_HORIZONTAL", "SLIDE_HORIZONTAL_REVERSE", "SLIDE_VERTICAL", "NONE", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NavTransition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavTransition[] $VALUES;
    public static final NavTransition CROSS_FADE = new NavTransition("CROSS_FADE", 0);
    public static final NavTransition ENTER_NONE_POP_SLIDE_HORIZONTAL = new NavTransition("ENTER_NONE_POP_SLIDE_HORIZONTAL", 1);
    public static final NavTransition SLIDE_HORIZONTAL = new NavTransition("SLIDE_HORIZONTAL", 2);
    public static final NavTransition SLIDE_HORIZONTAL_REVERSE = new NavTransition("SLIDE_HORIZONTAL_REVERSE", 3);
    public static final NavTransition SLIDE_VERTICAL = new NavTransition("SLIDE_VERTICAL", 4);
    public static final NavTransition NONE = new NavTransition("NONE", 5);

    private static final /* synthetic */ NavTransition[] $values() {
        return new NavTransition[]{CROSS_FADE, ENTER_NONE_POP_SLIDE_HORIZONTAL, SLIDE_HORIZONTAL, SLIDE_HORIZONTAL_REVERSE, SLIDE_VERTICAL, NONE};
    }

    public static EnumEntries<NavTransition> getEntries() {
        return $ENTRIES;
    }

    private NavTransition(String str, int i) {
    }

    static {
        NavTransition[] navTransitionArr$values = $values();
        $VALUES = navTransitionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(navTransitionArr$values);
    }

    public static NavTransition valueOf(String str) {
        return (NavTransition) Enum.valueOf(NavTransition.class, str);
    }

    public static NavTransition[] values() {
        return (NavTransition[]) $VALUES.clone();
    }
}
