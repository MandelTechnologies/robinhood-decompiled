package com.robinhood.shared.support.supportchat.util;

import android.graphics.Bitmap;
import android.net.Uri;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.mediaservice.RedirectImageLoader;
import com.robinhood.targetbackend.Endpoint;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: ChatImageLoadHelper.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/util/ChatImageLoadHelper;", "", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "redirectImageLoader", "Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "<init>", "(Lcom/robinhood/targetbackend/Endpoint;Lcom/robinhood/android/bitmap/BitmapStore;Lcom/robinhood/android/mediaservice/RedirectImageLoader;)V", "getRedirectImageLoader", "()Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "readBitmapFromUri", "Landroid/graphics/Bitmap;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "identiBaseUrl", "Lokhttp3/HttpUrl;", "getIdentiBaseUrl", "()Lokhttp3/HttpUrl;", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ChatImageLoadHelper {
    public static final int $stable = 8;
    private final BitmapStore bitmapStore;
    private final HttpUrl identiBaseUrl;
    private final RedirectImageLoader redirectImageLoader;

    public ChatImageLoadHelper(Endpoint endpoint, BitmapStore bitmapStore, RedirectImageLoader redirectImageLoader) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(redirectImageLoader, "redirectImageLoader");
        this.bitmapStore = bitmapStore;
        this.redirectImageLoader = redirectImageLoader;
        this.identiBaseUrl = endpoint.getIdentiUrl();
    }

    public final RedirectImageLoader getRedirectImageLoader() {
        return this.redirectImageLoader;
    }

    public final Object readBitmapFromUri(Uri uri, Continuation<? super Bitmap> continuation) {
        return this.bitmapStore.readBitmapFromDisk(uri, continuation);
    }

    public final HttpUrl getIdentiBaseUrl() {
        return this.identiBaseUrl;
    }
}
