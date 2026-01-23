package com.robinhood.android.pathfinder.corepages.pendingdeposits;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PendingDepositsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$onStart$2$1", m3645f = "PendingDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PendingDepositsDuxo2 extends ContinuationImpl7 implements Function2<PendingDepositsViewState, Continuation<? super PendingDepositsViewState>, Object> {
    final /* synthetic */ List<StatefulHistoryEvent<HistoryEvent>> $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PendingDepositsDuxo2(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list, Continuation<? super PendingDepositsDuxo2> continuation) {
        super(2, continuation);
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PendingDepositsDuxo2 pendingDepositsDuxo2 = new PendingDepositsDuxo2(this.$it, continuation);
        pendingDepositsDuxo2.L$0 = obj;
        return pendingDepositsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PendingDepositsViewState pendingDepositsViewState, Continuation<? super PendingDepositsViewState> continuation) {
        return ((PendingDepositsDuxo2) create(pendingDepositsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PendingDepositsViewState pendingDepositsViewState = (PendingDepositsViewState) this.L$0;
        List<StatefulHistoryEvent<HistoryEvent>> list = this.$it;
        Intrinsics.checkNotNull(list);
        return PendingDepositsViewState.copy$default(pendingDepositsViewState, list, false, 2, null);
    }
}
