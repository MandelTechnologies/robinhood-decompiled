package com.robinhood.android.advisory.insights.hub;

import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryInsightsHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState$Loaded;", "Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState$Loading;", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryInsightsHubViewState {

    /* compiled from: AdvisoryInsightsHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState$Loading;", "Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AdvisoryInsightsHubViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -687962364;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AdvisoryInsightsHubViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState$Loaded;", "Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState;", "accountNumber", "", "insights", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "useGradientStyling", "", "cortexDigest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;)V", "getAccountNumber", "()Ljava/lang/String;", "getInsights", "()Lkotlinx/collections/immutable/ImmutableList;", "getUseGradientStyling", "()Z", "getCortexDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AdvisoryInsightsHubViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final PortfolioDigest.HasOnboarded cortexDigest;
        private final ImmutableList<AdvisoryInsight> insights;
        private final boolean useGradientStyling;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ImmutableList immutableList, boolean z, PortfolioDigest.HasOnboarded hasOnboarded, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.accountNumber;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.insights;
            }
            if ((i & 4) != 0) {
                z = loaded.useGradientStyling;
            }
            if ((i & 8) != 0) {
                hasOnboarded = loaded.cortexDigest;
            }
            return loaded.copy(str, immutableList, z, hasOnboarded);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ImmutableList<AdvisoryInsight> component2() {
            return this.insights;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseGradientStyling() {
            return this.useGradientStyling;
        }

        /* renamed from: component4, reason: from getter */
        public final PortfolioDigest.HasOnboarded getCortexDigest() {
            return this.cortexDigest;
        }

        public final Loaded copy(String accountNumber, ImmutableList<AdvisoryInsight> insights, boolean useGradientStyling, PortfolioDigest.HasOnboarded cortexDigest) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(insights, "insights");
            return new Loaded(accountNumber, insights, useGradientStyling, cortexDigest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && Intrinsics.areEqual(this.insights, loaded.insights) && this.useGradientStyling == loaded.useGradientStyling && Intrinsics.areEqual(this.cortexDigest, loaded.cortexDigest);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.insights.hashCode()) * 31) + Boolean.hashCode(this.useGradientStyling)) * 31;
            PortfolioDigest.HasOnboarded hasOnboarded = this.cortexDigest;
            return iHashCode + (hasOnboarded == null ? 0 : hasOnboarded.hashCode());
        }

        public String toString() {
            return "Loaded(accountNumber=" + this.accountNumber + ", insights=" + this.insights + ", useGradientStyling=" + this.useGradientStyling + ", cortexDigest=" + this.cortexDigest + ")";
        }

        public Loaded(String accountNumber, ImmutableList<AdvisoryInsight> insights, boolean z, PortfolioDigest.HasOnboarded hasOnboarded) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(insights, "insights");
            this.accountNumber = accountNumber;
            this.insights = insights;
            this.useGradientStyling = z;
            this.cortexDigest = hasOnboarded;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ImmutableList<AdvisoryInsight> getInsights() {
            return this.insights;
        }

        public final boolean getUseGradientStyling() {
            return this.useGradientStyling;
        }

        public final PortfolioDigest.HasOnboarded getCortexDigest() {
            return this.cortexDigest;
        }
    }
}
