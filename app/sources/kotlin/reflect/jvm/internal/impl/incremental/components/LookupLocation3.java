package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LookupLocation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation, reason: use source file name */
/* loaded from: classes21.dex */
public final class LookupLocation3 implements LookupLocation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LookupLocation3[] $VALUES;
    public static final LookupLocation3 FROM_IDE = new LookupLocation3("FROM_IDE", 0);
    public static final LookupLocation3 FROM_BACKEND = new LookupLocation3("FROM_BACKEND", 1);
    public static final LookupLocation3 FROM_TEST = new LookupLocation3("FROM_TEST", 2);
    public static final LookupLocation3 FROM_BUILTINS = new LookupLocation3("FROM_BUILTINS", 3);
    public static final LookupLocation3 WHEN_CHECK_DECLARATION_CONFLICTS = new LookupLocation3("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
    public static final LookupLocation3 WHEN_CHECK_OVERRIDES = new LookupLocation3("WHEN_CHECK_OVERRIDES", 5);
    public static final LookupLocation3 FOR_SCRIPT = new LookupLocation3("FOR_SCRIPT", 6);
    public static final LookupLocation3 FROM_REFLECTION = new LookupLocation3("FROM_REFLECTION", 7);
    public static final LookupLocation3 WHEN_RESOLVE_DECLARATION = new LookupLocation3("WHEN_RESOLVE_DECLARATION", 8);
    public static final LookupLocation3 WHEN_GET_DECLARATION_SCOPE = new LookupLocation3("WHEN_GET_DECLARATION_SCOPE", 9);
    public static final LookupLocation3 WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS = new LookupLocation3("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
    public static final LookupLocation3 FOR_ALREADY_TRACKED = new LookupLocation3("FOR_ALREADY_TRACKED", 11);
    public static final LookupLocation3 WHEN_GET_ALL_DESCRIPTORS = new LookupLocation3("WHEN_GET_ALL_DESCRIPTORS", 12);
    public static final LookupLocation3 WHEN_TYPING = new LookupLocation3("WHEN_TYPING", 13);
    public static final LookupLocation3 WHEN_GET_SUPER_MEMBERS = new LookupLocation3("WHEN_GET_SUPER_MEMBERS", 14);
    public static final LookupLocation3 FOR_NON_TRACKED_SCOPE = new LookupLocation3("FOR_NON_TRACKED_SCOPE", 15);
    public static final LookupLocation3 FROM_SYNTHETIC_SCOPE = new LookupLocation3("FROM_SYNTHETIC_SCOPE", 16);
    public static final LookupLocation3 FROM_DESERIALIZATION = new LookupLocation3("FROM_DESERIALIZATION", 17);
    public static final LookupLocation3 FROM_JAVA_LOADER = new LookupLocation3("FROM_JAVA_LOADER", 18);
    public static final LookupLocation3 WHEN_GET_LOCAL_VARIABLE = new LookupLocation3("WHEN_GET_LOCAL_VARIABLE", 19);
    public static final LookupLocation3 WHEN_FIND_BY_FQNAME = new LookupLocation3("WHEN_FIND_BY_FQNAME", 20);
    public static final LookupLocation3 WHEN_GET_COMPANION_OBJECT = new LookupLocation3("WHEN_GET_COMPANION_OBJECT", 21);
    public static final LookupLocation3 FOR_DEFAULT_IMPORTS = new LookupLocation3("FOR_DEFAULT_IMPORTS", 22);

    private static final /* synthetic */ LookupLocation3[] $values() {
        return new LookupLocation3[]{FROM_IDE, FROM_BACKEND, FROM_TEST, FROM_BUILTINS, WHEN_CHECK_DECLARATION_CONFLICTS, WHEN_CHECK_OVERRIDES, FOR_SCRIPT, FROM_REFLECTION, WHEN_RESOLVE_DECLARATION, WHEN_GET_DECLARATION_SCOPE, WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS, FOR_ALREADY_TRACKED, WHEN_GET_ALL_DESCRIPTORS, WHEN_TYPING, WHEN_GET_SUPER_MEMBERS, FOR_NON_TRACKED_SCOPE, FROM_SYNTHETIC_SCOPE, FROM_DESERIALIZATION, FROM_JAVA_LOADER, WHEN_GET_LOCAL_VARIABLE, WHEN_FIND_BY_FQNAME, WHEN_GET_COMPANION_OBJECT, FOR_DEFAULT_IMPORTS};
    }

    @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation
    public LookupLocation2 getLocation() {
        return null;
    }

    private LookupLocation3(String str, int i) {
    }

    static {
        LookupLocation3[] lookupLocation3Arr$values = $values();
        $VALUES = lookupLocation3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(lookupLocation3Arr$values);
    }

    public static LookupLocation3 valueOf(String str) {
        return (LookupLocation3) Enum.valueOf(LookupLocation3.class, str);
    }

    public static LookupLocation3[] values() {
        return (LookupLocation3[]) $VALUES.clone();
    }
}
