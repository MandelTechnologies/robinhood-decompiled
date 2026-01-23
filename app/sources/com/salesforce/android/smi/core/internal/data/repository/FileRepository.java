package com.salesforce.android.smi.core.internal.data.repository;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.common.internal.util.FileUtil;
import com.salesforce.android.smi.core.internal.util.FileFactory;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: FileRepository.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001c2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0086@¢\u0006\u0002\u0010!J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0086@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR<\u0010\u0010\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0012j\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014`\u00160\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R?\u0010\u0017\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0012j\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014`\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;", "", "appContext", "Landroid/content/Context;", "restService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "fileFactory", "Lcom/salesforce/android/smi/core/internal/util/FileFactory;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lcom/salesforce/android/smi/core/internal/util/FileFactory;Lkotlinx/coroutines/CoroutineDispatcher;)V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/HashMap;", "", "Lcom/salesforce/android/smi/common/api/Result;", "Ljava/io/File;", "Lkotlin/collections/HashMap;", "flow", "Lkotlinx/coroutines/flow/StateFlow;", "getFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "read", "", "attachments", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "forceRefresh", "", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachment", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFile", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCache", "", "result", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FileRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = FileRepository.class.getName();
    private final Context appContext;
    private final FileFactory fileFactory;
    private final StateFlow<HashMap<String, Result<File>>> flow;
    private final CoroutineDispatcher ioDispatcher;
    private final Logger logger;
    private final RestService restService;
    private final StateFlow2<HashMap<String, Result<File>>> stateFlow;

    /* compiled from: FileRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.FileRepository", m3645f = "FileRepository.kt", m3646l = {89}, m3647m = "read")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.FileRepository$read$3 */
    static final class C421233 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C421233(Continuation<? super C421233> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileRepository.this.read((FileAsset) null, false, (Continuation<? super Result<? extends File>>) this);
        }
    }

    public /* synthetic */ FileRepository(Context context, RestService restService, FileFactory fileFactory, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, restService, fileFactory, coroutineDispatcher);
    }

    private FileRepository(Context context, RestService restService, FileFactory fileFactory, CoroutineDispatcher coroutineDispatcher) {
        this.appContext = context;
        this.restService = restService;
        this.fileFactory = fileFactory;
        this.ioDispatcher = coroutineDispatcher;
        this.logger = Logger.getLogger(TAG);
        StateFlow2<HashMap<String, Result<File>>> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(new HashMap());
        this.stateFlow = stateFlow2MutableStateFlow;
        this.flow = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
    }

    public final StateFlow<HashMap<String, Result<File>>> getFlow() {
        return this.flow;
    }

    public static /* synthetic */ Object read$default(FileRepository fileRepository, List list, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fileRepository.read((List<? extends FileAsset>) list, z, (Continuation<? super List<? extends Result<? extends File>>>) continuation);
    }

    /* compiled from: FileRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/salesforce/android/smi/common/api/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.FileRepository$read$2", m3645f = "FileRepository.kt", m3646l = {44}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.FileRepository$read$2 */
    static final class C421222 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Result<? extends File>>>, Object> {
        final /* synthetic */ List<FileAsset> $attachments;
        final /* synthetic */ boolean $forceRefresh;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FileRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C421222(List<? extends FileAsset> list, FileRepository fileRepository, boolean z, Continuation<? super C421222> continuation) {
            super(2, continuation);
            this.$attachments = list;
            this.this$0 = fileRepository;
            this.$forceRefresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C421222 c421222 = new C421222(this.$attachments, this.this$0, this.$forceRefresh, continuation);
            c421222.L$0 = obj;
            return c421222;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Result<? extends File>>> continuation) {
            return ((C421222) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            List<FileAsset> list = this.$attachments;
            FileRepository fileRepository = this.this$0;
            boolean z = this.$forceRefresh;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FileRepository2(fileRepository, (FileAsset) it.next(), z, null), 3, null));
            }
            this.label = 1;
            Object objAwaitAll = Await2.awaitAll(arrayList, this);
            return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
        }
    }

    public final Object read(List<? extends FileAsset> list, boolean z, Continuation<? super List<? extends Result<? extends File>>> continuation) {
        return CoroutineScope2.coroutineScope(new C421222(list, this, z, null), continuation);
    }

    public static /* synthetic */ Object read$default(FileRepository fileRepository, FileAsset fileAsset, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fileRepository.read(fileAsset, z, (Continuation<? super Result<? extends File>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object read(FileAsset fileAsset, boolean z, Continuation<? super Result<? extends File>> continuation) {
        C421233 c421233;
        FileRepository fileRepository;
        Object obj;
        if (continuation instanceof C421233) {
            c421233 = (C421233) continuation;
            int i = c421233.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c421233.label = i - Integer.MIN_VALUE;
            } else {
                c421233 = new C421233(continuation);
            }
        }
        Object obj2 = c421233.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c421233.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            C421244 c421244 = new C421244(z, this, fileAsset, this.ioDispatcher);
            c421233.L$0 = this;
            c421233.L$1 = fileAsset;
            c421233.label = 1;
            Object objInvoke = c421244.invoke(c421233);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            fileRepository = this;
            obj = objInvoke;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileAsset = (FileAsset) c421233.L$1;
            fileRepository = (FileRepository) c421233.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        Result<? extends File> result = (Result) obj;
        fileRepository.logger.log(Level.FINE, "Load file result: " + result);
        if ((result instanceof Result.Error ? (Result.Error) result : null) != null) {
            fileRepository.logger.log(Level.WARNING, "Load file exception: " + ((Result.Error) result).getException().getMessage());
        }
        fileRepository.updateCache(fileAsset, result);
        return obj;
    }

    /* compiled from: FileRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"com/salesforce/android/smi/core/internal/data/repository/FileRepository$read$4", "Lcom/salesforce/android/smi/core/internal/data/repository/AbstractNetworkFetchedResource;", "Ljava/io/File;", "Ljava/io/InputStream;", "forceRefresh", "", "loadFromCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCachedResultDirty", "cachedResult", "sendRequest", "processNetworkResponse", "response", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProcessedResult", "result", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.FileRepository$read$4 */
    public static final class C421244 extends AbstractNetworkFetchedResource<File, InputStream> {
        final /* synthetic */ FileAsset $attachment;
        final /* synthetic */ boolean $forceRefresh;
        final /* synthetic */ FileRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421244(boolean z, FileRepository fileRepository, FileAsset fileAsset, CoroutineDispatcher coroutineDispatcher) {
            super(coroutineDispatcher);
            this.$forceRefresh = z;
            this.this$0 = fileRepository;
            this.$attachment = fileAsset;
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /* renamed from: forceRefresh, reason: from getter */
        public boolean get$forceRefresh() {
            return this.$forceRefresh;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object loadFromCache(Continuation<? super File> continuation) {
            FileRepository3 fileRepository3;
            File file;
            C421244 c421244;
            if (continuation instanceof FileRepository3) {
                fileRepository3 = (FileRepository3) continuation;
                int i = fileRepository3.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fileRepository3.label = i - Integer.MIN_VALUE;
                } else {
                    fileRepository3 = new FileRepository3(this, continuation);
                }
            }
            Object file2 = fileRepository3.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = fileRepository3.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(file2);
                Result result = (Result) ((HashMap) this.this$0.stateFlow.getValue()).get(this.$attachment.getId());
                if ((result instanceof Result.Empty) || (result instanceof Result.Loading)) {
                    file = null;
                } else if (result == null || (file = (File) com.salesforce.android.smi.common.api.ResultKt.getData(result)) == null) {
                    FileRepository fileRepository = this.this$0;
                    FileAsset fileAsset = this.$attachment;
                    fileRepository3.L$0 = this;
                    fileRepository3.label = 1;
                    file2 = fileRepository.readFile(fileAsset, fileRepository3);
                    if (file2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c421244 = this;
                }
                c421244 = this;
                c421244.this$0.logger.log(Level.FINE, "Load file from cache: " + file);
                return file;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c421244 = (C421244) fileRepository3.L$0;
            ResultKt.throwOnFailure(file2);
            file = (File) file2;
            c421244.this$0.logger.log(Level.FINE, "Load file from cache: " + file);
            return file;
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        public boolean isCachedResultDirty(File cachedResult) {
            boolean z = cachedResult == null && ((HashMap) this.this$0.stateFlow.getValue()).get(this.$attachment.getId()) == null;
            this.this$0.logger.log(Level.FINE, "Load file is cached result dirty: " + z);
            if (z) {
                this.this$0.updateCache(this.$attachment, Result.Loading.INSTANCE);
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object sendRequest(Continuation<? super InputStream> continuation) throws Exception {
            FileRepository5 fileRepository5;
            if (continuation instanceof FileRepository5) {
                fileRepository5 = (FileRepository5) continuation;
                int i = fileRepository5.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fileRepository5.label = i - Integer.MIN_VALUE;
                } else {
                    fileRepository5 = new FileRepository5(this, continuation);
                }
            }
            Object objFetchAttachment = fileRepository5.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = fileRepository5.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFetchAttachment);
                String url = this.$attachment.getUrl();
                if (url != null) {
                    RestService restService = this.this$0.restService;
                    fileRepository5.label = 1;
                    objFetchAttachment = restService.fetchAttachment(url, fileRepository5);
                    if (objFetchAttachment == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new Exception("Empty URL. Failed to fetch attachment");
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchAttachment);
            Result result = (Result) objFetchAttachment;
            if (!(result instanceof Result.Success)) {
                if (result instanceof Result.Error) {
                    throw ((Result.Error) result).getException();
                }
                throw new Exception("unknown");
            }
            InputStream inputStream = (InputStream) ((Result.Success) result).getData();
            if (inputStream != null) {
                return inputStream;
            }
            throw new Exception("Empty URL. Failed to fetch attachment");
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        public Object processNetworkResponse(InputStream inputStream, Continuation<? super File> continuation) {
            return this.this$0.fileFactory.writeToFile(this.$attachment.getName(), inputStream, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object saveProcessedResult(File file, Continuation<? super File> continuation) {
            FileRepository4 fileRepository4;
            C421244 c421244;
            if (continuation instanceof FileRepository4) {
                fileRepository4 = (FileRepository4) continuation;
                int i = fileRepository4.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fileRepository4.label = i - Integer.MIN_VALUE;
                } else {
                    fileRepository4 = new FileRepository4(this, continuation);
                }
            }
            Object obj = fileRepository4.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = fileRepository4.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FileFactory fileFactory = this.this$0.fileFactory;
                fileRepository4.L$0 = this;
                fileRepository4.L$1 = file;
                fileRepository4.label = 1;
                if (fileFactory.saveFile(file, fileRepository4) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c421244 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = (File) fileRepository4.L$1;
                c421244 = (C421244) fileRepository4.L$0;
                ResultKt.throwOnFailure(obj);
            }
            c421244.this$0.updateCache(c421244.$attachment, new Result.Success(file));
            return file;
        }
    }

    /* compiled from: FileRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.FileRepository$readFile$2", m3645f = "FileRepository.kt", m3646l = {98, 102}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.FileRepository$readFile$2 */
    static final class C421252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ FileAsset $attachment;
        Object L$0;
        int label;
        final /* synthetic */ FileRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421252(FileAsset fileAsset, FileRepository fileRepository, Continuation<? super C421252> continuation) {
            super(2, continuation);
            this.$attachment = fileAsset;
            this.this$0 = fileRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C421252(this.$attachment, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C421252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            if (r6 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            File file;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                file = this.$attachment.getFile();
                FileFactory fileFactory = this.this$0.fileFactory;
                String name = this.$attachment.getName();
                this.L$0 = file;
                this.label = 1;
                obj = fileFactory.create(name, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (File) obj;
            }
            file = (File) this.L$0;
            ResultKt.throwOnFailure(obj);
            File file2 = (File) obj;
            if (file2.exists()) {
                return file2;
            }
            if (file == null) {
                return null;
            }
            FileFactory fileFactory2 = this.this$0.fileFactory;
            this.L$0 = null;
            this.label = 2;
            obj = fileFactory2.saveFile(file, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readFile(FileAsset fileAsset, Continuation<? super File> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C421252(fileAsset, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCache(FileAsset attachment, Result<? extends File> result) {
        HashMap<String, Result<File>> value;
        HashMap<String, Result<File>> map;
        Result<File> result2 = this.stateFlow.getValue().get(attachment.getId());
        if (result2 instanceof Result.Success) {
            return;
        }
        if ((result instanceof Result.Success) || (result2 instanceof Result.Loading) || result2 == null) {
            StateFlow2<HashMap<String, Result<File>>> stateFlow2 = this.stateFlow;
            do {
                value = stateFlow2.getValue();
                map = new HashMap<>(value);
                map.put(attachment.getId(), result);
            } while (!stateFlow2.compareAndSet(value, map));
            Unit unit = Unit.INSTANCE;
            this.logger.log(Level.INFO, "Update cache: " + result2 + " with result: " + result);
        }
    }

    /* compiled from: FileRepository.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;", "context", "Landroid/content/Context;", "restService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "fileFactory", "Lcom/salesforce/android/smi/core/internal/util/FileFactory;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FileRepository create$default(Companion companion, Context context, RestService restService, FileFactory fileFactory, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
            if ((i & 4) != 0) {
                fileFactory = new FileFactory(FileUtil.INSTANCE.getMessagingFilesPath(context), null, 2, 0 == true ? 1 : 0);
            }
            if ((i & 8) != 0) {
                coroutineDispatcher = Dispatchers.getIO();
            }
            return companion.create(context, restService, fileFactory, coroutineDispatcher);
        }

        public final FileRepository create(Context context, RestService restService, FileFactory fileFactory, CoroutineDispatcher ioDispatcher) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(restService, "restService");
            Intrinsics.checkNotNullParameter(fileFactory, "fileFactory");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new FileRepository(applicationContext, restService, fileFactory, ioDispatcher, null);
        }
    }
}
