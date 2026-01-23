package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: GameDetailComboCallbacks.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u0003H&¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;", "", "updateContractSelectionSide", "", "key", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "newSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "addContractSelection", "columnType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "addContractSelectionAndOpenPicker", "removeContractSelection", "clearSelections", "selectPosition", "contractId", "Ljava/util/UUID;", "openStrikePicker", "selectPropsCategory", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "toggleViewAllProps", "dismissWheelPicker", "confirmAlternativeStrike", "newStrike", "resetEmptyState", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface GameDetailComboCallbacks {
    void addContractSelection(ContractIdWithSide key, ContractGroup3 columnType);

    void addContractSelectionAndOpenPicker(ContractIdWithSide key, ContractGroup3 columnType);

    void clearSelections();

    void confirmAlternativeStrike(ContractIdWithSide newStrike);

    void dismissWheelPicker();

    void openStrikePicker(ContractIdWithSide key);

    void removeContractSelection(ContractIdWithSide key);

    void resetEmptyState();

    void selectPosition(UUID contractId);

    void selectPropsCategory(int index);

    void toggleViewAllProps();

    void updateContractSelectionSide(ContractIdWithSide key, ContractSide newSide);
}
