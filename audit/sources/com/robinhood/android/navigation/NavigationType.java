package com.robinhood.android.navigation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavigationType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/navigation/NavigationType;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "PUSH", "NO_TRANSITION", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NavigationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationType[] $VALUES;
    public static final NavigationType PRESENT = new NavigationType("PRESENT", 0);
    public static final NavigationType PUSH = new NavigationType("PUSH", 1);
    public static final NavigationType NO_TRANSITION = new NavigationType("NO_TRANSITION", 2);

    private static final /* synthetic */ NavigationType[] $values() {
        return new NavigationType[]{PRESENT, PUSH, NO_TRANSITION};
    }

    public static EnumEntries<NavigationType> getEntries() {
        return $ENTRIES;
    }

    private NavigationType(String str, int i) {
    }

    static {
        NavigationType[] navigationTypeArr$values = $values();
        $VALUES = navigationTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(navigationTypeArr$values);
    }

    public static NavigationType valueOf(String str) {
        return (NavigationType) Enum.valueOf(NavigationType.class, str);
    }

    public static NavigationType[] values() {
        return (NavigationType[]) $VALUES.clone();
    }
}
