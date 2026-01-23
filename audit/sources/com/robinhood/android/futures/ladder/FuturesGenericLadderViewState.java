package com.robinhood.android.futures.ladder;

import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderUserInteractionData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: FuturesGenericLadderViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/futures/ladder/FuturesGenericLadderViewState;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderViewState;", "ladderState", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;", "zoomOverlayData", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;Lkotlinx/collections/immutable/ImmutableMap;)V", "getLadderState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;", "getZoomOverlayData", "()Lkotlinx/collections/immutable/ImmutableMap;", "userInteractionData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;", "getUserInteractionData", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-futures-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesGenericLadderViewState implements BaseLadderDuxo5 {
    public static final int $stable = 8;
    private final LadderState ladderState;
    private final ImmutableMap<Integer, BigDecimal> zoomOverlayData;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesGenericLadderViewState copy$default(FuturesGenericLadderViewState futuresGenericLadderViewState, LadderState ladderState, ImmutableMap immutableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            ladderState = futuresGenericLadderViewState.ladderState;
        }
        if ((i & 2) != 0) {
            immutableMap = futuresGenericLadderViewState.zoomOverlayData;
        }
        return futuresGenericLadderViewState.copy(ladderState, immutableMap);
    }

    /* renamed from: component1, reason: from getter */
    public final LadderState getLadderState() {
        return this.ladderState;
    }

    public final ImmutableMap<Integer, BigDecimal> component2() {
        return this.zoomOverlayData;
    }

    public final FuturesGenericLadderViewState copy(LadderState ladderState, ImmutableMap<Integer, ? extends BigDecimal> zoomOverlayData) {
        Intrinsics.checkNotNullParameter(ladderState, "ladderState");
        return new FuturesGenericLadderViewState(ladderState, zoomOverlayData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesGenericLadderViewState)) {
            return false;
        }
        FuturesGenericLadderViewState futuresGenericLadderViewState = (FuturesGenericLadderViewState) other;
        return Intrinsics.areEqual(this.ladderState, futuresGenericLadderViewState.ladderState) && Intrinsics.areEqual(this.zoomOverlayData, futuresGenericLadderViewState.zoomOverlayData);
    }

    public int hashCode() {
        int iHashCode = this.ladderState.hashCode() * 31;
        ImmutableMap<Integer, BigDecimal> immutableMap = this.zoomOverlayData;
        return iHashCode + (immutableMap == null ? 0 : immutableMap.hashCode());
    }

    public String toString() {
        return "FuturesGenericLadderViewState(ladderState=" + this.ladderState + ", zoomOverlayData=" + this.zoomOverlayData + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesGenericLadderViewState(LadderState ladderState, ImmutableMap<Integer, ? extends BigDecimal> immutableMap) {
        Intrinsics.checkNotNullParameter(ladderState, "ladderState");
        this.ladderState = ladderState;
        this.zoomOverlayData = immutableMap;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5
    public LadderState getLadderState() {
        return this.ladderState;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5
    public ImmutableMap<Integer, BigDecimal> getZoomOverlayData() {
        return this.zoomOverlayData;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5
    public LadderUserInteractionData getUserInteractionData() {
        return new LadderUserInteractionData() { // from class: com.robinhood.android.futures.ladder.FuturesGenericLadderViewState$userInteractionData$1
        };
    }
}
