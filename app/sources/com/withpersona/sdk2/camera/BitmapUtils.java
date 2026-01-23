package com.withpersona.sdk2.camera;

import android.media.Image;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BitmapUtils.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0011J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/BitmapUtils;", "", "<init>", "()V", "yuv420ThreePlanesToNV21", "Ljava/nio/ByteBuffer;", "yuv420888planes", "", "Landroid/media/Image$Plane;", "width", "", "height", "yuv420ThreePlanesToNV21$camera_release", "([Landroid/media/Image$Plane;II)Ljava/nio/ByteBuffer;", "areUVPlanesNV21", "", "planes", "([Landroid/media/Image$Plane;II)Z", "unpackPlane", "", "plane", "out", "", "offset", "pixelStride", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BitmapUtils {
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    private BitmapUtils() {
    }

    public final ByteBuffer yuv420ThreePlanesToNV21$camera_release(Image.Plane[] yuv420888planes, int width, int height) {
        Intrinsics.checkNotNullParameter(yuv420888planes, "yuv420888planes");
        int i = width * height;
        byte[] bArr = new byte[((i / 4) * 2) + i];
        if (areUVPlanesNV21(yuv420888planes, width, height)) {
            yuv420888planes[0].getBuffer().rewind();
            yuv420888planes[0].getBuffer().get(bArr, 0, i);
            ByteBuffer buffer = yuv420888planes[1].getBuffer();
            yuv420888planes[2].getBuffer().get(bArr, i, 1);
            buffer.get(bArr, i + 1, ((i * 2) / 4) - 1);
        } else {
            unpackPlane(yuv420888planes[0], width, height, bArr, 0, 1);
            unpackPlane(yuv420888planes[1], width, height, bArr, i + 1, 2);
            unpackPlane(yuv420888planes[2], width, height, bArr, i, 2);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    private final boolean areUVPlanesNV21(Image.Plane[] planes, int width, int height) {
        int i = width * height;
        ByteBuffer buffer = planes[1].getBuffer();
        ByteBuffer buffer2 = planes[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        boolean z = buffer2.remaining() == ((i * 2) / 4) - 2 && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        return z;
    }

    private final void unpackPlane(Image.Plane plane, int width, int height, byte[] out, int offset, int pixelStride) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i = width / (height / iLimit);
        int rowStride = 0;
        for (int i2 = 0; i2 < iLimit; i2++) {
            int pixelStride2 = rowStride;
            for (int i3 = 0; i3 < i; i3++) {
                out[offset] = buffer.get(pixelStride2);
                offset += pixelStride;
                pixelStride2 += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }
}
