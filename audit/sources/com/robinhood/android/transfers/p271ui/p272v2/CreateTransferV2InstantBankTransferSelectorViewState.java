package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2InstantBankTransferSelectorViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState;", "", "leftOption", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option;", "rightOption", "<init>", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option;Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option;)V", "getLeftOption", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option;", "getRightOption", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Option", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateTransferV2InstantBankTransferSelectorViewState {
    public static final int $stable;
    private final Option leftOption;
    private final Option rightOption;

    static {
        int i = StringResource.$stable;
        int i2 = BentoIcon4.$stable;
        $stable = i | i | i2 | i | i2;
    }

    public static /* synthetic */ CreateTransferV2InstantBankTransferSelectorViewState copy$default(CreateTransferV2InstantBankTransferSelectorViewState createTransferV2InstantBankTransferSelectorViewState, Option option, Option option2, int i, Object obj) {
        if ((i & 1) != 0) {
            option = createTransferV2InstantBankTransferSelectorViewState.leftOption;
        }
        if ((i & 2) != 0) {
            option2 = createTransferV2InstantBankTransferSelectorViewState.rightOption;
        }
        return createTransferV2InstantBankTransferSelectorViewState.copy(option, option2);
    }

    /* renamed from: component1, reason: from getter */
    public final Option getLeftOption() {
        return this.leftOption;
    }

    /* renamed from: component2, reason: from getter */
    public final Option getRightOption() {
        return this.rightOption;
    }

    public final CreateTransferV2InstantBankTransferSelectorViewState copy(Option leftOption, Option rightOption) {
        Intrinsics.checkNotNullParameter(leftOption, "leftOption");
        Intrinsics.checkNotNullParameter(rightOption, "rightOption");
        return new CreateTransferV2InstantBankTransferSelectorViewState(leftOption, rightOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferV2InstantBankTransferSelectorViewState)) {
            return false;
        }
        CreateTransferV2InstantBankTransferSelectorViewState createTransferV2InstantBankTransferSelectorViewState = (CreateTransferV2InstantBankTransferSelectorViewState) other;
        return Intrinsics.areEqual(this.leftOption, createTransferV2InstantBankTransferSelectorViewState.leftOption) && Intrinsics.areEqual(this.rightOption, createTransferV2InstantBankTransferSelectorViewState.rightOption);
    }

    public int hashCode() {
        return (this.leftOption.hashCode() * 31) + this.rightOption.hashCode();
    }

    public String toString() {
        return "CreateTransferV2InstantBankTransferSelectorViewState(leftOption=" + this.leftOption + ", rightOption=" + this.rightOption + ")";
    }

    public CreateTransferV2InstantBankTransferSelectorViewState(Option leftOption, Option rightOption) {
        Intrinsics.checkNotNullParameter(leftOption, "leftOption");
        Intrinsics.checkNotNullParameter(rightOption, "rightOption");
        this.leftOption = leftOption;
        this.rightOption = rightOption;
    }

    public final Option getLeftOption() {
        return this.leftOption;
    }

    public final Option getRightOption() {
        return this.rightOption;
    }

    /* compiled from: CreateTransferV2InstantBankTransferSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JQ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option;", "", "primaryTextEnabledColor", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "primaryTextIcon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "isCheckmarkVisible", "", "achTransferOption", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "state", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option$State;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Color;Lcom/robinhood/compose/bento/component/BentoIcons;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/lib/transfers/AchTransferOption;Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option$State;)V", "getPrimaryTextEnabledColor", "()Lcom/robinhood/models/serverdriven/experimental/api/Color;", "getPrimaryTextIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "()Z", "getAchTransferOption", "()Lcom/robinhood/android/lib/transfers/AchTransferOption;", "getState", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option$State;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "State", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Option {
        public static final int $stable = StringResource.$stable | BentoIcon4.$stable;
        private final AchTransferOption achTransferOption;
        private final boolean isCheckmarkVisible;
        private final StringResource primaryText;
        private final Color primaryTextEnabledColor;
        private final BentoIcon4 primaryTextIcon;
        private final StringResource secondaryText;
        private final State state;

        public static /* synthetic */ Option copy$default(Option option, Color color, BentoIcon4 bentoIcon4, StringResource stringResource, StringResource stringResource2, boolean z, AchTransferOption achTransferOption, State state, int i, Object obj) {
            if ((i & 1) != 0) {
                color = option.primaryTextEnabledColor;
            }
            if ((i & 2) != 0) {
                bentoIcon4 = option.primaryTextIcon;
            }
            if ((i & 4) != 0) {
                stringResource = option.primaryText;
            }
            if ((i & 8) != 0) {
                stringResource2 = option.secondaryText;
            }
            if ((i & 16) != 0) {
                z = option.isCheckmarkVisible;
            }
            if ((i & 32) != 0) {
                achTransferOption = option.achTransferOption;
            }
            if ((i & 64) != 0) {
                state = option.state;
            }
            AchTransferOption achTransferOption2 = achTransferOption;
            State state2 = state;
            boolean z2 = z;
            StringResource stringResource3 = stringResource;
            return option.copy(color, bentoIcon4, stringResource3, stringResource2, z2, achTransferOption2, state2);
        }

        /* renamed from: component1, reason: from getter */
        public final Color getPrimaryTextEnabledColor() {
            return this.primaryTextEnabledColor;
        }

        /* renamed from: component2, reason: from getter */
        public final BentoIcon4 getPrimaryTextIcon() {
            return this.primaryTextIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsCheckmarkVisible() {
            return this.isCheckmarkVisible;
        }

        /* renamed from: component6, reason: from getter */
        public final AchTransferOption getAchTransferOption() {
            return this.achTransferOption;
        }

        /* renamed from: component7, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final Option copy(Color primaryTextEnabledColor, BentoIcon4 primaryTextIcon, StringResource primaryText, StringResource secondaryText, boolean isCheckmarkVisible, AchTransferOption achTransferOption, State state) {
            Intrinsics.checkNotNullParameter(primaryTextEnabledColor, "primaryTextEnabledColor");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(achTransferOption, "achTransferOption");
            Intrinsics.checkNotNullParameter(state, "state");
            return new Option(primaryTextEnabledColor, primaryTextIcon, primaryText, secondaryText, isCheckmarkVisible, achTransferOption, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return this.primaryTextEnabledColor == option.primaryTextEnabledColor && Intrinsics.areEqual(this.primaryTextIcon, option.primaryTextIcon) && Intrinsics.areEqual(this.primaryText, option.primaryText) && Intrinsics.areEqual(this.secondaryText, option.secondaryText) && this.isCheckmarkVisible == option.isCheckmarkVisible && this.achTransferOption == option.achTransferOption && this.state == option.state;
        }

        public int hashCode() {
            int iHashCode = this.primaryTextEnabledColor.hashCode() * 31;
            BentoIcon4 bentoIcon4 = this.primaryTextIcon;
            return ((((((((((iHashCode + (bentoIcon4 == null ? 0 : bentoIcon4.hashCode())) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + Boolean.hashCode(this.isCheckmarkVisible)) * 31) + this.achTransferOption.hashCode()) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "Option(primaryTextEnabledColor=" + this.primaryTextEnabledColor + ", primaryTextIcon=" + this.primaryTextIcon + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", isCheckmarkVisible=" + this.isCheckmarkVisible + ", achTransferOption=" + this.achTransferOption + ", state=" + this.state + ")";
        }

        public Option(Color primaryTextEnabledColor, BentoIcon4 bentoIcon4, StringResource primaryText, StringResource secondaryText, boolean z, AchTransferOption achTransferOption, State state) {
            Intrinsics.checkNotNullParameter(primaryTextEnabledColor, "primaryTextEnabledColor");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(achTransferOption, "achTransferOption");
            Intrinsics.checkNotNullParameter(state, "state");
            this.primaryTextEnabledColor = primaryTextEnabledColor;
            this.primaryTextIcon = bentoIcon4;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.isCheckmarkVisible = z;
            this.achTransferOption = achTransferOption;
            this.state = state;
        }

        public final Color getPrimaryTextEnabledColor() {
            return this.primaryTextEnabledColor;
        }

        public final BentoIcon4 getPrimaryTextIcon() {
            return this.primaryTextIcon;
        }

        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        public final boolean isCheckmarkVisible() {
            return this.isCheckmarkVisible;
        }

        public final AchTransferOption getAchTransferOption() {
            return this.achTransferOption;
        }

        public final State getState() {
            return this.state;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CreateTransferV2InstantBankTransferSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option$State;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "ENABLED_SELECTED", "ENABLED_NOT_SELECTED", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class State {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State DISABLED = new State("DISABLED", 0);
            public static final State ENABLED_SELECTED = new State("ENABLED_SELECTED", 1);
            public static final State ENABLED_NOT_SELECTED = new State("ENABLED_NOT_SELECTED", 2);

            private static final /* synthetic */ State[] $values() {
                return new State[]{DISABLED, ENABLED_SELECTED, ENABLED_NOT_SELECTED};
            }

            public static EnumEntries<State> getEntries() {
                return $ENTRIES;
            }

            private State(String str, int i) {
            }

            static {
                State[] stateArr$values = $values();
                $VALUES = stateArr$values;
                $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }
    }
}
