package com.robinhood.android.advisory.insights.hub;

import com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubViewState;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryInsightsHubDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubDataState;", "", "accountNumber", "", "insights", "", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "inCortexDigestExperiment", "", "cortexDigest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;)V", "getAccountNumber", "()Ljava/lang/String;", "getInsights", "()Ljava/util/List;", "getInCortexDigestExperiment", "()Z", "getCortexDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryInsightsHubDataState {
    private final String accountNumber;
    private final PortfolioDigest.HasOnboarded cortexDigest;
    private final boolean inCortexDigestExperiment;
    private final List<AdvisoryInsight> insights;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvisoryInsightsHubDataState copy$default(AdvisoryInsightsHubDataState advisoryInsightsHubDataState, String str, List list, boolean z, PortfolioDigest.HasOnboarded hasOnboarded, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightsHubDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            list = advisoryInsightsHubDataState.insights;
        }
        if ((i & 4) != 0) {
            z = advisoryInsightsHubDataState.inCortexDigestExperiment;
        }
        if ((i & 8) != 0) {
            hasOnboarded = advisoryInsightsHubDataState.cortexDigest;
        }
        return advisoryInsightsHubDataState.copy(str, list, z, hasOnboarded);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<AdvisoryInsight> component2() {
        return this.insights;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInCortexDigestExperiment() {
        return this.inCortexDigestExperiment;
    }

    /* renamed from: component4, reason: from getter */
    public final PortfolioDigest.HasOnboarded getCortexDigest() {
        return this.cortexDigest;
    }

    public final AdvisoryInsightsHubDataState copy(String accountNumber, List<AdvisoryInsight> insights, boolean inCortexDigestExperiment, PortfolioDigest.HasOnboarded cortexDigest) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new AdvisoryInsightsHubDataState(accountNumber, insights, inCortexDigestExperiment, cortexDigest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightsHubDataState)) {
            return false;
        }
        AdvisoryInsightsHubDataState advisoryInsightsHubDataState = (AdvisoryInsightsHubDataState) other;
        return Intrinsics.areEqual(this.accountNumber, advisoryInsightsHubDataState.accountNumber) && Intrinsics.areEqual(this.insights, advisoryInsightsHubDataState.insights) && this.inCortexDigestExperiment == advisoryInsightsHubDataState.inCortexDigestExperiment && Intrinsics.areEqual(this.cortexDigest, advisoryInsightsHubDataState.cortexDigest);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        List<AdvisoryInsight> list = this.insights;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.inCortexDigestExperiment)) * 31;
        PortfolioDigest.HasOnboarded hasOnboarded = this.cortexDigest;
        return iHashCode2 + (hasOnboarded != null ? hasOnboarded.hashCode() : 0);
    }

    public String toString() {
        return "AdvisoryInsightsHubDataState(accountNumber=" + this.accountNumber + ", insights=" + this.insights + ", inCortexDigestExperiment=" + this.inCortexDigestExperiment + ", cortexDigest=" + this.cortexDigest + ")";
    }

    public AdvisoryInsightsHubDataState(String accountNumber, List<AdvisoryInsight> list, boolean z, PortfolioDigest.HasOnboarded hasOnboarded) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.insights = list;
        this.inCortexDigestExperiment = z;
        this.cortexDigest = hasOnboarded;
    }

    public /* synthetic */ AdvisoryInsightsHubDataState(String str, List list, boolean z, PortfolioDigest.HasOnboarded hasOnboarded, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : hasOnboarded);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<AdvisoryInsight> getInsights() {
        return this.insights;
    }

    public final boolean getInCortexDigestExperiment() {
        return this.inCortexDigestExperiment;
    }

    public final PortfolioDigest.HasOnboarded getCortexDigest() {
        return this.cortexDigest;
    }

    /* compiled from: AdvisoryInsightsHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubDataState;", "Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<AdvisoryInsightsHubDataState, AdvisoryInsightsHubViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AdvisoryInsightsHubViewState reduce(AdvisoryInsightsHubDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            List<AdvisoryInsight> insights = dataState.getInsights();
            if (insights != null) {
                return new AdvisoryInsightsHubViewState.Loaded(dataState.getAccountNumber(), extensions2.toPersistentList(insights), dataState.getInCortexDigestExperiment(), dataState.getCortexDigest());
            }
            return AdvisoryInsightsHubViewState.Loading.INSTANCE;
        }
    }
}
