package com.robinhood.android.rhy.referral.referrer;

import com.robinhood.models.rhy.referral.p345db.ReferrerLanding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsReferrerLandingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState$Error;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState$Loaded;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState$Loading;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyReferralsReferrerLandingViewState {

    /* compiled from: RhyReferralsReferrerLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState$Loading;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RhyReferralsReferrerLandingViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RhyReferralsReferrerLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState$Error;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements RhyReferralsReferrerLandingViewState {
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

        public Error(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: RhyReferralsReferrerLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState$Loaded;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState;", "referrerLanding", "Lcom/robinhood/models/rhy/referral/db/ReferrerLanding;", "<init>", "(Lcom/robinhood/models/rhy/referral/db/ReferrerLanding;)V", "getReferrerLanding", "()Lcom/robinhood/models/rhy/referral/db/ReferrerLanding;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RhyReferralsReferrerLandingViewState {
        public static final int $stable = 8;
        private final ReferrerLanding referrerLanding;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ReferrerLanding referrerLanding, int i, Object obj) {
            if ((i & 1) != 0) {
                referrerLanding = loaded.referrerLanding;
            }
            return loaded.copy(referrerLanding);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferrerLanding getReferrerLanding() {
            return this.referrerLanding;
        }

        public final Loaded copy(ReferrerLanding referrerLanding) {
            Intrinsics.checkNotNullParameter(referrerLanding, "referrerLanding");
            return new Loaded(referrerLanding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.referrerLanding, ((Loaded) other).referrerLanding);
        }

        public int hashCode() {
            return this.referrerLanding.hashCode();
        }

        public String toString() {
            return "Loaded(referrerLanding=" + this.referrerLanding + ")";
        }

        public Loaded(ReferrerLanding referrerLanding) {
            Intrinsics.checkNotNullParameter(referrerLanding, "referrerLanding");
            this.referrerLanding = referrerLanding;
        }

        public final ReferrerLanding getReferrerLanding() {
            return this.referrerLanding;
        }
    }
}
