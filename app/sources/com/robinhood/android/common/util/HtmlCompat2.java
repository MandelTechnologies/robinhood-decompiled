package com.robinhood.android.common.util;

import android.content.res.Resources;
import android.text.Spannable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HtmlCompat.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m3636d2 = {"fromHtml", "Landroid/text/Spannable;", "Landroid/content/res/Resources;", "stringResId", "", "flags", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.HtmlCompatKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class HtmlCompat2 {
    public static /* synthetic */ Spannable fromHtml$default(Resources resources, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return fromHtml(resources, i, i2);
    }

    public static final Spannable fromHtml(Resources resources, int i, int i2) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return HtmlCompat.fromHtml(string2, i2);
    }
}
