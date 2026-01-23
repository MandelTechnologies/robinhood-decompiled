package androidx.media3.decoder;

import androidx.media3.decoder.DecoderOutputBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class VideoDecoderOutputBuffer extends DecoderOutputBuffer {
    public int colorspace;
    public int height;
    private final DecoderOutputBuffer.Owner<VideoDecoderOutputBuffer> owner;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
