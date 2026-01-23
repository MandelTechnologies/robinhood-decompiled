package com.robinhood.android.event.gamedetail.callbacks;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GameDetailComboCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"buildWith", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sheetState", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacksKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailComboCallbacks2 {
    public static final GameDetailComboCallbacks buildWith(GameDetailComboCallbacks gameDetailComboCallbacks, CoroutineScope scope, MultiModeSheetState sheetState) {
        Intrinsics.checkNotNullParameter(gameDetailComboCallbacks, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        return new GameDetailComboCallbacks(sheetState, scope) { // from class: com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacksKt.buildWith.1
            private final /* synthetic */ GameDetailComboCallbacks $$delegate_0;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ MultiModeSheetState $sheetState;

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void clearSelections() {
                this.$$delegate_0.clearSelections();
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void confirmAlternativeStrike(ContractIdWithSide newStrike) {
                Intrinsics.checkNotNullParameter(newStrike, "newStrike");
                this.$$delegate_0.confirmAlternativeStrike(newStrike);
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void dismissWheelPicker() {
                this.$$delegate_0.dismissWheelPicker();
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void openStrikePicker(ContractIdWithSide key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.$$delegate_0.openStrikePicker(key);
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void removeContractSelection(ContractIdWithSide key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.$$delegate_0.removeContractSelection(key);
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void resetEmptyState() {
                this.$$delegate_0.resetEmptyState();
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void selectPropsCategory(int index) {
                this.$$delegate_0.selectPropsCategory(index);
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void toggleViewAllProps() {
                this.$$delegate_0.toggleViewAllProps();
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void updateContractSelectionSide(ContractIdWithSide key, ContractSide newSide) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(newSide, "newSide");
                this.$$delegate_0.updateContractSelectionSide(key, newSide);
            }

            {
                this.$sheetState = sheetState;
                this.$scope = scope;
                this.$$delegate_0 = this.$this_buildWith;
            }

            private final void showSheetIfNotInExpandedState() {
                if (!this.$sheetState.isVisible() || Intrinsics.areEqual(this.$sheetState.getTargetValue(), MultiModeSheetState2.Hidden.INSTANCE)) {
                    BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new GameDetailComboCallbacks3(this.$sheetState, null), 3, null);
                }
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void addContractSelection(ContractIdWithSide key, ContractGroup3 columnType) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(columnType, "columnType");
                this.$this_buildWith.addContractSelection(key, columnType);
                showSheetIfNotInExpandedState();
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void addContractSelectionAndOpenPicker(ContractIdWithSide key, ContractGroup3 columnType) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(columnType, "columnType");
                this.$this_buildWith.addContractSelectionAndOpenPicker(key, columnType);
                showSheetIfNotInExpandedState();
            }

            @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
            public void selectPosition(UUID contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                this.$this_buildWith.selectPosition(contractId);
                showSheetIfNotInExpandedState();
            }
        };
    }
}
