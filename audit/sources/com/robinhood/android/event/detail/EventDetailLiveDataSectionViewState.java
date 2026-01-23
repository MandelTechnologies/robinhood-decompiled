package com.robinhood.android.event.detail;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailLiveDataSection.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "", "leftContractState", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState$ContractViewState;", "rightContractState", "leftContractColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "rightContractColor", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "<init>", "(Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState$ContractViewState;Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState$ContractViewState;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getLeftContractState", "()Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState$ContractViewState;", "getRightContractState", "getLeftContractColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getRightContractColor", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "showGradientLine", "", "getShowGradientLine", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "ContractViewState", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventDetailLiveDataSectionViewState {
    public static final int $stable = 0;
    private final DayNightColor leftContractColor;
    private final ContractViewState leftContractState;
    private final StringResource primaryText;
    private final DayNightColor rightContractColor;
    private final ContractViewState rightContractState;
    private final StringResource secondaryText;

    public static /* synthetic */ EventDetailLiveDataSectionViewState copy$default(EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, ContractViewState contractViewState, ContractViewState contractViewState2, DayNightColor dayNightColor, DayNightColor dayNightColor2, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            contractViewState = eventDetailLiveDataSectionViewState.leftContractState;
        }
        if ((i & 2) != 0) {
            contractViewState2 = eventDetailLiveDataSectionViewState.rightContractState;
        }
        if ((i & 4) != 0) {
            dayNightColor = eventDetailLiveDataSectionViewState.leftContractColor;
        }
        if ((i & 8) != 0) {
            dayNightColor2 = eventDetailLiveDataSectionViewState.rightContractColor;
        }
        if ((i & 16) != 0) {
            stringResource = eventDetailLiveDataSectionViewState.primaryText;
        }
        if ((i & 32) != 0) {
            stringResource2 = eventDetailLiveDataSectionViewState.secondaryText;
        }
        StringResource stringResource3 = stringResource;
        StringResource stringResource4 = stringResource2;
        return eventDetailLiveDataSectionViewState.copy(contractViewState, contractViewState2, dayNightColor, dayNightColor2, stringResource3, stringResource4);
    }

    /* renamed from: component1, reason: from getter */
    public final ContractViewState getLeftContractState() {
        return this.leftContractState;
    }

    /* renamed from: component2, reason: from getter */
    public final ContractViewState getRightContractState() {
        return this.rightContractState;
    }

    /* renamed from: component3, reason: from getter */
    public final DayNightColor getLeftContractColor() {
        return this.leftContractColor;
    }

    /* renamed from: component4, reason: from getter */
    public final DayNightColor getRightContractColor() {
        return this.rightContractColor;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final EventDetailLiveDataSectionViewState copy(ContractViewState leftContractState, ContractViewState rightContractState, DayNightColor leftContractColor, DayNightColor rightContractColor, StringResource primaryText, StringResource secondaryText) {
        Intrinsics.checkNotNullParameter(leftContractColor, "leftContractColor");
        Intrinsics.checkNotNullParameter(rightContractColor, "rightContractColor");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        return new EventDetailLiveDataSectionViewState(leftContractState, rightContractState, leftContractColor, rightContractColor, primaryText, secondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDetailLiveDataSectionViewState)) {
            return false;
        }
        EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState = (EventDetailLiveDataSectionViewState) other;
        return Intrinsics.areEqual(this.leftContractState, eventDetailLiveDataSectionViewState.leftContractState) && Intrinsics.areEqual(this.rightContractState, eventDetailLiveDataSectionViewState.rightContractState) && Intrinsics.areEqual(this.leftContractColor, eventDetailLiveDataSectionViewState.leftContractColor) && Intrinsics.areEqual(this.rightContractColor, eventDetailLiveDataSectionViewState.rightContractColor) && Intrinsics.areEqual(this.primaryText, eventDetailLiveDataSectionViewState.primaryText) && Intrinsics.areEqual(this.secondaryText, eventDetailLiveDataSectionViewState.secondaryText);
    }

    public int hashCode() {
        ContractViewState contractViewState = this.leftContractState;
        int iHashCode = (contractViewState == null ? 0 : contractViewState.hashCode()) * 31;
        ContractViewState contractViewState2 = this.rightContractState;
        int iHashCode2 = (((((((iHashCode + (contractViewState2 == null ? 0 : contractViewState2.hashCode())) * 31) + this.leftContractColor.hashCode()) * 31) + this.rightContractColor.hashCode()) * 31) + this.primaryText.hashCode()) * 31;
        StringResource stringResource = this.secondaryText;
        return iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        return "EventDetailLiveDataSectionViewState(leftContractState=" + this.leftContractState + ", rightContractState=" + this.rightContractState + ", leftContractColor=" + this.leftContractColor + ", rightContractColor=" + this.rightContractColor + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
    }

    public EventDetailLiveDataSectionViewState(ContractViewState contractViewState, ContractViewState contractViewState2, DayNightColor leftContractColor, DayNightColor rightContractColor, StringResource primaryText, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(leftContractColor, "leftContractColor");
        Intrinsics.checkNotNullParameter(rightContractColor, "rightContractColor");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        this.leftContractState = contractViewState;
        this.rightContractState = contractViewState2;
        this.leftContractColor = leftContractColor;
        this.rightContractColor = rightContractColor;
        this.primaryText = primaryText;
        this.secondaryText = stringResource;
    }

    public final ContractViewState getLeftContractState() {
        return this.leftContractState;
    }

    public final ContractViewState getRightContractState() {
        return this.rightContractState;
    }

    public final DayNightColor getLeftContractColor() {
        return this.leftContractColor;
    }

    public final DayNightColor getRightContractColor() {
        return this.rightContractColor;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* compiled from: EventDetailLiveDataSection.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState$ContractViewState;", "", "isActive", "", "text", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractViewState {
        public static final int $stable = 0;
        private final boolean isActive;
        private final String text;

        public static /* synthetic */ ContractViewState copy$default(ContractViewState contractViewState, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = contractViewState.isActive;
            }
            if ((i & 2) != 0) {
                str = contractViewState.text;
            }
            return contractViewState.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ContractViewState copy(boolean isActive, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ContractViewState(isActive, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractViewState)) {
                return false;
            }
            ContractViewState contractViewState = (ContractViewState) other;
            return this.isActive == contractViewState.isActive && Intrinsics.areEqual(this.text, contractViewState.text);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isActive) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ContractViewState(isActive=" + this.isActive + ", text=" + this.text + ")";
        }

        public ContractViewState(boolean z, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.isActive = z;
            this.text = text;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final String getText() {
            return this.text;
        }
    }

    public final boolean getShowGradientLine() {
        return (this.leftContractState == null || this.rightContractState == null) ? false : true;
    }
}
