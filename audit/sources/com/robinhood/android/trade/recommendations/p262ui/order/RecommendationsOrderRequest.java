package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderRequest;", "", "refId", "Ljava/util/UUID;", "recommendationId", "amount", "Lcom/robinhood/models/util/Money;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getRefId", "()Ljava/util/UUID;", "getRecommendationId", "getAmount", "()Lcom/robinhood/models/util/Money;", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecommendationsOrderRequest {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Money amount;
    private final BrokerageAccountType brokerageAccountType;
    private final UUID recommendationId;
    private final UUID refId;

    public static /* synthetic */ RecommendationsOrderRequest copy$default(RecommendationsOrderRequest recommendationsOrderRequest, UUID uuid, UUID uuid2, Money money, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = recommendationsOrderRequest.refId;
        }
        if ((i & 2) != 0) {
            uuid2 = recommendationsOrderRequest.recommendationId;
        }
        if ((i & 4) != 0) {
            money = recommendationsOrderRequest.amount;
        }
        if ((i & 8) != 0) {
            str = recommendationsOrderRequest.accountNumber;
        }
        if ((i & 16) != 0) {
            brokerageAccountType = recommendationsOrderRequest.brokerageAccountType;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        Money money2 = money;
        return recommendationsOrderRequest.copy(uuid, uuid2, money2, str, brokerageAccountType2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getRecommendationId() {
        return this.recommendationId;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final RecommendationsOrderRequest copy(UUID refId, UUID recommendationId, Money amount, String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new RecommendationsOrderRequest(refId, recommendationId, amount, accountNumber, brokerageAccountType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsOrderRequest)) {
            return false;
        }
        RecommendationsOrderRequest recommendationsOrderRequest = (RecommendationsOrderRequest) other;
        return Intrinsics.areEqual(this.refId, recommendationsOrderRequest.refId) && Intrinsics.areEqual(this.recommendationId, recommendationsOrderRequest.recommendationId) && Intrinsics.areEqual(this.amount, recommendationsOrderRequest.amount) && Intrinsics.areEqual(this.accountNumber, recommendationsOrderRequest.accountNumber) && this.brokerageAccountType == recommendationsOrderRequest.brokerageAccountType;
    }

    public int hashCode() {
        int iHashCode = ((((this.refId.hashCode() * 31) + this.recommendationId.hashCode()) * 31) + this.amount.hashCode()) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        return iHashCode2 + (brokerageAccountType != null ? brokerageAccountType.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationsOrderRequest(refId=" + this.refId + ", recommendationId=" + this.recommendationId + ", amount=" + this.amount + ", accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ")";
    }

    public RecommendationsOrderRequest(UUID refId, UUID recommendationId, Money amount, String str, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.refId = refId;
        this.recommendationId = recommendationId;
        this.amount = amount;
        this.accountNumber = str;
        this.brokerageAccountType = brokerageAccountType;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final UUID getRecommendationId() {
        return this.recommendationId;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }
}
