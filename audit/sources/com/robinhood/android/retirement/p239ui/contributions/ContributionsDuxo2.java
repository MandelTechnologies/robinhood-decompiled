package com.robinhood.android.retirement.p239ui.contributions;

import androidx.paging.Pager;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ContributionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$3$1", m3645f = "ContributionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class ContributionsDuxo2 extends ContinuationImpl7 implements Function2<ContributionsDataState, Continuation<? super ContributionsDataState>, Object> {
    final /* synthetic */ Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> $pager;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContributionsDuxo2(Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager, Continuation<? super ContributionsDuxo2> continuation) {
        super(2, continuation);
        this.$pager = pager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContributionsDuxo2 contributionsDuxo2 = new ContributionsDuxo2(this.$pager, continuation);
        contributionsDuxo2.L$0 = obj;
        return contributionsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ContributionsDataState contributionsDataState, Continuation<? super ContributionsDataState> continuation) {
        return ((ContributionsDuxo2) create(contributionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ContributionsDataState.copy$default((ContributionsDataState) this.L$0, null, null, this.$pager, null, null, 27, null);
    }
}
