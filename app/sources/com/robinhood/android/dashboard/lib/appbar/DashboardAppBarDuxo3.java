package com.robinhood.android.dashboard.lib.appbar;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.InboxBadge;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DashboardAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.appbar.DashboardAppBarDuxo$onCreate$2$5$1", m3645f = "DashboardAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarDuxo$onCreate$2$5$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardAppBarDuxo3 extends ContinuationImpl7 implements Function2<DashboardAppBarDataState, Continuation<? super DashboardAppBarDataState>, Object> {
    final /* synthetic */ InboxBadge $badge;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardAppBarDuxo3(InboxBadge inboxBadge, Continuation<? super DashboardAppBarDuxo3> continuation) {
        super(2, continuation);
        this.$badge = inboxBadge;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DashboardAppBarDuxo3 dashboardAppBarDuxo3 = new DashboardAppBarDuxo3(this.$badge, continuation);
        dashboardAppBarDuxo3.L$0 = obj;
        return dashboardAppBarDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DashboardAppBarDataState dashboardAppBarDataState, Continuation<? super DashboardAppBarDataState> continuation) {
        return ((DashboardAppBarDuxo3) create(dashboardAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DashboardAppBarDataState.copy$default((DashboardAppBarDataState) this.L$0, null, null, null, this.$badge.getResult(), this.$badge.getShouldCriticalBadge(), false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, null);
    }
}
