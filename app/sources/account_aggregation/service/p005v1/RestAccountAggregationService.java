package account_aggregation.service.p005v1;

import account_aggregation.service.models.p004v1.AccountSwitcherLocationDto;
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

/* compiled from: RestAccountAggregationService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Laccount_aggregation/service/v1/RestAccountAggregationService;", "Laccount_aggregation/service/v1/AccountAggregationService;", "retrofit", "Laccount_aggregation/service/v1/AccountAggregationServiceRetrofit;", "<init>", "(Laccount_aggregation/service/v1/AccountAggregationServiceRetrofit;)V", "GetAccountSwitcher", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto;", "request", "Laccount_aggregation/service/v1/GetAccountSwitcherRequestDto;", "(Laccount_aggregation/service/v1/GetAccountSwitcherRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RestAccountAggregationService implements AccountAggregationService {
    private final AccountAggregationServiceRetrofit retrofit;

    /* compiled from: RestAccountAggregationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "account_aggregation.service.v1.RestAccountAggregationService", m3645f = "RestAccountAggregationService.kt", m3646l = {21}, m3647m = "GetAccountSwitcher")
    /* renamed from: account_aggregation.service.v1.RestAccountAggregationService$GetAccountSwitcher$1 */
    static final class C01571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C01571(Continuation<? super C01571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountAggregationService.this.GetAccountSwitcher((GetAccountSwitcherRequestDto) null, this);
        }
    }

    /* compiled from: RestAccountAggregationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "account_aggregation.service.v1.RestAccountAggregationService", m3645f = "RestAccountAggregationService.kt", m3646l = {27}, m3647m = "GetAccountSwitcher")
    /* renamed from: account_aggregation.service.v1.RestAccountAggregationService$GetAccountSwitcher$2 */
    static final class C01582 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C01582(Continuation<? super C01582> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountAggregationService.this.GetAccountSwitcher((Request<GetAccountSwitcherRequestDto>) null, this);
        }
    }

    public RestAccountAggregationService(AccountAggregationServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // account_aggregation.service.p005v1.AccountAggregationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountSwitcher(GetAccountSwitcherRequestDto getAccountSwitcherRequestDto, Continuation<? super GetAccountSwitcherResponseDto> continuation) {
        C01571 c01571;
        if (continuation instanceof C01571) {
            c01571 = (C01571) continuation;
            int i = c01571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01571.label = i - Integer.MIN_VALUE;
            } else {
                c01571 = new C01571(continuation);
            }
        }
        Object objGetAccountSwitcher = c01571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c01571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountSwitcher);
            Request<GetAccountSwitcherRequestDto> request = new Request<>(getAccountSwitcherRequestDto, null, 2, null);
            c01571.label = 1;
            objGetAccountSwitcher = GetAccountSwitcher(request, c01571);
            if (objGetAccountSwitcher == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountSwitcher);
        }
        return ((Response) objGetAccountSwitcher).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountSwitcher(Request<GetAccountSwitcherRequestDto> request, Continuation<? super Response<GetAccountSwitcherResponseDto>> continuation) {
        C01582 c01582;
        if (continuation instanceof C01582) {
            c01582 = (C01582) continuation;
            int i = c01582.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01582.label = i - Integer.MIN_VALUE;
            } else {
                c01582 = new C01582(continuation);
            }
        }
        Object objGetAccountSwitcher = c01582.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c01582.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountSwitcher);
            AccountAggregationServiceRetrofit accountAggregationServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String asset_id = request.getData().getAsset_id();
            AccountSwitcherLocationDto location = request.getData().getLocation() != AccountSwitcherLocationDto.INSTANCE.getZeroValue() ? request.getData().getLocation() : null;
            c01582.label = 1;
            objGetAccountSwitcher = accountAggregationServiceRetrofit.GetAccountSwitcher(metadata, asset_id, location, c01582);
            if (objGetAccountSwitcher == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountSwitcher);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccountSwitcher);
    }
}
