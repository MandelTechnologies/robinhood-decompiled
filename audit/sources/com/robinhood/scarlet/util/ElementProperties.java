package com.robinhood.scarlet.util;

import android.content.res.Resources;
import android.util.SparseArray;
import com.robinhood.scarlet.res.BlankResourceArray;
import com.robinhood.scarlet.res.CompositeResourceArray;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.res.ResourceArray2;
import com.robinhood.scarlet.res.RuntimeResourceArray;
import com.robinhood.scarlet.transition.ThemeTransition;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ElementProperties.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0001\u0010\"\u001a\u00020#J*\u0010$\u001a\u00020%\"\b\b\u0000\u0010&*\u00020\u00012\b\b\u0001\u0010\"\u001a\u00020#2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u0002H&\u0018\u00010\u0006J\"\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\b\u0001\u0010,\u001a\u00020-2\b\b\u0003\u0010.\u001a\u00020-R\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00060\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00060"}, m3636d2 = {"Lcom/robinhood/scarlet/util/ElementProperties;", "", "<init>", "()V", "inflatedAttributes", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getInflatedAttributes$lib_scarlet_externalRelease", "()Landroid/util/SparseArray;", "isExcluded", "", "isExcluded$lib_scarlet_externalRelease", "()Z", "setExcluded$lib_scarlet_externalRelease", "(Z)V", "themeTransition", "Lcom/robinhood/scarlet/transition/ThemeTransition;", "getThemeTransition$lib_scarlet_externalRelease", "()Lcom/robinhood/scarlet/transition/ThemeTransition;", "setThemeTransition$lib_scarlet_externalRelease", "(Lcom/robinhood/scarlet/transition/ThemeTransition;)V", "defStyle", "", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getDefStyle$lib_scarlet_externalRelease", "()Ljava/util/List;", "setDefStyle$lib_scarlet_externalRelease", "(Ljava/util/List;)V", "styleReference", "getStyleReference$lib_scarlet_externalRelease", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "setStyleReference$lib_scarlet_externalRelease", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "getAttribute", "attribute", "", "overrideAttribute", "", "T", "reference", "obtainStyledResources", "Lcom/robinhood/scarlet/res/ResourceArray;", "themeNode", "Lcom/robinhood/scarlet/util/ThemeNode;", "attributes", "", "mixins", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ElementProperties {
    private boolean isExcluded;
    private ResourceReferences4<StyleResource> styleReference;
    private ThemeTransition<Object> themeTransition;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ElementProperties NONE = new ElementProperties();
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private final SparseArray<ResourceReferences4<?>> inflatedAttributes = new SparseArray<>();
    private List<? extends ResourceReferences4<StyleResource>> defStyle = CollectionsKt.emptyList();

    public final SparseArray<ResourceReferences4<?>> getInflatedAttributes$lib_scarlet_externalRelease() {
        return this.inflatedAttributes;
    }

    /* renamed from: isExcluded$lib_scarlet_externalRelease, reason: from getter */
    public final boolean getIsExcluded() {
        return this.isExcluded;
    }

    public final void setExcluded$lib_scarlet_externalRelease(boolean z) {
        this.isExcluded = z;
    }

    public final ThemeTransition<Object> getThemeTransition$lib_scarlet_externalRelease() {
        return this.themeTransition;
    }

    public final void setThemeTransition$lib_scarlet_externalRelease(ThemeTransition<Object> themeTransition) {
        this.themeTransition = themeTransition;
    }

    public final List<ResourceReferences4<StyleResource>> getDefStyle$lib_scarlet_externalRelease() {
        return this.defStyle;
    }

    public final void setDefStyle$lib_scarlet_externalRelease(List<? extends ResourceReferences4<StyleResource>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.defStyle = list;
    }

    public final ResourceReferences4<StyleResource> getStyleReference$lib_scarlet_externalRelease() {
        return this.styleReference;
    }

    public final void setStyleReference$lib_scarlet_externalRelease(ResourceReferences4<StyleResource> resourceReferences4) {
        this.styleReference = resourceReferences4;
    }

    public final ResourceReferences4<?> getAttribute(int attribute) {
        return this.inflatedAttributes.get(attribute);
    }

    public final <T> void overrideAttribute(int attribute, ResourceReferences4<? extends T> reference) {
        if (reference == null) {
            this.inflatedAttributes.remove(attribute);
        } else {
            this.inflatedAttributes.put(attribute, reference);
        }
    }

    public static /* synthetic */ ResourceArray obtainStyledResources$default(ElementProperties elementProperties, ThemeNode themeNode, int[] iArr, int[] iArr2, int i, Object obj) {
        if ((i & 4) != 0) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        return elementProperties.obtainStyledResources(themeNode, iArr, iArr2);
    }

    public final ResourceArray obtainStyledResources(ThemeNode themeNode, int[] attributes, int[] mixins) throws Resources.NotFoundException {
        int[] iArr;
        int i;
        ResourceArray resourceArrayObtainStyledResources$default;
        ThemeNode themeNode2 = themeNode;
        int[] attributes2 = attributes;
        Intrinsics.checkNotNullParameter(themeNode2, "themeNode");
        Intrinsics.checkNotNullParameter(attributes2, "attributes");
        Intrinsics.checkNotNullParameter(mixins, "mixins");
        Resources.Theme theme$lib_scarlet_externalRelease = themeNode2.getTheme$lib_scarlet_externalRelease();
        RuntimeResourceArray runtimeResourceArray = new RuntimeResourceArray(theme$lib_scarlet_externalRelease, attributes2, this.inflatedAttributes);
        ResourceArray resourceArrayObtainStyledResources = themeNode2.obtainStyledResources(attributes2, this.styleReference, this.defStyle);
        if (resourceArrayObtainStyledResources instanceof BlankResourceArray) {
            resourceArrayObtainStyledResources = null;
        }
        ResourceArray resourceArrayPlus = ResourceArray2.plus(runtimeResourceArray, resourceArrayObtainStyledResources);
        if (mixins.length == 0) {
            return resourceArrayPlus;
        }
        ArrayList arrayList = new ArrayList(mixins.length + 2);
        arrayList.add(runtimeResourceArray);
        if (resourceArrayObtainStyledResources != null) {
            arrayList.add(resourceArrayObtainStyledResources);
        }
        Resources resources = theme$lib_scarlet_externalRelease.getResources();
        int length = mixins.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2;
            int i4 = mixins[i3];
            int iBinarySearch$default = ArraysKt.binarySearch$default(attributes2, i4, 0, 0, 6, (Object) null);
            if (iBinarySearch$default < 0) {
                String resourceName = resources.getResourceName(i4);
                String strJoinToString$default = ArraysKt.joinToString$default(attributes, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new ElementProperties2(resources), 31, (Object) null);
                throw new IllegalArgumentException(("Attribute " + Integer.toHexString(i4) + " (" + resourceName + ") not in attributes: " + strJoinToString$default).toString());
            }
            Integer resourceId = resourceArrayPlus.getResourceId(iBinarySearch$default);
            if (resourceId != null) {
                int iIntValue = resourceId.intValue();
                i = i4;
                iArr = attributes;
                resourceArrayObtainStyledResources$default = ThemeNode.obtainStyledResources$default(themeNode2, iArr, iIntValue, null, 4, null);
            } else {
                iArr = attributes;
                i = i4;
                resourceArrayObtainStyledResources$default = null;
            }
            ResourceArray resourceArray = !(resourceArrayObtainStyledResources$default instanceof BlankResourceArray) ? resourceArrayObtainStyledResources$default : null;
            ResourceArray resourceArrayObtainStyledResources2 = ResourceArray2.obtainStyledResources(theme$lib_scarlet_externalRelease, iArr, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, i), CollectionsKt.emptyList());
            try {
                Integer resourceId2 = resourceArrayObtainStyledResources2.getResourceId(iBinarySearch$default);
                ResourceArray resourceArrayObtainStyledResources$default2 = resourceId2 != null ? ThemeNode.obtainStyledResources$default(themeNode, iArr, resourceId2.intValue(), null, 4, null) : null;
                resourceArrayObtainStyledResources2.recycle();
                ResourceArray resourceArrayOf$lib_scarlet_externalRelease = CompositeResourceArray.INSTANCE.of$lib_scarlet_externalRelease(CollectionsKt.listOfNotNull((Object[]) new ResourceArray[]{resourceArray, resourceArrayObtainStyledResources$default2}));
                if (resourceArrayOf$lib_scarlet_externalRelease != null) {
                    arrayList.add(resourceArrayOf$lib_scarlet_externalRelease);
                }
                i2 = i3 + 1;
                themeNode2 = themeNode;
                attributes2 = attributes;
            } catch (Throwable th) {
                resourceArrayObtainStyledResources2.recycle();
                throw th;
            }
        }
        return ResourceArray.INSTANCE.compose(theme$lib_scarlet_externalRelease, attributes2.length, arrayList);
    }

    /* compiled from: ElementProperties.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/scarlet/util/ElementProperties$Companion;", "", "<init>", "()V", "NONE", "Lcom/robinhood/scarlet/util/ElementProperties;", "getNONE$lib_scarlet_externalRelease", "()Lcom/robinhood/scarlet/util/ElementProperties;", "EMPTY_INT_ARRAY", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ElementProperties getNONE$lib_scarlet_externalRelease() {
            return ElementProperties.NONE;
        }
    }
}
