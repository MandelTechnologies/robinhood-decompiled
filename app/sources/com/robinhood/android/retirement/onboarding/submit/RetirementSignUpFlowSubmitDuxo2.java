package com.robinhood.android.retirement.onboarding.submit;

import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$7$1", m3645f = "RetirementSignUpFlowSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$7$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpFlowSubmitDuxo2 extends ContinuationImpl7 implements Function2<RetirementSignupSubmitDataState, Continuation<? super RetirementSignupSubmitDataState>, Object> {
    final /* synthetic */ RetirementSignUpFlowSubmitDuxo.CreateResult $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpFlowSubmitDuxo2(RetirementSignUpFlowSubmitDuxo.CreateResult createResult, Continuation<? super RetirementSignUpFlowSubmitDuxo2> continuation) {
        super(2, continuation);
        this.$result = createResult;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementSignUpFlowSubmitDuxo2 retirementSignUpFlowSubmitDuxo2 = new RetirementSignUpFlowSubmitDuxo2(this.$result, continuation);
        retirementSignUpFlowSubmitDuxo2.L$0 = obj;
        return retirementSignUpFlowSubmitDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementSignupSubmitDataState retirementSignupSubmitDataState, Continuation<? super RetirementSignupSubmitDataState> continuation) {
        return ((RetirementSignUpFlowSubmitDuxo2) create(retirementSignupSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RetirementSignupSubmitDataState.copy$default((RetirementSignupSubmitDataState) this.L$0, false, false, false, 0, ((RetirementSignUpFlowSubmitDuxo.CreateResult.Success) this.$result).getResponse(), 15, null);
    }
}
