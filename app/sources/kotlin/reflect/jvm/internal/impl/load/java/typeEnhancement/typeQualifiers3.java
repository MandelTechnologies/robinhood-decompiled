package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: typeQualifiers.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier, reason: use source file name */
/* loaded from: classes14.dex */
public final class typeQualifiers3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ typeQualifiers3[] $VALUES;
    public static final typeQualifiers3 FORCE_FLEXIBILITY = new typeQualifiers3("FORCE_FLEXIBILITY", 0);
    public static final typeQualifiers3 NULLABLE = new typeQualifiers3("NULLABLE", 1);
    public static final typeQualifiers3 NOT_NULL = new typeQualifiers3("NOT_NULL", 2);

    private static final /* synthetic */ typeQualifiers3[] $values() {
        return new typeQualifiers3[]{FORCE_FLEXIBILITY, NULLABLE, NOT_NULL};
    }

    private typeQualifiers3(String str, int i) {
    }

    static {
        typeQualifiers3[] typequalifiers3Arr$values = $values();
        $VALUES = typequalifiers3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(typequalifiers3Arr$values);
    }

    public static typeQualifiers3 valueOf(String str) {
        return (typeQualifiers3) Enum.valueOf(typeQualifiers3.class, str);
    }

    public static typeQualifiers3[] values() {
        return (typeQualifiers3[]) $VALUES.clone();
    }
}
