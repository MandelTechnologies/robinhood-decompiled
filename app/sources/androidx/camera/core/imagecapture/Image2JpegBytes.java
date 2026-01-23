package androidx.camera.core.imagecapture;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes4.dex */
final class Image2JpegBytes implements Operation<AbstractC0833In, Packet<byte[]>> {
    private final JpegMetadataCorrector mJpegMetadataCorrector;

    Image2JpegBytes(Quirks quirks) {
        this.mJpegMetadataCorrector = new JpegMetadataCorrector(quirks);
    }

    @Override // androidx.camera.core.processing.Operation
    public Packet<byte[]> apply(AbstractC0833In abstractC0833In) throws ImageCaptureException {
        Packet<byte[]> packetProcessYuvImage;
        try {
            int format2 = abstractC0833In.getPacket().getFormat();
            if (format2 != 35) {
                if (format2 != 256 && format2 != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + format2);
                }
                packetProcessYuvImage = processJpegImage(abstractC0833In, format2);
            } else {
                packetProcessYuvImage = processYuvImage(abstractC0833In);
            }
            abstractC0833In.getPacket().getData().close();
            return packetProcessYuvImage;
        } catch (Throwable th) {
            abstractC0833In.getPacket().getData().close();
            throw th;
        }
    }

    private Packet<byte[]> processJpegImage(AbstractC0833In abstractC0833In, int i) {
        Packet<ImageProxy> packet = abstractC0833In.getPacket();
        byte[] bArrJpegImageToJpegByteArray = this.mJpegMetadataCorrector.jpegImageToJpegByteArray(packet.getData());
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        return Packet.m69of(bArrJpegImageToJpegByteArray, exif, i, packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }

    private Packet<byte[]> processYuvImage(AbstractC0833In abstractC0833In) throws ImageCaptureException {
        Packet<ImageProxy> packet = abstractC0833In.getPacket();
        ImageProxy data = packet.getData();
        Rect cropRect = packet.getCropRect();
        try {
            byte[] bArrYuvImageToJpegByteArray = ImageUtil.yuvImageToJpegByteArray(data, cropRect, abstractC0833In.getJpegQuality(), packet.getRotationDegrees());
            return Packet.m69of(bArrYuvImageToJpegByteArray, extractExif(bArrYuvImageToJpegByteArray), 256, new Size(cropRect.width(), cropRect.height()), new Rect(0, 0, cropRect.width(), cropRect.height()), packet.getRotationDegrees(), TransformUtils.updateSensorToBufferTransform(packet.getSensorToBufferTransform(), cropRect), packet.getCameraCaptureResult());
        } catch (ImageUtil.CodecFailedException e) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e);
        }
    }

    private static Exif extractExif(byte[] bArr) throws ImageCaptureException {
        try {
            return Exif.createFromInputStream(new ByteArrayInputStream(bArr));
        } catch (IOException e) {
            throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
        }
    }

    /* renamed from: androidx.camera.core.imagecapture.Image2JpegBytes$In */
    static abstract class AbstractC0833In {
        abstract int getJpegQuality();

        abstract Packet<ImageProxy> getPacket();

        AbstractC0833In() {
        }

        /* renamed from: of */
        static AbstractC0833In m58of(Packet<ImageProxy> packet, int i) {
            return new AutoValue_Image2JpegBytes_In(packet, i);
        }
    }
}
