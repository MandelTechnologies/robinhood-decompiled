package com.robinhood.android.equitytradeladder.extensions;

import com.robinhood.android.equitytradeladder.models.EquityOrderSide2;
import com.robinhood.android.equitytradeladder.models.EquityPendingOrder3;
import com.robinhood.android.equitytradeladder.models.PendingCanceledOrder;
import com.robinhood.android.equitytradeladder.models.PendingFilledOrder;
import com.robinhood.android.equitytradeladder.models.PendingPlacedOrder;
import com.robinhood.android.equitytradeladder.models.PendingReplacedOrder;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.PendingOrderPillData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityOrders.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a2\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¨\u0006\n"}, m3636d2 = {"toPendingOrderPillData", "Lcom/robinhood/shared/tradeladder/ui/ladder/extensions/PendingOrderPillData;", "Lcom/robinhood/android/equitytradeladder/models/PendingOrder;", "pendingOrdersToDisplayOnLadder", "", "Lcom/robinhood/models/db/Order;", "updateInternalPendingOrders", "", "Ljava/util/UUID;", "pendingOrders", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.extensions.EquityOrdersKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrders {

    /* compiled from: EquityOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitytradeladder.extensions.EquityOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PendingOrderPillData<EquityPendingOrder3> toPendingOrderPillData(EquityPendingOrder3 equityPendingOrder3) {
        BigDecimal quantity;
        Intrinsics.checkNotNullParameter(equityPendingOrder3, "<this>");
        UUID id = equityPendingOrder3.getId();
        int i = WhenMappings.$EnumSwitchMapping$0[equityPendingOrder3.getSide().ordinal()];
        if (i == 1) {
            quantity = equityPendingOrder3.getQuantity();
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            quantity = equityPendingOrder3.getQuantity().negate();
        }
        BigDecimal bigDecimal = quantity;
        Intrinsics.checkNotNull(bigDecimal);
        return new PendingOrderPillData<>(equityPendingOrder3, id, bigDecimal, EquityOrderSide2.toSide(equityPendingOrder3.getSide()), equityPendingOrder3.getIsPlaceholder(), equityPendingOrder3.getIsEditable(), equityPendingOrder3.getOrderType(), equityPendingOrder3.getOrderTrigger());
    }

    public static final List<Order> pendingOrdersToDisplayOnLadder(List<Order> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Order order = (Order) obj;
            Order.Configuration configuration = Order.Configuration.INSTANCE.getConfiguration(order.getType(), order.getTrigger(), order.getTrailingPeg(), order.getPresetPercentLimit());
            if (order.getState().isPending() && order.getState() != EquityOrderState.PENDING_CANCELLED && configuration != Order.Configuration.STOP_LIMIT && configuration != Order.Configuration.TRAILING_STOP) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.equitytradeladder.extensions.EquityOrdersKt$pendingOrdersToDisplayOnLadder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((Order) t).getCreatedAt(), ((Order) t2).getCreatedAt());
            }
        });
    }

    public static final Map<UUID, EquityPendingOrder3> updateInternalPendingOrders(Map<UUID, EquityPendingOrder3> map, List<Order> pendingOrders) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<UUID, EquityPendingOrder3> entry : map.entrySet()) {
            if (entry.getValue() instanceof PendingPlacedOrder) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap.putAll(linkedHashMap2);
        for (Order order : pendingOrders) {
            if (!map.containsKey(order.getId()) || linkedHashMap.containsKey(order.getReplaces())) {
                UUID replaces = order.getReplaces();
                if (replaces != null) {
                }
                linkedHashMap.put(order.getId(), new PendingFilledOrder(order));
            } else {
                EquityPendingOrder3 equityPendingOrder3 = map.get(order.getId());
                if (equityPendingOrder3 instanceof PendingCanceledOrder) {
                    linkedHashMap.put(order.getId(), ((PendingCanceledOrder) equityPendingOrder3).copy(order));
                } else if (equityPendingOrder3 instanceof PendingFilledOrder) {
                    linkedHashMap.put(order.getId(), ((PendingFilledOrder) equityPendingOrder3).copy(order));
                } else if (equityPendingOrder3 instanceof PendingReplacedOrder) {
                    linkedHashMap.put(order.getId(), PendingReplacedOrder.copy$default((PendingReplacedOrder) equityPendingOrder3, null, null, order, 3, null));
                } else if (!(equityPendingOrder3 instanceof PendingPlacedOrder) && equityPendingOrder3 != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return linkedHashMap;
    }
}
