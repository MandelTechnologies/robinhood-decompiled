package com.robinhood.android.engagement.infolandingpage;

import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoLandingPageViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState$Error;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState$Loaded;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState$Loading;", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class InfoLandingPageViewState {
    public static final int $stable = 0;

    public /* synthetic */ InfoLandingPageViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: InfoLandingPageViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState$Loading;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends InfoLandingPageViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1640094163;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private InfoLandingPageViewState() {
    }

    /* compiled from: InfoLandingPageViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState$Loaded;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState;", "landingPage", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;", "<init>", "(Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;)V", "getLandingPage", "()Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends InfoLandingPageViewState {
        public static final int $stable = RewardOfferDetails.$stable;
        private final RewardOfferDetails landingPage;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, RewardOfferDetails rewardOfferDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                rewardOfferDetails = loaded.landingPage;
            }
            return loaded.copy(rewardOfferDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final RewardOfferDetails getLandingPage() {
            return this.landingPage;
        }

        public final Loaded copy(RewardOfferDetails landingPage) {
            Intrinsics.checkNotNullParameter(landingPage, "landingPage");
            return new Loaded(landingPage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.landingPage, ((Loaded) other).landingPage);
        }

        public int hashCode() {
            return this.landingPage.hashCode();
        }

        public String toString() {
            return "Loaded(landingPage=" + this.landingPage + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(RewardOfferDetails landingPage) {
            super(null);
            Intrinsics.checkNotNullParameter(landingPage, "landingPage");
            this.landingPage = landingPage;
        }

        public final RewardOfferDetails getLandingPage() {
            return this.landingPage;
        }
    }

    /* compiled from: InfoLandingPageViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState$Error;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends InfoLandingPageViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
