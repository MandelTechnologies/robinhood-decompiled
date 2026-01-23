package com.robinhood.android.rhimage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter4;
import coil.content.CoilUtils;
import coil.decode.SvgDecoder;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.request.ImageRequest;
import coil.request.ImageResult2;
import coil.request.ImageResult3;
import coil.target.Target;
import coil.transform.CircleCropTransformation;
import coil.transform.RoundedCornersTransformation;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.CoilImageLoader;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.utils.extensions.ResourceTypes;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* compiled from: CoilImageLoader.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001f B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016JI\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00192\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/rhimage/CoilImageLoader;", "Lcom/robinhood/android/rhimage/ImageLoader;", "loader", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "<init>", "(Lcoil/ImageLoader;Landroid/content/Context;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "url", "Lokhttp3/HttpUrl;", "path", "", "file", "Ljava/io/File;", "cancelRequest", "", "view", "Landroid/widget/ImageView;", "rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "Builder", "ImageRequest", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CoilImageLoader implements ImageLoader {
    public static final int $stable = 8;
    private final Context context;
    private final coil.ImageLoader loader;

    public CoilImageLoader(coil.ImageLoader loader, Context context) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(context, "context");
        this.loader = loader;
        this.context = context;
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new ImageRequest(this, new ImageRequest.Builder(this.context).data(url), false, false, false, 14, null);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new ImageRequest(this, new ImageRequest.Builder(this.context).data(path), false, false, false, 14, null);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public ImageLoader.ImageRequest load(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new ImageRequest(this, new ImageRequest.Builder(this.context).data(file), false, false, false, 14, null);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public void cancelRequest(ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        CoilUtils.dispose(view);
    }

    @Override // com.robinhood.android.rhimage.ImageLoader
    public AsyncImagePainter rememberAsyncImagePainter(Object obj, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> transform, Function1<? super AsyncImagePainter.State, Unit> function1, ContentScale contentScale, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        composer.startReplaceGroup(-269860889);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-269860889, i, -1, "com.robinhood.android.rhimage.CoilImageLoader.rememberAsyncImagePainter (CoilImageLoader.kt:46)");
        }
        int i2 = i << 3;
        AsyncImagePainter asyncImagePainterM9105rememberAsyncImagePainter0YpotYA = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(obj, this.loader, transform, function1, contentScale, 0, null, composer, (i & 14) | (i2 & 896) | (i2 & 7168) | (i2 & 57344), 96);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asyncImagePainterM9105rememberAsyncImagePainter0YpotYA;
    }

    /* compiled from: CoilImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/rhimage/CoilImageLoader$Builder;", "Lcom/robinhood/android/rhimage/ImageLoader$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "memoryPercentage", "", "loaderBuilder", "Lcoil/ImageLoader$Builder;", "build", "Lcom/robinhood/android/rhimage/ImageLoader;", "okHttpClient", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Builder implements ImageLoader.Builder {
        public static final int $stable = 8;
        private final Context context;
        private final ImageLoader.Builder loaderBuilder;
        private final double memoryPercentage;

        public Builder(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.memoryPercentage = 0.15d;
            ImageLoader.Builder builder = new ImageLoader.Builder(context);
            ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
            builder2.add(new SvgDecoder.Factory(false, 1, null));
            Unit unit = Unit.INSTANCE;
            this.loaderBuilder = builder.components(builder2.build()).memoryCache(new Function0() { // from class: com.robinhood.android.rhimage.CoilImageLoader$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoilImageLoader.Builder.loaderBuilder$lambda$1(this.f$0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MemoryCache loaderBuilder$lambda$1(Builder builder) {
            return new MemoryCache.Builder(builder.context).maxSizePercent(builder.memoryPercentage).build();
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.Builder
        public ImageLoader build() {
            return new CoilImageLoader(this.loaderBuilder.build(), this.context);
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.Builder
        public ImageLoader.Builder okHttpClient(Function0<? extends OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.loaderBuilder.okHttpClient(okHttpClient);
            return this;
        }
    }

    /* compiled from: CoilImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0011H\u0016J(\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00012\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00012\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0006\u001a\u00020\u0001H\u0016J\b\u0010\u0007\u001a\u00020\u0001H\u0016J\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0001H\u0016J\b\u0010!\u001a\u00020\u0001H\u0016J\b\u0010\"\u001a\u00020\u0001H\u0016J\u0010\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/rhimage/CoilImageLoader$ImageRequest;", "Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "requestBuilder", "Lcoil/request/ImageRequest$Builder;", "fit", "", "centerCrop", "centerInside", "<init>", "(Lcom/robinhood/android/rhimage/CoilImageLoader;Lcoil/request/ImageRequest$Builder;ZZZ)V", "into", "", "target", "Landroid/widget/ImageView;", "onSuccess", "Lkotlin/Function0;", "onError", "Lcom/robinhood/android/rhimage/ImageLoader$Target;", "fetch", "memoryPolicy", "Lcom/robinhood/android/rhimage/ImageLoader$MemoryPolicy;", "placeholder", "drawableResId", "", "error", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "size", "width", "height", "priority", "Lcom/robinhood/android/rhimage/ImageLoader$Priority;", "noFade", "noPlaceholder", "circle", "rounded", "radius", "", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes5.dex */
    public final class ImageRequest implements ImageLoader.ImageRequest {
        private boolean centerCrop;
        private boolean centerInside;
        private boolean fit;
        private final ImageRequest.Builder requestBuilder;
        final /* synthetic */ CoilImageLoader this$0;

        /* compiled from: CoilImageLoader.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ImageLoader.MemoryPolicy.values().length];
                try {
                    iArr[ImageLoader.MemoryPolicy.NO_CACHE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ImageLoader.MemoryPolicy.NO_STORE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest priority(ImageLoader.Priority priority) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            return this;
        }

        public ImageRequest(CoilImageLoader coilImageLoader, ImageRequest.Builder requestBuilder, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
            this.this$0 = coilImageLoader;
            this.requestBuilder = requestBuilder;
            this.fit = z;
            this.centerCrop = z2;
            this.centerInside = z3;
        }

        public /* synthetic */ ImageRequest(CoilImageLoader coilImageLoader, ImageRequest.Builder builder, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(coilImageLoader, builder, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public void into(ImageView target, final Function0<Unit> onSuccess, final Function0<Unit> onError) {
            Intrinsics.checkNotNullParameter(target, "target");
            if (this.fit) {
                target.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            if (this.centerCrop) {
                target.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            if (this.centerInside) {
                target.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            this.this$0.loader.enqueue(this.requestBuilder.target(target).listener(new ImageRequest.Listener() { // from class: com.robinhood.android.rhimage.CoilImageLoader$ImageRequest$into$request$1
                @Override // coil.request.ImageRequest.Listener
                public /* bridge */ /* synthetic */ void onCancel(ImageRequest imageRequest) {
                    super.onCancel(imageRequest);
                }

                @Override // coil.request.ImageRequest.Listener
                public /* bridge */ /* synthetic */ void onStart(ImageRequest imageRequest) {
                    super.onStart(imageRequest);
                }

                @Override // coil.request.ImageRequest.Listener
                public void onSuccess(ImageRequest request, ImageResult3 result) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(result, "result");
                    Function0<Unit> function0 = onSuccess;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // coil.request.ImageRequest.Listener
                public void onError(ImageRequest request, ImageResult2 result) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(result, "result");
                    Function0<Unit> function0 = onError;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }).build());
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public void into(final ImageLoader.Target target) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.this$0.loader.enqueue(this.requestBuilder.target(new Target() { // from class: com.robinhood.android.rhimage.CoilImageLoader$ImageRequest$into$$inlined$target$1
                @Override // coil.target.Target
                public void onStart(Drawable placeholder) {
                    target.onStart(placeholder);
                }

                @Override // coil.target.Target
                public void onSuccess(Drawable result) {
                    target.onSuccess(result);
                }

                @Override // coil.target.Target
                public void onError(Drawable error) {
                    target.onError(error);
                }
            }).build());
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public void fetch(final Function0<Unit> onSuccess, final Function0<Unit> onError) {
            if (this.fit) {
                throw new IllegalStateException("Fit cannot be used with fetch.");
            }
            this.this$0.loader.enqueue(this.requestBuilder.listener(new ImageRequest.Listener() { // from class: com.robinhood.android.rhimage.CoilImageLoader$ImageRequest$fetch$request$1
                @Override // coil.request.ImageRequest.Listener
                public /* bridge */ /* synthetic */ void onCancel(ImageRequest imageRequest) {
                    super.onCancel(imageRequest);
                }

                @Override // coil.request.ImageRequest.Listener
                public /* bridge */ /* synthetic */ void onStart(ImageRequest imageRequest) {
                    super.onStart(imageRequest);
                }

                @Override // coil.request.ImageRequest.Listener
                public void onSuccess(ImageRequest request, ImageResult3 result) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(result, "result");
                    Function0<Unit> function0 = onSuccess;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // coil.request.ImageRequest.Listener
                public void onError(ImageRequest request, ImageResult2 result) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(result, "result");
                    Function0<Unit> function0 = onError;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }).build());
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest memoryPolicy(ImageLoader.MemoryPolicy memoryPolicy) {
            CachePolicy cachePolicy;
            Intrinsics.checkNotNullParameter(memoryPolicy, "memoryPolicy");
            ImageRequest.Builder builder = this.requestBuilder;
            int i = WhenMappings.$EnumSwitchMapping$0[memoryPolicy.ordinal()];
            if (i == 1) {
                cachePolicy = CachePolicy.DISABLED;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cachePolicy = CachePolicy.READ_ONLY;
            }
            builder.memoryCachePolicy(cachePolicy);
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest placeholder(int drawableResId) {
            this.requestBuilder.placeholder(drawableResId);
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest error(int drawableResId) {
            this.requestBuilder.error(drawableResId);
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest error(Drawable drawable) {
            this.requestBuilder.error(drawable);
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest fit() {
            this.fit = true;
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest centerCrop() {
            if (this.centerInside) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.centerCrop = true;
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest centerInside() {
            if (this.centerCrop) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.centerInside = true;
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest size(int width, int height) {
            this.requestBuilder.size(width, height);
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest noFade() {
            this.requestBuilder.crossfade(false);
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest noPlaceholder() {
            this.requestBuilder.placeholder((Drawable) null);
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest circle() {
            this.requestBuilder.transformations(new CircleCropTransformation());
            return this;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.ImageRequest
        public ImageLoader.ImageRequest rounded(float radius) {
            this.requestBuilder.transformations(new RoundedCornersTransformation(radius));
            return this;
        }
    }
}
