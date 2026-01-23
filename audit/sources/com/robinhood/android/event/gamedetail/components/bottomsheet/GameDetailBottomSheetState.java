package com.robinhood.android.event.gamedetail.components.bottomsheet;

import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailBottomSheetState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "", DxFeedData.TYPE_TRADE, "PositionDetail", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState$PositionDetail;", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState$Trade;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface GameDetailBottomSheetState {

    /* compiled from: GameDetailBottomSheetState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState$Trade;", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "state", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailTradeBottomSheetState;", "<init>", "(Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailTradeBottomSheetState;)V", "getState", "()Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailTradeBottomSheetState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Trade implements GameDetailBottomSheetState {
        public static final int $stable = StringResource.$stable;
        private final GameDetailTradeBottomSheetState state;

        public static /* synthetic */ Trade copy$default(Trade trade, GameDetailTradeBottomSheetState gameDetailTradeBottomSheetState, int i, Object obj) {
            if ((i & 1) != 0) {
                gameDetailTradeBottomSheetState = trade.state;
            }
            return trade.copy(gameDetailTradeBottomSheetState);
        }

        /* renamed from: component1, reason: from getter */
        public final GameDetailTradeBottomSheetState getState() {
            return this.state;
        }

        public final Trade copy(GameDetailTradeBottomSheetState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Trade(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Trade) && Intrinsics.areEqual(this.state, ((Trade) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Trade(state=" + this.state + ")";
        }

        public Trade(GameDetailTradeBottomSheetState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final GameDetailTradeBottomSheetState getState() {
            return this.state;
        }
    }

    /* compiled from: GameDetailBottomSheetState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState$PositionDetail;", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "state", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionDetailBottomSheetState;", "<init>", "(Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionDetailBottomSheetState;)V", "getState", "()Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionDetailBottomSheetState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PositionDetail implements GameDetailBottomSheetState {
        public static final int $stable = 0;
        private final PositionDetailBottomSheetState state;

        public static /* synthetic */ PositionDetail copy$default(PositionDetail positionDetail, PositionDetailBottomSheetState positionDetailBottomSheetState, int i, Object obj) {
            if ((i & 1) != 0) {
                positionDetailBottomSheetState = positionDetail.state;
            }
            return positionDetail.copy(positionDetailBottomSheetState);
        }

        /* renamed from: component1, reason: from getter */
        public final PositionDetailBottomSheetState getState() {
            return this.state;
        }

        public final PositionDetail copy(PositionDetailBottomSheetState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new PositionDetail(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PositionDetail) && Intrinsics.areEqual(this.state, ((PositionDetail) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "PositionDetail(state=" + this.state + ")";
        }

        public PositionDetail(PositionDetailBottomSheetState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final PositionDetailBottomSheetState getState() {
            return this.state;
        }
    }
}
