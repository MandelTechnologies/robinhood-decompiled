package com.robinhood.android.cortex.store.feedback;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import bonfire.proto.idl.copilot.p032v1.SubmitFeedbackRequestDto;
import bonfire.proto.idl.copilot.p032v1.SubmitFeedbackResponseDto;
import bonfire.proto.idl.copilot.p032v1.SubmitPortfolioDigestFeedbackRequestDto;
import bonfire.proto.idl.copilot.p032v1.SubmitPortfolioDigestFeedbackResponseDto;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.cortex.models.feedback.DigestFeedback2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DigestFeedbackStore.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "feedback"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$submitFeedbackEndpoint$1", m3645f = "DigestFeedbackStore.kt", m3646l = {81, 84}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$submitFeedbackEndpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DigestFeedbackStore8 extends ContinuationImpl7 implements Function2<DigestFeedback, Continuation<? super DigestFeedback>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DigestFeedbackStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DigestFeedbackStore8(DigestFeedbackStore digestFeedbackStore, Continuation<? super DigestFeedbackStore8> continuation) {
        super(2, continuation);
        this.this$0 = digestFeedbackStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DigestFeedbackStore8 digestFeedbackStore8 = new DigestFeedbackStore8(this.this$0, continuation);
        digestFeedbackStore8.L$0 = obj;
        return digestFeedbackStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DigestFeedback digestFeedback, Continuation<? super DigestFeedback> continuation) {
        return ((DigestFeedbackStore8) create(digestFeedback, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r5 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r5 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return DigestFeedback2.toUiModel((SubmitFeedbackResponseDto) obj);
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DigestFeedback2.toUiModel((SubmitPortfolioDigestFeedbackResponseDto) obj);
        }
        ResultKt.throwOnFailure(obj);
        DigestFeedback digestFeedback = (DigestFeedback) this.L$0;
        if (digestFeedback instanceof DigestFeedback.Asset) {
            CopilotService copilotService = this.this$0.copilotService;
            SubmitFeedbackRequestDto dtoModel = DigestFeedback2.toDtoModel((DigestFeedback.Asset) digestFeedback);
            this.label = 1;
            obj = copilotService.SubmitFeedback(dtoModel, this);
        } else if (digestFeedback instanceof DigestFeedback.Portfolio) {
            CopilotService copilotService2 = this.this$0.copilotService;
            SubmitPortfolioDigestFeedbackRequestDto dtoModel2 = DigestFeedback2.toDtoModel((DigestFeedback.Portfolio) digestFeedback);
            this.label = 2;
            obj = copilotService2.SubmitPortfolioDigestFeedback(dtoModel2, this);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return coroutine_suspended;
    }
}
