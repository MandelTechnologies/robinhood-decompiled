package com.robinhood.android.event.gamedetail.components;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ContractRow.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ContractRowState;", "", "contractTitle", "", "contractOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/components/ContractRowState$ContractOptionState;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getContractTitle", "()Ljava/lang/String;", "getContractOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ContractOptionState", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContractRowState {
    public static final int $stable = 8;
    private final ImmutableList<ContractOptionState> contractOptions;
    private final String contractTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractRowState copy$default(ContractRowState contractRowState, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractRowState.contractTitle;
        }
        if ((i & 2) != 0) {
            immutableList = contractRowState.contractOptions;
        }
        return contractRowState.copy(str, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContractTitle() {
        return this.contractTitle;
    }

    public final ImmutableList<ContractOptionState> component2() {
        return this.contractOptions;
    }

    public final ContractRowState copy(String contractTitle, ImmutableList<ContractOptionState> contractOptions) {
        Intrinsics.checkNotNullParameter(contractTitle, "contractTitle");
        Intrinsics.checkNotNullParameter(contractOptions, "contractOptions");
        return new ContractRowState(contractTitle, contractOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractRowState)) {
            return false;
        }
        ContractRowState contractRowState = (ContractRowState) other;
        return Intrinsics.areEqual(this.contractTitle, contractRowState.contractTitle) && Intrinsics.areEqual(this.contractOptions, contractRowState.contractOptions);
    }

    public int hashCode() {
        return (this.contractTitle.hashCode() * 31) + this.contractOptions.hashCode();
    }

    public String toString() {
        return "ContractRowState(contractTitle=" + this.contractTitle + ", contractOptions=" + this.contractOptions + ")";
    }

    public ContractRowState(String contractTitle, ImmutableList<ContractOptionState> contractOptions) {
        Intrinsics.checkNotNullParameter(contractTitle, "contractTitle");
        Intrinsics.checkNotNullParameter(contractOptions, "contractOptions");
        this.contractTitle = contractTitle;
        this.contractOptions = contractOptions;
    }

    public final String getContractTitle() {
        return this.contractTitle;
    }

    public final ImmutableList<ContractOptionState> getContractOptions() {
        return this.contractOptions;
    }

    /* compiled from: ContractRow.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003JG\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ContractRowState$ContractOptionState;", "", "contractElement", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "text", "Lcom/robinhood/utils/resource/StringResource;", "subText", "", "isSelected", "", "isEnabled", "contractColumnType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "<init>", "(Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;ZZLcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;)V", "getContractElement", "()Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getSubText", "()Ljava/lang/String;", "()Z", "getContractColumnType", "()Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "uniqueIdentifier", "getUniqueIdentifier", "supportLongPress", "getSupportLongPress", "loggingIdentifier", "getLoggingIdentifier", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "getLoggingContext", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractOptionState {
        public static final int $stable = 8;
        private final ContractGroup3 contractColumnType;
        private final ContractElement contractElement;
        private final boolean isEnabled;
        private final boolean isSelected;
        private final String loggingContext;
        private final String loggingIdentifier;
        private final String subText;
        private final StringResource text;
        private final String uniqueIdentifier;

        public static /* synthetic */ ContractOptionState copy$default(ContractOptionState contractOptionState, ContractElement contractElement, StringResource stringResource, String str, boolean z, boolean z2, ContractGroup3 contractGroup3, int i, Object obj) {
            if ((i & 1) != 0) {
                contractElement = contractOptionState.contractElement;
            }
            if ((i & 2) != 0) {
                stringResource = contractOptionState.text;
            }
            if ((i & 4) != 0) {
                str = contractOptionState.subText;
            }
            if ((i & 8) != 0) {
                z = contractOptionState.isSelected;
            }
            if ((i & 16) != 0) {
                z2 = contractOptionState.isEnabled;
            }
            if ((i & 32) != 0) {
                contractGroup3 = contractOptionState.contractColumnType;
            }
            boolean z3 = z2;
            ContractGroup3 contractGroup32 = contractGroup3;
            return contractOptionState.copy(contractElement, stringResource, str, z, z3, contractGroup32);
        }

        /* renamed from: component1, reason: from getter */
        public final ContractElement getContractElement() {
            return this.contractElement;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubText() {
            return this.subText;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final ContractGroup3 getContractColumnType() {
            return this.contractColumnType;
        }

        public final ContractOptionState copy(ContractElement contractElement, StringResource text, String subText, boolean isSelected, boolean isEnabled, ContractGroup3 contractColumnType) {
            Intrinsics.checkNotNullParameter(contractElement, "contractElement");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
            return new ContractOptionState(contractElement, text, subText, isSelected, isEnabled, contractColumnType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractOptionState)) {
                return false;
            }
            ContractOptionState contractOptionState = (ContractOptionState) other;
            return Intrinsics.areEqual(this.contractElement, contractOptionState.contractElement) && Intrinsics.areEqual(this.text, contractOptionState.text) && Intrinsics.areEqual(this.subText, contractOptionState.subText) && this.isSelected == contractOptionState.isSelected && this.isEnabled == contractOptionState.isEnabled && this.contractColumnType == contractOptionState.contractColumnType;
        }

        public int hashCode() {
            int iHashCode = ((this.contractElement.hashCode() * 31) + this.text.hashCode()) * 31;
            String str = this.subText;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.contractColumnType.hashCode();
        }

        public String toString() {
            return "ContractOptionState(contractElement=" + this.contractElement + ", text=" + this.text + ", subText=" + this.subText + ", isSelected=" + this.isSelected + ", isEnabled=" + this.isEnabled + ", contractColumnType=" + this.contractColumnType + ")";
        }

        public ContractOptionState(ContractElement contractElement, StringResource text, String str, boolean z, boolean z2, ContractGroup3 contractColumnType) {
            Intrinsics.checkNotNullParameter(contractElement, "contractElement");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
            this.contractElement = contractElement;
            this.text = text;
            this.subText = str;
            this.isSelected = z;
            this.isEnabled = z2;
            this.contractColumnType = contractColumnType;
            this.uniqueIdentifier = contractElement.getContractId() + "+" + contractElement.getContractSide();
            this.loggingIdentifier = "gdp-six-box-" + contractColumnType.getServerValue() + "-" + contractElement.getContractSide() + "-" + contractElement.getContractId();
            this.loggingContext = text.toString();
        }

        public final ContractElement getContractElement() {
            return this.contractElement;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final String getSubText() {
            return this.subText;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final ContractGroup3 getContractColumnType() {
            return this.contractColumnType;
        }

        public final String getUniqueIdentifier() {
            return this.uniqueIdentifier;
        }

        public final boolean getSupportLongPress() {
            return this.contractColumnType == ContractGroup3.CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE && !this.isSelected;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final String getLoggingContext() {
            return this.loggingContext;
        }
    }
}
