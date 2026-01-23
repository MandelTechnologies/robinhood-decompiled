package com.robinhood.android.advisory.dashboard.insights;

import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.models.advisory.p304db.ManagedAccountState;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InsightsRowDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003JS\u0010#\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;", "", "unseenInsights", "", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "impressionCount", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "accountState", "Lcom/robinhood/models/advisory/db/ManagedAccountState;", "latestDigest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "inPortfolioDigestExperiment", "", "<init>", "(Ljava/util/List;JLcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/advisory/db/ManagedAccountState;Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;Z)V", "getUnseenInsights", "()Ljava/util/List;", "getImpressionCount", "()J", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getAccountState", "()Lcom/robinhood/models/advisory/db/ManagedAccountState;", "getLatestDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "getInPortfolioDigestExperiment", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InsightsRowDataState {
    public static final int $stable = 8;
    private final ManagedAccountState accountState;
    private final BrokerageAccountType brokerageAccountType;
    private final long impressionCount;
    private final boolean inPortfolioDigestExperiment;
    private final PortfolioDigest.HasOnboarded latestDigest;
    private final List<AdvisoryInsight> unseenInsights;

    public InsightsRowDataState() {
        this(null, 0L, null, null, null, false, 63, null);
    }

    public static /* synthetic */ InsightsRowDataState copy$default(InsightsRowDataState insightsRowDataState, List list, long j, BrokerageAccountType brokerageAccountType, ManagedAccountState managedAccountState, PortfolioDigest.HasOnboarded hasOnboarded, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = insightsRowDataState.unseenInsights;
        }
        if ((i & 2) != 0) {
            j = insightsRowDataState.impressionCount;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = insightsRowDataState.brokerageAccountType;
        }
        if ((i & 8) != 0) {
            managedAccountState = insightsRowDataState.accountState;
        }
        if ((i & 16) != 0) {
            hasOnboarded = insightsRowDataState.latestDigest;
        }
        if ((i & 32) != 0) {
            z = insightsRowDataState.inPortfolioDigestExperiment;
        }
        return insightsRowDataState.copy(list, j, brokerageAccountType, managedAccountState, hasOnboarded, z);
    }

    public final List<AdvisoryInsight> component1() {
        return this.unseenInsights;
    }

    /* renamed from: component2, reason: from getter */
    public final long getImpressionCount() {
        return this.impressionCount;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component4, reason: from getter */
    public final ManagedAccountState getAccountState() {
        return this.accountState;
    }

    /* renamed from: component5, reason: from getter */
    public final PortfolioDigest.HasOnboarded getLatestDigest() {
        return this.latestDigest;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getInPortfolioDigestExperiment() {
        return this.inPortfolioDigestExperiment;
    }

    public final InsightsRowDataState copy(List<AdvisoryInsight> unseenInsights, long impressionCount, BrokerageAccountType brokerageAccountType, ManagedAccountState accountState, PortfolioDigest.HasOnboarded latestDigest, boolean inPortfolioDigestExperiment) {
        return new InsightsRowDataState(unseenInsights, impressionCount, brokerageAccountType, accountState, latestDigest, inPortfolioDigestExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsightsRowDataState)) {
            return false;
        }
        InsightsRowDataState insightsRowDataState = (InsightsRowDataState) other;
        return Intrinsics.areEqual(this.unseenInsights, insightsRowDataState.unseenInsights) && this.impressionCount == insightsRowDataState.impressionCount && this.brokerageAccountType == insightsRowDataState.brokerageAccountType && this.accountState == insightsRowDataState.accountState && Intrinsics.areEqual(this.latestDigest, insightsRowDataState.latestDigest) && this.inPortfolioDigestExperiment == insightsRowDataState.inPortfolioDigestExperiment;
    }

    public int hashCode() {
        List<AdvisoryInsight> list = this.unseenInsights;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + Long.hashCode(this.impressionCount)) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode2 = (iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        ManagedAccountState managedAccountState = this.accountState;
        int iHashCode3 = (iHashCode2 + (managedAccountState == null ? 0 : managedAccountState.hashCode())) * 31;
        PortfolioDigest.HasOnboarded hasOnboarded = this.latestDigest;
        return ((iHashCode3 + (hasOnboarded != null ? hasOnboarded.hashCode() : 0)) * 31) + Boolean.hashCode(this.inPortfolioDigestExperiment);
    }

    public String toString() {
        return "InsightsRowDataState(unseenInsights=" + this.unseenInsights + ", impressionCount=" + this.impressionCount + ", brokerageAccountType=" + this.brokerageAccountType + ", accountState=" + this.accountState + ", latestDigest=" + this.latestDigest + ", inPortfolioDigestExperiment=" + this.inPortfolioDigestExperiment + ")";
    }

    public InsightsRowDataState(List<AdvisoryInsight> list, long j, BrokerageAccountType brokerageAccountType, ManagedAccountState managedAccountState, PortfolioDigest.HasOnboarded hasOnboarded, boolean z) {
        this.unseenInsights = list;
        this.impressionCount = j;
        this.brokerageAccountType = brokerageAccountType;
        this.accountState = managedAccountState;
        this.latestDigest = hasOnboarded;
        this.inPortfolioDigestExperiment = z;
    }

    public /* synthetic */ InsightsRowDataState(List list, long j, BrokerageAccountType brokerageAccountType, ManagedAccountState managedAccountState, PortfolioDigest.HasOnboarded hasOnboarded, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : brokerageAccountType, (i & 8) != 0 ? null : managedAccountState, (i & 16) != 0 ? null : hasOnboarded, (i & 32) != 0 ? false : z);
    }

    public final List<AdvisoryInsight> getUnseenInsights() {
        return this.unseenInsights;
    }

    public final long getImpressionCount() {
        return this.impressionCount;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ManagedAccountState getAccountState() {
        return this.accountState;
    }

    public final PortfolioDigest.HasOnboarded getLatestDigest() {
        return this.latestDigest;
    }

    public final boolean getInPortfolioDigestExperiment() {
        return this.inPortfolioDigestExperiment;
    }
}
