package yoda.service;

import com.plaid.internal.EnumC7081g;
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
import yoda.service.dashboard.GetFutureReturnsRequestDto;
import yoda.service.dashboard.GetFutureReturnsResponseDto;
import yoda.service.dashboard.ListAdvisorTradesRequestDto;
import yoda.service.dashboard.ListAdvisorTradesResponseDto;
import yoda.service.withdrawal.GetAccountTransferSummaryRequestDto;
import yoda.service.withdrawal.GetAccountTransferSummaryResponseDto;

/* compiled from: RestYoda.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lyoda/service/RestYoda;", "Lyoda/service/Yoda;", "Lyoda/service/YodaRetrofit;", "retrofit", "<init>", "(Lyoda/service/YodaRetrofit;)V", "Lyoda/service/withdrawal/GetAccountTransferSummaryRequestDto;", "request", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto;", "GetAccountTransferSummary", "(Lyoda/service/withdrawal/GetAccountTransferSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyoda/service/dashboard/ListAdvisorTradesRequestDto;", "Lyoda/service/dashboard/ListAdvisorTradesResponseDto;", "ListAdvisorTrades", "(Lyoda/service/dashboard/ListAdvisorTradesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyoda/service/dashboard/GetFutureReturnsRequestDto;", "Lyoda/service/dashboard/GetFutureReturnsResponseDto;", "GetFutureReturns", "(Lyoda/service/dashboard/GetFutureReturnsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyoda/service/YodaRetrofit;", "yoda.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class RestYoda implements Yoda {
    private final YodaRetrofit retrofit;

    /* compiled from: RestYoda.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "yoda.service.RestYoda", m3645f = "RestYoda.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m3647m = "GetAccountTransferSummary")
    /* renamed from: yoda.service.RestYoda$GetAccountTransferSummary$1 */
    static final class C492051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492051(Continuation<? super C492051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestYoda.this.GetAccountTransferSummary((GetAccountTransferSummaryRequestDto) null, this);
        }
    }

    /* compiled from: RestYoda.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "yoda.service.RestYoda", m3645f = "RestYoda.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "GetAccountTransferSummary")
    /* renamed from: yoda.service.RestYoda$GetAccountTransferSummary$2 */
    static final class C492062 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492062(Continuation<? super C492062> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestYoda.this.GetAccountTransferSummary((Request<GetAccountTransferSummaryRequestDto>) null, this);
        }
    }

    /* compiled from: RestYoda.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "yoda.service.RestYoda", m3645f = "RestYoda.kt", m3646l = {1576}, m3647m = "GetFutureReturns")
    /* renamed from: yoda.service.RestYoda$GetFutureReturns$1 */
    static final class C492071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492071(Continuation<? super C492071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestYoda.this.GetFutureReturns((GetFutureReturnsRequestDto) null, this);
        }
    }

    /* compiled from: RestYoda.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "yoda.service.RestYoda", m3645f = "RestYoda.kt", m3646l = {1593}, m3647m = "GetFutureReturns")
    /* renamed from: yoda.service.RestYoda$GetFutureReturns$2 */
    static final class C492082 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492082(Continuation<? super C492082> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestYoda.this.GetFutureReturns((Request<GetFutureReturnsRequestDto>) null, this);
        }
    }

    /* compiled from: RestYoda.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "yoda.service.RestYoda", m3645f = "RestYoda.kt", m3646l = {437}, m3647m = "ListAdvisorTrades")
    /* renamed from: yoda.service.RestYoda$ListAdvisorTrades$1 */
    static final class C492091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492091(Continuation<? super C492091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestYoda.this.ListAdvisorTrades((ListAdvisorTradesRequestDto) null, this);
        }
    }

    /* compiled from: RestYoda.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "yoda.service.RestYoda", m3645f = "RestYoda.kt", m3646l = {454}, m3647m = "ListAdvisorTrades")
    /* renamed from: yoda.service.RestYoda$ListAdvisorTrades$2 */
    static final class C492102 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492102(Continuation<? super C492102> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestYoda.this.ListAdvisorTrades((Request<ListAdvisorTradesRequestDto>) null, this);
        }
    }

    public RestYoda(YodaRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yoda.service.Yoda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountTransferSummary(GetAccountTransferSummaryRequestDto getAccountTransferSummaryRequestDto, Continuation<? super GetAccountTransferSummaryResponseDto> continuation) {
        C492051 c492051;
        if (continuation instanceof C492051) {
            c492051 = (C492051) continuation;
            int i = c492051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492051.label = i - Integer.MIN_VALUE;
            } else {
                c492051 = new C492051(continuation);
            }
        }
        Object objGetAccountTransferSummary = c492051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountTransferSummary);
            Request<GetAccountTransferSummaryRequestDto> request = new Request<>(getAccountTransferSummaryRequestDto, null, 2, null);
            c492051.label = 1;
            objGetAccountTransferSummary = GetAccountTransferSummary(request, c492051);
            if (objGetAccountTransferSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountTransferSummary);
        }
        return ((Response) objGetAccountTransferSummary).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountTransferSummary(Request<GetAccountTransferSummaryRequestDto> request, Continuation<? super Response<GetAccountTransferSummaryResponseDto>> continuation) {
        C492062 c492062;
        if (continuation instanceof C492062) {
            c492062 = (C492062) continuation;
            int i = c492062.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492062.label = i - Integer.MIN_VALUE;
            } else {
                c492062 = new C492062(continuation);
            }
        }
        Object objGetAccountTransferSummary = c492062.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492062.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountTransferSummary);
            YodaRetrofit yodaRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c492062.label = 1;
            objGetAccountTransferSummary = yodaRetrofit.GetAccountTransferSummary(metadata, account_number, c492062);
            if (objGetAccountTransferSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountTransferSummary);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccountTransferSummary);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListAdvisorTrades(ListAdvisorTradesRequestDto listAdvisorTradesRequestDto, Continuation<? super ListAdvisorTradesResponseDto> continuation) {
        C492091 c492091;
        if (continuation instanceof C492091) {
            c492091 = (C492091) continuation;
            int i = c492091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492091.label = i - Integer.MIN_VALUE;
            } else {
                c492091 = new C492091(continuation);
            }
        }
        Object objListAdvisorTrades = c492091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListAdvisorTrades);
            Request<ListAdvisorTradesRequestDto> request = new Request<>(listAdvisorTradesRequestDto, null, 2, null);
            c492091.label = 1;
            objListAdvisorTrades = ListAdvisorTrades(request, c492091);
            if (objListAdvisorTrades == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListAdvisorTrades);
        }
        return ((Response) objListAdvisorTrades).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListAdvisorTrades(Request<ListAdvisorTradesRequestDto> request, Continuation<? super Response<ListAdvisorTradesResponseDto>> continuation) {
        C492102 c492102;
        if (continuation instanceof C492102) {
            c492102 = (C492102) continuation;
            int i = c492102.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492102.label = i - Integer.MIN_VALUE;
            } else {
                c492102 = new C492102(continuation);
            }
        }
        Object objListAdvisorTrades = c492102.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492102.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListAdvisorTrades);
            YodaRetrofit yodaRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            c492102.label = 1;
            objListAdvisorTrades = yodaRetrofit.ListAdvisorTrades(metadata, account_number, c492102);
            if (objListAdvisorTrades == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListAdvisorTrades);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListAdvisorTrades);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFutureReturns(GetFutureReturnsRequestDto getFutureReturnsRequestDto, Continuation<? super GetFutureReturnsResponseDto> continuation) {
        C492071 c492071;
        if (continuation instanceof C492071) {
            c492071 = (C492071) continuation;
            int i = c492071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492071.label = i - Integer.MIN_VALUE;
            } else {
                c492071 = new C492071(continuation);
            }
        }
        Object objGetFutureReturns = c492071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492071.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFutureReturns);
            Request<GetFutureReturnsRequestDto> request = new Request<>(getFutureReturnsRequestDto, null, 2, null);
            c492071.label = 1;
            objGetFutureReturns = GetFutureReturns(request, c492071);
            if (objGetFutureReturns == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFutureReturns);
        }
        return ((Response) objGetFutureReturns).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFutureReturns(Request<GetFutureReturnsRequestDto> request, Continuation<? super Response<GetFutureReturnsResponseDto>> continuation) {
        C492082 c492082;
        if (continuation instanceof C492082) {
            c492082 = (C492082) continuation;
            int i = c492082.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492082.label = i - Integer.MIN_VALUE;
            } else {
                c492082 = new C492082(continuation);
            }
        }
        Object objGetFutureReturns = c492082.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492082.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFutureReturns);
            YodaRetrofit yodaRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c492082.label = 1;
            objGetFutureReturns = yodaRetrofit.GetFutureReturns(metadata, account_number, c492082);
            if (objGetFutureReturns == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFutureReturns);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFutureReturns);
    }
}
