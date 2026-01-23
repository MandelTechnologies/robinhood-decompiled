package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.builders.HeaderState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildGameDetailHeaderState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a&\u0010\b\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\r"}, m3636d2 = {"buildGameDetailHeaderState", "Lcom/robinhood/android/event/gamedetail/builders/HeaderState;", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "eventState", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "shouldMirrorSecondContractImage", "", "buildDuelTeamHeaderState", "buildDuelTeamState", "Lcom/robinhood/android/event/gamedetail/builders/HeaderState$DuelTeamState;", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildGameDetailHeaderStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildGameDetailHeaderState {
    public static /* synthetic */ HeaderState buildGameDetailHeaderState$default(UiEcEvent uiEcEvent, PredictionMarketEventState predictionMarketEventState, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return buildGameDetailHeaderState(uiEcEvent, predictionMarketEventState, z);
    }

    public static final HeaderState buildGameDetailHeaderState(UiEcEvent uiEcEvent, PredictionMarketEventState predictionMarketEventState, boolean z) {
        return buildDuelTeamHeaderState(uiEcEvent, predictionMarketEventState, z);
    }

    public static /* synthetic */ HeaderState buildDuelTeamHeaderState$default(UiEcEvent uiEcEvent, PredictionMarketEventState predictionMarketEventState, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return buildDuelTeamHeaderState(uiEcEvent, predictionMarketEventState, z);
    }

    public static final HeaderState buildDuelTeamHeaderState(UiEcEvent uiEcEvent, PredictionMarketEventState predictionMarketEventState, boolean z) {
        SortedMap<Integer, EventContract> orderedContracts;
        Collection<EventContract> collectionValues;
        List listTake;
        if (uiEcEvent == null || (orderedContracts = uiEcEvent.getOrderedContracts()) == null || (collectionValues = orderedContracts.values()) == null || (listTake = CollectionsKt.take(collectionValues, 2)) == null) {
            return HeaderState.INSTANCE.getLoading();
        }
        EventContract eventContract = (EventContract) CollectionsKt.getOrNull(listTake, 0);
        EventContract eventContract2 = (EventContract) CollectionsKt.getOrNull(listTake, 1);
        if (eventContract == null && eventContract2 == null) {
            return HeaderState.INSTANCE.getLoading();
        }
        return new HeaderState(buildDuelTeamState(eventContract, predictionMarketEventState, z), buildDuelTeamState(eventContract2, predictionMarketEventState, z));
    }

    public static final HeaderState.DuelTeamState buildDuelTeamState(EventContract eventContract, PredictionMarketEventState predictionMarketEventState, boolean z) {
        Map<UUID, String> contractIdToQuaternaryText;
        Map<UUID, Boolean> contractIdToVisualIndicator;
        Map<UUID, String> contractIdToEventScore;
        String str = null;
        if (eventContract == null) {
            return null;
        }
        String str2 = (predictionMarketEventState == null || (contractIdToEventScore = predictionMarketEventState.getContractIdToEventScore()) == null) ? null : contractIdToEventScore.get(eventContract.getContractId());
        boolean zAreEqual = (predictionMarketEventState == null || (contractIdToVisualIndicator = predictionMarketEventState.getContractIdToVisualIndicator()) == null) ? false : Intrinsics.areEqual(contractIdToVisualIndicator.get(eventContract.getContractId()), Boolean.TRUE);
        if (predictionMarketEventState != null && (contractIdToQuaternaryText = predictionMarketEventState.getContractIdToQuaternaryText()) != null) {
            str = contractIdToQuaternaryText.get(eventContract.getContractId());
        }
        return new HeaderState.DuelTeamState(eventContract.getImageUrl(), z, eventContract.getImageUrl(), str2, DayNightColor2.getDayNightColor(eventContract), eventContract.getDisplayShortName(), str, zAreEqual);
    }
}
