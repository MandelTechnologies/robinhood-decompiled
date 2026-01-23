package com.robinhood.android.cortex.store.feedback;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import bonfire.proto.idl.copilot.p032v1.GetPortfolioDigestFeedbackRequestDto;
import bonfire.proto.idl.copilot.p032v1.GetPortfolioDigestFeedbackResponseDto;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.cortex.models.feedback.DigestFeedback2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DigestFeedbackStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback$Portfolio;", "id", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$portfolioFeedbackEndpoint$1", m3645f = "DigestFeedbackStore.kt", m3646l = {45}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$portfolioFeedbackEndpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DigestFeedbackStore5 extends ContinuationImpl7 implements Function2<String, Continuation<? super DigestFeedback.Portfolio>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DigestFeedbackStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DigestFeedbackStore5(DigestFeedbackStore digestFeedbackStore, Continuation<? super DigestFeedbackStore5> continuation) {
        super(2, continuation);
        this.this$0 = digestFeedbackStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DigestFeedbackStore5 digestFeedbackStore5 = new DigestFeedbackStore5(this.this$0, continuation);
        digestFeedbackStore5.L$0 = obj;
        return digestFeedbackStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super DigestFeedback.Portfolio> continuation) {
        return ((DigestFeedbackStore5) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            CopilotService copilotService = this.this$0.copilotService;
            GetPortfolioDigestFeedbackRequestDto getPortfolioDigestFeedbackRequestDto = new GetPortfolioDigestFeedbackRequestDto(str, null, 2, null);
            this.label = 1;
            obj = copilotService.GetPortfolioDigestFeedback(getPortfolioDigestFeedbackRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return DigestFeedback2.toUiModel((GetPortfolioDigestFeedbackResponseDto) obj);
    }
}
