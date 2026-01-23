package com.robinhood.android.equitydetail.p123ui.position;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import kotlin.Metadata;
import kotlin.contracts.ContractBuilder3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PositionSectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0017J\"\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J#\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0003\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0001¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/position/PositionSectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionViewState;", "<init>", "()V", "reduce", "dataState", "showAverageCostTooltipForAccountType", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "shouldShowRetirementTooltip", "pnlRetirementEnabled", "isValidPosition", "position", "Lcom/robinhood/models/db/Position;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class PositionSectionStateProvider implements StateProvider<PositionSectionDataState, PositionSectionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    @ContractBuilder3
    public PositionSectionViewState reduce(PositionSectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UnifiedAccountV2 unifiedAccountV2 = dataState.getUnifiedAccountV2();
        UnifiedAccountV2 unifiedAccountV22 = dataState.getUnifiedAccountV2();
        ImmutableList immutableList = null;
        boolean zShowAverageCostTooltipForAccountType = showAverageCostTooltipForAccountType(unifiedAccountV22 != null ? unifiedAccountV22.getBrokerageAccountType() : null, dataState.getShowAverageCostRetirementTooltip(), dataState.getProfitAndLossRetirementExperimentEnabled());
        if (isValidPosition(dataState.getPosition()) && dataState.getInstrument() != null) {
            immutableList = extensions2.toImmutableList(new PositionSectionData(dataState.getInstrument(), dataState.getPosition(), dataState.getQuote(), dataState.getUnifiedAccountV2(), dataState.getUnrealizedProfitAndLossData(), dataState.getProfitAndLossRetirementExperimentEnabled(), dataState.getSubzeroExperimentEnabled()).buildDataRows());
        }
        return new PositionSectionViewState(unifiedAccountV2, immutableList, Boolean.valueOf(zShowAverageCostTooltipForAccountType), dataState.getInstrumentId(), dataState.getInstrument(), dataState.getAccountNumber());
    }

    private final boolean showAverageCostTooltipForAccountType(BrokerageAccountType accountType, boolean shouldShowRetirementTooltip, boolean pnlRetirementEnabled) {
        return accountType != null && accountType.isRetirement() && pnlRetirementEnabled && shouldShowRetirementTooltip;
    }

    @ContractBuilder3
    private final boolean isValidPosition(Position position) {
        return position != null && Position5.getHasPosition(position);
    }
}
