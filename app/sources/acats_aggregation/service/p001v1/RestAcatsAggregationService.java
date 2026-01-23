package acats_aggregation.service.p001v1;

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

/* compiled from: RestAcatsAggregationService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lacats_aggregation/service/v1/RestAcatsAggregationService;", "Lacats_aggregation/service/v1/AcatsAggregationService;", "Lacats_aggregation/service/v1/AcatsAggregationServiceRetrofit;", "retrofit", "<init>", "(Lacats_aggregation/service/v1/AcatsAggregationServiceRetrofit;)V", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryRequestDto;", "request", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryResponseDto;", "FeeReimbursementsHistory", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsRequestDto;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;", "FeeReimbursementsHistoryDetails", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lacats_aggregation/service/v1/PlaidIntroRequestDto;", "Lacats_aggregation/service/v1/PlaidIntroResponseDto;", "PlaidIntro", "(Lacats_aggregation/service/v1/PlaidIntroRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lacats_aggregation/service/v1/AcatsAggregationServiceRetrofit;", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RestAcatsAggregationService implements AcatsAggregationService {
    private final AcatsAggregationServiceRetrofit retrofit;

    /* compiled from: RestAcatsAggregationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "acats_aggregation.service.v1.RestAcatsAggregationService", m3645f = "RestAcatsAggregationService.kt", m3646l = {20}, m3647m = "FeeReimbursementsHistory")
    /* renamed from: acats_aggregation.service.v1.RestAcatsAggregationService$FeeReimbursementsHistory$1 */
    static final class C00871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00871(Continuation<? super C00871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsAggregationService.this.FeeReimbursementsHistory((FeeReimbursementsHistoryRequestDto) null, this);
        }
    }

    /* compiled from: RestAcatsAggregationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "acats_aggregation.service.v1.RestAcatsAggregationService", m3645f = "RestAcatsAggregationService.kt", m3646l = {26}, m3647m = "FeeReimbursementsHistory")
    /* renamed from: acats_aggregation.service.v1.RestAcatsAggregationService$FeeReimbursementsHistory$2 */
    static final class C00882 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00882(Continuation<? super C00882> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsAggregationService.this.FeeReimbursementsHistory((Request<FeeReimbursementsHistoryRequestDto>) null, this);
        }
    }

    /* compiled from: RestAcatsAggregationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "acats_aggregation.service.v1.RestAcatsAggregationService", m3645f = "RestAcatsAggregationService.kt", m3646l = {35}, m3647m = "FeeReimbursementsHistoryDetails")
    /* renamed from: acats_aggregation.service.v1.RestAcatsAggregationService$FeeReimbursementsHistoryDetails$1 */
    static final class C00891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00891(Continuation<? super C00891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsAggregationService.this.FeeReimbursementsHistoryDetails((FeeReimbursementsHistoryDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestAcatsAggregationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "acats_aggregation.service.v1.RestAcatsAggregationService", m3645f = "RestAcatsAggregationService.kt", m3646l = {41}, m3647m = "FeeReimbursementsHistoryDetails")
    /* renamed from: acats_aggregation.service.v1.RestAcatsAggregationService$FeeReimbursementsHistoryDetails$2 */
    static final class C00902 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00902(Continuation<? super C00902> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsAggregationService.this.FeeReimbursementsHistoryDetails((Request<FeeReimbursementsHistoryDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestAcatsAggregationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "acats_aggregation.service.v1.RestAcatsAggregationService", m3645f = "RestAcatsAggregationService.kt", m3646l = {52}, m3647m = "PlaidIntro")
    /* renamed from: acats_aggregation.service.v1.RestAcatsAggregationService$PlaidIntro$1 */
    static final class C00911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00911(Continuation<? super C00911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsAggregationService.this.PlaidIntro((PlaidIntroRequestDto) null, this);
        }
    }

    /* compiled from: RestAcatsAggregationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "acats_aggregation.service.v1.RestAcatsAggregationService", m3645f = "RestAcatsAggregationService.kt", m3646l = {58}, m3647m = "PlaidIntro")
    /* renamed from: acats_aggregation.service.v1.RestAcatsAggregationService$PlaidIntro$2 */
    static final class C00922 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00922(Continuation<? super C00922> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsAggregationService.this.PlaidIntro((Request<PlaidIntroRequestDto>) null, this);
        }
    }

    public RestAcatsAggregationService(AcatsAggregationServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // acats_aggregation.service.p001v1.AcatsAggregationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FeeReimbursementsHistory(FeeReimbursementsHistoryRequestDto feeReimbursementsHistoryRequestDto, Continuation<? super FeeReimbursementsHistoryResponseDto> continuation) {
        C00871 c00871;
        if (continuation instanceof C00871) {
            c00871 = (C00871) continuation;
            int i = c00871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00871.label = i - Integer.MIN_VALUE;
            } else {
                c00871 = new C00871(continuation);
            }
        }
        Object objFeeReimbursementsHistory = c00871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c00871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFeeReimbursementsHistory);
            Request<FeeReimbursementsHistoryRequestDto> request = new Request<>(feeReimbursementsHistoryRequestDto, null, 2, null);
            c00871.label = 1;
            objFeeReimbursementsHistory = FeeReimbursementsHistory(request, c00871);
            if (objFeeReimbursementsHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFeeReimbursementsHistory);
        }
        return ((Response) objFeeReimbursementsHistory).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FeeReimbursementsHistory(Request<FeeReimbursementsHistoryRequestDto> request, Continuation<? super Response<FeeReimbursementsHistoryResponseDto>> continuation) {
        C00882 c00882;
        if (continuation instanceof C00882) {
            c00882 = (C00882) continuation;
            int i = c00882.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00882.label = i - Integer.MIN_VALUE;
            } else {
                c00882 = new C00882(continuation);
            }
        }
        Object objFeeReimbursementsHistory = c00882.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c00882.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFeeReimbursementsHistory);
            AcatsAggregationServiceRetrofit acatsAggregationServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c00882.label = 1;
            objFeeReimbursementsHistory = acatsAggregationServiceRetrofit.FeeReimbursementsHistory(metadata, c00882);
            if (objFeeReimbursementsHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFeeReimbursementsHistory);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFeeReimbursementsHistory);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // acats_aggregation.service.p001v1.AcatsAggregationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FeeReimbursementsHistoryDetails(FeeReimbursementsHistoryDetailsRequestDto feeReimbursementsHistoryDetailsRequestDto, Continuation<? super FeeReimbursementsHistoryDetailsResponseDto> continuation) {
        C00891 c00891;
        if (continuation instanceof C00891) {
            c00891 = (C00891) continuation;
            int i = c00891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00891.label = i - Integer.MIN_VALUE;
            } else {
                c00891 = new C00891(continuation);
            }
        }
        Object objFeeReimbursementsHistoryDetails = c00891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c00891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFeeReimbursementsHistoryDetails);
            Request<FeeReimbursementsHistoryDetailsRequestDto> request = new Request<>(feeReimbursementsHistoryDetailsRequestDto, null, 2, null);
            c00891.label = 1;
            objFeeReimbursementsHistoryDetails = FeeReimbursementsHistoryDetails(request, c00891);
            if (objFeeReimbursementsHistoryDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFeeReimbursementsHistoryDetails);
        }
        return ((Response) objFeeReimbursementsHistoryDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FeeReimbursementsHistoryDetails(Request<FeeReimbursementsHistoryDetailsRequestDto> request, Continuation<? super Response<FeeReimbursementsHistoryDetailsResponseDto>> continuation) {
        C00902 c00902;
        if (continuation instanceof C00902) {
            c00902 = (C00902) continuation;
            int i = c00902.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00902.label = i - Integer.MIN_VALUE;
            } else {
                c00902 = new C00902(continuation);
            }
        }
        Object objFeeReimbursementsHistoryDetails = c00902.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c00902.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFeeReimbursementsHistoryDetails);
            AcatsAggregationServiceRetrofit acatsAggregationServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            String id = request.getData().getId();
            c00902.label = 1;
            objFeeReimbursementsHistoryDetails = acatsAggregationServiceRetrofit.FeeReimbursementsHistoryDetails(metadata, account_number, id, c00902);
            if (objFeeReimbursementsHistoryDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFeeReimbursementsHistoryDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFeeReimbursementsHistoryDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // acats_aggregation.service.p001v1.AcatsAggregationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PlaidIntro(PlaidIntroRequestDto plaidIntroRequestDto, Continuation<? super PlaidIntroResponseDto> continuation) {
        C00911 c00911;
        if (continuation instanceof C00911) {
            c00911 = (C00911) continuation;
            int i = c00911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00911.label = i - Integer.MIN_VALUE;
            } else {
                c00911 = new C00911(continuation);
            }
        }
        Object objPlaidIntro = c00911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c00911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPlaidIntro);
            Request<PlaidIntroRequestDto> request = new Request<>(plaidIntroRequestDto, null, 2, null);
            c00911.label = 1;
            objPlaidIntro = PlaidIntro(request, c00911);
            if (objPlaidIntro == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPlaidIntro);
        }
        return ((Response) objPlaidIntro).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PlaidIntro(Request<PlaidIntroRequestDto> request, Continuation<? super Response<PlaidIntroResponseDto>> continuation) {
        C00922 c00922;
        if (continuation instanceof C00922) {
            c00922 = (C00922) continuation;
            int i = c00922.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00922.label = i - Integer.MIN_VALUE;
            } else {
                c00922 = new C00922(continuation);
            }
        }
        Object objPlaidIntro = c00922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c00922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPlaidIntro);
            AcatsAggregationServiceRetrofit acatsAggregationServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c00922.label = 1;
            objPlaidIntro = acatsAggregationServiceRetrofit.PlaidIntro(metadata, c00922);
            if (objPlaidIntro == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPlaidIntro);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objPlaidIntro);
    }
}
