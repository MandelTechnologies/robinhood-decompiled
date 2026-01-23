package com.robinhood.android.event.gamedetail.p130ui.combo;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailComboTradeBar.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState;", "", CarResultComposable2.BUTTONS, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton;", "error", "Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState$ErrorState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState$ErrorState;)V", "getButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "getError", "()Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState$ErrorState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ErrorState", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GameDetailComboTradeBarState {
    public static final int $stable = StringResource.$stable;
    private final ImmutableList<TradeButton> buttons;
    private final ErrorState error;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameDetailComboTradeBarState copy$default(GameDetailComboTradeBarState gameDetailComboTradeBarState, ImmutableList immutableList, ErrorState errorState, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = gameDetailComboTradeBarState.buttons;
        }
        if ((i & 2) != 0) {
            errorState = gameDetailComboTradeBarState.error;
        }
        return gameDetailComboTradeBarState.copy(immutableList, errorState);
    }

    public final ImmutableList<TradeButton> component1() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorState getError() {
        return this.error;
    }

    public final GameDetailComboTradeBarState copy(ImmutableList<TradeButton> buttons, ErrorState error) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new GameDetailComboTradeBarState(buttons, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDetailComboTradeBarState)) {
            return false;
        }
        GameDetailComboTradeBarState gameDetailComboTradeBarState = (GameDetailComboTradeBarState) other;
        return Intrinsics.areEqual(this.buttons, gameDetailComboTradeBarState.buttons) && Intrinsics.areEqual(this.error, gameDetailComboTradeBarState.error);
    }

    public int hashCode() {
        int iHashCode = this.buttons.hashCode() * 31;
        ErrorState errorState = this.error;
        return iHashCode + (errorState == null ? 0 : errorState.hashCode());
    }

    public String toString() {
        return "GameDetailComboTradeBarState(buttons=" + this.buttons + ", error=" + this.error + ")";
    }

    public GameDetailComboTradeBarState(ImmutableList<TradeButton> buttons, ErrorState errorState) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.buttons = buttons;
        this.error = errorState;
    }

    public /* synthetic */ GameDetailComboTradeBarState(ImmutableList immutableList, ErrorState errorState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i & 2) != 0 ? null : errorState);
    }

    public final ImmutableList<TradeButton> getButtons() {
        return this.buttons;
    }

    public final ErrorState getError() {
        return this.error;
    }

    /* compiled from: GameDetailComboTradeBar.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState$ErrorState;", "", "message", "Lcom/robinhood/utils/resource/StringResource;", "useErrorColor", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Z)V", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "getUseErrorColor", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ErrorState {
        public static final int $stable = StringResource.$stable;
        private final StringResource message;
        private final boolean useErrorColor;

        public static /* synthetic */ ErrorState copy$default(ErrorState errorState, StringResource stringResource, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = errorState.message;
            }
            if ((i & 2) != 0) {
                z = errorState.useErrorColor;
            }
            return errorState.copy(stringResource, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseErrorColor() {
            return this.useErrorColor;
        }

        public final ErrorState copy(StringResource message, boolean useErrorColor) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorState(message, useErrorColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorState)) {
                return false;
            }
            ErrorState errorState = (ErrorState) other;
            return Intrinsics.areEqual(this.message, errorState.message) && this.useErrorColor == errorState.useErrorColor;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + Boolean.hashCode(this.useErrorColor);
        }

        public String toString() {
            return "ErrorState(message=" + this.message + ", useErrorColor=" + this.useErrorColor + ")";
        }

        public ErrorState(StringResource message, boolean z) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.useErrorColor = z;
        }

        public final StringResource getMessage() {
            return this.message;
        }

        public final boolean getUseErrorColor() {
            return this.useErrorColor;
        }
    }
}
