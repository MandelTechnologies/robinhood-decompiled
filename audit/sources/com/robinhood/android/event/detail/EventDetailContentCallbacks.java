package com.robinhood.android.event.detail;

import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: EventDetailContent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0003H&¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailContentCallbacks;", "", "onHeaderVisibilityChange", "", "visible", "", "onEventFaqClick", "onSpanSelected", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onScrub", "point", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onContractSelected", "contractId", "Ljava/util/UUID;", "onDisplayModeChange", "displayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "onViewAllClick", "eventId", "onTradeButtonClicked", "buttonState", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "anchorYPx", "", "onTradeOverlayDialogDismiss", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EventDetailContentCallbacks {
    void onContractSelected(UUID contractId);

    void onDisplayModeChange(EventDetailDisplayDataBottomSheet displayMode);

    void onEventFaqClick();

    void onHeaderVisibilityChange(boolean visible);

    void onScrub(Point point);

    void onSpanSelected(DisplaySpan span);

    void onTradeButtonClicked(ContractSelectorButtonViewState buttonState, int anchorYPx);

    void onTradeOverlayDialogDismiss();

    void onViewAllClick(UUID eventId);
}
