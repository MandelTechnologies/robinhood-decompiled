package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: typeQualifiers.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier, reason: use source file name */
/* loaded from: classes14.dex */
public final class typeQualifiers2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ typeQualifiers2[] $VALUES;
    public static final typeQualifiers2 READ_ONLY = new typeQualifiers2("READ_ONLY", 0);
    public static final typeQualifiers2 MUTABLE = new typeQualifiers2("MUTABLE", 1);

    private static final /* synthetic */ typeQualifiers2[] $values() {
        return new typeQualifiers2[]{READ_ONLY, MUTABLE};
    }

    private typeQualifiers2(String str, int i) {
    }

    static {
        typeQualifiers2[] typequalifiers2Arr$values = $values();
        $VALUES = typequalifiers2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(typequalifiers2Arr$values);
    }

    public static typeQualifiers2 valueOf(String str) {
        return (typeQualifiers2) Enum.valueOf(typeQualifiers2.class, str);
    }

    public static typeQualifiers2[] values() {
        return (typeQualifiers2[]) $VALUES.clone();
    }
}
