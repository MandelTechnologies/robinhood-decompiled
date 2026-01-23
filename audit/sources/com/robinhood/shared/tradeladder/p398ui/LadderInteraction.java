package com.robinhood.shared.tradeladder.p398ui;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector3;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderInteraction.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "", "ZoomStateChanged", "ZoomScaleChanged", "RowClicked", "PendingOrderDragDirectionChanged", "PendingOrderSelected", "PendingOrderDraggedOverRowChanged", "PendingOrderDragEnded", "PendingOrderClicked", "StartSideOrderClicked", "EndSideOrderClicked", "ContinueToNextFtuxState", "BackToPreviousFtuxState", "ExitFtux", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$BackToPreviousFtuxState;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ContinueToNextFtuxState;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$EndSideOrderClicked;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ExitFtux;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderClicked;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderDragDirectionChanged;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderDragEnded;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderDraggedOverRowChanged;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderSelected;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$RowClicked;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$StartSideOrderClicked;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ZoomScaleChanged;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ZoomStateChanged;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface LadderInteraction {

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ZoomStateChanged;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "started", "", "zoomCenterIndex", "", "zoomNumberOfItems", "<init>", "(ZLjava/lang/Integer;Ljava/lang/Integer;)V", "getStarted", "()Z", "getZoomCenterIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getZoomNumberOfItems", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ZoomStateChanged;", "equals", "other", "", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ZoomStateChanged implements LadderInteraction {
        public static final int $stable = 0;
        private final boolean started;
        private final Integer zoomCenterIndex;
        private final Integer zoomNumberOfItems;

        public static /* synthetic */ ZoomStateChanged copy$default(ZoomStateChanged zoomStateChanged, boolean z, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = zoomStateChanged.started;
            }
            if ((i & 2) != 0) {
                num = zoomStateChanged.zoomCenterIndex;
            }
            if ((i & 4) != 0) {
                num2 = zoomStateChanged.zoomNumberOfItems;
            }
            return zoomStateChanged.copy(z, num, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getStarted() {
            return this.started;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getZoomCenterIndex() {
            return this.zoomCenterIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getZoomNumberOfItems() {
            return this.zoomNumberOfItems;
        }

        public final ZoomStateChanged copy(boolean started, Integer zoomCenterIndex, Integer zoomNumberOfItems) {
            return new ZoomStateChanged(started, zoomCenterIndex, zoomNumberOfItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZoomStateChanged)) {
                return false;
            }
            ZoomStateChanged zoomStateChanged = (ZoomStateChanged) other;
            return this.started == zoomStateChanged.started && Intrinsics.areEqual(this.zoomCenterIndex, zoomStateChanged.zoomCenterIndex) && Intrinsics.areEqual(this.zoomNumberOfItems, zoomStateChanged.zoomNumberOfItems);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.started) * 31;
            Integer num = this.zoomCenterIndex;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.zoomNumberOfItems;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "ZoomStateChanged(started=" + this.started + ", zoomCenterIndex=" + this.zoomCenterIndex + ", zoomNumberOfItems=" + this.zoomNumberOfItems + ")";
        }

        public ZoomStateChanged(boolean z, Integer num, Integer num2) {
            this.started = z;
            this.zoomCenterIndex = num;
            this.zoomNumberOfItems = num2;
        }

        public final boolean getStarted() {
            return this.started;
        }

        public final Integer getZoomCenterIndex() {
            return this.zoomCenterIndex;
        }

        public final Integer getZoomNumberOfItems() {
            return this.zoomNumberOfItems;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ZoomScaleChanged;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "zoomScale", "", "currentCenterIndex", "zoomCenterIndex", "zoomNumberOfItems", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;)V", "getZoomScale", "()I", "getCurrentCenterIndex", "getZoomCenterIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getZoomNumberOfItems", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;)Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ZoomScaleChanged;", "equals", "", "other", "", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ZoomScaleChanged implements LadderInteraction {
        public static final int $stable = 0;
        private final int currentCenterIndex;
        private final Integer zoomCenterIndex;
        private final Integer zoomNumberOfItems;
        private final int zoomScale;

        public static /* synthetic */ ZoomScaleChanged copy$default(ZoomScaleChanged zoomScaleChanged, int i, int i2, Integer num, Integer num2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = zoomScaleChanged.zoomScale;
            }
            if ((i3 & 2) != 0) {
                i2 = zoomScaleChanged.currentCenterIndex;
            }
            if ((i3 & 4) != 0) {
                num = zoomScaleChanged.zoomCenterIndex;
            }
            if ((i3 & 8) != 0) {
                num2 = zoomScaleChanged.zoomNumberOfItems;
            }
            return zoomScaleChanged.copy(i, i2, num, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getZoomScale() {
            return this.zoomScale;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCurrentCenterIndex() {
            return this.currentCenterIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getZoomCenterIndex() {
            return this.zoomCenterIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getZoomNumberOfItems() {
            return this.zoomNumberOfItems;
        }

        public final ZoomScaleChanged copy(int zoomScale, int currentCenterIndex, Integer zoomCenterIndex, Integer zoomNumberOfItems) {
            return new ZoomScaleChanged(zoomScale, currentCenterIndex, zoomCenterIndex, zoomNumberOfItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZoomScaleChanged)) {
                return false;
            }
            ZoomScaleChanged zoomScaleChanged = (ZoomScaleChanged) other;
            return this.zoomScale == zoomScaleChanged.zoomScale && this.currentCenterIndex == zoomScaleChanged.currentCenterIndex && Intrinsics.areEqual(this.zoomCenterIndex, zoomScaleChanged.zoomCenterIndex) && Intrinsics.areEqual(this.zoomNumberOfItems, zoomScaleChanged.zoomNumberOfItems);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.zoomScale) * 31) + Integer.hashCode(this.currentCenterIndex)) * 31;
            Integer num = this.zoomCenterIndex;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.zoomNumberOfItems;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "ZoomScaleChanged(zoomScale=" + this.zoomScale + ", currentCenterIndex=" + this.currentCenterIndex + ", zoomCenterIndex=" + this.zoomCenterIndex + ", zoomNumberOfItems=" + this.zoomNumberOfItems + ")";
        }

        public ZoomScaleChanged(int i, int i2, Integer num, Integer num2) {
            this.zoomScale = i;
            this.currentCenterIndex = i2;
            this.zoomCenterIndex = num;
            this.zoomNumberOfItems = num2;
        }

        public /* synthetic */ ZoomScaleChanged(int i, int i2, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2);
        }

        public final int getZoomScale() {
            return this.zoomScale;
        }

        public final int getCurrentCenterIndex() {
            return this.currentCenterIndex;
        }

        public final Integer getZoomCenterIndex() {
            return this.zoomCenterIndex;
        }

        public final Integer getZoomNumberOfItems() {
            return this.zoomNumberOfItems;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$RowClicked;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RowClicked implements LadderInteraction {
        public static final int $stable = 0;
        private final int index;

        public static /* synthetic */ RowClicked copy$default(RowClicked rowClicked, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rowClicked.index;
            }
            return rowClicked.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final RowClicked copy(int index) {
            return new RowClicked(index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RowClicked) && this.index == ((RowClicked) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return "RowClicked(index=" + this.index + ")";
        }

        public RowClicked(int i) {
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderDragDirectionChanged;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "dragDirection", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;)V", "getDragDirection", "()Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingOrderDragDirectionChanged implements LadderInteraction {
        public static final int $stable = 0;
        private final LadderCustomGestureDetector3 dragDirection;

        public static /* synthetic */ PendingOrderDragDirectionChanged copy$default(PendingOrderDragDirectionChanged pendingOrderDragDirectionChanged, LadderCustomGestureDetector3 ladderCustomGestureDetector3, int i, Object obj) {
            if ((i & 1) != 0) {
                ladderCustomGestureDetector3 = pendingOrderDragDirectionChanged.dragDirection;
            }
            return pendingOrderDragDirectionChanged.copy(ladderCustomGestureDetector3);
        }

        /* renamed from: component1, reason: from getter */
        public final LadderCustomGestureDetector3 getDragDirection() {
            return this.dragDirection;
        }

        public final PendingOrderDragDirectionChanged copy(LadderCustomGestureDetector3 dragDirection) {
            return new PendingOrderDragDirectionChanged(dragDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingOrderDragDirectionChanged) && this.dragDirection == ((PendingOrderDragDirectionChanged) other).dragDirection;
        }

        public int hashCode() {
            LadderCustomGestureDetector3 ladderCustomGestureDetector3 = this.dragDirection;
            if (ladderCustomGestureDetector3 == null) {
                return 0;
            }
            return ladderCustomGestureDetector3.hashCode();
        }

        public String toString() {
            return "PendingOrderDragDirectionChanged(dragDirection=" + this.dragDirection + ")";
        }

        public PendingOrderDragDirectionChanged(LadderCustomGestureDetector3 ladderCustomGestureDetector3) {
            this.dragDirection = ladderCustomGestureDetector3;
        }

        public final LadderCustomGestureDetector3 getDragDirection() {
            return this.dragDirection;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderSelected;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "selectedPendingOrders", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;)V", "getSelectedPendingOrders", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingOrderSelected implements LadderInteraction {
        public static final int $stable = 8;
        private final LadderState.LadderData.SelectedPendingOrders selectedPendingOrders;

        public static /* synthetic */ PendingOrderSelected copy$default(PendingOrderSelected pendingOrderSelected, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, int i, Object obj) {
            if ((i & 1) != 0) {
                selectedPendingOrders = pendingOrderSelected.selectedPendingOrders;
            }
            return pendingOrderSelected.copy(selectedPendingOrders);
        }

        /* renamed from: component1, reason: from getter */
        public final LadderState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
            return this.selectedPendingOrders;
        }

        public final PendingOrderSelected copy(LadderState.LadderData.SelectedPendingOrders selectedPendingOrders) {
            Intrinsics.checkNotNullParameter(selectedPendingOrders, "selectedPendingOrders");
            return new PendingOrderSelected(selectedPendingOrders);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingOrderSelected) && Intrinsics.areEqual(this.selectedPendingOrders, ((PendingOrderSelected) other).selectedPendingOrders);
        }

        public int hashCode() {
            return this.selectedPendingOrders.hashCode();
        }

        public String toString() {
            return "PendingOrderSelected(selectedPendingOrders=" + this.selectedPendingOrders + ")";
        }

        public PendingOrderSelected(LadderState.LadderData.SelectedPendingOrders selectedPendingOrders) {
            Intrinsics.checkNotNullParameter(selectedPendingOrders, "selectedPendingOrders");
            this.selectedPendingOrders = selectedPendingOrders;
        }

        public final LadderState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
            return this.selectedPendingOrders;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderDraggedOverRowChanged;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "newDraggedOverIndex", "", "<init>", "(I)V", "getNewDraggedOverIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingOrderDraggedOverRowChanged implements LadderInteraction {
        public static final int $stable = 0;
        private final int newDraggedOverIndex;

        public static /* synthetic */ PendingOrderDraggedOverRowChanged copy$default(PendingOrderDraggedOverRowChanged pendingOrderDraggedOverRowChanged, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pendingOrderDraggedOverRowChanged.newDraggedOverIndex;
            }
            return pendingOrderDraggedOverRowChanged.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNewDraggedOverIndex() {
            return this.newDraggedOverIndex;
        }

        public final PendingOrderDraggedOverRowChanged copy(int newDraggedOverIndex) {
            return new PendingOrderDraggedOverRowChanged(newDraggedOverIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingOrderDraggedOverRowChanged) && this.newDraggedOverIndex == ((PendingOrderDraggedOverRowChanged) other).newDraggedOverIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.newDraggedOverIndex);
        }

        public String toString() {
            return "PendingOrderDraggedOverRowChanged(newDraggedOverIndex=" + this.newDraggedOverIndex + ")";
        }

        public PendingOrderDraggedOverRowChanged(int i) {
            this.newDraggedOverIndex = i;
        }

        public final int getNewDraggedOverIndex() {
            return this.newDraggedOverIndex;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderDragEnded;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "success", "", "isDelete", "<init>", "(ZZ)V", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingOrderDragEnded implements LadderInteraction {
        public static final int $stable = 0;
        private final boolean isDelete;
        private final boolean success;

        public static /* synthetic */ PendingOrderDragEnded copy$default(PendingOrderDragEnded pendingOrderDragEnded, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = pendingOrderDragEnded.success;
            }
            if ((i & 2) != 0) {
                z2 = pendingOrderDragEnded.isDelete;
            }
            return pendingOrderDragEnded.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsDelete() {
            return this.isDelete;
        }

        public final PendingOrderDragEnded copy(boolean success, boolean isDelete) {
            return new PendingOrderDragEnded(success, isDelete);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingOrderDragEnded)) {
                return false;
            }
            PendingOrderDragEnded pendingOrderDragEnded = (PendingOrderDragEnded) other;
            return this.success == pendingOrderDragEnded.success && this.isDelete == pendingOrderDragEnded.isDelete;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.isDelete);
        }

        public String toString() {
            return "PendingOrderDragEnded(success=" + this.success + ", isDelete=" + this.isDelete + ")";
        }

        public PendingOrderDragEnded(boolean z, boolean z2) {
            this.success = z;
            this.isDelete = z2;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final boolean isDelete() {
            return this.isDelete;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$PendingOrderClicked;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "selectedPendingOrders", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;)V", "getSelectedPendingOrders", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingOrderClicked implements LadderInteraction {
        public static final int $stable = 8;
        private final LadderState.LadderData.SelectedPendingOrders selectedPendingOrders;

        public static /* synthetic */ PendingOrderClicked copy$default(PendingOrderClicked pendingOrderClicked, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, int i, Object obj) {
            if ((i & 1) != 0) {
                selectedPendingOrders = pendingOrderClicked.selectedPendingOrders;
            }
            return pendingOrderClicked.copy(selectedPendingOrders);
        }

        /* renamed from: component1, reason: from getter */
        public final LadderState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
            return this.selectedPendingOrders;
        }

        public final PendingOrderClicked copy(LadderState.LadderData.SelectedPendingOrders selectedPendingOrders) {
            Intrinsics.checkNotNullParameter(selectedPendingOrders, "selectedPendingOrders");
            return new PendingOrderClicked(selectedPendingOrders);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingOrderClicked) && Intrinsics.areEqual(this.selectedPendingOrders, ((PendingOrderClicked) other).selectedPendingOrders);
        }

        public int hashCode() {
            return this.selectedPendingOrders.hashCode();
        }

        public String toString() {
            return "PendingOrderClicked(selectedPendingOrders=" + this.selectedPendingOrders + ")";
        }

        public PendingOrderClicked(LadderState.LadderData.SelectedPendingOrders selectedPendingOrders) {
            Intrinsics.checkNotNullParameter(selectedPendingOrders, "selectedPendingOrders");
            this.selectedPendingOrders = selectedPendingOrders;
        }

        public final LadderState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
            return this.selectedPendingOrders;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$StartSideOrderClicked;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "orderType", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "orderTrigger", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "<init>", "(ILcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;)V", "getIndex", "()I", "getOrderType", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "getOrderTrigger", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartSideOrderClicked implements LadderInteraction {
        public static final int $stable = 0;
        private final int index;
        private final OrderTrigger orderTrigger;
        private final OrderType orderType;

        public static /* synthetic */ StartSideOrderClicked copy$default(StartSideOrderClicked startSideOrderClicked, int i, OrderType orderType, OrderTrigger orderTrigger, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = startSideOrderClicked.index;
            }
            if ((i2 & 2) != 0) {
                orderType = startSideOrderClicked.orderType;
            }
            if ((i2 & 4) != 0) {
                orderTrigger = startSideOrderClicked.orderTrigger;
            }
            return startSideOrderClicked.copy(i, orderType, orderTrigger);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderType getOrderType() {
            return this.orderType;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderTrigger getOrderTrigger() {
            return this.orderTrigger;
        }

        public final StartSideOrderClicked copy(int index, OrderType orderType, OrderTrigger orderTrigger) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderTrigger, "orderTrigger");
            return new StartSideOrderClicked(index, orderType, orderTrigger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartSideOrderClicked)) {
                return false;
            }
            StartSideOrderClicked startSideOrderClicked = (StartSideOrderClicked) other;
            return this.index == startSideOrderClicked.index && this.orderType == startSideOrderClicked.orderType && this.orderTrigger == startSideOrderClicked.orderTrigger;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.index) * 31) + this.orderType.hashCode()) * 31) + this.orderTrigger.hashCode();
        }

        public String toString() {
            return "StartSideOrderClicked(index=" + this.index + ", orderType=" + this.orderType + ", orderTrigger=" + this.orderTrigger + ")";
        }

        public StartSideOrderClicked(int i, OrderType orderType, OrderTrigger orderTrigger) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderTrigger, "orderTrigger");
            this.index = i;
            this.orderType = orderType;
            this.orderTrigger = orderTrigger;
        }

        public final int getIndex() {
            return this.index;
        }

        public final OrderType getOrderType() {
            return this.orderType;
        }

        public final OrderTrigger getOrderTrigger() {
            return this.orderTrigger;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$EndSideOrderClicked;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "orderType", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "orderTrigger", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "<init>", "(ILcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;)V", "getIndex", "()I", "getOrderType", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "getOrderTrigger", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EndSideOrderClicked implements LadderInteraction {
        public static final int $stable = 0;
        private final int index;
        private final OrderTrigger orderTrigger;
        private final OrderType orderType;

        public static /* synthetic */ EndSideOrderClicked copy$default(EndSideOrderClicked endSideOrderClicked, int i, OrderType orderType, OrderTrigger orderTrigger, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = endSideOrderClicked.index;
            }
            if ((i2 & 2) != 0) {
                orderType = endSideOrderClicked.orderType;
            }
            if ((i2 & 4) != 0) {
                orderTrigger = endSideOrderClicked.orderTrigger;
            }
            return endSideOrderClicked.copy(i, orderType, orderTrigger);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderType getOrderType() {
            return this.orderType;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderTrigger getOrderTrigger() {
            return this.orderTrigger;
        }

        public final EndSideOrderClicked copy(int index, OrderType orderType, OrderTrigger orderTrigger) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderTrigger, "orderTrigger");
            return new EndSideOrderClicked(index, orderType, orderTrigger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EndSideOrderClicked)) {
                return false;
            }
            EndSideOrderClicked endSideOrderClicked = (EndSideOrderClicked) other;
            return this.index == endSideOrderClicked.index && this.orderType == endSideOrderClicked.orderType && this.orderTrigger == endSideOrderClicked.orderTrigger;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.index) * 31) + this.orderType.hashCode()) * 31) + this.orderTrigger.hashCode();
        }

        public String toString() {
            return "EndSideOrderClicked(index=" + this.index + ", orderType=" + this.orderType + ", orderTrigger=" + this.orderTrigger + ")";
        }

        public EndSideOrderClicked(int i, OrderType orderType, OrderTrigger orderTrigger) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderTrigger, "orderTrigger");
            this.index = i;
            this.orderType = orderType;
            this.orderTrigger = orderTrigger;
        }

        public final int getIndex() {
            return this.index;
        }

        public final OrderType getOrderType() {
            return this.orderType;
        }

        public final OrderTrigger getOrderTrigger() {
            return this.orderTrigger;
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ContinueToNextFtuxState;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContinueToNextFtuxState implements LadderInteraction {
        public static final int $stable = 0;
        public static final ContinueToNextFtuxState INSTANCE = new ContinueToNextFtuxState();

        public boolean equals(Object other) {
            return this == other || (other instanceof ContinueToNextFtuxState);
        }

        public int hashCode() {
            return 467195919;
        }

        public String toString() {
            return "ContinueToNextFtuxState";
        }

        private ContinueToNextFtuxState() {
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$BackToPreviousFtuxState;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BackToPreviousFtuxState implements LadderInteraction {
        public static final int $stable = 0;
        public static final BackToPreviousFtuxState INSTANCE = new BackToPreviousFtuxState();

        public boolean equals(Object other) {
            return this == other || (other instanceof BackToPreviousFtuxState);
        }

        public int hashCode() {
            return 1593060683;
        }

        public String toString() {
            return "BackToPreviousFtuxState";
        }

        private BackToPreviousFtuxState() {
        }
    }

    /* compiled from: LadderInteraction.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/LadderInteraction$ExitFtux;", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExitFtux implements LadderInteraction {
        public static final int $stable = 0;
        public static final ExitFtux INSTANCE = new ExitFtux();

        public boolean equals(Object other) {
            return this == other || (other instanceof ExitFtux);
        }

        public int hashCode() {
            return 1348506027;
        }

        public String toString() {
            return "ExitFtux";
        }

        private ExitFtux() {
        }
    }
}
