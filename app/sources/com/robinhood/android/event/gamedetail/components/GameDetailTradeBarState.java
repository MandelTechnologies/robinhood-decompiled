package com.robinhood.android.event.gamedetail.components;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailTradeBar.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;", "", "showDisabledDescription", "", "isWheelPickerVisible", CarResultComposable2.BUTTONS, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton;", "<init>", "(ZZLkotlinx/collections/immutable/ImmutableList;)V", "getShowDisabledDescription", "()Z", "getButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GameDetailTradeBarState {
    public static final int $stable = StringResource.$stable;
    private final ImmutableList<TradeButton> buttons;
    private final boolean isWheelPickerVisible;
    private final boolean showDisabledDescription;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameDetailTradeBarState copy$default(GameDetailTradeBarState gameDetailTradeBarState, boolean z, boolean z2, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = gameDetailTradeBarState.showDisabledDescription;
        }
        if ((i & 2) != 0) {
            z2 = gameDetailTradeBarState.isWheelPickerVisible;
        }
        if ((i & 4) != 0) {
            immutableList = gameDetailTradeBarState.buttons;
        }
        return gameDetailTradeBarState.copy(z, z2, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowDisabledDescription() {
        return this.showDisabledDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsWheelPickerVisible() {
        return this.isWheelPickerVisible;
    }

    public final ImmutableList<TradeButton> component3() {
        return this.buttons;
    }

    public final GameDetailTradeBarState copy(boolean showDisabledDescription, boolean isWheelPickerVisible, ImmutableList<TradeButton> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new GameDetailTradeBarState(showDisabledDescription, isWheelPickerVisible, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDetailTradeBarState)) {
            return false;
        }
        GameDetailTradeBarState gameDetailTradeBarState = (GameDetailTradeBarState) other;
        return this.showDisabledDescription == gameDetailTradeBarState.showDisabledDescription && this.isWheelPickerVisible == gameDetailTradeBarState.isWheelPickerVisible && Intrinsics.areEqual(this.buttons, gameDetailTradeBarState.buttons);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.showDisabledDescription) * 31) + Boolean.hashCode(this.isWheelPickerVisible)) * 31) + this.buttons.hashCode();
    }

    public String toString() {
        return "GameDetailTradeBarState(showDisabledDescription=" + this.showDisabledDescription + ", isWheelPickerVisible=" + this.isWheelPickerVisible + ", buttons=" + this.buttons + ")";
    }

    public GameDetailTradeBarState(boolean z, boolean z2, ImmutableList<TradeButton> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.showDisabledDescription = z;
        this.isWheelPickerVisible = z2;
        this.buttons = buttons;
    }

    public final boolean getShowDisabledDescription() {
        return this.showDisabledDescription;
    }

    public final boolean isWheelPickerVisible() {
        return this.isWheelPickerVisible;
    }

    public final ImmutableList<TradeButton> getButtons() {
        return this.buttons;
    }
}
