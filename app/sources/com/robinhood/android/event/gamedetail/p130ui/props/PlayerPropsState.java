package com.robinhood.android.event.gamedetail.p130ui.props;

import com.robinhood.android.event.gamedetail.components.ContractRowState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PlayerPropsSection.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\fHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/props/PlayerPropsState;", "", "titleState", "Lcom/robinhood/android/event/gamedetail/ui/props/PropsTitleState;", "propsSelectionBarState", "Lcom/robinhood/android/event/gamedetail/ui/props/PropsSelectionBarState;", "contractRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/components/ContractRowState;", "isExpanded", "", "totalRowCount", "", "visibleRowCount", "<init>", "(Lcom/robinhood/android/event/gamedetail/ui/props/PropsTitleState;Lcom/robinhood/android/event/gamedetail/ui/props/PropsSelectionBarState;Lkotlinx/collections/immutable/ImmutableList;ZII)V", "getTitleState", "()Lcom/robinhood/android/event/gamedetail/ui/props/PropsTitleState;", "getPropsSelectionBarState", "()Lcom/robinhood/android/event/gamedetail/ui/props/PropsSelectionBarState;", "getContractRows", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getTotalRowCount", "()I", "getVisibleRowCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlayerPropsState {
    public static final int $stable = 0;
    public static final int DEFAULT_VISIBLE_NUM_OF_PROPS = 5;
    private final ImmutableList<ContractRowState> contractRows;
    private final boolean isExpanded;
    private final PropsSelectionBarState propsSelectionBarState;
    private final PropsTitleState titleState;
    private final int totalRowCount;
    private final int visibleRowCount;

    public static /* synthetic */ PlayerPropsState copy$default(PlayerPropsState playerPropsState, PropsTitleState propsTitleState, PropsSelectionBarState propsSelectionBarState, ImmutableList immutableList, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            propsTitleState = playerPropsState.titleState;
        }
        if ((i3 & 2) != 0) {
            propsSelectionBarState = playerPropsState.propsSelectionBarState;
        }
        if ((i3 & 4) != 0) {
            immutableList = playerPropsState.contractRows;
        }
        if ((i3 & 8) != 0) {
            z = playerPropsState.isExpanded;
        }
        if ((i3 & 16) != 0) {
            i = playerPropsState.totalRowCount;
        }
        if ((i3 & 32) != 0) {
            i2 = playerPropsState.visibleRowCount;
        }
        int i4 = i;
        int i5 = i2;
        return playerPropsState.copy(propsTitleState, propsSelectionBarState, immutableList, z, i4, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final PropsTitleState getTitleState() {
        return this.titleState;
    }

    /* renamed from: component2, reason: from getter */
    public final PropsSelectionBarState getPropsSelectionBarState() {
        return this.propsSelectionBarState;
    }

    public final ImmutableList<ContractRowState> component3() {
        return this.contractRows;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalRowCount() {
        return this.totalRowCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getVisibleRowCount() {
        return this.visibleRowCount;
    }

    public final PlayerPropsState copy(PropsTitleState titleState, PropsSelectionBarState propsSelectionBarState, ImmutableList<ContractRowState> contractRows, boolean isExpanded, int totalRowCount, int visibleRowCount) {
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        Intrinsics.checkNotNullParameter(propsSelectionBarState, "propsSelectionBarState");
        Intrinsics.checkNotNullParameter(contractRows, "contractRows");
        return new PlayerPropsState(titleState, propsSelectionBarState, contractRows, isExpanded, totalRowCount, visibleRowCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerPropsState)) {
            return false;
        }
        PlayerPropsState playerPropsState = (PlayerPropsState) other;
        return Intrinsics.areEqual(this.titleState, playerPropsState.titleState) && Intrinsics.areEqual(this.propsSelectionBarState, playerPropsState.propsSelectionBarState) && Intrinsics.areEqual(this.contractRows, playerPropsState.contractRows) && this.isExpanded == playerPropsState.isExpanded && this.totalRowCount == playerPropsState.totalRowCount && this.visibleRowCount == playerPropsState.visibleRowCount;
    }

    public int hashCode() {
        return (((((((((this.titleState.hashCode() * 31) + this.propsSelectionBarState.hashCode()) * 31) + this.contractRows.hashCode()) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + Integer.hashCode(this.totalRowCount)) * 31) + Integer.hashCode(this.visibleRowCount);
    }

    public String toString() {
        return "PlayerPropsState(titleState=" + this.titleState + ", propsSelectionBarState=" + this.propsSelectionBarState + ", contractRows=" + this.contractRows + ", isExpanded=" + this.isExpanded + ", totalRowCount=" + this.totalRowCount + ", visibleRowCount=" + this.visibleRowCount + ")";
    }

    public PlayerPropsState(PropsTitleState titleState, PropsSelectionBarState propsSelectionBarState, ImmutableList<ContractRowState> contractRows, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        Intrinsics.checkNotNullParameter(propsSelectionBarState, "propsSelectionBarState");
        Intrinsics.checkNotNullParameter(contractRows, "contractRows");
        this.titleState = titleState;
        this.propsSelectionBarState = propsSelectionBarState;
        this.contractRows = contractRows;
        this.isExpanded = z;
        this.totalRowCount = i;
        this.visibleRowCount = i2;
    }

    public /* synthetic */ PlayerPropsState(PropsTitleState propsTitleState, PropsSelectionBarState propsSelectionBarState, ImmutableList immutableList, boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(propsTitleState, propsSelectionBarState, immutableList, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
    }

    public final PropsTitleState getTitleState() {
        return this.titleState;
    }

    public final PropsSelectionBarState getPropsSelectionBarState() {
        return this.propsSelectionBarState;
    }

    public final ImmutableList<ContractRowState> getContractRows() {
        return this.contractRows;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final int getTotalRowCount() {
        return this.totalRowCount;
    }

    public final int getVisibleRowCount() {
        return this.visibleRowCount;
    }
}
