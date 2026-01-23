package com.robinhood.android.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SizeF;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.Themes4;
import com.robinhood.utils.extensions.TypedArrays3;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensions;
import kotlin.text.HexFormat;

/* compiled from: Gradient.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006R\u00020\u0007\u001a.\u0010\b\u001a\u00020\t*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010\b\u001a\u00020\t*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006R\u00020\u0007H\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00060\u0006R\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0004¨\u0006\u0016"}, m3636d2 = {"getGradient", "Lcom/robinhood/android/graphics/Gradient;", "Landroid/content/res/TypedArray;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "setTo", "", "Landroid/graphics/Paint;", "gradient", "width", "", "height", "tileMode", "Landroid/graphics/Shader$TileMode;", "dimensions", "Landroid/util/SizeF;", "resolveGradient", "Landroid/content/Context;", "resId", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.graphics.GradientKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Gradient3 {
    public static final Gradient getGradient(TypedArray typedArray, int i, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Integer colorOrNull = TypedArrays3.getColorOrNull(typedArray, i);
        if (colorOrNull != null) {
            return Gradient.INSTANCE.m2057of(colorOrNull.intValue());
        }
        Integer resourceIdOrNull = TypedArrays3.getResourceIdOrNull(typedArray, i);
        if (resourceIdOrNull == null) {
            return null;
        }
        int iIntValue = resourceIdOrNull.intValue();
        Resources resources = typedArray.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return getGradient(resources, iIntValue, theme);
    }

    public static /* synthetic */ void setTo$default(Paint paint, Gradient gradient, float f, float f2, Shader.TileMode tileMode, int i, Object obj) {
        if ((i & 8) != 0) {
            tileMode = Shader.TileMode.REPEAT;
        }
        setTo(paint, gradient, f, f2, tileMode);
    }

    public static final void setTo(Paint paint, Gradient gradient, float f, float f2, Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        Integer numValueOf = gradient != null ? Integer.valueOf(gradient.getSize()) : null;
        if (numValueOf == null || numValueOf.intValue() == 0) {
            paint.setColor(0);
            paint.setShader(null);
        } else if (numValueOf.intValue() == 1) {
            paint.setColor(ArraysKt.single(gradient.getColors()));
            paint.setShader(null);
        } else {
            paint.setColor(-1);
            paint.setShader(new LinearGradient(0.0f, 0.0f, f, f2, gradient.getColors(), gradient.getPositions(), tileMode));
        }
    }

    public static /* synthetic */ void setTo$default(Paint paint, Gradient gradient, SizeF sizeF, Shader.TileMode tileMode, int i, Object obj) {
        if ((i & 4) != 0) {
            tileMode = Shader.TileMode.REPEAT;
        }
        setTo(paint, gradient, sizeF, tileMode);
    }

    public static final void setTo(Paint paint, Gradient gradient, SizeF dimensions, Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        setTo(paint, gradient, dimensions.getWidth(), dimensions.getHeight(), tileMode);
    }

    public static final Gradient resolveGradient(Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Gradient.Companion companion = Gradient.INSTANCE;
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        Resources.Theme theme2 = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme2, "getTheme(...)");
        Gradient gradientFromTypedValue = companion.fromTypedValue(theme, Themes4.resolveAttribute$default(theme2, i, false, 2, null));
        if (gradientFromTypedValue != null) {
            return gradientFromTypedValue;
        }
        throw new IllegalStateException(("A gradient was not defined for 0x" + HexExtensions.toHexString$default(i, (HexFormat) null, 1, (Object) null) + " (" + context.getResources().getResourceName(i) + ")").toString());
    }

    @SuppressLint({"Recycle"})
    public static final Gradient getGradient(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        String resourceTypeName = resources.getResourceTypeName(i);
        if (!Intrinsics.areEqual(resourceTypeName, ResourceTypes.ARRAY)) {
            if (Intrinsics.areEqual(resourceTypeName, ResourceTypes.COLOR)) {
                return Gradient.INSTANCE.m2057of(resources.getColor(i, theme));
            }
            throw new UnsupportedOperationException("Not a gradient: " + resourceTypeName + " (" + resources.getResourceName(i) + ")");
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "obtainTypedArray(...)");
        Gradient gradientFromTypedArray = Gradient.INSTANCE.fromTypedArray(typedArrayObtainTypedArray);
        typedArrayObtainTypedArray.recycle();
        return gradientFromTypedArray;
    }

    public static final Gradient getGradient(Resources.Theme theme, int i) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Resources resources = theme.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return getGradient(resources, i, theme);
    }

    public static final Gradient getGradient(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return getGradient(theme, i);
    }
}
