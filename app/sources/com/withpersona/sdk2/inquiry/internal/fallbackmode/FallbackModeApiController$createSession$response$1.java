package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.InquiryArguments;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1", m3645f = "ApiController.kt", m3646l = {84}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class FallbackModeApiController$createSession$response$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.StatusResponse>>, Object> {
    final /* synthetic */ InquiryAttributes $attributes;
    int label;
    final /* synthetic */ FallbackModeApiController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FallbackModeApiController$createSession$response$1(InquiryAttributes inquiryAttributes, FallbackModeApiController fallbackModeApiController, Continuation<? super FallbackModeApiController$createSession$response$1> continuation) {
        super(2, continuation);
        this.$attributes = inquiryAttributes;
        this.this$0 = fallbackModeApiController;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FallbackModeApiController$createSession$response$1(this.$attributes, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.StatusResponse>> continuation) {
        return ((FallbackModeApiController$createSession$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ApiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1", m3645f = "ApiController.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1 */
    static final class C436341 extends ContinuationImpl7 implements Function1<Continuation<? super Response<FallbackModeService.StatusResponse>>, Object> {
        final /* synthetic */ InquiryAttributes $attributes;
        int label;
        final /* synthetic */ FallbackModeApiController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436341(InquiryAttributes inquiryAttributes, FallbackModeApiController fallbackModeApiController, Continuation<? super C436341> continuation) {
            super(1, continuation);
            this.$attributes = inquiryAttributes;
            this.this$0 = fallbackModeApiController;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C436341(this.$attributes, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Response<FallbackModeService.StatusResponse>> continuation) {
            return ((C436341) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String str;
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
            String sessionToken = this.$attributes.getSessionToken();
            if (sessionToken == null || sessionToken.length() == 0) {
                str = null;
            } else {
                str = "Bearer " + InquiryArguments.INSTANCE.removeBearer(this.$attributes.getSessionToken());
            }
            FallbackModeService service = this.this$0.getService();
            FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.$attributes.getTemplateId());
            this.label = 1;
            Object objCheckStatus = service.checkStatus(str, statusRequest, this);
            return objCheckStatus == coroutine_suspended ? coroutine_suspended : objCheckStatus;
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
        C436341 c436341 = new C436341(this.$attributes, this.this$0, null);
        this.label = 1;
        Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c436341, this);
        return objEnqueueRetriableRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueRetriableRequestWithRetry;
    }
}
