package com.robinhood.android.retirement.p239ui.unfunded;

import com.robinhood.android.models.retirement.p194db.RetirementUnfundedViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementDashboardUnfundedDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$onStart$4$1", m3645f = "RetirementDashboardUnfundedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$onStart$4$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementDashboardUnfundedDuxo5 extends ContinuationImpl7 implements Function2<RetirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState>, Object> {
    final /* synthetic */ RetirementUnfundedViewModel $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementDashboardUnfundedDuxo5(RetirementUnfundedViewModel retirementUnfundedViewModel, Continuation<? super RetirementDashboardUnfundedDuxo5> continuation) {
        super(2, continuation);
        this.$viewModel = retirementUnfundedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementDashboardUnfundedDuxo5 retirementDashboardUnfundedDuxo5 = new RetirementDashboardUnfundedDuxo5(this.$viewModel, continuation);
        retirementDashboardUnfundedDuxo5.L$0 = obj;
        return retirementDashboardUnfundedDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementDashboardUnfundedDataState retirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState> continuation) {
        return ((RetirementDashboardUnfundedDuxo5) create(retirementDashboardUnfundedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RetirementDashboardUnfundedDataState.copy$default((RetirementDashboardUnfundedDataState) this.L$0, null, null, null, this.$viewModel, false, false, false, null, null, false, 1015, null);
    }
}
