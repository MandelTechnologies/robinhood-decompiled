package com.robinhood.android.swipetodismiss;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToDismiss.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/swipetodismiss/DismissValue;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "DismissedToEnd", "DismissedToStart", "lib-swipe-to-dismiss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.swipetodismiss.DismissValue, reason: use source file name */
/* loaded from: classes9.dex */
public final class SwipeToDismiss3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SwipeToDismiss3[] $VALUES;
    public static final SwipeToDismiss3 Default = new SwipeToDismiss3("Default", 0);
    public static final SwipeToDismiss3 DismissedToEnd = new SwipeToDismiss3("DismissedToEnd", 1);
    public static final SwipeToDismiss3 DismissedToStart = new SwipeToDismiss3("DismissedToStart", 2);

    private static final /* synthetic */ SwipeToDismiss3[] $values() {
        return new SwipeToDismiss3[]{Default, DismissedToEnd, DismissedToStart};
    }

    public static EnumEntries<SwipeToDismiss3> getEntries() {
        return $ENTRIES;
    }

    private SwipeToDismiss3(String str, int i) {
    }

    static {
        SwipeToDismiss3[] swipeToDismiss3Arr$values = $values();
        $VALUES = swipeToDismiss3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(swipeToDismiss3Arr$values);
    }

    public static SwipeToDismiss3 valueOf(String str) {
        return (SwipeToDismiss3) Enum.valueOf(SwipeToDismiss3.class, str);
    }

    public static SwipeToDismiss3[] values() {
        return (SwipeToDismiss3[]) $VALUES.clone();
    }
}
