package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.SwitchableTickerInputViewData;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState;", "", "userInteractionEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "switcherDisplayData", "Lcom/robinhood/android/ui/transfers/ekiben/uk/SwitchableTickerInputViewData;", "editModeData", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData;", "reviewModeData", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$ReviewModeData;", "<init>", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/android/ui/transfers/ekiben/uk/SwitchableTickerInputViewData;Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData;Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$ReviewModeData;)V", "getUserInteractionEventDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getSwitcherDisplayData", "()Lcom/robinhood/android/ui/transfers/ekiben/uk/SwitchableTickerInputViewData;", "getEditModeData", "()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData;", "getReviewModeData", "()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$ReviewModeData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "EditModeData", "ReviewModeData", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UkQueuedDepositViewState {
    public static final int $stable = 8;
    private final EditModeData editModeData;
    private final ReviewModeData reviewModeData;
    private final SwitchableTickerInputViewData switcherDisplayData;
    private final UserInteractionEventDescriptor userInteractionEventDescriptor;

    public static /* synthetic */ UkQueuedDepositViewState copy$default(UkQueuedDepositViewState ukQueuedDepositViewState, UserInteractionEventDescriptor userInteractionEventDescriptor, SwitchableTickerInputViewData switchableTickerInputViewData, EditModeData editModeData, ReviewModeData reviewModeData, int i, Object obj) {
        if ((i & 1) != 0) {
            userInteractionEventDescriptor = ukQueuedDepositViewState.userInteractionEventDescriptor;
        }
        if ((i & 2) != 0) {
            switchableTickerInputViewData = ukQueuedDepositViewState.switcherDisplayData;
        }
        if ((i & 4) != 0) {
            editModeData = ukQueuedDepositViewState.editModeData;
        }
        if ((i & 8) != 0) {
            reviewModeData = ukQueuedDepositViewState.reviewModeData;
        }
        return ukQueuedDepositViewState.copy(userInteractionEventDescriptor, switchableTickerInputViewData, editModeData, reviewModeData);
    }

    /* renamed from: component1, reason: from getter */
    public final UserInteractionEventDescriptor getUserInteractionEventDescriptor() {
        return this.userInteractionEventDescriptor;
    }

    /* renamed from: component2, reason: from getter */
    public final SwitchableTickerInputViewData getSwitcherDisplayData() {
        return this.switcherDisplayData;
    }

    /* renamed from: component3, reason: from getter */
    public final EditModeData getEditModeData() {
        return this.editModeData;
    }

    /* renamed from: component4, reason: from getter */
    public final ReviewModeData getReviewModeData() {
        return this.reviewModeData;
    }

    public final UkQueuedDepositViewState copy(UserInteractionEventDescriptor userInteractionEventDescriptor, SwitchableTickerInputViewData switcherDisplayData, EditModeData editModeData, ReviewModeData reviewModeData) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "userInteractionEventDescriptor");
        Intrinsics.checkNotNullParameter(switcherDisplayData, "switcherDisplayData");
        return new UkQueuedDepositViewState(userInteractionEventDescriptor, switcherDisplayData, editModeData, reviewModeData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkQueuedDepositViewState)) {
            return false;
        }
        UkQueuedDepositViewState ukQueuedDepositViewState = (UkQueuedDepositViewState) other;
        return Intrinsics.areEqual(this.userInteractionEventDescriptor, ukQueuedDepositViewState.userInteractionEventDescriptor) && Intrinsics.areEqual(this.switcherDisplayData, ukQueuedDepositViewState.switcherDisplayData) && Intrinsics.areEqual(this.editModeData, ukQueuedDepositViewState.editModeData) && Intrinsics.areEqual(this.reviewModeData, ukQueuedDepositViewState.reviewModeData);
    }

    public int hashCode() {
        int iHashCode = ((this.userInteractionEventDescriptor.hashCode() * 31) + this.switcherDisplayData.hashCode()) * 31;
        EditModeData editModeData = this.editModeData;
        int iHashCode2 = (iHashCode + (editModeData == null ? 0 : editModeData.hashCode())) * 31;
        ReviewModeData reviewModeData = this.reviewModeData;
        return iHashCode2 + (reviewModeData != null ? reviewModeData.hashCode() : 0);
    }

    public String toString() {
        return "UkQueuedDepositViewState(userInteractionEventDescriptor=" + this.userInteractionEventDescriptor + ", switcherDisplayData=" + this.switcherDisplayData + ", editModeData=" + this.editModeData + ", reviewModeData=" + this.reviewModeData + ")";
    }

    public UkQueuedDepositViewState(UserInteractionEventDescriptor userInteractionEventDescriptor, SwitchableTickerInputViewData switcherDisplayData, EditModeData editModeData, ReviewModeData reviewModeData) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "userInteractionEventDescriptor");
        Intrinsics.checkNotNullParameter(switcherDisplayData, "switcherDisplayData");
        this.userInteractionEventDescriptor = userInteractionEventDescriptor;
        this.switcherDisplayData = switcherDisplayData;
        this.editModeData = editModeData;
        this.reviewModeData = reviewModeData;
    }

    public final UserInteractionEventDescriptor getUserInteractionEventDescriptor() {
        return this.userInteractionEventDescriptor;
    }

    public final SwitchableTickerInputViewData getSwitcherDisplayData() {
        return this.switcherDisplayData;
    }

    public final EditModeData getEditModeData() {
        return this.editModeData;
    }

    public final ReviewModeData getReviewModeData() {
        return this.reviewModeData;
    }

    /* compiled from: UkQueuedDepositViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData;", "", "primaryButtonText", "Lcom/robinhood/utils/resource/StringResource;", "isPrimaryButtonEnabled", "", "isPrimaryButtonLoading", "primaryButtonAction", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData$PrimaryButtonAction;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData$PrimaryButtonAction;)V", "getPrimaryButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getPrimaryButtonAction", "()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData$PrimaryButtonAction;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "PrimaryButtonAction", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditModeData {
        public static final int $stable = StringResource.$stable;
        private final boolean isPrimaryButtonEnabled;
        private final boolean isPrimaryButtonLoading;
        private final PrimaryButtonAction primaryButtonAction;
        private final StringResource primaryButtonText;

        public static /* synthetic */ EditModeData copy$default(EditModeData editModeData, StringResource stringResource, boolean z, boolean z2, PrimaryButtonAction primaryButtonAction, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = editModeData.primaryButtonText;
            }
            if ((i & 2) != 0) {
                z = editModeData.isPrimaryButtonEnabled;
            }
            if ((i & 4) != 0) {
                z2 = editModeData.isPrimaryButtonLoading;
            }
            if ((i & 8) != 0) {
                primaryButtonAction = editModeData.primaryButtonAction;
            }
            return editModeData.copy(stringResource, z, z2, primaryButtonAction);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPrimaryButtonEnabled() {
            return this.isPrimaryButtonEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPrimaryButtonLoading() {
            return this.isPrimaryButtonLoading;
        }

        /* renamed from: component4, reason: from getter */
        public final PrimaryButtonAction getPrimaryButtonAction() {
            return this.primaryButtonAction;
        }

        public final EditModeData copy(StringResource primaryButtonText, boolean isPrimaryButtonEnabled, boolean isPrimaryButtonLoading, PrimaryButtonAction primaryButtonAction) {
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(primaryButtonAction, "primaryButtonAction");
            return new EditModeData(primaryButtonText, isPrimaryButtonEnabled, isPrimaryButtonLoading, primaryButtonAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditModeData)) {
                return false;
            }
            EditModeData editModeData = (EditModeData) other;
            return Intrinsics.areEqual(this.primaryButtonText, editModeData.primaryButtonText) && this.isPrimaryButtonEnabled == editModeData.isPrimaryButtonEnabled && this.isPrimaryButtonLoading == editModeData.isPrimaryButtonLoading && this.primaryButtonAction == editModeData.primaryButtonAction;
        }

        public int hashCode() {
            return (((((this.primaryButtonText.hashCode() * 31) + Boolean.hashCode(this.isPrimaryButtonEnabled)) * 31) + Boolean.hashCode(this.isPrimaryButtonLoading)) * 31) + this.primaryButtonAction.hashCode();
        }

        public String toString() {
            return "EditModeData(primaryButtonText=" + this.primaryButtonText + ", isPrimaryButtonEnabled=" + this.isPrimaryButtonEnabled + ", isPrimaryButtonLoading=" + this.isPrimaryButtonLoading + ", primaryButtonAction=" + this.primaryButtonAction + ")";
        }

        public EditModeData(StringResource primaryButtonText, boolean z, boolean z2, PrimaryButtonAction primaryButtonAction) {
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(primaryButtonAction, "primaryButtonAction");
            this.primaryButtonText = primaryButtonText;
            this.isPrimaryButtonEnabled = z;
            this.isPrimaryButtonLoading = z2;
            this.primaryButtonAction = primaryButtonAction;
        }

        public final StringResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final boolean isPrimaryButtonEnabled() {
            return this.isPrimaryButtonEnabled;
        }

        public final boolean isPrimaryButtonLoading() {
            return this.isPrimaryButtonLoading;
        }

        public final PrimaryButtonAction getPrimaryButtonAction() {
            return this.primaryButtonAction;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UkQueuedDepositViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData$PrimaryButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEW", "SUBMIT", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class PrimaryButtonAction {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ PrimaryButtonAction[] $VALUES;
            public static final PrimaryButtonAction REVIEW = new PrimaryButtonAction("REVIEW", 0);
            public static final PrimaryButtonAction SUBMIT = new PrimaryButtonAction("SUBMIT", 1);

            private static final /* synthetic */ PrimaryButtonAction[] $values() {
                return new PrimaryButtonAction[]{REVIEW, SUBMIT};
            }

            public static EnumEntries<PrimaryButtonAction> getEntries() {
                return $ENTRIES;
            }

            private PrimaryButtonAction(String str, int i) {
            }

            static {
                PrimaryButtonAction[] primaryButtonActionArr$values = $values();
                $VALUES = primaryButtonActionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(primaryButtonActionArr$values);
            }

            public static PrimaryButtonAction valueOf(String str) {
                return (PrimaryButtonAction) Enum.valueOf(PrimaryButtonAction.class, str);
            }

            public static PrimaryButtonAction[] values() {
                return (PrimaryButtonAction[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: UkQueuedDepositViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$ReviewModeData;", "", "expectedExchangeRate", "Lcom/robinhood/utils/resource/StringResource;", "expectedValue", "Lcom/robinhood/models/util/Money;", "lastUpdated", "", "disclosureComponent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isContinueButtonLoading", "", "isContinueButtonEnabled", "isEditButtonEnabled", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;ZZZ)V", "getExpectedExchangeRate", "()Lcom/robinhood/utils/resource/StringResource;", "getExpectedValue", "()Lcom/robinhood/models/util/Money;", "getLastUpdated", "()Ljava/lang/String;", "getDisclosureComponent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReviewModeData {
        public static final int $stable = 8;
        private final UIComponent<GenericAction> disclosureComponent;
        private final StringResource expectedExchangeRate;
        private final Money expectedValue;
        private final boolean isContinueButtonEnabled;
        private final boolean isContinueButtonLoading;
        private final boolean isEditButtonEnabled;
        private final String lastUpdated;

        public static /* synthetic */ ReviewModeData copy$default(ReviewModeData reviewModeData, StringResource stringResource, Money money, String str, UIComponent uIComponent, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = reviewModeData.expectedExchangeRate;
            }
            if ((i & 2) != 0) {
                money = reviewModeData.expectedValue;
            }
            if ((i & 4) != 0) {
                str = reviewModeData.lastUpdated;
            }
            if ((i & 8) != 0) {
                uIComponent = reviewModeData.disclosureComponent;
            }
            if ((i & 16) != 0) {
                z = reviewModeData.isContinueButtonLoading;
            }
            if ((i & 32) != 0) {
                z2 = reviewModeData.isContinueButtonEnabled;
            }
            if ((i & 64) != 0) {
                z3 = reviewModeData.isEditButtonEnabled;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            boolean z6 = z;
            String str2 = str;
            return reviewModeData.copy(stringResource, money, str2, uIComponent, z6, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getExpectedExchangeRate() {
            return this.expectedExchangeRate;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getExpectedValue() {
            return this.expectedValue;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLastUpdated() {
            return this.lastUpdated;
        }

        public final UIComponent<GenericAction> component4() {
            return this.disclosureComponent;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsContinueButtonLoading() {
            return this.isContinueButtonLoading;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsEditButtonEnabled() {
            return this.isEditButtonEnabled;
        }

        public final ReviewModeData copy(StringResource expectedExchangeRate, Money expectedValue, String lastUpdated, UIComponent<? extends GenericAction> disclosureComponent, boolean isContinueButtonLoading, boolean isContinueButtonEnabled, boolean isEditButtonEnabled) {
            Intrinsics.checkNotNullParameter(expectedValue, "expectedValue");
            return new ReviewModeData(expectedExchangeRate, expectedValue, lastUpdated, disclosureComponent, isContinueButtonLoading, isContinueButtonEnabled, isEditButtonEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewModeData)) {
                return false;
            }
            ReviewModeData reviewModeData = (ReviewModeData) other;
            return Intrinsics.areEqual(this.expectedExchangeRate, reviewModeData.expectedExchangeRate) && Intrinsics.areEqual(this.expectedValue, reviewModeData.expectedValue) && Intrinsics.areEqual(this.lastUpdated, reviewModeData.lastUpdated) && Intrinsics.areEqual(this.disclosureComponent, reviewModeData.disclosureComponent) && this.isContinueButtonLoading == reviewModeData.isContinueButtonLoading && this.isContinueButtonEnabled == reviewModeData.isContinueButtonEnabled && this.isEditButtonEnabled == reviewModeData.isEditButtonEnabled;
        }

        public int hashCode() {
            StringResource stringResource = this.expectedExchangeRate;
            int iHashCode = (((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.expectedValue.hashCode()) * 31;
            String str = this.lastUpdated;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            UIComponent<GenericAction> uIComponent = this.disclosureComponent;
            return ((((((iHashCode2 + (uIComponent != null ? uIComponent.hashCode() : 0)) * 31) + Boolean.hashCode(this.isContinueButtonLoading)) * 31) + Boolean.hashCode(this.isContinueButtonEnabled)) * 31) + Boolean.hashCode(this.isEditButtonEnabled);
        }

        public String toString() {
            return "ReviewModeData(expectedExchangeRate=" + this.expectedExchangeRate + ", expectedValue=" + this.expectedValue + ", lastUpdated=" + this.lastUpdated + ", disclosureComponent=" + this.disclosureComponent + ", isContinueButtonLoading=" + this.isContinueButtonLoading + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", isEditButtonEnabled=" + this.isEditButtonEnabled + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ReviewModeData(StringResource stringResource, Money expectedValue, String str, UIComponent<? extends GenericAction> uIComponent, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(expectedValue, "expectedValue");
            this.expectedExchangeRate = stringResource;
            this.expectedValue = expectedValue;
            this.lastUpdated = str;
            this.disclosureComponent = uIComponent;
            this.isContinueButtonLoading = z;
            this.isContinueButtonEnabled = z2;
            this.isEditButtonEnabled = z3;
        }

        public final StringResource getExpectedExchangeRate() {
            return this.expectedExchangeRate;
        }

        public final Money getExpectedValue() {
            return this.expectedValue;
        }

        public final String getLastUpdated() {
            return this.lastUpdated;
        }

        public final UIComponent<GenericAction> getDisclosureComponent() {
            return this.disclosureComponent;
        }

        public final boolean isContinueButtonLoading() {
            return this.isContinueButtonLoading;
        }

        public final boolean isContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        public final boolean isEditButtonEnabled() {
            return this.isEditButtonEnabled;
        }
    }
}
