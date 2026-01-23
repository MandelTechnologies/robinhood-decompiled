package io.noties.markwon.image;

import io.noties.markwon.image.data.DataUriSchemeHandler;
import io.noties.markwon.image.gif.GifMediaDecoder;
import io.noties.markwon.image.gif.GifSupport;
import io.noties.markwon.image.network.NetworkSchemeHandler;
import io.noties.markwon.image.svg.SvgMediaDecoder;
import io.noties.markwon.image.svg.SvgSupport;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes14.dex */
class AsyncDrawableLoaderBuilder {
    MediaDecoder defaultMediaDecoder;
    ExecutorService executorService;
    boolean isBuilt;
    final Map<String, SchemeHandler> schemeHandlers = new HashMap(3);
    final Map<String, MediaDecoder> mediaDecoders = new HashMap(3);

    AsyncDrawableLoaderBuilder() {
        addSchemeHandler(DataUriSchemeHandler.create());
        addSchemeHandler(NetworkSchemeHandler.create());
        if (SvgSupport.hasSvgSupport()) {
            addMediaDecoder(SvgMediaDecoder.create());
        }
        if (GifSupport.hasGifSupport()) {
            addMediaDecoder(GifMediaDecoder.create());
        }
        this.defaultMediaDecoder = DefaultMediaDecoder.create();
    }

    void addSchemeHandler(SchemeHandler schemeHandler) {
        checkState();
        Iterator<String> it = schemeHandler.supportedSchemes().iterator();
        while (it.hasNext()) {
            this.schemeHandlers.put(it.next(), schemeHandler);
        }
    }

    void addMediaDecoder(MediaDecoder mediaDecoder) {
        checkState();
        Iterator<String> it = mediaDecoder.supportedTypes().iterator();
        while (it.hasNext()) {
            this.mediaDecoders.put(it.next(), mediaDecoder);
        }
    }

    void defaultMediaDecoder(MediaDecoder mediaDecoder) {
        checkState();
        this.defaultMediaDecoder = mediaDecoder;
    }

    AsyncDrawableLoader build() {
        checkState();
        this.isBuilt = true;
        if (this.executorService == null) {
            this.executorService = Executors.newCachedThreadPool();
        }
        return new AsyncDrawableLoaderImpl(this);
    }

    private void checkState() {
        if (this.isBuilt) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
    }
}
