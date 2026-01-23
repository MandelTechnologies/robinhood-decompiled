package com.robinhood.android.mediaservice;

import android.content.Context;
import android.widget.ImageView;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.BaseImageLoader;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.api.annotation.BrokebackOkHttpClient;
import com.robinhood.models.p320db.MediaMetadata;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: MediaImageLoader.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/MediaImageLoader;", "", "client", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "context", "Landroid/content/Context;", "<init>", "(Ldagger/Lazy;Landroid/content/Context;)V", "loader", "Lcom/robinhood/android/rhimage/ImageLoader;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "mediaMetadata", "Lcom/robinhood/models/db/MediaMetadata;", "cancelRequest", "", "imageView", "Landroid/widget/ImageView;", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MediaImageLoader {
    public static final int $stable = 8;
    private final ImageLoader loader;

    public MediaImageLoader(@BrokebackOkHttpClient final Lazy<OkHttpClient> client, Context context) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(context, "context");
        this.loader = new BaseImageLoader.Builder(context).okHttpClient(new Function0() { // from class: com.robinhood.android.mediaservice.MediaImageLoader$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaImageLoader.loader$lambda$0(client);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient loader$lambda$0(Lazy lazy) {
        Object obj = lazy.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (OkHttpClient) obj;
    }

    public final ImageLoader.ImageRequest load(MediaMetadata mediaMetadata) {
        Intrinsics.checkNotNullParameter(mediaMetadata, "mediaMetadata");
        return this.loader.load(mediaMetadata.getUrl());
    }

    public final void cancelRequest(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.loader.cancelRequest(imageView);
    }
}
