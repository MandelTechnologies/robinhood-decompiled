package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat, reason: use source file name */
/* loaded from: classes21.dex */
public abstract class DescriptorRenderer9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DescriptorRenderer9[] $VALUES;
    public static final DescriptorRenderer9 PLAIN = new DescriptorRenderer9("PLAIN", 0) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
        @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer9
        public String escape(String string2) {
            Intrinsics.checkNotNullParameter(string2, "string");
            return string2;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    };
    public static final DescriptorRenderer9 HTML = new DescriptorRenderer9("HTML", 1) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer9
        public String escape(String string2) {
            Intrinsics.checkNotNullParameter(string2, "string");
            return StringsKt.replace$default(StringsKt.replace$default(string2, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    };

    private static final /* synthetic */ DescriptorRenderer9[] $values() {
        return new DescriptorRenderer9[]{PLAIN, HTML};
    }

    public /* synthetic */ DescriptorRenderer9(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public abstract String escape(String str);

    private DescriptorRenderer9(String str, int i) {
    }

    static {
        DescriptorRenderer9[] descriptorRenderer9Arr$values = $values();
        $VALUES = descriptorRenderer9Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(descriptorRenderer9Arr$values);
    }

    public static DescriptorRenderer9 valueOf(String str) {
        return (DescriptorRenderer9) Enum.valueOf(DescriptorRenderer9.class, str);
    }

    public static DescriptorRenderer9[] values() {
        return (DescriptorRenderer9[]) $VALUES.clone();
    }
}
