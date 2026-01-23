package com.robinhood.android.designsystem.extensions;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypedArrays.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"getDrawableCompat", "Landroid/graphics/drawable/Drawable;", "Landroid/content/res/TypedArray;", "context", "Landroid/content/Context;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "lib-design-system_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.designsystem.extensions.TypedArraysKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class TypedArrays {
    public static final Drawable getDrawableCompat(TypedArray typedArray, Context context, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            return AppCompatResources.getDrawable(context, resourceId);
        }
        return null;
    }
}
