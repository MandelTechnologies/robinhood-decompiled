package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.BottomSheetSelection;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionDetailBottomSheetState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.StrikeContract;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuildGameDetailBottomSheetState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008c\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¨\u0006\u0016"}, m3636d2 = {"buildGameDetailBottomSheetState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "bottomSheetSelection", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;", "overrideWithPositionBottomSheet", "", "contractIdToEventContract", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "contractIdToQuotes", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdToStrikeContract", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/StrikeContract;", "bottomSheetDisplayDetails", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "event", "Lcom/robinhood/android/models/event/db/arsenal/Event;", "contractIdToPositionsForCurrentGame", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "isInPricePayoutExperiment", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildGameDetailBottomSheetStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildGameDetailBottomSheetState {
    public static final GameDetailBottomSheetState buildGameDetailBottomSheetState(BottomSheetSelection bottomSheetSelection, boolean z, Map<UUID, EventContract> map, Map<UUID, EventQuote> contractIdToQuotes, Map<ContractIdWithSide, StrikeContract> contractIdToStrikeContract, ContractDisplayDetails contractDisplayDetails, Event event, Map<UUID, UiEventContractPosition> map2, boolean z2) {
        Intrinsics.checkNotNullParameter(contractIdToQuotes, "contractIdToQuotes");
        Intrinsics.checkNotNullParameter(contractIdToStrikeContract, "contractIdToStrikeContract");
        if (!(bottomSheetSelection instanceof BottomSheetSelection.ContractOption)) {
            if (!(bottomSheetSelection instanceof BottomSheetSelection.Position)) {
                if (bottomSheetSelection == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            PositionDetailBottomSheetState positionDetailBottomSheetStateBuildPositionDetailBottomSheetState = BuildPositionDetailBottomSheetState.buildPositionDetailBottomSheetState(((BottomSheetSelection.Position) bottomSheetSelection).getContractId(), event, contractIdToQuotes, map2, contractDisplayDetails, z2);
            if (positionDetailBottomSheetStateBuildPositionDetailBottomSheetState != null) {
                return new GameDetailBottomSheetState.PositionDetail(positionDetailBottomSheetStateBuildPositionDetailBottomSheetState);
            }
            return null;
        }
        if (z) {
            PositionDetailBottomSheetState positionDetailBottomSheetStateBuildPositionDetailBottomSheetState2 = BuildPositionDetailBottomSheetState.buildPositionDetailBottomSheetState(((BottomSheetSelection.ContractOption) bottomSheetSelection).getData().getSelectedContract().getContractId(), event, contractIdToQuotes, map2, contractDisplayDetails, z2);
            if (positionDetailBottomSheetStateBuildPositionDetailBottomSheetState2 != null) {
                return new GameDetailBottomSheetState.PositionDetail(positionDetailBottomSheetStateBuildPositionDetailBottomSheetState2);
            }
            return null;
        }
        GameDetailTradeBottomSheetState gameDetailTradeBottomSheetStateBuildTradeSlipBottomSheetState = BuildTradeBottomSheetState.buildTradeSlipBottomSheetState(((BottomSheetSelection.ContractOption) bottomSheetSelection).getData(), map, contractIdToQuotes, contractIdToStrikeContract, contractDisplayDetails);
        if (gameDetailTradeBottomSheetStateBuildTradeSlipBottomSheetState != null) {
            return new GameDetailBottomSheetState.Trade(gameDetailTradeBottomSheetStateBuildTradeSlipBottomSheetState);
        }
        return null;
    }
}
