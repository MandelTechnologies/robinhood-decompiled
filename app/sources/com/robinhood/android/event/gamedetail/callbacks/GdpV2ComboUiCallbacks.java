package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GdpV2ComboUiCallbacks.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J\u0019\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J\t\u0010\u0012\u001a\u00020\fH\u0096\u0001J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0001J\t\u0010\u0015\u001a\u00020\fH\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u0011\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0001J\t\u0010\u001f\u001a\u00020\fH\u0096\u0001J\t\u0010 \u001a\u00020\fH\u0096\u0001J\t\u0010!\u001a\u00020\fH\u0096\u0001J\u0011\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0096\u0001J\u001b\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0001J\t\u0010*\u001a\u00020\fH\u0096\u0001J\u0011\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-H\u0096\u0001J\u0013\u0010.\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0001J'\u0010/\u001a\u00020\f2\u0006\u0010#\u001a\u00020$2\f\u00100\u001a\b\u0012\u0004\u0012\u00020$012\u0006\u0010,\u001a\u00020-H\u0096\u0001J\u0011\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020)H\u0096\u0001J\u0011\u00104\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u0011\u00105\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\t\u00106\u001a\u00020\fH\u0096\u0001J\u0011\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020$H\u0096\u0001J\u0011\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020;H\u0096\u0001J\t\u0010<\u001a\u00020\fH\u0096\u0001J\u0019\u0010=\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020?H\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/callbacks/GdpV2ComboUiCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;", "screenCallbacks", "chartCallbacks", "comboCallbacks", "commonCallbacks", "<init>", "(Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;)V", "addContractSelection", "", "key", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "columnType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "addContractSelectionAndOpenPicker", "clearSelections", "confirmAlternativeStrike", "newStrike", "dismissWheelPicker", "onAboutEventTypeSelected", "aboutEventType", "Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "onAmericanOddsChanged", "isChecked", "", "onChartScrubbed", "point", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onComingBackFromOrderSubmittedHandled", "onEventFaqClick", "onOrderSubmitted", "onPollBottomSheet", "eventId", "Ljava/util/UUID;", "onShowAttestation", "attestationType", "", "redirectOrderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "onShowDisabledTradeButtonMessage", "onSpanSelected", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onStartOnboarding", "onStartPipMode", "contractIds", "", "onStartTrade", "orderContext", "openStrikePicker", "removeContractSelection", "resetEmptyState", "selectPosition", "contractId", "selectPropsCategory", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "toggleViewAllProps", "updateContractSelectionSide", "newSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class GdpV2ComboUiCallbacks implements GameDetailScreenCallbacks, ChartCallbacks, GameDetailComboCallbacks, GdpCommonCallbacks {
    public static final int $stable = 0;
    private final ChartCallbacks chartCallbacks;
    private final GameDetailComboCallbacks comboCallbacks;
    private final GdpCommonCallbacks commonCallbacks;
    private final GameDetailScreenCallbacks screenCallbacks;

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void addContractSelection(ContractIdWithSide key, ContractGroup3 columnType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(columnType, "columnType");
        this.comboCallbacks.addContractSelection(key, columnType);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void addContractSelectionAndOpenPicker(ContractIdWithSide key, ContractGroup3 columnType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(columnType, "columnType");
        this.comboCallbacks.addContractSelectionAndOpenPicker(key, columnType);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void clearSelections() {
        this.comboCallbacks.clearSelections();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void confirmAlternativeStrike(ContractIdWithSide newStrike) {
        Intrinsics.checkNotNullParameter(newStrike, "newStrike");
        this.comboCallbacks.confirmAlternativeStrike(newStrike);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void dismissWheelPicker() {
        this.comboCallbacks.dismissWheelPicker();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onAboutEventTypeSelected(AboutEventType aboutEventType) {
        Intrinsics.checkNotNullParameter(aboutEventType, "aboutEventType");
        this.commonCallbacks.onAboutEventTypeSelected(aboutEventType);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onAmericanOddsChanged(boolean isChecked) {
        this.commonCallbacks.onAmericanOddsChanged(isChecked);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks
    public void onChartScrubbed(Point point) {
        this.chartCallbacks.onChartScrubbed(point);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onComingBackFromOrderSubmittedHandled() {
        this.screenCallbacks.onComingBackFromOrderSubmittedHandled();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onEventFaqClick() {
        this.screenCallbacks.onEventFaqClick();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onOrderSubmitted() {
        this.commonCallbacks.onOrderSubmitted();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onPollBottomSheet(UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.screenCallbacks.onPollBottomSheet(eventId);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onShowAttestation(String attestationType, EventTradeOrderContext redirectOrderContext) {
        Intrinsics.checkNotNullParameter(attestationType, "attestationType");
        this.screenCallbacks.onShowAttestation(attestationType, redirectOrderContext);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onShowDisabledTradeButtonMessage() {
        this.commonCallbacks.onShowDisabledTradeButtonMessage();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks
    public void onSpanSelected(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        this.chartCallbacks.onSpanSelected(span);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartOnboarding(UUID eventId) {
        this.screenCallbacks.onStartOnboarding(eventId);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartPipMode(UUID eventId, List<UUID> contractIds, DisplaySpan span) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Intrinsics.checkNotNullParameter(span, "span");
        this.screenCallbacks.onStartPipMode(eventId, contractIds, span);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartTrade(EventTradeOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        this.screenCallbacks.onStartTrade(orderContext);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void openStrikePicker(ContractIdWithSide key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.comboCallbacks.openStrikePicker(key);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void removeContractSelection(ContractIdWithSide key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.comboCallbacks.removeContractSelection(key);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void resetEmptyState() {
        this.comboCallbacks.resetEmptyState();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void selectPosition(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        this.comboCallbacks.selectPosition(contractId);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void selectPropsCategory(int index) {
        this.comboCallbacks.selectPropsCategory(index);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void toggleViewAllProps() {
        this.comboCallbacks.toggleViewAllProps();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void updateContractSelectionSide(ContractIdWithSide key, ContractSide newSide) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newSide, "newSide");
        this.comboCallbacks.updateContractSelectionSide(key, newSide);
    }

    public GdpV2ComboUiCallbacks(GameDetailScreenCallbacks screenCallbacks, ChartCallbacks chartCallbacks, GameDetailComboCallbacks comboCallbacks, GdpCommonCallbacks commonCallbacks) {
        Intrinsics.checkNotNullParameter(screenCallbacks, "screenCallbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(comboCallbacks, "comboCallbacks");
        Intrinsics.checkNotNullParameter(commonCallbacks, "commonCallbacks");
        this.screenCallbacks = screenCallbacks;
        this.chartCallbacks = chartCallbacks;
        this.comboCallbacks = comboCallbacks;
        this.commonCallbacks = commonCallbacks;
    }
}
