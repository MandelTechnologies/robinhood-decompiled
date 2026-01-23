package com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$onCreate$3$1", m3645f = "IraContributionQuestionnaireContributionTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$onCreate$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class IraContributionQuestionnaireContributionTypeDuxo2 extends ContinuationImpl7 implements Function2<IraContributionQuestionnaireContributionTypeViewState, Continuation<? super IraContributionQuestionnaireContributionTypeViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    IraContributionQuestionnaireContributionTypeDuxo2(Continuation<? super IraContributionQuestionnaireContributionTypeDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IraContributionQuestionnaireContributionTypeDuxo2 iraContributionQuestionnaireContributionTypeDuxo2 = new IraContributionQuestionnaireContributionTypeDuxo2(continuation);
        iraContributionQuestionnaireContributionTypeDuxo2.L$0 = obj;
        return iraContributionQuestionnaireContributionTypeDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IraContributionQuestionnaireContributionTypeViewState iraContributionQuestionnaireContributionTypeViewState, Continuation<? super IraContributionQuestionnaireContributionTypeViewState> continuation) {
        return ((IraContributionQuestionnaireContributionTypeDuxo2) create(iraContributionQuestionnaireContributionTypeViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return IraContributionQuestionnaireContributionTypeViewState.copy$default((IraContributionQuestionnaireContributionTypeViewState) this.L$0, null, true, null, null, 13, null);
    }
}
