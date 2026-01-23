package com.robinhood.android.investorprofile.p162ui.profile;

import com.robinhood.udf.UiEvent;
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
@DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$2$1$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentProfileSettingsBonfireIdentiDuxo3 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
    final /* synthetic */ Boolean $questionnaireCompleted;
    final /* synthetic */ String $questionnaireContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestmentProfileSettingsBonfireIdentiDuxo3(Boolean bool, String str, Continuation<? super InvestmentProfileSettingsBonfireIdentiDuxo3> continuation) {
        super(2, continuation);
        this.$questionnaireCompleted = bool;
        this.$questionnaireContext = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestmentProfileSettingsBonfireIdentiDuxo3 investmentProfileSettingsBonfireIdentiDuxo3 = new InvestmentProfileSettingsBonfireIdentiDuxo3(this.$questionnaireCompleted, this.$questionnaireContext, continuation);
        investmentProfileSettingsBonfireIdentiDuxo3.L$0 = obj;
        return investmentProfileSettingsBonfireIdentiDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
        return ((InvestmentProfileSettingsBonfireIdentiDuxo3) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, null, null, null, null, false, null, !this.$questionnaireCompleted.booleanValue() ? new UiEvent(this.$questionnaireContext) : null, null, false, false, false, false, false, null, null, null, null, null, 262079, null);
    }
}
