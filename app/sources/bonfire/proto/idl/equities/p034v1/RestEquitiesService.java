package bonfire.proto.idl.equities.p034v1;

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

/* compiled from: RestEquitiesService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/RestEquitiesService;", "Lbonfire/proto/idl/equities/v1/EquitiesService;", "Lbonfire/proto/idl/equities/v1/EquitiesServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/equities/v1/EquitiesServiceRetrofit;)V", "Lbonfire/proto/idl/equities/v1/GetAggregatedBorrowChartHistoryRequestDto;", "request", "Lbonfire/proto/idl/equities/v1/GetAggregatedBorrowChartHistoryResponseDto;", "GetAggregatedBorrowChartHistory", "(Lbonfire/proto/idl/equities/v1/GetAggregatedBorrowChartHistoryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/equities/v1/GetKillswitchesRequestDto;", "Lbonfire/proto/idl/equities/v1/GetKillswitchesResponseDto;", "GetKillswitches", "(Lbonfire/proto/idl/equities/v1/GetKillswitchesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/equities/v1/EquitiesServiceRetrofit;", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestEquitiesService implements EquitiesService {
    private final EquitiesServiceRetrofit retrofit;

    /* compiled from: RestEquitiesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.equities.v1.RestEquitiesService", m3645f = "RestEquitiesService.kt", m3646l = {20}, m3647m = "GetAggregatedBorrowChartHistory")
    /* renamed from: bonfire.proto.idl.equities.v1.RestEquitiesService$GetAggregatedBorrowChartHistory$1 */
    static final class C43271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43271(Continuation<? super C43271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestEquitiesService.this.GetAggregatedBorrowChartHistory((GetAggregatedBorrowChartHistoryRequestDto) null, this);
        }
    }

    /* compiled from: RestEquitiesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.equities.v1.RestEquitiesService", m3645f = "RestEquitiesService.kt", m3646l = {26}, m3647m = "GetAggregatedBorrowChartHistory")
    /* renamed from: bonfire.proto.idl.equities.v1.RestEquitiesService$GetAggregatedBorrowChartHistory$2 */
    static final class C43282 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43282(Continuation<? super C43282> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestEquitiesService.this.GetAggregatedBorrowChartHistory((Request<GetAggregatedBorrowChartHistoryRequestDto>) null, this);
        }
    }

    /* compiled from: RestEquitiesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.equities.v1.RestEquitiesService", m3645f = "RestEquitiesService.kt", m3646l = {50}, m3647m = "GetKillswitches")
    /* renamed from: bonfire.proto.idl.equities.v1.RestEquitiesService$GetKillswitches$1 */
    static final class C43291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43291(Continuation<? super C43291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestEquitiesService.this.GetKillswitches((GetKillswitchesRequestDto) null, this);
        }
    }

    /* compiled from: RestEquitiesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.equities.v1.RestEquitiesService", m3645f = "RestEquitiesService.kt", m3646l = {56}, m3647m = "GetKillswitches")
    /* renamed from: bonfire.proto.idl.equities.v1.RestEquitiesService$GetKillswitches$2 */
    static final class C43302 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43302(Continuation<? super C43302> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestEquitiesService.this.GetKillswitches((Request<GetKillswitchesRequestDto>) null, this);
        }
    }

    public RestEquitiesService(EquitiesServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.equities.p034v1.EquitiesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAggregatedBorrowChartHistory(GetAggregatedBorrowChartHistoryRequestDto getAggregatedBorrowChartHistoryRequestDto, Continuation<? super GetAggregatedBorrowChartHistoryResponseDto> continuation) {
        C43271 c43271;
        if (continuation instanceof C43271) {
            c43271 = (C43271) continuation;
            int i = c43271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43271.label = i - Integer.MIN_VALUE;
            } else {
                c43271 = new C43271(continuation);
            }
        }
        Object objGetAggregatedBorrowChartHistory = c43271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAggregatedBorrowChartHistory);
            Request<GetAggregatedBorrowChartHistoryRequestDto> request = new Request<>(getAggregatedBorrowChartHistoryRequestDto, null, 2, null);
            c43271.label = 1;
            objGetAggregatedBorrowChartHistory = GetAggregatedBorrowChartHistory(request, c43271);
            if (objGetAggregatedBorrowChartHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAggregatedBorrowChartHistory);
        }
        return ((Response) objGetAggregatedBorrowChartHistory).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAggregatedBorrowChartHistory(Request<GetAggregatedBorrowChartHistoryRequestDto> request, Continuation<? super Response<GetAggregatedBorrowChartHistoryResponseDto>> continuation) {
        C43282 c43282;
        if (continuation instanceof C43282) {
            c43282 = (C43282) continuation;
            int i = c43282.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43282.label = i - Integer.MIN_VALUE;
            } else {
                c43282 = new C43282(continuation);
            }
        }
        Object objGetAggregatedBorrowChartHistory = c43282.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43282.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAggregatedBorrowChartHistory);
            EquitiesServiceRetrofit equitiesServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c43282.label = 1;
            objGetAggregatedBorrowChartHistory = equitiesServiceRetrofit.GetAggregatedBorrowChartHistory(metadata, c43282);
            if (objGetAggregatedBorrowChartHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAggregatedBorrowChartHistory);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAggregatedBorrowChartHistory);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.equities.p034v1.EquitiesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetKillswitches(GetKillswitchesRequestDto getKillswitchesRequestDto, Continuation<? super GetKillswitchesResponseDto> continuation) {
        C43291 c43291;
        if (continuation instanceof C43291) {
            c43291 = (C43291) continuation;
            int i = c43291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43291.label = i - Integer.MIN_VALUE;
            } else {
                c43291 = new C43291(continuation);
            }
        }
        Object objGetKillswitches = c43291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetKillswitches);
            Request<GetKillswitchesRequestDto> request = new Request<>(getKillswitchesRequestDto, null, 2, null);
            c43291.label = 1;
            objGetKillswitches = GetKillswitches(request, c43291);
            if (objGetKillswitches == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetKillswitches);
        }
        return ((Response) objGetKillswitches).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetKillswitches(Request<GetKillswitchesRequestDto> request, Continuation<? super Response<GetKillswitchesResponseDto>> continuation) {
        C43302 c43302;
        if (continuation instanceof C43302) {
            c43302 = (C43302) continuation;
            int i = c43302.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43302.label = i - Integer.MIN_VALUE;
            } else {
                c43302 = new C43302(continuation);
            }
        }
        Object objGetKillswitches = c43302.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43302.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetKillswitches);
            EquitiesServiceRetrofit equitiesServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c43302.label = 1;
            objGetKillswitches = equitiesServiceRetrofit.GetKillswitches(metadata, c43302);
            if (objGetKillswitches == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetKillswitches);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetKillswitches);
    }
}
