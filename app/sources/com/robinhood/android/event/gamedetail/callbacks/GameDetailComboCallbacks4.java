package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailComboCallbacks.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/callbacks/NoOpsGameDetailComboCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;", "<init>", "()V", "updateContractSelectionSide", "", "key", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "newSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "addContractSelection", "columnType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "addContractSelectionAndOpenPicker", "removeContractSelection", "clearSelections", "selectPosition", "contractId", "Ljava/util/UUID;", "openStrikePicker", "selectPropsCategory", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "toggleViewAllProps", "dismissWheelPicker", "confirmAlternativeStrike", "newStrike", "resetEmptyState", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.callbacks.NoOpsGameDetailComboCallbacks, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailComboCallbacks4 implements GameDetailComboCallbacks {
    public static final int $stable = 0;
    public static final GameDetailComboCallbacks4 INSTANCE = new GameDetailComboCallbacks4();

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void addContractSelection(ContractIdWithSide key, ContractGroup3 columnType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(columnType, "columnType");
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void addContractSelectionAndOpenPicker(ContractIdWithSide key, ContractGroup3 columnType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(columnType, "columnType");
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void clearSelections() {
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void confirmAlternativeStrike(ContractIdWithSide newStrike) {
        Intrinsics.checkNotNullParameter(newStrike, "newStrike");
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void dismissWheelPicker() {
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void openStrikePicker(ContractIdWithSide key) {
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void removeContractSelection(ContractIdWithSide key) {
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void resetEmptyState() {
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void selectPosition(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void selectPropsCategory(int index) {
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void toggleViewAllProps() {
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void updateContractSelectionSide(ContractIdWithSide key, ContractSide newSide) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newSide, "newSide");
    }

    private GameDetailComboCallbacks4() {
    }
}
