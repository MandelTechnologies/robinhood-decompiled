package com.robinhood.android.investorprofile.p162ui.profile;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onAnnualIncomeUpdated$3$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onAnnualIncomeUpdated$3$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentProfileSettingsBonfireIdentiDuxo2 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InvestmentProfileSettingsBonfireIdentiDuxo2(Continuation<? super InvestmentProfileSettingsBonfireIdentiDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestmentProfileSettingsBonfireIdentiDuxo2 investmentProfileSettingsBonfireIdentiDuxo2 = new InvestmentProfileSettingsBonfireIdentiDuxo2(continuation);
        investmentProfileSettingsBonfireIdentiDuxo2.L$0 = obj;
        return investmentProfileSettingsBonfireIdentiDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
        return ((InvestmentProfileSettingsBonfireIdentiDuxo2) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, null, null, null, null, false, null, null, null, false, false, true, false, false, null, null, null, null, null, 261119, null);
    }
}
