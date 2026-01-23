package com.robinhood.android.event.gamedetail.components;

import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboPickerContractRow.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ValueButtonState;", "", "<init>", "()V", "ToggleButtonState", "StrikePriceButtonState", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$StrikePriceButtonState;", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.components.ValueButtonState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class ComboPickerContractRow3 {
    public static final int $stable = 0;

    public /* synthetic */ ComboPickerContractRow3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComboPickerContractRow3() {
    }

    /* compiled from: ComboPickerContractRow.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState;", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState;", "contractId", "Ljava/util/UUID;", "leftOption", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState$ToggleOption;", "rightOption", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState$ToggleOption;Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState$ToggleOption;)V", "getContractId", "()Ljava/util/UUID;", "getLeftOption", "()Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState$ToggleOption;", "getRightOption", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ToggleOption", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.gamedetail.components.ValueButtonState$ToggleButtonState, reason: from toString */
    public static final /* data */ class ToggleButtonState extends ComboPickerContractRow3 {
        public static final int $stable = 0;
        private final UUID contractId;
        private final ToggleOption leftOption;
        private final ToggleOption rightOption;

        public static /* synthetic */ ToggleButtonState copy$default(ToggleButtonState toggleButtonState, UUID uuid, ToggleOption toggleOption, ToggleOption toggleOption2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = toggleButtonState.contractId;
            }
            if ((i & 2) != 0) {
                toggleOption = toggleButtonState.leftOption;
            }
            if ((i & 4) != 0) {
                toggleOption2 = toggleButtonState.rightOption;
            }
            return toggleButtonState.copy(uuid, toggleOption, toggleOption2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final ToggleOption getLeftOption() {
            return this.leftOption;
        }

        /* renamed from: component3, reason: from getter */
        public final ToggleOption getRightOption() {
            return this.rightOption;
        }

        public final ToggleButtonState copy(UUID contractId, ToggleOption leftOption, ToggleOption rightOption) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(leftOption, "leftOption");
            Intrinsics.checkNotNullParameter(rightOption, "rightOption");
            return new ToggleButtonState(contractId, leftOption, rightOption);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToggleButtonState)) {
                return false;
            }
            ToggleButtonState toggleButtonState = (ToggleButtonState) other;
            return Intrinsics.areEqual(this.contractId, toggleButtonState.contractId) && Intrinsics.areEqual(this.leftOption, toggleButtonState.leftOption) && Intrinsics.areEqual(this.rightOption, toggleButtonState.rightOption);
        }

        public int hashCode() {
            return (((this.contractId.hashCode() * 31) + this.leftOption.hashCode()) * 31) + this.rightOption.hashCode();
        }

        public String toString() {
            return "ToggleButtonState(contractId=" + this.contractId + ", leftOption=" + this.leftOption + ", rightOption=" + this.rightOption + ")";
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final ToggleOption getLeftOption() {
            return this.leftOption;
        }

        public final ToggleOption getRightOption() {
            return this.rightOption;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToggleButtonState(UUID contractId, ToggleOption leftOption, ToggleOption rightOption) {
            super(null);
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(leftOption, "leftOption");
            Intrinsics.checkNotNullParameter(rightOption, "rightOption");
            this.contractId = contractId;
            this.leftOption = leftOption;
            this.rightOption = rightOption;
        }

        /* compiled from: ComboPickerContractRow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState$ToggleOption;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "isSelected", "", "side", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/eventcontracts/models/event/ContractSide;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getSide", "()Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.event.gamedetail.components.ValueButtonState$ToggleButtonState$ToggleOption, reason: from toString */
        public static final /* data */ class ToggleOption {
            public static final int $stable = 0;
            private final boolean isSelected;
            private final ContractSide side;
            private final StringResource text;

            public static /* synthetic */ ToggleOption copy$default(ToggleOption toggleOption, StringResource stringResource, boolean z, ContractSide contractSide, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = toggleOption.text;
                }
                if ((i & 2) != 0) {
                    z = toggleOption.isSelected;
                }
                if ((i & 4) != 0) {
                    contractSide = toggleOption.side;
                }
                return toggleOption.copy(stringResource, z, contractSide);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component3, reason: from getter */
            public final ContractSide getSide() {
                return this.side;
            }

            public final ToggleOption copy(StringResource text, boolean isSelected, ContractSide side) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(side, "side");
                return new ToggleOption(text, isSelected, side);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToggleOption)) {
                    return false;
                }
                ToggleOption toggleOption = (ToggleOption) other;
                return Intrinsics.areEqual(this.text, toggleOption.text) && this.isSelected == toggleOption.isSelected && this.side == toggleOption.side;
            }

            public int hashCode() {
                return (((this.text.hashCode() * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.side.hashCode();
            }

            public String toString() {
                return "ToggleOption(text=" + this.text + ", isSelected=" + this.isSelected + ", side=" + this.side + ")";
            }

            public ToggleOption(StringResource text, boolean z, ContractSide side) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(side, "side");
                this.text = text;
                this.isSelected = z;
                this.side = side;
            }

            public final StringResource getText() {
                return this.text;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            public final ContractSide getSide() {
                return this.side;
            }
        }
    }

    /* compiled from: ComboPickerContractRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$StrikePriceButtonState;", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState;", "contractId", "Ljava/util/UUID;", "text", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getContractId", "()Ljava/util/UUID;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.gamedetail.components.ValueButtonState$StrikePriceButtonState, reason: from toString */
    public static final /* data */ class StrikePriceButtonState extends ComboPickerContractRow3 {
        public static final int $stable = 0;
        private final UUID contractId;
        private final String text;

        public static /* synthetic */ StrikePriceButtonState copy$default(StrikePriceButtonState strikePriceButtonState, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = strikePriceButtonState.contractId;
            }
            if ((i & 2) != 0) {
                str = strikePriceButtonState.text;
            }
            return strikePriceButtonState.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final StrikePriceButtonState copy(UUID contractId, String text) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(text, "text");
            return new StrikePriceButtonState(contractId, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StrikePriceButtonState)) {
                return false;
            }
            StrikePriceButtonState strikePriceButtonState = (StrikePriceButtonState) other;
            return Intrinsics.areEqual(this.contractId, strikePriceButtonState.contractId) && Intrinsics.areEqual(this.text, strikePriceButtonState.text);
        }

        public int hashCode() {
            return (this.contractId.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "StrikePriceButtonState(contractId=" + this.contractId + ", text=" + this.text + ")";
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final String getText() {
            return this.text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrikePriceButtonState(UUID contractId, String text) {
            super(null);
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(text, "text");
            this.contractId = contractId;
            this.text = text;
        }
    }
}
