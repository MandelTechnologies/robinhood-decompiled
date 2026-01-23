package bonfire.proto.idl.advisory.p030v1;

import bonfire.proto.idl.transfers.p040v1.TransferAccountTypeDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestAdvisoryOnboardingService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/RestAdvisoryOnboardingService;", "Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingService;", "retrofit", "Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingServiceRetrofit;", "<init>", "(Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingServiceRetrofit;)V", "CreateAdvisoryApplication", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto;", "request", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationRequestDto;", "(Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAdvisorySwipeToSubmitDetails", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsResponseDto;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto;", "(Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestAdvisoryOnboardingService implements AdvisoryOnboardingService {
    private final AdvisoryOnboardingServiceRetrofit retrofit;

    /* compiled from: RestAdvisoryOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisory.v1.RestAdvisoryOnboardingService", m3645f = "RestAdvisoryOnboardingService.kt", m3646l = {21}, m3647m = "CreateAdvisoryApplication")
    /* renamed from: bonfire.proto.idl.advisory.v1.RestAdvisoryOnboardingService$CreateAdvisoryApplication$1 */
    static final class C39451 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39451(Continuation<? super C39451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryOnboardingService.this.CreateAdvisoryApplication((CreateAdvisoryApplicationRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisory.v1.RestAdvisoryOnboardingService", m3645f = "RestAdvisoryOnboardingService.kt", m3646l = {27}, m3647m = "CreateAdvisoryApplication")
    /* renamed from: bonfire.proto.idl.advisory.v1.RestAdvisoryOnboardingService$CreateAdvisoryApplication$2 */
    static final class C39462 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39462(Continuation<? super C39462> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryOnboardingService.this.CreateAdvisoryApplication((Request<CreateAdvisoryApplicationRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisory.v1.RestAdvisoryOnboardingService", m3645f = "RestAdvisoryOnboardingService.kt", m3646l = {37}, m3647m = "GetAdvisorySwipeToSubmitDetails")
    /* renamed from: bonfire.proto.idl.advisory.v1.RestAdvisoryOnboardingService$GetAdvisorySwipeToSubmitDetails$1 */
    static final class C39471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39471(Continuation<? super C39471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryOnboardingService.this.GetAdvisorySwipeToSubmitDetails((GetAdvisorySwipeToSubmitDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.advisory.v1.RestAdvisoryOnboardingService", m3645f = "RestAdvisoryOnboardingService.kt", m3646l = {43}, m3647m = "GetAdvisorySwipeToSubmitDetails")
    /* renamed from: bonfire.proto.idl.advisory.v1.RestAdvisoryOnboardingService$GetAdvisorySwipeToSubmitDetails$2 */
    static final class C39482 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C39482(Continuation<? super C39482> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryOnboardingService.this.GetAdvisorySwipeToSubmitDetails((Request<GetAdvisorySwipeToSubmitDetailsRequestDto>) null, this);
        }
    }

    public RestAdvisoryOnboardingService(AdvisoryOnboardingServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.advisory.p030v1.AdvisoryOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateAdvisoryApplication(CreateAdvisoryApplicationRequestDto createAdvisoryApplicationRequestDto, Continuation<? super CreateAdvisoryApplicationResponseDto> continuation) {
        C39451 c39451;
        if (continuation instanceof C39451) {
            c39451 = (C39451) continuation;
            int i = c39451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39451.label = i - Integer.MIN_VALUE;
            } else {
                c39451 = new C39451(continuation);
            }
        }
        Object objCreateAdvisoryApplication = c39451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39451.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateAdvisoryApplication);
            Request<CreateAdvisoryApplicationRequestDto> request = new Request<>(createAdvisoryApplicationRequestDto, null, 2, null);
            c39451.label = 1;
            objCreateAdvisoryApplication = CreateAdvisoryApplication(request, c39451);
            if (objCreateAdvisoryApplication == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateAdvisoryApplication);
        }
        return ((Response) objCreateAdvisoryApplication).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateAdvisoryApplication(Request<CreateAdvisoryApplicationRequestDto> request, Continuation<? super Response<CreateAdvisoryApplicationResponseDto>> continuation) {
        C39462 c39462;
        if (continuation instanceof C39462) {
            c39462 = (C39462) continuation;
            int i = c39462.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39462.label = i - Integer.MIN_VALUE;
            } else {
                c39462 = new C39462(continuation);
            }
        }
        Object objCreateAdvisoryApplication = c39462.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39462.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateAdvisoryApplication);
            AdvisoryOnboardingServiceRetrofit advisoryOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateAdvisoryApplicationRequestDto data = request.getData();
            c39462.label = 1;
            objCreateAdvisoryApplication = advisoryOnboardingServiceRetrofit.CreateAdvisoryApplication(metadata, data, c39462);
            if (objCreateAdvisoryApplication == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateAdvisoryApplication);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateAdvisoryApplication);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.advisory.p030v1.AdvisoryOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisorySwipeToSubmitDetails(GetAdvisorySwipeToSubmitDetailsRequestDto getAdvisorySwipeToSubmitDetailsRequestDto, Continuation<? super GetAdvisorySwipeToSubmitDetailsResponseDto> continuation) {
        C39471 c39471;
        if (continuation instanceof C39471) {
            c39471 = (C39471) continuation;
            int i = c39471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39471.label = i - Integer.MIN_VALUE;
            } else {
                c39471 = new C39471(continuation);
            }
        }
        Object objGetAdvisorySwipeToSubmitDetails = c39471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39471.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisorySwipeToSubmitDetails);
            Request<GetAdvisorySwipeToSubmitDetailsRequestDto> request = new Request<>(getAdvisorySwipeToSubmitDetailsRequestDto, null, 2, null);
            c39471.label = 1;
            objGetAdvisorySwipeToSubmitDetails = GetAdvisorySwipeToSubmitDetails(request, c39471);
            if (objGetAdvisorySwipeToSubmitDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisorySwipeToSubmitDetails);
        }
        return ((Response) objGetAdvisorySwipeToSubmitDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisorySwipeToSubmitDetails(Request<GetAdvisorySwipeToSubmitDetailsRequestDto> request, Continuation<? super Response<GetAdvisorySwipeToSubmitDetailsResponseDto>> continuation) {
        C39482 c39482;
        if (continuation instanceof C39482) {
            c39482 = (C39482) continuation;
            int i = c39482.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39482.label = i - Integer.MIN_VALUE;
            } else {
                c39482 = new C39482(continuation);
            }
        }
        C39482 c394822 = c39482;
        Object objGetAdvisorySwipeToSubmitDetails = c394822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c394822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisorySwipeToSubmitDetails);
            AdvisoryOnboardingServiceRetrofit advisoryOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            String transfer_amount_display_string = !Intrinsics.areEqual(request.getData().getTransfer_amount_display_string(), "") ? request.getData().getTransfer_amount_display_string() : null;
            String source_account_display_name = !Intrinsics.areEqual(request.getData().getSource_account_display_name(), "") ? request.getData().getSource_account_display_name() : null;
            String transfer_account_type = !Intrinsics.areEqual(request.getData().getTransfer_account_type(), "") ? request.getData().getTransfer_account_type() : null;
            SwipeToSubmitDetailsContextDto context = request.getData().getContext() != SwipeToSubmitDetailsContextDto.INSTANCE.getZeroValue() ? request.getData().getContext() : null;
            TransferAccountTypeDto source_transfer_account_type = request.getData().getSource_transfer_account_type() != TransferAccountTypeDto.INSTANCE.getZeroValue() ? request.getData().getSource_transfer_account_type() : null;
            c394822.label = 1;
            objGetAdvisorySwipeToSubmitDetails = advisoryOnboardingServiceRetrofit.GetAdvisorySwipeToSubmitDetails(metadata, account_number, transfer_amount_display_string, source_account_display_name, transfer_account_type, context, source_transfer_account_type, c394822);
            if (objGetAdvisorySwipeToSubmitDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisorySwipeToSubmitDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAdvisorySwipeToSubmitDetails);
    }
}
