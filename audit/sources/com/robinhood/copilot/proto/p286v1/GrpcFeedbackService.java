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

/* compiled from: GrpcFeedbackService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GrpcFeedbackService;", "Lcom/robinhood/copilot/proto/v1/FeedbackService;", "grpcClient", "Lcom/robinhood/copilot/proto/v1/FeedbackServiceClient;", "<init>", "(Lcom/robinhood/copilot/proto/v1/FeedbackServiceClient;)V", "PostFeedback", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "request", "Lcom/robinhood/copilot/proto/v1/PostFeedbackRequestDto;", "(Lcom/robinhood/copilot/proto/v1/PostFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFeedback", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcFeedbackService implements FeedbackService {
    private final FeedbackServiceClient grpcClient;

    /* compiled from: GrpcFeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.GrpcFeedbackService", m3645f = "GrpcFeedbackService.kt", m3646l = {24}, m3647m = "GetFeedback")
    /* renamed from: com.robinhood.copilot.proto.v1.GrpcFeedbackService$GetFeedback$1 */
    static final class C329011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329011(Continuation<? super C329011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcFeedbackService.this.GetFeedback((GetFeedbackRequestDto) null, this);
        }
    }

    /* compiled from: GrpcFeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.GrpcFeedbackService", m3645f = "GrpcFeedbackService.kt", m3646l = {17}, m3647m = "PostFeedback")
    /* renamed from: com.robinhood.copilot.proto.v1.GrpcFeedbackService$PostFeedback$1 */
    static final class C329021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329021(Continuation<? super C329021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcFeedbackService.this.PostFeedback((PostFeedbackRequestDto) null, this);
        }
    }

    public GrpcFeedbackService(FeedbackServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.FeedbackService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PostFeedback(PostFeedbackRequestDto postFeedbackRequestDto, Continuation<? super PostFeedbackResponseDto> continuation) {
        C329021 c329021;
        if (continuation instanceof C329021) {
            c329021 = (C329021) continuation;
            int i = c329021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329021.label = i - Integer.MIN_VALUE;
            } else {
                c329021 = new C329021(continuation);
            }
        }
        Object objPostFeedback = c329021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPostFeedback);
            Request<PostFeedbackRequestDto> request = new Request<>(postFeedbackRequestDto, null, 2, null);
            c329021.label = 1;
            objPostFeedback = PostFeedback(request, c329021);
            if (objPostFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPostFeedback);
        }
        return ((Response) objPostFeedback).getData();
    }

    @Override // com.robinhood.copilot.proto.p286v1.FeedbackService
    public Object PostFeedback(Request<PostFeedbackRequestDto> request, Continuation<? super Response<PostFeedbackResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, PostFeedbackResponseDto.INSTANCE, this.grpcClient.PostFeedback(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.FeedbackService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFeedback(GetFeedbackRequestDto getFeedbackRequestDto, Continuation<? super GetFeedbackResponseDto> continuation) {
        C329011 c329011;
        if (continuation instanceof C329011) {
            c329011 = (C329011) continuation;
            int i = c329011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329011.label = i - Integer.MIN_VALUE;
            } else {
                c329011 = new C329011(continuation);
            }
        }
        Object objGetFeedback = c329011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFeedback);
            Request<GetFeedbackRequestDto> request = new Request<>(getFeedbackRequestDto, null, 2, null);
            c329011.label = 1;
            objGetFeedback = GetFeedback(request, c329011);
            if (objGetFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFeedback);
        }
        return ((Response) objGetFeedback).getData();
    }

    @Override // com.robinhood.copilot.proto.p286v1.FeedbackService
    public Object GetFeedback(Request<GetFeedbackRequestDto> request, Continuation<? super Response<GetFeedbackResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetFeedbackResponseDto.INSTANCE, this.grpcClient.GetFeedback(), continuation);
    }
}
