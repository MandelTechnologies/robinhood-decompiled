package com.robinhood.android.retirement.onboarding.agreements;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementSignUpFlowAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxo$fetchSignupFlow$2$1", m3645f = "RetirementSignUpFlowAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxo$fetchSignupFlow$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpFlowAgreementDuxo3 extends ContinuationImpl7 implements Function2<RetirementAgreementsDataState, Continuation<? super RetirementAgreementsDataState>, Object> {
    final /* synthetic */ Throwable $throwable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpFlowAgreementDuxo3(Throwable th, Continuation<? super RetirementSignUpFlowAgreementDuxo3> continuation) {
        super(2, continuation);
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementSignUpFlowAgreementDuxo3 retirementSignUpFlowAgreementDuxo3 = new RetirementSignUpFlowAgreementDuxo3(this.$throwable, continuation);
        retirementSignUpFlowAgreementDuxo3.L$0 = obj;
        return retirementSignUpFlowAgreementDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementAgreementsDataState retirementAgreementsDataState, Continuation<? super RetirementAgreementsDataState> continuation) {
        return ((RetirementSignUpFlowAgreementDuxo3) create(retirementAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RetirementAgreementsDataState.copy$default((RetirementAgreementsDataState) this.L$0, null, null, this.$throwable, null, 11, null);
    }
}
