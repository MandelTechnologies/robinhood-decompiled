package com.robinhood.android.advisor.marketplace.onboarding;

import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorMarketplaceOnboardingDashboardViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/AdvisorMarketplaceOnboardingDashboardViewState;", "", "state", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;", "<init>", "(Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;)V", "getState", "()Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisorMarketplaceOnboardingDashboardViewState {
    public static final int $stable = 8;
    private final AdvisorDashboardState state;

    /* JADX WARN: Multi-variable type inference failed */
    public AdvisorMarketplaceOnboardingDashboardViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdvisorMarketplaceOnboardingDashboardViewState copy$default(AdvisorMarketplaceOnboardingDashboardViewState advisorMarketplaceOnboardingDashboardViewState, AdvisorDashboardState advisorDashboardState, int i, Object obj) {
        if ((i & 1) != 0) {
            advisorDashboardState = advisorMarketplaceOnboardingDashboardViewState.state;
        }
        return advisorMarketplaceOnboardingDashboardViewState.copy(advisorDashboardState);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvisorDashboardState getState() {
        return this.state;
    }

    public final AdvisorMarketplaceOnboardingDashboardViewState copy(AdvisorDashboardState state) {
        return new AdvisorMarketplaceOnboardingDashboardViewState(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdvisorMarketplaceOnboardingDashboardViewState) && Intrinsics.areEqual(this.state, ((AdvisorMarketplaceOnboardingDashboardViewState) other).state);
    }

    public int hashCode() {
        AdvisorDashboardState advisorDashboardState = this.state;
        if (advisorDashboardState == null) {
            return 0;
        }
        return advisorDashboardState.hashCode();
    }

    public String toString() {
        return "AdvisorMarketplaceOnboardingDashboardViewState(state=" + this.state + ")";
    }

    public AdvisorMarketplaceOnboardingDashboardViewState(AdvisorDashboardState advisorDashboardState) {
        this.state = advisorDashboardState;
    }

    public /* synthetic */ AdvisorMarketplaceOnboardingDashboardViewState(AdvisorDashboardState advisorDashboardState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisorDashboardState);
    }

    public final AdvisorDashboardState getState() {
        return this.state;
    }
}
