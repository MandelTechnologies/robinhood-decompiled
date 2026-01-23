package com.robinhood.android.rhy.referral.referrer;

import com.robinhood.models.rhy.referral.p345db.ReferrerLanding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsReferrerLandingDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingDataState;", "", "referrerLanding", "Lcom/robinhood/models/rhy/referral/db/ReferrerLanding;", "error", "", "<init>", "(Lcom/robinhood/models/rhy/referral/db/ReferrerLanding;Ljava/lang/Throwable;)V", "getReferrerLanding", "()Lcom/robinhood/models/rhy/referral/db/ReferrerLanding;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralsReferrerLandingDataState {
    public static final int $stable = 8;
    private final Throwable error;
    private final ReferrerLanding referrerLanding;

    /* JADX WARN: Multi-variable type inference failed */
    public RhyReferralsReferrerLandingDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RhyReferralsReferrerLandingDataState copy$default(RhyReferralsReferrerLandingDataState rhyReferralsReferrerLandingDataState, ReferrerLanding referrerLanding, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            referrerLanding = rhyReferralsReferrerLandingDataState.referrerLanding;
        }
        if ((i & 2) != 0) {
            th = rhyReferralsReferrerLandingDataState.error;
        }
        return rhyReferralsReferrerLandingDataState.copy(referrerLanding, th);
    }

    /* renamed from: component1, reason: from getter */
    public final ReferrerLanding getReferrerLanding() {
        return this.referrerLanding;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final RhyReferralsReferrerLandingDataState copy(ReferrerLanding referrerLanding, Throwable error) {
        return new RhyReferralsReferrerLandingDataState(referrerLanding, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralsReferrerLandingDataState)) {
            return false;
        }
        RhyReferralsReferrerLandingDataState rhyReferralsReferrerLandingDataState = (RhyReferralsReferrerLandingDataState) other;
        return Intrinsics.areEqual(this.referrerLanding, rhyReferralsReferrerLandingDataState.referrerLanding) && Intrinsics.areEqual(this.error, rhyReferralsReferrerLandingDataState.error);
    }

    public int hashCode() {
        ReferrerLanding referrerLanding = this.referrerLanding;
        int iHashCode = (referrerLanding == null ? 0 : referrerLanding.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "RhyReferralsReferrerLandingDataState(referrerLanding=" + this.referrerLanding + ", error=" + this.error + ")";
    }

    public RhyReferralsReferrerLandingDataState(ReferrerLanding referrerLanding, Throwable th) {
        this.referrerLanding = referrerLanding;
        this.error = th;
    }

    public /* synthetic */ RhyReferralsReferrerLandingDataState(ReferrerLanding referrerLanding, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : referrerLanding, (i & 2) != 0 ? null : th);
    }

    public final ReferrerLanding getReferrerLanding() {
        return this.referrerLanding;
    }

    public final Throwable getError() {
        return this.error;
    }
}
