package com.robinhood.utils.extensions;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArray2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: TypedArrays.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0002\u0010\t\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000b\u001a\u0019\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u000b\u001a0\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0010\b\u0000\u0010\u000e\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000e0\u000f*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u0001¨\u0006\u0017"}, m3636d2 = {"getIntOrNull", "", "Landroid/content/res/TypedArray;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "range", "Lkotlin/ranges/IntRange;", "get", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/res/TypedArray;ILkotlin/ranges/IntRange;Lkotlin/jvm/functions/Function3;)Ljava/lang/Integer;", "getColorOrNull", "(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;", "getDimensionPixelSizeOrNull", "getEnumOrNull", "E", "", "(Landroid/content/res/TypedArray;I)Ljava/lang/Enum;", "getResourceIdOrNull", "getFontOrThrowCompat", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "getFontCompat", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.TypedArraysKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class TypedArrays3 {
    private static final Integer getIntOrNull(TypedArray typedArray, int i, PrimitiveRanges2 primitiveRanges2, Function3<? super TypedArray, ? super Integer, ? super Integer, Integer> function3) {
        int first = primitiveRanges2.getFirst();
        int last = primitiveRanges2.getLast();
        int type2 = typedArray.getType(i);
        if (first > type2 || type2 > last) {
            return null;
        }
        return function3.invoke(typedArray, Integer.valueOf(i), 0);
    }

    public static final Integer getColorOrNull(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        PrimitiveRanges2 range_color = TypedValues.INSTANCE.getRANGE_COLOR();
        int first = range_color.getFirst();
        int last = range_color.getLast();
        int type2 = typedArray.getType(i);
        if (first > type2 || type2 > last) {
            return null;
        }
        return Integer.valueOf(typedArray.getColor(i, 0));
    }

    public static final Integer getDimensionPixelSizeOrNull(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        if (typedArray.hasValue(i)) {
            return Integer.valueOf(typedArray.getDimensionPixelSize(i, 0));
        }
        return null;
    }

    public static final Integer getIntOrNull(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        PrimitiveRanges2 range_int = TypedValues.INSTANCE.getRANGE_INT();
        int first = range_int.getFirst();
        int last = range_int.getLast();
        int type2 = typedArray.getType(i);
        if (first > type2 || type2 > last) {
            return null;
        }
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public static final /* synthetic */ <E extends Enum<E>> E getEnumOrNull(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Integer intOrNull = getIntOrNull(typedArray, i);
        if (intOrNull == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        Intrinsics.reifiedOperationMarker(5, "E");
        return (E) new Enum[0][iIntValue];
    }

    public static final Integer getResourceIdOrNull(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Integer numValueOf = Integer.valueOf(typedArray.getResourceId(i, 0));
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }

    public static final Typeface getFontOrThrowCompat(TypedArray typedArray, Context context, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 26 ? TypedArray2.getFontOrThrow(typedArray, i) : ResourcesCompat.getFont(context, TypedArray2.getResourceIdOrThrow(typedArray, i));
    }

    public static final Typeface getFontCompat(TypedArray typedArray, Context context, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            return typedArray.getFont(i);
        }
        Integer resourceIdOrNull = getResourceIdOrNull(typedArray, i);
        if (resourceIdOrNull != null) {
            return ResourcesCompat.getFont(context, resourceIdOrNull.intValue());
        }
        return null;
    }
}
