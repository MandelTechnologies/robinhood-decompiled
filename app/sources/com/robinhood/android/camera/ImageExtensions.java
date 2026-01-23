package com.robinhood.android.camera;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0005"}, m3636d2 = {"toYuvByteArray", "", "Landroid/media/Image;", "toJpegByteArray", "toByteArray", "lib-camera_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.camera.ImageExtensionsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ImageExtensions {
    private static final byte[] toYuvByteArray(Image image) {
        if (image.getFormat() != 35) {
            throw new IllegalStateException("Check failed.");
        }
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        ByteBuffer buffer2 = image.getPlanes()[2].getBuffer();
        int iRemaining = buffer.remaining();
        int iRemaining2 = buffer2.remaining();
        byte[] bArr = new byte[iRemaining + iRemaining2];
        buffer.get(bArr, 0, iRemaining);
        buffer2.get(bArr, iRemaining, iRemaining2);
        YuvImage yuvImage = new YuvImage(bArr, 17, image.getWidth(), image.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 50, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    private static final byte[] toJpegByteArray(Image image) {
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return bArr;
    }

    public static final byte[] toByteArray(Image image) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        if (image.getFormat() == 35) {
            return toYuvByteArray(image);
        }
        return toJpegByteArray(image);
    }
}
