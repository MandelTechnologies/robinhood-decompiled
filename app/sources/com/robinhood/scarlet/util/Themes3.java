package com.robinhood.scarlet.util;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences9;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Themes.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002R\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a5\u0010\b\u001a\u00060\u0002R\u00020\u0003*\u00060\u0002R\u00020\u00032\u001b\u0010\t\u001a\u0017\u0012\b\u0012\u00060\u0002R\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0080\bø\u0001\u0000\u001a\"\u0010\b\u001a\u00060\u0002R\u00020\u0003*\u00060\u0002R\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000\u001a4\u0010\u0010\u001a\u00020\u000b*\u00060\u0002R\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0016\u001a4\u0010\u0010\u001a\u00020\u000b*\u00060\u0002R\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0016\u001a\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, m3636d2 = {"resolveAttribute", "Landroid/util/TypedValue;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "resId", "", "resolveRefs", "", "deriveWith", "initializer", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", ResourceTypes.STYLE, "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "collectStyledAttributes", "set", "Landroid/util/AttributeSet;", "attrs", "", "outValues", "Landroid/util/SparseArray;", "resourceId", "isExceptionCase", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Lcom/robinhood/scarlet/util/resource/UnresolvedResourceException;", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.scarlet.util.ThemesKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Themes3 {
    public static /* synthetic */ TypedValue resolveAttribute$default(Resources.Theme theme, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return resolveAttribute(theme, i, z);
    }

    public static final TypedValue resolveAttribute(Resources.Theme theme, int i, boolean z) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, z)) {
            return typedValue;
        }
        return null;
    }

    public static final Resources.Theme deriveWith(Resources.Theme theme, ResourceReferences4<StyleResource> style) throws ResourceReferences9 {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Resources.Theme themeNewTheme = theme.getResources().newTheme();
        themeNewTheme.setTo(theme);
        Intrinsics.checkNotNull(themeNewTheme);
        try {
            themeNewTheme.applyStyle(style.resolveOrThrow(themeNewTheme).getResId(), true);
        } catch (ResourceReferences9 e) {
            if (!isExceptionCase(e)) {
                throw e;
            }
        }
        Intrinsics.checkNotNullExpressionValue(themeNewTheme, "apply(...)");
        return themeNewTheme;
    }

    public static final Resources.Theme deriveWith(Resources.Theme theme, Function1<? super Resources.Theme, Unit> initializer) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Resources.Theme themeNewTheme = theme.getResources().newTheme();
        themeNewTheme.setTo(theme);
        Intrinsics.checkNotNull(themeNewTheme);
        initializer.invoke(themeNewTheme);
        Intrinsics.checkNotNullExpressionValue(themeNewTheme, "apply(...)");
        return themeNewTheme;
    }

    public static final void collectStyledAttributes(Resources.Theme theme, int i, int[] attrs, SparseArray<? super ResourceReferences4<?>> outValues) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(outValues, "outValues");
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, attrs);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int length = attrs.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = attrs[i2];
                int i5 = i3 + 1;
                ResourceReferences4<?> reference = TypedArrays2.getReference(typedArrayObtainStyledAttributes, theme, i3);
                if (reference != null) {
                    outValues.put(i4, reference);
                }
                i2++;
                i3 = i5;
            }
            Unit unit = Unit.INSTANCE;
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final void collectStyledAttributes(Resources.Theme theme, AttributeSet attributeSet, int[] attrs, SparseArray<? super ResourceReferences4<?>> outValues) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(outValues, "outValues");
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, attrs, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int length = attrs.length;
            int i2 = 0;
            while (i < length) {
                int i3 = attrs[i];
                int i4 = i2 + 1;
                ResourceReferences4<?> reference = TypedArrays2.getReference(typedArrayObtainStyledAttributes, theme, i2);
                if (reference != null) {
                    outValues.put(i3, reference);
                }
                i++;
                i2 = i4;
            }
            Unit unit = Unit.INSTANCE;
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private static final boolean isExceptionCase(ResourceReferences9 resourceReferences9) {
        return Intrinsics.areEqual(resourceReferences9.getDescription(), "ThemedResourceReference<ResourceType.STYLE>(android:attr/actionBarTheme)");
    }
}
