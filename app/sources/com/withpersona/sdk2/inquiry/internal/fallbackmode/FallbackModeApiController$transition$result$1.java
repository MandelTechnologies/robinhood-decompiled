package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import java.io.IOException;
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
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Response;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1", m3645f = "ApiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class FallbackModeApiController$transition$result$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>>, Object> {
    final /* synthetic */ RequestBody $body;
    final /* synthetic */ FallbackModeService2 $endpoint;
    final /* synthetic */ String $sessionToken;
    int label;
    final /* synthetic */ FallbackModeApiController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FallbackModeApiController$transition$result$1(FallbackModeApiController fallbackModeApiController, String str, FallbackModeService2 fallbackModeService2, RequestBody requestBody, Continuation<? super FallbackModeApiController$transition$result$1> continuation) {
        super(2, continuation);
        this.this$0 = fallbackModeApiController;
        this.$sessionToken = str;
        this.$endpoint = fallbackModeService2;
        this.$body = requestBody;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FallbackModeApiController$transition$result$1(this.this$0, this.$sessionToken, this.$endpoint, this.$body, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>> continuation) {
        return ((FallbackModeApiController$transition$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ApiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1", m3645f = "ApiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1 */
    static final class C436371 extends ContinuationImpl7 implements Function1<Continuation<? super Response<FallbackModeService.UploadUrlResponse>>, Object> {
        final /* synthetic */ RequestBody $body;
        final /* synthetic */ FallbackModeService2 $endpoint;
        final /* synthetic */ String $sessionToken;
        int label;
        final /* synthetic */ FallbackModeApiController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436371(FallbackModeApiController fallbackModeApiController, String str, FallbackModeService2 fallbackModeService2, RequestBody requestBody, Continuation<? super C436371> continuation) {
            super(1, continuation);
            this.this$0 = fallbackModeApiController;
            this.$sessionToken = str;
            this.$endpoint = fallbackModeService2;
            this.$body = requestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C436371(this.this$0, this.$sessionToken, this.$endpoint, this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Response<FallbackModeService.UploadUrlResponse>> continuation) {
            return ((C436371) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            String mediaType;
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
            FallbackModeService service = this.this$0.getService();
            String str = this.$sessionToken;
            FallbackModeService2 fallbackModeService2 = this.$endpoint;
            int andIncrementCount = this.this$0.getAndIncrementCount();
            long jContentLength = this.$body.contentLength();
            MediaType contentType = this.$body.getContentType();
            if (contentType == null || (mediaType = contentType.getMediaType()) == null) {
                mediaType = "application/json";
            }
            FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(jContentLength, mediaType);
            this.label = 1;
            Object objAcquireUploadUrl = service.acquireUploadUrl(str, fallbackModeService2, andIncrementCount, uploadUrlRequest, this);
            return objAcquireUploadUrl == coroutine_suspended ? coroutine_suspended : objAcquireUploadUrl;
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
        C436371 c436371 = new C436371(this.this$0, this.$sessionToken, this.$endpoint, this.$body, null);
        this.label = 1;
        Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c436371, this);
        return objEnqueueRetriableRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueRetriableRequestWithRetry;
    }
}
