package com.robinhood.android.event.trade;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderFormDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/event/trade/OrderFormDisplayDetails;", "", "orderTitle", "", "orderSubtitle", "orderReceiptTitle", "yesOrNoWithContractName", "selectedLegStrings", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getOrderTitle", "()Ljava/lang/String;", "getOrderSubtitle", "getOrderReceiptTitle", "getYesOrNoWithContractName", "getSelectedLegStrings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderFormDisplayDetails {
    public static final int $stable = 8;
    private final String orderReceiptTitle;
    private final String orderSubtitle;
    private final String orderTitle;
    private final List<String> selectedLegStrings;
    private final String yesOrNoWithContractName;

    public static /* synthetic */ OrderFormDisplayDetails copy$default(OrderFormDisplayDetails orderFormDisplayDetails, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderFormDisplayDetails.orderTitle;
        }
        if ((i & 2) != 0) {
            str2 = orderFormDisplayDetails.orderSubtitle;
        }
        if ((i & 4) != 0) {
            str3 = orderFormDisplayDetails.orderReceiptTitle;
        }
        if ((i & 8) != 0) {
            str4 = orderFormDisplayDetails.yesOrNoWithContractName;
        }
        if ((i & 16) != 0) {
            list = orderFormDisplayDetails.selectedLegStrings;
        }
        List list2 = list;
        String str5 = str3;
        return orderFormDisplayDetails.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderTitle() {
        return this.orderTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderSubtitle() {
        return this.orderSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderReceiptTitle() {
        return this.orderReceiptTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getYesOrNoWithContractName() {
        return this.yesOrNoWithContractName;
    }

    public final List<String> component5() {
        return this.selectedLegStrings;
    }

    public final OrderFormDisplayDetails copy(String orderTitle, String orderSubtitle, String orderReceiptTitle, String yesOrNoWithContractName, List<String> selectedLegStrings) {
        Intrinsics.checkNotNullParameter(orderTitle, "orderTitle");
        Intrinsics.checkNotNullParameter(orderReceiptTitle, "orderReceiptTitle");
        Intrinsics.checkNotNullParameter(yesOrNoWithContractName, "yesOrNoWithContractName");
        Intrinsics.checkNotNullParameter(selectedLegStrings, "selectedLegStrings");
        return new OrderFormDisplayDetails(orderTitle, orderSubtitle, orderReceiptTitle, yesOrNoWithContractName, selectedLegStrings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderFormDisplayDetails)) {
            return false;
        }
        OrderFormDisplayDetails orderFormDisplayDetails = (OrderFormDisplayDetails) other;
        return Intrinsics.areEqual(this.orderTitle, orderFormDisplayDetails.orderTitle) && Intrinsics.areEqual(this.orderSubtitle, orderFormDisplayDetails.orderSubtitle) && Intrinsics.areEqual(this.orderReceiptTitle, orderFormDisplayDetails.orderReceiptTitle) && Intrinsics.areEqual(this.yesOrNoWithContractName, orderFormDisplayDetails.yesOrNoWithContractName) && Intrinsics.areEqual(this.selectedLegStrings, orderFormDisplayDetails.selectedLegStrings);
    }

    public int hashCode() {
        int iHashCode = this.orderTitle.hashCode() * 31;
        String str = this.orderSubtitle;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.orderReceiptTitle.hashCode()) * 31) + this.yesOrNoWithContractName.hashCode()) * 31) + this.selectedLegStrings.hashCode();
    }

    public String toString() {
        return "OrderFormDisplayDetails(orderTitle=" + this.orderTitle + ", orderSubtitle=" + this.orderSubtitle + ", orderReceiptTitle=" + this.orderReceiptTitle + ", yesOrNoWithContractName=" + this.yesOrNoWithContractName + ", selectedLegStrings=" + this.selectedLegStrings + ")";
    }

    public OrderFormDisplayDetails(String orderTitle, String str, String orderReceiptTitle, String yesOrNoWithContractName, List<String> selectedLegStrings) {
        Intrinsics.checkNotNullParameter(orderTitle, "orderTitle");
        Intrinsics.checkNotNullParameter(orderReceiptTitle, "orderReceiptTitle");
        Intrinsics.checkNotNullParameter(yesOrNoWithContractName, "yesOrNoWithContractName");
        Intrinsics.checkNotNullParameter(selectedLegStrings, "selectedLegStrings");
        this.orderTitle = orderTitle;
        this.orderSubtitle = str;
        this.orderReceiptTitle = orderReceiptTitle;
        this.yesOrNoWithContractName = yesOrNoWithContractName;
        this.selectedLegStrings = selectedLegStrings;
    }

    public final String getOrderTitle() {
        return this.orderTitle;
    }

    public final String getOrderSubtitle() {
        return this.orderSubtitle;
    }

    public final String getOrderReceiptTitle() {
        return this.orderReceiptTitle;
    }

    public final String getYesOrNoWithContractName() {
        return this.yesOrNoWithContractName;
    }

    public final List<String> getSelectedLegStrings() {
        return this.selectedLegStrings;
    }
}
