package com.robinhood.shared.tradeladder.p398ui.ladder;

import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderUserInteractionData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: BaseLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderViewState;", "", "ladderState", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;", "getLadderState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;", "userInteractionData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;", "getUserInteractionData", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;", "zoomOverlayData", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Ljava/math/BigDecimal;", "getZoomOverlayData", "()Lkotlinx/collections/immutable/ImmutableMap;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.ILadderViewState, reason: use source file name */
/* loaded from: classes12.dex */
public interface BaseLadderDuxo5 {
    LadderState getLadderState();

    LadderUserInteractionData getUserInteractionData();

    ImmutableMap<Integer, BigDecimal> getZoomOverlayData();
}
