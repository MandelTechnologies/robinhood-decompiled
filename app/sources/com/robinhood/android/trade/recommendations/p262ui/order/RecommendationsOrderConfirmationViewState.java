package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsOrderReceipt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationViewState;", "", "investmentId", "Ljava/util/UUID;", "orderReceipt", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderReceipt;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderReceipt;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getInvestmentId", "()Ljava/util/UUID;", "getOrderReceipt", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderReceipt;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecommendationsOrderConfirmationViewState {
    public static final int $stable = 8;
    private final BrokerageAccountType brokerageAccountType;
    private final UUID investmentId;
    private final UiRecommendationsOrderReceipt orderReceipt;

    public RecommendationsOrderConfirmationViewState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RecommendationsOrderConfirmationViewState copy$default(RecommendationsOrderConfirmationViewState recommendationsOrderConfirmationViewState, UUID uuid, UiRecommendationsOrderReceipt uiRecommendationsOrderReceipt, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = recommendationsOrderConfirmationViewState.investmentId;
        }
        if ((i & 2) != 0) {
            uiRecommendationsOrderReceipt = recommendationsOrderConfirmationViewState.orderReceipt;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = recommendationsOrderConfirmationViewState.brokerageAccountType;
        }
        return recommendationsOrderConfirmationViewState.copy(uuid, uiRecommendationsOrderReceipt, brokerageAccountType);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInvestmentId() {
        return this.investmentId;
    }

    /* renamed from: component2, reason: from getter */
    public final UiRecommendationsOrderReceipt getOrderReceipt() {
        return this.orderReceipt;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final RecommendationsOrderConfirmationViewState copy(UUID investmentId, UiRecommendationsOrderReceipt orderReceipt, BrokerageAccountType brokerageAccountType) {
        return new RecommendationsOrderConfirmationViewState(investmentId, orderReceipt, brokerageAccountType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsOrderConfirmationViewState)) {
            return false;
        }
        RecommendationsOrderConfirmationViewState recommendationsOrderConfirmationViewState = (RecommendationsOrderConfirmationViewState) other;
        return Intrinsics.areEqual(this.investmentId, recommendationsOrderConfirmationViewState.investmentId) && Intrinsics.areEqual(this.orderReceipt, recommendationsOrderConfirmationViewState.orderReceipt) && this.brokerageAccountType == recommendationsOrderConfirmationViewState.brokerageAccountType;
    }

    public int hashCode() {
        UUID uuid = this.investmentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        UiRecommendationsOrderReceipt uiRecommendationsOrderReceipt = this.orderReceipt;
        int iHashCode2 = (iHashCode + (uiRecommendationsOrderReceipt == null ? 0 : uiRecommendationsOrderReceipt.hashCode())) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        return iHashCode2 + (brokerageAccountType != null ? brokerageAccountType.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationsOrderConfirmationViewState(investmentId=" + this.investmentId + ", orderReceipt=" + this.orderReceipt + ", brokerageAccountType=" + this.brokerageAccountType + ")";
    }

    public RecommendationsOrderConfirmationViewState(UUID uuid, UiRecommendationsOrderReceipt uiRecommendationsOrderReceipt, BrokerageAccountType brokerageAccountType) {
        this.investmentId = uuid;
        this.orderReceipt = uiRecommendationsOrderReceipt;
        this.brokerageAccountType = brokerageAccountType;
    }

    public /* synthetic */ RecommendationsOrderConfirmationViewState(UUID uuid, UiRecommendationsOrderReceipt uiRecommendationsOrderReceipt, BrokerageAccountType brokerageAccountType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uiRecommendationsOrderReceipt, (i & 4) != 0 ? null : brokerageAccountType);
    }

    public final UUID getInvestmentId() {
        return this.investmentId;
    }

    public final UiRecommendationsOrderReceipt getOrderReceipt() {
        return this.orderReceipt;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }
}
