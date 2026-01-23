package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.internal.InquiryArguments;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeApiController;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiController;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "service", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession$Factory;", "staticTemplateSessionFactory", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lcom/squareup/moshi/Moshi;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession$Factory;)V", "", "getAndIncrementCount", "()I", "", "sessionToken", "Lokhttp3/RequestBody;", CarResultComposable2.BODY, "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ProductionEndpoint;", "endpoint", "Lretrofit2/Response;", NavTransition2.KEY_TRANSITION, "(Ljava/lang/String;Lokhttp3/RequestBody;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ProductionEndpoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;", "attributes", "Lkotlin/Result;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession;", "createSession-gIAlu-s", "(Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSession", "transitionWithRequestBody", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionBack", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "getService", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession$Factory;", "getStaticTemplateSessionFactory", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession$Factory;", "requestCount", "I", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FallbackModeApiController implements ApiController {
    private final Moshi moshi;
    private int requestCount;
    private final FallbackModeService service;
    private final StaticTemplateSession.Factory staticTemplateSessionFactory;

    /* compiled from: ApiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", m3645f = "ApiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = NavTransition2.KEY_TRANSITION)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$1 */
    static final class C436361 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C436361(Continuation<? super C436361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FallbackModeApiController.this.transition(null, null, null, this);
        }
    }

    public FallbackModeApiController(FallbackModeService service, Moshi moshi, StaticTemplateSession.Factory staticTemplateSessionFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.service = service;
        this.moshi = moshi;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
    }

    public final FallbackModeService getService() {
        return this.service;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAndIncrementCount() {
        int i = this.requestCount + 1;
        this.requestCount = i;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    /* renamed from: createSession-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27391createSessiongIAlus(InquiryAttributes inquiryAttributes, Continuation<? super Result<StaticTemplateSession>> continuation) {
        FallbackModeApiController$createSession$1 fallbackModeApiController$createSession$1;
        String sessionToken;
        FallbackModeApiController fallbackModeApiController;
        List<NextStep> list;
        FallbackModeApiController fallbackModeApiController2;
        FallbackModeService.StaticTemplate staticInquiryTemplate;
        NetworkCallResult networkCallResult;
        if (continuation instanceof FallbackModeApiController$createSession$1) {
            fallbackModeApiController$createSession$1 = (FallbackModeApiController$createSession$1) continuation;
            int i = fallbackModeApiController$createSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fallbackModeApiController$createSession$1.label = i - Integer.MIN_VALUE;
            } else {
                fallbackModeApiController$createSession$1 = new FallbackModeApiController$createSession$1(this, continuation);
            }
        }
        Object objWithContext = fallbackModeApiController$createSession$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fallbackModeApiController$createSession$1.label;
        String token = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            String templateId = inquiryAttributes.getTemplateId();
            if ((templateId == null || templateId.length() == 0) && ((sessionToken = inquiryAttributes.getSessionToken()) == null || sessionToken.length() == 0)) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(new FallbackException("Expected templateId or session token to be non-null")));
            }
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            FallbackModeApiController$createSession$response$1 fallbackModeApiController$createSession$response$1 = new FallbackModeApiController$createSession$response$1(inquiryAttributes, this, null);
            fallbackModeApiController$createSession$1.L$0 = this;
            fallbackModeApiController$createSession$1.L$1 = inquiryAttributes;
            fallbackModeApiController$createSession$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fallbackModeApiController$createSession$response$1, fallbackModeApiController$createSession$1);
            if (objWithContext != coroutine_suspended) {
                fallbackModeApiController = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) fallbackModeApiController$createSession$1.L$1;
            fallbackModeApiController2 = (FallbackModeApiController) fallbackModeApiController$createSession$1.L$0;
            ResultKt.throwOnFailure(objWithContext);
            networkCallResult = (NetworkCallResult) objWithContext;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                if (!(networkCallResult instanceof NetworkCallResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                FallbackModeService.SessionIdResponse sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (sessionIdResponse != null) {
                    token = sessionIdResponse.getToken();
                }
            }
            if (token != null) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(new FallbackException("Failed to create session")));
            }
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(fallbackModeApiController2.staticTemplateSessionFactory.create(list, token));
        }
        inquiryAttributes = (InquiryAttributes) fallbackModeApiController$createSession$1.L$1;
        fallbackModeApiController = (FallbackModeApiController) fallbackModeApiController$createSession$1.L$0;
        ResultKt.throwOnFailure(objWithContext);
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objWithContext;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new FallbackException("Failed to check status")));
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        FallbackModeService.StatusResponse statusResponse = (FallbackModeService.StatusResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        List<NextStep> steps = (statusResponse == null || (staticInquiryTemplate = statusResponse.getStaticInquiryTemplate()) == null) ? null : staticInquiryTemplate.getSteps();
        if (steps == null || steps.isEmpty()) {
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new FallbackException("Expected steps to contain at least one step")));
        }
        if (inquiryAttributes.getSessionToken() != null) {
            String strRemoveBearer = InquiryArguments.INSTANCE.removeBearer(inquiryAttributes.getSessionToken());
            if (strRemoveBearer == null) {
                strRemoveBearer = inquiryAttributes.getSessionToken();
            }
            Result.Companion companion6 = Result.INSTANCE;
            return Result.m28550constructorimpl(fallbackModeApiController.staticTemplateSessionFactory.create(steps, strRemoveBearer));
        }
        String templateId2 = inquiryAttributes.getTemplateId();
        if (templateId2 == null || templateId2.length() == 0) {
            Result.Companion companion7 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new FallbackException("Template ID is required to create a fallback session without an existing session token")));
        }
        CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
        FallbackModeApiController$createSession$sessionIdResponse$1 fallbackModeApiController$createSession$sessionIdResponse$1 = new FallbackModeApiController$createSession$sessionIdResponse$1(fallbackModeApiController, inquiryAttributes, null);
        fallbackModeApiController$createSession$1.L$0 = fallbackModeApiController;
        fallbackModeApiController$createSession$1.L$1 = steps;
        fallbackModeApiController$createSession$1.label = 2;
        Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, fallbackModeApiController$createSession$sessionIdResponse$1, fallbackModeApiController$createSession$1);
        if (objWithContext2 != coroutine_suspended) {
            List<NextStep> list2 = steps;
            objWithContext = objWithContext2;
            list = list2;
            fallbackModeApiController2 = fallbackModeApiController;
            networkCallResult = (NetworkCallResult) objWithContext;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            }
            if (token != null) {
            }
        }
        return coroutine_suspended;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    public Object transitionWithRequestBody(String str, RequestBody requestBody, Continuation<? super Response<?>> continuation) {
        return transition(str, requestBody, FallbackModeService2.Transition, continuation);
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    public Object transitionBack(String str, RequestBody requestBody, Continuation<? super Response<?>> continuation) {
        return transition(str, requestBody, FallbackModeService2.TransitionBack, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transition(String str, RequestBody requestBody, FallbackModeService2 fallbackModeService2, Continuation<? super Response<?>> continuation) {
        C436361 c436361;
        FallbackModeApiController fallbackModeApiController;
        RequestBody requestBody2;
        FallbackModeApiController fallbackModeApiController2;
        NetworkCallResult networkCallResult;
        if (continuation instanceof C436361) {
            c436361 = (C436361) continuation;
            int i = c436361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436361.label = i - Integer.MIN_VALUE;
            } else {
                c436361 = new C436361(continuation);
            }
        }
        C436361 c4363612 = c436361;
        Object objWithContext = c4363612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4363612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            FallbackModeApiController$transition$result$1 fallbackModeApiController$transition$result$1 = new FallbackModeApiController$transition$result$1(this, str, fallbackModeService2, requestBody, null);
            c4363612.L$0 = this;
            c4363612.L$1 = requestBody;
            c4363612.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fallbackModeApiController$transition$result$1, c4363612);
            if (objWithContext != coroutine_suspended) {
                fallbackModeApiController = this;
                requestBody2 = requestBody;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fallbackModeApiController2 = (FallbackModeApiController) c4363612.L$0;
            ResultKt.throwOnFailure(objWithContext);
            networkCallResult = (NetworkCallResult) objWithContext;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                ResponseBody.Companion companion = ResponseBody.INSTANCE;
                String json = fallbackModeApiController2.moshi.adapter(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Response responseError = Response.error(0, companion.create(json, MediaType.INSTANCE.get("application/json")));
                Intrinsics.checkNotNull(responseError);
                return responseError;
            }
            if (!(networkCallResult instanceof NetworkCallResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Response responseSuccess = Response.success(null);
            Intrinsics.checkNotNull(responseSuccess);
            return responseSuccess;
        }
        requestBody2 = (RequestBody) c4363612.L$1;
        fallbackModeApiController = (FallbackModeApiController) c4363612.L$0;
        ResultKt.throwOnFailure(objWithContext);
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objWithContext;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            ResponseBody.Companion companion2 = ResponseBody.INSTANCE;
            String json2 = fallbackModeApiController.moshi.adapter(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
            Response responseError2 = Response.error(0, companion2.create(json2, MediaType.INSTANCE.get("application/json")));
            Intrinsics.checkNotNullExpressionValue(responseError2, "error(...)");
            return responseError2;
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        FallbackModeService.UploadUrlResponse uploadUrlResponse = (FallbackModeService.UploadUrlResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        String location = uploadUrlResponse != null ? uploadUrlResponse.getLocation() : null;
        if (location == null) {
            ResponseBody.Companion companion3 = ResponseBody.INSTANCE;
            String json3 = fallbackModeApiController.moshi.adapter(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
            Response responseError3 = Response.error(0, companion3.create(json3, MediaType.INSTANCE.get("application/json")));
            Intrinsics.checkNotNullExpressionValue(responseError3, "error(...)");
            return responseError3;
        }
        CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
        FallbackModeApiController$transition$uploadResult$1 fallbackModeApiController$transition$uploadResult$1 = new FallbackModeApiController$transition$uploadResult$1(fallbackModeApiController, location, requestBody2, null);
        c4363612.L$0 = fallbackModeApiController;
        c4363612.L$1 = null;
        c4363612.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher2, fallbackModeApiController$transition$uploadResult$1, c4363612);
        if (objWithContext != coroutine_suspended) {
            fallbackModeApiController2 = fallbackModeApiController;
            networkCallResult = (NetworkCallResult) objWithContext;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            }
        }
        return coroutine_suspended;
    }
}
