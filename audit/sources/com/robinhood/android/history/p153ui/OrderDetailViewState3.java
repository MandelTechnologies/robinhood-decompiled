package com.robinhood.android.history.p153ui;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.OrderDetail;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.shared.history.order.Orders3;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/history/ui/State;", "", "<init>", "()V", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "toolbarSubtitle", "", "getToolbarSubtitle", "()Ljava/lang/CharSequence;", "StandardOrderContent", "IpoOrderContent", "Lcom/robinhood/android/history/ui/State$IpoOrderContent;", "Lcom/robinhood/android/history/ui/State$StandardOrderContent;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.State, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class OrderDetailViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ OrderDetailViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract CharSequence getToolbarSubtitle();

    public abstract StringResource toolbarTitle();

    private OrderDetailViewState3() {
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/history/ui/State$StandardOrderContent;", "Lcom/robinhood/android/history/ui/State;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "instrument", "Lcom/robinhood/models/db/Instrument;", "isMarketBuysExperimentMember", "", "<init>", "(Lcom/robinhood/models/db/Order;Lcom/robinhood/models/db/Instrument;Z)V", "getOrder", "()Lcom/robinhood/models/db/Order;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "()Z", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "toolbarSubtitle", "", "getToolbarSubtitle", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.State$StandardOrderContent, reason: from toString */
    public static final /* data */ class StandardOrderContent extends OrderDetailViewState3 {
        public static final int $stable = 8;
        private final Instrument instrument;
        private final boolean isMarketBuysExperimentMember;
        private final Order order;

        public StandardOrderContent() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ StandardOrderContent copy$default(StandardOrderContent standardOrderContent, Order order, Instrument instrument, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                order = standardOrderContent.order;
            }
            if ((i & 2) != 0) {
                instrument = standardOrderContent.instrument;
            }
            if ((i & 4) != 0) {
                z = standardOrderContent.isMarketBuysExperimentMember;
            }
            return standardOrderContent.copy(order, instrument, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Order getOrder() {
            return this.order;
        }

        /* renamed from: component2, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsMarketBuysExperimentMember() {
            return this.isMarketBuysExperimentMember;
        }

        public final StandardOrderContent copy(Order order, Instrument instrument, boolean isMarketBuysExperimentMember) {
            return new StandardOrderContent(order, instrument, isMarketBuysExperimentMember);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StandardOrderContent)) {
                return false;
            }
            StandardOrderContent standardOrderContent = (StandardOrderContent) other;
            return Intrinsics.areEqual(this.order, standardOrderContent.order) && Intrinsics.areEqual(this.instrument, standardOrderContent.instrument) && this.isMarketBuysExperimentMember == standardOrderContent.isMarketBuysExperimentMember;
        }

        public int hashCode() {
            Order order = this.order;
            int iHashCode = (order == null ? 0 : order.hashCode()) * 31;
            Instrument instrument = this.instrument;
            return ((iHashCode + (instrument != null ? instrument.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMarketBuysExperimentMember);
        }

        public String toString() {
            return "StandardOrderContent(order=" + this.order + ", instrument=" + this.instrument + ", isMarketBuysExperimentMember=" + this.isMarketBuysExperimentMember + ")";
        }

        public /* synthetic */ StandardOrderContent(Order order, Instrument instrument, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : order, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? false : z);
        }

        public final Order getOrder() {
            return this.order;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final boolean isMarketBuysExperimentMember() {
            return this.isMarketBuysExperimentMember;
        }

        public StandardOrderContent(Order order, Instrument instrument, boolean z) {
            super(null);
            this.order = order;
            this.instrument = instrument;
            this.isMarketBuysExperimentMember = z;
        }

        @Override // com.robinhood.android.history.p153ui.OrderDetailViewState3
        public StringResource toolbarTitle() {
            Order order = this.order;
            if (order == null) {
                return null;
            }
            if (order.getConfiguration() == Order.Configuration.MARKET && !this.isMarketBuysExperimentMember) {
                Instrument instrument = this.instrument;
                if (instrument == null) {
                    return null;
                }
                return Orders3.getOrderDisplayStringWithSymbol(order, instrument.getSymbol());
            }
            return Orders3.getOrderDisplayString(order);
        }

        @Override // com.robinhood.android.history.p153ui.OrderDetailViewState3
        public CharSequence getToolbarSubtitle() {
            Instrument instrument = this.instrument;
            if (instrument != null) {
                return instrument.getDisplayName();
            }
            return null;
        }
    }

    /* compiled from: OrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/history/ui/State$IpoOrderContent;", "Lcom/robinhood/android/history/ui/State;", "orderDetail", "Lcom/robinhood/models/db/bonfire/OrderDetail;", "<init>", "(Lcom/robinhood/models/db/bonfire/OrderDetail;)V", "getOrderDetail", "()Lcom/robinhood/models/db/bonfire/OrderDetail;", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "toolbarSubtitle", "", "getToolbarSubtitle", "()Ljava/lang/CharSequence;", "bannerTextMarkdown", "", "getBannerTextMarkdown", "()Ljava/lang/String;", "items", "", "Lcom/robinhood/models/serverdriven/db/StandardRow;", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.history.ui.State$IpoOrderContent, reason: from toString */
    public static final /* data */ class IpoOrderContent extends OrderDetailViewState3 {
        public static final int $stable = 8;
        private final String bannerTextMarkdown;
        private final List<StandardRow> items;
        private final OrderDetail orderDetail;

        public static /* synthetic */ IpoOrderContent copy$default(IpoOrderContent ipoOrderContent, OrderDetail orderDetail, int i, Object obj) {
            if ((i & 1) != 0) {
                orderDetail = ipoOrderContent.orderDetail;
            }
            return ipoOrderContent.copy(orderDetail);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderDetail getOrderDetail() {
            return this.orderDetail;
        }

        public final IpoOrderContent copy(OrderDetail orderDetail) {
            return new IpoOrderContent(orderDetail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IpoOrderContent) && Intrinsics.areEqual(this.orderDetail, ((IpoOrderContent) other).orderDetail);
        }

        public int hashCode() {
            OrderDetail orderDetail = this.orderDetail;
            if (orderDetail == null) {
                return 0;
            }
            return orderDetail.hashCode();
        }

        public String toString() {
            return "IpoOrderContent(orderDetail=" + this.orderDetail + ")";
        }

        public final OrderDetail getOrderDetail() {
            return this.orderDetail;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IpoOrderContent(OrderDetail orderDetail) {
            super(0 == true ? 1 : 0);
            this.orderDetail = orderDetail;
            this.bannerTextMarkdown = orderDetail != null ? orderDetail.getBannerMarkdown() : null;
            this.items = orderDetail != null ? orderDetail.getOrderDetailItems() : null;
        }

        @Override // com.robinhood.android.history.p153ui.OrderDetailViewState3
        public StringResource toolbarTitle() {
            String title;
            OrderDetail orderDetail = this.orderDetail;
            if (orderDetail == null || (title = orderDetail.getTitle()) == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(title);
        }

        @Override // com.robinhood.android.history.p153ui.OrderDetailViewState3
        public CharSequence getToolbarSubtitle() {
            OrderDetail orderDetail = this.orderDetail;
            if (orderDetail != null) {
                return orderDetail.getSubtitle();
            }
            return null;
        }

        public final String getBannerTextMarkdown() {
            return this.bannerTextMarkdown;
        }

        public final List<StandardRow> getItems() {
            return this.items;
        }
    }
}
