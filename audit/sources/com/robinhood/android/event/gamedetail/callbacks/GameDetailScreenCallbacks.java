package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: GameDetailScreenCallbacks.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;", "", "onStartPipMode", "", "eventId", "Ljava/util/UUID;", "contractIds", "", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onEventFaqClick", "onStartTrade", "orderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "onStartOnboarding", "onShowAttestation", "attestationType", "", "redirectOrderContext", "onPollBottomSheet", "onComingBackFromOrderSubmittedHandled", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface GameDetailScreenCallbacks {
    void onComingBackFromOrderSubmittedHandled();

    void onEventFaqClick();

    void onPollBottomSheet(UUID eventId);

    void onShowAttestation(String attestationType, EventTradeOrderContext redirectOrderContext);

    void onStartOnboarding(UUID eventId);

    void onStartPipMode(UUID eventId, List<UUID> contractIds, DisplaySpan span);

    void onStartTrade(EventTradeOrderContext orderContext);
}
