package com.robinhood.android.event.detail.contractselector.multicontractselector;

import java.util.UUID;
import kotlin.Metadata;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: EventMultiContractSelectorFullScreenContent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorFullScreenCallbacks;", "", "onTrade", "", "contractId", "Ljava/util/UUID;", "side", "Lrosetta/mainst/SideDto;", "positionEffect", "Lrosetta/mainst/PositionEffectDto;", "onTradeOverlayDialogDismiss", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenCallbacks, reason: use source file name */
/* loaded from: classes3.dex */
public interface EventMultiContractSelectorFullScreenContent {
    void onTrade(UUID contractId, SideDto side, PositionEffectDto positionEffect);

    void onTradeOverlayDialogDismiss();
}
