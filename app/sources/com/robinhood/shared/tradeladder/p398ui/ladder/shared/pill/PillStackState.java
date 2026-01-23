package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector3;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AnimatedPendingOrderPillStack.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0001<B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\u0019\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000J\u0006\u0010\u001d\u001a\u00020\u0013J\t\u00103\u001a\u00020\u0003HÂ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0005HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u001f\u0010\u000bR\u0018\u0010 \u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b!\u0010\u000bR\u0010\u0010\"\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010(\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0011\u0010*\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b2\u00100¨\u0006="}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackState;", "", "orderGroup", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow$Group;", "selectedIndex", "", "dragDirection", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow$Group;Ljava/lang/Integer;Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;)V", "getSelectedIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDragDirection", "()Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "orderStack", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$UiPendingOrder;", "isDraggingVertically", "", "isDraggingHorizontally", "hasSameOrderStack", "other", "isTransitioningFromGroupedToSinglePillSelectionState", "previous", "isTransitioningFromSinglePillSelectionToGroupedState", "isPushingNewPillToTopWhenThereAreTwoOrMoreOrdersInStack", "isPushingNewPillToTopButOnlyOnePillIsVisibleInStack", "isDroppingSelectedPillBackToTheStackAndTopPillShouldPushBackToBottom", "isDraggingToDeleteAndOnlyBottomPillShouldShowUp", "firstOrderIndex", "getFirstOrderIndex$lib_trade_ladder_externalDebug", "secondOrderIndex", "getSecondOrderIndex$lib_trade_ladder_externalDebug", "firstOrder", "secondOrder", "firstLabel", "Lcom/robinhood/utils/resource/StringResource;", "getFirstLabel", "()Lcom/robinhood/utils/resource/StringResource;", "secondLabel", "getSecondLabel", "isFirstOrderPlaceholder", "()Z", "isSecondOrderPlaceholder", "firstStyle", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "getFirstStyle", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "secondStyle", "getSecondStyle", "component1", "component2", "component3", "copy", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow$Group;Ljava/lang/Integer;Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackState;", "equals", "hashCode", "toString", "", "Companion", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class PillStackState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final LadderCustomGestureDetector3 dragDirection;
    private final StringResource firstLabel;
    private final LadderState.LadderData.UiPendingOrder firstOrder;
    private final Integer firstOrderIndex;
    private final PillStyle.PillVisualState firstStyle;
    private final boolean isDraggingHorizontally;
    private final boolean isDraggingVertically;
    private final boolean isFirstOrderPlaceholder;
    private final boolean isSecondOrderPlaceholder;
    private final LadderState.LadderData.PendingOrderRow.Group orderGroup;
    private final ImmutableList<LadderState.LadderData.UiPendingOrder> orderStack;
    private final StringResource secondLabel;
    private final LadderState.LadderData.UiPendingOrder secondOrder;
    private final Integer secondOrderIndex;
    private final PillStyle.PillVisualState secondStyle;
    private final Integer selectedIndex;

    /* renamed from: component1, reason: from getter */
    private final LadderState.LadderData.PendingOrderRow.Group getOrderGroup() {
        return this.orderGroup;
    }

    public static /* synthetic */ PillStackState copy$default(PillStackState pillStackState, LadderState.LadderData.PendingOrderRow.Group group, Integer num, LadderCustomGestureDetector3 ladderCustomGestureDetector3, int i, Object obj) {
        if ((i & 1) != 0) {
            group = pillStackState.orderGroup;
        }
        if ((i & 2) != 0) {
            num = pillStackState.selectedIndex;
        }
        if ((i & 4) != 0) {
            ladderCustomGestureDetector3 = pillStackState.dragDirection;
        }
        return pillStackState.copy(group, num, ladderCustomGestureDetector3);
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final LadderCustomGestureDetector3 getDragDirection() {
        return this.dragDirection;
    }

    public final PillStackState copy(LadderState.LadderData.PendingOrderRow.Group orderGroup, Integer selectedIndex, LadderCustomGestureDetector3 dragDirection) {
        Intrinsics.checkNotNullParameter(orderGroup, "orderGroup");
        return new PillStackState(orderGroup, selectedIndex, dragDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PillStackState)) {
            return false;
        }
        PillStackState pillStackState = (PillStackState) other;
        return Intrinsics.areEqual(this.orderGroup, pillStackState.orderGroup) && Intrinsics.areEqual(this.selectedIndex, pillStackState.selectedIndex) && this.dragDirection == pillStackState.dragDirection;
    }

    public int hashCode() {
        int iHashCode = this.orderGroup.hashCode() * 31;
        Integer num = this.selectedIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        LadderCustomGestureDetector3 ladderCustomGestureDetector3 = this.dragDirection;
        return iHashCode2 + (ladderCustomGestureDetector3 != null ? ladderCustomGestureDetector3.hashCode() : 0);
    }

    public String toString() {
        return "PillStackState(orderGroup=" + this.orderGroup + ", selectedIndex=" + this.selectedIndex + ", dragDirection=" + this.dragDirection + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PillStackState(LadderState.LadderData.PendingOrderRow.Group orderGroup, Integer num, LadderCustomGestureDetector3 ladderCustomGestureDetector3) {
        Integer numNextIndex;
        Integer numNextIndex2;
        StringResource label;
        Intrinsics.checkNotNullParameter(orderGroup, "orderGroup");
        this.orderGroup = orderGroup;
        this.selectedIndex = num;
        this.dragDirection = ladderCustomGestureDetector3;
        ImmutableList<LadderState.LadderData.UiPendingOrder> orders = orderGroup.getOrders();
        this.orderStack = orders;
        LadderCustomGestureDetector3 ladderCustomGestureDetector32 = LadderCustomGestureDetector3.VERTICAL;
        boolean z = false;
        this.isDraggingVertically = ladderCustomGestureDetector3 == ladderCustomGestureDetector32;
        LadderCustomGestureDetector3 ladderCustomGestureDetector33 = LadderCustomGestureDetector3.HORIZONTAL;
        this.isDraggingHorizontally = ladderCustomGestureDetector3 == ladderCustomGestureDetector33;
        if (orders.isEmpty()) {
            throw new IllegalArgumentException("PillStackState requires at least 1 active orders");
        }
        if (num == null) {
            numNextIndex = 0;
        } else if (ladderCustomGestureDetector3 == null) {
            numNextIndex = num;
        } else {
            numNextIndex = ladderCustomGestureDetector3 == ladderCustomGestureDetector33 ? null : AnimatedPendingOrderPillStackKt.nextIndex(orders, num, SetsKt.setOf(num));
        }
        this.firstOrderIndex = numNextIndex;
        if ((ladderCustomGestureDetector3 != ladderCustomGestureDetector32 || orders.size() > 2) && (ladderCustomGestureDetector3 != null || orders.size() != 1)) {
            if (ladderCustomGestureDetector3 == ladderCustomGestureDetector33) {
                numNextIndex2 = num != null ? AnimatedPendingOrderPillStackKt.nextIndex(orders, num, SetsKt.setOf(num)) : null;
            } else {
                numNextIndex2 = AnimatedPendingOrderPillStackKt.nextIndex(orders, numNextIndex, SetsKt.setOfNotNull((Object[]) new Integer[]{num, numNextIndex}));
            }
        }
        this.secondOrderIndex = numNextIndex2;
        LadderState.LadderData.UiPendingOrder uiPendingOrder = numNextIndex != null ? orders.get(numNextIndex.intValue()) : null;
        this.firstOrder = uiPendingOrder;
        LadderState.LadderData.UiPendingOrder uiPendingOrder2 = numNextIndex2 != null ? orders.get(numNextIndex2.intValue()) : null;
        this.secondOrder = uiPendingOrder2;
        if (num == null) {
            label = orderGroup.getGroupLabel();
        } else {
            label = uiPendingOrder != null ? uiPendingOrder.getLabel() : null;
        }
        this.firstLabel = label;
        this.secondLabel = uiPendingOrder2 != null ? uiPendingOrder2.getLabel() : null;
        this.isFirstOrderPlaceholder = uiPendingOrder != null && uiPendingOrder.isPlaceholder();
        if (uiPendingOrder2 != null && uiPendingOrder2.isPlaceholder()) {
            z = true;
        }
        this.isSecondOrderPlaceholder = z;
        this.firstStyle = uiPendingOrder != null ? uiPendingOrder.getVisualState() : null;
        this.secondStyle = uiPendingOrder2 != null ? uiPendingOrder2.getVisualState() : null;
    }

    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public final LadderCustomGestureDetector3 getDragDirection() {
        return this.dragDirection;
    }

    private final boolean hasSameOrderStack(PillStackState other) {
        if (other == null) {
            return false;
        }
        return Intrinsics.areEqual(this.orderStack, other.orderStack);
    }

    public final boolean isTransitioningFromGroupedToSinglePillSelectionState(PillStackState previous) {
        if (previous == null || hasSameOrderStack(previous)) {
            return (previous != null ? previous.selectedIndex : null) == null && this.selectedIndex != null && this.orderStack.size() >= 2;
        }
        return false;
    }

    public final boolean isTransitioningFromSinglePillSelectionToGroupedState(PillStackState previous) {
        return (previous != null ? previous.selectedIndex : null) != null && this.selectedIndex == null && this.dragDirection == null && this.orderStack.size() >= 2;
    }

    public final boolean isPushingNewPillToTopWhenThereAreTwoOrMoreOrdersInStack(PillStackState previous) {
        if (previous == null) {
            return false;
        }
        return (hasSameOrderStack(previous) && !Intrinsics.areEqual(this.selectedIndex, previous.selectedIndex) && this.orderStack.size() >= 2) || (this.selectedIndex != null && this.isDraggingVertically && this.orderStack.size() > 2);
    }

    public final boolean isPushingNewPillToTopButOnlyOnePillIsVisibleInStack(PillStackState previous) {
        if (previous == null) {
            return false;
        }
        return (this.selectedIndex != null && this.isDraggingVertically && this.orderStack.size() == 2) || (this.selectedIndex == null && this.orderStack.size() == 1 && previous.orderStack.size() > 1 && previous.isDraggingHorizontally);
    }

    /* renamed from: isDroppingSelectedPillBackToTheStackAndTopPillShouldPushBackToBottom */
    public final boolean m2958xe74f6289(PillStackState previous) {
        return previous != null && previous.selectedIndex != null && previous.isDraggingVertically && this.dragDirection == null && this.orderStack.size() == 2;
    }

    public final boolean isDraggingToDeleteAndOnlyBottomPillShouldShowUp() {
        return this.dragDirection == LadderCustomGestureDetector3.HORIZONTAL && this.selectedIndex != null && this.orderStack.size() >= 2;
    }

    /* renamed from: getFirstOrderIndex$lib_trade_ladder_externalDebug, reason: from getter */
    public final Integer getFirstOrderIndex() {
        return this.firstOrderIndex;
    }

    /* renamed from: getSecondOrderIndex$lib_trade_ladder_externalDebug, reason: from getter */
    public final Integer getSecondOrderIndex() {
        return this.secondOrderIndex;
    }

    public final StringResource getFirstLabel() {
        return this.firstLabel;
    }

    public final StringResource getSecondLabel() {
        return this.secondLabel;
    }

    /* renamed from: isFirstOrderPlaceholder, reason: from getter */
    public final boolean getIsFirstOrderPlaceholder() {
        return this.isFirstOrderPlaceholder;
    }

    /* renamed from: isSecondOrderPlaceholder, reason: from getter */
    public final boolean getIsSecondOrderPlaceholder() {
        return this.isSecondOrderPlaceholder;
    }

    public final PillStyle.PillVisualState getFirstStyle() {
        return this.firstStyle;
    }

    public final PillStyle.PillVisualState getSecondStyle() {
        return this.secondStyle;
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackState$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackState;", "orderGroup", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow$Group;", "selectedIndex", "", "dragDirection", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow$Group;Ljava/lang/Integer;Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackState;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PillStackState from(LadderState.LadderData.PendingOrderRow.Group orderGroup, Integer selectedIndex, LadderCustomGestureDetector3 dragDirection) {
            Intrinsics.checkNotNullParameter(orderGroup, "orderGroup");
            ImmutableList<LadderState.LadderData.UiPendingOrder> orders = orderGroup.getOrders();
            if (orders.isEmpty()) {
                return null;
            }
            if (dragDirection == null || !(selectedIndex == null || orders.size() == 1)) {
                return new PillStackState(orderGroup, selectedIndex, dragDirection);
            }
            return null;
        }
    }
}
