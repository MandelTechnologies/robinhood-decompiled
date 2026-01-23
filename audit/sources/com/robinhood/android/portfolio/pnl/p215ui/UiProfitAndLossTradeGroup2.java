package com.robinhood.android.portfolio.pnl.p215ui;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.MoneyDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsResponseDto;
import wormhole.service.p554v1.RealizedGainLossGroupDto;

/* compiled from: UiProfitAndLossTradeGroup.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"getTradeGroupUiModels", "", "Lcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;", "Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "toUiModel", "Lwormhole/service/v1/RealizedGainLossGroupDto;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.ui.UiProfitAndLossTradeGroupKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiProfitAndLossTradeGroup2 {
    public static final List<UiProfitAndLossTradeGroup> getTradeGroupUiModels(GetRealizedGainLossGroupsResponseDto getRealizedGainLossGroupsResponseDto) {
        Intrinsics.checkNotNullParameter(getRealizedGainLossGroupsResponseDto, "<this>");
        List<RealizedGainLossGroupDto> results = getRealizedGainLossGroupsResponseDto.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(toUiModel((RealizedGainLossGroupDto) it.next()));
        }
        return arrayList;
    }

    public static final UiProfitAndLossTradeGroup toUiModel(RealizedGainLossGroupDto realizedGainLossGroupDto) {
        Intrinsics.checkNotNullParameter(realizedGainLossGroupDto, "<this>");
        String id = realizedGainLossGroupDto.getId();
        String display_name = realizedGainLossGroupDto.getDisplay_name();
        int group_size = realizedGainLossGroupDto.getGroup_size();
        MoneyDto realized_return = realizedGainLossGroupDto.getRealized_return();
        if (realized_return == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Money dbModel = ProfitAndLossTradeItem2.toDbModel(realized_return);
        IdlDecimal realized_return_percentage = realizedGainLossGroupDto.getRealized_return_percentage();
        boolean null_out_group_pnl = realizedGainLossGroupDto.getNull_out_group_pnl();
        List<AssetClassDto> asset_classes = realizedGainLossGroupDto.getAsset_classes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_classes, 10));
        Iterator<T> it = asset_classes.iterator();
        while (it.hasNext()) {
            arrayList.add(ProfitAndLossTradeItem2.toDbModel((AssetClassDto) it.next()));
        }
        return new UiProfitAndLossTradeGroup(id, display_name, group_size, dbModel, realized_return_percentage, null_out_group_pnl, arrayList);
    }
}
