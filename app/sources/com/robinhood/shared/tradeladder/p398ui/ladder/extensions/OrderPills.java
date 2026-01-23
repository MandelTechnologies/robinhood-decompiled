package com.robinhood.shared.tradeladder.p398ui.ladder.extensions;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderOrderGroupLabel;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OrderPills.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aT\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t\u001a.\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\tH\u0001\u001a:\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\tH\u0001\u001a\"\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¨\u0006\u001d"}, m3636d2 = {"createGroup", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow$Group;", "T", "rowIndex", "", "allOrders", "", "Lcom/robinhood/shared/tradeladder/ui/ladder/extensions/PendingOrderPillData;", "determinePillVisualState", "Lkotlin/Function1;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "formatQuantity", "Ljava/math/BigDecimal;", "", "getOrderPillGroupLabel", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderOrderGroupLabel;", "orders", "createUiPendingOrder", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$UiPendingOrder;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "pendingOrder", "visualState", "getOrderPillLabel", "Lcom/robinhood/utils/resource/StringResource;", "quantityString", "type", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "trigger", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.extensions.OrderPillsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class OrderPills {
    public static final <T> LadderState.LadderData.PendingOrderRow.Group createGroup(int i, List<PendingOrderPillData<T>> list, Function1<? super T, ? extends PillStyle.PillVisualState> determinePillVisualState, Function1<? super BigDecimal, String> formatQuantity) {
        Intrinsics.checkNotNullParameter(determinePillVisualState, "determinePillVisualState");
        Intrinsics.checkNotNullParameter(formatQuantity, "formatQuantity");
        List<PendingOrderPillData<T>> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        LadderOrderGroupLabel orderPillGroupLabel = getOrderPillGroupLabel(list, formatQuantity);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            PendingOrderPillData pendingOrderPillData = (PendingOrderPillData) it.next();
            LadderState.LadderData.UiPendingOrder uiPendingOrderCreateUiPendingOrder = createUiPendingOrder(i, pendingOrderPillData, determinePillVisualState.invoke((Object) pendingOrderPillData.getOrder()), formatQuantity);
            if (uiPendingOrderCreateUiPendingOrder != null) {
                arrayList.add(uiPendingOrderCreateUiPendingOrder);
            }
        }
        return new LadderState.LadderData.PendingOrderRow.Group(extensions2.toImmutableList(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.shared.tradeladder.ui.ladder.extensions.OrderPillsKt$createGroup$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Boolean.valueOf(!((LadderState.LadderData.UiPendingOrder) t).isPlaceholder()), Boolean.valueOf(!((LadderState.LadderData.UiPendingOrder) t2).isPlaceholder()));
            }
        })), orderPillGroupLabel.getOnScreenLabel(), orderPillGroupLabel.getOffscreenLabel());
    }

    public static final LadderOrderGroupLabel getOrderPillGroupLabel(List<? extends PendingOrderPillData<?>> orders, Function1<? super BigDecimal, String> formatQuantity) {
        boolean z;
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(formatQuantity, "formatQuantity");
        List<? extends PendingOrderPillData<?>> list = orders;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((PendingOrderPillData) it.next()).getDisplayQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        String strInvoke = formatQuantity.invoke(bigDecimalValueOf);
        boolean z2 = list instanceof Collection;
        boolean z3 = true;
        if (z2 && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                PendingOrderPillData pendingOrderPillData = (PendingOrderPillData) it2.next();
                if (pendingOrderPillData.getOrderType() == OrderType.LIMIT && pendingOrderPillData.getOrderTrigger() == OrderTrigger.IMMEDIATE) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z2 && list.isEmpty()) {
            z3 = false;
        } else {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (((PendingOrderPillData) it3.next()).getOrderTrigger() == OrderTrigger.STOP) {
                    break;
                }
            }
            z3 = false;
        }
        if (z && z3) {
            return new LadderOrderGroupLabel.LimitOrStop(strInvoke);
        }
        if (z) {
            return new LadderOrderGroupLabel.Limit(strInvoke);
        }
        if (z3) {
            return new LadderOrderGroupLabel.Stop(strInvoke);
        }
        return new LadderOrderGroupLabel.Na(strInvoke);
    }

    public static final LadderState.LadderData.UiPendingOrder createUiPendingOrder(int i, PendingOrderPillData<?> pendingOrder, PillStyle.PillVisualState visualState, Function1<? super BigDecimal, String> formatQuantity) {
        Intrinsics.checkNotNullParameter(pendingOrder, "pendingOrder");
        Intrinsics.checkNotNullParameter(visualState, "visualState");
        Intrinsics.checkNotNullParameter(formatQuantity, "formatQuantity");
        StringResource orderPillLabel = getOrderPillLabel(formatQuantity.invoke(pendingOrder.getDisplayQuantity()), pendingOrder.getOrderType(), pendingOrder.getOrderTrigger());
        if (orderPillLabel == null) {
            return null;
        }
        return new LadderState.LadderData.UiPendingOrder(pendingOrder.getOrderId(), i, pendingOrder.getSide(), orderPillLabel, pendingOrder.isPlaceholder(), pendingOrder.isEditable(), visualState);
    }

    public static final StringResource getOrderPillLabel(String quantityString, OrderType type2, OrderTrigger trigger) {
        Intrinsics.checkNotNullParameter(quantityString, "quantityString");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (trigger == OrderTrigger.STOP) {
            return StringResource.INSTANCE.invoke(C40888R.string.stop_pending_order, quantityString);
        }
        if (type2 == OrderType.LIMIT && trigger == OrderTrigger.IMMEDIATE) {
            return StringResource.INSTANCE.invoke(C40888R.string.limit_pending_order, quantityString);
        }
        return null;
    }
}
