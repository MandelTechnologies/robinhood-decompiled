package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy, reason: use source file name */
/* loaded from: classes21.dex */
public final class DescriptorRenderer6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DescriptorRenderer6[] $VALUES;
    public static final DescriptorRenderer6 RENDER_OVERRIDE = new DescriptorRenderer6("RENDER_OVERRIDE", 0);
    public static final DescriptorRenderer6 RENDER_OPEN = new DescriptorRenderer6("RENDER_OPEN", 1);
    public static final DescriptorRenderer6 RENDER_OPEN_OVERRIDE = new DescriptorRenderer6("RENDER_OPEN_OVERRIDE", 2);

    private static final /* synthetic */ DescriptorRenderer6[] $values() {
        return new DescriptorRenderer6[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    private DescriptorRenderer6(String str, int i) {
    }

    static {
        DescriptorRenderer6[] descriptorRenderer6Arr$values = $values();
        $VALUES = descriptorRenderer6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(descriptorRenderer6Arr$values);
    }

    public static DescriptorRenderer6 valueOf(String str) {
        return (DescriptorRenderer6) Enum.valueOf(DescriptorRenderer6.class, str);
    }

    public static DescriptorRenderer6[] values() {
        return (DescriptorRenderer6[]) $VALUES.clone();
    }
}
