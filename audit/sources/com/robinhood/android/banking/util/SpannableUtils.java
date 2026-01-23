package com.robinhood.android.banking.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.robinhood.android.libdesignsystem.C20690R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpannableUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m3636d2 = {"insertLightningIcon", "", "Landroid/text/SpannableStringBuilder;", "context", "Landroid/content/Context;", "themeColor", "", "startPosition", "feature-lib-banking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.banking.util.SpannableUtilsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SpannableUtils {
    public static final void insertLightningIcon(SpannableStringBuilder spannableStringBuilder, Context context, int i, int i2) {
        ImageSpan imageSpan;
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = context.getDrawable(C20690R.drawable.ic_rds_lightning_12dp);
        if (drawable != null) {
            drawable.setTint(i);
            if (Build.VERSION.SDK_INT >= 29) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                imageSpan = new ImageSpan(drawable, 2);
            } else {
                drawable.setBounds(0, drawable.getIntrinsicHeight() / 4, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                imageSpan = new ImageSpan(drawable, 1);
            }
            spannableStringBuilder.setSpan(imageSpan, i2, i2 + 1, 33);
        }
    }
}
