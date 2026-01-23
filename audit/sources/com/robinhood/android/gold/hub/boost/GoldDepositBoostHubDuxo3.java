package com.robinhood.android.gold.hub.boost;

import androidx.paging.Pager;
import com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState;
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

/* compiled from: GoldDepositBoostHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$updateStateWithHistoryPager$2$1", m3645f = "GoldDepositBoostHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$updateStateWithHistoryPager$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldDepositBoostHubDuxo3 extends ContinuationImpl7 implements Function2<GoldDepositBoostHubViewState, Continuation<? super GoldDepositBoostHubViewState>, Object> {
    final /* synthetic */ Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> $pager;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldDepositBoostHubDuxo3(Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager, Continuation<? super GoldDepositBoostHubDuxo3> continuation) {
        super(2, continuation);
        this.$pager = pager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldDepositBoostHubDuxo3 goldDepositBoostHubDuxo3 = new GoldDepositBoostHubDuxo3(this.$pager, continuation);
        goldDepositBoostHubDuxo3.L$0 = obj;
        return goldDepositBoostHubDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldDepositBoostHubViewState goldDepositBoostHubViewState, Continuation<? super GoldDepositBoostHubViewState> continuation) {
        return ((GoldDepositBoostHubDuxo3) create(goldDepositBoostHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GoldDepositBoostHubViewState goldDepositBoostHubViewState = (GoldDepositBoostHubViewState) this.L$0;
        return goldDepositBoostHubViewState instanceof GoldDepositBoostHubViewState.Loaded ? GoldDepositBoostHubViewState.Loaded.copy$default((GoldDepositBoostHubViewState.Loaded) goldDepositBoostHubViewState, null, this.$pager, null, 5, null) : goldDepositBoostHubViewState;
    }
}
