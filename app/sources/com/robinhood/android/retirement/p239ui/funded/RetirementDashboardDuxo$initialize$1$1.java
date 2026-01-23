package com.robinhood.android.retirement.p239ui.funded;

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
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$initialize$1$1", m3645f = "RetirementDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetirementDashboardDuxo$initialize$1$1 extends ContinuationImpl7 implements Function2<RetirementDashboardDataState, Continuation<? super RetirementDashboardDataState>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ boolean $isEmbedded;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementDashboardDuxo$initialize$1$1(String str, boolean z, Continuation<? super RetirementDashboardDuxo$initialize$1$1> continuation) {
        super(2, continuation);
        this.$accountNumber = str;
        this.$isEmbedded = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementDashboardDuxo$initialize$1$1 retirementDashboardDuxo$initialize$1$1 = new RetirementDashboardDuxo$initialize$1$1(this.$accountNumber, this.$isEmbedded, continuation);
        retirementDashboardDuxo$initialize$1$1.L$0 = obj;
        return retirementDashboardDuxo$initialize$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementDashboardDataState retirementDashboardDataState, Continuation<? super RetirementDashboardDataState> continuation) {
        return ((RetirementDashboardDuxo$initialize$1$1) create(retirementDashboardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RetirementDashboardDataState.copy$default((RetirementDashboardDataState) this.L$0, null, null, null, this.$accountNumber, null, false, null, false, false, null, false, false, this.$isEmbedded, 4087, null);
    }
}
