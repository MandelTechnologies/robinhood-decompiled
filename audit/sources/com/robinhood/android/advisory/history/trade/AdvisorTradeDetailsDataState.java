package com.robinhood.android.advisory.history.trade;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.advisory.history.C8736R;
import com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsViewState;
import com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsViewState3;
import com.robinhood.android.equitydetail.p123ui.TradeButtonLogger;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.trade.AdvisorTrade;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisorTradeDetailsDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDataState;", "", TradeButtonLogger.BUTTON_GROUP_TRADE_TRADE, "Lcom/robinhood/models/advisory/db/trade/AdvisorTrade;", "account", "Lcom/robinhood/models/db/Account;", "orders", "", "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/models/advisory/db/trade/AdvisorTrade;Lcom/robinhood/models/db/Account;Ljava/util/List;)V", "getTrade", "()Lcom/robinhood/models/advisory/db/trade/AdvisorTrade;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getOrders", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Reducer", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisorTradeDetailsDataState {
    private final Account account;
    private final List<Order> orders;
    private final AdvisorTrade trade;

    /* renamed from: Reducer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AdvisorTradeDetailsDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvisorTradeDetailsDataState copy$default(AdvisorTradeDetailsDataState advisorTradeDetailsDataState, AdvisorTrade advisorTrade, Account account, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            advisorTrade = advisorTradeDetailsDataState.trade;
        }
        if ((i & 2) != 0) {
            account = advisorTradeDetailsDataState.account;
        }
        if ((i & 4) != 0) {
            list = advisorTradeDetailsDataState.orders;
        }
        return advisorTradeDetailsDataState.copy(advisorTrade, account, list);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvisorTrade getTrade() {
        return this.trade;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final List<Order> component3() {
        return this.orders;
    }

    public final AdvisorTradeDetailsDataState copy(AdvisorTrade trade, Account account, List<Order> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new AdvisorTradeDetailsDataState(trade, account, orders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisorTradeDetailsDataState)) {
            return false;
        }
        AdvisorTradeDetailsDataState advisorTradeDetailsDataState = (AdvisorTradeDetailsDataState) other;
        return Intrinsics.areEqual(this.trade, advisorTradeDetailsDataState.trade) && Intrinsics.areEqual(this.account, advisorTradeDetailsDataState.account) && Intrinsics.areEqual(this.orders, advisorTradeDetailsDataState.orders);
    }

    public int hashCode() {
        AdvisorTrade advisorTrade = this.trade;
        int iHashCode = (advisorTrade == null ? 0 : advisorTrade.hashCode()) * 31;
        Account account = this.account;
        return ((iHashCode + (account != null ? account.hashCode() : 0)) * 31) + this.orders.hashCode();
    }

    public String toString() {
        return "AdvisorTradeDetailsDataState(trade=" + this.trade + ", account=" + this.account + ", orders=" + this.orders + ")";
    }

    public AdvisorTradeDetailsDataState(AdvisorTrade advisorTrade, Account account, List<Order> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.trade = advisorTrade;
        this.account = account;
        this.orders = orders;
    }

    public final AdvisorTrade getTrade() {
        return this.trade;
    }

    public final Account getAccount() {
        return this.account;
    }

    public /* synthetic */ AdvisorTradeDetailsDataState(AdvisorTrade advisorTrade, Account account, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisorTrade, (i & 2) != 0 ? null : account, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Order> getOrders() {
        return this.orders;
    }

    /* compiled from: AdvisorTradeDetailsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDataState$Reducer;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDataState;", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDataState$Reducer, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<AdvisorTradeDetailsDataState, AdvisorTradeDetailsViewState> {

        /* compiled from: AdvisorTradeDetailsDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDataState$Reducer$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AdvisorTrade.State.values().length];
                try {
                    iArr[AdvisorTrade.State.FILLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdvisorTrade.State.PENDING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AdvisorTrade.State.UNSPECIFIED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AdvisorTradeDetailsViewState reduce(AdvisorTradeDetailsDataState dataState) {
            int i;
            ImmutableList3 immutableList3PersistentListOf;
            List listEmptyList;
            Object next;
            StatefulHistoryEvent<HistoryEvent> statefulHistoryEvent;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getTrade() != null && dataState.getAccount() != null) {
                List<AdvisorTrade.OrderGroup> orderGroups = dataState.getTrade().getOrderGroups();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = orderGroups.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AdvisorTrade.OrderGroup orderGroup = (AdvisorTrade.OrderGroup) next2;
                    List<UUID> orderIds = orderGroup.getOrderIds();
                    ArrayList arrayList2 = new ArrayList();
                    for (UUID uuid : orderIds) {
                        Iterator<T> it2 = dataState.getOrders().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (Intrinsics.areEqual(((Order) next).getId(), uuid)) {
                                break;
                            }
                        }
                        Order order = (Order) next;
                        AdvisorTradeDetailsViewState3.HistoryRow historyRow = (order == null || (statefulHistoryEvent = order.toStatefulHistoryEvent()) == null) ? null : new AdvisorTradeDetailsViewState3.HistoryRow(statefulHistoryEvent);
                        if (historyRow != null) {
                            arrayList2.add(historyRow);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                        spreadBuilder.add(new AdvisorTradeDetailsViewState3.SectionHeader(orderGroup.getTitle()));
                        spreadBuilder.addSpread(arrayList2.toArray(new AdvisorTradeDetailsViewState3.HistoryRow[0]));
                        spreadBuilder.add(!(i2 == dataState.getTrade().getOrderGroups().size() - 1) ? AdvisorTradeDetailsViewState3.Spacer.INSTANCE : null);
                        listEmptyList = CollectionsKt.listOfNotNull(spreadBuilder.toArray(new AdvisorTradeDetailsViewState3[spreadBuilder.size()]));
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    CollectionsKt.addAll(arrayList, listEmptyList);
                    i2 = i3;
                }
                StringResource title = AccountDisplayNames.getDisplayName(dataState.getAccount()).getShort().getTitle();
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke(C8736R.string.advisor_trade_order_status_label, new Object[0]);
                int i4 = WhenMappings.$EnumSwitchMapping$0[dataState.getTrade().getState().ordinal()];
                if (i4 == 1) {
                    i = C8736R.string.advisor_trade_filled;
                } else {
                    if (i4 != 2 && i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C8736R.string.advisor_trade_pending;
                }
                LineItem lineItem = new LineItem(stringResourceInvoke, companion.invoke(i, new Object[0]));
                Money totalBought = dataState.getTrade().getTotalBought();
                LineItem lineItem2 = totalBought != null ? new LineItem(companion.invoke(C8736R.string.advisor_trade_total_bought_label, new Object[0]), companion.invoke(Money.format$default(totalBought, null, false, null, false, 0, null, false, null, false, false, 1023, null))) : null;
                Money totalSold = dataState.getTrade().getTotalSold();
                ImmutableList3 persistentList = extensions2.toPersistentList(CollectionsKt.listOfNotNull((Object[]) new LineItem[]{lineItem, lineItem2, totalSold != null ? new LineItem(companion.invoke(C8736R.string.advisor_trade_total_sold_label, new Object[0]), companion.invoke(Money.format$default(totalSold, null, false, null, false, 0, null, false, null, false, false, 1023, null))) : null, new LineItem(companion.invoke(C8736R.string.advisor_trade_date_label, new Object[0]), companion.invoke(LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(dataState.getTrade().getInitiatedAt(), null, 1, null))))}));
                if (!arrayList.isEmpty()) {
                    immutableList3PersistentListOf = extensions2.toPersistentList(CollectionsKt.plus((Collection) CollectionsKt.listOf(AdvisorTradeDetailsViewState3.Title.INSTANCE), (Iterable) arrayList));
                } else {
                    immutableList3PersistentListOf = extensions2.persistentListOf();
                }
                return new AdvisorTradeDetailsViewState.Loaded(title, persistentList, immutableList3PersistentListOf);
            }
            return AdvisorTradeDetailsViewState.Loading.INSTANCE;
        }
    }
}
