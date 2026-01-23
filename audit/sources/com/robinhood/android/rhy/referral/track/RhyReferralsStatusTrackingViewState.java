package com.robinhood.android.rhy.referral.track;

import com.robinhood.hammer.android.GenerateMockLoadingState;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsStatusTrackingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState$Loaded;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState$Loading;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyReferralsStatusTrackingViewState {

    /* compiled from: RhyReferralsStatusTrackingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState$Loading;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RhyReferralsStatusTrackingViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RhyReferralsStatusTrackingViewState.kt */
    @GenerateMockLoadingState
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState$Loaded;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState;", "pendingInvites", "", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "completedInvites", "showRemindRequestDialog", "", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "getPendingInvites", "()Ljava/util/List;", "getCompletedInvites", "getShowRemindRequestDialog", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RhyReferralsStatusTrackingViewState {
        public static final int $stable = 8;
        private final List<RhyReferralAttribution> completedInvites;
        private final List<RhyReferralAttribution> pendingInvites;
        private final boolean showRemindRequestDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, List list2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.pendingInvites;
            }
            if ((i & 2) != 0) {
                list2 = loaded.completedInvites;
            }
            if ((i & 4) != 0) {
                z = loaded.showRemindRequestDialog;
            }
            return loaded.copy(list, list2, z);
        }

        public final List<RhyReferralAttribution> component1() {
            return this.pendingInvites;
        }

        public final List<RhyReferralAttribution> component2() {
            return this.completedInvites;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowRemindRequestDialog() {
            return this.showRemindRequestDialog;
        }

        public final Loaded copy(List<RhyReferralAttribution> pendingInvites, List<RhyReferralAttribution> completedInvites, boolean showRemindRequestDialog) {
            Intrinsics.checkNotNullParameter(pendingInvites, "pendingInvites");
            Intrinsics.checkNotNullParameter(completedInvites, "completedInvites");
            return new Loaded(pendingInvites, completedInvites, showRemindRequestDialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.pendingInvites, loaded.pendingInvites) && Intrinsics.areEqual(this.completedInvites, loaded.completedInvites) && this.showRemindRequestDialog == loaded.showRemindRequestDialog;
        }

        public int hashCode() {
            return (((this.pendingInvites.hashCode() * 31) + this.completedInvites.hashCode()) * 31) + Boolean.hashCode(this.showRemindRequestDialog);
        }

        public String toString() {
            return "Loaded(pendingInvites=" + this.pendingInvites + ", completedInvites=" + this.completedInvites + ", showRemindRequestDialog=" + this.showRemindRequestDialog + ")";
        }

        public Loaded(List<RhyReferralAttribution> pendingInvites, List<RhyReferralAttribution> completedInvites, boolean z) {
            Intrinsics.checkNotNullParameter(pendingInvites, "pendingInvites");
            Intrinsics.checkNotNullParameter(completedInvites, "completedInvites");
            this.pendingInvites = pendingInvites;
            this.completedInvites = completedInvites;
            this.showRemindRequestDialog = z;
        }

        public final List<RhyReferralAttribution> getPendingInvites() {
            return this.pendingInvites;
        }

        public final List<RhyReferralAttribution> getCompletedInvites() {
            return this.completedInvites;
        }

        public final boolean getShowRemindRequestDialog() {
            return this.showRemindRequestDialog;
        }
    }
}
