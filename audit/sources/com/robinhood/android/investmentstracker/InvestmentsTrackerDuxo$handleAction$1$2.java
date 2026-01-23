package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionRowDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerPageTypeDto;
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
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleAction$1$2", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {689}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class InvestmentsTrackerDuxo$handleAction$1$2 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
    final /* synthetic */ boolean $needToWaitForRequest;
    final /* synthetic */ Object $value;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InvestmentsTrackerDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestmentsTrackerDuxo$handleAction$1$2(Object obj, boolean z, InvestmentsTrackerDuxo investmentsTrackerDuxo, Continuation<? super InvestmentsTrackerDuxo$handleAction$1$2> continuation) {
        super(2, continuation);
        this.$value = obj;
        this.$needToWaitForRequest = z;
        this.this$0 = investmentsTrackerDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestmentsTrackerDuxo$handleAction$1$2 investmentsTrackerDuxo$handleAction$1$2 = new InvestmentsTrackerDuxo$handleAction$1$2(this.$value, this.$needToWaitForRequest, this.this$0, continuation);
        investmentsTrackerDuxo$handleAction$1$2.L$0 = obj;
        return investmentsTrackerDuxo$handleAction$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
        return ((InvestmentsTrackerDuxo$handleAction$1$2) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        InvestmentsTrackerDataState investmentsTrackerDataState;
        InvestmentsTrackerDataState investmentsTrackerDataState2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            investmentsTrackerDataState.getCurrentPageInformationStack().add(new CurrentPageInformation(InvestmentsTrackerPageTypeDto.ACCOUNT, ((InvestmentsTrackerCategorySectionRowDetailsDto) this.$value).getId()));
            if (this.$needToWaitForRequest) {
                InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter = this.this$0.updateCenter;
                this.L$0 = investmentsTrackerDataState;
                this.label = 1;
                if (investmentsTrackerUpdateCenter.refresh(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                investmentsTrackerDataState2 = investmentsTrackerDataState;
            }
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 536870911, null);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        investmentsTrackerDataState2 = (InvestmentsTrackerDataState) this.L$0;
        ResultKt.throwOnFailure(obj);
        investmentsTrackerDataState = investmentsTrackerDataState2;
        return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 536870911, null);
    }
}
