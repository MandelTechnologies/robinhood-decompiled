package com.robinhood.copilot.proto.p286v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FeedbackService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackService;", "", "PostFeedback", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "request", "Lcom/robinhood/copilot/proto/v1/PostFeedbackRequestDto;", "(Lcom/robinhood/copilot/proto/v1/PostFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFeedback", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;", "(Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface FeedbackService {

    /* compiled from: FeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.FeedbackService$DefaultImpls", m3645f = "FeedbackService.kt", m3646l = {23}, m3647m = "GetFeedback")
    /* renamed from: com.robinhood.copilot.proto.v1.FeedbackService$GetFeedback$1 */
    static final class C328301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C328301(Continuation<? super C328301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetFeedback(null, null, this);
        }
    }

    /* compiled from: FeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.copilot.proto.v1.FeedbackService$DefaultImpls", m3645f = "FeedbackService.kt", m3646l = {13}, m3647m = "PostFeedback")
    /* renamed from: com.robinhood.copilot.proto.v1.FeedbackService$PostFeedback$1 */
    static final class C328311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C328311(Continuation<? super C328311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.PostFeedback(null, null, this);
        }
    }

    Object GetFeedback(GetFeedbackRequestDto getFeedbackRequestDto, Continuation<? super GetFeedbackResponseDto> continuation);

    Object GetFeedback(Request<GetFeedbackRequestDto> request, Continuation<? super Response<GetFeedbackResponseDto>> continuation);

    Object PostFeedback(PostFeedbackRequestDto postFeedbackRequestDto, Continuation<? super PostFeedbackResponseDto> continuation);

    Object PostFeedback(Request<PostFeedbackRequestDto> request, Continuation<? super Response<PostFeedbackResponseDto>> continuation);

    /* compiled from: FeedbackService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object PostFeedback(FeedbackService feedbackService, Request<PostFeedbackRequestDto> request, Continuation<? super Response<PostFeedbackResponseDto>> continuation) {
            C328311 c328311;
            if (continuation instanceof C328311) {
                c328311 = (C328311) continuation;
                int i = c328311.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c328311.label = i - Integer.MIN_VALUE;
                } else {
                    c328311 = new C328311(continuation);
                }
            }
            Object objPostFeedback = c328311.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c328311.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPostFeedback);
                PostFeedbackRequestDto data = request.getData();
                c328311.label = 1;
                objPostFeedback = feedbackService.PostFeedback(data, c328311);
                if (objPostFeedback == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPostFeedback);
            }
            return new Response(objPostFeedback, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetFeedback(FeedbackService feedbackService, Request<GetFeedbackRequestDto> request, Continuation<? super Response<GetFeedbackResponseDto>> continuation) {
            C328301 c328301;
            if (continuation instanceof C328301) {
                c328301 = (C328301) continuation;
                int i = c328301.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c328301.label = i - Integer.MIN_VALUE;
                } else {
                    c328301 = new C328301(continuation);
                }
            }
            Object objGetFeedback = c328301.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c328301.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFeedback);
                GetFeedbackRequestDto data = request.getData();
                c328301.label = 1;
                objGetFeedback = feedbackService.GetFeedback(data, c328301);
                if (objGetFeedback == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFeedback);
            }
            return new Response(objGetFeedback, null, 2, null);
        }
    }
}
