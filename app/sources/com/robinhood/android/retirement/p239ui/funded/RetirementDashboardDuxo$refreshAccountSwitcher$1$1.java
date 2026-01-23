package com.robinhood.android.retirement.p239ui.funded;

import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementDashboardDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$refreshAccountSwitcher$1$1", m3645f = "RetirementDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetirementDashboardDuxo$refreshAccountSwitcher$1$1 extends ContinuationImpl7 implements Function2<RetirementDashboardDataState, Continuation<? super RetirementDashboardDataState>, Object> {
    final /* synthetic */ AsyncResult<RetirementAccountSwitcher> $switcherState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementDashboardDuxo$refreshAccountSwitcher$1$1(AsyncResult<RetirementAccountSwitcher> asyncResult, Continuation<? super RetirementDashboardDuxo$refreshAccountSwitcher$1$1> continuation) {
        super(2, continuation);
        this.$switcherState = asyncResult;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementDashboardDuxo$refreshAccountSwitcher$1$1 retirementDashboardDuxo$refreshAccountSwitcher$1$1 = new RetirementDashboardDuxo$refreshAccountSwitcher$1$1(this.$switcherState, continuation);
        retirementDashboardDuxo$refreshAccountSwitcher$1$1.L$0 = obj;
        return retirementDashboardDuxo$refreshAccountSwitcher$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementDashboardDataState retirementDashboardDataState, Continuation<? super RetirementDashboardDataState> continuation) {
        return ((RetirementDashboardDuxo$refreshAccountSwitcher$1$1) create(retirementDashboardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RetirementDashboardDataState retirementDashboardDataState = (RetirementDashboardDataState) this.L$0;
        RetirementAccountSwitcher successValue = this.$switcherState.getSuccessValue();
        if (successValue == null) {
            successValue = retirementDashboardDataState.getAccountSwitcher();
        }
        return RetirementDashboardDataState.copy$default(retirementDashboardDataState, null, null, null, null, null, this.$switcherState instanceof AsyncResult.Loading, successValue, false, false, null, false, false, false, 8095, null);
    }
}
