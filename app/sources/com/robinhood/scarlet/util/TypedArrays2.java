package com.robinhood.scarlet.util;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.util.resource.ResourceReferences3;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.utils.extensions.TypedValues2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TypedArrays.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a&\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007*\u00020\u00022\n\u0010\b\u001a\u00060\tR\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a&\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f*\u00020\u00022\n\u0010\b\u001a\u00060\tR\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"getValue", "Landroid/util/TypedValue;", "Landroid/content/res/TypedArray;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "typedValue", "getReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getResource", "Lcom/robinhood/scarlet/util/resource/Resource;", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.scarlet.util.TypedArraysKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class TypedArrays2 {
    private static final TypedValue typedValue = new TypedValue();

    public static final TypedValue getValue(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        TypedValue typedValue2 = new TypedValue();
        if (typedArray.getValue(i, typedValue2)) {
            return typedValue2;
        }
        return null;
    }

    public static final ResourceReferences4<?> getReference(TypedArray typedArray, Resources.Theme theme, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (!typedArray.hasValueOrEmpty(i)) {
            return null;
        }
        if (!typedArray.hasValue(i)) {
            return ResourceValue.INSTANCE.getEMPTY();
        }
        TypedValue typedValue2 = typedValue;
        TypedValues2.setEmpty(typedValue2);
        if (!typedArray.getValue(i, typedValue2)) {
            return ResourceValue.INSTANCE.getEMPTY();
        }
        return ResourceReferences4.INSTANCE.from$lib_scarlet_externalRelease(theme, typedValue2);
    }

    public static final ResourceReferences3<?> getResource(TypedArray typedArray, Resources.Theme theme, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        ResourceReferences4<?> reference = getReference(typedArray, theme, i);
        if (reference != null) {
            return reference.resolveResource(theme);
        }
        return null;
    }
}
