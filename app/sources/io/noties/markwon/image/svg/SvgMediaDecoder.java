package io.noties.markwon.image.svg;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import io.noties.markwon.image.MediaDecoder;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes14.dex */
public class SvgMediaDecoder extends MediaDecoder {
    private final Resources resources;

    public static SvgMediaDecoder create() {
        return create(Resources.getSystem());
    }

    public static SvgMediaDecoder create(Resources resources) {
        return new SvgMediaDecoder(resources);
    }

    SvgMediaDecoder(Resources resources) {
        this.resources = resources;
        validate();
    }

    @Override // io.noties.markwon.image.MediaDecoder
    public Drawable decode(String str, InputStream inputStream) {
        try {
            SVG fromInputStream = SVG.getFromInputStream(inputStream);
            float documentWidth = fromInputStream.getDocumentWidth();
            float documentHeight = fromInputStream.getDocumentHeight();
            float f = this.resources.getDisplayMetrics().density;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((documentWidth * f) + 0.5f), (int) ((documentHeight * f) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(f, f);
            fromInputStream.renderToCanvas(canvas);
            return new BitmapDrawable(this.resources, bitmapCreateBitmap);
        } catch (SVGParseException e) {
            throw new IllegalStateException("Exception decoding SVG", e);
        }
    }

    @Override // io.noties.markwon.image.MediaDecoder
    public Collection<String> supportedTypes() {
        return Collections.singleton("image/svg+xml");
    }

    private static void validate() {
        if (!SvgSupport.hasSvgSupport()) {
            throw new IllegalStateException(SvgSupport.missingMessage());
        }
    }
}
