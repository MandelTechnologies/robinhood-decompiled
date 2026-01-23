package com.robinhood.android.swipetodismiss;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToDismiss.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/swipetodismiss/DismissDirection;", "", "<init>", "(Ljava/lang/String;I)V", "StartToEnd", "EndToStart", "lib-swipe-to-dismiss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.swipetodismiss.DismissDirection, reason: use source file name */
/* loaded from: classes9.dex */
public final class SwipeToDismiss {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SwipeToDismiss[] $VALUES;
    public static final SwipeToDismiss StartToEnd = new SwipeToDismiss("StartToEnd", 0);
    public static final SwipeToDismiss EndToStart = new SwipeToDismiss("EndToStart", 1);

    private static final /* synthetic */ SwipeToDismiss[] $values() {
        return new SwipeToDismiss[]{StartToEnd, EndToStart};
    }

    public static EnumEntries<SwipeToDismiss> getEntries() {
        return $ENTRIES;
    }

    private SwipeToDismiss(String str, int i) {
    }

    static {
        SwipeToDismiss[] swipeToDismissArr$values = $values();
        $VALUES = swipeToDismissArr$values;
        $ENTRIES = EnumEntries2.enumEntries(swipeToDismissArr$values);
    }

    public static SwipeToDismiss valueOf(String str) {
        return (SwipeToDismiss) Enum.valueOf(SwipeToDismiss.class, str);
    }

    public static SwipeToDismiss[] values() {
        return (SwipeToDismiss[]) $VALUES.clone();
    }
}
