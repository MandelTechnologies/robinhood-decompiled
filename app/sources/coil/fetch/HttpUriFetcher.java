package coil.fetch;

import android.net.Uri;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.content.CacheResponse;
import coil.content.CacheStrategy;
import coil.content.Calls;
import coil.content.HttpException;
import coil.content.Utils;
import coil.decode.DataSource;
import coil.decode.ImageSource;
import coil.decode.ImageSource5;
import coil.disk.DiskCache;
import coil.fetch.Fetcher;
import coil.request.Options;
import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.IOException;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;

/* compiled from: HttpUriFetcher.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 22\u00020\u0001:\u000212B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J.\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0002\b\"J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010$\u001a\u0004\u0018\u00010\u001b*\u00020\u0013H\u0002J\f\u0010%\u001a\u00020&*\u00020\u0013H\u0002J\f\u0010%\u001a\u00020&*\u00020'H\u0002J\f\u0010(\u001a\u00020)*\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"Lcoil/fetch/HttpUriFetcher;", "Lcoil/fetch/Fetcher;", "url", "", "options", "Lcoil/request/Options;", "callFactory", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "diskCache", "Lcoil/disk/DiskCache;", "respectCacheHeaders", "", "<init>", "(Ljava/lang/String;Lcoil/request/Options;Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "fetch", "Lcoil/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFromDiskCache", "Lcoil/disk/DiskCache$Snapshot;", "writeToDiskCache", "snapshot", "request", "Lokhttp3/Request;", "response", "Lokhttp3/Response;", "cacheResponse", "Lcoil/network/CacheResponse;", "newRequest", "executeNetworkRequest", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMimeType", "contentType", "Lokhttp3/MediaType;", "getMimeType$coil_base_release", "isCacheable", "toCacheResponse", "toImageSource", "Lcoil/decode/ImageSource;", "Lokhttp3/ResponseBody;", "toDataSource", "Lcoil/decode/DataSource;", "diskCacheKey", "getDiskCacheKey", "()Ljava/lang/String;", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Factory", "Companion", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HttpUriFetcher implements Fetcher {
    private final Lazy<Call.Factory> callFactory;
    private final Lazy<DiskCache> diskCache;
    private final Options options;
    private final boolean respectCacheHeaders;
    private final String url;
    private static final CacheControl CACHE_CONTROL_FORCE_NETWORK_NO_CACHE = new CacheControl.Builder().noCache().noStore().build();
    private static final CacheControl CACHE_CONTROL_NO_NETWORK_NO_CACHE = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.fetch.HttpUriFetcher", m3645f = "HttpUriFetcher.kt", m3646l = {224}, m3647m = "executeNetworkRequest")
    /* renamed from: coil.fetch.HttpUriFetcher$executeNetworkRequest$1 */
    static final class C46281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C46281(Continuation<? super C46281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpUriFetcher.this.executeNetworkRequest(null, this);
        }
    }

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.fetch.HttpUriFetcher", m3645f = "HttpUriFetcher.kt", m3646l = {77, 106}, m3647m = "fetch")
    /* renamed from: coil.fetch.HttpUriFetcher$fetch$1 */
    static final class C46291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C46291(Continuation<? super C46291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpUriFetcher.this.fetch(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpUriFetcher(String str, Options options, Lazy<? extends Call.Factory> lazy, Lazy<? extends DiskCache> lazy2, boolean z) {
        this.url = str;
        this.options = options;
        this.callFactory = lazy;
        this.diskCache = lazy2;
        this.respectCacheHeaders = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x018d, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x015a, B:67:0x0172), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x018d, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x015a, B:67:0x0172), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil.fetch.Fetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(Continuation<? super FetchResult> continuation) throws Exception {
        C46291 c46291;
        DiskCache.Snapshot snapshot;
        Exception e;
        CacheStrategy cacheStrategyCompute;
        DiskCache.Snapshot snapshotWriteToDiskCache;
        CacheStrategy cacheStrategy;
        HttpUriFetcher httpUriFetcher;
        Response response;
        Response response2;
        Exception e2;
        HttpUriFetcher httpUriFetcher2;
        if (continuation instanceof C46291) {
            c46291 = (C46291) continuation;
            int i = c46291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c46291.label = i - Integer.MIN_VALUE;
            } else {
                c46291 = new C46291(continuation);
            }
        }
        Object obj = c46291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c46291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            DiskCache.Snapshot fromDiskCache = readFromDiskCache();
            try {
                if (fromDiskCache != null) {
                    Long size = getFileSystem().metadata(fromDiskCache.getMetadata()).getSize();
                    if (size != null && size.longValue() == 0) {
                        return new FetchResult3(toImageSource(fromDiskCache), getMimeType$coil_base_release(this.url, null), DataSource.DISK);
                    }
                    if (this.respectCacheHeaders) {
                        cacheStrategyCompute = new CacheStrategy.Factory(newRequest(), toCacheResponse(fromDiskCache)).compute();
                        if (cacheStrategyCompute.getNetworkRequest() == null && cacheStrategyCompute.getCacheResponse() != null) {
                            return new FetchResult3(toImageSource(fromDiskCache), getMimeType$coil_base_release(this.url, cacheStrategyCompute.getCacheResponse().getContentType()), DataSource.DISK);
                        }
                    } else {
                        ImageSource imageSource = toImageSource(fromDiskCache);
                        String str = this.url;
                        CacheResponse cacheResponse = toCacheResponse(fromDiskCache);
                        return new FetchResult3(imageSource, getMimeType$coil_base_release(str, cacheResponse != null ? cacheResponse.getContentType() : null), DataSource.DISK);
                    }
                } else {
                    cacheStrategyCompute = new CacheStrategy.Factory(newRequest(), null).compute();
                }
                Request networkRequest = cacheStrategyCompute.getNetworkRequest();
                Intrinsics.checkNotNull(networkRequest);
                c46291.L$0 = this;
                c46291.L$1 = fromDiskCache;
                c46291.L$2 = cacheStrategyCompute;
                c46291.label = 1;
                Object objExecuteNetworkRequest = executeNetworkRequest(networkRequest, c46291);
                if (objExecuteNetworkRequest != coroutine_suspended) {
                    CacheStrategy cacheStrategy2 = cacheStrategyCompute;
                    snapshotWriteToDiskCache = fromDiskCache;
                    obj = objExecuteNetworkRequest;
                    cacheStrategy = cacheStrategy2;
                    httpUriFetcher = this;
                    response = (Response) obj;
                    ResponseBody responseBodyRequireBody = Utils.requireBody(response);
                    snapshotWriteToDiskCache = httpUriFetcher.writeToDiskCache(snapshotWriteToDiskCache, cacheStrategy.getNetworkRequest(), response, cacheStrategy.getCacheResponse());
                    if (snapshotWriteToDiskCache == null) {
                    }
                }
                return coroutine_suspended;
            } catch (Exception e3) {
                snapshot = fromDiskCache;
                e = e3;
                if (snapshot != null) {
                }
                throw e;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            response2 = (Response) c46291.L$2;
            snapshotWriteToDiskCache = (DiskCache.Snapshot) c46291.L$1;
            httpUriFetcher2 = (HttpUriFetcher) c46291.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                Response response3 = (Response) obj;
                ResponseBody responseBodyRequireBody2 = Utils.requireBody(response3);
                return new FetchResult3(httpUriFetcher2.toImageSource(responseBodyRequireBody2), httpUriFetcher2.getMimeType$coil_base_release(httpUriFetcher2.url, responseBodyRequireBody2.get$contentType()), httpUriFetcher2.toDataSource(response3));
            } catch (Exception e4) {
                e2 = e4;
                Utils.closeQuietly(response2);
                throw e2;
            }
        }
        CacheStrategy cacheStrategy3 = (CacheStrategy) c46291.L$2;
        snapshot = (DiskCache.Snapshot) c46291.L$1;
        httpUriFetcher = (HttpUriFetcher) c46291.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            cacheStrategy = cacheStrategy3;
            snapshotWriteToDiskCache = snapshot;
            try {
                response = (Response) obj;
                ResponseBody responseBodyRequireBody3 = Utils.requireBody(response);
                try {
                    snapshotWriteToDiskCache = httpUriFetcher.writeToDiskCache(snapshotWriteToDiskCache, cacheStrategy.getNetworkRequest(), response, cacheStrategy.getCacheResponse());
                    if (snapshotWriteToDiskCache == null) {
                        ImageSource imageSource2 = httpUriFetcher.toImageSource(snapshotWriteToDiskCache);
                        String str2 = httpUriFetcher.url;
                        CacheResponse cacheResponse2 = httpUriFetcher.toCacheResponse(snapshotWriteToDiskCache);
                        return new FetchResult3(imageSource2, httpUriFetcher.getMimeType$coil_base_release(str2, cacheResponse2 != null ? cacheResponse2.getContentType() : null), DataSource.NETWORK);
                    }
                    if (responseBodyRequireBody3.getSource().request(1L)) {
                        return new FetchResult3(httpUriFetcher.toImageSource(responseBodyRequireBody3), httpUriFetcher.getMimeType$coil_base_release(httpUriFetcher.url, responseBodyRequireBody3.get$contentType()), httpUriFetcher.toDataSource(response));
                    }
                    Utils.closeQuietly(response);
                    Request requestNewRequest = httpUriFetcher.newRequest();
                    c46291.L$0 = httpUriFetcher;
                    c46291.L$1 = snapshotWriteToDiskCache;
                    c46291.L$2 = response;
                    c46291.label = 2;
                    Object objExecuteNetworkRequest2 = httpUriFetcher.executeNetworkRequest(requestNewRequest, c46291);
                    if (objExecuteNetworkRequest2 != coroutine_suspended) {
                        response2 = response;
                        obj = objExecuteNetworkRequest2;
                        httpUriFetcher2 = httpUriFetcher;
                        Response response32 = (Response) obj;
                        ResponseBody responseBodyRequireBody22 = Utils.requireBody(response32);
                        return new FetchResult3(httpUriFetcher2.toImageSource(responseBodyRequireBody22), httpUriFetcher2.getMimeType$coil_base_release(httpUriFetcher2.url, responseBodyRequireBody22.get$contentType()), httpUriFetcher2.toDataSource(response32));
                    }
                    return coroutine_suspended;
                } catch (Exception e5) {
                    response2 = response;
                    e2 = e5;
                    Utils.closeQuietly(response2);
                    throw e2;
                }
            } catch (Exception e6) {
                e = e6;
                snapshot = snapshotWriteToDiskCache;
                if (snapshot != null) {
                    Utils.closeQuietly(snapshot);
                }
                throw e;
            }
        } catch (Exception e7) {
            e = e7;
            if (snapshot != null) {
            }
            throw e;
        }
    }

    private final DiskCache.Snapshot readFromDiskCache() {
        DiskCache value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.openSnapshot(getDiskCacheKey());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[Catch: all -> 0x007f, Exception -> 0x0082, TRY_LEAVE, TryCatch #9 {Exception -> 0x0082, blocks: (B:15:0x002b, B:18:0x0036, B:70:0x00f0, B:38:0x0089, B:31:0x007b, B:39:0x008a, B:55:0x00bc, B:73:0x00f8, B:68:0x00eb, B:74:0x00f9, B:52:0x00b6), top: B:97:0x002b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9 A[Catch: all -> 0x007f, Exception -> 0x0082, TRY_LEAVE, TryCatch #9 {Exception -> 0x0082, blocks: (B:15:0x002b, B:18:0x0036, B:70:0x00f0, B:38:0x0089, B:31:0x007b, B:39:0x008a, B:55:0x00bc, B:73:0x00f8, B:68:0x00eb, B:74:0x00f9, B:52:0x00b6), top: B:97:0x002b, outer: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final DiskCache.Snapshot writeToDiskCache(DiskCache.Snapshot snapshot, Request request, Response response, CacheResponse cacheResponse) throws IOException {
        DiskCache.Editor editorOpenEditor;
        Throwable th;
        Throwable th2 = null;
        if (!isCacheable(request, response)) {
            if (snapshot != null) {
                Utils.closeQuietly(snapshot);
            }
            return null;
        }
        if (snapshot != null) {
            editorOpenEditor = snapshot.closeAndOpenEditor();
        } else {
            DiskCache value = this.diskCache.getValue();
            editorOpenEditor = value != null ? value.openEditor(getDiskCacheKey()) : null;
        }
        try {
            if (editorOpenEditor == null) {
                return null;
            }
            try {
                if (response.getCode() == 304 && cacheResponse != null) {
                    Response responseBuild = response.newBuilder().headers(CacheStrategy.INSTANCE.combineHeaders(cacheResponse.getResponseHeaders(), response.getHeaders())).build();
                    BufferedSink bufferedSinkBuffer = Okio.buffer(getFileSystem().mo11323sink(editorOpenEditor.getMetadata(), false));
                    try {
                        new CacheResponse(responseBuild).writeTo(bufferedSinkBuffer);
                        Unit unit = Unit.INSTANCE;
                        if (bufferedSinkBuffer != null) {
                            try {
                                bufferedSinkBuffer.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (bufferedSinkBuffer != null) {
                            try {
                                bufferedSinkBuffer.close();
                            } catch (Throwable th5) {
                                ExceptionsKt.addSuppressed(th2, th5);
                            }
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                } else {
                    BufferedSink bufferedSinkBuffer2 = Okio.buffer(getFileSystem().mo11323sink(editorOpenEditor.getMetadata(), false));
                    try {
                        new CacheResponse(response).writeTo(bufferedSinkBuffer2);
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th6) {
                        if (bufferedSinkBuffer2 != null) {
                            try {
                                bufferedSinkBuffer2.close();
                            } catch (Throwable th7) {
                                ExceptionsKt.addSuppressed(th6, th7);
                            }
                        }
                        th = th6;
                    }
                    if (bufferedSinkBuffer2 != null) {
                        try {
                            bufferedSinkBuffer2.close();
                            th = null;
                        } catch (Throwable th8) {
                            th = th8;
                        }
                        if (th == null) {
                            throw th;
                        }
                        BufferedSink bufferedSinkBuffer3 = Okio.buffer(getFileSystem().mo11323sink(editorOpenEditor.getData(), false));
                        try {
                            ResponseBody body = response.getBody();
                            Intrinsics.checkNotNull(body);
                            body.getSource().readAll(bufferedSinkBuffer3);
                            if (bufferedSinkBuffer3 != null) {
                                try {
                                    bufferedSinkBuffer3.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            }
                        } catch (Throwable th10) {
                            th2 = th10;
                            if (bufferedSinkBuffer3 != null) {
                                try {
                                    bufferedSinkBuffer3.close();
                                } catch (Throwable th11) {
                                    ExceptionsKt.addSuppressed(th2, th11);
                                }
                            }
                        }
                        if (th2 != null) {
                            throw th2;
                        }
                    } else {
                        th = null;
                        if (th == null) {
                        }
                    }
                }
                DiskCache.Snapshot snapshotCommitAndOpenSnapshot = editorOpenEditor.commitAndOpenSnapshot();
                Utils.closeQuietly(response);
                return snapshotCommitAndOpenSnapshot;
            } catch (Exception e) {
                Utils.abortQuietly(editorOpenEditor);
                throw e;
            }
        } catch (Throwable th12) {
            Utils.closeQuietly(response);
            throw th12;
        }
    }

    private final Request newRequest() {
        Request.Builder builderHeaders = new Request.Builder().url(this.url).headers(this.options.getHeaders());
        for (Map.Entry<Class<?>, Object> entry : this.options.getTags().asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builderHeaders.tag(key, entry.getValue());
        }
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = this.options.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            builderHeaders.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                builderHeaders.cacheControl(CACHE_CONTROL_NO_NETWORK_NO_CACHE);
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            builderHeaders.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            builderHeaders.cacheControl(CACHE_CONTROL_FORCE_NETWORK_NO_CACHE);
        }
        return builderHeaders.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeNetworkRequest(Request request, Continuation<? super Response> continuation) throws IOException {
        C46281 c46281;
        Response responseExecute;
        if (continuation instanceof C46281) {
            c46281 = (C46281) continuation;
            int i = c46281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c46281.label = i - Integer.MIN_VALUE;
            } else {
                c46281 = new C46281(continuation);
            }
        }
        Object objAwait = c46281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c46281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (Utils.isMainThread()) {
                if (this.options.getNetworkCachePolicy().getReadEnabled()) {
                    throw new NetworkOnMainThreadException();
                }
                responseExecute = this.callFactory.getValue().newCall(request).execute();
                if (!responseExecute.isSuccessful() || responseExecute.getCode() == 304) {
                    return responseExecute;
                }
                ResponseBody body = responseExecute.getBody();
                if (body != null) {
                    Utils.closeQuietly(body);
                }
                throw new HttpException(responseExecute);
            }
            Call callNewCall = this.callFactory.getValue().newCall(request);
            c46281.label = 1;
            objAwait = Calls.await(callNewCall, c46281);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        responseExecute = (Response) objAwait;
        if (responseExecute.isSuccessful()) {
        }
        return responseExecute;
    }

    public final String getMimeType$coil_base_release(String url, MediaType contentType) {
        String mimeTypeFromUrl;
        String mediaType = contentType != null ? contentType.getMediaType() : null;
        if ((mediaType == null || StringsKt.startsWith$default(mediaType, "text/plain", false, 2, (Object) null)) && (mimeTypeFromUrl = Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), url)) != null) {
            return mimeTypeFromUrl;
        }
        if (mediaType != null) {
            return StringsKt.substringBefore$default(mediaType, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    private final boolean isCacheable(Request request, Response response) {
        if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            return !this.respectCacheHeaders || CacheStrategy.INSTANCE.isCacheable(request, response);
        }
        return false;
    }

    private final CacheResponse toCacheResponse(DiskCache.Snapshot snapshot) throws Throwable {
        Throwable th;
        CacheResponse cacheResponse;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(getFileSystem().source(snapshot.getMetadata()));
            try {
                cacheResponse = new CacheResponse(bufferedSourceBuffer);
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                cacheResponse = null;
            }
            if (th == null) {
                return cacheResponse;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    private final ImageSource toImageSource(DiskCache.Snapshot snapshot) {
        return ImageSource5.create(snapshot.getData(), getFileSystem(), getDiskCacheKey(), snapshot);
    }

    private final ImageSource toImageSource(ResponseBody responseBody) {
        return ImageSource5.create(responseBody.getSource(), this.options.getContext());
    }

    private final DataSource toDataSource(Response response) {
        return response.getNetworkResponse() != null ? DataSource.NETWORK : DataSource.DISK;
    }

    private final String getDiskCacheKey() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final FileSystem getFileSystem() {
        DiskCache value = this.diskCache.getValue();
        Intrinsics.checkNotNull(value);
        return value.getFileSystem();
    }

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcoil/fetch/HttpUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "callFactory", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "diskCache", "Lcoil/disk/DiskCache;", "respectCacheHeaders", "", "<init>", "(Lkotlin/Lazy;Lkotlin/Lazy;Z)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcoil/fetch/Fetcher;", WebsocketGatewayConstants.DATA_KEY, "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "isApplicable", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {
        private final Lazy<Call.Factory> callFactory;
        private final Lazy<DiskCache> diskCache;
        private final boolean respectCacheHeaders;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Lazy<? extends Call.Factory> lazy, Lazy<? extends DiskCache> lazy2, boolean z) {
            this.callFactory = lazy;
            this.diskCache = lazy2;
            this.respectCacheHeaders = z;
        }

        @Override // coil.fetch.Fetcher.Factory
        public Fetcher create(Uri data, Options options, ImageLoader imageLoader) {
            if (isApplicable(data)) {
                return new HttpUriFetcher(data.toString(), options, this.callFactory, this.diskCache, this.respectCacheHeaders);
            }
            return null;
        }

        private final boolean isApplicable(Uri data) {
            return Intrinsics.areEqual(data.getScheme(), "http") || Intrinsics.areEqual(data.getScheme(), Constants.SCHEME);
        }
    }
}
