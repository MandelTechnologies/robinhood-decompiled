package com.robinhood.android.common.util.extensions;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ImageViews.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0002¨\u0006\t"}, m3636d2 = {"startCrop", "", "Landroid/widget/ImageView;", "fitHeightAndAlignCrop", "align", "Landroid/graphics/Paint$Align;", "widthWithoutPadding", "", "heightWithoutPadding", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.ImageViewsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ImageViews2 {

    /* compiled from: ImageViews.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.util.extensions.ImageViewsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Paint.Align.values().length];
            try {
                iArr[Paint.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paint.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Paint.Align.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void startCrop(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (imageView.getDrawable() == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float fCoerceAtLeast = RangesKt.coerceAtLeast(widthWithoutPadding(imageView) / r0.getIntrinsicWidth(), heightWithoutPadding(imageView) / r0.getIntrinsicHeight());
        matrix.reset();
        matrix.postScale(fCoerceAtLeast, fCoerceAtLeast);
        imageView.setImageMatrix(matrix);
    }

    public static final void fitHeightAndAlignCrop(ImageView imageView, Paint.Align align) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float fWidthWithoutPadding = widthWithoutPadding(imageView);
        float fHeightWithoutPadding = heightWithoutPadding(imageView);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = fHeightWithoutPadding / drawable.getIntrinsicHeight();
        matrix.reset();
        matrix.postScale(intrinsicHeight, intrinsicHeight);
        float f = fWidthWithoutPadding - (intrinsicWidth * intrinsicHeight);
        int i = WhenMappings.$EnumSwitchMapping$0[align.ordinal()];
        if (i == 1) {
            f = 0.0f;
        } else if (i == 2) {
            f /= 2.0f;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        matrix.postTranslate(f, 0.0f);
        imageView.setImageMatrix(matrix);
    }

    public static final int widthWithoutPadding(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public static final int heightWithoutPadding(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }
}
