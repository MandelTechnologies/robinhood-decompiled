package com.salesforce.android.smi.core.internal.data.repository;

import com.salesforce.android.smi.common.api.Result;
import com.singular.sdk.internal.Constants;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AbstractNetworkFetchedResource.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 &*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001&B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0082@¢\u0006\u0004\b\n\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000H§@¢\u0006\u0004\b\u0010\u0010\tJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00018\u0001H§@¢\u0006\u0004\b\u0014\u0010\tJ\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H§@¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0097@¢\u0006\u0004\b\u001a\u0010\tJ\u001c\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0097@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/repository/AbstractNetworkFetchedResource;", "ResultType", "ResponseType", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadOrFetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndSave", "Lcom/salesforce/android/smi/common/api/Result;", "invoke", "", "forceRefresh", "()Z", "loadFromCache", "cachedResult", "isCachedResultDirty", "(Ljava/lang/Object;)Z", "sendRequest", "response", "processNetworkResponse", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "saveProcessedResult", "handleEmptyResult", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "handleException", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class AbstractNetworkFetchedResource<ResultType, ResponseType> {
    private static final String TAG = AbstractNetworkFetchedResource.class.getName();
    private final CoroutineDispatcher ioDispatcher;
    private final Logger logger;

    /* compiled from: AbstractNetworkFetchedResource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource", m3645f = "AbstractNetworkFetchedResource.kt", m3646l = {42, 43, 44, 45, 46}, m3647m = "fetchAndSave")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource$fetchAndSave$1 */
    static final class C420921 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractNetworkFetchedResource<ResultType, ResponseType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420921(AbstractNetworkFetchedResource<ResultType, ResponseType> abstractNetworkFetchedResource, Continuation<? super C420921> continuation) {
            super(continuation);
            this.this$0 = abstractNetworkFetchedResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fetchAndSave(this);
        }
    }

    /* compiled from: AbstractNetworkFetchedResource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource", m3645f = "AbstractNetworkFetchedResource.kt", m3646l = {18, 23}, m3647m = "invoke$suspendImpl")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource$invoke$1 */
    static final class C420931<ResultType, ResponseType> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractNetworkFetchedResource<ResultType, ResponseType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420931(AbstractNetworkFetchedResource<ResultType, ResponseType> abstractNetworkFetchedResource, Continuation<? super C420931> continuation) {
            super(continuation);
            this.this$0 = abstractNetworkFetchedResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractNetworkFetchedResource.invoke$suspendImpl(this.this$0, this);
        }
    }

    /* compiled from: AbstractNetworkFetchedResource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource", m3645f = "AbstractNetworkFetchedResource.kt", m3646l = {30, 32, 34}, m3647m = "loadOrFetch")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource$loadOrFetch$1 */
    static final class C420951 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractNetworkFetchedResource<ResultType, ResponseType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420951(AbstractNetworkFetchedResource<ResultType, ResponseType> abstractNetworkFetchedResource, Continuation<? super C420951> continuation) {
            super(continuation);
            this.this$0 = abstractNetworkFetchedResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.loadOrFetch(this);
        }
    }

    static /* synthetic */ <ResultType, ResponseType> Object handleEmptyResult$suspendImpl(AbstractNetworkFetchedResource<ResultType, ResponseType> abstractNetworkFetchedResource, Continuation<? super ResultType> continuation) {
        return null;
    }

    /* renamed from: forceRefresh */
    public boolean get$forceRefresh() {
        return false;
    }

    public Object handleEmptyResult(Continuation<? super ResultType> continuation) {
        return handleEmptyResult$suspendImpl(this, continuation);
    }

    public Object handleException(Exception exc, Continuation<? super Unit> continuation) {
        return handleException$suspendImpl(this, exc, continuation);
    }

    public Object invoke(Continuation<? super Result<? extends ResultType>> continuation) {
        return invoke$suspendImpl(this, continuation);
    }

    public boolean isCachedResultDirty(ResultType cachedResult) {
        return cachedResult == null;
    }

    public abstract Object loadFromCache(Continuation<? super ResultType> continuation);

    public abstract Object processNetworkResponse(ResponseType responsetype, Continuation<? super ResultType> continuation);

    public abstract Object saveProcessedResult(ResultType resulttype, Continuation<? super ResultType> continuation);

    public abstract Object sendRequest(Continuation<? super ResponseType> continuation);

    public AbstractNetworkFetchedResource(CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.ioDispatcher = ioDispatcher;
        this.logger = Logger.getLogger(TAG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r8.handleException(r7, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <ResultType, ResponseType> Object invoke$suspendImpl(AbstractNetworkFetchedResource<ResultType, ResponseType> abstractNetworkFetchedResource, Continuation<? super Result<? extends ResultType>> continuation) {
        C420931 c420931;
        Exception exc;
        if (continuation instanceof C420931) {
            c420931 = (C420931) continuation;
            int i = c420931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420931.label = i - Integer.MIN_VALUE;
            } else {
                c420931 = new C420931(abstractNetworkFetchedResource, continuation);
            }
        }
        Object objWithContext = c420931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420931.label;
        try {
        } catch (Exception e) {
            AbstractNetworkFetchedResource abstractNetworkFetchedResource2 = abstractNetworkFetchedResource;
            exc = e;
            c420931.L$0 = exc;
            c420931.label = 2;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcher = ((AbstractNetworkFetchedResource) abstractNetworkFetchedResource).ioDispatcher;
            C420942 c420942 = new C420942(abstractNetworkFetchedResource, null);
            c420931.L$0 = abstractNetworkFetchedResource;
            c420931.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, c420942, c420931);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exc = (Exception) c420931.L$0;
                ResultKt.throwOnFailure(objWithContext);
                return new Result.Error(exc);
            }
            abstractNetworkFetchedResource = (AbstractNetworkFetchedResource) c420931.L$0;
            ResultKt.throwOnFailure(objWithContext);
        }
        return (Result) objWithContext;
    }

    /* compiled from: AbstractNetworkFetchedResource.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\f\u0012\b\u0012\u0006\b\u0002\u0018\u00018\u00000\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource$invoke$2", m3645f = "AbstractNetworkFetchedResource.kt", m3646l = {19}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource$invoke$2 */
    static final class C420942 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends ResultType>>, Object> {
        int label;
        final /* synthetic */ AbstractNetworkFetchedResource<ResultType, ResponseType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420942(AbstractNetworkFetchedResource<ResultType, ResponseType> abstractNetworkFetchedResource, Continuation<? super C420942> continuation) {
            super(2, continuation);
            this.this$0 = abstractNetworkFetchedResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C420942(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ResultType>> continuation) {
            return ((C420942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractNetworkFetchedResource<ResultType, ResponseType> abstractNetworkFetchedResource = this.this$0;
                this.label = 1;
                obj = abstractNetworkFetchedResource.loadOrFetch(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj != null ? new Result.Success(obj) : Result.Empty.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadOrFetch(Continuation<? super ResultType> continuation) {
        C420951 c420951;
        AbstractNetworkFetchedResource abstractNetworkFetchedResource;
        if (continuation instanceof C420951) {
            c420951 = (C420951) continuation;
            int i = c420951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420951.label = i - Integer.MIN_VALUE;
            } else {
                c420951 = new C420951(this, continuation);
            }
        }
        Object objLoadFromCache = c420951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadFromCache);
            if (get$forceRefresh()) {
                c420951.label = 1;
                Object objFetchAndSave = fetchAndSave(c420951);
                if (objFetchAndSave != coroutine_suspended) {
                    return objFetchAndSave;
                }
            } else {
                c420951.L$0 = this;
                c420951.label = 2;
                objLoadFromCache = loadFromCache(c420951);
                if (objLoadFromCache != coroutine_suspended) {
                    abstractNetworkFetchedResource = this;
                }
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objLoadFromCache);
            return objLoadFromCache;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoadFromCache);
            return objLoadFromCache;
        }
        AbstractNetworkFetchedResource abstractNetworkFetchedResource2 = (AbstractNetworkFetchedResource) c420951.L$0;
        ResultKt.throwOnFailure(objLoadFromCache);
        abstractNetworkFetchedResource = abstractNetworkFetchedResource2;
        if (abstractNetworkFetchedResource.isCachedResultDirty(objLoadFromCache)) {
            c420951.L$0 = null;
            c420951.label = 3;
            objLoadFromCache = abstractNetworkFetchedResource.fetchAndSave(c420951);
            if (objLoadFromCache == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return objLoadFromCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r9 != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[PHI: r2
      0x0084: PHI (r2v4 com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource) = 
      (r2v17 com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource)
      (r2v18 com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource)
     binds: [B:32:0x0081, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource, com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource<ResultType, ResponseType>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndSave(Continuation<? super ResultType> continuation) {
        C420921 c420921;
        ?? r2;
        ?? r22;
        Object objSaveProcessedResult;
        AbstractNetworkFetchedResource abstractNetworkFetchedResource;
        if (continuation instanceof C420921) {
            c420921 = (C420921) continuation;
            int i = c420921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420921.label = i - Integer.MIN_VALUE;
            } else {
                c420921 = new C420921(this, continuation);
            }
        }
        Object objSendRequest = c420921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRequest);
            c420921.L$0 = this;
            c420921.label = 1;
            objSendRequest = sendRequest(c420921);
            if (objSendRequest != coroutine_suspended) {
                r2 = this;
            }
        }
        if (i2 == 1) {
            AbstractNetworkFetchedResource abstractNetworkFetchedResource2 = (AbstractNetworkFetchedResource) c420921.L$0;
            ResultKt.throwOnFailure(objSendRequest);
            r2 = abstractNetworkFetchedResource2;
        } else {
            if (i2 == 2) {
                AbstractNetworkFetchedResource abstractNetworkFetchedResource3 = (AbstractNetworkFetchedResource) c420921.L$0;
                ResultKt.throwOnFailure(objSendRequest);
                r22 = abstractNetworkFetchedResource3;
                c420921.L$0 = r22;
                c420921.label = 3;
                objSaveProcessedResult = r22.saveProcessedResult(objSendRequest, c420921);
                abstractNetworkFetchedResource = r22;
                if (objSaveProcessedResult != coroutine_suspended) {
                    c420921.L$0 = abstractNetworkFetchedResource;
                    c420921.label = 4;
                    objSendRequest = abstractNetworkFetchedResource.loadFromCache(c420921);
                    r2 = abstractNetworkFetchedResource;
                }
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objSendRequest);
                    return objSendRequest;
                }
                AbstractNetworkFetchedResource abstractNetworkFetchedResource4 = (AbstractNetworkFetchedResource) c420921.L$0;
                ResultKt.throwOnFailure(objSendRequest);
                r2 = abstractNetworkFetchedResource4;
                if (objSendRequest != null) {
                    return objSendRequest;
                }
                c420921.L$0 = null;
                c420921.label = 5;
                Object objHandleEmptyResult = r2.handleEmptyResult(c420921);
                return objHandleEmptyResult != coroutine_suspended ? coroutine_suspended : objHandleEmptyResult;
            }
            AbstractNetworkFetchedResource abstractNetworkFetchedResource5 = (AbstractNetworkFetchedResource) c420921.L$0;
            ResultKt.throwOnFailure(objSendRequest);
            abstractNetworkFetchedResource = abstractNetworkFetchedResource5;
            c420921.L$0 = abstractNetworkFetchedResource;
            c420921.label = 4;
            objSendRequest = abstractNetworkFetchedResource.loadFromCache(c420921);
            r2 = abstractNetworkFetchedResource;
        }
        if (objSendRequest != null) {
            c420921.L$0 = r2;
            c420921.label = 2;
            objSendRequest = r2.processNetworkResponse(objSendRequest, c420921);
            r22 = r2;
            if (objSendRequest != coroutine_suspended) {
                c420921.L$0 = r22;
                c420921.label = 3;
                objSaveProcessedResult = r22.saveProcessedResult(objSendRequest, c420921);
                abstractNetworkFetchedResource = r22;
                if (objSaveProcessedResult != coroutine_suspended) {
                }
            }
        } else {
            c420921.L$0 = null;
            c420921.label = 5;
            Object objHandleEmptyResult2 = r2.handleEmptyResult(c420921);
            if (objHandleEmptyResult2 != coroutine_suspended) {
            }
        }
    }

    static /* synthetic */ <ResultType, ResponseType> Object handleException$suspendImpl(AbstractNetworkFetchedResource<ResultType, ResponseType> abstractNetworkFetchedResource, Exception exc, Continuation<? super Unit> continuation) {
        ((AbstractNetworkFetchedResource) abstractNetworkFetchedResource).logger.log(Level.WARNING, "defaultExceptionHandler " + exc.getMessage());
        return Unit.INSTANCE;
    }
}
