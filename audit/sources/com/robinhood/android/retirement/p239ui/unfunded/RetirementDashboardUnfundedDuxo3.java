package com.robinhood.android.retirement.p239ui.unfunded;

import com.robinhood.models.p320db.Account;
import java.util.List;
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
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$onStart$2$1", m3645f = "RetirementDashboardUnfundedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementDashboardUnfundedDuxo3 extends ContinuationImpl7 implements Function2<RetirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState>, Object> {
    final /* synthetic */ List<Account> $retirementAccounts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementDashboardUnfundedDuxo3(List<Account> list, Continuation<? super RetirementDashboardUnfundedDuxo3> continuation) {
        super(2, continuation);
        this.$retirementAccounts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementDashboardUnfundedDuxo3 retirementDashboardUnfundedDuxo3 = new RetirementDashboardUnfundedDuxo3(this.$retirementAccounts, continuation);
        retirementDashboardUnfundedDuxo3.L$0 = obj;
        return retirementDashboardUnfundedDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementDashboardUnfundedDataState retirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState> continuation) {
        return ((RetirementDashboardUnfundedDuxo3) create(retirementDashboardUnfundedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RetirementDashboardUnfundedDataState.copy$default((RetirementDashboardUnfundedDataState) this.L$0, null, this.$retirementAccounts, null, null, false, false, false, null, null, false, 1021, null);
    }
}
