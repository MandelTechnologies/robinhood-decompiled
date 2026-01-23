package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageViewState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jl\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageState;", "", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "hasRealPosition", "", "optionsAccountSwitcherId", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "toolbarState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;", "bodyState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;", "tradebarData", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "loggingState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "uiOptionPositionState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/lang/Boolean;Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;)V", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getHasRealPosition", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOptionsAccountSwitcherId", "()Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "getToolbarState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;", "getBodyState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;", "getTradebarData", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "getLoggingState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "getUiOptionPositionState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/lang/Boolean;Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageState;", "equals", "other", "hashCode", "", "toString", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsDetailPageState {
    public static final int $stable = 8;
    private final OptionsDetailPageBodyState bodyState;
    private final Direction direction;
    private final Boolean hasRealPosition;
    private final OptionsDetailPageLoggingState loggingState;
    private final OptionsAccountSwitcherId optionsAccountSwitcherId;
    private final OptionsDetailPageToolbarState toolbarState;
    private final OptionsDetailPageTradebarDataState.PageSpecificDerivedData tradebarData;
    private final OptionsDetailPageUiOptionPositionState uiOptionPositionState;

    public static /* synthetic */ OptionsDetailPageState copy$default(OptionsDetailPageState optionsDetailPageState, Direction direction, Boolean bool, OptionsAccountSwitcherId optionsAccountSwitcherId, OptionsDetailPageToolbarState optionsDetailPageToolbarState, OptionsDetailPageBodyState optionsDetailPageBodyState, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData, OptionsDetailPageLoggingState optionsDetailPageLoggingState, OptionsDetailPageUiOptionPositionState optionsDetailPageUiOptionPositionState, int i, Object obj) {
        if ((i & 1) != 0) {
            direction = optionsDetailPageState.direction;
        }
        if ((i & 2) != 0) {
            bool = optionsDetailPageState.hasRealPosition;
        }
        if ((i & 4) != 0) {
            optionsAccountSwitcherId = optionsDetailPageState.optionsAccountSwitcherId;
        }
        if ((i & 8) != 0) {
            optionsDetailPageToolbarState = optionsDetailPageState.toolbarState;
        }
        if ((i & 16) != 0) {
            optionsDetailPageBodyState = optionsDetailPageState.bodyState;
        }
        if ((i & 32) != 0) {
            pageSpecificDerivedData = optionsDetailPageState.tradebarData;
        }
        if ((i & 64) != 0) {
            optionsDetailPageLoggingState = optionsDetailPageState.loggingState;
        }
        if ((i & 128) != 0) {
            optionsDetailPageUiOptionPositionState = optionsDetailPageState.uiOptionPositionState;
        }
        OptionsDetailPageLoggingState optionsDetailPageLoggingState2 = optionsDetailPageLoggingState;
        OptionsDetailPageUiOptionPositionState optionsDetailPageUiOptionPositionState2 = optionsDetailPageUiOptionPositionState;
        OptionsDetailPageBodyState optionsDetailPageBodyState2 = optionsDetailPageBodyState;
        OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData2 = pageSpecificDerivedData;
        return optionsDetailPageState.copy(direction, bool, optionsAccountSwitcherId, optionsDetailPageToolbarState, optionsDetailPageBodyState2, pageSpecificDerivedData2, optionsDetailPageLoggingState2, optionsDetailPageUiOptionPositionState2);
    }

    /* renamed from: component1, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasRealPosition() {
        return this.hasRealPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsAccountSwitcherId getOptionsAccountSwitcherId() {
        return this.optionsAccountSwitcherId;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionsDetailPageToolbarState getToolbarState() {
        return this.toolbarState;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionsDetailPageBodyState getBodyState() {
        return this.bodyState;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionsDetailPageTradebarDataState.PageSpecificDerivedData getTradebarData() {
        return this.tradebarData;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsDetailPageLoggingState getLoggingState() {
        return this.loggingState;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionsDetailPageUiOptionPositionState getUiOptionPositionState() {
        return this.uiOptionPositionState;
    }

    public final OptionsDetailPageState copy(Direction direction, Boolean hasRealPosition, OptionsAccountSwitcherId optionsAccountSwitcherId, OptionsDetailPageToolbarState toolbarState, OptionsDetailPageBodyState bodyState, OptionsDetailPageTradebarDataState.PageSpecificDerivedData tradebarData, OptionsDetailPageLoggingState loggingState, OptionsDetailPageUiOptionPositionState uiOptionPositionState) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new OptionsDetailPageState(direction, hasRealPosition, optionsAccountSwitcherId, toolbarState, bodyState, tradebarData, loggingState, uiOptionPositionState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageState)) {
            return false;
        }
        OptionsDetailPageState optionsDetailPageState = (OptionsDetailPageState) other;
        return this.direction == optionsDetailPageState.direction && Intrinsics.areEqual(this.hasRealPosition, optionsDetailPageState.hasRealPosition) && Intrinsics.areEqual(this.optionsAccountSwitcherId, optionsDetailPageState.optionsAccountSwitcherId) && Intrinsics.areEqual(this.toolbarState, optionsDetailPageState.toolbarState) && Intrinsics.areEqual(this.bodyState, optionsDetailPageState.bodyState) && Intrinsics.areEqual(this.tradebarData, optionsDetailPageState.tradebarData) && Intrinsics.areEqual(this.loggingState, optionsDetailPageState.loggingState) && Intrinsics.areEqual(this.uiOptionPositionState, optionsDetailPageState.uiOptionPositionState);
    }

    public int hashCode() {
        int iHashCode = this.direction.hashCode() * 31;
        Boolean bool = this.hasRealPosition;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        OptionsAccountSwitcherId optionsAccountSwitcherId = this.optionsAccountSwitcherId;
        int iHashCode3 = (iHashCode2 + (optionsAccountSwitcherId == null ? 0 : optionsAccountSwitcherId.hashCode())) * 31;
        OptionsDetailPageToolbarState optionsDetailPageToolbarState = this.toolbarState;
        int iHashCode4 = (iHashCode3 + (optionsDetailPageToolbarState == null ? 0 : optionsDetailPageToolbarState.hashCode())) * 31;
        OptionsDetailPageBodyState optionsDetailPageBodyState = this.bodyState;
        int iHashCode5 = (iHashCode4 + (optionsDetailPageBodyState == null ? 0 : optionsDetailPageBodyState.hashCode())) * 31;
        OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData = this.tradebarData;
        int iHashCode6 = (iHashCode5 + (pageSpecificDerivedData == null ? 0 : pageSpecificDerivedData.hashCode())) * 31;
        OptionsDetailPageLoggingState optionsDetailPageLoggingState = this.loggingState;
        int iHashCode7 = (iHashCode6 + (optionsDetailPageLoggingState == null ? 0 : optionsDetailPageLoggingState.hashCode())) * 31;
        OptionsDetailPageUiOptionPositionState optionsDetailPageUiOptionPositionState = this.uiOptionPositionState;
        return iHashCode7 + (optionsDetailPageUiOptionPositionState != null ? optionsDetailPageUiOptionPositionState.hashCode() : 0);
    }

    public String toString() {
        return "OptionsDetailPageState(direction=" + this.direction + ", hasRealPosition=" + this.hasRealPosition + ", optionsAccountSwitcherId=" + this.optionsAccountSwitcherId + ", toolbarState=" + this.toolbarState + ", bodyState=" + this.bodyState + ", tradebarData=" + this.tradebarData + ", loggingState=" + this.loggingState + ", uiOptionPositionState=" + this.uiOptionPositionState + ")";
    }

    public OptionsDetailPageState(Direction direction, Boolean bool, OptionsAccountSwitcherId optionsAccountSwitcherId, OptionsDetailPageToolbarState optionsDetailPageToolbarState, OptionsDetailPageBodyState optionsDetailPageBodyState, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData, OptionsDetailPageLoggingState optionsDetailPageLoggingState, OptionsDetailPageUiOptionPositionState optionsDetailPageUiOptionPositionState) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.direction = direction;
        this.hasRealPosition = bool;
        this.optionsAccountSwitcherId = optionsAccountSwitcherId;
        this.toolbarState = optionsDetailPageToolbarState;
        this.bodyState = optionsDetailPageBodyState;
        this.tradebarData = pageSpecificDerivedData;
        this.loggingState = optionsDetailPageLoggingState;
        this.uiOptionPositionState = optionsDetailPageUiOptionPositionState;
    }

    public /* synthetic */ OptionsDetailPageState(Direction direction, Boolean bool, OptionsAccountSwitcherId optionsAccountSwitcherId, OptionsDetailPageToolbarState optionsDetailPageToolbarState, OptionsDetailPageBodyState optionsDetailPageBodyState, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData, OptionsDetailPageLoggingState optionsDetailPageLoggingState, OptionsDetailPageUiOptionPositionState optionsDetailPageUiOptionPositionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(direction, (i & 2) != 0 ? null : bool, optionsAccountSwitcherId, optionsDetailPageToolbarState, optionsDetailPageBodyState, pageSpecificDerivedData, optionsDetailPageLoggingState, optionsDetailPageUiOptionPositionState);
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final Boolean getHasRealPosition() {
        return this.hasRealPosition;
    }

    public final OptionsAccountSwitcherId getOptionsAccountSwitcherId() {
        return this.optionsAccountSwitcherId;
    }

    public final OptionsDetailPageToolbarState getToolbarState() {
        return this.toolbarState;
    }

    public final OptionsDetailPageBodyState getBodyState() {
        return this.bodyState;
    }

    public final OptionsDetailPageTradebarDataState.PageSpecificDerivedData getTradebarData() {
        return this.tradebarData;
    }

    public final OptionsDetailPageLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final OptionsDetailPageUiOptionPositionState getUiOptionPositionState() {
        return this.uiOptionPositionState;
    }
}
