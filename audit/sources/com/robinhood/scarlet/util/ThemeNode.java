package com.robinhood.scarlet.util;

import android.content.res.Resources;
import android.util.TypedValue;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.res.ResourceArray2;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThemeNode.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002()B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002J\u0011\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J\"\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0011J2\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001cJ.\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001d\u001a\u00020\u00132\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001cJX\u0010\u001e\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001d\u001a\u00020\u00132\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001c2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002H\u001f0!¢\u0006\u0002\b\"H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010#J#\u0010$\u001a\u0002H%\"\b\b\u0000\u0010%*\u00020\u00012\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H%0\u0006¢\u0006\u0002\u0010'R \u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00060\nR\u00020\u000bX \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\b*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, m3636d2 = {"Lcom/robinhood/scarlet/util/ThemeNode;", "", "<init>", "()V", "children", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "Lcom/robinhood/scarlet/util/ThemeNode$Child;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getTheme$lib_scarlet_externalRelease", "()Landroid/content/res/Resources$Theme;", "get", ResourceTypes.STYLE, "resolveAttribute", "", "resId", "", "outValue", "Landroid/util/TypedValue;", "resolveRefs", "obtainStyledResources", "Lcom/robinhood/scarlet/res/ResourceArray;", "attributes", "", "defStyle", "", "styleResId", "withStyledResources", "R", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "([IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getResourceOrThrow", "T", "reference", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;)Ljava/lang/Object;", "Root", "Child", "Lcom/robinhood/scarlet/util/ThemeNode$Root;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public abstract class ThemeNode {
    public static final int $stable = 8;
    private final Map<ResourceReferences4<StyleResource>, Child> children;

    public /* synthetic */ ThemeNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Resources.Theme getTheme$lib_scarlet_externalRelease();

    private ThemeNode() {
        this.children = new LinkedHashMap();
    }

    public final Child get(ResourceReferences4<StyleResource> style) {
        Intrinsics.checkNotNullParameter(style, "style");
        Map<ResourceReferences4<StyleResource>, Child> map = this.children;
        Child child = map.get(style);
        if (child == null) {
            child = new Child(this, style);
            map.put(style, child);
        }
        return child;
    }

    public final Child get(StyleResource style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return get(new DirectResourceReference(ResourceType.STYLE.INSTANCE, style.getResId()));
    }

    public static /* synthetic */ boolean resolveAttribute$default(ThemeNode themeNode, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveAttribute");
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return themeNode.resolveAttribute(i, typedValue, z);
    }

    public final boolean resolveAttribute(int resId, TypedValue outValue, boolean resolveRefs) {
        Intrinsics.checkNotNullParameter(outValue, "outValue");
        return getTheme$lib_scarlet_externalRelease().resolveAttribute(resId, outValue, resolveRefs);
    }

    public final ResourceArray obtainStyledResources(int[] attributes, ResourceReferences4<StyleResource> style, List<? extends ResourceReferences4<StyleResource>> defStyle) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(defStyle, "defStyle");
        return ResourceArray2.obtainStyledResources(getTheme$lib_scarlet_externalRelease(), attributes, style, defStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceArray obtainStyledResources$default(ThemeNode themeNode, int[] iArr, int i, List list, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: obtainStyledResources");
        }
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return themeNode.obtainStyledResources(iArr, i, (List<? extends ResourceReferences4<StyleResource>>) list);
    }

    public final ResourceArray obtainStyledResources(int[] attributes, int styleResId, List<? extends ResourceReferences4<StyleResource>> defStyle) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(defStyle, "defStyle");
        return obtainStyledResources(attributes, new DirectResourceReference(ResourceType.STYLE.INSTANCE, styleResId), defStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object withStyledResources$default(ThemeNode themeNode, int[] attributes, int i, List defStyle, Function1 block, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                defStyle = CollectionsKt.emptyList();
            }
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(defStyle, "defStyle");
            Intrinsics.checkNotNullParameter(block, "block");
            ResourceArray resourceArrayObtainStyledResources = themeNode.obtainStyledResources(attributes, i, (List<? extends ResourceReferences4<StyleResource>>) defStyle);
            try {
                return block.invoke(resourceArrayObtainStyledResources);
            } finally {
                InlineMarker.finallyStart(1);
                resourceArrayObtainStyledResources.recycle();
                InlineMarker.finallyEnd(1);
            }
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withStyledResources");
    }

    public final <R> R withStyledResources(int[] attributes, int styleResId, List<? extends ResourceReferences4<StyleResource>> defStyle, Function1<? super ResourceArray, ? extends R> block) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(defStyle, "defStyle");
        Intrinsics.checkNotNullParameter(block, "block");
        ResourceArray resourceArrayObtainStyledResources = obtainStyledResources(attributes, styleResId, defStyle);
        try {
            return block.invoke(resourceArrayObtainStyledResources);
        } finally {
            InlineMarker.finallyStart(1);
            resourceArrayObtainStyledResources.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T getResourceOrThrow(ResourceReferences4<? extends T> reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        return reference.resolveOrThrow(getTheme$lib_scarlet_externalRelease());
    }

    /* compiled from: ThemeNode.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00060\u0003R\u00020\u0004HÀ\u0003¢\u0006\u0002\b\nJ\u0017\u0010\u000b\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003R\u00020\u0004HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/scarlet/util/ThemeNode$Root;", "Lcom/robinhood/scarlet/util/ThemeNode;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources$Theme;)V", "getTheme$lib_scarlet_externalRelease", "()Landroid/content/res/Resources$Theme;", "component1", "component1$lib_scarlet_externalRelease", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Root extends ThemeNode {
        public static final int $stable = 8;
        private final Resources.Theme theme;

        public static /* synthetic */ Root copy$default(Root root, Resources.Theme theme, int i, Object obj) {
            if ((i & 1) != 0) {
                theme = root.theme;
            }
            return root.copy(theme);
        }

        /* renamed from: component1$lib_scarlet_externalRelease, reason: from getter */
        public final Resources.Theme getTheme() {
            return this.theme;
        }

        public final Root copy(Resources.Theme theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new Root(theme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Root) && Intrinsics.areEqual(this.theme, ((Root) other).theme);
        }

        public int hashCode() {
            return this.theme.hashCode();
        }

        public String toString() {
            return "Root(theme=" + this.theme + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Root(Resources.Theme theme) {
            super(null);
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.theme = theme;
        }

        @Override // com.robinhood.scarlet.util.ThemeNode
        public Resources.Theme getTheme$lib_scarlet_externalRelease() {
            return this.theme;
        }
    }

    /* compiled from: ThemeNode.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0001HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\u00060\rR\u00020\u000e8PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/scarlet/util/ThemeNode$Child;", "Lcom/robinhood/scarlet/util/ThemeNode;", "parent", ResourceTypes.STYLE, "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "<init>", "(Lcom/robinhood/scarlet/util/ThemeNode;Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "getParent", "()Lcom/robinhood/scarlet/util/ThemeNode;", "getStyle", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getTheme$lib_scarlet_externalRelease", "()Landroid/content/res/Resources$Theme;", "theme$delegate", "Lkotlin/Lazy;", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Child extends ThemeNode {
        public static final int $stable = 8;
        private final ThemeNode parent;
        private final ResourceReferences4<StyleResource> style;

        /* renamed from: theme$delegate, reason: from kotlin metadata */
        private final Lazy theme;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Child copy$default(Child child, ThemeNode themeNode, ResourceReferences4 resourceReferences4, int i, Object obj) {
            if ((i & 1) != 0) {
                themeNode = child.parent;
            }
            if ((i & 2) != 0) {
                resourceReferences4 = child.style;
            }
            return child.copy(themeNode, resourceReferences4);
        }

        /* renamed from: component1, reason: from getter */
        public final ThemeNode getParent() {
            return this.parent;
        }

        public final ResourceReferences4<StyleResource> component2() {
            return this.style;
        }

        public final Child copy(ThemeNode parent, ResourceReferences4<StyleResource> style) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(style, "style");
            return new Child(parent, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Child)) {
                return false;
            }
            Child child = (Child) other;
            return Intrinsics.areEqual(this.parent, child.parent) && Intrinsics.areEqual(this.style, child.style);
        }

        public int hashCode() {
            return (this.parent.hashCode() * 31) + this.style.hashCode();
        }

        public final ThemeNode getParent() {
            return this.parent;
        }

        public final ResourceReferences4<StyleResource> getStyle() {
            return this.style;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Child(ThemeNode parent, ResourceReferences4<StyleResource> style) {
            super(null);
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(style, "style");
            this.parent = parent;
            this.style = style;
            this.theme = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.scarlet.util.ThemeNode$Child$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThemeNode.Child.theme_delegate$lambda$0(this.f$0);
                }
            });
        }

        @Override // com.robinhood.scarlet.util.ThemeNode
        public Resources.Theme getTheme$lib_scarlet_externalRelease() {
            return (Resources.Theme) this.theme.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Resources.Theme theme_delegate$lambda$0(Child child) {
            return Themes3.deriveWith(child.parent.getTheme$lib_scarlet_externalRelease(), child.style);
        }

        public String toString() throws Resources.NotFoundException {
            String resourceName;
            ResourceReferences4<StyleResource> resourceReferences4 = this.style;
            Resources resources = getTheme$lib_scarlet_externalRelease().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String strDescribe = resourceReferences4.describe(resources);
            StyleResource styleResourceResolve = this.style.resolve(this.parent.getTheme$lib_scarlet_externalRelease());
            if (styleResourceResolve != null) {
                resourceName = getTheme$lib_scarlet_externalRelease().getResources().getResourceName(styleResourceResolve.getResId());
            } else {
                resourceName = null;
            }
            return this.parent + "\nChild(style=[" + strDescribe + " -> " + resourceName + "])";
        }
    }
}
