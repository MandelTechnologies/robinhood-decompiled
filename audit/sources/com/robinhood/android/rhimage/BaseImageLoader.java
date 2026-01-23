package com.robinhood.android.rhimage;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.BaseImageLoader;
import com.robinhood.android.rhimage.CoilImageLoader;
import com.robinhood.android.rhimage.ImageLoader;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* compiled from: BaseImageLoader.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016JI\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/rhimage/BaseImageLoader;", "Lcom/robinhood/android/rhimage/ImageLoader;", "coilLoader", "<init>", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "url", "Lokhttp3/HttpUrl;", "path", "", "file", "Ljava/io/File;", "cancelRequest", "", "view", "Landroid/widget/ImageView;", "rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "Builder", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class BaseImageLoader implements ImageLoader {
    public static final int $stable = 8;
    private final ImageLoader coilLoader;

    public BaseImageLoader(ImageLoader coilLoader) {
        Intrinsics.checkNotNullParameter(coilLoader, "coilLoader");
        this.coilLoader = coilLoader;
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.coilLoader.load(url);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return this.coilLoader.load(path);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.coilLoader.load(file);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public void cancelRequest(ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.coilLoader.cancelRequest(view);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public AsyncImagePainter rememberAsyncImagePainter(Object obj, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> transform, Function1<? super AsyncImagePainter.State, Unit> function1, ContentScale contentScale, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        composer.startReplaceGroup(-2026795609);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026795609, i, -1, "com.robinhood.android.rhimage.BaseImageLoader.rememberAsyncImagePainter (BaseImageLoader.kt:38)");
        }
        AsyncImagePainter asyncImagePainterRememberAsyncImagePainter = this.coilLoader.rememberAsyncImagePainter(obj, transform, function1, contentScale, composer, i & 8190);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asyncImagePainterRememberAsyncImagePainter;
    }

    /* compiled from: BaseImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhimage/BaseImageLoader$Builder;", "Lcom/robinhood/android/rhimage/ImageLoader$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "coilBuilder", "Lcom/robinhood/android/rhimage/CoilImageLoader$Builder;", "getCoilBuilder", "()Lcom/robinhood/android/rhimage/CoilImageLoader$Builder;", "coilBuilder$delegate", "Lkotlin/Lazy;", "build", "Lcom/robinhood/android/rhimage/ImageLoader;", "okHttpClient", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder implements ImageLoader.Builder {
        public static final int $stable = 8;

        /* renamed from: coilBuilder$delegate, reason: from kotlin metadata */
        private final Lazy coilBuilder;

        public Builder(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.coilBuilder = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.rhimage.BaseImageLoader$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseImageLoader.Builder.coilBuilder_delegate$lambda$0(context);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CoilImageLoader.Builder coilBuilder_delegate$lambda$0(Context context) {
            return new CoilImageLoader.Builder(context);
        }

        private final CoilImageLoader.Builder getCoilBuilder() {
            return (CoilImageLoader.Builder) this.coilBuilder.getValue();
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.Builder
        public ImageLoader build() {
            return new BaseImageLoader(getCoilBuilder().build());
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.Builder
        public ImageLoader.Builder okHttpClient(Function0<? extends OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            getCoilBuilder().okHttpClient(okHttpClient);
            return this;
        }
    }
}
