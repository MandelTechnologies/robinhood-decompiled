package com.salesforce.android.smi.remote.internal.api.rest;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.remote.internal.dto.request.acknowledgement.ReadAcknowledgeEntriesRequest;
import java.util.UUID;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RestService.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "", "it", "Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/ReadAcknowledgeEntriesRequest;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$sendReadAckThrottled$1", m3645f = "RestService.kt", m3646l = {389}, m3647m = "invokeSuspend")
/* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$sendReadAckThrottled$1, reason: use source file name */
/* loaded from: classes12.dex */
final class RestService3 extends ContinuationImpl7 implements Function2<ReadAcknowledgeEntriesRequest, Continuation<? super Result<? extends Unit>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RestService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestService3(RestService restService, Continuation<? super RestService3> continuation) {
        super(2, continuation);
        this.this$0 = restService;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RestService3 restService3 = new RestService3(this.this$0, continuation);
        restService3.L$0 = obj;
        return restService3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ReadAcknowledgeEntriesRequest readAcknowledgeEntriesRequest, Continuation<? super Result<Unit>> continuation) {
        return ((RestService3) create(readAcknowledgeEntriesRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ReadAcknowledgeEntriesRequest readAcknowledgeEntriesRequest, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(readAcknowledgeEntriesRequest, (Continuation<? super Result<Unit>>) continuation);
    }

    /* compiled from: RestService.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$sendReadAckThrottled$1$1", m3645f = "RestService.kt", m3646l = {392}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$sendReadAckThrottled$1$1 */
    static final class C423431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
        final /* synthetic */ ReadAcknowledgeEntriesRequest $it;
        int label;
        final /* synthetic */ RestService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C423431(ReadAcknowledgeEntriesRequest readAcknowledgeEntriesRequest, RestService restService, Continuation<? super C423431> continuation) {
            super(2, continuation);
            this.$it = readAcknowledgeEntriesRequest;
            this.this$0 = restService;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C423431(this.$it, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
            return ((C423431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UUID conversationId = this.$it.getConversationId();
                    if (conversationId != null) {
                        RestService restService = this.this$0;
                        ReadAcknowledgeEntriesRequest readAcknowledgeEntriesRequest = this.$it;
                        RestApi restApi = restService.api;
                        this.label = 1;
                        if (restApi.sendReadAcknowledgeEntries(readAcknowledgeEntriesRequest, conversationId, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return new Result.Error(new Exception("Missing required argument: conversationId"));
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return new Result.Success(Unit.INSTANCE);
            } catch (Exception e) {
                this.this$0.logger.log(Level.WARNING, e.getMessage());
                return new Result.Error(e);
            }
        }
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
        ReadAcknowledgeEntriesRequest readAcknowledgeEntriesRequest = (ReadAcknowledgeEntriesRequest) this.L$0;
        CoroutineDispatcher coroutineDispatcher = this.this$0.ioDispatcher;
        C423431 c423431 = new C423431(readAcknowledgeEntriesRequest, this.this$0, null);
        this.label = 1;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, c423431, this);
        return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
    }
}
