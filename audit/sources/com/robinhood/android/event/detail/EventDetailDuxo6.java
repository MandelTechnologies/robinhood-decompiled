package com.robinhood.android.event.detail;

import com.robinhood.android.event.detail.builders.BuildEventTradeOverlayDialogData;
import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onTradeButtonClicked$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onTradeButtonClicked$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventDetailDuxo6 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
    final /* synthetic */ int $anchorYPx;
    final /* synthetic */ ContractSelectorButtonViewState $buttonState;
    final /* synthetic */ EventDetailDuelDataState $ds;
    final /* synthetic */ ContractSelectorButtonViewState.PositionState $ps;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventDetailDuxo6(EventDetailDuelDataState eventDetailDuelDataState, ContractSelectorButtonViewState contractSelectorButtonViewState, int i, ContractSelectorButtonViewState.PositionState positionState, Continuation<? super EventDetailDuxo6> continuation) {
        super(2, continuation);
        this.$ds = eventDetailDuelDataState;
        this.$buttonState = contractSelectorButtonViewState;
        this.$anchorYPx = i;
        this.$ps = positionState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventDetailDuxo6 eventDetailDuxo6 = new EventDetailDuxo6(this.$ds, this.$buttonState, this.$anchorYPx, this.$ps, continuation);
        eventDetailDuxo6.L$0 = obj;
        return eventDetailDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
        return ((EventDetailDuxo6) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventDetailDuelDataState eventDetailDuelDataState = (EventDetailDuelDataState) this.L$0;
        ImmutableList<ContractListData> contractDataList = this.$ds.getContractDataList();
        ContractListData contractListData = null;
        if (contractDataList != null) {
            ContractSelectorButtonViewState.PositionState positionState = this.$ps;
            Iterator<ContractListData> it = contractDataList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ContractListData next = it.next();
                if (Intrinsics.areEqual(next.getContract().getContractId(), ((ContractSelectorButtonViewState.PositionState.WithPosition) positionState).getBuyMoreMetadata().getContractId())) {
                    contractListData = next;
                    break;
                }
            }
            contractListData = contractListData;
        }
        return EventDetailDuelDataState.copy$default(eventDetailDuelDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, BuildEventTradeOverlayDialogData.buildEventTradeOverlayDialog(contractListData, this.$buttonState, this.$anchorYPx, this.$ds.getViewMode()), false, 3145727, null);
    }
}
