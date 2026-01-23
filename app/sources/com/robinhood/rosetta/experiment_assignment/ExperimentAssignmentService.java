package com.robinhood.rosetta.experiment_assignment;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExperimentAssignmentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentService;", "", "HTTPAssignExternal", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignResponseDto;", "request", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;", "(Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HTTPAssignExternalVegeta", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ExperimentAssignmentService {

    /* compiled from: ExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService$DefaultImpls", m3645f = "ExperimentAssignmentService.kt", m3646l = {13}, m3647m = "HTTPAssignExternal")
    /* renamed from: com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService$HTTPAssignExternal$1 */
    static final class C371181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C371181(Continuation<? super C371181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.HTTPAssignExternal(null, null, this);
        }
    }

    /* compiled from: ExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService$DefaultImpls", m3645f = "ExperimentAssignmentService.kt", m3646l = {17}, m3647m = "HTTPAssignExternalVegeta")
    /* renamed from: com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService$HTTPAssignExternalVegeta$1 */
    static final class C371191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C371191(Continuation<? super C371191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.HTTPAssignExternalVegeta(null, null, this);
        }
    }

    Object HTTPAssignExternal(Request<HTTPAssignRequestDto> request, Continuation<? super Response<HTTPAssignResponseDto>> continuation);

    Object HTTPAssignExternal(HTTPAssignRequestDto hTTPAssignRequestDto, Continuation<? super HTTPAssignResponseDto> continuation);

    Object HTTPAssignExternalVegeta(Request<HTTPAssignRequestDto> request, Continuation<? super Response<HTTPAssignResponseDto>> continuation);

    Object HTTPAssignExternalVegeta(HTTPAssignRequestDto hTTPAssignRequestDto, Continuation<? super HTTPAssignResponseDto> continuation);

    /* compiled from: ExperimentAssignmentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object HTTPAssignExternal(ExperimentAssignmentService experimentAssignmentService, Request<HTTPAssignRequestDto> request, Continuation<? super Response<HTTPAssignResponseDto>> continuation) {
            C371181 c371181;
            if (continuation instanceof C371181) {
                c371181 = (C371181) continuation;
                int i = c371181.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c371181.label = i - Integer.MIN_VALUE;
                } else {
                    c371181 = new C371181(continuation);
                }
            }
            Object objHTTPAssignExternal = c371181.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c371181.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objHTTPAssignExternal);
                HTTPAssignRequestDto data = request.getData();
                c371181.label = 1;
                objHTTPAssignExternal = experimentAssignmentService.HTTPAssignExternal(data, c371181);
                if (objHTTPAssignExternal == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHTTPAssignExternal);
            }
            return new Response(objHTTPAssignExternal, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object HTTPAssignExternalVegeta(ExperimentAssignmentService experimentAssignmentService, Request<HTTPAssignRequestDto> request, Continuation<? super Response<HTTPAssignResponseDto>> continuation) {
            C371191 c371191;
            if (continuation instanceof C371191) {
                c371191 = (C371191) continuation;
                int i = c371191.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c371191.label = i - Integer.MIN_VALUE;
                } else {
                    c371191 = new C371191(continuation);
                }
            }
            Object objHTTPAssignExternalVegeta = c371191.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c371191.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objHTTPAssignExternalVegeta);
                HTTPAssignRequestDto data = request.getData();
                c371191.label = 1;
                objHTTPAssignExternalVegeta = experimentAssignmentService.HTTPAssignExternalVegeta(data, c371191);
                if (objHTTPAssignExternalVegeta == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHTTPAssignExternalVegeta);
            }
            return new Response(objHTTPAssignExternalVegeta, null, 2, null);
        }
    }
}
