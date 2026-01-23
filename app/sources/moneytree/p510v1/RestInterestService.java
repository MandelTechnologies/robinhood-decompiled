package moneytree.p510v1;

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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RestInterestService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lmoneytree/v1/RestInterestService;", "Lmoneytree/v1/InterestService;", "Lmoneytree/v1/InterestServiceRetrofit;", "retrofit", "<init>", "(Lmoneytree/v1/InterestServiceRetrofit;)V", "Lcom/robinhood/idl/Request;", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "request", "Lcom/robinhood/idl/Response;", "Lmoneytree/v1/ListMonthlyInterestHistoryResponseDto;", "ListMonthlyInterestHistory", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmoneytree/v1/GetMonthlyInterestHistoryRequestDto;", "Lmoneytree/v1/GetMonthlyInterestHistoryResponseDto;", "GetMonthlyInterestHistory", "(Lmoneytree/v1/GetMonthlyInterestHistoryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmoneytree/v1/InterestServiceRetrofit;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class RestInterestService implements InterestService {
    private final InterestServiceRetrofit retrofit;

    /* compiled from: RestInterestService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "moneytree.v1.RestInterestService", m3645f = "RestInterestService.kt", m3646l = {40}, m3647m = "GetMonthlyInterestHistory")
    /* renamed from: moneytree.v1.RestInterestService$GetMonthlyInterestHistory$1 */
    static final class C470291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470291(Continuation<? super C470291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInterestService.this.GetMonthlyInterestHistory((GetMonthlyInterestHistoryRequestDto) null, this);
        }
    }

    /* compiled from: RestInterestService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "moneytree.v1.RestInterestService", m3645f = "RestInterestService.kt", m3646l = {46}, m3647m = "GetMonthlyInterestHistory")
    /* renamed from: moneytree.v1.RestInterestService$GetMonthlyInterestHistory$2 */
    static final class C470302 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470302(Continuation<? super C470302> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInterestService.this.GetMonthlyInterestHistory((Request<GetMonthlyInterestHistoryRequestDto>) null, this);
        }
    }

    /* compiled from: RestInterestService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "moneytree.v1.RestInterestService", m3645f = "RestInterestService.kt", m3646l = {27}, m3647m = "ListMonthlyInterestHistory")
    /* renamed from: moneytree.v1.RestInterestService$ListMonthlyInterestHistory$2 */
    static final class C470312 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470312(Continuation<? super C470312> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInterestService.this.ListMonthlyInterestHistory(null, this);
        }
    }

    public RestInterestService(InterestServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // moneytree.p510v1.InterestService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListMonthlyInterestHistory(Request<ListMonthlyInterestHistoryRequestDto> request, Continuation<? super Response<ListMonthlyInterestHistoryResponseDto>> continuation) {
        C470312 c470312;
        if (continuation instanceof C470312) {
            c470312 = (C470312) continuation;
            int i = c470312.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470312.label = i - Integer.MIN_VALUE;
            } else {
                c470312 = new C470312(continuation);
            }
        }
        C470312 c4703122 = c470312;
        Object objListMonthlyInterestHistory = c4703122.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4703122.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListMonthlyInterestHistory);
            InterestServiceRetrofit interestServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String cursor = !Intrinsics.areEqual(request.getData().getCursor(), "") ? request.getData().getCursor() : null;
            Integer numBoxInt = request.getData().getLimit() != 0 ? boxing.boxInt(request.getData().getLimit()) : null;
            Instant created_at_gte = request.getData().getCreated_at_gte();
            Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant created_at_gte2 = !Intrinsics.areEqual(created_at_gte, instantOfEpochSecond) ? request.getData().getCreated_at_gte() : null;
            Instant created_at_lte = request.getData().getCreated_at_lte();
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            Instant created_at_lte2 = Intrinsics.areEqual(created_at_lte, instantOfEpochSecond2) ? null : request.getData().getCreated_at_lte();
            c4703122.label = 1;
            objListMonthlyInterestHistory = interestServiceRetrofit.ListMonthlyInterestHistory(metadata, cursor, numBoxInt, created_at_gte2, created_at_lte2, c4703122);
            if (objListMonthlyInterestHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListMonthlyInterestHistory);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListMonthlyInterestHistory);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // moneytree.p510v1.InterestService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMonthlyInterestHistory(GetMonthlyInterestHistoryRequestDto getMonthlyInterestHistoryRequestDto, Continuation<? super GetMonthlyInterestHistoryResponseDto> continuation) {
        C470291 c470291;
        if (continuation instanceof C470291) {
            c470291 = (C470291) continuation;
            int i = c470291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470291.label = i - Integer.MIN_VALUE;
            } else {
                c470291 = new C470291(continuation);
            }
        }
        Object objGetMonthlyInterestHistory = c470291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c470291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMonthlyInterestHistory);
            Request<GetMonthlyInterestHistoryRequestDto> request = new Request<>(getMonthlyInterestHistoryRequestDto, null, 2, null);
            c470291.label = 1;
            objGetMonthlyInterestHistory = GetMonthlyInterestHistory(request, c470291);
            if (objGetMonthlyInterestHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMonthlyInterestHistory);
        }
        return ((Response) objGetMonthlyInterestHistory).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMonthlyInterestHistory(Request<GetMonthlyInterestHistoryRequestDto> request, Continuation<? super Response<GetMonthlyInterestHistoryResponseDto>> continuation) {
        C470302 c470302;
        if (continuation instanceof C470302) {
            c470302 = (C470302) continuation;
            int i = c470302.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470302.label = i - Integer.MIN_VALUE;
            } else {
                c470302 = new C470302(continuation);
            }
        }
        Object objGetMonthlyInterestHistory = c470302.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c470302.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMonthlyInterestHistory);
            InterestServiceRetrofit interestServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String payment_id = request.getData().getPayment_id();
            c470302.label = 1;
            objGetMonthlyInterestHistory = interestServiceRetrofit.GetMonthlyInterestHistory(metadata, payment_id, c470302);
            if (objGetMonthlyInterestHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMonthlyInterestHistory);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetMonthlyInterestHistory);
    }
}
