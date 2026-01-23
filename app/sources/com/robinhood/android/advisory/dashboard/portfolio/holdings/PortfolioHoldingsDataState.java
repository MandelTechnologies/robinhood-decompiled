package com.robinhood.android.advisory.dashboard.portfolio.holdings;

import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioHoldingsDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDataState;", "", "managedPortfolio", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "inTaxLossHarvestingExperiment", "", "<init>", "(Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;Lcom/robinhood/models/api/BrokerageAccountType;Z)V", "getManagedPortfolio", "()Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getInTaxLossHarvestingExperiment", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PortfolioHoldingsDataState {
    public static final int $stable = 8;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean inTaxLossHarvestingExperiment;
    private final ManagedPortfolioSummary managedPortfolio;

    public PortfolioHoldingsDataState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ PortfolioHoldingsDataState copy$default(PortfolioHoldingsDataState portfolioHoldingsDataState, ManagedPortfolioSummary managedPortfolioSummary, BrokerageAccountType brokerageAccountType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            managedPortfolioSummary = portfolioHoldingsDataState.managedPortfolio;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = portfolioHoldingsDataState.brokerageAccountType;
        }
        if ((i & 4) != 0) {
            z = portfolioHoldingsDataState.inTaxLossHarvestingExperiment;
        }
        return portfolioHoldingsDataState.copy(managedPortfolioSummary, brokerageAccountType, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ManagedPortfolioSummary getManagedPortfolio() {
        return this.managedPortfolio;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInTaxLossHarvestingExperiment() {
        return this.inTaxLossHarvestingExperiment;
    }

    public final PortfolioHoldingsDataState copy(ManagedPortfolioSummary managedPortfolio, BrokerageAccountType brokerageAccountType, boolean inTaxLossHarvestingExperiment) {
        return new PortfolioHoldingsDataState(managedPortfolio, brokerageAccountType, inTaxLossHarvestingExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioHoldingsDataState)) {
            return false;
        }
        PortfolioHoldingsDataState portfolioHoldingsDataState = (PortfolioHoldingsDataState) other;
        return Intrinsics.areEqual(this.managedPortfolio, portfolioHoldingsDataState.managedPortfolio) && this.brokerageAccountType == portfolioHoldingsDataState.brokerageAccountType && this.inTaxLossHarvestingExperiment == portfolioHoldingsDataState.inTaxLossHarvestingExperiment;
    }

    public int hashCode() {
        ManagedPortfolioSummary managedPortfolioSummary = this.managedPortfolio;
        int iHashCode = (managedPortfolioSummary == null ? 0 : managedPortfolioSummary.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        return ((iHashCode + (brokerageAccountType != null ? brokerageAccountType.hashCode() : 0)) * 31) + Boolean.hashCode(this.inTaxLossHarvestingExperiment);
    }

    public String toString() {
        return "PortfolioHoldingsDataState(managedPortfolio=" + this.managedPortfolio + ", brokerageAccountType=" + this.brokerageAccountType + ", inTaxLossHarvestingExperiment=" + this.inTaxLossHarvestingExperiment + ")";
    }

    public PortfolioHoldingsDataState(ManagedPortfolioSummary managedPortfolioSummary, BrokerageAccountType brokerageAccountType, boolean z) {
        this.managedPortfolio = managedPortfolioSummary;
        this.brokerageAccountType = brokerageAccountType;
        this.inTaxLossHarvestingExperiment = z;
    }

    public /* synthetic */ PortfolioHoldingsDataState(ManagedPortfolioSummary managedPortfolioSummary, BrokerageAccountType brokerageAccountType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : managedPortfolioSummary, (i & 2) != 0 ? null : brokerageAccountType, (i & 4) != 0 ? false : z);
    }

    public final ManagedPortfolioSummary getManagedPortfolio() {
        return this.managedPortfolio;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final boolean getInTaxLossHarvestingExperiment() {
        return this.inTaxLossHarvestingExperiment;
    }
}
