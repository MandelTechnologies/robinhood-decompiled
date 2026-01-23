package com.robinhood.android.event.gamedetail.components.bottomsheet;

import com.robinhood.android.event.gamedetail.components.ComboPickerContractRowState;
import com.robinhood.android.event.gamedetail.components.WheelPickerState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailTradeBottomSheet.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailTradeBottomSheetState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "comboPickerContractRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/components/ComboPickerContractRowState;", "isShowingWheelPicker", "", "wheelPicker", "Lcom/robinhood/android/event/gamedetail/components/WheelPickerState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/event/gamedetail/components/WheelPickerState;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getComboPickerContractRows", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getWheelPicker", "()Lcom/robinhood/android/event/gamedetail/components/WheelPickerState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GameDetailTradeBottomSheetState {
    public static final int $stable = StringResource.$stable;
    private final ImmutableList<ComboPickerContractRowState> comboPickerContractRows;
    private final boolean isShowingWheelPicker;
    private final StringResource title;
    private final WheelPickerState wheelPicker;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameDetailTradeBottomSheetState copy$default(GameDetailTradeBottomSheetState gameDetailTradeBottomSheetState, StringResource stringResource, ImmutableList immutableList, boolean z, WheelPickerState wheelPickerState, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = gameDetailTradeBottomSheetState.title;
        }
        if ((i & 2) != 0) {
            immutableList = gameDetailTradeBottomSheetState.comboPickerContractRows;
        }
        if ((i & 4) != 0) {
            z = gameDetailTradeBottomSheetState.isShowingWheelPicker;
        }
        if ((i & 8) != 0) {
            wheelPickerState = gameDetailTradeBottomSheetState.wheelPicker;
        }
        return gameDetailTradeBottomSheetState.copy(stringResource, immutableList, z, wheelPickerState);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableList<ComboPickerContractRowState> component2() {
        return this.comboPickerContractRows;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsShowingWheelPicker() {
        return this.isShowingWheelPicker;
    }

    /* renamed from: component4, reason: from getter */
    public final WheelPickerState getWheelPicker() {
        return this.wheelPicker;
    }

    public final GameDetailTradeBottomSheetState copy(StringResource title, ImmutableList<ComboPickerContractRowState> comboPickerContractRows, boolean isShowingWheelPicker, WheelPickerState wheelPicker) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(comboPickerContractRows, "comboPickerContractRows");
        return new GameDetailTradeBottomSheetState(title, comboPickerContractRows, isShowingWheelPicker, wheelPicker);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDetailTradeBottomSheetState)) {
            return false;
        }
        GameDetailTradeBottomSheetState gameDetailTradeBottomSheetState = (GameDetailTradeBottomSheetState) other;
        return Intrinsics.areEqual(this.title, gameDetailTradeBottomSheetState.title) && Intrinsics.areEqual(this.comboPickerContractRows, gameDetailTradeBottomSheetState.comboPickerContractRows) && this.isShowingWheelPicker == gameDetailTradeBottomSheetState.isShowingWheelPicker && Intrinsics.areEqual(this.wheelPicker, gameDetailTradeBottomSheetState.wheelPicker);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.comboPickerContractRows.hashCode()) * 31) + Boolean.hashCode(this.isShowingWheelPicker)) * 31;
        WheelPickerState wheelPickerState = this.wheelPicker;
        return iHashCode + (wheelPickerState == null ? 0 : wheelPickerState.hashCode());
    }

    public String toString() {
        return "GameDetailTradeBottomSheetState(title=" + this.title + ", comboPickerContractRows=" + this.comboPickerContractRows + ", isShowingWheelPicker=" + this.isShowingWheelPicker + ", wheelPicker=" + this.wheelPicker + ")";
    }

    public GameDetailTradeBottomSheetState(StringResource title, ImmutableList<ComboPickerContractRowState> comboPickerContractRows, boolean z, WheelPickerState wheelPickerState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(comboPickerContractRows, "comboPickerContractRows");
        this.title = title;
        this.comboPickerContractRows = comboPickerContractRows;
        this.isShowingWheelPicker = z;
        this.wheelPicker = wheelPickerState;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableList<ComboPickerContractRowState> getComboPickerContractRows() {
        return this.comboPickerContractRows;
    }

    public final boolean isShowingWheelPicker() {
        return this.isShowingWheelPicker;
    }

    public final WheelPickerState getWheelPicker() {
        return this.wheelPicker;
    }
}
