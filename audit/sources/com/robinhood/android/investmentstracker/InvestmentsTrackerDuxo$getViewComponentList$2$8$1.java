package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.InvestmentsTrackerComponentAllocationsBarDetailsDto;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponentType;
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
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$getViewComponentList$2$8$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class InvestmentsTrackerDuxo$getViewComponentList$2$8$1 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
    final /* synthetic */ InvestmentsTrackerComponentAllocationsBarDetailsDto $details;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestmentsTrackerDuxo$getViewComponentList$2$8$1(InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDto, Continuation<? super InvestmentsTrackerDuxo$getViewComponentList$2$8$1> continuation) {
        super(2, continuation);
        this.$details = investmentsTrackerComponentAllocationsBarDetailsDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestmentsTrackerDuxo$getViewComponentList$2$8$1 investmentsTrackerDuxo$getViewComponentList$2$8$1 = new InvestmentsTrackerDuxo$getViewComponentList$2$8$1(this.$details, continuation);
        investmentsTrackerDuxo$getViewComponentList$2$8$1.L$0 = obj;
        return investmentsTrackerDuxo$getViewComponentList$2$8$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
        return ((InvestmentsTrackerDuxo$getViewComponentList$2$8$1) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
        InvestmentsTrackerComponentType investmentsTrackerComponentType = InvestmentsTrackerComponentType.ALLOCATION_BAR;
        return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, new InvestmentsTrackerAllocationsBarViewModel(this.$details, investmentsTrackerDataState.getActiveAllocationBarId(), investmentsTrackerComponentType, investmentsTrackerComponentType + "-" + this.$details.getHeader(), investmentsTrackerDataState.getSecurityFilter()), null, null, null, null, null, false, null, false, 1071644671, null);
    }
}
