package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import com.robinhood.android.trade.configuration.OrderConfigurationRow;
import com.robinhood.rosetta.eventlogging.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationSelectionViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionViewState;", "", "orderConfigurationList", "", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "loggingEquityOrderContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "taxLotsSelected", "", "<init>", "(Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/Context;Z)V", "getOrderConfigurationList", "()Ljava/util/List;", "getLoggingEquityOrderContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getTaxLotsSelected", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderConfigurationSelectionViewState {
    public static final int $stable = 8;
    private final Context loggingEquityOrderContext;
    private final List<OrderConfigurationRow> orderConfigurationList;
    private final boolean taxLotsSelected;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderConfigurationSelectionViewState copy$default(OrderConfigurationSelectionViewState orderConfigurationSelectionViewState, List list, Context context, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = orderConfigurationSelectionViewState.orderConfigurationList;
        }
        if ((i & 2) != 0) {
            context = orderConfigurationSelectionViewState.loggingEquityOrderContext;
        }
        if ((i & 4) != 0) {
            z = orderConfigurationSelectionViewState.taxLotsSelected;
        }
        return orderConfigurationSelectionViewState.copy(list, context, z);
    }

    public final List<OrderConfigurationRow> component1() {
        return this.orderConfigurationList;
    }

    /* renamed from: component2, reason: from getter */
    public final Context getLoggingEquityOrderContext() {
        return this.loggingEquityOrderContext;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getTaxLotsSelected() {
        return this.taxLotsSelected;
    }

    public final OrderConfigurationSelectionViewState copy(List<? extends OrderConfigurationRow> orderConfigurationList, Context loggingEquityOrderContext, boolean taxLotsSelected) {
        Intrinsics.checkNotNullParameter(orderConfigurationList, "orderConfigurationList");
        return new OrderConfigurationSelectionViewState(orderConfigurationList, loggingEquityOrderContext, taxLotsSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderConfigurationSelectionViewState)) {
            return false;
        }
        OrderConfigurationSelectionViewState orderConfigurationSelectionViewState = (OrderConfigurationSelectionViewState) other;
        return Intrinsics.areEqual(this.orderConfigurationList, orderConfigurationSelectionViewState.orderConfigurationList) && Intrinsics.areEqual(this.loggingEquityOrderContext, orderConfigurationSelectionViewState.loggingEquityOrderContext) && this.taxLotsSelected == orderConfigurationSelectionViewState.taxLotsSelected;
    }

    public int hashCode() {
        int iHashCode = this.orderConfigurationList.hashCode() * 31;
        Context context = this.loggingEquityOrderContext;
        return ((iHashCode + (context == null ? 0 : context.hashCode())) * 31) + Boolean.hashCode(this.taxLotsSelected);
    }

    public String toString() {
        return "OrderConfigurationSelectionViewState(orderConfigurationList=" + this.orderConfigurationList + ", loggingEquityOrderContext=" + this.loggingEquityOrderContext + ", taxLotsSelected=" + this.taxLotsSelected + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderConfigurationSelectionViewState(List<? extends OrderConfigurationRow> orderConfigurationList, Context context, boolean z) {
        Intrinsics.checkNotNullParameter(orderConfigurationList, "orderConfigurationList");
        this.orderConfigurationList = orderConfigurationList;
        this.loggingEquityOrderContext = context;
        this.taxLotsSelected = z;
    }

    public final List<OrderConfigurationRow> getOrderConfigurationList() {
        return this.orderConfigurationList;
    }

    public final Context getLoggingEquityOrderContext() {
        return this.loggingEquityOrderContext;
    }

    public final boolean getTaxLotsSelected() {
        return this.taxLotsSelected;
    }
}
