package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: GdpV1SelectionCallbacks.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1SelectionCallbacks;", "", "onContractSelected", "", "contractOptionData", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "onContractUnselected", "onPositionSelected", "contractId", "Ljava/util/UUID;", "onYesNoToggle", "contractIdWithSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "onDeleteClick", "onWheelPickerItemSelected", "contractElement", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "onConfirmAlternativeStrike", "onPropsCategoryClick", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "onPropsViewAllToggle", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface GdpV1SelectionCallbacks {
    void onConfirmAlternativeStrike();

    void onContractSelected(ContractOptionData contractOptionData);

    void onContractUnselected(ContractOptionData contractOptionData);

    void onDeleteClick();

    void onPositionSelected(UUID contractId);

    void onPropsCategoryClick(int index);

    void onPropsViewAllToggle();

    void onWheelPickerItemSelected(ContractElement contractElement);

    void onYesNoToggle(ContractIdWithSide contractIdWithSide);
}
