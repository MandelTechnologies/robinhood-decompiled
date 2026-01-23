package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.ImageLoader;
import coil.content.Bitmaps;
import coil.content.DrawableUtils;
import coil.content.Logger;
import coil.content.SystemCallbacks;
import coil.content.Utils;
import coil.decode.DataSource;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import coil.decode.ImageSource4;
import coil.fetch.FetchResult;
import coil.fetch.FetchResult2;
import coil.fetch.FetchResult3;
import coil.fetch.Fetcher;
import coil.intercept.Interceptor;
import coil.memory.MemoryCache;
import coil.memory.MemoryCacheService;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.ImageResult3;
import coil.request.Options;
import coil.request.RequestService;
import coil.size.Scale;
import coil.size.Size;
import coil.transform.Transformation;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.utils.extensions.ResourceTypes;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EngineInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 82\u00020\u0001:\u000298B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010-J0\u00101\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0081@¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, m3636d2 = {"Lcoil/intercept/EngineInterceptor;", "Lcoil/intercept/Interceptor;", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/util/SystemCallbacks;", "systemCallbacks", "Lcoil/request/RequestService;", "requestService", "Lcoil/util/Logger;", "logger", "<init>", "(Lcoil/ImageLoader;Lcoil/util/SystemCallbacks;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "Lcoil/request/ImageRequest;", "request", "", "mappedData", "Lcoil/request/Options;", "_options", "Lcoil/EventListener;", "eventListener", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "execute", "(Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcoil/ComponentRegistry;", "components", "options", "Lcoil/fetch/FetchResult;", "fetch", "(Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcoil/fetch/SourceResult;", "fetchResult", "decode", "(Lcoil/fetch/SourceResult;Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", ResourceTypes.DRAWABLE, "", "Lcoil/transform/Transformation;", "transformations", "Landroid/graphics/Bitmap;", "convertDrawableToBitmap", "(Landroid/graphics/drawable/Drawable;Lcoil/request/Options;Ljava/util/List;)Landroid/graphics/Bitmap;", "Lcoil/intercept/Interceptor$Chain;", TransitionReason.OPTION_TRADE_CHAIN, "Lcoil/request/ImageResult;", "intercept", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "transform$coil_base_release", "(Lcoil/intercept/EngineInterceptor$ExecuteResult;Lcoil/request/ImageRequest;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transform", "Lcoil/ImageLoader;", "Lcoil/util/SystemCallbacks;", "Lcoil/request/RequestService;", "Lcoil/memory/MemoryCacheService;", "memoryCacheService", "Lcoil/memory/MemoryCacheService;", "Companion", "ExecuteResult", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class EngineInterceptor implements Interceptor {
    private final ImageLoader imageLoader;
    private final MemoryCacheService memoryCacheService;
    private final RequestService requestService;
    private final SystemCallbacks systemCallbacks;

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.intercept.EngineInterceptor", m3645f = "EngineInterceptor.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "decode")
    /* renamed from: coil.intercept.EngineInterceptor$decode$1 */
    static final class C46301 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C46301(Continuation<? super C46301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.decode(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.intercept.EngineInterceptor", m3645f = "EngineInterceptor.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "execute")
    /* renamed from: coil.intercept.EngineInterceptor$execute$1 */
    static final class C46311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C46311(Continuation<? super C46311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.execute(null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.intercept.EngineInterceptor", m3645f = "EngineInterceptor.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "fetch")
    /* renamed from: coil.intercept.EngineInterceptor$fetch$1 */
    static final class C46321 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C46321(Continuation<? super C46321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.fetch(null, null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.intercept.EngineInterceptor", m3645f = "EngineInterceptor.kt", m3646l = {75}, m3647m = "intercept")
    /* renamed from: coil.intercept.EngineInterceptor$intercept$1 */
    static final class C46331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C46331(Continuation<? super C46331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.intercept(null, this);
        }
    }

    public EngineInterceptor(ImageLoader imageLoader, SystemCallbacks systemCallbacks, RequestService requestService, Logger logger) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = systemCallbacks;
        this.requestService = requestService;
        this.memoryCacheService = new MemoryCacheService(imageLoader, requestService, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(Interceptor.Chain chain, Continuation<? super ImageResult> continuation) throws Throwable {
        C46331 c46331;
        Throwable th;
        EngineInterceptor engineInterceptor;
        MemoryCache.Value cacheValue;
        if (continuation instanceof C46331) {
            c46331 = (C46331) continuation;
            int i = c46331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c46331.label = i - Integer.MIN_VALUE;
            } else {
                c46331 = new C46331(continuation);
            }
        }
        Object obj = c46331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c46331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ImageRequest request = chain.getRequest();
                Object data = request.getData();
                Size size = chain.getSize();
                EventListener eventListener = Utils.getEventListener(chain);
                Options options = this.requestService.options(request, size);
                Scale scale = options.getScale();
                eventListener.mapStart(request, data);
                Object map = this.imageLoader.getComponents().map(data, options);
                eventListener.mapEnd(request, map);
                MemoryCache.Key keyNewCacheKey = this.memoryCacheService.newCacheKey(request, map, options, eventListener);
                if (keyNewCacheKey != null) {
                    try {
                        cacheValue = this.memoryCacheService.getCacheValue(request, keyNewCacheKey, size, scale);
                    } catch (Throwable th2) {
                        th = th2;
                        engineInterceptor = this;
                    }
                } else {
                    cacheValue = null;
                }
                if (cacheValue != null) {
                    return this.memoryCacheService.newResult(chain, request, keyNewCacheKey, cacheValue);
                }
                CoroutineDispatcher fetcherDispatcher = request.getFetcherDispatcher();
                try {
                    C46342 c46342 = new C46342(request, map, options, eventListener, keyNewCacheKey, chain, null);
                    c46331.L$0 = this;
                    c46331.L$1 = chain;
                    c46331.label = 1;
                    Object objWithContext = BuildersKt.withContext(fetcherDispatcher, c46342, c46331);
                    return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
                } catch (Throwable th3) {
                    th = th3;
                    engineInterceptor = this;
                    chain = chain;
                }
            } catch (Throwable th4) {
                th = th4;
                engineInterceptor = this;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chain = (Interceptor.Chain) c46331.L$1;
            engineInterceptor = (EngineInterceptor) c46331.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return engineInterceptor.requestService.errorResult(chain.getRequest(), th);
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcoil/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.intercept.EngineInterceptor$intercept$2", m3645f = "EngineInterceptor.kt", m3646l = {77}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: coil.intercept.EngineInterceptor$intercept$2 */
    static final class C46342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ImageResult3>, Object> {
        final /* synthetic */ MemoryCache.Key $cacheKey;
        final /* synthetic */ Interceptor.Chain $chain;
        final /* synthetic */ EventListener $eventListener;
        final /* synthetic */ Object $mappedData;
        final /* synthetic */ Options $options;
        final /* synthetic */ ImageRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46342(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, MemoryCache.Key key, Interceptor.Chain chain, Continuation<? super C46342> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.$mappedData = obj;
            this.$options = options;
            this.$eventListener = eventListener;
            this.$cacheKey = key;
            this.$chain = chain;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EngineInterceptor.this.new C46342(this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageResult3> continuation) {
            return ((C46342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objExecute;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EngineInterceptor engineInterceptor = EngineInterceptor.this;
                ImageRequest imageRequest = this.$request;
                Object obj2 = this.$mappedData;
                Options options = this.$options;
                EventListener eventListener = this.$eventListener;
                this.label = 1;
                objExecute = engineInterceptor.execute(imageRequest, obj2, options, eventListener, this);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objExecute = obj;
            }
            ExecuteResult executeResult = (ExecuteResult) objExecute;
            EngineInterceptor.this.systemCallbacks.registerMemoryPressureCallbacks();
            boolean cacheValue = EngineInterceptor.this.memoryCacheService.setCacheValue(this.$cacheKey, this.$request, executeResult);
            Drawable drawable = executeResult.getDrawable();
            ImageRequest imageRequest2 = this.$request;
            DataSource dataSource = executeResult.getDataSource();
            MemoryCache.Key key = this.$cacheKey;
            if (!cacheValue) {
                key = null;
            }
            return new ImageResult3(drawable, imageRequest2, dataSource, key, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), Utils.isPlaceholderCached(this.$chain));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d3, code lost:
    
        if (r0 == r9) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, coil.request.Options] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) throws Throwable {
        C46311 c46311;
        FetchResult3 fetchResult3;
        ImageSource source;
        EngineInterceptor engineInterceptor;
        ImageRequest imageRequest2;
        Object obj2;
        EventListener eventListener2;
        Ref.ObjectRef objectRef;
        T t;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        ImageRequest imageRequest3;
        Ref.ObjectRef objectRef6;
        EventListener eventListener3;
        ExecuteResult executeResult;
        EventListener eventListener4;
        EngineInterceptor engineInterceptor2;
        FetchResult3 fetchResult32;
        ImageSource source2;
        Object obj3;
        Object obj4;
        Bitmap bitmap;
        if (continuation instanceof C46311) {
            c46311 = (C46311) continuation;
            int i = c46311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c46311.label = i - Integer.MIN_VALUE;
            } else {
                c46311 = new C46311(continuation);
            }
        }
        C46311 c463112 = c46311;
        Object obj5 = c463112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Ref.ObjectRef objectRef7 = c463112.label;
        try {
            if (objectRef7 == 0) {
                ResultKt.throwOnFailure(obj5);
                Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                objectRef8.element = options;
                Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                objectRef9.element = this.imageLoader.getComponents();
                Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                try {
                    objectRef8.element = this.requestService.updateOptionsOnWorkerThread((Options) objectRef8.element);
                    if (imageRequest.getFetcherFactory() != null || imageRequest.getDecoderFactory() != null) {
                        ComponentRegistry.Builder builderNewBuilder = ((ComponentRegistry) objectRef9.element).newBuilder();
                        Tuples2<Fetcher.Factory<?>, Class<?>> fetcherFactory = imageRequest.getFetcherFactory();
                        if (fetcherFactory != null) {
                            builderNewBuilder.getFetcherFactories$coil_base_release().add(0, fetcherFactory);
                        }
                        Decoder.Factory decoderFactory = imageRequest.getDecoderFactory();
                        if (decoderFactory != null) {
                            builderNewBuilder.getDecoderFactories$coil_base_release().add(0, decoderFactory);
                        }
                        objectRef9.element = builderNewBuilder.build();
                    }
                    ComponentRegistry componentRegistry = (ComponentRegistry) objectRef9.element;
                    Options options2 = (Options) objectRef8.element;
                    c463112.L$0 = this;
                    c463112.L$1 = imageRequest;
                    c463112.L$2 = obj;
                    c463112.L$3 = eventListener;
                    c463112.L$4 = objectRef8;
                    c463112.L$5 = objectRef9;
                    c463112.L$6 = objectRef10;
                    c463112.L$7 = objectRef10;
                    c463112.label = 1;
                    Object objFetch = fetch(componentRegistry, imageRequest, obj, options2, eventListener, c463112);
                    if (objFetch != coroutine_suspended) {
                        engineInterceptor = this;
                        imageRequest2 = imageRequest;
                        obj2 = obj;
                        eventListener2 = eventListener;
                        objectRef = objectRef8;
                        t = objFetch;
                        objectRef2 = objectRef9;
                        objectRef3 = objectRef10;
                        objectRef4 = objectRef3;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    th = th;
                    objectRef7 = objectRef10;
                    T t2 = objectRef7.element;
                    if (t2 instanceof FetchResult3) {
                    }
                    if (fetchResult3 != null) {
                        Utils.closeQuietly(source);
                    }
                    throw th;
                }
            }
            if (objectRef7 == 1) {
                objectRef3 = (Ref.ObjectRef) c463112.L$7;
                objectRef4 = (Ref.ObjectRef) c463112.L$6;
                Ref.ObjectRef objectRef11 = (Ref.ObjectRef) c463112.L$5;
                Ref.ObjectRef objectRef12 = (Ref.ObjectRef) c463112.L$4;
                EventListener eventListener5 = (EventListener) c463112.L$3;
                Object obj6 = c463112.L$2;
                ImageRequest imageRequest4 = (ImageRequest) c463112.L$1;
                EngineInterceptor engineInterceptor3 = (EngineInterceptor) c463112.L$0;
                try {
                    ResultKt.throwOnFailure(obj5);
                    objectRef2 = objectRef11;
                    objectRef = objectRef12;
                    eventListener2 = eventListener5;
                    obj2 = obj6;
                    imageRequest2 = imageRequest4;
                    engineInterceptor = engineInterceptor3;
                    t = obj5;
                } catch (Throwable th2) {
                    th = th2;
                    objectRef7 = objectRef4;
                    T t22 = objectRef7.element;
                    if (t22 instanceof FetchResult3) {
                    }
                    if (fetchResult3 != null) {
                    }
                    throw th;
                }
            } else {
                if (objectRef7 != 2) {
                    if (objectRef7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj5);
                    obj4 = obj5;
                    ExecuteResult executeResult2 = (ExecuteResult) obj4;
                    Drawable drawable = executeResult2.getDrawable();
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        bitmap.prepareToDraw();
                    }
                    return executeResult2;
                }
                objectRef5 = (Ref.ObjectRef) c463112.L$4;
                objectRef6 = (Ref.ObjectRef) c463112.L$3;
                eventListener4 = (EventListener) c463112.L$2;
                imageRequest3 = (ImageRequest) c463112.L$1;
                engineInterceptor2 = (EngineInterceptor) c463112.L$0;
                ResultKt.throwOnFailure(obj5);
                obj3 = obj5;
                eventListener3 = eventListener4;
                engineInterceptor = engineInterceptor2;
                executeResult = (ExecuteResult) obj3;
                Ref.ObjectRef objectRef13 = objectRef6;
                T t3 = objectRef5.element;
                fetchResult32 = t3 instanceof FetchResult3 ? (FetchResult3) t3 : null;
                if (fetchResult32 != null && (source2 = fetchResult32.getSource()) != null) {
                    Utils.closeQuietly(source2);
                }
                Options options3 = (Options) objectRef13.element;
                c463112.L$0 = null;
                c463112.L$1 = null;
                c463112.L$2 = null;
                c463112.L$3 = null;
                c463112.L$4 = null;
                c463112.L$5 = null;
                c463112.L$6 = null;
                c463112.L$7 = null;
                c463112.label = 3;
                Object objTransform$coil_base_release = engineInterceptor.transform$coil_base_release(executeResult, imageRequest3, options3, eventListener3, c463112);
                obj4 = objTransform$coil_base_release;
            }
            objectRef3.element = t;
            T t4 = objectRef4.element;
            FetchResult fetchResult = (FetchResult) t4;
            if (!(fetchResult instanceof FetchResult3)) {
                objectRef5 = objectRef4;
                imageRequest3 = imageRequest2;
                objectRef6 = objectRef;
                EventListener eventListener6 = eventListener2;
                if (!(fetchResult instanceof FetchResult2)) {
                    throw new NoWhenBranchMatchedException();
                }
                eventListener3 = eventListener6;
                executeResult = new ExecuteResult(((FetchResult2) t4).getDrawable(), ((FetchResult2) objectRef5.element).getIsSampled(), ((FetchResult2) objectRef5.element).getDataSource(), null);
                Ref.ObjectRef objectRef132 = objectRef6;
                T t32 = objectRef5.element;
                if (t32 instanceof FetchResult3) {
                }
                if (fetchResult32 != null) {
                }
                Options options32 = (Options) objectRef132.element;
                c463112.L$0 = null;
                c463112.L$1 = null;
                c463112.L$2 = null;
                c463112.L$3 = null;
                c463112.L$4 = null;
                c463112.L$5 = null;
                c463112.L$6 = null;
                c463112.L$7 = null;
                c463112.label = 3;
                Object objTransform$coil_base_release2 = engineInterceptor.transform$coil_base_release(executeResult, imageRequest3, options32, eventListener3, c463112);
                obj4 = objTransform$coil_base_release2;
            } else {
                CoroutineDispatcher decoderDispatcher = imageRequest2.getDecoderDispatcher();
                Ref.ObjectRef objectRef14 = objectRef4;
                try {
                    EngineInterceptor2 engineInterceptor22 = new EngineInterceptor2(engineInterceptor, objectRef14, objectRef2, imageRequest2, obj2, objectRef, eventListener2, null);
                    objectRef5 = objectRef14;
                    imageRequest3 = imageRequest2;
                    objectRef6 = objectRef;
                    eventListener4 = eventListener2;
                    c463112.L$0 = engineInterceptor;
                    c463112.L$1 = imageRequest3;
                    c463112.L$2 = eventListener4;
                    c463112.L$3 = objectRef6;
                    c463112.L$4 = objectRef5;
                    c463112.L$5 = null;
                    c463112.L$6 = null;
                    c463112.L$7 = null;
                    c463112.label = 2;
                    Object objWithContext = BuildersKt.withContext(decoderDispatcher, engineInterceptor22, c463112);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    engineInterceptor2 = engineInterceptor;
                    obj3 = objWithContext;
                    eventListener3 = eventListener4;
                    engineInterceptor = engineInterceptor2;
                    executeResult = (ExecuteResult) obj3;
                    Ref.ObjectRef objectRef1322 = objectRef6;
                    T t322 = objectRef5.element;
                    if (t322 instanceof FetchResult3) {
                    }
                    if (fetchResult32 != null) {
                        Utils.closeQuietly(source2);
                    }
                    Options options322 = (Options) objectRef1322.element;
                    c463112.L$0 = null;
                    c463112.L$1 = null;
                    c463112.L$2 = null;
                    c463112.L$3 = null;
                    c463112.L$4 = null;
                    c463112.L$5 = null;
                    c463112.L$6 = null;
                    c463112.L$7 = null;
                    c463112.label = 3;
                    Object objTransform$coil_base_release22 = engineInterceptor.transform$coil_base_release(executeResult, imageRequest3, options322, eventListener3, c463112);
                    obj4 = objTransform$coil_base_release22;
                } catch (Throwable th3) {
                    th = th3;
                    objectRef7 = objectRef14;
                    T t222 = objectRef7.element;
                    fetchResult3 = t222 instanceof FetchResult3 ? (FetchResult3) t222 : null;
                    if (fetchResult3 != null && (source = fetchResult3.getSource()) != null) {
                        Utils.closeQuietly(source);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super FetchResult> continuation) throws IOException {
        C46321 c46321;
        int i;
        EngineInterceptor engineInterceptor;
        Tuples2<Fetcher, Integer> tuples2NewFetcher;
        ImageSource source;
        if (continuation instanceof C46321) {
            c46321 = (C46321) continuation;
            int i2 = c46321.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c46321.label = i2 - Integer.MIN_VALUE;
            } else {
                c46321 = new C46321(continuation);
            }
        }
        Object obj2 = c46321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c46321.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            i = 0;
            engineInterceptor = this;
            tuples2NewFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i);
            if (tuples2NewFetcher != null) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c46321.I$0;
            Fetcher fetcher = (Fetcher) c46321.L$6;
            EventListener eventListener2 = (EventListener) c46321.L$5;
            options = (Options) c46321.L$4;
            Object obj3 = c46321.L$3;
            ImageRequest imageRequest2 = (ImageRequest) c46321.L$2;
            ComponentRegistry componentRegistry2 = (ComponentRegistry) c46321.L$1;
            engineInterceptor = (EngineInterceptor) c46321.L$0;
            ResultKt.throwOnFailure(obj2);
            C46321 c463212 = c46321;
            int i5 = i4;
            componentRegistry = componentRegistry2;
            C46321 c463213 = c463212;
            Fetcher first = fetcher;
            imageRequest = imageRequest2;
            eventListener = eventListener2;
            obj = obj3;
            FetchResult fetchResult = (FetchResult) obj2;
            try {
                eventListener.fetchEnd(imageRequest, first, options, fetchResult);
                if (fetchResult == null) {
                    return fetchResult;
                }
                i = i5;
                c46321 = c463213;
                tuples2NewFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i);
                if (tuples2NewFetcher != null) {
                    throw new IllegalStateException(("Unable to create a fetcher that supports: " + obj).toString());
                }
                first = tuples2NewFetcher.getFirst();
                int iIntValue = tuples2NewFetcher.getSecond().intValue() + 1;
                eventListener.fetchStart(imageRequest, first, options);
                c46321.L$0 = engineInterceptor;
                c46321.L$1 = componentRegistry;
                c46321.L$2 = imageRequest;
                c46321.L$3 = obj;
                c46321.L$4 = options;
                c46321.L$5 = eventListener;
                c46321.L$6 = first;
                c46321.I$0 = iIntValue;
                c46321.label = 1;
                Object objFetch = first.fetch(c46321);
                if (objFetch == coroutine_suspended) {
                    return coroutine_suspended;
                }
                C46321 c463214 = c46321;
                i5 = iIntValue;
                obj2 = objFetch;
                c463213 = c463214;
                FetchResult fetchResult2 = (FetchResult) obj2;
                eventListener.fetchEnd(imageRequest, first, options, fetchResult2);
                if (fetchResult2 == null) {
                }
            } catch (Throwable th) {
                FetchResult3 fetchResult3 = fetchResult2 instanceof FetchResult3 ? (FetchResult3) fetchResult2 : null;
                if (fetchResult3 != null && (source = fetchResult3.getSource()) != null) {
                    Utils.closeQuietly(source);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(FetchResult3 fetchResult3, ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        C46301 c46301;
        int i;
        EngineInterceptor engineInterceptor;
        Tuples2<Decoder, Integer> tuples2NewDecoder;
        if (continuation instanceof C46301) {
            c46301 = (C46301) continuation;
            int i2 = c46301.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c46301.label = i2 - Integer.MIN_VALUE;
            } else {
                c46301 = new C46301(continuation);
            }
        }
        Object obj2 = c46301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c46301.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            i = 0;
            engineInterceptor = this;
            tuples2NewDecoder = componentRegistry.newDecoder(fetchResult3, options, engineInterceptor.imageLoader, i);
            if (tuples2NewDecoder != null) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c46301.I$0;
            Decoder decoder = (Decoder) c46301.L$7;
            EventListener eventListener2 = (EventListener) c46301.L$6;
            Options options2 = (Options) c46301.L$5;
            Object obj3 = c46301.L$4;
            ImageRequest imageRequest2 = (ImageRequest) c46301.L$3;
            ComponentRegistry componentRegistry2 = (ComponentRegistry) c46301.L$2;
            FetchResult3 fetchResult32 = (FetchResult3) c46301.L$1;
            engineInterceptor = (EngineInterceptor) c46301.L$0;
            ResultKt.throwOnFailure(obj2);
            C46301 c463012 = c46301;
            int i5 = i4;
            fetchResult3 = fetchResult32;
            C46301 c463013 = c463012;
            eventListener = eventListener2;
            imageRequest = imageRequest2;
            options = options2;
            obj = obj3;
            DecodeResult decodeResult = (DecodeResult) obj2;
            eventListener.decodeEnd(imageRequest, decoder, options, decodeResult);
            if (decodeResult != null) {
                i = i5;
                componentRegistry = componentRegistry2;
                c46301 = c463013;
                tuples2NewDecoder = componentRegistry.newDecoder(fetchResult3, options, engineInterceptor.imageLoader, i);
                if (tuples2NewDecoder != null) {
                    throw new IllegalStateException(("Unable to create a decoder that supports: " + obj).toString());
                }
                Decoder first = tuples2NewDecoder.getFirst();
                int iIntValue = tuples2NewDecoder.getSecond().intValue() + 1;
                eventListener.decodeStart(imageRequest, first, options);
                c46301.L$0 = engineInterceptor;
                c46301.L$1 = fetchResult3;
                c46301.L$2 = componentRegistry;
                c46301.L$3 = imageRequest;
                c46301.L$4 = obj;
                c46301.L$5 = options;
                c46301.L$6 = eventListener;
                c46301.L$7 = first;
                c46301.I$0 = iIntValue;
                c46301.label = 1;
                Object objDecode = first.decode(c46301);
                if (objDecode == coroutine_suspended) {
                    return coroutine_suspended;
                }
                componentRegistry2 = componentRegistry;
                decoder = first;
                C46301 c463014 = c46301;
                i5 = iIntValue;
                obj2 = objDecode;
                c463013 = c463014;
                DecodeResult decodeResult2 = (DecodeResult) obj2;
                eventListener.decodeEnd(imageRequest, decoder, options, decodeResult2);
                if (decodeResult2 != null) {
                }
            } else {
                Drawable drawable = decodeResult2.getDrawable();
                boolean isSampled = decodeResult2.getIsSampled();
                DataSource dataSource = fetchResult3.getDataSource();
                ImageSource source = fetchResult3.getSource();
                ImageSource4 imageSource4 = source instanceof ImageSource4 ? (ImageSource4) source : null;
                return new ExecuteResult(drawable, isSampled, dataSource, imageSource4 != null ? imageSource4.getDiskCacheKey() : null);
            }
        }
    }

    public final Object transform$coil_base_release(ExecuteResult executeResult, ImageRequest imageRequest, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        List<Transformation> transformations = imageRequest.getTransformations();
        return transformations.isEmpty() ? executeResult : ((executeResult.getDrawable() instanceof BitmapDrawable) || imageRequest.getAllowConversionToBitmap()) ? BuildersKt.withContext(imageRequest.getTransformationDispatcher(), new EngineInterceptor3(this, executeResult, options, transformations, eventListener, imageRequest, null), continuation) : executeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap convertDrawableToBitmap(Drawable drawable, Options options, List<? extends Transformation> transformations) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (ArraysKt.contains(Utils.getVALID_TRANSFORMATION_CONFIGS(), Bitmaps.getSafeConfig(bitmap))) {
                return bitmap;
            }
        }
        return DrawableUtils.INSTANCE.convertToBitmap(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcoil/intercept/EngineInterceptor$ExecuteResult;", "", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "isSampled", "", "dataSource", "Lcoil/decode/DataSource;", "diskCacheKey", "", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "getDataSource", "()Lcoil/decode/DataSource;", "getDiskCacheKey", "()Ljava/lang/String;", "copy", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ExecuteResult {
        private final DataSource dataSource;
        private final String diskCacheKey;
        private final Drawable drawable;
        private final boolean isSampled;

        public ExecuteResult(Drawable drawable, boolean z, DataSource dataSource, String str) {
            this.drawable = drawable;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* renamed from: isSampled, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        public final DataSource getDataSource() {
            return this.dataSource;
        }

        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        public static /* synthetic */ ExecuteResult copy$default(ExecuteResult executeResult, Drawable drawable, boolean z, DataSource dataSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = executeResult.drawable;
            }
            if ((i & 2) != 0) {
                z = executeResult.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = executeResult.dataSource;
            }
            if ((i & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.copy(drawable, z, dataSource, str);
        }

        public final ExecuteResult copy(Drawable drawable, boolean isSampled, DataSource dataSource, String diskCacheKey) {
            return new ExecuteResult(drawable, isSampled, dataSource, diskCacheKey);
        }
    }
}
