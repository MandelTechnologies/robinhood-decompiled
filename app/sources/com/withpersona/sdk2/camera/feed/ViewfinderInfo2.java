package com.withpersona.sdk2.camera.feed;

import android.graphics.Rect;
import com.withpersona.sdk2.camera.ImageToAnalyze;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewfinderInfo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"calculateViewfinderRect", "Landroid/graphics/Rect;", "Lcom/withpersona/sdk2/camera/feed/ViewfinderInfo;", "imageToAnalyze", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "camera_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.feed.ViewfinderInfoKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ViewfinderInfo2 {
    public static final Rect calculateViewfinderRect(ViewfinderInfo viewfinderInfo, ImageToAnalyze imageToAnalyze) {
        int height;
        int width;
        double d;
        Intrinsics.checkNotNullParameter(viewfinderInfo, "<this>");
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        int iWidth = viewfinderInfo.getViewport().width();
        int iHeight = viewfinderInfo.getViewport().height();
        if (iWidth == 0 || iHeight == 0) {
            return null;
        }
        if (imageToAnalyze.getRotationDegrees() == 90 || imageToAnalyze.getRotationDegrees() == 270) {
            height = imageToAnalyze.getHeight();
            width = imageToAnalyze.getWidth();
        } else {
            height = imageToAnalyze.getWidth();
            width = imageToAnalyze.getHeight();
        }
        double d2 = height;
        double d3 = iWidth;
        double d4 = d2 / d3;
        double d5 = width;
        double d6 = iHeight;
        double d7 = d5 / d6;
        double dMin = Math.min(d4, d7);
        double d8 = 0.0d;
        if (d4 > d7) {
            d = 0.0d;
            d8 = (d2 - (d3 * dMin)) / 2.0d;
        } else {
            d = (d5 - (d6 * dMin)) / 2.0d;
        }
        double d9 = d8 + ((viewfinderInfo.getRegion().left - viewfinderInfo.getViewport().left) * dMin);
        double d10 = d + ((viewfinderInfo.getRegion().top - viewfinderInfo.getViewport().top) * dMin);
        double dWidth = viewfinderInfo.getRegion().width() * dMin;
        double dHeight = viewfinderInfo.getRegion().height() * dMin;
        if (imageToAnalyze.getRotationDegrees() == 90 || imageToAnalyze.getRotationDegrees() == 270) {
            return new Rect((int) d10, (int) d9, (int) (d10 + dHeight), (int) (d9 + dWidth));
        }
        return new Rect((int) d9, (int) d10, (int) (d9 + dWidth), (int) (d10 + dHeight));
    }
}
