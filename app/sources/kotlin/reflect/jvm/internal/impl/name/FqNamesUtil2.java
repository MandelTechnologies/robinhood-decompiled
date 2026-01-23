package kotlin.reflect.jvm.internal.impl.name;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FqNamesUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.name.State, reason: use source file name */
/* loaded from: classes14.dex */
final class FqNamesUtil2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FqNamesUtil2[] $VALUES;
    public static final FqNamesUtil2 BEGINNING = new FqNamesUtil2("BEGINNING", 0);
    public static final FqNamesUtil2 MIDDLE = new FqNamesUtil2("MIDDLE", 1);
    public static final FqNamesUtil2 AFTER_DOT = new FqNamesUtil2("AFTER_DOT", 2);

    private static final /* synthetic */ FqNamesUtil2[] $values() {
        return new FqNamesUtil2[]{BEGINNING, MIDDLE, AFTER_DOT};
    }

    private FqNamesUtil2(String str, int i) {
    }

    static {
        FqNamesUtil2[] fqNamesUtil2Arr$values = $values();
        $VALUES = fqNamesUtil2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(fqNamesUtil2Arr$values);
    }

    public static FqNamesUtil2 valueOf(String str) {
        return (FqNamesUtil2) Enum.valueOf(FqNamesUtil2.class, str);
    }

    public static FqNamesUtil2[] values() {
        return (FqNamesUtil2[]) $VALUES.clone();
    }
}
