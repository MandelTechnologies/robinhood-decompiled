package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeprecationInfo.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue, reason: use source file name */
/* loaded from: classes14.dex */
public final class DeprecationInfo2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeprecationInfo2[] $VALUES;
    public static final DeprecationInfo2 WARNING = new DeprecationInfo2("WARNING", 0);
    public static final DeprecationInfo2 ERROR = new DeprecationInfo2("ERROR", 1);
    public static final DeprecationInfo2 HIDDEN = new DeprecationInfo2("HIDDEN", 2);

    private static final /* synthetic */ DeprecationInfo2[] $values() {
        return new DeprecationInfo2[]{WARNING, ERROR, HIDDEN};
    }

    private DeprecationInfo2(String str, int i) {
    }

    static {
        DeprecationInfo2[] deprecationInfo2Arr$values = $values();
        $VALUES = deprecationInfo2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(deprecationInfo2Arr$values);
    }

    public static DeprecationInfo2 valueOf(String str) {
        return (DeprecationInfo2) Enum.valueOf(DeprecationInfo2.class, str);
    }

    public static DeprecationInfo2[] values() {
        return (DeprecationInfo2[]) $VALUES.clone();
    }
}
