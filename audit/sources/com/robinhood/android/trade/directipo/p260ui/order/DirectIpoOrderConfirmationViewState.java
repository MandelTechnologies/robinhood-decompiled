package com.robinhood.android.trade.directipo.p260ui.order;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowItem;
import com.robinhood.directipo.models.p293ui.UiDirectIpoOrderResponse;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectIpoOrderConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationViewState;", "", "orderResponse", "Lcom/robinhood/directipo/models/ui/UiDirectIpoOrderResponse;", "<init>", "(Lcom/robinhood/directipo/models/ui/UiDirectIpoOrderResponse;)V", "getOrderResponse", "()Lcom/robinhood/directipo/models/ui/UiDirectIpoOrderResponse;", "title", "", "getTitle", "()Ljava/lang/CharSequence;", "description", "getDescription", "items", "", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowItem;", "getItems", "()Ljava/util/List;", CarResultComposable2.BUTTONS, "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "getButtons", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class DirectIpoOrderConfirmationViewState {
    public static final int $stable = 8;
    private final List<ServerDrivenButton> buttons;
    private final CharSequence description;
    private final UiDirectIpoOrderResponse orderResponse;
    private final CharSequence title;

    /* JADX WARN: Multi-variable type inference failed */
    public DirectIpoOrderConfirmationViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DirectIpoOrderConfirmationViewState copy$default(DirectIpoOrderConfirmationViewState directIpoOrderConfirmationViewState, UiDirectIpoOrderResponse uiDirectIpoOrderResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            uiDirectIpoOrderResponse = directIpoOrderConfirmationViewState.orderResponse;
        }
        return directIpoOrderConfirmationViewState.copy(uiDirectIpoOrderResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final UiDirectIpoOrderResponse getOrderResponse() {
        return this.orderResponse;
    }

    public final DirectIpoOrderConfirmationViewState copy(UiDirectIpoOrderResponse orderResponse) {
        return new DirectIpoOrderConfirmationViewState(orderResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DirectIpoOrderConfirmationViewState) && Intrinsics.areEqual(this.orderResponse, ((DirectIpoOrderConfirmationViewState) other).orderResponse);
    }

    public int hashCode() {
        UiDirectIpoOrderResponse uiDirectIpoOrderResponse = this.orderResponse;
        if (uiDirectIpoOrderResponse == null) {
            return 0;
        }
        return uiDirectIpoOrderResponse.hashCode();
    }

    public String toString() {
        return "DirectIpoOrderConfirmationViewState(orderResponse=" + this.orderResponse + ")";
    }

    public DirectIpoOrderConfirmationViewState(UiDirectIpoOrderResponse uiDirectIpoOrderResponse) {
        List<ServerDrivenButton> footerButtons;
        this.orderResponse = uiDirectIpoOrderResponse;
        this.title = uiDirectIpoOrderResponse != null ? uiDirectIpoOrderResponse.getTitle() : null;
        this.description = uiDirectIpoOrderResponse != null ? uiDirectIpoOrderResponse.getOrderSummary() : null;
        this.buttons = (uiDirectIpoOrderResponse == null || (footerButtons = uiDirectIpoOrderResponse.getFooterButtons()) == null) ? CollectionsKt.emptyList() : footerButtons;
    }

    public /* synthetic */ DirectIpoOrderConfirmationViewState(UiDirectIpoOrderResponse uiDirectIpoOrderResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiDirectIpoOrderResponse);
    }

    public final UiDirectIpoOrderResponse getOrderResponse() {
        return this.orderResponse;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getDescription() {
        return this.description;
    }

    public final List<OrderConfirmationRowItem> getItems() {
        UiDirectIpoOrderResponse uiDirectIpoOrderResponse = this.orderResponse;
        if (uiDirectIpoOrderResponse == null) {
            return CollectionsKt.emptyList();
        }
        List<UiDirectIpoOrderResponse.Item> orderDetailItems = uiDirectIpoOrderResponse.getOrderDetailItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(orderDetailItems, 10));
        for (UiDirectIpoOrderResponse.Item item : orderDetailItems) {
            arrayList.add(new OrderConfirmationRowItem(item.getLabel(), null, item.getValue(), null, 10, null));
        }
        return arrayList;
    }

    public final List<ServerDrivenButton> getButtons() {
        return this.buttons;
    }
}
