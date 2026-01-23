package com.robinhood.utils.extensions;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Themes.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001aJ\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\u00060\u0002R\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\t0\u000e¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a`\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\u00060\u0002R\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\u0014\u001a\u00020\u00052\b\b\u0003\u0010\u0015\u001a\u00020\u00052\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\t0\u000e¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u0005*\u00060\u0002R\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u0005*\u00060\u0002R\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0019\u001a\u0018\u0010\u001a\u001a\u00020\u001b*\u00060\u0002R\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00060\u0002R\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m3636d2 = {"resolveAttribute", "Landroid/util/TypedValue;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "resId", "", "resolveRefs", "", "withStyledAttributes", "R", "resourceId", "attrs", "", "block", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/res/Resources$Theme;I[ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "set", "Landroid/util/AttributeSet;", "defStyleAttr", "defStyleRes", "(Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[IIILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getColor", "getColorOrNull", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;", "getColorStateList", "Landroid/content/res/ColorStateList;", "getColorStateListOrNull", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.ThemesKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Themes4 {
    public static /* synthetic */ TypedValue resolveAttribute$default(Resources.Theme theme, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return resolveAttribute(theme, i, z);
    }

    public static final TypedValue resolveAttribute(Resources.Theme theme, int i, boolean z) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, z);
        return typedValue;
    }

    public static final <R> R withStyledAttributes(Resources.Theme theme, int i, int[] attrs, Function1<? super TypedArray, ? extends R> block) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(block, "block");
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, attrs);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return block.invoke(typedArrayObtainStyledAttributes);
        } finally {
            InlineMarker.finallyStart(1);
            typedArrayObtainStyledAttributes.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object withStyledAttributes$default(Resources.Theme theme, AttributeSet attributeSet, int[] attrs, int i, int i2, Function1 block, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(block, "block");
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, attrs, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return block.invoke(typedArrayObtainStyledAttributes);
        } finally {
            InlineMarker.finallyStart(1);
            typedArrayObtainStyledAttributes.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withStyledAttributes(Resources.Theme theme, AttributeSet attributeSet, int[] attrs, int i, int i2, Function1<? super TypedArray, ? extends R> block) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(block, "block");
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, attrs, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return block.invoke(typedArrayObtainStyledAttributes);
        } finally {
            InlineMarker.finallyStart(1);
            typedArrayObtainStyledAttributes.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final int getColor(Resources.Theme theme, int i) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        return getColorStateList(theme, i).getDefaultColor();
    }

    public static final Integer getColorOrNull(Resources.Theme theme, int i) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        ColorStateList colorStateListOrNull = getColorStateListOrNull(theme, i);
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    public static final ColorStateList getColorStateList(Resources.Theme theme, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        ColorStateList colorStateList = theme.getResources().getColorStateList(i, theme);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "getColorStateList(...)");
        return colorStateList;
    }

    public static final ColorStateList getColorStateListOrNull(Resources.Theme theme, int i) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        try {
            return theme.getResources().getColorStateList(i, theme);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
