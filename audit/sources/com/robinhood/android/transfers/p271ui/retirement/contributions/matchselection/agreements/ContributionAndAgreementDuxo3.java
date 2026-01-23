package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ContributionAndAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1$transferRequestResponse$2", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1$transferRequestResponse$2, reason: use source file name */
/* loaded from: classes9.dex */
final class ContributionAndAgreementDuxo3 extends ContinuationImpl7 implements Function2<ContributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ContributionAndAgreementDuxo3(Continuation<? super ContributionAndAgreementDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContributionAndAgreementDuxo3 contributionAndAgreementDuxo3 = new ContributionAndAgreementDuxo3(continuation);
        contributionAndAgreementDuxo3.L$0 = obj;
        return contributionAndAgreementDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ContributionAndAgreementViewState contributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState> continuation) {
        return ((ContributionAndAgreementDuxo3) create(contributionAndAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ContributionAndAgreementViewState.copy$default((ContributionAndAgreementViewState) this.L$0, null, false, false, 3, null);
    }
}
