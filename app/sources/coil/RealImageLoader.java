package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import coil.EventListener;
import coil.content.ImageLoaderOptions;
import coil.content.Lifecycles;
import coil.content.Logger;
import coil.content.SystemCallbacks;
import coil.content.Utils;
import coil.decode.BitmapFactoryDecoder;
import coil.disk.DiskCache;
import coil.fetch.AssetUriFetcher;
import coil.fetch.BitmapFetcher;
import coil.fetch.ByteBufferFetcher;
import coil.fetch.ContentUriFetcher;
import coil.fetch.DrawableFetcher;
import coil.fetch.FileFetcher;
import coil.fetch.HttpUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.intercept.Interceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.Disposable2;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.ImageResult2;
import coil.request.ImageResult3;
import coil.request.NullRequestData;
import coil.request.NullRequestDataException;
import coil.request.RequestDelegate;
import coil.request.RequestService;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.NoneTransition;
import coil.transition.Transition;
import coil.transition.TransitionTarget;
import com.plaid.internal.EnumC7081g;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Supervisor3;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* compiled from: RealImageLoader.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 e2\u00020\u0001:\u0001eBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0083@¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020'2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u00020$2\u0006\u00102\u001a\u00020\u0019H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u00020$H\u0016¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bA\u0010@R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bB\u0010@R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010F\u001a\u0004\bV\u0010HR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u00106\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\\R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010]\u001a\u0004\b^\u0010_R\u001d\u0010d\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b`\u0010a*\u0004\bb\u0010c¨\u0006f"}, m3636d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "Landroid/content/Context;", "context", "Lcoil/request/DefaultRequestOptions;", "defaults", "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "memoryCacheLazy", "Lcoil/disk/DiskCache;", "diskCacheLazy", "Lokhttp3/Call$Factory;", "callFactoryLazy", "Lcoil/EventListener$Factory;", "eventListenerFactory", "Lcoil/ComponentRegistry;", "componentRegistry", "Lcoil/util/ImageLoaderOptions;", "options", "Lcoil/util/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil/EventListener$Factory;Lcoil/ComponentRegistry;Lcoil/util/ImageLoaderOptions;Lcoil/util/Logger;)V", "Lcoil/request/ImageRequest;", "initialRequest", "", "type", "Lcoil/request/ImageResult;", "executeMain", "(Lcoil/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcoil/request/SuccessResult;", "result", "Lcoil/target/Target;", "target", "Lcoil/EventListener;", "eventListener", "", "onSuccess", "(Lcoil/request/SuccessResult;Lcoil/target/Target;Lcoil/EventListener;)V", "Lcoil/request/ErrorResult;", "onError", "(Lcoil/request/ErrorResult;Lcoil/target/Target;Lcoil/EventListener;)V", "request", "onCancel", "(Lcoil/request/ImageRequest;Lcoil/EventListener;)V", "Lcoil/request/Disposable;", "enqueue", "(Lcoil/request/ImageRequest;)Lcoil/request/Disposable;", "execute", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "level", "onTrimMemory$coil_base_release", "(I)V", "onTrimMemory", "shutdown", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "Lkotlin/Lazy;", "getMemoryCacheLazy", "()Lkotlin/Lazy;", "getDiskCacheLazy", "getCallFactoryLazy", "Lcoil/EventListener$Factory;", "getEventListenerFactory", "()Lcoil/EventListener$Factory;", "Lcoil/ComponentRegistry;", "getComponentRegistry", "()Lcoil/ComponentRegistry;", "Lcoil/util/ImageLoaderOptions;", "getOptions", "()Lcoil/util/ImageLoaderOptions;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lcoil/util/SystemCallbacks;", "systemCallbacks", "Lcoil/util/SystemCallbacks;", "Lcoil/request/RequestService;", "requestService", "Lcoil/request/RequestService;", "components", "getComponents", "", "Lcoil/intercept/Interceptor;", "interceptors", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcoil/util/Logger;", "getLogger", "()Lcoil/util/Logger;", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "getMemoryCache$delegate", "(Lcoil/RealImageLoader;)Ljava/lang/Object;", "memoryCache", "Companion", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealImageLoader implements ImageLoader {
    private final Lazy<Call.Factory> callFactoryLazy;
    private final ComponentRegistry componentRegistry;
    private final ComponentRegistry components;
    private final Context context;
    private final DefaultRequestOptions defaults;
    private final Lazy<DiskCache> diskCacheLazy;
    private final EventListener.Factory eventListenerFactory;
    private final List<Interceptor> interceptors;
    private final Lazy<MemoryCache> memoryCacheLazy;
    private final ImageLoaderOptions options;
    private final RequestService requestService;
    private final CoroutineScope scope = CoroutineScope2.CoroutineScope(Supervisor3.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new CoroutineExceptionHandler3(CoroutineExceptionHandler.INSTANCE, this)));
    private final AtomicBoolean shutdown;
    private final SystemCallbacks systemCallbacks;

    /* compiled from: RealImageLoader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.RealImageLoader", m3645f = "RealImageLoader.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "executeMain")
    /* renamed from: coil.RealImageLoader$executeMain$1 */
    static final class C46131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C46131(Continuation<? super C46131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealImageLoader.this.executeMain(null, 0, this);
        }
    }

    public final Logger getLogger() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealImageLoader(Context context, DefaultRequestOptions defaultRequestOptions, Lazy<? extends MemoryCache> lazy, Lazy<? extends DiskCache> lazy2, Lazy<? extends Call.Factory> lazy3, EventListener.Factory factory, ComponentRegistry componentRegistry, ImageLoaderOptions imageLoaderOptions, Logger logger) {
        this.context = context;
        this.defaults = defaultRequestOptions;
        this.memoryCacheLazy = lazy;
        this.diskCacheLazy = lazy2;
        this.callFactoryLazy = lazy3;
        this.eventListenerFactory = factory;
        this.componentRegistry = componentRegistry;
        this.options = imageLoaderOptions;
        SystemCallbacks systemCallbacks = new SystemCallbacks(this);
        this.systemCallbacks = systemCallbacks;
        RequestService requestService = new RequestService(this, systemCallbacks, null);
        this.requestService = requestService;
        this.components = componentRegistry.newBuilder().add(new HttpUrlMapper(), HttpUrl.class).add(new StringMapper(), String.class).add(new FileUriMapper(), Uri.class).add(new ResourceUriMapper(), Uri.class).add(new ResourceIntMapper(), Integer.class).add(new ByteArrayMapper(), byte[].class).add(new UriKeyer(), Uri.class).add(new FileKeyer(imageLoaderOptions.getAddLastModifiedToFileCacheKey()), File.class).add(new HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.getRespectCacheHeaders()), Uri.class).add(new FileFetcher.Factory(), File.class).add(new AssetUriFetcher.Factory(), Uri.class).add(new ContentUriFetcher.Factory(), Uri.class).add(new ResourceUriFetcher.Factory(), Uri.class).add(new DrawableFetcher.Factory(), Drawable.class).add(new BitmapFetcher.Factory(), Bitmap.class).add(new ByteBufferFetcher.Factory(), ByteBuffer.class).add(new BitmapFactoryDecoder.Factory(imageLoaderOptions.getBitmapFactoryMaxParallelism(), imageLoaderOptions.getBitmapFactoryExifOrientationPolicy())).build();
        this.interceptors = CollectionsKt.plus((Collection<? extends EngineInterceptor>) getComponents().getInterceptors(), new EngineInterceptor(this, systemCallbacks, requestService, null));
        this.shutdown = new AtomicBoolean(false);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // coil.ImageLoader
    public DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    public final ImageLoaderOptions getOptions() {
        return this.options;
    }

    @Override // coil.ImageLoader
    public MemoryCache getMemoryCache() {
        return this.memoryCacheLazy.getValue();
    }

    @Override // coil.ImageLoader
    public ComponentRegistry getComponents() {
        return this.components;
    }

    @Override // coil.ImageLoader
    public Disposable enqueue(ImageRequest request) {
        Deferred<? extends ImageResult> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new RealImageLoader2(this, request, null), 3, null);
        if (request.getTarget() instanceof ViewTarget) {
            return Utils.getRequestManager(((ViewTarget) request.getTarget()).getView()).getDisposable(deferredAsync$default);
        }
        return new Disposable2(deferredAsync$default);
    }

    @Override // coil.ImageLoader
    public Object execute(ImageRequest imageRequest, Continuation<? super ImageResult> continuation) {
        if (imageRequest.getTarget() instanceof ViewTarget) {
            return CoroutineScope2.coroutineScope(new C46112(imageRequest, this, null), continuation);
        }
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new C46123(imageRequest, null), continuation);
    }

    /* compiled from: RealImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.RealImageLoader$execute$2", m3645f = "RealImageLoader.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: coil.RealImageLoader$execute$2 */
    static final class C46112 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
        final /* synthetic */ ImageRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RealImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46112(ImageRequest imageRequest, RealImageLoader realImageLoader, Continuation<? super C46112> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.this$0 = realImageLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C46112 c46112 = new C46112(this.$request, this.this$0, continuation);
            c46112.L$0 = obj;
            return c46112;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageResult> continuation) {
            return ((C46112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred<? extends ImageResult> deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getMain().getImmediate(), null, new RealImageLoader3(this.this$0, this.$request, null), 2, null);
            Utils.getRequestManager(((ViewTarget) this.$request.getTarget()).getView()).getDisposable(deferredAsync$default);
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }
    }

    /* compiled from: RealImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.RealImageLoader$execute$3", m3645f = "RealImageLoader.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: coil.RealImageLoader$execute$3 */
    /* loaded from: classes16.dex */
    static final class C46123 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
        final /* synthetic */ ImageRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46123(ImageRequest imageRequest, Continuation<? super C46123> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealImageLoader.this.new C46123(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageResult> continuation) {
            return ((C46123) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            RealImageLoader realImageLoader = RealImageLoader.this;
            ImageRequest imageRequest = this.$request;
            this.label = 1;
            Object objExecuteMain = realImageLoader.executeMain(imageRequest, 1, this);
            return objExecuteMain == coroutine_suspended ? coroutine_suspended : objExecuteMain;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(4:(1:(7:13|114|14|76|(1:78)(2:79|(1:81)(2:84|85))|82|83)(2:18|19))(13:20|107|21|22|23|103|69|70|112|71|72|(5:75|76|(0)(0)|82|83)|74)|109|92|(3:94|95|96)(2:99|100))(4:26|105|27|41))(4:32|115|33|(2:35|(3:37|(2:40|41)|74)(1:44))(2:90|91))|110|45|(11:47|(1:49)(1:52)|(1:54)|(1:57)(1:58)|59|(1:61)|62|(1:64)|65|(9:68|23|103|69|70|112|71|72|(0))|74)|55|(0)(0)|59|(0)|62|(0)|65|(0)|74|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        r6 = r2;
        r4 = r5;
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:14:0x0046, B:76:0x0187, B:78:0x018d, B:79:0x0198, B:81:0x019c, B:84:0x01aa, B:85:0x01af), top: B:114:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198 A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:14:0x0046, B:76:0x0187, B:78:0x018d, B:79:0x0198, B:81:0x019c, B:84:0x01aa, B:85:0x01af), top: B:114:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4 A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #3 {all -> 0x01d5, blocks: (B:92:0x01c0, B:94:0x01c4, B:99:0x01d7, B:100:0x01da), top: B:109:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7 A[Catch: all -> 0x01d5, TRY_ENTER, TryCatch #3 {all -> 0x01d5, blocks: (B:92:0x01c0, B:94:0x01c4, B:99:0x01d7, B:100:0x01da), top: B:109:0x01c0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeMain(ImageRequest imageRequest, int i, Continuation<? super ImageResult> continuation) {
        C46131 c46131;
        RequestDelegate requestDelegate;
        ImageRequest imageRequestBuild;
        RealImageLoader realImageLoader;
        RequestDelegate requestDelegate2;
        EventListener eventListener;
        RealImageLoader realImageLoader2;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        RequestDelegate requestDelegate3;
        Bitmap bitmap;
        Drawable placeholder;
        Target target;
        ImageRequest.Listener listener;
        Object size;
        ImageRequest imageRequest3;
        RealImageLoader realImageLoader3;
        RequestDelegate requestDelegate4;
        Object obj;
        EventListener eventListener3;
        Object objWithContext;
        Object obj2;
        ImageResult imageResult;
        if (continuation instanceof C46131) {
            c46131 = (C46131) continuation;
            int i2 = c46131.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c46131.label = i2 - Integer.MIN_VALUE;
            } else {
                c46131 = new C46131(continuation);
            }
        }
        Object obj3 = c46131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c46131.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj3);
            requestDelegate = this.requestService.requestDelegate(imageRequest, JobKt.getJob(c46131.getContext()));
            requestDelegate.assertActive();
            imageRequestBuild = ImageRequest.newBuilder$default(imageRequest, null, 1, null).defaults(getDefaults()).build();
            EventListener eventListenerCreate = this.eventListenerFactory.create(imageRequestBuild);
            try {
                if (imageRequestBuild.getData() == NullRequestData.INSTANCE) {
                    throw new NullRequestDataException();
                }
                requestDelegate.start();
                if (i == 0) {
                    Lifecycle lifecycle = imageRequestBuild.getLifecycle();
                    c46131.L$0 = this;
                    c46131.L$1 = requestDelegate;
                    c46131.L$2 = imageRequestBuild;
                    c46131.L$3 = eventListenerCreate;
                    c46131.label = 1;
                    if (Lifecycles.awaitStarted(lifecycle, c46131) != coroutine_suspended) {
                        realImageLoader2 = this;
                        imageRequest2 = imageRequestBuild;
                        eventListener2 = eventListenerCreate;
                        requestDelegate3 = requestDelegate;
                        requestDelegate = requestDelegate3;
                    }
                    return coroutine_suspended;
                }
                realImageLoader2 = this;
                imageRequest2 = imageRequestBuild;
                eventListener2 = eventListenerCreate;
            } catch (Throwable th) {
                th = th;
                realImageLoader = this;
                requestDelegate2 = requestDelegate;
                eventListener = eventListenerCreate;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    bitmap = (Bitmap) c46131.L$4;
                    eventListener2 = (EventListener) c46131.L$3;
                    ImageRequest imageRequest4 = (ImageRequest) c46131.L$2;
                    requestDelegate4 = (RequestDelegate) c46131.L$1;
                    RealImageLoader realImageLoader4 = (RealImageLoader) c46131.L$0;
                    try {
                        ResultKt.throwOnFailure(obj3);
                        imageRequest3 = imageRequest4;
                        realImageLoader3 = realImageLoader4;
                        obj = obj3;
                        Bitmap bitmap2 = bitmap;
                        try {
                            Size size2 = (Size) obj;
                            eventListener2.resolveSizeEnd(imageRequest3, size2);
                            CoroutineDispatcher interceptorDispatcher = imageRequest3.getInterceptorDispatcher();
                            eventListener3 = eventListener2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        eventListener = eventListener2;
                        imageRequestBuild = imageRequest4;
                        requestDelegate2 = requestDelegate4;
                        realImageLoader = realImageLoader4;
                    }
                    try {
                        RealImageLoader4 realImageLoader42 = new RealImageLoader4(imageRequest3, realImageLoader3, size2, eventListener3, bitmap2, null);
                        c46131.L$0 = realImageLoader3;
                        c46131.L$1 = requestDelegate4;
                        c46131.L$2 = imageRequest3;
                        c46131.L$3 = eventListener2;
                        c46131.L$4 = null;
                        c46131.label = 3;
                        objWithContext = BuildersKt.withContext(interceptorDispatcher, realImageLoader42, c46131);
                        if (objWithContext != coroutine_suspended) {
                            eventListener = eventListener2;
                            requestDelegate2 = requestDelegate4;
                            imageRequestBuild = imageRequest3;
                            realImageLoader = realImageLoader3;
                            obj2 = objWithContext;
                            imageResult = (ImageResult) obj2;
                            if (!(imageResult instanceof ImageResult3)) {
                            }
                            return imageResult;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th = th4;
                        eventListener2 = eventListener3;
                        eventListener = eventListener2;
                        requestDelegate2 = requestDelegate4;
                        imageRequestBuild = imageRequest3;
                        realImageLoader = realImageLoader3;
                        if (!(th instanceof CancellationException)) {
                        }
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eventListener = (EventListener) c46131.L$3;
                    imageRequestBuild = (ImageRequest) c46131.L$2;
                    requestDelegate2 = (RequestDelegate) c46131.L$1;
                    realImageLoader = (RealImageLoader) c46131.L$0;
                    try {
                        ResultKt.throwOnFailure(obj3);
                        obj2 = obj3;
                        imageResult = (ImageResult) obj2;
                        if (!(imageResult instanceof ImageResult3)) {
                            realImageLoader.onSuccess((ImageResult3) imageResult, imageRequestBuild.getTarget(), eventListener);
                        } else {
                            if (!(imageResult instanceof ImageResult2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            realImageLoader.onError((ImageResult2) imageResult, imageRequestBuild.getTarget(), eventListener);
                        }
                        return imageResult;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                try {
                    if (!(th instanceof CancellationException)) {
                        realImageLoader.onCancel(imageRequestBuild, eventListener);
                        throw th;
                    }
                    ImageResult2 imageResult2ErrorResult = realImageLoader.requestService.errorResult(imageRequestBuild, th);
                    realImageLoader.onError(imageResult2ErrorResult, imageRequestBuild.getTarget(), eventListener);
                    return imageResult2ErrorResult;
                } finally {
                    requestDelegate2.complete();
                }
            }
            eventListener2 = (EventListener) c46131.L$3;
            imageRequest2 = (ImageRequest) c46131.L$2;
            requestDelegate3 = (RequestDelegate) c46131.L$1;
            realImageLoader2 = (RealImageLoader) c46131.L$0;
            try {
                ResultKt.throwOnFailure(obj3);
                requestDelegate = requestDelegate3;
            } catch (Throwable th6) {
                th = th6;
                eventListener = eventListener2;
                imageRequestBuild = imageRequest2;
                requestDelegate2 = requestDelegate3;
                realImageLoader = realImageLoader2;
                if (!(th instanceof CancellationException)) {
                }
            }
        }
        MemoryCache memoryCache = realImageLoader2.getMemoryCache();
        if (memoryCache != null) {
            MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
            MemoryCache.Value value = placeholderMemoryCacheKey != null ? memoryCache.get(placeholderMemoryCacheKey) : null;
            if (value != null) {
                bitmap = value.getBitmap();
            }
            if (bitmap != null) {
                placeholder = imageRequest2.getPlaceholder();
            } else {
                placeholder = new BitmapDrawable(imageRequest2.getContext().getResources(), bitmap);
            }
            target = imageRequest2.getTarget();
            if (target != null) {
                target.onStart(placeholder);
            }
            eventListener2.onStart(imageRequest2);
            listener = imageRequest2.getListener();
            if (listener != null) {
                listener.onStart(imageRequest2);
            }
            eventListener2.resolveSizeStart(imageRequest2);
            SizeResolver sizeResolver = imageRequest2.getSizeResolver();
            c46131.L$0 = realImageLoader2;
            c46131.L$1 = requestDelegate;
            c46131.L$2 = imageRequest2;
            c46131.L$3 = eventListener2;
            c46131.L$4 = bitmap;
            c46131.label = 2;
            size = sizeResolver.size(c46131);
            if (size != coroutine_suspended) {
                imageRequest3 = imageRequest2;
                realImageLoader3 = realImageLoader2;
                requestDelegate4 = requestDelegate;
                obj = size;
                Bitmap bitmap22 = bitmap;
                Size size22 = (Size) obj;
                eventListener2.resolveSizeEnd(imageRequest3, size22);
                CoroutineDispatcher interceptorDispatcher2 = imageRequest3.getInterceptorDispatcher();
                eventListener3 = eventListener2;
                RealImageLoader4 realImageLoader422 = new RealImageLoader4(imageRequest3, realImageLoader3, size22, eventListener3, bitmap22, null);
                c46131.L$0 = realImageLoader3;
                c46131.L$1 = requestDelegate4;
                c46131.L$2 = imageRequest3;
                c46131.L$3 = eventListener2;
                c46131.L$4 = null;
                c46131.label = 3;
                objWithContext = BuildersKt.withContext(interceptorDispatcher2, realImageLoader422, c46131);
                if (objWithContext != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        bitmap = null;
        if (bitmap != null) {
        }
        target = imageRequest2.getTarget();
        if (target != null) {
        }
        eventListener2.onStart(imageRequest2);
        listener = imageRequest2.getListener();
        if (listener != null) {
        }
        eventListener2.resolveSizeStart(imageRequest2);
        SizeResolver sizeResolver2 = imageRequest2.getSizeResolver();
        c46131.L$0 = realImageLoader2;
        c46131.L$1 = requestDelegate;
        c46131.L$2 = imageRequest2;
        c46131.L$3 = eventListener2;
        c46131.L$4 = bitmap;
        c46131.label = 2;
        size = sizeResolver2.size(c46131);
        if (size != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final void onTrimMemory$coil_base_release(int level) {
        MemoryCache value;
        Lazy<MemoryCache> lazy = this.memoryCacheLazy;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return;
        }
        value.trimMemory(level);
    }

    @Override // coil.ImageLoader
    public void shutdown() {
        if (this.shutdown.getAndSet(true)) {
            return;
        }
        CoroutineScope2.cancel$default(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onSuccess(ImageResult3 result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        result.getDataSource();
        if (target instanceof TransitionTarget) {
            Transition transitionCreate = result.getRequest().getTransitionFactory().create((TransitionTarget) target, result);
            if (!(transitionCreate instanceof NoneTransition)) {
                eventListener.transitionStart(result.getRequest(), transitionCreate);
                transitionCreate.transition();
                eventListener.transitionEnd(result.getRequest(), transitionCreate);
            }
        } else if (target != null) {
            target.onSuccess(result.getDrawable());
        }
        eventListener.onSuccess(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, result);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onError(ImageResult2 result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        if (target instanceof TransitionTarget) {
            Transition transitionCreate = result.getRequest().getTransitionFactory().create((TransitionTarget) target, result);
            if (!(transitionCreate instanceof NoneTransition)) {
                eventListener.transitionStart(result.getRequest(), transitionCreate);
                transitionCreate.transition();
                eventListener.transitionEnd(result.getRequest(), transitionCreate);
            }
        } else if (target != null) {
            target.onError(result.getDrawable());
        }
        eventListener.onError(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, result);
        }
    }

    private final void onCancel(ImageRequest request, EventListener eventListener) {
        eventListener.onCancel(request);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onCancel(request);
        }
    }
}
