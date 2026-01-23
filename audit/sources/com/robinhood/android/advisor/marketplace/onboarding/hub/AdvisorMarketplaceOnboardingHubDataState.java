package com.robinhood.android.advisor.marketplace.onboarding.hub;

import com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorMatchesResponse;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.MeetingsHubResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorMarketplaceOnboardingHubDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDataState;", "", "matchesResponse", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;", "meetingsHubResponse", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;", "<init>", "(Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;)V", "getMatchesResponse", "()Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;", "getMeetingsHubResponse", "()Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisorMarketplaceOnboardingHubDataState {
    private final AdvisorMatchesResponse matchesResponse;
    private final MeetingsHubResponse meetingsHubResponse;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AdvisorMarketplaceOnboardingHubDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdvisorMarketplaceOnboardingHubDataState copy$default(AdvisorMarketplaceOnboardingHubDataState advisorMarketplaceOnboardingHubDataState, AdvisorMatchesResponse advisorMatchesResponse, MeetingsHubResponse meetingsHubResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            advisorMatchesResponse = advisorMarketplaceOnboardingHubDataState.matchesResponse;
        }
        if ((i & 2) != 0) {
            meetingsHubResponse = advisorMarketplaceOnboardingHubDataState.meetingsHubResponse;
        }
        return advisorMarketplaceOnboardingHubDataState.copy(advisorMatchesResponse, meetingsHubResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvisorMatchesResponse getMatchesResponse() {
        return this.matchesResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final MeetingsHubResponse getMeetingsHubResponse() {
        return this.meetingsHubResponse;
    }

    public final AdvisorMarketplaceOnboardingHubDataState copy(AdvisorMatchesResponse matchesResponse, MeetingsHubResponse meetingsHubResponse) {
        return new AdvisorMarketplaceOnboardingHubDataState(matchesResponse, meetingsHubResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisorMarketplaceOnboardingHubDataState)) {
            return false;
        }
        AdvisorMarketplaceOnboardingHubDataState advisorMarketplaceOnboardingHubDataState = (AdvisorMarketplaceOnboardingHubDataState) other;
        return Intrinsics.areEqual(this.matchesResponse, advisorMarketplaceOnboardingHubDataState.matchesResponse) && Intrinsics.areEqual(this.meetingsHubResponse, advisorMarketplaceOnboardingHubDataState.meetingsHubResponse);
    }

    public int hashCode() {
        AdvisorMatchesResponse advisorMatchesResponse = this.matchesResponse;
        int iHashCode = (advisorMatchesResponse == null ? 0 : advisorMatchesResponse.hashCode()) * 31;
        MeetingsHubResponse meetingsHubResponse = this.meetingsHubResponse;
        return iHashCode + (meetingsHubResponse != null ? meetingsHubResponse.hashCode() : 0);
    }

    public String toString() {
        return "AdvisorMarketplaceOnboardingHubDataState(matchesResponse=" + this.matchesResponse + ", meetingsHubResponse=" + this.meetingsHubResponse + ")";
    }

    public AdvisorMarketplaceOnboardingHubDataState(AdvisorMatchesResponse advisorMatchesResponse, MeetingsHubResponse meetingsHubResponse) {
        this.matchesResponse = advisorMatchesResponse;
        this.meetingsHubResponse = meetingsHubResponse;
    }

    public /* synthetic */ AdvisorMarketplaceOnboardingHubDataState(AdvisorMatchesResponse advisorMatchesResponse, MeetingsHubResponse meetingsHubResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisorMatchesResponse, (i & 2) != 0 ? null : meetingsHubResponse);
    }

    public final AdvisorMatchesResponse getMatchesResponse() {
        return this.matchesResponse;
    }

    public final MeetingsHubResponse getMeetingsHubResponse() {
        return this.meetingsHubResponse;
    }

    /* compiled from: AdvisorMarketplaceOnboardingHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDataState;", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<AdvisorMarketplaceOnboardingHubDataState, AdvisorMarketplaceOnboardingHubViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AdvisorMarketplaceOnboardingHubViewState reduce(AdvisorMarketplaceOnboardingHubDataState dataState) {
            MeetingsHub meetingsHub;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getMatchesResponse() != null && dataState.getMeetingsHubResponse() != null) {
                AdvisorMatchesResponse matchesResponse = dataState.getMatchesResponse();
                MeetingsHubResponse meetingsHubResponse = dataState.getMeetingsHubResponse();
                if (dataState.getMeetingsHubResponse().getUpcomingMeetings().isEmpty()) {
                    meetingsHub = !dataState.getMeetingsHubResponse().getPastMeetings().isEmpty() ? MeetingsHub.PAST : null;
                } else {
                    meetingsHub = MeetingsHub.UPCOMING;
                }
                return new AdvisorMarketplaceOnboardingHubViewState.Loaded(matchesResponse, meetingsHubResponse, meetingsHub);
            }
            return AdvisorMarketplaceOnboardingHubViewState.Loading.INSTANCE;
        }
    }
}
