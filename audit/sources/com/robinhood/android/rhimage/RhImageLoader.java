package com.robinhood.android.rhimage;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.BaseImageLoader;
import com.robinhood.android.rhimage.ImageLoader;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: RhImageLoader.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JI\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00182\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/rhimage/RhImageLoader;", "Lcom/robinhood/android/rhimage/ImageLoader;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "loader", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "url", "Lokhttp3/HttpUrl;", "path", "", "file", "Ljava/io/File;", "cancelRequest", "", "view", "Landroid/widget/ImageView;", "rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhImageLoader implements ImageLoader {
    public static final int $stable = 8;
    private final ImageLoader loader;

    public RhImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.loader = new BaseImageLoader.Builder(context).build();
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.loader.load(url);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return this.loader.load(path);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.loader.load(file);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public void cancelRequest(ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.loader.cancelRequest(view);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public AsyncImagePainter rememberAsyncImagePainter(Object obj, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> transform, Function1<? super AsyncImagePainter.State, Unit> function1, ContentScale contentScale, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        composer.startReplaceGroup(-1455756985);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1455756985, i, -1, "com.robinhood.android.rhimage.RhImageLoader.rememberAsyncImagePainter (RhImageLoader.kt:48)");
        }
        AsyncImagePainter asyncImagePainterRememberAsyncImagePainter = this.loader.rememberAsyncImagePainter(obj, transform, function1, contentScale, composer, i & 8190);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asyncImagePainterRememberAsyncImagePainter;
    }
}
