package com.robinhood.scarlet.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.android.graphics.Gradient3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResourceArray.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0086\u0002\u001a/\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00040\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a<\u0010\b\u001a\u00020\u0001*\u00060\tR\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011H\u0000\u001ah\u0010\u0012\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\u00060\tR\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00112\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00040\u0006¢\u0006\u0002\b\u0013H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\"\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00012\b\b\u0001\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\tR\u00020\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, m3636d2 = {"plus", "Lcom/robinhood/scarlet/res/ResourceArray;", "other", "use", "R", "block", "Lkotlin/Function1;", "(Lcom/robinhood/scarlet/res/ResourceArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "obtainStyledResources", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributes", "", ResourceTypes.STYLE, "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "defStyle", "", "withStyledResources", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/res/Resources$Theme;[ILcom/robinhood/scarlet/util/resource/ResourceReference;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getGradient", "Lcom/robinhood/android/graphics/Gradient;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "theme", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.scarlet.res.ResourceArrayKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ResourceArray2 {
    public static final ResourceArray plus(ResourceArray resourceArray, ResourceArray resourceArray2) {
        Intrinsics.checkNotNullParameter(resourceArray, "<this>");
        return resourceArray2 == null ? resourceArray : ResourceArray.INSTANCE.compose(resourceArray.getTheme(), resourceArray.getLength(), CollectionsKt.listOf((Object[]) new ResourceArray[]{resourceArray, resourceArray2}));
    }

    public static final <R> R use(ResourceArray resourceArray, Function1<? super ResourceArray, ? extends R> block) {
        Intrinsics.checkNotNullParameter(resourceArray, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(resourceArray);
        } finally {
            InlineMarker.finallyStart(1);
            resourceArray.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final ResourceArray obtainStyledResources(Resources.Theme theme, int[] attributes, ResourceReferences4<StyleResource> resourceReferences4, List<? extends ResourceReferences4<StyleResource>> defStyle) {
        StyleResource styleResourceResolve;
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(defStyle, "defStyle");
        ArrayList arrayList = new ArrayList(3);
        if (resourceReferences4 != null && (styleResourceResolve = resourceReferences4.resolve(theme)) != null) {
            int resId = styleResourceResolve.getResId();
            ResourceArray.Companion companion = ResourceArray.INSTANCE;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(resId, attributes);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            arrayList.add(companion.from(theme, typedArrayObtainStyledAttributes));
        }
        Iterator<? extends ResourceReferences4<StyleResource>> it = defStyle.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            StyleResource styleResourceResolve2 = it.next().resolve(theme);
            if (styleResourceResolve2 != null) {
                ResourceArray.Companion companion2 = ResourceArray.INSTANCE;
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(styleResourceResolve2.getResId(), attributes);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
                arrayList.add(companion2.from(theme, typedArrayObtainStyledAttributes2));
                break;
            }
        }
        ResourceArray.Companion companion3 = ResourceArray.INSTANCE;
        TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(null, attributes, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes3, "obtainStyledAttributes(...)");
        arrayList.add(companion3.from(theme, typedArrayObtainStyledAttributes3));
        return companion3.compose(theme, attributes.length, arrayList);
    }

    public static /* synthetic */ Object withStyledResources$default(Resources.Theme theme, int[] attributes, ResourceReferences4 resourceReferences4, List defStyle, Function1 block, int i, Object obj) {
        if ((i & 2) != 0) {
            resourceReferences4 = null;
        }
        if ((i & 4) != 0) {
            defStyle = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(defStyle, "defStyle");
        Intrinsics.checkNotNullParameter(block, "block");
        ResourceArray resourceArrayObtainStyledResources = obtainStyledResources(theme, attributes, resourceReferences4, defStyle);
        try {
            return block.invoke(resourceArrayObtainStyledResources);
        } finally {
            InlineMarker.finallyStart(1);
            resourceArrayObtainStyledResources.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withStyledResources(Resources.Theme theme, int[] attributes, ResourceReferences4<StyleResource> resourceReferences4, List<? extends ResourceReferences4<StyleResource>> defStyle, Function1<? super ResourceArray, ? extends R> block) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(defStyle, "defStyle");
        Intrinsics.checkNotNullParameter(block, "block");
        ResourceArray resourceArrayObtainStyledResources = obtainStyledResources(theme, attributes, resourceReferences4, defStyle);
        try {
            return block.invoke(resourceArrayObtainStyledResources);
        } finally {
            InlineMarker.finallyStart(1);
            resourceArrayObtainStyledResources.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final Gradient getGradient(ResourceArray resourceArray, int i, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(resourceArray, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Integer color = resourceArray.getColor(i);
        if (color != null) {
            return Gradient.INSTANCE.m2057of(color.intValue());
        }
        Integer resourceId = resourceArray.getResourceId(i);
        if (resourceId == null) {
            return null;
        }
        int iIntValue = resourceId.intValue();
        Resources resources = theme.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return Gradient3.getGradient(resources, iIntValue, theme);
    }
}
