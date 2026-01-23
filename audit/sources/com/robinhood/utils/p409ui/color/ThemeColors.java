package com.robinhood.utils.p409ui.color;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.robinhood.utils.extensions.Themes4;
import com.robinhood.utils.extensions.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: ThemeColors.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"getThemeColor", "", "Landroid/content/Context;", "resId", "getThemeColorOrNull", "(Landroid/content/Context;I)Ljava/lang/Integer;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.color.ThemeColorsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ThemeColors {
    public static final int getThemeColor(Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new IllegalStateException(("Could not resolve color attribute: " + context.getResources().getResourceName(i)).toString());
        }
        int i2 = typedValue.type;
        PrimitiveRanges2 range_color = TypedValues.INSTANCE.getRANGE_COLOR();
        int first = range_color.getFirst();
        if (i2 <= range_color.getLast() && first <= i2) {
            return typedValue.data;
        }
        if (i2 == 3) {
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            return Themes4.getColor(theme, typedValue.resourceId);
        }
        throw new UnsupportedOperationException("Unexpected type of resource for " + context.getResources().getResourceName(i) + ": " + typedValue);
    }

    public static final Integer getThemeColorOrNull(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        PrimitiveRanges2 range_color = TypedValues.INSTANCE.getRANGE_COLOR();
        int first = range_color.getFirst();
        if (i2 <= range_color.getLast() && first <= i2) {
            return Integer.valueOf(typedValue.data);
        }
        if (i2 != 1) {
            if (i2 == 3) {
                Resources.Theme theme = context.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                return Themes4.getColorOrNull(theme, typedValue.resourceId);
            }
            throw new UnsupportedOperationException("Unexpected type of resource for " + context.getResources().getResourceName(i) + ": " + typedValue);
        }
        if (typedValue.data == 0) {
            return null;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String resourceNameOrNull = com.robinhood.android.common.util.extensions.Resources.getResourceNameOrNull(resources, typedValue.data);
        throw new UnsupportedOperationException("Non-null reference was not expected for " + context.getResources().getResourceName(i) + ": " + typedValue + " (" + resourceNameOrNull + ")");
    }
}
