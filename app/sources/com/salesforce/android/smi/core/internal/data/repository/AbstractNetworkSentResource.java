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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AbstractNetworkSentResource.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 \u001d*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u001dB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\f\u001a\u00028\u0001H§@¢\u0006\u0004\b\f\u0010\tJ\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H§@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001c\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/repository/AbstractNetworkSentResource;", "ResultType", "ResponseType", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "sendAndSave", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/common/api/Result;", "invoke", "sendRequest", "response", "processNetworkResponse", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "saveProcessedResult", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "handleException", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class AbstractNetworkSentResource<ResultType, ResponseType> {
    private static final String TAG = AbstractNetworkSentResource.class.getName();
    private final CoroutineDispatcher ioDispatcher;
    private final Logger logger;

    /* compiled from: AbstractNetworkSentResource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource", m3645f = "AbstractNetworkSentResource.kt", m3646l = {17, 21}, m3647m = "invoke$suspendImpl")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource$invoke$1 */
    static final class C420961<ResultType, ResponseType> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractNetworkSentResource<ResultType, ResponseType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420961(AbstractNetworkSentResource<ResultType, ResponseType> abstractNetworkSentResource, Continuation<? super C420961> continuation) {
            super(continuation);
            this.this$0 = abstractNetworkSentResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractNetworkSentResource.invoke$suspendImpl(this.this$0, this);
        }
    }

    /* compiled from: AbstractNetworkSentResource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource", m3645f = "AbstractNetworkSentResource.kt", m3646l = {27, 28, 29}, m3647m = "sendAndSave")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource$sendAndSave$1 */
    static final class C420981 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractNetworkSentResource<ResultType, ResponseType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420981(AbstractNetworkSentResource<ResultType, ResponseType> abstractNetworkSentResource, Continuation<? super C420981> continuation) {
            super(continuation);
            this.this$0 = abstractNetworkSentResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendAndSave(this);
        }
    }

    public Object handleException(Exception exc, Continuation<? super Unit> continuation) {
        return handleException$suspendImpl(this, exc, continuation);
    }

    public Object invoke(Continuation<? super Result<? extends ResultType>> continuation) {
        return invoke$suspendImpl(this, continuation);
    }

    public abstract Object processNetworkResponse(ResponseType responsetype, Continuation<? super ResultType> continuation);

    public abstract Object saveProcessedResult(ResultType resulttype, Continuation<? super ResultType> continuation);

    public abstract Object sendRequest(Continuation<? super ResponseType> continuation);

    public AbstractNetworkSentResource(CoroutineDispatcher ioDispatcher) {
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
    static /* synthetic */ <ResultType, ResponseType> Object invoke$suspendImpl(AbstractNetworkSentResource<ResultType, ResponseType> abstractNetworkSentResource, Continuation<? super Result<? extends ResultType>> continuation) {
        C420961 c420961;
        Exception exc;
        if (continuation instanceof C420961) {
            c420961 = (C420961) continuation;
            int i = c420961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420961.label = i - Integer.MIN_VALUE;
            } else {
                c420961 = new C420961(abstractNetworkSentResource, continuation);
            }
        }
        Object objWithContext = c420961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420961.label;
        try {
        } catch (Exception e) {
            AbstractNetworkSentResource abstractNetworkSentResource2 = abstractNetworkSentResource;
            exc = e;
            c420961.L$0 = exc;
            c420961.label = 2;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcher = ((AbstractNetworkSentResource) abstractNetworkSentResource).ioDispatcher;
            C420972 c420972 = new C420972(abstractNetworkSentResource, null);
            c420961.L$0 = abstractNetworkSentResource;
            c420961.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, c420972, c420961);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exc = (Exception) c420961.L$0;
                ResultKt.throwOnFailure(objWithContext);
                return new Result.Error(exc);
            }
            abstractNetworkSentResource = (AbstractNetworkSentResource) c420961.L$0;
            ResultKt.throwOnFailure(objWithContext);
        }
        return (Result) objWithContext;
    }

    /* compiled from: AbstractNetworkSentResource.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result$Success;", "ResultType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource$invoke$2", m3645f = "AbstractNetworkSentResource.kt", m3646l = {18}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource$invoke$2 */
    static final class C420972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result.Success<? extends ResultType>>, Object> {
        int label;
        final /* synthetic */ AbstractNetworkSentResource<ResultType, ResponseType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420972(AbstractNetworkSentResource<ResultType, ResponseType> abstractNetworkSentResource, Continuation<? super C420972> continuation) {
            super(2, continuation);
            this.this$0 = abstractNetworkSentResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C420972(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result.Success<? extends ResultType>> continuation) {
            return ((C420972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractNetworkSentResource<ResultType, ResponseType> abstractNetworkSentResource = this.this$0;
                this.label = 1;
                obj = abstractNetworkSentResource.sendAndSave(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Result.Success(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAndSave(Continuation<? super ResultType> continuation) {
        C420981 c420981;
        AbstractNetworkSentResource abstractNetworkSentResource;
        AbstractNetworkSentResource abstractNetworkSentResource2;
        if (continuation instanceof C420981) {
            c420981 = (C420981) continuation;
            int i = c420981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420981.label = i - Integer.MIN_VALUE;
            } else {
                c420981 = new C420981(this, continuation);
            }
        }
        Object objSendRequest = c420981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRequest);
            c420981.L$0 = this;
            c420981.label = 1;
            objSendRequest = sendRequest(c420981);
            if (objSendRequest != coroutine_suspended) {
                abstractNetworkSentResource = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendRequest);
                return objSendRequest;
            }
            AbstractNetworkSentResource abstractNetworkSentResource3 = (AbstractNetworkSentResource) c420981.L$0;
            ResultKt.throwOnFailure(objSendRequest);
            abstractNetworkSentResource2 = abstractNetworkSentResource3;
            c420981.L$0 = null;
            c420981.label = 3;
            Object objSaveProcessedResult = abstractNetworkSentResource2.saveProcessedResult(objSendRequest, c420981);
            return objSaveProcessedResult != coroutine_suspended ? coroutine_suspended : objSaveProcessedResult;
        }
        AbstractNetworkSentResource abstractNetworkSentResource4 = (AbstractNetworkSentResource) c420981.L$0;
        ResultKt.throwOnFailure(objSendRequest);
        abstractNetworkSentResource = abstractNetworkSentResource4;
        c420981.L$0 = abstractNetworkSentResource;
        c420981.label = 2;
        objSendRequest = abstractNetworkSentResource.processNetworkResponse(objSendRequest, c420981);
        abstractNetworkSentResource2 = abstractNetworkSentResource;
        if (objSendRequest != coroutine_suspended) {
            c420981.L$0 = null;
            c420981.label = 3;
            Object objSaveProcessedResult2 = abstractNetworkSentResource2.saveProcessedResult(objSendRequest, c420981);
            if (objSaveProcessedResult2 != coroutine_suspended) {
            }
        }
    }

    static /* synthetic */ <ResultType, ResponseType> Object handleException$suspendImpl(AbstractNetworkSentResource<ResultType, ResponseType> abstractNetworkSentResource, Exception exc, Continuation<? super Unit> continuation) {
        ((AbstractNetworkSentResource) abstractNetworkSentResource).logger.log(Level.WARNING, "defaultExceptionHandler " + exc.getMessage());
        return Unit.INSTANCE;
    }
}
