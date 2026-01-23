package com.robinhood.android.equityadvancedorder;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderNumpadState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState;", "", "buttonText", "Lcom/robinhood/utils/resource/StringResource;", "state", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState$ButtonState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState$ButtonState;)V", "getButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "getState", "()Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState$ButtonState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ButtonState", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityAdvancedOrderNumpadButtonState {
    public static final int $stable = StringResource.$stable;
    private final StringResource buttonText;
    private final ButtonState state;

    public static /* synthetic */ EquityAdvancedOrderNumpadButtonState copy$default(EquityAdvancedOrderNumpadButtonState equityAdvancedOrderNumpadButtonState, StringResource stringResource, ButtonState buttonState, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = equityAdvancedOrderNumpadButtonState.buttonText;
        }
        if ((i & 2) != 0) {
            buttonState = equityAdvancedOrderNumpadButtonState.state;
        }
        return equityAdvancedOrderNumpadButtonState.copy(stringResource, buttonState);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonState getState() {
        return this.state;
    }

    public final EquityAdvancedOrderNumpadButtonState copy(StringResource buttonText, ButtonState state) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(state, "state");
        return new EquityAdvancedOrderNumpadButtonState(buttonText, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityAdvancedOrderNumpadButtonState)) {
            return false;
        }
        EquityAdvancedOrderNumpadButtonState equityAdvancedOrderNumpadButtonState = (EquityAdvancedOrderNumpadButtonState) other;
        return Intrinsics.areEqual(this.buttonText, equityAdvancedOrderNumpadButtonState.buttonText) && this.state == equityAdvancedOrderNumpadButtonState.state;
    }

    public int hashCode() {
        return (this.buttonText.hashCode() * 31) + this.state.hashCode();
    }

    public String toString() {
        return "EquityAdvancedOrderNumpadButtonState(buttonText=" + this.buttonText + ", state=" + this.state + ")";
    }

    public EquityAdvancedOrderNumpadButtonState(StringResource buttonText, ButtonState state) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(state, "state");
        this.buttonText = buttonText;
        this.state = state;
    }

    public final StringResource getButtonText() {
        return this.buttonText;
    }

    public final ButtonState getState() {
        return this.state;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityAdvancedOrderNumpadState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState$ButtonState;", "", "loading", "", "enabled", "visible", "<init>", "(Ljava/lang/String;IZZZ)V", "getLoading", "()Z", "getEnabled", "getVisible", "DEFAULT", "LOADING", "DISABLED", "GONE", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ButtonState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonState[] $VALUES;
        private final boolean enabled;
        private final boolean loading;
        private final boolean visible;
        public static final ButtonState DEFAULT = new ButtonState("DEFAULT", 0, false, true, true);
        public static final ButtonState LOADING = new ButtonState("LOADING", 1, true, true, true);
        public static final ButtonState DISABLED = new ButtonState("DISABLED", 2, false, false, true);
        public static final ButtonState GONE = new ButtonState("GONE", 3, false, false, false);

        private static final /* synthetic */ ButtonState[] $values() {
            return new ButtonState[]{DEFAULT, LOADING, DISABLED, GONE};
        }

        public static EnumEntries<ButtonState> getEntries() {
            return $ENTRIES;
        }

        private ButtonState(String str, int i, boolean z, boolean z2, boolean z3) {
            this.loading = z;
            this.enabled = z2;
            this.visible = z3;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final boolean getVisible() {
            return this.visible;
        }

        static {
            ButtonState[] buttonStateArr$values = $values();
            $VALUES = buttonStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonStateArr$values);
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) $VALUES.clone();
        }
    }
}
