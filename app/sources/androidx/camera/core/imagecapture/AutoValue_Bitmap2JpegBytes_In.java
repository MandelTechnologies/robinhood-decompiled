package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.processing.Packet;

/* loaded from: classes4.dex */
final class AutoValue_Bitmap2JpegBytes_In extends Bitmap2JpegBytes.AbstractC0829In {
    private final int jpegQuality;
    private final Packet<Bitmap> packet;

    AutoValue_Bitmap2JpegBytes_In(Packet<Bitmap> packet, int i) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.packet = packet;
        this.jpegQuality = i;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.AbstractC0829In
    Packet<Bitmap> getPacket() {
        return this.packet;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.AbstractC0829In
    int getJpegQuality() {
        return this.jpegQuality;
    }

    public String toString() {
        return "In{packet=" + this.packet + ", jpegQuality=" + this.jpegQuality + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bitmap2JpegBytes.AbstractC0829In) {
            Bitmap2JpegBytes.AbstractC0829In abstractC0829In = (Bitmap2JpegBytes.AbstractC0829In) obj;
            if (this.packet.equals(abstractC0829In.getPacket()) && this.jpegQuality == abstractC0829In.getJpegQuality()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }
}
