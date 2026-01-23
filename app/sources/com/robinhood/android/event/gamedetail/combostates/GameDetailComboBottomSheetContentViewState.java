package com.robinhood.android.event.gamedetail.combostates;

import com.robinhood.android.event.gamedetail.components.ComboPickerContractRowState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionContractDetailRowState;
import com.robinhood.android.event.gamedetail.p130ui.DeltaDirection;
import com.robinhood.android.event.gamedetail.p130ui.combo.StrikePickerState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: GameDetailComboBottomSheetContentViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "Position", "TradeSlip", "Empty", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$Empty;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$Position;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$TradeSlip;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface GameDetailComboBottomSheetContentViewState {
    StringResource getTitle();

    /* compiled from: GameDetailComboBottomSheetContentViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$Position;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "contractId", "Ljava/util/UUID;", "title", "Lcom/robinhood/utils/resource/StringResource;", "pnl", "", "pnlColor", "Lcom/robinhood/android/event/gamedetail/ui/DeltaDirection;", "rows", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionContractDetailRowState;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/android/event/gamedetail/ui/DeltaDirection;Lkotlinx/collections/immutable/PersistentList;)V", "getContractId", "()Ljava/util/UUID;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getPnl", "()Ljava/lang/String;", "getPnlColor", "()Lcom/robinhood/android/event/gamedetail/ui/DeltaDirection;", "getRows", "()Lkotlinx/collections/immutable/PersistentList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Position implements GameDetailComboBottomSheetContentViewState {
        public static final int $stable = 8;
        private final UUID contractId;
        private final String pnl;
        private final DeltaDirection pnlColor;
        private final ImmutableList3<PositionContractDetailRowState> rows;
        private final StringResource title;

        public static /* synthetic */ Position copy$default(Position position, UUID uuid, StringResource stringResource, String str, DeltaDirection deltaDirection, ImmutableList3 immutableList3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = position.contractId;
            }
            if ((i & 2) != 0) {
                stringResource = position.title;
            }
            if ((i & 4) != 0) {
                str = position.pnl;
            }
            if ((i & 8) != 0) {
                deltaDirection = position.pnlColor;
            }
            if ((i & 16) != 0) {
                immutableList3 = position.rows;
            }
            ImmutableList3 immutableList32 = immutableList3;
            String str2 = str;
            return position.copy(uuid, stringResource, str2, deltaDirection, immutableList32);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPnl() {
            return this.pnl;
        }

        /* renamed from: component4, reason: from getter */
        public final DeltaDirection getPnlColor() {
            return this.pnlColor;
        }

        public final ImmutableList3<PositionContractDetailRowState> component5() {
            return this.rows;
        }

        public final Position copy(UUID contractId, StringResource title, String pnl, DeltaDirection pnlColor, ImmutableList3<PositionContractDetailRowState> rows) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(pnlColor, "pnlColor");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Position(contractId, title, pnl, pnlColor, rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return Intrinsics.areEqual(this.contractId, position.contractId) && Intrinsics.areEqual(this.title, position.title) && Intrinsics.areEqual(this.pnl, position.pnl) && this.pnlColor == position.pnlColor && Intrinsics.areEqual(this.rows, position.rows);
        }

        public int hashCode() {
            int iHashCode = this.contractId.hashCode() * 31;
            StringResource stringResource = this.title;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            String str = this.pnl;
            return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.pnlColor.hashCode()) * 31) + this.rows.hashCode();
        }

        public String toString() {
            return "Position(contractId=" + this.contractId + ", title=" + this.title + ", pnl=" + this.pnl + ", pnlColor=" + this.pnlColor + ", rows=" + this.rows + ")";
        }

        public Position(UUID contractId, StringResource stringResource, String str, DeltaDirection pnlColor, ImmutableList3<PositionContractDetailRowState> rows) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(pnlColor, "pnlColor");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.contractId = contractId;
            this.title = stringResource;
            this.pnl = str;
            this.pnlColor = pnlColor;
            this.rows = rows;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        @Override // com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState
        public StringResource getTitle() {
            return this.title;
        }

        public final String getPnl() {
            return this.pnl;
        }

        public final DeltaDirection getPnlColor() {
            return this.pnlColor;
        }

        public final ImmutableList3<PositionContractDetailRowState> getRows() {
            return this.rows;
        }
    }

    /* compiled from: GameDetailComboBottomSheetContentViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$TradeSlip;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "rows", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/event/gamedetail/components/ComboPickerContractRowState;", "pickerState", "Lcom/robinhood/android/event/gamedetail/ui/combo/StrikePickerState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/event/gamedetail/ui/combo/StrikePickerState;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getRows", "()Lkotlinx/collections/immutable/PersistentList;", "getPickerState", "()Lcom/robinhood/android/event/gamedetail/ui/combo/StrikePickerState;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TradeSlip implements GameDetailComboBottomSheetContentViewState {
        public static final int $stable = 8;
        private final StrikePickerState pickerState;
        private final ImmutableList3<ComboPickerContractRowState> rows;
        private final StringResource title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TradeSlip copy$default(TradeSlip tradeSlip, StringResource stringResource, ImmutableList3 immutableList3, StrikePickerState strikePickerState, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = tradeSlip.title;
            }
            if ((i & 2) != 0) {
                immutableList3 = tradeSlip.rows;
            }
            if ((i & 4) != 0) {
                strikePickerState = tradeSlip.pickerState;
            }
            return tradeSlip.copy(stringResource, immutableList3, strikePickerState);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        public final ImmutableList3<ComboPickerContractRowState> component2() {
            return this.rows;
        }

        /* renamed from: component3, reason: from getter */
        public final StrikePickerState getPickerState() {
            return this.pickerState;
        }

        public final TradeSlip copy(StringResource title, ImmutableList3<ComboPickerContractRowState> rows, StrikePickerState pickerState) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new TradeSlip(title, rows, pickerState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeSlip)) {
                return false;
            }
            TradeSlip tradeSlip = (TradeSlip) other;
            return Intrinsics.areEqual(this.title, tradeSlip.title) && Intrinsics.areEqual(this.rows, tradeSlip.rows) && Intrinsics.areEqual(this.pickerState, tradeSlip.pickerState);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.rows.hashCode()) * 31;
            StrikePickerState strikePickerState = this.pickerState;
            return iHashCode + (strikePickerState == null ? 0 : strikePickerState.hashCode());
        }

        public String toString() {
            return "TradeSlip(title=" + this.title + ", rows=" + this.rows + ", pickerState=" + this.pickerState + ")";
        }

        public TradeSlip(StringResource title, ImmutableList3<ComboPickerContractRowState> rows, StrikePickerState strikePickerState) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.title = title;
            this.rows = rows;
            this.pickerState = strikePickerState;
        }

        @Override // com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState
        public StringResource getTitle() {
            return this.title;
        }

        public final ImmutableList3<ComboPickerContractRowState> getRows() {
            return this.rows;
        }

        public final StrikePickerState getPickerState() {
            return this.pickerState;
        }
    }

    /* compiled from: GameDetailComboBottomSheetContentViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$Empty;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "placeholderView", "<init>", "(Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;)V", "getPlaceholderView", "()Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements GameDetailComboBottomSheetContentViewState {
        public static final int $stable = StringResource.$stable;
        private final GameDetailComboBottomSheetContentViewState placeholderView;
        private final StringResource title;

        public static /* synthetic */ Empty copy$default(Empty empty, GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                gameDetailComboBottomSheetContentViewState = empty.placeholderView;
            }
            return empty.copy(gameDetailComboBottomSheetContentViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final GameDetailComboBottomSheetContentViewState getPlaceholderView() {
            return this.placeholderView;
        }

        public final Empty copy(GameDetailComboBottomSheetContentViewState placeholderView) {
            return new Empty(placeholderView);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && Intrinsics.areEqual(this.placeholderView, ((Empty) other).placeholderView);
        }

        public int hashCode() {
            GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState = this.placeholderView;
            if (gameDetailComboBottomSheetContentViewState == null) {
                return 0;
            }
            return gameDetailComboBottomSheetContentViewState.hashCode();
        }

        public String toString() {
            return "Empty(placeholderView=" + this.placeholderView + ")";
        }

        public Empty(GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState) {
            this.placeholderView = gameDetailComboBottomSheetContentViewState;
            this.title = gameDetailComboBottomSheetContentViewState != null ? gameDetailComboBottomSheetContentViewState.getTitle() : null;
        }

        public final GameDetailComboBottomSheetContentViewState getPlaceholderView() {
            return this.placeholderView;
        }

        @Override // com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState
        public StringResource getTitle() {
            return this.title;
        }
    }
}
