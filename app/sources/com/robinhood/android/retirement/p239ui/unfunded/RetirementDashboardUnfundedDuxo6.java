package com.robinhood.android.retirement.p239ui.unfunded;

import com.robinhood.models.p320db.InboxBadge;
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
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$onStart$5$1", m3645f = "RetirementDashboardUnfundedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$onStart$5$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementDashboardUnfundedDuxo6 extends ContinuationImpl7 implements Function2<RetirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState>, Object> {
    final /* synthetic */ InboxBadge $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementDashboardUnfundedDuxo6(InboxBadge inboxBadge, Continuation<? super RetirementDashboardUnfundedDuxo6> continuation) {
        super(2, continuation);
        this.$it = inboxBadge;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementDashboardUnfundedDuxo6 retirementDashboardUnfundedDuxo6 = new RetirementDashboardUnfundedDuxo6(this.$it, continuation);
        retirementDashboardUnfundedDuxo6.L$0 = obj;
        return retirementDashboardUnfundedDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementDashboardUnfundedDataState retirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState> continuation) {
        return ((RetirementDashboardUnfundedDuxo6) create(retirementDashboardUnfundedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RetirementDashboardUnfundedDataState.copy$default((RetirementDashboardUnfundedDataState) this.L$0, null, null, null, null, false, this.$it.getResult(), this.$it.getShouldCriticalBadge(), null, null, false, 927, null);
    }
}
