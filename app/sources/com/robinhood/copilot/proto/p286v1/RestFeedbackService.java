package com.robinhood.copilot.proto.p286v1;

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
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RestFeedbackService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/RestFeedbackService;", "Lcom/robinhood/copilot/proto/v1/FeedbackService;", "retrofit", "Lcom/robinhood/copilot/proto/v1/FeedbackServiceRetrofit;", "<init>", "(Lcom/robinhood/copilot/proto/v1/FeedbackServiceRetrofit;)V", "PostFeedback", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "request", "Lcom/robinhood/copilot/proto/v1/PostFeedbackRequestDto;", "(Lcom/robinhood/copilot/proto/v1/PostFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFeedback", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class RestFeedbackService implements FeedbackService {
    private final FeedbackServiceRetrofit retrofit;

    /* compiled from: RestFeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestFeedbackService", m3645f = "RestFeedbackService.kt", m3646l = {31}, m3647m = "GetFeedback")
    /* renamed from: com.robinhood.copilot.proto.v1.RestFeedbackService$GetFeedback$1 */
    static final class C329221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329221(Continuation<? super C329221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestFeedbackService.this.GetFeedback((GetFeedbackRequestDto) null, this);
        }
    }

    /* compiled from: RestFeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestFeedbackService", m3645f = "RestFeedbackService.kt", m3646l = {37}, m3647m = "GetFeedback")
    /* renamed from: com.robinhood.copilot.proto.v1.RestFeedbackService$GetFeedback$2 */
    static final class C329232 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329232(Continuation<? super C329232> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestFeedbackService.this.GetFeedback((Request<GetFeedbackRequestDto>) null, this);
        }
    }

    /* compiled from: RestFeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestFeedbackService", m3645f = "RestFeedbackService.kt", m3646l = {18}, m3647m = "PostFeedback")
    /* renamed from: com.robinhood.copilot.proto.v1.RestFeedbackService$PostFeedback$1 */
    static final class C329241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329241(Continuation<? super C329241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestFeedbackService.this.PostFeedback((PostFeedbackRequestDto) null, this);
        }
    }

    /* compiled from: RestFeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.RestFeedbackService", m3645f = "RestFeedbackService.kt", m3646l = {21}, m3647m = "PostFeedback")
    /* renamed from: com.robinhood.copilot.proto.v1.RestFeedbackService$PostFeedback$2 */
    static final class C329252 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329252(Continuation<? super C329252> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestFeedbackService.this.PostFeedback((Request<PostFeedbackRequestDto>) null, this);
        }
    }

    public RestFeedbackService(FeedbackServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.FeedbackService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PostFeedback(PostFeedbackRequestDto postFeedbackRequestDto, Continuation<? super PostFeedbackResponseDto> continuation) {
        C329241 c329241;
        if (continuation instanceof C329241) {
            c329241 = (C329241) continuation;
            int i = c329241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329241.label = i - Integer.MIN_VALUE;
            } else {
                c329241 = new C329241(continuation);
            }
        }
        Object objPostFeedback = c329241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPostFeedback);
            Request<PostFeedbackRequestDto> request = new Request<>(postFeedbackRequestDto, null, 2, null);
            c329241.label = 1;
            objPostFeedback = PostFeedback(request, c329241);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.FeedbackService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PostFeedback(Request<PostFeedbackRequestDto> request, Continuation<? super Response<PostFeedbackResponseDto>> continuation) {
        C329252 c329252;
        if (continuation instanceof C329252) {
            c329252 = (C329252) continuation;
            int i = c329252.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329252.label = i - Integer.MIN_VALUE;
            } else {
                c329252 = new C329252(continuation);
            }
        }
        Object objPostFeedback = c329252.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329252.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPostFeedback);
            FeedbackServiceRetrofit feedbackServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            PostFeedbackRequestDto data = request.getData();
            c329252.label = 1;
            objPostFeedback = feedbackServiceRetrofit.PostFeedback(metadata, data, c329252);
            if (objPostFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPostFeedback);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objPostFeedback);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.copilot.proto.p286v1.FeedbackService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFeedback(GetFeedbackRequestDto getFeedbackRequestDto, Continuation<? super GetFeedbackResponseDto> continuation) {
        C329221 c329221;
        if (continuation instanceof C329221) {
            c329221 = (C329221) continuation;
            int i = c329221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329221.label = i - Integer.MIN_VALUE;
            } else {
                c329221 = new C329221(continuation);
            }
        }
        Object objGetFeedback = c329221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFeedback);
            Request<GetFeedbackRequestDto> request = new Request<>(getFeedbackRequestDto, null, 2, null);
            c329221.label = 1;
            objGetFeedback = GetFeedback(request, c329221);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.robinhood.copilot.proto.p286v1.FeedbackService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFeedback(Request<GetFeedbackRequestDto> request, Continuation<? super Response<GetFeedbackResponseDto>> continuation) {
        C329232 c329232;
        if (continuation instanceof C329232) {
            c329232 = (C329232) continuation;
            int i = c329232.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329232.label = i - Integer.MIN_VALUE;
            } else {
                c329232 = new C329232(continuation);
            }
        }
        C329232 c3292322 = c329232;
        Object objGetFeedback = c3292322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3292322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFeedback);
            FeedbackServiceRetrofit feedbackServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String instrument_id = !Intrinsics.areEqual(request.getData().getInstrument_id(), "") ? request.getData().getInstrument_id() : null;
            String user_id = !Intrinsics.areEqual(request.getData().getUser_id(), "") ? request.getData().getUser_id() : null;
            FeedbackTypeDto type2 = request.getData().getType() != FeedbackTypeDto.INSTANCE.getZeroValue() ? request.getData().getType() : null;
            Instant generation_timestamp = request.getData().getGeneration_timestamp();
            Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant generation_timestamp2 = !Intrinsics.areEqual(generation_timestamp, instantOfEpochSecond) ? request.getData().getGeneration_timestamp() : null;
            Instant feedback_timestamp = request.getData().getFeedback_timestamp();
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            Instant feedback_timestamp2 = !Intrinsics.areEqual(feedback_timestamp, instantOfEpochSecond2) ? request.getData().getFeedback_timestamp() : null;
            String composite_feedback_id = Intrinsics.areEqual(request.getData().getComposite_feedback_id(), "") ? null : request.getData().getComposite_feedback_id();
            c3292322.label = 1;
            objGetFeedback = feedbackServiceRetrofit.GetFeedback(metadata, instrument_id, user_id, type2, generation_timestamp2, feedback_timestamp2, composite_feedback_id, c3292322);
            if (objGetFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFeedback);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFeedback);
    }
}
