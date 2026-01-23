package io.noties.markwon.image;

import java.io.InputStream;

/* loaded from: classes14.dex */
public abstract class ImageItem {

    public static class WithResult extends ImageItem {
    }

    public abstract WithDecodingNeeded getAsWithDecodingNeeded();

    public abstract WithResult getAsWithResult();

    public abstract boolean hasDecodingNeeded();

    public static ImageItem withDecodingNeeded(String str, InputStream inputStream) {
        return new WithDecodingNeeded(str, inputStream);
    }

    private ImageItem() {
    }

    public static class WithDecodingNeeded extends ImageItem {
        private final String contentType;
        private final InputStream inputStream;

        @Override // io.noties.markwon.image.ImageItem
        public WithDecodingNeeded getAsWithDecodingNeeded() {
            return this;
        }

        @Override // io.noties.markwon.image.ImageItem
        public boolean hasDecodingNeeded() {
            return true;
        }

        private WithDecodingNeeded(String str, InputStream inputStream) {
            super();
            this.contentType = str;
            this.inputStream = inputStream;
        }

        public String contentType() {
            return this.contentType;
        }

        public InputStream inputStream() {
            return this.inputStream;
        }

        @Override // io.noties.markwon.image.ImageItem
        public WithResult getAsWithResult() {
            throw new IllegalStateException();
        }
    }
}
