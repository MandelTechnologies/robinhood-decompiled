package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.mlkit.vision.common.InputImage;
import kotlin.Metadata;

/* compiled from: ImageToAnalyze.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "", "image", "Landroid/media/Image;", "getImage", "()Landroid/media/Image;", "inputImage", "Lcom/google/mlkit/vision/common/InputImage;", "getInputImage", "()Lcom/google/mlkit/vision/common/InputImage;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "width", "", "getWidth", "()I", "height", "getHeight", "rotationDegrees", "getRotationDegrees", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ImageToAnalyze {
    Bitmap getBitmap();

    int getHeight();

    Image getImage();

    InputImage getInputImage();

    int getRotationDegrees();

    int getWidth();
}
