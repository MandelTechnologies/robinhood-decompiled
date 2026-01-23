package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.plaid.internal.EnumC7081g;
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
import okhttp3.RequestBody;
import retrofit2.Response;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, m3637k = 3, m3638mv = {2, 0, 0})
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1", m3645f = "ApiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class FallbackModeApiController$transition$uploadResult$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super NetworkCallResult<Object>>, Object> {
    final /* synthetic */ RequestBody $body;
    final /* synthetic */ String $uploadUrl;
    int label;
    final /* synthetic */ FallbackModeApiController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FallbackModeApiController$transition$uploadResult$1(FallbackModeApiController fallbackModeApiController, String str, RequestBody requestBody, Continuation<? super FallbackModeApiController$transition$uploadResult$1> continuation) {
        super(2, continuation);
        this.this$0 = fallbackModeApiController;
        this.$uploadUrl = str;
        this.$body = requestBody;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FallbackModeApiController$transition$uploadResult$1(this.this$0, this.$uploadUrl, this.$body, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<Object>> continuation) {
        return ((FallbackModeApiController$transition$uploadResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ApiController.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m3636d2 = {"Lretrofit2/Response;", "", "<anonymous>", "()Lretrofit2/Response;"}, m3637k = 3, m3638mv = {2, 0, 0})
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1", m3645f = "ApiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1 */
    static final class C436381 extends ContinuationImpl7 implements Function1<Continuation<? super Response<Object>>, Object> {
        final /* synthetic */ RequestBody $body;
        final /* synthetic */ String $uploadUrl;
        int label;
        final /* synthetic */ FallbackModeApiController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436381(FallbackModeApiController fallbackModeApiController, String str, RequestBody requestBody, Continuation<? super C436381> continuation) {
            super(1, continuation);
            this.this$0 = fallbackModeApiController;
            this.$uploadUrl = str;
            this.$body = requestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C436381(this.this$0, this.$uploadUrl, this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Response<Object>> continuation) {
            return ((C436381) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            String str = this.$uploadUrl;
            RequestBody requestBody = this.$body;
            this.label = 1;
            Object objUpload = service.upload(str, requestBody, this);
            return objUpload == coroutine_suspended ? coroutine_suspended : objUpload;
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
        C436381 c436381 = new C436381(this.this$0, this.$uploadUrl, this.$body, null);
        this.label = 1;
        Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c436381, this);
        return objEnqueueRetriableRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueRetriableRequestWithRetry;
    }
}
