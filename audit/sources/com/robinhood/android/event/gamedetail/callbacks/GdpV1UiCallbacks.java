package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GdpV1UiCallbacks.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\u0013\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0001J\t\u0010\u0015\u001a\u00020\fH\u0096\u0001J\t\u0010\u0016\u001a\u00020\fH\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\t\u0010\u001b\u001a\u00020\fH\u0096\u0001J\t\u0010\u001c\u001a\u00020\fH\u0096\u0001J\t\u0010\u001d\u001a\u00020\fH\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0096\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010 H\u0096\u0001J\u0011\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%H\u0096\u0001J\t\u0010&\u001a\u00020\fH\u0096\u0001J\u001b\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0001J\t\u0010,\u001a\u00020\fH\u0096\u0001J\u0011\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/H\u0096\u0001J\u0013\u00100\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0001J'\u00101\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\f\u00102\u001a\b\u0012\u0004\u0012\u00020 032\u0006\u0010.\u001a\u00020/H\u0096\u0001J\u0011\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020+H\u0096\u0001J\u0013\u00106\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0001J\u0011\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020;H\u0096\u0001¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1UiCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1SelectionCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;", "screenCallbacks", "chartCallbacks", "gdpV1SelectionCallbacks", "commonCallbacks", "<init>", "(Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1SelectionCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;)V", "onAboutEventTypeSelected", "", "aboutEventType", "Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "onAmericanOddsChanged", "isChecked", "", "onChartScrubbed", "point", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onComingBackFromOrderSubmittedHandled", "onConfirmAlternativeStrike", "onContractSelected", "contractOptionData", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "onContractUnselected", "onDeleteClick", "onEventFaqClick", "onOrderSubmitted", "onPollBottomSheet", "eventId", "Ljava/util/UUID;", "onPositionSelected", "contractId", "onPropsCategoryClick", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "onPropsViewAllToggle", "onShowAttestation", "attestationType", "", "redirectOrderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "onShowDisabledTradeButtonMessage", "onSpanSelected", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onStartOnboarding", "onStartPipMode", "contractIds", "", "onStartTrade", "orderContext", "onWheelPickerItemSelected", "contractElement", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "onYesNoToggle", "contractIdWithSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class GdpV1UiCallbacks implements GameDetailScreenCallbacks, ChartCallbacks, GdpV1SelectionCallbacks, GdpCommonCallbacks {
    public static final int $stable = 0;
    private final /* synthetic */ GameDetailScreenCallbacks $$delegate_0;
    private final /* synthetic */ ChartCallbacks $$delegate_1;
    private final /* synthetic */ GdpV1SelectionCallbacks $$delegate_2;
    private final /* synthetic */ GdpCommonCallbacks $$delegate_3;

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onAboutEventTypeSelected(AboutEventType aboutEventType) {
        Intrinsics.checkNotNullParameter(aboutEventType, "aboutEventType");
        this.$$delegate_3.onAboutEventTypeSelected(aboutEventType);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onAmericanOddsChanged(boolean isChecked) {
        this.$$delegate_3.onAmericanOddsChanged(isChecked);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks
    public void onChartScrubbed(Point point) {
        this.$$delegate_1.onChartScrubbed(point);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onComingBackFromOrderSubmittedHandled() {
        this.$$delegate_0.onComingBackFromOrderSubmittedHandled();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onConfirmAlternativeStrike() {
        this.$$delegate_2.onConfirmAlternativeStrike();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onContractSelected(ContractOptionData contractOptionData) {
        Intrinsics.checkNotNullParameter(contractOptionData, "contractOptionData");
        this.$$delegate_2.onContractSelected(contractOptionData);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onContractUnselected(ContractOptionData contractOptionData) {
        Intrinsics.checkNotNullParameter(contractOptionData, "contractOptionData");
        this.$$delegate_2.onContractUnselected(contractOptionData);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onDeleteClick() {
        this.$$delegate_2.onDeleteClick();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onEventFaqClick() {
        this.$$delegate_0.onEventFaqClick();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onOrderSubmitted() {
        this.$$delegate_3.onOrderSubmitted();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onPollBottomSheet(UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.$$delegate_0.onPollBottomSheet(eventId);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onPositionSelected(UUID contractId) {
        this.$$delegate_2.onPositionSelected(contractId);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onPropsCategoryClick(int index) {
        this.$$delegate_2.onPropsCategoryClick(index);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onPropsViewAllToggle() {
        this.$$delegate_2.onPropsViewAllToggle();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onShowAttestation(String attestationType, EventTradeOrderContext redirectOrderContext) {
        Intrinsics.checkNotNullParameter(attestationType, "attestationType");
        this.$$delegate_0.onShowAttestation(attestationType, redirectOrderContext);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onShowDisabledTradeButtonMessage() {
        this.$$delegate_3.onShowDisabledTradeButtonMessage();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks
    public void onSpanSelected(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        this.$$delegate_1.onSpanSelected(span);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartOnboarding(UUID eventId) {
        this.$$delegate_0.onStartOnboarding(eventId);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartPipMode(UUID eventId, List<UUID> contractIds, DisplaySpan span) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Intrinsics.checkNotNullParameter(span, "span");
        this.$$delegate_0.onStartPipMode(eventId, contractIds, span);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartTrade(EventTradeOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        this.$$delegate_0.onStartTrade(orderContext);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onWheelPickerItemSelected(ContractElement contractElement) {
        this.$$delegate_2.onWheelPickerItemSelected(contractElement);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onYesNoToggle(ContractIdWithSide contractIdWithSide) {
        Intrinsics.checkNotNullParameter(contractIdWithSide, "contractIdWithSide");
        this.$$delegate_2.onYesNoToggle(contractIdWithSide);
    }

    public GdpV1UiCallbacks(GameDetailScreenCallbacks screenCallbacks, ChartCallbacks chartCallbacks, GdpV1SelectionCallbacks gdpV1SelectionCallbacks, GdpCommonCallbacks commonCallbacks) {
        Intrinsics.checkNotNullParameter(screenCallbacks, "screenCallbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(gdpV1SelectionCallbacks, "gdpV1SelectionCallbacks");
        Intrinsics.checkNotNullParameter(commonCallbacks, "commonCallbacks");
        this.$$delegate_0 = screenCallbacks;
        this.$$delegate_1 = chartCallbacks;
        this.$$delegate_2 = gdpV1SelectionCallbacks;
        this.$$delegate_3 = commonCallbacks;
    }
}
