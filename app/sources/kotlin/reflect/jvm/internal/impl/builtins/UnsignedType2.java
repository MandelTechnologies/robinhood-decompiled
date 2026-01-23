package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnsignedType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType, reason: use source file name */
/* loaded from: classes14.dex */
public final class UnsignedType2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UnsignedType2[] $VALUES;
    public static final UnsignedType2 UBYTEARRAY;
    public static final UnsignedType2 UINTARRAY;
    public static final UnsignedType2 ULONGARRAY;
    public static final UnsignedType2 USHORTARRAY;
    private final ClassId classId;
    private final Name typeName;

    private static final /* synthetic */ UnsignedType2[] $values() {
        return new UnsignedType2[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    private UnsignedType2(String str, int i, ClassId classId) {
        this.classId = classId;
        this.typeName = classId.getShortClassName();
    }

    static {
        ClassId.Companion companion = ClassId.Companion;
        UBYTEARRAY = new UnsignedType2("UBYTEARRAY", 0, ClassId.Companion.fromString$default(companion, "kotlin/UByteArray", false, 2, null));
        USHORTARRAY = new UnsignedType2("USHORTARRAY", 1, ClassId.Companion.fromString$default(companion, "kotlin/UShortArray", false, 2, null));
        UINTARRAY = new UnsignedType2("UINTARRAY", 2, ClassId.Companion.fromString$default(companion, "kotlin/UIntArray", false, 2, null));
        ULONGARRAY = new UnsignedType2("ULONGARRAY", 3, ClassId.Companion.fromString$default(companion, "kotlin/ULongArray", false, 2, null));
        UnsignedType2[] unsignedType2Arr$values = $values();
        $VALUES = unsignedType2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(unsignedType2Arr$values);
    }

    public final Name getTypeName() {
        return this.typeName;
    }

    public static UnsignedType2 valueOf(String str) {
        return (UnsignedType2) Enum.valueOf(UnsignedType2.class, str);
    }

    public static UnsignedType2[] values() {
        return (UnsignedType2[]) $VALUES.clone();
    }
}
