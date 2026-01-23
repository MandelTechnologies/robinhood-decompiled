package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.p424ui.network.TransitionInquiryRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* compiled from: RealFallbackModeManager.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J\"\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/RealFallbackModeManager;", "Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;", "fallbackMode", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "apiController", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiController;", "environment", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiController;Lcom/withpersona/sdk2/inquiry/internal/Environment;Lcom/squareup/moshi/Moshi;)V", "getFallbackMode", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "isFallbackModeActive", "", "()Z", "value", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession;", "currentSession", "getCurrentSession", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession;", "createFallbackSession", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;", "(Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", NavTransition2.KEY_TRANSITION, "Lretrofit2/Response;", "sessionToken", "", CarResultComposable2.BODY, "", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionBack", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class RealFallbackModeManager implements FallbackModeManager {
    private final ApiController apiController;
    private StaticTemplateSession currentSession;
    private final Environment environment;
    private final FallbackMode fallbackMode;
    private final Moshi moshi;

    /* compiled from: RealFallbackModeManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", m3645f = "RealFallbackModeManager.kt", m3646l = {49}, m3647m = "createFallbackSession")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager$createFallbackSession$1 */
    static final class C436391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C436391(Continuation<? super C436391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealFallbackModeManager.this.createFallbackSession(null, this);
        }
    }

    /* compiled from: RealFallbackModeManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", m3645f = "RealFallbackModeManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 89, 101}, m3647m = NavTransition2.KEY_TRANSITION)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager$transition$1 */
    static final class C436401 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C436401(Continuation<? super C436401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealFallbackModeManager.this.transition(null, null, this);
        }
    }

    /* compiled from: RealFallbackModeManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", m3645f = "RealFallbackModeManager.kt", m3646l = {125, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "transitionBack")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager$transitionBack$1 */
    static final class C436411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C436411(Continuation<? super C436411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealFallbackModeManager.this.transitionBack(null, null, this);
        }
    }

    public RealFallbackModeManager(FallbackMode fallbackMode, ApiController apiController, Environment environment, Moshi moshi) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        Intrinsics.checkNotNullParameter(apiController, "apiController");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.fallbackMode = fallbackMode;
        this.apiController = apiController;
        this.environment = environment;
        this.moshi = moshi;
    }

    public FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    @Override // com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager
    public boolean isFallbackModeActive() {
        return getFallbackMode() == FallbackMode.ALWAYS;
    }

    public final StaticTemplateSession getCurrentSession() {
        return this.currentSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFallbackSession(InquiryAttributes inquiryAttributes, Continuation<? super InternalErrorInfo.NetworkErrorInfo> continuation) {
        C436391 c436391;
        Object objMo27391createSessiongIAlus;
        RealFallbackModeManager realFallbackModeManager;
        if (continuation instanceof C436391) {
            c436391 = (C436391) continuation;
            int i = c436391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436391.label = i - Integer.MIN_VALUE;
            } else {
                c436391 = new C436391(continuation);
            }
        }
        Object obj = c436391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ApiController apiController = this.apiController;
            c436391.L$0 = this;
            c436391.label = 1;
            objMo27391createSessiongIAlus = apiController.mo27391createSessiongIAlus(inquiryAttributes, c436391);
            if (objMo27391createSessiongIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            realFallbackModeManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            realFallbackModeManager = (RealFallbackModeManager) c436391.L$0;
            ResultKt.throwOnFailure(obj);
            objMo27391createSessiongIAlus = ((Result) obj).getValue();
        }
        if (Result.m28556isSuccessimpl(objMo27391createSessiongIAlus)) {
            realFallbackModeManager.currentSession = (StaticTemplateSession) objMo27391createSessiongIAlus;
        }
        if (Result.m28553exceptionOrNullimpl(objMo27391createSessiongIAlus) != null) {
            return new InternalErrorInfo.NetworkErrorInfo(0, "Failed to create fallback session.", false, null, 8, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (createFallbackSession(r8, r2) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        if (r1 == r3) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transition(String str, Object obj, Continuation<? super Response<?>> continuation) {
        C436401 c436401;
        String str2;
        Object obj2;
        RealFallbackModeManager realFallbackModeManager;
        Response responseSuccess;
        if (continuation instanceof C436401) {
            c436401 = (C436401) continuation;
            int i = c436401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436401.label = i - Integer.MIN_VALUE;
            } else {
                c436401 = new C436401(continuation);
            }
        }
        Object objTransitionWithRequestBody = c436401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436401.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTransitionWithRequestBody);
            if (this.currentSession == null) {
                str2 = str;
                InquiryAttributes inquiryAttributes = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, null, 2023, null);
                c436401.L$0 = this;
                c436401.L$1 = str2;
                obj2 = obj;
                c436401.L$2 = obj2;
                c436401.label = 1;
            } else {
                str2 = str;
                obj2 = obj;
            }
            realFallbackModeManager = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objTransitionWithRequestBody);
                    return objTransitionWithRequestBody;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objTransitionWithRequestBody);
                responseSuccess = (Response) objTransitionWithRequestBody;
                Intrinsics.checkNotNull(responseSuccess);
                return responseSuccess;
            }
            Object obj3 = c436401.L$2;
            String str3 = (String) c436401.L$1;
            realFallbackModeManager = (RealFallbackModeManager) c436401.L$0;
            ResultKt.throwOnFailure(objTransitionWithRequestBody);
            obj2 = obj3;
            str2 = str3;
        }
        StaticTemplateSession staticTemplateSession = realFallbackModeManager.currentSession;
        if (staticTemplateSession != null) {
            staticTemplateSession.next();
        }
        String str4 = null;
        Object[] objArr = 0;
        if (obj2 instanceof SubmitDocumentRequest) {
            Response responseSuccess2 = Response.success(null);
            Intrinsics.checkNotNull(responseSuccess2);
            return responseSuccess2;
        }
        if (obj2 instanceof TransitionInquiryRequest) {
            String json = realFallbackModeManager.moshi.adapter(TransitionInquiryRequest.class).toJson(obj2);
            RequestBody.Companion companion = RequestBody.INSTANCE;
            Intrinsics.checkNotNull(json);
            RequestBody requestBodyCreate = companion.create(json, MediaType.INSTANCE.get("application/json"));
            ApiController apiController = realFallbackModeManager.apiController;
            c436401.L$0 = null;
            c436401.L$1 = null;
            c436401.L$2 = null;
            c436401.label = 2;
            Object objTransitionWithRequestBody2 = apiController.transitionWithRequestBody(str2, requestBodyCreate, c436401);
            if (objTransitionWithRequestBody2 != coroutine_suspended) {
                return objTransitionWithRequestBody2;
            }
        } else if (TypeIntrinsics.isMutableList(obj2) && !((Collection) obj2).isEmpty()) {
            if (CollectionsKt.first((List) obj2) instanceof MultipartBody.Part) {
                MultipartBody.Builder builder = new MultipartBody.Builder(str4, i3, objArr == true ? 1 : 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj2) {
                    if (obj4 instanceof MultipartBody.Part) {
                        arrayList.add(obj4);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    builder.addPart((MultipartBody.Part) it.next());
                }
                MultipartBody multipartBodyBuild = builder.build();
                ApiController apiController2 = realFallbackModeManager.apiController;
                c436401.L$0 = null;
                c436401.L$1 = null;
                c436401.L$2 = null;
                c436401.label = 3;
                objTransitionWithRequestBody = apiController2.transitionWithRequestBody(str2, multipartBodyBuild, c436401);
            } else {
                responseSuccess = Response.success(null);
                Intrinsics.checkNotNull(responseSuccess);
                return responseSuccess;
            }
        } else {
            Response responseSuccess3 = Response.success(null);
            Intrinsics.checkNotNull(responseSuccess3);
            return responseSuccess3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (createFallbackSession(r9, r3) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transitionBack(String str, Object obj, Continuation<? super Response<?>> continuation) {
        C436411 c436411;
        String str2;
        RealFallbackModeManager realFallbackModeManager;
        Object obj2 = obj;
        if (continuation instanceof C436411) {
            c436411 = (C436411) continuation;
            int i = c436411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436411.label = i - Integer.MIN_VALUE;
            } else {
                c436411 = new C436411(continuation);
            }
        }
        Object obj3 = c436411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj3);
            if (!(obj2 instanceof TransitionBackRequest)) {
                ResponseBody.Companion companion = ResponseBody.INSTANCE;
                String json = this.moshi.adapter(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Body is not a TransitionBackRequest"));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Response responseError = Response.error(0, companion.create(json, MediaType.INSTANCE.get("application/json")));
                Intrinsics.checkNotNullExpressionValue(responseError, "error(...)");
                return responseError;
            }
            if (this.currentSession == null) {
                str2 = str;
                InquiryAttributes inquiryAttributes = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, null, 2023, null);
                c436411.L$0 = this;
                c436411.L$1 = str2;
                c436411.L$2 = obj2;
                c436411.label = 1;
            } else {
                str2 = str;
            }
            realFallbackModeManager = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj3);
                return obj3;
            }
            obj2 = c436411.L$2;
            String str3 = (String) c436411.L$1;
            realFallbackModeManager = (RealFallbackModeManager) c436411.L$0;
            ResultKt.throwOnFailure(obj3);
            str2 = str3;
        }
        StaticTemplateSession staticTemplateSession = realFallbackModeManager.currentSession;
        if (staticTemplateSession != null) {
            staticTemplateSession.previous();
        }
        String json2 = realFallbackModeManager.moshi.adapter(TransitionBackRequest.class).toJson(obj2);
        RequestBody.Companion companion2 = RequestBody.INSTANCE;
        Intrinsics.checkNotNull(json2);
        RequestBody requestBodyCreate = companion2.create(json2, MediaType.INSTANCE.get("application/json"));
        ApiController apiController = realFallbackModeManager.apiController;
        c436411.L$0 = null;
        c436411.L$1 = null;
        c436411.L$2 = null;
        c436411.label = 2;
        Object objTransitionBack = apiController.transitionBack(str2, requestBodyCreate, c436411);
        return objTransitionBack == coroutine_suspended ? coroutine_suspended : objTransitionBack;
    }
}
