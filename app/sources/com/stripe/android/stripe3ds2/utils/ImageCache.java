package com.stripe.android.stripe3ds2.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageCache.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦\u0002J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H¦\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "", "clear", "", "get", "Landroid/graphics/Bitmap;", "key", "", "set", "bitmap", "Default", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ImageCache {
    void clear();

    Bitmap get(String key);

    void set(String key, Bitmap bitmap);

    /* compiled from: ImageCache.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/utils/ImageCache$Default;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "<init>", "()V", "", "key", "Landroid/graphics/Bitmap;", "get", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "", "set", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "clear", "", "cacheSize", "I", "Landroid/util/LruCache;", "cache", "Landroid/util/LruCache;", "getCache$3ds2sdk_release", "()Landroid/util/LruCache;", "getCache$3ds2sdk_release$annotations", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Default implements ImageCache {
        public static final Default INSTANCE = new Default();
        private static final LruCache<String, Bitmap> cache;
        private static final int cacheSize;

        private Default() {
        }

        static {
            final int iMin = Math.min((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8), 10240);
            cacheSize = iMin;
            cache = new LruCache<String, Bitmap>(iMin) { // from class: com.stripe.android.stripe3ds2.utils.ImageCache$Default$cache$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.util.LruCache
                public int sizeOf(String key, Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    return bitmap.getByteCount() / 1024;
                }
            };
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public Bitmap get(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return cache.get(key);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public void set(String key, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            cache.put(key, bitmap);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public void clear() {
            cache.evictAll();
        }
    }
}
