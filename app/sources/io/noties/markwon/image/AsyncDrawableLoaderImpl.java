package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import io.noties.markwon.image.ImageItem;
import io.noties.markwon.image.ImagesPlugin;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes14.dex */
class AsyncDrawableLoaderImpl extends AsyncDrawableLoader {
    private final MediaDecoder defaultMediaDecoder;
    private final ExecutorService executorService;
    private final Handler handler;
    private final Map<String, MediaDecoder> mediaDecoders;
    private final Map<AsyncDrawable, Future<?>> requests;
    private final Map<String, SchemeHandler> schemeHandlers;

    @Override // io.noties.markwon.image.AsyncDrawableLoader
    public Drawable placeholder(AsyncDrawable asyncDrawable) {
        return null;
    }

    static /* synthetic */ ImagesPlugin.ErrorHandler access$300(AsyncDrawableLoaderImpl asyncDrawableLoaderImpl) {
        asyncDrawableLoaderImpl.getClass();
        return null;
    }

    AsyncDrawableLoaderImpl(AsyncDrawableLoaderBuilder asyncDrawableLoaderBuilder) {
        this(asyncDrawableLoaderBuilder, new Handler(Looper.getMainLooper()));
    }

    AsyncDrawableLoaderImpl(AsyncDrawableLoaderBuilder asyncDrawableLoaderBuilder, Handler handler) {
        this.requests = new HashMap(2);
        this.executorService = asyncDrawableLoaderBuilder.executorService;
        this.schemeHandlers = asyncDrawableLoaderBuilder.schemeHandlers;
        this.mediaDecoders = asyncDrawableLoaderBuilder.mediaDecoders;
        this.defaultMediaDecoder = asyncDrawableLoaderBuilder.defaultMediaDecoder;
        this.handler = handler;
    }

    @Override // io.noties.markwon.image.AsyncDrawableLoader
    public void load(AsyncDrawable asyncDrawable) {
        if (this.requests.get(asyncDrawable) == null) {
            this.requests.put(asyncDrawable, execute(asyncDrawable));
        }
    }

    @Override // io.noties.markwon.image.AsyncDrawableLoader
    public void cancel(AsyncDrawable asyncDrawable) {
        Future<?> futureRemove = this.requests.remove(asyncDrawable);
        if (futureRemove != null) {
            futureRemove.cancel(true);
        }
        this.handler.removeCallbacksAndMessages(asyncDrawable);
    }

    private Future<?> execute(final AsyncDrawable asyncDrawable) {
        return this.executorService.submit(new Runnable() { // from class: io.noties.markwon.image.AsyncDrawableLoaderImpl.1
            @Override // java.lang.Runnable
            public void run() {
                Rect bounds;
                String scheme;
                String destination = asyncDrawable.getDestination();
                Uri uri = Uri.parse(destination);
                final Drawable drawableDecode = null;
                try {
                    scheme = uri.getScheme();
                } catch (Throwable th) {
                    AsyncDrawableLoaderImpl.access$300(AsyncDrawableLoaderImpl.this);
                    Log.e("MARKWON-IMAGE", "Error loading image: " + destination, th);
                }
                if (scheme != null && scheme.length() != 0) {
                    SchemeHandler schemeHandler = (SchemeHandler) AsyncDrawableLoaderImpl.this.schemeHandlers.get(scheme);
                    if (schemeHandler != null) {
                        ImageItem imageItemHandle = schemeHandler.handle(destination, uri);
                        if (imageItemHandle.hasDecodingNeeded()) {
                            ImageItem.WithDecodingNeeded asWithDecodingNeeded = imageItemHandle.getAsWithDecodingNeeded();
                            try {
                                MediaDecoder mediaDecoder = (MediaDecoder) AsyncDrawableLoaderImpl.this.mediaDecoders.get(asWithDecodingNeeded.contentType());
                                if (mediaDecoder == null) {
                                    mediaDecoder = AsyncDrawableLoaderImpl.this.defaultMediaDecoder;
                                }
                                if (mediaDecoder != null) {
                                    drawableDecode = mediaDecoder.decode(asWithDecodingNeeded.contentType(), asWithDecodingNeeded.inputStream());
                                    try {
                                        asWithDecodingNeeded.inputStream().close();
                                    } catch (IOException e) {
                                        Log.e("MARKWON-IMAGE", "Error closing inputStream", e);
                                    }
                                    if (drawableDecode != null && ((bounds = drawableDecode.getBounds()) == null || bounds.isEmpty())) {
                                        DrawableUtils.applyIntrinsicBounds(drawableDecode);
                                    }
                                    AsyncDrawableLoaderImpl.this.handler.postAtTime(new Runnable() { // from class: io.noties.markwon.image.AsyncDrawableLoaderImpl.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            if (((Future) AsyncDrawableLoaderImpl.this.requests.remove(asyncDrawable)) == null || drawableDecode == null || !asyncDrawable.isAttached()) {
                                                return;
                                            }
                                            asyncDrawable.setResult(drawableDecode);
                                        }
                                    }, asyncDrawable, SystemClock.uptimeMillis());
                                    return;
                                }
                                throw new IllegalStateException("No media-decoder is found: " + destination);
                            } finally {
                            }
                        }
                        imageItemHandle.getAsWithResult();
                        throw null;
                    }
                    throw new IllegalStateException("No scheme-handler is found: " + destination);
                }
                throw new IllegalStateException("No scheme is found: " + destination);
            }
        });
    }
}
