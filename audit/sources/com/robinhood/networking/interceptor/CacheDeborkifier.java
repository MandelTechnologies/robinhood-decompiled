package com.robinhood.networking.interceptor;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.utils.logging.CrashReporter;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlin.text.StringsKt;
import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import timber.log.Timber;

/* compiled from: CacheDeborkifier.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/networking/interceptor/CacheDeborkifier;", "Lokhttp3/Interceptor;", "cache", "Lokhttp3/Cache;", "<init>", "(Lokhttp3/Cache;)V", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "deleteCacheEntry", "", "urlToDelete", "Lokhttp3/HttpUrl;", "cause", "", "readCacheEntry", "", "url", "evictCorruptedCacheEntry", "httpUrl", "reportNonFatal", "", "cacheEntry", "CacheCorruptException", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CacheDeborkifier implements Interceptor {
    private final Cache cache;

    public CacheDeborkifier(Cache cache2) {
        Intrinsics.checkNotNullParameter(cache2, "cache");
        this.cache = cache2;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        try {
            return chain.proceed(request);
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            if (message != null && StringsKt.contains((CharSequence) message, (CharSequence) "url", true)) {
                HttpUrl url = request.getUrl();
                Timber.Companion companion = Timber.INSTANCE;
                companion.mo3355e(e, "Caught and trying to mitigate caching issue for " + url, new Object[0]);
                companion.mo3356i("Cache deleted = " + deleteCacheEntry(url, e), new Object[0]);
                return chain.proceed(request);
            }
            throw e;
        }
    }

    private final boolean deleteCacheEntry(HttpUrl urlToDelete, Throwable cause) throws IOException {
        String cacheEntry = readCacheEntry(urlToDelete);
        boolean zEvictCorruptedCacheEntry = evictCorruptedCacheEntry(urlToDelete);
        reportNonFatal(cacheEntry, cause);
        return zEvictCorruptedCacheEntry;
    }

    private final String readCacheEntry(HttpUrl url) {
        String strKey = Cache.INSTANCE.key(url);
        File fileDirectory = this.cache.directory();
        BufferedSource bufferedSourceBuffer = Okio.buffer(FileSystem.SYSTEM.source(Path.Companion.get$default(Path.INSTANCE, new File(fileDirectory, strKey + ".0"), false, 1, (Object) null)));
        try {
            String utf8 = bufferedSourceBuffer.readUtf8();
            Closeable.closeFinally(bufferedSourceBuffer, null);
            return utf8;
        } finally {
        }
    }

    private final boolean evictCorruptedCacheEntry(HttpUrl httpUrl) throws IOException {
        String url = httpUrl.getUrl();
        Timber.INSTANCE.mo3356i("Searching for matching url: " + url, new Object[0]);
        Iterator<String> itUrls = this.cache.urls();
        boolean z = false;
        while (itUrls.hasNext()) {
            if (Intrinsics.areEqual(itUrls.next(), url)) {
                Timber.Companion companion = Timber.INSTANCE;
                companion.mo3356i("Found matching URL", new Object[0]);
                companion.mo3356i("Evicting cache entry.", new Object[0]);
                itUrls.remove();
                z = true;
            }
        }
        if (!z) {
            Timber.INSTANCE.mo3356i("No matching URL found.", new Object[0]);
            this.cache.evictAll();
        }
        return z;
    }

    private final void reportNonFatal(String cacheEntry, Throwable cause) {
        Timber.Companion companion = Timber.INSTANCE;
        companion.mo3353e("*** CACHE ENTRY START ***", new Object[0]);
        companion.mo3356i(cacheEntry, new Object[0]);
        companion.mo3353e("*** CACHE ENTRY END ***", new Object[0]);
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new CacheCorruptException("Attempted recovery of cache corruption", cause), false, null, 6, null);
    }

    /* compiled from: CacheDeborkifier.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/networking/interceptor/CacheDeborkifier$CacheCorruptException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes22.dex */
    public static final class CacheCorruptException extends Exception {
        /* JADX WARN: Multi-variable type inference failed */
        public CacheCorruptException() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ CacheCorruptException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        public CacheCorruptException(String str, Throwable th) {
            super(str, th);
        }
    }
}
