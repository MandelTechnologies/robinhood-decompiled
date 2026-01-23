package com.robinhood.android.common.p088ui.style;

import android.content.res.Resources;
import android.util.TypedValue;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Themes.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003*\u00060\u0004R\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"typedValue", "Landroid/util/TypedValue;", "isLegacySupported", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources$Theme;)Z", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.style.ThemesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Themes {
    private static final TypedValue typedValue = new TypedValue();

    public static final boolean isLegacySupported(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        return theme.resolveAttribute(C11048R.attr.rhButtonStylePrimary, typedValue, false);
    }
}
