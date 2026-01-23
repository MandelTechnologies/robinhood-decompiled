package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest2;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1", m3645f = "ApiController.kt", m3646l = {120}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class FallbackModeApiController$createSession$sessionIdResponse$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.SessionIdResponse>>, Object> {
    final /* synthetic */ InquiryAttributes $attributes;
    int label;
    final /* synthetic */ FallbackModeApiController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FallbackModeApiController$createSession$sessionIdResponse$1(FallbackModeApiController fallbackModeApiController, InquiryAttributes inquiryAttributes, Continuation<? super FallbackModeApiController$createSession$sessionIdResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = fallbackModeApiController;
        this.$attributes = inquiryAttributes;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FallbackModeApiController$createSession$sessionIdResponse$1(this.this$0, this.$attributes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.SessionIdResponse>> continuation) {
        return ((FallbackModeApiController$createSession$sessionIdResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ApiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1", m3645f = "ApiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1 */
    static final class C436351 extends ContinuationImpl7 implements Function1<Continuation<? super Response<FallbackModeService.SessionIdResponse>>, Object> {
        final /* synthetic */ InquiryAttributes $attributes;
        int label;
        final /* synthetic */ FallbackModeApiController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436351(FallbackModeApiController fallbackModeApiController, InquiryAttributes inquiryAttributes, Continuation<? super C436351> continuation) {
            super(1, continuation);
            this.this$0 = fallbackModeApiController;
            this.$attributes = inquiryAttributes;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C436351(this.this$0, this.$attributes, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Response<FallbackModeService.SessionIdResponse>> continuation) {
            return ((C436351) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            FallbackModeService service = this.this$0.getService();
            FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(this.$attributes.getTemplateId(), this.$attributes.getTemplateVersion(), this.$attributes.getInquiryId(), this.$attributes.getReferenceId(), this.$attributes.getAccountId(), CreateInquiryRequest2.toServerKey(this.$attributes.getEnvironment()), this.$attributes.getEnvironmentId(), this.$attributes.getFields() != null ? new InquiryFieldMap(this.$attributes.getFields()) : null, this.$attributes.getThemeSetId());
            this.label = 1;
            Object objCreateSession = service.createSession(sessionIdRequest, this);
            return objCreateSession == coroutine_suspended ? coroutine_suspended : objCreateSession;
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
        C436351 c436351 = new C436351(this.this$0, this.$attributes, null);
        this.label = 1;
        Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c436351, this);
        return objEnqueueRetriableRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueRetriableRequestWithRetry;
    }
}
