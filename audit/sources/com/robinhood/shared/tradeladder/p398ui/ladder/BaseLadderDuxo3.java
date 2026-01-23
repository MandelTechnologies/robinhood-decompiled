package com.robinhood.shared.tradeladder.p398ui.ladder;

import com.robinhood.shared.tradeladder.p398ui.LadderInteraction;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderUserInteractionData;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BaseLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderDuxo;", "", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderViewState;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "onUserInteraction", "", "ladderInteraction", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "userInteractionData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.ILadderDuxo, reason: use source file name */
/* loaded from: classes12.dex */
public interface BaseLadderDuxo3 {
    StateFlow<BaseLadderDuxo5> getStateFlow();

    void onUserInteraction(LadderInteraction ladderInteraction, LadderUserInteractionData userInteractionData);
}
