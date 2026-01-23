package com.robinhood.android.history.p153ui;

import com.robinhood.android.history.p153ui.OrderDetailViewState3;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.OrderDetail;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010<\u001a\u0004\u0018\u00010=J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010C\u001a\u00020\rHÂ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010E\u001a\u00020\rHÆ\u0003Je\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u0010G\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\t\u0010K\u001a\u00020\u001cHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010(\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0011\u0010)\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010*\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0013\u0010+\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0013\u00104\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OrderDetailViewState;", "", "account", "Lcom/robinhood/models/db/Account;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "orderDetail", "Lcom/robinhood/models/db/bonfire/OrderDetail;", "instrument", "Lcom/robinhood/models/db/Instrument;", "tradeConfirmationDocument", "Lcom/robinhood/models/db/Document;", "marketBuysEnabled", "", "taxLotRow", "Lcom/robinhood/android/history/ui/TaxLotData;", "pnlUpdatesEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Order;Lcom/robinhood/models/db/bonfire/OrderDetail;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Document;ZLcom/robinhood/android/history/ui/TaxLotData;Z)V", "getTaxLotRow", "()Lcom/robinhood/android/history/ui/TaxLotData;", "getPnlUpdatesEnabled", "()Z", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "serverDrivenTradeConfirmationDocument", "getServerDrivenTradeConfirmationDocument", "()Lcom/robinhood/models/db/Document;", "serverDrivenCancelOrderData", "Lcom/robinhood/android/history/ui/CancelOrderData;", "getServerDrivenCancelOrderData", "()Lcom/robinhood/android/history/ui/CancelOrderData;", "showEditButtonForServerDrivenContainer", "getShowEditButtonForServerDrivenContainer", "isOrderLoaded", "isIpoOrderContainerVisible", "isStandardOrderContainerVisible", "serverDrivenBannerText", "getServerDrivenBannerText", "items", "", "Lcom/robinhood/models/serverdriven/db/StandardRow;", "getItems", "()Ljava/util/List;", "underlyingEquity", "getUnderlyingEquity", "toolbarSubtitle", "", "getToolbarSubtitle", "()Ljava/lang/CharSequence;", "state", "Lcom/robinhood/android/history/ui/State;", "getState", "()Lcom/robinhood/android/history/ui/State;", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderDetailViewState {
    public static final int $stable = 8;
    private final Account account;
    private final Instrument instrument;
    private final boolean marketBuysEnabled;
    private final Order order;
    private final OrderDetail orderDetail;
    private final boolean pnlUpdatesEnabled;
    private final TaxLotData taxLotRow;
    private final Document tradeConfirmationDocument;

    public OrderDetailViewState() {
        this(null, null, null, null, null, false, null, false, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    private final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    private final Order getOrder() {
        return this.order;
    }

    /* renamed from: component3, reason: from getter */
    private final OrderDetail getOrderDetail() {
        return this.orderDetail;
    }

    /* renamed from: component4, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component5, reason: from getter */
    private final Document getTradeConfirmationDocument() {
        return this.tradeConfirmationDocument;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    public static /* synthetic */ OrderDetailViewState copy$default(OrderDetailViewState orderDetailViewState, Account account, Order order, OrderDetail orderDetail, Instrument instrument, Document document, boolean z, TaxLotData taxLotData, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            account = orderDetailViewState.account;
        }
        if ((i & 2) != 0) {
            order = orderDetailViewState.order;
        }
        if ((i & 4) != 0) {
            orderDetail = orderDetailViewState.orderDetail;
        }
        if ((i & 8) != 0) {
            instrument = orderDetailViewState.instrument;
        }
        if ((i & 16) != 0) {
            document = orderDetailViewState.tradeConfirmationDocument;
        }
        if ((i & 32) != 0) {
            z = orderDetailViewState.marketBuysEnabled;
        }
        if ((i & 64) != 0) {
            taxLotData = orderDetailViewState.taxLotRow;
        }
        if ((i & 128) != 0) {
            z2 = orderDetailViewState.pnlUpdatesEnabled;
        }
        TaxLotData taxLotData2 = taxLotData;
        boolean z3 = z2;
        Document document2 = document;
        boolean z4 = z;
        return orderDetailViewState.copy(account, order, orderDetail, instrument, document2, z4, taxLotData2, z3);
    }

    /* renamed from: component7, reason: from getter */
    public final TaxLotData getTaxLotRow() {
        return this.taxLotRow;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final OrderDetailViewState copy(Account account, Order order, OrderDetail orderDetail, Instrument instrument, Document tradeConfirmationDocument, boolean marketBuysEnabled, TaxLotData taxLotRow, boolean pnlUpdatesEnabled) {
        return new OrderDetailViewState(account, order, orderDetail, instrument, tradeConfirmationDocument, marketBuysEnabled, taxLotRow, pnlUpdatesEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailViewState)) {
            return false;
        }
        OrderDetailViewState orderDetailViewState = (OrderDetailViewState) other;
        return Intrinsics.areEqual(this.account, orderDetailViewState.account) && Intrinsics.areEqual(this.order, orderDetailViewState.order) && Intrinsics.areEqual(this.orderDetail, orderDetailViewState.orderDetail) && Intrinsics.areEqual(this.instrument, orderDetailViewState.instrument) && Intrinsics.areEqual(this.tradeConfirmationDocument, orderDetailViewState.tradeConfirmationDocument) && this.marketBuysEnabled == orderDetailViewState.marketBuysEnabled && Intrinsics.areEqual(this.taxLotRow, orderDetailViewState.taxLotRow) && this.pnlUpdatesEnabled == orderDetailViewState.pnlUpdatesEnabled;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        Order order = this.order;
        int iHashCode2 = (iHashCode + (order == null ? 0 : order.hashCode())) * 31;
        OrderDetail orderDetail = this.orderDetail;
        int iHashCode3 = (iHashCode2 + (orderDetail == null ? 0 : orderDetail.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode4 = (iHashCode3 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Document document = this.tradeConfirmationDocument;
        int iHashCode5 = (((iHashCode4 + (document == null ? 0 : document.hashCode())) * 31) + Boolean.hashCode(this.marketBuysEnabled)) * 31;
        TaxLotData taxLotData = this.taxLotRow;
        return ((iHashCode5 + (taxLotData != null ? taxLotData.hashCode() : 0)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled);
    }

    public String toString() {
        return "OrderDetailViewState(account=" + this.account + ", order=" + this.order + ", orderDetail=" + this.orderDetail + ", instrument=" + this.instrument + ", tradeConfirmationDocument=" + this.tradeConfirmationDocument + ", marketBuysEnabled=" + this.marketBuysEnabled + ", taxLotRow=" + this.taxLotRow + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ")";
    }

    public OrderDetailViewState(Account account, Order order, OrderDetail orderDetail, Instrument instrument, Document document, boolean z, TaxLotData taxLotData, boolean z2) {
        this.account = account;
        this.order = order;
        this.orderDetail = orderDetail;
        this.instrument = instrument;
        this.tradeConfirmationDocument = document;
        this.marketBuysEnabled = z;
        this.taxLotRow = taxLotData;
        this.pnlUpdatesEnabled = z2;
    }

    public /* synthetic */ OrderDetailViewState(Account account, Order order, OrderDetail orderDetail, Instrument instrument, Document document, boolean z, TaxLotData taxLotData, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : order, (i & 4) != 0 ? null : orderDetail, (i & 8) != 0 ? null : instrument, (i & 16) != 0 ? null : document, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : taxLotData, (i & 128) != 0 ? false : z2);
    }

    public final TaxLotData getTaxLotRow() {
        return this.taxLotRow;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final UUID getInstrumentId() {
        Instrument instrument = this.instrument;
        if (instrument != null) {
            return instrument.getId();
        }
        return null;
    }

    public final String getAccountNumber() {
        Order order = this.order;
        if (order != null) {
            return order.getAccountNumber();
        }
        return null;
    }

    public final Document getServerDrivenTradeConfirmationDocument() {
        OrderDetail orderDetail = this.orderDetail;
        if (orderDetail == null || !orderDetail.isTradeConfirmationButtonVisible()) {
            return null;
        }
        return this.tradeConfirmationDocument;
    }

    public final CancelOrderData getServerDrivenCancelOrderData() {
        OrderDetail orderDetail;
        if (this.account == null || (orderDetail = this.orderDetail) == null || !orderDetail.isCancellable()) {
            return null;
        }
        return new CancelOrderData(this.account.getBrokerageAccountType(), this.orderDetail.getSymbol(), this.orderDetail.getQuantity(), this.orderDetail.getOrderSide());
    }

    public final boolean getShowEditButtonForServerDrivenContainer() {
        OrderDetail orderDetail = this.orderDetail;
        return orderDetail != null && orderDetail.isEditable();
    }

    public final boolean isOrderLoaded() {
        if (this.order == null) {
            return false;
        }
        OrderDetailViewState3 state = getState();
        if (state instanceof OrderDetailViewState3.StandardOrderContent) {
            return true;
        }
        if (state instanceof OrderDetailViewState3.IpoOrderContent) {
            return this.orderDetail != null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isIpoOrderContainerVisible() {
        OrderDetailViewState3 state = getState();
        if (state instanceof OrderDetailViewState3.StandardOrderContent) {
            return false;
        }
        if (state instanceof OrderDetailViewState3.IpoOrderContent) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isStandardOrderContainerVisible() {
        OrderDetailViewState3 state = getState();
        if (state instanceof OrderDetailViewState3.StandardOrderContent) {
            return true;
        }
        if (state instanceof OrderDetailViewState3.IpoOrderContent) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getServerDrivenBannerText() {
        OrderDetailViewState3 state = getState();
        if (state instanceof OrderDetailViewState3.StandardOrderContent) {
            return null;
        }
        if (state instanceof OrderDetailViewState3.IpoOrderContent) {
            return ((OrderDetailViewState3.IpoOrderContent) state).getBannerTextMarkdown();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<StandardRow> getItems() {
        OrderDetailViewState3 state = getState();
        if (state instanceof OrderDetailViewState3.StandardOrderContent) {
            return null;
        }
        if (state instanceof OrderDetailViewState3.IpoOrderContent) {
            return ((OrderDetailViewState3.IpoOrderContent) state).getItems();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getUnderlyingEquity() {
        OrderDetailViewState3 state = getState();
        if (state instanceof OrderDetailViewState3.StandardOrderContent) {
            Instrument instrument = this.instrument;
            if (instrument != null) {
                return instrument.getSymbol();
            }
            return null;
        }
        if (!(state instanceof OrderDetailViewState3.IpoOrderContent)) {
            throw new NoWhenBranchMatchedException();
        }
        OrderDetail orderDetail = ((OrderDetailViewState3.IpoOrderContent) state).getOrderDetail();
        if (orderDetail != null) {
            return orderDetail.getSymbol();
        }
        return null;
    }

    public final CharSequence getToolbarSubtitle() {
        return getState().getToolbarSubtitle();
    }

    private final OrderDetailViewState3 getState() {
        Order order = this.order;
        if (order != null && order.isIpoAccessOrder()) {
            return new OrderDetailViewState3.IpoOrderContent(this.orderDetail);
        }
        return new OrderDetailViewState3.StandardOrderContent(this.order, this.instrument, this.marketBuysEnabled);
    }

    public final StringResource toolbarTitle() {
        return getState().toolbarTitle();
    }
}
