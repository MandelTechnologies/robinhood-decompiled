package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: Ladder.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J3\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010&\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "bottomLabel", "position", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData$OrderPillPosition;", "closestOrderIndex", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData$OrderPillPosition;I)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getBottomLabel", "getPosition", "()Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData$OrderPillPosition;", "getClosestOrderIndex", "()I", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "isOnTop", "", "()Z", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "OrderPillPosition", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderPillData {
    private final StringResource bottomLabel;
    private final int closestOrderIndex;
    private final StringResource label;
    private final OrderPillPosition position;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = StringResource.$stable;

    /* compiled from: Ladder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderPillPosition.values().length];
            try {
                iArr[OrderPillPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPillPosition.BOTTOM_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderPillPosition.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderPillPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OrderPillData copy$default(OrderPillData orderPillData, StringResource stringResource, StringResource stringResource2, OrderPillPosition orderPillPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            stringResource = orderPillData.label;
        }
        if ((i2 & 2) != 0) {
            stringResource2 = orderPillData.bottomLabel;
        }
        if ((i2 & 4) != 0) {
            orderPillPosition = orderPillData.position;
        }
        if ((i2 & 8) != 0) {
            i = orderPillData.closestOrderIndex;
        }
        return orderPillData.copy(stringResource, stringResource2, orderPillPosition, i);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getBottomLabel() {
        return this.bottomLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderPillPosition getPosition() {
        return this.position;
    }

    /* renamed from: component4, reason: from getter */
    public final int getClosestOrderIndex() {
        return this.closestOrderIndex;
    }

    public final OrderPillData copy(StringResource label, StringResource bottomLabel, OrderPillPosition position, int closestOrderIndex) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(position, "position");
        return new OrderPillData(label, bottomLabel, position, closestOrderIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPillData)) {
            return false;
        }
        OrderPillData orderPillData = (OrderPillData) other;
        return Intrinsics.areEqual(this.label, orderPillData.label) && Intrinsics.areEqual(this.bottomLabel, orderPillData.bottomLabel) && this.position == orderPillData.position && this.closestOrderIndex == orderPillData.closestOrderIndex;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        StringResource stringResource = this.bottomLabel;
        return ((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.position.hashCode()) * 31) + Integer.hashCode(this.closestOrderIndex);
    }

    public String toString() {
        return "OrderPillData(label=" + this.label + ", bottomLabel=" + this.bottomLabel + ", position=" + this.position + ", closestOrderIndex=" + this.closestOrderIndex + ")";
    }

    public OrderPillData(StringResource label, StringResource stringResource, OrderPillPosition position, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(position, "position");
        this.label = label;
        this.bottomLabel = stringResource;
        this.position = position;
        this.closestOrderIndex = i;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final StringResource getBottomLabel() {
        return this.bottomLabel;
    }

    public final OrderPillPosition getPosition() {
        return this.position;
    }

    public final int getClosestOrderIndex() {
        return this.closestOrderIndex;
    }

    public final FuturesOrderSide getSide() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()];
        if (i == 1 || i == 2) {
            return FuturesOrderSide.BUY;
        }
        if (i == 3 || i == 4) {
            return FuturesOrderSide.SELL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Alignment getAlignment() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getTopStart();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getBottomStart();
        }
        if (i == 3) {
            return Alignment.INSTANCE.getTopEnd();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getBottomEnd();
    }

    public final boolean isOnTop() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                if (i == 4) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return ServerToBentoAssetMapper2.ARROW_DOWN_16;
        }
        return ServerToBentoAssetMapper2.ARROW_UP_16;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Ladder.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData$OrderPillPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderPillPosition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderPillPosition[] $VALUES;
        public static final OrderPillPosition TOP_LEFT = new OrderPillPosition("TOP_LEFT", 0);
        public static final OrderPillPosition TOP_RIGHT = new OrderPillPosition("TOP_RIGHT", 1);
        public static final OrderPillPosition BOTTOM_LEFT = new OrderPillPosition("BOTTOM_LEFT", 2);
        public static final OrderPillPosition BOTTOM_RIGHT = new OrderPillPosition("BOTTOM_RIGHT", 3);

        private static final /* synthetic */ OrderPillPosition[] $values() {
            return new OrderPillPosition[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT};
        }

        public static EnumEntries<OrderPillPosition> getEntries() {
            return $ENTRIES;
        }

        private OrderPillPosition(String str, int i) {
        }

        static {
            OrderPillPosition[] orderPillPositionArr$values = $values();
            $VALUES = orderPillPositionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderPillPositionArr$values);
        }

        public static OrderPillPosition valueOf(String str) {
            return (OrderPillPosition) Enum.valueOf(OrderPillPosition.class, str);
        }

        public static OrderPillPosition[] values() {
            return (OrderPillPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: Ladder.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "orders", "", "", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ImmutableList<OrderPillData> create(LazyListState lazyListState, Map<Integer, FuturesLadderViewState.LadderData.PendingOrderRow> orders) {
            OrderPillData orderPillData;
            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
            Intrinsics.checkNotNullParameter(orders, "orders");
            if (orders.isEmpty()) {
                return extensions2.toImmutableList(CollectionsKt.emptyList());
            }
            List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) visibleItemsInfo);
            if (lazyListItemInfo != null) {
                int index = lazyListItemInfo.getIndex();
                LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.lastOrNull((List) visibleItemsInfo);
                if (lazyListItemInfo2 != null) {
                    int index2 = lazyListItemInfo2.getIndex();
                    Set<Integer> setKeySet = orders.keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : setKeySet) {
                        if (((Number) obj).intValue() < index) {
                            arrayList.add(obj);
                        }
                    }
                    List listSortedDescending = CollectionsKt.sortedDescending(arrayList);
                    Set<Integer> setKeySet2 = orders.keySet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : setKeySet2) {
                        if (((Number) obj2).intValue() > index2) {
                            arrayList2.add(obj2);
                        }
                    }
                    List listSorted = CollectionsKt.sorted(arrayList2);
                    Iterator it = listSortedDescending.iterator();
                    OrderPillData orderPillData2 = null;
                    OrderPillData orderPillData3 = null;
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        FuturesLadderViewState.LadderData.PendingOrderRow pendingOrderRow = (FuturesLadderViewState.LadderData.PendingOrderRow) MapsKt.getValue(orders, Integer.valueOf(iIntValue));
                        if (pendingOrderRow.getBuys() != null) {
                            if ((orderPillData2 != null ? orderPillData2.getBottomLabel() : null) == null && (orderPillData2 == null || (orderPillData2 = OrderPillData.copy$default(orderPillData2, null, pendingOrderRow.getBuys().getOffscreenLabel(), null, 0, 13, null)) == null)) {
                                orderPillData2 = new OrderPillData(pendingOrderRow.getBuys().getOffscreenLabel(), null, OrderPillPosition.TOP_LEFT, iIntValue);
                            }
                        }
                        if (pendingOrderRow.getSells() == null) {
                            orderPillData = orderPillData3;
                        } else if ((orderPillData3 != null ? orderPillData3.getBottomLabel() : null) == null) {
                            if (orderPillData3 != null) {
                                orderPillData = OrderPillData.copy$default(orderPillData3, null, pendingOrderRow.getSells().getOffscreenLabel(), null, 0, 13, null);
                                if (orderPillData == null) {
                                    orderPillData = new OrderPillData(pendingOrderRow.getSells().getOffscreenLabel(), null, OrderPillPosition.TOP_RIGHT, iIntValue);
                                }
                            }
                        }
                        orderPillData3 = orderPillData;
                    }
                    OrderPillData orderPillData4 = orderPillData3;
                    Iterator it2 = listSorted.iterator();
                    OrderPillData orderPillData5 = null;
                    OrderPillData orderPillData6 = null;
                    while (it2.hasNext()) {
                        int iIntValue2 = ((Number) it2.next()).intValue();
                        FuturesLadderViewState.LadderData.PendingOrderRow pendingOrderRow2 = (FuturesLadderViewState.LadderData.PendingOrderRow) MapsKt.getValue(orders, Integer.valueOf(iIntValue2));
                        if (pendingOrderRow2.getBuys() != null) {
                            if ((orderPillData6 != null ? orderPillData6.getBottomLabel() : null) == null && (orderPillData6 == null || (orderPillData6 = OrderPillData.copy$default(orderPillData6, null, pendingOrderRow2.getBuys().getOffscreenLabel(), null, 0, 13, null)) == null)) {
                                orderPillData6 = new OrderPillData(pendingOrderRow2.getBuys().getOffscreenLabel(), null, OrderPillPosition.BOTTOM_LEFT, iIntValue2);
                            }
                        }
                        if (pendingOrderRow2.getSells() != null) {
                            if ((orderPillData5 != null ? orderPillData5.getBottomLabel() : null) == null) {
                                if (orderPillData5 != null) {
                                    orderPillData5 = OrderPillData.copy$default(orderPillData5, null, pendingOrderRow2.getSells().getOffscreenLabel(), null, 0, 13, null);
                                    if (orderPillData5 == null) {
                                    }
                                }
                                orderPillData5 = new OrderPillData(pendingOrderRow2.getSells().getOffscreenLabel(), null, OrderPillPosition.BOTTOM_RIGHT, iIntValue2);
                            }
                        }
                        orderPillData5 = orderPillData5;
                    }
                    return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new OrderPillData[]{orderPillData2, orderPillData4, orderPillData6, orderPillData5}));
                }
            }
            return null;
        }
    }
}
