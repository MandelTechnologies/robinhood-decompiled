package com.robinhood.android.event.detail.contractselector.multicontractselector;

import com.robinhood.android.event.detail.builders.BuildEventTradeOverlayDialogData;
import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventMultiContractSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onTradeClicked$1$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onTradeClicked$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventMultiContractSelectorDuxo3 extends ContinuationImpl7 implements Function2<EventContractSelectorDataState, Continuation<? super EventContractSelectorDataState>, Object> {
    final /* synthetic */ int $anchorYPx;
    final /* synthetic */ ContractSelectorButtonViewState $buttonState;
    final /* synthetic */ EventContractSelectorDataState $ds;
    final /* synthetic */ ContractSelectorButtonViewState.PositionState $positionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMultiContractSelectorDuxo3(EventContractSelectorDataState eventContractSelectorDataState, ContractSelectorButtonViewState.PositionState positionState, ContractSelectorButtonViewState contractSelectorButtonViewState, int i, Continuation<? super EventMultiContractSelectorDuxo3> continuation) {
        super(2, continuation);
        this.$ds = eventContractSelectorDataState;
        this.$positionState = positionState;
        this.$buttonState = contractSelectorButtonViewState;
        this.$anchorYPx = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventMultiContractSelectorDuxo3 eventMultiContractSelectorDuxo3 = new EventMultiContractSelectorDuxo3(this.$ds, this.$positionState, this.$buttonState, this.$anchorYPx, continuation);
        eventMultiContractSelectorDuxo3.L$0 = obj;
        return eventMultiContractSelectorDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EventContractSelectorDataState eventContractSelectorDataState, Continuation<? super EventContractSelectorDataState> continuation) {
        return ((EventMultiContractSelectorDuxo3) create(eventContractSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Event event;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventContractSelectorDataState eventContractSelectorDataState = (EventContractSelectorDataState) this.L$0;
        Map<UUID, ContractListData> contractIdToContractListData = this.$ds.getContractIdToContractListData();
        EventViewMode viewMode = null;
        ContractListData contractListData = contractIdToContractListData != null ? contractIdToContractListData.get(((ContractSelectorButtonViewState.PositionState.WithPosition) this.$positionState).getBuyMoreMetadata().getContractId()) : null;
        ContractSelectorButtonViewState contractSelectorButtonViewState = this.$buttonState;
        int i = this.$anchorYPx;
        UiEcEvent uiEvent = this.$ds.getUiEvent();
        if (uiEvent != null && (event = uiEvent.getEvent()) != null) {
            viewMode = event.getViewMode();
        }
        return EventContractSelectorDataState.copy$default(eventContractSelectorDataState, null, null, null, null, BuildEventTradeOverlayDialogData.buildEventTradeOverlayDialog(contractListData, contractSelectorButtonViewState, i, viewMode), null, null, 111, null);
    }
}
