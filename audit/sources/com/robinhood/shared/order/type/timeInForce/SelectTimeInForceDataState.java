package com.robinhood.shared.order.type.timeInForce;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.order.type.C39278R;
import com.robinhood.shared.order.type.timeInForce.SelectTimeInForceViewState;
import com.robinhood.shared.order.type.util.TimeInForceUtil2;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;

/* compiled from: SelectTimeInForceDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\r¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDataState;", "", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/models/db/OrderTimeInForce;", "selectedTimeInForce", "Lkotlinx/collections/immutable/ImmutableList;", "supportedTimeInForce", "<init>", "(Lj$/time/Clock;Lcom/robinhood/models/db/OrderTimeInForce;Lkotlinx/collections/immutable/ImmutableList;)V", "component1", "()Lj$/time/Clock;", "component3", "()Lkotlinx/collections/immutable/ImmutableList;", "component2$lib_order_type_externalDebug", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component2", "copy", "(Lj$/time/Clock;Lcom/robinhood/models/db/OrderTimeInForce;Lkotlinx/collections/immutable/ImmutableList;)Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Clock;", "Lcom/robinhood/models/db/OrderTimeInForce;", "getSelectedTimeInForce$lib_order_type_externalDebug", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceViewState$RowState;", "getRows", "rows", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class SelectTimeInForceDataState {
    public static final int $stable = 8;
    private final Clock clock;
    private final OrderTimeInForce selectedTimeInForce;
    private final ImmutableList<OrderTimeInForce> supportedTimeInForce;

    /* renamed from: component1, reason: from getter */
    private final Clock getClock() {
        return this.clock;
    }

    private final ImmutableList<OrderTimeInForce> component3() {
        return this.supportedTimeInForce;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectTimeInForceDataState copy$default(SelectTimeInForceDataState selectTimeInForceDataState, Clock clock, OrderTimeInForce orderTimeInForce, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            clock = selectTimeInForceDataState.clock;
        }
        if ((i & 2) != 0) {
            orderTimeInForce = selectTimeInForceDataState.selectedTimeInForce;
        }
        if ((i & 4) != 0) {
            immutableList = selectTimeInForceDataState.supportedTimeInForce;
        }
        return selectTimeInForceDataState.copy(clock, orderTimeInForce, immutableList);
    }

    /* renamed from: component2$lib_order_type_externalDebug, reason: from getter */
    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    public final SelectTimeInForceDataState copy(Clock clock, OrderTimeInForce selectedTimeInForce, ImmutableList<? extends OrderTimeInForce> supportedTimeInForce) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        Intrinsics.checkNotNullParameter(supportedTimeInForce, "supportedTimeInForce");
        return new SelectTimeInForceDataState(clock, selectedTimeInForce, supportedTimeInForce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectTimeInForceDataState)) {
            return false;
        }
        SelectTimeInForceDataState selectTimeInForceDataState = (SelectTimeInForceDataState) other;
        return Intrinsics.areEqual(this.clock, selectTimeInForceDataState.clock) && this.selectedTimeInForce == selectTimeInForceDataState.selectedTimeInForce && Intrinsics.areEqual(this.supportedTimeInForce, selectTimeInForceDataState.supportedTimeInForce);
    }

    public int hashCode() {
        return (((this.clock.hashCode() * 31) + this.selectedTimeInForce.hashCode()) * 31) + this.supportedTimeInForce.hashCode();
    }

    public String toString() {
        return "SelectTimeInForceDataState(clock=" + this.clock + ", selectedTimeInForce=" + this.selectedTimeInForce + ", supportedTimeInForce=" + this.supportedTimeInForce + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectTimeInForceDataState(Clock clock, OrderTimeInForce selectedTimeInForce, ImmutableList<? extends OrderTimeInForce> supportedTimeInForce) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        Intrinsics.checkNotNullParameter(supportedTimeInForce, "supportedTimeInForce");
        this.clock = clock;
        this.selectedTimeInForce = selectedTimeInForce;
        this.supportedTimeInForce = supportedTimeInForce;
    }

    public final OrderTimeInForce getSelectedTimeInForce$lib_order_type_externalDebug() {
        return this.selectedTimeInForce;
    }

    public /* synthetic */ SelectTimeInForceDataState(Clock clock, OrderTimeInForce orderTimeInForce, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clock, orderTimeInForce, (i & 4) != 0 ? TimeInForceUtil2.getSupportedTimeInForceValues() : immutableList);
    }

    public final ImmutableList<SelectTimeInForceViewState.RowState> getRows() {
        ImmutableList<OrderTimeInForce> supportedTimeInForceValues = TimeInForceUtil2.getSupportedTimeInForceValues();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportedTimeInForceValues, 10));
        Iterator<OrderTimeInForce> it = supportedTimeInForceValues.iterator();
        while (it.hasNext()) {
            OrderTimeInForce next = it.next();
            arrayList.add(new SelectTimeInForceViewState.RowState(next, StringResource.INSTANCE.invoke(C39278R.string.crypto_select_tif_row_value, TimeInForceUtil2.getDisplayName(next), TimeInForceUtil2.getShortDisplayName(next)), TimeInForceUtil2.description(next, this.clock), next == this.selectedTimeInForce));
        }
        return extensions2.toPersistentList(arrayList);
    }
}
