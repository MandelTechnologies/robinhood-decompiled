package coil;

import android.content.Context;
import coil.EventListener;
import coil.ImageLoader;
import coil.content.ImageLoaderOptions;
import coil.content.Requests;
import coil.content.SingletonDiskCache;
import coil.disk.DiskCache;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* compiled from: ImageLoader.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m3636d2 = {"Lcoil/ImageLoader;", "", "Lcoil/request/ImageRequest;", "request", "Lcoil/request/Disposable;", "enqueue", "(Lcoil/request/ImageRequest;)Lcoil/request/Disposable;", "Lcoil/request/ImageResult;", "execute", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shutdown", "()V", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "defaults", "Lcoil/ComponentRegistry;", "getComponents", "()Lcoil/ComponentRegistry;", "components", "Lcoil/memory/MemoryCache;", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "memoryCache", "Builder", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public interface ImageLoader {
    Disposable enqueue(ImageRequest request);

    Object execute(ImageRequest imageRequest, Continuation<? super ImageResult> continuation);

    ComponentRegistry getComponents();

    DefaultRequestOptions getDefaults();

    MemoryCache getMemoryCache();

    void shutdown();

    /* compiled from: ImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00002\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+R \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, m3636d2 = {"Lcoil/ImageLoader$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)Lcoil/ImageLoader$Builder;", "Lkotlin/Function0;", "initializer", "(Lkotlin/jvm/functions/Function0;)Lcoil/ImageLoader$Builder;", "Lokhttp3/Call$Factory;", "callFactory", "(Lokhttp3/Call$Factory;)Lcoil/ImageLoader$Builder;", "Lcoil/ComponentRegistry;", "components", "(Lcoil/ComponentRegistry;)Lcoil/ImageLoader$Builder;", "Lcoil/memory/MemoryCache;", "memoryCache", "Lcoil/disk/DiskCache;", "diskCache", "(Lcoil/disk/DiskCache;)Lcoil/ImageLoader$Builder;", "", "enable", "crossfade", "(Z)Lcoil/ImageLoader$Builder;", "", "durationMillis", "(I)Lcoil/ImageLoader$Builder;", "Lcoil/transition/Transition$Factory;", "factory", "transitionFactory", "(Lcoil/transition/Transition$Factory;)Lcoil/ImageLoader$Builder;", "Lcoil/ImageLoader;", "build", "()Lcoil/ImageLoader;", "applicationContext", "Landroid/content/Context;", "Lcoil/request/DefaultRequestOptions;", "defaults", "Lcoil/request/DefaultRequestOptions;", "Lkotlin/Lazy;", "Lkotlin/Lazy;", "Lcoil/EventListener$Factory;", "eventListenerFactory", "Lcoil/EventListener$Factory;", "componentRegistry", "Lcoil/ComponentRegistry;", "Lcoil/util/ImageLoaderOptions;", "options", "Lcoil/util/ImageLoaderOptions;", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Builder {
        private final Context applicationContext;
        private DefaultRequestOptions defaults = Requests.getDEFAULT_REQUEST_OPTIONS();
        private Lazy<? extends MemoryCache> memoryCache = null;
        private Lazy<? extends DiskCache> diskCache = null;
        private Lazy<? extends Call.Factory> callFactory = null;
        private EventListener.Factory eventListenerFactory = null;
        private ComponentRegistry componentRegistry = null;
        private ImageLoaderOptions options = new ImageLoaderOptions(false, false, false, 0, null, 31, null);

        public Builder(Context context) {
            this.applicationContext = context.getApplicationContext();
        }

        public final Builder okHttpClient(OkHttpClient okHttpClient) {
            return callFactory(okHttpClient);
        }

        public final Builder okHttpClient(Function0<? extends OkHttpClient> initializer) {
            return callFactory(initializer);
        }

        public final Builder callFactory(Call.Factory callFactory) {
            this.callFactory = LazyKt.lazyOf(callFactory);
            return this;
        }

        public final Builder callFactory(Function0<? extends Call.Factory> initializer) {
            this.callFactory = LazyKt.lazy(initializer);
            return this;
        }

        public final Builder components(ComponentRegistry components) {
            this.componentRegistry = components;
            return this;
        }

        public final Builder memoryCache(Function0<? extends MemoryCache> initializer) {
            this.memoryCache = LazyKt.lazy(initializer);
            return this;
        }

        public final Builder diskCache(DiskCache diskCache) {
            this.diskCache = LazyKt.lazyOf(diskCache);
            return this;
        }

        public final Builder crossfade(boolean enable) {
            return crossfade(enable ? 100 : 0);
        }

        public final Builder crossfade(int durationMillis) {
            Transition.Factory factory;
            if (durationMillis > 0) {
                factory = new CrossfadeTransition.Factory(durationMillis, false, 2, null);
            } else {
                factory = Transition.Factory.NONE;
            }
            transitionFactory(factory);
            return this;
        }

        public final Builder transitionFactory(Transition.Factory factory) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32751 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32751 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32751 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32751 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32751 & 16) != 0 ? defaultRequestOptions.transitionFactory : factory, (32751 & 32) != 0 ? defaultRequestOptions.precision : null, (32751 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32751 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32751 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32751 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32751 & 1024) != 0 ? defaultRequestOptions.error : null, (32751 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32751 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32751 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32751 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        public final ImageLoader build() {
            Context context = this.applicationContext;
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            Lazy<? extends MemoryCache> lazy = this.memoryCache;
            if (lazy == null) {
                lazy = LazyKt.lazy(new Function0() { // from class: coil.ImageLoader$Builder$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageLoader.Builder.build$lambda$33(this.f$0);
                    }
                });
            }
            Lazy<? extends DiskCache> lazy2 = this.diskCache;
            if (lazy2 == null) {
                lazy2 = LazyKt.lazy(new Function0() { // from class: coil.ImageLoader$Builder$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageLoader.Builder.build$lambda$34(this.f$0);
                    }
                });
            }
            Lazy<? extends Call.Factory> lazy3 = this.callFactory;
            if (lazy3 == null) {
                lazy3 = LazyKt.lazy(new Function0() { // from class: coil.ImageLoader$Builder$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageLoader.Builder.build$lambda$35();
                    }
                });
            }
            EventListener.Factory factory = this.eventListenerFactory;
            if (factory == null) {
                factory = EventListener.Factory.NONE;
            }
            ComponentRegistry componentRegistry = this.componentRegistry;
            if (componentRegistry == null) {
                componentRegistry = new ComponentRegistry();
            }
            return new RealImageLoader(context, defaultRequestOptions, lazy, lazy2, lazy3, factory, componentRegistry, this.options, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MemoryCache build$lambda$33(Builder builder) {
            return new MemoryCache.Builder(builder.applicationContext).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DiskCache build$lambda$34(Builder builder) {
            return SingletonDiskCache.INSTANCE.get(builder.applicationContext);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OkHttpClient build$lambda$35() {
            return new OkHttpClient();
        }
    }
}
