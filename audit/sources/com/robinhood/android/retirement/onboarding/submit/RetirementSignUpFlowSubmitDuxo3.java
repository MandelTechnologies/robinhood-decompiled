package com.robinhood.android.retirement.onboarding.submit;

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
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$7$2", m3645f = "RetirementSignUpFlowSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$7$2, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpFlowSubmitDuxo3 extends ContinuationImpl7 implements Function2<RetirementSignupSubmitDataState, Continuation<? super RetirementSignupSubmitDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    RetirementSignUpFlowSubmitDuxo3(Continuation<? super RetirementSignUpFlowSubmitDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementSignUpFlowSubmitDuxo3 retirementSignUpFlowSubmitDuxo3 = new RetirementSignUpFlowSubmitDuxo3(continuation);
        retirementSignUpFlowSubmitDuxo3.L$0 = obj;
        return retirementSignUpFlowSubmitDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementSignupSubmitDataState retirementSignupSubmitDataState, Continuation<? super RetirementSignupSubmitDataState> continuation) {
        return ((RetirementSignUpFlowSubmitDuxo3) create(retirementSignupSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RetirementSignupSubmitDataState.copy$default((RetirementSignupSubmitDataState) this.L$0, false, false, true, 0, null, 27, null);
    }
}
