package com.robinhood.android.event.gamedetail.components.bottomsheet;

import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionDetailBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionDetailBottomSheetState;", "", "gameDetailPositionRowState", "Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;", "contractDetailRowState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionContractDetailRowState;", "<init>", "(Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionContractDetailRowState;)V", "getGameDetailPositionRowState", "()Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;", "getContractDetailRowState", "()Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionContractDetailRowState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PositionDetailBottomSheetState {
    public static final int $stable = 0;
    private final PositionContractDetailRowState contractDetailRowState;
    private final GameDetailPositionRowState gameDetailPositionRowState;

    public static /* synthetic */ PositionDetailBottomSheetState copy$default(PositionDetailBottomSheetState positionDetailBottomSheetState, GameDetailPositionRowState gameDetailPositionRowState, PositionContractDetailRowState positionContractDetailRowState, int i, Object obj) {
        if ((i & 1) != 0) {
            gameDetailPositionRowState = positionDetailBottomSheetState.gameDetailPositionRowState;
        }
        if ((i & 2) != 0) {
            positionContractDetailRowState = positionDetailBottomSheetState.contractDetailRowState;
        }
        return positionDetailBottomSheetState.copy(gameDetailPositionRowState, positionContractDetailRowState);
    }

    /* renamed from: component1, reason: from getter */
    public final GameDetailPositionRowState getGameDetailPositionRowState() {
        return this.gameDetailPositionRowState;
    }

    /* renamed from: component2, reason: from getter */
    public final PositionContractDetailRowState getContractDetailRowState() {
        return this.contractDetailRowState;
    }

    public final PositionDetailBottomSheetState copy(GameDetailPositionRowState gameDetailPositionRowState, PositionContractDetailRowState contractDetailRowState) {
        Intrinsics.checkNotNullParameter(gameDetailPositionRowState, "gameDetailPositionRowState");
        Intrinsics.checkNotNullParameter(contractDetailRowState, "contractDetailRowState");
        return new PositionDetailBottomSheetState(gameDetailPositionRowState, contractDetailRowState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionDetailBottomSheetState)) {
            return false;
        }
        PositionDetailBottomSheetState positionDetailBottomSheetState = (PositionDetailBottomSheetState) other;
        return Intrinsics.areEqual(this.gameDetailPositionRowState, positionDetailBottomSheetState.gameDetailPositionRowState) && Intrinsics.areEqual(this.contractDetailRowState, positionDetailBottomSheetState.contractDetailRowState);
    }

    public int hashCode() {
        return (this.gameDetailPositionRowState.hashCode() * 31) + this.contractDetailRowState.hashCode();
    }

    public String toString() {
        return "PositionDetailBottomSheetState(gameDetailPositionRowState=" + this.gameDetailPositionRowState + ", contractDetailRowState=" + this.contractDetailRowState + ")";
    }

    public PositionDetailBottomSheetState(GameDetailPositionRowState gameDetailPositionRowState, PositionContractDetailRowState contractDetailRowState) {
        Intrinsics.checkNotNullParameter(gameDetailPositionRowState, "gameDetailPositionRowState");
        Intrinsics.checkNotNullParameter(contractDetailRowState, "contractDetailRowState");
        this.gameDetailPositionRowState = gameDetailPositionRowState;
        this.contractDetailRowState = contractDetailRowState;
    }

    public final GameDetailPositionRowState getGameDetailPositionRowState() {
        return this.gameDetailPositionRowState;
    }

    public final PositionContractDetailRowState getContractDetailRowState() {
        return this.contractDetailRowState;
    }
}
