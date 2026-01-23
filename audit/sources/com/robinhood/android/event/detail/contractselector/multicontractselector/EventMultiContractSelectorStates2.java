package com.robinhood.android.event.detail.contractselector.multicontractselector;

import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventMultiContractSelectorStates.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorViewState;", "<init>", "()V", "reduce", "dataState", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventContractSelectorStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventMultiContractSelectorStates2 implements StateProvider<EventContractSelectorDataState, EventContractSelectorViewState> {
    public static final int $stable = 0;
    public static final EventMultiContractSelectorStates2 INSTANCE = new EventMultiContractSelectorStates2();

    private EventMultiContractSelectorStates2() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public EventContractSelectorViewState reduce(EventContractSelectorDataState dataState) {
        Event event;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiEcEvent uiEvent = dataState.getUiEvent();
        return new EventContractSelectorViewState((uiEvent == null || (event = uiEvent.getEvent()) == null) ? null : event.getName(), dataState.getContractList(), dataState.getEventTradeOverlayDialog());
    }
}
