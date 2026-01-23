package com.robinhood.scarlet.util.resource;

import android.content.res.ColorStateList;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResourceReferences.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"toColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "Landroid/content/res/ColorStateList;", "toColorStateList", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.scarlet.util.resource.ResourceReferencesKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ResourceReferences5 {
    public static final ResourceReferences4<Integer> toColor(ResourceReferences4<? extends ColorStateList> resourceReferences4) {
        Intrinsics.checkNotNullParameter(resourceReferences4, "<this>");
        if (resourceReferences4 instanceof ThemedResourceReference) {
            return new ThemedResourceReference(ResourceType.COLOR.INSTANCE, ((ThemedResourceReference) resourceReferences4).getResId());
        }
        if (resourceReferences4 instanceof ResourceReferences3) {
            ResourceReferences3 resourceReferences3 = (ResourceReferences3) resourceReferences4;
            if (resourceReferences3 instanceof DirectResourceReference) {
                return new DirectResourceReference(ResourceType.COLOR.INSTANCE, ((DirectResourceReference) resourceReferences4).getResId());
            }
            if (!(resourceReferences3 instanceof ResourceValue)) {
                throw new NoWhenBranchMatchedException();
            }
            ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
            ColorStateList colorStateList = (ColorStateList) ((ResourceValue) resourceReferences4).getValue();
            return new ResourceValue(color, colorStateList != null ? Integer.valueOf(colorStateList.getDefaultColor()) : null);
        }
        if (resourceReferences4 instanceof BoxedResourceReference) {
            BoxedResourceReference resourceReferences = (BoxedResourceReference) resourceReferences4;
            return new BoxedResourceReference(ResourceType.COLOR.INSTANCE, resourceReferences.getAttributeId(), resourceReferences.getStyle(), resourceReferences.getDefStyle());
        }
        if (!(resourceReferences4 instanceof SelectorResource)) {
            throw new NoWhenBranchMatchedException();
        }
        SelectorResource resourceReferences7 = (SelectorResource) resourceReferences4;
        return new SelectorResource(ResourceType.COLOR.INSTANCE, resourceReferences7.getSelector(), toColor(resourceReferences7.getTrueReference()), toColor(resourceReferences7.getOtherwiseReference()));
    }

    public static final ResourceReferences4<ColorStateList> toColorStateList(ResourceReferences4<Integer> resourceReferences4) {
        Intrinsics.checkNotNullParameter(resourceReferences4, "<this>");
        if (!Intrinsics.areEqual(resourceReferences4.getType(), ResourceType.COLOR.INSTANCE)) {
            throw new IllegalArgumentException(("Must be a reference to COLOR: " + resourceReferences4).toString());
        }
        if (resourceReferences4 instanceof ThemedResourceReference) {
            return new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, ((ThemedResourceReference) resourceReferences4).getResId());
        }
        if (resourceReferences4 instanceof ResourceReferences3) {
            ResourceReferences3 resourceReferences3 = (ResourceReferences3) resourceReferences4;
            if (resourceReferences3 instanceof DirectResourceReference) {
                return new DirectResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, ((DirectResourceReference) resourceReferences4).getResId());
            }
            if (!(resourceReferences3 instanceof ResourceValue)) {
                throw new NoWhenBranchMatchedException();
            }
            ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
            Integer num = (Integer) ((ResourceValue) resourceReferences4).getValue();
            return new ResourceValue(color_state_list, num != null ? ColorStateList.valueOf(num.intValue()) : null);
        }
        if (resourceReferences4 instanceof BoxedResourceReference) {
            BoxedResourceReference resourceReferences = (BoxedResourceReference) resourceReferences4;
            return new BoxedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, resourceReferences.getAttributeId(), resourceReferences.getStyle(), resourceReferences.getDefStyle());
        }
        if (!(resourceReferences4 instanceof SelectorResource)) {
            throw new NoWhenBranchMatchedException();
        }
        SelectorResource resourceReferences7 = (SelectorResource) resourceReferences4;
        return new SelectorResource(ResourceType.COLOR_STATE_LIST.INSTANCE, resourceReferences7.getSelector(), toColorStateList(resourceReferences7.getTrueReference()), toColorStateList(resourceReferences7.getOtherwiseReference()));
    }
}
