package io.noties.markwon.image;

import android.graphics.Rect;

/* loaded from: classes14.dex */
public class ImageSizeResolverDef extends ImageSizeResolver {
    @Override // io.noties.markwon.image.ImageSizeResolver
    public Rect resolveImageSize(AsyncDrawable asyncDrawable) {
        return resolveImageSize(asyncDrawable.getImageSize(), asyncDrawable.getResult().getBounds(), asyncDrawable.getLastKnownCanvasWidth(), asyncDrawable.getLastKnowTextSize());
    }

    protected Rect resolveImageSize(ImageSize imageSize, Rect rect, int i, float f) {
        if (imageSize == null) {
            int iWidth = rect.width();
            if (iWidth <= i) {
                return rect;
            }
            return new Rect(0, 0, i, (int) ((rect.height() / (iWidth / i)) + 0.5f));
        }
        rect.width();
        rect.height();
        return rect;
    }
}
