package com.airbnb.lottie.model;

import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes.dex */
public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();

    /* renamed from: cache, reason: collision with root package name */
    private final LruCache<String, LottieComposition> f9801cache = new LruCache<>(20);

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    LottieCompositionCache() {
    }

    public LottieComposition get(String str) {
        if (str == null) {
            return null;
        }
        return this.f9801cache.get(str);
    }

    public void put(String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.f9801cache.put(str, lottieComposition);
    }

    public void clear() {
        this.f9801cache.evictAll();
    }

    public void resize(int i) {
        this.f9801cache.resize(i);
    }
}
