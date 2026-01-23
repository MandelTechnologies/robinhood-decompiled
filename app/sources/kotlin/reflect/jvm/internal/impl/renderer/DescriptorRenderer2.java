package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy, reason: use source file name */
/* loaded from: classes21.dex */
public final class DescriptorRenderer2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DescriptorRenderer2[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final DescriptorRenderer2 NO_ARGUMENTS = new DescriptorRenderer2("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final DescriptorRenderer2 UNLESS_EMPTY = new DescriptorRenderer2("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final DescriptorRenderer2 ALWAYS_PARENTHESIZED = new DescriptorRenderer2("ALWAYS_PARENTHESIZED", 2, true, true);

    private static final /* synthetic */ DescriptorRenderer2[] $values() {
        return new DescriptorRenderer2[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    private DescriptorRenderer2(String str, int i, boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }

    /* synthetic */ DescriptorRenderer2(String str, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2);
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    static {
        DescriptorRenderer2[] descriptorRenderer2Arr$values = $values();
        $VALUES = descriptorRenderer2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(descriptorRenderer2Arr$values);
    }

    public static DescriptorRenderer2 valueOf(String str) {
        return (DescriptorRenderer2) Enum.valueOf(DescriptorRenderer2.class, str);
    }

    public static DescriptorRenderer2[] values() {
        return (DescriptorRenderer2[]) $VALUES.clone();
    }
}
