package com.robinhood.android.dashboard.lib.header.brokerage;

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

/* compiled from: DashboardHeaderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$1$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardHeaderDuxo2 extends ContinuationImpl7 implements Function2<DashboardHeaderDataState, Continuation<? super DashboardHeaderDataState>, Object> {
    final /* synthetic */ List<Account> $accounts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardHeaderDuxo2(List<Account> list, Continuation<? super DashboardHeaderDuxo2> continuation) {
        super(2, continuation);
        this.$accounts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DashboardHeaderDuxo2 dashboardHeaderDuxo2 = new DashboardHeaderDuxo2(this.$accounts, continuation);
        dashboardHeaderDuxo2.L$0 = obj;
        return dashboardHeaderDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DashboardHeaderDataState dashboardHeaderDataState, Continuation<? super DashboardHeaderDataState> continuation) {
        return ((DashboardHeaderDuxo2) create(dashboardHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DashboardHeaderDataState.copy$default((DashboardHeaderDataState) this.L$0, null, this.$accounts, null, null, false, false, null, 125, null);
    }
}
