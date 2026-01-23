package black_widow_bff.service.p026v1;

import black_widow_bff.model.p025v1.AppChannelDto;
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

/* compiled from: RestBlackWidowBffService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lblack_widow_bff/service/v1/RestBlackWidowBffService;", "Lblack_widow_bff/service/v1/BlackWidowBffService;", "Lblack_widow_bff/service/v1/BlackWidowBffServiceRetrofit;", "retrofit", "<init>", "(Lblack_widow_bff/service/v1/BlackWidowBffServiceRetrofit;)V", "Lblack_widow_bff/service/v1/SendEmailAccessLinkRequestDto;", "request", "Lblack_widow_bff/service/v1/SendEmailAccessLinkResponseDto;", "SendEmailAccessLink", "(Lblack_widow_bff/service/v1/SendEmailAccessLinkRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lblack_widow_bff/service/v1/MobileAppChartVersionRequestDto;", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto;", "MobileAppChartVersion", "(Lblack_widow_bff/service/v1/MobileAppChartVersionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lblack_widow_bff/service/v1/BlackWidowBffServiceRetrofit;", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestBlackWidowBffService implements BlackWidowBffService {
    private final BlackWidowBffServiceRetrofit retrofit;

    /* compiled from: RestBlackWidowBffService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "black_widow_bff.service.v1.RestBlackWidowBffService", m3645f = "RestBlackWidowBffService.kt", m3646l = {97}, m3647m = "MobileAppChartVersion")
    /* renamed from: black_widow_bff.service.v1.RestBlackWidowBffService$MobileAppChartVersion$1 */
    static final class C37021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37021(Continuation<? super C37021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBlackWidowBffService.this.MobileAppChartVersion((MobileAppChartVersionRequestDto) null, this);
        }
    }

    /* compiled from: RestBlackWidowBffService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "black_widow_bff.service.v1.RestBlackWidowBffService", m3645f = "RestBlackWidowBffService.kt", m3646l = {100}, m3647m = "MobileAppChartVersion")
    /* renamed from: black_widow_bff.service.v1.RestBlackWidowBffService$MobileAppChartVersion$2 */
    static final class C37032 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37032(Continuation<? super C37032> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBlackWidowBffService.this.MobileAppChartVersion((Request<MobileAppChartVersionRequestDto>) null, this);
        }
    }

    /* compiled from: RestBlackWidowBffService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "black_widow_bff.service.v1.RestBlackWidowBffService", m3645f = "RestBlackWidowBffService.kt", m3646l = {27}, m3647m = "SendEmailAccessLink")
    /* renamed from: black_widow_bff.service.v1.RestBlackWidowBffService$SendEmailAccessLink$1 */
    static final class C37041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37041(Continuation<? super C37041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBlackWidowBffService.this.SendEmailAccessLink((SendEmailAccessLinkRequestDto) null, this);
        }
    }

    /* compiled from: RestBlackWidowBffService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "black_widow_bff.service.v1.RestBlackWidowBffService", m3645f = "RestBlackWidowBffService.kt", m3646l = {30}, m3647m = "SendEmailAccessLink")
    /* renamed from: black_widow_bff.service.v1.RestBlackWidowBffService$SendEmailAccessLink$2 */
    static final class C37052 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37052(Continuation<? super C37052> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBlackWidowBffService.this.SendEmailAccessLink((Request<SendEmailAccessLinkRequestDto>) null, this);
        }
    }

    public RestBlackWidowBffService(BlackWidowBffServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // black_widow_bff.service.p026v1.BlackWidowBffService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendEmailAccessLink(SendEmailAccessLinkRequestDto sendEmailAccessLinkRequestDto, Continuation<? super SendEmailAccessLinkResponseDto> continuation) {
        C37041 c37041;
        if (continuation instanceof C37041) {
            c37041 = (C37041) continuation;
            int i = c37041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37041.label = i - Integer.MIN_VALUE;
            } else {
                c37041 = new C37041(continuation);
            }
        }
        Object objSendEmailAccessLink = c37041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendEmailAccessLink);
            Request<SendEmailAccessLinkRequestDto> request = new Request<>(sendEmailAccessLinkRequestDto, null, 2, null);
            c37041.label = 1;
            objSendEmailAccessLink = SendEmailAccessLink(request, c37041);
            if (objSendEmailAccessLink == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendEmailAccessLink);
        }
        return ((Response) objSendEmailAccessLink).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendEmailAccessLink(Request<SendEmailAccessLinkRequestDto> request, Continuation<? super Response<SendEmailAccessLinkResponseDto>> continuation) {
        C37052 c37052;
        if (continuation instanceof C37052) {
            c37052 = (C37052) continuation;
            int i = c37052.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37052.label = i - Integer.MIN_VALUE;
            } else {
                c37052 = new C37052(continuation);
            }
        }
        Object objSendEmailAccessLink = c37052.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37052.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendEmailAccessLink);
            BlackWidowBffServiceRetrofit blackWidowBffServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SendEmailAccessLinkRequestDto data = request.getData();
            c37052.label = 1;
            objSendEmailAccessLink = blackWidowBffServiceRetrofit.SendEmailAccessLink(metadata, data, c37052);
            if (objSendEmailAccessLink == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendEmailAccessLink);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSendEmailAccessLink);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // black_widow_bff.service.p026v1.BlackWidowBffService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object MobileAppChartVersion(MobileAppChartVersionRequestDto mobileAppChartVersionRequestDto, Continuation<? super MobileAppChartVersionResponseDto> continuation) {
        C37021 c37021;
        if (continuation instanceof C37021) {
            c37021 = (C37021) continuation;
            int i = c37021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37021.label = i - Integer.MIN_VALUE;
            } else {
                c37021 = new C37021(continuation);
            }
        }
        Object objMobileAppChartVersion = c37021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMobileAppChartVersion);
            Request<MobileAppChartVersionRequestDto> request = new Request<>(mobileAppChartVersionRequestDto, null, 2, null);
            c37021.label = 1;
            objMobileAppChartVersion = MobileAppChartVersion(request, c37021);
            if (objMobileAppChartVersion == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMobileAppChartVersion);
        }
        return ((Response) objMobileAppChartVersion).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object MobileAppChartVersion(Request<MobileAppChartVersionRequestDto> request, Continuation<? super Response<MobileAppChartVersionResponseDto>> continuation) {
        C37032 c37032;
        if (continuation instanceof C37032) {
            c37032 = (C37032) continuation;
            int i = c37032.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37032.label = i - Integer.MIN_VALUE;
            } else {
                c37032 = new C37032(continuation);
            }
        }
        Object objMobileAppChartVersion = c37032.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37032.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMobileAppChartVersion);
            BlackWidowBffServiceRetrofit blackWidowBffServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            AppChannelDto app_channel = request.getData().getApp_channel() != AppChannelDto.INSTANCE.getZeroValue() ? request.getData().getApp_channel() : null;
            String client_cached_chart_version = Intrinsics.areEqual(request.getData().getClient_cached_chart_version(), "") ? null : request.getData().getClient_cached_chart_version();
            c37032.label = 1;
            objMobileAppChartVersion = blackWidowBffServiceRetrofit.MobileAppChartVersion(metadata, app_channel, client_cached_chart_version, c37032);
            if (objMobileAppChartVersion == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMobileAppChartVersion);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objMobileAppChartVersion);
    }
}
