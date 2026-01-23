package com.robinhood.copilot.proto.p286v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcInsightService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GrpcInsightService;", "Lcom/robinhood/copilot/proto/v1/InsightService;", "grpcClient", "Lcom/robinhood/copilot/proto/v1/InsightServiceClient;", "<init>", "(Lcom/robinhood/copilot/proto/v1/InsightServiceClient;)V", "GetInsights", "Lcom/robinhood/copilot/proto/v1/GetInsightsResponseDto;", "request", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateInsights", "Lcom/robinhood/copilot/proto/v1/CreateInsightsResponseDto;", "Lcom/robinhood/copilot/proto/v1/CreateInsightsRequestDto;", "(Lcom/robinhood/copilot/proto/v1/CreateInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetLatestInsight", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetLatestInsightRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcInsightService implements InsightService {
    private final InsightServiceClient grpcClient;

    /* compiled from: GrpcInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.GrpcInsightService", m3645f = "GrpcInsightService.kt", m3646l = {34}, m3647m = "CreateInsights")
    /* renamed from: com.robinhood.copilot.proto.v1.GrpcInsightService$CreateInsights$1 */
    static final class C329031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329031(Continuation<? super C329031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInsightService.this.CreateInsights((CreateInsightsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.GrpcInsightService", m3645f = "GrpcInsightService.kt", m3646l = {22}, m3647m = "GetInsights")
    /* renamed from: com.robinhood.copilot.proto.v1.GrpcInsightService$GetInsights$1 */
    static final class C329041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329041(Continuation<? super C329041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInsightService.this.GetInsights((GetInsightsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInsightService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.GrpcInsightService", m3645f = "GrpcInsightService.kt", m3646l = {44}, m3647m = "GetLatestInsight")
    /* renamed from: com.robinhood.copilot.proto.v1.GrpcInsightService$GetLatestInsight$1 */
    static final class C329051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329051(Continuation<? super C329051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInsightService.this.GetLatestInsight((GetLatestInsightRequestDto) null, this);
        }
    }

    public GrpcInsightService(InsightServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetInsights(GetInsightsRequestDto getInsightsRequestDto, Continuation<? super GetInsightsResponseDto> continuation) {
        C329041 c329041;
        if (continuation instanceof C329041) {
            c329041 = (C329041) continuation;
            int i = c329041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329041.label = i - Integer.MIN_VALUE;
            } else {
                c329041 = new C329041(continuation);
            }
        }
        Object objGetInsights = c329041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetInsights);
            Request<GetInsightsRequestDto> request = new Request<>(getInsightsRequestDto, null, 2, null);
            c329041.label = 1;
            objGetInsights = GetInsights(request, c329041);
            if (objGetInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetInsights);
        }
        return ((Response) objGetInsights).getData();
    }

    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    public Object GetInsights(Request<GetInsightsRequestDto> request, Continuation<? super Response<GetInsightsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetInsightsResponseDto.INSTANCE, this.grpcClient.GetInsights(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateInsights(CreateInsightsRequestDto createInsightsRequestDto, Continuation<? super CreateInsightsResponseDto> continuation) {
        C329031 c329031;
        if (continuation instanceof C329031) {
            c329031 = (C329031) continuation;
            int i = c329031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329031.label = i - Integer.MIN_VALUE;
            } else {
                c329031 = new C329031(continuation);
            }
        }
        Object objCreateInsights = c329031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateInsights);
            Request<CreateInsightsRequestDto> request = new Request<>(createInsightsRequestDto, null, 2, null);
            c329031.label = 1;
            objCreateInsights = CreateInsights(request, c329031);
            if (objCreateInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateInsights);
        }
        return ((Response) objCreateInsights).getData();
    }

    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    public Object CreateInsights(Request<CreateInsightsRequestDto> request, Continuation<? super Response<CreateInsightsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CreateInsightsResponseDto.INSTANCE, this.grpcClient.CreateInsights(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetLatestInsight(GetLatestInsightRequestDto getLatestInsightRequestDto, Continuation<? super GetLatestInsightResponseDto> continuation) {
        C329051 c329051;
        if (continuation instanceof C329051) {
            c329051 = (C329051) continuation;
            int i = c329051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329051.label = i - Integer.MIN_VALUE;
            } else {
                c329051 = new C329051(continuation);
            }
        }
        Object objGetLatestInsight = c329051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetLatestInsight);
            Request<GetLatestInsightRequestDto> request = new Request<>(getLatestInsightRequestDto, null, 2, null);
            c329051.label = 1;
            objGetLatestInsight = GetLatestInsight(request, c329051);
            if (objGetLatestInsight == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetLatestInsight);
        }
        return ((Response) objGetLatestInsight).getData();
    }

    @Override // com.robinhood.copilot.proto.p286v1.InsightService
    public Object GetLatestInsight(Request<GetLatestInsightRequestDto> request, Continuation<? super Response<GetLatestInsightResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetLatestInsightResponseDto.INSTANCE, this.grpcClient.GetLatestInsight(), continuation);
    }
}
