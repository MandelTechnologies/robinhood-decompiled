package androidx.media3.exoplayer.image;

import androidx.media3.common.Format;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;

/* loaded from: classes4.dex */
public interface ImageDecoder extends Decoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> {

    public interface Factory {
        public static final Factory DEFAULT = new BitmapFactoryImageDecoder.Factory();

        ImageDecoder createImageDecoder();

        int supportsFormat(Format format2);
    }

    @Override // androidx.media3.decoder.Decoder
    ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException;

    void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ImageDecoderException;
}
