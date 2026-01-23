package com.robinhood.rosetta.experiment_assignment;

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

/* compiled from: GrpcExperimentAssignmentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/GrpcExperimentAssignmentService;", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentService;", "grpcClient", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceClient;", "<init>", "(Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceClient;)V", "HTTPAssignExternal", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignResponseDto;", "request", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;", "(Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HTTPAssignExternalVegeta", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GrpcExperimentAssignmentService implements ExperimentAssignmentService {
    private final ExperimentAssignmentServiceClient grpcClient;

    /* compiled from: GrpcExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rosetta.experiment_assignment.GrpcExperimentAssignmentService", m3645f = "GrpcExperimentAssignmentService.kt", m3646l = {17}, m3647m = "HTTPAssignExternal")
    /* renamed from: com.robinhood.rosetta.experiment_assignment.GrpcExperimentAssignmentService$HTTPAssignExternal$1 */
    static final class C371221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C371221(Continuation<? super C371221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcExperimentAssignmentService.this.HTTPAssignExternal((HTTPAssignRequestDto) null, this);
        }
    }

    /* compiled from: GrpcExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rosetta.experiment_assignment.GrpcExperimentAssignmentService", m3645f = "GrpcExperimentAssignmentService.kt", m3646l = {21}, m3647m = "HTTPAssignExternalVegeta")
    /* renamed from: com.robinhood.rosetta.experiment_assignment.GrpcExperimentAssignmentService$HTTPAssignExternalVegeta$1 */
    static final class C371231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C371231(Continuation<? super C371231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcExperimentAssignmentService.this.HTTPAssignExternalVegeta((HTTPAssignRequestDto) null, this);
        }
    }

    public GrpcExperimentAssignmentService(ExperimentAssignmentServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object HTTPAssignExternal(HTTPAssignRequestDto hTTPAssignRequestDto, Continuation<? super HTTPAssignResponseDto> continuation) {
        C371221 c371221;
        if (continuation instanceof C371221) {
            c371221 = (C371221) continuation;
            int i = c371221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c371221.label = i - Integer.MIN_VALUE;
            } else {
                c371221 = new C371221(continuation);
            }
        }
        Object objHTTPAssignExternal = c371221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c371221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHTTPAssignExternal);
            Request<HTTPAssignRequestDto> request = new Request<>(hTTPAssignRequestDto, null, 2, null);
            c371221.label = 1;
            objHTTPAssignExternal = HTTPAssignExternal(request, c371221);
            if (objHTTPAssignExternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHTTPAssignExternal);
        }
        return ((Response) objHTTPAssignExternal).getData();
    }

    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService
    public Object HTTPAssignExternal(Request<HTTPAssignRequestDto> request, Continuation<? super Response<HTTPAssignResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, HTTPAssignResponseDto.INSTANCE, this.grpcClient.HTTPAssignExternal(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object HTTPAssignExternalVegeta(HTTPAssignRequestDto hTTPAssignRequestDto, Continuation<? super HTTPAssignResponseDto> continuation) {
        C371231 c371231;
        if (continuation instanceof C371231) {
            c371231 = (C371231) continuation;
            int i = c371231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c371231.label = i - Integer.MIN_VALUE;
            } else {
                c371231 = new C371231(continuation);
            }
        }
        Object objHTTPAssignExternalVegeta = c371231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c371231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHTTPAssignExternalVegeta);
            Request<HTTPAssignRequestDto> request = new Request<>(hTTPAssignRequestDto, null, 2, null);
            c371231.label = 1;
            objHTTPAssignExternalVegeta = HTTPAssignExternalVegeta(request, c371231);
            if (objHTTPAssignExternalVegeta == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHTTPAssignExternalVegeta);
        }
        return ((Response) objHTTPAssignExternalVegeta).getData();
    }

    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService
    public Object HTTPAssignExternalVegeta(Request<HTTPAssignRequestDto> request, Continuation<? super Response<HTTPAssignResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, HTTPAssignResponseDto.INSTANCE, this.grpcClient.HTTPAssignExternalVegeta(), continuation);
    }
}
