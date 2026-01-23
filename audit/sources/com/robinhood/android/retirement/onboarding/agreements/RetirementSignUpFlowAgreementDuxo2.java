package com.robinhood.android.retirement.onboarding.agreements;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment;
import com.robinhood.android.udf.HasSavedState;
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
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxo$fetchSignupFlow$1$1", m3645f = "RetirementSignUpFlowAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxo$fetchSignupFlow$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpFlowAgreementDuxo2 extends ContinuationImpl7 implements Function2<RetirementAgreementsDataState, Continuation<? super RetirementAgreementsDataState>, Object> {
    final /* synthetic */ ApiRetirementSignUpFlow $flow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RetirementSignUpFlowAgreementDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpFlowAgreementDuxo2(ApiRetirementSignUpFlow apiRetirementSignUpFlow, RetirementSignUpFlowAgreementDuxo retirementSignUpFlowAgreementDuxo, Continuation<? super RetirementSignUpFlowAgreementDuxo2> continuation) {
        super(2, continuation);
        this.$flow = apiRetirementSignUpFlow;
        this.this$0 = retirementSignUpFlowAgreementDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementSignUpFlowAgreementDuxo2 retirementSignUpFlowAgreementDuxo2 = new RetirementSignUpFlowAgreementDuxo2(this.$flow, this.this$0, continuation);
        retirementSignUpFlowAgreementDuxo2.L$0 = obj;
        return retirementSignUpFlowAgreementDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementAgreementsDataState retirementAgreementsDataState, Continuation<? super RetirementAgreementsDataState> continuation) {
        return ((RetirementSignUpFlowAgreementDuxo2) create(retirementAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RetirementAgreementsDataState retirementAgreementsDataState = (RetirementAgreementsDataState) this.L$0;
        ApiRetirementSignUpFlow apiRetirementSignUpFlow = this.$flow;
        return RetirementAgreementsDataState.copy$default(retirementAgreementsDataState, null, apiRetirementSignUpFlow, null, RetirementSignUpFlowAgreementDuxo4.makeInitialSlipCheckboxStates(apiRetirementSignUpFlow.getSlip_agreements(), ((RetirementSignUpFlowAgreementsFragment.Args) RetirementSignUpFlowAgreementDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountType()), 5, null);
    }
}
