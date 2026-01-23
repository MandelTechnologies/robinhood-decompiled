package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingDataDto;
import com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$setupInvestmentsTrackerOnboardingExperience$1$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$setupInvestmentsTrackerOnboardingExperience$1$1 */
/* loaded from: classes10.dex */
final class C19461xd6438cd0 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
    final /* synthetic */ InvestmentsTrackerOnboardingDataDto $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C19461xd6438cd0(InvestmentsTrackerOnboardingDataDto investmentsTrackerOnboardingDataDto, Continuation<? super C19461xd6438cd0> continuation) {
        super(2, continuation);
        this.$it = investmentsTrackerOnboardingDataDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C19461xd6438cd0 c19461xd6438cd0 = new C19461xd6438cd0(this.$it, continuation);
        c19461xd6438cd0.L$0 = obj;
        return c19461xd6438cd0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
        return ((C19461xd6438cd0) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InvestmentsTrackerDataState.copy$default((InvestmentsTrackerDataState) this.L$0, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, new OnboardingViewModel(this.$it, 0), null, null, null, false, null, false, 1065353215, null);
    }
}
