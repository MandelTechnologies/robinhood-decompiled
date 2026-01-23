package com.robinhood.android.acatsin.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageViews.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, m3636d2 = {"showDefaultBrokerageLogo", "", "Landroid/widget/ImageView;", "showRobinhoodBrokerageLogo", "feature-acats-in_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.ImageViewsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class ImageViews {
    public static final void showDefaultBrokerageLogo(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setImageResource(C7725R.drawable.default_brokerage_logo);
    }

    public static final void showRobinhoodBrokerageLogo(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Drawable drawable = imageView.getContext().getDrawable(C7725R.drawable.default_rh_logo);
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(C7725R.id.rh_icon);
        if (drawableFindDrawableByLayerId != null) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawableFindDrawableByLayerId.setTint(ThemeColors.getThemeColor(context, C20690R.attr.colorWhite));
        }
        imageView.setImageDrawable(layerDrawable);
    }
}
