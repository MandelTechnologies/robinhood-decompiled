package com.robinhood.android.event.gamedetail.builders;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.event.gamedetail.BottomSheetSelection;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRowState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.maths.EventMathsUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup5;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractSideExtensions;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuildGameDetailPositions.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001al\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u001a$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0000\u001a\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002\u001a*\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002\u001a\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0000\u001a\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001dH\u0000\u001a\u0016\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005¨\u0006*"}, m3636d2 = {"buildGameDetailPositionRows", "", "Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;", "contractIdToPositions", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "contractIdToQuotes", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "bottomSheetSelection", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;", "comboSelection", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "contractDisplayDetails", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "showPricePayout", "", "getPositionData", "Lcom/robinhood/android/event/gamedetail/builders/PositionData;", "position", "quote", "displayDetails", "formatLeftPrimary", "Lcom/robinhood/utils/resource/StringResource;", "displayName", "", "formatLeftSecondary", "quantity", "Ljava/math/BigDecimal;", "side", "avgPrice", "contractSubtitleName", "formatRightPrimary", "openPnl", "formatRightSecondary", "costNotional", "markNotional", "buildPositionLoggingIdentifier", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "contractId", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildGameDetailPositionsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildGameDetailPositions {
    public static /* synthetic */ List buildGameDetailPositionRows$default(Map map, Map map2, BottomSheetSelection bottomSheetSelection, GameDetailSelectionState gameDetailSelectionState, Map map3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            bottomSheetSelection = null;
        }
        if ((i & 8) != 0) {
            gameDetailSelectionState = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        return buildGameDetailPositionRows(map, map2, bottomSheetSelection, gameDetailSelectionState, map3, z);
    }

    public static final List<GameDetailPositionRowState> buildGameDetailPositionRows(Map<UUID, UiEventContractPosition> map, Map<UUID, EventQuote> contractIdToQuotes, BottomSheetSelection bottomSheetSelection, GameDetailSelectionState gameDetailSelectionState, Map<ContractIdWithSide, ContractDisplayDetails> contractDisplayDetails, boolean z) {
        UUID contractId;
        Boolean boolValueOf;
        GameDetailPositionRowState gameDetailPositionRowState;
        Map<UUID, UiEventContractPosition> contractIdToPositions = map;
        Intrinsics.checkNotNullParameter(contractIdToPositions, "contractIdToPositions");
        Intrinsics.checkNotNullParameter(contractIdToQuotes, "contractIdToQuotes");
        Intrinsics.checkNotNullParameter(contractDisplayDetails, "contractDisplayDetails");
        GameDetailSelectionState.Position position = gameDetailSelectionState instanceof GameDetailSelectionState.Position ? (GameDetailSelectionState.Position) gameDetailSelectionState : null;
        if (position == null || (contractId = position.getContractId()) == null) {
            BottomSheetSelection.Position position2 = bottomSheetSelection instanceof BottomSheetSelection.Position ? (BottomSheetSelection.Position) bottomSheetSelection : null;
            contractId = position2 != null ? position2.getContractId() : null;
        }
        List listSortedWith = CollectionsKt.sortedWith(contractIdToPositions.values(), new Comparator() { // from class: com.robinhood.android.event.gamedetail.builders.BuildGameDetailPositionsKt$buildGameDetailPositionRows$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((UiEventContractPosition) t).getLatestAcquiredAt(), ((UiEventContractPosition) t2).getLatestAcquiredAt());
            }
        });
        ArrayList arrayList = new ArrayList();
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            UUID contractId2 = ((UiEventContractPosition) it.next()).getContractId();
            UiEventContractPosition uiEventContractPosition = contractIdToPositions.get(contractId2);
            if (uiEventContractPosition == null) {
                gameDetailPositionRowState = null;
            } else {
                EventQuote eventQuote = contractIdToQuotes.get(contractId2);
                ContractDisplayDetails contractDisplayDetails2 = contractDisplayDetails.get(new ContractIdWithSide(contractId2, ContractGroup5.getContractSide(uiEventContractPosition)));
                PositionData positionData = getPositionData(uiEventContractPosition, eventQuote, contractDisplayDetails2);
                BigDecimal openPnl = positionData.getOpenPnl();
                if (openPnl != null) {
                    boolValueOf = Boolean.valueOf(openPnl.signum() >= 0);
                } else {
                    boolValueOf = null;
                }
                gameDetailPositionRowState = new GameDetailPositionRowState(contractId2, formatLeftPrimary(positionData.getContractTitleName()), formatLeftSecondary(positionData.getQuantityAbs(), positionData.getSide(), positionData.getAvgTradePrice(), positionData.getContractSubtitleName()), formatRightPrimary(openPnl), z ? formatRightSecondary(positionData.getTotalCost(), positionData.getTotalPotentialValue()) : null, boolValueOf, Intrinsics.areEqual(contractId2, contractId), contractDisplayDetails2 == null, false, buildPositionLoggingIdentifier(ContractGroup5.getContractSide(uiEventContractPosition), contractId2), 256, null);
            }
            if (gameDetailPositionRowState != null) {
                arrayList.add(gameDetailPositionRowState);
            }
            contractIdToPositions = map;
        }
        return arrayList;
    }

    public static final PositionData getPositionData(UiEventContractPosition position, EventQuote eventQuote, ContractDisplayDetails contractDisplayDetails) {
        Intrinsics.checkNotNullParameter(position, "position");
        ContractSide contractSide = ContractGroup5.getContractSide(position);
        BigDecimal bigDecimalAbs = position.getQuantity().abs();
        BigDecimal bigDecimalComputeEventOpenPnl = eventQuote != null ? EventMathsUtils.computeEventOpenPnl(eventQuote.getLastTradePrice(), position) : null;
        String contractTitleName = contractDisplayDetails != null ? contractDisplayDetails.getContractTitleName() : null;
        String contractSubtitleName = contractDisplayDetails != null ? contractDisplayDetails.getContractSubtitleName() : null;
        String displayString = ContractSideExtensions.toDisplayString(contractSide);
        Intrinsics.checkNotNull(bigDecimalAbs);
        return new PositionData(displayString, bigDecimalAbs, EventMathsUtils.getRawAvgPrice(position), bigDecimalComputeEventOpenPnl, EventMathsUtils.computeTotalCost(position), EventMathsUtils.computeTotalPotentialValue(position), contractTitleName, contractSubtitleName);
    }

    private static final StringResource formatLeftPrimary(String str) {
        return StringResource.INSTANCE.invoke(C16283R.string.game_detail_position_left_primary, str);
    }

    private static final StringResource formatLeftSecondary(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2) {
        NumberFormatter currencyFormat = Formats.getCurrencyFormat();
        BigDecimal scale = bigDecimal2.setScale(2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        String str3 = currencyFormat.format(scale);
        if (str2 != null && str2.length() != 0) {
            return StringResource.INSTANCE.invoke(C16283R.string.game_detail_positions_left_secondary_alt_strike, zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).toPlainString(), str, str2, str3);
        }
        return StringResource.INSTANCE.invoke(C16283R.string.game_detail_positions_left_secondary_winner, zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).toPlainString(), str, str3);
    }

    public static final String formatRightPrimary(BigDecimal bigDecimal) {
        String str;
        return (bigDecimal == null || (str = Formats.getCurrencyDeltaFormat().format(bigDecimal)) == null) ? "" : str;
    }

    public static final StringResource formatRightSecondary(BigDecimal costNotional, BigDecimal markNotional) {
        Intrinsics.checkNotNullParameter(costNotional, "costNotional");
        Intrinsics.checkNotNullParameter(markNotional, "markNotional");
        return StringResource.INSTANCE.invoke(C16283R.string.game_detail_positions_right_secondary, Formats.getCurrencyFormat().format(costNotional), Formats.getCurrencyFormat().format(markNotional));
    }

    public static final String buildPositionLoggingIdentifier(ContractSide contractSide, UUID contractId) {
        Intrinsics.checkNotNullParameter(contractSide, "contractSide");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return "positions-row-" + contractSide.getServerValue() + "-" + contractId;
    }
}
