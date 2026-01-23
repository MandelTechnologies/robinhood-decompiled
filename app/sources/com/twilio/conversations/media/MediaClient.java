package com.twilio.conversations.media;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.twilio.conversations.MediaUploadListener;
import com.twilio.util.ExpirableCache;
import com.twilio.util.InternalUtils3;
import com.twilio.util.ListenableInput2;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import io.ktor.utils.p478io.core.Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.Semaphore6;

/* compiled from: MediaClient.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010H\u0086@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0019J(\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eJ\u0006\u0010!\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/twilio/conversations/media/MediaClient;", "", "transport", "Lcom/twilio/conversations/media/MediaTransport;", "maxActiveUploads", "", "downloadUrlsCacheFlushInterval", "", "<init>", "(Lcom/twilio/conversations/media/MediaTransport;IJ)V", "semaphore", "Lkotlinx/coroutines/sync/Semaphore;", "temporaryDownloadUrlsCache", "Lcom/twilio/util/ExpirableCache;", "", "upload", "", "items", "Lcom/twilio/conversations/media/MediaUploadItem;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Lcom/twilio/conversations/media/MediaUploadItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadJsonMediaAsText", "mediaSid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemporaryContentUrl", "getTemporaryContentUrlList", "", "mediaSids", "updateToken", "", "token", "shutdown", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public class MediaClient {
    private final Semaphore semaphore;
    private final ExpirableCache<String, String> temporaryDownloadUrlsCache;
    private final MediaTransport transport;

    /* compiled from: MediaClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaClient", m3645f = "MediaClient.kt", m3646l = {64, 65}, m3647m = "downloadJsonMediaAsText")
    /* renamed from: com.twilio.conversations.media.MediaClient$downloadJsonMediaAsText$1 */
    static final class C434441 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C434441(Continuation<? super C434441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaClient.this.downloadJsonMediaAsText(null, this);
        }
    }

    /* compiled from: MediaClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaClient", m3645f = "MediaClient.kt", m3646l = {70}, m3647m = "getTemporaryContentUrl")
    /* renamed from: com.twilio.conversations.media.MediaClient$getTemporaryContentUrl$1 */
    static final class C434451 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434451(Continuation<? super C434451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaClient.this.getTemporaryContentUrl(null, this);
        }
    }

    /* compiled from: MediaClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaClient", m3645f = "MediaClient.kt", m3646l = {89}, m3647m = "getTemporaryContentUrlList")
    /* renamed from: com.twilio.conversations.media.MediaClient$getTemporaryContentUrlList$1 */
    static final class C434461 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434461(Continuation<? super C434461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaClient.this.getTemporaryContentUrlList(null, this);
        }
    }

    /* compiled from: MediaClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaClient", m3645f = "MediaClient.kt", m3646l = {48, 51}, m3647m = "uploadItem")
    /* renamed from: com.twilio.conversations.media.MediaClient$uploadItem$1 */
    static final class C434481 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434481(Continuation<? super C434481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaClient.this.uploadItem(null, this);
        }
    }

    public MediaClient(MediaTransport transport, int i, long j) {
        Intrinsics.checkNotNullParameter(transport, "transport");
        this.transport = transport;
        this.semaphore = Semaphore6.Semaphore$default(i, 0, 2, null);
        this.temporaryDownloadUrlsCache = new ExpirableCache<>(j);
    }

    public /* synthetic */ MediaClient(MediaTransport mediaTransport, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaTransport, i, (i2 & 4) != 0 ? 180000L : j);
    }

    /* compiled from: MediaClient.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaClient$upload$2", m3645f = "MediaClient.kt", m3646l = {35}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.twilio.conversations.media.MediaClient$upload$2 */
    static final class C434472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        final /* synthetic */ List<MediaUploadItem> $items;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MediaClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C434472(List<MediaUploadItem> list, MediaClient mediaClient, Continuation<? super C434472> continuation) {
            super(2, continuation);
            this.$items = list;
            this.this$0 = mediaClient;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C434472 c434472 = new C434472(this.$items, this.this$0, continuation);
            c434472.L$0 = obj;
            return c434472;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
            return ((C434472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<MediaUploadItem> list = this.$items;
            MediaClient mediaClient = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MediaClient2(mediaClient, (MediaUploadItem) it.next(), null), 3, null));
            }
            this.label = 1;
            Object objAwaitAll = Await2.awaitAll(arrayList, this);
            return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
        }
    }

    public final Object upload(List<MediaUploadItem> list, Continuation<? super List<String>> continuation) {
        return CoroutineScope2.coroutineScope(new C434472(list, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (r11 == r7) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadItem(final MediaUploadItem mediaUploadItem, Continuation<? super String> continuation) throws TwilioException {
        C434481 c434481;
        Throwable th;
        MediaClient mediaClient;
        Object objM28550constructorimpl;
        MediaClient mediaClient2;
        Throwable thM28553exceptionOrNullimpl;
        if (continuation instanceof C434481) {
            c434481 = (C434481) continuation;
            int i = c434481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434481.label = i - Integer.MIN_VALUE;
            } else {
                c434481 = new C434481(continuation);
            }
        }
        C434481 c4344812 = c434481;
        Object objUploadFile = c4344812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4344812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadFile);
            MediaUploadListener listener = mediaUploadItem.getListener();
            if (listener != null) {
                listener.onStarted();
            }
            Input listenableInput = ListenableInput2.toListenableInput(mediaUploadItem.getInput(), new Function1() { // from class: com.twilio.conversations.media.MediaClient$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MediaClient.uploadItem$lambda$0(mediaUploadItem, ((Long) obj).longValue());
                }
            });
            try {
                Result.Companion companion = Result.INSTANCE;
                MediaTransport mediaTransport = this.transport;
                String filename = mediaUploadItem.getFilename();
                String contentType = mediaUploadItem.getContentType();
                String value = mediaUploadItem.getCategory().getValue();
                c4344812.L$0 = this;
                c4344812.L$1 = mediaUploadItem;
                c4344812.label = 1;
                objUploadFile = mediaTransport.uploadFile(filename, contentType, value, listenableInput, c4344812);
                if (objUploadFile != coroutine_suspended) {
                    mediaClient = this;
                }
            } catch (Throwable th2) {
                th = th2;
                mediaClient = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                mediaClient2 = mediaClient;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaUploadItem = (MediaUploadItem) c4344812.L$1;
            mediaClient2 = (MediaClient) c4344812.L$0;
            ResultKt.throwOnFailure(objUploadFile);
            TwilioException twilioException = (TwilioException) objUploadFile;
            TwilioLogger3.getLogger(mediaClient2).m3192e("Error uploading file:", twilioException);
            MediaUploadListener listener2 = mediaUploadItem.getListener();
            if (listener2 != null) {
                listener2.onFailed(twilioException.getErrorInfo());
                throw twilioException;
            }
            throw twilioException;
        }
        mediaUploadItem = (MediaUploadItem) c4344812.L$1;
        mediaClient = (MediaClient) c4344812.L$0;
        try {
            ResultKt.throwOnFailure(objUploadFile);
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion22 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            mediaClient2 = mediaClient;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl((String) objUploadFile);
        mediaClient2 = mediaClient;
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            TwilioException2 twilioException2 = TwilioException2.MediaUploadError;
            c4344812.L$0 = mediaClient2;
            c4344812.L$1 = mediaUploadItem;
            c4344812.label = 2;
            objUploadFile = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, c4344812);
        } else {
            String str = (String) objM28550constructorimpl;
            TwilioLogger.d$default(TwilioLogger3.getLogger(mediaClient2), "File uploaded successfully: " + mediaUploadItem.getFilename(), (Throwable) null, 2, (Object) null);
            MediaUploadListener listener3 = mediaUploadItem.getListener();
            if (listener3 != null) {
                listener3.onCompleted(str);
            }
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadItem$lambda$0(MediaUploadItem item, long j) {
        Intrinsics.checkNotNullParameter(item, "$item");
        MediaUploadListener listener = item.getListener();
        if (listener != null) {
            listener.onProgress(j);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadJsonMediaAsText(String str, Continuation<? super String> continuation) {
        C434441 c434441;
        MediaClient mediaClient;
        if (continuation instanceof C434441) {
            c434441 = (C434441) continuation;
            int i = c434441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434441.label = i - Integer.MIN_VALUE;
            } else {
                c434441 = new C434441(continuation);
            }
        }
        Object temporaryContentUrl = c434441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434441.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(temporaryContentUrl);
            TwilioLogger.d$default(TwilioLogger3.getLogger(this), "downloadJsonMedia: " + str, (Throwable) null, 2, (Object) null);
            c434441.L$0 = this;
            c434441.label = 1;
            temporaryContentUrl = getTemporaryContentUrl(str, c434441);
            if (temporaryContentUrl != coroutine_suspended) {
                mediaClient = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(temporaryContentUrl);
            return temporaryContentUrl;
        }
        mediaClient = (MediaClient) c434441.L$0;
        ResultKt.throwOnFailure(temporaryContentUrl);
        MediaTransport mediaTransport = mediaClient.transport;
        c434441.L$0 = null;
        c434441.label = 2;
        Object objDownloadFileAsText = mediaTransport.downloadFileAsText((String) temporaryContentUrl, c434441);
        return objDownloadFileAsText == coroutine_suspended ? coroutine_suspended : objDownloadFileAsText;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTemporaryContentUrl(String str, Continuation<? super String> continuation) {
        C434451 c434451;
        String str2;
        ExpirableCache<String, String> expirableCache;
        if (continuation instanceof C434451) {
            c434451 = (C434451) continuation;
            int i = c434451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434451.label = i - Integer.MIN_VALUE;
            } else {
                c434451 = new C434451(continuation);
            }
        }
        Object obj = c434451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434451.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ExpirableCache<String, String> expirableCache2 = this.temporaryDownloadUrlsCache;
            String str3 = expirableCache2.get(str);
            if (str3 != null) {
                return str3;
            }
            TwilioLogger.d$default(TwilioLogger3.getLogger(this), "getTemporaryContentUrl: " + str, (Throwable) null, 2, (Object) null);
            MediaTransport mediaTransport = this.transport;
            c434451.L$0 = str;
            c434451.L$1 = expirableCache2;
            c434451.label = 1;
            Object temporaryContentUrl = mediaTransport.getTemporaryContentUrl(str, c434451);
            if (temporaryContentUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            expirableCache = expirableCache2;
            obj = temporaryContentUrl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            expirableCache = (ExpirableCache) c434451.L$1;
            str2 = (String) c434451.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str4 = (String) obj;
        ((ExpirableCache) expirableCache).map.put(str2, str4);
        return str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTemporaryContentUrlList(List<String> list, Continuation<? super Map<String, String>> continuation) {
        C434461 c434461;
        Map map;
        MediaClient mediaClient;
        if (continuation instanceof C434461) {
            c434461 = (C434461) continuation;
            int i = c434461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434461.label = i - Integer.MIN_VALUE;
            } else {
                c434461 = new C434461(continuation);
            }
        }
        Object obj = c434461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                String str2 = this.temporaryDownloadUrlsCache.get(str);
                if (str2 != null) {
                    linkedHashMap.put(str, str2);
                } else {
                    boxing.boxBoolean(arrayList.add(str));
                }
            }
            if (arrayList.isEmpty()) {
                TwilioLogger.d$default(TwilioLogger3.getLogger(this), "getTemporaryContentUrlList: All urls are cached: " + linkedHashMap.keySet(), (Throwable) null, 2, (Object) null);
                return linkedHashMap;
            }
            TwilioLogger.d$default(TwilioLogger3.getLogger(this), "getTemporaryContentUrlList: cached sids: " + linkedHashMap.keySet() + '}', (Throwable) null, 2, (Object) null);
            TwilioLogger.d$default(TwilioLogger3.getLogger(this), "getTemporaryContentUrlList: sidsForRequest: " + arrayList, (Throwable) null, 2, (Object) null);
            MediaTransport mediaTransport = this.transport;
            c434461.L$0 = this;
            c434461.L$1 = linkedHashMap;
            c434461.label = 1;
            Object temporaryContentUrlList = mediaTransport.getTemporaryContentUrlList(arrayList, c434461);
            if (temporaryContentUrlList == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = temporaryContentUrlList;
            map = linkedHashMap;
            mediaClient = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c434461.L$1;
            mediaClient = (MediaClient) c434461.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Map<String, ? extends String> map2 = (Map) obj;
        mediaClient.temporaryDownloadUrlsCache.putAll(map2);
        return MapsKt.plus(map, map2);
    }

    public final void updateToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.transport.setToken(token);
    }

    public final void shutdown() {
        this.transport.shutdown();
    }
}
