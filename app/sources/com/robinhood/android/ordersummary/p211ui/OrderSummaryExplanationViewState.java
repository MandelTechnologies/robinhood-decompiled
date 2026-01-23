package com.robinhood.android.ordersummary.p211ui;

import com.robinhood.ordersummary.models.api.ApiOrderSummaryExplanation;
import com.robinhood.ordersummary.models.api.ApiSection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSummaryExplanationViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/ordersummary/ui/OrderSummaryExplanationViewState;", "", "orderSummaryExplanation", "Lcom/robinhood/ordersummary/models/api/ApiOrderSummaryExplanation;", "<init>", "(Lcom/robinhood/ordersummary/models/api/ApiOrderSummaryExplanation;)V", "sections", "", "Lcom/robinhood/ordersummary/models/api/ApiSection;", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderSummaryExplanationViewState {
    private final ApiOrderSummaryExplanation orderSummaryExplanation;
    private final List<ApiSection> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderSummaryExplanationViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final ApiOrderSummaryExplanation getOrderSummaryExplanation() {
        return this.orderSummaryExplanation;
    }

    public static /* synthetic */ OrderSummaryExplanationViewState copy$default(OrderSummaryExplanationViewState orderSummaryExplanationViewState, ApiOrderSummaryExplanation apiOrderSummaryExplanation, int i, Object obj) {
        if ((i & 1) != 0) {
            apiOrderSummaryExplanation = orderSummaryExplanationViewState.orderSummaryExplanation;
        }
        return orderSummaryExplanationViewState.copy(apiOrderSummaryExplanation);
    }

    public final OrderSummaryExplanationViewState copy(ApiOrderSummaryExplanation orderSummaryExplanation) {
        return new OrderSummaryExplanationViewState(orderSummaryExplanation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderSummaryExplanationViewState) && Intrinsics.areEqual(this.orderSummaryExplanation, ((OrderSummaryExplanationViewState) other).orderSummaryExplanation);
    }

    public int hashCode() {
        ApiOrderSummaryExplanation apiOrderSummaryExplanation = this.orderSummaryExplanation;
        if (apiOrderSummaryExplanation == null) {
            return 0;
        }
        return apiOrderSummaryExplanation.hashCode();
    }

    public String toString() {
        return "OrderSummaryExplanationViewState(orderSummaryExplanation=" + this.orderSummaryExplanation + ")";
    }

    public OrderSummaryExplanationViewState(ApiOrderSummaryExplanation apiOrderSummaryExplanation) {
        List<ApiSection> sections;
        this.orderSummaryExplanation = apiOrderSummaryExplanation;
        this.sections = (apiOrderSummaryExplanation == null || (sections = apiOrderSummaryExplanation.getSections()) == null) ? CollectionsKt.emptyList() : sections;
    }

    public /* synthetic */ OrderSummaryExplanationViewState(ApiOrderSummaryExplanation apiOrderSummaryExplanation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiOrderSummaryExplanation);
    }

    public final List<ApiSection> getSections() {
        return this.sections;
    }
}
