package com.robinhood.android.eventcontracts.sharedeventui.util;

import com.robinhood.android.models.event.p186db.order.EventOrder4;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PendingOrderUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, m3636d2 = {"sideWithPendingOrdersWhenNoHolding", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "pendingOrders", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "holdingQuantity", "Ljava/math/BigDecimal;", "hasEnoughAmountOfPendingOrderToClosePosition", "", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.util.PendingOrderUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PendingOrderUtils {
    public static final EventOrderSide sideWithPendingOrdersWhenNoHolding(List<UiEventOrder> pendingOrders, BigDecimal holdingQuantity) {
        Object next;
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(holdingQuantity, "holdingQuantity");
        if (!BigDecimals7.isZero(holdingQuantity)) {
            return null;
        }
        Iterator<T> it = pendingOrders.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((UiEventOrder) next).getOrder().getPositionEffect() == EventOrder4.OPENING) {
                break;
            }
        }
        UiEventOrder uiEventOrder = (UiEventOrder) next;
        if (uiEventOrder == null) {
            return null;
        }
        return uiEventOrder.getSide();
    }

    public static final boolean hasEnoughAmountOfPendingOrderToClosePosition(List<UiEventOrder> pendingOrders, BigDecimal holdingQuantity) {
        Collection collectionEmptyList;
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(holdingQuantity, "holdingQuantity");
        if (BigDecimals7.isZero(holdingQuantity)) {
            return false;
        }
        if (BigDecimals7.isPositive(holdingQuantity)) {
            collectionEmptyList = new ArrayList();
            for (Object obj : pendingOrders) {
                UiEventOrder uiEventOrder = (UiEventOrder) obj;
                if (uiEventOrder.getSide() == EventOrderSide.SELL && uiEventOrder.getOrder().getPositionEffect() == EventOrder4.CLOSING) {
                    collectionEmptyList.add(obj);
                }
            }
        } else if (BigDecimals7.isNegative(holdingQuantity)) {
            collectionEmptyList = new ArrayList();
            for (Object obj2 : pendingOrders) {
                UiEventOrder uiEventOrder2 = (UiEventOrder) obj2;
                if (uiEventOrder2.getSide() == EventOrderSide.BUY && uiEventOrder2.getOrder().getPositionEffect() == EventOrder4.CLOSING) {
                    collectionEmptyList.add(obj2);
                }
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        Collection collection = collectionEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiEventOrder) it.next()).getOrder().getUnfilledQuantity());
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add((BigDecimal) it2.next());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf.abs().compareTo(holdingQuantity.abs()) >= 0;
    }
}
