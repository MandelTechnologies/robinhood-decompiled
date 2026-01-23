package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import android.content.res.Resources;
import com.robinhood.android.feature.margin.call.p138v2.C16772R;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState2;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState3;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState4;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState5;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState2;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState4;
import com.robinhood.android.lib.formats.FormatAsList2;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderFragment;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.contracts.margin.margin_call.proto.p496v1.CashFlowStateDto;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallDataResponseDto;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallSummaryFromDataResponseDto;
import microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataDto;
import microgram.contracts.margin.margin_call.proto.p496v1.OrderNbboSummaryDto;
import microgram.contracts.margin.margin_call.proto.p496v1.TradeDto;

/* compiled from: MarginCallMarketOrderStateProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u0002J\f\u0010\u0010\u001a\u00020\u000b*\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "getOrdersStringSummary", "", "", "Lcom/robinhood/models/db/Order;", "trades", "Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;", "asString", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderStateProvider$SymbolShares;", "SymbolShares", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarginCallMarketOrderStateProvider implements StateProvider<MarginCallMarketOrderDataState, MarginCallMarketOrderViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: MarginCallMarketOrderStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashFlowStateDto.values().length];
            try {
                iArr[CashFlowStateDto.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CashFlowStateDto.COST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MarginCallMarketOrderStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0525  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MarginCallMarketOrderViewState reduce(MarginCallMarketOrderDataState dataState) throws Resources.NotFoundException {
        MarginCallMarketOrderViewState4 content;
        MarginCallMarketOrderViewState2 content2;
        OrderForm6 orderForm6;
        MarginCallMarketOrderViewState3 partial;
        String string2;
        Money moneyPlus;
        Money moneyMinus;
        Money money;
        String str;
        String str2;
        String str3;
        MaintenanceCallDataDto maintenance_call_data;
        MoneyDto amount_towards_call;
        MaintenanceCallDataDto maintenance_call_data2;
        MoneyDto amount_towards_call2;
        MaintenanceCallDataDto maintenance_call_data3;
        MaintenanceCallDataDto maintenance_call_data4;
        MoneyDto total_estimated_cash_flow;
        MaintenanceCallDataDto maintenance_call_data5;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MarginCallMarketOrderDataState2 maintenanceCallDataState = dataState.getMaintenanceCallDataState();
        if (maintenanceCallDataState instanceof MarginCallMarketOrderDataState2.Error) {
            content = new MarginCallMarketOrderViewState4.Error(((MarginCallMarketOrderDataState2.Error) dataState.getMaintenanceCallDataState()).getE());
        } else if (Intrinsics.areEqual(maintenanceCallDataState, MarginCallMarketOrderDataState2.Loading.INSTANCE)) {
            content = MarginCallMarketOrderViewState4.Loading.INSTANCE;
        } else {
            if (!(maintenanceCallDataState instanceof MarginCallMarketOrderDataState2.Loaded)) {
                throw new NoWhenBranchMatchedException();
            }
            GetMaintenanceCallSummaryFromDataResponseDto data = ((MarginCallMarketOrderDataState2.Loaded) dataState.getMaintenanceCallDataState()).getData();
            content = new MarginCallMarketOrderViewState4.Content(data.getTrades().size(), data.getTotal_credit_cost_header(), data.getTotal_credit_cost_value(), data.getCall_credit_cost_value(), data.getAccount_type());
        }
        MarginCallMarketOrderDataState3 nbboSummaryDataState = dataState.getNbboSummaryDataState();
        if (nbboSummaryDataState instanceof MarginCallMarketOrderDataState3.Error) {
            content2 = new MarginCallMarketOrderViewState2.Error(((MarginCallMarketOrderDataState3.Error) dataState.getNbboSummaryDataState()).getE());
        } else if (Intrinsics.areEqual(nbboSummaryDataState, MarginCallMarketOrderDataState3.Loading.INSTANCE)) {
            content2 = MarginCallMarketOrderViewState2.Loading.INSTANCE;
        } else if (nbboSummaryDataState instanceof MarginCallMarketOrderDataState3.Loaded) {
            MarginCallMarketOrderDataState3.Loaded loaded = (MarginCallMarketOrderDataState3.Loaded) dataState.getNbboSummaryDataState();
            List<OrderNbboSummaryDto> order_nbbo_summaries = loaded.getData().getOrder_nbbo_summaries();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_nbbo_summaries, 10));
            for (OrderNbboSummaryDto orderNbboSummaryDto : order_nbbo_summaries) {
                arrayList.add(new Tuples2(orderNbboSummaryDto.getOrder_summary(), orderNbboSummaryDto.getNbbo_summary()));
            }
            content2 = new MarginCallMarketOrderViewState2.Content(arrayList, loaded.getData().getLast_refreshed_time(), loaded.getData().getRefresh_action());
        } else {
            if (nbboSummaryDataState != null) {
                throw new NoWhenBranchMatchedException();
            }
            content2 = null;
        }
        if (Intrinsics.areEqual(dataState.getTradeSubmissionState(), MarginCallMarketOrderDataState5.NotStarted.INSTANCE)) {
            orderForm6 = OrderForm6.REVIEWING;
        } else if (dataState.getTradeSubmissionState() instanceof MarginCallMarketOrderDataState5.Submitting) {
            orderForm6 = OrderForm6.SUBMITTING;
        } else {
            orderForm6 = ((dataState.getTradeSubmissionState() instanceof MarginCallMarketOrderDataState5.Complete) && (dataState.getOrderStatusPollingState() instanceof MarginCallMarketOrderDataState4.Polling)) ? OrderForm6.SUBMITTED : OrderForm6.CONFIRMATION;
        }
        MarginCallMarketOrderDataState4 orderStatusPollingState = dataState.getOrderStatusPollingState();
        MarginCallMarketOrderDataState4.Complete complete = orderStatusPollingState instanceof MarginCallMarketOrderDataState4.Complete ? (MarginCallMarketOrderDataState4.Complete) orderStatusPollingState : null;
        if (complete != null) {
            GetMaintenanceCallDataResponseDto initialMaintenanceCallState = dataState.getInitialMaintenanceCallState();
            Collection<TradeDto> sells = (initialMaintenanceCallState == null || (maintenance_call_data5 = initialMaintenanceCallState.getMaintenance_call_data()) == null) ? null : maintenance_call_data5.getSells();
            GetMaintenanceCallDataResponseDto initialMaintenanceCallState2 = dataState.getInitialMaintenanceCallState();
            Money money2 = (initialMaintenanceCallState2 == null || (maintenance_call_data4 = initialMaintenanceCallState2.getMaintenance_call_data()) == null || (total_estimated_cash_flow = maintenance_call_data4.getTotal_estimated_cash_flow()) == null) ? null : Money3.toMoney(total_estimated_cash_flow);
            GetMaintenanceCallDataResponseDto initialMaintenanceCallState3 = dataState.getInitialMaintenanceCallState();
            CashFlowStateDto cash_flow_state = (initialMaintenanceCallState3 == null || (maintenance_call_data3 = initialMaintenanceCallState3.getMaintenance_call_data()) == null) ? null : maintenance_call_data3.getCash_flow_state();
            int i = cash_flow_state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cash_flow_state.ordinal()];
            if (i == 1) {
                string2 = this.resources.getString(C16772R.string.cash_flow_credit);
            } else {
                string2 = i != 2 ? null : this.resources.getString(C16772R.string.cash_flow_cost);
            }
            Collection<Order> collectionValues = complete.getOrderState().values();
            Collection<Order> collection = collectionValues;
            boolean z = collection instanceof Collection;
            int i2 = 0;
            if (!z || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((Order) it.next()).isSuccess() && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                Money executedNotional = ((Order) it2.next()).getExecutedNotional();
                if (executedNotional != null) {
                    arrayList2.add(executedNotional);
                }
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                moneyPlus = (Money) it3.next();
                while (it3.hasNext()) {
                    moneyPlus = moneyPlus.plus((Money) it3.next());
                }
            } else {
                moneyPlus = null;
            }
            Money moneyMinus2 = (moneyPlus == null || money2 == null) ? null : money2.minus(moneyPlus);
            GetMaintenanceCallDataResponseDto initialMaintenanceCallState4 = dataState.getInitialMaintenanceCallState();
            Money money3 = (initialMaintenanceCallState4 == null || (maintenance_call_data2 = initialMaintenanceCallState4.getMaintenance_call_data()) == null || (amount_towards_call2 = maintenance_call_data2.getAmount_towards_call()) == null) ? null : Money3.toMoney(amount_towards_call2);
            GetMaintenanceCallDataResponseDto maintenanceCallData = complete.getMaintenanceCallData();
            Money money4 = (maintenanceCallData == null || (maintenance_call_data = maintenanceCallData.getMaintenance_call_data()) == null || (amount_towards_call = maintenance_call_data.getAmount_towards_call()) == null) ? null : Money3.toMoney(amount_towards_call);
            if (money3 == null) {
                moneyMinus = null;
            } else if (money4 == null || (moneyMinus = money3.minus(money4)) == null) {
                moneyMinus = money3;
            }
            if (z && collection.isEmpty()) {
                String string3 = this.resources.getString(C16772R.string.order_summary_pending, getOrdersStringSummary(collectionValues, sells));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = this.resources.getString(C16772R.string.view_orders);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = this.resources.getString(C16772R.string.positions_closed_partial, Integer.valueOf(i2), Integer.valueOf(collectionValues.size()));
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                String string6 = this.resources.getString(C16772R.string.estimated_cost_credit, string2);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                if (money2 == null) {
                }
                String strValueOf = String.valueOf(str3);
                String string7 = this.resources.getString(C16772R.string.estimated_credit_toward_call);
                Intrinsics.checkNotNullExpressionValue(string7, str2);
                partial = new MarginCallMarketOrderViewState3.Pending(string3, string4, str, string6, strValueOf, string7, String.valueOf(money == null ? Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
            } else {
                Iterator<T> it4 = collection.iterator();
                while (it4.hasNext()) {
                    if (!((Order) it4.next()).getIsPending()) {
                        if (z && collection.isEmpty()) {
                            Money money5 = moneyPlus;
                            String string8 = this.resources.getString(C16772R.string.order_summary_completed, getOrdersStringSummary(collectionValues, sells));
                            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                            String strValueOf2 = String.valueOf(i2);
                            String string9 = this.resources.getString(C16772R.string.total_cost_credit, string2);
                            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                            String strValueOf3 = String.valueOf(money5 == null ? Money.format$default(money5, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
                            String string10 = this.resources.getString(C16772R.string.total_credit_toward_call);
                            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                            partial = new MarginCallMarketOrderViewState3.Completed(string8, strValueOf2, string9, strValueOf3, string10, String.valueOf(moneyMinus == null ? Money.format$default(moneyMinus, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
                        } else {
                            Iterator<T> it5 = collection.iterator();
                            while (it5.hasNext()) {
                                if (!((Order) it5.next()).isSuccess()) {
                                    if (z && collection.isEmpty()) {
                                        String string11 = this.resources.getString(C16772R.string.order_summary_failed, getOrdersStringSummary(collectionValues, sells));
                                        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                                        String string12 = this.resources.getString(C16772R.string.positions_closed_partial, Integer.valueOf(i2), Integer.valueOf(collectionValues.size()));
                                        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                                        String string13 = this.resources.getString(C16772R.string.estimated_cost_credit, string2);
                                        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                                        partial = new MarginCallMarketOrderViewState3.Failed(string11, string12, string13, String.valueOf(money2 == null ? Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
                                    } else {
                                        Iterator<T> it6 = collection.iterator();
                                        while (it6.hasNext()) {
                                            if (!((Order) it6.next()).isError()) {
                                                Resources resources = this.resources;
                                                int i3 = C16772R.string.order_summary_partial;
                                                ArrayList arrayList3 = new ArrayList();
                                                for (Object obj : collection) {
                                                    if (((Order) obj).isSuccess()) {
                                                        arrayList3.add(obj);
                                                    }
                                                }
                                                String string14 = resources.getString(i3, getOrdersStringSummary(arrayList3, sells));
                                                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                                                String string15 = this.resources.getString(C16772R.string.view_orders);
                                                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                                                String string16 = this.resources.getString(C16772R.string.positions_closed_partial, Integer.valueOf(i2), Integer.valueOf(collectionValues.size()));
                                                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                                                String string17 = this.resources.getString(C16772R.string.total_cost_credit, string2);
                                                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                                                String strValueOf4 = String.valueOf(moneyPlus != null ? Money.format$default(moneyPlus, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
                                                String string18 = this.resources.getString(C16772R.string.pending_cost_credit, string2);
                                                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                                                partial = new MarginCallMarketOrderViewState3.Partial(string14, string15, string16, string17, strValueOf4, string18, String.valueOf(moneyMinus2 != null ? Money.format$default(moneyMinus2, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
                                            }
                                        }
                                        String string112 = this.resources.getString(C16772R.string.order_summary_failed, getOrdersStringSummary(collectionValues, sells));
                                        Intrinsics.checkNotNullExpressionValue(string112, "getString(...)");
                                        String string122 = this.resources.getString(C16772R.string.positions_closed_partial, Integer.valueOf(i2), Integer.valueOf(collectionValues.size()));
                                        Intrinsics.checkNotNullExpressionValue(string122, "getString(...)");
                                        String string132 = this.resources.getString(C16772R.string.estimated_cost_credit, string2);
                                        Intrinsics.checkNotNullExpressionValue(string132, "getString(...)");
                                        partial = new MarginCallMarketOrderViewState3.Failed(string112, string122, string132, String.valueOf(money2 == null ? Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
                                    }
                                }
                            }
                            Money money52 = moneyPlus;
                            String string82 = this.resources.getString(C16772R.string.order_summary_completed, getOrdersStringSummary(collectionValues, sells));
                            Intrinsics.checkNotNullExpressionValue(string82, "getString(...)");
                            String strValueOf22 = String.valueOf(i2);
                            String string92 = this.resources.getString(C16772R.string.total_cost_credit, string2);
                            Intrinsics.checkNotNullExpressionValue(string92, "getString(...)");
                            String strValueOf32 = String.valueOf(money52 == null ? Money.format$default(money52, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
                            String string102 = this.resources.getString(C16772R.string.total_credit_toward_call);
                            Intrinsics.checkNotNullExpressionValue(string102, "getString(...)");
                            partial = new MarginCallMarketOrderViewState3.Completed(string82, strValueOf22, string92, strValueOf32, string102, String.valueOf(moneyMinus == null ? Money.format$default(moneyMinus, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
                        }
                    }
                }
                String string32 = this.resources.getString(C16772R.string.order_summary_pending, getOrdersStringSummary(collectionValues, sells));
                Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
                String string42 = this.resources.getString(C16772R.string.view_orders);
                Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
                String string52 = this.resources.getString(C16772R.string.positions_closed_partial, Integer.valueOf(i2), Integer.valueOf(collectionValues.size()));
                Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
                String string62 = this.resources.getString(C16772R.string.estimated_cost_credit, string2);
                Intrinsics.checkNotNullExpressionValue(string62, "getString(...)");
                if (money2 == null) {
                    money = money3;
                    str2 = "getString(...)";
                    str = string52;
                    str3 = Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                } else {
                    money = money3;
                    str = string52;
                    str2 = "getString(...)";
                    str3 = null;
                }
                String strValueOf5 = String.valueOf(str3);
                String string72 = this.resources.getString(C16772R.string.estimated_credit_toward_call);
                Intrinsics.checkNotNullExpressionValue(string72, str2);
                partial = new MarginCallMarketOrderViewState3.Pending(string32, string42, str, string62, strValueOf5, string72, String.valueOf(money == null ? Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
            }
        } else {
            partial = null;
        }
        return new MarginCallMarketOrderViewState(orderForm6, content, content2, partial);
    }

    private final String getOrdersStringSummary(Collection<Order> collection, Collection<TradeDto> collection2) throws Resources.NotFoundException {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Order order : collection) {
            String strAsString = null;
            if (collection2 != null) {
                Iterator<T> it = collection2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((TradeDto) next).getInstrument_id(), order.getInstrument().toString())) {
                        break;
                    }
                }
                TradeDto tradeDto = (TradeDto) next;
                if (tradeDto != null) {
                    String symbol = tradeDto.getSymbol();
                    BigDecimal displayQuantity = order.getDisplayQuantity();
                    if (displayQuantity == null) {
                        displayQuantity = tradeDto.getNum_shares().toBigDecimalOrThrow();
                    }
                    strAsString = asString(new SymbolShares(symbol, displayQuantity));
                }
            }
            if (strAsString != null) {
                arrayList.add(strAsString);
            }
        }
        return FormatAsList2.formatAsList(arrayList, this.resources);
    }

    /* compiled from: MarginCallMarketOrderStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderStateProvider$SymbolShares;", "", "symbol", "", EquityShareOrderFragment.ARG_SHARES, "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getSymbol", "()Ljava/lang/String;", "getShares", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SymbolShares {
        public static final int $stable = 8;
        private final BigDecimal shares;
        private final String symbol;

        public static /* synthetic */ SymbolShares copy$default(SymbolShares symbolShares, String str, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = symbolShares.symbol;
            }
            if ((i & 2) != 0) {
                bigDecimal = symbolShares.shares;
            }
            return symbolShares.copy(str, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getShares() {
            return this.shares;
        }

        public final SymbolShares copy(String symbol, BigDecimal shares) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(shares, "shares");
            return new SymbolShares(symbol, shares);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SymbolShares)) {
                return false;
            }
            SymbolShares symbolShares = (SymbolShares) other;
            return Intrinsics.areEqual(this.symbol, symbolShares.symbol) && Intrinsics.areEqual(this.shares, symbolShares.shares);
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + this.shares.hashCode();
        }

        public String toString() {
            return "SymbolShares(symbol=" + this.symbol + ", shares=" + this.shares + ")";
        }

        public SymbolShares(String symbol, BigDecimal shares) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(shares, "shares");
            this.symbol = symbol;
            this.shares = shares;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final BigDecimal getShares() {
            return this.shares;
        }
    }

    private final String asString(SymbolShares symbolShares) throws Resources.NotFoundException {
        Resources resources = this.resources;
        String string2 = resources.getString(C16772R.string.shares_of_symbol, resources.getQuantityString(C16772R.plurals.num_of_shares, symbolShares.getShares().intValue(), Integer.valueOf(symbolShares.getShares().intValue())), symbolShares.getSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
