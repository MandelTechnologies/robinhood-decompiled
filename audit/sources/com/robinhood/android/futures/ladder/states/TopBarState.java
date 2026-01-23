package com.robinhood.android.futures.ladder.states;

import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopBarState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001@By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010#J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\u0098\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u000eHÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010 R\u0011\u0010*\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 ¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/futures/ladder/states/TopBarState;", "", "contractId", "Ljava/util/UUID;", "futuresAccountId", "title", "Lcom/robinhood/utils/resource/StringResource;", "dayPL", "Ljava/math/BigDecimal;", "openPL", "hasPosition", "", "positionsDisplay", "pendingOrderQuantity", "", "flattenData", "Lcom/robinhood/android/futures/ladder/states/TopBarState$FlattenButtonData;", "showPnlPriceSwitcherTooltip", "hasOrdersForContract", "dayDeltaDisplay", "isDayDeltaUp", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Lcom/robinhood/android/futures/ladder/states/TopBarState$FlattenButtonData;ZZLcom/robinhood/utils/resource/StringResource;Z)V", "getContractId", "()Ljava/util/UUID;", "getFuturesAccountId", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDayPL", "()Ljava/math/BigDecimal;", "getOpenPL", "getHasPosition", "()Z", "getPositionsDisplay", "getPendingOrderQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFlattenData", "()Lcom/robinhood/android/futures/ladder/states/TopBarState$FlattenButtonData;", "getShowPnlPriceSwitcherTooltip", "getHasOrdersForContract", "getDayDeltaDisplay", "canClickOnPendingOrders", "getCanClickOnPendingOrders", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Lcom/robinhood/android/futures/ladder/states/TopBarState$FlattenButtonData;ZZLcom/robinhood/utils/resource/StringResource;Z)Lcom/robinhood/android/futures/ladder/states/TopBarState;", "equals", "other", "hashCode", "toString", "", "FlattenButtonData", "lib-futures-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopBarState {
    public static final int $stable = 8;
    private final boolean canClickOnPendingOrders;
    private final UUID contractId;
    private final StringResource dayDeltaDisplay;
    private final BigDecimal dayPL;
    private final FlattenButtonData flattenData;
    private final UUID futuresAccountId;
    private final boolean hasOrdersForContract;
    private final boolean hasPosition;
    private final boolean isDayDeltaUp;
    private final BigDecimal openPL;
    private final Integer pendingOrderQuantity;
    private final StringResource positionsDisplay;
    private final boolean showPnlPriceSwitcherTooltip;
    private final StringResource title;

    public static /* synthetic */ TopBarState copy$default(TopBarState topBarState, UUID uuid, UUID uuid2, StringResource stringResource, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource stringResource2, Integer num, FlattenButtonData flattenButtonData, boolean z2, boolean z3, StringResource stringResource3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = topBarState.contractId;
        }
        return topBarState.copy(uuid, (i & 2) != 0 ? topBarState.futuresAccountId : uuid2, (i & 4) != 0 ? topBarState.title : stringResource, (i & 8) != 0 ? topBarState.dayPL : bigDecimal, (i & 16) != 0 ? topBarState.openPL : bigDecimal2, (i & 32) != 0 ? topBarState.hasPosition : z, (i & 64) != 0 ? topBarState.positionsDisplay : stringResource2, (i & 128) != 0 ? topBarState.pendingOrderQuantity : num, (i & 256) != 0 ? topBarState.flattenData : flattenButtonData, (i & 512) != 0 ? topBarState.showPnlPriceSwitcherTooltip : z2, (i & 1024) != 0 ? topBarState.hasOrdersForContract : z3, (i & 2048) != 0 ? topBarState.dayDeltaDisplay : stringResource3, (i & 4096) != 0 ? topBarState.isDayDeltaUp : z4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowPnlPriceSwitcherTooltip() {
        return this.showPnlPriceSwitcherTooltip;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasOrdersForContract() {
        return this.hasOrdersForContract;
    }

    /* renamed from: component12, reason: from getter */
    public final StringResource getDayDeltaDisplay() {
        return this.dayDeltaDisplay;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsDayDeltaUp() {
        return this.isDayDeltaUp;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getFuturesAccountId() {
        return this.futuresAccountId;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getDayPL() {
        return this.dayPL;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getOpenPL() {
        return this.openPL;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getPositionsDisplay() {
        return this.positionsDisplay;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getPendingOrderQuantity() {
        return this.pendingOrderQuantity;
    }

    /* renamed from: component9, reason: from getter */
    public final FlattenButtonData getFlattenData() {
        return this.flattenData;
    }

    public final TopBarState copy(UUID contractId, UUID futuresAccountId, StringResource title, BigDecimal dayPL, BigDecimal openPL, boolean hasPosition, StringResource positionsDisplay, Integer pendingOrderQuantity, FlattenButtonData flattenData, boolean showPnlPriceSwitcherTooltip, boolean hasOrdersForContract, StringResource dayDeltaDisplay, boolean isDayDeltaUp) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(positionsDisplay, "positionsDisplay");
        Intrinsics.checkNotNullParameter(flattenData, "flattenData");
        Intrinsics.checkNotNullParameter(dayDeltaDisplay, "dayDeltaDisplay");
        return new TopBarState(contractId, futuresAccountId, title, dayPL, openPL, hasPosition, positionsDisplay, pendingOrderQuantity, flattenData, showPnlPriceSwitcherTooltip, hasOrdersForContract, dayDeltaDisplay, isDayDeltaUp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopBarState)) {
            return false;
        }
        TopBarState topBarState = (TopBarState) other;
        return Intrinsics.areEqual(this.contractId, topBarState.contractId) && Intrinsics.areEqual(this.futuresAccountId, topBarState.futuresAccountId) && Intrinsics.areEqual(this.title, topBarState.title) && Intrinsics.areEqual(this.dayPL, topBarState.dayPL) && Intrinsics.areEqual(this.openPL, topBarState.openPL) && this.hasPosition == topBarState.hasPosition && Intrinsics.areEqual(this.positionsDisplay, topBarState.positionsDisplay) && Intrinsics.areEqual(this.pendingOrderQuantity, topBarState.pendingOrderQuantity) && Intrinsics.areEqual(this.flattenData, topBarState.flattenData) && this.showPnlPriceSwitcherTooltip == topBarState.showPnlPriceSwitcherTooltip && this.hasOrdersForContract == topBarState.hasOrdersForContract && Intrinsics.areEqual(this.dayDeltaDisplay, topBarState.dayDeltaDisplay) && this.isDayDeltaUp == topBarState.isDayDeltaUp;
    }

    public int hashCode() {
        int iHashCode = this.contractId.hashCode() * 31;
        UUID uuid = this.futuresAccountId;
        int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.title.hashCode()) * 31;
        BigDecimal bigDecimal = this.dayPL;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.openPL;
        int iHashCode4 = (((((iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.hasPosition)) * 31) + this.positionsDisplay.hashCode()) * 31;
        Integer num = this.pendingOrderQuantity;
        return ((((((((((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.flattenData.hashCode()) * 31) + Boolean.hashCode(this.showPnlPriceSwitcherTooltip)) * 31) + Boolean.hashCode(this.hasOrdersForContract)) * 31) + this.dayDeltaDisplay.hashCode()) * 31) + Boolean.hashCode(this.isDayDeltaUp);
    }

    public String toString() {
        return "TopBarState(contractId=" + this.contractId + ", futuresAccountId=" + this.futuresAccountId + ", title=" + this.title + ", dayPL=" + this.dayPL + ", openPL=" + this.openPL + ", hasPosition=" + this.hasPosition + ", positionsDisplay=" + this.positionsDisplay + ", pendingOrderQuantity=" + this.pendingOrderQuantity + ", flattenData=" + this.flattenData + ", showPnlPriceSwitcherTooltip=" + this.showPnlPriceSwitcherTooltip + ", hasOrdersForContract=" + this.hasOrdersForContract + ", dayDeltaDisplay=" + this.dayDeltaDisplay + ", isDayDeltaUp=" + this.isDayDeltaUp + ")";
    }

    public TopBarState(UUID contractId, UUID uuid, StringResource title, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource positionsDisplay, Integer num, FlattenButtonData flattenData, boolean z2, boolean z3, StringResource dayDeltaDisplay, boolean z4) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(positionsDisplay, "positionsDisplay");
        Intrinsics.checkNotNullParameter(flattenData, "flattenData");
        Intrinsics.checkNotNullParameter(dayDeltaDisplay, "dayDeltaDisplay");
        this.contractId = contractId;
        this.futuresAccountId = uuid;
        this.title = title;
        this.dayPL = bigDecimal;
        this.openPL = bigDecimal2;
        this.hasPosition = z;
        this.positionsDisplay = positionsDisplay;
        this.pendingOrderQuantity = num;
        this.flattenData = flattenData;
        this.showPnlPriceSwitcherTooltip = z2;
        this.hasOrdersForContract = z3;
        this.dayDeltaDisplay = dayDeltaDisplay;
        this.isDayDeltaUp = z4;
        this.canClickOnPendingOrders = z3;
    }

    public /* synthetic */ TopBarState(UUID uuid, UUID uuid2, StringResource stringResource, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource stringResource2, Integer num, FlattenButtonData flattenButtonData, boolean z2, boolean z3, StringResource stringResource3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : uuid2, stringResource, bigDecimal, bigDecimal2, z, stringResource2, num, flattenButtonData, z2, z3, stringResource3, z4);
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final UUID getFuturesAccountId() {
        return this.futuresAccountId;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final BigDecimal getDayPL() {
        return this.dayPL;
    }

    public final BigDecimal getOpenPL() {
        return this.openPL;
    }

    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    public final StringResource getPositionsDisplay() {
        return this.positionsDisplay;
    }

    public final Integer getPendingOrderQuantity() {
        return this.pendingOrderQuantity;
    }

    public final FlattenButtonData getFlattenData() {
        return this.flattenData;
    }

    public final boolean getShowPnlPriceSwitcherTooltip() {
        return this.showPnlPriceSwitcherTooltip;
    }

    public final boolean getHasOrdersForContract() {
        return this.hasOrdersForContract;
    }

    public final StringResource getDayDeltaDisplay() {
        return this.dayDeltaDisplay;
    }

    public final boolean isDayDeltaUp() {
        return this.isDayDeltaUp;
    }

    public final boolean getCanClickOnPendingOrders() {
        return this.canClickOnPendingOrders;
    }

    /* compiled from: TopBarState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/ladder/states/TopBarState$FlattenButtonData;", "", "isFlattenButtonVisible", "", "isFlattenButtonEnabled", "showFlattenOrdersTooltip", "<init>", "(ZZZ)V", "()Z", "getShowFlattenOrdersTooltip", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-futures-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FlattenButtonData {
        public static final int $stable = 0;
        private final boolean isFlattenButtonEnabled;
        private final boolean isFlattenButtonVisible;
        private final boolean showFlattenOrdersTooltip;

        public static /* synthetic */ FlattenButtonData copy$default(FlattenButtonData flattenButtonData, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = flattenButtonData.isFlattenButtonVisible;
            }
            if ((i & 2) != 0) {
                z2 = flattenButtonData.isFlattenButtonEnabled;
            }
            if ((i & 4) != 0) {
                z3 = flattenButtonData.showFlattenOrdersTooltip;
            }
            return flattenButtonData.copy(z, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFlattenButtonVisible() {
            return this.isFlattenButtonVisible;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFlattenButtonEnabled() {
            return this.isFlattenButtonEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowFlattenOrdersTooltip() {
            return this.showFlattenOrdersTooltip;
        }

        public final FlattenButtonData copy(boolean isFlattenButtonVisible, boolean isFlattenButtonEnabled, boolean showFlattenOrdersTooltip) {
            return new FlattenButtonData(isFlattenButtonVisible, isFlattenButtonEnabled, showFlattenOrdersTooltip);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlattenButtonData)) {
                return false;
            }
            FlattenButtonData flattenButtonData = (FlattenButtonData) other;
            return this.isFlattenButtonVisible == flattenButtonData.isFlattenButtonVisible && this.isFlattenButtonEnabled == flattenButtonData.isFlattenButtonEnabled && this.showFlattenOrdersTooltip == flattenButtonData.showFlattenOrdersTooltip;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isFlattenButtonVisible) * 31) + Boolean.hashCode(this.isFlattenButtonEnabled)) * 31) + Boolean.hashCode(this.showFlattenOrdersTooltip);
        }

        public String toString() {
            return "FlattenButtonData(isFlattenButtonVisible=" + this.isFlattenButtonVisible + ", isFlattenButtonEnabled=" + this.isFlattenButtonEnabled + ", showFlattenOrdersTooltip=" + this.showFlattenOrdersTooltip + ")";
        }

        public FlattenButtonData(boolean z, boolean z2, boolean z3) {
            this.isFlattenButtonVisible = z;
            this.isFlattenButtonEnabled = z2;
            this.showFlattenOrdersTooltip = z3;
        }

        public final boolean isFlattenButtonVisible() {
            return this.isFlattenButtonVisible;
        }

        public final boolean isFlattenButtonEnabled() {
            return this.isFlattenButtonEnabled;
        }

        public final boolean getShowFlattenOrdersTooltip() {
            return this.showFlattenOrdersTooltip;
        }
    }
}
