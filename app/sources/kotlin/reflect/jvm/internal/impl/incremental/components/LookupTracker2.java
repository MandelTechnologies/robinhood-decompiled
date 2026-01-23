package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LookupTracker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind, reason: use source file name */
/* loaded from: classes14.dex */
public final class LookupTracker2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LookupTracker2[] $VALUES;
    public static final LookupTracker2 PACKAGE = new LookupTracker2("PACKAGE", 0);
    public static final LookupTracker2 CLASSIFIER = new LookupTracker2("CLASSIFIER", 1);

    private static final /* synthetic */ LookupTracker2[] $values() {
        return new LookupTracker2[]{PACKAGE, CLASSIFIER};
    }

    private LookupTracker2(String str, int i) {
    }

    static {
        LookupTracker2[] lookupTracker2Arr$values = $values();
        $VALUES = lookupTracker2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(lookupTracker2Arr$values);
    }

    public static LookupTracker2 valueOf(String str) {
        return (LookupTracker2) Enum.valueOf(LookupTracker2.class, str);
    }

    public static LookupTracker2[] values() {
        return (LookupTracker2[]) $VALUES.clone();
    }
}
