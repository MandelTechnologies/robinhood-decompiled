package kotlin.reflect.jvm.internal.impl.renderer;

import com.robinhood.android.futures.charts.DisplaySpans;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy, reason: use source file name */
/* loaded from: classes21.dex */
public final class DescriptorRenderer7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DescriptorRenderer7[] $VALUES;
    public static final DescriptorRenderer7 ALL = new DescriptorRenderer7(DisplaySpans.ALL, 0);
    public static final DescriptorRenderer7 ONLY_NON_SYNTHESIZED = new DescriptorRenderer7("ONLY_NON_SYNTHESIZED", 1);
    public static final DescriptorRenderer7 NONE = new DescriptorRenderer7("NONE", 2);

    private static final /* synthetic */ DescriptorRenderer7[] $values() {
        return new DescriptorRenderer7[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    private DescriptorRenderer7(String str, int i) {
    }

    static {
        DescriptorRenderer7[] descriptorRenderer7Arr$values = $values();
        $VALUES = descriptorRenderer7Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(descriptorRenderer7Arr$values);
    }

    public static DescriptorRenderer7 valueOf(String str) {
        return (DescriptorRenderer7) Enum.valueOf(DescriptorRenderer7.class, str);
    }

    public static DescriptorRenderer7[] values() {
        return (DescriptorRenderer7[]) $VALUES.clone();
    }
}
