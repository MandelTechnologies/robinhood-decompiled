package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier, reason: use source file name */
/* loaded from: classes21.dex */
public final class DescriptorRenderer3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DescriptorRenderer3[] $VALUES;

    @JvmField
    public static final Set<DescriptorRenderer3> ALL;

    @JvmField
    public static final Set<DescriptorRenderer3> ALL_EXCEPT_ANNOTATIONS;
    public static final Companion Companion;
    private final boolean includeByDefault;
    public static final DescriptorRenderer3 VISIBILITY = new DescriptorRenderer3("VISIBILITY", 0, true);
    public static final DescriptorRenderer3 MODALITY = new DescriptorRenderer3("MODALITY", 1, true);
    public static final DescriptorRenderer3 OVERRIDE = new DescriptorRenderer3("OVERRIDE", 2, true);
    public static final DescriptorRenderer3 ANNOTATIONS = new DescriptorRenderer3("ANNOTATIONS", 3, false);
    public static final DescriptorRenderer3 INNER = new DescriptorRenderer3("INNER", 4, true);
    public static final DescriptorRenderer3 MEMBER_KIND = new DescriptorRenderer3("MEMBER_KIND", 5, true);
    public static final DescriptorRenderer3 DATA = new DescriptorRenderer3("DATA", 6, true);
    public static final DescriptorRenderer3 INLINE = new DescriptorRenderer3("INLINE", 7, true);
    public static final DescriptorRenderer3 EXPECT = new DescriptorRenderer3("EXPECT", 8, true);
    public static final DescriptorRenderer3 ACTUAL = new DescriptorRenderer3("ACTUAL", 9, true);
    public static final DescriptorRenderer3 CONST = new DescriptorRenderer3("CONST", 10, true);
    public static final DescriptorRenderer3 LATEINIT = new DescriptorRenderer3("LATEINIT", 11, true);
    public static final DescriptorRenderer3 FUN = new DescriptorRenderer3("FUN", 12, true);
    public static final DescriptorRenderer3 VALUE = new DescriptorRenderer3("VALUE", 13, true);

    private static final /* synthetic */ DescriptorRenderer3[] $values() {
        return new DescriptorRenderer3[]{VISIBILITY, MODALITY, OVERRIDE, ANNOTATIONS, INNER, MEMBER_KIND, DATA, INLINE, EXPECT, ACTUAL, CONST, LATEINIT, FUN, VALUE};
    }

    private DescriptorRenderer3(String str, int i, boolean z) {
        this.includeByDefault = z;
    }

    static {
        DescriptorRenderer3[] descriptorRenderer3Arr$values = $values();
        $VALUES = descriptorRenderer3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(descriptorRenderer3Arr$values);
        Companion = new Companion(null);
        DescriptorRenderer3[] descriptorRenderer3ArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRenderer3 descriptorRenderer3 : descriptorRenderer3ArrValues) {
            if (descriptorRenderer3.includeByDefault) {
                arrayList.add(descriptorRenderer3);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = CollectionsKt.toSet(arrayList);
        ALL = ArraysKt.toSet(values());
    }

    /* compiled from: DescriptorRenderer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static DescriptorRenderer3 valueOf(String str) {
        return (DescriptorRenderer3) Enum.valueOf(DescriptorRenderer3.class, str);
    }

    public static DescriptorRenderer3[] values() {
        return (DescriptorRenderer3[]) $VALUES.clone();
    }
}
