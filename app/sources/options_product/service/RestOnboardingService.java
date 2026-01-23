package options_product.service;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestOnboardingService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b \u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"¨\u0006#"}, m3636d2 = {"Loptions_product/service/RestOnboardingService;", "Loptions_product/service/OnboardingService;", "Loptions_product/service/OnboardingServiceRetrofit;", "retrofit", "<init>", "(Loptions_product/service/OnboardingServiceRetrofit;)V", "Loptions_product/service/GetNextOnboardingScreensRequestDto;", "request", "Loptions_product/service/GetNextOnboardingScreensResponseDto;", "GetNextOnboardingScreens", "(Loptions_product/service/GetNextOnboardingScreensRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/UpdateOptionsSuitabilityInfoRequestDto;", "", "UpdateOptionsSuitabilityInfo", "(Loptions_product/service/UpdateOptionsSuitabilityInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/GetOptionsStatusRequestDto;", "Loptions_product/service/GetOptionsStatusResponseDto;", "GetOptionsStatus", "(Loptions_product/service/GetOptionsStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/ConfirmUserAnswersRequestDto;", "", "ConfirmUserAnswers", "(Loptions_product/service/ConfirmUserAnswersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/GetAppointmentDataRequestDto;", "Loptions_product/service/GetAppointmentDataResponseDto;", "GetAppointmentData", "(Loptions_product/service/GetAppointmentDataRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/CreateChatRequestDto;", "Loptions_product/service/CreateChatResponseDto;", "CreateChat", "(Loptions_product/service/CreateChatRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/OnboardingServiceRetrofit;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class RestOnboardingService implements OnboardingService {
    private final OnboardingServiceRetrofit retrofit;

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {85}, m3647m = "ConfirmUserAnswers")
    /* renamed from: options_product.service.RestOnboardingService$ConfirmUserAnswers$1 */
    static final class C475821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475821(Continuation<? super C475821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.ConfirmUserAnswers((ConfirmUserAnswersRequestDto) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {91}, m3647m = "ConfirmUserAnswers")
    /* renamed from: options_product.service.RestOnboardingService$ConfirmUserAnswers$2 */
    static final class C475832 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475832(Continuation<? super C475832> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.ConfirmUserAnswers((Request<ConfirmUserAnswersRequestDto>) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "CreateChat")
    /* renamed from: options_product.service.RestOnboardingService$CreateChat$1 */
    static final class C475841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475841(Continuation<? super C475841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.CreateChat((CreateChatRequestDto) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "CreateChat")
    /* renamed from: options_product.service.RestOnboardingService$CreateChat$2 */
    static final class C475852 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475852(Continuation<? super C475852> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.CreateChat((Request<CreateChatRequestDto>) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {117}, m3647m = "GetAppointmentData")
    /* renamed from: options_product.service.RestOnboardingService$GetAppointmentData$1 */
    static final class C475861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475861(Continuation<? super C475861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.GetAppointmentData((GetAppointmentDataRequestDto) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {123}, m3647m = "GetAppointmentData")
    /* renamed from: options_product.service.RestOnboardingService$GetAppointmentData$2 */
    static final class C475872 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475872(Continuation<? super C475872> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.GetAppointmentData((Request<GetAppointmentDataRequestDto>) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {21}, m3647m = "GetNextOnboardingScreens")
    /* renamed from: options_product.service.RestOnboardingService$GetNextOnboardingScreens$1 */
    static final class C475881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475881(Continuation<? super C475881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.GetNextOnboardingScreens((GetNextOnboardingScreensRequestDto) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {27}, m3647m = "GetNextOnboardingScreens")
    /* renamed from: options_product.service.RestOnboardingService$GetNextOnboardingScreens$2 */
    static final class C475892 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475892(Continuation<? super C475892> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.GetNextOnboardingScreens((Request<GetNextOnboardingScreensRequestDto>) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "GetOptionsStatus")
    /* renamed from: options_product.service.RestOnboardingService$GetOptionsStatus$1 */
    static final class C475901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475901(Continuation<? super C475901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.GetOptionsStatus((GetOptionsStatusRequestDto) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {74}, m3647m = "GetOptionsStatus")
    /* renamed from: options_product.service.RestOnboardingService$GetOptionsStatus$2 */
    static final class C475912 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475912(Continuation<? super C475912> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.GetOptionsStatus((Request<GetOptionsStatusRequestDto>) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {52}, m3647m = "UpdateOptionsSuitabilityInfo")
    /* renamed from: options_product.service.RestOnboardingService$UpdateOptionsSuitabilityInfo$1 */
    static final class C475921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475921(Continuation<? super C475921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.UpdateOptionsSuitabilityInfo((UpdateOptionsSuitabilityInfoRequestDto) null, this);
        }
    }

    /* compiled from: RestOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestOnboardingService", m3645f = "RestOnboardingService.kt", m3646l = {58}, m3647m = "UpdateOptionsSuitabilityInfo")
    /* renamed from: options_product.service.RestOnboardingService$UpdateOptionsSuitabilityInfo$2 */
    static final class C475932 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475932(Continuation<? super C475932> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestOnboardingService.this.UpdateOptionsSuitabilityInfo((Request<UpdateOptionsSuitabilityInfoRequestDto>) null, this);
        }
    }

    public RestOnboardingService(OnboardingServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetNextOnboardingScreens(GetNextOnboardingScreensRequestDto getNextOnboardingScreensRequestDto, Continuation<? super GetNextOnboardingScreensResponseDto> continuation) {
        C475881 c475881;
        if (continuation instanceof C475881) {
            c475881 = (C475881) continuation;
            int i = c475881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475881.label = i - Integer.MIN_VALUE;
            } else {
                c475881 = new C475881(continuation);
            }
        }
        Object objGetNextOnboardingScreens = c475881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetNextOnboardingScreens);
            Request<GetNextOnboardingScreensRequestDto> request = new Request<>(getNextOnboardingScreensRequestDto, null, 2, null);
            c475881.label = 1;
            objGetNextOnboardingScreens = GetNextOnboardingScreens(request, c475881);
            if (objGetNextOnboardingScreens == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetNextOnboardingScreens);
        }
        return ((Response) objGetNextOnboardingScreens).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetNextOnboardingScreens(Request<GetNextOnboardingScreensRequestDto> request, Continuation<? super Response<GetNextOnboardingScreensResponseDto>> continuation) {
        C475892 c475892;
        if (continuation instanceof C475892) {
            c475892 = (C475892) continuation;
            int i = c475892.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475892.label = i - Integer.MIN_VALUE;
            } else {
                c475892 = new C475892(continuation);
            }
        }
        Object objGetNextOnboardingScreens = c475892.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475892.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetNextOnboardingScreens);
            OnboardingServiceRetrofit onboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            GetNextOnboardingScreensRequestDto data = request.getData();
            c475892.label = 1;
            objGetNextOnboardingScreens = onboardingServiceRetrofit.GetNextOnboardingScreens(metadata, data, c475892);
            if (objGetNextOnboardingScreens == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetNextOnboardingScreens);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetNextOnboardingScreens);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateOptionsSuitabilityInfo(UpdateOptionsSuitabilityInfoRequestDto updateOptionsSuitabilityInfoRequestDto, Continuation<Object> continuation) {
        C475921 c475921;
        if (continuation instanceof C475921) {
            c475921 = (C475921) continuation;
            int i = c475921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475921.label = i - Integer.MIN_VALUE;
            } else {
                c475921 = new C475921(continuation);
            }
        }
        Object objUpdateOptionsSuitabilityInfo = c475921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateOptionsSuitabilityInfo);
            Request<UpdateOptionsSuitabilityInfoRequestDto> request = new Request<>(updateOptionsSuitabilityInfoRequestDto, null, 2, null);
            c475921.label = 1;
            objUpdateOptionsSuitabilityInfo = UpdateOptionsSuitabilityInfo(request, c475921);
            if (objUpdateOptionsSuitabilityInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateOptionsSuitabilityInfo);
        }
        return ((Response) objUpdateOptionsSuitabilityInfo).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateOptionsSuitabilityInfo(Request<UpdateOptionsSuitabilityInfoRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C475932 c475932;
        if (continuation instanceof C475932) {
            c475932 = (C475932) continuation;
            int i = c475932.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475932.label = i - Integer.MIN_VALUE;
            } else {
                c475932 = new C475932(continuation);
            }
        }
        Object objUpdateOptionsSuitabilityInfo = c475932.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475932.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateOptionsSuitabilityInfo);
            OnboardingServiceRetrofit onboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            UpdateOptionsSuitabilityInfoRequestDto data = request.getData();
            c475932.label = 1;
            objUpdateOptionsSuitabilityInfo = onboardingServiceRetrofit.UpdateOptionsSuitabilityInfo(metadata, data, c475932);
            if (objUpdateOptionsSuitabilityInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateOptionsSuitabilityInfo);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUpdateOptionsSuitabilityInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOptionsStatus(GetOptionsStatusRequestDto getOptionsStatusRequestDto, Continuation<? super GetOptionsStatusResponseDto> continuation) {
        C475901 c475901;
        if (continuation instanceof C475901) {
            c475901 = (C475901) continuation;
            int i = c475901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475901.label = i - Integer.MIN_VALUE;
            } else {
                c475901 = new C475901(continuation);
            }
        }
        Object objGetOptionsStatus = c475901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOptionsStatus);
            Request<GetOptionsStatusRequestDto> request = new Request<>(getOptionsStatusRequestDto, null, 2, null);
            c475901.label = 1;
            objGetOptionsStatus = GetOptionsStatus(request, c475901);
            if (objGetOptionsStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOptionsStatus);
        }
        return ((Response) objGetOptionsStatus).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOptionsStatus(Request<GetOptionsStatusRequestDto> request, Continuation<? super Response<GetOptionsStatusResponseDto>> continuation) {
        C475912 c475912;
        if (continuation instanceof C475912) {
            c475912 = (C475912) continuation;
            int i = c475912.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475912.label = i - Integer.MIN_VALUE;
            } else {
                c475912 = new C475912(continuation);
            }
        }
        Object objGetOptionsStatus = c475912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOptionsStatus);
            OnboardingServiceRetrofit onboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            String options_eligibility_knowledge_check_manual_review_m1 = request.getData().getOptions_eligibility_knowledge_check_manual_review_m1();
            c475912.label = 1;
            objGetOptionsStatus = onboardingServiceRetrofit.GetOptionsStatus(metadata, account_number, options_eligibility_knowledge_check_manual_review_m1, c475912);
            if (objGetOptionsStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOptionsStatus);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetOptionsStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ConfirmUserAnswers(ConfirmUserAnswersRequestDto confirmUserAnswersRequestDto, Continuation<? super Unit> continuation) {
        C475821 c475821;
        if (continuation instanceof C475821) {
            c475821 = (C475821) continuation;
            int i = c475821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475821.label = i - Integer.MIN_VALUE;
            } else {
                c475821 = new C475821(continuation);
            }
        }
        Object objConfirmUserAnswers = c475821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objConfirmUserAnswers);
            Request<ConfirmUserAnswersRequestDto> request = new Request<>(confirmUserAnswersRequestDto, null, 2, null);
            c475821.label = 1;
            objConfirmUserAnswers = ConfirmUserAnswers(request, c475821);
            if (objConfirmUserAnswers == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objConfirmUserAnswers);
        }
        ((Response) objConfirmUserAnswers).getData();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ConfirmUserAnswers(Request<ConfirmUserAnswersRequestDto> request, Continuation<? super Response<Unit>> continuation) {
        C475832 c475832;
        if (continuation instanceof C475832) {
            c475832 = (C475832) continuation;
            int i = c475832.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475832.label = i - Integer.MIN_VALUE;
            } else {
                c475832 = new C475832(continuation);
            }
        }
        Object objConfirmUserAnswers = c475832.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475832.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objConfirmUserAnswers);
            OnboardingServiceRetrofit onboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            ConfirmUserAnswersRequestDto data = request.getData();
            c475832.label = 1;
            objConfirmUserAnswers = onboardingServiceRetrofit.ConfirmUserAnswers(metadata, data, c475832);
            if (objConfirmUserAnswers == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objConfirmUserAnswers);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objConfirmUserAnswers);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAppointmentData(GetAppointmentDataRequestDto getAppointmentDataRequestDto, Continuation<? super GetAppointmentDataResponseDto> continuation) {
        C475861 c475861;
        if (continuation instanceof C475861) {
            c475861 = (C475861) continuation;
            int i = c475861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475861.label = i - Integer.MIN_VALUE;
            } else {
                c475861 = new C475861(continuation);
            }
        }
        Object objGetAppointmentData = c475861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAppointmentData);
            Request<GetAppointmentDataRequestDto> request = new Request<>(getAppointmentDataRequestDto, null, 2, null);
            c475861.label = 1;
            objGetAppointmentData = GetAppointmentData(request, c475861);
            if (objGetAppointmentData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAppointmentData);
        }
        return ((Response) objGetAppointmentData).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAppointmentData(Request<GetAppointmentDataRequestDto> request, Continuation<? super Response<GetAppointmentDataResponseDto>> continuation) {
        C475872 c475872;
        if (continuation instanceof C475872) {
            c475872 = (C475872) continuation;
            int i = c475872.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475872.label = i - Integer.MIN_VALUE;
            } else {
                c475872 = new C475872(continuation);
            }
        }
        Object objGetAppointmentData = c475872.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475872.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAppointmentData);
            OnboardingServiceRetrofit onboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            c475872.label = 1;
            objGetAppointmentData = onboardingServiceRetrofit.GetAppointmentData(metadata, account_number, c475872);
            if (objGetAppointmentData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAppointmentData);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAppointmentData);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateChat(CreateChatRequestDto createChatRequestDto, Continuation<? super CreateChatResponseDto> continuation) {
        C475841 c475841;
        if (continuation instanceof C475841) {
            c475841 = (C475841) continuation;
            int i = c475841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475841.label = i - Integer.MIN_VALUE;
            } else {
                c475841 = new C475841(continuation);
            }
        }
        Object objCreateChat = c475841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateChat);
            Request<CreateChatRequestDto> request = new Request<>(createChatRequestDto, null, 2, null);
            c475841.label = 1;
            objCreateChat = CreateChat(request, c475841);
            if (objCreateChat == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateChat);
        }
        return ((Response) objCreateChat).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateChat(Request<CreateChatRequestDto> request, Continuation<? super Response<CreateChatResponseDto>> continuation) {
        C475852 c475852;
        if (continuation instanceof C475852) {
            c475852 = (C475852) continuation;
            int i = c475852.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475852.label = i - Integer.MIN_VALUE;
            } else {
                c475852 = new C475852(continuation);
            }
        }
        Object objCreateChat = c475852.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475852.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateChat);
            OnboardingServiceRetrofit onboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateChatRequestDto data = request.getData();
            c475852.label = 1;
            objCreateChat = onboardingServiceRetrofit.CreateChat(metadata, data, c475852);
            if (objCreateChat == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateChat);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateChat);
    }
}
