package com.robinhood.android.options.combo.dao;

import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.android.options.combo.p206db.ComboOrder;
import com.robinhood.android.options.combo.p206db.ComboOrderExecution;
import com.robinhood.android.options.combo.p206db.ComboOrderLeg;
import com.robinhood.android.options.combo.p206db.ComboOrderSalesTax;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.models.history.shared.OrderState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: ComboOrderDao.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH%¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H%¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H%¢\u0006\u0004\b\u0016\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010H%¢\u0006\u0004\b\u0019\u0010\u0013J\u001d\u0010\u001c\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010H%¢\u0006\u0004\b\u001c\u0010\u0013J)\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH'¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010$\u001a\u00020\u001eH'¢\u0006\u0004\b%\u0010&J+\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eH'¢\u0006\u0004\b*\u0010+J1\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\u0006\u0010(\u001a\u00020'2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H'¢\u0006\u0004\b/\u00100J+\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\u0006\u0010(\u001a\u00020'2\u0006\u00101\u001a\u00020\u001eH'¢\u0006\u0004\b2\u0010+Jc\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\f\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u00104\u001a\u0004\u0018\u00010\u001e2\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0,H'¢\u0006\u0004\b=\u0010>Jk\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\f\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u00104\u001a\u0004\u0018\u00010\u001e2\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0,H'¢\u0006\u0004\bA\u0010BJs\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\f\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u00104\u001a\u0004\u0018\u00010\u001e2\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0,H'¢\u0006\u0004\bC\u0010DJs\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\f\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u00104\u001a\u0004\u0018\u00010\u001e2\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0,H'¢\u0006\u0004\bE\u0010DJW\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080 2\f\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u00104\u001a\u0004\u0018\u00010\u001e2\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u0010;\u001a\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0,H'¢\u0006\u0004\bF\u0010GJg\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080 2\f\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u00104\u001a\u0004\u0018\u00010\u001e2\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0,H'¢\u0006\u0004\bH\u0010B¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/options/combo/dao/ComboOrderDao;", "", "<init>", "()V", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/options/combo/api/ApiComboOrder;", "result", "", "insert", "(Lcom/robinhood/models/PaginatedResult;)V", "apiOrder", "(Lcom/robinhood/android/options/combo/api/ApiComboOrder;)V", "Lcom/robinhood/android/options/combo/db/ComboOrder;", Card.Icon.ORDER, "insertOrder", "(Lcom/robinhood/android/options/combo/db/ComboOrder;)V", "", "orders", "insertOrders", "(Ljava/lang/Iterable;)V", "Lcom/robinhood/android/options/combo/db/ComboOrderLeg;", "legs", "insertLegs", "Lcom/robinhood/android/options/combo/db/ComboOrderExecution;", "executions", "insertExecutions", "Lcom/robinhood/android/options/combo/db/ComboOrderSalesTax;", "salesTaxes", "insertSalesTaxes", "", "Ljava/util/UUID;", "comboOrderIds", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "getOrders", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "orderId", "getOrder", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "", "accountNumber", "optionInstrumentId", "getComboOrdersByOptionInstrument", "(Ljava/lang/String;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/shared/models/history/shared/OrderState;", "orderStates", "getComboOrdersByOrderState", "(Ljava/lang/String;Ljava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "aggregateOptionPositionId", "getComboOrdersByAggregatePosition", "states", "instrumentId", "j$/time/Instant", "since", "before", "", "limit", "", "isFilteringByAccountNumber", "accountNumbers", "getLatest", "(Ljava/util/Set;Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;IZLjava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "createdAt", "id", "get", "(Ljava/util/Set;Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/UUID;ZLjava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "getEarlier", "(Ljava/util/Set;Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/UUID;IZLjava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "getLater", "countTotal", "(Ljava/util/Set;Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;ZLjava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "countLater", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public abstract class ComboOrderDao {
    public abstract Flow<Integer> countLater(Set<? extends OrderState> states, UUID instrumentId, Instant since, Instant before, Instant createdAt, UUID id, boolean isFilteringByAccountNumber, Set<String> accountNumbers);

    public abstract Flow<Integer> countTotal(Set<? extends OrderState> states, UUID instrumentId, Instant since, Instant before, boolean isFilteringByAccountNumber, Set<String> accountNumbers);

    public abstract Flow<List<UiComboOrder>> get(Set<? extends OrderState> states, UUID instrumentId, Instant since, Instant before, Instant createdAt, UUID id, boolean isFilteringByAccountNumber, Set<String> accountNumbers);

    public abstract Flow<List<UiComboOrder>> getComboOrdersByAggregatePosition(String accountNumber, UUID aggregateOptionPositionId);

    public abstract Flow<List<UiComboOrder>> getComboOrdersByOptionInstrument(String accountNumber, UUID optionInstrumentId);

    public abstract Flow<List<UiComboOrder>> getComboOrdersByOrderState(String accountNumber, Set<? extends OrderState> orderStates);

    public abstract Flow<List<UiComboOrder>> getEarlier(Set<? extends OrderState> states, UUID instrumentId, Instant since, Instant before, Instant createdAt, UUID id, int limit, boolean isFilteringByAccountNumber, Set<String> accountNumbers);

    public abstract Flow<List<UiComboOrder>> getLater(Set<? extends OrderState> states, UUID instrumentId, Instant since, Instant before, Instant createdAt, UUID id, int limit, boolean isFilteringByAccountNumber, Set<String> accountNumbers);

    public abstract Flow<List<UiComboOrder>> getLatest(Set<? extends OrderState> states, UUID instrumentId, Instant since, Instant before, int limit, boolean isFilteringByAccountNumber, Set<String> accountNumbers);

    public abstract Flow<UiComboOrder> getOrder(UUID orderId);

    public abstract Flow<List<UiComboOrder>> getOrders(List<UUID> comboOrderIds);

    protected abstract void insertExecutions(Iterable<ComboOrderExecution> executions);

    protected abstract void insertLegs(Iterable<ComboOrderLeg> legs);

    protected abstract void insertOrder(ComboOrder order);

    protected abstract void insertOrders(Iterable<ComboOrder> orders);

    protected abstract void insertSalesTaxes(Iterable<ComboOrderSalesTax> salesTaxes);

    public void insert(ApiComboOrder apiOrder) {
        Intrinsics.checkNotNullParameter(apiOrder, "apiOrder");
        insertOrder(apiOrder.toDbModel());
        insertLegs(apiOrder.getComboOrderLegs());
        insertExecutions(apiOrder.getComboOrderExecutions());
        insertSalesTaxes(apiOrder.getComboOrderSalesTaxes());
    }

    public void insert(PaginatedResult<ApiComboOrder> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(result, 10));
        Iterator<ApiComboOrder> it = result.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toDbModel());
        }
        insertOrders(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<ApiComboOrder> it2 = result.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, it2.next().getComboOrderLegs());
        }
        insertLegs(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator<ApiComboOrder> it3 = result.iterator();
        while (it3.hasNext()) {
            CollectionsKt.addAll(arrayList3, it3.next().getComboOrderExecutions());
        }
        insertExecutions(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator<ApiComboOrder> it4 = result.iterator();
        while (it4.hasNext()) {
            CollectionsKt.addAll(arrayList4, it4.next().getComboOrderSalesTaxes());
        }
        insertSalesTaxes(arrayList4);
    }
}
