package com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype;

import com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo;
import com.robinhood.udf.UiEvent;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$onCreate$3$3", m3645f = "IraContributionQuestionnaireContributionTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$onCreate$3$3, reason: use source file name */
/* loaded from: classes9.dex */
final class IraContributionQuestionnaireContributionTypeDuxo4 extends ContinuationImpl7 implements Function2<IraContributionQuestionnaireContributionTypeViewState, Continuation<? super IraContributionQuestionnaireContributionTypeViewState>, Object> {
    final /* synthetic */ IraContributionQuestionnaireContributionTypeDuxo.Result $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IraContributionQuestionnaireContributionTypeDuxo4(IraContributionQuestionnaireContributionTypeDuxo.Result result, Continuation<? super IraContributionQuestionnaireContributionTypeDuxo4> continuation) {
        super(2, continuation);
        this.$result = result;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IraContributionQuestionnaireContributionTypeDuxo4 iraContributionQuestionnaireContributionTypeDuxo4 = new IraContributionQuestionnaireContributionTypeDuxo4(this.$result, continuation);
        iraContributionQuestionnaireContributionTypeDuxo4.L$0 = obj;
        return iraContributionQuestionnaireContributionTypeDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IraContributionQuestionnaireContributionTypeViewState iraContributionQuestionnaireContributionTypeViewState, Continuation<? super IraContributionQuestionnaireContributionTypeViewState> continuation) {
        return ((IraContributionQuestionnaireContributionTypeDuxo4) create(iraContributionQuestionnaireContributionTypeViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return IraContributionQuestionnaireContributionTypeViewState.copy$default((IraContributionQuestionnaireContributionTypeViewState) this.L$0, null, false, null, new UiEvent(((IraContributionQuestionnaireContributionTypeDuxo.Result.Error) this.$result).getThrowable()), 5, null);
    }
}
