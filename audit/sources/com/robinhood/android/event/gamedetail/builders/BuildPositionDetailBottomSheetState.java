package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionContractDetailRowState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionDetailBottomSheetState;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl2;
import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRowState;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuildPositionDetailBottomSheetState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a,\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¨\u0006\u0015"}, m3636d2 = {"buildPositionDetailBottomSheetState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionDetailBottomSheetState;", "contractId", "Ljava/util/UUID;", "event", "Lcom/robinhood/android/models/event/db/arsenal/Event;", "contractIdToQuotes", "", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdToPositions", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "displayDetails", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "showPricePayout", "", "getSubtitle", "Lcom/robinhood/utils/resource/StringResource;", "uiEvent", "side", "", "contractSubtitleName", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildPositionDetailBottomSheetStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildPositionDetailBottomSheetState {
    public static /* synthetic */ PositionDetailBottomSheetState buildPositionDetailBottomSheetState$default(UUID uuid, Event event, Map map, Map map2, ContractDisplayDetails contractDisplayDetails, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return buildPositionDetailBottomSheetState(uuid, event, map, map2, contractDisplayDetails, z);
    }

    public static final PositionDetailBottomSheetState buildPositionDetailBottomSheetState(UUID contractId, Event event, Map<UUID, EventQuote> contractIdToQuotes, Map<UUID, UiEventContractPosition> map, ContractDisplayDetails contractDisplayDetails, boolean z) {
        EventQuote eventQuote;
        UiEventContractPosition uiEventContractPosition;
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(contractIdToQuotes, "contractIdToQuotes");
        if (event == null || map == null || (eventQuote = contractIdToQuotes.get(contractId)) == null || (uiEventContractPosition = map.get(contractId)) == null) {
            return null;
        }
        PositionData positionData = BuildGameDetailPositions.getPositionData(uiEventContractPosition, eventQuote, contractDisplayDetails);
        BigDecimal openPnl = positionData.getOpenPnl();
        if (openPnl != null) {
            boolValueOf = Boolean.valueOf(openPnl.signum() >= 0);
        } else {
            boolValueOf = null;
        }
        return new PositionDetailBottomSheetState(new GameDetailPositionRowState(contractId, CommonFormats.formatPositionQuantityWithPrice(uiEventContractPosition), z ? StringResource.INSTANCE.invoke(C16283R.string.position_bottom_sheet_payout_subtitle, new Object[0]) : null, BuildGameDetailPositions.formatRightPrimary(openPnl), z ? BuildGameDetailPositions.formatRightSecondary(positionData.getTotalCost(), positionData.getTotalPotentialValue()) : null, boolValueOf, false, contractDisplayDetails == null, true, null, 576, null), new PositionContractDetailRowState(Uuids.safeToString(contractId), DayNightImageUrl2.imageUrl(contractDisplayDetails), contractDisplayDetails != null ? contractDisplayDetails.getContractTitleName() : null, getSubtitle(contractId, event, positionData.getSide(), contractDisplayDetails != null ? contractDisplayDetails.getContractSubtitleName() : null)));
    }

    public static final StringResource getSubtitle(UUID contractId, Event uiEvent, String side, String str) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        Intrinsics.checkNotNullParameter(side, "side");
        if (uiEvent.getContractIdsToIndex().containsKey(contractId)) {
            return StringResource.INSTANCE.invoke(side);
        }
        if (str != null && str.length() != 0) {
            return StringResource.INSTANCE.invoke(C16283R.string.position_detail_bottom_sheet_row_subtitle_alt_strike, side, str);
        }
        if (str == null || str.length() != 0) {
            return null;
        }
        return StringResource.INSTANCE.invoke(side);
    }
}
