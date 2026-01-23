package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy, reason: use source file name */
/* loaded from: classes21.dex */
public final class DescriptorRenderer8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DescriptorRenderer8[] $VALUES;
    public static final DescriptorRenderer8 PRETTY = new DescriptorRenderer8("PRETTY", 0);
    public static final DescriptorRenderer8 DEBUG = new DescriptorRenderer8("DEBUG", 1);
    public static final DescriptorRenderer8 NONE = new DescriptorRenderer8("NONE", 2);

    private static final /* synthetic */ DescriptorRenderer8[] $values() {
        return new DescriptorRenderer8[]{PRETTY, DEBUG, NONE};
    }

    private DescriptorRenderer8(String str, int i) {
    }

    static {
        DescriptorRenderer8[] descriptorRenderer8Arr$values = $values();
        $VALUES = descriptorRenderer8Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(descriptorRenderer8Arr$values);
    }

    public static DescriptorRenderer8 valueOf(String str) {
        return (DescriptorRenderer8) Enum.valueOf(DescriptorRenderer8.class, str);
    }

    public static DescriptorRenderer8[] values() {
        return (DescriptorRenderer8[]) $VALUES.clone();
    }
}
