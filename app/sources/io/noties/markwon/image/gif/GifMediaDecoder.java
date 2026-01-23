package io.noties.markwon.image.gif;

import android.graphics.drawable.Drawable;
import io.noties.markwon.image.MediaDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import pl.droidsonroids.gif.GifDrawable;

/* loaded from: classes14.dex */
public class GifMediaDecoder extends MediaDecoder {
    private final boolean autoPlayGif;

    public static GifMediaDecoder create() {
        return create(true);
    }

    public static GifMediaDecoder create(boolean z) {
        return new GifMediaDecoder(z);
    }

    protected GifMediaDecoder(boolean z) {
        this.autoPlayGif = z;
        validate();
    }

    @Override // io.noties.markwon.image.MediaDecoder
    public Drawable decode(String str, InputStream inputStream) {
        try {
            try {
                GifDrawable gifDrawableNewGifDrawable = newGifDrawable(readBytes(inputStream));
                if (!this.autoPlayGif) {
                    gifDrawableNewGifDrawable.pause();
                }
                return gifDrawableNewGifDrawable;
            } catch (IOException e) {
                throw new IllegalStateException("Exception creating GifDrawable", e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Cannot read GIF input-stream", e2);
        }
    }

    @Override // io.noties.markwon.image.MediaDecoder
    public Collection<String> supportedTypes() {
        return Collections.singleton("image/gif");
    }

    protected GifDrawable newGifDrawable(byte[] bArr) throws IOException {
        return new GifDrawable(bArr);
    }

    protected static byte[] readBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static void validate() {
        if (!GifSupport.hasGifSupport()) {
            throw new IllegalStateException(GifSupport.missingMessage());
        }
    }
}
