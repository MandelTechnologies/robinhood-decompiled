package com.robinhood.android.event.detail.multi;

import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: EventDetailMultiTradeBar.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState;", "", "leftButtonState", "Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState$ButtonState;", "rightButtonState", "<init>", "(Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState$ButtonState;Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState$ButtonState;)V", "getLeftButtonState", "()Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState$ButtonState;", "getRightButtonState", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ButtonState", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MultiTradeBarUiState {
    public static final int $stable = 0;
    private final ButtonState leftButtonState;
    private final ButtonState rightButtonState;

    public static /* synthetic */ MultiTradeBarUiState copy$default(MultiTradeBarUiState multiTradeBarUiState, ButtonState buttonState, ButtonState buttonState2, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonState = multiTradeBarUiState.leftButtonState;
        }
        if ((i & 2) != 0) {
            buttonState2 = multiTradeBarUiState.rightButtonState;
        }
        return multiTradeBarUiState.copy(buttonState, buttonState2);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonState getLeftButtonState() {
        return this.leftButtonState;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonState getRightButtonState() {
        return this.rightButtonState;
    }

    public final MultiTradeBarUiState copy(ButtonState leftButtonState, ButtonState rightButtonState) {
        Intrinsics.checkNotNullParameter(leftButtonState, "leftButtonState");
        Intrinsics.checkNotNullParameter(rightButtonState, "rightButtonState");
        return new MultiTradeBarUiState(leftButtonState, rightButtonState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiTradeBarUiState)) {
            return false;
        }
        MultiTradeBarUiState multiTradeBarUiState = (MultiTradeBarUiState) other;
        return Intrinsics.areEqual(this.leftButtonState, multiTradeBarUiState.leftButtonState) && Intrinsics.areEqual(this.rightButtonState, multiTradeBarUiState.rightButtonState);
    }

    public int hashCode() {
        return (this.leftButtonState.hashCode() * 31) + this.rightButtonState.hashCode();
    }

    public String toString() {
        return "MultiTradeBarUiState(leftButtonState=" + this.leftButtonState + ", rightButtonState=" + this.rightButtonState + ")";
    }

    public MultiTradeBarUiState(ButtonState leftButtonState, ButtonState rightButtonState) {
        Intrinsics.checkNotNullParameter(leftButtonState, "leftButtonState");
        Intrinsics.checkNotNullParameter(rightButtonState, "rightButtonState");
        this.leftButtonState = leftButtonState;
        this.rightButtonState = rightButtonState;
    }

    public final ButtonState getLeftButtonState() {
        return this.leftButtonState;
    }

    public final ButtonState getRightButtonState() {
        return this.rightButtonState;
    }

    /* compiled from: EventDetailMultiTradeBar.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState$ButtonState;", "", "contractId", "Ljava/util/UUID;", "displayText", "Lcom/robinhood/utils/resource/StringResource;", "side", "Lrosetta/mainst/SideDto;", "positionEffect", "Lrosetta/mainst/PositionEffectDto;", "enabled", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lrosetta/mainst/SideDto;Lrosetta/mainst/PositionEffectDto;Z)V", "getContractId", "()Ljava/util/UUID;", "getDisplayText", "()Lcom/robinhood/utils/resource/StringResource;", "getSide", "()Lrosetta/mainst/SideDto;", "getPositionEffect", "()Lrosetta/mainst/PositionEffectDto;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ButtonState {
        public static final int $stable = 0;
        private final UUID contractId;
        private final StringResource displayText;
        private final boolean enabled;
        private final PositionEffectDto positionEffect;
        private final SideDto side;

        public static /* synthetic */ ButtonState copy$default(ButtonState buttonState, UUID uuid, StringResource stringResource, SideDto sideDto, PositionEffectDto positionEffectDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = buttonState.contractId;
            }
            if ((i & 2) != 0) {
                stringResource = buttonState.displayText;
            }
            if ((i & 4) != 0) {
                sideDto = buttonState.side;
            }
            if ((i & 8) != 0) {
                positionEffectDto = buttonState.positionEffect;
            }
            if ((i & 16) != 0) {
                z = buttonState.enabled;
            }
            boolean z2 = z;
            SideDto sideDto2 = sideDto;
            return buttonState.copy(uuid, stringResource, sideDto2, positionEffectDto, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getDisplayText() {
            return this.displayText;
        }

        /* renamed from: component3, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component4, reason: from getter */
        public final PositionEffectDto getPositionEffect() {
            return this.positionEffect;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final ButtonState copy(UUID contractId, StringResource displayText, SideDto side, PositionEffectDto positionEffect, boolean enabled) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(displayText, "displayText");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            return new ButtonState(contractId, displayText, side, positionEffect, enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) other;
            return Intrinsics.areEqual(this.contractId, buttonState.contractId) && Intrinsics.areEqual(this.displayText, buttonState.displayText) && this.side == buttonState.side && this.positionEffect == buttonState.positionEffect && this.enabled == buttonState.enabled;
        }

        public int hashCode() {
            return (((((((this.contractId.hashCode() * 31) + this.displayText.hashCode()) * 31) + this.side.hashCode()) * 31) + this.positionEffect.hashCode()) * 31) + Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "ButtonState(contractId=" + this.contractId + ", displayText=" + this.displayText + ", side=" + this.side + ", positionEffect=" + this.positionEffect + ", enabled=" + this.enabled + ")";
        }

        public ButtonState(UUID contractId, StringResource displayText, SideDto side, PositionEffectDto positionEffect, boolean z) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(displayText, "displayText");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            this.contractId = contractId;
            this.displayText = displayText;
            this.side = side;
            this.positionEffect = positionEffect;
            this.enabled = z;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final StringResource getDisplayText() {
            return this.displayText;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final PositionEffectDto getPositionEffect() {
            return this.positionEffect;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }
}
