package com.robinhood.android.advisor.marketplace.onboarding.hub;

import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorMatchesResponse;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.MeetingsHubResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorMarketplaceOnboardingHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState$Loaded;", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState$Loading;", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisorMarketplaceOnboardingHubViewState {

    /* compiled from: AdvisorMarketplaceOnboardingHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState$Loading;", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AdvisorMarketplaceOnboardingHubViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -232508942;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AdvisorMarketplaceOnboardingHubViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState$Loaded;", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState;", "matchesResponse", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;", "meetingsHubResponse", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;", "defaultMeetingsFilter", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/MeetingsFilter;", "<init>", "(Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;Lcom/robinhood/android/advisor/marketplace/onboarding/hub/MeetingsFilter;)V", "getMatchesResponse", "()Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;", "getMeetingsHubResponse", "()Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;", "getDefaultMeetingsFilter", "()Lcom/robinhood/android/advisor/marketplace/onboarding/hub/MeetingsFilter;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AdvisorMarketplaceOnboardingHubViewState {
        public static final int $stable = 8;
        private final MeetingsHub defaultMeetingsFilter;
        private final AdvisorMatchesResponse matchesResponse;
        private final MeetingsHubResponse meetingsHubResponse;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AdvisorMatchesResponse advisorMatchesResponse, MeetingsHubResponse meetingsHubResponse, MeetingsHub meetingsHub, int i, Object obj) {
            if ((i & 1) != 0) {
                advisorMatchesResponse = loaded.matchesResponse;
            }
            if ((i & 2) != 0) {
                meetingsHubResponse = loaded.meetingsHubResponse;
            }
            if ((i & 4) != 0) {
                meetingsHub = loaded.defaultMeetingsFilter;
            }
            return loaded.copy(advisorMatchesResponse, meetingsHubResponse, meetingsHub);
        }

        /* renamed from: component1, reason: from getter */
        public final AdvisorMatchesResponse getMatchesResponse() {
            return this.matchesResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final MeetingsHubResponse getMeetingsHubResponse() {
            return this.meetingsHubResponse;
        }

        /* renamed from: component3, reason: from getter */
        public final MeetingsHub getDefaultMeetingsFilter() {
            return this.defaultMeetingsFilter;
        }

        public final Loaded copy(AdvisorMatchesResponse matchesResponse, MeetingsHubResponse meetingsHubResponse, MeetingsHub defaultMeetingsFilter) {
            Intrinsics.checkNotNullParameter(matchesResponse, "matchesResponse");
            Intrinsics.checkNotNullParameter(meetingsHubResponse, "meetingsHubResponse");
            return new Loaded(matchesResponse, meetingsHubResponse, defaultMeetingsFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.matchesResponse, loaded.matchesResponse) && Intrinsics.areEqual(this.meetingsHubResponse, loaded.meetingsHubResponse) && this.defaultMeetingsFilter == loaded.defaultMeetingsFilter;
        }

        public int hashCode() {
            int iHashCode = ((this.matchesResponse.hashCode() * 31) + this.meetingsHubResponse.hashCode()) * 31;
            MeetingsHub meetingsHub = this.defaultMeetingsFilter;
            return iHashCode + (meetingsHub == null ? 0 : meetingsHub.hashCode());
        }

        public String toString() {
            return "Loaded(matchesResponse=" + this.matchesResponse + ", meetingsHubResponse=" + this.meetingsHubResponse + ", defaultMeetingsFilter=" + this.defaultMeetingsFilter + ")";
        }

        public Loaded(AdvisorMatchesResponse matchesResponse, MeetingsHubResponse meetingsHubResponse, MeetingsHub meetingsHub) {
            Intrinsics.checkNotNullParameter(matchesResponse, "matchesResponse");
            Intrinsics.checkNotNullParameter(meetingsHubResponse, "meetingsHubResponse");
            this.matchesResponse = matchesResponse;
            this.meetingsHubResponse = meetingsHubResponse;
            this.defaultMeetingsFilter = meetingsHub;
        }

        public final AdvisorMatchesResponse getMatchesResponse() {
            return this.matchesResponse;
        }

        public final MeetingsHubResponse getMeetingsHubResponse() {
            return this.meetingsHubResponse;
        }

        public final MeetingsHub getDefaultMeetingsFilter() {
            return this.defaultMeetingsFilter;
        }
    }
}
