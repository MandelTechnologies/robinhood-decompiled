package com.robinhood.android.event.gamedetail.combostates;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: GameDetailSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000fJ!\u0010\"\u001a\u00020\u00072\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070$¢\u0006\u0002\b%H\u0002J\u000e\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020(J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u000bJ\u0006\u0010+\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(J\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00130.J\u0018\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00130.0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionStateProvider;", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", GameDetailSelectionStateProvider.ARGS_SELECTION_STATE, "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "getSelectionState", "()Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "streamSelectionState", "Lkotlinx/coroutines/flow/StateFlow;", "addContractSelection", "", "contractIdWithSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "contractColumnType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "removeContractSelection", "", "key", "updateContractSelectionSide", "newSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "clearSelections", "selectPosition", "contractId", "Ljava/util/UUID;", "onDismiss", "resetEmptyState", "openStrikePicker", "dismissStrikePicker", "updateAlternativeStrike", "new", "updateState", "mutation", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "selectPropsCategory", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "getSelectedPropsCategoryIndex", "streamSelectedPropsCategoryIndex", "toggleViewAllProps", "getPropsExpansionState", "getPropsExpansionStateMap", "", "streamPropsExpansionState", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GameDetailSelectionStateProvider {
    private static final String ARGS_PROPS_EXPANSION_STATE = "propsExpansionState";
    private static final String ARGS_SELECTED_PROPS_CATEGORY = "selectedPropsCategory";
    private static final String ARGS_SELECTION_STATE = "selectionState";
    private static final int MAX_SELECTIONS = 10;
    private final SavedStateHandle savedStateHandle;
    public static final int $stable = 8;

    public GameDetailSelectionStateProvider(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    public final GameDetailSelectionState getSelectionState() {
        GameDetailSelectionState gameDetailSelectionState = (GameDetailSelectionState) this.savedStateHandle.get(ARGS_SELECTION_STATE);
        return gameDetailSelectionState == null ? new GameDetailSelectionState.Empty(null, 1, null) : gameDetailSelectionState;
    }

    public final StateFlow<GameDetailSelectionState> streamSelectionState() {
        return this.savedStateHandle.getStateFlow(ARGS_SELECTION_STATE, new GameDetailSelectionState.Empty(null, 1, null));
    }

    public final void addContractSelection(final ContractIdWithSide contractIdWithSide, final ContractGroup3 contractColumnType) {
        Intrinsics.checkNotNullParameter(contractIdWithSide, "contractIdWithSide");
        Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
        GameDetailSelectionState gameDetailSelectionStateUpdateState = updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.addContractSelection$lambda$1(contractIdWithSide, contractColumnType, (GameDetailSelectionState) obj);
            }
        });
        Intrinsics.checkNotNull(gameDetailSelectionStateUpdateState, "null cannot be cast to non-null type com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState.ContractSideSelections");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState addContractSelection$lambda$1(ContractIdWithSide contractIdWithSide, ContractGroup3 contractGroup3, GameDetailSelectionState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        ContractSelection contractSelection = new ContractSelection(contractIdWithSide, contractIdWithSide, contractGroup3);
        if (updateState instanceof GameDetailSelectionState.ContractSideSelections) {
            if (contractGroup3 == ContractGroup3.CONTRACT_COLUMN_TYPE_PREPACK) {
                return GameDetailSelectionState.ContractSideSelections.copy$default((GameDetailSelectionState.ContractSideSelections) updateState, CollectionsKt.listOf(contractSelection), null, 2, null);
            }
            GameDetailSelectionState.ContractSideSelections contractSideSelections = (GameDetailSelectionState.ContractSideSelections) updateState;
            List<ContractSelection> selections = contractSideSelections.getSelections();
            ArrayList arrayList = new ArrayList();
            for (Object obj : selections) {
                ContractSelection contractSelection2 = (ContractSelection) obj;
                if (contractSelection2.getContractColumnType() != ContractGroup3.CONTRACT_COLUMN_TYPE_PREPACK && !Intrinsics.areEqual(contractSelection2.getKey(), contractSelection.getKey())) {
                    arrayList.add(obj);
                }
            }
            return arrayList.size() >= 10 ? contractSideSelections : GameDetailSelectionState.ContractSideSelections.copy$default(contractSideSelections, CollectionsKt.plus((Collection<? extends ContractSelection>) arrayList, contractSelection), null, 2, null);
        }
        if (!(updateState instanceof GameDetailSelectionState.Position) && !(updateState instanceof GameDetailSelectionState.Empty)) {
            throw new NoWhenBranchMatchedException();
        }
        return new GameDetailSelectionState.ContractSideSelections(CollectionsKt.listOf(contractSelection), null, 2, null);
    }

    public final boolean removeContractSelection(final ContractIdWithSide key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.removeContractSelection$lambda$4(this.f$0, key, (GameDetailSelectionState) obj);
            }
        }) instanceof GameDetailSelectionState.Empty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState removeContractSelection$lambda$4(GameDetailSelectionStateProvider gameDetailSelectionStateProvider, ContractIdWithSide contractIdWithSide, GameDetailSelectionState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        if (updateState instanceof GameDetailSelectionState.ContractSideSelections) {
            GameDetailSelectionState.ContractSideSelections contractSideSelections = (GameDetailSelectionState.ContractSideSelections) updateState;
            List<ContractSelection> selections = contractSideSelections.getSelections();
            ArrayList arrayList = new ArrayList();
            for (Object obj : selections) {
                if (!Intrinsics.areEqual(((ContractSelection) obj).getKey(), contractIdWithSide)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return new GameDetailSelectionState.Empty(updateState);
            }
            ContractIdWithSide openStrikePickerKey = contractSideSelections.getOpenStrikePickerKey();
            if (openStrikePickerKey == null || Intrinsics.areEqual(openStrikePickerKey, contractIdWithSide)) {
                openStrikePickerKey = null;
            }
            return contractSideSelections.copy(arrayList, openStrikePickerKey);
        }
        if (!(updateState instanceof GameDetailSelectionState.Position) && !(updateState instanceof GameDetailSelectionState.Empty)) {
            throw new NoWhenBranchMatchedException();
        }
        return gameDetailSelectionStateProvider.getSelectionState();
    }

    public final void updateContractSelectionSide(final ContractIdWithSide key, final ContractSide newSide) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newSide, "newSide");
        updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.updateContractSelectionSide$lambda$7(newSide, key, (GameDetailSelectionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState updateContractSelectionSide$lambda$7(ContractSide contractSide, ContractIdWithSide contractIdWithSide, GameDetailSelectionState updateState) {
        Object next;
        List<ContractSelection> selections;
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        if (updateState instanceof GameDetailSelectionState.ContractSideSelections) {
            GameDetailSelectionState.ContractSideSelections contractSideSelections = (GameDetailSelectionState.ContractSideSelections) updateState;
            Iterator<T> it = contractSideSelections.getSelections().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((ContractSelection) next).getKey(), contractIdWithSide)) {
                    break;
                }
            }
            ContractSelection contractSelection = (ContractSelection) next;
            if (contractSelection == null) {
                selections = contractSideSelections.getSelections();
            } else {
                ContractSelection contractSelectionCopy$default = ContractSelection.copy$default(contractSelection, null, ContractIdWithSide.copy$default(contractSelection.getCurrentContractIdWithSide(), null, contractSide, 1, null), null, 5, null);
                List<ContractSelection> selections2 = contractSideSelections.getSelections();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selections2, 10));
                for (ContractSelection contractSelection2 : selections2) {
                    if (Intrinsics.areEqual(contractSelection2.getKey(), contractIdWithSide)) {
                        contractSelection2 = contractSelectionCopy$default;
                    }
                    arrayList.add(contractSelection2);
                }
                selections = arrayList;
            }
            return GameDetailSelectionState.ContractSideSelections.copy$default(contractSideSelections, selections, null, 2, null);
        }
        if ((updateState instanceof GameDetailSelectionState.Empty) || (updateState instanceof GameDetailSelectionState.Position)) {
            return updateState;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void clearSelections() {
        updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.clearSelections$lambda$9(this.f$0, (GameDetailSelectionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState clearSelections$lambda$9(GameDetailSelectionStateProvider gameDetailSelectionStateProvider, GameDetailSelectionState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        GameDetailSelectionState selectionState = gameDetailSelectionStateProvider.getSelectionState();
        if (selectionState instanceof GameDetailSelectionState.Empty) {
            selectionState = null;
        }
        return new GameDetailSelectionState.Empty(selectionState);
    }

    public final void selectPosition(final UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.selectPosition$lambda$10(contractId, (GameDetailSelectionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState selectPosition$lambda$10(UUID uuid, GameDetailSelectionState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return new GameDetailSelectionState.Position(uuid);
    }

    public final void onDismiss() {
        clearSelections();
    }

    public final void resetEmptyState() {
        updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.resetEmptyState$lambda$11((GameDetailSelectionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState resetEmptyState$lambda$11(GameDetailSelectionState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState instanceof GameDetailSelectionState.Empty ? new GameDetailSelectionState.Empty(null, 1, null) : updateState;
    }

    public final void openStrikePicker(final ContractIdWithSide key) {
        Intrinsics.checkNotNullParameter(key, "key");
        updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.openStrikePicker$lambda$13(key, (GameDetailSelectionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState openStrikePicker$lambda$13(ContractIdWithSide contractIdWithSide, GameDetailSelectionState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        if (updateState instanceof GameDetailSelectionState.ContractSideSelections) {
            GameDetailSelectionState.ContractSideSelections contractSideSelections = (GameDetailSelectionState.ContractSideSelections) updateState;
            List<ContractSelection> selections = contractSideSelections.getSelections();
            if ((selections instanceof Collection) && selections.isEmpty()) {
                return contractSideSelections;
            }
            for (ContractSelection contractSelection : selections) {
                if (Intrinsics.areEqual(contractSelection.getKey(), contractIdWithSide) && contractSelection.getContractColumnType() == ContractGroup3.CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE) {
                    return GameDetailSelectionState.ContractSideSelections.copy$default(contractSideSelections, null, contractIdWithSide, 1, null);
                }
            }
            return contractSideSelections;
        }
        if ((updateState instanceof GameDetailSelectionState.Empty) || (updateState instanceof GameDetailSelectionState.Position)) {
            return updateState;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void dismissStrikePicker() {
        updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.dismissStrikePicker$lambda$14((GameDetailSelectionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState dismissStrikePicker$lambda$14(GameDetailSelectionState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        if (updateState instanceof GameDetailSelectionState.ContractSideSelections) {
            return GameDetailSelectionState.ContractSideSelections.copy$default((GameDetailSelectionState.ContractSideSelections) updateState, null, null, 1, null);
        }
        if ((updateState instanceof GameDetailSelectionState.Empty) || (updateState instanceof GameDetailSelectionState.Position)) {
            return updateState;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void updateAlternativeStrike(final ContractIdWithSide contractIdWithSide) {
        Intrinsics.checkNotNullParameter(contractIdWithSide, "new");
        updateState(new Function1() { // from class: com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailSelectionStateProvider.updateAlternativeStrike$lambda$16(contractIdWithSide, (GameDetailSelectionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailSelectionState updateAlternativeStrike$lambda$16(ContractIdWithSide contractIdWithSide, GameDetailSelectionState updateState) {
        ContractIdWithSide contractIdWithSide2;
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        if (updateState instanceof GameDetailSelectionState.ContractSideSelections) {
            GameDetailSelectionState.ContractSideSelections contractSideSelections = (GameDetailSelectionState.ContractSideSelections) updateState;
            ContractIdWithSide openStrikePickerKey = contractSideSelections.getOpenStrikePickerKey();
            if (openStrikePickerKey == null) {
                return updateState;
            }
            List<ContractSelection> selections = contractSideSelections.getSelections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selections, 10));
            for (ContractSelection contractSelectionCopy$default : selections) {
                if (Intrinsics.areEqual(contractSelectionCopy$default.getKey(), openStrikePickerKey)) {
                    contractIdWithSide2 = contractIdWithSide;
                    contractSelectionCopy$default = ContractSelection.copy$default(contractSelectionCopy$default, null, contractIdWithSide2, null, 5, null);
                } else {
                    contractIdWithSide2 = contractIdWithSide;
                }
                arrayList.add(contractSelectionCopy$default);
                contractIdWithSide = contractIdWithSide2;
            }
            return contractSideSelections.copy(arrayList, null);
        }
        if ((updateState instanceof GameDetailSelectionState.Empty) || (updateState instanceof GameDetailSelectionState.Position)) {
            return updateState;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final GameDetailSelectionState updateState(Function1<? super GameDetailSelectionState, ? extends GameDetailSelectionState> mutation) {
        GameDetailSelectionState gameDetailSelectionStateInvoke = mutation.invoke(getSelectionState());
        this.savedStateHandle.set(ARGS_SELECTION_STATE, gameDetailSelectionStateInvoke);
        return gameDetailSelectionStateInvoke;
    }

    public final void selectPropsCategory(int index) {
        clearSelections();
        this.savedStateHandle.set(ARGS_SELECTED_PROPS_CATEGORY, Integer.valueOf(index));
    }

    public final int getSelectedPropsCategoryIndex() {
        Integer num = (Integer) this.savedStateHandle.get(ARGS_SELECTED_PROPS_CATEGORY);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final StateFlow<Integer> streamSelectedPropsCategoryIndex() {
        return this.savedStateHandle.getStateFlow(ARGS_SELECTED_PROPS_CATEGORY, 0);
    }

    public final void toggleViewAllProps() {
        this.savedStateHandle.set(ARGS_PROPS_EXPANSION_STATE, MapsKt.plus(getPropsExpansionStateMap(), Tuples4.m3642to(Integer.valueOf(getSelectedPropsCategoryIndex()), Boolean.valueOf(!getPropsExpansionState(r0)))));
    }

    public final boolean getPropsExpansionState(int index) {
        Boolean bool = getPropsExpansionStateMap().get(Integer.valueOf(index));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Map<Integer, Boolean> getPropsExpansionStateMap() {
        Map<Integer, Boolean> map = (Map) this.savedStateHandle.get(ARGS_PROPS_EXPANSION_STATE);
        return map == null ? MapsKt.emptyMap() : map;
    }

    public final StateFlow<Map<Integer, Boolean>> streamPropsExpansionState() {
        return this.savedStateHandle.getStateFlow(ARGS_PROPS_EXPANSION_STATE, MapsKt.emptyMap());
    }
}
