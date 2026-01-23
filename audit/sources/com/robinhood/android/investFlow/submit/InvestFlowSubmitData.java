package com.robinhood.android.investFlow.submit;

import com.robinhood.investflow.models.api.ApiInvestFlowPostBody;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowSubmitData;", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "request", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getRequest", "()Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowSubmitData {
    public static final int $stable = 8;
    private final BrokerageAccountType brokerageAccountType;
    private final ApiInvestFlowPostBody request;

    public static /* synthetic */ InvestFlowSubmitData copy$default(InvestFlowSubmitData investFlowSubmitData, BrokerageAccountType brokerageAccountType, ApiInvestFlowPostBody apiInvestFlowPostBody, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = investFlowSubmitData.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            apiInvestFlowPostBody = investFlowSubmitData.request;
        }
        return investFlowSubmitData.copy(brokerageAccountType, apiInvestFlowPostBody);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiInvestFlowPostBody getRequest() {
        return this.request;
    }

    public final InvestFlowSubmitData copy(BrokerageAccountType brokerageAccountType, ApiInvestFlowPostBody request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new InvestFlowSubmitData(brokerageAccountType, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowSubmitData)) {
            return false;
        }
        InvestFlowSubmitData investFlowSubmitData = (InvestFlowSubmitData) other;
        return this.brokerageAccountType == investFlowSubmitData.brokerageAccountType && Intrinsics.areEqual(this.request, investFlowSubmitData.request);
    }

    public int hashCode() {
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        return ((brokerageAccountType == null ? 0 : brokerageAccountType.hashCode()) * 31) + this.request.hashCode();
    }

    public String toString() {
        return "InvestFlowSubmitData(brokerageAccountType=" + this.brokerageAccountType + ", request=" + this.request + ")";
    }

    public InvestFlowSubmitData(BrokerageAccountType brokerageAccountType, ApiInvestFlowPostBody request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.brokerageAccountType = brokerageAccountType;
        this.request = request;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ApiInvestFlowPostBody getRequest() {
        return this.request;
    }
}
